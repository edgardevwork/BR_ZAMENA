package com.blackhub.bronline.game.p019ui.taxirating;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.blackhub.bronline.game.gui.taxirating.TaxiRatingUiState;
import com.blackhub.bronline.game.gui.taxirating.TaxiRatingViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* compiled from: TaxiRatingGui.kt */
@SourceDebugExtension({"SMAP\nTaxiRatingGui.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaxiRatingGui.kt\ncom/blackhub/bronline/game/ui/taxirating/TaxiRatingGuiKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n*L\n1#1,35:1\n81#2,11:36\n*S KotlinDebug\n*F\n+ 1 TaxiRatingGui.kt\ncom/blackhub/bronline/game/ui/taxirating/TaxiRatingGuiKt\n*L\n10#1:36,11\n*E\n"})

public final class TaxiRatingGuiKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TaxiRatingGui(@Nullable Composer composer, final int i) {
        CreationExtras defaultViewModelCreationExtras;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-517883509);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-517883509, i, -1, "com.blackhub.bronline.game.ui.taxirating.TaxiRatingGui (TaxiRatingGui.kt:8)");
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
            ViewModel viewModel = ViewModelKt.viewModel(TaxiRatingViewModel.class, current, null, null, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            final TaxiRatingViewModel taxiRatingViewModel = (TaxiRatingViewModel) viewModel;
            TaxiRatingUiState taxiRatingUiState = (TaxiRatingUiState) FlowExtKt.collectAsStateWithLifecycle(taxiRatingViewModel.getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 8, 7).getValue();
            composer2 = composerStartRestartGroup;
            TaxiRatingMainKt.TaxiRatingMain(taxiRatingUiState.isRateSelected(), taxiRatingUiState.getStarColorOne(), taxiRatingUiState.getStarColorTwo(), taxiRatingUiState.getStarColorThree(), taxiRatingUiState.getStarColorFour(), taxiRatingUiState.getStarColorFive(), taxiRatingUiState.getTipsBntOneBorder(), taxiRatingUiState.getTipsBntTwoBorder(), taxiRatingUiState.getTipsBntThreeBorder(), new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.taxirating.TaxiRatingGuiKt.TaxiRatingGui.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i2) {
                    taxiRatingViewModel.onClickSelectRate(i2);
                }
            }, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.taxirating.TaxiRatingGuiKt.TaxiRatingGui.2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i2) {
                    taxiRatingViewModel.onClickSelectTips(i2);
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.taxirating.TaxiRatingGuiKt.TaxiRatingGui.3
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
                    taxiRatingViewModel.onClickConfirm();
                }
            }, composerStartRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.taxirating.TaxiRatingGuiKt.TaxiRatingGui.4
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
                    TaxiRatingGuiKt.TaxiRatingGui(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

