package com.blackhub.bronline.game.gui.gifts;

import android.graphics.Bitmap;
import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.gui.gifts.model.GiftsPreviewItemModel;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GiftsUiState.kt */
@StabilityInferred(parameters = 0)

public final /* data */ class GiftsUiState implements UiState {
    public static final int $stable = 8;

    @Nullable
    public final Bitmap bgImage;
    public final int eventId;

    @Nullable
    public final GiftsPreviewItemModel giftFirst;

    @Nullable
    public final GiftsPreviewItemModel giftSecond;
    public final boolean isBlockingLoading;
    public boolean isButtonGetVisible;
    public final boolean isClickedOpenCase;
    public final boolean isHideBlockWithBC;
    public final boolean isNeedClose;
    public final boolean isOpeningBox;
    public final boolean isSecondGiftVisible;
    public final boolean isStandard;
    public final boolean isVisibleButtonBack;

    @Nullable
    public final List<GiftsPreviewItemModel> legendaryGifts;
    public final int priceOfLegendaryGift;
    public final int screen;

    @Nullable
    public final List<GiftsPreviewItemModel> standardGifts;
    public final int valueOfBC;
    public final int valueOfLegendaryGifts;
    public final int valueOfOpenedGifts;
    public final int valueOfStandardGifts;

    public GiftsUiState() {
        this(0, 0, null, 0, 0, 0, 0, null, null, false, false, null, null, false, false, false, 0, false, false, false, false, 2097151, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getEventId() {
        return this.eventId;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsVisibleButtonBack() {
        return this.isVisibleButtonBack;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsOpeningBox() {
        return this.isOpeningBox;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final GiftsPreviewItemModel getGiftFirst() {
        return this.giftFirst;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final GiftsPreviewItemModel getGiftSecond() {
        return this.giftSecond;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsStandard() {
        return this.isStandard;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getIsSecondGiftVisible() {
        return this.isSecondGiftVisible;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getIsButtonGetVisible() {
        return this.isButtonGetVisible;
    }

    /* renamed from: component17, reason: from getter */
    public final int getValueOfOpenedGifts() {
        return this.valueOfOpenedGifts;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getIsHideBlockWithBC() {
        return this.isHideBlockWithBC;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getIsNeedClose() {
        return this.isNeedClose;
    }

    /* renamed from: component2, reason: from getter */
    public final int getScreen() {
        return this.screen;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getIsBlockingLoading() {
        return this.isBlockingLoading;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getIsClickedOpenCase() {
        return this.isClickedOpenCase;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Bitmap getBgImage() {
        return this.bgImage;
    }

    /* renamed from: component4, reason: from getter */
    public final int getValueOfBC() {
        return this.valueOfBC;
    }

    /* renamed from: component5, reason: from getter */
    public final int getValueOfStandardGifts() {
        return this.valueOfStandardGifts;
    }

    /* renamed from: component6, reason: from getter */
    public final int getValueOfLegendaryGifts() {
        return this.valueOfLegendaryGifts;
    }

    /* renamed from: component7, reason: from getter */
    public final int getPriceOfLegendaryGift() {
        return this.priceOfLegendaryGift;
    }

    @Nullable
    public final List<GiftsPreviewItemModel> component8() {
        return this.standardGifts;
    }

    @Nullable
    public final List<GiftsPreviewItemModel> component9() {
        return this.legendaryGifts;
    }

    @NotNull
    public final GiftsUiState copy(int eventId, int screen, @Nullable Bitmap bgImage, int valueOfBC, int valueOfStandardGifts, int valueOfLegendaryGifts, int priceOfLegendaryGift, @Nullable List<GiftsPreviewItemModel> standardGifts, @Nullable List<GiftsPreviewItemModel> legendaryGifts, boolean isVisibleButtonBack, boolean isOpeningBox, @Nullable GiftsPreviewItemModel giftFirst, @Nullable GiftsPreviewItemModel giftSecond, boolean isStandard, boolean isSecondGiftVisible, boolean isButtonGetVisible, int valueOfOpenedGifts, boolean isHideBlockWithBC, boolean isNeedClose, boolean isBlockingLoading, boolean isClickedOpenCase) {
        return new GiftsUiState(eventId, screen, bgImage, valueOfBC, valueOfStandardGifts, valueOfLegendaryGifts, priceOfLegendaryGift, standardGifts, legendaryGifts, isVisibleButtonBack, isOpeningBox, giftFirst, giftSecond, isStandard, isSecondGiftVisible, isButtonGetVisible, valueOfOpenedGifts, isHideBlockWithBC, isNeedClose, isBlockingLoading, isClickedOpenCase);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GiftsUiState)) {
            return false;
        }
        GiftsUiState giftsUiState = (GiftsUiState) other;
        return this.eventId == giftsUiState.eventId && this.screen == giftsUiState.screen && Intrinsics.areEqual(this.bgImage, giftsUiState.bgImage) && this.valueOfBC == giftsUiState.valueOfBC && this.valueOfStandardGifts == giftsUiState.valueOfStandardGifts && this.valueOfLegendaryGifts == giftsUiState.valueOfLegendaryGifts && this.priceOfLegendaryGift == giftsUiState.priceOfLegendaryGift && Intrinsics.areEqual(this.standardGifts, giftsUiState.standardGifts) && Intrinsics.areEqual(this.legendaryGifts, giftsUiState.legendaryGifts) && this.isVisibleButtonBack == giftsUiState.isVisibleButtonBack && this.isOpeningBox == giftsUiState.isOpeningBox && Intrinsics.areEqual(this.giftFirst, giftsUiState.giftFirst) && Intrinsics.areEqual(this.giftSecond, giftsUiState.giftSecond) && this.isStandard == giftsUiState.isStandard && this.isSecondGiftVisible == giftsUiState.isSecondGiftVisible && this.isButtonGetVisible == giftsUiState.isButtonGetVisible && this.valueOfOpenedGifts == giftsUiState.valueOfOpenedGifts && this.isHideBlockWithBC == giftsUiState.isHideBlockWithBC && this.isNeedClose == giftsUiState.isNeedClose && this.isBlockingLoading == giftsUiState.isBlockingLoading && this.isClickedOpenCase == giftsUiState.isClickedOpenCase;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.eventId) * 31) + Integer.hashCode(this.screen)) * 31;
        Bitmap bitmap = this.bgImage;
        int iHashCode2 = (((((((((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + Integer.hashCode(this.valueOfBC)) * 31) + Integer.hashCode(this.valueOfStandardGifts)) * 31) + Integer.hashCode(this.valueOfLegendaryGifts)) * 31) + Integer.hashCode(this.priceOfLegendaryGift)) * 31;
        List<GiftsPreviewItemModel> list = this.standardGifts;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<GiftsPreviewItemModel> list2 = this.legendaryGifts;
        int iHashCode4 = (((((iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31) + Boolean.hashCode(this.isVisibleButtonBack)) * 31) + Boolean.hashCode(this.isOpeningBox)) * 31;
        GiftsPreviewItemModel giftsPreviewItemModel = this.giftFirst;
        int iHashCode5 = (iHashCode4 + (giftsPreviewItemModel == null ? 0 : giftsPreviewItemModel.hashCode())) * 31;
        GiftsPreviewItemModel giftsPreviewItemModel2 = this.giftSecond;
        return ((((((((((((((((iHashCode5 + (giftsPreviewItemModel2 != null ? giftsPreviewItemModel2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isStandard)) * 31) + Boolean.hashCode(this.isSecondGiftVisible)) * 31) + Boolean.hashCode(this.isButtonGetVisible)) * 31) + Integer.hashCode(this.valueOfOpenedGifts)) * 31) + Boolean.hashCode(this.isHideBlockWithBC)) * 31) + Boolean.hashCode(this.isNeedClose)) * 31) + Boolean.hashCode(this.isBlockingLoading)) * 31) + Boolean.hashCode(this.isClickedOpenCase);
    }

    @NotNull
    public String toString() {
        return "GiftsUiState(eventId=" + this.eventId + ", screen=" + this.screen + ", bgImage=" + this.bgImage + ", valueOfBC=" + this.valueOfBC + ", valueOfStandardGifts=" + this.valueOfStandardGifts + ", valueOfLegendaryGifts=" + this.valueOfLegendaryGifts + ", priceOfLegendaryGift=" + this.priceOfLegendaryGift + ", standardGifts=" + this.standardGifts + ", legendaryGifts=" + this.legendaryGifts + ", isVisibleButtonBack=" + this.isVisibleButtonBack + ", isOpeningBox=" + this.isOpeningBox + ", giftFirst=" + this.giftFirst + ", giftSecond=" + this.giftSecond + ", isStandard=" + this.isStandard + ", isSecondGiftVisible=" + this.isSecondGiftVisible + ", isButtonGetVisible=" + this.isButtonGetVisible + ", valueOfOpenedGifts=" + this.valueOfOpenedGifts + ", isHideBlockWithBC=" + this.isHideBlockWithBC + ", isNeedClose=" + this.isNeedClose + ", isBlockingLoading=" + this.isBlockingLoading + ", isClickedOpenCase=" + this.isClickedOpenCase + ")";
    }

    public GiftsUiState(int i, int i2, @Nullable Bitmap bitmap, int i3, int i4, int i5, int i6, @Nullable List<GiftsPreviewItemModel> list, @Nullable List<GiftsPreviewItemModel> list2, boolean z, boolean z2, @Nullable GiftsPreviewItemModel giftsPreviewItemModel, @Nullable GiftsPreviewItemModel giftsPreviewItemModel2, boolean z3, boolean z4, boolean z5, int i7, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.eventId = i;
        this.screen = i2;
        this.bgImage = bitmap;
        this.valueOfBC = i3;
        this.valueOfStandardGifts = i4;
        this.valueOfLegendaryGifts = i5;
        this.priceOfLegendaryGift = i6;
        this.standardGifts = list;
        this.legendaryGifts = list2;
        this.isVisibleButtonBack = z;
        this.isOpeningBox = z2;
        this.giftFirst = giftsPreviewItemModel;
        this.giftSecond = giftsPreviewItemModel2;
        this.isStandard = z3;
        this.isSecondGiftVisible = z4;
        this.isButtonGetVisible = z5;
        this.valueOfOpenedGifts = i7;
        this.isHideBlockWithBC = z6;
        this.isNeedClose = z7;
        this.isBlockingLoading = z8;
        this.isClickedOpenCase = z9;
    }

    public final int getEventId() {
        return this.eventId;
    }

    public final int getScreen() {
        return this.screen;
    }

    @Nullable
    public final Bitmap getBgImage() {
        return this.bgImage;
    }

    public final int getValueOfBC() {
        return this.valueOfBC;
    }

    public final int getValueOfStandardGifts() {
        return this.valueOfStandardGifts;
    }

    public final int getValueOfLegendaryGifts() {
        return this.valueOfLegendaryGifts;
    }

    public final int getPriceOfLegendaryGift() {
        return this.priceOfLegendaryGift;
    }

    public /* synthetic */ GiftsUiState(int i, int i2, Bitmap bitmap, int i3, int i4, int i5, int i6, List list, List list2, boolean z, boolean z2, GiftsPreviewItemModel giftsPreviewItemModel, GiftsPreviewItemModel giftsPreviewItemModel2, boolean z3, boolean z4, boolean z5, int i7, boolean z6, boolean z7, boolean z8, boolean z9, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 1 : i, (i8 & 2) != 0 ? 0 : i2, (i8 & 4) != 0 ? null : bitmap, (i8 & 8) != 0 ? 0 : i3, (i8 & 16) != 0 ? 0 : i4, (i8 & 32) != 0 ? 0 : i5, (i8 & 64) != 0 ? 0 : i6, (i8 & 128) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i8 & 256) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i8 & 512) != 0 ? false : z, (i8 & 1024) != 0 ? false : z2, (i8 & 2048) != 0 ? null : giftsPreviewItemModel, (i8 & 4096) == 0 ? giftsPreviewItemModel2 : null, (i8 & 8192) != 0 ? true : z3, (i8 & 16384) != 0 ? false : z4, (i8 & 32768) != 0 ? false : z5, (i8 & 65536) != 0 ? 0 : i7, (i8 & 131072) != 0 ? false : z6, (i8 & 262144) != 0 ? false : z7, (i8 & 524288) != 0 ? false : z8, (i8 & 1048576) != 0 ? false : z9);
    }

    @Nullable
    public final List<GiftsPreviewItemModel> getStandardGifts() {
        return this.standardGifts;
    }

    @Nullable
    public final List<GiftsPreviewItemModel> getLegendaryGifts() {
        return this.legendaryGifts;
    }

    public final boolean isVisibleButtonBack() {
        return this.isVisibleButtonBack;
    }

    public final boolean isOpeningBox() {
        return this.isOpeningBox;
    }

    @Nullable
    public final GiftsPreviewItemModel getGiftFirst() {
        return this.giftFirst;
    }

    @Nullable
    public final GiftsPreviewItemModel getGiftSecond() {
        return this.giftSecond;
    }

    public final boolean isStandard() {
        return this.isStandard;
    }

    public final boolean isSecondGiftVisible() {
        return this.isSecondGiftVisible;
    }

    public final boolean isButtonGetVisible() {
        return this.isButtonGetVisible;
    }

    public final void setButtonGetVisible(boolean z) {
        this.isButtonGetVisible = z;
    }

    public final int getValueOfOpenedGifts() {
        return this.valueOfOpenedGifts;
    }

    public final boolean isHideBlockWithBC() {
        return this.isHideBlockWithBC;
    }

    public final boolean isNeedClose() {
        return this.isNeedClose;
    }

    public final boolean isBlockingLoading() {
        return this.isBlockingLoading;
    }

    public final boolean isClickedOpenCase() {
        return this.isClickedOpenCase;
    }

    public final boolean isShowingButtonGet() {
        boolean z = this.isSecondGiftVisible;
        if (z && this.valueOfOpenedGifts == 1) {
            return true;
        }
        return !z && this.valueOfOpenedGifts == 0;
    }

    @DrawableRes
    public final int getDefaultGiftImageRes() {
        int i = this.eventId;
        return i != 0 ? i != 1 ? R.drawable.ic_standard_gift : this.isStandard ? R.drawable.ic_giftbox_green : R.drawable.ic_giftbox_yellow : this.isStandard ? R.drawable.ic_standard_gift : R.drawable.ic_legendary_gift;
    }

    @DrawableRes
    public final int getIdStandardPrize() {
        int i = this.eventId;
        return (i == 0 || i != 1) ? R.drawable.ic_standard_gift : R.drawable.ic_giftbox_green;
    }

    @DrawableRes
    public final int getIdLegendaryPrize() {
        int i = this.eventId;
        return (i == 0 || i != 1) ? R.drawable.ic_legendary_gift : R.drawable.ic_giftbox_yellow;
    }
}

