package com.blackhub.bronline.game.model.remote.response.app;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AppVersionResponse.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ2\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\bR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\b¨\u0006\u0017"}, m7105d2 = {"Lcom/blackhub/bronline/game/model/remote/response/app/AppVersionResponse;", "", "versionIos", "", "versionAndroidMarket", "versionAndroidRuStore", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getVersionAndroidMarket", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getVersionAndroidRuStore", "getVersionIos", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/blackhub/bronline/game/model/remote/response/app/AppVersionResponse;", "equals", "", "other", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
