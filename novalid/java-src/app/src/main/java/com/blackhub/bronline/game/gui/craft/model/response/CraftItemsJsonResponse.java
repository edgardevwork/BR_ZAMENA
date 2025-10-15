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
@Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/craft/model/response/CraftItemsJsonResponse;", "", "settings", "Lcom/blackhub/bronline/game/gui/craft/model/response/CraftJsonSettings;", "listOfCraftItems", "", "Lcom/blackhub/bronline/game/gui/craft/model/response/CraftJsonItem;", "(Lcom/blackhub/bronline/game/gui/craft/model/response/CraftJsonSettings;Ljava/util/List;)V", "getListOfCraftItems", "()Ljava/util/List;", "getSettings", "()Lcom/blackhub/bronline/game/gui/craft/model/response/CraftJsonSettings;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
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
