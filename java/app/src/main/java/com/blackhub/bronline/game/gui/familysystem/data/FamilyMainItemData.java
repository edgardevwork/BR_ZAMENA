package com.blackhub.bronline.game.gui.familysystem.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FamilyMainItemData.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class FamilyMainItemData {
    public static final int $stable = 8;
    public boolean isClicked;
    public final int itemsId;

    @NotNull
    public final String itemsTitle;

    public static /* synthetic */ FamilyMainItemData copy$default(FamilyMainItemData familyMainItemData, int i, String str, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = familyMainItemData.itemsId;
        }
        if ((i2 & 2) != 0) {
            str = familyMainItemData.itemsTitle;
        }
        if ((i2 & 4) != 0) {
            z = familyMainItemData.isClicked;
        }
        return familyMainItemData.copy(i, str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final int getItemsId() {
        return this.itemsId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getItemsTitle() {
        return this.itemsTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsClicked() {
        return this.isClicked;
    }

    @NotNull
    public final FamilyMainItemData copy(int itemsId, @NotNull String itemsTitle, boolean isClicked) {
        Intrinsics.checkNotNullParameter(itemsTitle, "itemsTitle");
        return new FamilyMainItemData(itemsId, itemsTitle, isClicked);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FamilyMainItemData)) {
            return false;
        }
        FamilyMainItemData familyMainItemData = (FamilyMainItemData) other;
        return this.itemsId == familyMainItemData.itemsId && Intrinsics.areEqual(this.itemsTitle, familyMainItemData.itemsTitle) && this.isClicked == familyMainItemData.isClicked;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.itemsId) * 31) + this.itemsTitle.hashCode()) * 31) + Boolean.hashCode(this.isClicked);
    }

    @NotNull
    public String toString() {
        return "FamilyMainItemData(itemsId=" + this.itemsId + ", itemsTitle=" + this.itemsTitle + ", isClicked=" + this.isClicked + ")";
    }

    public FamilyMainItemData(int i, @NotNull String itemsTitle, boolean z) {
        Intrinsics.checkNotNullParameter(itemsTitle, "itemsTitle");
        this.itemsId = i;
        this.itemsTitle = itemsTitle;
        this.isClicked = z;
    }

    public /* synthetic */ FamilyMainItemData(int i, String str, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? false : z);
    }

    public final int getItemsId() {
        return this.itemsId;
    }

    @NotNull
    public final String getItemsTitle() {
        return this.itemsTitle;
    }

    public final boolean isClicked() {
        return this.isClicked;
    }

    public final void setClicked(boolean z) {
        this.isClicked = z;
    }
}

