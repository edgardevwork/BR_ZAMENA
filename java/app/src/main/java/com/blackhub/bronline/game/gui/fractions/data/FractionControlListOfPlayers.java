package com.blackhub.bronline.game.gui.fractions.data;

import androidx.browser.customtabs.CustomTabsCallback;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.gui.fractions.Const;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FractionControlListOfPlayers.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class FractionControlListOfPlayers {
    public static final int $stable = 8;
    public final int id;
    public boolean isClicked;

    @NotNull
    public final String nickname;
    public int online;
    public int rank;

    public static /* synthetic */ FractionControlListOfPlayers copy$default(FractionControlListOfPlayers fractionControlListOfPlayers, int i, String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = fractionControlListOfPlayers.id;
        }
        if ((i4 & 2) != 0) {
            str = fractionControlListOfPlayers.nickname;
        }
        if ((i4 & 4) != 0) {
            i2 = fractionControlListOfPlayers.rank;
        }
        if ((i4 & 8) != 0) {
            i3 = fractionControlListOfPlayers.online;
        }
        return fractionControlListOfPlayers.copy(i, str, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* renamed from: component3, reason: from getter */
    public final int getRank() {
        return this.rank;
    }

    /* renamed from: component4, reason: from getter */
    public final int getOnline() {
        return this.online;
    }

    @NotNull
    public final FractionControlListOfPlayers copy(int id, @NotNull String nickname, int rank, int online) {
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        return new FractionControlListOfPlayers(id, nickname, rank, online);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FractionControlListOfPlayers)) {
            return false;
        }
        FractionControlListOfPlayers fractionControlListOfPlayers = (FractionControlListOfPlayers) other;
        return this.id == fractionControlListOfPlayers.id && Intrinsics.areEqual(this.nickname, fractionControlListOfPlayers.nickname) && this.rank == fractionControlListOfPlayers.rank && this.online == fractionControlListOfPlayers.online;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.id) * 31) + this.nickname.hashCode()) * 31) + Integer.hashCode(this.rank)) * 31) + Integer.hashCode(this.online);
    }

    @NotNull
    public String toString() {
        return "FractionControlListOfPlayers(id=" + this.id + ", nickname=" + this.nickname + ", rank=" + this.rank + ", online=" + this.online + ")";
    }

    public FractionControlListOfPlayers(int i, @NotNull String nickname, int i2, int i3) {
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        this.id = i;
        this.nickname = nickname;
        this.rank = i2;
        this.online = i3;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getNickname() {
        return this.nickname;
    }

    public final int getRank() {
        return this.rank;
    }

    public final void setRank(int i) {
        this.rank = i;
    }

    public final int getOnline() {
        return this.online;
    }

    public final void setOnline(int i) {
        this.online = i;
    }

    /* renamed from: isClicked, reason: from getter */
    public final boolean getIsClicked() {
        return this.isClicked;
    }

    public final void setClicked(boolean z) {
        this.isClicked = z;
    }
}

