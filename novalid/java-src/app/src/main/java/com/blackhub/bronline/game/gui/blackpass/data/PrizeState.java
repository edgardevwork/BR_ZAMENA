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
@Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0017"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/blackpass/data/PrizeState;", "Lcom/blackhub/bronline/game/common/UiState;", "allPrizes", "", "Lcom/blackhub/bronline/game/gui/blackpass/data/PrizeObj;", "isShowingDialog", "", "(Ljava/util/List;Z)V", "getAllPrizes", "()Ljava/util/List;", "setAllPrizes", "(Ljava/util/List;)V", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
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
