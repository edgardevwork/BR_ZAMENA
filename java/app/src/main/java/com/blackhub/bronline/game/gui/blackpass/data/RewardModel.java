package com.blackhub.bronline.game.gui.blackpass.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RewardModel.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class RewardModel {
    public static final int $stable = 8;

    @NotNull
    public final CommonRewardModel premiumReward;

    @NotNull
    public final CommonRewardModel standardReward;

    public static /* synthetic */ RewardModel copy$default(RewardModel rewardModel, CommonRewardModel commonRewardModel, CommonRewardModel commonRewardModel2, int i, Object obj) {
        if ((i & 1) != 0) {
            commonRewardModel = rewardModel.standardReward;
        }
        if ((i & 2) != 0) {
            commonRewardModel2 = rewardModel.premiumReward;
        }
        return rewardModel.copy(commonRewardModel, commonRewardModel2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CommonRewardModel getStandardReward() {
        return this.standardReward;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CommonRewardModel getPremiumReward() {
        return this.premiumReward;
    }

    @NotNull
    public final RewardModel copy(@NotNull CommonRewardModel standardReward, @NotNull CommonRewardModel premiumReward) {
        Intrinsics.checkNotNullParameter(standardReward, "standardReward");
        Intrinsics.checkNotNullParameter(premiumReward, "premiumReward");
        return new RewardModel(standardReward, premiumReward);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardModel)) {
            return false;
        }
        RewardModel rewardModel = (RewardModel) other;
        return Intrinsics.areEqual(this.standardReward, rewardModel.standardReward) && Intrinsics.areEqual(this.premiumReward, rewardModel.premiumReward);
    }

    public int hashCode() {
        return (this.standardReward.hashCode() * 31) + this.premiumReward.hashCode();
    }

    @NotNull
    public String toString() {
        return "RewardModel(standardReward=" + this.standardReward + ", premiumReward=" + this.premiumReward + ")";
    }

    public RewardModel(@NotNull CommonRewardModel standardReward, @NotNull CommonRewardModel premiumReward) {
        Intrinsics.checkNotNullParameter(standardReward, "standardReward");
        Intrinsics.checkNotNullParameter(premiumReward, "premiumReward");
        this.standardReward = standardReward;
        this.premiumReward = premiumReward;
    }

    @NotNull
    public final CommonRewardModel getStandardReward() {
        return this.standardReward;
    }

    @NotNull
    public final CommonRewardModel getPremiumReward() {
        return this.premiumReward;
    }
}

