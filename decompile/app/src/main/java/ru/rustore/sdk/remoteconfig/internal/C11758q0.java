package ru.rustore.sdk.remoteconfig.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.metrics.MetricsEvent;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.q0 */
/* loaded from: classes6.dex */
public final class C11758q0 extends Lambda implements Function0<MetricsEvent> {

    /* renamed from: a */
    public final /* synthetic */ C11764t0 f10969a;

    /* renamed from: b */
    public final /* synthetic */ C11754o0 f10970b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11758q0(C11764t0 c11764t0, C11754o0 c11754o0) {
        super(0);
        this.f10969a = c11764t0;
        this.f10970b = c11754o0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final MetricsEvent invoke() {
        C11756p0 c11756p0 = this.f10969a.f10975a;
        C11754o0 model = this.f10970b;
        c11756p0.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        return new MetricsEvent(model.f10965a, model.f10966b);
    }
}
