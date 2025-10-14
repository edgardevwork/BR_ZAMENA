package com.blackhub.bronline.game.gui.gasmangame.uistate;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GasmanParentUIState.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final /* data */ class GasmanParentUIState implements UiState {
    public static final int $stable = 8;
    public int currentFragmentNumber;

    @NotNull
    public final GasmanSizesItem gasmanSizesItem;
    public boolean isNeedToShowDialog;

    @NotNull
    public final List<Integer> listResultOfCheck;
    public boolean loadingFragmentEnded;
    public int quantityOfChecks;

    @NotNull
    public final List<Integer> randomListOfGames;

    public GasmanParentUIState() {
        this(false, 0, null, null, false, 0, null, 127, null);
    }

    public static /* synthetic */ GasmanParentUIState copy$default(GasmanParentUIState gasmanParentUIState, boolean z, int i, List list, List list2, boolean z2, int i2, GasmanSizesItem gasmanSizesItem, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = gasmanParentUIState.loadingFragmentEnded;
        }
        if ((i3 & 2) != 0) {
            i = gasmanParentUIState.quantityOfChecks;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            list = gasmanParentUIState.randomListOfGames;
        }
        List list3 = list;
        if ((i3 & 8) != 0) {
            list2 = gasmanParentUIState.listResultOfCheck;
        }
        List list4 = list2;
        if ((i3 & 16) != 0) {
            z2 = gasmanParentUIState.isNeedToShowDialog;
        }
        boolean z3 = z2;
        if ((i3 & 32) != 0) {
            i2 = gasmanParentUIState.currentFragmentNumber;
        }
        int i5 = i2;
        if ((i3 & 64) != 0) {
            gasmanSizesItem = gasmanParentUIState.gasmanSizesItem;
        }
        return gasmanParentUIState.copy(z, i4, list3, list4, z3, i5, gasmanSizesItem);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getLoadingFragmentEnded() {
        return this.loadingFragmentEnded;
    }

    /* renamed from: component2, reason: from getter */
    public final int getQuantityOfChecks() {
        return this.quantityOfChecks;
    }

    @NotNull
    public final List<Integer> component3() {
        return this.randomListOfGames;
    }

    @NotNull
    public final List<Integer> component4() {
        return this.listResultOfCheck;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsNeedToShowDialog() {
        return this.isNeedToShowDialog;
    }

    /* renamed from: component6, reason: from getter */
    public final int getCurrentFragmentNumber() {
        return this.currentFragmentNumber;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final GasmanSizesItem getGasmanSizesItem() {
        return this.gasmanSizesItem;
    }

    @NotNull
    public final GasmanParentUIState copy(boolean loadingFragmentEnded, int quantityOfChecks, @NotNull List<Integer> randomListOfGames, @NotNull List<Integer> listResultOfCheck, boolean isNeedToShowDialog, int currentFragmentNumber, @NotNull GasmanSizesItem gasmanSizesItem) {
        Intrinsics.checkNotNullParameter(randomListOfGames, "randomListOfGames");
        Intrinsics.checkNotNullParameter(listResultOfCheck, "listResultOfCheck");
        Intrinsics.checkNotNullParameter(gasmanSizesItem, "gasmanSizesItem");
        return new GasmanParentUIState(loadingFragmentEnded, quantityOfChecks, randomListOfGames, listResultOfCheck, isNeedToShowDialog, currentFragmentNumber, gasmanSizesItem);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GasmanParentUIState)) {
            return false;
        }
        GasmanParentUIState gasmanParentUIState = (GasmanParentUIState) other;
        return this.loadingFragmentEnded == gasmanParentUIState.loadingFragmentEnded && this.quantityOfChecks == gasmanParentUIState.quantityOfChecks && Intrinsics.areEqual(this.randomListOfGames, gasmanParentUIState.randomListOfGames) && Intrinsics.areEqual(this.listResultOfCheck, gasmanParentUIState.listResultOfCheck) && this.isNeedToShowDialog == gasmanParentUIState.isNeedToShowDialog && this.currentFragmentNumber == gasmanParentUIState.currentFragmentNumber && Intrinsics.areEqual(this.gasmanSizesItem, gasmanParentUIState.gasmanSizesItem);
    }

    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.loadingFragmentEnded) * 31) + Integer.hashCode(this.quantityOfChecks)) * 31) + this.randomListOfGames.hashCode()) * 31) + this.listResultOfCheck.hashCode()) * 31) + Boolean.hashCode(this.isNeedToShowDialog)) * 31) + Integer.hashCode(this.currentFragmentNumber)) * 31) + this.gasmanSizesItem.hashCode();
    }

    @NotNull
    public String toString() {
        return "GasmanParentUIState(loadingFragmentEnded=" + this.loadingFragmentEnded + ", quantityOfChecks=" + this.quantityOfChecks + ", randomListOfGames=" + this.randomListOfGames + ", listResultOfCheck=" + this.listResultOfCheck + ", isNeedToShowDialog=" + this.isNeedToShowDialog + ", currentFragmentNumber=" + this.currentFragmentNumber + ", gasmanSizesItem=" + this.gasmanSizesItem + ")";
    }

    public GasmanParentUIState(boolean z, int i, @NotNull List<Integer> randomListOfGames, @NotNull List<Integer> listResultOfCheck, boolean z2, int i2, @NotNull GasmanSizesItem gasmanSizesItem) {
        Intrinsics.checkNotNullParameter(randomListOfGames, "randomListOfGames");
        Intrinsics.checkNotNullParameter(listResultOfCheck, "listResultOfCheck");
        Intrinsics.checkNotNullParameter(gasmanSizesItem, "gasmanSizesItem");
        this.loadingFragmentEnded = z;
        this.quantityOfChecks = i;
        this.randomListOfGames = randomListOfGames;
        this.listResultOfCheck = listResultOfCheck;
        this.isNeedToShowDialog = z2;
        this.currentFragmentNumber = i2;
        this.gasmanSizesItem = gasmanSizesItem;
    }

    public final boolean getLoadingFragmentEnded() {
        return this.loadingFragmentEnded;
    }

    public final void setLoadingFragmentEnded(boolean z) {
        this.loadingFragmentEnded = z;
    }

    public final int getQuantityOfChecks() {
        return this.quantityOfChecks;
    }

    public final void setQuantityOfChecks(int i) {
        this.quantityOfChecks = i;
    }

    public /* synthetic */ GasmanParentUIState(boolean z, int i, List list, List list2, boolean z2, int i2, GasmanSizesItem gasmanSizesItem, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i3 & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i3 & 16) == 0 ? z2 : false, (i3 & 32) != 0 ? -1 : i2, (i3 & 64) != 0 ? new GasmanSizesItem(0, 0, 0, 0, 0, 0, 0, 126, null) : gasmanSizesItem);
    }

    @NotNull
    public final List<Integer> getRandomListOfGames() {
        return this.randomListOfGames;
    }

    @NotNull
    public final List<Integer> getListResultOfCheck() {
        return this.listResultOfCheck;
    }

    public final boolean isNeedToShowDialog() {
        return this.isNeedToShowDialog;
    }

    public final void setNeedToShowDialog(boolean z) {
        this.isNeedToShowDialog = z;
    }

    public final int getCurrentFragmentNumber() {
        return this.currentFragmentNumber;
    }

    public final void setCurrentFragmentNumber(int i) {
        this.currentFragmentNumber = i;
    }

    @NotNull
    public final GasmanSizesItem getGasmanSizesItem() {
        return this.gasmanSizesItem;
    }
}

