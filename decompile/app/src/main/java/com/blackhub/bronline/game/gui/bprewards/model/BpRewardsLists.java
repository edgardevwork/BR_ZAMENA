package com.blackhub.bronline.game.gui.bprewards.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsAwardsDto;
import com.blackhub.bronline.game.model.remote.response.skins.SkinsDTO;
import com.blackhub.bronline.game.model.remote.response.vehicles.VehiclesDTO;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BpRewardsLists.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003¢\u0006\u0002\u0010\u0012J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003HÆ\u0003Jy\u0010\"\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\rHÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014¨\u0006)"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/bprewards/model/BpRewardsLists;", "", "invItemsFromJson", "", "Lcom/blackhub/bronline/game/gui/inventory/data/InvItems;", "listWithItems", "Lcom/blackhub/bronline/game/gui/bprewards/model/BpRewardsServerItemModel;", "listWithImageModels", "Lcom/blackhub/bronline/game/gui/bprewards/model/BpRewardsImageModel;", "listOfAwardsTypes", "Lcom/blackhub/bronline/game/model/remote/response/bprewards/BpRewardsAwardsDto;", "listOfAlarmsForButtons", "", "", "vehiclesList", "Lcom/blackhub/bronline/game/model/remote/response/vehicles/VehiclesDTO;", "skinsList", "Lcom/blackhub/bronline/game/model/remote/response/skins/SkinsDTO;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getInvItemsFromJson", "()Ljava/util/List;", "getListOfAlarmsForButtons", "getListOfAwardsTypes", "getListWithImageModels", "getListWithItems", "getSkinsList", "getVehiclesList", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BpRewardsLists {
    public static final int $stable = 8;

    @NotNull
    public final List<InvItems> invItemsFromJson;

    @NotNull
    public final List<Integer> listOfAlarmsForButtons;

    @NotNull
    public final List<BpRewardsAwardsDto> listOfAwardsTypes;

    @NotNull
    public final List<BpRewardsImageModel> listWithImageModels;

    @NotNull
    public final List<BpRewardsServerItemModel> listWithItems;

    @NotNull
    public final List<SkinsDTO> skinsList;

    @NotNull
    public final List<VehiclesDTO> vehiclesList;

    public BpRewardsLists() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ BpRewardsLists copy$default(BpRewardsLists bpRewardsLists, List list, List list2, List list3, List list4, List list5, List list6, List list7, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bpRewardsLists.invItemsFromJson;
        }
        if ((i & 2) != 0) {
            list2 = bpRewardsLists.listWithItems;
        }
        List list8 = list2;
        if ((i & 4) != 0) {
            list3 = bpRewardsLists.listWithImageModels;
        }
        List list9 = list3;
        if ((i & 8) != 0) {
            list4 = bpRewardsLists.listOfAwardsTypes;
        }
        List list10 = list4;
        if ((i & 16) != 0) {
            list5 = bpRewardsLists.listOfAlarmsForButtons;
        }
        List list11 = list5;
        if ((i & 32) != 0) {
            list6 = bpRewardsLists.vehiclesList;
        }
        List list12 = list6;
        if ((i & 64) != 0) {
            list7 = bpRewardsLists.skinsList;
        }
        return bpRewardsLists.copy(list, list8, list9, list10, list11, list12, list7);
    }

    @NotNull
    public final List<InvItems> component1() {
        return this.invItemsFromJson;
    }

    @NotNull
    public final List<BpRewardsServerItemModel> component2() {
        return this.listWithItems;
    }

    @NotNull
    public final List<BpRewardsImageModel> component3() {
        return this.listWithImageModels;
    }

    @NotNull
    public final List<BpRewardsAwardsDto> component4() {
        return this.listOfAwardsTypes;
    }

    @NotNull
    public final List<Integer> component5() {
        return this.listOfAlarmsForButtons;
    }

    @NotNull
    public final List<VehiclesDTO> component6() {
        return this.vehiclesList;
    }

    @NotNull
    public final List<SkinsDTO> component7() {
        return this.skinsList;
    }

    @NotNull
    public final BpRewardsLists copy(@NotNull List<InvItems> invItemsFromJson, @NotNull List<BpRewardsServerItemModel> listWithItems, @NotNull List<BpRewardsImageModel> listWithImageModels, @NotNull List<BpRewardsAwardsDto> listOfAwardsTypes, @NotNull List<Integer> listOfAlarmsForButtons, @NotNull List<VehiclesDTO> vehiclesList, @NotNull List<SkinsDTO> skinsList) {
        Intrinsics.checkNotNullParameter(invItemsFromJson, "invItemsFromJson");
        Intrinsics.checkNotNullParameter(listWithItems, "listWithItems");
        Intrinsics.checkNotNullParameter(listWithImageModels, "listWithImageModels");
        Intrinsics.checkNotNullParameter(listOfAwardsTypes, "listOfAwardsTypes");
        Intrinsics.checkNotNullParameter(listOfAlarmsForButtons, "listOfAlarmsForButtons");
        Intrinsics.checkNotNullParameter(vehiclesList, "vehiclesList");
        Intrinsics.checkNotNullParameter(skinsList, "skinsList");
        return new BpRewardsLists(invItemsFromJson, listWithItems, listWithImageModels, listOfAwardsTypes, listOfAlarmsForButtons, vehiclesList, skinsList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BpRewardsLists)) {
            return false;
        }
        BpRewardsLists bpRewardsLists = (BpRewardsLists) other;
        return Intrinsics.areEqual(this.invItemsFromJson, bpRewardsLists.invItemsFromJson) && Intrinsics.areEqual(this.listWithItems, bpRewardsLists.listWithItems) && Intrinsics.areEqual(this.listWithImageModels, bpRewardsLists.listWithImageModels) && Intrinsics.areEqual(this.listOfAwardsTypes, bpRewardsLists.listOfAwardsTypes) && Intrinsics.areEqual(this.listOfAlarmsForButtons, bpRewardsLists.listOfAlarmsForButtons) && Intrinsics.areEqual(this.vehiclesList, bpRewardsLists.vehiclesList) && Intrinsics.areEqual(this.skinsList, bpRewardsLists.skinsList);
    }

    public int hashCode() {
        return (((((((((((this.invItemsFromJson.hashCode() * 31) + this.listWithItems.hashCode()) * 31) + this.listWithImageModels.hashCode()) * 31) + this.listOfAwardsTypes.hashCode()) * 31) + this.listOfAlarmsForButtons.hashCode()) * 31) + this.vehiclesList.hashCode()) * 31) + this.skinsList.hashCode();
    }

    @NotNull
    public String toString() {
        return "BpRewardsLists(invItemsFromJson=" + this.invItemsFromJson + ", listWithItems=" + this.listWithItems + ", listWithImageModels=" + this.listWithImageModels + ", listOfAwardsTypes=" + this.listOfAwardsTypes + ", listOfAlarmsForButtons=" + this.listOfAlarmsForButtons + ", vehiclesList=" + this.vehiclesList + ", skinsList=" + this.skinsList + ")";
    }

    public BpRewardsLists(@NotNull List<InvItems> invItemsFromJson, @NotNull List<BpRewardsServerItemModel> listWithItems, @NotNull List<BpRewardsImageModel> listWithImageModels, @NotNull List<BpRewardsAwardsDto> listOfAwardsTypes, @NotNull List<Integer> listOfAlarmsForButtons, @NotNull List<VehiclesDTO> vehiclesList, @NotNull List<SkinsDTO> skinsList) {
        Intrinsics.checkNotNullParameter(invItemsFromJson, "invItemsFromJson");
        Intrinsics.checkNotNullParameter(listWithItems, "listWithItems");
        Intrinsics.checkNotNullParameter(listWithImageModels, "listWithImageModels");
        Intrinsics.checkNotNullParameter(listOfAwardsTypes, "listOfAwardsTypes");
        Intrinsics.checkNotNullParameter(listOfAlarmsForButtons, "listOfAlarmsForButtons");
        Intrinsics.checkNotNullParameter(vehiclesList, "vehiclesList");
        Intrinsics.checkNotNullParameter(skinsList, "skinsList");
        this.invItemsFromJson = invItemsFromJson;
        this.listWithItems = listWithItems;
        this.listWithImageModels = listWithImageModels;
        this.listOfAwardsTypes = listOfAwardsTypes;
        this.listOfAlarmsForButtons = listOfAlarmsForButtons;
        this.vehiclesList = vehiclesList;
        this.skinsList = skinsList;
    }

    public /* synthetic */ BpRewardsLists(List list, List list2, List list3, List list4, List list5, List list6, List list7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3, (i & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list4, (i & 16) != 0 ? new ArrayList() : list5, (i & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list6, (i & 64) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list7);
    }

    @NotNull
    public final List<InvItems> getInvItemsFromJson() {
        return this.invItemsFromJson;
    }

    @NotNull
    public final List<BpRewardsServerItemModel> getListWithItems() {
        return this.listWithItems;
    }

    @NotNull
    public final List<BpRewardsImageModel> getListWithImageModels() {
        return this.listWithImageModels;
    }

    @NotNull
    public final List<BpRewardsAwardsDto> getListOfAwardsTypes() {
        return this.listOfAwardsTypes;
    }

    @NotNull
    public final List<Integer> getListOfAlarmsForButtons() {
        return this.listOfAlarmsForButtons;
    }

    @NotNull
    public final List<VehiclesDTO> getVehiclesList() {
        return this.vehiclesList;
    }

    @NotNull
    public final List<SkinsDTO> getSkinsList() {
        return this.skinsList;
    }
}
