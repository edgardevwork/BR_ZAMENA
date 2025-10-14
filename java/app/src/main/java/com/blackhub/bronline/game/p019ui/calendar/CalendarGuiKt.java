package com.blackhub.bronline.game.p019ui.calendar;

import android.graphics.Bitmap;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel;
import com.blackhub.bronline.game.gui.calendar.CalendarUiState;
import com.blackhub.bronline.game.gui.calendar.CalendarViewModel;
import com.blackhub.bronline.game.gui.calendar.model.CalendarScreenType;
import com.blackhub.bronline.game.p019ui.widget.dialog.CommonRewardDialogKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CalendarGui.kt */
@SourceDebugExtension({"SMAP\nCalendarGui.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarGui.kt\ncom/blackhub/bronline/game/ui/calendar/CalendarGuiKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,108:1\n81#2,11:109\n1116#3,6:120\n81#4:126\n107#4,2:127\n*S KotlinDebug\n*F\n+ 1 CalendarGui.kt\ncom/blackhub/bronline/game/ui/calendar/CalendarGuiKt\n*L\n19#1:109,11\n73#1:120,6\n22#1:126\n22#1:127,2\n*E\n"})

public final class CalendarGuiKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CalendarGui(@Nullable Composer composer, final int i) {
        CreationExtras defaultViewModelCreationExtras;
        MutableState mutableState;
        Composer composer2;
        Composer composer3;
        int minComeBackRewardLevel;
        List<CommonRewardModel> comeBackMainRewardsList;
        List<CommonRewardModel> comeBackBonusRewardsList;
        Composer composerStartRestartGroup = composer.startRestartGroup(201504980);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(201504980, i, -1, "com.blackhub.bronline.game.ui.calendar.CalendarGui (CalendarGui.kt:17)");
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
            ViewModel viewModel = ViewModelKt.viewModel(CalendarViewModel.class, current, null, null, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            final CalendarViewModel calendarViewModel = (CalendarViewModel) viewModel;
            CalendarUiState calendarUiState = (CalendarUiState) SnapshotStateKt.collectAsState(calendarViewModel.getUiState(), null, composerStartRestartGroup, 8, 1).getValue();
            final MutableState mutableState2 = (MutableState) RememberSaveableKt.m10957rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<MutableState<String>>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarGuiKt$CalendarGui$secondsReward$2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final MutableState<String> invoke() {
                    return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, 2, null);
                }
            }, composerStartRestartGroup, 3080, 6);
            composerStartRestartGroup.startReplaceableGroup(1896280523);
            if (calendarUiState.isInitInterface()) {
                String nameOfEventTitle = calendarUiState.getNameOfEventTitle();
                long jM14443getColorOfEvent0d7_KjU = calendarUiState.m14443getColorOfEvent0d7_KjU();
                long jM14444getTextSeasonFirstColor0d7_KjU = calendarUiState.m14444getTextSeasonFirstColor0d7_KjU();
                long jM14445getTextSeasonSecondColor0d7_KjU = calendarUiState.m14445getTextSeasonSecondColor0d7_KjU();
                String bgOfEventBitmapName = calendarUiState.getBgOfEventBitmapName();
                String icOfEventBitmapName = calendarUiState.getIcOfEventBitmapName();
                String bgComeBackEventBitmapName = calendarUiState.getBgComeBackEventBitmapName();
                String icComeBackEventBitmapName = calendarUiState.getIcComeBackEventBitmapName();
                int daysFromStartSeason = calendarUiState.getDaysFromStartSeason();
                int totalDaysSeason = calendarUiState.getTotalDaysSeason();
                int secondsForNewDay = calendarUiState.getSecondsForNewDay();
                int secondsForReward = calendarUiState.getSecondsForReward();
                int mainRewardsSize = calendarUiState.getMainRewardsSize();
                int daysGame = calendarUiState.getDaysGame();
                CalendarScreenType selectedPage = calendarUiState.getSelectedPage();
                CalendarScreenType calendarScreenType = CalendarScreenType.MAIN;
                if (selectedPage == calendarScreenType) {
                    minComeBackRewardLevel = calendarUiState.getMinRewardLevel();
                } else {
                    minComeBackRewardLevel = calendarUiState.getMinComeBackRewardLevel();
                }
                int i2 = minComeBackRewardLevel;
                boolean zIsShowingNewSeasonBp = calendarUiState.isShowingNewSeasonBp();
                int getActualLevelIcon = calendarUiState.getGetActualLevelIcon();
                if (calendarUiState.getSelectedPage() == calendarScreenType) {
                    comeBackMainRewardsList = calendarUiState.getMainRewardsList();
                } else {
                    comeBackMainRewardsList = calendarUiState.getComeBackMainRewardsList();
                }
                List<CommonRewardModel> list = comeBackMainRewardsList;
                if (calendarUiState.getSelectedPage() == calendarScreenType) {
                    comeBackBonusRewardsList = calendarUiState.getBonusRewardsList();
                } else {
                    comeBackBonusRewardsList = calendarUiState.getComeBackBonusRewardsList();
                }
                CommonRewardModel lastReward = calendarUiState.getLastReward();
                String comeBackSubtitle = calendarUiState.getComeBackSubtitle();
                boolean zIsShowingMainTutorial = calendarUiState.isShowingMainTutorial();
                boolean zIsShowingBonusTutorial = calendarUiState.isShowingBonusTutorial();
                boolean zIsNeedShowingBpLottieAnimation = calendarUiState.isNeedShowingBpLottieAnimation();
                int lastOpenedMainReward = calendarUiState.getLastOpenedMainReward();
                int lastOpenedBonusReward = calendarUiState.getLastOpenedBonusReward();
                boolean zIsFinishedSeason = calendarUiState.isFinishedSeason();
                boolean zIsAllRewardsReceived = calendarUiState.isAllRewardsReceived();
                boolean zIsNeedToShowComebackButton = calendarUiState.isNeedToShowComebackButton();
                CalendarScreenType selectedPage2 = calendarUiState.getSelectedPage();
                boolean zIsNeedToShowNotificationMain = calendarUiState.isNeedToShowNotificationMain();
                boolean zIsNeedToShowNotificationComeBack = calendarUiState.isNeedToShowNotificationComeBack();
                C50551 c50551 = new C50551(calendarViewModel);
                Function1<CalendarScreenType, Unit> function1 = new Function1<CalendarScreenType, Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarGuiKt.CalendarGui.2
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(CalendarScreenType calendarScreenType2) {
                        invoke2(calendarScreenType2);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull CalendarScreenType selectedPage3) {
                        Intrinsics.checkNotNullParameter(selectedPage3, "selectedPage");
                        calendarViewModel.selectPage(selectedPage3);
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(1896283101);
                boolean zChanged = composerStartRestartGroup.changed(mutableState2);
                List<CommonRewardModel> list2 = comeBackBonusRewardsList;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarGuiKt$CalendarGui$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(String str) {
                            invoke2(str);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull String secondsForReward2) {
                            Intrinsics.checkNotNullParameter(secondsForReward2, "secondsForReward");
                            mutableState2.setValue(secondsForReward2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = mutableState2;
                composer2 = composerStartRestartGroup;
                CalendarMainUiKt.m14915CalendarMainUiDgHyVOg(null, nameOfEventTitle, jM14443getColorOfEvent0d7_KjU, jM14444getTextSeasonFirstColor0d7_KjU, jM14445getTextSeasonSecondColor0d7_KjU, bgOfEventBitmapName, icOfEventBitmapName, bgComeBackEventBitmapName, icComeBackEventBitmapName, comeBackSubtitle, daysFromStartSeason, totalDaysSeason, secondsForNewDay, secondsForReward, mainRewardsSize, daysGame, i2, getActualLevelIcon, zIsShowingNewSeasonBp, list, list2, lastReward, zIsShowingMainTutorial, zIsShowingBonusTutorial, 0.0f, zIsNeedShowingBpLottieAnimation, lastOpenedMainReward, lastOpenedBonusReward, selectedPage2, zIsFinishedSeason, zIsAllRewardsReceived, zIsNeedToShowComebackButton, zIsNeedToShowNotificationMain, zIsNeedToShowNotificationComeBack, function1, (Function1) objRememberedValue, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarGuiKt.CalendarGui.4
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
                        calendarViewModel.onCloseClicked();
                    }
                }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarGuiKt.CalendarGui.5
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
                        calendarViewModel.buttonClick(1);
                    }
                }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarGuiKt.CalendarGui.6
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
                        calendarViewModel.onTutorialCLick(true);
                    }
                }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarGuiKt.CalendarGui.7
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
                        calendarViewModel.onShowAllRewardsClick();
                    }
                }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarGuiKt.CalendarGui.8
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
                        calendarViewModel.onTutorialCLick(false);
                    }
                }, c50551, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarGuiKt.CalendarGui.9
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
                        calendarViewModel.closeHint();
                    }
                }, composer2, 0, 1073741824, 72, 0, 0, 16777217, 0);
            } else {
                mutableState = mutableState2;
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceableGroup();
            composer3 = composer2;
            composer3.startReplaceableGroup(1896283687);
            if (calendarUiState.isNeedShowAllRewards()) {
                CalendarAllGiftsUiKt.m14913CalendarAllGiftsUiFU0evQE(calendarUiState.getNameOfEvent(), calendarUiState.getIcOfEventBitmapName(), calendarUiState.m14443getColorOfEvent0d7_KjU(), calendarUiState.getMainRewardsList(), CalendarGui$lambda$0(mutableState), new C505610(calendarViewModel), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarGuiKt.CalendarGui.11
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
                        calendarViewModel.closeAllRewards();
                    }
                }, composer3, 4096);
            }
            composer3.endReplaceableGroup();
            if (calendarUiState.isNeedShowRewardDialog()) {
                CommonRewardDialogKt.CommonRewardDialog(null, calendarUiState.getItemForPreviewDialog(), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarGuiKt.CalendarGui.12
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
                        calendarViewModel.onDialogButtonClick();
                    }
                }, composer3, 64, 1);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarGuiKt.CalendarGui.13
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                    invoke(composer4, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer4, int i3) {
                    CalendarGuiKt.CalendarGui(composer4, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* compiled from: CalendarGui.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.calendar.CalendarGuiKt$CalendarGui$1 */
    public /* synthetic */ class C50551 extends FunctionReferenceImpl implements Function3<Integer, Boolean, Bitmap, Unit> {
        public C50551(Object obj) {
            super(3, obj, CalendarViewModel.class, "onItemClick", "onItemClick(IZLandroid/graphics/Bitmap;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Boolean bool, Bitmap bitmap) {
            invoke(num.intValue(), bool.booleanValue(), bitmap);
            return Unit.INSTANCE;
        }

        public final void invoke(int i, boolean z, @Nullable Bitmap bitmap) {
            ((CalendarViewModel) this.receiver).onItemClick(i, z, bitmap);
        }
    }

    /* compiled from: CalendarGui.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.calendar.CalendarGuiKt$CalendarGui$10 */
    public /* synthetic */ class C505610 extends FunctionReferenceImpl implements Function3<Integer, Boolean, Bitmap, Unit> {
        public C505610(Object obj) {
            super(3, obj, CalendarViewModel.class, "onItemClick", "onItemClick(IZLandroid/graphics/Bitmap;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Boolean bool, Bitmap bitmap) {
            invoke(num.intValue(), bool.booleanValue(), bitmap);
            return Unit.INSTANCE;
        }

        public final void invoke(int i, boolean z, @Nullable Bitmap bitmap) {
            ((CalendarViewModel) this.receiver).onItemClick(i, z, bitmap);
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewCalendarGUI(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2099945376);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2099945376, i, -1, "com.blackhub.bronline.game.ui.calendar.PreviewCalendarGUI (CalendarGui.kt:105)");
            }
            CalendarGui(composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarGuiKt.PreviewCalendarGUI.1
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
                    CalendarGuiKt.PreviewCalendarGUI(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final String CalendarGui$lambda$0(MutableState<String> mutableState) {
        return mutableState.getValue();
    }
}

