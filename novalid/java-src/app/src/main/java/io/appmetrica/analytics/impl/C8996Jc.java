package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.Jc */
/* loaded from: classes8.dex */
public final class C8996Jc implements JsonParser, Converter {

    /* renamed from: a */
    public final RemoteConfigExtensionConfiguration f6818a;

    /* renamed from: b */
    public final /* synthetic */ JsonParser f6819b;

    /* renamed from: c */
    public final /* synthetic */ Converter f6820c;

    public C8996Jc(@NotNull RemoteConfigExtensionConfiguration<Object> remoteConfigExtensionConfiguration) {
        this.f6818a = remoteConfigExtensionConfiguration;
        this.f6819b = remoteConfigExtensionConfiguration.getJsonParser();
        this.f6820c = remoteConfigExtensionConfiguration.getProtobufConverter();
    }

    @NotNull
    /* renamed from: a */
    public final byte[] m5305a(@NotNull Object obj) {
        return (byte[]) this.f6820c.fromModel(obj);
    }

    @Nullable
    /* renamed from: b */
    public final Object m5306b(@NotNull JSONObject jSONObject) {
        return this.f6819b.parseOrNull(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return (byte[]) this.f6820c.fromModel(obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parse(JSONObject jSONObject) {
        return this.f6819b.parse(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return this.f6819b.parseOrNull(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return this.f6820c.toModel((byte[]) obj);
    }

    @NotNull
    /* renamed from: a */
    public final Object m5303a(@NotNull JSONObject jSONObject) {
        return this.f6819b.parse(jSONObject);
    }

    @NotNull
    /* renamed from: a */
    public final Object m5304a(@NotNull byte[] bArr) {
        return this.f6820c.toModel(bArr);
    }

    @NotNull
    /* renamed from: a */
    public final RemoteConfigExtensionConfiguration<Object> m5302a() {
        return this.f6818a;
    }
}
