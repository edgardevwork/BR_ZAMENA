package ru.rustore.sdk.metrics.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: ru.rustore.sdk.metrics.internal.j */
/* loaded from: classes5.dex */
public final class C11623j extends Lambda implements Function1<Throwable, Unit> {

    /* renamed from: a */
    public final /* synthetic */ C11627n f10678a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11623j(C11627n c11627n) {
        super(1);
        this.f10678a = c11627n;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        Throwable it = th;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f10678a.f10687e.mo7493a(C11622i.f10677a);
        return Unit.INSTANCE;
    }
}
