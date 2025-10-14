package com.blackhub.bronline.game.gui.catchstreamer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CatchStreamerUiState.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b¢\u0006\u0002\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003Jm\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bHÆ\u0001J\u0013\u0010#\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0015R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010¨\u0006)"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/catchstreamer/CatchStreamerUiState;", "Lcom/blackhub/bronline/game/common/UiState;", "screen", "", CatchStreamerKeys.DONATE_KEY, CatchStreamerKeys.GAMES_KEY, "currentCost", "countPlayers", "selectCountTickets", "countBuyTickets", "isPurchaseValid", "", "isNeedClose", "isBlockingLoading", "(IIIIIIIZZZ)V", "getCountBuyTickets", "()I", "getCountPlayers", "getCurrentCost", "getDonate", "getGames", "()Z", "getScreen", "getSelectCountTickets", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CatchStreamerUiState implements UiState {
    public static final int $stable = 0;
    public final int countBuyTickets;
    public final int countPlayers;
    public final int currentCost;
    public final int donate;
    public final int games;
    public final boolean isBlockingLoading;
    public final boolean isNeedClose;
    public final boolean isPurchaseValid;
    public final int screen;
    public final int selectCountTickets;

    public CatchStreamerUiState() {
        this(0, 0, 0, 0, 0, 0, 0, false, false, false, 1023, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getScreen() {
        return this.screen;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsBlockingLoading() {
        return this.isBlockingLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDonate() {
        return this.donate;
    }

    /* renamed from: component3, reason: from getter */
    public final int getGames() {
        return this.games;
    }

    /* renamed from: component4, reason: from getter */
    public final int getCurrentCost() {
        return this.currentCost;
    }

    /* renamed from: component5, reason: from getter */
    public final int getCountPlayers() {
        return this.countPlayers;
    }

    /* renamed from: component6, reason: from getter */
    public final int getSelectCountTickets() {
        return this.selectCountTickets;
    }

    /* renamed from: component7, reason: from getter */
    public final int getCountBuyTickets() {
        return this.countBuyTickets;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsPurchaseValid() {
        return this.isPurchaseValid;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsNeedClose() {
        return this.isNeedClose;
    }

    @NotNull
    public final CatchStreamerUiState copy(int screen, int donate, int games, int currentCost, int countPlayers, int selectCountTickets, int countBuyTickets, boolean isPurchaseValid, boolean isNeedClose, boolean isBlockingLoading) {
        return new CatchStreamerUiState(screen, donate, games, currentCost, countPlayers, selectCountTickets, countBuyTickets, isPurchaseValid, isNeedClose, isBlockingLoading);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CatchStreamerUiState)) {
            return false;
        }
        CatchStreamerUiState catchStreamerUiState = (CatchStreamerUiState) other;
        return this.screen == catchStreamerUiState.screen && this.donate == catchStreamerUiState.donate && this.games == catchStreamerUiState.games && this.currentCost == catchStreamerUiState.currentCost && this.countPlayers == catchStreamerUiState.countPlayers && this.selectCountTickets == catchStreamerUiState.selectCountTickets && this.countBuyTickets == catchStreamerUiState.countBuyTickets && this.isPurchaseValid == catchStreamerUiState.isPurchaseValid && this.isNeedClose == catchStreamerUiState.isNeedClose && this.isBlockingLoading == catchStreamerUiState.isBlockingLoading;
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.screen) * 31) + Integer.hashCode(this.donate)) * 31) + Integer.hashCode(this.games)) * 31) + Integer.hashCode(this.currentCost)) * 31) + Integer.hashCode(this.countPlayers)) * 31) + Integer.hashCode(this.selectCountTickets)) * 31) + Integer.hashCode(this.countBuyTickets)) * 31) + Boolean.hashCode(this.isPurchaseValid)) * 31) + Boolean.hashCode(this.isNeedClose)) * 31) + Boolean.hashCode(this.isBlockingLoading);
    }

    @NotNull
    public String toString() {
        return "CatchStreamerUiState(screen=" + this.screen + ", donate=" + this.donate + ", games=" + this.games + ", currentCost=" + this.currentCost + ", countPlayers=" + this.countPlayers + ", selectCountTickets=" + this.selectCountTickets + ", countBuyTickets=" + this.countBuyTickets + ", isPurchaseValid=" + this.isPurchaseValid + ", isNeedClose=" + this.isNeedClose + ", isBlockingLoading=" + this.isBlockingLoading + ")";
    }

    public CatchStreamerUiState(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3) {
        this.screen = i;
        this.donate = i2;
        this.games = i3;
        this.currentCost = i4;
        this.countPlayers = i5;
        this.selectCountTickets = i6;
        this.countBuyTickets = i7;
        this.isPurchaseValid = z;
        this.isNeedClose = z2;
        this.isBlockingLoading = z3;
    }

    public /* synthetic */ CatchStreamerUiState(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i, (i8 & 2) != 0 ? 0 : i2, (i8 & 4) != 0 ? 0 : i3, (i8 & 8) != 0 ? 200 : i4, (i8 & 16) != 0 ? 0 : i5, (i8 & 32) != 0 ? 1 : i6, (i8 & 64) != 0 ? 0 : i7, (i8 & 128) != 0 ? false : z, (i8 & 256) != 0 ? false : z2, (i8 & 512) == 0 ? z3 : false);
    }

    public final int getScreen() {
        return this.screen;
    }

    public final int getDonate() {
        return this.donate;
    }

    public final int getGames() {
        return this.games;
    }

    public final int getCurrentCost() {
        return this.currentCost;
    }

    public final int getCountPlayers() {
        return this.countPlayers;
    }

    public final int getSelectCountTickets() {
        return this.selectCountTickets;
    }

    public final int getCountBuyTickets() {
        return this.countBuyTickets;
    }

    public final boolean isPurchaseValid() {
        return this.isPurchaseValid;
    }

    public final boolean isNeedClose() {
        return this.isNeedClose;
    }

    public final boolean isBlockingLoading() {
        return this.isBlockingLoading;
    }
}
