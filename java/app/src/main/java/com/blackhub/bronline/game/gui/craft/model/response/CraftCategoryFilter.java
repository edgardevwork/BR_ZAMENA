package com.blackhub.bronline.game.gui.craft.model.response;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftFilterCustom.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final /* data */ class CraftCategoryFilter {
    public static final int $stable = 8;
    public final int categoryFilterId;

    @NotNull
    public final String categoryFilterName;

    @NotNull
    public final List<CraftItemCategoryFilter> filters;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CraftCategoryFilter copy$default(CraftCategoryFilter craftCategoryFilter, int i, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = craftCategoryFilter.categoryFilterId;
        }
        if ((i2 & 2) != 0) {
            str = craftCategoryFilter.categoryFilterName;
        }
        if ((i2 & 4) != 0) {
            list = craftCategoryFilter.filters;
        }
        return craftCategoryFilter.copy(i, str, list);
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
    public final List<CraftItemCategoryFilter> component3() {
        return this.filters;
    }

    @NotNull
    public final CraftCategoryFilter copy(int categoryFilterId, @NotNull String categoryFilterName, @NotNull List<CraftItemCategoryFilter> filters) {
        Intrinsics.checkNotNullParameter(categoryFilterName, "categoryFilterName");
        Intrinsics.checkNotNullParameter(filters, "filters");
        return new CraftCategoryFilter(categoryFilterId, categoryFilterName, filters);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CraftCategoryFilter)) {
            return false;
        }
        CraftCategoryFilter craftCategoryFilter = (CraftCategoryFilter) other;
        return this.categoryFilterId == craftCategoryFilter.categoryFilterId && Intrinsics.areEqual(this.categoryFilterName, craftCategoryFilter.categoryFilterName) && Intrinsics.areEqual(this.filters, craftCategoryFilter.filters);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.categoryFilterId) * 31) + this.categoryFilterName.hashCode()) * 31) + this.filters.hashCode();
    }

    @NotNull
    public String toString() {
        return "CraftCategoryFilter(categoryFilterId=" + this.categoryFilterId + ", categoryFilterName=" + this.categoryFilterName + ", filters=" + this.filters + ")";
    }

    public CraftCategoryFilter(int i, @NotNull String categoryFilterName, @NotNull List<CraftItemCategoryFilter> filters) {
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
    public final List<CraftItemCategoryFilter> getFilters() {
        return this.filters;
    }
}

