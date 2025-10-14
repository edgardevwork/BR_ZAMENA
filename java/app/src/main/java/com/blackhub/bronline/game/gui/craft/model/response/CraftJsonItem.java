package com.blackhub.bronline.game.gui.craft.model.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftJsonItem.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final /* data */ class CraftJsonItem {
    public static final int $stable = 8;

    @SerializedName("crafting_chance_percent")
    public final float craftingChancePercent;

    @SerializedName("crafting_components")
    @Nullable
    public final List<CraftJsonComponentItem> craftingComponents;

    @SerializedName("crafting_cost")
    public final int craftingCost;

    @SerializedName("crafting_exp")
    public final int craftingExp;

    @SerializedName("crafting_time_sec")
    public final int craftingTimeSec;

    @SerializedName("game_id")
    public final int idForServerAndRender;

    @SerializedName("image_CDN")
    @NotNull
    public final String imageCDN;

    @SerializedName("visibility")
    public final int isVisible;

    @SerializedName(FirebaseAnalytics.Param.ITEM_CATEGORY)
    public final int itemCategory;

    @SerializedName("item_class_id")
    public final int itemClassId;

    @SerializedName("item_description")
    @Nullable
    public final String itemDescription;

    @SerializedName("internal_id")
    public final int itemId;

    @SerializedName(FirebaseAnalytics.Param.ITEM_NAME)
    @NotNull
    public final String itemName;

    @SerializedName("item_weight")
    public final float itemWeight;

    @SerializedName("stack")
    public final int stack;

    /* renamed from: component1, reason: from getter */
    public final int getItemId() {
        return this.itemId;
    }

    /* renamed from: component10, reason: from getter */
    public final int getCraftingTimeSec() {
        return this.craftingTimeSec;
    }

    /* renamed from: component11, reason: from getter */
    public final float getCraftingChancePercent() {
        return this.craftingChancePercent;
    }

    /* renamed from: component12, reason: from getter */
    public final float getItemWeight() {
        return this.itemWeight;
    }

    /* renamed from: component13, reason: from getter */
    public final int getCraftingCost() {
        return this.craftingCost;
    }

    /* renamed from: component14, reason: from getter */
    public final int getCraftingExp() {
        return this.craftingExp;
    }

    @Nullable
    public final List<CraftJsonComponentItem> component15() {
        return this.craftingComponents;
    }

    /* renamed from: component2, reason: from getter */
    public final int getIdForServerAndRender() {
        return this.idForServerAndRender;
    }

    /* renamed from: component3, reason: from getter */
    public final int getIsVisible() {
        return this.isVisible;
    }

    /* renamed from: component4, reason: from getter */
    public final int getItemCategory() {
        return this.itemCategory;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getItemName() {
        return this.itemName;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getItemDescription() {
        return this.itemDescription;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getImageCDN() {
        return this.imageCDN;
    }

    /* renamed from: component8, reason: from getter */
    public final int getItemClassId() {
        return this.itemClassId;
    }

    /* renamed from: component9, reason: from getter */
    public final int getStack() {
        return this.stack;
    }

    @NotNull
    public final CraftJsonItem copy(int itemId, int idForServerAndRender, int isVisible, int itemCategory, @NotNull String itemName, @Nullable String itemDescription, @NotNull String imageCDN, int itemClassId, int stack, int craftingTimeSec, float craftingChancePercent, float itemWeight, int craftingCost, int craftingExp, @Nullable List<CraftJsonComponentItem> craftingComponents) {
        Intrinsics.checkNotNullParameter(itemName, "itemName");
        Intrinsics.checkNotNullParameter(imageCDN, "imageCDN");
        return new CraftJsonItem(itemId, idForServerAndRender, isVisible, itemCategory, itemName, itemDescription, imageCDN, itemClassId, stack, craftingTimeSec, craftingChancePercent, itemWeight, craftingCost, craftingExp, craftingComponents);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CraftJsonItem)) {
            return false;
        }
        CraftJsonItem craftJsonItem = (CraftJsonItem) other;
        return this.itemId == craftJsonItem.itemId && this.idForServerAndRender == craftJsonItem.idForServerAndRender && this.isVisible == craftJsonItem.isVisible && this.itemCategory == craftJsonItem.itemCategory && Intrinsics.areEqual(this.itemName, craftJsonItem.itemName) && Intrinsics.areEqual(this.itemDescription, craftJsonItem.itemDescription) && Intrinsics.areEqual(this.imageCDN, craftJsonItem.imageCDN) && this.itemClassId == craftJsonItem.itemClassId && this.stack == craftJsonItem.stack && this.craftingTimeSec == craftJsonItem.craftingTimeSec && Float.compare(this.craftingChancePercent, craftJsonItem.craftingChancePercent) == 0 && Float.compare(this.itemWeight, craftJsonItem.itemWeight) == 0 && this.craftingCost == craftJsonItem.craftingCost && this.craftingExp == craftJsonItem.craftingExp && Intrinsics.areEqual(this.craftingComponents, craftJsonItem.craftingComponents);
    }

    public int hashCode() {
        int iHashCode = ((((((((Integer.hashCode(this.itemId) * 31) + Integer.hashCode(this.idForServerAndRender)) * 31) + Integer.hashCode(this.isVisible)) * 31) + Integer.hashCode(this.itemCategory)) * 31) + this.itemName.hashCode()) * 31;
        String str = this.itemDescription;
        int iHashCode2 = (((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.imageCDN.hashCode()) * 31) + Integer.hashCode(this.itemClassId)) * 31) + Integer.hashCode(this.stack)) * 31) + Integer.hashCode(this.craftingTimeSec)) * 31) + Float.hashCode(this.craftingChancePercent)) * 31) + Float.hashCode(this.itemWeight)) * 31) + Integer.hashCode(this.craftingCost)) * 31) + Integer.hashCode(this.craftingExp)) * 31;
        List<CraftJsonComponentItem> list = this.craftingComponents;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CraftJsonItem(itemId=" + this.itemId + ", idForServerAndRender=" + this.idForServerAndRender + ", isVisible=" + this.isVisible + ", itemCategory=" + this.itemCategory + ", itemName=" + this.itemName + ", itemDescription=" + this.itemDescription + ", imageCDN=" + this.imageCDN + ", itemClassId=" + this.itemClassId + ", stack=" + this.stack + ", craftingTimeSec=" + this.craftingTimeSec + ", craftingChancePercent=" + this.craftingChancePercent + ", itemWeight=" + this.itemWeight + ", craftingCost=" + this.craftingCost + ", craftingExp=" + this.craftingExp + ", craftingComponents=" + this.craftingComponents + ")";
    }

    public CraftJsonItem(int i, int i2, int i3, int i4, @NotNull String itemName, @Nullable String str, @NotNull String imageCDN, int i5, int i6, int i7, float f, float f2, int i8, int i9, @Nullable List<CraftJsonComponentItem> list) {
        Intrinsics.checkNotNullParameter(itemName, "itemName");
        Intrinsics.checkNotNullParameter(imageCDN, "imageCDN");
        this.itemId = i;
        this.idForServerAndRender = i2;
        this.isVisible = i3;
        this.itemCategory = i4;
        this.itemName = itemName;
        this.itemDescription = str;
        this.imageCDN = imageCDN;
        this.itemClassId = i5;
        this.stack = i6;
        this.craftingTimeSec = i7;
        this.craftingChancePercent = f;
        this.itemWeight = f2;
        this.craftingCost = i8;
        this.craftingExp = i9;
        this.craftingComponents = list;
    }

    public final int getItemId() {
        return this.itemId;
    }

    public final int getIdForServerAndRender() {
        return this.idForServerAndRender;
    }

    public final int isVisible() {
        return this.isVisible;
    }

    public final int getItemCategory() {
        return this.itemCategory;
    }

    @NotNull
    public final String getItemName() {
        return this.itemName;
    }

    @Nullable
    public final String getItemDescription() {
        return this.itemDescription;
    }

    @NotNull
    public final String getImageCDN() {
        return this.imageCDN;
    }

    public final int getItemClassId() {
        return this.itemClassId;
    }

    public final int getStack() {
        return this.stack;
    }

    public final int getCraftingTimeSec() {
        return this.craftingTimeSec;
    }

    public final float getCraftingChancePercent() {
        return this.craftingChancePercent;
    }

    public final float getItemWeight() {
        return this.itemWeight;
    }

    public final int getCraftingCost() {
        return this.craftingCost;
    }

    public final int getCraftingExp() {
        return this.craftingExp;
    }

    @Nullable
    public final List<CraftJsonComponentItem> getCraftingComponents() {
        return this.craftingComponents;
    }
}

