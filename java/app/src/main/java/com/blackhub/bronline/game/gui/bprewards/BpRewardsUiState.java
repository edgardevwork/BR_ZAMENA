package com.blackhub.bronline.game.gui.bprewards;

import android.graphics.Bitmap;
import androidx.annotation.DrawableRes;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.gui.bprewards.model.BpRewardsFilterStateEnum;
import com.blackhub.bronline.game.gui.bprewards.model.BpRewardsLists;
import com.blackhub.bronline.game.gui.bprewards.model.BpRewardsText;
import com.blackhub.bronline.game.p019ui.bprewards.BpRewardsFilterButtonImageItem;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BpRewardsUiState.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final /* data */ class BpRewardsUiState implements UiState {
    public static final int $stable = 8;

    @NotNull
    public final BpRewardsText annotatedText;

    @NotNull
    public final List<String> bottomHintList;

    @NotNull
    public final BpRewardsLists bpRewardsLists;
    public final int filterState;
    public final int idForDialog;

    @NotNull
    public final List<BpRewardsFilterButtonImageItem> imagesForFilterList;
    public final boolean isBpRewardsScreen;
    public final boolean isButtonFilterBlocked;
    public final boolean isHasTanpin;
    public final boolean isNeedClose;
    public final boolean isNeedToShowDialog;
    public final boolean isScreenBlocked;
    public final boolean isSprayForDialog;
    public final boolean isTutorialEnabled;

    @Nullable
    public final Bitmap refreshButtonBitmap;

    @Nullable
    public final String rewardNameForDialog;
    public final int sizeOfImage;

    @Nullable
    public final Integer sprayPriceForDialog;

    @Nullable
    public final AnnotatedString sprayTextForDialog;

    @NotNull
    public final List<String> topHintList;

    public BpRewardsUiState() {
        this(false, null, null, null, null, null, null, 0, false, false, null, 0, null, null, 0, false, false, false, false, false, 1048575, null);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsBpRewardsScreen() {
        return this.isBpRewardsScreen;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsSprayForDialog() {
        return this.isSprayForDialog;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final String getRewardNameForDialog() {
        return this.rewardNameForDialog;
    }

    /* renamed from: component12, reason: from getter */
    public final int getIdForDialog() {
        return this.idForDialog;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Integer getSprayPriceForDialog() {
        return this.sprayPriceForDialog;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final AnnotatedString getSprayTextForDialog() {
        return this.sprayTextForDialog;
    }

    /* renamed from: component15, reason: from getter */
    public final int getFilterState() {
        return this.filterState;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getIsHasTanpin() {
        return this.isHasTanpin;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getIsTutorialEnabled() {
        return this.isTutorialEnabled;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getIsButtonFilterBlocked() {
        return this.isButtonFilterBlocked;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getIsScreenBlocked() {
        return this.isScreenBlocked;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BpRewardsText getAnnotatedText() {
        return this.annotatedText;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getIsNeedClose() {
        return this.isNeedClose;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final BpRewardsLists getBpRewardsLists() {
        return this.bpRewardsLists;
    }

    @NotNull
    public final List<BpRewardsFilterButtonImageItem> component4() {
        return this.imagesForFilterList;
    }

    @NotNull
    public final List<String> component5() {
        return this.topHintList;
    }

    @NotNull
    public final List<String> component6() {
        return this.bottomHintList;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Bitmap getRefreshButtonBitmap() {
        return this.refreshButtonBitmap;
    }

    /* renamed from: component8, reason: from getter */
    public final int getSizeOfImage() {
        return this.sizeOfImage;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsNeedToShowDialog() {
        return this.isNeedToShowDialog;
    }

    @NotNull
    public final BpRewardsUiState copy(boolean isBpRewardsScreen, @NotNull BpRewardsText annotatedText, @NotNull BpRewardsLists bpRewardsLists, @NotNull List<BpRewardsFilterButtonImageItem> imagesForFilterList, @NotNull List<String> topHintList, @NotNull List<String> bottomHintList, @Nullable Bitmap refreshButtonBitmap, int sizeOfImage, boolean isNeedToShowDialog, boolean isSprayForDialog, @Nullable String rewardNameForDialog, int idForDialog, @Nullable Integer sprayPriceForDialog, @Nullable AnnotatedString sprayTextForDialog, int filterState, boolean isHasTanpin, boolean isTutorialEnabled, boolean isButtonFilterBlocked, boolean isScreenBlocked, boolean isNeedClose) {
        Intrinsics.checkNotNullParameter(annotatedText, "annotatedText");
        Intrinsics.checkNotNullParameter(bpRewardsLists, "bpRewardsLists");
        Intrinsics.checkNotNullParameter(imagesForFilterList, "imagesForFilterList");
        Intrinsics.checkNotNullParameter(topHintList, "topHintList");
        Intrinsics.checkNotNullParameter(bottomHintList, "bottomHintList");
        return new BpRewardsUiState(isBpRewardsScreen, annotatedText, bpRewardsLists, imagesForFilterList, topHintList, bottomHintList, refreshButtonBitmap, sizeOfImage, isNeedToShowDialog, isSprayForDialog, rewardNameForDialog, idForDialog, sprayPriceForDialog, sprayTextForDialog, filterState, isHasTanpin, isTutorialEnabled, isButtonFilterBlocked, isScreenBlocked, isNeedClose);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BpRewardsUiState)) {
            return false;
        }
        BpRewardsUiState bpRewardsUiState = (BpRewardsUiState) other;
        return this.isBpRewardsScreen == bpRewardsUiState.isBpRewardsScreen && Intrinsics.areEqual(this.annotatedText, bpRewardsUiState.annotatedText) && Intrinsics.areEqual(this.bpRewardsLists, bpRewardsUiState.bpRewardsLists) && Intrinsics.areEqual(this.imagesForFilterList, bpRewardsUiState.imagesForFilterList) && Intrinsics.areEqual(this.topHintList, bpRewardsUiState.topHintList) && Intrinsics.areEqual(this.bottomHintList, bpRewardsUiState.bottomHintList) && Intrinsics.areEqual(this.refreshButtonBitmap, bpRewardsUiState.refreshButtonBitmap) && this.sizeOfImage == bpRewardsUiState.sizeOfImage && this.isNeedToShowDialog == bpRewardsUiState.isNeedToShowDialog && this.isSprayForDialog == bpRewardsUiState.isSprayForDialog && Intrinsics.areEqual(this.rewardNameForDialog, bpRewardsUiState.rewardNameForDialog) && this.idForDialog == bpRewardsUiState.idForDialog && Intrinsics.areEqual(this.sprayPriceForDialog, bpRewardsUiState.sprayPriceForDialog) && Intrinsics.areEqual(this.sprayTextForDialog, bpRewardsUiState.sprayTextForDialog) && this.filterState == bpRewardsUiState.filterState && this.isHasTanpin == bpRewardsUiState.isHasTanpin && this.isTutorialEnabled == bpRewardsUiState.isTutorialEnabled && this.isButtonFilterBlocked == bpRewardsUiState.isButtonFilterBlocked && this.isScreenBlocked == bpRewardsUiState.isScreenBlocked && this.isNeedClose == bpRewardsUiState.isNeedClose;
    }

    public int hashCode() {
        int iHashCode = ((((((((((Boolean.hashCode(this.isBpRewardsScreen) * 31) + this.annotatedText.hashCode()) * 31) + this.bpRewardsLists.hashCode()) * 31) + this.imagesForFilterList.hashCode()) * 31) + this.topHintList.hashCode()) * 31) + this.bottomHintList.hashCode()) * 31;
        Bitmap bitmap = this.refreshButtonBitmap;
        int iHashCode2 = (((((((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + Integer.hashCode(this.sizeOfImage)) * 31) + Boolean.hashCode(this.isNeedToShowDialog)) * 31) + Boolean.hashCode(this.isSprayForDialog)) * 31;
        String str = this.rewardNameForDialog;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.idForDialog)) * 31;
        Integer num = this.sprayPriceForDialog;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        AnnotatedString annotatedString = this.sprayTextForDialog;
        return ((((((((((((iHashCode4 + (annotatedString != null ? annotatedString.hashCode() : 0)) * 31) + Integer.hashCode(this.filterState)) * 31) + Boolean.hashCode(this.isHasTanpin)) * 31) + Boolean.hashCode(this.isTutorialEnabled)) * 31) + Boolean.hashCode(this.isButtonFilterBlocked)) * 31) + Boolean.hashCode(this.isScreenBlocked)) * 31) + Boolean.hashCode(this.isNeedClose);
    }

    @NotNull
    public String toString() {
        boolean z = this.isBpRewardsScreen;
        BpRewardsText bpRewardsText = this.annotatedText;
        BpRewardsLists bpRewardsLists = this.bpRewardsLists;
        List<BpRewardsFilterButtonImageItem> list = this.imagesForFilterList;
        List<String> list2 = this.topHintList;
        List<String> list3 = this.bottomHintList;
        Bitmap bitmap = this.refreshButtonBitmap;
        int i = this.sizeOfImage;
        boolean z2 = this.isNeedToShowDialog;
        boolean z3 = this.isSprayForDialog;
        String str = this.rewardNameForDialog;
        int i2 = this.idForDialog;
        Integer num = this.sprayPriceForDialog;
        AnnotatedString annotatedString = this.sprayTextForDialog;
        return "BpRewardsUiState(isBpRewardsScreen=" + z + ", annotatedText=" + bpRewardsText + ", bpRewardsLists=" + bpRewardsLists + ", imagesForFilterList=" + list + ", topHintList=" + list2 + ", bottomHintList=" + list3 + ", refreshButtonBitmap=" + bitmap + ", sizeOfImage=" + i + ", isNeedToShowDialog=" + z2 + ", isSprayForDialog=" + z3 + ", rewardNameForDialog=" + str + ", idForDialog=" + i2 + ", sprayPriceForDialog=" + num + ", sprayTextForDialog=" + ((Object) annotatedString) + ", filterState=" + this.filterState + ", isHasTanpin=" + this.isHasTanpin + ", isTutorialEnabled=" + this.isTutorialEnabled + ", isButtonFilterBlocked=" + this.isButtonFilterBlocked + ", isScreenBlocked=" + this.isScreenBlocked + ", isNeedClose=" + this.isNeedClose + ")";
    }

    public BpRewardsUiState(boolean z, @NotNull BpRewardsText annotatedText, @NotNull BpRewardsLists bpRewardsLists, @NotNull List<BpRewardsFilterButtonImageItem> imagesForFilterList, @NotNull List<String> topHintList, @NotNull List<String> bottomHintList, @Nullable Bitmap bitmap, int i, boolean z2, boolean z3, @Nullable String str, int i2, @Nullable Integer num, @Nullable AnnotatedString annotatedString, int i3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        Intrinsics.checkNotNullParameter(annotatedText, "annotatedText");
        Intrinsics.checkNotNullParameter(bpRewardsLists, "bpRewardsLists");
        Intrinsics.checkNotNullParameter(imagesForFilterList, "imagesForFilterList");
        Intrinsics.checkNotNullParameter(topHintList, "topHintList");
        Intrinsics.checkNotNullParameter(bottomHintList, "bottomHintList");
        this.isBpRewardsScreen = z;
        this.annotatedText = annotatedText;
        this.bpRewardsLists = bpRewardsLists;
        this.imagesForFilterList = imagesForFilterList;
        this.topHintList = topHintList;
        this.bottomHintList = bottomHintList;
        this.refreshButtonBitmap = bitmap;
        this.sizeOfImage = i;
        this.isNeedToShowDialog = z2;
        this.isSprayForDialog = z3;
        this.rewardNameForDialog = str;
        this.idForDialog = i2;
        this.sprayPriceForDialog = num;
        this.sprayTextForDialog = annotatedString;
        this.filterState = i3;
        this.isHasTanpin = z4;
        this.isTutorialEnabled = z5;
        this.isButtonFilterBlocked = z6;
        this.isScreenBlocked = z7;
        this.isNeedClose = z8;
    }

    public final boolean isBpRewardsScreen() {
        return this.isBpRewardsScreen;
    }

    public /* synthetic */ BpRewardsUiState(boolean z, BpRewardsText bpRewardsText, BpRewardsLists bpRewardsLists, List list, List list2, List list3, Bitmap bitmap, int i, boolean z2, boolean z3, String str, int i2, Integer num, AnnotatedString annotatedString, int i3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? true : z, (i4 & 2) != 0 ? new BpRewardsText(null, null, 3, null) : bpRewardsText, (i4 & 4) != 0 ? new BpRewardsLists(null, null, null, null, null, null, null, 127, null) : bpRewardsLists, (i4 & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i4 & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i4 & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3, (i4 & 64) != 0 ? null : bitmap, (i4 & 128) != 0 ? 512 : i, (i4 & 256) != 0 ? false : z2, (i4 & 512) != 0 ? false : z3, (i4 & 1024) != 0 ? null : str, (i4 & 2048) != 0 ? -1 : i2, (i4 & 4096) != 0 ? null : num, (i4 & 8192) != 0 ? null : annotatedString, (i4 & 16384) != 0 ? BpRewardsFilterStateEnum.ALL.getFilterState() : i3, (i4 & 32768) != 0 ? false : z4, (i4 & 65536) != 0 ? false : z5, (i4 & 131072) != 0 ? false : z6, (i4 & 262144) != 0 ? false : z7, (i4 & 524288) != 0 ? false : z8);
    }

    @NotNull
    public final BpRewardsText getAnnotatedText() {
        return this.annotatedText;
    }

    @NotNull
    public final BpRewardsLists getBpRewardsLists() {
        return this.bpRewardsLists;
    }

    @NotNull
    public final List<BpRewardsFilterButtonImageItem> getImagesForFilterList() {
        return this.imagesForFilterList;
    }

    @NotNull
    public final List<String> getTopHintList() {
        return this.topHintList;
    }

    @NotNull
    public final List<String> getBottomHintList() {
        return this.bottomHintList;
    }

    @Nullable
    public final Bitmap getRefreshButtonBitmap() {
        return this.refreshButtonBitmap;
    }

    public final int getSizeOfImage() {
        return this.sizeOfImage;
    }

    public final boolean isNeedToShowDialog() {
        return this.isNeedToShowDialog;
    }

    public final boolean isSprayForDialog() {
        return this.isSprayForDialog;
    }

    @Nullable
    public final String getRewardNameForDialog() {
        return this.rewardNameForDialog;
    }

    public final int getIdForDialog() {
        return this.idForDialog;
    }

    @Nullable
    public final Integer getSprayPriceForDialog() {
        return this.sprayPriceForDialog;
    }

    @Nullable
    public final AnnotatedString getSprayTextForDialog() {
        return this.sprayTextForDialog;
    }

    public final int getFilterState() {
        return this.filterState;
    }

    public final boolean isHasTanpin() {
        return this.isHasTanpin;
    }

    public final boolean isTutorialEnabled() {
        return this.isTutorialEnabled;
    }

    public final boolean isButtonFilterBlocked() {
        return this.isButtonFilterBlocked;
    }

    public final boolean isScreenBlocked() {
        return this.isScreenBlocked;
    }

    public final boolean isNeedClose() {
        return this.isNeedClose;
    }

    @DrawableRes
    public final int getEmptyIconRes() {
        return this.isBpRewardsScreen ? R.drawable.ic_reward : R.drawable.ic_marketplace;
    }
}

