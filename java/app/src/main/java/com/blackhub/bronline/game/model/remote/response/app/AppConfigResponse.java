package com.blackhub.bronline.game.model.remote.response.app;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AppConfigResponse.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class AppConfigResponse {
    public static final int $stable = 0;

    @SerializedName("cdnUrl")
    @Nullable
    public final String cdnUrl;

    @SerializedName("port")
    @Nullable
    public final String port;

    @SerializedName("versionAndroid")
    @Nullable
    public final Integer versionAndroid;

    public static /* synthetic */ AppConfigResponse copy$default(AppConfigResponse appConfigResponse, String str, Integer num, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appConfigResponse.cdnUrl;
        }
        if ((i & 2) != 0) {
            num = appConfigResponse.versionAndroid;
        }
        if ((i & 4) != 0) {
            str2 = appConfigResponse.port;
        }
        return appConfigResponse.copy(str, num, str2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getCdnUrl() {
        return this.cdnUrl;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getVersionAndroid() {
        return this.versionAndroid;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getPort() {
        return this.port;
    }

    @NotNull
    public final AppConfigResponse copy(@Nullable String cdnUrl, @Nullable Integer versionAndroid, @Nullable String port) {
        return new AppConfigResponse(cdnUrl, versionAndroid, port);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppConfigResponse)) {
            return false;
        }
        AppConfigResponse appConfigResponse = (AppConfigResponse) other;
        return Intrinsics.areEqual(this.cdnUrl, appConfigResponse.cdnUrl) && Intrinsics.areEqual(this.versionAndroid, appConfigResponse.versionAndroid) && Intrinsics.areEqual(this.port, appConfigResponse.port);
    }

    public int hashCode() {
        String str = this.cdnUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.versionAndroid;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.port;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AppConfigResponse(cdnUrl=" + this.cdnUrl + ", versionAndroid=" + this.versionAndroid + ", port=" + this.port + ")";
    }

    public AppConfigResponse(@Nullable String str, @Nullable Integer num, @Nullable String str2) {
        this.cdnUrl = str;
        this.versionAndroid = num;
        this.port = str2;
    }

    @Nullable
    public final String getCdnUrl() {
        return this.cdnUrl;
    }

    @Nullable
    public final Integer getVersionAndroid() {
        return this.versionAndroid;
    }

    @Nullable
    public final String getPort() {
        return this.port;
    }
}

