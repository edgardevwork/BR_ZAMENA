package com.blackhub.bronline.game.core.utils.draganddrop.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.utils.draganddrop.enums.CurrentDraggableItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DragAndDropCallback.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final /* data */ class DragAndDropCallback {
    public static final int $stable = 8;

    @NotNull
    public final CurrentDraggableItem currentDraggableItem;

    @Nullable
    public final DataDragAndDrop dataDragAndDrop;

    @Nullable
    public final DataTargetArea dataTargetArea;
    public final boolean onTarget;

    public static /* synthetic */ DragAndDropCallback copy$default(DragAndDropCallback dragAndDropCallback, CurrentDraggableItem currentDraggableItem, DataDragAndDrop dataDragAndDrop, DataTargetArea dataTargetArea, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            currentDraggableItem = dragAndDropCallback.currentDraggableItem;
        }
        if ((i & 2) != 0) {
            dataDragAndDrop = dragAndDropCallback.dataDragAndDrop;
        }
        if ((i & 4) != 0) {
            dataTargetArea = dragAndDropCallback.dataTargetArea;
        }
        if ((i & 8) != 0) {
            z = dragAndDropCallback.onTarget;
        }
        return dragAndDropCallback.copy(currentDraggableItem, dataDragAndDrop, dataTargetArea, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CurrentDraggableItem getCurrentDraggableItem() {
        return this.currentDraggableItem;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final DataDragAndDrop getDataDragAndDrop() {
        return this.dataDragAndDrop;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final DataTargetArea getDataTargetArea() {
        return this.dataTargetArea;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getOnTarget() {
        return this.onTarget;
    }

    @NotNull
    public final DragAndDropCallback copy(@NotNull CurrentDraggableItem currentDraggableItem, @Nullable DataDragAndDrop dataDragAndDrop, @Nullable DataTargetArea dataTargetArea, boolean onTarget) {
        Intrinsics.checkNotNullParameter(currentDraggableItem, "currentDraggableItem");
        return new DragAndDropCallback(currentDraggableItem, dataDragAndDrop, dataTargetArea, onTarget);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DragAndDropCallback)) {
            return false;
        }
        DragAndDropCallback dragAndDropCallback = (DragAndDropCallback) other;
        return this.currentDraggableItem == dragAndDropCallback.currentDraggableItem && Intrinsics.areEqual(this.dataDragAndDrop, dragAndDropCallback.dataDragAndDrop) && Intrinsics.areEqual(this.dataTargetArea, dragAndDropCallback.dataTargetArea) && this.onTarget == dragAndDropCallback.onTarget;
    }

    public int hashCode() {
        int iHashCode = this.currentDraggableItem.hashCode() * 31;
        DataDragAndDrop dataDragAndDrop = this.dataDragAndDrop;
        int iHashCode2 = (iHashCode + (dataDragAndDrop == null ? 0 : dataDragAndDrop.hashCode())) * 31;
        DataTargetArea dataTargetArea = this.dataTargetArea;
        return ((iHashCode2 + (dataTargetArea != null ? dataTargetArea.hashCode() : 0)) * 31) + Boolean.hashCode(this.onTarget);
    }

    @NotNull
    public String toString() {
        return "DragAndDropCallback(currentDraggableItem=" + this.currentDraggableItem + ", dataDragAndDrop=" + this.dataDragAndDrop + ", dataTargetArea=" + this.dataTargetArea + ", onTarget=" + this.onTarget + ")";
    }

    public DragAndDropCallback(@NotNull CurrentDraggableItem currentDraggableItem, @Nullable DataDragAndDrop dataDragAndDrop, @Nullable DataTargetArea dataTargetArea, boolean z) {
        Intrinsics.checkNotNullParameter(currentDraggableItem, "currentDraggableItem");
        this.currentDraggableItem = currentDraggableItem;
        this.dataDragAndDrop = dataDragAndDrop;
        this.dataTargetArea = dataTargetArea;
        this.onTarget = z;
    }

    public /* synthetic */ DragAndDropCallback(CurrentDraggableItem currentDraggableItem, DataDragAndDrop dataDragAndDrop, DataTargetArea dataTargetArea, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(currentDraggableItem, (i & 2) != 0 ? null : dataDragAndDrop, (i & 4) != 0 ? null : dataTargetArea, (i & 8) != 0 ? false : z);
    }

    @NotNull
    public final CurrentDraggableItem getCurrentDraggableItem() {
        return this.currentDraggableItem;
    }

    @Nullable
    public final DataDragAndDrop getDataDragAndDrop() {
        return this.dataDragAndDrop;
    }

    @Nullable
    public final DataTargetArea getDataTargetArea() {
        return this.dataTargetArea;
    }

    public final boolean getOnTarget() {
        return this.onTarget;
    }
}

