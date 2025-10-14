package com.blackhub.bronline.game.gui.electric.state;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.gui.electric.model.ElectricInstructionsAndHintsModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ElectricUiState.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class ElectricUiState implements UiState {
    public static final int $stable = 8;
    public final int countWin;

    @NotNull
    public final List<ElectricInstructionsAndHintsModel> instructionsAndHintsList;
    public final boolean isBlockingLoading;
    public final boolean isNeedClose;
    public final int levelCounter;
    public final int miniGame;

    public ElectricUiState() {
        this(0, null, 0, 0, false, false, 63, null);
    }

    public static /* synthetic */ ElectricUiState copy$default(ElectricUiState electricUiState, int i, List list, int i2, int i3, boolean z, boolean z2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = electricUiState.miniGame;
        }
        if ((i4 & 2) != 0) {
            list = electricUiState.instructionsAndHintsList;
        }
        List list2 = list;
        if ((i4 & 4) != 0) {
            i2 = electricUiState.levelCounter;
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            i3 = electricUiState.countWin;
        }
        int i6 = i3;
        if ((i4 & 16) != 0) {
            z = electricUiState.isNeedClose;
        }
        boolean z3 = z;
        if ((i4 & 32) != 0) {
            z2 = electricUiState.isBlockingLoading;
        }
        return electricUiState.copy(i, list2, i5, i6, z3, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMiniGame() {
        return this.miniGame;
    }

    @NotNull
    public final List<ElectricInstructionsAndHintsModel> component2() {
        return this.instructionsAndHintsList;
    }

    /* renamed from: component3, reason: from getter */
    public final int getLevelCounter() {
        return this.levelCounter;
    }

    /* renamed from: component4, reason: from getter */
    public final int getCountWin() {
        return this.countWin;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsNeedClose() {
        return this.isNeedClose;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsBlockingLoading() {
        return this.isBlockingLoading;
    }

    @NotNull
    public final ElectricUiState copy(int miniGame, @NotNull List<ElectricInstructionsAndHintsModel> instructionsAndHintsList, int levelCounter, int countWin, boolean isNeedClose, boolean isBlockingLoading) {
        Intrinsics.checkNotNullParameter(instructionsAndHintsList, "instructionsAndHintsList");
        return new ElectricUiState(miniGame, instructionsAndHintsList, levelCounter, countWin, isNeedClose, isBlockingLoading);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ElectricUiState)) {
            return false;
        }
        ElectricUiState electricUiState = (ElectricUiState) other;
        return this.miniGame == electricUiState.miniGame && Intrinsics.areEqual(this.instructionsAndHintsList, electricUiState.instructionsAndHintsList) && this.levelCounter == electricUiState.levelCounter && this.countWin == electricUiState.countWin && this.isNeedClose == electricUiState.isNeedClose && this.isBlockingLoading == electricUiState.isBlockingLoading;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.miniGame) * 31) + this.instructionsAndHintsList.hashCode()) * 31) + Integer.hashCode(this.levelCounter)) * 31) + Integer.hashCode(this.countWin)) * 31) + Boolean.hashCode(this.isNeedClose)) * 31) + Boolean.hashCode(this.isBlockingLoading);
    }

    @NotNull
    public String toString() {
        return "ElectricUiState(miniGame=" + this.miniGame + ", instructionsAndHintsList=" + this.instructionsAndHintsList + ", levelCounter=" + this.levelCounter + ", countWin=" + this.countWin + ", isNeedClose=" + this.isNeedClose + ", isBlockingLoading=" + this.isBlockingLoading + ")";
    }

    public ElectricUiState(int i, @NotNull List<ElectricInstructionsAndHintsModel> instructionsAndHintsList, int i2, int i3, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(instructionsAndHintsList, "instructionsAndHintsList");
        this.miniGame = i;
        this.instructionsAndHintsList = instructionsAndHintsList;
        this.levelCounter = i2;
        this.countWin = i3;
        this.isNeedClose = z;
        this.isBlockingLoading = z2;
    }

    public final int getMiniGame() {
        return this.miniGame;
    }

    public /* synthetic */ ElectricUiState(int i, List list, int i2, int i3, boolean z, boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i4 & 4) != 0 ? 1 : i2, (i4 & 8) != 0 ? 0 : i3, (i4 & 16) == 0 ? z : false, (i4 & 32) != 0 ? true : z2);
    }

    @NotNull
    public final List<ElectricInstructionsAndHintsModel> getInstructionsAndHintsList() {
        return this.instructionsAndHintsList;
    }

    public final int getLevelCounter() {
        return this.levelCounter;
    }

    public final int getCountWin() {
        return this.countWin;
    }

    public final boolean isNeedClose() {
        return this.isNeedClose;
    }

    public final boolean isBlockingLoading() {
        return this.isBlockingLoading;
    }
}

