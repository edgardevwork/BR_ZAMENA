package com.blackhub.bronline.game.gui.craft.model.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftJsonItemResource.kt */
@StabilityInferred(parameters = 1)

public final /* data */ class CraftJsonItemResource {
    public static final int $stable = 0;

    @SerializedName("imageCDN")
    @NotNull
    public final String imageCDN;

    @SerializedName("itemCategory")
    public final int itemCategory;

    @SerializedName("itemClassId")
    public final int itemClassId;

    @SerializedName("itemDescription")
    @Nullable
    public final String itemDescription;

    @SerializedName("itemId")
    public final int itemId;

    @SerializedName("itemName")
    @NotNull
    public final String itemName;

    @SerializedName("stack")
    public final int stack;

    public static /* synthetic */ CraftJsonItemResource copy$default(CraftJsonItemResource craftJsonItemResource, int i, int i2, String str, String str2, String str3, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = craftJsonItemResource.itemId;
        }
        if ((i5 & 2) != 0) {
            i2 = craftJsonItemResource.itemCategory;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            str = craftJsonItemResource.itemName;
        }
        String str4 = str;
        if ((i5 & 8) != 0) {
            str2 = craftJsonItemResource.itemDescription;
        }
        String str5 = str2;
        if ((i5 & 16) != 0) {
            str3 = craftJsonItemResource.imageCDN;
        }
        String str6 = str3;
        if ((i5 & 32) != 0) {
            i3 = craftJsonItemResource.itemClassId;
        }
        int i7 = i3;
        if ((i5 & 64) != 0) {
            i4 = craftJsonItemResource.stack;
        }
        return craftJsonItemResource.copy(i, i6, str4, str5, str6, i7, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getItemId() {
        return this.itemId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getItemCategory() {
        return this.itemCategory;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getItemName() {
        return this.itemName;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getItemDescription() {
        return this.itemDescription;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getImageCDN() {
        return this.imageCDN;
    }

    /* renamed from: component6, reason: from getter */
    public final int getItemClassId() {
        return this.itemClassId;
    }

    /* renamed from: component7, reason: from getter */
    public final int getStack() {
        return this.stack;
    }

    @NotNull
    public final CraftJsonItemResource copy(int itemId, int itemCategory, @NotNull String itemName, @Nullable String itemDescription, @NotNull String imageCDN, int itemClassId, int stack) {
        Intrinsics.checkNotNullParameter(itemName, "itemName");
        Intrinsics.checkNotNullParameter(imageCDN, "imageCDN");
        return new CraftJsonItemResource(itemId, itemCategory, itemName, itemDescription, imageCDN, itemClassId, stack);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CraftJsonItemResource)) {
            return false;
        }
        CraftJsonItemResource craftJsonItemResource = (CraftJsonItemResource) other;
        return this.itemId == craftJsonItemResource.itemId && this.itemCategory == craftJsonItemResource.itemCategory && Intrinsics.areEqual(this.itemName, craftJsonItemResource.itemName) && Intrinsics.areEqual(this.itemDescription, craftJsonItemResource.itemDescription) && Intrinsics.areEqual(this.imageCDN, craftJsonItemResource.imageCDN) && this.itemClassId == craftJsonItemResource.itemClassId && this.stack == craftJsonItemResource.stack;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.itemId) * 31) + Integer.hashCode(this.itemCategory)) * 31) + this.itemName.hashCode()) * 31;
        String str = this.itemDescription;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.imageCDN.hashCode()) * 31) + Integer.hashCode(this.itemClassId)) * 31) + Integer.hashCode(this.stack);
    }

    @NotNull
    public String toString() {
        return "CraftJsonItemResource(itemId=" + this.itemId + ", itemCategory=" + this.itemCategory + ", itemName=" + this.itemName + ", itemDescription=" + this.itemDescription + ", imageCDN=" + this.imageCDN + ", itemClassId=" + this.itemClassId + ", stack=" + this.stack + ")";
    }

    public CraftJsonItemResource(int i, int i2, @NotNull String itemName, @Nullable String str, @NotNull String imageCDN, int i3, int i4) {
        Intrinsics.checkNotNullParameter(itemName, "itemName");
        Intrinsics.checkNotNullParameter(imageCDN, "imageCDN");
        this.itemId = i;
        this.itemCategory = i2;
        this.itemName = itemName;
        this.itemDescription = str;
        this.imageCDN = imageCDN;
        this.itemClassId = i3;
        this.stack = i4;
    }

    public final int getItemId() {
        return this.itemId;
    }

    public final int getItemCategory() {
        return this.itemCategory;
    }

    public /* synthetic */ CraftJsonItemResource(int i, int i2, String str, String str2, String str3, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i5 & 4) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i5 & 8) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i5 & 16) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str3, i3, i4);
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
}

