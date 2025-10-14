package com.blackhub.bronline.game.core.utils.draganddrop.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.utils.draganddrop.enums.CurrentTargetArea;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DataTargetArea.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final /* data */ class DataTargetArea {
    public static final int $stable = 8;

    @Nullable
    public final String busyData;
    public final float centerError;

    @NotNull
    public final CurrentTargetArea currentTargetArea;

    @NotNull
    public final List<DataDragView> dataDragViewList;

    @Nullable
    public final String innerData;

    @NotNull
    public final PointFloat pointCenter;

    @Nullable
    public final Float rotate;

    public static /* synthetic */ DataTargetArea copy$default(DataTargetArea dataTargetArea, CurrentTargetArea currentTargetArea, String str, String str2, PointFloat pointFloat, float f, Float f2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            currentTargetArea = dataTargetArea.currentTargetArea;
        }
        if ((i & 2) != 0) {
            str = dataTargetArea.innerData;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = dataTargetArea.busyData;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            pointFloat = dataTargetArea.pointCenter;
        }
        PointFloat pointFloat2 = pointFloat;
        if ((i & 16) != 0) {
            f = dataTargetArea.centerError;
        }
        float f3 = f;
        if ((i & 32) != 0) {
            f2 = dataTargetArea.rotate;
        }
        Float f4 = f2;
        if ((i & 64) != 0) {
            list = dataTargetArea.dataDragViewList;
        }
        return dataTargetArea.copy(currentTargetArea, str3, str4, pointFloat2, f3, f4, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CurrentTargetArea getCurrentTargetArea() {
        return this.currentTargetArea;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getInnerData() {
        return this.innerData;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getBusyData() {
        return this.busyData;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final PointFloat getPointCenter() {
        return this.pointCenter;
    }

    /* renamed from: component5, reason: from getter */
    public final float getCenterError() {
        return this.centerError;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Float getRotate() {
        return this.rotate;
    }

    @NotNull
    public final List<DataDragView> component7() {
        return this.dataDragViewList;
    }

    @NotNull
    public final DataTargetArea copy(@NotNull CurrentTargetArea currentTargetArea, @Nullable String innerData, @Nullable String busyData, @NotNull PointFloat pointCenter, float centerError, @Nullable Float rotate, @NotNull List<DataDragView> dataDragViewList) {
        Intrinsics.checkNotNullParameter(currentTargetArea, "currentTargetArea");
        Intrinsics.checkNotNullParameter(pointCenter, "pointCenter");
        Intrinsics.checkNotNullParameter(dataDragViewList, "dataDragViewList");
        return new DataTargetArea(currentTargetArea, innerData, busyData, pointCenter, centerError, rotate, dataDragViewList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataTargetArea)) {
            return false;
        }
        DataTargetArea dataTargetArea = (DataTargetArea) other;
        return this.currentTargetArea == dataTargetArea.currentTargetArea && Intrinsics.areEqual(this.innerData, dataTargetArea.innerData) && Intrinsics.areEqual(this.busyData, dataTargetArea.busyData) && Intrinsics.areEqual(this.pointCenter, dataTargetArea.pointCenter) && Float.compare(this.centerError, dataTargetArea.centerError) == 0 && Intrinsics.areEqual((Object) this.rotate, (Object) dataTargetArea.rotate) && Intrinsics.areEqual(this.dataDragViewList, dataTargetArea.dataDragViewList);
    }

    public int hashCode() {
        int iHashCode = this.currentTargetArea.hashCode() * 31;
        String str = this.innerData;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.busyData;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.pointCenter.hashCode()) * 31) + Float.hashCode(this.centerError)) * 31;
        Float f = this.rotate;
        return ((iHashCode3 + (f != null ? f.hashCode() : 0)) * 31) + this.dataDragViewList.hashCode();
    }

    @NotNull
    public String toString() {
        return "DataTargetArea(currentTargetArea=" + this.currentTargetArea + ", innerData=" + this.innerData + ", busyData=" + this.busyData + ", pointCenter=" + this.pointCenter + ", centerError=" + this.centerError + ", rotate=" + this.rotate + ", dataDragViewList=" + this.dataDragViewList + ")";
    }

    public DataTargetArea(@NotNull CurrentTargetArea currentTargetArea, @Nullable String str, @Nullable String str2, @NotNull PointFloat pointCenter, float f, @Nullable Float f2, @NotNull List<DataDragView> dataDragViewList) {
        Intrinsics.checkNotNullParameter(currentTargetArea, "currentTargetArea");
        Intrinsics.checkNotNullParameter(pointCenter, "pointCenter");
        Intrinsics.checkNotNullParameter(dataDragViewList, "dataDragViewList");
        this.currentTargetArea = currentTargetArea;
        this.innerData = str;
        this.busyData = str2;
        this.pointCenter = pointCenter;
        this.centerError = f;
        this.rotate = f2;
        this.dataDragViewList = dataDragViewList;
    }

    @NotNull
    public final CurrentTargetArea getCurrentTargetArea() {
        return this.currentTargetArea;
    }

    @Nullable
    public final String getInnerData() {
        return this.innerData;
    }

    @Nullable
    public final String getBusyData() {
        return this.busyData;
    }

    @NotNull
    public final PointFloat getPointCenter() {
        return this.pointCenter;
    }

    public final float getCenterError() {
        return this.centerError;
    }

    @Nullable
    public final Float getRotate() {
        return this.rotate;
    }

    public /* synthetic */ DataTargetArea(CurrentTargetArea currentTargetArea, String str, String str2, PointFloat pointFloat, float f, Float f2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(currentTargetArea, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, pointFloat, (i & 16) != 0 ? 80.0f : f, (i & 32) != 0 ? null : f2, (i & 64) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }

    @NotNull
    public final List<DataDragView> getDataDragViewList() {
        return this.dataDragViewList;
    }
}

