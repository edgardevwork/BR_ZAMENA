package com.blackhub.bronline.game.gui.craft.model.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonFilterCategoriesResponse.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final /* data */ class MarketDeliveryFiltersResponse {
    public static final int $stable = 8;

    @SerializedName("filters")
    @NotNull
    public final List<CraftJsonItemCategoryFilter> filters;

    public MarketDeliveryFiltersResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketDeliveryFiltersResponse copy$default(MarketDeliveryFiltersResponse marketDeliveryFiltersResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = marketDeliveryFiltersResponse.filters;
        }
        return marketDeliveryFiltersResponse.copy(list);
    }

    @NotNull
    public final List<CraftJsonItemCategoryFilter> component1() {
        return this.filters;
    }

    @NotNull
    public final MarketDeliveryFiltersResponse copy(@NotNull List<CraftJsonItemCategoryFilter> filters) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        return new MarketDeliveryFiltersResponse(filters);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MarketDeliveryFiltersResponse) && Intrinsics.areEqual(this.filters, ((MarketDeliveryFiltersResponse) other).filters);
    }

    public int hashCode() {
        return this.filters.hashCode();
    }

    @NotNull
    public String toString() {
        return "MarketDeliveryFiltersResponse(filters=" + this.filters + ")";
    }

    public MarketDeliveryFiltersResponse(@NotNull List<CraftJsonItemCategoryFilter> filters) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.filters = filters;
    }

    public /* synthetic */ MarketDeliveryFiltersResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }

    @NotNull
    public final List<CraftJsonItemCategoryFilter> getFilters() {
        return this.filters;
    }
}

