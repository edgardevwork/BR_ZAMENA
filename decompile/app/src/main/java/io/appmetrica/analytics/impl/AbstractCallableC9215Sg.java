package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.Sg */
/* loaded from: classes5.dex */
public abstract class AbstractCallableC9215Sg implements Callable {

    /* renamed from: d */
    @NotNull
    public static final C9191Rg f7253d = new C9191Rg();

    /* renamed from: a */
    public final C9616j0 f7254a;

    /* renamed from: b */
    public final InterfaceC9511ek f7255b;

    /* renamed from: c */
    public boolean f7256c;

    public AbstractCallableC9215Sg(C9616j0 c9616j0, InterfaceC9511ek interfaceC9511ek) {
        this.f7254a = c9616j0;
        this.f7255b = interfaceC9511ek;
    }

    /* renamed from: a */
    public abstract void mo5404a(IAppMetricaService iAppMetricaService);

    /* renamed from: a */
    public void mo5573a(@Nullable Throwable th) {
    }

    @NotNull
    /* renamed from: b */
    public final C9616j0 m5575b() {
        return this.f7254a;
    }

    /* renamed from: c */
    public boolean mo5576c() throws InterruptedException {
        C9616j0 c9616j0 = this.f7254a;
        synchronized (c9616j0) {
            try {
                if (c9616j0.f8381d == null) {
                    c9616j0.f8382e = new CountDownLatch(1);
                    Intent intentM5186a = AbstractC8905Fj.m5186a(c9616j0.f8378a);
                    try {
                        c9616j0.f8384g.m5316b(c9616j0.f8378a);
                        c9616j0.f8378a.bindService(intentM5186a, c9616j0.f8386i, 1);
                    } catch (Throwable unused) {
                    }
                }
            } finally {
            }
        }
        this.f7254a.m6295a(5000L);
        return true;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        mo5572a();
        return Unit.INSTANCE;
    }

    /* renamed from: d */
    public final boolean m5577d() {
        return this.f7256c;
    }

    /* renamed from: a */
    public final void m5574a(boolean z) {
        this.f7256c = z;
    }

    /* renamed from: a */
    public void mo5572a() {
        IAppMetricaService iAppMetricaService;
        try {
            if (this.f7256c) {
                return;
            }
            this.f7256c = true;
            int i = 0;
            do {
                C9616j0 c9616j0 = this.f7254a;
                synchronized (c9616j0) {
                    iAppMetricaService = c9616j0.f8381d;
                }
                if (iAppMetricaService != null) {
                    try {
                        mo5404a(iAppMetricaService);
                        InterfaceC9511ek interfaceC9511ek = this.f7255b;
                        if (interfaceC9511ek != null && !((C8828Ch) interfaceC9511ek).m5032a()) {
                            return;
                        }
                        this.f7254a.m6298c();
                        return;
                    } catch (RemoteException unused) {
                    }
                }
                i++;
                if (!mo5576c() || C9153Q1.f7134e.get()) {
                    return;
                }
            } while (i < 3);
        } catch (Throwable th) {
            mo5573a(th);
        }
    }
}
