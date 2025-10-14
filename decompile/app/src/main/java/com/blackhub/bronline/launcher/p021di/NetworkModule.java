package com.blackhub.bronline.launcher.p021di;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.BuildConfig;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.constants.LogTagConstants;
import com.blackhub.bronline.game.core.network.JNIActivityActionWithJSON;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.activetask.ActiveTaskActionWithJSON;
import com.blackhub.bronline.game.gui.admintools.AdminToolsActionWithJSON;
import com.blackhub.bronline.game.gui.blackpass.network.BlackPassActionWithJSON;
import com.blackhub.bronline.game.gui.blackpassbanner.network.BlackPassBannerActionsWithJson;
import com.blackhub.bronline.game.gui.bprewards.BpRewardsActionWithJSON;
import com.blackhub.bronline.game.gui.brsimbanner.BrSimBannerActionsWithJson;
import com.blackhub.bronline.game.gui.calendar.network.CalendarActionWithJSON;
import com.blackhub.bronline.game.gui.cases.network.CasesActionWithJSON;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerActionWithJSON;
import com.blackhub.bronline.game.gui.chat.network.ChatActionsWithJson;
import com.blackhub.bronline.game.gui.clicker.network.ClickerActionsWithJson;
import com.blackhub.bronline.game.gui.craft.CraftActionWithJSON;
import com.blackhub.bronline.game.gui.donate.network.DonateActionWithJSON;
import com.blackhub.bronline.game.gui.drivingschool.network.DrivingSchoolActionsWithJSON;
import com.blackhub.bronline.game.gui.electric.network.ElectricActionWithJSON;
import com.blackhub.bronline.game.gui.entertainmentsystem.network.EntertainmentSystemActionsWithJSON;
import com.blackhub.bronline.game.gui.fishing.FishingActionWithJSON;
import com.blackhub.bronline.game.gui.fractions.network.FractionActionsWithJSON;
import com.blackhub.bronline.game.gui.fuelfill.network.FuelFillActionWithJSON;
import com.blackhub.bronline.game.gui.gasmangame.network.GasmanActionsWithJson;
import com.blackhub.bronline.game.gui.gifts.GiftsActionWithJSON;
import com.blackhub.bronline.game.gui.halloweenaward.HalloweenAwardActionWithJSON;
import com.blackhub.bronline.game.gui.holidayevents.HolidayEventsActionsWithJSON;
import com.blackhub.bronline.game.gui.interactionwithnpc.InteractionWithNpcActionWithJSON;
import com.blackhub.bronline.game.gui.marketplace.MarketplaceActionWithJson;
import com.blackhub.bronline.game.gui.menu.network.MenuActionsWithJson;
import com.blackhub.bronline.game.gui.menupausesettingandmap.network.NewMenuActionWithJSON;
import com.blackhub.bronline.game.gui.minigameshelper.MiniGamesHelperWithJSON;
import com.blackhub.bronline.game.gui.moduledialog.network.ModuleDialogActionsWithJson;
import com.blackhub.bronline.game.gui.notification.network.NotificationActionWithJSON;
import com.blackhub.bronline.game.gui.panelinfo.PanelInfoActionWithJSON;
import com.blackhub.bronline.game.gui.plates.PlatesActionWithJSON;
import com.blackhub.bronline.game.gui.playerslist.network.PlayersListActionWithJson;
import com.blackhub.bronline.game.gui.radialmenuforcar.netrowk.RadialMenuActionWithJSON;
import com.blackhub.bronline.game.gui.rateapp.network.RateAppActionWithJson;
import com.blackhub.bronline.game.gui.rating.RatingActionWithJson;
import com.blackhub.bronline.game.gui.rent.RentActionWithJSON;
import com.blackhub.bronline.game.gui.smieditor.network.SmiEditorActionWithJSON;
import com.blackhub.bronline.game.gui.socialnetworklink.network.SocialNetworkActionWithJSON;
import com.blackhub.bronline.game.gui.spawnlocation.network.SpawnLocationActionsWithJson;
import com.blackhub.bronline.game.gui.spawnlocation.network.SpawnLocationRepository;
import com.blackhub.bronline.game.gui.spawnlocation.network.SpawnLocationRepositoryImpl;
import com.blackhub.bronline.game.gui.tanpinbanner.TanpinBannerActionWithJSON;
import com.blackhub.bronline.game.gui.taxi.TaxiActionWithJSON;
import com.blackhub.bronline.game.gui.taximap.TaxiMapActionWithJSON;
import com.blackhub.bronline.game.gui.taxiorder.TaxiOrderActionWithJSON;
import com.blackhub.bronline.game.gui.taxirating.TaxiRatingActionWithJSON;
import com.blackhub.bronline.game.gui.tuning.CostCalculation;
import com.blackhub.bronline.game.gui.tuning.network.TuningActionWithJSON;
import com.blackhub.bronline.game.gui.tutorialhints.TutorialHintActionWithJSON;
import com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventActionWithJSON;
import com.blackhub.bronline.game.gui.videoplayer.VideoPlayerActionWithJson;
import com.blackhub.bronline.game.gui.woundsystem.network.ActionsWithJSON;
import com.blackhub.bronline.game.gui.youtubeplayer.YoutubePlayerActionWithJSON;
import com.blackhub.bronline.launcher.Settings;
import com.blackhub.bronline.launcher.network.Api;
import com.blackhub.bronline.launcher.network.PaymentApi;
import com.blackhub.bronline.launcher.network.UserAgentInterceptor;
import com.google.gson.GsonBuilder;
import dagger.Module;
import dagger.Provides;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Authenticator;
import okhttp3.Credentials;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/* compiled from: NetworkModule.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000\u0082\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u000bH\u0007J\b\u0010\u0014\u001a\u00020\u000bH\u0007J\b\u0010\u0015\u001a\u00020\u000bH\u0007J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\b\u0010\u0018\u001a\u00020\u0019H\u0007J\b\u0010\u001a\u001a\u00020\u001bH\u0007J\b\u0010\u001c\u001a\u00020\u001dH\u0007J\b\u0010\u001e\u001a\u00020\u001fH\u0007J\b\u0010 \u001a\u00020!H\u0007J\b\u0010\"\u001a\u00020#H\u0007J\b\u0010$\u001a\u00020%H\u0007J\b\u0010&\u001a\u00020'H\u0007J\b\u0010(\u001a\u00020\u000bH\u0007J\b\u0010)\u001a\u00020*H\u0007J\b\u0010+\u001a\u00020,H\u0007J\b\u0010-\u001a\u00020.H\u0007J\b\u0010/\u001a\u000200H\u0007J\b\u00101\u001a\u000202H\u0007J\b\u00103\u001a\u000204H\u0007J\b\u00105\u001a\u000206H\u0007J\b\u00107\u001a\u000208H\u0007J\b\u00109\u001a\u00020:H\u0007J\b\u0010;\u001a\u00020<H\u0007J\b\u0010=\u001a\u00020>H\u0007J\b\u0010?\u001a\u00020@H\u0007J\b\u0010A\u001a\u00020BH\u0007J\b\u0010C\u001a\u00020DH\u0007J\b\u0010E\u001a\u00020FH\u0007J\b\u0010G\u001a\u00020HH\u0007J\b\u0010I\u001a\u00020JH\u0007J\b\u0010K\u001a\u00020LH\u0007J\b\u0010M\u001a\u00020NH\u0007J\b\u0010O\u001a\u00020PH\u0007J\b\u0010Q\u001a\u00020RH\u0007J\b\u0010S\u001a\u00020TH\u0007J\b\u0010U\u001a\u00020VH\u0007J\b\u0010W\u001a\u00020XH\u0007J\b\u0010Y\u001a\u00020ZH\u0007J\b\u0010[\u001a\u00020\\H\u0007J\b\u0010]\u001a\u00020^H\u0007J\b\u0010_\u001a\u00020`H\u0007J\b\u0010a\u001a\u00020bH\u0007J\b\u0010c\u001a\u00020dH\u0007J\b\u0010e\u001a\u00020fH\u0007J\b\u0010g\u001a\u00020hH\u0007J\b\u0010i\u001a\u00020jH\u0007J\b\u0010k\u001a\u00020lH\u0007J\b\u0010m\u001a\u00020nH\u0007J\b\u0010o\u001a\u00020pH\u0007J\b\u0010q\u001a\u00020rH\u0007J\b\u0010s\u001a\u00020tH\u0007J\b\u0010u\u001a\u00020vH\u0007J\b\u0010w\u001a\u00020xH\u0007J\b\u0010y\u001a\u00020zH\u0007J\b\u0010{\u001a\u00020|H\u0007J\b\u0010}\u001a\u00020~H\u0007J\t\u0010\u007f\u001a\u00030\u0080\u0001H\u0007J\n\u0010\u0081\u0001\u001a\u00030\u0082\u0001H\u0007¨\u0006\u0083\u0001"}, m7105d2 = {"Lcom/blackhub/bronline/launcher/di/NetworkModule;", "", "()V", "createAuthenticator", "Lokhttp3/Authenticator;", "credentials", "", "createOkHttpClientBuilder", "Lokhttp3/OkHttpClient$Builder;", "authenticator", "createRetrofit", "Lcom/blackhub/bronline/launcher/network/Api;", "okHttpClient", "Lokhttp3/OkHttpClient;", "baseUrl", "provideActiveTaskActionWithJSON", "Lcom/blackhub/bronline/game/gui/activetask/ActiveTaskActionWithJSON;", "provideAdminToolsActionWithJSON", "Lcom/blackhub/bronline/game/gui/admintools/AdminToolsActionWithJSON;", "provideApiService", "provideBackupApiService", "provideBackupCdnApiService", "provideBillingService", "Lcom/blackhub/bronline/launcher/network/PaymentApi;", "provideBlackPassActionWithJSON", "Lcom/blackhub/bronline/game/gui/blackpass/network/BlackPassActionWithJSON;", "provideBlackPassBannerActionsWithJson", "Lcom/blackhub/bronline/game/gui/blackpassbanner/network/BlackPassBannerActionsWithJson;", "provideBpRewardsActionWithJSON", "Lcom/blackhub/bronline/game/gui/bprewards/BpRewardsActionWithJSON;", "provideBrDialogMenuActionsWithJson", "Lcom/blackhub/bronline/game/gui/menu/network/MenuActionsWithJson;", "provideBrSimBannerActionsWithJson", "Lcom/blackhub/bronline/game/gui/brsimbanner/BrSimBannerActionsWithJson;", "provideCalendarActionWithJSON", "Lcom/blackhub/bronline/game/gui/calendar/network/CalendarActionWithJSON;", "provideCasesActionWithJSON", "Lcom/blackhub/bronline/game/gui/cases/network/CasesActionWithJSON;", "provideCatchStreamerActionWithJSON", "Lcom/blackhub/bronline/game/gui/catchstreamer/CatchStreamerActionWithJSON;", "provideCdnApiService", "provideChatActionsWithJSON", "Lcom/blackhub/bronline/game/gui/chat/network/ChatActionsWithJson;", "provideClickerActionsWithJSON", "Lcom/blackhub/bronline/game/gui/clicker/network/ClickerActionsWithJson;", "provideCraftActionWithJSON", "Lcom/blackhub/bronline/game/gui/craft/CraftActionWithJSON;", "provideDonateActionWithJSON", "Lcom/blackhub/bronline/game/gui/donate/network/DonateActionWithJSON;", "provideDrivingSchoolActionWithJSON", "Lcom/blackhub/bronline/game/gui/drivingschool/network/DrivingSchoolActionsWithJSON;", "provideElectricActionWithJSON", "Lcom/blackhub/bronline/game/gui/electric/network/ElectricActionWithJSON;", "provideEntertainmentSystemActionsWithJSON", "Lcom/blackhub/bronline/game/gui/entertainmentsystem/network/EntertainmentSystemActionsWithJSON;", "provideErrorNotification", "Lcom/blackhub/bronline/game/common/LocalNotification;", "provideFishingActionWithJSON", "Lcom/blackhub/bronline/game/gui/fishing/FishingActionWithJSON;", "provideFractionActionsWithJSON", "Lcom/blackhub/bronline/game/gui/fractions/network/FractionActionsWithJSON;", "provideFuelFullActionWithJSON", "Lcom/blackhub/bronline/game/gui/fuelfill/network/FuelFillActionWithJSON;", "provideGasmanActionWithJson", "Lcom/blackhub/bronline/game/gui/gasmangame/network/GasmanActionsWithJson;", "provideGiftsActionWithJSON", "Lcom/blackhub/bronline/game/gui/gifts/GiftsActionWithJSON;", "provideHalloweenAwardActionWithJSON", "Lcom/blackhub/bronline/game/gui/halloweenaward/HalloweenAwardActionWithJSON;", "provideHolidayEventsActionsWithJSON", "Lcom/blackhub/bronline/game/gui/holidayevents/HolidayEventsActionsWithJSON;", "provideInteractionWithNpcActionWithJSON", "Lcom/blackhub/bronline/game/gui/interactionwithnpc/InteractionWithNpcActionWithJSON;", "provideJNIActivityActionWithJSON", "Lcom/blackhub/bronline/game/core/network/JNIActivityActionWithJSON;", "provideMarketplaceActionWithJSON", "Lcom/blackhub/bronline/game/gui/marketplace/MarketplaceActionWithJson;", "provideMiniGamesHelperActionWithJSON", "Lcom/blackhub/bronline/game/gui/minigameshelper/MiniGamesHelperWithJSON;", "provideModuleDialogActionsWithJSON", "Lcom/blackhub/bronline/game/gui/moduledialog/network/ModuleDialogActionsWithJson;", "provideNewMenuActionWithJSON", "Lcom/blackhub/bronline/game/gui/menupausesettingandmap/network/NewMenuActionWithJSON;", "provideNotificationActionWithJSON", "Lcom/blackhub/bronline/game/gui/notification/network/NotificationActionWithJSON;", "providePanelInfoActionWithJSON", "Lcom/blackhub/bronline/game/gui/panelinfo/PanelInfoActionWithJSON;", "providePlatesActionWithJSON", "Lcom/blackhub/bronline/game/gui/plates/PlatesActionWithJSON;", "providePlayersListActionWithJson", "Lcom/blackhub/bronline/game/gui/playerslist/network/PlayersListActionWithJson;", "provideRadialMenuActionWithJSON", "Lcom/blackhub/bronline/game/gui/radialmenuforcar/netrowk/RadialMenuActionWithJSON;", "provideRateAppActionWithJSON", "Lcom/blackhub/bronline/game/gui/rateapp/network/RateAppActionWithJson;", "provideRatingActionWithJson", "Lcom/blackhub/bronline/game/gui/rating/RatingActionWithJson;", "provideRentActionWithJSON", "Lcom/blackhub/bronline/game/gui/rent/RentActionWithJSON;", "provideSmiEditorActionWithJSON", "Lcom/blackhub/bronline/game/gui/smieditor/network/SmiEditorActionWithJSON;", "provideSocialNetworkActionWithJSON", "Lcom/blackhub/bronline/game/gui/socialnetworklink/network/SocialNetworkActionWithJSON;", "provideSpawnLocationActionsWithJson", "Lcom/blackhub/bronline/game/gui/spawnlocation/network/SpawnLocationActionsWithJson;", "provideSpawnLocationRepository", "Lcom/blackhub/bronline/game/gui/spawnlocation/network/SpawnLocationRepository;", "provideTanpinBannerActionWithJSON", "Lcom/blackhub/bronline/game/gui/tanpinbanner/TanpinBannerActionWithJSON;", "provideTaxiActionWithJSON", "Lcom/blackhub/bronline/game/gui/taxi/TaxiActionWithJSON;", "provideTaxiMapActionWithJSON", "Lcom/blackhub/bronline/game/gui/taximap/TaxiMapActionWithJSON;", "provideTaxiOrderActionWithJSON", "Lcom/blackhub/bronline/game/gui/taxiorder/TaxiOrderActionWithJSON;", "provideTaxiRatingActionWithJSON", "Lcom/blackhub/bronline/game/gui/taxirating/TaxiRatingActionWithJSON;", "provideTuningActionWithJSON", "Lcom/blackhub/bronline/game/gui/tuning/network/TuningActionWithJSON;", "provideTuningCostCalculation", "Lcom/blackhub/bronline/game/gui/tuning/CostCalculation;", "provideTutorialHintActionWithJSON", "Lcom/blackhub/bronline/game/gui/tutorialhints/TutorialHintActionWithJSON;", "provideUpgradeObjectActionWithJSON", "Lcom/blackhub/bronline/game/gui/upgradeobjectevent/UpgradeObjectEventActionWithJSON;", "provideVideoPlayerActionWithJSON", "Lcom/blackhub/bronline/game/gui/videoplayer/VideoPlayerActionWithJson;", "provideWoundSystemActionWithJSON", "Lcom/blackhub/bronline/game/gui/woundsystem/network/ActionsWithJSON;", "provideYoutubePlayerActionWithJSON", "Lcom/blackhub/bronline/game/gui/youtubeplayer/YoutubePlayerActionWithJSON;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@Module
@SourceDebugExtension({"SMAP\nNetworkModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkModule.kt\ncom/blackhub/bronline/launcher/di/NetworkModule\n+ 2 OkHttpClient.kt\nokhttp3/OkHttpClient$Builder\n*L\n1#1,503:1\n563#2:504\n563#2:505\n563#2:506\n563#2:507\n*S KotlinDebug\n*F\n+ 1 NetworkModule.kt\ncom/blackhub/bronline/launcher/di/NetworkModule\n*L\n186#1:504\n222#1:505\n268#1:506\n302#1:507\n*E\n"})
/* loaded from: classes8.dex */
public final class NetworkModule {
    public static final int $stable = 0;

    @Provides
    @Singleton
    @NotNull
    public final Api provideApiService() throws SecurityException {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        OkHttpClient.Builder builderAddInterceptor = builder.addInterceptor(new UserAgentInterceptor(BuildConfig.API_URL_USER_AGENT));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builderAddInterceptor.connectTimeout(10L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit);
        Object objCreate = new Retrofit.Builder().client(builder.build()).baseUrl(BuildConfig.API_URL).addConverterFactory(GsonConverterFactory.create()).addCallAdapterFactory(RxJava3CallAdapterFactory.create()).build().create(Api.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        return (Api) objCreate;
    }

    @Provides
    @BackupUrlAPI
    @NotNull
    @Singleton
    public final Api provideBackupApiService() throws SecurityException {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        OkHttpClient.Builder builderAddInterceptor = builder.addInterceptor(new UserAgentInterceptor(BuildConfig.API_URL_USER_AGENT));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builderAddInterceptor.connectTimeout(10L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit);
        Object objCreate = new Retrofit.Builder().client(builder.build()).baseUrl(BuildConfig.API_BACKUP_URL).addConverterFactory(GsonConverterFactory.create()).addCallAdapterFactory(RxJava3CallAdapterFactory.create()).build().create(Api.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        return (Api) objCreate;
    }

    @Provides
    @CdnAPI
    @NotNull
    @Singleton
    public final Api provideCdnApiService() {
        String str = Settings.CURRENT_CDN_URL;
        String strBasic$default = Credentials.basic$default(BuildConfig.CDN_USERNAME, BuildConfig.CDN_PASSWORD, null, 4, null);
        OkHttpClient okHttpClientBuild = createOkHttpClientBuilder(strBasic$default, createAuthenticator(strBasic$default)).addInterceptor(new Interceptor() { // from class: com.blackhub.bronline.launcher.di.NetworkModule$provideCdnApiService$$inlined$-addInterceptor$1
            @Override // okhttp3.Interceptor
            @NotNull
            public final Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
                String str2;
                Intrinsics.checkNotNullParameter(chain, "chain");
                Response responseProceed = chain.proceed(chain.request());
                HttpUrl httpUrlUrl = responseProceed.request().url();
                if (httpUrlUrl.port() != 0) {
                    str2 = httpUrlUrl.scheme() + "://" + httpUrlUrl.host() + StringUtils.PROCESS_POSTFIX_DELIMITER + httpUrlUrl.port() + "/";
                } else {
                    str2 = httpUrlUrl.scheme() + "://" + httpUrlUrl.host() + "/";
                }
                if (!Intrinsics.areEqual(Settings.CURRENT_CDN_URL, str2)) {
                    UtilsKt.crashlyticsLog("REDIRECT! old URL=" + Settings.CURRENT_CDN_URL + ", redirect URL=" + str2);
                    Settings.CURRENT_CDN_URL = str2;
                }
                return responseProceed;
            }
        }).build();
        Intrinsics.checkNotNull(str);
        return createRetrofit(okHttpClientBuild, str);
    }

    @Provides
    @BackupCdnAPI
    @NotNull
    @Singleton
    public final Api provideBackupCdnApiService() {
        String strBasic$default = Credentials.basic$default(BuildConfig.CDN_USERNAME, BuildConfig.CDN_PASSWORD, null, 4, null);
        OkHttpClient.Builder builderCreateOkHttpClientBuilder = createOkHttpClientBuilder(strBasic$default, createAuthenticator(strBasic$default));
        final String str = BuildConfig.CDN_BACKUP_URL;
        return createRetrofit(builderCreateOkHttpClientBuilder.addInterceptor(new Interceptor() { // from class: com.blackhub.bronline.launcher.di.NetworkModule$provideBackupCdnApiService$$inlined$-addInterceptor$1
            @Override // okhttp3.Interceptor
            @NotNull
            public final Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
                String str2;
                Intrinsics.checkNotNullParameter(chain, "chain");
                Response responseProceed = chain.proceed(chain.request());
                HttpUrl httpUrlUrl = responseProceed.request().url();
                if (httpUrlUrl.port() != 0) {
                    str2 = httpUrlUrl.scheme() + "://" + httpUrlUrl.host() + StringUtils.PROCESS_POSTFIX_DELIMITER + httpUrlUrl.port() + "/";
                } else {
                    str2 = httpUrlUrl.scheme() + "://" + httpUrlUrl.host() + "/";
                }
                if (!Intrinsics.areEqual(str, str2)) {
                    UtilsKt.crashlyticsLog("REDIRECT! old URL=" + str + ", redirect URL=" + str2);
                }
                return responseProceed;
            }
        }).build(), BuildConfig.CDN_BACKUP_URL);
    }

    public final Authenticator createAuthenticator(final String credentials) {
        return new Authenticator() { // from class: com.blackhub.bronline.launcher.di.NetworkModule$$ExternalSyntheticLambda0
            @Override // okhttp3.Authenticator
            public final Request authenticate(Route route, Response response) {
                return NetworkModule.createAuthenticator$lambda$6(credentials, route, response);
            }
        };
    }

    public static final Request createAuthenticator$lambda$6(String credentials, Route route, Response response) {
        Intrinsics.checkNotNullParameter(credentials, "$credentials");
        Intrinsics.checkNotNullParameter(response, "response");
        return response.request().newBuilder().header("Authorization", credentials).build();
    }

    public final OkHttpClient.Builder createOkHttpClientBuilder(final String credentials, Authenticator authenticator) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.connectTimeout(5L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit);
        if (UtilsKt.isAddBasicAuth()) {
            builder.authenticator(authenticator).addInterceptor(new Interceptor() { // from class: com.blackhub.bronline.launcher.di.NetworkModule$createOkHttpClientBuilder$lambda$8$$inlined$-addInterceptor$1
                @Override // okhttp3.Interceptor
                @NotNull
                public final Response intercept(@NotNull Interceptor.Chain chain) {
                    Intrinsics.checkNotNullParameter(chain, "chain");
                    return chain.proceed(chain.request().newBuilder().header("Authorization", credentials).build());
                }
            });
        }
        return builder;
    }

    public final Api createRetrofit(OkHttpClient okHttpClient, String baseUrl) throws SecurityException {
        Object objCreate = new Retrofit.Builder().client(okHttpClient).baseUrl(baseUrl).addConverterFactory(GsonConverterFactory.create()).addCallAdapterFactory(RxJava3CallAdapterFactory.create()).build().create(Api.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        return (Api) objCreate;
    }

    @Provides
    @Singleton
    @NotNull
    public final PaymentApi provideBillingService() throws SecurityException {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.connectTimeout(10L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).addInterceptor(new Interceptor() { // from class: com.blackhub.bronline.launcher.di.NetworkModule$provideBillingService$lambda$10$$inlined$-addInterceptor$1
            @Override // okhttp3.Interceptor
            @NotNull
            public final Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
                Intrinsics.checkNotNullParameter(chain, "chain");
                Request request = chain.request();
                Response responseProceed = chain.proceed(request);
                UtilsKt.crashlyticsLog("provideBillingService(): request.URL=" + request.url(), LogTagConstants.MARKET_BILLING_TAG);
                UtilsKt.crashlyticsLog("provideBillingService(): response.code=" + responseProceed.code(), LogTagConstants.MARKET_BILLING_TAG);
                return responseProceed;
            }
        });
        Object objCreate = new Retrofit.Builder().client(builder.build()).baseUrl(BuildConfig.PAYMENT_URL).addConverterFactory(GsonConverterFactory.create(new GsonBuilder().setLenient().create())).build().create(PaymentApi.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        return (PaymentApi) objCreate;
    }

    @Provides
    @NotNull
    public final FractionActionsWithJSON provideFractionActionsWithJSON() {
        return new FractionActionsWithJSON(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final TuningActionWithJSON provideTuningActionWithJSON() {
        return new TuningActionWithJSON();
    }

    @Provides
    @NotNull
    public final CostCalculation provideTuningCostCalculation() {
        return new CostCalculation();
    }

    @Provides
    @NotNull
    public final SpawnLocationActionsWithJson provideSpawnLocationActionsWithJson() {
        return new SpawnLocationActionsWithJson(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final SpawnLocationRepository provideSpawnLocationRepository() {
        return new SpawnLocationRepositoryImpl();
    }

    @Provides
    @NotNull
    public final MiniGamesHelperWithJSON provideMiniGamesHelperActionWithJSON() {
        return new MiniGamesHelperWithJSON(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final PlayersListActionWithJson providePlayersListActionWithJson() {
        return new PlayersListActionWithJson(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final SmiEditorActionWithJSON provideSmiEditorActionWithJSON() {
        return new SmiEditorActionWithJSON(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final DonateActionWithJSON provideDonateActionWithJSON() {
        return new DonateActionWithJSON(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final TutorialHintActionWithJSON provideTutorialHintActionWithJSON() {
        return new TutorialHintActionWithJSON(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final ActionsWithJSON provideWoundSystemActionWithJSON() {
        return new ActionsWithJSON(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final NewMenuActionWithJSON provideNewMenuActionWithJSON() {
        return new NewMenuActionWithJSON(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final RadialMenuActionWithJSON provideRadialMenuActionWithJSON() {
        return new RadialMenuActionWithJSON(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final DrivingSchoolActionsWithJSON provideDrivingSchoolActionWithJSON() {
        return new DrivingSchoolActionsWithJSON(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final EntertainmentSystemActionsWithJSON provideEntertainmentSystemActionsWithJSON() {
        return new EntertainmentSystemActionsWithJSON(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final NotificationActionWithJSON provideNotificationActionWithJSON() {
        return new NotificationActionWithJSON(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final LocalNotification provideErrorNotification() {
        return new LocalNotification(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final BlackPassActionWithJSON provideBlackPassActionWithJSON() {
        return new BlackPassActionWithJSON(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final FuelFillActionWithJSON provideFuelFullActionWithJSON() {
        return new FuelFillActionWithJSON(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final ElectricActionWithJSON provideElectricActionWithJSON() {
        return new ElectricActionWithJSON(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final CatchStreamerActionWithJSON provideCatchStreamerActionWithJSON() {
        return new CatchStreamerActionWithJSON(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final YoutubePlayerActionWithJSON provideYoutubePlayerActionWithJSON() {
        return new YoutubePlayerActionWithJSON(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final FishingActionWithJSON provideFishingActionWithJSON() {
        return new FishingActionWithJSON(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final TaxiMapActionWithJSON provideTaxiMapActionWithJSON() {
        return new TaxiMapActionWithJSON(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final TaxiActionWithJSON provideTaxiActionWithJSON() {
        return new TaxiActionWithJSON(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final TaxiOrderActionWithJSON provideTaxiOrderActionWithJSON() {
        return new TaxiOrderActionWithJSON(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final InteractionWithNpcActionWithJSON provideInteractionWithNpcActionWithJSON() {
        return new InteractionWithNpcActionWithJSON(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final HalloweenAwardActionWithJSON provideHalloweenAwardActionWithJSON() {
        return new HalloweenAwardActionWithJSON(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final BlackPassBannerActionsWithJson provideBlackPassBannerActionsWithJson() {
        return new BlackPassBannerActionsWithJson(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final ActiveTaskActionWithJSON provideActiveTaskActionWithJSON() {
        return new ActiveTaskActionWithJSON(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final GasmanActionsWithJson provideGasmanActionWithJson() {
        return new GasmanActionsWithJson(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final SocialNetworkActionWithJSON provideSocialNetworkActionWithJSON() {
        return new SocialNetworkActionWithJSON(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final AdminToolsActionWithJSON provideAdminToolsActionWithJSON() {
        return new AdminToolsActionWithJSON(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final BrSimBannerActionsWithJson provideBrSimBannerActionsWithJson() {
        return new BrSimBannerActionsWithJson(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final UpgradeObjectEventActionWithJSON provideUpgradeObjectActionWithJSON() {
        return new UpgradeObjectEventActionWithJSON(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final GiftsActionWithJSON provideGiftsActionWithJSON() {
        return new GiftsActionWithJSON(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final PanelInfoActionWithJSON providePanelInfoActionWithJSON() {
        return new PanelInfoActionWithJSON(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final MenuActionsWithJson provideBrDialogMenuActionsWithJson() {
        return new MenuActionsWithJson(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final RentActionWithJSON provideRentActionWithJSON() {
        return new RentActionWithJSON(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final PlatesActionWithJSON providePlatesActionWithJSON() {
        return new PlatesActionWithJSON(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final RateAppActionWithJson provideRateAppActionWithJSON() {
        return new RateAppActionWithJson(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final CalendarActionWithJSON provideCalendarActionWithJSON() {
        return new CalendarActionWithJSON(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final CasesActionWithJSON provideCasesActionWithJSON() {
        return new CasesActionWithJSON(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final BpRewardsActionWithJSON provideBpRewardsActionWithJSON() {
        return new BpRewardsActionWithJSON(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final TanpinBannerActionWithJSON provideTanpinBannerActionWithJSON() {
        return new TanpinBannerActionWithJSON(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final VideoPlayerActionWithJson provideVideoPlayerActionWithJSON() {
        return new VideoPlayerActionWithJson(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final TaxiRatingActionWithJSON provideTaxiRatingActionWithJSON() {
        return new TaxiRatingActionWithJSON(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final CraftActionWithJSON provideCraftActionWithJSON() {
        return new CraftActionWithJSON(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final MarketplaceActionWithJson provideMarketplaceActionWithJSON() {
        return new MarketplaceActionWithJson(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final JNIActivityActionWithJSON provideJNIActivityActionWithJSON() {
        return new JNIActivityActionWithJSON(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final HolidayEventsActionsWithJSON provideHolidayEventsActionsWithJSON() {
        return new HolidayEventsActionsWithJSON(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final ClickerActionsWithJson provideClickerActionsWithJSON() {
        return new ClickerActionsWithJson(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final ChatActionsWithJson provideChatActionsWithJSON() {
        return new ChatActionsWithJson(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final ModuleDialogActionsWithJson provideModuleDialogActionsWithJSON() {
        return new ModuleDialogActionsWithJson(GUIManager.INSTANCE.getInstance());
    }

    @Provides
    @NotNull
    public final RatingActionWithJson provideRatingActionWithJson() {
        return new RatingActionWithJson(GUIManager.INSTANCE.getInstance());
    }
}
