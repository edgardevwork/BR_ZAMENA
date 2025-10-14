package com.blackhub.bronline.game.gui.blackpass.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RewardModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/blackpass/data/RewardModel;", "", "standardReward", "Lcom/blackhub/bronline/game/core/utils/attachment/reward/CommonRewardModel;", "premiumReward", "(Lcom/blackhub/bronline/game/core/utils/attachment/reward/CommonRewardModel;Lcom/blackhub/bronline/game/core/utils/attachment/reward/CommonRewardModel;)V", "getPremiumReward", "()Lcom/blackhub/bronline/game/core/utils/attachment/reward/CommonRewardModel;", "getStandardReward", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
