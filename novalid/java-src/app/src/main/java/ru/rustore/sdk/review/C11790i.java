package ru.rustore.sdk.review;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.metrics.MetricsEvent;

/* renamed from: ru.rustore.sdk.review.i */
/* loaded from: classes8.dex */
public final class C11790i extends Lambda implements Function0<MetricsEvent> {

    /* renamed from: a */
    public final /* synthetic */ C11793l f11021a;

    /* renamed from: b */
    public final /* synthetic */ C11788g f11022b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11790i(C11793l c11793l, C11788g c11788g) {
        super(0);
        this.f11021a = c11793l;
        this.f11022b = c11788g;
    }

    @Override // kotlin.jvm.functions.Function0
    public final MetricsEvent invoke() {
        C11789h c11789h = this.f11021a.f11025a;
        C11788g model = this.f11022b;
        c11789h.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        return new MetricsEvent(model.f11019a, model.f11020b);
    }
}
