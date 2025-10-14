package com.blackhub.bronline.game.model.remote.response.tanpin;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.model.remote.response.cases.CasesAwardDto;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TanpinBannerDataResponse.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m7105d2 = {"Lcom/blackhub/bronline/game/model/remote/response/tanpin/TanpinBannerDataResponse;", "", "bannerData", "Lcom/blackhub/bronline/game/model/remote/response/tanpin/TanpinBannerData;", "rewards", "", "Lcom/blackhub/bronline/game/model/remote/response/cases/CasesAwardDto;", "(Lcom/blackhub/bronline/game/model/remote/response/tanpin/TanpinBannerData;Ljava/util/List;)V", "getBannerData", "()Lcom/blackhub/bronline/game/model/remote/response/tanpin/TanpinBannerData;", "getRewards", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TanpinBannerDataResponse {
    public static final int $stable = 8;

    @SerializedName("banner")
    @NotNull
    public final TanpinBannerData bannerData;

    @SerializedName("rewards")
    @NotNull
    public final List<CasesAwardDto> rewards;

    public TanpinBannerDataResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TanpinBannerDataResponse copy$default(TanpinBannerDataResponse tanpinBannerDataResponse, TanpinBannerData tanpinBannerData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            tanpinBannerData = tanpinBannerDataResponse.bannerData;
        }
        if ((i & 2) != 0) {
            list = tanpinBannerDataResponse.rewards;
        }
        return tanpinBannerDataResponse.copy(tanpinBannerData, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TanpinBannerData getBannerData() {
        return this.bannerData;
    }

    @NotNull
    public final List<CasesAwardDto> component2() {
        return this.rewards;
    }

    @NotNull
    public final TanpinBannerDataResponse copy(@NotNull TanpinBannerData bannerData, @NotNull List<CasesAwardDto> rewards) {
        Intrinsics.checkNotNullParameter(bannerData, "bannerData");
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        return new TanpinBannerDataResponse(bannerData, rewards);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TanpinBannerDataResponse)) {
            return false;
        }
        TanpinBannerDataResponse tanpinBannerDataResponse = (TanpinBannerDataResponse) other;
        return Intrinsics.areEqual(this.bannerData, tanpinBannerDataResponse.bannerData) && Intrinsics.areEqual(this.rewards, tanpinBannerDataResponse.rewards);
    }

    public int hashCode() {
        return (this.bannerData.hashCode() * 31) + this.rewards.hashCode();
    }

    @NotNull
    public String toString() {
        return "TanpinBannerDataResponse(bannerData=" + this.bannerData + ", rewards=" + this.rewards + ")";
    }

    public TanpinBannerDataResponse(@NotNull TanpinBannerData bannerData, @NotNull List<CasesAwardDto> rewards) {
        Intrinsics.checkNotNullParameter(bannerData, "bannerData");
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        this.bannerData = bannerData;
        this.rewards = rewards;
    }

    public /* synthetic */ TanpinBannerDataResponse(TanpinBannerData tanpinBannerData, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new TanpinBannerData(null, null, null, null, null, null, null, null, null, null, 1023, null) : tanpinBannerData, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }

    @NotNull
    public final TanpinBannerData getBannerData() {
        return this.bannerData;
    }

    @NotNull
    public final List<CasesAwardDto> getRewards() {
        return this.rewards;
    }
}
