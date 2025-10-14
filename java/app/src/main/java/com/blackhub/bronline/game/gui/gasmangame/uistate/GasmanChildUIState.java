package com.blackhub.bronline.game.gui.gasmangame.uistate;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GasmanChildUIState.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final /* data */ class GasmanChildUIState implements UiState {
    public static final int $stable = 8;
    public final boolean animateGas;
    public int botPlotQuantity;

    @NotNull
    public final Map<View, Boolean> checkIfPipesInPlaces;
    public int middlePlotQuantity;
    public int topPlotQuantity;

    public GasmanChildUIState() {
        this(0, 0, 0, null, false, 31, null);
    }

    public static /* synthetic */ GasmanChildUIState copy$default(GasmanChildUIState gasmanChildUIState, int i, int i2, int i3, Map map, boolean z, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = gasmanChildUIState.topPlotQuantity;
        }
        if ((i4 & 2) != 0) {
            i2 = gasmanChildUIState.middlePlotQuantity;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            i3 = gasmanChildUIState.botPlotQuantity;
        }
        int i6 = i3;
        if ((i4 & 8) != 0) {
            map = gasmanChildUIState.checkIfPipesInPlaces;
        }
        Map map2 = map;
        if ((i4 & 16) != 0) {
            z = gasmanChildUIState.animateGas;
        }
        return gasmanChildUIState.copy(i, i5, i6, map2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTopPlotQuantity() {
        return this.topPlotQuantity;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMiddlePlotQuantity() {
        return this.middlePlotQuantity;
    }

    /* renamed from: component3, reason: from getter */
    public final int getBotPlotQuantity() {
        return this.botPlotQuantity;
    }

    @NotNull
    public final Map<View, Boolean> component4() {
        return this.checkIfPipesInPlaces;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getAnimateGas() {
        return this.animateGas;
    }

    @NotNull
    public final GasmanChildUIState copy(int topPlotQuantity, int middlePlotQuantity, int botPlotQuantity, @NotNull Map<View, Boolean> checkIfPipesInPlaces, boolean animateGas) {
        Intrinsics.checkNotNullParameter(checkIfPipesInPlaces, "checkIfPipesInPlaces");
        return new GasmanChildUIState(topPlotQuantity, middlePlotQuantity, botPlotQuantity, checkIfPipesInPlaces, animateGas);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GasmanChildUIState)) {
            return false;
        }
        GasmanChildUIState gasmanChildUIState = (GasmanChildUIState) other;
        return this.topPlotQuantity == gasmanChildUIState.topPlotQuantity && this.middlePlotQuantity == gasmanChildUIState.middlePlotQuantity && this.botPlotQuantity == gasmanChildUIState.botPlotQuantity && Intrinsics.areEqual(this.checkIfPipesInPlaces, gasmanChildUIState.checkIfPipesInPlaces) && this.animateGas == gasmanChildUIState.animateGas;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.topPlotQuantity) * 31) + Integer.hashCode(this.middlePlotQuantity)) * 31) + Integer.hashCode(this.botPlotQuantity)) * 31) + this.checkIfPipesInPlaces.hashCode()) * 31) + Boolean.hashCode(this.animateGas);
    }

    @NotNull
    public String toString() {
        return "GasmanChildUIState(topPlotQuantity=" + this.topPlotQuantity + ", middlePlotQuantity=" + this.middlePlotQuantity + ", botPlotQuantity=" + this.botPlotQuantity + ", checkIfPipesInPlaces=" + this.checkIfPipesInPlaces + ", animateGas=" + this.animateGas + ")";
    }

    public GasmanChildUIState(int i, int i2, int i3, @NotNull Map<View, Boolean> checkIfPipesInPlaces, boolean z) {
        Intrinsics.checkNotNullParameter(checkIfPipesInPlaces, "checkIfPipesInPlaces");
        this.topPlotQuantity = i;
        this.middlePlotQuantity = i2;
        this.botPlotQuantity = i3;
        this.checkIfPipesInPlaces = checkIfPipesInPlaces;
        this.animateGas = z;
    }

    public final int getTopPlotQuantity() {
        return this.topPlotQuantity;
    }

    public final void setTopPlotQuantity(int i) {
        this.topPlotQuantity = i;
    }

    public final int getMiddlePlotQuantity() {
        return this.middlePlotQuantity;
    }

    public final void setMiddlePlotQuantity(int i) {
        this.middlePlotQuantity = i;
    }

    public final int getBotPlotQuantity() {
        return this.botPlotQuantity;
    }

    public final void setBotPlotQuantity(int i) {
        this.botPlotQuantity = i;
    }

    public /* synthetic */ GasmanChildUIState(int i, int i2, int i3, Map map, boolean z, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? new LinkedHashMap() : map, (i4 & 16) != 0 ? false : z);
    }

    @NotNull
    public final Map<View, Boolean> getCheckIfPipesInPlaces() {
        return this.checkIfPipesInPlaces;
    }

    public final boolean getAnimateGas() {
        return this.animateGas;
    }
}

