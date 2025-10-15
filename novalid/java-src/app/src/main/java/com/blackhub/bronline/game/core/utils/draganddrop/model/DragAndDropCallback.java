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
@Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m7105d2 = {"Lcom/blackhub/bronline/game/core/utils/draganddrop/model/DragAndDropCallback;", "", "currentDraggableItem", "Lcom/blackhub/bronline/game/core/utils/draganddrop/enums/CurrentDraggableItem;", "dataDragAndDrop", "Lcom/blackhub/bronline/game/core/utils/draganddrop/model/DataDragAndDrop;", "dataTargetArea", "Lcom/blackhub/bronline/game/core/utils/draganddrop/model/DataTargetArea;", "onTarget", "", "(Lcom/blackhub/bronline/game/core/utils/draganddrop/enums/CurrentDraggableItem;Lcom/blackhub/bronline/game/core/utils/draganddrop/model/DataDragAndDrop;Lcom/blackhub/bronline/game/core/utils/draganddrop/model/DataTargetArea;Z)V", "getCurrentDraggableItem", "()Lcom/blackhub/bronline/game/core/utils/draganddrop/enums/CurrentDraggableItem;", "getDataDragAndDrop", "()Lcom/blackhub/bronline/game/core/utils/draganddrop/model/DataDragAndDrop;", "getDataTargetArea", "()Lcom/blackhub/bronline/game/core/utils/draganddrop/model/DataTargetArea;", "getOnTarget", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
