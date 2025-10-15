package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.billinginterface.internal.BillingType;
import io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.j3 */
/* loaded from: classes8.dex */
public final class C9619j3 implements InterfaceC9762ol {

    /* renamed from: a */
    public BillingMonitor f8392a;

    /* renamed from: b */
    public final Context f8393b;

    /* renamed from: c */
    public final Executor f8394c;

    /* renamed from: d */
    public final Executor f8395d;

    /* renamed from: e */
    public final BillingType f8396e;

    /* renamed from: f */
    public final BillingInfoStorage f8397f;

    /* renamed from: g */
    public final BillingInfoSender f8398g;

    /* renamed from: h */
    public final ApplicationStateProvider f8399h;

    /* renamed from: i */
    public final C9569h3 f8400i;

    public C9619j3(@NonNull Context context, @NonNull Executor executor, @NonNull Executor executor2, @NonNull BillingType billingType, @NonNull BillingInfoStorage billingInfoStorage, @NonNull BillingInfoSender billingInfoSender) {
        this(context, executor, executor2, billingType, billingInfoStorage, billingInfoSender, C9676la.m6362h().m6367c(), new C9569h3());
    }

    /* renamed from: a */
    public final void m6299a(@NonNull C9637jl c9637jl, @Nullable Boolean bool) {
        BillingMonitor c9230t7;
        if (((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue()) {
            synchronized (this) {
                try {
                    C9569h3 c9569h3 = this.f8400i;
                    Context context = this.f8393b;
                    Executor executor = this.f8394c;
                    Executor executor2 = this.f8395d;
                    BillingType billingType = this.f8396e;
                    BillingInfoStorage billingInfoStorage = this.f8397f;
                    BillingInfoSender billingInfoSender = this.f8398g;
                    c9569h3.getClass();
                    if (AbstractC9544g3.f8163a[billingType.ordinal()] == 1) {
                        c9230t7 = new BillingLibraryMonitor(context, executor, executor2, billingInfoStorage, billingInfoSender, null, null, 96, null);
                    } else {
                        c9230t7 = new C9230T7();
                    }
                    this.f8392a = c9230t7;
                } catch (Throwable th) {
                    throw th;
                }
            }
            c9230t7.onBillingConfigChanged(c9637jl.f8475x);
            if (this.f8399h.registerStickyObserver(new C9594i3(this)) == ApplicationState.VISIBLE) {
                try {
                    BillingMonitor billingMonitor = this.f8392a;
                    if (billingMonitor != null) {
                        billingMonitor.onSessionResumed();
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public C9619j3(@NonNull Context context, @NonNull Executor executor, @NonNull Executor executor2, @NonNull BillingType billingType, @NonNull BillingInfoStorage billingInfoStorage, @NonNull BillingInfoSender billingInfoSender, @NonNull ApplicationStateProvider applicationStateProvider, @NonNull C9569h3 c9569h3) {
        this.f8393b = context;
        this.f8394c = executor;
        this.f8395d = executor2;
        this.f8396e = billingType;
        this.f8397f = billingInfoStorage;
        this.f8398g = billingInfoSender;
        this.f8399h = applicationStateProvider;
        this.f8400i = c9569h3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9762ol
    /* renamed from: a */
    public final synchronized void mo5082a(@NonNull C9637jl c9637jl) {
        BillingMonitor billingMonitor;
        synchronized (this) {
            billingMonitor = this.f8392a;
        }
        if (billingMonitor != null) {
            billingMonitor.onBillingConfigChanged(c9637jl.f8475x);
        }
    }
}
