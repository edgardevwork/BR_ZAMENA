package com.blackhub.bronline.launcher.p021di;

import android.app.Application;
import android.content.Context;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.core.JNIActivity_MembersInjector;
import com.blackhub.bronline.game.core.network.JNIActivityActionWithJSON;
import com.blackhub.bronline.game.core.preferences.PreferencesRepository;
import com.blackhub.bronline.game.core.resources.BitmapResource;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.core.utils.lifecycleobserver.AppLifecycleObserverImpl;
import com.blackhub.bronline.game.core.utils.payment.BillingClientWrapper;
import com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper;
import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel;
import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel_Factory;
import com.blackhub.bronline.game.gui.activetask.ActiveTaskActionWithJSON;
import com.blackhub.bronline.game.gui.activetask.ActiveTaskGuiFragment;
import com.blackhub.bronline.game.gui.activetask.ActiveTaskGuiFragment_MembersInjector;
import com.blackhub.bronline.game.gui.activetask.ActiveTaskViewModel;
import com.blackhub.bronline.game.gui.activetask.ActiveTaskViewModel_Factory;
import com.blackhub.bronline.game.gui.admintools.AdminToolsActionWithJSON;
import com.blackhub.bronline.game.gui.admintools.AdminToolsGuiFragment;
import com.blackhub.bronline.game.gui.admintools.AdminToolsGuiFragment_MembersInjector;
import com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel;
import com.blackhub.bronline.game.gui.admintools.AdminToolsViewModel_Factory;
import com.blackhub.bronline.game.gui.blackpass.network.BlackPassActionWithJSON;
import com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassActivateViewModel;
import com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassActivateViewModel_Factory;
import com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel;
import com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel_Factory;
import com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassPrizeListViewModel;
import com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassPrizeListViewModel_Factory;
import com.blackhub.bronline.game.gui.blackpassbanner.BlackPassBannerComposeGUIFragment;
import com.blackhub.bronline.game.gui.blackpassbanner.BlackPassBannerComposeGUIFragment_MembersInjector;
import com.blackhub.bronline.game.gui.blackpassbanner.network.BlackPassBannerActionsWithJson;
import com.blackhub.bronline.game.gui.blackpassbanner.viewmodel.BlackPassBannerViewModel;
import com.blackhub.bronline.game.gui.blackpassbanner.viewmodel.BlackPassBannerViewModel_Factory;
import com.blackhub.bronline.game.gui.bprewards.BpRewardsActionWithJSON;
import com.blackhub.bronline.game.gui.bprewards.BpRewardsGuiFragment;
import com.blackhub.bronline.game.gui.bprewards.BpRewardsGuiFragment_MembersInjector;
import com.blackhub.bronline.game.gui.bprewards.BpRewardsViewModel;
import com.blackhub.bronline.game.gui.bprewards.BpRewardsViewModel_Factory;
import com.blackhub.bronline.game.gui.brsimbanner.BrSimBannerActionsWithJson;
import com.blackhub.bronline.game.gui.brsimbanner.BrSimBannerComposeGUIFragment;
import com.blackhub.bronline.game.gui.brsimbanner.BrSimBannerComposeGUIFragment_MembersInjector;
import com.blackhub.bronline.game.gui.brsimbanner.BrSimBannerViewModel;
import com.blackhub.bronline.game.gui.brsimbanner.BrSimBannerViewModel_Factory;
import com.blackhub.bronline.game.gui.calendar.CalendarGUIFragment;
import com.blackhub.bronline.game.gui.calendar.CalendarGUIFragment_MembersInjector;
import com.blackhub.bronline.game.gui.calendar.CalendarViewModel;
import com.blackhub.bronline.game.gui.calendar.CalendarViewModel_Factory;
import com.blackhub.bronline.game.gui.calendar.network.CalendarActionWithJSON;
import com.blackhub.bronline.game.gui.cases.CasesGUIFragment;
import com.blackhub.bronline.game.gui.cases.CasesGUIFragment_MembersInjector;
import com.blackhub.bronline.game.gui.cases.CasesViewModel;
import com.blackhub.bronline.game.gui.cases.CasesViewModel_Factory;
import com.blackhub.bronline.game.gui.cases.network.CasesActionWithJSON;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerActionWithJSON;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerGUIFragment;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerGUIFragment_MembersInjector;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerViewModel;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerViewModel_Factory;
import com.blackhub.bronline.game.gui.chat.ChatGuiFragment;
import com.blackhub.bronline.game.gui.chat.ChatGuiFragment_MembersInjector;
import com.blackhub.bronline.game.gui.chat.ChatViewModel;
import com.blackhub.bronline.game.gui.chat.ChatViewModel_Factory;
import com.blackhub.bronline.game.gui.chat.network.ChatActionsWithJson;
import com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment;
import com.blackhub.bronline.game.gui.clicker.ClickerGuiFragment;
import com.blackhub.bronline.game.gui.clicker.ClickerGuiFragment_MembersInjector;
import com.blackhub.bronline.game.gui.clicker.ClickerViewModel;
import com.blackhub.bronline.game.gui.clicker.ClickerViewModel_Factory;
import com.blackhub.bronline.game.gui.clicker.network.ClickerActionsWithJson;
import com.blackhub.bronline.game.gui.craft.CraftActionWithJSON;
import com.blackhub.bronline.game.gui.craft.CraftGuiFragment;
import com.blackhub.bronline.game.gui.craft.CraftGuiFragment_MembersInjector;
import com.blackhub.bronline.game.gui.craft.CraftViewModel;
import com.blackhub.bronline.game.gui.craft.CraftViewModel_Factory;
import com.blackhub.bronline.game.gui.donate.GUIDonate;
import com.blackhub.bronline.game.gui.donate.GUIDonate_MembersInjector;
import com.blackhub.bronline.game.gui.donate.network.DonateActionWithJSON;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateDepositCoinsViewModel;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateDepositCoinsViewModel_Factory;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateMainViewModel;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateMainViewModel_Factory;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateServiceViewModel;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateServiceViewModel_Factory;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel_Factory;
import com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool;
import com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool_MembersInjector;
import com.blackhub.bronline.game.gui.drivingschool.network.DrivingSchoolActionsWithJSON;
import com.blackhub.bronline.game.gui.drivingschool.viewmodel.DrivingSchoolClassInfoViewModel;
import com.blackhub.bronline.game.gui.drivingschool.viewmodel.DrivingSchoolClassInfoViewModel_Factory;
import com.blackhub.bronline.game.gui.drivingschool.viewmodel.DrivingSchoolMainViewModel;
import com.blackhub.bronline.game.gui.drivingschool.viewmodel.DrivingSchoolMainViewModel_Factory;
import com.blackhub.bronline.game.gui.drivingschool.viewmodel.DrivingSchoolQuestsViewModel;
import com.blackhub.bronline.game.gui.drivingschool.viewmodel.DrivingSchoolQuestsViewModel_Factory;
import com.blackhub.bronline.game.gui.drivingschool.viewmodel.DrivingSchoolViewModel;
import com.blackhub.bronline.game.gui.drivingschool.viewmodel.DrivingSchoolViewModel_Factory;
import com.blackhub.bronline.game.gui.electric.ElectricGuiFragment;
import com.blackhub.bronline.game.gui.electric.ElectricGuiFragment_MembersInjector;
import com.blackhub.bronline.game.gui.electric.network.ElectricActionWithJSON;
import com.blackhub.bronline.game.gui.electric.p013ui.ChangeBulbFragment;
import com.blackhub.bronline.game.gui.electric.p013ui.ChangeBulbFragment_MembersInjector;
import com.blackhub.bronline.game.gui.electric.p013ui.CollectSchemeFragment;
import com.blackhub.bronline.game.gui.electric.p013ui.CollectSchemeFragment_MembersInjector;
import com.blackhub.bronline.game.gui.electric.p013ui.FindProblemFragment;
import com.blackhub.bronline.game.gui.electric.p013ui.FindProblemFragment_MembersInjector;
import com.blackhub.bronline.game.gui.electric.p013ui.RaiseChargeFragment;
import com.blackhub.bronline.game.gui.electric.p013ui.RaiseChargeFragment_MembersInjector;
import com.blackhub.bronline.game.gui.electric.p013ui.SumContactsFragment;
import com.blackhub.bronline.game.gui.electric.p013ui.SumContactsFragment_MembersInjector;
import com.blackhub.bronline.game.gui.electric.viewmodel.ChangeBulbViewModel;
import com.blackhub.bronline.game.gui.electric.viewmodel.ChangeBulbViewModel_Factory;
import com.blackhub.bronline.game.gui.electric.viewmodel.CollectSchemeViewModel;
import com.blackhub.bronline.game.gui.electric.viewmodel.CollectSchemeViewModel_Factory;
import com.blackhub.bronline.game.gui.electric.viewmodel.ElectricViewModel;
import com.blackhub.bronline.game.gui.electric.viewmodel.ElectricViewModel_Factory;
import com.blackhub.bronline.game.gui.electric.viewmodel.FindProblemViewModel;
import com.blackhub.bronline.game.gui.electric.viewmodel.FindProblemViewModel_Factory;
import com.blackhub.bronline.game.gui.electric.viewmodel.RaiseChargeViewModel;
import com.blackhub.bronline.game.gui.electric.viewmodel.RaiseChargeViewModel_Factory;
import com.blackhub.bronline.game.gui.electric.viewmodel.SumContactsViewModel;
import com.blackhub.bronline.game.gui.electric.viewmodel.SumContactsViewModel_Factory;
import com.blackhub.bronline.game.gui.entertainmentsystem.GUIEntertainmentSystem;
import com.blackhub.bronline.game.gui.entertainmentsystem.GUIEntertainmentSystem_MembersInjector;
import com.blackhub.bronline.game.gui.entertainmentsystem.network.EntertainmentSystemActionsWithJSON;
import com.blackhub.bronline.game.gui.entertainmentsystem.p014ui.GUIEntertainmentSystemFinalWindow;
import com.blackhub.bronline.game.gui.entertainmentsystem.p014ui.GUIEntertainmentSystemFinalWindow_MembersInjector;
import com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel;
import com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel_Factory;
import com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.FinalWindowViewModel;
import com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.FinalWindowViewModel_Factory;
import com.blackhub.bronline.game.gui.fishing.FishingActionWithJSON;
import com.blackhub.bronline.game.gui.fishing.FishingGUIFragment;
import com.blackhub.bronline.game.gui.fishing.FishingGUIFragment_MembersInjector;
import com.blackhub.bronline.game.gui.fishing.FishingViewModel;
import com.blackhub.bronline.game.gui.fishing.FishingViewModel_Factory;
import com.blackhub.bronline.game.gui.fractions.GUIFractionSystem;
import com.blackhub.bronline.game.gui.fractions.GUIFractionSystem_MembersInjector;
import com.blackhub.bronline.game.gui.fractions.network.FractionActionsWithJSON;
import com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsControlViewModel;
import com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsControlViewModel_Factory;
import com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsDocumentsViewModel;
import com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsDocumentsViewModel_Factory;
import com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsMainViewModel;
import com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsMainViewModel_Factory;
import com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsQuestsViewModel;
import com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsQuestsViewModel_Factory;
import com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsShopViewModel;
import com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsShopViewModel_Factory;
import com.blackhub.bronline.game.gui.fuelfill.GUIFuelFill;
import com.blackhub.bronline.game.gui.fuelfill.GUIFuelFill_MembersInjector;
import com.blackhub.bronline.game.gui.fuelfill.network.FuelFillActionWithJSON;
import com.blackhub.bronline.game.gui.fuelfill.viewmodel.FuelFillViewModel;
import com.blackhub.bronline.game.gui.fuelfill.viewmodel.FuelFillViewModel_Factory;
import com.blackhub.bronline.game.gui.gasmangame.network.GasmanActionsWithJson;
import com.blackhub.bronline.game.gui.gasmangame.p015ui.GUIGasmanGame;
import com.blackhub.bronline.game.gui.gasmangame.p015ui.GUIGasmanGame_MembersInjector;
import com.blackhub.bronline.game.gui.gasmangame.viewmodel.GasmanChildViewModel;
import com.blackhub.bronline.game.gui.gasmangame.viewmodel.GasmanChildViewModel_Factory;
import com.blackhub.bronline.game.gui.gasmangame.viewmodel.GasmanParentViewModel;
import com.blackhub.bronline.game.gui.gasmangame.viewmodel.GasmanParentViewModel_Factory;
import com.blackhub.bronline.game.gui.gifts.GiftsActionWithJSON;
import com.blackhub.bronline.game.gui.gifts.GiftsGuiFragment;
import com.blackhub.bronline.game.gui.gifts.GiftsGuiFragment_MembersInjector;
import com.blackhub.bronline.game.gui.gifts.GiftsViewModel;
import com.blackhub.bronline.game.gui.gifts.GiftsViewModel_Factory;
import com.blackhub.bronline.game.gui.halloweenaward.HalloweenAwardActionWithJSON;
import com.blackhub.bronline.game.gui.halloweenaward.HalloweenAwardGuiFragment;
import com.blackhub.bronline.game.gui.halloweenaward.HalloweenAwardGuiFragment_MembersInjector;
import com.blackhub.bronline.game.gui.halloweenaward.HalloweenAwardViewModel;
import com.blackhub.bronline.game.gui.halloweenaward.HalloweenAwardViewModel_Factory;
import com.blackhub.bronline.game.gui.holidayevents.HolidayEventsActionsWithJSON;
import com.blackhub.bronline.game.gui.holidayevents.HolidayEventsGuiFragment;
import com.blackhub.bronline.game.gui.holidayevents.HolidayEventsGuiFragment_MembersInjector;
import com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel;
import com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel_Factory;
import com.blackhub.bronline.game.gui.interactionwithnpc.InteractionWithNpcActionWithJSON;
import com.blackhub.bronline.game.gui.interactionwithnpc.InteractionWithNpcGUIFragment;
import com.blackhub.bronline.game.gui.interactionwithnpc.InteractionWithNpcGUIFragment_MembersInjector;
import com.blackhub.bronline.game.gui.interactionwithnpc.InteractionWithNpcViewModel;
import com.blackhub.bronline.game.gui.interactionwithnpc.InteractionWithNpcViewModel_Factory;
import com.blackhub.bronline.game.gui.marketplace.MarketplaceActionWithJson;
import com.blackhub.bronline.game.gui.marketplace.MarketplaceGuiFragment;
import com.blackhub.bronline.game.gui.marketplace.MarketplaceGuiFragment_MembersInjector;
import com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel;
import com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel_Factory;
import com.blackhub.bronline.game.gui.menu.MenuComposeGUIFragment;
import com.blackhub.bronline.game.gui.menu.MenuComposeGUIFragment_MembersInjector;
import com.blackhub.bronline.game.gui.menu.network.MenuActionsWithJson;
import com.blackhub.bronline.game.gui.menu.viewModel.MenuViewModel;
import com.blackhub.bronline.game.gui.menu.viewModel.MenuViewModel_Factory;
import com.blackhub.bronline.game.gui.menupausesettingandmap.MenuGuiFragment;
import com.blackhub.bronline.game.gui.menupausesettingandmap.MenuGuiFragment_MembersInjector;
import com.blackhub.bronline.game.gui.menupausesettingandmap.network.NewMenuActionWithJSON;
import com.blackhub.bronline.game.gui.menupausesettingandmap.p016ui.MenuSettingMainUiFragment;
import com.blackhub.bronline.game.gui.menupausesettingandmap.p016ui.MenuSettingMainUiFragment_MembersInjector;
import com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuPauseViewModel;
import com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuPauseViewModel_Factory;
import com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuSettingControlViewModel;
import com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuSettingControlViewModel_Factory;
import com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuSettingGraphicViewModel;
import com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuSettingGraphicViewModel_Factory;
import com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuSettingSoundViewModel;
import com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuSettingSoundViewModel_Factory;
import com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuSettingWinterViewModel;
import com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuSettingWinterViewModel_Factory;
import com.blackhub.bronline.game.gui.minigameshelper.MiniGamesHelperGuiFragment;
import com.blackhub.bronline.game.gui.minigameshelper.MiniGamesHelperGuiFragment_MembersInjector;
import com.blackhub.bronline.game.gui.minigameshelper.MiniGamesHelperViewModel;
import com.blackhub.bronline.game.gui.minigameshelper.MiniGamesHelperViewModel_Factory;
import com.blackhub.bronline.game.gui.minigameshelper.MiniGamesHelperWithJSON;
import com.blackhub.bronline.game.gui.moduledialog.ModuleDialogGuiFragment;
import com.blackhub.bronline.game.gui.moduledialog.ModuleDialogGuiFragment_MembersInjector;
import com.blackhub.bronline.game.gui.moduledialog.ModuleDialogViewModel;
import com.blackhub.bronline.game.gui.moduledialog.ModuleDialogViewModel_Factory;
import com.blackhub.bronline.game.gui.moduledialog.network.ModuleDialogActionsWithJson;
import com.blackhub.bronline.game.gui.notification.GUINotificationNewStyle;
import com.blackhub.bronline.game.gui.notification.GUINotificationNewStyle_MembersInjector;
import com.blackhub.bronline.game.gui.notification.network.NotificationActionWithJSON;
import com.blackhub.bronline.game.gui.notification.viewmodel.NotificationViewModel;
import com.blackhub.bronline.game.gui.notification.viewmodel.NotificationViewModel_Factory;
import com.blackhub.bronline.game.gui.panelinfo.PanelInfoActionWithJSON;
import com.blackhub.bronline.game.gui.panelinfo.PanelInfoGuiFragment;
import com.blackhub.bronline.game.gui.panelinfo.PanelInfoGuiFragment_MembersInjector;
import com.blackhub.bronline.game.gui.panelinfo.PanelInfoViewModel;
import com.blackhub.bronline.game.gui.panelinfo.PanelInfoViewModel_Factory;
import com.blackhub.bronline.game.gui.plates.PlatesActionWithJSON;
import com.blackhub.bronline.game.gui.plates.PlatesGuiFragment;
import com.blackhub.bronline.game.gui.plates.PlatesGuiFragment_MembersInjector;
import com.blackhub.bronline.game.gui.plates.PlatesViewModel;
import com.blackhub.bronline.game.gui.plates.PlatesViewModel_Factory;
import com.blackhub.bronline.game.gui.playerslist.GUIPlayersList;
import com.blackhub.bronline.game.gui.playerslist.GUIPlayersList_MembersInjector;
import com.blackhub.bronline.game.gui.playerslist.network.PlayersListActionWithJson;
import com.blackhub.bronline.game.gui.playerslist.viewmodel.PlayersListViewModel;
import com.blackhub.bronline.game.gui.playerslist.viewmodel.PlayersListViewModel_Factory;
import com.blackhub.bronline.game.gui.radialmenuforcar.GUIRadialMenuForCar;
import com.blackhub.bronline.game.gui.radialmenuforcar.GUIRadialMenuForCar_MembersInjector;
import com.blackhub.bronline.game.gui.radialmenuforcar.netrowk.RadialMenuActionWithJSON;
import com.blackhub.bronline.game.gui.radialmenuforcar.viewmodel.RadialMenuViewModel;
import com.blackhub.bronline.game.gui.radialmenuforcar.viewmodel.RadialMenuViewModel_Factory;
import com.blackhub.bronline.game.gui.rateapp.RateAppComposeGUIFragment;
import com.blackhub.bronline.game.gui.rateapp.RateAppComposeGUIFragment_MembersInjector;
import com.blackhub.bronline.game.gui.rateapp.analytics.RateAppAnalytics;
import com.blackhub.bronline.game.gui.rateapp.network.RateAppActionWithJson;
import com.blackhub.bronline.game.gui.rateapp.viewmodel.RateAppViewModel;
import com.blackhub.bronline.game.gui.rateapp.viewmodel.RateAppViewModel_Factory;
import com.blackhub.bronline.game.gui.rating.RatingActionWithJson;
import com.blackhub.bronline.game.gui.rating.RatingGuiFragment;
import com.blackhub.bronline.game.gui.rating.RatingGuiFragment_MembersInjector;
import com.blackhub.bronline.game.gui.rating.RatingViewModel;
import com.blackhub.bronline.game.gui.rating.RatingViewModel_Factory;
import com.blackhub.bronline.game.gui.rent.RentActionWithJSON;
import com.blackhub.bronline.game.gui.rent.RentGuiFragment;
import com.blackhub.bronline.game.gui.rent.RentGuiFragment_MembersInjector;
import com.blackhub.bronline.game.gui.rent.RentViewModel;
import com.blackhub.bronline.game.gui.rent.RentViewModel_Factory;
import com.blackhub.bronline.game.gui.smieditor.GUISmiEditor;
import com.blackhub.bronline.game.gui.smieditor.GUISmiEditor_MembersInjector;
import com.blackhub.bronline.game.gui.smieditor.network.SmiEditorActionWithJSON;
import com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel;
import com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel_Factory;
import com.blackhub.bronline.game.gui.socialnetworklink.GUISocialNetworkLink;
import com.blackhub.bronline.game.gui.socialnetworklink.GUISocialNetworkLink_MembersInjector;
import com.blackhub.bronline.game.gui.socialnetworklink.network.SocialNetworkActionWithJSON;
import com.blackhub.bronline.game.gui.socialnetworklink.viewmodel.SocialNetworkLinkViewModel;
import com.blackhub.bronline.game.gui.socialnetworklink.viewmodel.SocialNetworkLinkViewModel_Factory;
import com.blackhub.bronline.game.gui.spawnlocation.GUISpawnLocation;
import com.blackhub.bronline.game.gui.spawnlocation.GUISpawnLocation_MembersInjector;
import com.blackhub.bronline.game.gui.spawnlocation.network.SpawnLocationActionsWithJson;
import com.blackhub.bronline.game.gui.spawnlocation.network.SpawnLocationRepository;
import com.blackhub.bronline.game.gui.spawnlocation.viewmodels.SpawnLocationViewModel;
import com.blackhub.bronline.game.gui.spawnlocation.viewmodels.SpawnLocationViewModel_Factory;
import com.blackhub.bronline.game.gui.tanpinbanner.TanpinBannerActionWithJSON;
import com.blackhub.bronline.game.gui.tanpinbanner.TanpinBannerGuiFragment;
import com.blackhub.bronline.game.gui.tanpinbanner.TanpinBannerGuiFragment_MembersInjector;
import com.blackhub.bronline.game.gui.tanpinbanner.TanpinBannerViewModel;
import com.blackhub.bronline.game.gui.tanpinbanner.TanpinBannerViewModel_Factory;
import com.blackhub.bronline.game.gui.taxi.TaxiActionWithJSON;
import com.blackhub.bronline.game.gui.taxi.TaxiFragment;
import com.blackhub.bronline.game.gui.taxi.TaxiFragment_MembersInjector;
import com.blackhub.bronline.game.gui.taxi.TaxiViewModel;
import com.blackhub.bronline.game.gui.taxi.TaxiViewModel_Factory;
import com.blackhub.bronline.game.gui.taximap.TaxiMapActionWithJSON;
import com.blackhub.bronline.game.gui.taximap.TaxiMapFragment;
import com.blackhub.bronline.game.gui.taximap.TaxiMapFragment_MembersInjector;
import com.blackhub.bronline.game.gui.taximap.TaxiMapViewModel;
import com.blackhub.bronline.game.gui.taximap.TaxiMapViewModel_Factory;
import com.blackhub.bronline.game.gui.taxiorder.TaxiOrderActionWithJSON;
import com.blackhub.bronline.game.gui.taxiorder.TaxiOrderFragment;
import com.blackhub.bronline.game.gui.taxiorder.TaxiOrderFragment_MembersInjector;
import com.blackhub.bronline.game.gui.taxiorder.TaxiOrderViewModel;
import com.blackhub.bronline.game.gui.taxiorder.TaxiOrderViewModel_Factory;
import com.blackhub.bronline.game.gui.taxirating.TaxiRatingActionWithJSON;
import com.blackhub.bronline.game.gui.taxirating.TaxiRatingFragment;
import com.blackhub.bronline.game.gui.taxirating.TaxiRatingFragment_MembersInjector;
import com.blackhub.bronline.game.gui.taxirating.TaxiRatingViewModel;
import com.blackhub.bronline.game.gui.taxirating.TaxiRatingViewModel_Factory;
import com.blackhub.bronline.game.gui.tuning.CostCalculation;
import com.blackhub.bronline.game.gui.tuning.GUITuning;
import com.blackhub.bronline.game.gui.tuning.GUITuning_MembersInjector;
import com.blackhub.bronline.game.gui.tuning.network.TuningActionWithJSON;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningCollapseViewModel;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningCollapseViewModel_Factory;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningColorListViewModel;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningColorListViewModel_Factory;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel_Factory;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDiagnosticViewModel;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDiagnosticViewModel_Factory;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningMainViewModel;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningMainViewModel_Factory;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningViewCarViewModel;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningViewCarViewModel_Factory;
import com.blackhub.bronline.game.gui.tutorialhints.TutorialGuiFragment;
import com.blackhub.bronline.game.gui.tutorialhints.TutorialGuiFragment_MembersInjector;
import com.blackhub.bronline.game.gui.tutorialhints.TutorialHintActionWithJSON;
import com.blackhub.bronline.game.gui.tutorialhints.TutorialViewModel;
import com.blackhub.bronline.game.gui.tutorialhints.TutorialViewModel_Factory;
import com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventActionWithJSON;
import com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventGuiFragment;
import com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventGuiFragment_MembersInjector;
import com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventViewModel;
import com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventViewModel_Factory;
import com.blackhub.bronline.game.gui.videoplayer.VideoPlayerActionWithJson;
import com.blackhub.bronline.game.gui.videoplayer.VideoPlayerGuiFragment;
import com.blackhub.bronline.game.gui.videoplayer.VideoPlayerGuiFragment_MembersInjector;
import com.blackhub.bronline.game.gui.videoplayer.VideoPlayerViewModel;
import com.blackhub.bronline.game.gui.videoplayer.VideoPlayerViewModel_Factory;
import com.blackhub.bronline.game.gui.woundsystem.GUIWoundSystem;
import com.blackhub.bronline.game.gui.woundsystem.GUIWoundSystem_MembersInjector;
import com.blackhub.bronline.game.gui.woundsystem.network.ActionsWithJSON;
import com.blackhub.bronline.game.gui.woundsystem.viewmodel.WoundSystemViewModel;
import com.blackhub.bronline.game.gui.woundsystem.viewmodel.WoundSystemViewModel_Factory;
import com.blackhub.bronline.game.gui.youtubeplayer.YotubePlayerFragment;
import com.blackhub.bronline.game.gui.youtubeplayer.YotubePlayerFragment_MembersInjector;
import com.blackhub.bronline.game.gui.youtubeplayer.YoutubePlayerActionWithJSON;
import com.blackhub.bronline.game.gui.youtubeplayer.YoutubePlayerViewModel;
import com.blackhub.bronline.game.gui.youtubeplayer.YoutubePlayerViewModel_Factory;
import com.blackhub.bronline.game.repository.impl.GiftsRepositoryImpl;
import com.blackhub.bronline.game.repository.impl.GiftsRepositoryImpl_Factory;
import com.blackhub.bronline.game.repository.impl.LauncherRepositoryImpl;
import com.blackhub.bronline.game.repository.impl.LauncherRepositoryImpl_Factory;
import com.blackhub.bronline.game.repository.impl.UpgradeObjectRepositoryImpl;
import com.blackhub.bronline.game.repository.impl.UpgradeObjectRepositoryImpl_Factory;
import com.blackhub.bronline.game.sources.remote.GiftsDataSourceImpl;
import com.blackhub.bronline.game.sources.remote.GiftsDataSourceImpl_Factory;
import com.blackhub.bronline.game.sources.remote.LauncherDataSourceImpl;
import com.blackhub.bronline.game.sources.remote.LauncherDataSourceImpl_Factory;
import com.blackhub.bronline.game.sources.remote.UpgradeObjectEventDataSourceImpl;
import com.blackhub.bronline.game.sources.remote.UpgradeObjectEventDataSourceImpl_Factory;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.App_MembersInjector;
import com.blackhub.bronline.launcher.activities.MainActivity;
import com.blackhub.bronline.launcher.activities.MainActivity_MembersInjector;
import com.blackhub.bronline.launcher.database.LauncherDatabase;
import com.blackhub.bronline.launcher.database.PurchaseDatabase;
import com.blackhub.bronline.launcher.download.DownloadWorker;
import com.blackhub.bronline.launcher.download.DownloadWorker_MembersInjector;
import com.blackhub.bronline.launcher.network.Api;
import com.blackhub.bronline.launcher.network.PaymentApi;
import com.blackhub.bronline.launcher.p021di.ApplicationComponent;
import com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel;
import com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel_Factory;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@DaggerGenerated
/* loaded from: classes3.dex */
public final class DaggerApplicationComponent {
    public static ApplicationComponent.Builder builder() {
        return new Builder();
    }

    /* loaded from: classes4.dex */
    public static final class Builder implements ApplicationComponent.Builder {
        public App app;

        public /* synthetic */ Builder(BuilderIA builderIA) {
            this();
        }

        public Builder() {
        }

        @Override // com.blackhub.bronline.launcher.di.ApplicationComponent.Builder
        public Builder app(App app) {
            this.app = (App) Preconditions.checkNotNull(app);
            return this;
        }

        @Override // com.blackhub.bronline.launcher.di.ApplicationComponent.Builder
        public ApplicationComponent build() {
            Preconditions.checkBuilderRequirement(this.app, App.class);
            return new ApplicationComponentImpl(new AppModule(), new BillingModule(), new NetworkModule(), new DatabaseModule(), new ResourceModule(), new DispatcherModule(), new AnalyticsModule(), new AppLifeCycleObserverModule(), this.app);
        }
    }

    /* loaded from: classes4.dex */
    public static final class ApplicationComponentImpl implements ApplicationComponent {
        public Provider<ActiveTaskViewModel> activeTaskViewModelProvider;
        public Provider<AdminToolsViewModel> adminToolsViewModelProvider;
        public final AppModule appModule;
        public Provider<App> appProvider;
        public final ApplicationComponentImpl applicationComponentImpl;
        public Provider<BlackPassActivateViewModel> blackPassActivateViewModelProvider;
        public Provider<BlackPassBannerViewModel> blackPassBannerViewModelProvider;
        public Provider<BlackPassMainViewModel> blackPassMainViewModelProvider;
        public Provider<BlackPassPrizeListViewModel> blackPassPrizeListViewModelProvider;
        public Provider<BpRewardsViewModel> bpRewardsViewModelProvider;
        public Provider<BrSimBannerViewModel> brSimBannerViewModelProvider;
        public Provider<CalendarViewModel> calendarViewModelProvider;
        public Provider<CasesViewModel> casesViewModelProvider;
        public Provider<CatchStreamerViewModel> catchStreamerViewModelProvider;
        public Provider<ChangeBulbViewModel> changeBulbViewModelProvider;
        public Provider<ChatViewModel> chatViewModelProvider;
        public Provider<ClickerViewModel> clickerViewModelProvider;
        public Provider<CollectSchemeViewModel> collectSchemeViewModelProvider;
        public Provider<CraftViewModel> craftViewModelProvider;
        public final DatabaseModule databaseModule;
        public Provider<DonateDepositCoinsViewModel> donateDepositCoinsViewModelProvider;
        public Provider<DonateMainViewModel> donateMainViewModelProvider;
        public Provider<DonateTileViewModel> donateTileViewModelProvider;
        public Provider<DrivingSchoolQuestsViewModel> drivingSchoolQuestsViewModelProvider;
        public Provider<DrivingSchoolViewModel> drivingSchoolViewModelProvider;
        public Provider<ElectricViewModel> electricViewModelProvider;
        public Provider<EntertainmentGamesViewModel> entertainmentGamesViewModelProvider;
        public Provider<FinalWindowViewModel> finalWindowViewModelProvider;
        public Provider<FindProblemViewModel> findProblemViewModelProvider;
        public Provider<FishingViewModel> fishingViewModelProvider;
        public Provider<FractionsControlViewModel> fractionsControlViewModelProvider;
        public Provider<FractionsDocumentsViewModel> fractionsDocumentsViewModelProvider;
        public Provider<FractionsMainViewModel> fractionsMainViewModelProvider;
        public Provider<FractionsQuestsViewModel> fractionsQuestsViewModelProvider;
        public Provider<FractionsShopViewModel> fractionsShopViewModelProvider;
        public Provider<FuelFillViewModel> fuelFillViewModelProvider;
        public Provider<GasmanChildViewModel> gasmanChildViewModelProvider;
        public Provider<GasmanParentViewModel> gasmanParentViewModelProvider;
        public Provider<GiftsDataSourceImpl> giftsDataSourceImplProvider;
        public Provider<GiftsRepositoryImpl> giftsRepositoryImplProvider;
        public Provider<GiftsViewModel> giftsViewModelProvider;
        public Provider<HalloweenAwardViewModel> halloweenAwardViewModelProvider;
        public Provider<HolidayEventsViewModel> holidayEventsViewModelProvider;
        public Provider<InteractionWithNpcViewModel> interactionWithNpcViewModelProvider;
        public Provider<JNIActivityViewModel> jNIActivityViewModelProvider;
        public Provider<LauncherDataSourceImpl> launcherDataSourceImplProvider;
        public Provider<LauncherRepositoryImpl> launcherRepositoryImplProvider;
        public Provider<MainActivityViewModel> mainActivityViewModelProvider;
        public Provider<MarketplaceViewModel> marketplaceViewModelProvider;
        public Provider<MenuPauseViewModel> menuPauseViewModelProvider;
        public Provider<MenuSettingControlViewModel> menuSettingControlViewModelProvider;
        public Provider<MenuSettingGraphicViewModel> menuSettingGraphicViewModelProvider;
        public Provider<MenuSettingSoundViewModel> menuSettingSoundViewModelProvider;
        public Provider<MenuSettingWinterViewModel> menuSettingWinterViewModelProvider;
        public Provider<MenuViewModel> menuViewModelProvider;
        public Provider<MiniGamesHelperViewModel> miniGamesHelperViewModelProvider;
        public Provider<ModuleDialogViewModel> moduleDialogViewModelProvider;
        public Provider<NotificationViewModel> notificationViewModelProvider;
        public Provider<PanelInfoViewModel> panelInfoViewModelProvider;
        public Provider<PlatesViewModel> platesViewModelProvider;
        public Provider<PlayersListViewModel> playersListViewModelProvider;
        public Provider<ActiveTaskActionWithJSON> provideActiveTaskActionWithJSONProvider;
        public Provider<AdminToolsActionWithJSON> provideAdminToolsActionWithJSONProvider;
        public Provider<Api> provideApiServiceProvider;
        public Provider<Context> provideAppContextProvider;
        public Provider<AppLifecycleObserverImpl> provideAppLifeCycleObserverProvider;
        public Provider<Application> provideApplicationProvider;
        public Provider<Api> provideBackupApiServiceProvider;
        public Provider<Api> provideBackupCdnApiServiceProvider;
        public Provider<BillingClientWrapper> provideBillingClientWrapperProvider;
        public Provider<PaymentApi> provideBillingServiceProvider;
        public Provider<BitmapResource> provideBitmapResourceProvider;
        public Provider<BlackPassActionWithJSON> provideBlackPassActionWithJSONProvider;
        public Provider<BlackPassBannerActionsWithJson> provideBlackPassBannerActionsWithJsonProvider;
        public Provider<BpRewardsActionWithJSON> provideBpRewardsActionWithJSONProvider;
        public Provider<MenuActionsWithJson> provideBrDialogMenuActionsWithJsonProvider;
        public Provider<BrSimBannerActionsWithJson> provideBrSimBannerActionsWithJsonProvider;
        public Provider<CalendarActionWithJSON> provideCalendarActionWithJSONProvider;
        public Provider<CasesActionWithJSON> provideCasesActionWithJSONProvider;
        public Provider<CatchStreamerActionWithJSON> provideCatchStreamerActionWithJSONProvider;
        public Provider<Api> provideCdnApiServiceProvider;
        public Provider<ChatActionsWithJson> provideChatActionsWithJSONProvider;
        public Provider<ClickerActionsWithJson> provideClickerActionsWithJSONProvider;
        public Provider<CraftActionWithJSON> provideCraftActionWithJSONProvider;
        public Provider<DonateActionWithJSON> provideDonateActionWithJSONProvider;
        public Provider<DrivingSchoolActionsWithJSON> provideDrivingSchoolActionWithJSONProvider;
        public Provider<ElectricActionWithJSON> provideElectricActionWithJSONProvider;
        public Provider<EntertainmentSystemActionsWithJSON> provideEntertainmentSystemActionsWithJSONProvider;
        public Provider<LocalNotification> provideErrorNotificationProvider;
        public Provider<FishingActionWithJSON> provideFishingActionWithJSONProvider;
        public Provider<FractionActionsWithJSON> provideFractionActionsWithJSONProvider;
        public Provider<FuelFillActionWithJSON> provideFuelFullActionWithJSONProvider;
        public Provider<GasmanActionsWithJson> provideGasmanActionWithJsonProvider;
        public Provider<GiftsActionWithJSON> provideGiftsActionWithJSONProvider;
        public Provider<HalloweenAwardActionWithJSON> provideHalloweenAwardActionWithJSONProvider;
        public Provider<HolidayEventsActionsWithJSON> provideHolidayEventsActionsWithJSONProvider;
        public Provider<InteractionWithNpcActionWithJSON> provideInteractionWithNpcActionWithJSONProvider;
        public Provider<JNIActivityActionWithJSON> provideJNIActivityActionWithJSONProvider;
        public Provider<LauncherDatabase> provideLauncherDatabaseProvider;
        public Provider<MarketplaceActionWithJson> provideMarketplaceActionWithJSONProvider;
        public Provider<MiniGamesHelperWithJSON> provideMiniGamesHelperActionWithJSONProvider;
        public Provider<ModuleDialogActionsWithJson> provideModuleDialogActionsWithJSONProvider;
        public Provider<NewMenuActionWithJSON> provideNewMenuActionWithJSONProvider;
        public Provider<NotificationActionWithJSON> provideNotificationActionWithJSONProvider;
        public Provider<PanelInfoActionWithJSON> providePanelInfoActionWithJSONProvider;
        public Provider<PlatesActionWithJSON> providePlatesActionWithJSONProvider;
        public Provider<PlayersListActionWithJson> providePlayersListActionWithJsonProvider;
        public Provider<PreferencesRepository> providePreferencesRepositoryProvider;
        public Provider<PurchaseDatabase> providePurchaseDatabaseProvider;
        public Provider<RadialMenuActionWithJSON> provideRadialMenuActionWithJSONProvider;
        public Provider<RateAppActionWithJson> provideRateAppActionWithJSONProvider;
        public Provider<RateAppAnalytics> provideRateAppAnalyticsProvider;
        public Provider<RatingActionWithJson> provideRatingActionWithJsonProvider;
        public Provider<RentActionWithJSON> provideRentActionWithJSONProvider;
        public Provider<RustoreBillingClientWrapper> provideRustoreBillingClientWrapperProvider;
        public Provider<SmiEditorActionWithJSON> provideSmiEditorActionWithJSONProvider;
        public Provider<SocialNetworkActionWithJSON> provideSocialNetworkActionWithJSONProvider;
        public Provider<SpawnLocationActionsWithJson> provideSpawnLocationActionsWithJsonProvider;
        public Provider<SpawnLocationRepository> provideSpawnLocationRepositoryProvider;
        public Provider<StringResource> provideStringResourceProvider;
        public Provider<TanpinBannerActionWithJSON> provideTanpinBannerActionWithJSONProvider;
        public Provider<TaxiActionWithJSON> provideTaxiActionWithJSONProvider;
        public Provider<TaxiMapActionWithJSON> provideTaxiMapActionWithJSONProvider;
        public Provider<TaxiOrderActionWithJSON> provideTaxiOrderActionWithJSONProvider;
        public Provider<TaxiRatingActionWithJSON> provideTaxiRatingActionWithJSONProvider;
        public Provider<TuningActionWithJSON> provideTuningActionWithJSONProvider;
        public Provider<CostCalculation> provideTuningCostCalculationProvider;
        public Provider<TutorialHintActionWithJSON> provideTutorialHintActionWithJSONProvider;
        public Provider<UpgradeObjectEventActionWithJSON> provideUpgradeObjectActionWithJSONProvider;
        public Provider<VideoPlayerActionWithJson> provideVideoPlayerActionWithJSONProvider;
        public Provider<ActionsWithJSON> provideWoundSystemActionWithJSONProvider;
        public Provider<YoutubePlayerActionWithJSON> provideYoutubePlayerActionWithJSONProvider;
        public Provider<CoroutineDispatcher> providesIoDispatcherProvider;
        public Provider<RadialMenuViewModel> radialMenuViewModelProvider;
        public Provider<RaiseChargeViewModel> raiseChargeViewModelProvider;
        public Provider<RateAppViewModel> rateAppViewModelProvider;
        public Provider<RatingViewModel> ratingViewModelProvider;
        public Provider<RentViewModel> rentViewModelProvider;
        public Provider<SmiEditorViewModel> smiEditorViewModelProvider;
        public Provider<SocialNetworkLinkViewModel> socialNetworkLinkViewModelProvider;
        public Provider<SpawnLocationViewModel> spawnLocationViewModelProvider;
        public Provider<SumContactsViewModel> sumContactsViewModelProvider;
        public Provider<TanpinBannerViewModel> tanpinBannerViewModelProvider;
        public Provider<TaxiMapViewModel> taxiMapViewModelProvider;
        public Provider<TaxiOrderViewModel> taxiOrderViewModelProvider;
        public Provider<TaxiRatingViewModel> taxiRatingViewModelProvider;
        public Provider<TaxiViewModel> taxiViewModelProvider;
        public Provider<TuningCollapseViewModel> tuningCollapseViewModelProvider;
        public Provider<TuningColorListViewModel> tuningColorListViewModelProvider;
        public Provider<TuningDetailsListViewModel> tuningDetailsListViewModelProvider;
        public Provider<TuningDiagnosticViewModel> tuningDiagnosticViewModelProvider;
        public Provider<TuningMainViewModel> tuningMainViewModelProvider;
        public Provider<TuningViewCarViewModel> tuningViewCarViewModelProvider;
        public Provider<TutorialViewModel> tutorialViewModelProvider;
        public Provider<UpgradeObjectEventDataSourceImpl> upgradeObjectEventDataSourceImplProvider;
        public Provider<UpgradeObjectEventViewModel> upgradeObjectEventViewModelProvider;
        public Provider<UpgradeObjectRepositoryImpl> upgradeObjectRepositoryImplProvider;
        public Provider<VideoPlayerViewModel> videoPlayerViewModelProvider;
        public Provider<WoundSystemViewModel> woundSystemViewModelProvider;
        public Provider<YoutubePlayerViewModel> youtubePlayerViewModelProvider;

        public /* synthetic */ ApplicationComponentImpl(AppModule appModule, BillingModule billingModule, NetworkModule networkModule, DatabaseModule databaseModule, ResourceModule resourceModule, DispatcherModule dispatcherModule, AnalyticsModule analyticsModule, AppLifeCycleObserverModule appLifeCycleObserverModule, App app, ApplicationComponentImplIA applicationComponentImplIA) {
            this(appModule, billingModule, networkModule, databaseModule, resourceModule, dispatcherModule, analyticsModule, appLifeCycleObserverModule, app);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(ChooseServerGuiFragment chooseServerGuiFragmentDialog) {
        }

        public ApplicationComponentImpl(AppModule appModuleParam, BillingModule billingModuleParam, NetworkModule networkModuleParam, DatabaseModule databaseModuleParam, ResourceModule resourceModuleParam, DispatcherModule dispatcherModuleParam, AnalyticsModule analyticsModuleParam, AppLifeCycleObserverModule appLifeCycleObserverModuleParam, App appParam) {
            this.applicationComponentImpl = this;
            this.databaseModule = databaseModuleParam;
            this.appModule = appModuleParam;
            initialize(appModuleParam, billingModuleParam, networkModuleParam, databaseModuleParam, resourceModuleParam, dispatcherModuleParam, analyticsModuleParam, appLifeCycleObserverModuleParam, appParam);
            initialize2(appModuleParam, billingModuleParam, networkModuleParam, databaseModuleParam, resourceModuleParam, dispatcherModuleParam, analyticsModuleParam, appLifeCycleObserverModuleParam, appParam);
        }

        public final MainViewModelFactory<MainActivityViewModel> mainViewModelFactoryOfMainActivityViewModel() {
            return new MainViewModelFactory<>(this.mainActivityViewModelProvider);
        }

        public final Context appContextContext() {
            return AppModule_ProvideAppContextFactory.provideAppContext(this.appModule, this.provideApplicationProvider.get());
        }

        public final LauncherDatabase launcherDatabase() {
            return DatabaseModule_ProvideLauncherDatabaseFactory.provideLauncherDatabase(this.databaseModule, appContextContext());
        }

        public final MainViewModelFactory<JNIActivityViewModel> mainViewModelFactoryOfJNIActivityViewModel() {
            return new MainViewModelFactory<>(this.jNIActivityViewModelProvider);
        }

        public final MainViewModelFactory<TuningMainViewModel> mainViewModelFactoryOfTuningMainViewModel() {
            return new MainViewModelFactory<>(this.tuningMainViewModelProvider);
        }

        public final MainViewModelFactory<TuningViewCarViewModel> mainViewModelFactoryOfTuningViewCarViewModel() {
            return new MainViewModelFactory<>(this.tuningViewCarViewModelProvider);
        }

        public final MainViewModelFactory<TuningCollapseViewModel> mainViewModelFactoryOfTuningCollapseViewModel() {
            return new MainViewModelFactory<>(this.tuningCollapseViewModelProvider);
        }

        public final MainViewModelFactory<TuningDiagnosticViewModel> mainViewModelFactoryOfTuningDiagnosticViewModel() {
            return new MainViewModelFactory<>(this.tuningDiagnosticViewModelProvider);
        }

        public final MainViewModelFactory<TuningDetailsListViewModel> mainViewModelFactoryOfTuningDetailsListViewModel() {
            return new MainViewModelFactory<>(this.tuningDetailsListViewModelProvider);
        }

        public final MainViewModelFactory<TuningColorListViewModel> mainViewModelFactoryOfTuningColorListViewModel() {
            return new MainViewModelFactory<>(this.tuningColorListViewModelProvider);
        }

        public final MainViewModelFactory<FractionsMainViewModel> mainViewModelFactoryOfFractionsMainViewModel() {
            return new MainViewModelFactory<>(this.fractionsMainViewModelProvider);
        }

        public final MainViewModelFactory<FractionsQuestsViewModel> mainViewModelFactoryOfFractionsQuestsViewModel() {
            return new MainViewModelFactory<>(this.fractionsQuestsViewModelProvider);
        }

        public final MainViewModelFactory<FractionsDocumentsViewModel> mainViewModelFactoryOfFractionsDocumentsViewModel() {
            return new MainViewModelFactory<>(this.fractionsDocumentsViewModelProvider);
        }

        public final MainViewModelFactory<FractionsShopViewModel> mainViewModelFactoryOfFractionsShopViewModel() {
            return new MainViewModelFactory<>(this.fractionsShopViewModelProvider);
        }

        public final MainViewModelFactory<FractionsControlViewModel> mainViewModelFactoryOfFractionsControlViewModel() {
            return new MainViewModelFactory<>(this.fractionsControlViewModelProvider);
        }

        public final MainViewModelFactory<SpawnLocationViewModel> mainViewModelFactoryOfSpawnLocationViewModel() {
            return new MainViewModelFactory<>(this.spawnLocationViewModelProvider);
        }

        public final MainViewModelFactory<MiniGamesHelperViewModel> mainViewModelFactoryOfMiniGamesHelperViewModel() {
            return new MainViewModelFactory<>(this.miniGamesHelperViewModelProvider);
        }

        public final MainViewModelFactory<SmiEditorViewModel> mainViewModelFactoryOfSmiEditorViewModel() {
            return new MainViewModelFactory<>(this.smiEditorViewModelProvider);
        }

        public final MainViewModelFactory<PlayersListViewModel> mainViewModelFactoryOfPlayersListViewModel() {
            return new MainViewModelFactory<>(this.playersListViewModelProvider);
        }

        public final MainViewModelFactory<DonateMainViewModel> mainViewModelFactoryOfDonateMainViewModel() {
            return new MainViewModelFactory<>(this.donateMainViewModelProvider);
        }

        public final MainViewModelFactory<DonateTileViewModel> mainViewModelFactoryOfDonateTileViewModel() {
            return new MainViewModelFactory<>(this.donateTileViewModelProvider);
        }

        public final MainViewModelFactory<DonateDepositCoinsViewModel> mainViewModelFactoryOfDonateDepositCoinsViewModel() {
            return new MainViewModelFactory<>(this.donateDepositCoinsViewModelProvider);
        }

        public final MainViewModelFactory<DonateServiceViewModel> mainViewModelFactoryOfDonateServiceViewModel() {
            return new MainViewModelFactory<>(DonateServiceViewModel_Factory.create());
        }

        public final MainViewModelFactory<BlackPassMainViewModel> mainViewModelFactoryOfBlackPassMainViewModel() {
            return new MainViewModelFactory<>(this.blackPassMainViewModelProvider);
        }

        public final MainViewModelFactory<BlackPassActivateViewModel> mainViewModelFactoryOfBlackPassActivateViewModel() {
            return new MainViewModelFactory<>(this.blackPassActivateViewModelProvider);
        }

        public final MainViewModelFactory<BlackPassPrizeListViewModel> mainViewModelFactoryOfBlackPassPrizeListViewModel() {
            return new MainViewModelFactory<>(this.blackPassPrizeListViewModelProvider);
        }

        public final MainViewModelFactory<TutorialViewModel> mainViewModelFactoryOfTutorialViewModel() {
            return new MainViewModelFactory<>(this.tutorialViewModelProvider);
        }

        public final MainViewModelFactory<RadialMenuViewModel> mainViewModelFactoryOfRadialMenuViewModel() {
            return new MainViewModelFactory<>(this.radialMenuViewModelProvider);
        }

        public final MainViewModelFactory<DrivingSchoolViewModel> mainViewModelFactoryOfDrivingSchoolViewModel() {
            return new MainViewModelFactory<>(this.drivingSchoolViewModelProvider);
        }

        public final MainViewModelFactory<DrivingSchoolMainViewModel> mainViewModelFactoryOfDrivingSchoolMainViewModel() {
            return new MainViewModelFactory<>(DrivingSchoolMainViewModel_Factory.create());
        }

        public final MainViewModelFactory<DrivingSchoolClassInfoViewModel> mainViewModelFactoryOfDrivingSchoolClassInfoViewModel() {
            return new MainViewModelFactory<>(DrivingSchoolClassInfoViewModel_Factory.create());
        }

        public final MainViewModelFactory<DrivingSchoolQuestsViewModel> mainViewModelFactoryOfDrivingSchoolQuestsViewModel() {
            return new MainViewModelFactory<>(this.drivingSchoolQuestsViewModelProvider);
        }

        public final MainViewModelFactory<MenuPauseViewModel> mainViewModelFactoryOfMenuPauseViewModel() {
            return new MainViewModelFactory<>(this.menuPauseViewModelProvider);
        }

        public final MainViewModelFactory<MenuSettingGraphicViewModel> mainViewModelFactoryOfMenuSettingGraphicViewModel() {
            return new MainViewModelFactory<>(this.menuSettingGraphicViewModelProvider);
        }

        public final MainViewModelFactory<MenuSettingSoundViewModel> mainViewModelFactoryOfMenuSettingSoundViewModel() {
            return new MainViewModelFactory<>(this.menuSettingSoundViewModelProvider);
        }

        public final MainViewModelFactory<MenuSettingControlViewModel> mainViewModelFactoryOfMenuSettingControlViewModel() {
            return new MainViewModelFactory<>(this.menuSettingControlViewModelProvider);
        }

        public final MainViewModelFactory<MenuSettingWinterViewModel> mainViewModelFactoryOfMenuSettingWinterViewModel() {
            return new MainViewModelFactory<>(this.menuSettingWinterViewModelProvider);
        }

        public final MainViewModelFactory<WoundSystemViewModel> mainViewModelFactoryOfWoundSystemViewModel() {
            return new MainViewModelFactory<>(this.woundSystemViewModelProvider);
        }

        public final MainViewModelFactory<EntertainmentGamesViewModel> mainViewModelFactoryOfEntertainmentGamesViewModel() {
            return new MainViewModelFactory<>(this.entertainmentGamesViewModelProvider);
        }

        public final MainViewModelFactory<FinalWindowViewModel> mainViewModelFactoryOfFinalWindowViewModel() {
            return new MainViewModelFactory<>(this.finalWindowViewModelProvider);
        }

        public final MainViewModelFactory<CraftViewModel> mainViewModelFactoryOfCraftViewModel() {
            return new MainViewModelFactory<>(this.craftViewModelProvider);
        }

        public final MainViewModelFactory<NotificationViewModel> mainViewModelFactoryOfNotificationViewModel() {
            return new MainViewModelFactory<>(this.notificationViewModelProvider);
        }

        public final MainViewModelFactory<FuelFillViewModel> mainViewModelFactoryOfFuelFillViewModel() {
            return new MainViewModelFactory<>(this.fuelFillViewModelProvider);
        }

        public final MainViewModelFactory<ElectricViewModel> mainViewModelFactoryOfElectricViewModel() {
            return new MainViewModelFactory<>(this.electricViewModelProvider);
        }

        public final MainViewModelFactory<FindProblemViewModel> mainViewModelFactoryOfFindProblemViewModel() {
            return new MainViewModelFactory<>(this.findProblemViewModelProvider);
        }

        public final MainViewModelFactory<ChangeBulbViewModel> mainViewModelFactoryOfChangeBulbViewModel() {
            return new MainViewModelFactory<>(this.changeBulbViewModelProvider);
        }

        public final MainViewModelFactory<CollectSchemeViewModel> mainViewModelFactoryOfCollectSchemeViewModel() {
            return new MainViewModelFactory<>(this.collectSchemeViewModelProvider);
        }

        public final MainViewModelFactory<RaiseChargeViewModel> mainViewModelFactoryOfRaiseChargeViewModel() {
            return new MainViewModelFactory<>(this.raiseChargeViewModelProvider);
        }

        public final MainViewModelFactory<SumContactsViewModel> mainViewModelFactoryOfSumContactsViewModel() {
            return new MainViewModelFactory<>(this.sumContactsViewModelProvider);
        }

        public final MainViewModelFactory<CatchStreamerViewModel> mainViewModelFactoryOfCatchStreamerViewModel() {
            return new MainViewModelFactory<>(this.catchStreamerViewModelProvider);
        }

        public final MainViewModelFactory<YoutubePlayerViewModel> mainViewModelFactoryOfYoutubePlayerViewModel() {
            return new MainViewModelFactory<>(this.youtubePlayerViewModelProvider);
        }

        public final MainViewModelFactory<FishingViewModel> mainViewModelFactoryOfFishingViewModel() {
            return new MainViewModelFactory<>(this.fishingViewModelProvider);
        }

        public final MainViewModelFactory<TaxiMapViewModel> mainViewModelFactoryOfTaxiMapViewModel() {
            return new MainViewModelFactory<>(this.taxiMapViewModelProvider);
        }

        public final MainViewModelFactory<TaxiOrderViewModel> mainViewModelFactoryOfTaxiOrderViewModel() {
            return new MainViewModelFactory<>(this.taxiOrderViewModelProvider);
        }

        public final MainViewModelFactory<TaxiViewModel> mainViewModelFactoryOfTaxiViewModel() {
            return new MainViewModelFactory<>(this.taxiViewModelProvider);
        }

        public final MainViewModelFactory<HalloweenAwardViewModel> mainViewModelFactoryOfHalloweenAwardViewModel() {
            return new MainViewModelFactory<>(this.halloweenAwardViewModelProvider);
        }

        public final MainViewModelFactory<InteractionWithNpcViewModel> mainViewModelFactoryOfInteractionWithNpcViewModel() {
            return new MainViewModelFactory<>(this.interactionWithNpcViewModelProvider);
        }

        public final MainViewModelFactory<BlackPassBannerViewModel> mainViewModelFactoryOfBlackPassBannerViewModel() {
            return new MainViewModelFactory<>(this.blackPassBannerViewModelProvider);
        }

        public final MainViewModelFactory<ActiveTaskViewModel> mainViewModelFactoryOfActiveTaskViewModel() {
            return new MainViewModelFactory<>(this.activeTaskViewModelProvider);
        }

        public final MainViewModelFactory<GasmanParentViewModel> mainViewModelFactoryOfGasmanParentViewModel() {
            return new MainViewModelFactory<>(this.gasmanParentViewModelProvider);
        }

        public final MainViewModelFactory<GasmanChildViewModel> mainViewModelFactoryOfGasmanChildViewModel() {
            return new MainViewModelFactory<>(this.gasmanChildViewModelProvider);
        }

        public final MainViewModelFactory<SocialNetworkLinkViewModel> mainViewModelFactoryOfSocialNetworkLinkViewModel() {
            return new MainViewModelFactory<>(this.socialNetworkLinkViewModelProvider);
        }

        public final MainViewModelFactory<BrSimBannerViewModel> mainViewModelFactoryOfBrSimBannerViewModel() {
            return new MainViewModelFactory<>(this.brSimBannerViewModelProvider);
        }

        public final MainViewModelFactory<AdminToolsViewModel> mainViewModelFactoryOfAdminToolsViewModel() {
            return new MainViewModelFactory<>(this.adminToolsViewModelProvider);
        }

        public final MainViewModelFactory<UpgradeObjectEventViewModel> mainViewModelFactoryOfUpgradeObjectEventViewModel() {
            return new MainViewModelFactory<>(this.upgradeObjectEventViewModelProvider);
        }

        public final MainViewModelFactory<GiftsViewModel> mainViewModelFactoryOfGiftsViewModel() {
            return new MainViewModelFactory<>(this.giftsViewModelProvider);
        }

        public final MainViewModelFactory<PanelInfoViewModel> mainViewModelFactoryOfPanelInfoViewModel() {
            return new MainViewModelFactory<>(this.panelInfoViewModelProvider);
        }

        public final MainViewModelFactory<MenuViewModel> mainViewModelFactoryOfMenuViewModel() {
            return new MainViewModelFactory<>(this.menuViewModelProvider);
        }

        public final MainViewModelFactory<RentViewModel> mainViewModelFactoryOfRentViewModel() {
            return new MainViewModelFactory<>(this.rentViewModelProvider);
        }

        public final MainViewModelFactory<PlatesViewModel> mainViewModelFactoryOfPlatesViewModel() {
            return new MainViewModelFactory<>(this.platesViewModelProvider);
        }

        public final MainViewModelFactory<RateAppViewModel> mainViewModelFactoryOfRateAppViewModel() {
            return new MainViewModelFactory<>(this.rateAppViewModelProvider);
        }

        public final MainViewModelFactory<CalendarViewModel> mainViewModelFactoryOfCalendarViewModel() {
            return new MainViewModelFactory<>(this.calendarViewModelProvider);
        }

        public final MainViewModelFactory<CasesViewModel> mainViewModelFactoryOfCasesViewModel() {
            return new MainViewModelFactory<>(this.casesViewModelProvider);
        }

        public final MainViewModelFactory<BpRewardsViewModel> mainViewModelFactoryOfBpRewardsViewModel() {
            return new MainViewModelFactory<>(this.bpRewardsViewModelProvider);
        }

        public final MainViewModelFactory<TaxiRatingViewModel> mainViewModelFactoryOfTaxiRatingViewModel() {
            return new MainViewModelFactory<>(this.taxiRatingViewModelProvider);
        }

        public final MainViewModelFactory<TanpinBannerViewModel> mainViewModelFactoryOfTanpinBannerViewModel() {
            return new MainViewModelFactory<>(this.tanpinBannerViewModelProvider);
        }

        public final MainViewModelFactory<VideoPlayerViewModel> mainViewModelFactoryOfVideoPlayerViewModel() {
            return new MainViewModelFactory<>(this.videoPlayerViewModelProvider);
        }

        public final MainViewModelFactory<MarketplaceViewModel> mainViewModelFactoryOfMarketplaceViewModel() {
            return new MainViewModelFactory<>(this.marketplaceViewModelProvider);
        }

        public final MainViewModelFactory<RatingViewModel> mainViewModelFactoryOfRatingViewModel() {
            return new MainViewModelFactory<>(this.ratingViewModelProvider);
        }

        public final MainViewModelFactory<HolidayEventsViewModel> mainViewModelFactoryOfHolidayEventsViewModel() {
            return new MainViewModelFactory<>(this.holidayEventsViewModelProvider);
        }

        public final MainViewModelFactory<ClickerViewModel> mainViewModelFactoryOfClickerViewModel() {
            return new MainViewModelFactory<>(this.clickerViewModelProvider);
        }

        public final MainViewModelFactory<ChatViewModel> mainViewModelFactoryOfChatViewModel() {
            return new MainViewModelFactory<>(this.chatViewModelProvider);
        }

        public final MainViewModelFactory<ModuleDialogViewModel> mainViewModelFactoryOfModuleDialogViewModel() {
            return new MainViewModelFactory<>(this.moduleDialogViewModelProvider);
        }

        public final void initialize(final AppModule appModuleParam, final BillingModule billingModuleParam, final NetworkModule networkModuleParam, final DatabaseModule databaseModuleParam, final ResourceModule resourceModuleParam, final DispatcherModule dispatcherModuleParam, final AnalyticsModule analyticsModuleParam, final AppLifeCycleObserverModule appLifeCycleObserverModuleParam, final App appParam) {
            this.provideAppLifeCycleObserverProvider = DoubleCheck.provider(AppLifeCycleObserverModule_ProvideAppLifeCycleObserverFactory.create(appLifeCycleObserverModuleParam));
            Factory factoryCreate = InstanceFactory.create(appParam);
            this.appProvider = factoryCreate;
            Provider<Application> provider = DoubleCheck.provider(AppModule_ProvideApplicationFactory.create(appModuleParam, factoryCreate));
            this.provideApplicationProvider = provider;
            AppModule_ProvideAppContextFactory appModule_ProvideAppContextFactoryCreate = AppModule_ProvideAppContextFactory.create(appModuleParam, provider);
            this.provideAppContextProvider = appModule_ProvideAppContextFactoryCreate;
            this.provideStringResourceProvider = ResourceModule_ProvideStringResourceFactory.create(resourceModuleParam, appModule_ProvideAppContextFactoryCreate);
            this.provideLauncherDatabaseProvider = DatabaseModule_ProvideLauncherDatabaseFactory.create(databaseModuleParam, this.provideAppContextProvider);
            this.provideApiServiceProvider = DoubleCheck.provider(NetworkModule_ProvideApiServiceFactory.create(networkModuleParam));
            DispatcherModule_ProvidesIoDispatcherFactory dispatcherModule_ProvidesIoDispatcherFactoryCreate = DispatcherModule_ProvidesIoDispatcherFactory.create(dispatcherModuleParam);
            this.providesIoDispatcherProvider = dispatcherModule_ProvidesIoDispatcherFactoryCreate;
            LauncherDataSourceImpl_Factory launcherDataSourceImpl_FactoryCreate = LauncherDataSourceImpl_Factory.create(this.provideApiServiceProvider, dispatcherModule_ProvidesIoDispatcherFactoryCreate);
            this.launcherDataSourceImplProvider = launcherDataSourceImpl_FactoryCreate;
            this.launcherRepositoryImplProvider = LauncherRepositoryImpl_Factory.create(launcherDataSourceImpl_FactoryCreate);
            this.provideCdnApiServiceProvider = DoubleCheck.provider(NetworkModule_ProvideCdnApiServiceFactory.create(networkModuleParam));
            Provider<Api> provider2 = DoubleCheck.provider(NetworkModule_ProvideBackupCdnApiServiceFactory.create(networkModuleParam));
            this.provideBackupCdnApiServiceProvider = provider2;
            this.mainActivityViewModelProvider = MainActivityViewModel_Factory.create(this.provideStringResourceProvider, this.provideLauncherDatabaseProvider, this.launcherRepositoryImplProvider, this.provideApplicationProvider, this.provideCdnApiServiceProvider, provider2);
            this.provideBackupApiServiceProvider = DoubleCheck.provider(NetworkModule_ProvideBackupApiServiceFactory.create(networkModuleParam));
            this.provideBillingServiceProvider = DoubleCheck.provider(NetworkModule_ProvideBillingServiceFactory.create(networkModuleParam));
            this.provideBillingClientWrapperProvider = DoubleCheck.provider(BillingModule_ProvideBillingClientWrapperFactory.create(billingModuleParam, this.provideApplicationProvider));
            this.provideRustoreBillingClientWrapperProvider = DoubleCheck.provider(BillingModule_ProvideRustoreBillingClientWrapperFactory.create(billingModuleParam, this.provideApplicationProvider));
            this.provideJNIActivityActionWithJSONProvider = NetworkModule_ProvideJNIActivityActionWithJSONFactory.create(networkModuleParam);
            DatabaseModule_ProvidePurchaseDatabaseFactory databaseModule_ProvidePurchaseDatabaseFactoryCreate = DatabaseModule_ProvidePurchaseDatabaseFactory.create(databaseModuleParam, this.provideAppContextProvider);
            this.providePurchaseDatabaseProvider = databaseModule_ProvidePurchaseDatabaseFactoryCreate;
            this.jNIActivityViewModelProvider = JNIActivityViewModel_Factory.create(this.provideApplicationProvider, this.provideApiServiceProvider, this.provideBackupApiServiceProvider, this.provideBillingServiceProvider, this.provideBillingClientWrapperProvider, this.provideRustoreBillingClientWrapperProvider, this.provideJNIActivityActionWithJSONProvider, databaseModule_ProvidePurchaseDatabaseFactoryCreate);
            this.provideTuningActionWithJSONProvider = NetworkModule_ProvideTuningActionWithJSONFactory.create(networkModuleParam);
            NetworkModule_ProvideErrorNotificationFactory networkModule_ProvideErrorNotificationFactoryCreate = NetworkModule_ProvideErrorNotificationFactory.create(networkModuleParam);
            this.provideErrorNotificationProvider = networkModule_ProvideErrorNotificationFactoryCreate;
            this.tuningMainViewModelProvider = TuningMainViewModel_Factory.create(this.provideTuningActionWithJSONProvider, networkModule_ProvideErrorNotificationFactoryCreate);
            this.tuningViewCarViewModelProvider = TuningViewCarViewModel_Factory.create(this.provideTuningActionWithJSONProvider);
            NetworkModule_ProvideTuningCostCalculationFactory networkModule_ProvideTuningCostCalculationFactoryCreate = NetworkModule_ProvideTuningCostCalculationFactory.create(networkModuleParam);
            this.provideTuningCostCalculationProvider = networkModule_ProvideTuningCostCalculationFactoryCreate;
            this.tuningCollapseViewModelProvider = TuningCollapseViewModel_Factory.create(this.provideTuningActionWithJSONProvider, networkModule_ProvideTuningCostCalculationFactoryCreate);
            this.tuningDiagnosticViewModelProvider = TuningDiagnosticViewModel_Factory.create(this.provideTuningActionWithJSONProvider, this.provideTuningCostCalculationProvider);
            this.tuningDetailsListViewModelProvider = TuningDetailsListViewModel_Factory.create(this.provideTuningActionWithJSONProvider, this.provideTuningCostCalculationProvider, this.provideStringResourceProvider, this.provideErrorNotificationProvider);
            this.tuningColorListViewModelProvider = TuningColorListViewModel_Factory.create(this.provideTuningActionWithJSONProvider, this.provideTuningCostCalculationProvider);
            NetworkModule_ProvideFractionActionsWithJSONFactory networkModule_ProvideFractionActionsWithJSONFactoryCreate = NetworkModule_ProvideFractionActionsWithJSONFactory.create(networkModuleParam);
            this.provideFractionActionsWithJSONProvider = networkModule_ProvideFractionActionsWithJSONFactoryCreate;
            this.fractionsMainViewModelProvider = FractionsMainViewModel_Factory.create(networkModule_ProvideFractionActionsWithJSONFactoryCreate);
            this.fractionsQuestsViewModelProvider = FractionsQuestsViewModel_Factory.create(this.provideFractionActionsWithJSONProvider);
            this.fractionsDocumentsViewModelProvider = FractionsDocumentsViewModel_Factory.create(this.provideFractionActionsWithJSONProvider);
            this.fractionsShopViewModelProvider = FractionsShopViewModel_Factory.create(this.provideFractionActionsWithJSONProvider);
            this.fractionsControlViewModelProvider = FractionsControlViewModel_Factory.create(this.provideFractionActionsWithJSONProvider);
            this.provideSpawnLocationActionsWithJsonProvider = NetworkModule_ProvideSpawnLocationActionsWithJsonFactory.create(networkModuleParam);
            NetworkModule_ProvideSpawnLocationRepositoryFactory networkModule_ProvideSpawnLocationRepositoryFactoryCreate = NetworkModule_ProvideSpawnLocationRepositoryFactory.create(networkModuleParam);
            this.provideSpawnLocationRepositoryProvider = networkModule_ProvideSpawnLocationRepositoryFactoryCreate;
            this.spawnLocationViewModelProvider = SpawnLocationViewModel_Factory.create(this.provideSpawnLocationActionsWithJsonProvider, networkModule_ProvideSpawnLocationRepositoryFactoryCreate);
            NetworkModule_ProvideMiniGamesHelperActionWithJSONFactory networkModule_ProvideMiniGamesHelperActionWithJSONFactoryCreate = NetworkModule_ProvideMiniGamesHelperActionWithJSONFactory.create(networkModuleParam);
            this.provideMiniGamesHelperActionWithJSONProvider = networkModule_ProvideMiniGamesHelperActionWithJSONFactoryCreate;
            this.miniGamesHelperViewModelProvider = MiniGamesHelperViewModel_Factory.create(networkModule_ProvideMiniGamesHelperActionWithJSONFactoryCreate);
            NetworkModule_ProvideSmiEditorActionWithJSONFactory networkModule_ProvideSmiEditorActionWithJSONFactoryCreate = NetworkModule_ProvideSmiEditorActionWithJSONFactory.create(networkModuleParam);
            this.provideSmiEditorActionWithJSONProvider = networkModule_ProvideSmiEditorActionWithJSONFactoryCreate;
            this.smiEditorViewModelProvider = SmiEditorViewModel_Factory.create(networkModule_ProvideSmiEditorActionWithJSONFactoryCreate, this.provideErrorNotificationProvider);
            NetworkModule_ProvidePlayersListActionWithJsonFactory networkModule_ProvidePlayersListActionWithJsonFactoryCreate = NetworkModule_ProvidePlayersListActionWithJsonFactory.create(networkModuleParam);
            this.providePlayersListActionWithJsonProvider = networkModule_ProvidePlayersListActionWithJsonFactoryCreate;
            this.playersListViewModelProvider = PlayersListViewModel_Factory.create(networkModule_ProvidePlayersListActionWithJsonFactoryCreate);
            NetworkModule_ProvideDonateActionWithJSONFactory networkModule_ProvideDonateActionWithJSONFactoryCreate = NetworkModule_ProvideDonateActionWithJSONFactory.create(networkModuleParam);
            this.provideDonateActionWithJSONProvider = networkModule_ProvideDonateActionWithJSONFactoryCreate;
            this.donateMainViewModelProvider = DonateMainViewModel_Factory.create(networkModule_ProvideDonateActionWithJSONFactoryCreate, this.provideErrorNotificationProvider);
            this.donateTileViewModelProvider = DonateTileViewModel_Factory.create(this.provideDonateActionWithJSONProvider);
            this.donateDepositCoinsViewModelProvider = DonateDepositCoinsViewModel_Factory.create(this.provideDonateActionWithJSONProvider);
            NetworkModule_ProvideBlackPassActionWithJSONFactory networkModule_ProvideBlackPassActionWithJSONFactoryCreate = NetworkModule_ProvideBlackPassActionWithJSONFactory.create(networkModuleParam);
            this.provideBlackPassActionWithJSONProvider = networkModule_ProvideBlackPassActionWithJSONFactoryCreate;
            this.blackPassMainViewModelProvider = BlackPassMainViewModel_Factory.create(networkModule_ProvideBlackPassActionWithJSONFactoryCreate, this.provideStringResourceProvider, this.provideApplicationProvider);
            this.blackPassActivateViewModelProvider = BlackPassActivateViewModel_Factory.create(this.provideBlackPassActionWithJSONProvider, this.provideApplicationProvider, this.provideStringResourceProvider);
            this.blackPassPrizeListViewModelProvider = BlackPassPrizeListViewModel_Factory.create(this.provideApplicationProvider);
            this.provideTutorialHintActionWithJSONProvider = NetworkModule_ProvideTutorialHintActionWithJSONFactory.create(networkModuleParam);
            DatabaseModule_ProvidePreferencesRepositoryFactory databaseModule_ProvidePreferencesRepositoryFactoryCreate = DatabaseModule_ProvidePreferencesRepositoryFactory.create(databaseModuleParam, this.provideAppContextProvider);
            this.providePreferencesRepositoryProvider = databaseModule_ProvidePreferencesRepositoryFactoryCreate;
            this.tutorialViewModelProvider = TutorialViewModel_Factory.create(this.provideTutorialHintActionWithJSONProvider, databaseModule_ProvidePreferencesRepositoryFactoryCreate);
            NetworkModule_ProvideRadialMenuActionWithJSONFactory networkModule_ProvideRadialMenuActionWithJSONFactoryCreate = NetworkModule_ProvideRadialMenuActionWithJSONFactory.create(networkModuleParam);
            this.provideRadialMenuActionWithJSONProvider = networkModule_ProvideRadialMenuActionWithJSONFactoryCreate;
            this.radialMenuViewModelProvider = RadialMenuViewModel_Factory.create(networkModule_ProvideRadialMenuActionWithJSONFactoryCreate);
            NetworkModule_ProvideDrivingSchoolActionWithJSONFactory networkModule_ProvideDrivingSchoolActionWithJSONFactoryCreate = NetworkModule_ProvideDrivingSchoolActionWithJSONFactory.create(networkModuleParam);
            this.provideDrivingSchoolActionWithJSONProvider = networkModule_ProvideDrivingSchoolActionWithJSONFactoryCreate;
            this.drivingSchoolViewModelProvider = DrivingSchoolViewModel_Factory.create(networkModule_ProvideDrivingSchoolActionWithJSONFactoryCreate);
            this.drivingSchoolQuestsViewModelProvider = DrivingSchoolQuestsViewModel_Factory.create(this.provideDrivingSchoolActionWithJSONProvider);
            NetworkModule_ProvideNewMenuActionWithJSONFactory networkModule_ProvideNewMenuActionWithJSONFactoryCreate = NetworkModule_ProvideNewMenuActionWithJSONFactory.create(networkModuleParam);
            this.provideNewMenuActionWithJSONProvider = networkModule_ProvideNewMenuActionWithJSONFactoryCreate;
            this.menuPauseViewModelProvider = MenuPauseViewModel_Factory.create(this.providePreferencesRepositoryProvider, networkModule_ProvideNewMenuActionWithJSONFactoryCreate);
            this.menuSettingGraphicViewModelProvider = MenuSettingGraphicViewModel_Factory.create(this.providePreferencesRepositoryProvider);
            this.menuSettingSoundViewModelProvider = MenuSettingSoundViewModel_Factory.create(this.providePreferencesRepositoryProvider);
            this.menuSettingControlViewModelProvider = MenuSettingControlViewModel_Factory.create(this.providePreferencesRepositoryProvider, this.provideNewMenuActionWithJSONProvider);
            this.menuSettingWinterViewModelProvider = MenuSettingWinterViewModel_Factory.create(this.providePreferencesRepositoryProvider);
            NetworkModule_ProvideWoundSystemActionWithJSONFactory networkModule_ProvideWoundSystemActionWithJSONFactoryCreate = NetworkModule_ProvideWoundSystemActionWithJSONFactory.create(networkModuleParam);
            this.provideWoundSystemActionWithJSONProvider = networkModule_ProvideWoundSystemActionWithJSONFactoryCreate;
            this.woundSystemViewModelProvider = WoundSystemViewModel_Factory.create(networkModule_ProvideWoundSystemActionWithJSONFactoryCreate);
            NetworkModule_ProvideEntertainmentSystemActionsWithJSONFactory networkModule_ProvideEntertainmentSystemActionsWithJSONFactoryCreate = NetworkModule_ProvideEntertainmentSystemActionsWithJSONFactory.create(networkModuleParam);
            this.provideEntertainmentSystemActionsWithJSONProvider = networkModule_ProvideEntertainmentSystemActionsWithJSONFactoryCreate;
            this.entertainmentGamesViewModelProvider = EntertainmentGamesViewModel_Factory.create(networkModule_ProvideEntertainmentSystemActionsWithJSONFactoryCreate);
            this.finalWindowViewModelProvider = FinalWindowViewModel_Factory.create(this.provideEntertainmentSystemActionsWithJSONProvider);
            NetworkModule_ProvideCraftActionWithJSONFactory networkModule_ProvideCraftActionWithJSONFactoryCreate = NetworkModule_ProvideCraftActionWithJSONFactory.create(networkModuleParam);
            this.provideCraftActionWithJSONProvider = networkModule_ProvideCraftActionWithJSONFactoryCreate;
            this.craftViewModelProvider = CraftViewModel_Factory.create(networkModule_ProvideCraftActionWithJSONFactoryCreate, this.provideStringResourceProvider, this.provideApplicationProvider, this.provideErrorNotificationProvider, this.providePreferencesRepositoryProvider);
            NetworkModule_ProvideNotificationActionWithJSONFactory networkModule_ProvideNotificationActionWithJSONFactoryCreate = NetworkModule_ProvideNotificationActionWithJSONFactory.create(networkModuleParam);
            this.provideNotificationActionWithJSONProvider = networkModule_ProvideNotificationActionWithJSONFactoryCreate;
            this.notificationViewModelProvider = NotificationViewModel_Factory.create(networkModule_ProvideNotificationActionWithJSONFactoryCreate, this.provideStringResourceProvider);
            NetworkModule_ProvideFuelFullActionWithJSONFactory networkModule_ProvideFuelFullActionWithJSONFactoryCreate = NetworkModule_ProvideFuelFullActionWithJSONFactory.create(networkModuleParam);
            this.provideFuelFullActionWithJSONProvider = networkModule_ProvideFuelFullActionWithJSONFactoryCreate;
            this.fuelFillViewModelProvider = FuelFillViewModel_Factory.create(networkModule_ProvideFuelFullActionWithJSONFactoryCreate);
            NetworkModule_ProvideElectricActionWithJSONFactory networkModule_ProvideElectricActionWithJSONFactoryCreate = NetworkModule_ProvideElectricActionWithJSONFactory.create(networkModuleParam);
            this.provideElectricActionWithJSONProvider = networkModule_ProvideElectricActionWithJSONFactoryCreate;
            this.electricViewModelProvider = ElectricViewModel_Factory.create(networkModule_ProvideElectricActionWithJSONFactoryCreate, this.provideErrorNotificationProvider);
            this.findProblemViewModelProvider = FindProblemViewModel_Factory.create(this.provideStringResourceProvider, this.provideErrorNotificationProvider, this.providePreferencesRepositoryProvider);
            this.changeBulbViewModelProvider = ChangeBulbViewModel_Factory.create(this.provideErrorNotificationProvider, this.providePreferencesRepositoryProvider);
            this.collectSchemeViewModelProvider = CollectSchemeViewModel_Factory.create(this.provideErrorNotificationProvider, this.providePreferencesRepositoryProvider);
            this.raiseChargeViewModelProvider = RaiseChargeViewModel_Factory.create(this.providePreferencesRepositoryProvider);
            this.sumContactsViewModelProvider = SumContactsViewModel_Factory.create(this.providePreferencesRepositoryProvider);
            NetworkModule_ProvideCatchStreamerActionWithJSONFactory networkModule_ProvideCatchStreamerActionWithJSONFactoryCreate = NetworkModule_ProvideCatchStreamerActionWithJSONFactory.create(networkModuleParam);
            this.provideCatchStreamerActionWithJSONProvider = networkModule_ProvideCatchStreamerActionWithJSONFactoryCreate;
            this.catchStreamerViewModelProvider = CatchStreamerViewModel_Factory.create(this.provideErrorNotificationProvider, networkModule_ProvideCatchStreamerActionWithJSONFactoryCreate);
            NetworkModule_ProvideYoutubePlayerActionWithJSONFactory networkModule_ProvideYoutubePlayerActionWithJSONFactoryCreate = NetworkModule_ProvideYoutubePlayerActionWithJSONFactory.create(networkModuleParam);
            this.provideYoutubePlayerActionWithJSONProvider = networkModule_ProvideYoutubePlayerActionWithJSONFactoryCreate;
            this.youtubePlayerViewModelProvider = YoutubePlayerViewModel_Factory.create(networkModule_ProvideYoutubePlayerActionWithJSONFactoryCreate);
            NetworkModule_ProvideFishingActionWithJSONFactory networkModule_ProvideFishingActionWithJSONFactoryCreate = NetworkModule_ProvideFishingActionWithJSONFactory.create(networkModuleParam);
            this.provideFishingActionWithJSONProvider = networkModule_ProvideFishingActionWithJSONFactoryCreate;
            this.fishingViewModelProvider = FishingViewModel_Factory.create(this.provideErrorNotificationProvider, this.provideStringResourceProvider, networkModule_ProvideFishingActionWithJSONFactoryCreate);
            NetworkModule_ProvideTaxiMapActionWithJSONFactory networkModule_ProvideTaxiMapActionWithJSONFactoryCreate = NetworkModule_ProvideTaxiMapActionWithJSONFactory.create(networkModuleParam);
            this.provideTaxiMapActionWithJSONProvider = networkModule_ProvideTaxiMapActionWithJSONFactoryCreate;
            this.taxiMapViewModelProvider = TaxiMapViewModel_Factory.create(networkModule_ProvideTaxiMapActionWithJSONFactoryCreate);
            NetworkModule_ProvideTaxiOrderActionWithJSONFactory networkModule_ProvideTaxiOrderActionWithJSONFactoryCreate = NetworkModule_ProvideTaxiOrderActionWithJSONFactory.create(networkModuleParam);
            this.provideTaxiOrderActionWithJSONProvider = networkModule_ProvideTaxiOrderActionWithJSONFactoryCreate;
            this.taxiOrderViewModelProvider = TaxiOrderViewModel_Factory.create(this.provideErrorNotificationProvider, this.provideStringResourceProvider, networkModule_ProvideTaxiOrderActionWithJSONFactoryCreate);
            NetworkModule_ProvideTaxiActionWithJSONFactory networkModule_ProvideTaxiActionWithJSONFactoryCreate = NetworkModule_ProvideTaxiActionWithJSONFactory.create(networkModuleParam);
            this.provideTaxiActionWithJSONProvider = networkModule_ProvideTaxiActionWithJSONFactoryCreate;
            this.taxiViewModelProvider = TaxiViewModel_Factory.create(this.provideErrorNotificationProvider, this.provideStringResourceProvider, networkModule_ProvideTaxiActionWithJSONFactoryCreate);
            NetworkModule_ProvideHalloweenAwardActionWithJSONFactory networkModule_ProvideHalloweenAwardActionWithJSONFactoryCreate = NetworkModule_ProvideHalloweenAwardActionWithJSONFactory.create(networkModuleParam);
            this.provideHalloweenAwardActionWithJSONProvider = networkModule_ProvideHalloweenAwardActionWithJSONFactoryCreate;
            this.halloweenAwardViewModelProvider = HalloweenAwardViewModel_Factory.create(networkModule_ProvideHalloweenAwardActionWithJSONFactoryCreate);
            NetworkModule_ProvideInteractionWithNpcActionWithJSONFactory networkModule_ProvideInteractionWithNpcActionWithJSONFactoryCreate = NetworkModule_ProvideInteractionWithNpcActionWithJSONFactory.create(networkModuleParam);
            this.provideInteractionWithNpcActionWithJSONProvider = networkModule_ProvideInteractionWithNpcActionWithJSONFactoryCreate;
            this.interactionWithNpcViewModelProvider = InteractionWithNpcViewModel_Factory.create(networkModule_ProvideInteractionWithNpcActionWithJSONFactoryCreate);
        }

        public final void initialize2(final AppModule appModuleParam, final BillingModule billingModuleParam, final NetworkModule networkModuleParam, final DatabaseModule databaseModuleParam, final ResourceModule resourceModuleParam, final DispatcherModule dispatcherModuleParam, final AnalyticsModule analyticsModuleParam, final AppLifeCycleObserverModule appLifeCycleObserverModuleParam, final App appParam) {
            NetworkModule_ProvideBlackPassBannerActionsWithJsonFactory networkModule_ProvideBlackPassBannerActionsWithJsonFactoryCreate = NetworkModule_ProvideBlackPassBannerActionsWithJsonFactory.create(networkModuleParam);
            this.provideBlackPassBannerActionsWithJsonProvider = networkModule_ProvideBlackPassBannerActionsWithJsonFactoryCreate;
            this.blackPassBannerViewModelProvider = BlackPassBannerViewModel_Factory.create(networkModule_ProvideBlackPassBannerActionsWithJsonFactoryCreate, this.provideApplicationProvider);
            NetworkModule_ProvideActiveTaskActionWithJSONFactory networkModule_ProvideActiveTaskActionWithJSONFactoryCreate = NetworkModule_ProvideActiveTaskActionWithJSONFactory.create(networkModuleParam);
            this.provideActiveTaskActionWithJSONProvider = networkModule_ProvideActiveTaskActionWithJSONFactoryCreate;
            this.activeTaskViewModelProvider = ActiveTaskViewModel_Factory.create(networkModule_ProvideActiveTaskActionWithJSONFactoryCreate);
            NetworkModule_ProvideGasmanActionWithJsonFactory networkModule_ProvideGasmanActionWithJsonFactoryCreate = NetworkModule_ProvideGasmanActionWithJsonFactory.create(networkModuleParam);
            this.provideGasmanActionWithJsonProvider = networkModule_ProvideGasmanActionWithJsonFactoryCreate;
            this.gasmanParentViewModelProvider = GasmanParentViewModel_Factory.create(networkModule_ProvideGasmanActionWithJsonFactoryCreate);
            this.gasmanChildViewModelProvider = GasmanChildViewModel_Factory.create(this.provideErrorNotificationProvider);
            NetworkModule_ProvideSocialNetworkActionWithJSONFactory networkModule_ProvideSocialNetworkActionWithJSONFactoryCreate = NetworkModule_ProvideSocialNetworkActionWithJSONFactory.create(networkModuleParam);
            this.provideSocialNetworkActionWithJSONProvider = networkModule_ProvideSocialNetworkActionWithJSONFactoryCreate;
            this.socialNetworkLinkViewModelProvider = SocialNetworkLinkViewModel_Factory.create(networkModule_ProvideSocialNetworkActionWithJSONFactoryCreate, this.provideStringResourceProvider);
            NetworkModule_ProvideBrSimBannerActionsWithJsonFactory networkModule_ProvideBrSimBannerActionsWithJsonFactoryCreate = NetworkModule_ProvideBrSimBannerActionsWithJsonFactory.create(networkModuleParam);
            this.provideBrSimBannerActionsWithJsonProvider = networkModule_ProvideBrSimBannerActionsWithJsonFactoryCreate;
            this.brSimBannerViewModelProvider = BrSimBannerViewModel_Factory.create(networkModule_ProvideBrSimBannerActionsWithJsonFactoryCreate, this.provideApplicationProvider, this.provideErrorNotificationProvider, this.provideStringResourceProvider);
            NetworkModule_ProvideAdminToolsActionWithJSONFactory networkModule_ProvideAdminToolsActionWithJSONFactoryCreate = NetworkModule_ProvideAdminToolsActionWithJSONFactory.create(networkModuleParam);
            this.provideAdminToolsActionWithJSONProvider = networkModule_ProvideAdminToolsActionWithJSONFactoryCreate;
            this.adminToolsViewModelProvider = AdminToolsViewModel_Factory.create(networkModule_ProvideAdminToolsActionWithJSONFactoryCreate, this.provideStringResourceProvider);
            this.provideUpgradeObjectActionWithJSONProvider = NetworkModule_ProvideUpgradeObjectActionWithJSONFactory.create(networkModuleParam);
            UpgradeObjectEventDataSourceImpl_Factory upgradeObjectEventDataSourceImpl_FactoryCreate = UpgradeObjectEventDataSourceImpl_Factory.create(this.provideApiServiceProvider, this.providesIoDispatcherProvider);
            this.upgradeObjectEventDataSourceImplProvider = upgradeObjectEventDataSourceImpl_FactoryCreate;
            UpgradeObjectRepositoryImpl_Factory upgradeObjectRepositoryImpl_FactoryCreate = UpgradeObjectRepositoryImpl_Factory.create(upgradeObjectEventDataSourceImpl_FactoryCreate);
            this.upgradeObjectRepositoryImplProvider = upgradeObjectRepositoryImpl_FactoryCreate;
            this.upgradeObjectEventViewModelProvider = UpgradeObjectEventViewModel_Factory.create(this.provideUpgradeObjectActionWithJSONProvider, upgradeObjectRepositoryImpl_FactoryCreate, this.provideStringResourceProvider, this.provideErrorNotificationProvider, this.provideApplicationProvider);
            this.provideGiftsActionWithJSONProvider = NetworkModule_ProvideGiftsActionWithJSONFactory.create(networkModuleParam);
            GiftsDataSourceImpl_Factory giftsDataSourceImpl_FactoryCreate = GiftsDataSourceImpl_Factory.create(this.provideApiServiceProvider, this.providesIoDispatcherProvider);
            this.giftsDataSourceImplProvider = giftsDataSourceImpl_FactoryCreate;
            GiftsRepositoryImpl_Factory giftsRepositoryImpl_FactoryCreate = GiftsRepositoryImpl_Factory.create(giftsDataSourceImpl_FactoryCreate);
            this.giftsRepositoryImplProvider = giftsRepositoryImpl_FactoryCreate;
            this.giftsViewModelProvider = GiftsViewModel_Factory.create(this.provideGiftsActionWithJSONProvider, giftsRepositoryImpl_FactoryCreate, this.provideErrorNotificationProvider, this.provideApplicationProvider);
            NetworkModule_ProvidePanelInfoActionWithJSONFactory networkModule_ProvidePanelInfoActionWithJSONFactoryCreate = NetworkModule_ProvidePanelInfoActionWithJSONFactory.create(networkModuleParam);
            this.providePanelInfoActionWithJSONProvider = networkModule_ProvidePanelInfoActionWithJSONFactoryCreate;
            this.panelInfoViewModelProvider = PanelInfoViewModel_Factory.create(networkModule_ProvidePanelInfoActionWithJSONFactoryCreate, this.provideApplicationProvider);
            NetworkModule_ProvideBrDialogMenuActionsWithJsonFactory networkModule_ProvideBrDialogMenuActionsWithJsonFactoryCreate = NetworkModule_ProvideBrDialogMenuActionsWithJsonFactory.create(networkModuleParam);
            this.provideBrDialogMenuActionsWithJsonProvider = networkModule_ProvideBrDialogMenuActionsWithJsonFactoryCreate;
            this.menuViewModelProvider = MenuViewModel_Factory.create(networkModule_ProvideBrDialogMenuActionsWithJsonFactoryCreate);
            NetworkModule_ProvideRentActionWithJSONFactory networkModule_ProvideRentActionWithJSONFactoryCreate = NetworkModule_ProvideRentActionWithJSONFactory.create(networkModuleParam);
            this.provideRentActionWithJSONProvider = networkModule_ProvideRentActionWithJSONFactoryCreate;
            this.rentViewModelProvider = RentViewModel_Factory.create(networkModule_ProvideRentActionWithJSONFactoryCreate);
            NetworkModule_ProvidePlatesActionWithJSONFactory networkModule_ProvidePlatesActionWithJSONFactoryCreate = NetworkModule_ProvidePlatesActionWithJSONFactory.create(networkModuleParam);
            this.providePlatesActionWithJSONProvider = networkModule_ProvidePlatesActionWithJSONFactoryCreate;
            this.platesViewModelProvider = PlatesViewModel_Factory.create(networkModule_ProvidePlatesActionWithJSONFactoryCreate, this.provideStringResourceProvider);
            this.provideRateAppActionWithJSONProvider = NetworkModule_ProvideRateAppActionWithJSONFactory.create(networkModuleParam);
            Provider<RateAppAnalytics> provider = DoubleCheck.provider(AnalyticsModule_ProvideRateAppAnalyticsFactory.create(analyticsModuleParam));
            this.provideRateAppAnalyticsProvider = provider;
            this.rateAppViewModelProvider = RateAppViewModel_Factory.create(this.provideRateAppActionWithJSONProvider, provider);
            NetworkModule_ProvideCalendarActionWithJSONFactory networkModule_ProvideCalendarActionWithJSONFactoryCreate = NetworkModule_ProvideCalendarActionWithJSONFactory.create(networkModuleParam);
            this.provideCalendarActionWithJSONProvider = networkModule_ProvideCalendarActionWithJSONFactoryCreate;
            this.calendarViewModelProvider = CalendarViewModel_Factory.create(networkModule_ProvideCalendarActionWithJSONFactoryCreate, this.provideStringResourceProvider, this.provideErrorNotificationProvider);
            NetworkModule_ProvideCasesActionWithJSONFactory networkModule_ProvideCasesActionWithJSONFactoryCreate = NetworkModule_ProvideCasesActionWithJSONFactory.create(networkModuleParam);
            this.provideCasesActionWithJSONProvider = networkModule_ProvideCasesActionWithJSONFactoryCreate;
            this.casesViewModelProvider = CasesViewModel_Factory.create(networkModule_ProvideCasesActionWithJSONFactoryCreate, this.provideErrorNotificationProvider, this.provideStringResourceProvider, this.provideApplicationProvider);
            this.provideBpRewardsActionWithJSONProvider = NetworkModule_ProvideBpRewardsActionWithJSONFactory.create(networkModuleParam);
            ResourceModule_ProvideBitmapResourceFactory resourceModule_ProvideBitmapResourceFactoryCreate = ResourceModule_ProvideBitmapResourceFactory.create(resourceModuleParam, this.provideAppContextProvider);
            this.provideBitmapResourceProvider = resourceModule_ProvideBitmapResourceFactoryCreate;
            this.bpRewardsViewModelProvider = BpRewardsViewModel_Factory.create(this.provideBpRewardsActionWithJSONProvider, this.provideStringResourceProvider, this.provideErrorNotificationProvider, this.provideApplicationProvider, resourceModule_ProvideBitmapResourceFactoryCreate);
            NetworkModule_ProvideTaxiRatingActionWithJSONFactory networkModule_ProvideTaxiRatingActionWithJSONFactoryCreate = NetworkModule_ProvideTaxiRatingActionWithJSONFactory.create(networkModuleParam);
            this.provideTaxiRatingActionWithJSONProvider = networkModule_ProvideTaxiRatingActionWithJSONFactoryCreate;
            this.taxiRatingViewModelProvider = TaxiRatingViewModel_Factory.create(networkModule_ProvideTaxiRatingActionWithJSONFactoryCreate);
            NetworkModule_ProvideTanpinBannerActionWithJSONFactory networkModule_ProvideTanpinBannerActionWithJSONFactoryCreate = NetworkModule_ProvideTanpinBannerActionWithJSONFactory.create(networkModuleParam);
            this.provideTanpinBannerActionWithJSONProvider = networkModule_ProvideTanpinBannerActionWithJSONFactoryCreate;
            this.tanpinBannerViewModelProvider = TanpinBannerViewModel_Factory.create(networkModule_ProvideTanpinBannerActionWithJSONFactoryCreate, this.provideApplicationProvider);
            NetworkModule_ProvideVideoPlayerActionWithJSONFactory networkModule_ProvideVideoPlayerActionWithJSONFactoryCreate = NetworkModule_ProvideVideoPlayerActionWithJSONFactory.create(networkModuleParam);
            this.provideVideoPlayerActionWithJSONProvider = networkModule_ProvideVideoPlayerActionWithJSONFactoryCreate;
            this.videoPlayerViewModelProvider = VideoPlayerViewModel_Factory.create(networkModule_ProvideVideoPlayerActionWithJSONFactoryCreate, this.provideApplicationProvider);
            NetworkModule_ProvideMarketplaceActionWithJSONFactory networkModule_ProvideMarketplaceActionWithJSONFactoryCreate = NetworkModule_ProvideMarketplaceActionWithJSONFactory.create(networkModuleParam);
            this.provideMarketplaceActionWithJSONProvider = networkModule_ProvideMarketplaceActionWithJSONFactoryCreate;
            this.marketplaceViewModelProvider = MarketplaceViewModel_Factory.create(networkModule_ProvideMarketplaceActionWithJSONFactoryCreate, this.provideStringResourceProvider, this.provideApplicationProvider, this.provideErrorNotificationProvider);
            NetworkModule_ProvideRatingActionWithJsonFactory networkModule_ProvideRatingActionWithJsonFactoryCreate = NetworkModule_ProvideRatingActionWithJsonFactory.create(networkModuleParam);
            this.provideRatingActionWithJsonProvider = networkModule_ProvideRatingActionWithJsonFactoryCreate;
            this.ratingViewModelProvider = RatingViewModel_Factory.create(networkModule_ProvideRatingActionWithJsonFactoryCreate, this.provideStringResourceProvider, this.provideApplicationProvider);
            NetworkModule_ProvideHolidayEventsActionsWithJSONFactory networkModule_ProvideHolidayEventsActionsWithJSONFactoryCreate = NetworkModule_ProvideHolidayEventsActionsWithJSONFactory.create(networkModuleParam);
            this.provideHolidayEventsActionsWithJSONProvider = networkModule_ProvideHolidayEventsActionsWithJSONFactoryCreate;
            this.holidayEventsViewModelProvider = HolidayEventsViewModel_Factory.create(networkModule_ProvideHolidayEventsActionsWithJSONFactoryCreate, this.provideStringResourceProvider, this.provideApplicationProvider);
            NetworkModule_ProvideClickerActionsWithJSONFactory networkModule_ProvideClickerActionsWithJSONFactoryCreate = NetworkModule_ProvideClickerActionsWithJSONFactory.create(networkModuleParam);
            this.provideClickerActionsWithJSONProvider = networkModule_ProvideClickerActionsWithJSONFactoryCreate;
            this.clickerViewModelProvider = ClickerViewModel_Factory.create(networkModule_ProvideClickerActionsWithJSONFactoryCreate, this.provideApplicationProvider);
            NetworkModule_ProvideChatActionsWithJSONFactory networkModule_ProvideChatActionsWithJSONFactoryCreate = NetworkModule_ProvideChatActionsWithJSONFactory.create(networkModuleParam);
            this.provideChatActionsWithJSONProvider = networkModule_ProvideChatActionsWithJSONFactoryCreate;
            this.chatViewModelProvider = ChatViewModel_Factory.create(this.provideStringResourceProvider, networkModule_ProvideChatActionsWithJSONFactoryCreate);
            NetworkModule_ProvideModuleDialogActionsWithJSONFactory networkModule_ProvideModuleDialogActionsWithJSONFactoryCreate = NetworkModule_ProvideModuleDialogActionsWithJSONFactory.create(networkModuleParam);
            this.provideModuleDialogActionsWithJSONProvider = networkModule_ProvideModuleDialogActionsWithJSONFactoryCreate;
            this.moduleDialogViewModelProvider = ModuleDialogViewModel_Factory.create(this.provideStringResourceProvider, networkModule_ProvideModuleDialogActionsWithJSONFactoryCreate, this.provideApplicationProvider);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(App application) {
            injectApp(application);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(MainActivity mainActivity) {
            injectMainActivity(mainActivity);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(DownloadWorker downloadWorker) {
            injectDownloadWorker(downloadWorker);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(JNIActivity jniActivity) {
            injectJNIActivity(jniActivity);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(GUITuning guiTuning) {
            injectGUITuning(guiTuning);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(GUIFractionSystem guiFractionSystem) {
            injectGUIFractionSystem(guiFractionSystem);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(GUISpawnLocation guiSpawnLocation) {
            injectGUISpawnLocation(guiSpawnLocation);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(MiniGamesHelperGuiFragment miniGamesHelperGuiFragment) {
            injectMiniGamesHelperGuiFragment(miniGamesHelperGuiFragment);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(GUISmiEditor guiSmiEditor) {
            injectGUISmiEditor(guiSmiEditor);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(GUIPlayersList guiPlayersList) {
            injectGUIPlayersList(guiPlayersList);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(GUIDonate guiDonate) {
            injectGUIDonate(guiDonate);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(TutorialGuiFragment tutorialHint) {
            injectTutorialGuiFragment(tutorialHint);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(GUIRadialMenuForCar radialMenu) {
            injectGUIRadialMenuForCar(radialMenu);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(GUIDrivingSchool drivingSchool) {
            injectGUIDrivingSchool(drivingSchool);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(MenuGuiFragment menuGuiFragment) {
            injectMenuGuiFragment(menuGuiFragment);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(MenuSettingMainUiFragment menuSettingMainUiFragment) {
            injectMenuSettingMainUiFragment(menuSettingMainUiFragment);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(GUIWoundSystem woundSystem) {
            injectGUIWoundSystem(woundSystem);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(GUIEntertainmentSystem entertainmentSystem) {
            injectGUIEntertainmentSystem(entertainmentSystem);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(GUIEntertainmentSystemFinalWindow entertainmentSystemFinalWindow) {
            injectGUIEntertainmentSystemFinalWindow(entertainmentSystemFinalWindow);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(CraftGuiFragment craftGuiFragment) {
            injectCraftGuiFragment(craftGuiFragment);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(GUINotificationNewStyle notification) {
            injectGUINotificationNewStyle(notification);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(GUIFuelFill fuelFill) {
            injectGUIFuelFill(fuelFill);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(ElectricGuiFragment electricGuiFragment) {
            injectElectricGuiFragment(electricGuiFragment);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(FindProblemFragment findProblemFragment) {
            injectFindProblemFragment(findProblemFragment);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(ChangeBulbFragment changeBulbFragment) {
            injectChangeBulbFragment(changeBulbFragment);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(CollectSchemeFragment collectSchemeFragment) {
            injectCollectSchemeFragment(collectSchemeFragment);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(RaiseChargeFragment raiseChargeFragment) {
            injectRaiseChargeFragment(raiseChargeFragment);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(SumContactsFragment sumContactsFragment) {
            injectSumContactsFragment(sumContactsFragment);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(CatchStreamerGUIFragment catchStreamerGUIFragment) {
            injectCatchStreamerGUIFragment(catchStreamerGUIFragment);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(YotubePlayerFragment yotubePlayerFragment) {
            injectYotubePlayerFragment(yotubePlayerFragment);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(FishingGUIFragment fishing) {
            injectFishingGUIFragment(fishing);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(TaxiMapFragment taxiMapFragment) {
            injectTaxiMapFragment(taxiMapFragment);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(TaxiOrderFragment taxiOrderFragment) {
            injectTaxiOrderFragment(taxiOrderFragment);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(TaxiFragment taxiFragment) {
            injectTaxiFragment(taxiFragment);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(HalloweenAwardGuiFragment halloweenAwardGuiFragment) {
            injectHalloweenAwardGuiFragment(halloweenAwardGuiFragment);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(InteractionWithNpcGUIFragment interactionWithNpcGUIFragment) {
            injectInteractionWithNpcGUIFragment(interactionWithNpcGUIFragment);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(BlackPassBannerComposeGUIFragment blackPassBannerComposeGUIFragment) {
            injectBlackPassBannerComposeGUIFragment(blackPassBannerComposeGUIFragment);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(ActiveTaskGuiFragment activeTaskGuiFragment) {
            injectActiveTaskGuiFragment(activeTaskGuiFragment);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(GUIGasmanGame guiGasmanGame) {
            injectGUIGasmanGame(guiGasmanGame);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(GUISocialNetworkLink socialNetworkLinkGUIFragment) {
            injectGUISocialNetworkLink(socialNetworkLinkGUIFragment);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(BrSimBannerComposeGUIFragment brSimBannerComposeGUIFragment) {
            injectBrSimBannerComposeGUIFragment(brSimBannerComposeGUIFragment);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(AdminToolsGuiFragment adminToolsGuiFragment) {
            injectAdminToolsGuiFragment(adminToolsGuiFragment);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(UpgradeObjectEventGuiFragment upgradeObjectEventGuiFragment) {
            injectUpgradeObjectEventGuiFragment(upgradeObjectEventGuiFragment);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(GiftsGuiFragment giftsGuiFragment) {
            injectGiftsGuiFragment(giftsGuiFragment);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(PanelInfoGuiFragment panelInfoGuiFragment) {
            injectPanelInfoGuiFragment(panelInfoGuiFragment);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(MenuComposeGUIFragment menuComposeGUIFragment) {
            injectMenuComposeGUIFragment(menuComposeGUIFragment);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(RentGuiFragment rent) {
            injectRentGuiFragment(rent);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(PlatesGuiFragment platesGuiFragment) {
            injectPlatesGuiFragment(platesGuiFragment);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(RateAppComposeGUIFragment rateAppComposeGUIFragment) {
            injectRateAppComposeGUIFragment(rateAppComposeGUIFragment);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(CalendarGUIFragment calendarGUIFragment) {
            injectCalendarGUIFragment(calendarGUIFragment);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(CasesGUIFragment casesGUIFragment) {
            injectCasesGUIFragment(casesGUIFragment);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(BpRewardsGuiFragment bpRewardsGuiFragment) {
            injectBpRewardsGuiFragment(bpRewardsGuiFragment);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(TaxiRatingFragment taxiRatingFragment) {
            injectTaxiRatingFragment(taxiRatingFragment);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(TanpinBannerGuiFragment tanpinBannerGuiFragment) {
            injectTanpinBannerGuiFragment(tanpinBannerGuiFragment);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(VideoPlayerGuiFragment videoPlayerGuiFragment) {
            injectVideoPlayerGuiFragment(videoPlayerGuiFragment);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(MarketplaceGuiFragment marketplaceGUIFragment) {
            injectMarketplaceGuiFragment(marketplaceGUIFragment);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(RatingGuiFragment ratingGuiFragment) {
            injectRatingGuiFragment(ratingGuiFragment);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(HolidayEventsGuiFragment holidayEventsGuiFragment) {
            injectHolidayEventsGuiFragment(holidayEventsGuiFragment);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(ClickerGuiFragment clickerGuiFragment) {
            injectClickerGuiFragment(clickerGuiFragment);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(ChatGuiFragment chatGuiFragment) {
            injectChatGuiFragment(chatGuiFragment);
        }

        @Override // com.blackhub.bronline.launcher.p021di.ApplicationComponent
        public void inject(ModuleDialogGuiFragment moduleDialogGuiFragment) {
            injectModuleDialogGuiFragment(moduleDialogGuiFragment);
        }

        @CanIgnoreReturnValue
        public final App injectApp(App instance) {
            App_MembersInjector.injectAppLifecycleObserver(instance, this.provideAppLifeCycleObserverProvider.get());
            return instance;
        }

        @CanIgnoreReturnValue
        public final MainActivity injectMainActivity(MainActivity instance) {
            MainActivity_MembersInjector.injectViewModelFactory(instance, mainViewModelFactoryOfMainActivityViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final DownloadWorker injectDownloadWorker(DownloadWorker instance) {
            DownloadWorker_MembersInjector.injectLauncherDatabase(instance, launcherDatabase());
            return instance;
        }

        @CanIgnoreReturnValue
        public final JNIActivity injectJNIActivity(JNIActivity instance) {
            JNIActivity_MembersInjector.injectViewModelFactory(instance, mainViewModelFactoryOfJNIActivityViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final GUITuning injectGUITuning(GUITuning instance) {
            GUITuning_MembersInjector.injectMainActivityFactory(instance, mainViewModelFactoryOfJNIActivityViewModel());
            GUITuning_MembersInjector.injectTuningFactory(instance, mainViewModelFactoryOfTuningMainViewModel());
            GUITuning_MembersInjector.injectViewCarFactory(instance, mainViewModelFactoryOfTuningViewCarViewModel());
            GUITuning_MembersInjector.injectCollapseFactory(instance, mainViewModelFactoryOfTuningCollapseViewModel());
            GUITuning_MembersInjector.injectDiagnosticFactory(instance, mainViewModelFactoryOfTuningDiagnosticViewModel());
            GUITuning_MembersInjector.injectDetailsListFactory(instance, mainViewModelFactoryOfTuningDetailsListViewModel());
            GUITuning_MembersInjector.injectColorListFactory(instance, mainViewModelFactoryOfTuningColorListViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final GUIFractionSystem injectGUIFractionSystem(GUIFractionSystem instance) {
            GUIFractionSystem_MembersInjector.injectMainActivityFactory(instance, mainViewModelFactoryOfJNIActivityViewModel());
            GUIFractionSystem_MembersInjector.injectMainVMFactory(instance, mainViewModelFactoryOfFractionsMainViewModel());
            GUIFractionSystem_MembersInjector.injectQuestsVMFactory(instance, mainViewModelFactoryOfFractionsQuestsViewModel());
            GUIFractionSystem_MembersInjector.injectDocumentsVMFactory(instance, mainViewModelFactoryOfFractionsDocumentsViewModel());
            GUIFractionSystem_MembersInjector.injectShopVMFactory(instance, mainViewModelFactoryOfFractionsShopViewModel());
            GUIFractionSystem_MembersInjector.injectControlVMFactory(instance, mainViewModelFactoryOfFractionsControlViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final GUISpawnLocation injectGUISpawnLocation(GUISpawnLocation instance) {
            GUISpawnLocation_MembersInjector.injectMainVMFactory(instance, mainViewModelFactoryOfSpawnLocationViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final MiniGamesHelperGuiFragment injectMiniGamesHelperGuiFragment(MiniGamesHelperGuiFragment instance) {
            MiniGamesHelperGuiFragment_MembersInjector.injectFactory(instance, mainViewModelFactoryOfMiniGamesHelperViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final GUISmiEditor injectGUISmiEditor(GUISmiEditor instance) {
            GUISmiEditor_MembersInjector.injectMainActivityFactory(instance, mainViewModelFactoryOfJNIActivityViewModel());
            GUISmiEditor_MembersInjector.injectSmiEditorFactory(instance, mainViewModelFactoryOfSmiEditorViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final GUIPlayersList injectGUIPlayersList(GUIPlayersList instance) {
            GUIPlayersList_MembersInjector.injectVmFactory(instance, mainViewModelFactoryOfPlayersListViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final GUIDonate injectGUIDonate(GUIDonate instance) {
            GUIDonate_MembersInjector.injectMainActivityFactory(instance, mainViewModelFactoryOfJNIActivityViewModel());
            GUIDonate_MembersInjector.injectDonateFactory(instance, mainViewModelFactoryOfDonateMainViewModel());
            GUIDonate_MembersInjector.injectDonateTileFactory(instance, mainViewModelFactoryOfDonateTileViewModel());
            GUIDonate_MembersInjector.injectDepositCoinsFactory(instance, mainViewModelFactoryOfDonateDepositCoinsViewModel());
            GUIDonate_MembersInjector.injectDonateServiceFactory(instance, mainViewModelFactoryOfDonateServiceViewModel());
            GUIDonate_MembersInjector.injectBlackPassMainFactory(instance, mainViewModelFactoryOfBlackPassMainViewModel());
            GUIDonate_MembersInjector.injectBlackPassActivateFactory(instance, mainViewModelFactoryOfBlackPassActivateViewModel());
            GUIDonate_MembersInjector.injectBlackPassPrizeListFactory(instance, mainViewModelFactoryOfBlackPassPrizeListViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final TutorialGuiFragment injectTutorialGuiFragment(TutorialGuiFragment instance) {
            TutorialGuiFragment_MembersInjector.injectFactory(instance, mainViewModelFactoryOfTutorialViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final GUIRadialMenuForCar injectGUIRadialMenuForCar(GUIRadialMenuForCar instance) {
            GUIRadialMenuForCar_MembersInjector.injectRadialMenuFactory(instance, mainViewModelFactoryOfRadialMenuViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final GUIDrivingSchool injectGUIDrivingSchool(GUIDrivingSchool instance) {
            GUIDrivingSchool_MembersInjector.injectDrivingSchoolFactory(instance, mainViewModelFactoryOfDrivingSchoolViewModel());
            GUIDrivingSchool_MembersInjector.injectDrivingSchoolMainFactory(instance, mainViewModelFactoryOfDrivingSchoolMainViewModel());
            GUIDrivingSchool_MembersInjector.injectDrivingSchoolClassInfoFactory(instance, mainViewModelFactoryOfDrivingSchoolClassInfoViewModel());
            GUIDrivingSchool_MembersInjector.injectDrivingSchoolQuestionsFactory(instance, mainViewModelFactoryOfDrivingSchoolQuestsViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final MenuGuiFragment injectMenuGuiFragment(MenuGuiFragment instance) {
            MenuGuiFragment_MembersInjector.injectNewMenuPauseVMFactory(instance, mainViewModelFactoryOfMenuPauseViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final MenuSettingMainUiFragment injectMenuSettingMainUiFragment(MenuSettingMainUiFragment instance) {
            MenuSettingMainUiFragment_MembersInjector.injectMenuSettingGraphicVMFactory(instance, mainViewModelFactoryOfMenuSettingGraphicViewModel());
            MenuSettingMainUiFragment_MembersInjector.injectMenuSettingSoundVMFactory(instance, mainViewModelFactoryOfMenuSettingSoundViewModel());
            MenuSettingMainUiFragment_MembersInjector.injectMenuSettingControlVMFactory(instance, mainViewModelFactoryOfMenuSettingControlViewModel());
            MenuSettingMainUiFragment_MembersInjector.injectMenuSettingWinterVMFactory(instance, mainViewModelFactoryOfMenuSettingWinterViewModel());
            MenuSettingMainUiFragment_MembersInjector.injectMenuPauseViewModelVMFactory(instance, mainViewModelFactoryOfMenuPauseViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final GUIWoundSystem injectGUIWoundSystem(GUIWoundSystem instance) {
            GUIWoundSystem_MembersInjector.injectWoundSystemFactory(instance, mainViewModelFactoryOfWoundSystemViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final GUIEntertainmentSystem injectGUIEntertainmentSystem(GUIEntertainmentSystem instance) {
            GUIEntertainmentSystem_MembersInjector.injectGamesFactory(instance, mainViewModelFactoryOfEntertainmentGamesViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final GUIEntertainmentSystemFinalWindow injectGUIEntertainmentSystemFinalWindow(GUIEntertainmentSystemFinalWindow instance) {
            GUIEntertainmentSystemFinalWindow_MembersInjector.injectFinalWindowFactory(instance, mainViewModelFactoryOfFinalWindowViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final CraftGuiFragment injectCraftGuiFragment(CraftGuiFragment instance) {
            CraftGuiFragment_MembersInjector.injectFactory(instance, mainViewModelFactoryOfCraftViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final GUINotificationNewStyle injectGUINotificationNewStyle(GUINotificationNewStyle instance) {
            GUINotificationNewStyle_MembersInjector.injectNotificationFactory(instance, mainViewModelFactoryOfNotificationViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final GUIFuelFill injectGUIFuelFill(GUIFuelFill instance) {
            GUIFuelFill_MembersInjector.injectFuelFillFactory(instance, mainViewModelFactoryOfFuelFillViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final ElectricGuiFragment injectElectricGuiFragment(ElectricGuiFragment instance) {
            ElectricGuiFragment_MembersInjector.injectMiniGamesElectricFactory(instance, mainViewModelFactoryOfElectricViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final FindProblemFragment injectFindProblemFragment(FindProblemFragment instance) {
            FindProblemFragment_MembersInjector.injectFactory(instance, mainViewModelFactoryOfFindProblemViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final ChangeBulbFragment injectChangeBulbFragment(ChangeBulbFragment instance) {
            ChangeBulbFragment_MembersInjector.injectFactory(instance, mainViewModelFactoryOfChangeBulbViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final CollectSchemeFragment injectCollectSchemeFragment(CollectSchemeFragment instance) {
            CollectSchemeFragment_MembersInjector.injectFactory(instance, mainViewModelFactoryOfCollectSchemeViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final RaiseChargeFragment injectRaiseChargeFragment(RaiseChargeFragment instance) {
            RaiseChargeFragment_MembersInjector.injectFactory(instance, mainViewModelFactoryOfRaiseChargeViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final SumContactsFragment injectSumContactsFragment(SumContactsFragment instance) {
            SumContactsFragment_MembersInjector.injectFactory(instance, mainViewModelFactoryOfSumContactsViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final CatchStreamerGUIFragment injectCatchStreamerGUIFragment(CatchStreamerGUIFragment instance) {
            CatchStreamerGUIFragment_MembersInjector.injectFactory(instance, mainViewModelFactoryOfCatchStreamerViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final YotubePlayerFragment injectYotubePlayerFragment(YotubePlayerFragment instance) {
            YotubePlayerFragment_MembersInjector.injectMainFactory(instance, mainViewModelFactoryOfYoutubePlayerViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final FishingGUIFragment injectFishingGUIFragment(FishingGUIFragment instance) {
            FishingGUIFragment_MembersInjector.injectFactory(instance, mainViewModelFactoryOfFishingViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final TaxiMapFragment injectTaxiMapFragment(TaxiMapFragment instance) {
            TaxiMapFragment_MembersInjector.injectFactory(instance, mainViewModelFactoryOfTaxiMapViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final TaxiOrderFragment injectTaxiOrderFragment(TaxiOrderFragment instance) {
            TaxiOrderFragment_MembersInjector.injectMainFactory(instance, mainViewModelFactoryOfTaxiOrderViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final TaxiFragment injectTaxiFragment(TaxiFragment instance) {
            TaxiFragment_MembersInjector.injectMainFactory(instance, mainViewModelFactoryOfTaxiViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final HalloweenAwardGuiFragment injectHalloweenAwardGuiFragment(HalloweenAwardGuiFragment instance) {
            HalloweenAwardGuiFragment_MembersInjector.injectFactory(instance, mainViewModelFactoryOfHalloweenAwardViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final InteractionWithNpcGUIFragment injectInteractionWithNpcGUIFragment(InteractionWithNpcGUIFragment instance) {
            InteractionWithNpcGUIFragment_MembersInjector.injectFactory(instance, mainViewModelFactoryOfInteractionWithNpcViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final BlackPassBannerComposeGUIFragment injectBlackPassBannerComposeGUIFragment(BlackPassBannerComposeGUIFragment instance) {
            BlackPassBannerComposeGUIFragment_MembersInjector.injectMainFactory(instance, mainViewModelFactoryOfBlackPassBannerViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final ActiveTaskGuiFragment injectActiveTaskGuiFragment(ActiveTaskGuiFragment instance) {
            ActiveTaskGuiFragment_MembersInjector.injectFactory(instance, mainViewModelFactoryOfActiveTaskViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final GUIGasmanGame injectGUIGasmanGame(GUIGasmanGame instance) {
            GUIGasmanGame_MembersInjector.injectVmParentFactory(instance, mainViewModelFactoryOfGasmanParentViewModel());
            GUIGasmanGame_MembersInjector.injectVmChildFactory(instance, mainViewModelFactoryOfGasmanChildViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final GUISocialNetworkLink injectGUISocialNetworkLink(GUISocialNetworkLink instance) {
            GUISocialNetworkLink_MembersInjector.injectMainFactory(instance, mainViewModelFactoryOfSocialNetworkLinkViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final BrSimBannerComposeGUIFragment injectBrSimBannerComposeGUIFragment(BrSimBannerComposeGUIFragment instance) {
            BrSimBannerComposeGUIFragment_MembersInjector.injectFactory(instance, mainViewModelFactoryOfBrSimBannerViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final AdminToolsGuiFragment injectAdminToolsGuiFragment(AdminToolsGuiFragment instance) {
            AdminToolsGuiFragment_MembersInjector.injectFactory(instance, mainViewModelFactoryOfAdminToolsViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final UpgradeObjectEventGuiFragment injectUpgradeObjectEventGuiFragment(UpgradeObjectEventGuiFragment instance) {
            UpgradeObjectEventGuiFragment_MembersInjector.injectFactory(instance, mainViewModelFactoryOfUpgradeObjectEventViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final GiftsGuiFragment injectGiftsGuiFragment(GiftsGuiFragment instance) {
            GiftsGuiFragment_MembersInjector.injectFactory(instance, mainViewModelFactoryOfGiftsViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final PanelInfoGuiFragment injectPanelInfoGuiFragment(PanelInfoGuiFragment instance) {
            PanelInfoGuiFragment_MembersInjector.injectFactory(instance, mainViewModelFactoryOfPanelInfoViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final MenuComposeGUIFragment injectMenuComposeGUIFragment(MenuComposeGUIFragment instance) {
            MenuComposeGUIFragment_MembersInjector.injectFactory(instance, mainViewModelFactoryOfMenuViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final RentGuiFragment injectRentGuiFragment(RentGuiFragment instance) {
            RentGuiFragment_MembersInjector.injectFactory(instance, mainViewModelFactoryOfRentViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final PlatesGuiFragment injectPlatesGuiFragment(PlatesGuiFragment instance) {
            PlatesGuiFragment_MembersInjector.injectFactory(instance, mainViewModelFactoryOfPlatesViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final RateAppComposeGUIFragment injectRateAppComposeGUIFragment(RateAppComposeGUIFragment instance) {
            RateAppComposeGUIFragment_MembersInjector.injectFactory(instance, mainViewModelFactoryOfRateAppViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final CalendarGUIFragment injectCalendarGUIFragment(CalendarGUIFragment instance) {
            CalendarGUIFragment_MembersInjector.injectFactory(instance, mainViewModelFactoryOfCalendarViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final CasesGUIFragment injectCasesGUIFragment(CasesGUIFragment instance) {
            CasesGUIFragment_MembersInjector.injectFactory(instance, mainViewModelFactoryOfCasesViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final BpRewardsGuiFragment injectBpRewardsGuiFragment(BpRewardsGuiFragment instance) {
            BpRewardsGuiFragment_MembersInjector.injectFactory(instance, mainViewModelFactoryOfBpRewardsViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final TaxiRatingFragment injectTaxiRatingFragment(TaxiRatingFragment instance) {
            TaxiRatingFragment_MembersInjector.injectMainFactory(instance, mainViewModelFactoryOfTaxiRatingViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final TanpinBannerGuiFragment injectTanpinBannerGuiFragment(TanpinBannerGuiFragment instance) {
            TanpinBannerGuiFragment_MembersInjector.injectFactory(instance, mainViewModelFactoryOfTanpinBannerViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final VideoPlayerGuiFragment injectVideoPlayerGuiFragment(VideoPlayerGuiFragment instance) {
            VideoPlayerGuiFragment_MembersInjector.injectFactory(instance, mainViewModelFactoryOfVideoPlayerViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final MarketplaceGuiFragment injectMarketplaceGuiFragment(MarketplaceGuiFragment instance) {
            MarketplaceGuiFragment_MembersInjector.injectMainFactory(instance, mainViewModelFactoryOfMarketplaceViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final RatingGuiFragment injectRatingGuiFragment(RatingGuiFragment instance) {
            RatingGuiFragment_MembersInjector.injectFactory(instance, mainViewModelFactoryOfRatingViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final HolidayEventsGuiFragment injectHolidayEventsGuiFragment(HolidayEventsGuiFragment instance) {
            HolidayEventsGuiFragment_MembersInjector.injectFactory(instance, mainViewModelFactoryOfHolidayEventsViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final ClickerGuiFragment injectClickerGuiFragment(ClickerGuiFragment instance) {
            ClickerGuiFragment_MembersInjector.injectFactory(instance, mainViewModelFactoryOfClickerViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final ChatGuiFragment injectChatGuiFragment(ChatGuiFragment instance) {
            ChatGuiFragment_MembersInjector.injectFactory(instance, mainViewModelFactoryOfChatViewModel());
            return instance;
        }

        @CanIgnoreReturnValue
        public final ModuleDialogGuiFragment injectModuleDialogGuiFragment(ModuleDialogGuiFragment instance) {
            ModuleDialogGuiFragment_MembersInjector.injectFactory(instance, mainViewModelFactoryOfModuleDialogViewModel());
            return instance;
        }
    }
}
