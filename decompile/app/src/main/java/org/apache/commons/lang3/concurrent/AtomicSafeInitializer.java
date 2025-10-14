package org.apache.commons.lang3.concurrent;

import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public abstract class AtomicSafeInitializer<T> implements ConcurrentInitializer<T> {
    public final AtomicReference<AtomicSafeInitializer<T>> factory = new AtomicReference<>();
    public final AtomicReference<T> reference = new AtomicReference<>();

    public abstract T initialize() throws ConcurrentException;

    @Override // org.apache.commons.lang3.concurrent.ConcurrentInitializer
    public final T get() throws ConcurrentException {
        while (true) {
            T t = this.reference.get();
            if (t != null) {
                return t;
            }
            if (MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m34m(this.factory, null, this)) {
                this.reference.set(initialize());
            }
        }
    }
}
