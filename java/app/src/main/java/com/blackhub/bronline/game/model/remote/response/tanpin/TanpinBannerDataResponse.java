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

