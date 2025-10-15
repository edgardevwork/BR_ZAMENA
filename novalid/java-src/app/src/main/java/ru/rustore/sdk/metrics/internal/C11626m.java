package ru.rustore.sdk.metrics.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.metrics.MetricsEvent;
import ru.rustore.sdk.metrics.MetricsException;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleSubscribeKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;

/* renamed from: ru.rustore.sdk.metrics.internal.m */
/* loaded from: classes5.dex */
public final class C11626m extends Lambda implements Function0<Unit> {

    /* renamed from: a */
    public final /* synthetic */ C11627n f10681a;

    /* renamed from: b */
    public final /* synthetic */ MetricsEvent f10682b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11626m(C11627n c11627n, MetricsEvent metricsEvent) {
        super(0);
        this.f10681a = c11627n;
        this.f10682b = metricsEvent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() throws MetricsException.SaveMetricsEventError {
        C11627n c11627n = this.f10681a;
        if (!c11627n.f10688f) {
            SingleSubscribeKt.subscribe(SingleSubscribeOnKt.subscribeOn(Single.INSTANCE.from(new C11621h(c11627n)), Dispatchers.INSTANCE.getIo()), new C11623j(c11627n), new C11625l(c11627n));
            c11627n.f10685c.m7491a();
            c11627n.f10688f = true;
        }
        C11612c c11612c = this.f10681a.f10684b;
        MetricsEvent metricsEvent = this.f10682b;
        c11612c.getClass();
        Intrinsics.checkNotNullParameter(metricsEvent, "metricsEvent");
        C11596N c11596n = c11612c.f10669a;
        c11596n.getClass();
        Intrinsics.checkNotNullParameter(metricsEvent, "metricsEvent");
        c11596n.f10637d.mo7493a(new C11595M(metricsEvent));
        c11596n.f10634a.m7485a(c11596n.f10635b.m7486a(metricsEvent));
        return Unit.INSTANCE;
    }
}
