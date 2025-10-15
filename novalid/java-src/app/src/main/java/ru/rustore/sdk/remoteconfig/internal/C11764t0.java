package ru.rustore.sdk.remoteconfig.internal;

import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.metrics.MetricsClient;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.t0 */
/* loaded from: classes5.dex */
public final class C11764t0 {

    /* renamed from: a */
    public final C11756p0 f10975a;

    /* renamed from: b */
    public final MetricsClient f10976b;

    public C11764t0(C11756p0 remoteConfigAnalyticsMapper, MetricsClient metricsClient) {
        Intrinsics.checkNotNullParameter(remoteConfigAnalyticsMapper, "remoteConfigAnalyticsMapper");
        Intrinsics.checkNotNullParameter(metricsClient, "metricsClient");
        this.f10975a = remoteConfigAnalyticsMapper;
        this.f10976b = metricsClient;
    }
}
