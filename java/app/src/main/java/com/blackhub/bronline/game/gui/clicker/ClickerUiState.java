package com.blackhub.bronline.game.gui.clicker;

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

/* compiled from: ClickerUiState.kt */
@StabilityInferred(parameters = 0)

public final /* data */ class ClickerUiState implements UiState {
    public static final int $stable = 8;

    @Nullable
    public final Bitmap bgImageBitmap;
    public final int currentProgress;
    public final long delayBitOpponentInMilliseconds;

    @Nullable
    public final Bitmap imgClickEffectBitmap;
    public final boolean isNeedToClose;

    @NotNull
    public final String myNick;

    @NotNull
    public final String opponentNick;

    @NotNull
    public final String textDescription;
    public final int totalTimerInSeconds;
    public final int valueOfPercentPerClick;

    public ClickerUiState() {
        this(0, 0L, 0, 0, null, null, null, null, null, false, 1023, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getValueOfPercentPerClick() {
        return this.valueOfPercentPerClick;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsNeedToClose() {
        return this.isNeedToClose;
    }

    /* renamed from: component2, reason: from getter */
    public final long getDelayBitOpponentInMilliseconds() {
        return this.delayBitOpponentInMilliseconds;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCurrentProgress() {
        return this.currentProgress;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTotalTimerInSeconds() {
        return this.totalTimerInSeconds;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getMyNick() {
        return this.myNick;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getOpponentNick() {
        return this.opponentNick;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getTextDescription() {
        return this.textDescription;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Bitmap getBgImageBitmap() {
        return this.bgImageBitmap;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Bitmap getImgClickEffectBitmap() {
        return this.imgClickEffectBitmap;
    }

    @NotNull
    public final ClickerUiState copy(int valueOfPercentPerClick, long delayBitOpponentInMilliseconds, int currentProgress, int totalTimerInSeconds, @NotNull String myNick, @NotNull String opponentNick, @NotNull String textDescription, @Nullable Bitmap bgImageBitmap, @Nullable Bitmap imgClickEffectBitmap, boolean isNeedToClose) {
        Intrinsics.checkNotNullParameter(myNick, "myNick");
        Intrinsics.checkNotNullParameter(opponentNick, "opponentNick");
        Intrinsics.checkNotNullParameter(textDescription, "textDescription");
        return new ClickerUiState(valueOfPercentPerClick, delayBitOpponentInMilliseconds, currentProgress, totalTimerInSeconds, myNick, opponentNick, textDescription, bgImageBitmap, imgClickEffectBitmap, isNeedToClose);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClickerUiState)) {
            return false;
        }
        ClickerUiState clickerUiState = (ClickerUiState) other;
        return this.valueOfPercentPerClick == clickerUiState.valueOfPercentPerClick && this.delayBitOpponentInMilliseconds == clickerUiState.delayBitOpponentInMilliseconds && this.currentProgress == clickerUiState.currentProgress && this.totalTimerInSeconds == clickerUiState.totalTimerInSeconds && Intrinsics.areEqual(this.myNick, clickerUiState.myNick) && Intrinsics.areEqual(this.opponentNick, clickerUiState.opponentNick) && Intrinsics.areEqual(this.textDescription, clickerUiState.textDescription) && Intrinsics.areEqual(this.bgImageBitmap, clickerUiState.bgImageBitmap) && Intrinsics.areEqual(this.imgClickEffectBitmap, clickerUiState.imgClickEffectBitmap) && this.isNeedToClose == clickerUiState.isNeedToClose;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((Integer.hashCode(this.valueOfPercentPerClick) * 31) + Long.hashCode(this.delayBitOpponentInMilliseconds)) * 31) + Integer.hashCode(this.currentProgress)) * 31) + Integer.hashCode(this.totalTimerInSeconds)) * 31) + this.myNick.hashCode()) * 31) + this.opponentNick.hashCode()) * 31) + this.textDescription.hashCode()) * 31;
        Bitmap bitmap = this.bgImageBitmap;
        int iHashCode2 = (iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        Bitmap bitmap2 = this.imgClickEffectBitmap;
        return ((iHashCode2 + (bitmap2 != null ? bitmap2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isNeedToClose);
    }

    @NotNull
    public String toString() {
        return "ClickerUiState(valueOfPercentPerClick=" + this.valueOfPercentPerClick + ", delayBitOpponentInMilliseconds=" + this.delayBitOpponentInMilliseconds + ", currentProgress=" + this.currentProgress + ", totalTimerInSeconds=" + this.totalTimerInSeconds + ", myNick=" + this.myNick + ", opponentNick=" + this.opponentNick + ", textDescription=" + this.textDescription + ", bgImageBitmap=" + this.bgImageBitmap + ", imgClickEffectBitmap=" + this.imgClickEffectBitmap + ", isNeedToClose=" + this.isNeedToClose + ")";
    }

    public ClickerUiState(int i, long j, int i2, int i3, @NotNull String myNick, @NotNull String opponentNick, @NotNull String textDescription, @Nullable Bitmap bitmap, @Nullable Bitmap bitmap2, boolean z) {
        Intrinsics.checkNotNullParameter(myNick, "myNick");
        Intrinsics.checkNotNullParameter(opponentNick, "opponentNick");
        Intrinsics.checkNotNullParameter(textDescription, "textDescription");
        this.valueOfPercentPerClick = i;
        this.delayBitOpponentInMilliseconds = j;
        this.currentProgress = i2;
        this.totalTimerInSeconds = i3;
        this.myNick = myNick;
        this.opponentNick = opponentNick;
        this.textDescription = textDescription;
        this.bgImageBitmap = bitmap;
        this.imgClickEffectBitmap = bitmap2;
        this.isNeedToClose = z;
    }

    public final int getValueOfPercentPerClick() {
        return this.valueOfPercentPerClick;
    }

    public final long getDelayBitOpponentInMilliseconds() {
        return this.delayBitOpponentInMilliseconds;
    }

    public final int getCurrentProgress() {
        return this.currentProgress;
    }

    public final int getTotalTimerInSeconds() {
        return this.totalTimerInSeconds;
    }

    public /* synthetic */ ClickerUiState(int i, long j, int i2, int i3, String str, String str2, String str3, Bitmap bitmap, Bitmap bitmap2, boolean z, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0L : j, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 0 : i3, (i4 & 16) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i4 & 32) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i4 & 64) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str3, (i4 & 128) != 0 ? null : bitmap, (i4 & 256) == 0 ? bitmap2 : null, (i4 & 512) == 0 ? z : false);
    }

    @NotNull
    public final String getMyNick() {
        return this.myNick;
    }

    @NotNull
    public final String getOpponentNick() {
        return this.opponentNick;
    }

    @NotNull
    public final String getTextDescription() {
        return this.textDescription;
    }

    @Nullable
    public final Bitmap getBgImageBitmap() {
        return this.bgImageBitmap;
    }

    @Nullable
    public final Bitmap getImgClickEffectBitmap() {
        return this.imgClickEffectBitmap;
    }

    public final boolean isNeedToClose() {
        return this.isNeedToClose;
    }
}

