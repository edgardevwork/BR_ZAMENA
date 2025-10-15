package ru.rustore.sdk.remoteconfig.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.B */
/* loaded from: classes6.dex */
public final class C11667B extends Lambda implements Function1<C11765u, Unit> {

    /* renamed from: a */
    public final /* synthetic */ C11673E f10725a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11667B(C11673E c11673e) {
        super(1);
        this.f10725a = c11673e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C11765u c11765u) {
        C11765u defaultConfig = c11765u;
        Intrinsics.checkNotNullParameter(defaultConfig, "defaultConfig");
        this.f10725a.f10736c.m7507a(defaultConfig.f10978b);
        return Unit.INSTANCE;
    }
}
