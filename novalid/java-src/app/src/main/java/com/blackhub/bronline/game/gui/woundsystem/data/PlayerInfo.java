package com.blackhub.bronline.game.gui.woundsystem.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PlayerInfo.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/woundsystem/data/PlayerInfo;", "", "playersNick", "", "playersId", "", "(Ljava/lang/String;I)V", "getPlayersId", "()I", "getPlayersNick", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
