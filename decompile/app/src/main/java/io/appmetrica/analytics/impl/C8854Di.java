package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.Di */
/* loaded from: classes6.dex */
public final class C8854Di {

    /* renamed from: a */
    public final String f6487a;

    /* renamed from: b */
    public final Context f6488b;

    /* renamed from: c */
    public final CounterConfigurationReporterType f6489c;

    /* renamed from: d */
    public final C8929Gi f6490d;

    public C8854Di(String str, Context context, CounterConfigurationReporterType counterConfigurationReporterType, C8929Gi c8929Gi) {
        this.f6487a = str;
        this.f6488b = context;
        int i = AbstractC8829Ci.f6432a[counterConfigurationReporterType.ordinal()];
        if (i == 1) {
            this.f6489c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MAIN;
        } else if (i != 2) {
            this.f6489c = null;
        } else {
            this.f6489c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MANUAL;
        }
        this.f6490d = c8929Gi;
    }
}
