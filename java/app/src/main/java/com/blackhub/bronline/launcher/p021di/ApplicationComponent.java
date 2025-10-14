package com.blackhub.bronline.launcher.p021di;

import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.gui.activetask.ActiveTaskGuiFragment;
import com.blackhub.bronline.game.gui.admintools.AdminToolsGuiFragment;
import com.blackhub.bronline.game.gui.blackpassbanner.BlackPassBannerComposeGUIFragment;
import com.blackhub.bronline.game.gui.bprewards.BpRewardsGuiFragment;
import com.blackhub.bronline.game.gui.brsimbanner.BrSimBannerComposeGUIFragment;
import com.blackhub.bronline.game.gui.calendar.CalendarGUIFragment;
import com.blackhub.bronline.game.gui.cases.CasesGUIFragment;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerGUIFragment;
import com.blackhub.bronline.game.gui.chat.ChatGuiFragment;
import com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment;
import com.blackhub.bronline.game.gui.clicker.ClickerGuiFragment;
import com.blackhub.bronline.game.gui.craft.CraftGuiFragment;
import com.blackhub.bronline.game.gui.donate.GUIDonate;
import com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool;
import com.blackhub.bronline.game.gui.electric.ElectricGuiFragment;
import com.blackhub.bronline.game.gui.electric.p013ui.ChangeBulbFragment;
import com.blackhub.bronline.game.gui.electric.p013ui.CollectSchemeFragment;
import com.blackhub.bronline.game.gui.electric.p013ui.FindProblemFragment;
import com.blackhub.bronline.game.gui.electric.p013ui.RaiseChargeFragment;
import com.blackhub.bronline.game.gui.electric.p013ui.SumContactsFragment;
import com.blackhub.bronline.game.gui.entertainmentsystem.GUIEntertainmentSystem;
import com.blackhub.bronline.game.gui.entertainmentsystem.p014ui.GUIEntertainmentSystemFinalWindow;
import com.blackhub.bronline.game.gui.fishing.FishingGUIFragment;
import com.blackhub.bronline.game.gui.fractions.GUIFractionSystem;
import com.blackhub.bronline.game.gui.fuelfill.GUIFuelFill;
import com.blackhub.bronline.game.gui.gasmangame.p015ui.GUIGasmanGame;
import com.blackhub.bronline.game.gui.gifts.GiftsGuiFragment;
import com.blackhub.bronline.game.gui.halloweenaward.HalloweenAwardGuiFragment;
import com.blackhub.bronline.game.gui.holidayevents.HolidayEventsGuiFragment;
import com.blackhub.bronline.game.gui.interactionwithnpc.InteractionWithNpcGUIFragment;
import com.blackhub.bronline.game.gui.marketplace.MarketplaceGuiFragment;
import com.blackhub.bronline.game.gui.menu.MenuComposeGUIFragment;
import com.blackhub.bronline.game.gui.menupausesettingandmap.MenuGuiFragment;
import com.blackhub.bronline.game.gui.menupausesettingandmap.p016ui.MenuSettingMainUiFragment;
import com.blackhub.bronline.game.gui.minigameshelper.MiniGamesHelperGuiFragment;
import com.blackhub.bronline.game.gui.moduledialog.ModuleDialogGuiFragment;
import com.blackhub.bronline.game.gui.notification.GUINotificationNewStyle;
import com.blackhub.bronline.game.gui.panelinfo.PanelInfoGuiFragment;
import com.blackhub.bronline.game.gui.plates.PlatesGuiFragment;
import com.blackhub.bronline.game.gui.playerslist.GUIPlayersList;
import com.blackhub.bronline.game.gui.radialmenuforcar.GUIRadialMenuForCar;
import com.blackhub.bronline.game.gui.rateapp.RateAppComposeGUIFragment;
import com.blackhub.bronline.game.gui.rating.RatingGuiFragment;
import com.blackhub.bronline.game.gui.rent.RentGuiFragment;
import com.blackhub.bronline.game.gui.smieditor.GUISmiEditor;
import com.blackhub.bronline.game.gui.socialnetworklink.GUISocialNetworkLink;
import com.blackhub.bronline.game.gui.spawnlocation.GUISpawnLocation;
import com.blackhub.bronline.game.gui.tanpinbanner.TanpinBannerGuiFragment;
import com.blackhub.bronline.game.gui.taxi.TaxiFragment;
import com.blackhub.bronline.game.gui.taximap.TaxiMapFragment;
import com.blackhub.bronline.game.gui.taxiorder.TaxiOrderFragment;
import com.blackhub.bronline.game.gui.taxirating.TaxiRatingFragment;
import com.blackhub.bronline.game.gui.tuning.GUITuning;
import com.blackhub.bronline.game.gui.tutorialhints.TutorialGuiFragment;
import com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventGuiFragment;
import com.blackhub.bronline.game.gui.videoplayer.VideoPlayerGuiFragment;
import com.blackhub.bronline.game.gui.woundsystem.GUIWoundSystem;
import com.blackhub.bronline.game.gui.youtubeplayer.YotubePlayerFragment;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.activities.MainActivity;
import com.blackhub.bronline.launcher.download.DownloadWorker;
import dagger.BindsInstance;
import dagger.Component;
import javax.inject.Singleton;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ApplicationComponent.kt */
@Component(modules = {AppModule.class, BillingModule.class, NetworkModule.class, DatabaseModule.class, ResourceModule.class, DispatcherModule.class, AnalyticsModule.class, AppLifeCycleObserverModule.class, RepositoryBindModule.class, RdsBindModule.class})
@Singleton
/* loaded from: classes3.dex */
public interface ApplicationComponent {

    /* compiled from: ApplicationComponent.kt */
    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m7105d2 = {"Lcom/blackhub/bronline/launcher/di/ApplicationComponent$Builder;", "", "app", "Lcom/blackhub/bronline/launcher/App;", "build", "Lcom/blackhub/bronline/launcher/di/ApplicationComponent;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    @Component.Builder
    public interface Builder {
        @BindsInstance
        @NotNull
        Builder app(@NotNull App app);

        @NotNull
        ApplicationComponent build();
    }

    void inject(@NotNull JNIActivity jniActivity);

    void inject(@NotNull ActiveTaskGuiFragment activeTaskGuiFragment);

    void inject(@NotNull AdminToolsGuiFragment adminToolsGuiFragment);

    void inject(@NotNull BlackPassBannerComposeGUIFragment blackPassBannerComposeGUIFragment);

    void inject(@NotNull BpRewardsGuiFragment bpRewardsGuiFragment);

    void inject(@NotNull BrSimBannerComposeGUIFragment brSimBannerComposeGUIFragment);

    void inject(@NotNull CalendarGUIFragment calendarGUIFragment);

    void inject(@NotNull CasesGUIFragment casesGUIFragment);

    void inject(@NotNull CatchStreamerGUIFragment catchStreamerGUIFragment);

    void inject(@NotNull ChatGuiFragment chatGuiFragment);

    void inject(@NotNull ChooseServerGuiFragment chooseServerGuiFragmentDialog);

    void inject(@NotNull ClickerGuiFragment clickerGuiFragment);

    void inject(@NotNull CraftGuiFragment craftGuiFragment);

    void inject(@NotNull GUIDonate guiDonate);

    void inject(@NotNull GUIDrivingSchool drivingSchool);

    void inject(@NotNull ElectricGuiFragment electricGuiFragment);

    void inject(@NotNull ChangeBulbFragment changeBulbFragment);

    void inject(@NotNull CollectSchemeFragment collectSchemeFragment);

    void inject(@NotNull FindProblemFragment findProblemFragment);

    void inject(@NotNull RaiseChargeFragment raiseChargeFragment);

    void inject(@NotNull SumContactsFragment sumContactsFragment);

    void inject(@NotNull GUIEntertainmentSystem entertainmentSystem);

    void inject(@NotNull GUIEntertainmentSystemFinalWindow entertainmentSystemFinalWindow);

    void inject(@NotNull FishingGUIFragment fishing);

    void inject(@NotNull GUIFractionSystem guiFractionSystem);

    void inject(@NotNull GUIFuelFill fuelFill);

    void inject(@NotNull GUIGasmanGame guiGasmanGame);

    void inject(@NotNull GiftsGuiFragment giftsGuiFragment);

    void inject(@NotNull HalloweenAwardGuiFragment halloweenAwardGuiFragment);

    void inject(@NotNull HolidayEventsGuiFragment holidayEventsGuiFragment);

    void inject(@NotNull InteractionWithNpcGUIFragment interactionWithNpcGUIFragment);

    void inject(@NotNull MarketplaceGuiFragment marketplaceGUIFragment);

    void inject(@NotNull MenuComposeGUIFragment menuComposeGUIFragment);

    void inject(@NotNull MenuGuiFragment menuGuiFragment);

    void inject(@NotNull MenuSettingMainUiFragment menuSettingMainUiFragment);

    void inject(@NotNull MiniGamesHelperGuiFragment miniGamesHelperGuiFragment);

    void inject(@NotNull ModuleDialogGuiFragment moduleDialogGuiFragment);

    void inject(@NotNull GUINotificationNewStyle notification);

    void inject(@NotNull PanelInfoGuiFragment panelInfoGuiFragment);

    void inject(@NotNull PlatesGuiFragment platesGuiFragment);

    void inject(@NotNull GUIPlayersList guiPlayersList);

    void inject(@NotNull GUIRadialMenuForCar radialMenu);

    void inject(@NotNull RateAppComposeGUIFragment rateAppComposeGUIFragment);

    void inject(@NotNull RatingGuiFragment ratingGuiFragment);

    void inject(@NotNull RentGuiFragment rent);

    void inject(@NotNull GUISmiEditor guiSmiEditor);

    void inject(@NotNull GUISocialNetworkLink socialNetworkLinkGUIFragment);

    void inject(@NotNull GUISpawnLocation guiSpawnLocation);

    void inject(@NotNull TanpinBannerGuiFragment tanpinBannerGuiFragment);

    void inject(@NotNull TaxiFragment taxiFragment);

    void inject(@NotNull TaxiMapFragment taxiMapFragment);

    void inject(@NotNull TaxiOrderFragment taxiOrderFragment);

    void inject(@NotNull TaxiRatingFragment taxiRatingFragment);

    void inject(@NotNull GUITuning guiTuning);

    void inject(@NotNull TutorialGuiFragment tutorialHint);

    void inject(@NotNull UpgradeObjectEventGuiFragment upgradeObjectEventGuiFragment);

    void inject(@NotNull VideoPlayerGuiFragment videoPlayerGuiFragment);

    void inject(@NotNull GUIWoundSystem woundSystem);

    void inject(@NotNull YotubePlayerFragment yotubePlayerFragment);

    void inject(@NotNull App application);

    void inject(@NotNull MainActivity mainActivity);

    void inject(@NotNull DownloadWorker downloadWorker);
}

