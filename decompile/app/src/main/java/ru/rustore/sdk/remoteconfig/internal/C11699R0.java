package ru.rustore.sdk.remoteconfig.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.remoteconfig.RemoteConfig;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.R0 */
/* loaded from: classes6.dex */
public final class C11699R0 extends Lambda implements Function1<C11686K0, RemoteConfig> {

    /* renamed from: a */
    public static final C11699R0 f10844a = new C11699R0();

    public C11699R0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final RemoteConfig invoke(C11686K0 c11686k0) {
        C11686K0 snapshotConfig = c11686k0;
        Intrinsics.checkNotNullParameter(snapshotConfig, "snapshotConfig");
        return snapshotConfig.f10829a;
    }
}
