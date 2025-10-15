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
@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/craft/model/response/CommonFilterCategoriesResponse;", "", "listOfCraftCategoriesFilters", "", "Lcom/blackhub/bronline/game/gui/craft/model/response/CraftJsonCategoryFilter;", "(Ljava/util/List;)V", "getListOfCraftCategoriesFilters", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
