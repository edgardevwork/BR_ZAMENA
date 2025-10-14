package ru.rustore.sdk.remoteconfig.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.i */
/* loaded from: classes6.dex */
public final class C11741i extends Lambda implements Function1<C11716a, Unit> {

    /* renamed from: a */
    public final /* synthetic */ C11747l f10936a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11741i(C11747l c11747l) {
        super(1);
        this.f10936a = c11747l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C11716a c11716a) {
        C11716a actualConfig = c11716a;
        Intrinsics.checkNotNullParameter(actualConfig, "actualConfig");
        this.f10936a.f10948e.m7507a(actualConfig.f10884b);
        return Unit.INSTANCE;
    }
}
