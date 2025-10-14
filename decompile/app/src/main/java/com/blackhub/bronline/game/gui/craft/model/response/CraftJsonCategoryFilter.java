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
@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/craft/model/response/CraftJsonCategoryFilter;", "", "categoryFilterId", "", "categoryFilterName", "", "filters", "", "Lcom/blackhub/bronline/game/gui/craft/model/response/CraftJsonItemCategoryFilter;", "(ILjava/lang/String;Ljava/util/List;)V", "getCategoryFilterId", "()I", "getCategoryFilterName", "()Ljava/lang/String;", "getFilters", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
