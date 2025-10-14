package com.blackhub.bronline.game.gui.inventory.data;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InvSizeAndItemsObj.kt */
@StabilityInferred(parameters = 0)

public final /* data */ class InvSizeAndItemsObj {
    public static final int $stable = 8;

    @Nullable
    public List<InvItems> itemsList;

    @Nullable
    public Integer sizeActiveSlots;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvSizeAndItemsObj copy$default(InvSizeAndItemsObj invSizeAndItemsObj, List list, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            list = invSizeAndItemsObj.itemsList;
        }
        if ((i & 2) != 0) {
            num = invSizeAndItemsObj.sizeActiveSlots;
        }
        return invSizeAndItemsObj.copy(list, num);
    }

    @Nullable
    public final List<InvItems> component1() {
        return this.itemsList;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getSizeActiveSlots() {
        return this.sizeActiveSlots;
    }

    @NotNull
    public final InvSizeAndItemsObj copy(@Nullable List<InvItems> itemsList, @Nullable Integer sizeActiveSlots) {
        return new InvSizeAndItemsObj(itemsList, sizeActiveSlots);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvSizeAndItemsObj)) {
            return false;
        }
        InvSizeAndItemsObj invSizeAndItemsObj = (InvSizeAndItemsObj) other;
        return Intrinsics.areEqual(this.itemsList, invSizeAndItemsObj.itemsList) && Intrinsics.areEqual(this.sizeActiveSlots, invSizeAndItemsObj.sizeActiveSlots);
    }

    public int hashCode() {
        List<InvItems> list = this.itemsList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.sizeActiveSlots;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "InvSizeAndItemsObj(itemsList=" + this.itemsList + ", sizeActiveSlots=" + this.sizeActiveSlots + ")";
    }

    public InvSizeAndItemsObj(@Nullable List<InvItems> list, @Nullable Integer num) {
        this.itemsList = list;
        this.sizeActiveSlots = num;
    }

    @Nullable
    public final List<InvItems> getItemsList() {
        return this.itemsList;
    }

    public final void setItemsList(@Nullable List<InvItems> list) {
        this.itemsList = list;
    }

    @Nullable
    public final Integer getSizeActiveSlots() {
        return this.sizeActiveSlots;
    }

    public final void setSizeActiveSlots(@Nullable Integer num) {
        this.sizeActiveSlots = num;
    }
}

