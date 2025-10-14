package com.blackhub.bronline.game.gui.craft.model.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftJsonItemCategory.kt */
@StabilityInferred(parameters = 1)

public final /* data */ class CraftJsonItemCategory {
    public static final int $stable = 0;

    @SerializedName("categoryId")
    public final int categoryId;

    @SerializedName("categoryName")
    @NotNull
    public final String categoryName;

    @SerializedName("iconCDN")
    @NotNull
    public final String iconCDN;

    public static /* synthetic */ CraftJsonItemCategory copy$default(CraftJsonItemCategory craftJsonItemCategory, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = craftJsonItemCategory.categoryId;
        }
        if ((i2 & 2) != 0) {
            str = craftJsonItemCategory.categoryName;
        }
        if ((i2 & 4) != 0) {
            str2 = craftJsonItemCategory.iconCDN;
        }
        return craftJsonItemCategory.copy(i, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCategoryId() {
        return this.categoryId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getCategoryName() {
        return this.categoryName;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getIconCDN() {
        return this.iconCDN;
    }

    @NotNull
    public final CraftJsonItemCategory copy(int categoryId, @NotNull String categoryName, @NotNull String iconCDN) {
        Intrinsics.checkNotNullParameter(categoryName, "categoryName");
        Intrinsics.checkNotNullParameter(iconCDN, "iconCDN");
        return new CraftJsonItemCategory(categoryId, categoryName, iconCDN);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CraftJsonItemCategory)) {
            return false;
        }
        CraftJsonItemCategory craftJsonItemCategory = (CraftJsonItemCategory) other;
        return this.categoryId == craftJsonItemCategory.categoryId && Intrinsics.areEqual(this.categoryName, craftJsonItemCategory.categoryName) && Intrinsics.areEqual(this.iconCDN, craftJsonItemCategory.iconCDN);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.categoryId) * 31) + this.categoryName.hashCode()) * 31) + this.iconCDN.hashCode();
    }

    @NotNull
    public String toString() {
        return "CraftJsonItemCategory(categoryId=" + this.categoryId + ", categoryName=" + this.categoryName + ", iconCDN=" + this.iconCDN + ")";
    }

    public CraftJsonItemCategory(int i, @NotNull String categoryName, @NotNull String iconCDN) {
        Intrinsics.checkNotNullParameter(categoryName, "categoryName");
        Intrinsics.checkNotNullParameter(iconCDN, "iconCDN");
        this.categoryId = i;
        this.categoryName = categoryName;
        this.iconCDN = iconCDN;
    }

    public final int getCategoryId() {
        return this.categoryId;
    }

    @NotNull
    public final String getCategoryName() {
        return this.categoryName;
    }

    @NotNull
    public final String getIconCDN() {
        return this.iconCDN;
    }
}

