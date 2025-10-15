package com.blackhub.bronline.game.gui.craft.model.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonFilterCategoriesResponse.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/craft/model/response/CraftJsonItemCategoryFilter;", "", "filterId", "", "filterName", "", "color", "iconCDN", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getColor", "()Ljava/lang/String;", "getFilterId", "()I", "getFilterName", "getIconCDN", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
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
