package io.reactivex.rxjava3.internal.operators.observable;

import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes8.dex */
public final class ObservableCache<T> extends AbstractObservableWithUpstream<T, T> implements Observer<T> {
    public static final CacheDisposable[] EMPTY = new CacheDisposable[0];
    public static final CacheDisposable[] TERMINATED = new CacheDisposable[0];
    public final int capacityHint;
    public volatile boolean done;
    public Throwable error;
    public final Node<T> head;
    public final AtomicReference<CacheDisposable<T>[]> observers;
    public final AtomicBoolean once;
    public volatile long size;
    public Node<T> tail;
    public int tailOffset;

    @Override // io.reactivex.rxjava3.core.Observer
    public void onSubscribe(Disposable d) {
    }

    public ObservableCache(Observable<T> source, int capacityHint) {
        super(source);
        this.capacityHint = capacityHint;
        this.once = new AtomicBoolean();
        Node<T> node = new Node<>(capacityHint);
        this.head = node;
        this.tail = node;
        this.observers = new AtomicReference<>(EMPTY);
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> t) {
        CacheDisposable<T> cacheDisposable = new CacheDisposable<>(t, this);
        t.onSubscribe(cacheDisposable);
        add(cacheDisposable);
        if (!this.once.get() && this.once.compareAndSet(false, true)) {
            this.source.subscribe(this);
        } else {
            replay(cacheDisposable);
        }
    }

    public boolean isConnected() {
        return this.once.get();
    }

    public boolean hasObservers() {
        return this.observers.get().length != 0;
    }

    public long cachedEventCount() {
        return this.size;
    }

    public void add(CacheDisposable<T> consumer) {
        CacheDisposable<T>[] cacheDisposableArr;
        CacheDisposable[] cacheDisposableArr2;
        do {
            cacheDisposableArr = this.observers.get();
            if (cacheDisposableArr == TERMINATED) {
                return;
            }
            int length = cacheDisposableArr.length;
            cacheDisposableArr2 = new CacheDisposable[length + 1];
            System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr2, 0, length);
            cacheDisposableArr2[length] = consumer;
        } while (!MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m34m(this.observers, cacheDisposableArr, cacheDisposableArr2));
    }

    public void remove(CacheDisposable<T> consumer) {
        CacheDisposable<T>[] cacheDisposableArr;
        CacheDisposable[] cacheDisposableArr2;
        do {
            cacheDisposableArr = this.observers.get();
            int length = cacheDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (cacheDisposableArr[i] == consumer) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                cacheDisposableArr2 = EMPTY;
            } else {
                CacheDisposable[] cacheDisposableArr3 = new CacheDisposable[length - 1];
                System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr3, 0, i);
                System.arraycopy(cacheDisposableArr, i + 1, cacheDisposableArr3, i, (length - i) - 1);
                cacheDisposableArr2 = cacheDisposableArr3;
            }
        } while (!MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m34m(this.observers, cacheDisposableArr, cacheDisposableArr2));
    }

    public void replay(CacheDisposable<T> cacheDisposable) {
        if (cacheDisposable.getAndIncrement() != 0) {
            return;
        }
        long j = cacheDisposable.index;
        int i = cacheDisposable.offset;
        Node<T> node = cacheDisposable.node;
        Observer<? super T> observer = cacheDisposable.downstream;
        int i2 = this.capacityHint;
        int iAddAndGet = 1;
        while (!cacheDisposable.disposed) {
            boolean z = this.done;
            boolean z2 = this.size == j;
            if (z && z2) {
                cacheDisposable.node = null;
                Throwable th = this.error;
                if (th != null) {
                    observer.onError(th);
                    return;
                } else {
                    observer.onComplete();
                    return;
                }
            }
            if (!z2) {
                if (i == i2) {
                    node = node.next;
                    i = 0;
                }
                observer.onNext(node.values[i]);
                i++;
                j++;
            } else {
                cacheDisposable.index = j;
                cacheDisposable.offset = i;
                cacheDisposable.node = node;
                iAddAndGet = cacheDisposable.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
        cacheDisposable.node = null;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onNext(T t) {
        int i = this.tailOffset;
        if (i == this.capacityHint) {
            Node<T> node = new Node<>(i);
            node.values[0] = t;
            this.tailOffset = 1;
            this.tail.next = node;
            this.tail = node;
        } else {
            this.tail.values[i] = t;
            this.tailOffset = i + 1;
        }
        this.size++;
        for (CacheDisposable<T> cacheDisposable : this.observers.get()) {
            replay(cacheDisposable);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onError(Throwable t) {
        this.error = t;
        this.done = true;
        for (CacheDisposable<T> cacheDisposable : this.observers.getAndSet(TERMINATED)) {
            replay(cacheDisposable);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onComplete() {
        this.done = true;
        for (CacheDisposable<T> cacheDisposable : this.observers.getAndSet(TERMINATED)) {
            replay(cacheDisposable);
        }
    }

    /* loaded from: classes7.dex */
    public static final class CacheDisposable<T> extends AtomicInteger implements Disposable {
        public static final long serialVersionUID = 6770240836423125754L;
        public volatile boolean disposed;
        public final Observer<? super T> downstream;
        public long index;
        public Node<T> node;
        public int offset;
        public final ObservableCache<T> parent;

        public CacheDisposable(Observer<? super T> downstream, ObservableCache<T> parent) {
            this.downstream = downstream;
            this.parent = parent;
            this.node = parent.head;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (this.disposed) {
                return;
            }
            this.disposed = true;
            this.parent.remove(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }
    }

    public static final class Node<T> {
        public volatile Node<T> next;
        public final T[] values;

        public Node(int i) {
            this.values = (T[]) new Object[i];
        }
    }
}
