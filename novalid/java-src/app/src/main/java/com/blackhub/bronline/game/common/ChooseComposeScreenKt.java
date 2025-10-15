package com.blackhub.bronline.game.common;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.blackhub.bronline.game.p019ui.activetask.ActiveTaskGuiKt;
import com.blackhub.bronline.game.p019ui.admintools.AdminToolsGuiKt;
import com.blackhub.bronline.game.p019ui.bpbanner.BlackPassBannerGuiKt;
import com.blackhub.bronline.game.p019ui.bprewards.BpRewardsGuiKt;
import com.blackhub.bronline.game.p019ui.brsimbanner.BrSimBannerGuiKt;
import com.blackhub.bronline.game.p019ui.calendar.CalendarGuiKt;
import com.blackhub.bronline.game.p019ui.cases.CasesGuiKt;
import com.blackhub.bronline.game.p019ui.catchstreamer.CatchStreamerGuiKt;
import com.blackhub.bronline.game.p019ui.chat.ChatGuiKt;
import com.blackhub.bronline.game.p019ui.clicker.ClickerGuiKt;
import com.blackhub.bronline.game.p019ui.craft.CraftGuiKt;
import com.blackhub.bronline.game.p019ui.fishing.FishingGuiKt;
import com.blackhub.bronline.game.p019ui.gifts.GiftsGuiKt;
import com.blackhub.bronline.game.p019ui.halloweenaward.PurchaseOfferAwardGuiKt;
import com.blackhub.bronline.game.p019ui.holidayevents.HolidayEventsGuiKt;
import com.blackhub.bronline.game.p019ui.interactionwithnpc.InteractionWithNpcGuiKt;
import com.blackhub.bronline.game.p019ui.marketplace.MarketplaceGuiKt;
import com.blackhub.bronline.game.p019ui.menu.MenuGuiKt;
import com.blackhub.bronline.game.p019ui.minigameshelper.MiniGamesHelperGuiKt;
import com.blackhub.bronline.game.p019ui.moduledialog.ModuleDialogGuiKt;
import com.blackhub.bronline.game.p019ui.panelinfo.PanelInfoGuiKt;
import com.blackhub.bronline.game.p019ui.plates.PlatesGuiKt;
import com.blackhub.bronline.game.p019ui.rateapp.RateAppGuiKt;
import com.blackhub.bronline.game.p019ui.rating.RatingGuiKt;
import com.blackhub.bronline.game.p019ui.rent.RentGuiKt;
import com.blackhub.bronline.game.p019ui.tanpinbanner.TanpinBannerGuiKt;
import com.blackhub.bronline.game.p019ui.taxiorder.TaxiOrderGuiKt;
import com.blackhub.bronline.game.p019ui.taxirating.TaxiRatingGuiKt;
import com.blackhub.bronline.game.p019ui.upgradeobjectevent.UpgradeObjectEventGuiKt;
import com.blackhub.bronline.game.p019ui.videoplayer.VideoPlayerGuiKt;
import com.blackhub.bronline.game.p019ui.youtubeplayer.YoutubePlayerGuiKt;
import java.io.FileNotFoundException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChooseComposeScreen.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m7105d2 = {"ChooseComposeScreen", "", "screenId", "", "(ILandroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class ChooseComposeScreenKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void ChooseComposeScreen(final int i, @Nullable Composer composer, final int i2) throws FileNotFoundException {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1112113334);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1112113334, i3, -1, "com.blackhub.bronline.game.common.ChooseComposeScreen (ChooseComposeScreen.kt:67)");
            }
            if (i == 1) {
                composerStartRestartGroup.startReplaceableGroup(1957407132);
                PlatesGuiKt.PlatesGui(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (i == 6) {
                composerStartRestartGroup.startReplaceableGroup(1957407097);
                RentGuiKt.RentGui(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (i == 14) {
                composerStartRestartGroup.startReplaceableGroup(1957407064);
                MenuGuiKt.MenuGui(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (i == 35) {
                composerStartRestartGroup.startReplaceableGroup(1957406698);
                BlackPassBannerGuiKt.BlackPassBannerGui(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (i == 49) {
                composerStartRestartGroup.startReplaceableGroup(1957407625);
                CraftGuiKt.CraftGui(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (i == 57) {
                composerStartRestartGroup.startReplaceableGroup(1957406464);
                CatchStreamerGuiKt.CatchStreamerGui(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (i == 59) {
                composerStartRestartGroup.startReplaceableGroup(1957406791);
                FishingGuiKt.FishingGui(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (i == 61) {
                composerStartRestartGroup.startReplaceableGroup(1957406522);
                YoutubePlayerGuiKt.YoutubePlayerGui(null, composerStartRestartGroup, 0, 1);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (i == 17) {
                composerStartRestartGroup.startReplaceableGroup(1957407254);
                TaxiOrderGuiKt.TaxiOrderGui(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (i == 18) {
                composerStartRestartGroup.startReplaceableGroup(1957407487);
                TaxiRatingGuiKt.TaxiRatingGui(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (i == 30) {
                composerStartRestartGroup.startReplaceableGroup(1957407302);
                HolidayEventsGuiKt.HolidayEventsGui(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (i != 31) {
                switch (i) {
                    case 63:
                        composerStartRestartGroup.startReplaceableGroup(1957406580);
                        InteractionWithNpcGuiKt.InteractionWithNpcGui(composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        break;
                    case 64:
                        composerStartRestartGroup.startReplaceableGroup(1957406638);
                        PurchaseOfferAwardGuiKt.PurchaseOfferAwardGui(composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        break;
                    case 65:
                        composerStartRestartGroup.startReplaceableGroup(1957406749);
                        ActiveTaskGuiKt.ActiveTaskGui(composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        break;
                    case 66:
                        composerStartRestartGroup.startReplaceableGroup(1957406834);
                        AdminToolsGuiKt.AdminToolsGui(composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        break;
                    case 67:
                        composerStartRestartGroup.startReplaceableGroup(1957406882);
                        BrSimBannerGuiKt.BrSimBannerGui(composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        break;
                    case 68:
                        composerStartRestartGroup.startReplaceableGroup(1957406938);
                        UpgradeObjectEventGuiKt.UpgradeObjectEventGui(null, composerStartRestartGroup, 0, 1);
                        composerStartRestartGroup.endReplaceableGroup();
                        break;
                    case 69:
                        composerStartRestartGroup.startReplaceableGroup(1957406986);
                        GiftsGuiKt.GiftsGui(composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        break;
                    case 70:
                        composerStartRestartGroup.startReplaceableGroup(1957407026);
                        PanelInfoGuiKt.PanelInfoGui(composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        break;
                    case 71:
                        composerStartRestartGroup.startReplaceableGroup(1957407211);
                        CalendarGuiKt.CalendarGui(composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        break;
                    case 72:
                        composerStartRestartGroup.startReplaceableGroup(1957407171);
                        RateAppGuiKt.RateAppGui(composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        break;
                    case 73:
                        composerStartRestartGroup.startReplaceableGroup(1957407402);
                        CasesGuiKt.CasesGui(composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        break;
                    case 74:
                        composerStartRestartGroup.startReplaceableGroup(1957407442);
                        BpRewardsGuiKt.BpRewardsGui(composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        break;
                    case 75:
                        composerStartRestartGroup.startReplaceableGroup(1957407535);
                        TanpinBannerGuiKt.TanpinBannerGui(composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        break;
                    case 76:
                        composerStartRestartGroup.startReplaceableGroup(1957407584);
                        VideoPlayerGuiKt.VideoPlayerGui(composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        break;
                    case 77:
                        composerStartRestartGroup.startReplaceableGroup(1957407666);
                        MarketplaceGuiKt.MarketplaceGui(composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        break;
                    default:
                        switch (i) {
                            case 79:
                                composerStartRestartGroup.startReplaceableGroup(1957407709);
                                ClickerGuiKt.ClickerGUI(composerStartRestartGroup, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                                break;
                            case 80:
                                composerStartRestartGroup.startReplaceableGroup(1957407745);
                                ChatGuiKt.ChatGui(composerStartRestartGroup, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                                break;
                            case 81:
                                composerStartRestartGroup.startReplaceableGroup(1957407787);
                                ModuleDialogGuiKt.ModuleDialogGui(composerStartRestartGroup, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                                break;
                            case 82:
                                composerStartRestartGroup.startReplaceableGroup(1957407830);
                                RatingGuiKt.RatingGui(composerStartRestartGroup, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                                break;
                            default:
                                composerStartRestartGroup.startReplaceableGroup(1957407858);
                                composerStartRestartGroup.endReplaceableGroup();
                                break;
                        }
                }
            } else {
                composerStartRestartGroup.startReplaceableGroup(1957407357);
                MiniGamesHelperGuiKt.MiniGamesHelperGui(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.common.ChooseComposeScreenKt.ChooseComposeScreen.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) throws FileNotFoundException {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i4) throws FileNotFoundException {
                    ChooseComposeScreenKt.ChooseComposeScreen(i, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }
}
