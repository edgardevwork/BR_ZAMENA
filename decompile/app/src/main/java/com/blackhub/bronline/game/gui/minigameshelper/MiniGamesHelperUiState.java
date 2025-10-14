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
@Metadata(m7104d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0002\u0010\u0015J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0010HÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\u0013HÆ\u0003J\t\u0010+\u001a\u00020\u0013HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\nHÆ\u0003J\t\u00100\u001a\u00020\nHÆ\u0003J\t\u00101\u001a\u00020\nHÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\nHÆ\u0003J\u008d\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013HÆ\u0001J\u0013\u00105\u001a\u00020\u00132\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u00020\nHÖ\u0001J\t\u00109\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0014\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u001cR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u001cR\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006:"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/minigameshelper/MiniGamesHelperUiState;", "Lcom/blackhub/bronline/game/common/UiState;", "helperType", "Lcom/blackhub/bronline/game/gui/minigameshelper/MiniGamesHelperEnum;", "prizeHeader", "", "prizeImage", "Landroid/graphics/Bitmap;", "congratulatoryText", "currentProgressBarStatus", "", "maxValue", "maxProgressBarValue", "progressBarTitle", "tick", "timer", "", "randomNum", "isNeedToShowClose", "", "isNeedClose", "(Lcom/blackhub/bronline/game/gui/minigameshelper/MiniGamesHelperEnum;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;IIILjava/lang/String;IJIZZ)V", "getCongratulatoryText", "()Ljava/lang/String;", "getCurrentProgressBarStatus", "()I", "getHelperType", "()Lcom/blackhub/bronline/game/gui/minigameshelper/MiniGamesHelperEnum;", "()Z", "getMaxProgressBarValue", "getMaxValue", "getPrizeHeader", "getPrizeImage", "()Landroid/graphics/Bitmap;", "getProgressBarTitle", "getRandomNum", "getTick", "getTimer", "()J", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
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
