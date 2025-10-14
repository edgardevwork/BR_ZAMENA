package com.blackhub.bronline.game.gui.smieditor.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SmiList.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\u0002\u0010\u000bJ\u0019\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\u0019\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\u0019\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\u0019\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\u0019\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\u0019\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J¥\u0001\u0010 \u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R.\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR.\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR.\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR.\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR.\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR.\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000f¨\u0006("}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/smieditor/data/SmiList;", "", "lowClass", "Ljava/util/ArrayList;", "Lcom/blackhub/bronline/game/gui/smieditor/data/SmiInfo;", "Lkotlin/collections/ArrayList;", "carMiddleClass", "carHighClass", "carMotoClass", "carUniqueClass", "accessoriesList", "(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "getAccessoriesList", "()Ljava/util/ArrayList;", "setAccessoriesList", "(Ljava/util/ArrayList;)V", "getCarHighClass", "setCarHighClass", "getCarMiddleClass", "setCarMiddleClass", "getCarMotoClass", "setCarMotoClass", "getCarUniqueClass", "setCarUniqueClass", "getLowClass", "setLowClass", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SmiList {
    public static final int $stable = 8;

    @SerializedName("accessories")
    @NotNull
    public ArrayList<SmiInfo> accessoriesList;

    @SerializedName("highClass")
    @NotNull
    public ArrayList<SmiInfo> carHighClass;

    @SerializedName("middleClass")
    @NotNull
    public ArrayList<SmiInfo> carMiddleClass;

    @SerializedName("motoClass")
    @NotNull
    public ArrayList<SmiInfo> carMotoClass;

    @SerializedName("uniqueClass")
    @NotNull
    public ArrayList<SmiInfo> carUniqueClass;

    @SerializedName("lowClass")
    @NotNull
    public ArrayList<SmiInfo> lowClass;

    public SmiList() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ SmiList copy$default(SmiList smiList, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = smiList.lowClass;
        }
        if ((i & 2) != 0) {
            arrayList2 = smiList.carMiddleClass;
        }
        ArrayList arrayList7 = arrayList2;
        if ((i & 4) != 0) {
            arrayList3 = smiList.carHighClass;
        }
        ArrayList arrayList8 = arrayList3;
        if ((i & 8) != 0) {
            arrayList4 = smiList.carMotoClass;
        }
        ArrayList arrayList9 = arrayList4;
        if ((i & 16) != 0) {
            arrayList5 = smiList.carUniqueClass;
        }
        ArrayList arrayList10 = arrayList5;
        if ((i & 32) != 0) {
            arrayList6 = smiList.accessoriesList;
        }
        return smiList.copy(arrayList, arrayList7, arrayList8, arrayList9, arrayList10, arrayList6);
    }

    @NotNull
    public final ArrayList<SmiInfo> component1() {
        return this.lowClass;
    }

    @NotNull
    public final ArrayList<SmiInfo> component2() {
        return this.carMiddleClass;
    }

    @NotNull
    public final ArrayList<SmiInfo> component3() {
        return this.carHighClass;
    }

    @NotNull
    public final ArrayList<SmiInfo> component4() {
        return this.carMotoClass;
    }

    @NotNull
    public final ArrayList<SmiInfo> component5() {
        return this.carUniqueClass;
    }

    @NotNull
    public final ArrayList<SmiInfo> component6() {
        return this.accessoriesList;
    }

    @NotNull
    public final SmiList copy(@NotNull ArrayList<SmiInfo> lowClass, @NotNull ArrayList<SmiInfo> carMiddleClass, @NotNull ArrayList<SmiInfo> carHighClass, @NotNull ArrayList<SmiInfo> carMotoClass, @NotNull ArrayList<SmiInfo> carUniqueClass, @NotNull ArrayList<SmiInfo> accessoriesList) {
        Intrinsics.checkNotNullParameter(lowClass, "lowClass");
        Intrinsics.checkNotNullParameter(carMiddleClass, "carMiddleClass");
        Intrinsics.checkNotNullParameter(carHighClass, "carHighClass");
        Intrinsics.checkNotNullParameter(carMotoClass, "carMotoClass");
        Intrinsics.checkNotNullParameter(carUniqueClass, "carUniqueClass");
        Intrinsics.checkNotNullParameter(accessoriesList, "accessoriesList");
        return new SmiList(lowClass, carMiddleClass, carHighClass, carMotoClass, carUniqueClass, accessoriesList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SmiList)) {
            return false;
        }
        SmiList smiList = (SmiList) other;
        return Intrinsics.areEqual(this.lowClass, smiList.lowClass) && Intrinsics.areEqual(this.carMiddleClass, smiList.carMiddleClass) && Intrinsics.areEqual(this.carHighClass, smiList.carHighClass) && Intrinsics.areEqual(this.carMotoClass, smiList.carMotoClass) && Intrinsics.areEqual(this.carUniqueClass, smiList.carUniqueClass) && Intrinsics.areEqual(this.accessoriesList, smiList.accessoriesList);
    }

    public int hashCode() {
        return (((((((((this.lowClass.hashCode() * 31) + this.carMiddleClass.hashCode()) * 31) + this.carHighClass.hashCode()) * 31) + this.carMotoClass.hashCode()) * 31) + this.carUniqueClass.hashCode()) * 31) + this.accessoriesList.hashCode();
    }

    @NotNull
    public String toString() {
        return "SmiList(lowClass=" + this.lowClass + ", carMiddleClass=" + this.carMiddleClass + ", carHighClass=" + this.carHighClass + ", carMotoClass=" + this.carMotoClass + ", carUniqueClass=" + this.carUniqueClass + ", accessoriesList=" + this.accessoriesList + ")";
    }

    public SmiList(@NotNull ArrayList<SmiInfo> lowClass, @NotNull ArrayList<SmiInfo> carMiddleClass, @NotNull ArrayList<SmiInfo> carHighClass, @NotNull ArrayList<SmiInfo> carMotoClass, @NotNull ArrayList<SmiInfo> carUniqueClass, @NotNull ArrayList<SmiInfo> accessoriesList) {
        Intrinsics.checkNotNullParameter(lowClass, "lowClass");
        Intrinsics.checkNotNullParameter(carMiddleClass, "carMiddleClass");
        Intrinsics.checkNotNullParameter(carHighClass, "carHighClass");
        Intrinsics.checkNotNullParameter(carMotoClass, "carMotoClass");
        Intrinsics.checkNotNullParameter(carUniqueClass, "carUniqueClass");
        Intrinsics.checkNotNullParameter(accessoriesList, "accessoriesList");
        this.lowClass = lowClass;
        this.carMiddleClass = carMiddleClass;
        this.carHighClass = carHighClass;
        this.carMotoClass = carMotoClass;
        this.carUniqueClass = carUniqueClass;
        this.accessoriesList = accessoriesList;
    }

    public /* synthetic */ SmiList(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : arrayList, (i & 2) != 0 ? new ArrayList() : arrayList2, (i & 4) != 0 ? new ArrayList() : arrayList3, (i & 8) != 0 ? new ArrayList() : arrayList4, (i & 16) != 0 ? new ArrayList() : arrayList5, (i & 32) != 0 ? new ArrayList() : arrayList6);
    }

    @NotNull
    public final ArrayList<SmiInfo> getLowClass() {
        return this.lowClass;
    }

    public final void setLowClass(@NotNull ArrayList<SmiInfo> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.lowClass = arrayList;
    }

    @NotNull
    public final ArrayList<SmiInfo> getCarMiddleClass() {
        return this.carMiddleClass;
    }

    public final void setCarMiddleClass(@NotNull ArrayList<SmiInfo> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.carMiddleClass = arrayList;
    }

    @NotNull
    public final ArrayList<SmiInfo> getCarHighClass() {
        return this.carHighClass;
    }

    public final void setCarHighClass(@NotNull ArrayList<SmiInfo> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.carHighClass = arrayList;
    }

    @NotNull
    public final ArrayList<SmiInfo> getCarMotoClass() {
        return this.carMotoClass;
    }

    public final void setCarMotoClass(@NotNull ArrayList<SmiInfo> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.carMotoClass = arrayList;
    }

    @NotNull
    public final ArrayList<SmiInfo> getCarUniqueClass() {
        return this.carUniqueClass;
    }

    public final void setCarUniqueClass(@NotNull ArrayList<SmiInfo> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.carUniqueClass = arrayList;
    }

    @NotNull
    public final ArrayList<SmiInfo> getAccessoriesList() {
        return this.accessoriesList;
    }

    public final void setAccessoriesList(@NotNull ArrayList<SmiInfo> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.accessoriesList = arrayList;
    }
}
