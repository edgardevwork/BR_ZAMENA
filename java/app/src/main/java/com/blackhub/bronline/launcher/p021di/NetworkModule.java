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

