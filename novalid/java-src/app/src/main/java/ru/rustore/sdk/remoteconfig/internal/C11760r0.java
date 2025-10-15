package ru.rustore.sdk.remoteconfig.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.metrics.MetricsEvent;
import ru.rustore.sdk.reactive.single.Single;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.r0 */
/* loaded from: classes6.dex */
public final class C11760r0 extends Lambda implements Function1<MetricsEvent, Single<Unit>> {

    /* renamed from: a */
    public final /* synthetic */ C11764t0 f10973a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11760r0(C11764t0 c11764t0) {
        super(1);
        this.f10973a = c11764t0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Single<Unit> invoke(MetricsEvent metricsEvent) {
        MetricsEvent dto = metricsEvent;
        Intrinsics.checkNotNullParameter(dto, "dto");
        return this.f10973a.f10976b.send(dto);
    }
}
