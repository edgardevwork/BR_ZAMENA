package com.blackhub.bronline.game.gui.fractions.data;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FractionsNewRankRewardItem.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J7\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/fractions/data/FractionsNewRankRewardItem;", "", "fractionId", "", "rankReward", "", "newRank", "newRankImage", "(ILjava/util/List;II)V", "getFractionId", "()I", "getNewRank", "getNewRankImage", "getRankReward", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
