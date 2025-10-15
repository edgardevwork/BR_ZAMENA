package ru.rustore.sdk.metrics.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.metrics.MetricsEvent;

/* renamed from: ru.rustore.sdk.metrics.internal.M */
/* loaded from: classes5.dex */
public final class C11595M extends Lambda implements Function0<String> {

    /* renamed from: a */
    public final /* synthetic */ MetricsEvent f10633a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11595M(MetricsEvent metricsEvent) {
        super(0);
        this.f10633a = metricsEvent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return "Insert new event with name: " + this.f10633a.getEventName();
    }
}
