package ru.rustore.sdk.appupdate;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.metrics.MetricsEvent;

/* renamed from: ru.rustore.sdk.appupdate.k */
/* loaded from: classes7.dex */
public final class C11385k extends Lambda implements Function0<MetricsEvent> {

    /* renamed from: a */
    public final /* synthetic */ C11390n f10127a;

    /* renamed from: b */
    public final /* synthetic */ C11382i f10128b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11385k(C11390n c11390n, C11382i c11382i) {
        super(0);
        this.f10127a = c11390n;
        this.f10128b = c11382i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final MetricsEvent invoke() {
        C11384j c11384j = this.f10127a.f10134a;
        C11382i model = this.f10128b;
        c11384j.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        return new MetricsEvent(model.f10122a, model.f10123b);
    }
}
