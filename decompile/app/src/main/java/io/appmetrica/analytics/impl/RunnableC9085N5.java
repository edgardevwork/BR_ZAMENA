package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.N5 */
/* loaded from: classes8.dex */
public final class RunnableC9085N5 implements Runnable {

    /* renamed from: a */
    public final List f7012a;

    /* renamed from: b */
    public final IHandlerExecutor f7013b = C9676la.m6362h().m6384u().m6966a();

    /* renamed from: c */
    public final WaitForActivationDelayBarrier f7014c = C9676la.m6362h().m6365a();

    public RunnableC9085N5(List list) {
        this.f7012a = list;
    }

    /* renamed from: a */
    public static final void m5432a(RunnableC9085N5 runnableC9085N5) {
        Iterator it = runnableC9085N5.f7012a.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7014c.subscribe(TimeUnit.SECONDS.toMillis(10L), this.f7013b, new ActivationBarrierCallback() { // from class: io.appmetrica.analytics.impl.N5$$ExternalSyntheticLambda0
            @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
            public final void onWaitFinished() {
                RunnableC9085N5.m5432a(this.f$0);
            }
        });
    }
}
