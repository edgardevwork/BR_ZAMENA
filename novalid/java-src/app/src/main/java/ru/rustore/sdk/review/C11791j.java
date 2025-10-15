package ru.rustore.sdk.review;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.metrics.MetricsEvent;
import ru.rustore.sdk.reactive.single.Single;

/* renamed from: ru.rustore.sdk.review.j */
/* loaded from: classes8.dex */
public final class C11791j extends Lambda implements Function1<MetricsEvent, Single<Unit>> {

    /* renamed from: a */
    public final /* synthetic */ C11793l f11023a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11791j(C11793l c11793l) {
        super(1);
        this.f11023a = c11793l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Single<Unit> invoke(MetricsEvent metricsEvent) {
        MetricsEvent dto = metricsEvent;
        Intrinsics.checkNotNullParameter(dto, "dto");
        return this.f11023a.f11026b.send(dto);
    }
}
