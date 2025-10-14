package com.blackhub.bronline.game.gui.cases;

import android.graphics.Bitmap;
import androidx.annotation.DrawableRes;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.common.C2732C;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.cases.model.Case;
import com.blackhub.bronline.game.gui.cases.model.CaseBonus;
import com.blackhub.bronline.game.gui.cases.model.CasePricesModel;
import com.blackhub.bronline.game.gui.cases.model.CaseReward;
import com.blackhub.bronline.game.gui.cases.model.CaseSprayedInfoAttachment;
import com.blackhub.bronline.game.gui.cases.model.CasesBannerAttachment;
import com.blackhub.bronline.game.gui.cases.model.CasesBonusHintAttachment;
import com.blackhub.bronline.game.gui.cases.model.CasesText;
import com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsAwardsDto;
import com.blackhub.bronline.game.model.remote.response.cases.CasesResponse;
import com.bless.client.R;
import com.fasterxml.jackson.core.p022io.schubfach.DoubleToDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.apache.commons.compress.archivers.zip.UnixStat;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CasesUiState.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final /* data */ class CasesUiState implements UiState {
    public static final int $stable = 8;
    public final boolean allRewardsOpened;

    @NotNull
    public final CaseSprayedInfoAttachment attachmentForServer;

    @NotNull
    public final List<BpRewardsAwardsDto> awardResponse;

    @NotNull
    public final CasesBannerAttachment bannerAttachment;

    @NotNull
    public AnnotatedString bcAmount;

    @Nullable
    public final Bitmap bgImage;

    @NotNull
    public final Map<String, Bitmap> bitmapMap;

    @NotNull
    public final String buttonApplyText;
    public final int buttonPurchaseType;
    public final int caseCount;

    @NotNull
    public final CasePricesModel casePrices;

    @NotNull
    public final CasePricesModel casePricesForGuide;

    @NotNull
    public final CasesBonusHintAttachment casesBonusHintAttachment;

    @NotNull
    public List<Case> casesList;

    @NotNull
    public final CasesResponse casesResponse;

    @NotNull
    public final CasesText casesStrings;

    @Nullable
    public CaseReward currentReward;
    public final int currentRewardIndex;
    public final int currentRewardNumberForUi;
    public final int currentScreen;
    public final int dailyCaseId;
    public final int dialogConfirmationContextType;
    public final int getValueOfDust;

    @NotNull
    public final List<Integer> gettingSelectedRewardIdList;

    @NotNull
    public final List<CaseReward> gettingTenRewardsList;
    public final int goToCasePos;
    public final int heightOfImage;
    public final boolean isAnimationNeed;
    public final boolean isGettingBonusReward;
    public final boolean isHintsBonusInfoOpened;
    public final boolean isHintsOpened;
    public final boolean isMainHintDialogOpened;
    public final boolean isNeedAddCountSuperCase;
    public final boolean isNeedClose;
    public final boolean isNeedShowButtonSpray;
    public final boolean isShowDialogConfirmation;
    public final boolean isShowDialogPreviewReward;
    public final boolean isShowingShimmer;
    public final boolean isSprayed;
    public final int legendaryCaseId;
    public int openingsCount;
    public int openingsProgressBarState;
    public final int priceBcOpeningCases;

    @Nullable
    public final Bitmap prizesBgPattern;

    @NotNull
    public final List<Float> progressBarBonusPercentList;

    @Nullable
    public final Bitmap rewardImage;

    @NotNull
    public final CaseBonus selectedBonusReward;
    public final int selectedBonusRewardId;

    @NotNull
    public final List<CaseBonus> selectedBonuses;

    @NotNull
    public Case selectedCase;
    public int selectedCaseId;

    @Nullable
    public final CaseReward selectedReward;
    public final int selectedRewardPos;

    @NotNull
    public final List<CaseReward> selectedRewards;
    public final int selectedSprayedDust;

    @NotNull
    public final List<Integer> sprayedRewardIdList;

    @NotNull
    public final String titleOpeningCase;
    public final int totalSprayedDust;
    public final int valueOfBc;
    public final int valueOfCurrentDust;
    public final int valueOfMaxDust;
    public final int valueOfOpenedCases;
    public final int widthOfImage;

    public CasesUiState() {
        this(0, null, 0, 0, null, 0, 0, 0, null, null, 0, 0, 0, 0, null, null, null, null, null, null, 0, 0, false, null, null, null, null, 0, 0, false, false, 0, 0, null, null, false, 0, 0, false, false, false, null, null, null, null, null, null, 0, false, null, 0, null, 0, 0, 0, false, null, null, 0, false, false, false, false, -1, Integer.MAX_VALUE, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCurrentScreen() {
        return this.currentScreen;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final CaseReward getSelectedReward() {
        return this.selectedReward;
    }

    /* renamed from: component11, reason: from getter */
    public final int getSelectedRewardPos() {
        return this.selectedRewardPos;
    }

    /* renamed from: component12, reason: from getter */
    public final int getCaseCount() {
        return this.caseCount;
    }

    /* renamed from: component13, reason: from getter */
    public final int getSelectedCaseId() {
        return this.selectedCaseId;
    }

    /* renamed from: component14, reason: from getter */
    public final int getGoToCasePos() {
        return this.goToCasePos;
    }

    @NotNull
    /* renamed from: component15, reason: from getter */
    public final Case getSelectedCase() {
        return this.selectedCase;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final CaseReward getCurrentReward() {
        return this.currentReward;
    }

    @NotNull
    public final List<Case> component17() {
        return this.casesList;
    }

    @NotNull
    public final List<CaseBonus> component18() {
        return this.selectedBonuses;
    }

    @NotNull
    public final List<Float> component19() {
        return this.progressBarBonusPercentList;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CasesText getCasesStrings() {
        return this.casesStrings;
    }

    @NotNull
    public final List<CaseReward> component20() {
        return this.selectedRewards;
    }

    /* renamed from: component21, reason: from getter */
    public final int getCurrentRewardIndex() {
        return this.currentRewardIndex;
    }

    /* renamed from: component22, reason: from getter */
    public final int getCurrentRewardNumberForUi() {
        return this.currentRewardNumberForUi;
    }

    /* renamed from: component23, reason: from getter */
    public final boolean getAllRewardsOpened() {
        return this.allRewardsOpened;
    }

    @NotNull
    public final List<CaseReward> component24() {
        return this.gettingTenRewardsList;
    }

    @NotNull
    public final List<Integer> component25() {
        return this.gettingSelectedRewardIdList;
    }

    @NotNull
    public final List<Integer> component26() {
        return this.sprayedRewardIdList;
    }

    @NotNull
    /* renamed from: component27, reason: from getter */
    public final CaseSprayedInfoAttachment getAttachmentForServer() {
        return this.attachmentForServer;
    }

    /* renamed from: component28, reason: from getter */
    public final int getTotalSprayedDust() {
        return this.totalSprayedDust;
    }

    /* renamed from: component29, reason: from getter */
    public final int getSelectedSprayedDust() {
        return this.selectedSprayedDust;
    }

    /* renamed from: component3, reason: from getter */
    public final int getLegendaryCaseId() {
        return this.legendaryCaseId;
    }

    /* renamed from: component30, reason: from getter */
    public final boolean getIsSprayed() {
        return this.isSprayed;
    }

    /* renamed from: component31, reason: from getter */
    public final boolean getIsNeedShowButtonSpray() {
        return this.isNeedShowButtonSpray;
    }

    /* renamed from: component32, reason: from getter */
    public final int getOpeningsCount() {
        return this.openingsCount;
    }

    /* renamed from: component33, reason: from getter */
    public final int getOpeningsProgressBarState() {
        return this.openingsProgressBarState;
    }

    @NotNull
    /* renamed from: component34, reason: from getter */
    public final CasePricesModel getCasePrices() {
        return this.casePrices;
    }

    @NotNull
    /* renamed from: component35, reason: from getter */
    public final CasePricesModel getCasePricesForGuide() {
        return this.casePricesForGuide;
    }

    /* renamed from: component36, reason: from getter */
    public final boolean getIsNeedClose() {
        return this.isNeedClose;
    }

    /* renamed from: component37, reason: from getter */
    public final int getValueOfCurrentDust() {
        return this.valueOfCurrentDust;
    }

    /* renamed from: component38, reason: from getter */
    public final int getValueOfMaxDust() {
        return this.valueOfMaxDust;
    }

    /* renamed from: component39, reason: from getter */
    public final boolean getIsHintsOpened() {
        return this.isHintsOpened;
    }

    /* renamed from: component4, reason: from getter */
    public final int getDailyCaseId() {
        return this.dailyCaseId;
    }

    /* renamed from: component40, reason: from getter */
    public final boolean getIsMainHintDialogOpened() {
        return this.isMainHintDialogOpened;
    }

    /* renamed from: component41, reason: from getter */
    public final boolean getIsHintsBonusInfoOpened() {
        return this.isHintsBonusInfoOpened;
    }

    @NotNull
    /* renamed from: component42, reason: from getter */
    public final CasesBonusHintAttachment getCasesBonusHintAttachment() {
        return this.casesBonusHintAttachment;
    }

    @NotNull
    /* renamed from: component43, reason: from getter */
    public final CasesResponse getCasesResponse() {
        return this.casesResponse;
    }

    @NotNull
    public final List<BpRewardsAwardsDto> component44() {
        return this.awardResponse;
    }

    @Nullable
    /* renamed from: component45, reason: from getter */
    public final Bitmap getBgImage() {
        return this.bgImage;
    }

    @NotNull
    public final Map<String, Bitmap> component46() {
        return this.bitmapMap;
    }

    @Nullable
    /* renamed from: component47, reason: from getter */
    public final Bitmap getPrizesBgPattern() {
        return this.prizesBgPattern;
    }

    /* renamed from: component48, reason: from getter */
    public final int getButtonPurchaseType() {
        return this.buttonPurchaseType;
    }

    /* renamed from: component49, reason: from getter */
    public final boolean getIsShowDialogConfirmation() {
        return this.isShowDialogConfirmation;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final AnnotatedString getBcAmount() {
        return this.bcAmount;
    }

    @NotNull
    /* renamed from: component50, reason: from getter */
    public final String getButtonApplyText() {
        return this.buttonApplyText;
    }

    /* renamed from: component51, reason: from getter */
    public final int getDialogConfirmationContextType() {
        return this.dialogConfirmationContextType;
    }

    @NotNull
    /* renamed from: component52, reason: from getter */
    public final String getTitleOpeningCase() {
        return this.titleOpeningCase;
    }

    /* renamed from: component53, reason: from getter */
    public final int getValueOfOpenedCases() {
        return this.valueOfOpenedCases;
    }

    /* renamed from: component54, reason: from getter */
    public final int getPriceBcOpeningCases() {
        return this.priceBcOpeningCases;
    }

    /* renamed from: component55, reason: from getter */
    public final int getGetValueOfDust() {
        return this.getValueOfDust;
    }

    /* renamed from: component56, reason: from getter */
    public final boolean getIsShowDialogPreviewReward() {
        return this.isShowDialogPreviewReward;
    }

    @NotNull
    /* renamed from: component57, reason: from getter */
    public final CaseBonus getSelectedBonusReward() {
        return this.selectedBonusReward;
    }

    @Nullable
    /* renamed from: component58, reason: from getter */
    public final Bitmap getRewardImage() {
        return this.rewardImage;
    }

    /* renamed from: component59, reason: from getter */
    public final int getSelectedBonusRewardId() {
        return this.selectedBonusRewardId;
    }

    /* renamed from: component6, reason: from getter */
    public final int getValueOfBc() {
        return this.valueOfBc;
    }

    /* renamed from: component60, reason: from getter */
    public final boolean getIsGettingBonusReward() {
        return this.isGettingBonusReward;
    }

    /* renamed from: component61, reason: from getter */
    public final boolean getIsNeedAddCountSuperCase() {
        return this.isNeedAddCountSuperCase;
    }

    /* renamed from: component62, reason: from getter */
    public final boolean getIsAnimationNeed() {
        return this.isAnimationNeed;
    }

    /* renamed from: component63, reason: from getter */
    public final boolean getIsShowingShimmer() {
        return this.isShowingShimmer;
    }

    /* renamed from: component7, reason: from getter */
    public final int getWidthOfImage() {
        return this.widthOfImage;
    }

    /* renamed from: component8, reason: from getter */
    public final int getHeightOfImage() {
        return this.heightOfImage;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final CasesBannerAttachment getBannerAttachment() {
        return this.bannerAttachment;
    }

    @NotNull
    public final CasesUiState copy(int currentScreen, @NotNull CasesText casesStrings, int legendaryCaseId, int dailyCaseId, @NotNull AnnotatedString bcAmount, int valueOfBc, int widthOfImage, int heightOfImage, @NotNull CasesBannerAttachment bannerAttachment, @Nullable CaseReward selectedReward, int selectedRewardPos, int caseCount, int selectedCaseId, int goToCasePos, @NotNull Case selectedCase, @Nullable CaseReward currentReward, @NotNull List<Case> casesList, @NotNull List<CaseBonus> selectedBonuses, @NotNull List<Float> progressBarBonusPercentList, @NotNull List<CaseReward> selectedRewards, int currentRewardIndex, int currentRewardNumberForUi, boolean allRewardsOpened, @NotNull List<CaseReward> gettingTenRewardsList, @NotNull List<Integer> gettingSelectedRewardIdList, @NotNull List<Integer> sprayedRewardIdList, @NotNull CaseSprayedInfoAttachment attachmentForServer, int totalSprayedDust, int selectedSprayedDust, boolean isSprayed, boolean isNeedShowButtonSpray, int openingsCount, int openingsProgressBarState, @NotNull CasePricesModel casePrices, @NotNull CasePricesModel casePricesForGuide, boolean isNeedClose, int valueOfCurrentDust, int valueOfMaxDust, boolean isHintsOpened, boolean isMainHintDialogOpened, boolean isHintsBonusInfoOpened, @NotNull CasesBonusHintAttachment casesBonusHintAttachment, @NotNull CasesResponse casesResponse, @NotNull List<BpRewardsAwardsDto> awardResponse, @Nullable Bitmap bgImage, @NotNull Map<String, Bitmap> bitmapMap, @Nullable Bitmap prizesBgPattern, int buttonPurchaseType, boolean isShowDialogConfirmation, @NotNull String buttonApplyText, int dialogConfirmationContextType, @NotNull String titleOpeningCase, int valueOfOpenedCases, int priceBcOpeningCases, int getValueOfDust, boolean isShowDialogPreviewReward, @NotNull CaseBonus selectedBonusReward, @Nullable Bitmap rewardImage, int selectedBonusRewardId, boolean isGettingBonusReward, boolean isNeedAddCountSuperCase, boolean isAnimationNeed, boolean isShowingShimmer) {
        Intrinsics.checkNotNullParameter(casesStrings, "casesStrings");
        Intrinsics.checkNotNullParameter(bcAmount, "bcAmount");
        Intrinsics.checkNotNullParameter(bannerAttachment, "bannerAttachment");
        Intrinsics.checkNotNullParameter(selectedCase, "selectedCase");
        Intrinsics.checkNotNullParameter(casesList, "casesList");
        Intrinsics.checkNotNullParameter(selectedBonuses, "selectedBonuses");
        Intrinsics.checkNotNullParameter(progressBarBonusPercentList, "progressBarBonusPercentList");
        Intrinsics.checkNotNullParameter(selectedRewards, "selectedRewards");
        Intrinsics.checkNotNullParameter(gettingTenRewardsList, "gettingTenRewardsList");
        Intrinsics.checkNotNullParameter(gettingSelectedRewardIdList, "gettingSelectedRewardIdList");
        Intrinsics.checkNotNullParameter(sprayedRewardIdList, "sprayedRewardIdList");
        Intrinsics.checkNotNullParameter(attachmentForServer, "attachmentForServer");
        Intrinsics.checkNotNullParameter(casePrices, "casePrices");
        Intrinsics.checkNotNullParameter(casePricesForGuide, "casePricesForGuide");
        Intrinsics.checkNotNullParameter(casesBonusHintAttachment, "casesBonusHintAttachment");
        Intrinsics.checkNotNullParameter(casesResponse, "casesResponse");
        Intrinsics.checkNotNullParameter(awardResponse, "awardResponse");
        Intrinsics.checkNotNullParameter(bitmapMap, "bitmapMap");
        Intrinsics.checkNotNullParameter(buttonApplyText, "buttonApplyText");
        Intrinsics.checkNotNullParameter(titleOpeningCase, "titleOpeningCase");
        Intrinsics.checkNotNullParameter(selectedBonusReward, "selectedBonusReward");
        return new CasesUiState(currentScreen, casesStrings, legendaryCaseId, dailyCaseId, bcAmount, valueOfBc, widthOfImage, heightOfImage, bannerAttachment, selectedReward, selectedRewardPos, caseCount, selectedCaseId, goToCasePos, selectedCase, currentReward, casesList, selectedBonuses, progressBarBonusPercentList, selectedRewards, currentRewardIndex, currentRewardNumberForUi, allRewardsOpened, gettingTenRewardsList, gettingSelectedRewardIdList, sprayedRewardIdList, attachmentForServer, totalSprayedDust, selectedSprayedDust, isSprayed, isNeedShowButtonSpray, openingsCount, openingsProgressBarState, casePrices, casePricesForGuide, isNeedClose, valueOfCurrentDust, valueOfMaxDust, isHintsOpened, isMainHintDialogOpened, isHintsBonusInfoOpened, casesBonusHintAttachment, casesResponse, awardResponse, bgImage, bitmapMap, prizesBgPattern, buttonPurchaseType, isShowDialogConfirmation, buttonApplyText, dialogConfirmationContextType, titleOpeningCase, valueOfOpenedCases, priceBcOpeningCases, getValueOfDust, isShowDialogPreviewReward, selectedBonusReward, rewardImage, selectedBonusRewardId, isGettingBonusReward, isNeedAddCountSuperCase, isAnimationNeed, isShowingShimmer);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CasesUiState)) {
            return false;
        }
        CasesUiState casesUiState = (CasesUiState) other;
        return this.currentScreen == casesUiState.currentScreen && Intrinsics.areEqual(this.casesStrings, casesUiState.casesStrings) && this.legendaryCaseId == casesUiState.legendaryCaseId && this.dailyCaseId == casesUiState.dailyCaseId && Intrinsics.areEqual(this.bcAmount, casesUiState.bcAmount) && this.valueOfBc == casesUiState.valueOfBc && this.widthOfImage == casesUiState.widthOfImage && this.heightOfImage == casesUiState.heightOfImage && Intrinsics.areEqual(this.bannerAttachment, casesUiState.bannerAttachment) && Intrinsics.areEqual(this.selectedReward, casesUiState.selectedReward) && this.selectedRewardPos == casesUiState.selectedRewardPos && this.caseCount == casesUiState.caseCount && this.selectedCaseId == casesUiState.selectedCaseId && this.goToCasePos == casesUiState.goToCasePos && Intrinsics.areEqual(this.selectedCase, casesUiState.selectedCase) && Intrinsics.areEqual(this.currentReward, casesUiState.currentReward) && Intrinsics.areEqual(this.casesList, casesUiState.casesList) && Intrinsics.areEqual(this.selectedBonuses, casesUiState.selectedBonuses) && Intrinsics.areEqual(this.progressBarBonusPercentList, casesUiState.progressBarBonusPercentList) && Intrinsics.areEqual(this.selectedRewards, casesUiState.selectedRewards) && this.currentRewardIndex == casesUiState.currentRewardIndex && this.currentRewardNumberForUi == casesUiState.currentRewardNumberForUi && this.allRewardsOpened == casesUiState.allRewardsOpened && Intrinsics.areEqual(this.gettingTenRewardsList, casesUiState.gettingTenRewardsList) && Intrinsics.areEqual(this.gettingSelectedRewardIdList, casesUiState.gettingSelectedRewardIdList) && Intrinsics.areEqual(this.sprayedRewardIdList, casesUiState.sprayedRewardIdList) && Intrinsics.areEqual(this.attachmentForServer, casesUiState.attachmentForServer) && this.totalSprayedDust == casesUiState.totalSprayedDust && this.selectedSprayedDust == casesUiState.selectedSprayedDust && this.isSprayed == casesUiState.isSprayed && this.isNeedShowButtonSpray == casesUiState.isNeedShowButtonSpray && this.openingsCount == casesUiState.openingsCount && this.openingsProgressBarState == casesUiState.openingsProgressBarState && Intrinsics.areEqual(this.casePrices, casesUiState.casePrices) && Intrinsics.areEqual(this.casePricesForGuide, casesUiState.casePricesForGuide) && this.isNeedClose == casesUiState.isNeedClose && this.valueOfCurrentDust == casesUiState.valueOfCurrentDust && this.valueOfMaxDust == casesUiState.valueOfMaxDust && this.isHintsOpened == casesUiState.isHintsOpened && this.isMainHintDialogOpened == casesUiState.isMainHintDialogOpened && this.isHintsBonusInfoOpened == casesUiState.isHintsBonusInfoOpened && Intrinsics.areEqual(this.casesBonusHintAttachment, casesUiState.casesBonusHintAttachment) && Intrinsics.areEqual(this.casesResponse, casesUiState.casesResponse) && Intrinsics.areEqual(this.awardResponse, casesUiState.awardResponse) && Intrinsics.areEqual(this.bgImage, casesUiState.bgImage) && Intrinsics.areEqual(this.bitmapMap, casesUiState.bitmapMap) && Intrinsics.areEqual(this.prizesBgPattern, casesUiState.prizesBgPattern) && this.buttonPurchaseType == casesUiState.buttonPurchaseType && this.isShowDialogConfirmation == casesUiState.isShowDialogConfirmation && Intrinsics.areEqual(this.buttonApplyText, casesUiState.buttonApplyText) && this.dialogConfirmationContextType == casesUiState.dialogConfirmationContextType && Intrinsics.areEqual(this.titleOpeningCase, casesUiState.titleOpeningCase) && this.valueOfOpenedCases == casesUiState.valueOfOpenedCases && this.priceBcOpeningCases == casesUiState.priceBcOpeningCases && this.getValueOfDust == casesUiState.getValueOfDust && this.isShowDialogPreviewReward == casesUiState.isShowDialogPreviewReward && Intrinsics.areEqual(this.selectedBonusReward, casesUiState.selectedBonusReward) && Intrinsics.areEqual(this.rewardImage, casesUiState.rewardImage) && this.selectedBonusRewardId == casesUiState.selectedBonusRewardId && this.isGettingBonusReward == casesUiState.isGettingBonusReward && this.isNeedAddCountSuperCase == casesUiState.isNeedAddCountSuperCase && this.isAnimationNeed == casesUiState.isAnimationNeed && this.isShowingShimmer == casesUiState.isShowingShimmer;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((Integer.hashCode(this.currentScreen) * 31) + this.casesStrings.hashCode()) * 31) + Integer.hashCode(this.legendaryCaseId)) * 31) + Integer.hashCode(this.dailyCaseId)) * 31) + this.bcAmount.hashCode()) * 31) + Integer.hashCode(this.valueOfBc)) * 31) + Integer.hashCode(this.widthOfImage)) * 31) + Integer.hashCode(this.heightOfImage)) * 31) + this.bannerAttachment.hashCode()) * 31;
        CaseReward caseReward = this.selectedReward;
        int iHashCode2 = (((((((((((iHashCode + (caseReward == null ? 0 : caseReward.hashCode())) * 31) + Integer.hashCode(this.selectedRewardPos)) * 31) + Integer.hashCode(this.caseCount)) * 31) + Integer.hashCode(this.selectedCaseId)) * 31) + Integer.hashCode(this.goToCasePos)) * 31) + this.selectedCase.hashCode()) * 31;
        CaseReward caseReward2 = this.currentReward;
        int iHashCode3 = (((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode2 + (caseReward2 == null ? 0 : caseReward2.hashCode())) * 31) + this.casesList.hashCode()) * 31) + this.selectedBonuses.hashCode()) * 31) + this.progressBarBonusPercentList.hashCode()) * 31) + this.selectedRewards.hashCode()) * 31) + Integer.hashCode(this.currentRewardIndex)) * 31) + Integer.hashCode(this.currentRewardNumberForUi)) * 31) + Boolean.hashCode(this.allRewardsOpened)) * 31) + this.gettingTenRewardsList.hashCode()) * 31) + this.gettingSelectedRewardIdList.hashCode()) * 31) + this.sprayedRewardIdList.hashCode()) * 31) + this.attachmentForServer.hashCode()) * 31) + Integer.hashCode(this.totalSprayedDust)) * 31) + Integer.hashCode(this.selectedSprayedDust)) * 31) + Boolean.hashCode(this.isSprayed)) * 31) + Boolean.hashCode(this.isNeedShowButtonSpray)) * 31) + Integer.hashCode(this.openingsCount)) * 31) + Integer.hashCode(this.openingsProgressBarState)) * 31) + this.casePrices.hashCode()) * 31) + this.casePricesForGuide.hashCode()) * 31) + Boolean.hashCode(this.isNeedClose)) * 31) + Integer.hashCode(this.valueOfCurrentDust)) * 31) + Integer.hashCode(this.valueOfMaxDust)) * 31) + Boolean.hashCode(this.isHintsOpened)) * 31) + Boolean.hashCode(this.isMainHintDialogOpened)) * 31) + Boolean.hashCode(this.isHintsBonusInfoOpened)) * 31) + this.casesBonusHintAttachment.hashCode()) * 31) + this.casesResponse.hashCode()) * 31) + this.awardResponse.hashCode()) * 31;
        Bitmap bitmap = this.bgImage;
        int iHashCode4 = (((iHashCode3 + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + this.bitmapMap.hashCode()) * 31;
        Bitmap bitmap2 = this.prizesBgPattern;
        int iHashCode5 = (((((((((((((((((((((iHashCode4 + (bitmap2 == null ? 0 : bitmap2.hashCode())) * 31) + Integer.hashCode(this.buttonPurchaseType)) * 31) + Boolean.hashCode(this.isShowDialogConfirmation)) * 31) + this.buttonApplyText.hashCode()) * 31) + Integer.hashCode(this.dialogConfirmationContextType)) * 31) + this.titleOpeningCase.hashCode()) * 31) + Integer.hashCode(this.valueOfOpenedCases)) * 31) + Integer.hashCode(this.priceBcOpeningCases)) * 31) + Integer.hashCode(this.getValueOfDust)) * 31) + Boolean.hashCode(this.isShowDialogPreviewReward)) * 31) + this.selectedBonusReward.hashCode()) * 31;
        Bitmap bitmap3 = this.rewardImage;
        return ((((((((((iHashCode5 + (bitmap3 != null ? bitmap3.hashCode() : 0)) * 31) + Integer.hashCode(this.selectedBonusRewardId)) * 31) + Boolean.hashCode(this.isGettingBonusReward)) * 31) + Boolean.hashCode(this.isNeedAddCountSuperCase)) * 31) + Boolean.hashCode(this.isAnimationNeed)) * 31) + Boolean.hashCode(this.isShowingShimmer);
    }

    @NotNull
    public String toString() {
        int i = this.currentScreen;
        CasesText casesText = this.casesStrings;
        int i2 = this.legendaryCaseId;
        int i3 = this.dailyCaseId;
        AnnotatedString annotatedString = this.bcAmount;
        return "CasesUiState(currentScreen=" + i + ", casesStrings=" + casesText + ", legendaryCaseId=" + i2 + ", dailyCaseId=" + i3 + ", bcAmount=" + ((Object) annotatedString) + ", valueOfBc=" + this.valueOfBc + ", widthOfImage=" + this.widthOfImage + ", heightOfImage=" + this.heightOfImage + ", bannerAttachment=" + this.bannerAttachment + ", selectedReward=" + this.selectedReward + ", selectedRewardPos=" + this.selectedRewardPos + ", caseCount=" + this.caseCount + ", selectedCaseId=" + this.selectedCaseId + ", goToCasePos=" + this.goToCasePos + ", selectedCase=" + this.selectedCase + ", currentReward=" + this.currentReward + ", casesList=" + this.casesList + ", selectedBonuses=" + this.selectedBonuses + ", progressBarBonusPercentList=" + this.progressBarBonusPercentList + ", selectedRewards=" + this.selectedRewards + ", currentRewardIndex=" + this.currentRewardIndex + ", currentRewardNumberForUi=" + this.currentRewardNumberForUi + ", allRewardsOpened=" + this.allRewardsOpened + ", gettingTenRewardsList=" + this.gettingTenRewardsList + ", gettingSelectedRewardIdList=" + this.gettingSelectedRewardIdList + ", sprayedRewardIdList=" + this.sprayedRewardIdList + ", attachmentForServer=" + this.attachmentForServer + ", totalSprayedDust=" + this.totalSprayedDust + ", selectedSprayedDust=" + this.selectedSprayedDust + ", isSprayed=" + this.isSprayed + ", isNeedShowButtonSpray=" + this.isNeedShowButtonSpray + ", openingsCount=" + this.openingsCount + ", openingsProgressBarState=" + this.openingsProgressBarState + ", casePrices=" + this.casePrices + ", casePricesForGuide=" + this.casePricesForGuide + ", isNeedClose=" + this.isNeedClose + ", valueOfCurrentDust=" + this.valueOfCurrentDust + ", valueOfMaxDust=" + this.valueOfMaxDust + ", isHintsOpened=" + this.isHintsOpened + ", isMainHintDialogOpened=" + this.isMainHintDialogOpened + ", isHintsBonusInfoOpened=" + this.isHintsBonusInfoOpened + ", casesBonusHintAttachment=" + this.casesBonusHintAttachment + ", casesResponse=" + this.casesResponse + ", awardResponse=" + this.awardResponse + ", bgImage=" + this.bgImage + ", bitmapMap=" + this.bitmapMap + ", prizesBgPattern=" + this.prizesBgPattern + ", buttonPurchaseType=" + this.buttonPurchaseType + ", isShowDialogConfirmation=" + this.isShowDialogConfirmation + ", buttonApplyText=" + this.buttonApplyText + ", dialogConfirmationContextType=" + this.dialogConfirmationContextType + ", titleOpeningCase=" + this.titleOpeningCase + ", valueOfOpenedCases=" + this.valueOfOpenedCases + ", priceBcOpeningCases=" + this.priceBcOpeningCases + ", getValueOfDust=" + this.getValueOfDust + ", isShowDialogPreviewReward=" + this.isShowDialogPreviewReward + ", selectedBonusReward=" + this.selectedBonusReward + ", rewardImage=" + this.rewardImage + ", selectedBonusRewardId=" + this.selectedBonusRewardId + ", isGettingBonusReward=" + this.isGettingBonusReward + ", isNeedAddCountSuperCase=" + this.isNeedAddCountSuperCase + ", isAnimationNeed=" + this.isAnimationNeed + ", isShowingShimmer=" + this.isShowingShimmer + ")";
    }

    public CasesUiState(int i, @NotNull CasesText casesStrings, int i2, int i3, @NotNull AnnotatedString bcAmount, int i4, int i5, int i6, @NotNull CasesBannerAttachment bannerAttachment, @Nullable CaseReward caseReward, int i7, int i8, int i9, int i10, @NotNull Case selectedCase, @Nullable CaseReward caseReward2, @NotNull List<Case> casesList, @NotNull List<CaseBonus> selectedBonuses, @NotNull List<Float> progressBarBonusPercentList, @NotNull List<CaseReward> selectedRewards, int i11, int i12, boolean z, @NotNull List<CaseReward> gettingTenRewardsList, @NotNull List<Integer> gettingSelectedRewardIdList, @NotNull List<Integer> sprayedRewardIdList, @NotNull CaseSprayedInfoAttachment attachmentForServer, int i13, int i14, boolean z2, boolean z3, int i15, int i16, @NotNull CasePricesModel casePrices, @NotNull CasePricesModel casePricesForGuide, boolean z4, int i17, int i18, boolean z5, boolean z6, boolean z7, @NotNull CasesBonusHintAttachment casesBonusHintAttachment, @NotNull CasesResponse casesResponse, @NotNull List<BpRewardsAwardsDto> awardResponse, @Nullable Bitmap bitmap, @NotNull Map<String, Bitmap> bitmapMap, @Nullable Bitmap bitmap2, int i19, boolean z8, @NotNull String buttonApplyText, int i20, @NotNull String titleOpeningCase, int i21, int i22, int i23, boolean z9, @NotNull CaseBonus selectedBonusReward, @Nullable Bitmap bitmap3, int i24, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(casesStrings, "casesStrings");
        Intrinsics.checkNotNullParameter(bcAmount, "bcAmount");
        Intrinsics.checkNotNullParameter(bannerAttachment, "bannerAttachment");
        Intrinsics.checkNotNullParameter(selectedCase, "selectedCase");
        Intrinsics.checkNotNullParameter(casesList, "casesList");
        Intrinsics.checkNotNullParameter(selectedBonuses, "selectedBonuses");
        Intrinsics.checkNotNullParameter(progressBarBonusPercentList, "progressBarBonusPercentList");
        Intrinsics.checkNotNullParameter(selectedRewards, "selectedRewards");
        Intrinsics.checkNotNullParameter(gettingTenRewardsList, "gettingTenRewardsList");
        Intrinsics.checkNotNullParameter(gettingSelectedRewardIdList, "gettingSelectedRewardIdList");
        Intrinsics.checkNotNullParameter(sprayedRewardIdList, "sprayedRewardIdList");
        Intrinsics.checkNotNullParameter(attachmentForServer, "attachmentForServer");
        Intrinsics.checkNotNullParameter(casePrices, "casePrices");
        Intrinsics.checkNotNullParameter(casePricesForGuide, "casePricesForGuide");
        Intrinsics.checkNotNullParameter(casesBonusHintAttachment, "casesBonusHintAttachment");
        Intrinsics.checkNotNullParameter(casesResponse, "casesResponse");
        Intrinsics.checkNotNullParameter(awardResponse, "awardResponse");
        Intrinsics.checkNotNullParameter(bitmapMap, "bitmapMap");
        Intrinsics.checkNotNullParameter(buttonApplyText, "buttonApplyText");
        Intrinsics.checkNotNullParameter(titleOpeningCase, "titleOpeningCase");
        Intrinsics.checkNotNullParameter(selectedBonusReward, "selectedBonusReward");
        this.currentScreen = i;
        this.casesStrings = casesStrings;
        this.legendaryCaseId = i2;
        this.dailyCaseId = i3;
        this.bcAmount = bcAmount;
        this.valueOfBc = i4;
        this.widthOfImage = i5;
        this.heightOfImage = i6;
        this.bannerAttachment = bannerAttachment;
        this.selectedReward = caseReward;
        this.selectedRewardPos = i7;
        this.caseCount = i8;
        this.selectedCaseId = i9;
        this.goToCasePos = i10;
        this.selectedCase = selectedCase;
        this.currentReward = caseReward2;
        this.casesList = casesList;
        this.selectedBonuses = selectedBonuses;
        this.progressBarBonusPercentList = progressBarBonusPercentList;
        this.selectedRewards = selectedRewards;
        this.currentRewardIndex = i11;
        this.currentRewardNumberForUi = i12;
        this.allRewardsOpened = z;
        this.gettingTenRewardsList = gettingTenRewardsList;
        this.gettingSelectedRewardIdList = gettingSelectedRewardIdList;
        this.sprayedRewardIdList = sprayedRewardIdList;
        this.attachmentForServer = attachmentForServer;
        this.totalSprayedDust = i13;
        this.selectedSprayedDust = i14;
        this.isSprayed = z2;
        this.isNeedShowButtonSpray = z3;
        this.openingsCount = i15;
        this.openingsProgressBarState = i16;
        this.casePrices = casePrices;
        this.casePricesForGuide = casePricesForGuide;
        this.isNeedClose = z4;
        this.valueOfCurrentDust = i17;
        this.valueOfMaxDust = i18;
        this.isHintsOpened = z5;
        this.isMainHintDialogOpened = z6;
        this.isHintsBonusInfoOpened = z7;
        this.casesBonusHintAttachment = casesBonusHintAttachment;
        this.casesResponse = casesResponse;
        this.awardResponse = awardResponse;
        this.bgImage = bitmap;
        this.bitmapMap = bitmapMap;
        this.prizesBgPattern = bitmap2;
        this.buttonPurchaseType = i19;
        this.isShowDialogConfirmation = z8;
        this.buttonApplyText = buttonApplyText;
        this.dialogConfirmationContextType = i20;
        this.titleOpeningCase = titleOpeningCase;
        this.valueOfOpenedCases = i21;
        this.priceBcOpeningCases = i22;
        this.getValueOfDust = i23;
        this.isShowDialogPreviewReward = z9;
        this.selectedBonusReward = selectedBonusReward;
        this.rewardImage = bitmap3;
        this.selectedBonusRewardId = i24;
        this.isGettingBonusReward = z10;
        this.isNeedAddCountSuperCase = z11;
        this.isAnimationNeed = z12;
        this.isShowingShimmer = z13;
    }

    public final int getCurrentScreen() {
        return this.currentScreen;
    }

    public /* synthetic */ CasesUiState(int i, CasesText casesText, int i2, int i3, AnnotatedString annotatedString, int i4, int i5, int i6, CasesBannerAttachment casesBannerAttachment, CaseReward caseReward, int i7, int i8, int i9, int i10, Case r87, CaseReward caseReward2, List list, List list2, List list3, List list4, int i11, int i12, boolean z, List list5, List list6, List list7, CaseSprayedInfoAttachment caseSprayedInfoAttachment, int i13, int i14, boolean z2, boolean z3, int i15, int i16, CasePricesModel casePricesModel, CasePricesModel casePricesModel2, boolean z4, int i17, int i18, boolean z5, boolean z6, boolean z7, CasesBonusHintAttachment casesBonusHintAttachment, CasesResponse casesResponse, List list8, Bitmap bitmap, Map map, Bitmap bitmap2, int i19, boolean z8, String str, int i20, String str2, int i21, int i22, int i23, boolean z9, CaseBonus caseBonus, Bitmap bitmap3, int i24, boolean z10, boolean z11, boolean z12, boolean z13, int i25, int i26, DefaultConstructorMarker defaultConstructorMarker) {
        int i27;
        Case r34;
        int i28;
        CaseSprayedInfoAttachment caseSprayedInfoAttachment2;
        int i29 = (i25 & 1) != 0 ? 0 : i;
        CasesText casesText2 = (i25 & 2) != 0 ? new CasesText(null, null, null, null, null, null, null, 127, null) : casesText;
        int i30 = (i25 & 4) != 0 ? 0 : i2;
        int i31 = (i25 & 8) != 0 ? 0 : i3;
        AnnotatedString annotatedString2 = (i25 & 16) != 0 ? new AnnotatedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, null, 6, null) : annotatedString;
        int i32 = (i25 & 32) != 0 ? 0 : i4;
        int i33 = (i25 & 64) != 0 ? 512 : i5;
        int i34 = (i25 & 128) == 0 ? i6 : 512;
        CasesBannerAttachment casesBannerAttachment2 = (i25 & 256) != 0 ? new CasesBannerAttachment(null, null, null, null, null, null, null, null, null, null, null, DoubleToDecimal.BQ_MASK, null) : casesBannerAttachment;
        CaseReward caseReward3 = (i25 & 512) != 0 ? null : caseReward;
        int i35 = (i25 & 1024) != 0 ? 0 : i7;
        int i36 = (i25 & 2048) != 0 ? 0 : i8;
        int i37 = (i25 & 4096) != 0 ? 0 : i9;
        int i38 = (i25 & 8192) != 0 ? 0 : i10;
        Case r13 = (i25 & 16384) != 0 ? new Case(0, null, null, null, 0, false, 0, null, null, null, 0, false, null, null, 0, null, 65535, null) : r87;
        CaseReward caseReward4 = (i25 & 32768) != 0 ? null : caseReward2;
        List listEmptyList = (i25 & 65536) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list;
        List listEmptyList2 = (i25 & 131072) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2;
        List listEmptyList3 = (i25 & 262144) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3;
        List listEmptyList4 = (i25 & 524288) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list4;
        int i39 = (i25 & 1048576) != 0 ? 0 : i11;
        int i40 = (i25 & 2097152) != 0 ? 1 : i12;
        boolean z14 = (i25 & 4194304) != 0 ? false : z;
        List listEmptyList5 = (i25 & 8388608) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list5;
        List arrayList = (i25 & 16777216) != 0 ? new ArrayList() : list6;
        List arrayList2 = (i25 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? new ArrayList() : list7;
        if ((i25 & 67108864) != 0) {
            r34 = r13;
            i27 = i37;
            i28 = i36;
            caseSprayedInfoAttachment2 = new CaseSprayedInfoAttachment(null, null, 3, null);
        } else {
            i27 = i37;
            r34 = r13;
            i28 = i36;
            caseSprayedInfoAttachment2 = caseSprayedInfoAttachment;
        }
        this(i29, casesText2, i30, i31, annotatedString2, i32, i33, i34, casesBannerAttachment2, caseReward3, i35, i28, i27, i38, r34, caseReward4, listEmptyList, listEmptyList2, listEmptyList3, listEmptyList4, i39, i40, z14, listEmptyList5, arrayList, arrayList2, caseSprayedInfoAttachment2, (134217728 & i25) != 0 ? 0 : i13, (i25 & 268435456) != 0 ? 0 : i14, (i25 & 536870912) != 0 ? false : z2, (i25 & 1073741824) != 0 ? true : z3, (i25 & Integer.MIN_VALUE) != 0 ? 0 : i15, (i26 & 1) != 0 ? 0 : i16, (i26 & 2) != 0 ? new CasePricesModel(null, null, 0, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 16383, null) : casePricesModel, (i26 & 4) != 0 ? new CasePricesModel(null, null, 0, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 16383, null) : casePricesModel2, (i26 & 8) != 0 ? false : z4, (i26 & 16) != 0 ? 0 : i17, (i26 & 32) != 0 ? 0 : i18, (i26 & 64) != 0 ? false : z5, (i26 & 128) != 0 ? false : z6, (i26 & 256) != 0 ? false : z7, (i26 & 512) != 0 ? new CasesBonusHintAttachment(null, null, null, null, null, null, 63, null) : casesBonusHintAttachment, (i26 & 1024) != 0 ? new CasesResponse(null, null, null, 7, null) : casesResponse, (i26 & 2048) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list8, (i26 & 4096) != 0 ? null : bitmap, (i26 & 8192) != 0 ? MapsKt__MapsKt.emptyMap() : map, (i26 & 16384) != 0 ? null : bitmap2, (i26 & 32768) != 0 ? 0 : i19, (i26 & 65536) != 0 ? false : z8, (i26 & 131072) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i26 & 262144) != 0 ? 0 : i20, (i26 & 524288) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i26 & 1048576) != 0 ? 0 : i21, (i26 & 2097152) != 0 ? 0 : i22, (i26 & 4194304) != 0 ? 0 : i23, (i26 & 8388608) != 0 ? false : z9, (i26 & 16777216) != 0 ? new CaseBonus(0, 0, null, null, 0, 0, null, 0, false, null, null, 0, UnixStat.PERM_MASK, null) : caseBonus, (i26 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? null : bitmap3, (i26 & 67108864) != 0 ? 0 : i24, (i26 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? false : z10, (i26 & 268435456) != 0 ? true : z11, (i26 & 536870912) != 0 ? true : z12, (i26 & 1073741824) == 0 ? z13 : true);
    }

    @NotNull
    public final CasesText getCasesStrings() {
        return this.casesStrings;
    }

    public final int getLegendaryCaseId() {
        return this.legendaryCaseId;
    }

    public final int getDailyCaseId() {
        return this.dailyCaseId;
    }

    @NotNull
    public final AnnotatedString getBcAmount() {
        return this.bcAmount;
    }

    public final void setBcAmount(@NotNull AnnotatedString annotatedString) {
        Intrinsics.checkNotNullParameter(annotatedString, "<set-?>");
        this.bcAmount = annotatedString;
    }

    public final int getValueOfBc() {
        return this.valueOfBc;
    }

    public final int getWidthOfImage() {
        return this.widthOfImage;
    }

    public final int getHeightOfImage() {
        return this.heightOfImage;
    }

    @NotNull
    public final CasesBannerAttachment getBannerAttachment() {
        return this.bannerAttachment;
    }

    @Nullable
    public final CaseReward getSelectedReward() {
        return this.selectedReward;
    }

    public final int getSelectedRewardPos() {
        return this.selectedRewardPos;
    }

    public final int getCaseCount() {
        return this.caseCount;
    }

    public final int getSelectedCaseId() {
        return this.selectedCaseId;
    }

    public final void setSelectedCaseId(int i) {
        this.selectedCaseId = i;
    }

    public final int getGoToCasePos() {
        return this.goToCasePos;
    }

    @NotNull
    public final Case getSelectedCase() {
        return this.selectedCase;
    }

    public final void setSelectedCase(@NotNull Case r2) {
        Intrinsics.checkNotNullParameter(r2, "<set-?>");
        this.selectedCase = r2;
    }

    @Nullable
    public final CaseReward getCurrentReward() {
        return this.currentReward;
    }

    public final void setCurrentReward(@Nullable CaseReward caseReward) {
        this.currentReward = caseReward;
    }

    @NotNull
    public final List<Case> getCasesList() {
        return this.casesList;
    }

    public final void setCasesList(@NotNull List<Case> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.casesList = list;
    }

    @NotNull
    public final List<CaseBonus> getSelectedBonuses() {
        return this.selectedBonuses;
    }

    @NotNull
    public final List<Float> getProgressBarBonusPercentList() {
        return this.progressBarBonusPercentList;
    }

    @NotNull
    public final List<CaseReward> getSelectedRewards() {
        return this.selectedRewards;
    }

    public final int getCurrentRewardIndex() {
        return this.currentRewardIndex;
    }

    public final int getCurrentRewardNumberForUi() {
        return this.currentRewardNumberForUi;
    }

    public final boolean getAllRewardsOpened() {
        return this.allRewardsOpened;
    }

    @NotNull
    public final List<CaseReward> getGettingTenRewardsList() {
        return this.gettingTenRewardsList;
    }

    @NotNull
    public final List<Integer> getGettingSelectedRewardIdList() {
        return this.gettingSelectedRewardIdList;
    }

    @NotNull
    public final List<Integer> getSprayedRewardIdList() {
        return this.sprayedRewardIdList;
    }

    @NotNull
    public final CaseSprayedInfoAttachment getAttachmentForServer() {
        return this.attachmentForServer;
    }

    public final int getTotalSprayedDust() {
        return this.totalSprayedDust;
    }

    public final int getSelectedSprayedDust() {
        return this.selectedSprayedDust;
    }

    public final boolean isSprayed() {
        return this.isSprayed;
    }

    public final boolean isNeedShowButtonSpray() {
        return this.isNeedShowButtonSpray;
    }

    public final int getOpeningsCount() {
        return this.openingsCount;
    }

    public final void setOpeningsCount(int i) {
        this.openingsCount = i;
    }

    public final int getOpeningsProgressBarState() {
        return this.openingsProgressBarState;
    }

    public final void setOpeningsProgressBarState(int i) {
        this.openingsProgressBarState = i;
    }

    @NotNull
    public final CasePricesModel getCasePrices() {
        return this.casePrices;
    }

    @NotNull
    public final CasePricesModel getCasePricesForGuide() {
        return this.casePricesForGuide;
    }

    public final boolean isNeedClose() {
        return this.isNeedClose;
    }

    public final int getValueOfCurrentDust() {
        return this.valueOfCurrentDust;
    }

    public final int getValueOfMaxDust() {
        return this.valueOfMaxDust;
    }

    public final boolean isHintsOpened() {
        return this.isHintsOpened;
    }

    public final boolean isMainHintDialogOpened() {
        return this.isMainHintDialogOpened;
    }

    public final boolean isHintsBonusInfoOpened() {
        return this.isHintsBonusInfoOpened;
    }

    @NotNull
    public final CasesBonusHintAttachment getCasesBonusHintAttachment() {
        return this.casesBonusHintAttachment;
    }

    @NotNull
    public final CasesResponse getCasesResponse() {
        return this.casesResponse;
    }

    @NotNull
    public final List<BpRewardsAwardsDto> getAwardResponse() {
        return this.awardResponse;
    }

    @Nullable
    public final Bitmap getBgImage() {
        return this.bgImage;
    }

    @NotNull
    public final Map<String, Bitmap> getBitmapMap() {
        return this.bitmapMap;
    }

    @Nullable
    public final Bitmap getPrizesBgPattern() {
        return this.prizesBgPattern;
    }

    public final int getButtonPurchaseType() {
        return this.buttonPurchaseType;
    }

    public final boolean isShowDialogConfirmation() {
        return this.isShowDialogConfirmation;
    }

    @NotNull
    public final String getButtonApplyText() {
        return this.buttonApplyText;
    }

    public final int getDialogConfirmationContextType() {
        return this.dialogConfirmationContextType;
    }

    @NotNull
    public final String getTitleOpeningCase() {
        return this.titleOpeningCase;
    }

    public final int getValueOfOpenedCases() {
        return this.valueOfOpenedCases;
    }

    public final int getPriceBcOpeningCases() {
        return this.priceBcOpeningCases;
    }

    public final int getGetValueOfDust() {
        return this.getValueOfDust;
    }

    public final boolean isShowDialogPreviewReward() {
        return this.isShowDialogPreviewReward;
    }

    @NotNull
    public final CaseBonus getSelectedBonusReward() {
        return this.selectedBonusReward;
    }

    @Nullable
    public final Bitmap getRewardImage() {
        return this.rewardImage;
    }

    public final int getSelectedBonusRewardId() {
        return this.selectedBonusRewardId;
    }

    public final boolean isGettingBonusReward() {
        return this.isGettingBonusReward;
    }

    public final boolean isNeedAddCountSuperCase() {
        return this.isNeedAddCountSuperCase;
    }

    public final boolean isAnimationNeed() {
        return this.isAnimationNeed;
    }

    public final boolean isShowingShimmer() {
        return this.isShowingShimmer;
    }

    public final float getGetOpenOneCaseBtnWidth() {
        return (!this.isHintsOpened && this.casePrices.getTypeOpenOneCaseButton() == 0) ? 1.0f : 0.5f;
    }

    public final float getGetOpenTenCasesBtnWidth() {
        return (!this.isHintsOpened && this.casePrices.getTypeOpenTenCaseButton() == 0) ? 1.0f : 0.5f;
    }

    @DrawableRes
    public final int getGetCloseBtnRes() {
        return this.isHintsOpened ? R.drawable.ic_close_rounded : R.drawable.ic_arrow_back;
    }

    public final int getGetValueOfPreviewDust() {
        int i = this.valueOfCurrentDust + this.totalSprayedDust;
        int i2 = this.valueOfMaxDust;
        return i > i2 ? i2 : i;
    }

    public final float getGetAlphaIsOpenedHints() {
        return this.isHintsOpened ? 0.0f : 1.0f;
    }

    @NotNull
    public final CaseReward getSingleFirstReward() {
        CaseReward caseReward = (CaseReward) CollectionsKt___CollectionsKt.firstOrNull((List) this.gettingTenRewardsList);
        return caseReward == null ? new CaseReward(0, 0, null, null, null, null, 0, null, null, false, false, false, 0, false, null, null, 0, 131071, null) : caseReward;
    }

    @NotNull
    public final CasePricesModel getPriceStateIsHintsOpened() {
        return this.isHintsOpened ? this.casePricesForGuide : this.casePrices;
    }

    public final boolean isSelectedItems() {
        return !this.gettingSelectedRewardIdList.isEmpty();
    }
}

