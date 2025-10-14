package com.blackhub.bronline.game.gui.playerslist.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.gui.playerslist.utils.PlayersListUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PlayersData.kt */
@StabilityInferred(parameters = 0)
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

