package com.blackhub.bronline.game.core.utils.draganddrop.model;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.utils.draganddrop.enums.CurrentDraggableItem;
import com.blackhub.bronline.game.core.utils.draganddrop.enums.PointViewListenerEnum;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DataDragView.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final /* data */ class DataDragView {
    public static final int $stable = 8;

    @NotNull
    public final CurrentDraggableItem currentDraggableItem;

    @NotNull
    public final DataDragAndDrop dataDragAndDrop;

    @NotNull
    public final DataDataDragViewNative dataNative;

    @NotNull
    public final View draggableView;
    public final boolean isRemoveDragListenerAfterDrop;

    @NotNull
    public final ViewGroup parent;

    @Nullable
    public final PointViewListenerEnum pointListener;

    public static /* synthetic */ DataDragView copy$default(DataDragView dataDragView, View view, CurrentDraggableItem currentDraggableItem, ViewGroup viewGroup, DataDragAndDrop dataDragAndDrop, PointViewListenerEnum pointViewListenerEnum, DataDataDragViewNative dataDataDragViewNative, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            view = dataDragView.draggableView;
        }
        if ((i & 2) != 0) {
            currentDraggableItem = dataDragView.currentDraggableItem;
        }
        CurrentDraggableItem currentDraggableItem2 = currentDraggableItem;
        if ((i & 4) != 0) {
            viewGroup = dataDragView.parent;
        }
        ViewGroup viewGroup2 = viewGroup;
        if ((i & 8) != 0) {
            dataDragAndDrop = dataDragView.dataDragAndDrop;
        }
        DataDragAndDrop dataDragAndDrop2 = dataDragAndDrop;
        if ((i & 16) != 0) {
            pointViewListenerEnum = dataDragView.pointListener;
        }
        PointViewListenerEnum pointViewListenerEnum2 = pointViewListenerEnum;
        if ((i & 32) != 0) {
            dataDataDragViewNative = dataDragView.dataNative;
        }
        DataDataDragViewNative dataDataDragViewNative2 = dataDataDragViewNative;
        if ((i & 64) != 0) {
            z = dataDragView.isRemoveDragListenerAfterDrop;
        }
        return dataDragView.copy(view, currentDraggableItem2, viewGroup2, dataDragAndDrop2, pointViewListenerEnum2, dataDataDragViewNative2, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final View getDraggableView() {
        return this.draggableView;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CurrentDraggableItem getCurrentDraggableItem() {
        return this.currentDraggableItem;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ViewGroup getParent() {
        return this.parent;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final DataDragAndDrop getDataDragAndDrop() {
        return this.dataDragAndDrop;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final PointViewListenerEnum getPointListener() {
        return this.pointListener;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final DataDataDragViewNative getDataNative() {
        return this.dataNative;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsRemoveDragListenerAfterDrop() {
        return this.isRemoveDragListenerAfterDrop;
    }

    @NotNull
    public final DataDragView copy(@NotNull View draggableView, @NotNull CurrentDraggableItem currentDraggableItem, @NotNull ViewGroup parent, @NotNull DataDragAndDrop dataDragAndDrop, @Nullable PointViewListenerEnum pointListener, @NotNull DataDataDragViewNative dataNative, boolean isRemoveDragListenerAfterDrop) {
        Intrinsics.checkNotNullParameter(draggableView, "draggableView");
        Intrinsics.checkNotNullParameter(currentDraggableItem, "currentDraggableItem");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(dataDragAndDrop, "dataDragAndDrop");
        Intrinsics.checkNotNullParameter(dataNative, "dataNative");
        return new DataDragView(draggableView, currentDraggableItem, parent, dataDragAndDrop, pointListener, dataNative, isRemoveDragListenerAfterDrop);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataDragView)) {
            return false;
        }
        DataDragView dataDragView = (DataDragView) other;
        return Intrinsics.areEqual(this.draggableView, dataDragView.draggableView) && this.currentDraggableItem == dataDragView.currentDraggableItem && Intrinsics.areEqual(this.parent, dataDragView.parent) && Intrinsics.areEqual(this.dataDragAndDrop, dataDragView.dataDragAndDrop) && this.pointListener == dataDragView.pointListener && Intrinsics.areEqual(this.dataNative, dataDragView.dataNative) && this.isRemoveDragListenerAfterDrop == dataDragView.isRemoveDragListenerAfterDrop;
    }

    public int hashCode() {
        int iHashCode = ((((((this.draggableView.hashCode() * 31) + this.currentDraggableItem.hashCode()) * 31) + this.parent.hashCode()) * 31) + this.dataDragAndDrop.hashCode()) * 31;
        PointViewListenerEnum pointViewListenerEnum = this.pointListener;
        return ((((iHashCode + (pointViewListenerEnum == null ? 0 : pointViewListenerEnum.hashCode())) * 31) + this.dataNative.hashCode()) * 31) + Boolean.hashCode(this.isRemoveDragListenerAfterDrop);
    }

    @NotNull
    public String toString() {
        return "DataDragView(draggableView=" + this.draggableView + ", currentDraggableItem=" + this.currentDraggableItem + ", parent=" + this.parent + ", dataDragAndDrop=" + this.dataDragAndDrop + ", pointListener=" + this.pointListener + ", dataNative=" + this.dataNative + ", isRemoveDragListenerAfterDrop=" + this.isRemoveDragListenerAfterDrop + ")";
    }

    public DataDragView(@NotNull View draggableView, @NotNull CurrentDraggableItem currentDraggableItem, @NotNull ViewGroup parent, @NotNull DataDragAndDrop dataDragAndDrop, @Nullable PointViewListenerEnum pointViewListenerEnum, @NotNull DataDataDragViewNative dataNative, boolean z) {
        Intrinsics.checkNotNullParameter(draggableView, "draggableView");
        Intrinsics.checkNotNullParameter(currentDraggableItem, "currentDraggableItem");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(dataDragAndDrop, "dataDragAndDrop");
        Intrinsics.checkNotNullParameter(dataNative, "dataNative");
        this.draggableView = draggableView;
        this.currentDraggableItem = currentDraggableItem;
        this.parent = parent;
        this.dataDragAndDrop = dataDragAndDrop;
        this.pointListener = pointViewListenerEnum;
        this.dataNative = dataNative;
        this.isRemoveDragListenerAfterDrop = z;
    }

    @NotNull
    public final View getDraggableView() {
        return this.draggableView;
    }

    @NotNull
    public final CurrentDraggableItem getCurrentDraggableItem() {
        return this.currentDraggableItem;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DataDragView(View view, CurrentDraggableItem currentDraggableItem, ViewGroup viewGroup, DataDragAndDrop dataDragAndDrop, PointViewListenerEnum pointViewListenerEnum, DataDataDragViewNative dataDataDragViewNative, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        ViewGroup viewGroup2;
        if ((i & 4) != 0) {
            ViewParent parent = view.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            viewGroup2 = (ViewGroup) parent;
        } else {
            viewGroup2 = viewGroup;
        }
        this(view, currentDraggableItem, viewGroup2, (i & 8) != 0 ? new DataDragAndDrop(0.0f, 0.0f, 0, 7, null) : dataDragAndDrop, (i & 16) != 0 ? PointViewListenerEnum.CENTER : pointViewListenerEnum, (i & 32) != 0 ? new DataDataDragViewNative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31, null) : dataDataDragViewNative, (i & 64) != 0 ? false : z);
    }

    @NotNull
    public final ViewGroup getParent() {
        return this.parent;
    }

    @NotNull
    public final DataDragAndDrop getDataDragAndDrop() {
        return this.dataDragAndDrop;
    }

    @Nullable
    public final PointViewListenerEnum getPointListener() {
        return this.pointListener;
    }

    @NotNull
    public final DataDataDragViewNative getDataNative() {
        return this.dataNative;
    }

    public final boolean isRemoveDragListenerAfterDrop() {
        return this.isRemoveDragListenerAfterDrop;
    }
}

