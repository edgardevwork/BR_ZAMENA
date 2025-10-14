package com.blackhub.bronline.game.gui.taxirating;

import androidx.annotation.ColorRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TaxiRatingUiState.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class TaxiRatingUiState implements UiState {
    public static final int $stable = 0;
    public final boolean isNeedClose;
    public final boolean isRateSelected;
    public final int selectedRate;
    public final int selectedTip;
    public final int tips;

    public TaxiRatingUiState() {
        this(0, false, 0, 0, false, 31, null);
    }

    public static /* synthetic */ TaxiRatingUiState copy$default(TaxiRatingUiState taxiRatingUiState, int i, boolean z, int i2, int i3, boolean z2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = taxiRatingUiState.tips;
        }
        if ((i4 & 2) != 0) {
            z = taxiRatingUiState.isRateSelected;
        }
        boolean z3 = z;
        if ((i4 & 4) != 0) {
            i2 = taxiRatingUiState.selectedRate;
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            i3 = taxiRatingUiState.selectedTip;
        }
        int i6 = i3;
        if ((i4 & 16) != 0) {
            z2 = taxiRatingUiState.isNeedClose;
        }
        return taxiRatingUiState.copy(i, z3, i5, i6, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTips() {
        return this.tips;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsRateSelected() {
        return this.isRateSelected;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSelectedRate() {
        return this.selectedRate;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSelectedTip() {
        return this.selectedTip;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsNeedClose() {
        return this.isNeedClose;
    }

    @NotNull
    public final TaxiRatingUiState copy(int tips, boolean isRateSelected, int selectedRate, int selectedTip, boolean isNeedClose) {
        return new TaxiRatingUiState(tips, isRateSelected, selectedRate, selectedTip, isNeedClose);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxiRatingUiState)) {
            return false;
        }
        TaxiRatingUiState taxiRatingUiState = (TaxiRatingUiState) other;
        return this.tips == taxiRatingUiState.tips && this.isRateSelected == taxiRatingUiState.isRateSelected && this.selectedRate == taxiRatingUiState.selectedRate && this.selectedTip == taxiRatingUiState.selectedTip && this.isNeedClose == taxiRatingUiState.isNeedClose;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.tips) * 31) + Boolean.hashCode(this.isRateSelected)) * 31) + Integer.hashCode(this.selectedRate)) * 31) + Integer.hashCode(this.selectedTip)) * 31) + Boolean.hashCode(this.isNeedClose);
    }

    @NotNull
    public String toString() {
        return "TaxiRatingUiState(tips=" + this.tips + ", isRateSelected=" + this.isRateSelected + ", selectedRate=" + this.selectedRate + ", selectedTip=" + this.selectedTip + ", isNeedClose=" + this.isNeedClose + ")";
    }

    public TaxiRatingUiState(int i, boolean z, int i2, int i3, boolean z2) {
        this.tips = i;
        this.isRateSelected = z;
        this.selectedRate = i2;
        this.selectedTip = i3;
        this.isNeedClose = z2;
    }

    public /* synthetic */ TaxiRatingUiState(int i, boolean z, int i2, int i3, boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? false : z, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 0 : i3, (i4 & 16) != 0 ? false : z2);
    }

    public final int getTips() {
        return this.tips;
    }

    public final boolean isRateSelected() {
        return this.isRateSelected;
    }

    public final int getSelectedRate() {
        return this.selectedRate;
    }

    public final int getSelectedTip() {
        return this.selectedTip;
    }

    public final boolean isNeedClose() {
        return this.isNeedClose;
    }

    @ColorRes
    public final int getStarColorOne() {
        return this.selectedRate < 1 ? R.color.dark_gray : R.color.orange;
    }

    @ColorRes
    public final int getStarColorTwo() {
        return this.selectedRate < 2 ? R.color.dark_gray : R.color.orange;
    }

    @ColorRes
    public final int getStarColorThree() {
        return this.selectedRate < 3 ? R.color.dark_gray : R.color.orange;
    }

    @ColorRes
    public final int getStarColorFour() {
        return this.selectedRate < 4 ? R.color.dark_gray : R.color.orange;
    }

    @ColorRes
    public final int getStarColorFive() {
        return this.selectedRate < 5 ? R.color.dark_gray : R.color.orange;
    }

    @ColorRes
    public final int getTipsBntOneBorder() {
        return this.selectedTip == 70 ? R.color.orange : R.color.transparent;
    }

    @ColorRes
    public final int getTipsBntTwoBorder() {
        return this.selectedTip == 100 ? R.color.orange : R.color.transparent;
    }

    @ColorRes
    public final int getTipsBntThreeBorder() {
        return this.selectedTip == 1000 ? R.color.orange : R.color.transparent;
    }
}

