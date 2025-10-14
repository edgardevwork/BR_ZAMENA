package ru.rustore.sdk.remoteconfig.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.remoteconfig.RemoteConfig;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.C */
/* loaded from: classes6.dex */
public final class C11669C extends Lambda implements Function1<C11765u, RemoteConfig> {

    /* renamed from: a */
    public static final C11669C f10728a = new C11669C();

    public C11669C() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final RemoteConfig invoke(C11765u c11765u) {
        C11765u defaultConfig = c11765u;
        Intrinsics.checkNotNullParameter(defaultConfig, "defaultConfig");
        return defaultConfig.f10977a;
    }
}
