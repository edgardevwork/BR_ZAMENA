package com.blackhub.bronline.game.gui.fractions.data;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FractionsNewRankRewardItem.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class FractionsNewRankRewardItem {
    public static final int $stable = 8;
    public final int fractionId;
    public final int newRank;
    public final int newRankImage;

    @NotNull
    public final List<Integer> rankReward;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FractionsNewRankRewardItem copy$default(FractionsNewRankRewardItem fractionsNewRankRewardItem, int i, List list, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = fractionsNewRankRewardItem.fractionId;
        }
        if ((i4 & 2) != 0) {
            list = fractionsNewRankRewardItem.rankReward;
        }
        if ((i4 & 4) != 0) {
            i2 = fractionsNewRankRewardItem.newRank;
        }
        if ((i4 & 8) != 0) {
            i3 = fractionsNewRankRewardItem.newRankImage;
        }
        return fractionsNewRankRewardItem.copy(i, list, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getFractionId() {
        return this.fractionId;
    }

    @NotNull
    public final List<Integer> component2() {
        return this.rankReward;
    }

    /* renamed from: component3, reason: from getter */
    public final int getNewRank() {
        return this.newRank;
    }

    /* renamed from: component4, reason: from getter */
    public final int getNewRankImage() {
        return this.newRankImage;
    }

    @NotNull
    public final FractionsNewRankRewardItem copy(int fractionId, @NotNull List<Integer> rankReward, int newRank, int newRankImage) {
        Intrinsics.checkNotNullParameter(rankReward, "rankReward");
        return new FractionsNewRankRewardItem(fractionId, rankReward, newRank, newRankImage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FractionsNewRankRewardItem)) {
            return false;
        }
        FractionsNewRankRewardItem fractionsNewRankRewardItem = (FractionsNewRankRewardItem) other;
        return this.fractionId == fractionsNewRankRewardItem.fractionId && Intrinsics.areEqual(this.rankReward, fractionsNewRankRewardItem.rankReward) && this.newRank == fractionsNewRankRewardItem.newRank && this.newRankImage == fractionsNewRankRewardItem.newRankImage;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.fractionId) * 31) + this.rankReward.hashCode()) * 31) + Integer.hashCode(this.newRank)) * 31) + Integer.hashCode(this.newRankImage);
    }

    @NotNull
    public String toString() {
        return "FractionsNewRankRewardItem(fractionId=" + this.fractionId + ", rankReward=" + this.rankReward + ", newRank=" + this.newRank + ", newRankImage=" + this.newRankImage + ")";
    }

    public FractionsNewRankRewardItem(int i, @NotNull List<Integer> rankReward, int i2, int i3) {
        Intrinsics.checkNotNullParameter(rankReward, "rankReward");
        this.fractionId = i;
        this.rankReward = rankReward;
        this.newRank = i2;
        this.newRankImage = i3;
    }

    public final int getFractionId() {
        return this.fractionId;
    }

    @NotNull
    public final List<Integer> getRankReward() {
        return this.rankReward;
    }

    public final int getNewRank() {
        return this.newRank;
    }

    public final int getNewRankImage() {
        return this.newRankImage;
    }
}

