package com.blackhub.bronline.game.gui.craft.model.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftItemsJsonResponse.kt */
@StabilityInferred(parameters = 0)

public final /* data */ class CraftItemsJsonResponse {
    public static final int $stable = 8;

    @SerializedName(FirebaseAnalytics.Param.ITEMS)
    @NotNull
    public final List<CraftJsonItem> listOfCraftItems;

    @SerializedName("settings")
    @NotNull
    public final CraftJsonSettings settings;

    public CraftItemsJsonResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CraftItemsJsonResponse copy$default(CraftItemsJsonResponse craftItemsJsonResponse, CraftJsonSettings craftJsonSettings, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            craftJsonSettings = craftItemsJsonResponse.settings;
        }
        if ((i & 2) != 0) {
            list = craftItemsJsonResponse.listOfCraftItems;
        }
        return craftItemsJsonResponse.copy(craftJsonSettings, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CraftJsonSettings getSettings() {
        return this.settings;
    }

    @NotNull
    public final List<CraftJsonItem> component2() {
        return this.listOfCraftItems;
    }

    @NotNull
    public final CraftItemsJsonResponse copy(@NotNull CraftJsonSettings settings, @NotNull List<CraftJsonItem> listOfCraftItems) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(listOfCraftItems, "listOfCraftItems");
        return new CraftItemsJsonResponse(settings, listOfCraftItems);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CraftItemsJsonResponse)) {
            return false;
        }
        CraftItemsJsonResponse craftItemsJsonResponse = (CraftItemsJsonResponse) other;
        return Intrinsics.areEqual(this.settings, craftItemsJsonResponse.settings) && Intrinsics.areEqual(this.listOfCraftItems, craftItemsJsonResponse.listOfCraftItems);
    }

    public int hashCode() {
        return (this.settings.hashCode() * 31) + this.listOfCraftItems.hashCode();
    }

    @NotNull
    public String toString() {
        return "CraftItemsJsonResponse(settings=" + this.settings + ", listOfCraftItems=" + this.listOfCraftItems + ")";
    }

    public CraftItemsJsonResponse(@NotNull CraftJsonSettings settings, @NotNull List<CraftJsonItem> listOfCraftItems) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(listOfCraftItems, "listOfCraftItems");
        this.settings = settings;
        this.listOfCraftItems = listOfCraftItems;
    }

    public /* synthetic */ CraftItemsJsonResponse(CraftJsonSettings craftJsonSettings, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new CraftJsonSettings(0.0f, 1, null) : craftJsonSettings, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }

    @NotNull
    public final CraftJsonSettings getSettings() {
        return this.settings;
    }

    @NotNull
    public final List<CraftJsonItem> getListOfCraftItems() {
        return this.listOfCraftItems;
    }
}

