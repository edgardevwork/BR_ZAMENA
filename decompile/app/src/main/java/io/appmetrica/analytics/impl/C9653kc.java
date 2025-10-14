package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.internal.CounterConfiguration;

/* renamed from: io.appmetrica.analytics.impl.kc */
/* loaded from: classes7.dex */
public final class C9653kc extends AbstractC9177R2 {
    public C9653kc(Context context, C9213Se c9213Se, ReporterConfig reporterConfig, C9145Ph c9145Ph, C9017K9 c9017k9) {
        this(context, c9145Ph, new C9383Zg(c9213Se, new CounterConfiguration(reporterConfig), reporterConfig.userProfileID), c9017k9, C9820r4.m6725i().m6738l(), new C9174Qm(), new C9310Wf(), new C9947w6(), new C9342Y(), new C9455ce(c9017k9));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9177R2
    /* renamed from: k */
    public final String mo5517k() {
        return "[ManualReporter]";
    }

    public C9653kc(Context context, C9145Ph c9145Ph, C9383Zg c9383Zg, C9017K9 c9017k9, C9282Vb c9282Vb, C9174Qm c9174Qm, C9310Wf c9310Wf, C9947w6 c9947w6, C9342Y c9342y, C9455ce c9455ce) {
        super(context, c9145Ph, c9383Zg, c9017k9, c9282Vb, c9174Qm, c9310Wf, c9947w6, c9342y, c9455ce);
        C9820r4.m6725i().getClass();
    }
}
