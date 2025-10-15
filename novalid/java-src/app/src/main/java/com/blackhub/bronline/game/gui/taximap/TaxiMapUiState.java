package com.blackhub.bronline.game.gui.taximap;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TaxiMapUiState.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\t\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000e¨\u0006\u001b"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/taximap/TaxiMapUiState;", "Lcom/blackhub/bronline/game/common/UiState;", "coordinateX", "", "coordinateY", "isButtonEnabled", "", "isNeedClose", "(FFZZ)V", "buttonAlpha", "getButtonAlpha", "()F", "getCoordinateX", "getCoordinateY", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
