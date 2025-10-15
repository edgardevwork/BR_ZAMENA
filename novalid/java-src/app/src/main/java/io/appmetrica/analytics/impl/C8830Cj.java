package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.Cj */
/* loaded from: classes7.dex */
public final class C8830Cj implements ModuleRemoteConfig {

    /* renamed from: a */
    public final SdkIdentifiers f6433a;

    /* renamed from: b */
    public final RemoteConfigMetaInfo f6434b;

    /* renamed from: c */
    public final Object f6435c;

    public C8830Cj(@NotNull SdkIdentifiers sdkIdentifiers, @NotNull RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        this.f6433a = sdkIdentifiers;
        this.f6434b = remoteConfigMetaInfo;
        this.f6435c = obj;
    }

    @NotNull
    /* renamed from: a */
    public final C8830Cj m5035a(@NotNull SdkIdentifiers sdkIdentifiers, @NotNull RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        return new C8830Cj(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }

    @NotNull
    /* renamed from: b */
    public final RemoteConfigMetaInfo m5036b() {
        return this.f6434b;
    }

    /* renamed from: c */
    public final Object m5037c() {
        return this.f6435c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8830Cj)) {
            return false;
        }
        C8830Cj c8830Cj = (C8830Cj) obj;
        return Intrinsics.areEqual(this.f6433a, c8830Cj.f6433a) && Intrinsics.areEqual(this.f6434b, c8830Cj.f6434b) && Intrinsics.areEqual(this.f6435c, c8830Cj.f6435c);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final Object getFeaturesConfig() {
        return this.f6435c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    @NotNull
    public final SdkIdentifiers getIdentifiers() {
        return this.f6433a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    @NotNull
    public final RemoteConfigMetaInfo getRemoteConfigMetaInfo() {
        return this.f6434b;
    }

    public final int hashCode() {
        int iHashCode = (this.f6434b.hashCode() + (this.f6433a.hashCode() * 31)) * 31;
        Object obj = this.f6435c;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    @NotNull
    public final String toString() {
        return "ServiceModuleRemoteConfigModel(identifiers=" + this.f6433a + ", remoteConfigMetaInfo=" + this.f6434b + ", featuresConfig=" + this.f6435c + ')';
    }

    @NotNull
    /* renamed from: a */
    public final SdkIdentifiers m5034a() {
        return this.f6433a;
    }

    /* renamed from: a */
    public static C8830Cj m5033a(C8830Cj c8830Cj, SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            sdkIdentifiers = c8830Cj.f6433a;
        }
        if ((i & 2) != 0) {
            remoteConfigMetaInfo = c8830Cj.f6434b;
        }
        if ((i & 4) != 0) {
            obj = c8830Cj.f6435c;
        }
        c8830Cj.getClass();
        return new C8830Cj(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }
}
