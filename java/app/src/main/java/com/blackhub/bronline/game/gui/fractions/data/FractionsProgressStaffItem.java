package com.blackhub.bronline.game.gui.fractions.data;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FractionsProgressStaffItem.kt */
@StabilityInferred(parameters = 0)
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

