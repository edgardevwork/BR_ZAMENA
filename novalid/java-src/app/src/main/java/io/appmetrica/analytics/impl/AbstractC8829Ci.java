package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.Ci */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC8829Ci {

    /* renamed from: a */
    public static final /* synthetic */ int[] f6432a;

    static {
        int[] iArr = new int[CounterConfigurationReporterType.values().length];
        f6432a = iArr;
        try {
            iArr[CounterConfigurationReporterType.MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6432a[CounterConfigurationReporterType.MANUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
