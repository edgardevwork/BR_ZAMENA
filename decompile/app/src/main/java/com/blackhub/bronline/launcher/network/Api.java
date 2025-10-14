package com.blackhub.bronline.launcher.network;

import com.blackhub.bronline.game.gui.chooseserver.model.YoutuberAcc;
import com.blackhub.bronline.game.gui.craft.model.response.CommonFilterCategoriesResponse;
import com.blackhub.bronline.game.gui.craft.model.response.CraftCategoriesResponse;
import com.blackhub.bronline.game.gui.craft.model.response.CraftItemsJsonResponse;
import com.blackhub.bronline.game.gui.craft.model.response.MarketDeliveryFiltersResponse;
import com.blackhub.bronline.game.gui.donate.data.CarColorItem;
import com.blackhub.bronline.game.gui.donate.data.DonateItemList;
import com.blackhub.bronline.game.gui.familysystem.data.FamilySystemList;
import com.blackhub.bronline.game.gui.fractions.data.FractionQuestsObj;
import com.blackhub.bronline.game.gui.fractions.data.FractionsDocumentsObjList;
import com.blackhub.bronline.game.gui.fractions.data.FractionsShopList;
import com.blackhub.bronline.game.gui.inventory.data.AccessoriesResponse;
import com.blackhub.bronline.game.gui.menu.model.ButtonsConfigResponse;
import com.blackhub.bronline.game.gui.smieditor.data.SmiEditorBodyObj;
import com.blackhub.bronline.game.gui.smieditor.data.SmiList;
import com.blackhub.bronline.game.gui.socialaction.data.SocialInteractionList;
import com.blackhub.bronline.game.gui.spawnlocation.data.SpawnLocationList;
import com.blackhub.bronline.game.gui.tuning.data.TuneGuiScreenObj;
import com.blackhub.bronline.game.gui.tuning.data.TuneListObj;
import com.blackhub.bronline.game.gui.tuning.data.TuneVinylsObj;
import com.blackhub.bronline.game.model.remote.response.app.AppConfigResponse;
import com.blackhub.bronline.game.model.remote.response.app.AppVersionResponse;
import com.blackhub.bronline.game.model.remote.response.blackpass.BlackPassItems;
import com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsResponse;
import com.blackhub.bronline.game.model.remote.response.calendar.CalendarResponse;
import com.blackhub.bronline.game.model.remote.response.cases.CasesResponse;
import com.blackhub.bronline.game.model.remote.response.gifts.GiftsResponse;
import com.blackhub.bronline.game.model.remote.response.holidayevents.HolidayEventsResponse;
import com.blackhub.bronline.game.model.remote.response.marketplace.MarketplaceLimitsResponse;
import com.blackhub.bronline.game.model.remote.response.skins.SkinsResponse;
import com.blackhub.bronline.game.model.remote.response.tanpin.TanpinBannerDataResponse;
import com.blackhub.bronline.game.model.remote.response.upgradeobjectevent.UpgradeObjectAwardsResponse;
import com.blackhub.bronline.game.model.remote.response.vehicles.VehiclesDTO;
import com.blackhub.bronline.game.model.remote.response.videoplayer.PlayerResponse;
import com.blackhub.bronline.launcher.data.MyFile;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;

/* compiled from: Api.kt */
@Metadata(m7104d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H§@¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H§@¢\u0006\u0002\u0010\u0006J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H§@¢\u0006\u0002\u0010\u0006J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003H§@¢\u0006\u0002\u0010\u0006J\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003H§@¢\u0006\u0002\u0010\u0006J\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003H§@¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003H§@¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003H§@¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003H§@¢\u0006\u0002\u0010\u0006J\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0003H§@¢\u0006\u0002\u0010\u0006J\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0003H§@¢\u0006\u0002\u0010\u0006J\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0003H§@¢\u0006\u0002\u0010\u0006J\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0003H§@¢\u0006\u0002\u0010\u0006J\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0003H§@¢\u0006\u0002\u0010\u0006J\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0003H§@¢\u0006\u0002\u0010\u0006J\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0003H§@¢\u0006\u0002\u0010\u0006J\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0003H§@¢\u0006\u0002\u0010\u0006J\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0003H§@¢\u0006\u0002\u0010\u0006J\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0003H§@¢\u0006\u0002\u0010\u0006J\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0003H§@¢\u0006\u0002\u0010\u0006J\u0014\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u00180/H'J\u0014\u00101\u001a\b\u0012\u0004\u0012\u0002020\u0003H§@¢\u0006\u0002\u0010\u0006J\u0014\u00103\u001a\b\u0012\u0004\u0012\u0002040\u0003H§@¢\u0006\u0002\u0010\u0006J\u0014\u00105\u001a\b\u0012\u0004\u0012\u00020!0\u0003H§@¢\u0006\u0002\u0010\u0006J\u0014\u00106\u001a\b\u0012\u0004\u0012\u0002070\u0003H§@¢\u0006\u0002\u0010\u0006J\u0014\u00108\u001a\b\u0012\u0004\u0012\u0002090\u0003H§@¢\u0006\u0002\u0010\u0006J\u001a\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\u00180\u0003H§@¢\u0006\u0002\u0010\u0006J\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u0003H§@¢\u0006\u0002\u0010\u0006J\u0014\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u0003H§@¢\u0006\u0002\u0010\u0006J\u000e\u0010@\u001a\b\u0012\u0004\u0012\u00020B0AH'J\u0014\u0010C\u001a\b\u0012\u0004\u0012\u00020D0\u0003H§@¢\u0006\u0002\u0010\u0006J\u0014\u0010E\u001a\b\u0012\u0004\u0012\u00020F0\u0003H§@¢\u0006\u0002\u0010\u0006J$\u0010G\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020I0Hj\b\u0012\u0004\u0012\u00020I`J0\u0003H§@¢\u0006\u0002\u0010\u0006J$\u0010K\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020L0Hj\b\u0012\u0004\u0012\u00020L`J0\u0003H§@¢\u0006\u0002\u0010\u0006J\u0014\u0010M\u001a\b\u0012\u0004\u0012\u00020N0\u0003H§@¢\u0006\u0002\u0010\u0006J\u001a\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020P0\u00180\u0003H§@¢\u0006\u0002\u0010\u0006J\u001a\u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0\u00180\u0003H§@¢\u0006\u0002\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006SÀ\u0006\u0001"}, m7105d2 = {"Lcom/blackhub/bronline/launcher/network/Api;", "", "files", "Lretrofit2/Response;", "", "Lcom/blackhub/bronline/launcher/data/MyFile;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fractionDocumentsList", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionsDocumentsObjList;", "fractionQuestsObj", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionQuestsObj;", "fractionShopList", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionsShopList;", "getAppConfig", "Lcom/blackhub/bronline/game/model/remote/response/app/AppConfigResponse;", "getBlackPassItems", "Lcom/blackhub/bronline/game/model/remote/response/blackpass/BlackPassItems;", "getBpRewards", "Lcom/blackhub/bronline/game/model/remote/response/bprewards/BpRewardsResponse;", "getButtonsConfig", "Lcom/blackhub/bronline/game/gui/menu/model/ButtonsConfigResponse;", "getCalendarInfo", "Lcom/blackhub/bronline/game/model/remote/response/calendar/CalendarResponse;", "getCarColors", "", "Lcom/blackhub/bronline/game/gui/donate/data/CarColorItem;", "getCasesInfo", "Lcom/blackhub/bronline/game/model/remote/response/cases/CasesResponse;", "getCinematicData", "Lcom/blackhub/bronline/game/model/remote/response/videoplayer/PlayerResponse;", "getCraftItemCategories", "Lcom/blackhub/bronline/game/gui/craft/model/response/CraftCategoriesResponse;", "getCraftItemCategoriesFilters", "Lcom/blackhub/bronline/game/gui/craft/model/response/CommonFilterCategoriesResponse;", "getCraftItems", "Lcom/blackhub/bronline/game/gui/craft/model/response/CraftItemsJsonResponse;", "getDonateItems", "Lcom/blackhub/bronline/game/gui/donate/data/DonateItemList;", "getFamilySystemList", "Lcom/blackhub/bronline/game/gui/familysystem/data/FamilySystemList;", "getGifts", "Lcom/blackhub/bronline/game/model/remote/response/gifts/GiftsResponse;", "getHolidayEvents", "Lcom/blackhub/bronline/game/model/remote/response/holidayevents/HolidayEventsResponse;", "getItems", "Lcom/blackhub/bronline/game/gui/inventory/data/AccessoriesResponse;", "getListOfYoutubers", "Lretrofit2/Call;", "Lcom/blackhub/bronline/game/gui/chooseserver/model/YoutuberAcc;", "getMarketplaceConfiguration", "Lcom/blackhub/bronline/game/model/remote/response/marketplace/MarketplaceLimitsResponse;", "getMarketplaceDeliveryFilters", "Lcom/blackhub/bronline/game/gui/craft/model/response/MarketDeliveryFiltersResponse;", "getMarketplaceItemCategoriesFilters", "getRemoteAppVersion", "Lcom/blackhub/bronline/game/model/remote/response/app/AppVersionResponse;", "getSkins", "Lcom/blackhub/bronline/game/model/remote/response/skins/SkinsResponse;", "getSmiEditorBody", "Lcom/blackhub/bronline/game/gui/smieditor/data/SmiEditorBodyObj;", "getSmiList", "Lcom/blackhub/bronline/game/gui/smieditor/data/SmiList;", "getSocialList", "Lcom/blackhub/bronline/game/gui/socialaction/data/SocialInteractionList;", "getSpawnLocationList", "Lio/reactivex/rxjava3/core/Single;", "Lcom/blackhub/bronline/game/gui/spawnlocation/data/SpawnLocationList;", "getTanpinBannerData", "Lcom/blackhub/bronline/game/model/remote/response/tanpin/TanpinBannerDataResponse;", "getTuneItems", "Lcom/blackhub/bronline/game/gui/tuning/data/TuneListObj;", "getTuneScreens", "Ljava/util/ArrayList;", "Lcom/blackhub/bronline/game/gui/tuning/data/TuneGuiScreenObj;", "Lkotlin/collections/ArrayList;", "getTuneVinyls", "Lcom/blackhub/bronline/game/gui/tuning/data/TuneVinylsObj;", "getUpgradeObjectEventAwards", "Lcom/blackhub/bronline/game/model/remote/response/upgradeobjectevent/UpgradeObjectAwardsResponse;", "getVehicles", "Lcom/blackhub/bronline/game/model/remote/response/vehicles/VehiclesDTO;", "servers", "Lcom/blackhub/bronline/launcher/network/Server;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public interface Api {
    @GET("hash.json")
    @Nullable
    Object files(@NotNull Continuation<? super Response<List<MyFile>>> continuation);

    @GET("fractionMenuDocuments.json")
    @Nullable
    Object fractionDocumentsList(@NotNull Continuation<? super Response<FractionsDocumentsObjList>> continuation);

    @GET("fractionTask.json")
    @Nullable
    Object fractionQuestsObj(@NotNull Continuation<? super Response<FractionQuestsObj>> continuation);

    @GET("fractionMenuStore.json")
    @Nullable
    Object fractionShopList(@NotNull Continuation<? super Response<FractionsShopList>> continuation);

    @GET("app-config.json")
    @Nullable
    Object getAppConfig(@NotNull Continuation<? super Response<AppConfigResponse>> continuation);

    @GET("black-pass.json")
    @Nullable
    Object getBlackPassItems(@NotNull Continuation<? super Response<BlackPassItems>> continuation);

    @GET("awards.json")
    @Nullable
    Object getBpRewards(@NotNull Continuation<? super Response<BpRewardsResponse>> continuation);

    @GET("buttons-config.json")
    @Nullable
    Object getButtonsConfig(@NotNull Continuation<? super Response<ButtonsConfigResponse>> continuation);

    @GET("calendar.json")
    @Nullable
    Object getCalendarInfo(@NotNull Continuation<? super Response<CalendarResponse>> continuation);

    @GET("car-colors.json")
    @Nullable
    Object getCarColors(@NotNull Continuation<? super Response<List<CarColorItem>>> continuation);

    @GET("cases.json")
    @Nullable
    Object getCasesInfo(@NotNull Continuation<? super Response<CasesResponse>> continuation);

    @GET("cinematic.json")
    @Nullable
    Object getCinematicData(@NotNull Continuation<? super Response<PlayerResponse>> continuation);

    @GET("craft-item-categories.json")
    @Nullable
    Object getCraftItemCategories(@NotNull Continuation<? super Response<CraftCategoriesResponse>> continuation);

    @GET("craft-filter-categories.json")
    @Nullable
    Object getCraftItemCategoriesFilters(@NotNull Continuation<? super Response<CommonFilterCategoriesResponse>> continuation);

    @GET("craft.json")
    @Nullable
    Object getCraftItems(@NotNull Continuation<? super Response<CraftItemsJsonResponse>> continuation);

    @GET("donate-items.json")
    @Nullable
    Object getDonateItems(@NotNull Continuation<? super Response<DonateItemList>> continuation);

    @GET("family_system.json")
    @Nullable
    Object getFamilySystemList(@NotNull Continuation<? super Response<FamilySystemList>> continuation);

    @Deprecated(message = "Не используется")
    @GET("newyear-gifts.json")
    @Nullable
    Object getGifts(@NotNull Continuation<? super Response<GiftsResponse>> continuation);

    @GET("event.json")
    @Nullable
    Object getHolidayEvents(@NotNull Continuation<? super Response<HolidayEventsResponse>> continuation);

    @GET("inventory.json")
    @Nullable
    Object getItems(@NotNull Continuation<? super Response<AccessoriesResponse>> continuation);

    @GET("listOfYoutubers.json")
    @NotNull
    Call<List<YoutuberAcc>> getListOfYoutubers();

    @GET("market-vip-limits.json")
    @Nullable
    Object getMarketplaceConfiguration(@NotNull Continuation<? super Response<MarketplaceLimitsResponse>> continuation);

    @GET("market-delivery-filter.json")
    @Nullable
    Object getMarketplaceDeliveryFilters(@NotNull Continuation<? super Response<MarketDeliveryFiltersResponse>> continuation);

    @GET("market-filter-categories.json")
    @Nullable
    Object getMarketplaceItemCategoriesFilters(@NotNull Continuation<? super Response<CommonFilterCategoriesResponse>> continuation);

    @GET("app_info.json")
    @Nullable
    Object getRemoteAppVersion(@NotNull Continuation<? super Response<AppVersionResponse>> continuation);

    @GET("skins.json")
    @Nullable
    Object getSkins(@NotNull Continuation<? super Response<SkinsResponse>> continuation);

    @GET("smi_editor_body.json")
    @Nullable
    Object getSmiEditorBody(@NotNull Continuation<? super Response<List<SmiEditorBodyObj>>> continuation);

    @GET("cars-and-accessories.json")
    @Nullable
    Object getSmiList(@NotNull Continuation<? super Response<SmiList>> continuation);

    @GET("social-interaction.json")
    @Nullable
    Object getSocialList(@NotNull Continuation<? super Response<SocialInteractionList>> continuation);

    @GET("spawnLocation.json")
    @NotNull
    Single<SpawnLocationList> getSpawnLocationList();

    @GET("tanpin.json")
    @Nullable
    Object getTanpinBannerData(@NotNull Continuation<? super Response<TanpinBannerDataResponse>> continuation);

    @GET("tune-items.json")
    @Nullable
    Object getTuneItems(@NotNull Continuation<? super Response<TuneListObj>> continuation);

    @GET("tune-screens.json")
    @Nullable
    Object getTuneScreens(@NotNull Continuation<? super Response<ArrayList<TuneGuiScreenObj>>> continuation);

    @GET("tune-vinyls.json")
    @Nullable
    Object getTuneVinyls(@NotNull Continuation<? super Response<ArrayList<TuneVinylsObj>>> continuation);

    @Deprecated(message = "Не используется")
    @GET("newyear-awards.json")
    @Nullable
    Object getUpgradeObjectEventAwards(@NotNull Continuation<? super Response<UpgradeObjectAwardsResponse>> continuation);

    @GET("vehicles.json")
    @Nullable
    Object getVehicles(@NotNull Continuation<? super Response<List<VehiclesDTO>>> continuation);

    @GET("servers.json")
    @Nullable
    Object servers(@NotNull Continuation<? super Response<List<Server>>> continuation);
}
