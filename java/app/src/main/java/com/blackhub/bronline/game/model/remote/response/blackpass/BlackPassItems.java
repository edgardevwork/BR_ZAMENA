package com.blackhub.bronline.game.model.remote.response.blackpass;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BlackPassItems.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class BlackPassItems {
    public static final int $stable = 8;

    @SerializedName("Properties")
    @Nullable
    public List<BlackPassProperties> bpProperties;

    @SerializedName("DeluxeRewards")
    @Nullable
    public List<LevelsInfo> deluxeRewards;

    @SerializedName("PremiumLevel")
    @Nullable
    public ArrayList<LevelsInfo> premiumLevel;

    @SerializedName("StandartLevel")
    @Nullable
    public ArrayList<LevelsInfo> standardLevel;

    @SerializedName("Tasks")
    @Nullable
    public ArrayList<TasksInfo> tasks;

    public BlackPassItems() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ BlackPassItems copy$default(BlackPassItems blackPassItems, ArrayList arrayList, ArrayList arrayList2, List list, ArrayList arrayList3, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = blackPassItems.standardLevel;
        }
        if ((i & 2) != 0) {
            arrayList2 = blackPassItems.premiumLevel;
        }
        ArrayList arrayList4 = arrayList2;
        if ((i & 4) != 0) {
            list = blackPassItems.deluxeRewards;
        }
        List list3 = list;
        if ((i & 8) != 0) {
            arrayList3 = blackPassItems.tasks;
        }
        ArrayList arrayList5 = arrayList3;
        if ((i & 16) != 0) {
            list2 = blackPassItems.bpProperties;
        }
        return blackPassItems.copy(arrayList, arrayList4, list3, arrayList5, list2);
    }

    @Nullable
    public final ArrayList<LevelsInfo> component1() {
        return this.standardLevel;
    }

    @Nullable
    public final ArrayList<LevelsInfo> component2() {
        return this.premiumLevel;
    }

    @Nullable
    public final List<LevelsInfo> component3() {
        return this.deluxeRewards;
    }

    @Nullable
    public final ArrayList<TasksInfo> component4() {
        return this.tasks;
    }

    @Nullable
    public final List<BlackPassProperties> component5() {
        return this.bpProperties;
    }

    @NotNull
    public final BlackPassItems copy(@Nullable ArrayList<LevelsInfo> standardLevel, @Nullable ArrayList<LevelsInfo> premiumLevel, @Nullable List<LevelsInfo> deluxeRewards, @Nullable ArrayList<TasksInfo> tasks, @Nullable List<BlackPassProperties> bpProperties) {
        return new BlackPassItems(standardLevel, premiumLevel, deluxeRewards, tasks, bpProperties);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlackPassItems)) {
            return false;
        }
        BlackPassItems blackPassItems = (BlackPassItems) other;
        return Intrinsics.areEqual(this.standardLevel, blackPassItems.standardLevel) && Intrinsics.areEqual(this.premiumLevel, blackPassItems.premiumLevel) && Intrinsics.areEqual(this.deluxeRewards, blackPassItems.deluxeRewards) && Intrinsics.areEqual(this.tasks, blackPassItems.tasks) && Intrinsics.areEqual(this.bpProperties, blackPassItems.bpProperties);
    }

    public int hashCode() {
        ArrayList<LevelsInfo> arrayList = this.standardLevel;
        int iHashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        ArrayList<LevelsInfo> arrayList2 = this.premiumLevel;
        int iHashCode2 = (iHashCode + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        List<LevelsInfo> list = this.deluxeRewards;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        ArrayList<TasksInfo> arrayList3 = this.tasks;
        int iHashCode4 = (iHashCode3 + (arrayList3 == null ? 0 : arrayList3.hashCode())) * 31;
        List<BlackPassProperties> list2 = this.bpProperties;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BlackPassItems(standardLevel=" + this.standardLevel + ", premiumLevel=" + this.premiumLevel + ", deluxeRewards=" + this.deluxeRewards + ", tasks=" + this.tasks + ", bpProperties=" + this.bpProperties + ")";
    }

    public BlackPassItems(@Nullable ArrayList<LevelsInfo> arrayList, @Nullable ArrayList<LevelsInfo> arrayList2, @Nullable List<LevelsInfo> list, @Nullable ArrayList<TasksInfo> arrayList3, @Nullable List<BlackPassProperties> list2) {
        this.standardLevel = arrayList;
        this.premiumLevel = arrayList2;
        this.deluxeRewards = list;
        this.tasks = arrayList3;
        this.bpProperties = list2;
    }

    public /* synthetic */ BlackPassItems(ArrayList arrayList, ArrayList arrayList2, List list, ArrayList arrayList3, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : arrayList, (i & 2) != 0 ? null : arrayList2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : arrayList3, (i & 16) != 0 ? null : list2);
    }

    @Nullable
    public final ArrayList<LevelsInfo> getStandardLevel() {
        return this.standardLevel;
    }

    public final void setStandardLevel(@Nullable ArrayList<LevelsInfo> arrayList) {
        this.standardLevel = arrayList;
    }

    @Nullable
    public final ArrayList<LevelsInfo> getPremiumLevel() {
        return this.premiumLevel;
    }

    public final void setPremiumLevel(@Nullable ArrayList<LevelsInfo> arrayList) {
        this.premiumLevel = arrayList;
    }

    @Nullable
    public final List<LevelsInfo> getDeluxeRewards() {
        return this.deluxeRewards;
    }

    public final void setDeluxeRewards(@Nullable List<LevelsInfo> list) {
        this.deluxeRewards = list;
    }

    @Nullable
    public final ArrayList<TasksInfo> getTasks() {
        return this.tasks;
    }

    public final void setTasks(@Nullable ArrayList<TasksInfo> arrayList) {
        this.tasks = arrayList;
    }

    @Nullable
    public final List<BlackPassProperties> getBpProperties() {
        return this.bpProperties;
    }

    public final void setBpProperties(@Nullable List<BlackPassProperties> list) {
        this.bpProperties = list;
    }
}

