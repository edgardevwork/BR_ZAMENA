package io.reactivex.rxjava3.internal.queue;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.operators.SimplePlainQueue;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class MpscLinkedQueue<T> implements SimplePlainQueue<T> {
    public final AtomicReference<LinkedQueueNode<T>> producerNode = new AtomicReference<>();
    public final AtomicReference<LinkedQueueNode<T>> consumerNode = new AtomicReference<>();

    public MpscLinkedQueue() {
        LinkedQueueNode<T> linkedQueueNode = new LinkedQueueNode<>();
        spConsumerNode(linkedQueueNode);
        xchgProducerNode(linkedQueueNode);
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public boolean offer(final T e) {
        if (e == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        LinkedQueueNode<T> linkedQueueNode = new LinkedQueueNode<>(e);
        xchgProducerNode(linkedQueueNode).soNext(linkedQueueNode);
        return true;
    }

    @Override // io.reactivex.rxjava3.operators.SimplePlainQueue, io.reactivex.rxjava3.operators.SimpleQueue
    @Nullable
    public T poll() {
        LinkedQueueNode<T> linkedQueueNodeLvNext;
        LinkedQueueNode<T> linkedQueueNodeLpConsumerNode = lpConsumerNode();
        LinkedQueueNode<T> linkedQueueNodeLvNext2 = linkedQueueNodeLpConsumerNode.lvNext();
        if (linkedQueueNodeLvNext2 != null) {
            T andNullValue = linkedQueueNodeLvNext2.getAndNullValue();
            spConsumerNode(linkedQueueNodeLvNext2);
            return andNullValue;
        }
        if (linkedQueueNodeLpConsumerNode == lvProducerNode()) {
            return null;
        }
        do {
            linkedQueueNodeLvNext = linkedQueueNodeLpConsumerNode.lvNext();
        } while (linkedQueueNodeLvNext == null);
        T andNullValue2 = linkedQueueNodeLvNext.getAndNullValue();
        spConsumerNode(linkedQueueNodeLvNext);
        return andNullValue2;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public boolean offer(T v1, T v2) {
        offer(v1);
        offer(v2);
        return true;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    public LinkedQueueNode<T> lvProducerNode() {
        return this.producerNode.get();
    }

    public LinkedQueueNode<T> xchgProducerNode(LinkedQueueNode<T> node) {
        return this.producerNode.getAndSet(node);
    }

    public LinkedQueueNode<T> lvConsumerNode() {
        return this.consumerNode.get();
    }

    public LinkedQueueNode<T> lpConsumerNode() {
        return this.consumerNode.get();
    }

    public void spConsumerNode(LinkedQueueNode<T> node) {
        this.consumerNode.lazySet(node);
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public boolean isEmpty() {
        return lvConsumerNode() == lvProducerNode();
    }

    /* loaded from: classes8.dex */
    public static final class LinkedQueueNode<E> extends AtomicReference<LinkedQueueNode<E>> {
        public static final long serialVersionUID = 2404266111789071508L;
        public E value;

        public LinkedQueueNode() {
        }

        public LinkedQueueNode(E val) {
            spValue(val);
        }

        public E getAndNullValue() {
            E eLpValue = lpValue();
            spValue(null);
            return eLpValue;
        }

        public E lpValue() {
            return this.value;
        }

        public void spValue(E newValue) {
            this.value = newValue;
        }

        public void soNext(LinkedQueueNode<E> n) {
            lazySet(n);
        }

        public LinkedQueueNode<E> lvNext() {
            return get();
        }
    }
}
