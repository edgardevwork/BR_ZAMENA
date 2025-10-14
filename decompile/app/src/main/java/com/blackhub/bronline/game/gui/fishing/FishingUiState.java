package com.blackhub.bronline.game.gui.fishing;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.gui.fishing.data.FishingBaitObj;
import com.blackhub.bronline.game.gui.fishing.data.enums.AudioType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FishingUiState.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b1\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0014¢\u0006\u0002\u0010\u001bJ\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\rHÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0012HÆ\u0003J\t\u00104\u001a\u00020\u0014HÆ\u0003J\t\u00105\u001a\u00020\u0014HÆ\u0003J\t\u00106\u001a\u00020\u0014HÆ\u0003J\t\u00107\u001a\u00020\u0014HÆ\u0003J\t\u00108\u001a\u00020\u0014HÆ\u0003J\t\u00109\u001a\u00020\u0014HÆ\u0003J\t\u0010:\u001a\u00020\u0014HÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\t\u0010<\u001a\u00020\u0007HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\rHÆ\u0003JË\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00142\b\b\u0002\u0010\u0019\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u0014HÆ\u0001J\u0013\u0010D\u001a\u00020\u00142\b\u0010E\u001a\u0004\u0018\u00010FHÖ\u0003J\t\u0010G\u001a\u00020\u0003HÖ\u0001J\t\u0010H\u001a\u00020IHÖ\u0001R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0016\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010(R\u0011\u0010\u0017\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010(R\u0011\u0010\u0018\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010(R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010(R\u0011\u0010\u0015\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010(R\u0011\u0010\u0019\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010(R\u0011\u0010\u001a\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010(R\u0011\u0010)\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b*\u0010\u001fR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\"R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001d¨\u0006J"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/fishing/FishingUiState;", "Lcom/blackhub/bronline/game/common/UiState;", "screen", "", "fishFallStep", "", "fishingTimer", "", "progressTimer", "progressStep", "progressRotate", "currentProgress", "baitObj", "Lcom/blackhub/bronline/game/gui/fishing/data/FishingBaitObj;", "tackleObj", "fishingObj", "currentOffsetState", "fishingAudioType", "Lcom/blackhub/bronline/game/gui/fishing/data/enums/AudioType;", "isNeedNullableMediaPlayer", "", "isNeedPlaySound", "isHideFloat", "isHideProgress", "isNeedClose", "isShowBaitDescription", "isShowTackleDescription", "(IFJIIFILcom/blackhub/bronline/game/gui/fishing/data/FishingBaitObj;Lcom/blackhub/bronline/game/gui/fishing/data/FishingBaitObj;Lcom/blackhub/bronline/game/gui/fishing/data/FishingBaitObj;ILcom/blackhub/bronline/game/gui/fishing/data/enums/AudioType;ZZZZZZZ)V", "getBaitObj", "()Lcom/blackhub/bronline/game/gui/fishing/data/FishingBaitObj;", "getCurrentOffsetState", "()I", "getCurrentProgress", "getFishFallStep", "()F", "getFishingAudioType", "()Lcom/blackhub/bronline/game/gui/fishing/data/enums/AudioType;", "getFishingObj", "getFishingTimer", "()J", "()Z", "newLinearProgress", "getNewLinearProgress", "getProgressRotate", "getProgressStep", "getProgressTimer", "getScreen", "getTackleObj", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FishingUiState implements UiState {
    public static final int $stable = 8;

    @Nullable
    public final FishingBaitObj baitObj;
    public final int currentOffsetState;
    public final int currentProgress;
    public final float fishFallStep;

    @NotNull
    public final AudioType fishingAudioType;

    @NotNull
    public final FishingBaitObj fishingObj;
    public final long fishingTimer;
    public final boolean isHideFloat;
    public final boolean isHideProgress;
    public final boolean isNeedClose;
    public final boolean isNeedNullableMediaPlayer;
    public final boolean isNeedPlaySound;
    public final boolean isShowBaitDescription;
    public final boolean isShowTackleDescription;
    public final float progressRotate;
    public final int progressStep;
    public final int progressTimer;
    public final int screen;

    @Nullable
    public final FishingBaitObj tackleObj;

    public FishingUiState() {
        this(0, 0.0f, 0L, 0, 0, 0.0f, 0, null, null, null, 0, null, false, false, false, false, false, false, false, 524287, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getScreen() {
        return this.screen;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final FishingBaitObj getFishingObj() {
        return this.fishingObj;
    }

    /* renamed from: component11, reason: from getter */
    public final int getCurrentOffsetState() {
        return this.currentOffsetState;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final AudioType getFishingAudioType() {
        return this.fishingAudioType;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getIsNeedNullableMediaPlayer() {
        return this.isNeedNullableMediaPlayer;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsNeedPlaySound() {
        return this.isNeedPlaySound;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getIsHideFloat() {
        return this.isHideFloat;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getIsHideProgress() {
        return this.isHideProgress;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getIsNeedClose() {
        return this.isNeedClose;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getIsShowBaitDescription() {
        return this.isShowBaitDescription;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getIsShowTackleDescription() {
        return this.isShowTackleDescription;
    }

    /* renamed from: component2, reason: from getter */
    public final float getFishFallStep() {
        return this.fishFallStep;
    }

    /* renamed from: component3, reason: from getter */
    public final long getFishingTimer() {
        return this.fishingTimer;
    }

    /* renamed from: component4, reason: from getter */
    public final int getProgressTimer() {
        return this.progressTimer;
    }

    /* renamed from: component5, reason: from getter */
    public final int getProgressStep() {
        return this.progressStep;
    }

    /* renamed from: component6, reason: from getter */
    public final float getProgressRotate() {
        return this.progressRotate;
    }

    /* renamed from: component7, reason: from getter */
    public final int getCurrentProgress() {
        return this.currentProgress;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final FishingBaitObj getBaitObj() {
        return this.baitObj;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final FishingBaitObj getTackleObj() {
        return this.tackleObj;
    }

    @NotNull
    public final FishingUiState copy(int screen, float fishFallStep, long fishingTimer, int progressTimer, int progressStep, float progressRotate, int currentProgress, @Nullable FishingBaitObj baitObj, @Nullable FishingBaitObj tackleObj, @NotNull FishingBaitObj fishingObj, int currentOffsetState, @NotNull AudioType fishingAudioType, boolean isNeedNullableMediaPlayer, boolean isNeedPlaySound, boolean isHideFloat, boolean isHideProgress, boolean isNeedClose, boolean isShowBaitDescription, boolean isShowTackleDescription) {
        Intrinsics.checkNotNullParameter(fishingObj, "fishingObj");
        Intrinsics.checkNotNullParameter(fishingAudioType, "fishingAudioType");
        return new FishingUiState(screen, fishFallStep, fishingTimer, progressTimer, progressStep, progressRotate, currentProgress, baitObj, tackleObj, fishingObj, currentOffsetState, fishingAudioType, isNeedNullableMediaPlayer, isNeedPlaySound, isHideFloat, isHideProgress, isNeedClose, isShowBaitDescription, isShowTackleDescription);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FishingUiState)) {
            return false;
        }
        FishingUiState fishingUiState = (FishingUiState) other;
        return this.screen == fishingUiState.screen && Float.compare(this.fishFallStep, fishingUiState.fishFallStep) == 0 && this.fishingTimer == fishingUiState.fishingTimer && this.progressTimer == fishingUiState.progressTimer && this.progressStep == fishingUiState.progressStep && Float.compare(this.progressRotate, fishingUiState.progressRotate) == 0 && this.currentProgress == fishingUiState.currentProgress && Intrinsics.areEqual(this.baitObj, fishingUiState.baitObj) && Intrinsics.areEqual(this.tackleObj, fishingUiState.tackleObj) && Intrinsics.areEqual(this.fishingObj, fishingUiState.fishingObj) && this.currentOffsetState == fishingUiState.currentOffsetState && this.fishingAudioType == fishingUiState.fishingAudioType && this.isNeedNullableMediaPlayer == fishingUiState.isNeedNullableMediaPlayer && this.isNeedPlaySound == fishingUiState.isNeedPlaySound && this.isHideFloat == fishingUiState.isHideFloat && this.isHideProgress == fishingUiState.isHideProgress && this.isNeedClose == fishingUiState.isNeedClose && this.isShowBaitDescription == fishingUiState.isShowBaitDescription && this.isShowTackleDescription == fishingUiState.isShowTackleDescription;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((Integer.hashCode(this.screen) * 31) + Float.hashCode(this.fishFallStep)) * 31) + Long.hashCode(this.fishingTimer)) * 31) + Integer.hashCode(this.progressTimer)) * 31) + Integer.hashCode(this.progressStep)) * 31) + Float.hashCode(this.progressRotate)) * 31) + Integer.hashCode(this.currentProgress)) * 31;
        FishingBaitObj fishingBaitObj = this.baitObj;
        int iHashCode2 = (iHashCode + (fishingBaitObj == null ? 0 : fishingBaitObj.hashCode())) * 31;
        FishingBaitObj fishingBaitObj2 = this.tackleObj;
        return ((((((((((((((((((((iHashCode2 + (fishingBaitObj2 != null ? fishingBaitObj2.hashCode() : 0)) * 31) + this.fishingObj.hashCode()) * 31) + Integer.hashCode(this.currentOffsetState)) * 31) + this.fishingAudioType.hashCode()) * 31) + Boolean.hashCode(this.isNeedNullableMediaPlayer)) * 31) + Boolean.hashCode(this.isNeedPlaySound)) * 31) + Boolean.hashCode(this.isHideFloat)) * 31) + Boolean.hashCode(this.isHideProgress)) * 31) + Boolean.hashCode(this.isNeedClose)) * 31) + Boolean.hashCode(this.isShowBaitDescription)) * 31) + Boolean.hashCode(this.isShowTackleDescription);
    }

    @NotNull
    public String toString() {
        return "FishingUiState(screen=" + this.screen + ", fishFallStep=" + this.fishFallStep + ", fishingTimer=" + this.fishingTimer + ", progressTimer=" + this.progressTimer + ", progressStep=" + this.progressStep + ", progressRotate=" + this.progressRotate + ", currentProgress=" + this.currentProgress + ", baitObj=" + this.baitObj + ", tackleObj=" + this.tackleObj + ", fishingObj=" + this.fishingObj + ", currentOffsetState=" + this.currentOffsetState + ", fishingAudioType=" + this.fishingAudioType + ", isNeedNullableMediaPlayer=" + this.isNeedNullableMediaPlayer + ", isNeedPlaySound=" + this.isNeedPlaySound + ", isHideFloat=" + this.isHideFloat + ", isHideProgress=" + this.isHideProgress + ", isNeedClose=" + this.isNeedClose + ", isShowBaitDescription=" + this.isShowBaitDescription + ", isShowTackleDescription=" + this.isShowTackleDescription + ")";
    }

    public FishingUiState(int i, float f, long j, int i2, int i3, float f2, int i4, @Nullable FishingBaitObj fishingBaitObj, @Nullable FishingBaitObj fishingBaitObj2, @NotNull FishingBaitObj fishingObj, int i5, @NotNull AudioType fishingAudioType, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        Intrinsics.checkNotNullParameter(fishingObj, "fishingObj");
        Intrinsics.checkNotNullParameter(fishingAudioType, "fishingAudioType");
        this.screen = i;
        this.fishFallStep = f;
        this.fishingTimer = j;
        this.progressTimer = i2;
        this.progressStep = i3;
        this.progressRotate = f2;
        this.currentProgress = i4;
        this.baitObj = fishingBaitObj;
        this.tackleObj = fishingBaitObj2;
        this.fishingObj = fishingObj;
        this.currentOffsetState = i5;
        this.fishingAudioType = fishingAudioType;
        this.isNeedNullableMediaPlayer = z;
        this.isNeedPlaySound = z2;
        this.isHideFloat = z3;
        this.isHideProgress = z4;
        this.isNeedClose = z5;
        this.isShowBaitDescription = z6;
        this.isShowTackleDescription = z7;
    }

    public final int getScreen() {
        return this.screen;
    }

    public final float getFishFallStep() {
        return this.fishFallStep;
    }

    public final long getFishingTimer() {
        return this.fishingTimer;
    }

    public final int getProgressTimer() {
        return this.progressTimer;
    }

    public final int getProgressStep() {
        return this.progressStep;
    }

    public final float getProgressRotate() {
        return this.progressRotate;
    }

    public final int getCurrentProgress() {
        return this.currentProgress;
    }

    @Nullable
    public final FishingBaitObj getBaitObj() {
        return this.baitObj;
    }

    @Nullable
    public final FishingBaitObj getTackleObj() {
        return this.tackleObj;
    }

    public /* synthetic */ FishingUiState(int i, float f, long j, int i2, int i3, float f2, int i4, FishingBaitObj fishingBaitObj, FishingBaitObj fishingBaitObj2, FishingBaitObj fishingBaitObj3, int i5, AudioType audioType, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0.0f : f, (i6 & 4) != 0 ? 0L : j, (i6 & 8) != 0 ? 0 : i2, (i6 & 16) != 0 ? 0 : i3, (i6 & 32) != 0 ? 90.0f : f2, (i6 & 64) != 0 ? 0 : i4, (i6 & 128) != 0 ? null : fishingBaitObj, (i6 & 256) == 0 ? fishingBaitObj2 : null, (i6 & 512) != 0 ? new FishingBaitObj(null, 0, null, null, null, 0.0f, null, 0, 0, null, 1023, null) : fishingBaitObj3, (i6 & 1024) != 0 ? 0 : i5, (i6 & 2048) != 0 ? AudioType.NONE : audioType, (i6 & 4096) != 0 ? false : z, (i6 & 8192) != 0 ? false : z2, (i6 & 16384) != 0 ? false : z3, (i6 & 32768) != 0 ? true : z4, (i6 & 65536) != 0 ? false : z5, (i6 & 131072) != 0 ? false : z6, (i6 & 262144) != 0 ? false : z7);
    }

    @NotNull
    public final FishingBaitObj getFishingObj() {
        return this.fishingObj;
    }

    public final int getCurrentOffsetState() {
        return this.currentOffsetState;
    }

    @NotNull
    public final AudioType getFishingAudioType() {
        return this.fishingAudioType;
    }

    public final boolean isNeedNullableMediaPlayer() {
        return this.isNeedNullableMediaPlayer;
    }

    public final boolean isNeedPlaySound() {
        return this.isNeedPlaySound;
    }

    public final boolean isHideFloat() {
        return this.isHideFloat;
    }

    public final boolean isHideProgress() {
        return this.isHideProgress;
    }

    public final boolean isNeedClose() {
        return this.isNeedClose;
    }

    public final boolean isShowBaitDescription() {
        return this.isShowBaitDescription;
    }

    public final boolean isShowTackleDescription() {
        return this.isShowTackleDescription;
    }

    public final int getNewLinearProgress() {
        return this.currentProgress + this.progressStep;
    }
}
