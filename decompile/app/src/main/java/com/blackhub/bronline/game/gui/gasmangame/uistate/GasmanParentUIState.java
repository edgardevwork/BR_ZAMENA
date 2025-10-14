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
@Metadata(m7104d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003J[\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010&\u001a\u00020\u00032\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0011R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018¨\u0006,"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/gasmangame/uistate/GasmanParentUIState;", "Lcom/blackhub/bronline/game/common/UiState;", "loadingFragmentEnded", "", "quantityOfChecks", "", "randomListOfGames", "", "listResultOfCheck", "isNeedToShowDialog", "currentFragmentNumber", "gasmanSizesItem", "Lcom/blackhub/bronline/game/gui/gasmangame/uistate/GasmanSizesItem;", "(ZILjava/util/List;Ljava/util/List;ZILcom/blackhub/bronline/game/gui/gasmangame/uistate/GasmanSizesItem;)V", "getCurrentFragmentNumber", "()I", "setCurrentFragmentNumber", "(I)V", "getGasmanSizesItem", "()Lcom/blackhub/bronline/game/gui/gasmangame/uistate/GasmanSizesItem;", "()Z", "setNeedToShowDialog", "(Z)V", "getListResultOfCheck", "()Ljava/util/List;", "getLoadingFragmentEnded", "setLoadingFragmentEnded", "getQuantityOfChecks", "setQuantityOfChecks", "getRandomListOfGames", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
