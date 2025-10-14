package org.apache.ivy.plugins.lock;

/* loaded from: classes5.dex */
public abstract class AbstractLockStrategy implements LockStrategy {
    public boolean debugLocking;
    public String name;

    public AbstractLockStrategy() {
        this.debugLocking = false;
    }

    public AbstractLockStrategy(boolean z) {
        this.debugLocking = z;
    }

    @Override // org.apache.ivy.plugins.lock.LockStrategy
    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String toString() {
        return this.name;
    }

    public boolean isDebugLocking() {
        return this.debugLocking;
    }
}
