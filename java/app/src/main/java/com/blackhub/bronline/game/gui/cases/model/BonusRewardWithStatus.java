package com.blackhub.bronline.game.gui.cases.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BonusRewardWithStatus.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class BonusRewardWithStatus {
    public static final int $stable = 0;

    @SerializedName("id")
    public final int idReward;

    @SerializedName("state")
    public final int stateReward;

    /* JADX WARN: Illegal instructions before constructor call */
    public BonusRewardWithStatus() {
        int i = 0;
        this(i, i, 3, null);
    }

    public static /* synthetic */ BonusRewardWithStatus copy$default(BonusRewardWithStatus bonusRewardWithStatus, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bonusRewardWithStatus.idReward;
        }
        if ((i3 & 2) != 0) {
            i2 = bonusRewardWithStatus.stateReward;
        }
        return bonusRewardWithStatus.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getIdReward() {
        return this.idReward;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStateReward() {
        return this.stateReward;
    }

    @NotNull
    public final BonusRewardWithStatus copy(int idReward, int stateReward) {
        return new BonusRewardWithStatus(idReward, stateReward);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BonusRewardWithStatus)) {
            return false;
        }
        BonusRewardWithStatus bonusRewardWithStatus = (BonusRewardWithStatus) other;
        return this.idReward == bonusRewardWithStatus.idReward && this.stateReward == bonusRewardWithStatus.stateReward;
    }

    public int hashCode() {
        return (Integer.hashCode(this.idReward) * 31) + Integer.hashCode(this.stateReward);
    }

    @NotNull
    public String toString() {
        return "BonusRewardWithStatus(idReward=" + this.idReward + ", stateReward=" + this.stateReward + ")";
    }

    public BonusRewardWithStatus(int i, int i2) {
        this.idReward = i;
        this.stateReward = i2;
    }

    public /* synthetic */ BonusRewardWithStatus(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2);
    }

    public final int getIdReward() {
        return this.idReward;
    }

    public final int getStateReward() {
        return this.stateReward;
    }
}

