package com.blackhub.bronline.game.gui.familysystem.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NetworkFamilySystem.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class FamilySystemRewardTopObj {
    public static final int $stable = 0;

    @SerializedName("accessories_gameId")
    public final int accessoriesGameId;

    @SerializedName("accessories_object_id")
    public final int accessoriesObjectId;

    @SerializedName("accessories_time")
    public final int accessoriesTime;

    @SerializedName("additional_car")
    public final int additionalCar;

    @SerializedName("money_reward")
    public final int moneyReward;

    @SerializedName("place")
    public final int place;

    @SerializedName("score_reward")
    public final int scoreReward;

    @SerializedName("token_reward")
    public final int tokenReward;

    /* renamed from: component1, reason: from getter */
    public final int getPlace() {
        return this.place;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAccessoriesObjectId() {
        return this.accessoriesObjectId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getAccessoriesTime() {
        return this.accessoriesTime;
    }

    /* renamed from: component4, reason: from getter */
    public final int getAccessoriesGameId() {
        return this.accessoriesGameId;
    }

    /* renamed from: component5, reason: from getter */
    public final int getAdditionalCar() {
        return this.additionalCar;
    }

    /* renamed from: component6, reason: from getter */
    public final int getMoneyReward() {
        return this.moneyReward;
    }

    /* renamed from: component7, reason: from getter */
    public final int getScoreReward() {
        return this.scoreReward;
    }

    /* renamed from: component8, reason: from getter */
    public final int getTokenReward() {
        return this.tokenReward;
    }

    @NotNull
    public final FamilySystemRewardTopObj copy(int place, int accessoriesObjectId, int accessoriesTime, int accessoriesGameId, int additionalCar, int moneyReward, int scoreReward, int tokenReward) {
        return new FamilySystemRewardTopObj(place, accessoriesObjectId, accessoriesTime, accessoriesGameId, additionalCar, moneyReward, scoreReward, tokenReward);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FamilySystemRewardTopObj)) {
            return false;
        }
        FamilySystemRewardTopObj familySystemRewardTopObj = (FamilySystemRewardTopObj) other;
        return this.place == familySystemRewardTopObj.place && this.accessoriesObjectId == familySystemRewardTopObj.accessoriesObjectId && this.accessoriesTime == familySystemRewardTopObj.accessoriesTime && this.accessoriesGameId == familySystemRewardTopObj.accessoriesGameId && this.additionalCar == familySystemRewardTopObj.additionalCar && this.moneyReward == familySystemRewardTopObj.moneyReward && this.scoreReward == familySystemRewardTopObj.scoreReward && this.tokenReward == familySystemRewardTopObj.tokenReward;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.place) * 31) + Integer.hashCode(this.accessoriesObjectId)) * 31) + Integer.hashCode(this.accessoriesTime)) * 31) + Integer.hashCode(this.accessoriesGameId)) * 31) + Integer.hashCode(this.additionalCar)) * 31) + Integer.hashCode(this.moneyReward)) * 31) + Integer.hashCode(this.scoreReward)) * 31) + Integer.hashCode(this.tokenReward);
    }

    @NotNull
    public String toString() {
        return "FamilySystemRewardTopObj(place=" + this.place + ", accessoriesObjectId=" + this.accessoriesObjectId + ", accessoriesTime=" + this.accessoriesTime + ", accessoriesGameId=" + this.accessoriesGameId + ", additionalCar=" + this.additionalCar + ", moneyReward=" + this.moneyReward + ", scoreReward=" + this.scoreReward + ", tokenReward=" + this.tokenReward + ")";
    }

    public FamilySystemRewardTopObj(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.place = i;
        this.accessoriesObjectId = i2;
        this.accessoriesTime = i3;
        this.accessoriesGameId = i4;
        this.additionalCar = i5;
        this.moneyReward = i6;
        this.scoreReward = i7;
        this.tokenReward = i8;
    }

    public final int getPlace() {
        return this.place;
    }

    public final int getAccessoriesObjectId() {
        return this.accessoriesObjectId;
    }

    public final int getAccessoriesTime() {
        return this.accessoriesTime;
    }

    public final int getAccessoriesGameId() {
        return this.accessoriesGameId;
    }

    public final int getAdditionalCar() {
        return this.additionalCar;
    }

    public final int getMoneyReward() {
        return this.moneyReward;
    }

    public final int getScoreReward() {
        return this.scoreReward;
    }

    public final int getTokenReward() {
        return this.tokenReward;
    }
}

