package com.blackhub.bronline.game.gui.holidayevents;

import android.graphics.Bitmap;
import androidx.annotation.StringRes;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.common.C2732C;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.attachment.main.CommonButtonCategory;
import com.blackhub.bronline.game.core.utils.attachment.rating.CommonRatingModel;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel;
import com.blackhub.bronline.game.core.utils.attachment.task.CommonTaskModel;
import com.blackhub.bronline.game.core.utils.attachment.tutorial.CommonTutorialTextsWithImage;
import com.blackhub.bronline.game.gui.holidayevents.enums.HolidayEventsScreenEnum;
import com.blackhub.bronline.game.gui.holidayevents.model.HolidayEventsGainBlockData;
import com.blackhub.bronline.game.gui.holidayevents.model.HolidayEventsGameItemModel;
import com.blackhub.bronline.game.model.remote.response.holidayevents.HolidayEventsEventLevel;
import com.blackhub.bronline.game.model.remote.response.holidayevents.HolidayEventsLimitUpgrades;
import com.blackhub.bronline.game.model.remote.response.holidayevents.HolidayEventsRatingRewards;
import com.blackhub.bronline.game.model.remote.response.holidayevents.HolidayEventsSettings;
import com.blackhub.bronline.game.model.remote.response.holidayevents.HolidayEventsTasks;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HolidayEventsUiState.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nHolidayEventsUiState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HolidayEventsUiState.kt\ncom/blackhub/bronline/game/gui/holidayevents/HolidayEventsUiState\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1#1,118:1\n1099#2:119\n*S KotlinDebug\n*F\n+ 1 HolidayEventsUiState.kt\ncom/blackhub/bronline/game/gui/holidayevents/HolidayEventsUiState\n*L\n110#1:119\n*E\n"})

public final /* data */ class HolidayEventsUiState implements UiState {
    public static final int $stable = 8;

    @Nullable
    public final Bitmap backgroundBitmap;
    public final int bcValue;
    public final int bpDailyLimit;
    public final int bpDailyMultiplier;

    @Nullable
    public final Bitmap bpOfferImage;
    public final int buttonPlayText;
    public final int currentProgressOfProgressBar;

    @NotNull
    public final HolidayEventsScreenEnum currentScreen;

    @Nullable
    public final Bitmap dailyCategoryImageBitmap;
    public final int dailyCurrencyValue;

    @NotNull
    public final List<CommonTaskModel> dailyTasksList;

    @NotNull
    public final String enteredTextBuyDarkEnergy;

    @NotNull
    public final List<HolidayEventsEventLevel> eventLevels;

    @Nullable
    public final Bitmap gainBitmapImage;
    public final int gainLevel;

    @NotNull
    public final String gameQueuePlayers;

    @NotNull
    public final HolidayEventsGainBlockData holidayEventsGainBlockData;
    public final boolean isBottomTasksHaveNotification;
    public final boolean isNeedClose;
    public final boolean isNeedToShowDialogBuyCurrency;
    public final boolean isNeedToShowDialogNotEnoughBc;
    public final boolean isNeedToShowDialogPreviewReward;
    public final boolean isNeedToShowDialogWaitForPlayers;
    public final boolean isNeedToShowLastChance;
    public final boolean isNeedToShowTutorial;
    public final boolean isTopListSelected;
    public final boolean isTopTasksHaveNotification;
    public final boolean isWithPremium;

    @Nullable
    public final Bitmap lastChanceBitmap;

    @NotNull
    public final List<HolidayEventsLimitUpgrades> limitUpgrades;

    @NotNull
    public final List<CommonButtonCategory> listOfButtons;

    @NotNull
    public final List<HolidayEventsGameItemModel> listOfGames;
    public final int maxProgressOfProgressBar;
    public final int myPlaceInRating;

    @Nullable
    public final Bitmap myRatingBgImage;
    public final int offerCost;

    @Nullable
    public final Bitmap offerImage;
    public final int offerValue;

    @NotNull
    public final List<CommonRatingModel> ratingList;

    @NotNull
    public final List<HolidayEventsRatingRewards> ratingRewardsFromJson;

    @NotNull
    public final CommonRewardModel rewardItemForDialog;
    public final int rewardLevel;

    @Nullable
    public final Bitmap rewardsBitmapImage;

    @NotNull
    public final List<CommonRewardModel> rewardsList;
    public final long seasonColor;
    public final long seasonColor2;

    @Nullable
    public final Bitmap seasonCurrencyBitmap;

    @Nullable
    public final Bitmap seasonIcon;

    @NotNull
    public final String seasonName;

    @NotNull
    public final String seasonTimer;

    @NotNull
    public final String seasonTimerHeader;
    public final byte selectedCategoryTask;
    public final long selectedColor;

    @NotNull
    public final List<HolidayEventsSettings> settingsFromJson;
    public final long shadowColorForEventIcon;

    @Nullable
    public final Bitmap specialCategoryImageBitmap;

    @NotNull
    public final List<CommonTaskModel> specialTasksList;

    @NotNull
    public final List<HolidayEventsTasks> tasksFromJson;

    @NotNull
    public final AnnotatedString textYouGetCurrency;

    @NotNull
    public final AnnotatedString textYouSpendBC;

    @Nullable
    public final Bitmap treeImage;

    @NotNull
    public final List<CommonTutorialTextsWithImage> tutorialAttachment;

    public /* synthetic */ HolidayEventsUiState(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4, Bitmap bitmap5, Bitmap bitmap6, int i, int i2, int i3, List list, List list2, HolidayEventsScreenEnum holidayEventsScreenEnum, @StringRes int i4, List list3, byte b, List list4, List list5, Bitmap bitmap7, Bitmap bitmap8, long j, boolean z, int i5, int i6, List list6, List list7, List list8, Bitmap bitmap9, List list9, String str, AnnotatedString annotatedString, AnnotatedString annotatedString2, Bitmap bitmap10, Bitmap bitmap11, int i7, int i8, int i9, HolidayEventsGainBlockData holidayEventsGainBlockData, CommonRewardModel commonRewardModel, long j2, long j3, long j4, String str2, String str3, String str4, int i10, int i11, int i12, List list10, List list11, Bitmap bitmap12, List list12, String str5, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bitmap, bitmap2, bitmap3, bitmap4, bitmap5, bitmap6, i, i2, i3, list, list2, holidayEventsScreenEnum, i4, list3, b, list4, list5, bitmap7, bitmap8, j, z, i5, i6, list6, list7, list8, bitmap9, list9, str, annotatedString, annotatedString2, bitmap10, bitmap11, i7, i8, i9, holidayEventsGainBlockData, commonRewardModel, j2, j3, j4, str2, str3, str4, i10, i11, i12, list10, list11, bitmap12, list12, str5, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11);
    }

    /* renamed from: copy-f2njTl4$default */
    public static /* synthetic */ HolidayEventsUiState m14505copyf2njTl4$default(HolidayEventsUiState holidayEventsUiState, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4, Bitmap bitmap5, Bitmap bitmap6, int i, int i2, int i3, List list, List list2, HolidayEventsScreenEnum holidayEventsScreenEnum, int i4, List list3, byte b, List list4, List list5, Bitmap bitmap7, Bitmap bitmap8, long j, boolean z, int i5, int i6, List list6, List list7, List list8, Bitmap bitmap9, List list9, String str, AnnotatedString annotatedString, AnnotatedString annotatedString2, Bitmap bitmap10, Bitmap bitmap11, int i7, int i8, int i9, HolidayEventsGainBlockData holidayEventsGainBlockData, CommonRewardModel commonRewardModel, long j2, long j3, long j4, String str2, String str3, String str4, int i10, int i11, int i12, List list10, List list11, Bitmap bitmap12, List list12, String str5, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, int i13, int i14, Object obj) {
        Bitmap bitmap13 = (i13 & 1) != 0 ? holidayEventsUiState.backgroundBitmap : bitmap;
        Bitmap bitmap14 = (i13 & 2) != 0 ? holidayEventsUiState.bpOfferImage : bitmap2;
        Bitmap bitmap15 = (i13 & 4) != 0 ? holidayEventsUiState.offerImage : bitmap3;
        Bitmap bitmap16 = (i13 & 8) != 0 ? holidayEventsUiState.treeImage : bitmap4;
        Bitmap bitmap17 = (i13 & 16) != 0 ? holidayEventsUiState.seasonCurrencyBitmap : bitmap5;
        Bitmap bitmap18 = (i13 & 32) != 0 ? holidayEventsUiState.lastChanceBitmap : bitmap6;
        int i15 = (i13 & 64) != 0 ? holidayEventsUiState.offerCost : i;
        int i16 = (i13 & 128) != 0 ? holidayEventsUiState.offerValue : i2;
        int i17 = (i13 & 256) != 0 ? holidayEventsUiState.bcValue : i3;
        List list13 = (i13 & 512) != 0 ? holidayEventsUiState.listOfGames : list;
        List list14 = (i13 & 1024) != 0 ? holidayEventsUiState.listOfButtons : list2;
        HolidayEventsScreenEnum holidayEventsScreenEnum2 = (i13 & 2048) != 0 ? holidayEventsUiState.currentScreen : holidayEventsScreenEnum;
        return holidayEventsUiState.m14510copyf2njTl4(bitmap13, bitmap14, bitmap15, bitmap16, bitmap17, bitmap18, i15, i16, i17, list13, list14, holidayEventsScreenEnum2, (i13 & 4096) != 0 ? holidayEventsUiState.buttonPlayText : i4, (i13 & 8192) != 0 ? holidayEventsUiState.tasksFromJson : list3, (i13 & 16384) != 0 ? holidayEventsUiState.selectedCategoryTask : b, (i13 & 32768) != 0 ? holidayEventsUiState.specialTasksList : list4, (i13 & 65536) != 0 ? holidayEventsUiState.dailyTasksList : list5, (i13 & 131072) != 0 ? holidayEventsUiState.specialCategoryImageBitmap : bitmap7, (i13 & 262144) != 0 ? holidayEventsUiState.dailyCategoryImageBitmap : bitmap8, (i13 & 524288) != 0 ? holidayEventsUiState.selectedColor : j, (i13 & 1048576) != 0 ? holidayEventsUiState.isTopListSelected : z, (i13 & 2097152) != 0 ? holidayEventsUiState.rewardLevel : i5, (i13 & 4194304) != 0 ? holidayEventsUiState.gainLevel : i6, (i13 & 8388608) != 0 ? holidayEventsUiState.limitUpgrades : list6, (i13 & 16777216) != 0 ? holidayEventsUiState.eventLevels : list7, (i13 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? holidayEventsUiState.settingsFromJson : list8, (i13 & 67108864) != 0 ? holidayEventsUiState.seasonIcon : bitmap9, (i13 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? holidayEventsUiState.rewardsList : list9, (i13 & 268435456) != 0 ? holidayEventsUiState.enteredTextBuyDarkEnergy : str, (i13 & 536870912) != 0 ? holidayEventsUiState.textYouSpendBC : annotatedString, (i13 & 1073741824) != 0 ? holidayEventsUiState.textYouGetCurrency : annotatedString2, (i13 & Integer.MIN_VALUE) != 0 ? holidayEventsUiState.rewardsBitmapImage : bitmap10, (i14 & 1) != 0 ? holidayEventsUiState.gainBitmapImage : bitmap11, (i14 & 2) != 0 ? holidayEventsUiState.bpDailyLimit : i7, (i14 & 4) != 0 ? holidayEventsUiState.bpDailyMultiplier : i8, (i14 & 8) != 0 ? holidayEventsUiState.dailyCurrencyValue : i9, (i14 & 16) != 0 ? holidayEventsUiState.holidayEventsGainBlockData : holidayEventsGainBlockData, (i14 & 32) != 0 ? holidayEventsUiState.rewardItemForDialog : commonRewardModel, (i14 & 64) != 0 ? holidayEventsUiState.seasonColor : j2, (i14 & 128) != 0 ? holidayEventsUiState.seasonColor2 : j3, (i14 & 256) != 0 ? holidayEventsUiState.shadowColorForEventIcon : j4, (i14 & 512) != 0 ? holidayEventsUiState.seasonName : str2, (i14 & 1024) != 0 ? holidayEventsUiState.seasonTimer : str3, (i14 & 2048) != 0 ? holidayEventsUiState.seasonTimerHeader : str4, (i14 & 4096) != 0 ? holidayEventsUiState.currentProgressOfProgressBar : i10, (i14 & 8192) != 0 ? holidayEventsUiState.maxProgressOfProgressBar : i11, (i14 & 16384) != 0 ? holidayEventsUiState.myPlaceInRating : i12, (i14 & 32768) != 0 ? holidayEventsUiState.ratingList : list10, (i14 & 65536) != 0 ? holidayEventsUiState.ratingRewardsFromJson : list11, (i14 & 131072) != 0 ? holidayEventsUiState.myRatingBgImage : bitmap12, (i14 & 262144) != 0 ? holidayEventsUiState.tutorialAttachment : list12, (i14 & 524288) != 0 ? holidayEventsUiState.gameQueuePlayers : str5, (i14 & 1048576) != 0 ? holidayEventsUiState.isNeedToShowLastChance : z2, (i14 & 2097152) != 0 ? holidayEventsUiState.isTopTasksHaveNotification : z3, (i14 & 4194304) != 0 ? holidayEventsUiState.isBottomTasksHaveNotification : z4, (i14 & 8388608) != 0 ? holidayEventsUiState.isWithPremium : z5, (i14 & 16777216) != 0 ? holidayEventsUiState.isNeedToShowDialogNotEnoughBc : z6, (i14 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? holidayEventsUiState.isNeedToShowDialogWaitForPlayers : z7, (i14 & 67108864) != 0 ? holidayEventsUiState.isNeedToShowTutorial : z8, (i14 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? holidayEventsUiState.isNeedToShowDialogPreviewReward : z9, (i14 & 268435456) != 0 ? holidayEventsUiState.isNeedToShowDialogBuyCurrency : z10, (i14 & 536870912) != 0 ? holidayEventsUiState.isNeedClose : z11);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Bitmap getBackgroundBitmap() {
        return this.backgroundBitmap;
    }

    @NotNull
    public final List<HolidayEventsGameItemModel> component10() {
        return this.listOfGames;
    }

    @NotNull
    public final List<CommonButtonCategory> component11() {
        return this.listOfButtons;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final HolidayEventsScreenEnum getCurrentScreen() {
        return this.currentScreen;
    }

    /* renamed from: component13, reason: from getter */
    public final int getButtonPlayText() {
        return this.buttonPlayText;
    }

    @NotNull
    public final List<HolidayEventsTasks> component14() {
        return this.tasksFromJson;
    }

    /* renamed from: component15, reason: from getter */
    public final byte getSelectedCategoryTask() {
        return this.selectedCategoryTask;
    }

    @NotNull
    public final List<CommonTaskModel> component16() {
        return this.specialTasksList;
    }

    @NotNull
    public final List<CommonTaskModel> component17() {
        return this.dailyTasksList;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Bitmap getSpecialCategoryImageBitmap() {
        return this.specialCategoryImageBitmap;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Bitmap getDailyCategoryImageBitmap() {
        return this.dailyCategoryImageBitmap;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Bitmap getBpOfferImage() {
        return this.bpOfferImage;
    }

    /* renamed from: component20-0d7_KjU, reason: from getter */
    public final long getSelectedColor() {
        return this.selectedColor;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getIsTopListSelected() {
        return this.isTopListSelected;
    }

    /* renamed from: component22, reason: from getter */
    public final int getRewardLevel() {
        return this.rewardLevel;
    }

    /* renamed from: component23, reason: from getter */
    public final int getGainLevel() {
        return this.gainLevel;
    }

    @NotNull
    public final List<HolidayEventsLimitUpgrades> component24() {
        return this.limitUpgrades;
    }

    @NotNull
    public final List<HolidayEventsEventLevel> component25() {
        return this.eventLevels;
    }

    @NotNull
    public final List<HolidayEventsSettings> component26() {
        return this.settingsFromJson;
    }

    @Nullable
    /* renamed from: component27, reason: from getter */
    public final Bitmap getSeasonIcon() {
        return this.seasonIcon;
    }

    @NotNull
    public final List<CommonRewardModel> component28() {
        return this.rewardsList;
    }

    @NotNull
    /* renamed from: component29, reason: from getter */
    public final String getEnteredTextBuyDarkEnergy() {
        return this.enteredTextBuyDarkEnergy;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Bitmap getOfferImage() {
        return this.offerImage;
    }

    @NotNull
    /* renamed from: component30, reason: from getter */
    public final AnnotatedString getTextYouSpendBC() {
        return this.textYouSpendBC;
    }

    @NotNull
    /* renamed from: component31, reason: from getter */
    public final AnnotatedString getTextYouGetCurrency() {
        return this.textYouGetCurrency;
    }

    @Nullable
    /* renamed from: component32, reason: from getter */
    public final Bitmap getRewardsBitmapImage() {
        return this.rewardsBitmapImage;
    }

    @Nullable
    /* renamed from: component33, reason: from getter */
    public final Bitmap getGainBitmapImage() {
        return this.gainBitmapImage;
    }

    /* renamed from: component34, reason: from getter */
    public final int getBpDailyLimit() {
        return this.bpDailyLimit;
    }

    /* renamed from: component35, reason: from getter */
    public final int getBpDailyMultiplier() {
        return this.bpDailyMultiplier;
    }

    /* renamed from: component36, reason: from getter */
    public final int getDailyCurrencyValue() {
        return this.dailyCurrencyValue;
    }

    @NotNull
    /* renamed from: component37, reason: from getter */
    public final HolidayEventsGainBlockData getHolidayEventsGainBlockData() {
        return this.holidayEventsGainBlockData;
    }

    @NotNull
    /* renamed from: component38, reason: from getter */
    public final CommonRewardModel getRewardItemForDialog() {
        return this.rewardItemForDialog;
    }

    /* renamed from: component39-0d7_KjU, reason: from getter */
    public final long getSeasonColor() {
        return this.seasonColor;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Bitmap getTreeImage() {
        return this.treeImage;
    }

    /* renamed from: component40-0d7_KjU, reason: from getter */
    public final long getSeasonColor2() {
        return this.seasonColor2;
    }

    /* renamed from: component41-0d7_KjU, reason: from getter */
    public final long getShadowColorForEventIcon() {
        return this.shadowColorForEventIcon;
    }

    @NotNull
    /* renamed from: component42, reason: from getter */
    public final String getSeasonName() {
        return this.seasonName;
    }

    @NotNull
    /* renamed from: component43, reason: from getter */
    public final String getSeasonTimer() {
        return this.seasonTimer;
    }

    @NotNull
    /* renamed from: component44, reason: from getter */
    public final String getSeasonTimerHeader() {
        return this.seasonTimerHeader;
    }

    /* renamed from: component45, reason: from getter */
    public final int getCurrentProgressOfProgressBar() {
        return this.currentProgressOfProgressBar;
    }

    /* renamed from: component46, reason: from getter */
    public final int getMaxProgressOfProgressBar() {
        return this.maxProgressOfProgressBar;
    }

    /* renamed from: component47, reason: from getter */
    public final int getMyPlaceInRating() {
        return this.myPlaceInRating;
    }

    @NotNull
    public final List<CommonRatingModel> component48() {
        return this.ratingList;
    }

    @NotNull
    public final List<HolidayEventsRatingRewards> component49() {
        return this.ratingRewardsFromJson;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Bitmap getSeasonCurrencyBitmap() {
        return this.seasonCurrencyBitmap;
    }

    @Nullable
    /* renamed from: component50, reason: from getter */
    public final Bitmap getMyRatingBgImage() {
        return this.myRatingBgImage;
    }

    @NotNull
    public final List<CommonTutorialTextsWithImage> component51() {
        return this.tutorialAttachment;
    }

    @NotNull
    /* renamed from: component52, reason: from getter */
    public final String getGameQueuePlayers() {
        return this.gameQueuePlayers;
    }

    /* renamed from: component53, reason: from getter */
    public final boolean getIsNeedToShowLastChance() {
        return this.isNeedToShowLastChance;
    }

    /* renamed from: component54, reason: from getter */
    public final boolean getIsTopTasksHaveNotification() {
        return this.isTopTasksHaveNotification;
    }

    /* renamed from: component55, reason: from getter */
    public final boolean getIsBottomTasksHaveNotification() {
        return this.isBottomTasksHaveNotification;
    }

    /* renamed from: component56, reason: from getter */
    public final boolean getIsWithPremium() {
        return this.isWithPremium;
    }

    /* renamed from: component57, reason: from getter */
    public final boolean getIsNeedToShowDialogNotEnoughBc() {
        return this.isNeedToShowDialogNotEnoughBc;
    }

    /* renamed from: component58, reason: from getter */
    public final boolean getIsNeedToShowDialogWaitForPlayers() {
        return this.isNeedToShowDialogWaitForPlayers;
    }

    /* renamed from: component59, reason: from getter */
    public final boolean getIsNeedToShowTutorial() {
        return this.isNeedToShowTutorial;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Bitmap getLastChanceBitmap() {
        return this.lastChanceBitmap;
    }

    /* renamed from: component60, reason: from getter */
    public final boolean getIsNeedToShowDialogPreviewReward() {
        return this.isNeedToShowDialogPreviewReward;
    }

    /* renamed from: component61, reason: from getter */
    public final boolean getIsNeedToShowDialogBuyCurrency() {
        return this.isNeedToShowDialogBuyCurrency;
    }

    /* renamed from: component62, reason: from getter */
    public final boolean getIsNeedClose() {
        return this.isNeedClose;
    }

    /* renamed from: component7, reason: from getter */
    public final int getOfferCost() {
        return this.offerCost;
    }

    /* renamed from: component8, reason: from getter */
    public final int getOfferValue() {
        return this.offerValue;
    }

    /* renamed from: component9, reason: from getter */
    public final int getBcValue() {
        return this.bcValue;
    }

    @NotNull
    /* renamed from: copy-f2njTl4 */
    public final HolidayEventsUiState m14510copyf2njTl4(@Nullable Bitmap backgroundBitmap, @Nullable Bitmap bpOfferImage, @Nullable Bitmap offerImage, @Nullable Bitmap treeImage, @Nullable Bitmap seasonCurrencyBitmap, @Nullable Bitmap lastChanceBitmap, int offerCost, int offerValue, int bcValue, @NotNull List<HolidayEventsGameItemModel> listOfGames, @NotNull List<CommonButtonCategory> listOfButtons, @NotNull HolidayEventsScreenEnum currentScreen, @StringRes int buttonPlayText, @NotNull List<HolidayEventsTasks> tasksFromJson, byte selectedCategoryTask, @NotNull List<CommonTaskModel> specialTasksList, @NotNull List<CommonTaskModel> dailyTasksList, @Nullable Bitmap specialCategoryImageBitmap, @Nullable Bitmap dailyCategoryImageBitmap, long selectedColor, boolean isTopListSelected, int rewardLevel, int gainLevel, @NotNull List<HolidayEventsLimitUpgrades> limitUpgrades, @NotNull List<HolidayEventsEventLevel> eventLevels, @NotNull List<HolidayEventsSettings> settingsFromJson, @Nullable Bitmap seasonIcon, @NotNull List<CommonRewardModel> rewardsList, @NotNull String enteredTextBuyDarkEnergy, @NotNull AnnotatedString textYouSpendBC, @NotNull AnnotatedString textYouGetCurrency, @Nullable Bitmap rewardsBitmapImage, @Nullable Bitmap gainBitmapImage, int bpDailyLimit, int bpDailyMultiplier, int dailyCurrencyValue, @NotNull HolidayEventsGainBlockData holidayEventsGainBlockData, @NotNull CommonRewardModel rewardItemForDialog, long seasonColor, long seasonColor2, long shadowColorForEventIcon, @NotNull String seasonName, @NotNull String seasonTimer, @NotNull String seasonTimerHeader, int currentProgressOfProgressBar, int maxProgressOfProgressBar, int myPlaceInRating, @NotNull List<CommonRatingModel> ratingList, @NotNull List<HolidayEventsRatingRewards> ratingRewardsFromJson, @Nullable Bitmap myRatingBgImage, @NotNull List<CommonTutorialTextsWithImage> tutorialAttachment, @NotNull String gameQueuePlayers, boolean isNeedToShowLastChance, boolean isTopTasksHaveNotification, boolean isBottomTasksHaveNotification, boolean isWithPremium, boolean isNeedToShowDialogNotEnoughBc, boolean isNeedToShowDialogWaitForPlayers, boolean isNeedToShowTutorial, boolean isNeedToShowDialogPreviewReward, boolean isNeedToShowDialogBuyCurrency, boolean isNeedClose) {
        Intrinsics.checkNotNullParameter(listOfGames, "listOfGames");
        Intrinsics.checkNotNullParameter(listOfButtons, "listOfButtons");
        Intrinsics.checkNotNullParameter(currentScreen, "currentScreen");
        Intrinsics.checkNotNullParameter(tasksFromJson, "tasksFromJson");
        Intrinsics.checkNotNullParameter(specialTasksList, "specialTasksList");
        Intrinsics.checkNotNullParameter(dailyTasksList, "dailyTasksList");
        Intrinsics.checkNotNullParameter(limitUpgrades, "limitUpgrades");
        Intrinsics.checkNotNullParameter(eventLevels, "eventLevels");
        Intrinsics.checkNotNullParameter(settingsFromJson, "settingsFromJson");
        Intrinsics.checkNotNullParameter(rewardsList, "rewardsList");
        Intrinsics.checkNotNullParameter(enteredTextBuyDarkEnergy, "enteredTextBuyDarkEnergy");
        Intrinsics.checkNotNullParameter(textYouSpendBC, "textYouSpendBC");
        Intrinsics.checkNotNullParameter(textYouGetCurrency, "textYouGetCurrency");
        Intrinsics.checkNotNullParameter(holidayEventsGainBlockData, "holidayEventsGainBlockData");
        Intrinsics.checkNotNullParameter(rewardItemForDialog, "rewardItemForDialog");
        Intrinsics.checkNotNullParameter(seasonName, "seasonName");
        Intrinsics.checkNotNullParameter(seasonTimer, "seasonTimer");
        Intrinsics.checkNotNullParameter(seasonTimerHeader, "seasonTimerHeader");
        Intrinsics.checkNotNullParameter(ratingList, "ratingList");
        Intrinsics.checkNotNullParameter(ratingRewardsFromJson, "ratingRewardsFromJson");
        Intrinsics.checkNotNullParameter(tutorialAttachment, "tutorialAttachment");
        Intrinsics.checkNotNullParameter(gameQueuePlayers, "gameQueuePlayers");
        return new HolidayEventsUiState(backgroundBitmap, bpOfferImage, offerImage, treeImage, seasonCurrencyBitmap, lastChanceBitmap, offerCost, offerValue, bcValue, listOfGames, listOfButtons, currentScreen, buttonPlayText, tasksFromJson, selectedCategoryTask, specialTasksList, dailyTasksList, specialCategoryImageBitmap, dailyCategoryImageBitmap, selectedColor, isTopListSelected, rewardLevel, gainLevel, limitUpgrades, eventLevels, settingsFromJson, seasonIcon, rewardsList, enteredTextBuyDarkEnergy, textYouSpendBC, textYouGetCurrency, rewardsBitmapImage, gainBitmapImage, bpDailyLimit, bpDailyMultiplier, dailyCurrencyValue, holidayEventsGainBlockData, rewardItemForDialog, seasonColor, seasonColor2, shadowColorForEventIcon, seasonName, seasonTimer, seasonTimerHeader, currentProgressOfProgressBar, maxProgressOfProgressBar, myPlaceInRating, ratingList, ratingRewardsFromJson, myRatingBgImage, tutorialAttachment, gameQueuePlayers, isNeedToShowLastChance, isTopTasksHaveNotification, isBottomTasksHaveNotification, isWithPremium, isNeedToShowDialogNotEnoughBc, isNeedToShowDialogWaitForPlayers, isNeedToShowTutorial, isNeedToShowDialogPreviewReward, isNeedToShowDialogBuyCurrency, isNeedClose, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HolidayEventsUiState)) {
            return false;
        }
        HolidayEventsUiState holidayEventsUiState = (HolidayEventsUiState) other;
        return Intrinsics.areEqual(this.backgroundBitmap, holidayEventsUiState.backgroundBitmap) && Intrinsics.areEqual(this.bpOfferImage, holidayEventsUiState.bpOfferImage) && Intrinsics.areEqual(this.offerImage, holidayEventsUiState.offerImage) && Intrinsics.areEqual(this.treeImage, holidayEventsUiState.treeImage) && Intrinsics.areEqual(this.seasonCurrencyBitmap, holidayEventsUiState.seasonCurrencyBitmap) && Intrinsics.areEqual(this.lastChanceBitmap, holidayEventsUiState.lastChanceBitmap) && this.offerCost == holidayEventsUiState.offerCost && this.offerValue == holidayEventsUiState.offerValue && this.bcValue == holidayEventsUiState.bcValue && Intrinsics.areEqual(this.listOfGames, holidayEventsUiState.listOfGames) && Intrinsics.areEqual(this.listOfButtons, holidayEventsUiState.listOfButtons) && this.currentScreen == holidayEventsUiState.currentScreen && this.buttonPlayText == holidayEventsUiState.buttonPlayText && Intrinsics.areEqual(this.tasksFromJson, holidayEventsUiState.tasksFromJson) && this.selectedCategoryTask == holidayEventsUiState.selectedCategoryTask && Intrinsics.areEqual(this.specialTasksList, holidayEventsUiState.specialTasksList) && Intrinsics.areEqual(this.dailyTasksList, holidayEventsUiState.dailyTasksList) && Intrinsics.areEqual(this.specialCategoryImageBitmap, holidayEventsUiState.specialCategoryImageBitmap) && Intrinsics.areEqual(this.dailyCategoryImageBitmap, holidayEventsUiState.dailyCategoryImageBitmap) && Color.m11341equalsimpl0(this.selectedColor, holidayEventsUiState.selectedColor) && this.isTopListSelected == holidayEventsUiState.isTopListSelected && this.rewardLevel == holidayEventsUiState.rewardLevel && this.gainLevel == holidayEventsUiState.gainLevel && Intrinsics.areEqual(this.limitUpgrades, holidayEventsUiState.limitUpgrades) && Intrinsics.areEqual(this.eventLevels, holidayEventsUiState.eventLevels) && Intrinsics.areEqual(this.settingsFromJson, holidayEventsUiState.settingsFromJson) && Intrinsics.areEqual(this.seasonIcon, holidayEventsUiState.seasonIcon) && Intrinsics.areEqual(this.rewardsList, holidayEventsUiState.rewardsList) && Intrinsics.areEqual(this.enteredTextBuyDarkEnergy, holidayEventsUiState.enteredTextBuyDarkEnergy) && Intrinsics.areEqual(this.textYouSpendBC, holidayEventsUiState.textYouSpendBC) && Intrinsics.areEqual(this.textYouGetCurrency, holidayEventsUiState.textYouGetCurrency) && Intrinsics.areEqual(this.rewardsBitmapImage, holidayEventsUiState.rewardsBitmapImage) && Intrinsics.areEqual(this.gainBitmapImage, holidayEventsUiState.gainBitmapImage) && this.bpDailyLimit == holidayEventsUiState.bpDailyLimit && this.bpDailyMultiplier == holidayEventsUiState.bpDailyMultiplier && this.dailyCurrencyValue == holidayEventsUiState.dailyCurrencyValue && Intrinsics.areEqual(this.holidayEventsGainBlockData, holidayEventsUiState.holidayEventsGainBlockData) && Intrinsics.areEqual(this.rewardItemForDialog, holidayEventsUiState.rewardItemForDialog) && Color.m11341equalsimpl0(this.seasonColor, holidayEventsUiState.seasonColor) && Color.m11341equalsimpl0(this.seasonColor2, holidayEventsUiState.seasonColor2) && Color.m11341equalsimpl0(this.shadowColorForEventIcon, holidayEventsUiState.shadowColorForEventIcon) && Intrinsics.areEqual(this.seasonName, holidayEventsUiState.seasonName) && Intrinsics.areEqual(this.seasonTimer, holidayEventsUiState.seasonTimer) && Intrinsics.areEqual(this.seasonTimerHeader, holidayEventsUiState.seasonTimerHeader) && this.currentProgressOfProgressBar == holidayEventsUiState.currentProgressOfProgressBar && this.maxProgressOfProgressBar == holidayEventsUiState.maxProgressOfProgressBar && this.myPlaceInRating == holidayEventsUiState.myPlaceInRating && Intrinsics.areEqual(this.ratingList, holidayEventsUiState.ratingList) && Intrinsics.areEqual(this.ratingRewardsFromJson, holidayEventsUiState.ratingRewardsFromJson) && Intrinsics.areEqual(this.myRatingBgImage, holidayEventsUiState.myRatingBgImage) && Intrinsics.areEqual(this.tutorialAttachment, holidayEventsUiState.tutorialAttachment) && Intrinsics.areEqual(this.gameQueuePlayers, holidayEventsUiState.gameQueuePlayers) && this.isNeedToShowLastChance == holidayEventsUiState.isNeedToShowLastChance && this.isTopTasksHaveNotification == holidayEventsUiState.isTopTasksHaveNotification && this.isBottomTasksHaveNotification == holidayEventsUiState.isBottomTasksHaveNotification && this.isWithPremium == holidayEventsUiState.isWithPremium && this.isNeedToShowDialogNotEnoughBc == holidayEventsUiState.isNeedToShowDialogNotEnoughBc && this.isNeedToShowDialogWaitForPlayers == holidayEventsUiState.isNeedToShowDialogWaitForPlayers && this.isNeedToShowTutorial == holidayEventsUiState.isNeedToShowTutorial && this.isNeedToShowDialogPreviewReward == holidayEventsUiState.isNeedToShowDialogPreviewReward && this.isNeedToShowDialogBuyCurrency == holidayEventsUiState.isNeedToShowDialogBuyCurrency && this.isNeedClose == holidayEventsUiState.isNeedClose;
    }

    public int hashCode() {
        Bitmap bitmap = this.backgroundBitmap;
        int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        Bitmap bitmap2 = this.bpOfferImage;
        int iHashCode2 = (iHashCode + (bitmap2 == null ? 0 : bitmap2.hashCode())) * 31;
        Bitmap bitmap3 = this.offerImage;
        int iHashCode3 = (iHashCode2 + (bitmap3 == null ? 0 : bitmap3.hashCode())) * 31;
        Bitmap bitmap4 = this.treeImage;
        int iHashCode4 = (iHashCode3 + (bitmap4 == null ? 0 : bitmap4.hashCode())) * 31;
        Bitmap bitmap5 = this.seasonCurrencyBitmap;
        int iHashCode5 = (iHashCode4 + (bitmap5 == null ? 0 : bitmap5.hashCode())) * 31;
        Bitmap bitmap6 = this.lastChanceBitmap;
        int iHashCode6 = (((((((((((((((((((((((iHashCode5 + (bitmap6 == null ? 0 : bitmap6.hashCode())) * 31) + Integer.hashCode(this.offerCost)) * 31) + Integer.hashCode(this.offerValue)) * 31) + Integer.hashCode(this.bcValue)) * 31) + this.listOfGames.hashCode()) * 31) + this.listOfButtons.hashCode()) * 31) + this.currentScreen.hashCode()) * 31) + Integer.hashCode(this.buttonPlayText)) * 31) + this.tasksFromJson.hashCode()) * 31) + Byte.hashCode(this.selectedCategoryTask)) * 31) + this.specialTasksList.hashCode()) * 31) + this.dailyTasksList.hashCode()) * 31;
        Bitmap bitmap7 = this.specialCategoryImageBitmap;
        int iHashCode7 = (iHashCode6 + (bitmap7 == null ? 0 : bitmap7.hashCode())) * 31;
        Bitmap bitmap8 = this.dailyCategoryImageBitmap;
        int iHashCode8 = (((((((((((((((iHashCode7 + (bitmap8 == null ? 0 : bitmap8.hashCode())) * 31) + Color.m11347hashCodeimpl(this.selectedColor)) * 31) + Boolean.hashCode(this.isTopListSelected)) * 31) + Integer.hashCode(this.rewardLevel)) * 31) + Integer.hashCode(this.gainLevel)) * 31) + this.limitUpgrades.hashCode()) * 31) + this.eventLevels.hashCode()) * 31) + this.settingsFromJson.hashCode()) * 31;
        Bitmap bitmap9 = this.seasonIcon;
        int iHashCode9 = (((((((((iHashCode8 + (bitmap9 == null ? 0 : bitmap9.hashCode())) * 31) + this.rewardsList.hashCode()) * 31) + this.enteredTextBuyDarkEnergy.hashCode()) * 31) + this.textYouSpendBC.hashCode()) * 31) + this.textYouGetCurrency.hashCode()) * 31;
        Bitmap bitmap10 = this.rewardsBitmapImage;
        int iHashCode10 = (iHashCode9 + (bitmap10 == null ? 0 : bitmap10.hashCode())) * 31;
        Bitmap bitmap11 = this.gainBitmapImage;
        int iHashCode11 = (((((((((((((((((((((((((((((((((iHashCode10 + (bitmap11 == null ? 0 : bitmap11.hashCode())) * 31) + Integer.hashCode(this.bpDailyLimit)) * 31) + Integer.hashCode(this.bpDailyMultiplier)) * 31) + Integer.hashCode(this.dailyCurrencyValue)) * 31) + this.holidayEventsGainBlockData.hashCode()) * 31) + this.rewardItemForDialog.hashCode()) * 31) + Color.m11347hashCodeimpl(this.seasonColor)) * 31) + Color.m11347hashCodeimpl(this.seasonColor2)) * 31) + Color.m11347hashCodeimpl(this.shadowColorForEventIcon)) * 31) + this.seasonName.hashCode()) * 31) + this.seasonTimer.hashCode()) * 31) + this.seasonTimerHeader.hashCode()) * 31) + Integer.hashCode(this.currentProgressOfProgressBar)) * 31) + Integer.hashCode(this.maxProgressOfProgressBar)) * 31) + Integer.hashCode(this.myPlaceInRating)) * 31) + this.ratingList.hashCode()) * 31) + this.ratingRewardsFromJson.hashCode()) * 31;
        Bitmap bitmap12 = this.myRatingBgImage;
        return ((((((((((((((((((((((((iHashCode11 + (bitmap12 != null ? bitmap12.hashCode() : 0)) * 31) + this.tutorialAttachment.hashCode()) * 31) + this.gameQueuePlayers.hashCode()) * 31) + Boolean.hashCode(this.isNeedToShowLastChance)) * 31) + Boolean.hashCode(this.isTopTasksHaveNotification)) * 31) + Boolean.hashCode(this.isBottomTasksHaveNotification)) * 31) + Boolean.hashCode(this.isWithPremium)) * 31) + Boolean.hashCode(this.isNeedToShowDialogNotEnoughBc)) * 31) + Boolean.hashCode(this.isNeedToShowDialogWaitForPlayers)) * 31) + Boolean.hashCode(this.isNeedToShowTutorial)) * 31) + Boolean.hashCode(this.isNeedToShowDialogPreviewReward)) * 31) + Boolean.hashCode(this.isNeedToShowDialogBuyCurrency)) * 31) + Boolean.hashCode(this.isNeedClose);
    }

    @NotNull
    public String toString() {
        Bitmap bitmap = this.backgroundBitmap;
        Bitmap bitmap2 = this.bpOfferImage;
        Bitmap bitmap3 = this.offerImage;
        Bitmap bitmap4 = this.treeImage;
        Bitmap bitmap5 = this.seasonCurrencyBitmap;
        Bitmap bitmap6 = this.lastChanceBitmap;
        int i = this.offerCost;
        int i2 = this.offerValue;
        int i3 = this.bcValue;
        List<HolidayEventsGameItemModel> list = this.listOfGames;
        List<CommonButtonCategory> list2 = this.listOfButtons;
        HolidayEventsScreenEnum holidayEventsScreenEnum = this.currentScreen;
        int i4 = this.buttonPlayText;
        List<HolidayEventsTasks> list3 = this.tasksFromJson;
        byte b = this.selectedCategoryTask;
        List<CommonTaskModel> list4 = this.specialTasksList;
        List<CommonTaskModel> list5 = this.dailyTasksList;
        Bitmap bitmap7 = this.specialCategoryImageBitmap;
        Bitmap bitmap8 = this.dailyCategoryImageBitmap;
        String strM11348toStringimpl = Color.m11348toStringimpl(this.selectedColor);
        boolean z = this.isTopListSelected;
        int i5 = this.rewardLevel;
        int i6 = this.gainLevel;
        List<HolidayEventsLimitUpgrades> list6 = this.limitUpgrades;
        List<HolidayEventsEventLevel> list7 = this.eventLevels;
        List<HolidayEventsSettings> list8 = this.settingsFromJson;
        Bitmap bitmap9 = this.seasonIcon;
        List<CommonRewardModel> list9 = this.rewardsList;
        String str = this.enteredTextBuyDarkEnergy;
        AnnotatedString annotatedString = this.textYouSpendBC;
        AnnotatedString annotatedString2 = this.textYouGetCurrency;
        return "HolidayEventsUiState(backgroundBitmap=" + bitmap + ", bpOfferImage=" + bitmap2 + ", offerImage=" + bitmap3 + ", treeImage=" + bitmap4 + ", seasonCurrencyBitmap=" + bitmap5 + ", lastChanceBitmap=" + bitmap6 + ", offerCost=" + i + ", offerValue=" + i2 + ", bcValue=" + i3 + ", listOfGames=" + list + ", listOfButtons=" + list2 + ", currentScreen=" + holidayEventsScreenEnum + ", buttonPlayText=" + i4 + ", tasksFromJson=" + list3 + ", selectedCategoryTask=" + ((int) b) + ", specialTasksList=" + list4 + ", dailyTasksList=" + list5 + ", specialCategoryImageBitmap=" + bitmap7 + ", dailyCategoryImageBitmap=" + bitmap8 + ", selectedColor=" + strM11348toStringimpl + ", isTopListSelected=" + z + ", rewardLevel=" + i5 + ", gainLevel=" + i6 + ", limitUpgrades=" + list6 + ", eventLevels=" + list7 + ", settingsFromJson=" + list8 + ", seasonIcon=" + bitmap9 + ", rewardsList=" + list9 + ", enteredTextBuyDarkEnergy=" + str + ", textYouSpendBC=" + ((Object) annotatedString) + ", textYouGetCurrency=" + ((Object) annotatedString2) + ", rewardsBitmapImage=" + this.rewardsBitmapImage + ", gainBitmapImage=" + this.gainBitmapImage + ", bpDailyLimit=" + this.bpDailyLimit + ", bpDailyMultiplier=" + this.bpDailyMultiplier + ", dailyCurrencyValue=" + this.dailyCurrencyValue + ", holidayEventsGainBlockData=" + this.holidayEventsGainBlockData + ", rewardItemForDialog=" + this.rewardItemForDialog + ", seasonColor=" + Color.m11348toStringimpl(this.seasonColor) + ", seasonColor2=" + Color.m11348toStringimpl(this.seasonColor2) + ", shadowColorForEventIcon=" + Color.m11348toStringimpl(this.shadowColorForEventIcon) + ", seasonName=" + this.seasonName + ", seasonTimer=" + this.seasonTimer + ", seasonTimerHeader=" + this.seasonTimerHeader + ", currentProgressOfProgressBar=" + this.currentProgressOfProgressBar + ", maxProgressOfProgressBar=" + this.maxProgressOfProgressBar + ", myPlaceInRating=" + this.myPlaceInRating + ", ratingList=" + this.ratingList + ", ratingRewardsFromJson=" + this.ratingRewardsFromJson + ", myRatingBgImage=" + this.myRatingBgImage + ", tutorialAttachment=" + this.tutorialAttachment + ", gameQueuePlayers=" + this.gameQueuePlayers + ", isNeedToShowLastChance=" + this.isNeedToShowLastChance + ", isTopTasksHaveNotification=" + this.isTopTasksHaveNotification + ", isBottomTasksHaveNotification=" + this.isBottomTasksHaveNotification + ", isWithPremium=" + this.isWithPremium + ", isNeedToShowDialogNotEnoughBc=" + this.isNeedToShowDialogNotEnoughBc + ", isNeedToShowDialogWaitForPlayers=" + this.isNeedToShowDialogWaitForPlayers + ", isNeedToShowTutorial=" + this.isNeedToShowTutorial + ", isNeedToShowDialogPreviewReward=" + this.isNeedToShowDialogPreviewReward + ", isNeedToShowDialogBuyCurrency=" + this.isNeedToShowDialogBuyCurrency + ", isNeedClose=" + this.isNeedClose + ")";
    }

    public HolidayEventsUiState(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4, Bitmap bitmap5, Bitmap bitmap6, int i, int i2, int i3, List<HolidayEventsGameItemModel> listOfGames, List<CommonButtonCategory> listOfButtons, HolidayEventsScreenEnum currentScreen, int i4, List<HolidayEventsTasks> tasksFromJson, byte b, List<CommonTaskModel> specialTasksList, List<CommonTaskModel> dailyTasksList, Bitmap bitmap7, Bitmap bitmap8, long j, boolean z, int i5, int i6, List<HolidayEventsLimitUpgrades> limitUpgrades, List<HolidayEventsEventLevel> eventLevels, List<HolidayEventsSettings> settingsFromJson, Bitmap bitmap9, List<CommonRewardModel> rewardsList, String enteredTextBuyDarkEnergy, AnnotatedString textYouSpendBC, AnnotatedString textYouGetCurrency, Bitmap bitmap10, Bitmap bitmap11, int i7, int i8, int i9, HolidayEventsGainBlockData holidayEventsGainBlockData, CommonRewardModel rewardItemForDialog, long j2, long j3, long j4, String seasonName, String seasonTimer, String seasonTimerHeader, int i10, int i11, int i12, List<CommonRatingModel> ratingList, List<HolidayEventsRatingRewards> ratingRewardsFromJson, Bitmap bitmap12, List<CommonTutorialTextsWithImage> tutorialAttachment, String gameQueuePlayers, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(listOfGames, "listOfGames");
        Intrinsics.checkNotNullParameter(listOfButtons, "listOfButtons");
        Intrinsics.checkNotNullParameter(currentScreen, "currentScreen");
        Intrinsics.checkNotNullParameter(tasksFromJson, "tasksFromJson");
        Intrinsics.checkNotNullParameter(specialTasksList, "specialTasksList");
        Intrinsics.checkNotNullParameter(dailyTasksList, "dailyTasksList");
        Intrinsics.checkNotNullParameter(limitUpgrades, "limitUpgrades");
        Intrinsics.checkNotNullParameter(eventLevels, "eventLevels");
        Intrinsics.checkNotNullParameter(settingsFromJson, "settingsFromJson");
        Intrinsics.checkNotNullParameter(rewardsList, "rewardsList");
        Intrinsics.checkNotNullParameter(enteredTextBuyDarkEnergy, "enteredTextBuyDarkEnergy");
        Intrinsics.checkNotNullParameter(textYouSpendBC, "textYouSpendBC");
        Intrinsics.checkNotNullParameter(textYouGetCurrency, "textYouGetCurrency");
        Intrinsics.checkNotNullParameter(holidayEventsGainBlockData, "holidayEventsGainBlockData");
        Intrinsics.checkNotNullParameter(rewardItemForDialog, "rewardItemForDialog");
        Intrinsics.checkNotNullParameter(seasonName, "seasonName");
        Intrinsics.checkNotNullParameter(seasonTimer, "seasonTimer");
        Intrinsics.checkNotNullParameter(seasonTimerHeader, "seasonTimerHeader");
        Intrinsics.checkNotNullParameter(ratingList, "ratingList");
        Intrinsics.checkNotNullParameter(ratingRewardsFromJson, "ratingRewardsFromJson");
        Intrinsics.checkNotNullParameter(tutorialAttachment, "tutorialAttachment");
        Intrinsics.checkNotNullParameter(gameQueuePlayers, "gameQueuePlayers");
        this.backgroundBitmap = bitmap;
        this.bpOfferImage = bitmap2;
        this.offerImage = bitmap3;
        this.treeImage = bitmap4;
        this.seasonCurrencyBitmap = bitmap5;
        this.lastChanceBitmap = bitmap6;
        this.offerCost = i;
        this.offerValue = i2;
        this.bcValue = i3;
        this.listOfGames = listOfGames;
        this.listOfButtons = listOfButtons;
        this.currentScreen = currentScreen;
        this.buttonPlayText = i4;
        this.tasksFromJson = tasksFromJson;
        this.selectedCategoryTask = b;
        this.specialTasksList = specialTasksList;
        this.dailyTasksList = dailyTasksList;
        this.specialCategoryImageBitmap = bitmap7;
        this.dailyCategoryImageBitmap = bitmap8;
        this.selectedColor = j;
        this.isTopListSelected = z;
        this.rewardLevel = i5;
        this.gainLevel = i6;
        this.limitUpgrades = limitUpgrades;
        this.eventLevels = eventLevels;
        this.settingsFromJson = settingsFromJson;
        this.seasonIcon = bitmap9;
        this.rewardsList = rewardsList;
        this.enteredTextBuyDarkEnergy = enteredTextBuyDarkEnergy;
        this.textYouSpendBC = textYouSpendBC;
        this.textYouGetCurrency = textYouGetCurrency;
        this.rewardsBitmapImage = bitmap10;
        this.gainBitmapImage = bitmap11;
        this.bpDailyLimit = i7;
        this.bpDailyMultiplier = i8;
        this.dailyCurrencyValue = i9;
        this.holidayEventsGainBlockData = holidayEventsGainBlockData;
        this.rewardItemForDialog = rewardItemForDialog;
        this.seasonColor = j2;
        this.seasonColor2 = j3;
        this.shadowColorForEventIcon = j4;
        this.seasonName = seasonName;
        this.seasonTimer = seasonTimer;
        this.seasonTimerHeader = seasonTimerHeader;
        this.currentProgressOfProgressBar = i10;
        this.maxProgressOfProgressBar = i11;
        this.myPlaceInRating = i12;
        this.ratingList = ratingList;
        this.ratingRewardsFromJson = ratingRewardsFromJson;
        this.myRatingBgImage = bitmap12;
        this.tutorialAttachment = tutorialAttachment;
        this.gameQueuePlayers = gameQueuePlayers;
        this.isNeedToShowLastChance = z2;
        this.isTopTasksHaveNotification = z3;
        this.isBottomTasksHaveNotification = z4;
        this.isWithPremium = z5;
        this.isNeedToShowDialogNotEnoughBc = z6;
        this.isNeedToShowDialogWaitForPlayers = z7;
        this.isNeedToShowTutorial = z8;
        this.isNeedToShowDialogPreviewReward = z9;
        this.isNeedToShowDialogBuyCurrency = z10;
        this.isNeedClose = z11;
    }

    @Nullable
    public final Bitmap getBackgroundBitmap() {
        return this.backgroundBitmap;
    }

    @Nullable
    public final Bitmap getBpOfferImage() {
        return this.bpOfferImage;
    }

    @Nullable
    public final Bitmap getOfferImage() {
        return this.offerImage;
    }

    @Nullable
    public final Bitmap getTreeImage() {
        return this.treeImage;
    }

    @Nullable
    public final Bitmap getSeasonCurrencyBitmap() {
        return this.seasonCurrencyBitmap;
    }

    @Nullable
    public final Bitmap getLastChanceBitmap() {
        return this.lastChanceBitmap;
    }

    public final int getOfferCost() {
        return this.offerCost;
    }

    public final int getOfferValue() {
        return this.offerValue;
    }

    public final int getBcValue() {
        return this.bcValue;
    }

    public /* synthetic */ HolidayEventsUiState(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4, Bitmap bitmap5, Bitmap bitmap6, int i, int i2, int i3, List list, List list2, HolidayEventsScreenEnum holidayEventsScreenEnum, int i4, List list3, byte b, List list4, List list5, Bitmap bitmap7, Bitmap bitmap8, long j, boolean z, int i5, int i6, List list6, List list7, List list8, Bitmap bitmap9, List list9, String str, AnnotatedString annotatedString, AnnotatedString annotatedString2, Bitmap bitmap10, Bitmap bitmap11, int i7, int i8, int i9, HolidayEventsGainBlockData holidayEventsGainBlockData, CommonRewardModel commonRewardModel, long j2, long j3, long j4, String str2, String str3, String str4, int i10, int i11, int i12, List list10, List list11, Bitmap bitmap12, List list12, String str5, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : bitmap, (i13 & 2) != 0 ? null : bitmap2, (i13 & 4) != 0 ? null : bitmap3, (i13 & 8) != 0 ? null : bitmap4, (i13 & 16) != 0 ? null : bitmap5, (i13 & 32) != 0 ? null : bitmap6, (i13 & 64) != 0 ? 0 : i, (i13 & 128) != 0 ? 0 : i2, (i13 & 256) != 0 ? 0 : i3, (i13 & 512) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i13 & 1024) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i13 & 2048) != 0 ? HolidayEventsScreenEnum.MAIN : holidayEventsScreenEnum, (i13 & 4096) != 0 ? R.string.common_play : i4, (i13 & 8192) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3, (i13 & 16384) != 0 ? (byte) 1 : b, (i13 & 32768) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list4, (i13 & 65536) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list5, (i13 & 131072) != 0 ? null : bitmap7, (i13 & 262144) != 0 ? null : bitmap8, (i13 & 524288) != 0 ? Color.INSTANCE.m11373getMagenta0d7_KjU() : j, (i13 & 1048576) != 0 ? true : z, (i13 & 2097152) != 0 ? 0 : i5, (i13 & 4194304) != 0 ? 0 : i6, (i13 & 8388608) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list6, (i13 & 16777216) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list7, (i13 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list8, (i13 & 67108864) != 0 ? null : bitmap9, (i13 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list9, (i13 & 268435456) != 0 ? "1" : str, (i13 & 536870912) != 0 ? new AnnotatedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, null, 6, null) : annotatedString, (i13 & 1073741824) != 0 ? new AnnotatedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, null, 6, null) : annotatedString2, (i13 & Integer.MIN_VALUE) != 0 ? null : bitmap10, (i14 & 1) != 0 ? null : bitmap11, (i14 & 2) != 0 ? 0 : i7, (i14 & 4) != 0 ? 0 : i8, (i14 & 8) != 0 ? 0 : i9, (i14 & 16) != 0 ? new HolidayEventsGainBlockData(null, null, null, null, null, 0, 63, null) : holidayEventsGainBlockData, (i14 & 32) != 0 ? new CommonRewardModel(0, null, null, null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262143, null) : commonRewardModel, (i14 & 64) != 0 ? Color.INSTANCE.m11366getBlack0d7_KjU() : j2, (i14 & 128) != 0 ? Color.INSTANCE.m11366getBlack0d7_KjU() : j3, (i14 & 256) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j4, (i14 & 512) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i14 & 1024) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str3, (i14 & 2048) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str4, (i14 & 4096) != 0 ? 0 : i10, (i14 & 8192) == 0 ? i11 : 1, (i14 & 16384) != 0 ? 0 : i12, (i14 & 32768) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list10, (i14 & 65536) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list11, (i14 & 131072) != 0 ? null : bitmap12, (i14 & 262144) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list12, (i14 & 524288) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str5, (i14 & 1048576) != 0 ? false : z2, (i14 & 2097152) != 0 ? false : z3, (i14 & 4194304) != 0 ? false : z4, (i14 & 8388608) != 0 ? false : z5, (i14 & 16777216) != 0 ? false : z6, (i14 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? false : z7, (i14 & 67108864) != 0 ? false : z8, (i14 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? false : z9, (i14 & 268435456) != 0 ? false : z10, (i14 & 536870912) != 0 ? false : z11, null);
    }

    @NotNull
    public final List<HolidayEventsGameItemModel> getListOfGames() {
        return this.listOfGames;
    }

    @NotNull
    public final List<CommonButtonCategory> getListOfButtons() {
        return this.listOfButtons;
    }

    @NotNull
    public final HolidayEventsScreenEnum getCurrentScreen() {
        return this.currentScreen;
    }

    public final int getButtonPlayText() {
        return this.buttonPlayText;
    }

    @NotNull
    public final List<HolidayEventsTasks> getTasksFromJson() {
        return this.tasksFromJson;
    }

    public final byte getSelectedCategoryTask() {
        return this.selectedCategoryTask;
    }

    @NotNull
    public final List<CommonTaskModel> getSpecialTasksList() {
        return this.specialTasksList;
    }

    @NotNull
    public final List<CommonTaskModel> getDailyTasksList() {
        return this.dailyTasksList;
    }

    @Nullable
    public final Bitmap getSpecialCategoryImageBitmap() {
        return this.specialCategoryImageBitmap;
    }

    @Nullable
    public final Bitmap getDailyCategoryImageBitmap() {
        return this.dailyCategoryImageBitmap;
    }

    /* renamed from: getSelectedColor-0d7_KjU */
    public final long m14513getSelectedColor0d7_KjU() {
        return this.selectedColor;
    }

    public final boolean isTopListSelected() {
        return this.isTopListSelected;
    }

    public final int getRewardLevel() {
        return this.rewardLevel;
    }

    public final int getGainLevel() {
        return this.gainLevel;
    }

    @NotNull
    public final List<HolidayEventsLimitUpgrades> getLimitUpgrades() {
        return this.limitUpgrades;
    }

    @NotNull
    public final List<HolidayEventsEventLevel> getEventLevels() {
        return this.eventLevels;
    }

    @NotNull
    public final List<HolidayEventsSettings> getSettingsFromJson() {
        return this.settingsFromJson;
    }

    @Nullable
    public final Bitmap getSeasonIcon() {
        return this.seasonIcon;
    }

    @NotNull
    public final List<CommonRewardModel> getRewardsList() {
        return this.rewardsList;
    }

    @NotNull
    public final String getEnteredTextBuyDarkEnergy() {
        return this.enteredTextBuyDarkEnergy;
    }

    @NotNull
    public final AnnotatedString getTextYouSpendBC() {
        return this.textYouSpendBC;
    }

    @NotNull
    public final AnnotatedString getTextYouGetCurrency() {
        return this.textYouGetCurrency;
    }

    @Nullable
    public final Bitmap getRewardsBitmapImage() {
        return this.rewardsBitmapImage;
    }

    @Nullable
    public final Bitmap getGainBitmapImage() {
        return this.gainBitmapImage;
    }

    public final int getBpDailyLimit() {
        return this.bpDailyLimit;
    }

    public final int getBpDailyMultiplier() {
        return this.bpDailyMultiplier;
    }

    public final int getDailyCurrencyValue() {
        return this.dailyCurrencyValue;
    }

    @NotNull
    public final HolidayEventsGainBlockData getHolidayEventsGainBlockData() {
        return this.holidayEventsGainBlockData;
    }

    @NotNull
    public final CommonRewardModel getRewardItemForDialog() {
        return this.rewardItemForDialog;
    }

    /* renamed from: getSeasonColor-0d7_KjU */
    public final long m14511getSeasonColor0d7_KjU() {
        return this.seasonColor;
    }

    /* renamed from: getSeasonColor2-0d7_KjU */
    public final long m14512getSeasonColor20d7_KjU() {
        return this.seasonColor2;
    }

    /* renamed from: getShadowColorForEventIcon-0d7_KjU */
    public final long m14514getShadowColorForEventIcon0d7_KjU() {
        return this.shadowColorForEventIcon;
    }

    @NotNull
    public final String getSeasonName() {
        return this.seasonName;
    }

    @NotNull
    public final String getSeasonTimer() {
        return this.seasonTimer;
    }

    @NotNull
    public final String getSeasonTimerHeader() {
        return this.seasonTimerHeader;
    }

    public final int getCurrentProgressOfProgressBar() {
        return this.currentProgressOfProgressBar;
    }

    public final int getMaxProgressOfProgressBar() {
        return this.maxProgressOfProgressBar;
    }

    public final int getMyPlaceInRating() {
        return this.myPlaceInRating;
    }

    @NotNull
    public final List<CommonRatingModel> getRatingList() {
        return this.ratingList;
    }

    @NotNull
    public final List<HolidayEventsRatingRewards> getRatingRewardsFromJson() {
        return this.ratingRewardsFromJson;
    }

    @Nullable
    public final Bitmap getMyRatingBgImage() {
        return this.myRatingBgImage;
    }

    @NotNull
    public final List<CommonTutorialTextsWithImage> getTutorialAttachment() {
        return this.tutorialAttachment;
    }

    @NotNull
    public final String getGameQueuePlayers() {
        return this.gameQueuePlayers;
    }

    public final boolean isNeedToShowLastChance() {
        return this.isNeedToShowLastChance;
    }

    public final boolean isTopTasksHaveNotification() {
        return this.isTopTasksHaveNotification;
    }

    public final boolean isBottomTasksHaveNotification() {
        return this.isBottomTasksHaveNotification;
    }

    public final boolean isWithPremium() {
        return this.isWithPremium;
    }

    public final boolean isNeedToShowDialogNotEnoughBc() {
        return this.isNeedToShowDialogNotEnoughBc;
    }

    public final boolean isNeedToShowDialogWaitForPlayers() {
        return this.isNeedToShowDialogWaitForPlayers;
    }

    public final boolean isNeedToShowTutorial() {
        return this.isNeedToShowTutorial;
    }

    public final boolean isNeedToShowDialogPreviewReward() {
        return this.isNeedToShowDialogPreviewReward;
    }

    public final boolean isNeedToShowDialogBuyCurrency() {
        return this.isNeedToShowDialogBuyCurrency;
    }

    public final boolean isNeedClose() {
        return this.isNeedClose;
    }

    public final boolean isNeedToShowOfferImage() {
        return this.rewardLevel < this.rewardsList.size();
    }

    @NotNull
    public final AnnotatedString getCurrencyAmount() {
        if (this.currentScreen != HolidayEventsScreenEnum.GAMES) {
            return new AnnotatedString(String.valueOf(this.currentProgressOfProgressBar), null, null, 6, null);
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        builder.append(String.valueOf(this.dailyCurrencyValue));
        builder.append("/");
        builder.append(this.holidayEventsGainBlockData.getTextCurrentValueDayLimit());
        return builder.toAnnotatedString();
    }
}

