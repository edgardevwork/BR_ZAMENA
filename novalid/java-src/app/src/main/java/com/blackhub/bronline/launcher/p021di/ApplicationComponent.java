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
@Metadata(m7104d1 = {"\u0000\u0086\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0002\u0080\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001dH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020#H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010&\u001a\u00020'H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010(\u001a\u00020)H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010*\u001a\u00020+H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010,\u001a\u00020-H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010.\u001a\u00020/H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u00100\u001a\u000201H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u00102\u001a\u000203H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u00104\u001a\u000205H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u00106\u001a\u000207H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u00108\u001a\u000209H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010:\u001a\u00020;H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010<\u001a\u00020=H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010>\u001a\u00020?H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010@\u001a\u00020AH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010B\u001a\u00020CH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010D\u001a\u00020EH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010F\u001a\u00020GH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010H\u001a\u00020IH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010J\u001a\u00020KH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010L\u001a\u00020MH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010N\u001a\u00020OH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010P\u001a\u00020QH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010R\u001a\u00020SH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010T\u001a\u00020UH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010V\u001a\u00020WH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010X\u001a\u00020YH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010Z\u001a\u00020[H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\\\u001a\u00020]H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010^\u001a\u00020_H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010`\u001a\u00020aH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010b\u001a\u00020cH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010d\u001a\u00020eH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010f\u001a\u00020gH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010h\u001a\u00020iH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010j\u001a\u00020kH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010l\u001a\u00020mH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010n\u001a\u00020oH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010p\u001a\u00020qH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010r\u001a\u00020sH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010t\u001a\u00020uH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010v\u001a\u00020wH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010x\u001a\u00020yH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010z\u001a\u00020{H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010|\u001a\u00020}H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010~\u001a\u00020\u007fH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0081\u0001À\u0006\u0001"}, m7105d2 = {"Lcom/blackhub/bronline/launcher/di/ApplicationComponent;", "", "inject", "", "jniActivity", "Lcom/blackhub/bronline/game/core/JNIActivity;", "activeTaskGuiFragment", "Lcom/blackhub/bronline/game/gui/activetask/ActiveTaskGuiFragment;", "adminToolsGuiFragment", "Lcom/blackhub/bronline/game/gui/admintools/AdminToolsGuiFragment;", "blackPassBannerComposeGUIFragment", "Lcom/blackhub/bronline/game/gui/blackpassbanner/BlackPassBannerComposeGUIFragment;", "bpRewardsGuiFragment", "Lcom/blackhub/bronline/game/gui/bprewards/BpRewardsGuiFragment;", "brSimBannerComposeGUIFragment", "Lcom/blackhub/bronline/game/gui/brsimbanner/BrSimBannerComposeGUIFragment;", "calendarGUIFragment", "Lcom/blackhub/bronline/game/gui/calendar/CalendarGUIFragment;", "casesGUIFragment", "Lcom/blackhub/bronline/game/gui/cases/CasesGUIFragment;", "catchStreamerGUIFragment", "Lcom/blackhub/bronline/game/gui/catchstreamer/CatchStreamerGUIFragment;", "chatGuiFragment", "Lcom/blackhub/bronline/game/gui/chat/ChatGuiFragment;", "chooseServerGuiFragmentDialog", "Lcom/blackhub/bronline/game/gui/chooseserver/ChooseServerGuiFragment;", "clickerGuiFragment", "Lcom/blackhub/bronline/game/gui/clicker/ClickerGuiFragment;", "craftGuiFragment", "Lcom/blackhub/bronline/game/gui/craft/CraftGuiFragment;", "guiDonate", "Lcom/blackhub/bronline/game/gui/donate/GUIDonate;", "drivingSchool", "Lcom/blackhub/bronline/game/gui/drivingschool/GUIDrivingSchool;", "electricGuiFragment", "Lcom/blackhub/bronline/game/gui/electric/ElectricGuiFragment;", "changeBulbFragment", "Lcom/blackhub/bronline/game/gui/electric/ui/ChangeBulbFragment;", "collectSchemeFragment", "Lcom/blackhub/bronline/game/gui/electric/ui/CollectSchemeFragment;", "findProblemFragment", "Lcom/blackhub/bronline/game/gui/electric/ui/FindProblemFragment;", "raiseChargeFragment", "Lcom/blackhub/bronline/game/gui/electric/ui/RaiseChargeFragment;", "sumContactsFragment", "Lcom/blackhub/bronline/game/gui/electric/ui/SumContactsFragment;", "entertainmentSystem", "Lcom/blackhub/bronline/game/gui/entertainmentsystem/GUIEntertainmentSystem;", "entertainmentSystemFinalWindow", "Lcom/blackhub/bronline/game/gui/entertainmentsystem/ui/GUIEntertainmentSystemFinalWindow;", "fishing", "Lcom/blackhub/bronline/game/gui/fishing/FishingGUIFragment;", "guiFractionSystem", "Lcom/blackhub/bronline/game/gui/fractions/GUIFractionSystem;", "fuelFill", "Lcom/blackhub/bronline/game/gui/fuelfill/GUIFuelFill;", "guiGasmanGame", "Lcom/blackhub/bronline/game/gui/gasmangame/ui/GUIGasmanGame;", "giftsGuiFragment", "Lcom/blackhub/bronline/game/gui/gifts/GiftsGuiFragment;", "halloweenAwardGuiFragment", "Lcom/blackhub/bronline/game/gui/halloweenaward/HalloweenAwardGuiFragment;", "holidayEventsGuiFragment", "Lcom/blackhub/bronline/game/gui/holidayevents/HolidayEventsGuiFragment;", "interactionWithNpcGUIFragment", "Lcom/blackhub/bronline/game/gui/interactionwithnpc/InteractionWithNpcGUIFragment;", "marketplaceGUIFragment", "Lcom/blackhub/bronline/game/gui/marketplace/MarketplaceGuiFragment;", "menuComposeGUIFragment", "Lcom/blackhub/bronline/game/gui/menu/MenuComposeGUIFragment;", "menuGuiFragment", "Lcom/blackhub/bronline/game/gui/menupausesettingandmap/MenuGuiFragment;", "menuSettingMainUiFragment", "Lcom/blackhub/bronline/game/gui/menupausesettingandmap/ui/MenuSettingMainUiFragment;", "miniGamesHelperGuiFragment", "Lcom/blackhub/bronline/game/gui/minigameshelper/MiniGamesHelperGuiFragment;", "moduleDialogGuiFragment", "Lcom/blackhub/bronline/game/gui/moduledialog/ModuleDialogGuiFragment;", "notification", "Lcom/blackhub/bronline/game/gui/notification/GUINotificationNewStyle;", "panelInfoGuiFragment", "Lcom/blackhub/bronline/game/gui/panelinfo/PanelInfoGuiFragment;", "platesGuiFragment", "Lcom/blackhub/bronline/game/gui/plates/PlatesGuiFragment;", "guiPlayersList", "Lcom/blackhub/bronline/game/gui/playerslist/GUIPlayersList;", "radialMenu", "Lcom/blackhub/bronline/game/gui/radialmenuforcar/GUIRadialMenuForCar;", "rateAppComposeGUIFragment", "Lcom/blackhub/bronline/game/gui/rateapp/RateAppComposeGUIFragment;", "ratingGuiFragment", "Lcom/blackhub/bronline/game/gui/rating/RatingGuiFragment;", "rent", "Lcom/blackhub/bronline/game/gui/rent/RentGuiFragment;", "guiSmiEditor", "Lcom/blackhub/bronline/game/gui/smieditor/GUISmiEditor;", "socialNetworkLinkGUIFragment", "Lcom/blackhub/bronline/game/gui/socialnetworklink/GUISocialNetworkLink;", "guiSpawnLocation", "Lcom/blackhub/bronline/game/gui/spawnlocation/GUISpawnLocation;", "tanpinBannerGuiFragment", "Lcom/blackhub/bronline/game/gui/tanpinbanner/TanpinBannerGuiFragment;", "taxiFragment", "Lcom/blackhub/bronline/game/gui/taxi/TaxiFragment;", "taxiMapFragment", "Lcom/blackhub/bronline/game/gui/taximap/TaxiMapFragment;", "taxiOrderFragment", "Lcom/blackhub/bronline/game/gui/taxiorder/TaxiOrderFragment;", "taxiRatingFragment", "Lcom/blackhub/bronline/game/gui/taxirating/TaxiRatingFragment;", "guiTuning", "Lcom/blackhub/bronline/game/gui/tuning/GUITuning;", "tutorialHint", "Lcom/blackhub/bronline/game/gui/tutorialhints/TutorialGuiFragment;", "upgradeObjectEventGuiFragment", "Lcom/blackhub/bronline/game/gui/upgradeobjectevent/UpgradeObjectEventGuiFragment;", "videoPlayerGuiFragment", "Lcom/blackhub/bronline/game/gui/videoplayer/VideoPlayerGuiFragment;", "woundSystem", "Lcom/blackhub/bronline/game/gui/woundsystem/GUIWoundSystem;", "yotubePlayerFragment", "Lcom/blackhub/bronline/game/gui/youtubeplayer/YotubePlayerFragment;", "application", "Lcom/blackhub/bronline/launcher/App;", "mainActivity", "Lcom/blackhub/bronline/launcher/activities/MainActivity;", "downloadWorker", "Lcom/blackhub/bronline/launcher/download/DownloadWorker;", "Builder", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
