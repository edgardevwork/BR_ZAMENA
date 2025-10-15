package com.blackhub.bronline.game.p019ui.holidayevents;

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
import com.blackhub.bronline.game.core.utils.attachment.main.CommonButtonCategory;
import com.blackhub.bronline.game.core.utils.attachment.rating.CommonRatingModel;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel;
import com.blackhub.bronline.game.core.utils.attachment.task.CommonTaskModel;
import com.blackhub.bronline.game.gui.holidayevents.HolidayEventsUiState;
import com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel;
import com.blackhub.bronline.game.gui.holidayevents.enums.HolidayEventsScreenEnum;
import com.blackhub.bronline.game.gui.holidayevents.model.HolidayEventsGameItemModel;
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

/* compiled from: HolidayEventsGui.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m7105d2 = {"HolidayEventsGui", "", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nHolidayEventsGui.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HolidayEventsGui.kt\ncom/blackhub/bronline/game/ui/holidayevents/HolidayEventsGuiKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n*L\n1#1,99:1\n81#2,11:100\n*S KotlinDebug\n*F\n+ 1 HolidayEventsGui.kt\ncom/blackhub/bronline/game/ui/holidayevents/HolidayEventsGuiKt\n*L\n11#1:100,11\n*E\n"})
/* loaded from: classes3.dex */
public final class HolidayEventsGuiKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void HolidayEventsGui(@Nullable Composer composer, final int i) {
        CreationExtras defaultViewModelCreationExtras;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1450447605);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1450447605, i, -1, "com.blackhub.bronline.game.ui.holidayevents.HolidayEventsGui (HolidayEventsGui.kt:8)");
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
            ViewModel viewModel = ViewModelKt.viewModel(HolidayEventsViewModel.class, current, null, null, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            final HolidayEventsViewModel holidayEventsViewModel = (HolidayEventsViewModel) viewModel;
            HolidayEventsUiState holidayEventsUiState = (HolidayEventsUiState) FlowExtKt.collectAsStateWithLifecycle(holidayEventsViewModel.getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 8, 7).getValue();
            Bitmap backgroundBitmap = holidayEventsUiState.getBackgroundBitmap();
            Bitmap bpOfferImage = holidayEventsUiState.getBpOfferImage();
            Bitmap offerImage = holidayEventsUiState.getOfferImage();
            Bitmap treeImage = holidayEventsUiState.getTreeImage();
            Bitmap lastChanceBitmap = holidayEventsUiState.getLastChanceBitmap();
            List<CommonButtonCategory> listOfButtons = holidayEventsUiState.getListOfButtons();
            HolidayEventsScreenEnum currentScreen = holidayEventsUiState.getCurrentScreen();
            int buttonPlayText = holidayEventsUiState.getButtonPlayText();
            List<HolidayEventsGameItemModel> listOfGames = holidayEventsUiState.getListOfGames();
            int rewardLevel = holidayEventsUiState.getRewardLevel();
            int gainLevel = holidayEventsUiState.getGainLevel();
            Bitmap seasonIcon = holidayEventsUiState.getSeasonIcon();
            List<CommonRewardModel> rewardsList = holidayEventsUiState.getRewardsList();
            boolean zIsTopListSelected = holidayEventsUiState.isTopListSelected();
            composer2 = composerStartRestartGroup;
            Bitmap rewardsBitmapImage = holidayEventsUiState.getRewardsBitmapImage();
            Bitmap gainBitmapImage = holidayEventsUiState.getGainBitmapImage();
            Bitmap seasonCurrencyBitmap = holidayEventsUiState.getSeasonCurrencyBitmap();
            HolidayEventsContentKt.m14980HolidayEventsContentFbHTq8(backgroundBitmap, bpOfferImage, offerImage, treeImage, lastChanceBitmap, listOfButtons, currentScreen, buttonPlayText, listOfGames, rewardLevel, gainLevel, seasonIcon, rewardsList, zIsTopListSelected, rewardsBitmapImage, gainBitmapImage, holidayEventsUiState.getHolidayEventsGainBlockData(), seasonCurrencyBitmap, holidayEventsUiState.m14511getSeasonColor0d7_KjU(), holidayEventsUiState.m14512getSeasonColor20d7_KjU(), holidayEventsUiState.m14514getShadowColorForEventIcon0d7_KjU(), holidayEventsUiState.getSeasonName(), holidayEventsUiState.getSeasonTimer(), holidayEventsUiState.getSeasonTimerHeader(), holidayEventsUiState.getCurrentProgressOfProgressBar(), holidayEventsUiState.getMaxProgressOfProgressBar(), holidayEventsUiState.getCurrencyAmount(), holidayEventsUiState.isNeedToShowDialogBuyCurrency(), holidayEventsUiState.getEnteredTextBuyDarkEnergy(), holidayEventsUiState.getTextYouSpendBC(), holidayEventsUiState.getTextYouGetCurrency(), holidayEventsUiState.getSelectedCategoryTask(), holidayEventsUiState.getSpecialCategoryImageBitmap(), holidayEventsUiState.getDailyCategoryImageBitmap(), holidayEventsUiState.getSpecialTasksList(), holidayEventsUiState.getDailyTasksList(), holidayEventsUiState.isNeedToShowDialogPreviewReward(), holidayEventsUiState.getRewardItemForDialog(), holidayEventsUiState.getMyPlaceInRating(), holidayEventsUiState.getRatingList(), holidayEventsUiState.getMyRatingBgImage(), holidayEventsUiState.isNeedToShowTutorial(), holidayEventsUiState.getTutorialAttachment(), holidayEventsUiState.getGameQueuePlayers(), holidayEventsUiState.isNeedToShowDialogWaitForPlayers(), holidayEventsUiState.isNeedToShowDialogNotEnoughBc(), holidayEventsUiState.isNeedToShowOfferImage(), holidayEventsUiState.isWithPremium(), holidayEventsUiState.isTopTasksHaveNotification(), holidayEventsUiState.isBottomTasksHaveNotification(), holidayEventsUiState.isNeedToShowLastChance(), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsGuiKt.HolidayEventsGui.1
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
                    holidayEventsViewModel.onLastChanceClick();
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsGuiKt.HolidayEventsGui.2
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
                    holidayEventsViewModel.onClickGoToPurchaseBc();
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsGuiKt.HolidayEventsGui.3
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
                    holidayEventsViewModel.onCloseDialogNotEnoughBc();
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsGuiKt.HolidayEventsGui.4
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
                    holidayEventsViewModel.onCancelGameSearch();
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsGuiKt.HolidayEventsGui.5
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
                    holidayEventsViewModel.onCloseTutorialClick();
                }
            }, new Function2<Integer, Bitmap, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsGuiKt.HolidayEventsGui.6
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Integer num, Bitmap bitmap) {
                    invoke(num.intValue(), bitmap);
                    return Unit.INSTANCE;
                }

                public final void invoke(int i2, @Nullable Bitmap bitmap) {
                    holidayEventsViewModel.onItemClick(i2, bitmap);
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsGuiKt.HolidayEventsGui.7
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
                    holidayEventsViewModel.onButtonGainLvlUp();
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsGuiKt.HolidayEventsGui.8
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
                    holidayEventsViewModel.onPreviewDialogButtonClick();
                }
            }, new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsGuiKt.HolidayEventsGui.9
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z) {
                    holidayEventsViewModel.onExpandButtonClick(z);
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsGuiKt.HolidayEventsGui.10
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
                    holidayEventsViewModel.onBuyDarkEnergyClick();
                }
            }, new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsGuiKt.HolidayEventsGui.11
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    holidayEventsViewModel.onTextEnteredInBuyDialog(value);
                }
            }, new Function1<HolidayEventsGameItemModel, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsGuiKt.HolidayEventsGui.12
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(HolidayEventsGameItemModel holidayEventsGameItemModel) {
                    invoke2(holidayEventsGameItemModel);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull HolidayEventsGameItemModel id) {
                    Intrinsics.checkNotNullParameter(id, "id");
                    holidayEventsViewModel.onGameClick(id);
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsGuiKt.HolidayEventsGui.13
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
                    holidayEventsViewModel.onCloseDialogBuyCurrency();
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsGuiKt.HolidayEventsGui.14
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
                    holidayEventsViewModel.onPlayClick();
                }
            }, new Function1<CommonButtonCategory, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsGuiKt.HolidayEventsGui.15
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CommonButtonCategory commonButtonCategory) {
                    invoke2(commonButtonCategory);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CommonButtonCategory button) {
                    Intrinsics.checkNotNullParameter(button, "button");
                    holidayEventsViewModel.onButtonChooseScreenClick(button);
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsGuiKt.HolidayEventsGui.16
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
                    HolidayEventsViewModel.onClickPlusButton$default(holidayEventsViewModel, false, 1, null);
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsGuiKt.HolidayEventsGui.17
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
                    holidayEventsViewModel.onCloseClick();
                }
            }, new Function1<Byte, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsGuiKt.HolidayEventsGui.18
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Byte b) {
                    invoke(b.byteValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(byte b) {
                    holidayEventsViewModel.onCategoryTaskClick(b);
                }
            }, new Function1<CommonTaskModel, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsGuiKt.HolidayEventsGui.19
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CommonTaskModel commonTaskModel) {
                    invoke2(commonTaskModel);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CommonTaskModel task) {
                    Intrinsics.checkNotNullParameter(task, "task");
                    holidayEventsViewModel.onTaskClick(task);
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsGuiKt.HolidayEventsGui.20
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
                    holidayEventsViewModel.onRefreshRatingClick();
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsGuiKt.HolidayEventsGui.21
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
                    holidayEventsViewModel.onButtonBpOfferClick();
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsGuiKt.HolidayEventsGui.22
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
                    holidayEventsViewModel.onShowTutorialClick();
                }
            }, new Function1<CommonRatingModel, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsGuiKt.HolidayEventsGui.23
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CommonRatingModel commonRatingModel) {
                    invoke2(commonRatingModel);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CommonRatingModel item) {
                    Intrinsics.checkNotNullParameter(item, "item");
                    holidayEventsViewModel.onRatingItemClick(item);
                }
            }, composer2, 134517320, 17072704, 0, 1090818560, 520, 0, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsGuiKt.HolidayEventsGui.24
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
                    HolidayEventsGuiKt.HolidayEventsGui(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
