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
@Metadata(m7104d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010#\u001a\u00020\rHÆ\u0003J\t\u0010$\u001a\u00020\u000fHÆ\u0003JQ\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010&\u001a\u00020\u000f2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, m7105d2 = {"Lcom/blackhub/bronline/game/core/utils/draganddrop/model/DataDragView;", "", "draggableView", "Landroid/view/View;", "currentDraggableItem", "Lcom/blackhub/bronline/game/core/utils/draganddrop/enums/CurrentDraggableItem;", "parent", "Landroid/view/ViewGroup;", "dataDragAndDrop", "Lcom/blackhub/bronline/game/core/utils/draganddrop/model/DataDragAndDrop;", "pointListener", "Lcom/blackhub/bronline/game/core/utils/draganddrop/enums/PointViewListenerEnum;", "dataNative", "Lcom/blackhub/bronline/game/core/utils/draganddrop/model/DataDataDragViewNative;", "isRemoveDragListenerAfterDrop", "", "(Landroid/view/View;Lcom/blackhub/bronline/game/core/utils/draganddrop/enums/CurrentDraggableItem;Landroid/view/ViewGroup;Lcom/blackhub/bronline/game/core/utils/draganddrop/model/DataDragAndDrop;Lcom/blackhub/bronline/game/core/utils/draganddrop/enums/PointViewListenerEnum;Lcom/blackhub/bronline/game/core/utils/draganddrop/model/DataDataDragViewNative;Z)V", "getCurrentDraggableItem", "()Lcom/blackhub/bronline/game/core/utils/draganddrop/enums/CurrentDraggableItem;", "getDataDragAndDrop", "()Lcom/blackhub/bronline/game/core/utils/draganddrop/model/DataDragAndDrop;", "getDataNative", "()Lcom/blackhub/bronline/game/core/utils/draganddrop/model/DataDataDragViewNative;", "getDraggableView", "()Landroid/view/View;", "()Z", "getParent", "()Landroid/view/ViewGroup;", "getPointListener", "()Lcom/blackhub/bronline/game/core/utils/draganddrop/enums/PointViewListenerEnum;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
