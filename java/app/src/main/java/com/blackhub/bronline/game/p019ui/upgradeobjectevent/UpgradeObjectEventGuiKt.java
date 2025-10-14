package com.blackhub.bronline.game.p019ui.upgradeobjectevent;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.tooling.preview.Preview;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.blackhub.bronline.game.common.resources.StringResourceCompose;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.utils.attachment.CommonEventTopListModel;
import com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventUiState;
import com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventViewModel;
import com.blackhub.bronline.game.gui.upgradeobjectevent.model.GiftPrizeModel;
import com.blackhub.bronline.game.p019ui.widget.block.rating.CommonEventTopListKt;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* compiled from: UpgradeObjectEventGui.kt */
@SourceDebugExtension({"SMAP\nUpgradeObjectEventGui.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpgradeObjectEventGui.kt\ncom/blackhub/bronline/game/ui/upgradeobjectevent/UpgradeObjectEventGuiKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n*L\n1#1,156:1\n81#2,11:157\n*S KotlinDebug\n*F\n+ 1 UpgradeObjectEventGui.kt\ncom/blackhub/bronline/game/ui/upgradeobjectevent/UpgradeObjectEventGuiKt\n*L\n30#1:157,11\n*E\n"})
/* loaded from: classes3.dex */
public final class UpgradeObjectEventGuiKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void UpgradeObjectEventGui(@Nullable Modifier modifier, @Nullable Composer composer, final int i, final int i2) {
        CreationExtras defaultViewModelCreationExtras;
        Composer composer2;
        final Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1991703186);
        if ((i & 1) != 0 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1991703186, i, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventGui (UpgradeObjectEventGui.kt:27)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel(UpgradeObjectEventViewModel.class, current, null, null, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            final UpgradeObjectEventViewModel upgradeObjectEventViewModel = (UpgradeObjectEventViewModel) viewModel;
            final UpgradeObjectEventUiState upgradeObjectEventUiState = (UpgradeObjectEventUiState) FlowExtKt.collectAsStateWithLifecycle(upgradeObjectEventViewModel.getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 8, 7).getValue();
            composer2 = composerStartRestartGroup;
            boolean z = false;
            UpgradeObjectEventMainKt.UpgradeObjectEventMain(null, upgradeObjectEventUiState.isUpgradeObjectPlayer(), upgradeObjectEventUiState.getEventLevel(), upgradeObjectEventUiState.isInfoVisible(), StringResourceCompose.INSTANCE.getUpgradeObjectName(upgradeObjectEventUiState.isUpgradeObjectPlayer(), upgradeObjectEventUiState.getServerName(), composerStartRestartGroup, 384, 0), upgradeObjectEventUiState.getCurrency(), upgradeObjectEventUiState.getPriceForUpgrade(), upgradeObjectEventUiState.getCurrencySpent(), upgradeObjectEventUiState.getCurrencyProgressScore(), upgradeObjectEventUiState.getCountGift(), StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(upgradeObjectEventUiState.getBagText(), composer2, 0)), upgradeObjectEventUiState.isBlockingLoading(), upgradeObjectEventUiState.isUpgradeOneEnable(), upgradeObjectEventUiState.isUpgradeTwoEnable(), upgradeObjectEventUiState.isUpgradeThreeEnable(), upgradeObjectEventUiState.getTopServersList(), upgradeObjectEventUiState.getUpgradeBtnOffset(), upgradeObjectEventUiState.getBackColor(), upgradeObjectEventUiState.getEventObjectRes(), upgradeObjectEventUiState.getEventBackground(), upgradeObjectEventUiState.getUpgradeObjectStrings(), upgradeObjectEventUiState.getUpgradeObjectImages(), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventGuiKt.UpgradeObjectEventGui.1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    upgradeObjectEventViewModel.isLevelUpgradeObjectOpen(true);
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventGuiKt.UpgradeObjectEventGui.2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    upgradeObjectEventViewModel.sendGiftOpen();
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventGuiKt.UpgradeObjectEventGui.3
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    upgradeObjectEventViewModel.sendCloseScreen();
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventGuiKt.UpgradeObjectEventGui.4
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    upgradeObjectEventViewModel.closeInfoScreen();
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventGuiKt.UpgradeObjectEventGui.5
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    upgradeObjectEventViewModel.openInfoScreen();
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventGuiKt.UpgradeObjectEventGui.6
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    upgradeObjectEventViewModel.isEnergyInfoOpen(true);
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventGuiKt.UpgradeObjectEventGui.7
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    upgradeObjectEventViewModel.onBuyUpgradeClick(1);
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventGuiKt.UpgradeObjectEventGui.8
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    upgradeObjectEventViewModel.onBuyUpgradeClick(2);
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventGuiKt.UpgradeObjectEventGui.9
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    upgradeObjectEventViewModel.onBuyUpgradeClick(3);
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventGuiKt.UpgradeObjectEventGui.10
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    upgradeObjectEventViewModel.sendOpenTypeUpgradeObject(2);
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventGuiKt.UpgradeObjectEventGui.11
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    upgradeObjectEventViewModel.sendOpenTypeUpgradeObject(1);
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventGuiKt.UpgradeObjectEventGui.12
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    upgradeObjectEventViewModel.isGiftQuestionOpen(true);
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventGuiKt.UpgradeObjectEventGui.13
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    upgradeObjectEventViewModel.sendGiftOpen();
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventGuiKt.UpgradeObjectEventGui.14
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    upgradeObjectEventViewModel.sendTopListOpen(4);
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventGuiKt.UpgradeObjectEventGui.15
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    upgradeObjectEventViewModel.sendTopListOpen(5);
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventGuiKt.UpgradeObjectEventGui.16
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    upgradeObjectEventViewModel.turnBlockingLoading();
                }
            }, composer2, 0, 1208221696, 0, 0, 1, 0);
            ComposeExtensionKt.IfTrue(Boolean.valueOf(upgradeObjectEventUiState.isLevelUpgradeObjectOpen()), ComposableLambdaKt.composableLambda(composer2, -458404970, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventGuiKt.UpgradeObjectEventGui.17
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer3, int i3) {
                    if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-458404970, i3, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventGui.<anonymous> (UpgradeObjectEventGui.kt:83)");
                        }
                        int eventLevel = upgradeObjectEventUiState.getEventLevel();
                        int currencyLeftForNextLevel = upgradeObjectEventUiState.getCurrencyLeftForNextLevel();
                        List<GiftPrizeModel> awardsLevelList = upgradeObjectEventUiState.getAwardsLevelList();
                        if (awardsLevelList == null) {
                            awardsLevelList = CollectionsKt__CollectionsKt.emptyList();
                        }
                        List<GiftPrizeModel> list = awardsLevelList;
                        int currencyTemplate = upgradeObjectEventUiState.getUpgradeObjectStrings().getCurrencyTemplate();
                        final UpgradeObjectEventViewModel upgradeObjectEventViewModel2 = upgradeObjectEventViewModel;
                        UpgradeObjectEventLevelPrizesUiKt.UpgradeObjectEventLevelPrizesUi(null, eventLevel, currencyLeftForNextLevel, list, currencyTemplate, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventGuiKt.UpgradeObjectEventGui.17.1
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                upgradeObjectEventViewModel2.isLevelUpgradeObjectOpen(false);
                            }
                        }, composer3, 4096, 1);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composer2, 48);
            ComposeExtensionKt.IfTrue(Boolean.valueOf(upgradeObjectEventUiState.isEnergyInfoOpen()), ComposableLambdaKt.composableLambda(composer2, 1396114367, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventGuiKt.UpgradeObjectEventGui.18
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer3, int i3) {
                    if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1396114367, i3, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventGui.<anonymous> (UpgradeObjectEventGui.kt:93)");
                        }
                        String strStringResource = StringResources_androidKt.stringResource(upgradeObjectEventUiState.getUpgradeObjectStrings().getCurrencyInfoText(), composer3, 0);
                        AnnotatedString annotatedStringHtmlTextToAnnotatedString = StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(upgradeObjectEventUiState.getUpgradeObjectStrings().getCurrencyInfoDescText(), composer3, 0));
                        AnnotatedString annotatedStringHtmlTextToAnnotatedString2 = StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(upgradeObjectEventUiState.getUpgradeObjectStrings().getCurrencyInfoSubdescText(), composer3, 0));
                        int currencyEventImage = upgradeObjectEventUiState.getUpgradeObjectImages().getCurrencyEventImage();
                        final UpgradeObjectEventViewModel upgradeObjectEventViewModel2 = upgradeObjectEventViewModel;
                        UpgradeObjectEventHintKt.UpgradeObjectEventHint(null, strStringResource, annotatedStringHtmlTextToAnnotatedString, annotatedStringHtmlTextToAnnotatedString2, currencyEventImage, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventGuiKt.UpgradeObjectEventGui.18.1
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                upgradeObjectEventViewModel2.isEnergyInfoOpen(false);
                            }
                        }, composer3, 0, 1);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composer2, 48);
            ComposeExtensionKt.IfTrue(Boolean.valueOf(upgradeObjectEventUiState.isGiftQuestionOpen()), ComposableLambdaKt.composableLambda(composer2, 1869633310, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventGuiKt.UpgradeObjectEventGui.19
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer3, int i3) {
                    if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1869633310, i3, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventGui.<anonymous> (UpgradeObjectEventGui.kt:103)");
                        }
                        String strStringResource = StringResources_androidKt.stringResource(R.string.christmas_tree_gift_question_title, composer3, 6);
                        AnnotatedString annotatedStringHtmlTextToAnnotatedString = StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(upgradeObjectEventUiState.getUpgradeObjectStrings().getGiftQuestionDesc(), composer3, 0));
                        int giftInfoImage = upgradeObjectEventUiState.getUpgradeObjectImages().getGiftInfoImage();
                        final UpgradeObjectEventViewModel upgradeObjectEventViewModel2 = upgradeObjectEventViewModel;
                        UpgradeObjectEventHintKt.UpgradeObjectEventHint(null, strStringResource, annotatedStringHtmlTextToAnnotatedString, null, giftInfoImage, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventGuiKt.UpgradeObjectEventGui.19.1
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                upgradeObjectEventViewModel2.isGiftQuestionOpen(false);
                            }
                        }, composer3, 0, 9);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composer2, 48);
            ComposeExtensionKt.IfTrue(Boolean.valueOf(upgradeObjectEventUiState.getTypeScreen() == 4 && upgradeObjectEventUiState.isTopListOpen()), ComposableLambdaKt.composableLambda(composer2, -1951815043, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventGuiKt.UpgradeObjectEventGui.20
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer3, int i3) {
                    CommonEventTopListModel commonEventTopListModel;
                    if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1951815043, i3, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventGui.<anonymous> (UpgradeObjectEventGui.kt:112)");
                        }
                        String strValueOf = String.valueOf(upgradeObjectEventUiState.getPlacePLayerInTopList());
                        String namePLayerInTopList = upgradeObjectEventUiState.getNamePLayerInTopList();
                        String levelPLayerInTopList = upgradeObjectEventUiState.getLevelPLayerInTopList();
                        List<CommonEventTopListModel> topList = upgradeObjectEventUiState.getTopList();
                        String playerRewardOrServer = (topList == null || (commonEventTopListModel = (CommonEventTopListModel) CollectionsKt___CollectionsKt.getOrNull(topList, upgradeObjectEventUiState.getPlacePLayerInTopList())) == null) ? null : commonEventTopListModel.getPlayerRewardOrServer();
                        if (playerRewardOrServer == null) {
                            playerRewardOrServer = "";
                        }
                        CommonEventTopListModel commonEventTopListModel2 = new CommonEventTopListModel(strValueOf, namePLayerInTopList, levelPLayerInTopList, playerRewardOrServer, null, 16, null);
                        int icReward = upgradeObjectEventUiState.getUpgradeObjectImages().getIcReward();
                        List<CommonEventTopListModel> topList2 = upgradeObjectEventUiState.getTopList();
                        if (topList2 == null) {
                            topList2 = CollectionsKt__CollectionsKt.emptyList();
                        }
                        List<CommonEventTopListModel> list = topList2;
                        AnnotatedString annotatedStringHtmlTextToAnnotatedString = StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(upgradeObjectEventUiState.getUpgradeObjectStrings().getTopLevelText(), composer3, 0));
                        String strStringResource = StringResources_androidKt.stringResource(R.string.common_prize, composer3, 6);
                        boolean z2 = upgradeObjectEventUiState.getPlacePLayerInTopList() <= 7;
                        final UpgradeObjectEventViewModel upgradeObjectEventViewModel2 = upgradeObjectEventViewModel;
                        CommonEventTopListKt.CommonEventTopList(null, false, commonEventTopListModel2, icReward, list, annotatedStringHtmlTextToAnnotatedString, strStringResource, z2, 0, false, null, null, null, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventGuiKt.UpgradeObjectEventGui.20.1
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                upgradeObjectEventViewModel2.closeTopListOpen();
                            }
                        }, composer3, 32816, 0, 7937);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composer2, 48);
            if (upgradeObjectEventUiState.getTypeScreen() == 5 && upgradeObjectEventUiState.isTopListOpen()) {
                z = true;
            }
            ComposeExtensionKt.IfTrue(Boolean.valueOf(z), ComposableLambdaKt.composableLambda(composer2, -1478296100, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventGuiKt.UpgradeObjectEventGui.21
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer3, int i3) {
                    if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1478296100, i3, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventGui.<anonymous> (UpgradeObjectEventGui.kt:130)");
                        }
                        CommonEventTopListModel commonEventTopListModel = new CommonEventTopListModel(String.valueOf(upgradeObjectEventUiState.getPlacePLayerInTopList()), upgradeObjectEventUiState.getNamePLayerInTopList(), upgradeObjectEventUiState.getLevelPLayerInTopList(), upgradeObjectEventUiState.getServerName(), null, 16, null);
                        int icReward = upgradeObjectEventUiState.getUpgradeObjectImages().getIcReward();
                        List<CommonEventTopListModel> topList = upgradeObjectEventUiState.getTopList();
                        if (topList == null) {
                            topList = CollectionsKt__CollectionsKt.emptyList();
                        }
                        List<CommonEventTopListModel> list = topList;
                        AnnotatedString annotatedStringHtmlTextToAnnotatedString = StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(upgradeObjectEventUiState.getUpgradeObjectStrings().getTopLevelGameText(), composer3, 0));
                        String strStringResource = StringResources_androidKt.stringResource(R.string.common_server, composer3, 6);
                        boolean z2 = upgradeObjectEventUiState.getPlacePLayerInTopList() <= 7;
                        final UpgradeObjectEventViewModel upgradeObjectEventViewModel2 = upgradeObjectEventViewModel;
                        CommonEventTopListKt.CommonEventTopList(null, true, commonEventTopListModel, icReward, list, annotatedStringHtmlTextToAnnotatedString, strStringResource, z2, 0, false, null, null, null, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventGuiKt.UpgradeObjectEventGui.21.1
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                upgradeObjectEventViewModel2.closeTopListOpen();
                            }
                        }, composer3, 32816, 0, 7937);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composer2, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventGuiKt.UpgradeObjectEventGui.22
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i3) {
                    UpgradeObjectEventGuiKt.UpgradeObjectEventGui(modifier2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(device = "spec:width=360dp,height=640dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape", name = "Phone 360 x 640 Android small")
    public static final void PreviewEventGui(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2054560182);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2054560182, i, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.PreviewEventGui (UpgradeObjectEventGui.kt:153)");
            }
            UpgradeObjectEventGui(null, composerStartRestartGroup, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventGuiKt.PreviewEventGui.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    UpgradeObjectEventGuiKt.PreviewEventGui(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

