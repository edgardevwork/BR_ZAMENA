package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.m4 */
/* loaded from: classes6.dex */
public final class C9695m4 implements ModuleServiceConfig {

    /* renamed from: a */
    public final SdkIdentifiers f8621a;

    /* renamed from: b */
    public final Object f8622b;

    public C9695m4(@NotNull SdkIdentifiers sdkIdentifiers, Object obj) {
        this.f8621a = sdkIdentifiers;
        this.f8622b = obj;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig
    public final Object getFeaturesConfig() {
        return this.f8622b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig
    @NotNull
    public final SdkIdentifiers getIdentifiers() {
        return this.f8621a;
    }
}
