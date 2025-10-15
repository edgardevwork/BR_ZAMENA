package com.blackhub.bronline.game.model.remote.response.app;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AppConfigResponse.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m7105d2 = {"Lcom/blackhub/bronline/game/model/remote/response/app/AppConfigResponse;", "", "cdnUrl", "", "versionAndroid", "", "port", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getCdnUrl", "()Ljava/lang/String;", "getPort", "getVersionAndroid", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/blackhub/bronline/game/model/remote/response/app/AppConfigResponse;", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
