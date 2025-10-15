package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.p6 */
/* loaded from: classes7.dex */
public final class C9772p6 extends AbstractC9177R2 {

    /* renamed from: o */
    public final C9797q6 f8872o;

    /* renamed from: p */
    public final C9197Rm f8873p;

    public C9772p6(Context context, C9213Se c9213Se, AppMetricaConfig appMetricaConfig, C9145Ph c9145Ph, C9017K9 c9017k9) {
        this(context, c9145Ph, new C9383Zg(c9213Se, new CounterConfiguration(appMetricaConfig, CounterConfigurationReporterType.CRASH), appMetricaConfig.userProfileID), c9017k9, new C9797q6(context), new C9197Rm(), C9820r4.m6725i().m6738l(), new C9174Qm(), new C9310Wf(), new C9947w6(), new C9342Y(), new C9455ce(c9017k9));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9177R2, io.appmetrica.analytics.impl.InterfaceC9138Pa, io.appmetrica.analytics.impl.InterfaceC9209Sa
    /* renamed from: a */
    public final void mo4964a(@NonNull C9150Pm c9150Pm) {
        this.f8872o.m6694a(this.f8873p.m5531a(c9150Pm, this.f7186b));
        this.f7187c.info("Unhandled exception received: " + c9150Pm, new Object[0]);
    }

    /* renamed from: b */
    public final void m6621b(@NonNull AppMetricaConfig appMetricaConfig) {
        m5514b(appMetricaConfig.errorEnvironment);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9177R2
    /* renamed from: k */
    public final String mo5517k() {
        return "[CrashReporter]";
    }

    public C9772p6(Context context, C9145Ph c9145Ph, C9383Zg c9383Zg, C9017K9 c9017k9, C9797q6 c9797q6, C9197Rm c9197Rm, C9282Vb c9282Vb, C9174Qm c9174Qm, C9310Wf c9310Wf, C9947w6 c9947w6, C9342Y c9342y, C9455ce c9455ce) {
        super(context, c9145Ph, c9383Zg, c9017k9, c9282Vb, c9174Qm, c9310Wf, c9947w6, c9342y, c9455ce);
        this.f8872o = c9797q6;
        this.f8873p = c9197Rm;
        C9820r4.m6725i().getClass();
    }
}
