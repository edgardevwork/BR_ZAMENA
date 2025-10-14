package com.blackhub.bronline.game.gui.cases.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BonusRewardWithStatus.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/cases/model/BonusRewardWithStatus;", "", "idReward", "", "stateReward", "(II)V", "getIdReward", "()I", "getStateReward", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
