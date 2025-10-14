package com.blackhub.bronline.game.gui.taximap;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TaxiMapUiState.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class TaxiMapUiState implements UiState {
    public static final int $stable = 0;
    public final float coordinateX;
    public final float coordinateY;
    public final boolean isButtonEnabled;
    public final boolean isNeedClose;

    public TaxiMapUiState() {
        this(0.0f, 0.0f, false, false, 15, null);
    }

    public static /* synthetic */ TaxiMapUiState copy$default(TaxiMapUiState taxiMapUiState, float f, float f2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = taxiMapUiState.coordinateX;
        }
        if ((i & 2) != 0) {
            f2 = taxiMapUiState.coordinateY;
        }
        if ((i & 4) != 0) {
            z = taxiMapUiState.isButtonEnabled;
        }
        if ((i & 8) != 0) {
            z2 = taxiMapUiState.isNeedClose;
        }
        return taxiMapUiState.copy(f, f2, z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final float getCoordinateX() {
        return this.coordinateX;
    }

    /* renamed from: component2, reason: from getter */
    public final float getCoordinateY() {
        return this.coordinateY;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsButtonEnabled() {
        return this.isButtonEnabled;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsNeedClose() {
        return this.isNeedClose;
    }

    @NotNull
    public final TaxiMapUiState copy(float coordinateX, float coordinateY, boolean isButtonEnabled, boolean isNeedClose) {
        return new TaxiMapUiState(coordinateX, coordinateY, isButtonEnabled, isNeedClose);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxiMapUiState)) {
            return false;
        }
        TaxiMapUiState taxiMapUiState = (TaxiMapUiState) other;
        return Float.compare(this.coordinateX, taxiMapUiState.coordinateX) == 0 && Float.compare(this.coordinateY, taxiMapUiState.coordinateY) == 0 && this.isButtonEnabled == taxiMapUiState.isButtonEnabled && this.isNeedClose == taxiMapUiState.isNeedClose;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.coordinateX) * 31) + Float.hashCode(this.coordinateY)) * 31) + Boolean.hashCode(this.isButtonEnabled)) * 31) + Boolean.hashCode(this.isNeedClose);
    }

    @NotNull
    public String toString() {
        return "TaxiMapUiState(coordinateX=" + this.coordinateX + ", coordinateY=" + this.coordinateY + ", isButtonEnabled=" + this.isButtonEnabled + ", isNeedClose=" + this.isNeedClose + ")";
    }

    public TaxiMapUiState(float f, float f2, boolean z, boolean z2) {
        this.coordinateX = f;
        this.coordinateY = f2;
        this.isButtonEnabled = z;
        this.isNeedClose = z2;
    }

    public /* synthetic */ TaxiMapUiState(float f, float f2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -20000.0f : f, (i & 2) != 0 ? -20000.0f : f2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }

    public final float getCoordinateX() {
        return this.coordinateX;
    }

    public final float getCoordinateY() {
        return this.coordinateY;
    }

    public final boolean isButtonEnabled() {
        return this.isButtonEnabled;
    }

    public final boolean isNeedClose() {
        return this.isNeedClose;
    }

    public final float getButtonAlpha() {
        return this.isButtonEnabled ? 1.0f : 0.5f;
    }
}

