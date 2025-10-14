package com.thoughtworks.xstream.core.util;

/* loaded from: classes8.dex */
public class Pool {
    public final Factory factory;
    public final int initialPoolSize;
    public final int maxPoolSize;
    public transient Object mutex = new Object();
    public transient int nextAvailable;
    public transient Object[] pool;

    public interface Factory {
        Object newInstance();
    }

    public Pool(int i, int i2, Factory factory) {
        this.initialPoolSize = i;
        this.maxPoolSize = i2;
        this.factory = factory;
    }

    public Object fetchFromPool() {
        int i;
        Object objNewInstance;
        synchronized (this.mutex) {
            try {
                if (this.pool == null) {
                    this.pool = new Object[this.maxPoolSize];
                    this.nextAvailable = this.initialPoolSize;
                    while (this.nextAvailable > 0) {
                        putInPool(this.factory.newInstance());
                    }
                }
                while (true) {
                    i = this.nextAvailable;
                    if (i != this.maxPoolSize) {
                        break;
                    }
                    try {
                        this.mutex.wait();
                    } catch (InterruptedException e) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("Interrupted whilst waiting for a free item in the pool : ");
                        stringBuffer.append(e.getMessage());
                        throw new RuntimeException(stringBuffer.toString());
                    }
                }
                Object[] objArr = this.pool;
                this.nextAvailable = i + 1;
                objNewInstance = objArr[i];
                if (objNewInstance == null) {
                    objNewInstance = this.factory.newInstance();
                    putInPool(objNewInstance);
                    this.nextAvailable++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objNewInstance;
    }

    public void putInPool(Object obj) {
        synchronized (this.mutex) {
            Object[] objArr = this.pool;
            int i = this.nextAvailable - 1;
            this.nextAvailable = i;
            objArr[i] = obj;
            this.mutex.notify();
        }
    }

    public final Object readResolve() {
        this.mutex = new Object();
        return this;
    }
}
