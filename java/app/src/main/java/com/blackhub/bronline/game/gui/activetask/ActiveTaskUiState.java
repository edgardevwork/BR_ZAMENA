package com.blackhub.bronline.game.gui.activetask;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ActiveTaskUiState.kt */
@StabilityInferred(parameters = 1)

public final /* data */ class ActiveTaskUiState implements UiState {
    public static final int $stable = 0;

    @NotNull
    public final String btnText;

    @NotNull
    public final String hintDesc;
    public final int hintNumber;

    @NotNull
    public final ActiveTaskEnum hintScreen;
    public final int hintTime;

    @NotNull
    public final String hintTitle;
    public final boolean isBlockingLoading;
    public final boolean isInterfaceVisible;
    public final boolean isNeedClose;

    public ActiveTaskUiState() {
        this(0, null, null, null, null, 0, false, false, false, 511, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getHintNumber() {
        return this.hintNumber;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ActiveTaskEnum getHintScreen() {
        return this.hintScreen;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getHintTitle() {
        return this.hintTitle;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getHintDesc() {
        return this.hintDesc;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getBtnText() {
        return this.btnText;
    }

    /* renamed from: component6, reason: from getter */
    public final int getHintTime() {
        return this.hintTime;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsInterfaceVisible() {
        return this.isInterfaceVisible;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsNeedClose() {
        return this.isNeedClose;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsBlockingLoading() {
        return this.isBlockingLoading;
    }

    @NotNull
    public final ActiveTaskUiState copy(int hintNumber, @NotNull ActiveTaskEnum hintScreen, @NotNull String hintTitle, @NotNull String hintDesc, @NotNull String btnText, int hintTime, boolean isInterfaceVisible, boolean isNeedClose, boolean isBlockingLoading) {
        Intrinsics.checkNotNullParameter(hintScreen, "hintScreen");
        Intrinsics.checkNotNullParameter(hintTitle, "hintTitle");
        Intrinsics.checkNotNullParameter(hintDesc, "hintDesc");
        Intrinsics.checkNotNullParameter(btnText, "btnText");
        return new ActiveTaskUiState(hintNumber, hintScreen, hintTitle, hintDesc, btnText, hintTime, isInterfaceVisible, isNeedClose, isBlockingLoading);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActiveTaskUiState)) {
            return false;
        }
        ActiveTaskUiState activeTaskUiState = (ActiveTaskUiState) other;
        return this.hintNumber == activeTaskUiState.hintNumber && this.hintScreen == activeTaskUiState.hintScreen && Intrinsics.areEqual(this.hintTitle, activeTaskUiState.hintTitle) && Intrinsics.areEqual(this.hintDesc, activeTaskUiState.hintDesc) && Intrinsics.areEqual(this.btnText, activeTaskUiState.btnText) && this.hintTime == activeTaskUiState.hintTime && this.isInterfaceVisible == activeTaskUiState.isInterfaceVisible && this.isNeedClose == activeTaskUiState.isNeedClose && this.isBlockingLoading == activeTaskUiState.isBlockingLoading;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.hintNumber) * 31) + this.hintScreen.hashCode()) * 31) + this.hintTitle.hashCode()) * 31) + this.hintDesc.hashCode()) * 31) + this.btnText.hashCode()) * 31) + Integer.hashCode(this.hintTime)) * 31) + Boolean.hashCode(this.isInterfaceVisible)) * 31) + Boolean.hashCode(this.isNeedClose)) * 31) + Boolean.hashCode(this.isBlockingLoading);
    }

    @NotNull
    public String toString() {
        return "ActiveTaskUiState(hintNumber=" + this.hintNumber + ", hintScreen=" + this.hintScreen + ", hintTitle=" + this.hintTitle + ", hintDesc=" + this.hintDesc + ", btnText=" + this.btnText + ", hintTime=" + this.hintTime + ", isInterfaceVisible=" + this.isInterfaceVisible + ", isNeedClose=" + this.isNeedClose + ", isBlockingLoading=" + this.isBlockingLoading + ")";
    }

    public ActiveTaskUiState(int i, @NotNull ActiveTaskEnum hintScreen, @NotNull String hintTitle, @NotNull String hintDesc, @NotNull String btnText, int i2, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(hintScreen, "hintScreen");
        Intrinsics.checkNotNullParameter(hintTitle, "hintTitle");
        Intrinsics.checkNotNullParameter(hintDesc, "hintDesc");
        Intrinsics.checkNotNullParameter(btnText, "btnText");
        this.hintNumber = i;
        this.hintScreen = hintScreen;
        this.hintTitle = hintTitle;
        this.hintDesc = hintDesc;
        this.btnText = btnText;
        this.hintTime = i2;
        this.isInterfaceVisible = z;
        this.isNeedClose = z2;
        this.isBlockingLoading = z3;
    }

    public final int getHintNumber() {
        return this.hintNumber;
    }

    public /* synthetic */ ActiveTaskUiState(int i, ActiveTaskEnum activeTaskEnum, String str, String str2, String str3, int i2, boolean z, boolean z2, boolean z3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? ActiveTaskEnum.NONE : activeTaskEnum, (i3 & 4) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i3 & 8) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i3 & 16) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str3, (i3 & 32) != 0 ? -1 : i2, (i3 & 64) != 0 ? true : z, (i3 & 128) != 0 ? false : z2, (i3 & 256) == 0 ? z3 : false);
    }

    @NotNull
    public final ActiveTaskEnum getHintScreen() {
        return this.hintScreen;
    }

    @NotNull
    public final String getHintTitle() {
        return this.hintTitle;
    }

    @NotNull
    public final String getHintDesc() {
        return this.hintDesc;
    }

    @NotNull
    public final String getBtnText() {
        return this.btnText;
    }

    public final int getHintTime() {
        return this.hintTime;
    }

    public final boolean isInterfaceVisible() {
        return this.isInterfaceVisible;
    }

    public final boolean isNeedClose() {
        return this.isNeedClose;
    }

    public final boolean isBlockingLoading() {
        return this.isBlockingLoading;
    }
}

