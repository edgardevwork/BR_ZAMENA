package io.reactivex.rxjava3.internal.subscriptions;

import io.reactivex.rxjava3.operators.QueueSubscription;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public abstract class BasicIntQueueSubscription<T> extends AtomicInteger implements QueueSubscription<T> {
    public static final long serialVersionUID = -6671519529404341862L;

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean offer(T e) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean offer(T v1, T v2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
