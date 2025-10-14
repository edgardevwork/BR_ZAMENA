package ru.rustore.sdk.metrics.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import ru.rustore.sdk.metrics.MetricsEvent;

/* renamed from: ru.rustore.sdk.metrics.internal.L */
/* loaded from: classes7.dex */
public final class C11594L {

    /* renamed from: a */
    public final C11638t f10632a;

    public C11594L(C11638t metricsEventSerializer) {
        Intrinsics.checkNotNullParameter(metricsEventSerializer, "metricsEventSerializer");
        this.f10632a = metricsEventSerializer;
    }

    /* renamed from: a */
    public final C11592J m7487a(C11586D model) {
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f10616a;
        C11638t c11638t = this.f10632a;
        MetricsEvent metricsEvent = model.f10617b;
        c11638t.getClass();
        byte[] bytes = C11638t.m7504a(metricsEvent).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return new C11592J(str, bytes);
    }
}
