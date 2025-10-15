package ru.rustore.sdk.remoteconfig.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.Q0 */
/* loaded from: classes6.dex */
public final class C11698Q0 extends Lambda implements Function1<C11686K0, Unit> {

    /* renamed from: a */
    public final /* synthetic */ C11703T0 f10843a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11698Q0(C11703T0 c11703t0) {
        super(1);
        this.f10843a = c11703t0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C11686K0 c11686k0) {
        C11686K0 snapshotConfig = c11686k0;
        Intrinsics.checkNotNullParameter(snapshotConfig, "snapshotConfig");
        this.f10843a.f10851e.m7507a(snapshotConfig.f10830b);
        return Unit.INSTANCE;
    }
}
