package com.blackhub.bronline.game.gui.blackpass.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PrizeState.kt */
@StabilityInferred(parameters = 0)

public final /* data */ class PrizeState implements UiState {
    public static final int $stable = 8;

    @NotNull
    public List<PrizeObj> allPrizes;
    public final boolean isShowingDialog;

    public PrizeState() {
        this(null, false, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PrizeState copy$default(PrizeState prizeState, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = prizeState.allPrizes;
        }
        if ((i & 2) != 0) {
            z = prizeState.isShowingDialog;
        }
        return prizeState.copy(list, z);
    }

    @NotNull
    public final List<PrizeObj> component1() {
        return this.allPrizes;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsShowingDialog() {
        return this.isShowingDialog;
    }

    @NotNull
    public final PrizeState copy(@NotNull List<PrizeObj> allPrizes, boolean isShowingDialog) {
        Intrinsics.checkNotNullParameter(allPrizes, "allPrizes");
        return new PrizeState(allPrizes, isShowingDialog);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrizeState)) {
            return false;
        }
        PrizeState prizeState = (PrizeState) other;
        return Intrinsics.areEqual(this.allPrizes, prizeState.allPrizes) && this.isShowingDialog == prizeState.isShowingDialog;
    }

    public int hashCode() {
        return (this.allPrizes.hashCode() * 31) + Boolean.hashCode(this.isShowingDialog);
    }

    @NotNull
    public String toString() {
        return "PrizeState(allPrizes=" + this.allPrizes + ", isShowingDialog=" + this.isShowingDialog + ")";
    }

    public PrizeState(@NotNull List<PrizeObj> allPrizes, boolean z) {
        Intrinsics.checkNotNullParameter(allPrizes, "allPrizes");
        this.allPrizes = allPrizes;
        this.isShowingDialog = z;
    }

    public /* synthetic */ PrizeState(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? false : z);
    }

    @NotNull
    public final List<PrizeObj> getAllPrizes() {
        return this.allPrizes;
    }

    public final void setAllPrizes(@NotNull List<PrizeObj> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.allPrizes = list;
    }

    public final boolean isShowingDialog() {
        return this.isShowingDialog;
    }
}

