package org.apache.ivy.core;

/* loaded from: classes7.dex */
public class IvyThread extends Thread {
    public IvyContext context;

    public IvyThread() {
        this.context = IvyContext.getContext();
    }

    public IvyThread(Runnable runnable, String str) {
        super(runnable, str);
        this.context = IvyContext.getContext();
    }

    public IvyThread(Runnable runnable) {
        super(runnable);
        this.context = IvyContext.getContext();
    }

    public IvyThread(String str) {
        super(str);
        this.context = IvyContext.getContext();
    }

    public IvyThread(ThreadGroup threadGroup, Runnable runnable, String str, long j) {
        super(threadGroup, runnable, str, j);
        this.context = IvyContext.getContext();
    }

    public IvyThread(ThreadGroup threadGroup, Runnable runnable, String str) {
        super(threadGroup, runnable, str);
        this.context = IvyContext.getContext();
    }

    public IvyThread(ThreadGroup threadGroup, Runnable runnable) {
        super(threadGroup, runnable);
        this.context = IvyContext.getContext();
    }

    public IvyThread(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
        this.context = IvyContext.getContext();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        initContext();
        super.run();
    }

    public void initContext() {
        IvyContext.pushContext(this.context);
    }
}
