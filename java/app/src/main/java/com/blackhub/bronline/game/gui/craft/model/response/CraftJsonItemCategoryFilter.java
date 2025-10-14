package com.blackhub.bronline.game.gui.craft.model.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonFilterCategoriesResponse.kt */
@StabilityInferred(parameters = 1)

public final /* data */ class CraftJsonItemCategoryFilter {
    public static final int $stable = 0;

    @SerializedName("color")
    @NotNull
    public final String color;

    @SerializedName("filterId")
    public final int filterId;

    @SerializedName("filterName")
    @NotNull
    public final String filterName;

    @SerializedName("iconCDN")
    @Nullable
    public final String iconCDN;

    public static /* synthetic */ CraftJsonItemCategoryFilter copy$default(CraftJsonItemCategoryFilter craftJsonItemCategoryFilter, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = craftJsonItemCategoryFilter.filterId;
        }
        if ((i2 & 2) != 0) {
            str = craftJsonItemCategoryFilter.filterName;
        }
        if ((i2 & 4) != 0) {
            str2 = craftJsonItemCategoryFilter.color;
        }
        if ((i2 & 8) != 0) {
            str3 = craftJsonItemCategoryFilter.iconCDN;
        }
        return craftJsonItemCategoryFilter.copy(i, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getFilterId() {
        return this.filterId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getFilterName() {
        return this.filterName;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getIconCDN() {
        return this.iconCDN;
    }

    @NotNull
    public final CraftJsonItemCategoryFilter copy(int filterId, @NotNull String filterName, @NotNull String color, @Nullable String iconCDN) {
        Intrinsics.checkNotNullParameter(filterName, "filterName");
        Intrinsics.checkNotNullParameter(color, "color");
        return new CraftJsonItemCategoryFilter(filterId, filterName, color, iconCDN);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CraftJsonItemCategoryFilter)) {
            return false;
        }
        CraftJsonItemCategoryFilter craftJsonItemCategoryFilter = (CraftJsonItemCategoryFilter) other;
        return this.filterId == craftJsonItemCategoryFilter.filterId && Intrinsics.areEqual(this.filterName, craftJsonItemCategoryFilter.filterName) && Intrinsics.areEqual(this.color, craftJsonItemCategoryFilter.color) && Intrinsics.areEqual(this.iconCDN, craftJsonItemCategoryFilter.iconCDN);
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.filterId) * 31) + this.filterName.hashCode()) * 31) + this.color.hashCode()) * 31;
        String str = this.iconCDN;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "CraftJsonItemCategoryFilter(filterId=" + this.filterId + ", filterName=" + this.filterName + ", color=" + this.color + ", iconCDN=" + this.iconCDN + ")";
    }

    public CraftJsonItemCategoryFilter(int i, @NotNull String filterName, @NotNull String color, @Nullable String str) {
        Intrinsics.checkNotNullParameter(filterName, "filterName");
        Intrinsics.checkNotNullParameter(color, "color");
        this.filterId = i;
        this.filterName = filterName;
        this.color = color;
        this.iconCDN = str;
    }

    public final int getFilterId() {
        return this.filterId;
    }

    @NotNull
    public final String getFilterName() {
        return this.filterName;
    }

    @NotNull
    public final String getColor() {
        return this.color;
    }

    @Nullable
    public final String getIconCDN() {
        return this.iconCDN;
    }
}

