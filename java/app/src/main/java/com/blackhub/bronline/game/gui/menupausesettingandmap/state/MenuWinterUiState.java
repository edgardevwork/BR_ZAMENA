package com.blackhub.bronline.game.gui.menupausesettingandmap.state;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MenuWinterUiState.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final /* data */ class MenuWinterUiState implements UiState {
    public static final int $stable = 0;
    public final boolean isBlockingLoading;
    public final boolean isNeedClose;
    public final boolean isWinterSlip;
    public final int snowIntensityValue;

    public MenuWinterUiState() {
        this(0, false, false, false, 15, null);
    }

    public static /* synthetic */ MenuWinterUiState copy$default(MenuWinterUiState menuWinterUiState, int i, boolean z, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = menuWinterUiState.snowIntensityValue;
        }
        if ((i2 & 2) != 0) {
            z = menuWinterUiState.isWinterSlip;
        }
        if ((i2 & 4) != 0) {
            z2 = menuWinterUiState.isNeedClose;
        }
        if ((i2 & 8) != 0) {
            z3 = menuWinterUiState.isBlockingLoading;
        }
        return menuWinterUiState.copy(i, z, z2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSnowIntensityValue() {
        return this.snowIntensityValue;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsWinterSlip() {
        return this.isWinterSlip;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsNeedClose() {
        return this.isNeedClose;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsBlockingLoading() {
        return this.isBlockingLoading;
    }

    @NotNull
    public final MenuWinterUiState copy(int snowIntensityValue, boolean isWinterSlip, boolean isNeedClose, boolean isBlockingLoading) {
        return new MenuWinterUiState(snowIntensityValue, isWinterSlip, isNeedClose, isBlockingLoading);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenuWinterUiState)) {
            return false;
        }
        MenuWinterUiState menuWinterUiState = (MenuWinterUiState) other;
        return this.snowIntensityValue == menuWinterUiState.snowIntensityValue && this.isWinterSlip == menuWinterUiState.isWinterSlip && this.isNeedClose == menuWinterUiState.isNeedClose && this.isBlockingLoading == menuWinterUiState.isBlockingLoading;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.snowIntensityValue) * 31) + Boolean.hashCode(this.isWinterSlip)) * 31) + Boolean.hashCode(this.isNeedClose)) * 31) + Boolean.hashCode(this.isBlockingLoading);
    }

    @NotNull
    public String toString() {
        return "MenuWinterUiState(snowIntensityValue=" + this.snowIntensityValue + ", isWinterSlip=" + this.isWinterSlip + ", isNeedClose=" + this.isNeedClose + ", isBlockingLoading=" + this.isBlockingLoading + ")";
    }

    public MenuWinterUiState(int i, boolean z, boolean z2, boolean z3) {
        this.snowIntensityValue = i;
        this.isWinterSlip = z;
        this.isNeedClose = z2;
        this.isBlockingLoading = z3;
    }

    public /* synthetic */ MenuWinterUiState(int i, boolean z, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 2 : i, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? true : z3);
    }

    public final int getSnowIntensityValue() {
        return this.snowIntensityValue;
    }

    public final boolean isWinterSlip() {
        return this.isWinterSlip;
    }

    public final boolean isNeedClose() {
        return this.isNeedClose;
    }

    public final boolean isBlockingLoading() {
        return this.isBlockingLoading;
    }
}

