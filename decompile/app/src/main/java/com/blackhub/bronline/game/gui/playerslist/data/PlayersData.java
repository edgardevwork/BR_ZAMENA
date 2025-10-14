package com.blackhub.bronline.game.gui.playerslist.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.gui.playerslist.utils.PlayersListUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PlayersData.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J1\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\n\"\u0004\b\u0017\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\n\"\u0004\b\u0019\u0010\f¨\u0006#"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/playerslist/data/PlayersData;", "", "id", "", "name", "", "playerLevel", PlayersListUtilsKt.KEY_GET_PLAYER_PING, "(ILjava/lang/String;II)V", "getId", "()I", "setId", "(I)V", "isClicked", "", "()Z", "setClicked", "(Z)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getPing", "setPing", "getPlayerLevel", "setPlayerLevel", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PlayersData {
    public static final int $stable = 8;
    public int id;
    public boolean isClicked;

    @NotNull
    public String name;
    public int ping;
    public int playerLevel;

    public static /* synthetic */ PlayersData copy$default(PlayersData playersData, int i, String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = playersData.id;
        }
        if ((i4 & 2) != 0) {
            str = playersData.name;
        }
        if ((i4 & 4) != 0) {
            i2 = playersData.playerLevel;
        }
        if ((i4 & 8) != 0) {
            i3 = playersData.ping;
        }
        return playersData.copy(i, str, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPlayerLevel() {
        return this.playerLevel;
    }

    /* renamed from: component4, reason: from getter */
    public final int getPing() {
        return this.ping;
    }

    @NotNull
    public final PlayersData copy(int id, @NotNull String name, int playerLevel, int ping) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new PlayersData(id, name, playerLevel, ping);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayersData)) {
            return false;
        }
        PlayersData playersData = (PlayersData) other;
        return this.id == playersData.id && Intrinsics.areEqual(this.name, playersData.name) && this.playerLevel == playersData.playerLevel && this.ping == playersData.ping;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.playerLevel)) * 31) + Integer.hashCode(this.ping);
    }

    @NotNull
    public String toString() {
        return "PlayersData(id=" + this.id + ", name=" + this.name + ", playerLevel=" + this.playerLevel + ", ping=" + this.ping + ")";
    }

    public PlayersData(int i, @NotNull String name, int i2, int i3) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = i;
        this.name = name;
        this.playerLevel = i2;
        this.ping = i3;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getPing() {
        return this.ping;
    }

    public final int getPlayerLevel() {
        return this.playerLevel;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setPing(int i) {
        this.ping = i;
    }

    public final void setPlayerLevel(int i) {
        this.playerLevel = i;
    }

    /* renamed from: isClicked, reason: from getter */
    public final boolean getIsClicked() {
        return this.isClicked;
    }

    public final void setClicked(boolean z) {
        this.isClicked = z;
    }
}
