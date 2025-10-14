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
@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JQ\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\""}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/craft/model/response/CraftJsonItemResource;", "", "itemId", "", "itemCategory", "itemName", "", "itemDescription", "imageCDN", "itemClassId", "stack", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "getImageCDN", "()Ljava/lang/String;", "getItemCategory", "()I", "getItemClassId", "getItemDescription", "getItemId", "getItemName", "getStack", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
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
