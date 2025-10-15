package io.appmetrica.analytics.impl;

import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.of */
/* loaded from: classes6.dex */
public final class C9756of implements InterfaceC9706mf {

    /* renamed from: a */
    public final /* synthetic */ C9906uf f8852a;

    public C9756of(C9906uf c9906uf) {
        this.f8852a = c9906uf;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9706mf
    @WorkerThread
    /* renamed from: a */
    public final void mo6488a() {
        C9906uf c9906uf = this.f8852a;
        C9976xa c9976xa = c9906uf.f9179b;
        C9731nf c9731nf = new C9731nf(c9906uf);
        c9976xa.getClass();
        try {
            FutureTask futureTask = new FutureTask(new CallableC9951wa(c9976xa));
            C9676la.f8552C.f8558d.f9317a.getClass();
            new InterruptionSafeThread(futureTask, "IAA-SHMSR-" + ThreadFactoryC9479dd.f7951a.incrementAndGet()).start();
            C8901Ff c8901Ff = (C8901Ff) futureTask.get(5L, TimeUnit.SECONDS);
            AbstractC9664kn.m6340a(c9976xa.f9304b);
            C9906uf.m6857a(c9906uf, c8901Ff, C9906uf.m6856a(c9906uf));
        } catch (Throwable th) {
            try {
                c9731nf.mo5333a(th);
            } finally {
                AbstractC9664kn.m6340a(c9976xa.f9304b);
            }
        }
    }
}
