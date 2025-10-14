package com.blackhub.bronline.game.gui.familysystem.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FamilyUpgradeData.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class FamilyUpgradeData {
    public static final int $stable = 8;
    public boolean isClicked;
    public int upgradeCurrentLevel;

    @NotNull
    public final String upgradeDescription;
    public final int upgradeId;
    public int upgradeMaxLevel;

    @NotNull
    public final String upgradeName;

    public static /* synthetic */ FamilyUpgradeData copy$default(FamilyUpgradeData familyUpgradeData, int i, String str, String str2, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = familyUpgradeData.upgradeId;
        }
        if ((i4 & 2) != 0) {
            str = familyUpgradeData.upgradeName;
        }
        String str3 = str;
        if ((i4 & 4) != 0) {
            str2 = familyUpgradeData.upgradeDescription;
        }
        String str4 = str2;
        if ((i4 & 8) != 0) {
            i2 = familyUpgradeData.upgradeCurrentLevel;
        }
        int i5 = i2;
        if ((i4 & 16) != 0) {
            i3 = familyUpgradeData.upgradeMaxLevel;
        }
        int i6 = i3;
        if ((i4 & 32) != 0) {
            z = familyUpgradeData.isClicked;
        }
        return familyUpgradeData.copy(i, str3, str4, i5, i6, z);
    }

    /* renamed from: component1, reason: from getter */
    public final int getUpgradeId() {
        return this.upgradeId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getUpgradeName() {
        return this.upgradeName;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getUpgradeDescription() {
        return this.upgradeDescription;
    }

    /* renamed from: component4, reason: from getter */
    public final int getUpgradeCurrentLevel() {
        return this.upgradeCurrentLevel;
    }

    /* renamed from: component5, reason: from getter */
    public final int getUpgradeMaxLevel() {
        return this.upgradeMaxLevel;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsClicked() {
        return this.isClicked;
    }

    @NotNull
    public final FamilyUpgradeData copy(int upgradeId, @NotNull String upgradeName, @NotNull String upgradeDescription, int upgradeCurrentLevel, int upgradeMaxLevel, boolean isClicked) {
        Intrinsics.checkNotNullParameter(upgradeName, "upgradeName");
        Intrinsics.checkNotNullParameter(upgradeDescription, "upgradeDescription");
        return new FamilyUpgradeData(upgradeId, upgradeName, upgradeDescription, upgradeCurrentLevel, upgradeMaxLevel, isClicked);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FamilyUpgradeData)) {
            return false;
        }
        FamilyUpgradeData familyUpgradeData = (FamilyUpgradeData) other;
        return this.upgradeId == familyUpgradeData.upgradeId && Intrinsics.areEqual(this.upgradeName, familyUpgradeData.upgradeName) && Intrinsics.areEqual(this.upgradeDescription, familyUpgradeData.upgradeDescription) && this.upgradeCurrentLevel == familyUpgradeData.upgradeCurrentLevel && this.upgradeMaxLevel == familyUpgradeData.upgradeMaxLevel && this.isClicked == familyUpgradeData.isClicked;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.upgradeId) * 31) + this.upgradeName.hashCode()) * 31) + this.upgradeDescription.hashCode()) * 31) + Integer.hashCode(this.upgradeCurrentLevel)) * 31) + Integer.hashCode(this.upgradeMaxLevel)) * 31) + Boolean.hashCode(this.isClicked);
    }

    @NotNull
    public String toString() {
        return "FamilyUpgradeData(upgradeId=" + this.upgradeId + ", upgradeName=" + this.upgradeName + ", upgradeDescription=" + this.upgradeDescription + ", upgradeCurrentLevel=" + this.upgradeCurrentLevel + ", upgradeMaxLevel=" + this.upgradeMaxLevel + ", isClicked=" + this.isClicked + ")";
    }

    public FamilyUpgradeData(int i, @NotNull String upgradeName, @NotNull String upgradeDescription, int i2, int i3, boolean z) {
        Intrinsics.checkNotNullParameter(upgradeName, "upgradeName");
        Intrinsics.checkNotNullParameter(upgradeDescription, "upgradeDescription");
        this.upgradeId = i;
        this.upgradeName = upgradeName;
        this.upgradeDescription = upgradeDescription;
        this.upgradeCurrentLevel = i2;
        this.upgradeMaxLevel = i3;
        this.isClicked = z;
    }

    public /* synthetic */ FamilyUpgradeData(int i, String str, String str2, int i2, int i3, boolean z, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, i2, i3, (i4 & 32) != 0 ? false : z);
    }

    public final int getUpgradeId() {
        return this.upgradeId;
    }

    @NotNull
    public final String getUpgradeName() {
        return this.upgradeName;
    }

    @NotNull
    public final String getUpgradeDescription() {
        return this.upgradeDescription;
    }

    public final int getUpgradeCurrentLevel() {
        return this.upgradeCurrentLevel;
    }

    public final void setUpgradeCurrentLevel(int i) {
        this.upgradeCurrentLevel = i;
    }

    public final int getUpgradeMaxLevel() {
        return this.upgradeMaxLevel;
    }

    public final void setUpgradeMaxLevel(int i) {
        this.upgradeMaxLevel = i;
    }

    public final boolean isClicked() {
        return this.isClicked;
    }

    public final void setClicked(boolean z) {
        this.isClicked = z;
    }
}

