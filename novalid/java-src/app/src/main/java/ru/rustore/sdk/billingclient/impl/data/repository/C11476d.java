package ru.rustore.sdk.billingclient.impl.data.repository;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.metrics.MetricsEvent;
import ru.rustore.sdk.reactive.single.Single;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.repository.d */
/* loaded from: classes8.dex */
public final class C11476d extends Lambda implements Function1<MetricsEvent, Single<Unit>> {

    /* renamed from: a */
    public final /* synthetic */ C11474b f10288a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11476d(C11474b c11474b) {
        super(1);
        this.f10288a = c11474b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Single<Unit> invoke(MetricsEvent metricsEvent) {
        MetricsEvent dto = metricsEvent;
        Intrinsics.checkNotNullParameter(dto, "dto");
        return this.f10288a.f10282b.send(dto);
    }
}
