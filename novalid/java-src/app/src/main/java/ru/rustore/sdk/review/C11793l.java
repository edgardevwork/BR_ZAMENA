package ru.rustore.sdk.review;

import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.metrics.MetricsClient;

/* renamed from: ru.rustore.sdk.review.l */
/* loaded from: classes5.dex */
public final class C11793l {

    /* renamed from: a */
    public final C11789h f11025a;

    /* renamed from: b */
    public final MetricsClient f11026b;

    public C11793l(C11789h mapper, MetricsClient metricsClient) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(metricsClient, "metricsClient");
        this.f11025a = mapper;
        this.f11026b = metricsClient;
    }
}
