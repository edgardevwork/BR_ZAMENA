package com.blackhub.bronline.game.gui.woundsystem.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PlayerInfo.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final /* data */ class PlayerInfo {
    public static final int $stable = 0;
    public final int playersId;

    @NotNull
    public final String playersNick;

    public static /* synthetic */ PlayerInfo copy$default(PlayerInfo playerInfo, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = playerInfo.playersNick;
        }
        if ((i2 & 2) != 0) {
            i = playerInfo.playersId;
        }
        return playerInfo.copy(str, i);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPlayersNick() {
        return this.playersNick;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPlayersId() {
        return this.playersId;
    }

    @NotNull
    public final PlayerInfo copy(@NotNull String playersNick, int playersId) {
        Intrinsics.checkNotNullParameter(playersNick, "playersNick");
        return new PlayerInfo(playersNick, playersId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerInfo)) {
            return false;
        }
        PlayerInfo playerInfo = (PlayerInfo) other;
        return Intrinsics.areEqual(this.playersNick, playerInfo.playersNick) && this.playersId == playerInfo.playersId;
    }

    public int hashCode() {
        return (this.playersNick.hashCode() * 31) + Integer.hashCode(this.playersId);
    }

    @NotNull
    public String toString() {
        return "PlayerInfo(playersNick=" + this.playersNick + ", playersId=" + this.playersId + ")";
    }

    public PlayerInfo(@NotNull String playersNick, int i) {
        Intrinsics.checkNotNullParameter(playersNick, "playersNick");
        this.playersNick = playersNick;
        this.playersId = i;
    }

    @NotNull
    public final String getPlayersNick() {
        return this.playersNick;
    }

    public final int getPlayersId() {
        return this.playersId;
    }
}

