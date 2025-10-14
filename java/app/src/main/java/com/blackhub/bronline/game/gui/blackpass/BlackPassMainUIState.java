package com.blackhub.bronline.game.gui.blackpass;

import android.graphics.Bitmap;
import androidx.annotation.ColorRes;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.common.C2732C;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.attachment.rating.CommonRatingModel;
import com.blackhub.bronline.game.core.utils.attachment.task.CommonTaskModel;
import com.blackhub.bronline.game.gui.blackpass.data.RewardModel;
import com.blackhub.bronline.game.gui.blackpass.data.TimerDaysAndHours;
import com.blackhub.bronline.game.gui.blackpass.enums.VIPStateEnum;
import com.blackhub.bronline.game.model.remote.response.blackpass.BlackPassProperties;
import com.blackhub.bronline.game.model.remote.response.blackpass.LevelsInfo;
import com.blackhub.bronline.game.model.remote.response.blackpass.TasksInfo;
import com.bless.client.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BlackPassMainUIState.kt */
@StabilityInferred(parameters = 0)

public final /* data */ class BlackPassMainUIState implements UiState {
    public static final int $stable = 8;
    public final int activatePremiumCounter;

    @NotNull
    public final AnnotatedString activatePremiumDeluxeSubtitle;

    @NotNull
    public final AnnotatedString activatePremiumSubtitle;

    @NotNull
    public final AnnotatedString bannerTitlePrize1;

    @Nullable
    public final Bitmap bpExpBitmap;
    public final int bpLevel;

    @Nullable
    public final BlackPassProperties bpProperties;

    @Nullable
    public final Bitmap dailyCategoryImageBitmap;

    @NotNull
    public final List<CommonTaskModel> dailyTasksList;

    @Nullable
    public final Bitmap imageDustBitmap;

    @Nullable
    public final Bitmap imgDeluxeCar;

    @Nullable
    public final Bitmap imgOfferSplit;

    @Nullable
    public final Bitmap imgRubBitmap;
    public final boolean isButtonBuyPremiumEnabled;
    public final int maxBpLevel;
    public final int maxLevelExp;
    public final int myPlaceInRating;

    @NotNull
    public final String nameDeluxeCar;

    @Nullable
    public final Bitmap premiumBitmapImage;

    @NotNull
    public final String premiumDeluxePrice;
    public final int premiumDeluxePriceInt;

    @Nullable
    public final ArrayList<LevelsInfo> premiumLevelArray;

    @NotNull
    public final String premiumPrice;
    public final int premiumPriceInt;
    public final int premiumStatus;

    @Nullable
    public final Bitmap ratingBgImage;

    @NotNull
    public final List<CommonRatingModel> ratingList;

    @NotNull
    public final List<RewardModel> rewardsList;

    @Nullable
    public final Bitmap seasonBg;

    @Nullable
    public final Bitmap seasonBitmapImage;

    @Nullable
    public final Bitmap seasonBitmapImageForRewards;
    public final int seasonColor;

    @NotNull
    public final String seasonName;
    public final byte selectedCategoryTask;
    public final int selectedLayout;

    @Nullable
    public final Bitmap specialCategoryImageBitmap;

    @NotNull
    public final List<CommonTaskModel> specialTasksList;

    @Nullable
    public final ArrayList<LevelsInfo> standardLevelArray;

    @NotNull
    public final List<TasksInfo> tasksFromJsonList;

    @NotNull
    public final TimerDaysAndHours timerDaysAndHours;
    public final int valueOfExperience;

    @NotNull
    public final VIPStateEnum vipState;

    @NotNull
    public final String weeklyTimerForEndCategory;

    public BlackPassMainUIState() {
        this(0, 0, 0, null, null, 0, null, 0, 0, null, null, null, null, null, null, null, null, 0, null, null, null, (byte) 0, null, null, null, null, null, null, null, 0, 0, 0, null, 0, null, null, null, null, null, null, null, null, -1, 1023, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getBpLevel() {
        return this.bpLevel;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final BlackPassProperties getBpProperties() {
        return this.bpProperties;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Bitmap getPremiumBitmapImage() {
        return this.premiumBitmapImage;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Bitmap getSeasonBitmapImage() {
        return this.seasonBitmapImage;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Bitmap getSeasonBitmapImageForRewards() {
        return this.seasonBitmapImageForRewards;
    }

    @NotNull
    /* renamed from: component14, reason: from getter */
    public final VIPStateEnum getVipState() {
        return this.vipState;
    }

    @NotNull
    public final List<RewardModel> component15() {
        return this.rewardsList;
    }

    @Nullable
    public final ArrayList<LevelsInfo> component16() {
        return this.standardLevelArray;
    }

    @Nullable
    public final ArrayList<LevelsInfo> component17() {
        return this.premiumLevelArray;
    }

    /* renamed from: component18, reason: from getter */
    public final int getMyPlaceInRating() {
        return this.myPlaceInRating;
    }

    @NotNull
    public final List<CommonRatingModel> component19() {
        return this.ratingList;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMaxBpLevel() {
        return this.maxBpLevel;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Bitmap getRatingBgImage() {
        return this.ratingBgImage;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final Bitmap getBpExpBitmap() {
        return this.bpExpBitmap;
    }

    /* renamed from: component22, reason: from getter */
    public final byte getSelectedCategoryTask() {
        return this.selectedCategoryTask;
    }

    @NotNull
    public final List<TasksInfo> component23() {
        return this.tasksFromJsonList;
    }

    @NotNull
    public final List<CommonTaskModel> component24() {
        return this.specialTasksList;
    }

    @NotNull
    public final List<CommonTaskModel> component25() {
        return this.dailyTasksList;
    }

    @Nullable
    /* renamed from: component26, reason: from getter */
    public final Bitmap getSpecialCategoryImageBitmap() {
        return this.specialCategoryImageBitmap;
    }

    @Nullable
    /* renamed from: component27, reason: from getter */
    public final Bitmap getDailyCategoryImageBitmap() {
        return this.dailyCategoryImageBitmap;
    }

    @NotNull
    /* renamed from: component28, reason: from getter */
    public final String getWeeklyTimerForEndCategory() {
        return this.weeklyTimerForEndCategory;
    }

    @Nullable
    /* renamed from: component29, reason: from getter */
    public final Bitmap getImgRubBitmap() {
        return this.imgRubBitmap;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSelectedLayout() {
        return this.selectedLayout;
    }

    /* renamed from: component30, reason: from getter */
    public final int getActivatePremiumCounter() {
        return this.activatePremiumCounter;
    }

    /* renamed from: component31, reason: from getter */
    public final int getPremiumStatus() {
        return this.premiumStatus;
    }

    /* renamed from: component32, reason: from getter */
    public final int getPremiumPriceInt() {
        return this.premiumPriceInt;
    }

    @NotNull
    /* renamed from: component33, reason: from getter */
    public final String getPremiumPrice() {
        return this.premiumPrice;
    }

    /* renamed from: component34, reason: from getter */
    public final int getPremiumDeluxePriceInt() {
        return this.premiumDeluxePriceInt;
    }

    @NotNull
    /* renamed from: component35, reason: from getter */
    public final String getPremiumDeluxePrice() {
        return this.premiumDeluxePrice;
    }

    @Nullable
    /* renamed from: component36, reason: from getter */
    public final Bitmap getImgOfferSplit() {
        return this.imgOfferSplit;
    }

    @Nullable
    /* renamed from: component37, reason: from getter */
    public final Bitmap getImgDeluxeCar() {
        return this.imgDeluxeCar;
    }

    @NotNull
    /* renamed from: component38, reason: from getter */
    public final String getNameDeluxeCar() {
        return this.nameDeluxeCar;
    }

    @NotNull
    /* renamed from: component39, reason: from getter */
    public final AnnotatedString getActivatePremiumSubtitle() {
        return this.activatePremiumSubtitle;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getSeasonName() {
        return this.seasonName;
    }

    @NotNull
    /* renamed from: component40, reason: from getter */
    public final AnnotatedString getActivatePremiumDeluxeSubtitle() {
        return this.activatePremiumDeluxeSubtitle;
    }

    @NotNull
    /* renamed from: component41, reason: from getter */
    public final AnnotatedString getBannerTitlePrize1() {
        return this.bannerTitlePrize1;
    }

    @Nullable
    /* renamed from: component42, reason: from getter */
    public final Bitmap getImageDustBitmap() {
        return this.imageDustBitmap;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Bitmap getSeasonBg() {
        return this.seasonBg;
    }

    /* renamed from: component6, reason: from getter */
    public final int getSeasonColor() {
        return this.seasonColor;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final TimerDaysAndHours getTimerDaysAndHours() {
        return this.timerDaysAndHours;
    }

    /* renamed from: component8, reason: from getter */
    public final int getValueOfExperience() {
        return this.valueOfExperience;
    }

    /* renamed from: component9, reason: from getter */
    public final int getMaxLevelExp() {
        return this.maxLevelExp;
    }

    @NotNull
    public final BlackPassMainUIState copy(int bpLevel, int maxBpLevel, int selectedLayout, @NotNull String seasonName, @Nullable Bitmap seasonBg, int seasonColor, @NotNull TimerDaysAndHours timerDaysAndHours, int valueOfExperience, int maxLevelExp, @Nullable BlackPassProperties bpProperties, @Nullable Bitmap premiumBitmapImage, @Nullable Bitmap seasonBitmapImage, @Nullable Bitmap seasonBitmapImageForRewards, @NotNull VIPStateEnum vipState, @NotNull List<RewardModel> rewardsList, @Nullable ArrayList<LevelsInfo> standardLevelArray, @Nullable ArrayList<LevelsInfo> premiumLevelArray, int myPlaceInRating, @NotNull List<CommonRatingModel> ratingList, @Nullable Bitmap ratingBgImage, @Nullable Bitmap bpExpBitmap, byte selectedCategoryTask, @NotNull List<TasksInfo> tasksFromJsonList, @NotNull List<CommonTaskModel> specialTasksList, @NotNull List<CommonTaskModel> dailyTasksList, @Nullable Bitmap specialCategoryImageBitmap, @Nullable Bitmap dailyCategoryImageBitmap, @NotNull String weeklyTimerForEndCategory, @Nullable Bitmap imgRubBitmap, int activatePremiumCounter, int premiumStatus, int premiumPriceInt, @NotNull String premiumPrice, int premiumDeluxePriceInt, @NotNull String premiumDeluxePrice, @Nullable Bitmap imgOfferSplit, @Nullable Bitmap imgDeluxeCar, @NotNull String nameDeluxeCar, @NotNull AnnotatedString activatePremiumSubtitle, @NotNull AnnotatedString activatePremiumDeluxeSubtitle, @NotNull AnnotatedString bannerTitlePrize1, @Nullable Bitmap imageDustBitmap) {
        Intrinsics.checkNotNullParameter(seasonName, "seasonName");
        Intrinsics.checkNotNullParameter(timerDaysAndHours, "timerDaysAndHours");
        Intrinsics.checkNotNullParameter(vipState, "vipState");
        Intrinsics.checkNotNullParameter(rewardsList, "rewardsList");
        Intrinsics.checkNotNullParameter(ratingList, "ratingList");
        Intrinsics.checkNotNullParameter(tasksFromJsonList, "tasksFromJsonList");
        Intrinsics.checkNotNullParameter(specialTasksList, "specialTasksList");
        Intrinsics.checkNotNullParameter(dailyTasksList, "dailyTasksList");
        Intrinsics.checkNotNullParameter(weeklyTimerForEndCategory, "weeklyTimerForEndCategory");
        Intrinsics.checkNotNullParameter(premiumPrice, "premiumPrice");
        Intrinsics.checkNotNullParameter(premiumDeluxePrice, "premiumDeluxePrice");
        Intrinsics.checkNotNullParameter(nameDeluxeCar, "nameDeluxeCar");
        Intrinsics.checkNotNullParameter(activatePremiumSubtitle, "activatePremiumSubtitle");
        Intrinsics.checkNotNullParameter(activatePremiumDeluxeSubtitle, "activatePremiumDeluxeSubtitle");
        Intrinsics.checkNotNullParameter(bannerTitlePrize1, "bannerTitlePrize1");
        return new BlackPassMainUIState(bpLevel, maxBpLevel, selectedLayout, seasonName, seasonBg, seasonColor, timerDaysAndHours, valueOfExperience, maxLevelExp, bpProperties, premiumBitmapImage, seasonBitmapImage, seasonBitmapImageForRewards, vipState, rewardsList, standardLevelArray, premiumLevelArray, myPlaceInRating, ratingList, ratingBgImage, bpExpBitmap, selectedCategoryTask, tasksFromJsonList, specialTasksList, dailyTasksList, specialCategoryImageBitmap, dailyCategoryImageBitmap, weeklyTimerForEndCategory, imgRubBitmap, activatePremiumCounter, premiumStatus, premiumPriceInt, premiumPrice, premiumDeluxePriceInt, premiumDeluxePrice, imgOfferSplit, imgDeluxeCar, nameDeluxeCar, activatePremiumSubtitle, activatePremiumDeluxeSubtitle, bannerTitlePrize1, imageDustBitmap);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlackPassMainUIState)) {
            return false;
        }
        BlackPassMainUIState blackPassMainUIState = (BlackPassMainUIState) other;
        return this.bpLevel == blackPassMainUIState.bpLevel && this.maxBpLevel == blackPassMainUIState.maxBpLevel && this.selectedLayout == blackPassMainUIState.selectedLayout && Intrinsics.areEqual(this.seasonName, blackPassMainUIState.seasonName) && Intrinsics.areEqual(this.seasonBg, blackPassMainUIState.seasonBg) && this.seasonColor == blackPassMainUIState.seasonColor && Intrinsics.areEqual(this.timerDaysAndHours, blackPassMainUIState.timerDaysAndHours) && this.valueOfExperience == blackPassMainUIState.valueOfExperience && this.maxLevelExp == blackPassMainUIState.maxLevelExp && Intrinsics.areEqual(this.bpProperties, blackPassMainUIState.bpProperties) && Intrinsics.areEqual(this.premiumBitmapImage, blackPassMainUIState.premiumBitmapImage) && Intrinsics.areEqual(this.seasonBitmapImage, blackPassMainUIState.seasonBitmapImage) && Intrinsics.areEqual(this.seasonBitmapImageForRewards, blackPassMainUIState.seasonBitmapImageForRewards) && this.vipState == blackPassMainUIState.vipState && Intrinsics.areEqual(this.rewardsList, blackPassMainUIState.rewardsList) && Intrinsics.areEqual(this.standardLevelArray, blackPassMainUIState.standardLevelArray) && Intrinsics.areEqual(this.premiumLevelArray, blackPassMainUIState.premiumLevelArray) && this.myPlaceInRating == blackPassMainUIState.myPlaceInRating && Intrinsics.areEqual(this.ratingList, blackPassMainUIState.ratingList) && Intrinsics.areEqual(this.ratingBgImage, blackPassMainUIState.ratingBgImage) && Intrinsics.areEqual(this.bpExpBitmap, blackPassMainUIState.bpExpBitmap) && this.selectedCategoryTask == blackPassMainUIState.selectedCategoryTask && Intrinsics.areEqual(this.tasksFromJsonList, blackPassMainUIState.tasksFromJsonList) && Intrinsics.areEqual(this.specialTasksList, blackPassMainUIState.specialTasksList) && Intrinsics.areEqual(this.dailyTasksList, blackPassMainUIState.dailyTasksList) && Intrinsics.areEqual(this.specialCategoryImageBitmap, blackPassMainUIState.specialCategoryImageBitmap) && Intrinsics.areEqual(this.dailyCategoryImageBitmap, blackPassMainUIState.dailyCategoryImageBitmap) && Intrinsics.areEqual(this.weeklyTimerForEndCategory, blackPassMainUIState.weeklyTimerForEndCategory) && Intrinsics.areEqual(this.imgRubBitmap, blackPassMainUIState.imgRubBitmap) && this.activatePremiumCounter == blackPassMainUIState.activatePremiumCounter && this.premiumStatus == blackPassMainUIState.premiumStatus && this.premiumPriceInt == blackPassMainUIState.premiumPriceInt && Intrinsics.areEqual(this.premiumPrice, blackPassMainUIState.premiumPrice) && this.premiumDeluxePriceInt == blackPassMainUIState.premiumDeluxePriceInt && Intrinsics.areEqual(this.premiumDeluxePrice, blackPassMainUIState.premiumDeluxePrice) && Intrinsics.areEqual(this.imgOfferSplit, blackPassMainUIState.imgOfferSplit) && Intrinsics.areEqual(this.imgDeluxeCar, blackPassMainUIState.imgDeluxeCar) && Intrinsics.areEqual(this.nameDeluxeCar, blackPassMainUIState.nameDeluxeCar) && Intrinsics.areEqual(this.activatePremiumSubtitle, blackPassMainUIState.activatePremiumSubtitle) && Intrinsics.areEqual(this.activatePremiumDeluxeSubtitle, blackPassMainUIState.activatePremiumDeluxeSubtitle) && Intrinsics.areEqual(this.bannerTitlePrize1, blackPassMainUIState.bannerTitlePrize1) && Intrinsics.areEqual(this.imageDustBitmap, blackPassMainUIState.imageDustBitmap);
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.bpLevel) * 31) + Integer.hashCode(this.maxBpLevel)) * 31) + Integer.hashCode(this.selectedLayout)) * 31) + this.seasonName.hashCode()) * 31;
        Bitmap bitmap = this.seasonBg;
        int iHashCode2 = (((((((((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + Integer.hashCode(this.seasonColor)) * 31) + this.timerDaysAndHours.hashCode()) * 31) + Integer.hashCode(this.valueOfExperience)) * 31) + Integer.hashCode(this.maxLevelExp)) * 31;
        BlackPassProperties blackPassProperties = this.bpProperties;
        int iHashCode3 = (iHashCode2 + (blackPassProperties == null ? 0 : blackPassProperties.hashCode())) * 31;
        Bitmap bitmap2 = this.premiumBitmapImage;
        int iHashCode4 = (iHashCode3 + (bitmap2 == null ? 0 : bitmap2.hashCode())) * 31;
        Bitmap bitmap3 = this.seasonBitmapImage;
        int iHashCode5 = (iHashCode4 + (bitmap3 == null ? 0 : bitmap3.hashCode())) * 31;
        Bitmap bitmap4 = this.seasonBitmapImageForRewards;
        int iHashCode6 = (((((iHashCode5 + (bitmap4 == null ? 0 : bitmap4.hashCode())) * 31) + this.vipState.hashCode()) * 31) + this.rewardsList.hashCode()) * 31;
        ArrayList<LevelsInfo> arrayList = this.standardLevelArray;
        int iHashCode7 = (iHashCode6 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList<LevelsInfo> arrayList2 = this.premiumLevelArray;
        int iHashCode8 = (((((iHashCode7 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31) + Integer.hashCode(this.myPlaceInRating)) * 31) + this.ratingList.hashCode()) * 31;
        Bitmap bitmap5 = this.ratingBgImage;
        int iHashCode9 = (iHashCode8 + (bitmap5 == null ? 0 : bitmap5.hashCode())) * 31;
        Bitmap bitmap6 = this.bpExpBitmap;
        int iHashCode10 = (((((((((iHashCode9 + (bitmap6 == null ? 0 : bitmap6.hashCode())) * 31) + Byte.hashCode(this.selectedCategoryTask)) * 31) + this.tasksFromJsonList.hashCode()) * 31) + this.specialTasksList.hashCode()) * 31) + this.dailyTasksList.hashCode()) * 31;
        Bitmap bitmap7 = this.specialCategoryImageBitmap;
        int iHashCode11 = (iHashCode10 + (bitmap7 == null ? 0 : bitmap7.hashCode())) * 31;
        Bitmap bitmap8 = this.dailyCategoryImageBitmap;
        int iHashCode12 = (((iHashCode11 + (bitmap8 == null ? 0 : bitmap8.hashCode())) * 31) + this.weeklyTimerForEndCategory.hashCode()) * 31;
        Bitmap bitmap9 = this.imgRubBitmap;
        int iHashCode13 = (((((((((((((iHashCode12 + (bitmap9 == null ? 0 : bitmap9.hashCode())) * 31) + Integer.hashCode(this.activatePremiumCounter)) * 31) + Integer.hashCode(this.premiumStatus)) * 31) + Integer.hashCode(this.premiumPriceInt)) * 31) + this.premiumPrice.hashCode()) * 31) + Integer.hashCode(this.premiumDeluxePriceInt)) * 31) + this.premiumDeluxePrice.hashCode()) * 31;
        Bitmap bitmap10 = this.imgOfferSplit;
        int iHashCode14 = (iHashCode13 + (bitmap10 == null ? 0 : bitmap10.hashCode())) * 31;
        Bitmap bitmap11 = this.imgDeluxeCar;
        int iHashCode15 = (((((((((iHashCode14 + (bitmap11 == null ? 0 : bitmap11.hashCode())) * 31) + this.nameDeluxeCar.hashCode()) * 31) + this.activatePremiumSubtitle.hashCode()) * 31) + this.activatePremiumDeluxeSubtitle.hashCode()) * 31) + this.bannerTitlePrize1.hashCode()) * 31;
        Bitmap bitmap12 = this.imageDustBitmap;
        return iHashCode15 + (bitmap12 != null ? bitmap12.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.bpLevel;
        int i2 = this.maxBpLevel;
        int i3 = this.selectedLayout;
        String str = this.seasonName;
        Bitmap bitmap = this.seasonBg;
        int i4 = this.seasonColor;
        TimerDaysAndHours timerDaysAndHours = this.timerDaysAndHours;
        int i5 = this.valueOfExperience;
        int i6 = this.maxLevelExp;
        BlackPassProperties blackPassProperties = this.bpProperties;
        Bitmap bitmap2 = this.premiumBitmapImage;
        Bitmap bitmap3 = this.seasonBitmapImage;
        Bitmap bitmap4 = this.seasonBitmapImageForRewards;
        VIPStateEnum vIPStateEnum = this.vipState;
        List<RewardModel> list = this.rewardsList;
        ArrayList<LevelsInfo> arrayList = this.standardLevelArray;
        ArrayList<LevelsInfo> arrayList2 = this.premiumLevelArray;
        int i7 = this.myPlaceInRating;
        List<CommonRatingModel> list2 = this.ratingList;
        Bitmap bitmap5 = this.ratingBgImage;
        Bitmap bitmap6 = this.bpExpBitmap;
        byte b = this.selectedCategoryTask;
        List<TasksInfo> list3 = this.tasksFromJsonList;
        List<CommonTaskModel> list4 = this.specialTasksList;
        List<CommonTaskModel> list5 = this.dailyTasksList;
        Bitmap bitmap7 = this.specialCategoryImageBitmap;
        Bitmap bitmap8 = this.dailyCategoryImageBitmap;
        String str2 = this.weeklyTimerForEndCategory;
        Bitmap bitmap9 = this.imgRubBitmap;
        int i8 = this.activatePremiumCounter;
        int i9 = this.premiumStatus;
        int i10 = this.premiumPriceInt;
        String str3 = this.premiumPrice;
        int i11 = this.premiumDeluxePriceInt;
        String str4 = this.premiumDeluxePrice;
        Bitmap bitmap10 = this.imgOfferSplit;
        Bitmap bitmap11 = this.imgDeluxeCar;
        String str5 = this.nameDeluxeCar;
        AnnotatedString annotatedString = this.activatePremiumSubtitle;
        AnnotatedString annotatedString2 = this.activatePremiumDeluxeSubtitle;
        AnnotatedString annotatedString3 = this.bannerTitlePrize1;
        return "BlackPassMainUIState(bpLevel=" + i + ", maxBpLevel=" + i2 + ", selectedLayout=" + i3 + ", seasonName=" + str + ", seasonBg=" + bitmap + ", seasonColor=" + i4 + ", timerDaysAndHours=" + timerDaysAndHours + ", valueOfExperience=" + i5 + ", maxLevelExp=" + i6 + ", bpProperties=" + blackPassProperties + ", premiumBitmapImage=" + bitmap2 + ", seasonBitmapImage=" + bitmap3 + ", seasonBitmapImageForRewards=" + bitmap4 + ", vipState=" + vIPStateEnum + ", rewardsList=" + list + ", standardLevelArray=" + arrayList + ", premiumLevelArray=" + arrayList2 + ", myPlaceInRating=" + i7 + ", ratingList=" + list2 + ", ratingBgImage=" + bitmap5 + ", bpExpBitmap=" + bitmap6 + ", selectedCategoryTask=" + ((int) b) + ", tasksFromJsonList=" + list3 + ", specialTasksList=" + list4 + ", dailyTasksList=" + list5 + ", specialCategoryImageBitmap=" + bitmap7 + ", dailyCategoryImageBitmap=" + bitmap8 + ", weeklyTimerForEndCategory=" + str2 + ", imgRubBitmap=" + bitmap9 + ", activatePremiumCounter=" + i8 + ", premiumStatus=" + i9 + ", premiumPriceInt=" + i10 + ", premiumPrice=" + str3 + ", premiumDeluxePriceInt=" + i11 + ", premiumDeluxePrice=" + str4 + ", imgOfferSplit=" + bitmap10 + ", imgDeluxeCar=" + bitmap11 + ", nameDeluxeCar=" + str5 + ", activatePremiumSubtitle=" + ((Object) annotatedString) + ", activatePremiumDeluxeSubtitle=" + ((Object) annotatedString2) + ", bannerTitlePrize1=" + ((Object) annotatedString3) + ", imageDustBitmap=" + this.imageDustBitmap + ")";
    }

    public BlackPassMainUIState(int i, int i2, int i3, @NotNull String seasonName, @Nullable Bitmap bitmap, int i4, @NotNull TimerDaysAndHours timerDaysAndHours, int i5, int i6, @Nullable BlackPassProperties blackPassProperties, @Nullable Bitmap bitmap2, @Nullable Bitmap bitmap3, @Nullable Bitmap bitmap4, @NotNull VIPStateEnum vipState, @NotNull List<RewardModel> rewardsList, @Nullable ArrayList<LevelsInfo> arrayList, @Nullable ArrayList<LevelsInfo> arrayList2, int i7, @NotNull List<CommonRatingModel> ratingList, @Nullable Bitmap bitmap5, @Nullable Bitmap bitmap6, byte b, @NotNull List<TasksInfo> tasksFromJsonList, @NotNull List<CommonTaskModel> specialTasksList, @NotNull List<CommonTaskModel> dailyTasksList, @Nullable Bitmap bitmap7, @Nullable Bitmap bitmap8, @NotNull String weeklyTimerForEndCategory, @Nullable Bitmap bitmap9, int i8, int i9, int i10, @NotNull String premiumPrice, int i11, @NotNull String premiumDeluxePrice, @Nullable Bitmap bitmap10, @Nullable Bitmap bitmap11, @NotNull String nameDeluxeCar, @NotNull AnnotatedString activatePremiumSubtitle, @NotNull AnnotatedString activatePremiumDeluxeSubtitle, @NotNull AnnotatedString bannerTitlePrize1, @Nullable Bitmap bitmap12) {
        Intrinsics.checkNotNullParameter(seasonName, "seasonName");
        Intrinsics.checkNotNullParameter(timerDaysAndHours, "timerDaysAndHours");
        Intrinsics.checkNotNullParameter(vipState, "vipState");
        Intrinsics.checkNotNullParameter(rewardsList, "rewardsList");
        Intrinsics.checkNotNullParameter(ratingList, "ratingList");
        Intrinsics.checkNotNullParameter(tasksFromJsonList, "tasksFromJsonList");
        Intrinsics.checkNotNullParameter(specialTasksList, "specialTasksList");
        Intrinsics.checkNotNullParameter(dailyTasksList, "dailyTasksList");
        Intrinsics.checkNotNullParameter(weeklyTimerForEndCategory, "weeklyTimerForEndCategory");
        Intrinsics.checkNotNullParameter(premiumPrice, "premiumPrice");
        Intrinsics.checkNotNullParameter(premiumDeluxePrice, "premiumDeluxePrice");
        Intrinsics.checkNotNullParameter(nameDeluxeCar, "nameDeluxeCar");
        Intrinsics.checkNotNullParameter(activatePremiumSubtitle, "activatePremiumSubtitle");
        Intrinsics.checkNotNullParameter(activatePremiumDeluxeSubtitle, "activatePremiumDeluxeSubtitle");
        Intrinsics.checkNotNullParameter(bannerTitlePrize1, "bannerTitlePrize1");
        this.bpLevel = i;
        this.maxBpLevel = i2;
        this.selectedLayout = i3;
        this.seasonName = seasonName;
        this.seasonBg = bitmap;
        this.seasonColor = i4;
        this.timerDaysAndHours = timerDaysAndHours;
        this.valueOfExperience = i5;
        this.maxLevelExp = i6;
        this.bpProperties = blackPassProperties;
        this.premiumBitmapImage = bitmap2;
        this.seasonBitmapImage = bitmap3;
        this.seasonBitmapImageForRewards = bitmap4;
        this.vipState = vipState;
        this.rewardsList = rewardsList;
        this.standardLevelArray = arrayList;
        this.premiumLevelArray = arrayList2;
        this.myPlaceInRating = i7;
        this.ratingList = ratingList;
        this.ratingBgImage = bitmap5;
        this.bpExpBitmap = bitmap6;
        this.selectedCategoryTask = b;
        this.tasksFromJsonList = tasksFromJsonList;
        this.specialTasksList = specialTasksList;
        this.dailyTasksList = dailyTasksList;
        this.specialCategoryImageBitmap = bitmap7;
        this.dailyCategoryImageBitmap = bitmap8;
        this.weeklyTimerForEndCategory = weeklyTimerForEndCategory;
        this.imgRubBitmap = bitmap9;
        this.activatePremiumCounter = i8;
        this.premiumStatus = i9;
        this.premiumPriceInt = i10;
        this.premiumPrice = premiumPrice;
        this.premiumDeluxePriceInt = i11;
        this.premiumDeluxePrice = premiumDeluxePrice;
        this.imgOfferSplit = bitmap10;
        this.imgDeluxeCar = bitmap11;
        this.nameDeluxeCar = nameDeluxeCar;
        this.activatePremiumSubtitle = activatePremiumSubtitle;
        this.activatePremiumDeluxeSubtitle = activatePremiumDeluxeSubtitle;
        this.bannerTitlePrize1 = bannerTitlePrize1;
        this.imageDustBitmap = bitmap12;
        this.isButtonBuyPremiumEnabled = i9 != 2;
    }

    public final int getBpLevel() {
        return this.bpLevel;
    }

    public final int getMaxBpLevel() {
        return this.maxBpLevel;
    }

    public final int getSelectedLayout() {
        return this.selectedLayout;
    }

    public /* synthetic */ BlackPassMainUIState(int i, int i2, int i3, String str, Bitmap bitmap, int i4, TimerDaysAndHours timerDaysAndHours, int i5, int i6, BlackPassProperties blackPassProperties, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4, VIPStateEnum vIPStateEnum, List list, ArrayList arrayList, ArrayList arrayList2, int i7, List list2, Bitmap bitmap5, Bitmap bitmap6, byte b, List list3, List list4, List list5, Bitmap bitmap7, Bitmap bitmap8, String str2, Bitmap bitmap9, int i8, int i9, int i10, String str3, int i11, String str4, Bitmap bitmap10, Bitmap bitmap11, String str5, AnnotatedString annotatedString, AnnotatedString annotatedString2, AnnotatedString annotatedString3, Bitmap bitmap12, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i, (i12 & 2) != 0 ? 0 : i2, (i12 & 4) != 0 ? 0 : i3, (i12 & 8) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i12 & 16) != 0 ? null : bitmap, (i12 & 32) != 0 ? 0 : i4, (i12 & 64) != 0 ? new TimerDaysAndHours(0, 0, 3, null) : timerDaysAndHours, (i12 & 128) != 0 ? 0 : i5, (i12 & 256) != 0 ? 0 : i6, (i12 & 512) != 0 ? null : blackPassProperties, (i12 & 1024) != 0 ? null : bitmap2, (i12 & 2048) != 0 ? null : bitmap3, (i12 & 4096) != 0 ? null : bitmap4, (i12 & 8192) != 0 ? VIPStateEnum.NONE : vIPStateEnum, (i12 & 16384) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i12 & 32768) != 0 ? null : arrayList, (i12 & 65536) != 0 ? null : arrayList2, (i12 & 131072) != 0 ? 0 : i7, (i12 & 262144) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i12 & 524288) != 0 ? null : bitmap5, (i12 & 1048576) != 0 ? null : bitmap6, (i12 & 2097152) != 0 ? (byte) 1 : b, (i12 & 4194304) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3, (i12 & 8388608) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list4, (i12 & 16777216) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list5, (i12 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? null : bitmap7, (i12 & 67108864) != 0 ? null : bitmap8, (i12 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i12 & 268435456) != 0 ? null : bitmap9, (i12 & 536870912) != 0 ? 0 : i8, (i12 & 1073741824) != 0 ? 0 : i9, (i12 & Integer.MIN_VALUE) != 0 ? 0 : i10, (i13 & 1) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str3, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str4, (i13 & 8) != 0 ? null : bitmap10, (i13 & 16) != 0 ? null : bitmap11, (i13 & 32) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str5, (i13 & 64) != 0 ? new AnnotatedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, null, 6, null) : annotatedString, (i13 & 128) != 0 ? new AnnotatedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, null, 6, null) : annotatedString2, (i13 & 256) != 0 ? new AnnotatedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, null, 6, null) : annotatedString3, (i13 & 512) != 0 ? null : bitmap12);
    }

    @NotNull
    public final String getSeasonName() {
        return this.seasonName;
    }

    @Nullable
    public final Bitmap getSeasonBg() {
        return this.seasonBg;
    }

    public final int getSeasonColor() {
        return this.seasonColor;
    }

    @NotNull
    public final TimerDaysAndHours getTimerDaysAndHours() {
        return this.timerDaysAndHours;
    }

    public final int getValueOfExperience() {
        return this.valueOfExperience;
    }

    public final int getMaxLevelExp() {
        return this.maxLevelExp;
    }

    @Nullable
    public final BlackPassProperties getBpProperties() {
        return this.bpProperties;
    }

    @Nullable
    public final Bitmap getPremiumBitmapImage() {
        return this.premiumBitmapImage;
    }

    @Nullable
    public final Bitmap getSeasonBitmapImage() {
        return this.seasonBitmapImage;
    }

    @Nullable
    public final Bitmap getSeasonBitmapImageForRewards() {
        return this.seasonBitmapImageForRewards;
    }

    @NotNull
    public final VIPStateEnum getVipState() {
        return this.vipState;
    }

    @NotNull
    public final List<RewardModel> getRewardsList() {
        return this.rewardsList;
    }

    @Nullable
    public final ArrayList<LevelsInfo> getStandardLevelArray() {
        return this.standardLevelArray;
    }

    @Nullable
    public final ArrayList<LevelsInfo> getPremiumLevelArray() {
        return this.premiumLevelArray;
    }

    public final int getMyPlaceInRating() {
        return this.myPlaceInRating;
    }

    @NotNull
    public final List<CommonRatingModel> getRatingList() {
        return this.ratingList;
    }

    @Nullable
    public final Bitmap getRatingBgImage() {
        return this.ratingBgImage;
    }

    @Nullable
    public final Bitmap getBpExpBitmap() {
        return this.bpExpBitmap;
    }

    public final byte getSelectedCategoryTask() {
        return this.selectedCategoryTask;
    }

    @NotNull
    public final List<TasksInfo> getTasksFromJsonList() {
        return this.tasksFromJsonList;
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

    @NotNull
    public final String getWeeklyTimerForEndCategory() {
        return this.weeklyTimerForEndCategory;
    }

    @Nullable
    public final Bitmap getImgRubBitmap() {
        return this.imgRubBitmap;
    }

    public final int getActivatePremiumCounter() {
        return this.activatePremiumCounter;
    }

    public final int getPremiumStatus() {
        return this.premiumStatus;
    }

    public final int getPremiumPriceInt() {
        return this.premiumPriceInt;
    }

    @NotNull
    public final String getPremiumPrice() {
        return this.premiumPrice;
    }

    public final int getPremiumDeluxePriceInt() {
        return this.premiumDeluxePriceInt;
    }

    @NotNull
    public final String getPremiumDeluxePrice() {
        return this.premiumDeluxePrice;
    }

    @Nullable
    public final Bitmap getImgOfferSplit() {
        return this.imgOfferSplit;
    }

    @Nullable
    public final Bitmap getImgDeluxeCar() {
        return this.imgDeluxeCar;
    }

    @NotNull
    public final String getNameDeluxeCar() {
        return this.nameDeluxeCar;
    }

    @NotNull
    public final AnnotatedString getActivatePremiumSubtitle() {
        return this.activatePremiumSubtitle;
    }

    @NotNull
    public final AnnotatedString getActivatePremiumDeluxeSubtitle() {
        return this.activatePremiumDeluxeSubtitle;
    }

    @NotNull
    public final AnnotatedString getBannerTitlePrize1() {
        return this.bannerTitlePrize1;
    }

    @Nullable
    public final Bitmap getImageDustBitmap() {
        return this.imageDustBitmap;
    }

    @ColorRes
    public final int getBpBtnColor() {
        return this.selectedLayout == 0 ? R.color.black : R.color.white;
    }

    @ColorRes
    public final int getTasksBtnColor() {
        return this.selectedLayout == 1 ? R.color.black : R.color.white;
    }

    @ColorRes
    public final int getRatingBtnColor() {
        return this.selectedLayout == 3 ? R.color.black : R.color.white;
    }

    @ColorRes
    public final int getBpBtnBg() {
        return this.selectedLayout == 0 ? R.color.white : R.color.transparent;
    }

    @ColorRes
    public final int getTasksBtnBg() {
        return this.selectedLayout == 1 ? R.color.white : R.color.transparent;
    }

    @ColorRes
    public final int getRatingBtnBg() {
        return this.selectedLayout == 3 ? R.color.white : R.color.transparent;
    }

    public final boolean isActiveVip() {
        return this.vipState != VIPStateEnum.STANDARD;
    }

    public final int getRubValue() {
        BlackPassProperties blackPassProperties = this.bpProperties;
        if (blackPassProperties == null) {
            return 0;
        }
        if (this.selectedCategoryTask == 0) {
            return blackPassProperties.getWeaklyTasksReward();
        }
        return blackPassProperties.getDailyTasksReward();
    }

    /* renamed from: isButtonBuyPremiumEnabled, reason: from getter */
    public final boolean getIsButtonBuyPremiumEnabled() {
        return this.isButtonBuyPremiumEnabled;
    }
}

