package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.w4 */
/* loaded from: classes8.dex */
public abstract /* synthetic */ class AbstractC9945w4 {

    /* renamed from: a */
    public static final /* synthetic */ int[] f9249a;

    static {
        int[] iArr = new int[CounterConfigurationReporterType.values().length];
        f9249a = iArr;
        try {
            iArr[CounterConfigurationReporterType.COMMUTATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f9249a[CounterConfigurationReporterType.MAIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f9249a[CounterConfigurationReporterType.SELF_DIAGNOSTIC_MAIN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f9249a[CounterConfigurationReporterType.SELF_DIAGNOSTIC_MANUAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f9249a[CounterConfigurationReporterType.MANUAL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f9249a[CounterConfigurationReporterType.SELF_SDK.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
