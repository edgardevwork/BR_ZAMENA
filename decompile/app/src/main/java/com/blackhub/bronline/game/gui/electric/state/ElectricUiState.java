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
@Metadata(m7104d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003JK\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e¨\u0006!"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/electric/state/ElectricUiState;", "Lcom/blackhub/bronline/game/common/UiState;", "miniGame", "", "instructionsAndHintsList", "", "Lcom/blackhub/bronline/game/gui/electric/model/ElectricInstructionsAndHintsModel;", "levelCounter", "countWin", "isNeedClose", "", "isBlockingLoading", "(ILjava/util/List;IIZZ)V", "getCountWin", "()I", "getInstructionsAndHintsList", "()Ljava/util/List;", "()Z", "getLevelCounter", "getMiniGame", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
