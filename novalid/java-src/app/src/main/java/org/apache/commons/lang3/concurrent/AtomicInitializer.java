package org.apache.commons.lang3.concurrent;

import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public abstract class AtomicInitializer<T> implements ConcurrentInitializer<T> {
    public final AtomicReference<T> reference = new AtomicReference<>();

    public abstract T initialize() throws ConcurrentException;

    @Override // org.apache.commons.lang3.concurrent.ConcurrentInitializer
    public T get() throws ConcurrentException {
        T t = this.reference.get();
        if (t != null) {
            return t;
        }
        T tInitialize = initialize();
        return !MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m34m(this.reference, null, tInitialize) ? this.reference.get() : tInitialize;
    }
}
