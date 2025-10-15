package ru.rustore.sdk.metrics.internal;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import ru.rustore.sdk.metrics.MetricsEvent;

/* renamed from: ru.rustore.sdk.metrics.internal.K */
/* loaded from: classes7.dex */
public final class C11593K {

    /* renamed from: a */
    public final C11638t f10630a;

    /* renamed from: b */
    public final C11613c0 f10631b;

    public C11593K(C11638t metricsEventSerializer, C11613c0 uuidFactory) {
        Intrinsics.checkNotNullParameter(metricsEventSerializer, "metricsEventSerializer");
        Intrinsics.checkNotNullParameter(uuidFactory, "uuidFactory");
        this.f10630a = metricsEventSerializer;
        this.f10631b = uuidFactory;
    }

    /* renamed from: a */
    public final C11592J m7486a(MetricsEvent metricsEvent) {
        Intrinsics.checkNotNullParameter(metricsEvent, "metricsEvent");
        this.f10631b.getClass();
        String value = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(value, "randomUUID().toString()");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f10630a.getClass();
        byte[] bytes = C11638t.m7504a(metricsEvent).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return new C11592J(value, bytes);
    }
}
