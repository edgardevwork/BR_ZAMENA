package com.blackhub.bronline.game.model.remote.response.app;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AppVersionResponse.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class AppVersionResponse {
    public static final int $stable = 0;

    @SerializedName("version_android")
    @Nullable
    public final Integer versionAndroidMarket;

    @SerializedName("version_android_rustore")
    @Nullable
    public final Integer versionAndroidRuStore;

    @SerializedName("version_ios")
    @Nullable
    public final Integer versionIos;

    public static /* synthetic */ AppVersionResponse copy$default(AppVersionResponse appVersionResponse, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = appVersionResponse.versionIos;
        }
        if ((i & 2) != 0) {
            num2 = appVersionResponse.versionAndroidMarket;
        }
        if ((i & 4) != 0) {
            num3 = appVersionResponse.versionAndroidRuStore;
        }
        return appVersionResponse.copy(num, num2, num3);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getVersionIos() {
        return this.versionIos;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getVersionAndroidMarket() {
        return this.versionAndroidMarket;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getVersionAndroidRuStore() {
        return this.versionAndroidRuStore;
    }

    @NotNull
    public final AppVersionResponse copy(@Nullable Integer versionIos, @Nullable Integer versionAndroidMarket, @Nullable Integer versionAndroidRuStore) {
        return new AppVersionResponse(versionIos, versionAndroidMarket, versionAndroidRuStore);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppVersionResponse)) {
            return false;
        }
        AppVersionResponse appVersionResponse = (AppVersionResponse) other;
        return Intrinsics.areEqual(this.versionIos, appVersionResponse.versionIos) && Intrinsics.areEqual(this.versionAndroidMarket, appVersionResponse.versionAndroidMarket) && Intrinsics.areEqual(this.versionAndroidRuStore, appVersionResponse.versionAndroidRuStore);
    }

    public int hashCode() {
        Integer num = this.versionIos;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.versionAndroidMarket;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.versionAndroidRuStore;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AppVersionResponse(versionIos=" + this.versionIos + ", versionAndroidMarket=" + this.versionAndroidMarket + ", versionAndroidRuStore=" + this.versionAndroidRuStore + ")";
    }

    public AppVersionResponse(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        this.versionIos = num;
        this.versionAndroidMarket = num2;
        this.versionAndroidRuStore = num3;
    }

    @Nullable
    public final Integer getVersionIos() {
        return this.versionIos;
    }

    @Nullable
    public final Integer getVersionAndroidMarket() {
        return this.versionAndroidMarket;
    }

    @Nullable
    public final Integer getVersionAndroidRuStore() {
        return this.versionAndroidRuStore;
    }
}

