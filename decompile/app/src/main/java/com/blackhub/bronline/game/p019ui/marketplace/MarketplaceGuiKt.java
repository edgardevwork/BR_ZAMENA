package com.blackhub.bronline.game.p019ui.marketplace;

import android.graphics.Bitmap;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.style.TextAlign;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.extractor.MpegAudioUtil;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.gui.craft.model.response.CraftItemCategoryFilter;
import com.blackhub.bronline.game.gui.marketplace.MarketplaceUiState;
import com.blackhub.bronline.game.gui.marketplace.MarketplaceViewModel;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceBottomSheetInfo;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceProduct;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceProfileInfo;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceSortFilter;
import com.blackhub.bronline.game.p019ui.widget.dialog.DialogCustomBlockKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MarketplaceGui.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m7105d2 = {"MarketplaceGui", "", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nMarketplaceGui.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceGui.kt\ncom/blackhub/bronline/game/ui/marketplace/MarketplaceGuiKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n*L\n1#1,161:1\n81#2,11:162\n*S KotlinDebug\n*F\n+ 1 MarketplaceGui.kt\ncom/blackhub/bronline/game/ui/marketplace/MarketplaceGuiKt\n*L\n25#1:162,11\n*E\n"})
/* loaded from: classes3.dex */
public final class MarketplaceGuiKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void MarketplaceGui(@Nullable Composer composer, final int i) {
        CreationExtras defaultViewModelCreationExtras;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(779462053);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(779462053, i, -1, "com.blackhub.bronline.game.ui.marketplace.MarketplaceGui (MarketplaceGui.kt:23)");
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
            ViewModel viewModel = ViewModelKt.viewModel(MarketplaceViewModel.class, current, null, null, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            final MarketplaceViewModel marketplaceViewModel = (MarketplaceViewModel) viewModel;
            final MarketplaceUiState marketplaceUiState = (MarketplaceUiState) SnapshotStateKt.collectAsState(marketplaceViewModel.getUiState(), null, composerStartRestartGroup, 8, 1).getValue();
            MarketplaceProfileInfo profileInfo = marketplaceUiState.getProfileInfo();
            MarketplaceBottomSheetInfo bottomSheetInfo = marketplaceUiState.getBottomSheetInfo();
            String moneyText = marketplaceUiState.getMoneyText();
            Bitmap bgMarketplace = marketplaceUiState.getBgMarketplace();
            List<MarketplaceProduct> products = marketplaceUiState.getProducts();
            MarketplaceProduct selectedProduct = marketplaceUiState.getSelectedProduct();
            int currentPage = marketplaceUiState.getCurrentPage();
            List<Integer> pagesToShow = marketplaceUiState.getPagesToShow();
            boolean zIsHasPlatinumVip = marketplaceUiState.isHasPlatinumVip();
            boolean zIsHintsOpened = marketplaceUiState.isHintsOpened();
            boolean zIsNeedToShowEmptyListLabel = marketplaceUiState.isNeedToShowEmptyListLabel();
            boolean zIsScrollBarVisible = marketplaceUiState.isScrollBarVisible();
            boolean zIsBottomSheetBlockVisible = marketplaceUiState.isBottomSheetBlockVisible();
            boolean zIsNeedToShowFilter = marketplaceUiState.isNeedToShowFilter();
            boolean zIsWithIndicationFilter = marketplaceUiState.isWithIndicationFilter();
            int filterColor = marketplaceUiState.getFilterColor();
            MarketplaceSortFilter currentSortFilter = marketplaceUiState.getCurrentSortFilter();
            int hintsMargin = marketplaceUiState.getHintsMargin();
            MarketplaceMainUiKt.MarketplaceMainUi(profileInfo, bottomSheetInfo, moneyText, currentSortFilter, bgMarketplace, products, selectedProduct, marketplaceUiState.getFilterList(), currentPage, pagesToShow, zIsHasPlatinumVip, zIsNeedToShowFilter, zIsNeedToShowEmptyListLabel, zIsHintsOpened, zIsWithIndicationFilter, zIsBottomSheetBlockVisible, zIsScrollBarVisible, marketplaceUiState.getFilterColorList(), marketplaceUiState.getPriceColorList(), filterColor, hintsMargin, marketplaceUiState.getSelectedTab(), marketplaceUiState.getTabs(), new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceGuiKt.MarketplaceGui.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String text) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    marketplaceViewModel.onClickDoneInPriceTextField(text);
                }
            }, new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceGuiKt.MarketplaceGui.2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String text) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    marketplaceViewModel.onClickDoneInCountTextField(text);
                }
            }, new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceGuiKt.MarketplaceGui.3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String text) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    marketplaceViewModel.onClickConfirmSearch(text);
                }
            }, new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceGuiKt.MarketplaceGui.4
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String text) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    marketplaceViewModel.onClickSetPrice(text);
                }
            }, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceGuiKt.MarketplaceGui.5
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i2) {
                    marketplaceViewModel.onClickToPage(i2);
                }
            }, new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceGuiKt.MarketplaceGui.6
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String text) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    marketplaceViewModel.onClickSetForceCount(text);
                }
            }, new Function1<MarketplaceProduct, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceGuiKt.MarketplaceGui.7
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(MarketplaceProduct marketplaceProduct) {
                    invoke2(marketplaceProduct);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull MarketplaceProduct product) {
                    Intrinsics.checkNotNullParameter(product, "product");
                    marketplaceViewModel.onClickLike(product);
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceGuiKt.MarketplaceGui.8
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
                    marketplaceViewModel.onClickMinusButton();
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceGuiKt.MarketplaceGui.9
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
                    marketplaceViewModel.onClickPlusButton();
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceGuiKt.MarketplaceGui.10
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
                    marketplaceViewModel.onClickWithdrawFromSale();
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceGuiKt.MarketplaceGui.11
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
                    marketplaceViewModel.onClickGreenButtonInBottomSheet();
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceGuiKt.MarketplaceGui.12
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
                    marketplaceViewModel.onClickCheckBox();
                }
            }, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceGuiKt.MarketplaceGui.13
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i2) {
                    marketplaceViewModel.onClickCardMainButton(i2);
                }
            }, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceGuiKt.MarketplaceGui.14
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i2) {
                    marketplaceViewModel.onClickHistoryProduct(i2);
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceGuiKt.MarketplaceGui.15
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
                    marketplaceViewModel.onClickSort();
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceGuiKt.MarketplaceGui.16
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
                    marketplaceViewModel.onInfoClick();
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceGuiKt.MarketplaceGui.17
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
                    marketplaceViewModel.onClickCloseInfo();
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceGuiKt.MarketplaceGui.18
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
                    marketplaceViewModel.onClickFilterButton();
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceGuiKt.MarketplaceGui.19
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
                    marketplaceViewModel.onResetFilterButtonClick();
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceGuiKt.MarketplaceGui.20
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
                    marketplaceViewModel.onClickConfirmFilters();
                }
            }, new Function1<CraftItemCategoryFilter, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceGuiKt.MarketplaceGui.21
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
                    marketplaceViewModel.onFilterCheckboxClick(checkBox);
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceGuiKt.MarketplaceGui.22
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
                    marketplaceViewModel.onClickToPlusButton();
                }
            }, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceGuiKt.MarketplaceGui.23
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i2) {
                    marketplaceViewModel.onClickToTab(i2);
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceGuiKt.MarketplaceGui.24
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
                    marketplaceViewModel.onClickCloseBottomSheet();
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceGuiKt.MarketplaceGui.25
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
                    marketplaceViewModel.onClickToDonat();
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceGuiKt.MarketplaceGui.26
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
                    marketplaceViewModel.closeScreen();
                }
            }, composerStartRestartGroup, 1092911112, 150994944, MpegAudioUtil.SAMPLES_PER_FRAME_L3_V2, 0, 0);
            composer2 = composerStartRestartGroup;
            ComposeExtensionKt.IfTrue(Boolean.valueOf(marketplaceUiState.isModalWindowVisible()), ComposableLambdaKt.composableLambda(composer2, 1653550717, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceGuiKt.MarketplaceGui.27
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
                public final void invoke(@Nullable Composer composer3, int i2) {
                    if ((i2 & 11) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1653550717, i2, -1, "com.blackhub.bronline.game.ui.marketplace.MarketplaceGui.<anonymous> (MarketplaceGui.kt:128)");
                    }
                    String upperCase = StringResources_androidKt.stringResource(R.string.common_confirmation, composer3, 6).toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    String strStringResource = StringResources_androidKt.stringResource(R.string.common_yes, composer3, 6);
                    String strStringResource2 = StringResources_androidKt.stringResource(R.string.common_no, composer3, 6);
                    final MarketplaceViewModel marketplaceViewModel2 = marketplaceViewModel;
                    Function0<Unit> function0 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceGuiKt.MarketplaceGui.27.1
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
                            marketplaceViewModel2.onClickConfirmInModalWindow();
                        }
                    };
                    final MarketplaceViewModel marketplaceViewModel3 = marketplaceViewModel;
                    Function0<Unit> function02 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceGuiKt.MarketplaceGui.27.2
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
                            marketplaceViewModel3.onCloseModalWindow();
                        }
                    };
                    final MarketplaceUiState marketplaceUiState2 = marketplaceUiState;
                    DialogCustomBlockKt.m15083DialogCustomBlockkoCIM3s(null, R.color.total_black_70, upperCase, null, 0L, 0.0f, null, false, strStringResource, strStringResource2, null, 0L, 0L, 1.0f, 0.0f, null, null, function0, function02, ComposableLambdaKt.composableLambda(composer3, 339817574, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceGuiKt.MarketplaceGui.27.3
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
                        public final void invoke(@Nullable Composer composer4, int i3) {
                            if ((i3 & 11) != 2 || !composer4.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(339817574, i3, -1, "com.blackhub.bronline.game.ui.marketplace.MarketplaceGui.<anonymous>.<anonymous> (MarketplaceGui.kt:142)");
                                }
                                Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer4, 6), 7, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._421wdp, composer4, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._120wdp, composer4, 6));
                                Alignment center = Alignment.INSTANCE.getCenter();
                                MarketplaceUiState marketplaceUiState3 = marketplaceUiState2;
                                composer4.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer4, 6);
                                composer4.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs);
                                if (!(composer4.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer4);
                                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                composer4.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                TextKt.m10025TextIbK3jfQ(marketplaceUiState3.getModalBottomWindowText(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, TypographyStyle.INSTANCE.m14848montserratRegularCustomSpbl3sdaw(R.dimen._16wsp, 0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composer4, 196614, 26), composer4, 0, 0, 131070);
                                composer4.endReplaceableGroup();
                                composer4.endNode();
                                composer4.endReplaceableGroup();
                                composer4.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }), composer3, 48, 805309440, 122105);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceGuiKt.MarketplaceGui.28
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
                    MarketplaceGuiKt.MarketplaceGui(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
