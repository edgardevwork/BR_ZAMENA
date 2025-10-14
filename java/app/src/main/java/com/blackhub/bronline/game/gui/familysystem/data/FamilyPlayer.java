package com.blackhub.bronline.game.gui.familysystem.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FamilyPlayer.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class FamilyPlayer {
    public static final int $stable = 8;
    public boolean isClicked;

    @NotNull
    public final String playersNick;
    public int playersRank;
    public final int playersStatus;

    public static /* synthetic */ FamilyPlayer copy$default(FamilyPlayer familyPlayer, String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = familyPlayer.playersNick;
        }
        if ((i3 & 2) != 0) {
            i = familyPlayer.playersRank;
        }
        if ((i3 & 4) != 0) {
            i2 = familyPlayer.playersStatus;
        }
        if ((i3 & 8) != 0) {
            z = familyPlayer.isClicked;
        }
        return familyPlayer.copy(str, i, i2, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPlayersNick() {
        return this.playersNick;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPlayersRank() {
        return this.playersRank;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPlayersStatus() {
        return this.playersStatus;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsClicked() {
        return this.isClicked;
    }

    @NotNull
    public final FamilyPlayer copy(@NotNull String playersNick, int playersRank, int playersStatus, boolean isClicked) {
        Intrinsics.checkNotNullParameter(playersNick, "playersNick");
        return new FamilyPlayer(playersNick, playersRank, playersStatus, isClicked);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FamilyPlayer)) {
            return false;
        }
        FamilyPlayer familyPlayer = (FamilyPlayer) other;
        return Intrinsics.areEqual(this.playersNick, familyPlayer.playersNick) && this.playersRank == familyPlayer.playersRank && this.playersStatus == familyPlayer.playersStatus && this.isClicked == familyPlayer.isClicked;
    }

    public int hashCode() {
        return (((((this.playersNick.hashCode() * 31) + Integer.hashCode(this.playersRank)) * 31) + Integer.hashCode(this.playersStatus)) * 31) + Boolean.hashCode(this.isClicked);
    }

    @NotNull
    public String toString() {
        return "FamilyPlayer(playersNick=" + this.playersNick + ", playersRank=" + this.playersRank + ", playersStatus=" + this.playersStatus + ", isClicked=" + this.isClicked + ")";
    }

    public FamilyPlayer(@NotNull String playersNick, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(playersNick, "playersNick");
        this.playersNick = playersNick;
        this.playersRank = i;
        this.playersStatus = i2;
        this.isClicked = z;
    }

    public /* synthetic */ FamilyPlayer(String str, int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, (i3 & 8) != 0 ? false : z);
    }

    @NotNull
    public final String getPlayersNick() {
        return this.playersNick;
    }

    public final int getPlayersRank() {
        return this.playersRank;
    }

    public final void setPlayersRank(int i) {
        this.playersRank = i;
    }

    public final int getPlayersStatus() {
        return this.playersStatus;
    }

    public final boolean isClicked() {
        return this.isClicked;
    }

    public final void setClicked(boolean z) {
        this.isClicked = z;
    }
}

