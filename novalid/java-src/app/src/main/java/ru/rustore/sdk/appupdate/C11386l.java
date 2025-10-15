package ru.rustore.sdk.appupdate;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.metrics.MetricsEvent;
import ru.rustore.sdk.reactive.single.Single;

/* renamed from: ru.rustore.sdk.appupdate.l */
/* loaded from: classes7.dex */
public final class C11386l extends Lambda implements Function1<MetricsEvent, Single<Unit>> {

    /* renamed from: a */
    public final /* synthetic */ C11390n f10129a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11386l(C11390n c11390n) {
        super(1);
        this.f10129a = c11390n;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Single<Unit> invoke(MetricsEvent metricsEvent) {
        MetricsEvent dto = metricsEvent;
        Intrinsics.checkNotNullParameter(dto, "dto");
        return this.f10129a.f10135b.send(dto);
    }
}
