package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.j0 */
/* loaded from: classes5.dex */
public final class C9616j0 {

    /* renamed from: j */
    public static final long f8377j = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: a */
    public final Context f8378a;

    /* renamed from: b */
    public final ICommonExecutor f8379b;

    /* renamed from: e */
    public CountDownLatch f8382e;

    /* renamed from: g */
    public final C9009K1 f8384g;

    /* renamed from: d */
    public IAppMetricaService f8381d = null;

    /* renamed from: f */
    public final Object f8383f = new Object();

    /* renamed from: h */
    public final RunnableC9566h0 f8385h = new RunnableC9566h0(this);

    /* renamed from: i */
    public final ServiceConnectionC9591i0 f8386i = new ServiceConnectionC9591i0(this);

    /* renamed from: c */
    public boolean f8380c = false;

    public C9616j0(Context context, ICommonExecutor iCommonExecutor, C9009K1 c9009k1) {
        this.f8378a = context.getApplicationContext();
        this.f8379b = iCommonExecutor;
        this.f8384g = c9009k1;
    }

    /* renamed from: a */
    public final synchronized boolean m6296a() {
        return this.f8381d != null;
    }

    /* renamed from: b */
    public final void m6297b() {
        synchronized (this.f8383f) {
            this.f8379b.remove(this.f8385h);
        }
    }

    /* renamed from: c */
    public final void m6298c() {
        ICommonExecutor iCommonExecutor = this.f8379b;
        synchronized (this.f8383f) {
            try {
                iCommonExecutor.remove(this.f8385h);
                if (!this.f8380c) {
                    iCommonExecutor.executeDelayed(this.f8385h, f8377j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void m6295a(Long l) throws InterruptedException {
        try {
            synchronized (this) {
                try {
                    CountDownLatch countDownLatch = this.f8382e;
                    if (countDownLatch == null) {
                        return;
                    }
                    countDownLatch.await(l.longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (InterruptedException unused) {
        }
    }
}
