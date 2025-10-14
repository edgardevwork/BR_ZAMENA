package com.sdkit.paylib.paylibnative.sbol.analytics;

import com.sdkit.paylib.paylibnative.api.analytics.CustomPaylibAnalytics;
import com.sdkit.paylib.paylibnative.api.analytics.PaylibEvent;
import com.sdkit.paylib.paylibnative.api.analytics.PaylibMetric;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.sbol.analytics.b */
/* loaded from: classes8.dex */
public abstract class AbstractC8083b {
    /* renamed from: a */
    public static final void m1752a(CustomPaylibAnalytics customPaylibAnalytics, EnumC8082a event) {
        Intrinsics.checkNotNullParameter(customPaylibAnalytics, "<this>");
        Intrinsics.checkNotNullParameter(event, "event");
        customPaylibAnalytics.logEvent(PaylibEvent.Other.INSTANCE, new PaylibMetric(event.name(), CollectionsKt__CollectionsKt.emptyList()));
    }
}
