package com.blackhub.bronline.game.gui.inventory.data;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InvSizeAndItemsObj.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ,\u0010\u0013\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/inventory/data/InvSizeAndItemsObj;", "", "itemsList", "", "Lcom/blackhub/bronline/game/gui/inventory/data/InvItems;", "sizeActiveSlots", "", "(Ljava/util/List;Ljava/lang/Integer;)V", "getItemsList", "()Ljava/util/List;", "setItemsList", "(Ljava/util/List;)V", "getSizeActiveSlots", "()Ljava/lang/Integer;", "setSizeActiveSlots", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Integer;)Lcom/blackhub/bronline/game/gui/inventory/data/InvSizeAndItemsObj;", "equals", "", "other", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
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
