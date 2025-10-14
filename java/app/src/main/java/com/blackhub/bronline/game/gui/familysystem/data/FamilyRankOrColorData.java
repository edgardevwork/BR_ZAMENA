package com.blackhub.bronline.game.gui.familysystem.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FamilyRankOrColorData.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class FamilyRankOrColorData {
    public static final int $stable = 8;

    @Nullable
    public Integer currentStatus;

    @Nullable
    public Boolean ifStartedColor;

    @Nullable
    public Boolean isClicked;

    @NotNull
    public String statusName;
    public final int statusType;

    @Nullable
    public final String thisColor;

    public static /* synthetic */ FamilyRankOrColorData copy$default(FamilyRankOrColorData familyRankOrColorData, int i, String str, Integer num, String str2, Boolean bool, Boolean bool2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = familyRankOrColorData.statusType;
        }
        if ((i2 & 2) != 0) {
            str = familyRankOrColorData.statusName;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            num = familyRankOrColorData.currentStatus;
        }
        Integer num2 = num;
        if ((i2 & 8) != 0) {
            str2 = familyRankOrColorData.thisColor;
        }
        String str4 = str2;
        if ((i2 & 16) != 0) {
            bool = familyRankOrColorData.ifStartedColor;
        }
        Boolean bool3 = bool;
        if ((i2 & 32) != 0) {
            bool2 = familyRankOrColorData.isClicked;
        }
        return familyRankOrColorData.copy(i, str3, num2, str4, bool3, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getStatusType() {
        return this.statusType;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getStatusName() {
        return this.statusName;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getCurrentStatus() {
        return this.currentStatus;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getThisColor() {
        return this.thisColor;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Boolean getIfStartedColor() {
        return this.ifStartedColor;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Boolean getIsClicked() {
        return this.isClicked;
    }

    @NotNull
    public final FamilyRankOrColorData copy(int statusType, @NotNull String statusName, @Nullable Integer currentStatus, @Nullable String thisColor, @Nullable Boolean ifStartedColor, @Nullable Boolean isClicked) {
        Intrinsics.checkNotNullParameter(statusName, "statusName");
        return new FamilyRankOrColorData(statusType, statusName, currentStatus, thisColor, ifStartedColor, isClicked);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FamilyRankOrColorData)) {
            return false;
        }
        FamilyRankOrColorData familyRankOrColorData = (FamilyRankOrColorData) other;
        return this.statusType == familyRankOrColorData.statusType && Intrinsics.areEqual(this.statusName, familyRankOrColorData.statusName) && Intrinsics.areEqual(this.currentStatus, familyRankOrColorData.currentStatus) && Intrinsics.areEqual(this.thisColor, familyRankOrColorData.thisColor) && Intrinsics.areEqual(this.ifStartedColor, familyRankOrColorData.ifStartedColor) && Intrinsics.areEqual(this.isClicked, familyRankOrColorData.isClicked);
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.statusType) * 31) + this.statusName.hashCode()) * 31;
        Integer num = this.currentStatus;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.thisColor;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.ifStartedColor;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isClicked;
        return iHashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FamilyRankOrColorData(statusType=" + this.statusType + ", statusName=" + this.statusName + ", currentStatus=" + this.currentStatus + ", thisColor=" + this.thisColor + ", ifStartedColor=" + this.ifStartedColor + ", isClicked=" + this.isClicked + ")";
    }

    public FamilyRankOrColorData(int i, @NotNull String statusName, @Nullable Integer num, @Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2) {
        Intrinsics.checkNotNullParameter(statusName, "statusName");
        this.statusType = i;
        this.statusName = statusName;
        this.currentStatus = num;
        this.thisColor = str;
        this.ifStartedColor = bool;
        this.isClicked = bool2;
    }

    public final int getStatusType() {
        return this.statusType;
    }

    @NotNull
    public final String getStatusName() {
        return this.statusName;
    }

    public final void setStatusName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.statusName = str;
    }

    @Nullable
    public final Integer getCurrentStatus() {
        return this.currentStatus;
    }

    public final void setCurrentStatus(@Nullable Integer num) {
        this.currentStatus = num;
    }

    @Nullable
    public final String getThisColor() {
        return this.thisColor;
    }

    @Nullable
    public final Boolean getIfStartedColor() {
        return this.ifStartedColor;
    }

    public final void setIfStartedColor(@Nullable Boolean bool) {
        this.ifStartedColor = bool;
    }

    @Nullable
    public final Boolean isClicked() {
        return this.isClicked;
    }

    public final void setClicked(@Nullable Boolean bool) {
        this.isClicked = bool;
    }
}

