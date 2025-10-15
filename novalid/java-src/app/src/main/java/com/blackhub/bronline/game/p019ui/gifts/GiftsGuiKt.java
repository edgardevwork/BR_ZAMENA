package com.blackhub.bronline.game.p019ui.gifts;

import android.graphics.Bitmap;
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
import com.blackhub.bronline.game.gui.gifts.GiftsUiState;
import com.blackhub.bronline.game.gui.gifts.GiftsViewModel;
import com.blackhub.bronline.game.gui.gifts.model.GiftsPreviewItemModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* compiled from: GiftsGui.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m7105d2 = {"GiftsGui", "", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nGiftsGui.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftsGui.kt\ncom/blackhub/bronline/game/ui/gifts/GiftsGuiKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n*L\n1#1,45:1\n81#2,11:46\n*S KotlinDebug\n*F\n+ 1 GiftsGui.kt\ncom/blackhub/bronline/game/ui/gifts/GiftsGuiKt\n*L\n12#1:46,11\n*E\n"})
/* loaded from: classes3.dex */
public final class GiftsGuiKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void GiftsGui(@Nullable Composer composer, final int i) {
        CreationExtras defaultViewModelCreationExtras;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1494337571);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1494337571, i, -1, "com.blackhub.bronline.game.ui.gifts.GiftsGui (GiftsGui.kt:9)");
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
            ViewModel viewModel = ViewModelKt.viewModel(GiftsViewModel.class, current, null, null, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            final GiftsViewModel giftsViewModel = (GiftsViewModel) viewModel;
            GiftsUiState giftsUiState = (GiftsUiState) FlowExtKt.collectAsStateWithLifecycle(giftsViewModel.getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 8, 7).getValue();
            int valueOfBC = giftsUiState.getValueOfBC();
            int screen = giftsUiState.getScreen();
            List<GiftsPreviewItemModel> standardGifts = giftsUiState.getStandardGifts();
            if (standardGifts == null) {
                standardGifts = CollectionsKt__CollectionsKt.emptyList();
            }
            List<GiftsPreviewItemModel> legendaryGifts = giftsUiState.getLegendaryGifts();
            if (legendaryGifts == null) {
                legendaryGifts = CollectionsKt__CollectionsKt.emptyList();
            }
            int valueOfStandardGifts = giftsUiState.getValueOfStandardGifts();
            int valueOfLegendaryGifts = giftsUiState.getValueOfLegendaryGifts();
            int priceOfLegendaryGift = giftsUiState.getPriceOfLegendaryGift();
            Bitmap bgImage = giftsUiState.getBgImage();
            int idStandardPrize = giftsUiState.getIdStandardPrize();
            int idLegendaryPrize = giftsUiState.getIdLegendaryPrize();
            boolean zIsVisibleButtonBack = giftsUiState.isVisibleButtonBack();
            boolean zIsOpeningBox = giftsUiState.isOpeningBox();
            GiftsPreviewItemModel giftFirst = giftsUiState.getGiftFirst();
            if (giftFirst == null) {
                giftFirst = new GiftsPreviewItemModel(null, 0, null, 7, null);
            }
            GiftsPreviewItemModel giftSecond = giftsUiState.getGiftSecond();
            int defaultGiftImageRes = giftsUiState.getDefaultGiftImageRes();
            boolean zIsStandard = giftsUiState.isStandard();
            boolean zIsSecondGiftVisible = giftsUiState.isSecondGiftVisible();
            boolean zIsButtonGetVisible = giftsUiState.isButtonGetVisible();
            Function0<Unit> function0 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsGuiKt.GiftsGui.1
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
                    giftsViewModel.sendPurchaseBc();
                }
            };
            Function0<Unit> function02 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsGuiKt.GiftsGui.2
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
                    giftsViewModel.sendCloseScreen();
                }
            };
            Function1<Boolean, Unit> function1 = new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsGuiKt.GiftsGui.3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z) {
                    giftsViewModel.sendOpenStandardGift();
                }
            };
            Function1<Boolean, Unit> function12 = new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsGuiKt.GiftsGui.4
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z) {
                    giftsViewModel.sendOpenLegendaryGift(z);
                }
            };
            Function0<Unit> function03 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsGuiKt.GiftsGui.5
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
                    giftsViewModel.clickButtonBack();
                }
            };
            Function0<Unit> function04 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsGuiKt.GiftsGui.6
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
                    giftsViewModel.setButtonGetVisible();
                }
            };
            Function0<Unit> function05 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsGuiKt.GiftsGui.7
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
                    giftsViewModel.sendButtonGet();
                }
            };
            Function0<Unit> function06 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsGuiKt.GiftsGui.8
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
                    giftsViewModel.turnBlockingLoading();
                }
            };
            composer2 = composerStartRestartGroup;
            GiftsPurchaseUiKt.GiftsPurchaseUi(null, valueOfBC, screen, standardGifts, legendaryGifts, valueOfStandardGifts, valueOfLegendaryGifts, priceOfLegendaryGift, bgImage, function0, function02, function1, function12, zIsVisibleButtonBack, function03, idStandardPrize, idLegendaryPrize, zIsOpeningBox, giftFirst, giftSecond, defaultGiftImageRes, zIsStandard, zIsSecondGiftVisible, zIsButtonGetVisible, function04, function05, function06, composer2, 134254592, 1207959552, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsGuiKt.GiftsGui.9
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
                    GiftsGuiKt.GiftsGui(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
