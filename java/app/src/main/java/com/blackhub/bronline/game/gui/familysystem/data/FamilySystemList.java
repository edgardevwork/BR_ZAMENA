package com.blackhub.bronline.game.gui.familysystem.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NetworkFamilySystem.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class FamilySystemList {
    public static final int $stable = 8;

    @SerializedName("Colors")
    @NotNull
    public final List<FamilySystemColorsObj> colorsList;

    @SerializedName("RewardTop")
    @NotNull
    public final List<FamilySystemRewardTopObj> rewardTopList;

    @SerializedName("Shop")
    @NotNull
    public final List<FamilySystemShopObj> shopList;

    @SerializedName("Tasks")
    @NotNull
    public final List<FamilySystemTasksObj> tasksList;

    @SerializedName("Upgrade")
    @NotNull
    public final List<FamilySystemUpgradeObj> upgradeList;

    public FamilySystemList() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ FamilySystemList copy$default(FamilySystemList familySystemList, List list, List list2, List list3, List list4, List list5, int i, Object obj) {
        if ((i & 1) != 0) {
            list = familySystemList.upgradeList;
        }
        if ((i & 2) != 0) {
            list2 = familySystemList.rewardTopList;
        }
        List list6 = list2;
        if ((i & 4) != 0) {
            list3 = familySystemList.shopList;
        }
        List list7 = list3;
        if ((i & 8) != 0) {
            list4 = familySystemList.tasksList;
        }
        List list8 = list4;
        if ((i & 16) != 0) {
            list5 = familySystemList.colorsList;
        }
        return familySystemList.copy(list, list6, list7, list8, list5);
    }

    @NotNull
    public final List<FamilySystemUpgradeObj> component1() {
        return this.upgradeList;
    }

    @NotNull
    public final List<FamilySystemRewardTopObj> component2() {
        return this.rewardTopList;
    }

    @NotNull
    public final List<FamilySystemShopObj> component3() {
        return this.shopList;
    }

    @NotNull
    public final List<FamilySystemTasksObj> component4() {
        return this.tasksList;
    }

    @NotNull
    public final List<FamilySystemColorsObj> component5() {
        return this.colorsList;
    }

    @NotNull
    public final FamilySystemList copy(@NotNull List<FamilySystemUpgradeObj> upgradeList, @NotNull List<FamilySystemRewardTopObj> rewardTopList, @NotNull List<FamilySystemShopObj> shopList, @NotNull List<FamilySystemTasksObj> tasksList, @NotNull List<FamilySystemColorsObj> colorsList) {
        Intrinsics.checkNotNullParameter(upgradeList, "upgradeList");
        Intrinsics.checkNotNullParameter(rewardTopList, "rewardTopList");
        Intrinsics.checkNotNullParameter(shopList, "shopList");
        Intrinsics.checkNotNullParameter(tasksList, "tasksList");
        Intrinsics.checkNotNullParameter(colorsList, "colorsList");
        return new FamilySystemList(upgradeList, rewardTopList, shopList, tasksList, colorsList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FamilySystemList)) {
            return false;
        }
        FamilySystemList familySystemList = (FamilySystemList) other;
        return Intrinsics.areEqual(this.upgradeList, familySystemList.upgradeList) && Intrinsics.areEqual(this.rewardTopList, familySystemList.rewardTopList) && Intrinsics.areEqual(this.shopList, familySystemList.shopList) && Intrinsics.areEqual(this.tasksList, familySystemList.tasksList) && Intrinsics.areEqual(this.colorsList, familySystemList.colorsList);
    }

    public int hashCode() {
        return (((((((this.upgradeList.hashCode() * 31) + this.rewardTopList.hashCode()) * 31) + this.shopList.hashCode()) * 31) + this.tasksList.hashCode()) * 31) + this.colorsList.hashCode();
    }

    @NotNull
    public String toString() {
        return "FamilySystemList(upgradeList=" + this.upgradeList + ", rewardTopList=" + this.rewardTopList + ", shopList=" + this.shopList + ", tasksList=" + this.tasksList + ", colorsList=" + this.colorsList + ")";
    }

    public FamilySystemList(@NotNull List<FamilySystemUpgradeObj> upgradeList, @NotNull List<FamilySystemRewardTopObj> rewardTopList, @NotNull List<FamilySystemShopObj> shopList, @NotNull List<FamilySystemTasksObj> tasksList, @NotNull List<FamilySystemColorsObj> colorsList) {
        Intrinsics.checkNotNullParameter(upgradeList, "upgradeList");
        Intrinsics.checkNotNullParameter(rewardTopList, "rewardTopList");
        Intrinsics.checkNotNullParameter(shopList, "shopList");
        Intrinsics.checkNotNullParameter(tasksList, "tasksList");
        Intrinsics.checkNotNullParameter(colorsList, "colorsList");
        this.upgradeList = upgradeList;
        this.rewardTopList = rewardTopList;
        this.shopList = shopList;
        this.tasksList = tasksList;
        this.colorsList = colorsList;
    }

    public /* synthetic */ FamilySystemList(List list, List list2, List list3, List list4, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? new ArrayList() : list2, (i & 4) != 0 ? new ArrayList() : list3, (i & 8) != 0 ? new ArrayList() : list4, (i & 16) != 0 ? new ArrayList() : list5);
    }

    @NotNull
    public final List<FamilySystemUpgradeObj> getUpgradeList() {
        return this.upgradeList;
    }

    @NotNull
    public final List<FamilySystemRewardTopObj> getRewardTopList() {
        return this.rewardTopList;
    }

    @NotNull
    public final List<FamilySystemShopObj> getShopList() {
        return this.shopList;
    }

    @NotNull
    public final List<FamilySystemTasksObj> getTasksList() {
        return this.tasksList;
    }

    @NotNull
    public final List<FamilySystemColorsObj> getColorsList() {
        return this.colorsList;
    }
}

