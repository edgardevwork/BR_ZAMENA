package ru.rustore.sdk.remoteconfig.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.remoteconfig.RemoteConfig;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.j */
/* loaded from: classes6.dex */
public final class C11743j extends Lambda implements Function1<C11716a, RemoteConfig> {

    /* renamed from: a */
    public static final C11743j f10937a = new C11743j();

    public C11743j() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final RemoteConfig invoke(C11716a c11716a) {
        C11716a actualConfig = c11716a;
        Intrinsics.checkNotNullParameter(actualConfig, "actualConfig");
        return actualConfig.f10883a;
    }
}
