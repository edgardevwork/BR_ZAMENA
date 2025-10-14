package com.blackhub.bronline.game.p019ui.craft;

import android.graphics.Bitmap;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
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
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
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
import androidx.media3.extractor.MpegAudioUtil;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.core.utils.attachment.main.CommonButtonCategory;
import com.blackhub.bronline.game.gui.craft.CraftUiState;
import com.blackhub.bronline.game.gui.craft.CraftViewModel;
import com.blackhub.bronline.game.gui.craft.enums.CraftElementStatusEnum;
import com.blackhub.bronline.game.gui.craft.enums.CraftScreenTypeEnum;
import com.blackhub.bronline.game.gui.craft.model.CraftElement;
import com.blackhub.bronline.game.gui.craft.model.CraftIngredient;
import com.blackhub.bronline.game.gui.craft.model.CraftItemTextBlock;
import com.blackhub.bronline.game.gui.craft.model.response.CraftCategoryFilter;
import com.blackhub.bronline.game.gui.craft.model.response.CraftItemCategoryFilter;
import com.blackhub.bronline.game.p019ui.widget.dialog.DialogCustomBlockKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* compiled from: CraftGui.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m7105d2 = {"CraftGui", "", "(Landroidx/compose/runtime/Composer;I)V", "PreviewCraftGuiContent", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCraftGui.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftGui.kt\ncom/blackhub/bronline/game/ui/craft/CraftGuiKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n*L\n1#1,736:1\n81#2,11:737\n*S KotlinDebug\n*F\n+ 1 CraftGui.kt\ncom/blackhub/bronline/game/ui/craft/CraftGuiKt\n*L\n36#1:737,11\n*E\n"})
/* loaded from: classes2.dex */
public final class CraftGuiKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CraftGui(@Nullable Composer composer, final int i) {
        CreationExtras defaultViewModelCreationExtras;
        CraftUiState craftUiState;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-336884390);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-336884390, i, -1, "com.blackhub.bronline.game.ui.craft.CraftGui (CraftGui.kt:34)");
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
            ViewModel viewModel = ViewModelKt.viewModel(CraftViewModel.class, current, null, null, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            final CraftViewModel craftViewModel = (CraftViewModel) viewModel;
            final CraftUiState craftUiState2 = (CraftUiState) FlowExtKt.collectAsStateWithLifecycle(craftViewModel.getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 8, 7).getValue();
            CraftScreenTypeEnum currentScreen = craftUiState2.getCurrentScreen();
            Bitmap backgroundImage = craftUiState2.getBackgroundImage();
            Bitmap titleIcon = craftUiState2.getCraftScreenTypeObject().getTitleIcon();
            String titleText = craftUiState2.getCraftScreenTypeObject().getTitleText();
            String craftIconAlarmText = craftUiState2.getCraftIconAlarmText();
            String stashIconAlarmText = craftUiState2.getStashIconAlarmText();
            String progressIconAlarmText = craftUiState2.getProgressIconAlarmText();
            boolean zIsButtonsExpanded = craftUiState2.getButtonAnimatedAttachment().isButtonsExpanded();
            boolean zIsWithIndicationCraft = craftUiState2.getButtonAnimatedAttachment().isWithIndicationCraft();
            boolean zIsWithIndicationStash = craftUiState2.getButtonAnimatedAttachment().isWithIndicationStash();
            boolean zIsWithIndicationFilter = craftUiState2.isWithIndicationFilter();
            boolean zIsNeedToShowFilter = craftUiState2.isNeedToShowFilter();
            boolean zIsNeedToShowHints = craftUiState2.isNeedToShowHints();
            boolean zIsNeedToShowFilterButton = craftUiState2.isNeedToShowFilterButton();
            boolean zIsNeedToShowSplit = craftUiState2.isNeedToShowSplit();
            int topColorFilterButton = craftUiState2.getTopColorFilterButton();
            int bottomColorFilterButton = craftUiState2.getBottomColorFilterButton();
            int iconColorFilterButton = craftUiState2.getIconColorFilterButton();
            int dividerColor = craftUiState2.getDividerColor();
            List<CommonButtonCategory> categories = craftUiState2.getCategories();
            CraftElement selectedElement = craftUiState2.getSelectedElement();
            boolean zIsPlayerHasVip = craftUiState2.isPlayerHasVip();
            List<CraftElement> allElementsForCraftAfterFilter = craftUiState2.getAllElementsForCraftAfterFilter();
            List<CraftCategoryFilter> filterList = craftUiState2.getFilterList();
            int typeOfBlock = craftUiState2.getCraftingControlInfo().getTypeOfBlock();
            int selectedValueOfItem = craftUiState2.getCraftingControlInfo().getSelectedValueOfItem();
            int maxValueOfItems = craftUiState2.getCraftingControlInfo().getMaxValueOfItems();
            String selectedWeightStrValue = craftUiState2.getCraftingControlInfo().getSelectedWeightStrValue();
            String craftingCost = craftUiState2.getCraftingControlInfo().getCraftingCost();
            int timeUntilItemWillBePrepared = craftUiState2.getCraftingControlInfo().getTimeUntilItemWillBePrepared();
            boolean zIsEnabledMinus = craftUiState2.getCraftingControlInfo().isEnabledMinus();
            boolean zIsEnabledPlus = craftUiState2.getCraftingControlInfo().isEnabledPlus();
            boolean zIsLowLevel = craftUiState2.getCraftingControlInfo().isLowLevel();
            int textMoneyColor = craftUiState2.getCraftingControlInfo().getTextMoneyColor();
            int textSelectedValueOfItemColor = craftUiState2.getCraftingControlInfo().getTextSelectedValueOfItemColor();
            float buttonAlpha = craftUiState2.getCraftingControlInfo().getButtonAlpha();
            float textCurrentValueOfItems = craftUiState2.getCraftingControlInfo().getTextCurrentValueOfItems();
            int textForEmptyList = craftUiState2.getTextForEmptyList();
            CraftMainUiKt.CraftMainUi(currentScreen, backgroundImage, titleIcon, titleText, craftIconAlarmText, stashIconAlarmText, progressIconAlarmText, zIsButtonsExpanded, zIsWithIndicationCraft, zIsWithIndicationStash, zIsWithIndicationFilter, zIsNeedToShowFilter, zIsNeedToShowHints, zIsNeedToShowFilterButton, zIsNeedToShowSplit, topColorFilterButton, bottomColorFilterButton, iconColorFilterButton, categories, selectedElement, zIsPlayerHasVip, dividerColor, allElementsForCraftAfterFilter, filterList, typeOfBlock, selectedValueOfItem, maxValueOfItems, selectedWeightStrValue, craftingCost, timeUntilItemWillBePrepared, zIsEnabledMinus, zIsEnabledPlus, zIsLowLevel, textMoneyColor, textSelectedValueOfItemColor, buttonAlpha, textCurrentValueOfItems, craftUiState2.getLevelOfSkill(), craftUiState2.getPercentOfSkill(), craftUiState2.getQuantityInStorage(), craftUiState2.getStorageMax(), craftUiState2.getQuantityInQueue(), craftUiState2.getQueueMax(), craftUiState2.getProdProgressBarThumbColor(), craftUiState2.getStashProgressBarThumbColor(), craftUiState2.isQueueFilled(), craftUiState2.isStorageFilled(), craftUiState2.getButtonWithLineText(), textForEmptyList, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.CraftGui.1
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
                    craftViewModel.onCloseHintsClick();
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.CraftGui.2
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
                    craftViewModel.onArrowBottomClick();
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.CraftGui.3
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
                    craftViewModel.onArrowTopClick();
                }
            }, new Function2<CommonButtonCategory, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.CraftGui.4
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(CommonButtonCategory commonButtonCategory, Integer num) {
                    invoke(commonButtonCategory, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull CommonButtonCategory category, int i2) {
                    Intrinsics.checkNotNullParameter(category, "category");
                    craftViewModel.onCategoryClick(category, i2);
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.CraftGui.5
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
                    CraftViewModel.onButtonCraftClick$default(craftViewModel, false, 1, null);
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.CraftGui.6
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
                    craftViewModel.onButtonStashClick();
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.CraftGui.7
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
                    craftViewModel.onButtonProgressClick();
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.CraftGui.8
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
                    craftViewModel.onInfoButtonClicked();
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.CraftGui.9
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
                    craftViewModel.showOrHideFilter();
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.CraftGui.10
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
                    craftViewModel.sendCloseScreen();
                }
            }, new Function1<CraftElement, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.CraftGui.11
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CraftElement craftElement) throws JSONException {
                    invoke2(craftElement);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CraftElement element) throws JSONException {
                    Intrinsics.checkNotNullParameter(element, "element");
                    craftViewModel.selectCraftElement(element);
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.CraftGui.12
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
                    craftViewModel.getOrAddElementForStorage();
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.CraftGui.13
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
                    craftViewModel.refreshFilter();
                }
            }, new Function1<CraftItemCategoryFilter, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.CraftGui.14
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CraftItemCategoryFilter craftItemCategoryFilter) {
                    invoke2(craftItemCategoryFilter);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CraftItemCategoryFilter checkBox) {
                    Intrinsics.checkNotNullParameter(checkBox, "checkBox");
                    craftViewModel.checkFilter(checkBox);
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.CraftGui.15
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
                    craftViewModel.subtractItemForCrafting();
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.CraftGui.16
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
                    craftViewModel.addItemForCrafting();
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.CraftGui.17
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
                    craftViewModel.onActionCraftingClick();
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.CraftGui.18
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
                    craftViewModel.showSplit(true);
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.CraftGui.19
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
                    craftViewModel.showSplit(false);
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.CraftGui.20
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
                    craftViewModel.onBuyVipClick();
                }
            }, new Function1<CraftElement, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.CraftGui.21
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CraftElement craftElement) {
                    invoke2(craftElement);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CraftElement element) {
                    Intrinsics.checkNotNullParameter(element, "element");
                    craftViewModel.deleteElementFromStash(element);
                }
            }, composerStartRestartGroup, MpegAudioUtil.SAMPLES_PER_FRAME_L3_V2, 1207959552, 4608, 0, 0, 0, 0);
            composerStartRestartGroup.startReplaceableGroup(-655742288);
            if (craftUiState2.isNeedToShowLevelUpDialog()) {
                CraftLevelUpDialogKt.CraftLevelUpDialog(craftUiState2.getLevelOfSkill(), craftUiState2.getListOfLevelUpElements(), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.CraftGui.22
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
                        craftViewModel.onCloseLevelUpDialog();
                    }
                }, composerStartRestartGroup, 64);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-655742004);
            if (craftUiState2.isNeedToShowDialogConfirmation()) {
                String upperCase = StringResources_androidKt.stringResource(R.string.common_confirmation, composerStartRestartGroup, 6).toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                composer2 = composerStartRestartGroup;
                craftUiState = craftUiState2;
                DialogCustomBlockKt.m15083DialogCustomBlockkoCIM3s(null, 0, upperCase, null, 0L, 0.0f, null, false, null, null, null, 0L, 0L, 1.0f, 0.0f, null, null, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.CraftGui.23
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
                        craftViewModel.onDialogConfirmationClick();
                    }
                }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.CraftGui.24
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
                        craftViewModel.onCloseDialogConfirmationClick();
                    }
                }, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1063159979, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.CraftGui.25
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
                    public final void invoke(@Nullable Composer composer3, int i2) {
                        if ((i2 & 11) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1063159979, i2, -1, "com.blackhub.bronline.game.ui.craft.CraftGui.<anonymous> (CraftGui.kt:138)");
                            }
                            Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer3, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer3, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer3, 6), 2, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._154wdp, composer3, 6));
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            CraftUiState craftUiState3 = craftUiState2;
                            composer3.startReplaceableGroup(-483455358);
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer3, 54);
                            composer3.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs);
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer3);
                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            TextKt.m10024Text4IGK_g(craftUiState3.getDialogConfirmationAttachment().getBodyText(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m13551boximpl(TextAlign.INSTANCE.m13558getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14848montserratRegularCustomSpbl3sdaw(R.dimen._16wsp, 0L, 0, 0L, 0.0f, composer3, 196614, 30), composer3, 0, 0, 65022);
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }), composer2, 0, 805309440, 122875);
            } else {
                craftUiState = craftUiState2;
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceableGroup();
            if (craftUiState.isNeedToShowForcedTutorial()) {
                CraftForcedTutorialKt.CraftForcedTutorial(craftUiState.getForcedTutorialAttachment(), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.CraftGui.26
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
                        craftViewModel.closeForcedTutorial();
                    }
                }, composer2, 8);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.CraftGui.27
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i2) {
                    CraftGuiKt.CraftGui(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewCraftGuiContent(Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-728081057);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-728081057, i, -1, "com.blackhub.bronline.game.ui.craft.PreviewCraftGuiContent (CraftGui.kt:169)");
            }
            CraftScreenTypeEnum craftScreenTypeEnum = CraftScreenTypeEnum.CRAFT;
            String strStringResource = StringResources_androidKt.stringResource(R.string.common_accessories, composerStartRestartGroup, 6);
            List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new CommonButtonCategory[]{new CommonButtonCategory(0, null, null, false, false, null, null, 127, null), new CommonButtonCategory(0, null, null, false, false, null, null, 127, null), new CommonButtonCategory(0, null, null, false, false, null, null, 127, null), new CommonButtonCategory(0, null, null, false, true, null, null, 111, null)});
            CraftItemTextBlock craftItemTextBlock = new CraftItemTextBlock("Крутая маска", "99 ч 39 мин 44 сек", 25, 0, 9.99f, "description", 8, null);
            CraftElementStatusEnum craftElementStatusEnum = CraftElementStatusEnum.IN_THE_QUEUE;
            CommonRarityEnum commonRarityEnum = CommonRarityEnum.EPIC;
            CommonRarityEnum commonRarityEnum2 = CommonRarityEnum.COMMON;
            CraftIngredient craftIngredient = new CraftIngredient(0, commonRarityEnum2, "Саморезы саморезы", "В него можно обернуть все\nчто угодно, от коробок до\nтрупов", null, 0, 0, 10, 10, false, false, 1649, null);
            CommonRarityEnum commonRarityEnum3 = CommonRarityEnum.UNCOMMON;
            CraftIngredient craftIngredient2 = new CraftIngredient(0, commonRarityEnum3, "Саморезы саморезы", "В него можно обернуть все\nчто угодно, от коробок до\nтрупов", null, 0, 0, 10, 10, false, false, 1649, null);
            CommonRarityEnum commonRarityEnum4 = CommonRarityEnum.LEGENDARY;
            CraftElement craftElement = new CraftElement(0, 0, null, 0, 0, 0, null, commonRarityEnum, craftElementStatusEnum, 0, craftItemTextBlock, CollectionsKt__CollectionsKt.listOf((Object[]) new CraftIngredient[]{craftIngredient, craftIngredient2, new CraftIngredient(0, commonRarityEnum4, "Саморезы саморезы", "В него можно обернуть все\nчто угодно, от коробок до\nтрупов", null, 0, 0, 10, 10, true, false, 1137, null), new CraftIngredient(0, commonRarityEnum, "Саморезы саморезы", "В него можно обернуть все\nчто угодно, от коробок до\nтрупов", null, 0, 0, 10, 10, false, false, 1649, null), new CraftIngredient(0, commonRarityEnum, "Саморезы саморезы", "В него можно обернуть все\nчто угодно, от коробок до\nтрупов", null, 0, 0, 0, 0, false, false, 2033, null), new CraftIngredient(0, commonRarityEnum2, "Саморезы саморезы", "В него можно обернуть все\nчто угодно, от коробок до\nтрупов", null, 0, 0, 0, 0, false, false, 2033, null)}), 0, null, 0, 0, 62079, null);
            CraftItemTextBlock craftItemTextBlock2 = new CraftItemTextBlock("Крутая маска", "99 ч 39 мин 44 сек", 25, 0, 9.99f, "description", 8, null);
            CraftElementStatusEnum craftElementStatusEnum2 = CraftElementStatusEnum.NEW_ELEMENT;
            CraftElement craftElement2 = new CraftElement(0, 0, null, 0, 0, 0, null, commonRarityEnum4, craftElementStatusEnum2, 0, craftItemTextBlock2, CollectionsKt__CollectionsKt.listOf((Object[]) new CraftIngredient[]{new CraftIngredient(0, commonRarityEnum2, "Саморезы саморезы", "В него можно обернуть все\nчто угодно, от коробок до\nтрупов", null, 0, 0, 10, 10, false, false, 1649, null), new CraftIngredient(0, commonRarityEnum3, "Саморезы саморезы", "В него можно обернуть все\nчто угодно, от коробок до\nтрупов", null, 0, 0, 10, 10, false, false, 1649, null), new CraftIngredient(0, commonRarityEnum4, "Саморезы саморезы", "В него можно обернуть все\nчто угодно, от коробок до\nтрупов", null, 0, 0, 10, 10, true, false, 1137, null), new CraftIngredient(0, commonRarityEnum, "Саморезы саморезы", "В него можно обернуть все\nчто угодно, от коробок до\nтрупов", null, 0, 0, 10, 10, false, false, 1649, null), new CraftIngredient(0, commonRarityEnum, "Саморезы саморезы", "В него можно обернуть все\nчто угодно, от коробок до\nтрупов", null, 0, 0, 0, 0, false, false, 2033, null), new CraftIngredient(0, commonRarityEnum2, "Саморезы саморезы", "В него можно обернуть все\nчто угодно, от коробок до\nтрупов", null, 0, 0, 0, 0, false, false, 2033, null)}), 0, 1718874198L, 0, 0, 53887, null);
            CraftItemTextBlock craftItemTextBlock3 = new CraftItemTextBlock("Крутая маска", "99 ч 39 мин 44 сек", 25, 0, 9.99f, "description", 8, null);
            CommonRarityEnum commonRarityEnum5 = CommonRarityEnum.RARE;
            composer2 = composerStartRestartGroup;
            CraftMainUiKt.CraftMainUi(craftScreenTypeEnum, null, null, strStringResource, "12", "12", "12", true, false, false, false, false, false, true, false, R.color.white, R.color.white, R.color.black, listListOf, craftElement, true, R.color.white_40, CollectionsKt__CollectionsKt.listOf((Object[]) new CraftElement[]{craftElement2, new CraftElement(0, 0, null, 0, 0, 0, null, commonRarityEnum5, craftElementStatusEnum2, 0, craftItemTextBlock3, CollectionsKt__CollectionsKt.listOf((Object[]) new CraftIngredient[]{new CraftIngredient(0, commonRarityEnum2, "Саморезы саморезы", "В него можно обернуть все\nчто угодно, от коробок до\nтрупов", null, 0, 0, 10, 10, false, false, 1649, null), new CraftIngredient(0, commonRarityEnum3, "Саморезы саморезы", "В него можно обернуть все\nчто угодно, от коробок до\nтрупов", null, 0, 0, 10, 10, false, false, 1649, null), new CraftIngredient(0, commonRarityEnum4, "Саморезы саморезы", "В него можно обернуть все\nчто угодно, от коробок до\nтрупов", null, 0, 0, 10, 10, true, false, 1137, null), new CraftIngredient(0, commonRarityEnum, "Саморезы саморезы", "В него можно обернуть все\nчто угодно, от коробок до\nтрупов", null, 0, 0, 10, 10, false, false, 1649, null), new CraftIngredient(0, commonRarityEnum, "Саморезы саморезы", "В него можно обернуть все\nчто угодно, от коробок до\nтрупов", null, 0, 0, 0, 0, false, false, 2033, null), new CraftIngredient(0, commonRarityEnum2, "Саморезы саморезы", "В него можно обернуть все\nчто угодно, от коробок до\nтрупов", null, 0, 0, 0, 0, false, false, 2033, null)}), 0, null, 0, 0, 62079, null), new CraftElement(0, 0, null, 0, 0, 0, null, commonRarityEnum, craftElementStatusEnum, 0, new CraftItemTextBlock("Крутая маска", "99 ч 39 мин 44 сек", 25, 0, 9.99f, "description", 8, null), CollectionsKt__CollectionsKt.listOf((Object[]) new CraftIngredient[]{new CraftIngredient(0, commonRarityEnum2, "Саморезы саморезы", "В него можно обернуть все\nчто угодно, от коробок до\nтрупов", null, 0, 0, 10, 10, false, false, 1649, null), new CraftIngredient(0, commonRarityEnum3, "Саморезы саморезы", "В него можно обернуть все\nчто угодно, от коробок до\nтрупов", null, 0, 0, 10, 10, false, false, 1649, null), new CraftIngredient(0, commonRarityEnum4, "Саморезы саморезы", "В него можно обернуть все\nчто угодно, от коробок до\nтрупов", null, 0, 0, 10, 10, true, false, 1137, null), new CraftIngredient(0, commonRarityEnum, "Саморезы саморезы", "В него можно обернуть все\nчто угодно, от коробок до\nтрупов", null, 0, 0, 10, 10, false, false, 1649, null), new CraftIngredient(0, commonRarityEnum, "Саморезы саморезы", "В него можно обернуть все\nчто угодно, от коробок до\nтрупов", null, 0, 0, 0, 0, false, false, 2033, null), new CraftIngredient(0, commonRarityEnum2, "Саморезы саморезы", "В него можно обернуть все\nчто угодно, от коробок до\nтрупов", null, 0, 0, 0, 0, false, false, 2033, null)}), 0, null, 0, 0, 62079, null), new CraftElement(0, 0, null, 0, 0, 0, null, commonRarityEnum3, CraftElementStatusEnum.IN_THE_PIPELINE, 0, new CraftItemTextBlock("Крутая маска", "99 ч 39 мин 44 сек", 25, 0, 9.99f, "description", 8, null), CollectionsKt__CollectionsKt.listOf((Object[]) new CraftIngredient[]{new CraftIngredient(0, commonRarityEnum2, "Саморезы саморезы", "В него можно обернуть все\nчто угодно, от коробок до\nтрупов", null, 0, 0, 10, 10, false, false, 1649, null), new CraftIngredient(0, commonRarityEnum3, "Саморезы саморезы", "В него можно обернуть все\nчто угодно, от коробок до\nтрупов", null, 0, 0, 10, 10, false, false, 1649, null), new CraftIngredient(0, commonRarityEnum4, "Саморезы саморезы", "В него можно обернуть все\nчто угодно, от коробок до\nтрупов", null, 0, 0, 10, 10, true, false, 1137, null), new CraftIngredient(0, commonRarityEnum, "Саморезы саморезы", "В него можно обернуть все\nчто угодно, от коробок до\nтрупов", null, 0, 0, 10, 10, false, false, 1649, null), new CraftIngredient(0, commonRarityEnum, "Саморезы саморезы", "В него можно обернуть все\nчто угодно, от коробок до\nтрупов", null, 0, 0, 0, 0, false, false, 2033, null), new CraftIngredient(0, commonRarityEnum2, "Саморезы саморезы", "В него можно обернуть все\nчто угодно, от коробок до\nтрупов", null, 0, 0, 0, 0, false, false, 2033, null)}), 0, null, 0, 0, 62079, null), new CraftElement(0, 0, null, 0, 0, 0, null, commonRarityEnum2, CraftElementStatusEnum.UNAVAILABLE, 0, new CraftItemTextBlock("Крутая маска", "99 ч 39 мин 44 сек", 25, 0, 9.99f, "description", 8, null), null, 0, null, 0, 0, 64127, null), new CraftElement(0, 0, null, 0, 0, 0, null, commonRarityEnum5, CraftElementStatusEnum.DEFAULT, 0, new CraftItemTextBlock("Крутая маска", "99 ч 39 мин 44 сек", 25, 0, 9.99f, "description", 8, null), null, 0, null, 0, 0, 64127, null), new CraftElement(0, 0, null, 0, 0, 0, null, commonRarityEnum, craftElementStatusEnum, 0, new CraftItemTextBlock("Крутая маска", "99 ч 39 мин 44 сек", 25, 0, 9.99f, "description", 8, null), null, 0, null, 0, 0, 64127, null), new CraftElement(0, 0, null, 0, 0, 0, null, commonRarityEnum3, craftElementStatusEnum, 0, new CraftItemTextBlock("Крутая маска", "99 ч 39 мин 44 сек", 25, 0, 9.99f, "description", 8, null), null, 0, null, 0, 0, 64127, null), new CraftElement(0, 0, null, 0, 0, 0, null, commonRarityEnum2, craftElementStatusEnum, 0, new CraftItemTextBlock("Крутая маска", "99 ч 39 мин 44 сек", 25, 0, 9.99f, "description", 8, null), null, 0, null, 0, 0, 64127, null)}), CollectionsKt__CollectionsKt.listOf((Object[]) new CraftCategoryFilter[]{new CraftCategoryFilter(1, "Редкость", CollectionsKt__CollectionsKt.listOf((Object[]) new CraftItemCategoryFilter[]{new CraftItemCategoryFilter(1, "Обычные", ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 1, "", R.dimen._1wdp, false, null, 128, null), new CraftItemCategoryFilter(2, "Необычные", ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 1, "", R.dimen._1wdp, false, null, 128, null), new CraftItemCategoryFilter(3, "Редкие", ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 1, "", R.dimen._1wdp, false, null, 128, null), new CraftItemCategoryFilter(4, "Эпические", ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 1, "", R.dimen._1wdp, false, null, 128, null), new CraftItemCategoryFilter(5, "Легендарные", ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 1, "", R.dimen._1wdp, false, null, 128, null)})), new CraftCategoryFilter(2, "Ресурсы", CollectionsKt__CollectionsKt.listOf((Object[]) new CraftItemCategoryFilter[]{new CraftItemCategoryFilter(6, "Есть ресурсы", ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 2, "", R.dimen._50wdp, false, null, 128, null), new CraftItemCategoryFilter(7, "Нет ресурсов", ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 2, "", R.dimen._50wdp, false, null, 128, null)})), new CraftCategoryFilter(3, "Доступность", CollectionsKt__CollectionsKt.listOf((Object[]) new CraftItemCategoryFilter[]{new CraftItemCategoryFilter(8, "Открыто", ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 3, "", R.dimen._1wdp, false, null, 128, null), new CraftItemCategoryFilter(9, "Закрыто", ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 3, "", R.dimen._1wdp, false, null, 128, null)}))}), 4, 4, 10, "99", "99 999 999", 0, true, true, false, R.color.rose_red, R.color.rose_red, 1.0f, 1.0f, 1, 60, 8, 20, 2, 7, R.color.dark_medium_green, R.color.dark_medium_green, false, true, "Получить все", R.string.craft_no_items_in_storage, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.PreviewCraftGuiContent.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.PreviewCraftGuiContent.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.PreviewCraftGuiContent.3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function2<CommonButtonCategory, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.PreviewCraftGuiContent.4
                public final void invoke(@NotNull CommonButtonCategory commonButtonCategory, int i2) {
                    Intrinsics.checkNotNullParameter(commonButtonCategory, "<anonymous parameter 0>");
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(CommonButtonCategory commonButtonCategory, Integer num) {
                    invoke(commonButtonCategory, num.intValue());
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.PreviewCraftGuiContent.5
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.PreviewCraftGuiContent.6
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.PreviewCraftGuiContent.7
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.PreviewCraftGuiContent.8
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.PreviewCraftGuiContent.9
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.PreviewCraftGuiContent.10
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function1<CraftElement, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.PreviewCraftGuiContent.11
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CraftElement it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CraftElement craftElement3) {
                    invoke2(craftElement3);
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.PreviewCraftGuiContent.12
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.PreviewCraftGuiContent.13
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function1<CraftItemCategoryFilter, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.PreviewCraftGuiContent.14
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CraftItemCategoryFilter it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CraftItemCategoryFilter craftItemCategoryFilter) {
                    invoke2(craftItemCategoryFilter);
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.PreviewCraftGuiContent.15
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.PreviewCraftGuiContent.16
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.PreviewCraftGuiContent.17
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.PreviewCraftGuiContent.18
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.PreviewCraftGuiContent.19
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.PreviewCraftGuiContent.20
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function1<CraftElement, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.PreviewCraftGuiContent.21
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CraftElement it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CraftElement craftElement3) {
                    invoke2(craftElement3);
                    return Unit.INSTANCE;
                }
            }, composer2, 920347062, 1222340022, 920351286, 920350134, 920350134, 920350134, 920350134);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftGuiKt.PreviewCraftGuiContent.22
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i2) {
                    CraftGuiKt.PreviewCraftGuiContent(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
