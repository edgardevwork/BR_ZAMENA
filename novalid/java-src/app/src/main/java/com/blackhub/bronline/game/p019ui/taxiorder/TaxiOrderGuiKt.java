package com.blackhub.bronline.game.p019ui.taxiorder;

import androidx.compose.p003ui.res.StringResources_androidKt;
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
import com.blackhub.bronline.game.gui.taxiorder.CoordinatesModel;
import com.blackhub.bronline.game.gui.taxiorder.TaxiCompanyEnum;
import com.blackhub.bronline.game.gui.taxiorder.TaxiOrderUiState;
import com.blackhub.bronline.game.gui.taxiorder.TaxiOrderViewModel;
import com.blackhub.bronline.game.gui.taxiorder.TaxiRateEnum;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TaxiOrderGui.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m7105d2 = {"TaxiOrderGui", "", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTaxiOrderGui.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaxiOrderGui.kt\ncom/blackhub/bronline/game/ui/taxiorder/TaxiOrderGuiKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n*L\n1#1,89:1\n81#2,11:90\n*S KotlinDebug\n*F\n+ 1 TaxiOrderGui.kt\ncom/blackhub/bronline/game/ui/taxiorder/TaxiOrderGuiKt\n*L\n12#1:90,11\n*E\n"})
/* loaded from: classes2.dex */
public final class TaxiOrderGuiKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TaxiOrderGui(@Nullable Composer composer, final int i) {
        CreationExtras defaultViewModelCreationExtras;
        Composer composerStartRestartGroup = composer.startRestartGroup(1906919658);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1906919658, i, -1, "com.blackhub.bronline.game.ui.taxiorder.TaxiOrderGui (TaxiOrderGui.kt:10)");
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
            ViewModel viewModel = ViewModelKt.viewModel(TaxiOrderViewModel.class, current, null, null, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            final TaxiOrderViewModel taxiOrderViewModel = (TaxiOrderViewModel) viewModel;
            final TaxiOrderUiState taxiOrderUiState = (TaxiOrderUiState) FlowExtKt.collectAsStateWithLifecycle(taxiOrderViewModel.getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 8, 7).getValue();
            final String strStringResource = StringResources_androidKt.stringResource(R.string.taxi_your_address, composerStartRestartGroup, 6);
            TaxiOrderContainerKt.TaxiOrderContainer(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1169635848, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiOrderGuiKt.TaxiOrderGui.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer2, int i2) {
                    if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1169635848, i2, -1, "com.blackhub.bronline.game.ui.taxiorder.TaxiOrderGui.<anonymous> (TaxiOrderGui.kt:19)");
                        }
                        int selectButtonColor = taxiOrderUiState.getSelectButtonColor();
                        List<Integer> selectButtonBrush = taxiOrderUiState.getSelectButtonBrush();
                        int selectButtonText = taxiOrderUiState.getSelectButtonText();
                        String placeName = taxiOrderUiState.getPlaceName();
                        float cashAlpha = taxiOrderUiState.getCashAlpha();
                        float cardAlpha = taxiOrderUiState.getCardAlpha();
                        boolean zIsOrderButtonActive = taxiOrderUiState.isOrderButtonActive();
                        int yandexButtonPainter = taxiOrderUiState.getYandexButtonPainter();
                        int gettButtonPainter = taxiOrderUiState.getGettButtonPainter();
                        int cityMobileButtonPainter = taxiOrderUiState.getCityMobileButtonPainter();
                        List<Integer> yandexButtonBrush = taxiOrderUiState.getYandexButtonBrush();
                        List<Integer> gettButtonBrush = taxiOrderUiState.getGettButtonBrush();
                        List<Integer> cityMobileButtonBrush = taxiOrderUiState.getCityMobileButtonBrush();
                        int economyPrice = taxiOrderUiState.getEconomyPrice();
                        int comfortPrice = taxiOrderUiState.getComfortPrice();
                        int businessPrice = taxiOrderUiState.getBusinessPrice();
                        int economyBorderColor = taxiOrderUiState.getEconomyBorderColor();
                        int comfortBorderColor = taxiOrderUiState.getComfortBorderColor();
                        int businessBorderColor = taxiOrderUiState.getBusinessBorderColor();
                        String str = strStringResource;
                        final TaxiOrderViewModel taxiOrderViewModel2 = taxiOrderViewModel;
                        Function1<TaxiCompanyEnum, Unit> function1 = new Function1<TaxiCompanyEnum, Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiOrderGuiKt.TaxiOrderGui.1.1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TaxiCompanyEnum taxiCompanyEnum) {
                                invoke2(taxiCompanyEnum);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TaxiCompanyEnum company) {
                                Intrinsics.checkNotNullParameter(company, "company");
                                TaxiOrderViewModel.changeOrderSettings$default(taxiOrderViewModel2, company, null, false, 6, null);
                            }
                        };
                        final TaxiOrderViewModel taxiOrderViewModel3 = taxiOrderViewModel;
                        Function1<TaxiRateEnum, Unit> function12 = new Function1<TaxiRateEnum, Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiOrderGuiKt.TaxiOrderGui.1.2
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TaxiRateEnum taxiRateEnum) {
                                invoke2(taxiRateEnum);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TaxiRateEnum rate) {
                                Intrinsics.checkNotNullParameter(rate, "rate");
                                TaxiOrderViewModel.changeOrderSettings$default(taxiOrderViewModel3, null, rate, false, 5, null);
                            }
                        };
                        final TaxiOrderViewModel taxiOrderViewModel4 = taxiOrderViewModel;
                        Function1<Boolean, Unit> function13 = new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiOrderGuiKt.TaxiOrderGui.1.3
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                invoke(bool.booleanValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(boolean z) {
                                TaxiOrderViewModel.changeOrderSettings$default(taxiOrderViewModel4, null, null, true, 3, null);
                            }
                        };
                        final TaxiOrderViewModel taxiOrderViewModel5 = taxiOrderViewModel;
                        Function0<Unit> function0 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiOrderGuiKt.TaxiOrderGui.1.4
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
                                taxiOrderViewModel5.openLocationMenu();
                            }
                        };
                        final TaxiOrderViewModel taxiOrderViewModel6 = taxiOrderViewModel;
                        Function0<Unit> function02 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiOrderGuiKt.TaxiOrderGui.1.5
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
                                taxiOrderViewModel6.closeScreen();
                            }
                        };
                        final TaxiOrderViewModel taxiOrderViewModel7 = taxiOrderViewModel;
                        TaxiOrderMainKt.TaxiOrderMain(selectButtonColor, selectButtonBrush, selectButtonText, placeName, cashAlpha, cardAlpha, zIsOrderButtonActive, yandexButtonPainter, gettButtonPainter, cityMobileButtonPainter, yandexButtonBrush, gettButtonBrush, cityMobileButtonBrush, economyPrice, comfortPrice, businessPrice, economyBorderColor, comfortBorderColor, businessBorderColor, str, function1, function12, function13, function0, function02, new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiOrderGuiKt.TaxiOrderGui.1.6
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(String str2) {
                                invoke2(str2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull String comment) {
                                Intrinsics.checkNotNullParameter(comment, "comment");
                                taxiOrderViewModel7.orderTaxi(comment);
                            }
                        }, composer2, 64, 584, 0);
                        composer2.startReplaceableGroup(1635214631);
                        if (taxiOrderUiState.isMapOpened()) {
                            final TaxiOrderViewModel taxiOrderViewModel8 = taxiOrderViewModel;
                            Function2<CoordinatesModel, Float, Unit> function2 = new Function2<CoordinatesModel, Float, Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiOrderGuiKt.TaxiOrderGui.1.7
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(CoordinatesModel coordinatesModel, Float f) {
                                    invoke(coordinatesModel, f.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull CoordinatesModel coordinates, float f) {
                                    Intrinsics.checkNotNullParameter(coordinates, "coordinates");
                                    taxiOrderViewModel8.selectAddressByMapAndCountPrices(coordinates, f);
                                }
                            };
                            final TaxiOrderViewModel taxiOrderViewModel9 = taxiOrderViewModel;
                            TaxiMapKt.TaxiMap(function2, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiOrderGuiKt.TaxiOrderGui.1.8
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
                                    taxiOrderViewModel9.closeMap();
                                }
                            }, composer2, 0);
                        }
                        composer2.endReplaceableGroup();
                        composer2.startReplaceableGroup(1635215002);
                        if (taxiOrderUiState.isWaitingWindowOpened()) {
                            final TaxiOrderViewModel taxiOrderViewModel10 = taxiOrderViewModel;
                            TaxiOrderWaitKt.TaxiOrderWait(new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiOrderGuiKt.TaxiOrderGui.1.9
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
                                    taxiOrderViewModel10.closeWaitingWindowAndDismissOrder();
                                }
                            }, composer2, 0);
                        }
                        composer2.endReplaceableGroup();
                        if (taxiOrderUiState.isOrderWindowVisible()) {
                            String driverName = taxiOrderUiState.getDriverName();
                            String driverNumber = taxiOrderUiState.getDriverNumber();
                            String driverAuto = taxiOrderUiState.getDriverAuto();
                            final TaxiOrderViewModel taxiOrderViewModel11 = taxiOrderViewModel;
                            TaxiOrderInfoKt.TaxiOrderInfo(driverName, driverNumber, driverAuto, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiOrderGuiKt.TaxiOrderGui.1.10
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
                                    taxiOrderViewModel11.closeScreen();
                                }
                            }, composer2, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiOrderGuiKt.TaxiOrderGui.2
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
                    TaxiOrderGuiKt.TaxiOrderGui(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
