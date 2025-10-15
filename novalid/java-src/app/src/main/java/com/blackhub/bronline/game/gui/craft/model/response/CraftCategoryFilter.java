package com.blackhub.bronline.game.gui.craft.model.response;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftFilterCustom.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/craft/model/response/CraftCategoryFilter;", "", "categoryFilterId", "", "categoryFilterName", "", "filters", "", "Lcom/blackhub/bronline/game/gui/craft/model/response/CraftItemCategoryFilter;", "(ILjava/lang/String;Ljava/util/List;)V", "getCategoryFilterId", "()I", "getCategoryFilterName", "()Ljava/lang/String;", "getFilters", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
