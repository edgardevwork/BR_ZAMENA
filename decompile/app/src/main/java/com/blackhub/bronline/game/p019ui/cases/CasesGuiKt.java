package com.blackhub.bronline.game.p019ui.cases;

import android.graphics.Bitmap;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.blackhub.bronline.game.core.constants.resources.PngConstantsId73;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.core.utils.attachment.tutorial.CommonTutorialTextsWithImage;
import com.blackhub.bronline.game.gui.cases.CasesUiState;
import com.blackhub.bronline.game.gui.cases.CasesViewModel;
import com.blackhub.bronline.game.gui.cases.model.Case;
import com.blackhub.bronline.game.gui.cases.model.CaseBonus;
import com.blackhub.bronline.game.gui.cases.model.CaseReward;
import com.blackhub.bronline.game.gui.cases.model.CasesBonusHintAttachment;
import com.blackhub.bronline.game.gui.cases.model.CasesText;
import com.blackhub.bronline.game.p019ui.cases.p020ui.CasesMainUiKt;
import com.blackhub.bronline.game.p019ui.cases.p020ui.CasesOpenOneCaseUiKt;
import com.blackhub.bronline.game.p019ui.cases.p020ui.CasesOpenTenCasesUiKt;
import com.blackhub.bronline.game.p019ui.cases.p020ui.CasesReceivingSuperRewardUiKt;
import com.blackhub.bronline.game.p019ui.widget.block.banner.CasesBannerBlockKt;
import com.blackhub.bronline.game.p019ui.widget.block.tutorial.TutorialImageAndFourRowsUiKt;
import com.blackhub.bronline.game.p019ui.widget.block.tutorial.TutorialImageAndThreeTextsUiKt;
import com.blackhub.bronline.game.p019ui.widget.checkbox.CheckBoxCustomKt;
import com.blackhub.bronline.game.p019ui.widget.dialog.DialogCustomBlockKt;
import com.blackhub.bronline.game.p019ui.widget.dialog.PreviewRewardDialogUiKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CasesGui.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005²\u0006\n\u0010\u0006\u001a\u00020\u0001X\u008a\u0084\u0002"}, m7105d2 = {"TEXT_ALPHA_IS_NEED_SPRAY", "", "CasesGui", "", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease", "textAlphaSecondTextDialogConfirmation"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCasesGui.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CasesGui.kt\ncom/blackhub/bronline/game/ui/cases/CasesGuiKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,420:1\n81#2,11:421\n1116#3,6:432\n1116#3,6:438\n81#4:444\n*S KotlinDebug\n*F\n+ 1 CasesGui.kt\ncom/blackhub/bronline/game/ui/cases/CasesGuiKt\n*L\n62#1:421,11\n65#1:432,6\n66#1:438,6\n66#1:444\n*E\n"})
/* loaded from: classes2.dex */
public final class CasesGuiKt {
    public static final float TEXT_ALPHA_IS_NEED_SPRAY = 0.7f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CasesGui(@Nullable Composer composer, final int i) throws FileNotFoundException {
        CreationExtras defaultViewModelCreationExtras;
        MutableState mutableState;
        CasesText casesText;
        CasesUiState casesUiState;
        Composer composer2;
        Composer composer3;
        Composer composerStartRestartGroup = composer.startRestartGroup(481699293);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(481699293, i, -1, "com.blackhub.bronline.game.ui.cases.CasesGui (CasesGui.kt:59)");
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
            ViewModel viewModel = ViewModelKt.viewModel(CasesViewModel.class, current, null, null, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            final CasesViewModel casesViewModel = (CasesViewModel) viewModel;
            final CasesUiState casesUiState2 = (CasesUiState) SnapshotStateKt.collectAsState(casesViewModel.getUiState(), null, composerStartRestartGroup, 8, 1).getValue();
            CasesText casesStrings = casesUiState2.getCasesStrings();
            composerStartRestartGroup.startReplaceableGroup(-766961397);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            int dialogConfirmationContextType = casesUiState2.getDialogConfirmationContextType();
            composerStartRestartGroup.startReplaceableGroup(-766961313);
            boolean zChanged = composerStartRestartGroup.changed(dialogConfirmationContextType);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: com.blackhub.bronline.game.ui.cases.CasesGuiKt$CasesGui$textAlphaSecondTextDialogConfirmation$2$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Float invoke() {
                        int dialogConfirmationContextType2 = casesUiState2.getDialogConfirmationContextType();
                        return Float.valueOf((dialogConfirmationContextType2 == 5 || dialogConfirmationContextType2 == 6) ? 1.0f : 0.7f);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final State state = (State) objRememberedValue2;
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(mutableState2.getValue(), new C51141(casesViewModel, mutableState2, null), composerStartRestartGroup, 64);
            int currentScreen = casesUiState2.getCurrentScreen();
            if (currentScreen != 1) {
                if (currentScreen == 2) {
                    mutableState = mutableState2;
                    casesText = casesStrings;
                    casesUiState = casesUiState2;
                    composer3 = composerStartRestartGroup;
                    composer3.startReplaceableGroup(-766956834);
                    CasesOpenTenCasesUiKt.CasesOpenTenCasesUi(casesUiState.getBitmapMap().get(PngConstantsId73.IMG_LEGENDARY_CASE), casesUiState.getValueOfCurrentDust(), casesUiState.getGetValueOfPreviewDust(), casesUiState.getValueOfMaxDust(), casesUiState.getHeightOfImage(), casesUiState.getGettingTenRewardsList(), casesUiState.isNeedShowButtonSpray(), casesUiState.getSelectedSprayedDust(), casesUiState.getAllRewardsOpened(), casesUiState.isAnimationNeed(), casesUiState.getCurrentReward(), casesUiState.getCurrentRewardNumberForUi(), casesUiState.isSelectedItems(), casesUiState.getPrizesBgPattern(), new Function2<CaseReward, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CasesGuiKt.CasesGui.13
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(CaseReward caseReward, Integer num) {
                            invoke(caseReward, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull CaseReward reward, int i2) {
                            Intrinsics.checkNotNullParameter(reward, "reward");
                            casesViewModel.onSelectOpeningReward(reward, i2);
                        }
                    }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CasesGuiKt.CasesGui.14
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
                            CasesViewModel.onClickTakeRewards$default(casesViewModel, null, 1, null);
                        }
                    }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CasesGuiKt.CasesGui.15
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
                            casesViewModel.onClickToSprayRewardsWithDialog();
                        }
                    }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CasesGuiKt.CasesGui.16
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
                            casesViewModel.onClickNextReward();
                        }
                    }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CasesGuiKt.CasesGui.17
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
                            casesViewModel.onClickSkipAnim();
                        }
                    }, composer3, 262152, 4104, 0);
                    composer3.endReplaceableGroup();
                    Unit unit = Unit.INSTANCE;
                } else if (currentScreen != 3) {
                    if (currentScreen == 4) {
                        composerStartRestartGroup.startReplaceableGroup(-766954503);
                        CasesReceivingSuperRewardUiKt.CasesReceivingSuperRewardUi(casesUiState2.getBitmapMap().get(PngConstantsId73.IMG_LEGENDARY_CASE), casesUiState2.getBgImage(), StringResources_androidKt.stringResource(R.string.cases_super_case, composerStartRestartGroup, 6), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CasesGuiKt.CasesGui.20
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
                                casesViewModel.openSuperCase();
                            }
                        }, composerStartRestartGroup, 72);
                        composerStartRestartGroup.endReplaceableGroup();
                        Unit unit2 = Unit.INSTANCE;
                    } else if (currentScreen == 5) {
                        composerStartRestartGroup.startReplaceableGroup(-766954143);
                        CasesBannerBlockKt.CasesBannerBlock(casesUiState2.getBannerAttachment(), false, false, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CasesGuiKt.CasesGui.21
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
                                casesViewModel.onClickOpenCasesFromBanner();
                            }
                        }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CasesGuiKt.CasesGui.22
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
                                casesViewModel.onClickCloseBanner();
                            }
                        }, composerStartRestartGroup, 8, 6);
                        composerStartRestartGroup.endReplaceableGroup();
                        Unit unit3 = Unit.INSTANCE;
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-766953893);
                        composerStartRestartGroup.endReplaceableGroup();
                        Unit unit4 = Unit.INSTANCE;
                    }
                    mutableState = mutableState2;
                    casesText = casesStrings;
                    casesUiState = casesUiState2;
                    composer2 = composerStartRestartGroup;
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-766955284);
                    mutableState = mutableState2;
                    casesUiState = casesUiState2;
                    casesText = casesStrings;
                    composer3 = composerStartRestartGroup;
                    CasesOpenOneCaseUiKt.CasesOpenOneCaseUi(casesUiState2.getBitmapMap().get(PngConstantsId73.IMG_LEGENDARY_CASE), casesUiState2.getSingleFirstReward(), casesUiState2.getValueOfCurrentDust(), casesUiState2.getValueOfMaxDust(), casesUiState2.isAnimationNeed(), null, true, casesUiState2.getCurrentRewardNumberForUi(), casesUiState2.getHeightOfImage(), casesUiState2.getPrizesBgPattern(), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CasesGuiKt.CasesGui.18
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
                            CasesViewModel.onClickTakeRewards$default(casesViewModel, null, 1, null);
                        }
                    }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CasesGuiKt.CasesGui.19
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
                            casesViewModel.onClickToSprayRewardsWithDialog();
                        }
                    }, null, null, composer3, 1075314760, 0, 12320);
                    composer3.endReplaceableGroup();
                    Unit unit5 = Unit.INSTANCE;
                }
                composer2 = composer3;
            } else {
                mutableState = mutableState2;
                casesText = casesStrings;
                casesUiState = casesUiState2;
                composerStartRestartGroup.startReplaceableGroup(-766960774);
                Case selectedCase = casesUiState.getSelectedCase();
                Bitmap bitmap = casesUiState.getBitmapMap().get(PngConstantsId73.IMG_LEGENDARY_CASE);
                AnnotatedString bcAmount = casesUiState.getBcAmount();
                int widthOfImage = casesUiState.getWidthOfImage();
                int heightOfImage = casesUiState.getHeightOfImage();
                String dates = casesUiState.getSelectedCase().getDates();
                CaseReward selectedReward = casesUiState.getSelectedReward();
                String rewardName = selectedReward != null ? selectedReward.getRewardName() : null;
                CaseReward selectedReward2 = casesUiState.getSelectedReward();
                String str = (String) UtilsKt.buildTypeMerge(rewardName, selectedReward2 != null ? selectedReward2.getRewardNameStore() : null);
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                List<Case> casesList = casesUiState.getCasesList();
                int selectedCaseId = casesUiState.getSelectedCaseId();
                int goToCasePos = casesUiState.getGoToCasePos();
                List<CaseBonus> selectedBonuses = casesUiState.getSelectedBonuses();
                int openingsCount = casesUiState.getOpeningsCount();
                List<Float> progressBarBonusPercentList = casesUiState.getProgressBarBonusPercentList();
                CaseReward selectedReward3 = casesUiState.getSelectedReward();
                int textColor = selectedReward3 != null ? selectedReward3.getTextColor() : R.color.white;
                String priceOneCaseFormatted = casesUiState.getPriceStateIsHintsOpened().getPriceOneCaseFormatted();
                String priceTenCasesFormatted = casesUiState.getPriceStateIsHintsOpened().getPriceTenCasesFormatted();
                Integer discountOneCase = casesUiState.getPriceStateIsHintsOpened().getDiscountOneCase();
                Integer discountTenCase = casesUiState.getPriceStateIsHintsOpened().getDiscountTenCase();
                String salePriceOneCaseFormatted = casesUiState.getPriceStateIsHintsOpened().getSalePriceOneCaseFormatted();
                String salePriceTenCasesFormatted = casesUiState.getPriceStateIsHintsOpened().getSalePriceTenCasesFormatted();
                float oneAlpha = casesUiState.getPriceStateIsHintsOpened().getOneAlpha();
                float tenAlpha = casesUiState.getPriceStateIsHintsOpened().getTenAlpha();
                int typeOpenOneCaseButton = casesUiState.getPriceStateIsHintsOpened().getTypeOpenOneCaseButton();
                int typeOpenTenCaseButton = casesUiState.getPriceStateIsHintsOpened().getTypeOpenTenCaseButton();
                composer2 = composerStartRestartGroup;
                CasesMainUiKt.CasesMainUi(bitmap, selectedCase, dates, bcAmount, casesList, selectedCaseId, goToCasePos, widthOfImage, heightOfImage, selectedBonuses, progressBarBonusPercentList, openingsCount, casesUiState.getValueOfCurrentDust(), casesUiState.getValueOfMaxDust(), str2, textColor, casesUiState.getGetOpenOneCaseBtnWidth(), casesUiState.getGetOpenTenCasesBtnWidth(), oneAlpha, tenAlpha, priceOneCaseFormatted, priceTenCasesFormatted, discountOneCase, discountTenCase, salePriceOneCaseFormatted, salePriceTenCasesFormatted, typeOpenOneCaseButton, typeOpenTenCaseButton, casesUiState.getGetAlphaIsOpenedHints(), casesUiState.getGetCloseBtnRes(), casesUiState.isHintsOpened(), casesText.getSaleOneHintText(), casesText.getSaleTenHintText(), casesText.getUniqueCaseHintText(), casesText.getScaleHintText(), casesUiState.getSelectedRewards(), casesUiState.getSelectedRewardPos(), new Function1<Float, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CasesGuiKt.CasesGui.2
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                        invoke(f.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(float f) {
                        casesViewModel.openCaseWithDialog(1, f);
                    }
                }, new Function1<Float, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CasesGuiKt.CasesGui.3
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                        invoke(f.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(float f) {
                        casesViewModel.openCaseWithDialog(2, f);
                    }
                }, new Function1<Case, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CasesGuiKt.CasesGui.4
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Case r1) {
                        invoke2(r1);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Case r2) {
                        Intrinsics.checkNotNullParameter(r2, "case");
                        casesViewModel.selectCase(r2);
                    }
                }, new Function2<CaseBonus, Bitmap, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CasesGuiKt.CasesGui.5
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(CaseBonus caseBonus, Bitmap bitmap2) {
                        invoke2(caseBonus, bitmap2);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull CaseBonus bonus, @Nullable Bitmap bitmap2) {
                        Intrinsics.checkNotNullParameter(bonus, "bonus");
                        casesViewModel.onBonusClick(bonus, bitmap2);
                    }
                }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CasesGuiKt.CasesGui.6
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
                        casesViewModel.onInfoClick();
                    }
                }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CasesGuiKt.CasesGui.7
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
                        casesViewModel.onBonusInfoClick();
                    }
                }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CasesGuiKt.CasesGui.8
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
                        casesViewModel.onCloseClick();
                    }
                }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CasesGuiKt.CasesGui.9
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
                        casesViewModel.onBcButtonClick();
                    }
                }, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CasesGuiKt.CasesGui.10
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                        invoke(num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(int i2) {
                        casesViewModel.onClickBottomItem(i2);
                    }
                }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CasesGuiKt.CasesGui.11
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
                        casesViewModel.onBpRewardsClick();
                    }
                }, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CasesGuiKt.CasesGui.12
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                        invoke(num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(int i2) {
                        casesViewModel.selectReward(i2);
                    }
                }, composer2, 1073774664, 8, 0, 262144, 0, 0, 0);
                composer2.endReplaceableGroup();
                Unit unit6 = Unit.INSTANCE;
            }
            final CasesUiState casesUiState3 = casesUiState;
            ComposeExtensionKt.IfTrue(Boolean.valueOf(casesUiState.isShowDialogPreviewReward()), ComposableLambdaKt.composableLambda(composer2, 844412085, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CasesGuiKt.CasesGui.23
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                    invoke(composer4, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer4, int i2) {
                    if ((i2 & 11) != 2 || !composer4.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(844412085, i2, -1, "com.blackhub.bronline.game.ui.cases.CasesGui.<anonymous> (CasesGui.kt:226)");
                        }
                        String name = casesUiState3.getSelectedBonusReward().getName();
                        int state2 = casesUiState3.getSelectedBonusReward().getState();
                        CommonRarityEnum rarity = casesUiState3.getSelectedBonusReward().getRarity();
                        Bitmap rewardImage = casesUiState3.getRewardImage();
                        final CasesViewModel casesViewModel2 = casesViewModel;
                        PreviewRewardDialogUiKt.PreviewRewardDialogUi(name, state2, rarity, rewardImage, 0, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CasesGuiKt.CasesGui.23.1
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
                                casesViewModel2.closeDialogPreview();
                            }
                        }, composer4, 4096, 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer4.skipToGroupEnd();
                }
            }), composer2, 48);
            ComposeExtensionKt.IfTrue(Boolean.valueOf(casesUiState3.isHintsBonusInfoOpened()), ComposableLambdaKt.composableLambda(composer2, -1581093972, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CasesGuiKt.CasesGui.24
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                    invoke(composer4, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer4, int i2) {
                    if ((i2 & 11) != 2 || !composer4.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1581093972, i2, -1, "com.blackhub.bronline.game.ui.cases.CasesGui.<anonymous> (CasesGui.kt:236)");
                        }
                        CasesBonusHintAttachment casesBonusHintAttachment = casesUiState3.getCasesBonusHintAttachment();
                        final CasesViewModel casesViewModel2 = casesViewModel;
                        TutorialImageAndFourRowsUiKt.TutorialImageAndFourRowsUi(casesBonusHintAttachment, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CasesGuiKt.CasesGui.24.1
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
                                casesViewModel2.onBonusInfoClose();
                            }
                        }, composer4, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer4.skipToGroupEnd();
                }
            }), composer2, 48);
            final CasesText casesText2 = casesText;
            ComposeExtensionKt.IfTrue(Boolean.valueOf(casesUiState3.isMainHintDialogOpened()), ComposableLambdaKt.composableLambda(composer2, -1567561171, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CasesGuiKt.CasesGui.25
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                    invoke(composer4, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer4, int i2) {
                    if ((i2 & 11) != 2 || !composer4.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1567561171, i2, -1, "com.blackhub.bronline.game.ui.cases.CasesGui.<anonymous> (CasesGui.kt:243)");
                        }
                        List<CommonTutorialTextsWithImage> hintAttachment = casesText2.getHintAttachment();
                        int size = casesText2.getHintAttachment().size();
                        final CasesViewModel casesViewModel2 = casesViewModel;
                        TutorialImageAndThreeTextsUiKt.TutorialWithImageAndThreeTextsUi(hintAttachment, size, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CasesGuiKt.CasesGui.25.1
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
                                casesViewModel2.closeHint();
                            }
                        }, composer4, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer4.skipToGroupEnd();
                }
            }), composer2, 48);
            final MutableState mutableState3 = mutableState;
            ComposeExtensionKt.IfTrue(Boolean.valueOf(casesUiState3.isShowDialogConfirmation()), ComposableLambdaKt.composableLambda(composer2, -1554028370, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CasesGuiKt.CasesGui.26
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                    invoke(composer4, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer4, int i2) {
                    if ((i2 & 11) == 2 && composer4.getSkipping()) {
                        composer4.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1554028370, i2, -1, "com.blackhub.bronline.game.ui.cases.CasesGui.<anonymous> (CasesGui.kt:251)");
                    }
                    String upperCase = StringResources_androidKt.stringResource(R.string.common_confirmation, composer4, 6).toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    String buttonApplyText = casesUiState3.getButtonApplyText();
                    float fCasesGui$lambda$2 = CasesGuiKt.CasesGui$lambda$2(state);
                    final CasesViewModel casesViewModel2 = casesViewModel;
                    Function0<Unit> function0 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CasesGuiKt.CasesGui.26.1
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
                            casesViewModel2.dialogConfirmationApply();
                        }
                    };
                    final CasesViewModel casesViewModel3 = casesViewModel;
                    Function0<Unit> function02 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CasesGuiKt.CasesGui.26.2
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
                            casesViewModel3.closeDialogConfirmation();
                        }
                    };
                    final CasesUiState casesUiState4 = casesUiState3;
                    final CasesText casesText3 = casesText2;
                    final MutableState<Boolean> mutableState4 = mutableState3;
                    DialogCustomBlockKt.m15083DialogCustomBlockkoCIM3s(null, R.color.total_black_70, upperCase, null, 0L, 0.0f, null, false, buttonApplyText, null, null, 0L, 0L, fCasesGui$lambda$2, 0.0f, null, null, function0, function02, ComposableLambdaKt.composableLambda(composer4, 1296326807, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CasesGuiKt.CasesGui.26.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                            invoke(composer5, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer5, int i3) {
                            if ((i3 & 11) != 2 || !composer5.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1296326807, i3, -1, "com.blackhub.bronline.game.ui.cases.CasesGui.<anonymous>.<anonymous> (CasesGui.kt:259)");
                                }
                                int dialogConfirmationContextType2 = casesUiState4.getDialogConfirmationContextType();
                                if (dialogConfirmationContextType2 == 1) {
                                    composer5.startReplaceableGroup(-758724108);
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    Modifier modifierM8126paddingqDBjuR0 = PaddingKt.m8126paddingqDBjuR0(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._50wdp, composer5, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer5, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._50wdp, composer5, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._50wdp, composer5, 6));
                                    Alignment.Companion companion3 = Alignment.INSTANCE;
                                    Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
                                    CasesText casesText4 = casesText3;
                                    MutableState<Boolean> mutableState5 = mutableState4;
                                    composer5.startReplaceableGroup(-483455358);
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer5, 48);
                                    composer5.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8126paddingqDBjuR0);
                                    if (!(composer5.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer5.startReusableNode();
                                    if (composer5.getInserting()) {
                                        composer5.createNode(constructor);
                                    } else {
                                        composer5.useNode();
                                    }
                                    Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer5);
                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer5)), composer5, 0);
                                    composer5.startReplaceableGroup(2058660585);
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    AnnotatedString dialogConfirmationOneText = casesText4.getDialogConfirmationOneText();
                                    TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                                    TextAlign.Companion companion5 = TextAlign.INSTANCE;
                                    TextKt.m10025TextIbK3jfQ(dialogConfirmationOneText, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14843montserratMediumCustomSpbl3sdaw(R.dimen._16wsp, 0L, companion5.m13558getCentere0LSkKk(), 0L, 0.0f, composer5, 196614, 26), composer5, 0, 0, 131070);
                                    Modifier modifierM8125paddingVpY3zN4$default = PaddingKt.m8125paddingVpY3zN4$default(companion2, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._18wdp, composer5, 6), 1, null);
                                    TextKt.m10025TextIbK3jfQ(casesText4.getDialogConfirmationTwoText(), modifierM8125paddingVpY3zN4$default, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14843montserratMediumCustomSpbl3sdaw(R.dimen._13wsp, ColorResources_androidKt.colorResource(R.color.white_40, composer5, 6), companion5.m13558getCentere0LSkKk(), 0L, 0.0f, composer5, 196614, 24), composer5, 0, 0, 131068);
                                    composer5.startReplaceableGroup(693286680);
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composer5, 0);
                                    composer5.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion2);
                                    if (!(composer5.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer5.startReusableNode();
                                    if (composer5.getInserting()) {
                                        composer5.createNode(constructor2);
                                    } else {
                                        composer5.useNode();
                                    }
                                    Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer5);
                                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer5)), composer5, 0);
                                    composer5.startReplaceableGroup(2058660585);
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    CheckBoxCustomKt.CheckBoxCustom(SizeKt.m8172size3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(companion2, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composer5, 6), 0.0f, 11, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer5, 6)), mutableState5, R.dimen._3wdp, 0, null, null, null, 0, null, Brush.Companion.m11289horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.yellow_orange, composer5, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.yellow_orange, composer5, 6))}), 0.0f, 0.0f, 0, 14, (Object) null), 0, composer5, 432, 0, 1528);
                                    TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.cases_skip_animation, composer5, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._15wsp, 0L, 0, 0L, 0.0f, null, composer5, 1572870, 62), composer5, 0, 0, 65534);
                                    composer5.endReplaceableGroup();
                                    composer5.endNode();
                                    composer5.endReplaceableGroup();
                                    composer5.endReplaceableGroup();
                                    composer5.endReplaceableGroup();
                                    composer5.endNode();
                                    composer5.endReplaceableGroup();
                                    composer5.endReplaceableGroup();
                                    composer5.endReplaceableGroup();
                                    Unit unit7 = Unit.INSTANCE;
                                } else if (dialogConfirmationContextType2 == 2) {
                                    composer5.startReplaceableGroup(-758721435);
                                    Modifier.Companion companion6 = Modifier.INSTANCE;
                                    Modifier modifierM8126paddingqDBjuR02 = PaddingKt.m8126paddingqDBjuR0(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._50wdp, composer5, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer5, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._50wdp, composer5, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._50wdp, composer5, 6));
                                    Alignment.Companion companion7 = Alignment.INSTANCE;
                                    Alignment.Horizontal centerHorizontally2 = companion7.getCenterHorizontally();
                                    CasesText casesText5 = casesText3;
                                    MutableState<Boolean> mutableState6 = mutableState4;
                                    composer5.startReplaceableGroup(-483455358);
                                    Arrangement arrangement2 = Arrangement.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally2, composer5, 48);
                                    composer5.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                    CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor3 = companion8.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM8126paddingqDBjuR02);
                                    if (!(composer5.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer5.startReusableNode();
                                    if (composer5.getInserting()) {
                                        composer5.createNode(constructor3);
                                    } else {
                                        composer5.useNode();
                                    }
                                    Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer5);
                                    Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyColumnMeasurePolicy2, companion8.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion8.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion8.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    }
                                    function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer5)), composer5, 0);
                                    composer5.startReplaceableGroup(2058660585);
                                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                    AnnotatedString dialogConfirmationOneText2 = casesText5.getDialogConfirmationOneText();
                                    TypographyStyle typographyStyle2 = TypographyStyle.INSTANCE;
                                    TextKt.m10025TextIbK3jfQ(dialogConfirmationOneText2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle2.m14843montserratMediumCustomSpbl3sdaw(R.dimen._16wsp, 0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composer5, 196614, 26), composer5, 0, 0, 131070);
                                    Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(companion6, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._18wdp, composer5, 6), 0.0f, 0.0f, 13, null);
                                    composer5.startReplaceableGroup(693286680);
                                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement2.getStart(), companion7.getTop(), composer5, 0);
                                    composer5.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                    CompositionLocalMap currentCompositionLocalMap4 = composer5.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor4 = companion8.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
                                    if (!(composer5.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer5.startReusableNode();
                                    if (composer5.getInserting()) {
                                        composer5.createNode(constructor4);
                                    } else {
                                        composer5.useNode();
                                    }
                                    Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer5);
                                    Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRowMeasurePolicy2, companion8.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion8.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion8.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                        composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                        composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                    }
                                    function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer5)), composer5, 0);
                                    composer5.startReplaceableGroup(2058660585);
                                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                    CheckBoxCustomKt.CheckBoxCustom(SizeKt.m8172size3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(companion6, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composer5, 6), 0.0f, 11, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer5, 6)), mutableState6, R.dimen._3wdp, 0, null, null, null, 0, null, Brush.Companion.m11289horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.yellow_orange, composer5, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.yellow_orange, composer5, 6))}), 0.0f, 0.0f, 0, 14, (Object) null), 0, composer5, 432, 0, 1528);
                                    TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.cases_skip_animation, composer5, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle2.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._15wsp, 0L, 0, 0L, 0.0f, null, composer5, 1572870, 62), composer5, 0, 0, 65534);
                                    composer5.endReplaceableGroup();
                                    composer5.endNode();
                                    composer5.endReplaceableGroup();
                                    composer5.endReplaceableGroup();
                                    composer5.endReplaceableGroup();
                                    composer5.endNode();
                                    composer5.endReplaceableGroup();
                                    composer5.endReplaceableGroup();
                                    composer5.endReplaceableGroup();
                                    Unit unit8 = Unit.INSTANCE;
                                } else if (dialogConfirmationContextType2 == 3) {
                                    composer5.startReplaceableGroup(-758719167);
                                    Modifier modifierM8126paddingqDBjuR03 = PaddingKt.m8126paddingqDBjuR0(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._50wdp, composer5, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer5, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._50wdp, composer5, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._50wdp, composer5, 6));
                                    Alignment.Horizontal centerHorizontally3 = Alignment.INSTANCE.getCenterHorizontally();
                                    CasesText casesText6 = casesText3;
                                    composer5.startReplaceableGroup(-483455358);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally3, composer5, 48);
                                    composer5.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                    CompositionLocalMap currentCompositionLocalMap5 = composer5.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor5 = companion9.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM8126paddingqDBjuR03);
                                    if (!(composer5.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer5.startReusableNode();
                                    if (composer5.getInserting()) {
                                        composer5.createNode(constructor5);
                                    } else {
                                        composer5.useNode();
                                    }
                                    Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composer5);
                                    Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyColumnMeasurePolicy3, companion9.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion9.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion9.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                        composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                        composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                    }
                                    function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer5)), composer5, 0);
                                    composer5.startReplaceableGroup(2058660585);
                                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                                    TextKt.m10025TextIbK3jfQ(casesText6.getDialogConfirmationOneText(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, TypographyStyle.INSTANCE.m14843montserratMediumCustomSpbl3sdaw(R.dimen._16wsp, 0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composer5, 196614, 26), composer5, 0, 0, 131070);
                                    composer5.endReplaceableGroup();
                                    composer5.endNode();
                                    composer5.endReplaceableGroup();
                                    composer5.endReplaceableGroup();
                                    composer5.endReplaceableGroup();
                                    Unit unit9 = Unit.INSTANCE;
                                } else if (dialogConfirmationContextType2 == 5 || dialogConfirmationContextType2 == 6) {
                                    composer5.startReplaceableGroup(-758718060);
                                    Modifier.Companion companion10 = Modifier.INSTANCE;
                                    Modifier modifierM8126paddingqDBjuR04 = PaddingKt.m8126paddingqDBjuR0(SizeKt.fillMaxWidth$default(companion10, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer5, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer5, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer5, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._50wdp, composer5, 6));
                                    Alignment.Companion companion11 = Alignment.INSTANCE;
                                    Alignment.Horizontal centerHorizontally4 = companion11.getCenterHorizontally();
                                    CasesText casesText7 = casesText3;
                                    composer5.startReplaceableGroup(-483455358);
                                    Arrangement arrangement3 = Arrangement.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), centerHorizontally4, composer5, 48);
                                    composer5.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                    CompositionLocalMap currentCompositionLocalMap6 = composer5.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor6 = companion12.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierM8126paddingqDBjuR04);
                                    if (!(composer5.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer5.startReusableNode();
                                    if (composer5.getInserting()) {
                                        composer5.createNode(constructor6);
                                    } else {
                                        composer5.useNode();
                                    }
                                    Composer composerM10870constructorimpl6 = Updater.m10870constructorimpl(composer5);
                                    Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyColumnMeasurePolicy4, companion12.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap6, companion12.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion12.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                        composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                        composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                                    }
                                    function3ModifierMaterializerOf6.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer5)), composer5, 0);
                                    composer5.startReplaceableGroup(2058660585);
                                    ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                                    AnnotatedString dialogConfirmationOneText3 = casesText7.getDialogConfirmationOneText();
                                    TypographyStyle typographyStyle3 = TypographyStyle.INSTANCE;
                                    TextAlign.Companion companion13 = TextAlign.INSTANCE;
                                    TextKt.m10025TextIbK3jfQ(dialogConfirmationOneText3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle3.m14843montserratMediumCustomSpbl3sdaw(R.dimen._16wsp, 0L, companion13.m13558getCentere0LSkKk(), 0L, 0.0f, composer5, 196614, 26), composer5, 0, 0, 131070);
                                    Modifier modifierM8127paddingqDBjuR0$default2 = PaddingKt.m8127paddingqDBjuR0$default(companion10, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer5, 6), 0.0f, 0.0f, 13, null);
                                    Alignment.Vertical centerVertically = companion11.getCenterVertically();
                                    composer5.startReplaceableGroup(693286680);
                                    MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement3.getStart(), centerVertically, composer5, 48);
                                    composer5.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                    CompositionLocalMap currentCompositionLocalMap7 = composer5.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor7 = companion12.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default2);
                                    if (!(composer5.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer5.startReusableNode();
                                    if (composer5.getInserting()) {
                                        composer5.createNode(constructor7);
                                    } else {
                                        composer5.useNode();
                                    }
                                    Composer composerM10870constructorimpl7 = Updater.m10870constructorimpl(composer5);
                                    Updater.m10877setimpl(composerM10870constructorimpl7, measurePolicyRowMeasurePolicy3, companion12.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl7, currentCompositionLocalMap7, companion12.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = companion12.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                                        composerM10870constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                                        composerM10870constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                                    }
                                    function3ModifierMaterializerOf7.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer5)), composer5, 0);
                                    composer5.startReplaceableGroup(2058660585);
                                    RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                                    TextKt.m10025TextIbK3jfQ(casesText7.getDialogConfirmationTwoText(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle3.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._13wsp, 0L, companion13.m13558getCentere0LSkKk(), 0L, 0.0f, null, composer5, 1572870, 58), composer5, 0, 0, 131070);
                                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_dust, composer5, 6), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer5, 56, 124);
                                    composer5.endReplaceableGroup();
                                    composer5.endNode();
                                    composer5.endReplaceableGroup();
                                    composer5.endReplaceableGroup();
                                    composer5.endReplaceableGroup();
                                    composer5.endNode();
                                    composer5.endReplaceableGroup();
                                    composer5.endReplaceableGroup();
                                    composer5.endReplaceableGroup();
                                    Unit unit10 = Unit.INSTANCE;
                                } else {
                                    composer5.startReplaceableGroup(-758716245);
                                    composer5.endReplaceableGroup();
                                    Unit unit11 = Unit.INSTANCE;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer5.skipToGroupEnd();
                        }
                    }), composer4, 48, 805306368, 122617);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composer2, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CasesGuiKt.CasesGui.27
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) throws FileNotFoundException {
                    invoke(composer4, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer4, int i2) throws FileNotFoundException {
                    CasesGuiKt.CasesGui(composer4, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* compiled from: CasesGui.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.cases.CasesGuiKt$CasesGui$1", m7120f = "CasesGui.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.cases.CasesGuiKt$CasesGui$1 */
    public static final class C51141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ MutableState<Boolean> $stateOfCheckbox;
        public final /* synthetic */ CasesViewModel $viewModel;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C51141(CasesViewModel casesViewModel, MutableState<Boolean> mutableState, Continuation<? super C51141> continuation) {
            super(2, continuation);
            this.$viewModel = casesViewModel;
            this.$stateOfCheckbox = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C51141(this.$viewModel, this.$stateOfCheckbox, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C51141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$viewModel.updateAnimationState(!this.$stateOfCheckbox.getValue().booleanValue());
            return Unit.INSTANCE;
        }
    }

    public static final float CasesGui$lambda$2(State<Float> state) {
        return state.getValue().floatValue();
    }
}
