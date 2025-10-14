package com.blackhub.bronline.game.gui.calendar;

import androidx.annotation.DrawableRes;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.common.C2732C;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel;
import com.blackhub.bronline.game.gui.calendar.model.CalendarScreenType;
import com.blackhub.bronline.game.theme.ColorKt;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CalendarUiState.kt */
@StabilityInferred(parameters = 0)

public final /* data */ class CalendarUiState implements UiState {
    public static final int $stable = 8;

    @NotNull
    public final String bgComeBackEventBitmapName;

    @NotNull
    public final String bgOfEventBitmapName;

    @NotNull
    public final List<CommonRewardModel> bonusRewardsList;
    public final long colorOfEvent;

    @NotNull
    public final List<CommonRewardModel> comeBackBonusRewardsList;
    public final int comeBackDaysGame;

    @NotNull
    public final List<CommonRewardModel> comeBackMainRewardsList;

    @NotNull
    public final String comeBackSubtitle;
    public final int currentLevel;
    public final int daysForEndSeasonComeBack;
    public final int daysForEndSeasonMain;

    @NotNull
    public final String icComeBackEventBitmapName;

    @NotNull
    public final String icOfEventBitmapName;
    public final boolean isAllRewardsReceived;
    public final boolean isFinishedSeason;
    public final boolean isInitInterface;
    public final boolean isNeedClose;
    public final boolean isNeedGetReward;
    public final boolean isNeedShowAllRewards;
    public final boolean isNeedShowRewardDialog;
    public final boolean isNeedShowingBpLottieAnimation;
    public final boolean isNeedToShowComebackButton;
    public final boolean isNeedToShowNotificationComeBack;
    public final boolean isNeedToShowNotificationMain;
    public final boolean isShowingBonusTutorial;
    public final boolean isShowingMainTutorial;
    public final boolean isShowingNewSeasonBp;
    public final boolean isShowingTutorial;

    @NotNull
    public final CommonRewardModel itemForPreviewDialog;
    public final int lastOpenedBonusReward;
    public final int lastOpenedComeBackBonusReward;
    public final int lastOpenedComeBackMainReward;
    public final int lastOpenedMainReward;
    public final int mainDaysGame;

    @NotNull
    public final List<CommonRewardModel> mainRewardsList;
    public final int minComeBackRewardLevel;
    public final int minRewardLevel;

    @NotNull
    public final String nameOfComebackEvent;

    @NotNull
    public final String nameOfEvent;
    public final int posItemForPreviewDialog;
    public final int rewardIndexWithTimer;
    public final int rewardList;
    public final int secondsForNewDay;
    public final int secondsForReward;

    @NotNull
    public final CalendarScreenType selectedPage;
    public final long textSeasonFirstColor;
    public final long textSeasonSecondColor;
    public final int totalDaysComeBack;
    public final int totalDaysMain;

    public /* synthetic */ CalendarUiState(boolean z, String str, String str2, String str3, String str4, String str5, String str6, long j, long j2, long j3, boolean z2, boolean z3, CommonRewardModel commonRewardModel, int i, int i2, boolean z4, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, String str7, int i13, int i14, CalendarScreenType calendarScreenType, List list, List list2, List list3, List list4, int i15, int i16, int i17, int i18, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, str2, str3, str4, str5, str6, j, j2, j3, z2, z3, commonRewardModel, i, i2, z4, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, str7, i13, i14, calendarScreenType, list, list2, list3, list4, i15, i16, i17, i18, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsInitInterface() {
        return this.isInitInterface;
    }

    /* renamed from: component10-0d7_KjU, reason: from getter */
    public final long getTextSeasonSecondColor() {
        return this.textSeasonSecondColor;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsNeedShowAllRewards() {
        return this.isNeedShowAllRewards;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsNeedShowRewardDialog() {
        return this.isNeedShowRewardDialog;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final CommonRewardModel getItemForPreviewDialog() {
        return this.itemForPreviewDialog;
    }

    /* renamed from: component14, reason: from getter */
    public final int getPosItemForPreviewDialog() {
        return this.posItemForPreviewDialog;
    }

    /* renamed from: component15, reason: from getter */
    public final int getRewardList() {
        return this.rewardList;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getIsNeedGetReward() {
        return this.isNeedGetReward;
    }

    /* renamed from: component17, reason: from getter */
    public final int getDaysForEndSeasonMain() {
        return this.daysForEndSeasonMain;
    }

    /* renamed from: component18, reason: from getter */
    public final int getDaysForEndSeasonComeBack() {
        return this.daysForEndSeasonComeBack;
    }

    /* renamed from: component19, reason: from getter */
    public final int getSecondsForNewDay() {
        return this.secondsForNewDay;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getNameOfEvent() {
        return this.nameOfEvent;
    }

    /* renamed from: component20, reason: from getter */
    public final int getSecondsForReward() {
        return this.secondsForReward;
    }

    /* renamed from: component21, reason: from getter */
    public final int getMinRewardLevel() {
        return this.minRewardLevel;
    }

    /* renamed from: component22, reason: from getter */
    public final int getCurrentLevel() {
        return this.currentLevel;
    }

    /* renamed from: component23, reason: from getter */
    public final int getMinComeBackRewardLevel() {
        return this.minComeBackRewardLevel;
    }

    /* renamed from: component24, reason: from getter */
    public final int getMainDaysGame() {
        return this.mainDaysGame;
    }

    /* renamed from: component25, reason: from getter */
    public final int getComeBackDaysGame() {
        return this.comeBackDaysGame;
    }

    /* renamed from: component26, reason: from getter */
    public final int getRewardIndexWithTimer() {
        return this.rewardIndexWithTimer;
    }

    @NotNull
    /* renamed from: component27, reason: from getter */
    public final String getComeBackSubtitle() {
        return this.comeBackSubtitle;
    }

    /* renamed from: component28, reason: from getter */
    public final int getTotalDaysMain() {
        return this.totalDaysMain;
    }

    /* renamed from: component29, reason: from getter */
    public final int getTotalDaysComeBack() {
        return this.totalDaysComeBack;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getNameOfComebackEvent() {
        return this.nameOfComebackEvent;
    }

    @NotNull
    /* renamed from: component30, reason: from getter */
    public final CalendarScreenType getSelectedPage() {
        return this.selectedPage;
    }

    @NotNull
    public final List<CommonRewardModel> component31() {
        return this.mainRewardsList;
    }

    @NotNull
    public final List<CommonRewardModel> component32() {
        return this.bonusRewardsList;
    }

    @NotNull
    public final List<CommonRewardModel> component33() {
        return this.comeBackMainRewardsList;
    }

    @NotNull
    public final List<CommonRewardModel> component34() {
        return this.comeBackBonusRewardsList;
    }

    /* renamed from: component35, reason: from getter */
    public final int getLastOpenedMainReward() {
        return this.lastOpenedMainReward;
    }

    /* renamed from: component36, reason: from getter */
    public final int getLastOpenedBonusReward() {
        return this.lastOpenedBonusReward;
    }

    /* renamed from: component37, reason: from getter */
    public final int getLastOpenedComeBackMainReward() {
        return this.lastOpenedComeBackMainReward;
    }

    /* renamed from: component38, reason: from getter */
    public final int getLastOpenedComeBackBonusReward() {
        return this.lastOpenedComeBackBonusReward;
    }

    /* renamed from: component39, reason: from getter */
    public final boolean getIsNeedToShowComebackButton() {
        return this.isNeedToShowComebackButton;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getBgOfEventBitmapName() {
        return this.bgOfEventBitmapName;
    }

    /* renamed from: component40, reason: from getter */
    public final boolean getIsNeedToShowNotificationMain() {
        return this.isNeedToShowNotificationMain;
    }

    /* renamed from: component41, reason: from getter */
    public final boolean getIsNeedToShowNotificationComeBack() {
        return this.isNeedToShowNotificationComeBack;
    }

    /* renamed from: component42, reason: from getter */
    public final boolean getIsFinishedSeason() {
        return this.isFinishedSeason;
    }

    /* renamed from: component43, reason: from getter */
    public final boolean getIsAllRewardsReceived() {
        return this.isAllRewardsReceived;
    }

    /* renamed from: component44, reason: from getter */
    public final boolean getIsShowingNewSeasonBp() {
        return this.isShowingNewSeasonBp;
    }

    /* renamed from: component45, reason: from getter */
    public final boolean getIsNeedShowingBpLottieAnimation() {
        return this.isNeedShowingBpLottieAnimation;
    }

    /* renamed from: component46, reason: from getter */
    public final boolean getIsShowingTutorial() {
        return this.isShowingTutorial;
    }

    /* renamed from: component47, reason: from getter */
    public final boolean getIsShowingMainTutorial() {
        return this.isShowingMainTutorial;
    }

    /* renamed from: component48, reason: from getter */
    public final boolean getIsShowingBonusTutorial() {
        return this.isShowingBonusTutorial;
    }

    /* renamed from: component49, reason: from getter */
    public final boolean getIsNeedClose() {
        return this.isNeedClose;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getIcOfEventBitmapName() {
        return this.icOfEventBitmapName;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getBgComeBackEventBitmapName() {
        return this.bgComeBackEventBitmapName;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getIcComeBackEventBitmapName() {
        return this.icComeBackEventBitmapName;
    }

    /* renamed from: component8-0d7_KjU, reason: from getter */
    public final long getColorOfEvent() {
        return this.colorOfEvent;
    }

    /* renamed from: component9-0d7_KjU, reason: from getter */
    public final long getTextSeasonFirstColor() {
        return this.textSeasonFirstColor;
    }

    @NotNull
    /* renamed from: copy-Sbi3iaU */
    public final CalendarUiState m14442copySbi3iaU(boolean isInitInterface, @NotNull String nameOfEvent, @NotNull String nameOfComebackEvent, @NotNull String bgOfEventBitmapName, @NotNull String icOfEventBitmapName, @NotNull String bgComeBackEventBitmapName, @NotNull String icComeBackEventBitmapName, long colorOfEvent, long textSeasonFirstColor, long textSeasonSecondColor, boolean isNeedShowAllRewards, boolean isNeedShowRewardDialog, @NotNull CommonRewardModel itemForPreviewDialog, int posItemForPreviewDialog, int rewardList, boolean isNeedGetReward, int daysForEndSeasonMain, int daysForEndSeasonComeBack, int secondsForNewDay, int secondsForReward, int minRewardLevel, int currentLevel, int minComeBackRewardLevel, int mainDaysGame, int comeBackDaysGame, int rewardIndexWithTimer, @NotNull String comeBackSubtitle, int totalDaysMain, int totalDaysComeBack, @NotNull CalendarScreenType selectedPage, @NotNull List<CommonRewardModel> mainRewardsList, @NotNull List<CommonRewardModel> bonusRewardsList, @NotNull List<CommonRewardModel> comeBackMainRewardsList, @NotNull List<CommonRewardModel> comeBackBonusRewardsList, int lastOpenedMainReward, int lastOpenedBonusReward, int lastOpenedComeBackMainReward, int lastOpenedComeBackBonusReward, boolean isNeedToShowComebackButton, boolean isNeedToShowNotificationMain, boolean isNeedToShowNotificationComeBack, boolean isFinishedSeason, boolean isAllRewardsReceived, boolean isShowingNewSeasonBp, boolean isNeedShowingBpLottieAnimation, boolean isShowingTutorial, boolean isShowingMainTutorial, boolean isShowingBonusTutorial, boolean isNeedClose) {
        Intrinsics.checkNotNullParameter(nameOfEvent, "nameOfEvent");
        Intrinsics.checkNotNullParameter(nameOfComebackEvent, "nameOfComebackEvent");
        Intrinsics.checkNotNullParameter(bgOfEventBitmapName, "bgOfEventBitmapName");
        Intrinsics.checkNotNullParameter(icOfEventBitmapName, "icOfEventBitmapName");
        Intrinsics.checkNotNullParameter(bgComeBackEventBitmapName, "bgComeBackEventBitmapName");
        Intrinsics.checkNotNullParameter(icComeBackEventBitmapName, "icComeBackEventBitmapName");
        Intrinsics.checkNotNullParameter(itemForPreviewDialog, "itemForPreviewDialog");
        Intrinsics.checkNotNullParameter(comeBackSubtitle, "comeBackSubtitle");
        Intrinsics.checkNotNullParameter(selectedPage, "selectedPage");
        Intrinsics.checkNotNullParameter(mainRewardsList, "mainRewardsList");
        Intrinsics.checkNotNullParameter(bonusRewardsList, "bonusRewardsList");
        Intrinsics.checkNotNullParameter(comeBackMainRewardsList, "comeBackMainRewardsList");
        Intrinsics.checkNotNullParameter(comeBackBonusRewardsList, "comeBackBonusRewardsList");
        return new CalendarUiState(isInitInterface, nameOfEvent, nameOfComebackEvent, bgOfEventBitmapName, icOfEventBitmapName, bgComeBackEventBitmapName, icComeBackEventBitmapName, colorOfEvent, textSeasonFirstColor, textSeasonSecondColor, isNeedShowAllRewards, isNeedShowRewardDialog, itemForPreviewDialog, posItemForPreviewDialog, rewardList, isNeedGetReward, daysForEndSeasonMain, daysForEndSeasonComeBack, secondsForNewDay, secondsForReward, minRewardLevel, currentLevel, minComeBackRewardLevel, mainDaysGame, comeBackDaysGame, rewardIndexWithTimer, comeBackSubtitle, totalDaysMain, totalDaysComeBack, selectedPage, mainRewardsList, bonusRewardsList, comeBackMainRewardsList, comeBackBonusRewardsList, lastOpenedMainReward, lastOpenedBonusReward, lastOpenedComeBackMainReward, lastOpenedComeBackBonusReward, isNeedToShowComebackButton, isNeedToShowNotificationMain, isNeedToShowNotificationComeBack, isFinishedSeason, isAllRewardsReceived, isShowingNewSeasonBp, isNeedShowingBpLottieAnimation, isShowingTutorial, isShowingMainTutorial, isShowingBonusTutorial, isNeedClose, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalendarUiState)) {
            return false;
        }
        CalendarUiState calendarUiState = (CalendarUiState) other;
        return this.isInitInterface == calendarUiState.isInitInterface && Intrinsics.areEqual(this.nameOfEvent, calendarUiState.nameOfEvent) && Intrinsics.areEqual(this.nameOfComebackEvent, calendarUiState.nameOfComebackEvent) && Intrinsics.areEqual(this.bgOfEventBitmapName, calendarUiState.bgOfEventBitmapName) && Intrinsics.areEqual(this.icOfEventBitmapName, calendarUiState.icOfEventBitmapName) && Intrinsics.areEqual(this.bgComeBackEventBitmapName, calendarUiState.bgComeBackEventBitmapName) && Intrinsics.areEqual(this.icComeBackEventBitmapName, calendarUiState.icComeBackEventBitmapName) && Color.m11341equalsimpl0(this.colorOfEvent, calendarUiState.colorOfEvent) && Color.m11341equalsimpl0(this.textSeasonFirstColor, calendarUiState.textSeasonFirstColor) && Color.m11341equalsimpl0(this.textSeasonSecondColor, calendarUiState.textSeasonSecondColor) && this.isNeedShowAllRewards == calendarUiState.isNeedShowAllRewards && this.isNeedShowRewardDialog == calendarUiState.isNeedShowRewardDialog && Intrinsics.areEqual(this.itemForPreviewDialog, calendarUiState.itemForPreviewDialog) && this.posItemForPreviewDialog == calendarUiState.posItemForPreviewDialog && this.rewardList == calendarUiState.rewardList && this.isNeedGetReward == calendarUiState.isNeedGetReward && this.daysForEndSeasonMain == calendarUiState.daysForEndSeasonMain && this.daysForEndSeasonComeBack == calendarUiState.daysForEndSeasonComeBack && this.secondsForNewDay == calendarUiState.secondsForNewDay && this.secondsForReward == calendarUiState.secondsForReward && this.minRewardLevel == calendarUiState.minRewardLevel && this.currentLevel == calendarUiState.currentLevel && this.minComeBackRewardLevel == calendarUiState.minComeBackRewardLevel && this.mainDaysGame == calendarUiState.mainDaysGame && this.comeBackDaysGame == calendarUiState.comeBackDaysGame && this.rewardIndexWithTimer == calendarUiState.rewardIndexWithTimer && Intrinsics.areEqual(this.comeBackSubtitle, calendarUiState.comeBackSubtitle) && this.totalDaysMain == calendarUiState.totalDaysMain && this.totalDaysComeBack == calendarUiState.totalDaysComeBack && this.selectedPage == calendarUiState.selectedPage && Intrinsics.areEqual(this.mainRewardsList, calendarUiState.mainRewardsList) && Intrinsics.areEqual(this.bonusRewardsList, calendarUiState.bonusRewardsList) && Intrinsics.areEqual(this.comeBackMainRewardsList, calendarUiState.comeBackMainRewardsList) && Intrinsics.areEqual(this.comeBackBonusRewardsList, calendarUiState.comeBackBonusRewardsList) && this.lastOpenedMainReward == calendarUiState.lastOpenedMainReward && this.lastOpenedBonusReward == calendarUiState.lastOpenedBonusReward && this.lastOpenedComeBackMainReward == calendarUiState.lastOpenedComeBackMainReward && this.lastOpenedComeBackBonusReward == calendarUiState.lastOpenedComeBackBonusReward && this.isNeedToShowComebackButton == calendarUiState.isNeedToShowComebackButton && this.isNeedToShowNotificationMain == calendarUiState.isNeedToShowNotificationMain && this.isNeedToShowNotificationComeBack == calendarUiState.isNeedToShowNotificationComeBack && this.isFinishedSeason == calendarUiState.isFinishedSeason && this.isAllRewardsReceived == calendarUiState.isAllRewardsReceived && this.isShowingNewSeasonBp == calendarUiState.isShowingNewSeasonBp && this.isNeedShowingBpLottieAnimation == calendarUiState.isNeedShowingBpLottieAnimation && this.isShowingTutorial == calendarUiState.isShowingTutorial && this.isShowingMainTutorial == calendarUiState.isShowingMainTutorial && this.isShowingBonusTutorial == calendarUiState.isShowingBonusTutorial && this.isNeedClose == calendarUiState.isNeedClose;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Boolean.hashCode(this.isInitInterface) * 31) + this.nameOfEvent.hashCode()) * 31) + this.nameOfComebackEvent.hashCode()) * 31) + this.bgOfEventBitmapName.hashCode()) * 31) + this.icOfEventBitmapName.hashCode()) * 31) + this.bgComeBackEventBitmapName.hashCode()) * 31) + this.icComeBackEventBitmapName.hashCode()) * 31) + Color.m11347hashCodeimpl(this.colorOfEvent)) * 31) + Color.m11347hashCodeimpl(this.textSeasonFirstColor)) * 31) + Color.m11347hashCodeimpl(this.textSeasonSecondColor)) * 31) + Boolean.hashCode(this.isNeedShowAllRewards)) * 31) + Boolean.hashCode(this.isNeedShowRewardDialog)) * 31) + this.itemForPreviewDialog.hashCode()) * 31) + Integer.hashCode(this.posItemForPreviewDialog)) * 31) + Integer.hashCode(this.rewardList)) * 31) + Boolean.hashCode(this.isNeedGetReward)) * 31) + Integer.hashCode(this.daysForEndSeasonMain)) * 31) + Integer.hashCode(this.daysForEndSeasonComeBack)) * 31) + Integer.hashCode(this.secondsForNewDay)) * 31) + Integer.hashCode(this.secondsForReward)) * 31) + Integer.hashCode(this.minRewardLevel)) * 31) + Integer.hashCode(this.currentLevel)) * 31) + Integer.hashCode(this.minComeBackRewardLevel)) * 31) + Integer.hashCode(this.mainDaysGame)) * 31) + Integer.hashCode(this.comeBackDaysGame)) * 31) + Integer.hashCode(this.rewardIndexWithTimer)) * 31) + this.comeBackSubtitle.hashCode()) * 31) + Integer.hashCode(this.totalDaysMain)) * 31) + Integer.hashCode(this.totalDaysComeBack)) * 31) + this.selectedPage.hashCode()) * 31) + this.mainRewardsList.hashCode()) * 31) + this.bonusRewardsList.hashCode()) * 31) + this.comeBackMainRewardsList.hashCode()) * 31) + this.comeBackBonusRewardsList.hashCode()) * 31) + Integer.hashCode(this.lastOpenedMainReward)) * 31) + Integer.hashCode(this.lastOpenedBonusReward)) * 31) + Integer.hashCode(this.lastOpenedComeBackMainReward)) * 31) + Integer.hashCode(this.lastOpenedComeBackBonusReward)) * 31) + Boolean.hashCode(this.isNeedToShowComebackButton)) * 31) + Boolean.hashCode(this.isNeedToShowNotificationMain)) * 31) + Boolean.hashCode(this.isNeedToShowNotificationComeBack)) * 31) + Boolean.hashCode(this.isFinishedSeason)) * 31) + Boolean.hashCode(this.isAllRewardsReceived)) * 31) + Boolean.hashCode(this.isShowingNewSeasonBp)) * 31) + Boolean.hashCode(this.isNeedShowingBpLottieAnimation)) * 31) + Boolean.hashCode(this.isShowingTutorial)) * 31) + Boolean.hashCode(this.isShowingMainTutorial)) * 31) + Boolean.hashCode(this.isShowingBonusTutorial)) * 31) + Boolean.hashCode(this.isNeedClose);
    }

    @NotNull
    public String toString() {
        return "CalendarUiState(isInitInterface=" + this.isInitInterface + ", nameOfEvent=" + this.nameOfEvent + ", nameOfComebackEvent=" + this.nameOfComebackEvent + ", bgOfEventBitmapName=" + this.bgOfEventBitmapName + ", icOfEventBitmapName=" + this.icOfEventBitmapName + ", bgComeBackEventBitmapName=" + this.bgComeBackEventBitmapName + ", icComeBackEventBitmapName=" + this.icComeBackEventBitmapName + ", colorOfEvent=" + Color.m11348toStringimpl(this.colorOfEvent) + ", textSeasonFirstColor=" + Color.m11348toStringimpl(this.textSeasonFirstColor) + ", textSeasonSecondColor=" + Color.m11348toStringimpl(this.textSeasonSecondColor) + ", isNeedShowAllRewards=" + this.isNeedShowAllRewards + ", isNeedShowRewardDialog=" + this.isNeedShowRewardDialog + ", itemForPreviewDialog=" + this.itemForPreviewDialog + ", posItemForPreviewDialog=" + this.posItemForPreviewDialog + ", rewardList=" + this.rewardList + ", isNeedGetReward=" + this.isNeedGetReward + ", daysForEndSeasonMain=" + this.daysForEndSeasonMain + ", daysForEndSeasonComeBack=" + this.daysForEndSeasonComeBack + ", secondsForNewDay=" + this.secondsForNewDay + ", secondsForReward=" + this.secondsForReward + ", minRewardLevel=" + this.minRewardLevel + ", currentLevel=" + this.currentLevel + ", minComeBackRewardLevel=" + this.minComeBackRewardLevel + ", mainDaysGame=" + this.mainDaysGame + ", comeBackDaysGame=" + this.comeBackDaysGame + ", rewardIndexWithTimer=" + this.rewardIndexWithTimer + ", comeBackSubtitle=" + this.comeBackSubtitle + ", totalDaysMain=" + this.totalDaysMain + ", totalDaysComeBack=" + this.totalDaysComeBack + ", selectedPage=" + this.selectedPage + ", mainRewardsList=" + this.mainRewardsList + ", bonusRewardsList=" + this.bonusRewardsList + ", comeBackMainRewardsList=" + this.comeBackMainRewardsList + ", comeBackBonusRewardsList=" + this.comeBackBonusRewardsList + ", lastOpenedMainReward=" + this.lastOpenedMainReward + ", lastOpenedBonusReward=" + this.lastOpenedBonusReward + ", lastOpenedComeBackMainReward=" + this.lastOpenedComeBackMainReward + ", lastOpenedComeBackBonusReward=" + this.lastOpenedComeBackBonusReward + ", isNeedToShowComebackButton=" + this.isNeedToShowComebackButton + ", isNeedToShowNotificationMain=" + this.isNeedToShowNotificationMain + ", isNeedToShowNotificationComeBack=" + this.isNeedToShowNotificationComeBack + ", isFinishedSeason=" + this.isFinishedSeason + ", isAllRewardsReceived=" + this.isAllRewardsReceived + ", isShowingNewSeasonBp=" + this.isShowingNewSeasonBp + ", isNeedShowingBpLottieAnimation=" + this.isNeedShowingBpLottieAnimation + ", isShowingTutorial=" + this.isShowingTutorial + ", isShowingMainTutorial=" + this.isShowingMainTutorial + ", isShowingBonusTutorial=" + this.isShowingBonusTutorial + ", isNeedClose=" + this.isNeedClose + ")";
    }

    public CalendarUiState(boolean z, String nameOfEvent, String nameOfComebackEvent, String bgOfEventBitmapName, String icOfEventBitmapName, String bgComeBackEventBitmapName, String icComeBackEventBitmapName, long j, long j2, long j3, boolean z2, boolean z3, CommonRewardModel itemForPreviewDialog, int i, int i2, boolean z4, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, String comeBackSubtitle, int i13, int i14, CalendarScreenType selectedPage, List<CommonRewardModel> mainRewardsList, List<CommonRewardModel> bonusRewardsList, List<CommonRewardModel> comeBackMainRewardsList, List<CommonRewardModel> comeBackBonusRewardsList, int i15, int i16, int i17, int i18, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        Intrinsics.checkNotNullParameter(nameOfEvent, "nameOfEvent");
        Intrinsics.checkNotNullParameter(nameOfComebackEvent, "nameOfComebackEvent");
        Intrinsics.checkNotNullParameter(bgOfEventBitmapName, "bgOfEventBitmapName");
        Intrinsics.checkNotNullParameter(icOfEventBitmapName, "icOfEventBitmapName");
        Intrinsics.checkNotNullParameter(bgComeBackEventBitmapName, "bgComeBackEventBitmapName");
        Intrinsics.checkNotNullParameter(icComeBackEventBitmapName, "icComeBackEventBitmapName");
        Intrinsics.checkNotNullParameter(itemForPreviewDialog, "itemForPreviewDialog");
        Intrinsics.checkNotNullParameter(comeBackSubtitle, "comeBackSubtitle");
        Intrinsics.checkNotNullParameter(selectedPage, "selectedPage");
        Intrinsics.checkNotNullParameter(mainRewardsList, "mainRewardsList");
        Intrinsics.checkNotNullParameter(bonusRewardsList, "bonusRewardsList");
        Intrinsics.checkNotNullParameter(comeBackMainRewardsList, "comeBackMainRewardsList");
        Intrinsics.checkNotNullParameter(comeBackBonusRewardsList, "comeBackBonusRewardsList");
        this.isInitInterface = z;
        this.nameOfEvent = nameOfEvent;
        this.nameOfComebackEvent = nameOfComebackEvent;
        this.bgOfEventBitmapName = bgOfEventBitmapName;
        this.icOfEventBitmapName = icOfEventBitmapName;
        this.bgComeBackEventBitmapName = bgComeBackEventBitmapName;
        this.icComeBackEventBitmapName = icComeBackEventBitmapName;
        this.colorOfEvent = j;
        this.textSeasonFirstColor = j2;
        this.textSeasonSecondColor = j3;
        this.isNeedShowAllRewards = z2;
        this.isNeedShowRewardDialog = z3;
        this.itemForPreviewDialog = itemForPreviewDialog;
        this.posItemForPreviewDialog = i;
        this.rewardList = i2;
        this.isNeedGetReward = z4;
        this.daysForEndSeasonMain = i3;
        this.daysForEndSeasonComeBack = i4;
        this.secondsForNewDay = i5;
        this.secondsForReward = i6;
        this.minRewardLevel = i7;
        this.currentLevel = i8;
        this.minComeBackRewardLevel = i9;
        this.mainDaysGame = i10;
        this.comeBackDaysGame = i11;
        this.rewardIndexWithTimer = i12;
        this.comeBackSubtitle = comeBackSubtitle;
        this.totalDaysMain = i13;
        this.totalDaysComeBack = i14;
        this.selectedPage = selectedPage;
        this.mainRewardsList = mainRewardsList;
        this.bonusRewardsList = bonusRewardsList;
        this.comeBackMainRewardsList = comeBackMainRewardsList;
        this.comeBackBonusRewardsList = comeBackBonusRewardsList;
        this.lastOpenedMainReward = i15;
        this.lastOpenedBonusReward = i16;
        this.lastOpenedComeBackMainReward = i17;
        this.lastOpenedComeBackBonusReward = i18;
        this.isNeedToShowComebackButton = z5;
        this.isNeedToShowNotificationMain = z6;
        this.isNeedToShowNotificationComeBack = z7;
        this.isFinishedSeason = z8;
        this.isAllRewardsReceived = z9;
        this.isShowingNewSeasonBp = z10;
        this.isNeedShowingBpLottieAnimation = z11;
        this.isShowingTutorial = z12;
        this.isShowingMainTutorial = z13;
        this.isShowingBonusTutorial = z14;
        this.isNeedClose = z15;
    }

    public final boolean isInitInterface() {
        return this.isInitInterface;
    }

    public /* synthetic */ CalendarUiState(boolean z, String str, String str2, String str3, String str4, String str5, String str6, long j, long j2, long j3, boolean z2, boolean z3, CommonRewardModel commonRewardModel, int i, int i2, boolean z4, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, String str7, int i13, int i14, CalendarScreenType calendarScreenType, List list, List list2, List list3, List list4, int i15, int i16, int i17, int i18, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i19, int i20, DefaultConstructorMarker defaultConstructorMarker) {
        this((i19 & 1) != 0 ? false : z, (i19 & 2) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i19 & 4) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i19 & 8) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str3, (i19 & 16) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str4, (i19 & 32) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str5, (i19 & 64) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str6, (i19 & 128) != 0 ? ColorKt.getDefaultColor() : j, (i19 & 256) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j2, (i19 & 512) != 0 ? ColorKt.getDefaultColor() : j3, (i19 & 1024) != 0 ? false : z2, (i19 & 2048) != 0 ? false : z3, (i19 & 4096) != 0 ? new CommonRewardModel(0, null, null, null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262143, null) : commonRewardModel, (i19 & 8192) != 0 ? -1 : i, (i19 & 16384) != 0 ? 0 : i2, (i19 & 32768) != 0 ? false : z4, (i19 & 65536) != 0 ? 0 : i3, (i19 & 131072) != 0 ? 0 : i4, (i19 & 262144) != 0 ? 0 : i5, (i19 & 524288) != 0 ? 0 : i6, (i19 & 1048576) == 0 ? i7 : -1, (i19 & 2097152) != 0 ? 0 : i8, (i19 & 4194304) != 0 ? 3 : i9, (i19 & 8388608) != 0 ? 0 : i10, (i19 & 16777216) != 0 ? 0 : i11, (i19 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? 0 : i12, (i19 & 67108864) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str7, (i19 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? 0 : i13, (i19 & 268435456) != 0 ? 0 : i14, (i19 & 536870912) != 0 ? CalendarScreenType.MAIN : calendarScreenType, (i19 & 1073741824) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i19 & Integer.MIN_VALUE) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i20 & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3, (i20 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list4, (i20 & 4) != 0 ? 0 : i15, (i20 & 8) != 0 ? 0 : i16, (i20 & 16) != 0 ? 0 : i17, (i20 & 32) != 0 ? 0 : i18, (i20 & 64) != 0 ? false : z5, (i20 & 128) != 0 ? false : z6, (i20 & 256) != 0 ? false : z7, (i20 & 512) != 0 ? false : z8, (i20 & 1024) != 0 ? false : z9, (i20 & 2048) != 0 ? false : z10, (i20 & 4096) != 0 ? false : z11, (i20 & 8192) != 0 ? false : z12, (i20 & 16384) != 0 ? false : z13, (i20 & 32768) != 0 ? false : z14, (i20 & 65536) != 0 ? false : z15, null);
    }

    @NotNull
    public final String getNameOfEvent() {
        return this.nameOfEvent;
    }

    @NotNull
    public final String getNameOfComebackEvent() {
        return this.nameOfComebackEvent;
    }

    @NotNull
    public final String getBgOfEventBitmapName() {
        return this.bgOfEventBitmapName;
    }

    @NotNull
    public final String getIcOfEventBitmapName() {
        return this.icOfEventBitmapName;
    }

    @NotNull
    public final String getBgComeBackEventBitmapName() {
        return this.bgComeBackEventBitmapName;
    }

    @NotNull
    public final String getIcComeBackEventBitmapName() {
        return this.icComeBackEventBitmapName;
    }

    /* renamed from: getColorOfEvent-0d7_KjU */
    public final long m14443getColorOfEvent0d7_KjU() {
        return this.colorOfEvent;
    }

    /* renamed from: getTextSeasonFirstColor-0d7_KjU */
    public final long m14444getTextSeasonFirstColor0d7_KjU() {
        return this.textSeasonFirstColor;
    }

    /* renamed from: getTextSeasonSecondColor-0d7_KjU */
    public final long m14445getTextSeasonSecondColor0d7_KjU() {
        return this.textSeasonSecondColor;
    }

    public final boolean isNeedShowAllRewards() {
        return this.isNeedShowAllRewards;
    }

    public final boolean isNeedShowRewardDialog() {
        return this.isNeedShowRewardDialog;
    }

    @NotNull
    public final CommonRewardModel getItemForPreviewDialog() {
        return this.itemForPreviewDialog;
    }

    public final int getPosItemForPreviewDialog() {
        return this.posItemForPreviewDialog;
    }

    public final int getRewardList() {
        return this.rewardList;
    }

    public final boolean isNeedGetReward() {
        return this.isNeedGetReward;
    }

    public final int getDaysForEndSeasonMain() {
        return this.daysForEndSeasonMain;
    }

    public final int getDaysForEndSeasonComeBack() {
        return this.daysForEndSeasonComeBack;
    }

    public final int getSecondsForNewDay() {
        return this.secondsForNewDay;
    }

    public final int getSecondsForReward() {
        return this.secondsForReward;
    }

    public final int getMinRewardLevel() {
        return this.minRewardLevel;
    }

    public final int getCurrentLevel() {
        return this.currentLevel;
    }

    public final int getMinComeBackRewardLevel() {
        return this.minComeBackRewardLevel;
    }

    public final int getMainDaysGame() {
        return this.mainDaysGame;
    }

    public final int getComeBackDaysGame() {
        return this.comeBackDaysGame;
    }

    public final int getRewardIndexWithTimer() {
        return this.rewardIndexWithTimer;
    }

    @NotNull
    public final String getComeBackSubtitle() {
        return this.comeBackSubtitle;
    }

    public final int getTotalDaysMain() {
        return this.totalDaysMain;
    }

    public final int getTotalDaysComeBack() {
        return this.totalDaysComeBack;
    }

    @NotNull
    public final CalendarScreenType getSelectedPage() {
        return this.selectedPage;
    }

    @NotNull
    public final List<CommonRewardModel> getMainRewardsList() {
        return this.mainRewardsList;
    }

    @NotNull
    public final List<CommonRewardModel> getBonusRewardsList() {
        return this.bonusRewardsList;
    }

    @NotNull
    public final List<CommonRewardModel> getComeBackMainRewardsList() {
        return this.comeBackMainRewardsList;
    }

    @NotNull
    public final List<CommonRewardModel> getComeBackBonusRewardsList() {
        return this.comeBackBonusRewardsList;
    }

    public final int getLastOpenedMainReward() {
        return this.lastOpenedMainReward;
    }

    public final int getLastOpenedBonusReward() {
        return this.lastOpenedBonusReward;
    }

    public final int getLastOpenedComeBackMainReward() {
        return this.lastOpenedComeBackMainReward;
    }

    public final int getLastOpenedComeBackBonusReward() {
        return this.lastOpenedComeBackBonusReward;
    }

    public final boolean isNeedToShowComebackButton() {
        return this.isNeedToShowComebackButton;
    }

    public final boolean isNeedToShowNotificationMain() {
        return this.isNeedToShowNotificationMain;
    }

    public final boolean isNeedToShowNotificationComeBack() {
        return this.isNeedToShowNotificationComeBack;
    }

    public final boolean isFinishedSeason() {
        return this.isFinishedSeason;
    }

    public final boolean isAllRewardsReceived() {
        return this.isAllRewardsReceived;
    }

    public final boolean isShowingNewSeasonBp() {
        return this.isShowingNewSeasonBp;
    }

    public final boolean isNeedShowingBpLottieAnimation() {
        return this.isNeedShowingBpLottieAnimation;
    }

    public final boolean isShowingTutorial() {
        return this.isShowingTutorial;
    }

    public final boolean isShowingMainTutorial() {
        return this.isShowingMainTutorial;
    }

    public final boolean isShowingBonusTutorial() {
        return this.isShowingBonusTutorial;
    }

    public final boolean isNeedClose() {
        return this.isNeedClose;
    }

    public final int getMainRewardsSize() {
        if (this.selectedPage == CalendarScreenType.MAIN) {
            return this.mainRewardsList.size();
        }
        return this.comeBackMainRewardsList.size();
    }

    @DrawableRes
    public final int getGetActualLevelIcon() {
        if (this.selectedPage == CalendarScreenType.MAIN) {
            if (this.currentLevel < this.minRewardLevel) {
                return R.drawable.ic_close_red;
            }
        } else if (this.currentLevel < this.minComeBackRewardLevel) {
            return R.drawable.ic_close_red;
        }
        return R.drawable.ic_check_correct;
    }

    @NotNull
    public final CommonRewardModel getLastReward() {
        if (this.selectedPage == CalendarScreenType.MAIN) {
            CommonRewardModel commonRewardModel = (CommonRewardModel) CollectionsKt___CollectionsKt.lastOrNull((List) this.mainRewardsList);
            return commonRewardModel == null ? new CommonRewardModel(0, null, null, null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262143, null) : commonRewardModel;
        }
        CommonRewardModel commonRewardModel2 = (CommonRewardModel) CollectionsKt___CollectionsKt.lastOrNull((List) this.comeBackMainRewardsList);
        return commonRewardModel2 == null ? new CommonRewardModel(0, null, null, null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262143, null) : commonRewardModel2;
    }

    public final int getTotalDaysSeason() {
        if (this.selectedPage == CalendarScreenType.MAIN) {
            return this.totalDaysMain;
        }
        return this.totalDaysComeBack;
    }

    public final int getDaysGame() {
        if (this.selectedPage == CalendarScreenType.MAIN) {
            return this.mainDaysGame;
        }
        return this.comeBackDaysGame;
    }

    public final int getDaysFromStartSeason() {
        if (this.selectedPage == CalendarScreenType.MAIN) {
            return this.daysForEndSeasonMain;
        }
        return this.daysForEndSeasonComeBack;
    }

    @NotNull
    public final String getNameOfEventTitle() {
        if (this.selectedPage == CalendarScreenType.MAIN) {
            return this.nameOfEvent;
        }
        return this.nameOfComebackEvent;
    }
}

