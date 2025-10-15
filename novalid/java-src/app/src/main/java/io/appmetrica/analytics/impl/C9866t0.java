package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.t0 */
/* loaded from: classes6.dex */
public final class C9866t0 implements InterfaceC9603ic {

    /* renamed from: a */
    public final /* synthetic */ C9891u0 f9078a;

    /* renamed from: b */
    public final /* synthetic */ AppMetricaConfig f9079b;

    /* renamed from: c */
    public final /* synthetic */ PublicLogger f9080c;

    public C9866t0(C9891u0 c9891u0, AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        this.f9078a = c9891u0;
        this.f9079b = appMetricaConfig;
        this.f9080c = publicLogger;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9603ic
    @NotNull
    /* renamed from: a */
    public final C9330Xb mo6290a() {
        C9891u0 c9891u0 = this.f9078a;
        return c9891u0.f9147g.mo5074a(this.f9079b, this.f9080c, c9891u0.f9149i.f6534f);
    }
}
