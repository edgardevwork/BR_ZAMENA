package com.blackhub.bronline.game.gui.fractions.data;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FractionsProgressStaffItem.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J3\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/fractions/data/FractionsProgressStaffItem;", "", "fractionId", "", "rankStatus", "", "rankProgress", "(ILjava/util/List;Ljava/util/List;)V", "getFractionId", "()I", "getRankProgress", "()Ljava/util/List;", "getRankStatus", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FractionsProgressStaffItem {
    public static final int $stable = 8;
    public final int fractionId;

    @NotNull
    public final List<Integer> rankProgress;

    @NotNull
    public final List<Integer> rankStatus;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FractionsProgressStaffItem copy$default(FractionsProgressStaffItem fractionsProgressStaffItem, int i, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = fractionsProgressStaffItem.fractionId;
        }
        if ((i2 & 2) != 0) {
            list = fractionsProgressStaffItem.rankStatus;
        }
        if ((i2 & 4) != 0) {
            list2 = fractionsProgressStaffItem.rankProgress;
        }
        return fractionsProgressStaffItem.copy(i, list, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getFractionId() {
        return this.fractionId;
    }

    @NotNull
    public final List<Integer> component2() {
        return this.rankStatus;
    }

    @NotNull
    public final List<Integer> component3() {
        return this.rankProgress;
    }

    @NotNull
    public final FractionsProgressStaffItem copy(int fractionId, @NotNull List<Integer> rankStatus, @NotNull List<Integer> rankProgress) {
        Intrinsics.checkNotNullParameter(rankStatus, "rankStatus");
        Intrinsics.checkNotNullParameter(rankProgress, "rankProgress");
        return new FractionsProgressStaffItem(fractionId, rankStatus, rankProgress);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FractionsProgressStaffItem)) {
            return false;
        }
        FractionsProgressStaffItem fractionsProgressStaffItem = (FractionsProgressStaffItem) other;
        return this.fractionId == fractionsProgressStaffItem.fractionId && Intrinsics.areEqual(this.rankStatus, fractionsProgressStaffItem.rankStatus) && Intrinsics.areEqual(this.rankProgress, fractionsProgressStaffItem.rankProgress);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.fractionId) * 31) + this.rankStatus.hashCode()) * 31) + this.rankProgress.hashCode();
    }

    @NotNull
    public String toString() {
        return "FractionsProgressStaffItem(fractionId=" + this.fractionId + ", rankStatus=" + this.rankStatus + ", rankProgress=" + this.rankProgress + ")";
    }

    public FractionsProgressStaffItem(int i, @NotNull List<Integer> rankStatus, @NotNull List<Integer> rankProgress) {
        Intrinsics.checkNotNullParameter(rankStatus, "rankStatus");
        Intrinsics.checkNotNullParameter(rankProgress, "rankProgress");
        this.fractionId = i;
        this.rankStatus = rankStatus;
        this.rankProgress = rankProgress;
    }

    public final int getFractionId() {
        return this.fractionId;
    }

    @NotNull
    public final List<Integer> getRankStatus() {
        return this.rankStatus;
    }

    @NotNull
    public final List<Integer> getRankProgress() {
        return this.rankProgress;
    }
}
