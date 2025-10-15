package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.networktasks.impl.C10086d;
import io.appmetrica.analytics.networktasks.impl.C10088f;
import io.appmetrica.analytics.networktasks.impl.C10089g;
import io.appmetrica.analytics.networktasks.impl.RunnableC10090h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes7.dex */
public class NetworkCore extends InterruptionSafeThread {

    /* renamed from: a */
    private final LinkedBlockingQueue f9589a;

    /* renamed from: b */
    private final Object f9590b;

    /* renamed from: c */
    private final Object f9591c;

    /* renamed from: d */
    private volatile C10086d f9592d;

    /* renamed from: e */
    private final C10089g f9593e;

    public NetworkCore() {
        this(new C10089g());
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        NetworkTask networkTask = null;
        while (isRunning()) {
            try {
                synchronized (this.f9591c) {
                }
                this.f9592d = (C10086d) this.f9589a.take();
                networkTask = this.f9592d.f9560a;
                Executor executor = networkTask.getExecutor();
                this.f9593e.getClass();
                executor.execute(new RunnableC10090h(networkTask, this, new C10088f()));
                synchronized (this.f9591c) {
                    this.f9592d = null;
                    networkTask.onTaskFinished();
                    networkTask.onTaskRemoved();
                }
            } catch (InterruptedException unused) {
                synchronized (this.f9591c) {
                    try {
                        this.f9592d = null;
                        if (networkTask != null) {
                            networkTask.onTaskFinished();
                            networkTask.onTaskRemoved();
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                synchronized (this.f9591c) {
                    try {
                        this.f9592d = null;
                        if (networkTask != null) {
                            networkTask.onTaskFinished();
                            networkTask.onTaskRemoved();
                        }
                        throw th;
                    } finally {
                    }
                }
            }
        }
    }

    public void startTask(NetworkTask networkTask) {
        synchronized (this.f9590b) {
            try {
                C10086d c10086d = new C10086d(networkTask);
                if (isRunning() && !this.f9589a.contains(c10086d) && !c10086d.equals(this.f9592d) && networkTask.onTaskAdded()) {
                    this.f9589a.offer(c10086d);
                }
            } finally {
            }
        }
    }

    public void stopTasks() {
        synchronized (this.f9591c) {
            try {
                C10086d c10086d = this.f9592d;
                if (c10086d != null) {
                    c10086d.f9560a.onTaskRemoved();
                }
                ArrayList arrayList = new ArrayList(this.f9589a.size());
                this.f9589a.drainTo(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C10086d) it.next()).f9560a.onTaskRemoved();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public NetworkCore(C10089g c10089g) {
        this.f9589a = new LinkedBlockingQueue();
        this.f9590b = new Object();
        this.f9591c = new Object();
        this.f9593e = c10089g;
    }
}
