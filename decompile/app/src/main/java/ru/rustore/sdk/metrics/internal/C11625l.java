package ru.rustore.sdk.metrics.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: ru.rustore.sdk.metrics.internal.l */
/* loaded from: classes5.dex */
public final class C11625l extends Lambda implements Function1<Unit, Unit> {

    /* renamed from: a */
    public final /* synthetic */ C11627n f10680a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11625l(C11627n c11627n) {
        super(1);
        this.f10680a = c11627n;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Unit unit) {
        Unit it = unit;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f10680a.f10687e.mo7493a(C11624k.f10679a);
        return Unit.INSTANCE;
    }
}
