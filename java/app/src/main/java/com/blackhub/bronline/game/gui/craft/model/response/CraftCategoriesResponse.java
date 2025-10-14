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

/* compiled from: CraftCategoriesResponse.kt */
@StabilityInferred(parameters = 0)

public final /* data */ class CraftCategoriesResponse {
    public static final int $stable = 8;

    @SerializedName("categories")
    @NotNull
    public final List<CraftJsonItemCategory> listOfCraftCategories;

    public CraftCategoriesResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CraftCategoriesResponse copy$default(CraftCategoriesResponse craftCategoriesResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = craftCategoriesResponse.listOfCraftCategories;
        }
        return craftCategoriesResponse.copy(list);
    }

    @NotNull
    public final List<CraftJsonItemCategory> component1() {
        return this.listOfCraftCategories;
    }

    @NotNull
    public final CraftCategoriesResponse copy(@NotNull List<CraftJsonItemCategory> listOfCraftCategories) {
        Intrinsics.checkNotNullParameter(listOfCraftCategories, "listOfCraftCategories");
        return new CraftCategoriesResponse(listOfCraftCategories);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CraftCategoriesResponse) && Intrinsics.areEqual(this.listOfCraftCategories, ((CraftCategoriesResponse) other).listOfCraftCategories);
    }

    public int hashCode() {
        return this.listOfCraftCategories.hashCode();
    }

    @NotNull
    public String toString() {
        return "CraftCategoriesResponse(listOfCraftCategories=" + this.listOfCraftCategories + ")";
    }

    public CraftCategoriesResponse(@NotNull List<CraftJsonItemCategory> listOfCraftCategories) {
        Intrinsics.checkNotNullParameter(listOfCraftCategories, "listOfCraftCategories");
        this.listOfCraftCategories = listOfCraftCategories;
    }

    public /* synthetic */ CraftCategoriesResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }

    @NotNull
    public final List<CraftJsonItemCategory> getListOfCraftCategories() {
        return this.listOfCraftCategories;
    }
}

