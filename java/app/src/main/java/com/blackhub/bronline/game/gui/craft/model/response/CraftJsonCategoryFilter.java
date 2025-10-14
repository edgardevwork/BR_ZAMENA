package com.blackhub.bronline.game.gui.craft.model.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonFilterCategoriesResponse.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final /* data */ class CraftJsonCategoryFilter {
    public static final int $stable = 8;

    @SerializedName("categoryFilterId")
    public final int categoryFilterId;

    @SerializedName("categoryFilterName")
    @NotNull
    public final String categoryFilterName;

    @SerializedName("filters")
    @NotNull
    public final List<CraftJsonItemCategoryFilter> filters;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CraftJsonCategoryFilter copy$default(CraftJsonCategoryFilter craftJsonCategoryFilter, int i, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = craftJsonCategoryFilter.categoryFilterId;
        }
        if ((i2 & 2) != 0) {
            str = craftJsonCategoryFilter.categoryFilterName;
        }
        if ((i2 & 4) != 0) {
            list = craftJsonCategoryFilter.filters;
        }
        return craftJsonCategoryFilter.copy(i, str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCategoryFilterId() {
        return this.categoryFilterId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getCategoryFilterName() {
        return this.categoryFilterName;
    }

    @NotNull
    public final List<CraftJsonItemCategoryFilter> component3() {
        return this.filters;
    }

    @NotNull
    public final CraftJsonCategoryFilter copy(int categoryFilterId, @NotNull String categoryFilterName, @NotNull List<CraftJsonItemCategoryFilter> filters) {
        Intrinsics.checkNotNullParameter(categoryFilterName, "categoryFilterName");
        Intrinsics.checkNotNullParameter(filters, "filters");
        return new CraftJsonCategoryFilter(categoryFilterId, categoryFilterName, filters);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CraftJsonCategoryFilter)) {
            return false;
        }
        CraftJsonCategoryFilter craftJsonCategoryFilter = (CraftJsonCategoryFilter) other;
        return this.categoryFilterId == craftJsonCategoryFilter.categoryFilterId && Intrinsics.areEqual(this.categoryFilterName, craftJsonCategoryFilter.categoryFilterName) && Intrinsics.areEqual(this.filters, craftJsonCategoryFilter.filters);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.categoryFilterId) * 31) + this.categoryFilterName.hashCode()) * 31) + this.filters.hashCode();
    }

    @NotNull
    public String toString() {
        return "CraftJsonCategoryFilter(categoryFilterId=" + this.categoryFilterId + ", categoryFilterName=" + this.categoryFilterName + ", filters=" + this.filters + ")";
    }

    public CraftJsonCategoryFilter(int i, @NotNull String categoryFilterName, @NotNull List<CraftJsonItemCategoryFilter> filters) {
        Intrinsics.checkNotNullParameter(categoryFilterName, "categoryFilterName");
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.categoryFilterId = i;
        this.categoryFilterName = categoryFilterName;
        this.filters = filters;
    }

    public final int getCategoryFilterId() {
        return this.categoryFilterId;
    }

    @NotNull
    public final String getCategoryFilterName() {
        return this.categoryFilterName;
    }

    @NotNull
    public final List<CraftJsonItemCategoryFilter> getFilters() {
        return this.filters;
    }
}

