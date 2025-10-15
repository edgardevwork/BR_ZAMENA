package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.h0 */
/* loaded from: classes5.dex */
public final class RunnableC9566h0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C9616j0 f8221a;

    public RunnableC9566h0(C9616j0 c9616j0) {
        this.f8221a = c9616j0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9616j0 c9616j0 = this.f8221a;
        synchronized (c9616j0) {
            if (c9616j0.f8378a != null && c9616j0.m6296a()) {
                try {
                    c9616j0.f8381d = null;
                    c9616j0.f8378a.unbindService(c9616j0.f8386i);
                } catch (Throwable unused) {
                }
            }
            c9616j0.f8381d = null;
        }
    }
}
