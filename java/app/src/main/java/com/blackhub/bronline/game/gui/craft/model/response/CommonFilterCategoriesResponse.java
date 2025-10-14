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
public final /* data */ class CommonFilterCategoriesResponse {
    public static final int $stable = 8;

    @SerializedName("categoriesFilters")
    @NotNull
    public final List<CraftJsonCategoryFilter> listOfCraftCategoriesFilters;

    public CommonFilterCategoriesResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommonFilterCategoriesResponse copy$default(CommonFilterCategoriesResponse commonFilterCategoriesResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = commonFilterCategoriesResponse.listOfCraftCategoriesFilters;
        }
        return commonFilterCategoriesResponse.copy(list);
    }

    @NotNull
    public final List<CraftJsonCategoryFilter> component1() {
        return this.listOfCraftCategoriesFilters;
    }

    @NotNull
    public final CommonFilterCategoriesResponse copy(@NotNull List<CraftJsonCategoryFilter> listOfCraftCategoriesFilters) {
        Intrinsics.checkNotNullParameter(listOfCraftCategoriesFilters, "listOfCraftCategoriesFilters");
        return new CommonFilterCategoriesResponse(listOfCraftCategoriesFilters);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CommonFilterCategoriesResponse) && Intrinsics.areEqual(this.listOfCraftCategoriesFilters, ((CommonFilterCategoriesResponse) other).listOfCraftCategoriesFilters);
    }

    public int hashCode() {
        return this.listOfCraftCategoriesFilters.hashCode();
    }

    @NotNull
    public String toString() {
        return "CommonFilterCategoriesResponse(listOfCraftCategoriesFilters=" + this.listOfCraftCategoriesFilters + ")";
    }

    public CommonFilterCategoriesResponse(@NotNull List<CraftJsonCategoryFilter> listOfCraftCategoriesFilters) {
        Intrinsics.checkNotNullParameter(listOfCraftCategoriesFilters, "listOfCraftCategoriesFilters");
        this.listOfCraftCategoriesFilters = listOfCraftCategoriesFilters;
    }

    public /* synthetic */ CommonFilterCategoriesResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }

    @NotNull
    public final List<CraftJsonCategoryFilter> getListOfCraftCategoriesFilters() {
        return this.listOfCraftCategoriesFilters;
    }
}

