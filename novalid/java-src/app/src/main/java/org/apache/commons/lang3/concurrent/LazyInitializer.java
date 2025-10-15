package org.apache.commons.lang3.concurrent;

/* loaded from: classes5.dex */
public abstract class LazyInitializer<T> implements ConcurrentInitializer<T> {
    public static final Object NO_INIT = new Object();
    public volatile T object = (T) NO_INIT;

    public abstract T initialize() throws ConcurrentException;

    @Override // org.apache.commons.lang3.concurrent.ConcurrentInitializer
    public T get() throws ConcurrentException {
        T tInitialize = this.object;
        Object obj = NO_INIT;
        if (tInitialize == obj) {
            synchronized (this) {
                try {
                    tInitialize = this.object;
                    if (tInitialize == obj) {
                        tInitialize = initialize();
                        this.object = tInitialize;
                    }
                } finally {
                }
            }
        }
        return tInitialize;
    }
}
