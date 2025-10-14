package com.blackhub.bronline.game.gui.fractions.data;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.fractions.Const;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FractionsShopItem.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class FractionsShopItem {
    public static final int $stable = 8;

    @SerializedName("title")
    @NotNull
    public final String boxName;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    public final int boxPrice;
    public boolean isClicked;

    @SerializedName("itemID")
    public final int itemId;

    @SerializedName("objectID")
    public final int objectID;

    @Nullable
    public Bitmap render;

    @SerializedName("typeID")
    public final int typeID;

    @SerializedName(Const.FRACTION_SHOP_UNIQUE_ID)
    public final int uniqueId;

    public FractionsShopItem() {
        this(0, null, 0, 0, 0, 0, 63, null);
    }

    public static /* synthetic */ FractionsShopItem copy$default(FractionsShopItem fractionsShopItem, int i, String str, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = fractionsShopItem.uniqueId;
        }
        if ((i6 & 2) != 0) {
            str = fractionsShopItem.boxName;
        }
        String str2 = str;
        if ((i6 & 4) != 0) {
            i2 = fractionsShopItem.typeID;
        }
        int i7 = i2;
        if ((i6 & 8) != 0) {
            i3 = fractionsShopItem.objectID;
        }
        int i8 = i3;
        if ((i6 & 16) != 0) {
            i4 = fractionsShopItem.itemId;
        }
        int i9 = i4;
        if ((i6 & 32) != 0) {
            i5 = fractionsShopItem.boxPrice;
        }
        return fractionsShopItem.copy(i, str2, i7, i8, i9, i5);
    }

    /* renamed from: component1, reason: from getter */
    public final int getUniqueId() {
        return this.uniqueId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getBoxName() {
        return this.boxName;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTypeID() {
        return this.typeID;
    }

    /* renamed from: component4, reason: from getter */
    public final int getObjectID() {
        return this.objectID;
    }

    /* renamed from: component5, reason: from getter */
    public final int getItemId() {
        return this.itemId;
    }

    /* renamed from: component6, reason: from getter */
    public final int getBoxPrice() {
        return this.boxPrice;
    }

    @NotNull
    public final FractionsShopItem copy(int uniqueId, @NotNull String boxName, int typeID, int objectID, int itemId, int boxPrice) {
        Intrinsics.checkNotNullParameter(boxName, "boxName");
        return new FractionsShopItem(uniqueId, boxName, typeID, objectID, itemId, boxPrice);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FractionsShopItem)) {
            return false;
        }
        FractionsShopItem fractionsShopItem = (FractionsShopItem) other;
        return this.uniqueId == fractionsShopItem.uniqueId && Intrinsics.areEqual(this.boxName, fractionsShopItem.boxName) && this.typeID == fractionsShopItem.typeID && this.objectID == fractionsShopItem.objectID && this.itemId == fractionsShopItem.itemId && this.boxPrice == fractionsShopItem.boxPrice;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.uniqueId) * 31) + this.boxName.hashCode()) * 31) + Integer.hashCode(this.typeID)) * 31) + Integer.hashCode(this.objectID)) * 31) + Integer.hashCode(this.itemId)) * 31) + Integer.hashCode(this.boxPrice);
    }

    @NotNull
    public String toString() {
        return "FractionsShopItem(uniqueId=" + this.uniqueId + ", boxName=" + this.boxName + ", typeID=" + this.typeID + ", objectID=" + this.objectID + ", itemId=" + this.itemId + ", boxPrice=" + this.boxPrice + ")";
    }

    public FractionsShopItem(int i, @NotNull String boxName, int i2, int i3, int i4, int i5) {
        Intrinsics.checkNotNullParameter(boxName, "boxName");
        this.uniqueId = i;
        this.boxName = boxName;
        this.typeID = i2;
        this.objectID = i3;
        this.itemId = i4;
        this.boxPrice = i5;
    }

    public final int getUniqueId() {
        return this.uniqueId;
    }

    public /* synthetic */ FractionsShopItem(int i, String str, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i6 & 4) != 0 ? 0 : i2, (i6 & 8) != 0 ? 0 : i3, (i6 & 16) != 0 ? 0 : i4, (i6 & 32) != 0 ? 0 : i5);
    }

    @NotNull
    public final String getBoxName() {
        return this.boxName;
    }

    public final int getTypeID() {
        return this.typeID;
    }

    public final int getObjectID() {
        return this.objectID;
    }

    public final int getItemId() {
        return this.itemId;
    }

    public final int getBoxPrice() {
        return this.boxPrice;
    }

    @Nullable
    public final Bitmap getRender() {
        return this.render;
    }

    public final void setRender(@Nullable Bitmap bitmap) {
        this.render = bitmap;
    }

    /* renamed from: isClicked, reason: from getter */
    public final boolean getIsClicked() {
        return this.isClicked;
    }

    public final void setClicked(boolean z) {
        this.isClicked = z;
    }
}

