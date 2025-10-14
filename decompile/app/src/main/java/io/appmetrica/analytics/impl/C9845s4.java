package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.s4 */
/* loaded from: classes6.dex */
public final class C9845s4 implements ClientStorageProvider {

    /* renamed from: a */
    public final InterfaceC10011yk f9035a;

    public C9845s4(@NotNull InterfaceC10011yk interfaceC10011yk) {
        this.f9035a = interfaceC10011yk;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider
    @NotNull
    public final ModulePreferences modulePreferences(@NotNull String str) {
        return new C8972Ic(str, this.f9035a);
    }
}
