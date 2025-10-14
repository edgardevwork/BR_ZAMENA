package com.blackhub.bronline.game.gui.minigameshelper;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MiniGamesHelperUiState.kt */
@StabilityInferred(parameters = 0)

public final /* data */ class MiniGamesHelperUiState implements UiState {
    public static final int $stable = 8;

    @NotNull
    public final String congratulatoryText;
    public final int currentProgressBarStatus;

    @NotNull
    public final MiniGamesHelperEnum helperType;
    public final boolean isNeedClose;
    public final boolean isNeedToShowClose;
    public final int maxProgressBarValue;
    public final int maxValue;

    @NotNull
    public final String prizeHeader;

    @Nullable
    public final Bitmap prizeImage;

    @NotNull
    public final String progressBarTitle;
    public final int randomNum;
    public final int tick;
    public final long timer;

    public MiniGamesHelperUiState() {
        this(null, null, null, null, 0, 0, 0, null, 0, 0L, 0, false, false, 8191, null);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final MiniGamesHelperEnum getHelperType() {
        return this.helperType;
    }

    /* renamed from: component10, reason: from getter */
    public final long getTimer() {
        return this.timer;
    }

    /* renamed from: component11, reason: from getter */
    public final int getRandomNum() {
        return this.randomNum;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsNeedToShowClose() {
        return this.isNeedToShowClose;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getIsNeedClose() {
        return this.isNeedClose;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPrizeHeader() {
        return this.prizeHeader;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Bitmap getPrizeImage() {
        return this.prizeImage;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getCongratulatoryText() {
        return this.congratulatoryText;
    }

    /* renamed from: component5, reason: from getter */
    public final int getCurrentProgressBarStatus() {
        return this.currentProgressBarStatus;
    }

    /* renamed from: component6, reason: from getter */
    public final int getMaxValue() {
        return this.maxValue;
    }

    /* renamed from: component7, reason: from getter */
    public final int getMaxProgressBarValue() {
        return this.maxProgressBarValue;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getProgressBarTitle() {
        return this.progressBarTitle;
    }

    /* renamed from: component9, reason: from getter */
    public final int getTick() {
        return this.tick;
    }

    @NotNull
    public final MiniGamesHelperUiState copy(@NotNull MiniGamesHelperEnum helperType, @NotNull String prizeHeader, @Nullable Bitmap prizeImage, @NotNull String congratulatoryText, int currentProgressBarStatus, int maxValue, int maxProgressBarValue, @NotNull String progressBarTitle, int tick, long timer, int randomNum, boolean isNeedToShowClose, boolean isNeedClose) {
        Intrinsics.checkNotNullParameter(helperType, "helperType");
        Intrinsics.checkNotNullParameter(prizeHeader, "prizeHeader");
        Intrinsics.checkNotNullParameter(congratulatoryText, "congratulatoryText");
        Intrinsics.checkNotNullParameter(progressBarTitle, "progressBarTitle");
        return new MiniGamesHelperUiState(helperType, prizeHeader, prizeImage, congratulatoryText, currentProgressBarStatus, maxValue, maxProgressBarValue, progressBarTitle, tick, timer, randomNum, isNeedToShowClose, isNeedClose);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MiniGamesHelperUiState)) {
            return false;
        }
        MiniGamesHelperUiState miniGamesHelperUiState = (MiniGamesHelperUiState) other;
        return this.helperType == miniGamesHelperUiState.helperType && Intrinsics.areEqual(this.prizeHeader, miniGamesHelperUiState.prizeHeader) && Intrinsics.areEqual(this.prizeImage, miniGamesHelperUiState.prizeImage) && Intrinsics.areEqual(this.congratulatoryText, miniGamesHelperUiState.congratulatoryText) && this.currentProgressBarStatus == miniGamesHelperUiState.currentProgressBarStatus && this.maxValue == miniGamesHelperUiState.maxValue && this.maxProgressBarValue == miniGamesHelperUiState.maxProgressBarValue && Intrinsics.areEqual(this.progressBarTitle, miniGamesHelperUiState.progressBarTitle) && this.tick == miniGamesHelperUiState.tick && this.timer == miniGamesHelperUiState.timer && this.randomNum == miniGamesHelperUiState.randomNum && this.isNeedToShowClose == miniGamesHelperUiState.isNeedToShowClose && this.isNeedClose == miniGamesHelperUiState.isNeedClose;
    }

    public int hashCode() {
        int iHashCode = ((this.helperType.hashCode() * 31) + this.prizeHeader.hashCode()) * 31;
        Bitmap bitmap = this.prizeImage;
        return ((((((((((((((((((((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + this.congratulatoryText.hashCode()) * 31) + Integer.hashCode(this.currentProgressBarStatus)) * 31) + Integer.hashCode(this.maxValue)) * 31) + Integer.hashCode(this.maxProgressBarValue)) * 31) + this.progressBarTitle.hashCode()) * 31) + Integer.hashCode(this.tick)) * 31) + Long.hashCode(this.timer)) * 31) + Integer.hashCode(this.randomNum)) * 31) + Boolean.hashCode(this.isNeedToShowClose)) * 31) + Boolean.hashCode(this.isNeedClose);
    }

    @NotNull
    public String toString() {
        return "MiniGamesHelperUiState(helperType=" + this.helperType + ", prizeHeader=" + this.prizeHeader + ", prizeImage=" + this.prizeImage + ", congratulatoryText=" + this.congratulatoryText + ", currentProgressBarStatus=" + this.currentProgressBarStatus + ", maxValue=" + this.maxValue + ", maxProgressBarValue=" + this.maxProgressBarValue + ", progressBarTitle=" + this.progressBarTitle + ", tick=" + this.tick + ", timer=" + this.timer + ", randomNum=" + this.randomNum + ", isNeedToShowClose=" + this.isNeedToShowClose + ", isNeedClose=" + this.isNeedClose + ")";
    }

    public MiniGamesHelperUiState(@NotNull MiniGamesHelperEnum helperType, @NotNull String prizeHeader, @Nullable Bitmap bitmap, @NotNull String congratulatoryText, int i, int i2, int i3, @NotNull String progressBarTitle, int i4, long j, int i5, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(helperType, "helperType");
        Intrinsics.checkNotNullParameter(prizeHeader, "prizeHeader");
        Intrinsics.checkNotNullParameter(congratulatoryText, "congratulatoryText");
        Intrinsics.checkNotNullParameter(progressBarTitle, "progressBarTitle");
        this.helperType = helperType;
        this.prizeHeader = prizeHeader;
        this.prizeImage = bitmap;
        this.congratulatoryText = congratulatoryText;
        this.currentProgressBarStatus = i;
        this.maxValue = i2;
        this.maxProgressBarValue = i3;
        this.progressBarTitle = progressBarTitle;
        this.tick = i4;
        this.timer = j;
        this.randomNum = i5;
        this.isNeedToShowClose = z;
        this.isNeedClose = z2;
    }

    public /* synthetic */ MiniGamesHelperUiState(MiniGamesHelperEnum miniGamesHelperEnum, String str, Bitmap bitmap, String str2, int i, int i2, int i3, String str3, int i4, long j, int i5, boolean z, boolean z2, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? MiniGamesHelperEnum.NONE : miniGamesHelperEnum, (i6 & 2) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i6 & 4) != 0 ? null : bitmap, (i6 & 8) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i6 & 16) != 0 ? 0 : i, (i6 & 32) != 0 ? 100 : i2, (i6 & 64) == 0 ? i3 : 100, (i6 & 128) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str3, (i6 & 256) != 0 ? 10 : i4, (i6 & 512) != 0 ? 50L : j, (i6 & 1024) != 0 ? 2 : i5, (i6 & 2048) != 0 ? true : z, (i6 & 4096) == 0 ? z2 : false);
    }

    @NotNull
    public final MiniGamesHelperEnum getHelperType() {
        return this.helperType;
    }

    @NotNull
    public final String getPrizeHeader() {
        return this.prizeHeader;
    }

    @Nullable
    public final Bitmap getPrizeImage() {
        return this.prizeImage;
    }

    @NotNull
    public final String getCongratulatoryText() {
        return this.congratulatoryText;
    }

    public final int getCurrentProgressBarStatus() {
        return this.currentProgressBarStatus;
    }

    public final int getMaxValue() {
        return this.maxValue;
    }

    public final int getMaxProgressBarValue() {
        return this.maxProgressBarValue;
    }

    @NotNull
    public final String getProgressBarTitle() {
        return this.progressBarTitle;
    }

    public final int getTick() {
        return this.tick;
    }

    public final long getTimer() {
        return this.timer;
    }

    public final int getRandomNum() {
        return this.randomNum;
    }

    public final boolean isNeedToShowClose() {
        return this.isNeedToShowClose;
    }

    public final boolean isNeedClose() {
        return this.isNeedClose;
    }
}

