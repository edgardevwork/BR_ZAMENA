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

