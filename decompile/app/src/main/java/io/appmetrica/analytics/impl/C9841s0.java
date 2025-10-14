package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.s0 */
/* loaded from: classes6.dex */
public final class C9841s0 implements InterfaceC9603ic {

    /* renamed from: a */
    public final /* synthetic */ C9891u0 f9029a;

    /* renamed from: b */
    public final /* synthetic */ AppMetricaConfig f9030b;

    /* renamed from: c */
    public final /* synthetic */ PublicLogger f9031c;

    public C9841s0(C9891u0 c9891u0, AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        this.f9029a = c9891u0;
        this.f9030b = appMetricaConfig;
        this.f9031c = publicLogger;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9603ic
    @NotNull
    /* renamed from: a */
    public final C9330Xb mo6290a() {
        C9891u0 c9891u0 = this.f9029a;
        return c9891u0.f9147g.mo5077b(this.f9030b, this.f9031c, c9891u0.f9149i.f6534f);
    }
}
