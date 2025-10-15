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
@Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003JG\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011¨\u0006$"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/gasmangame/uistate/GasmanChildUIState;", "Lcom/blackhub/bronline/game/common/UiState;", "topPlotQuantity", "", "middlePlotQuantity", "botPlotQuantity", "checkIfPipesInPlaces", "", "Landroid/view/View;", "", "animateGas", "(IIILjava/util/Map;Z)V", "getAnimateGas", "()Z", "getBotPlotQuantity", "()I", "setBotPlotQuantity", "(I)V", "getCheckIfPipesInPlaces", "()Ljava/util/Map;", "getMiddlePlotQuantity", "setMiddlePlotQuantity", "getTopPlotQuantity", "setTopPlotQuantity", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
