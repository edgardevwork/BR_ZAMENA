package com.blackhub.bronline.game.gui.entertainmentsystem.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.gui.playerslist.utils.PlayersListUtilsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NickAndTopPosAndGamePointerForCurrentPlayer.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006\u001c"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/entertainmentsystem/data/NickAndTopPosAndGamePointerForCurrentPlayer;", "", PlayersListUtilsKt.KEY_GET_PLAYER_NICK, "", "topPos", "", "", "gamePointer", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getGamePointer", "()Ljava/util/List;", "setGamePointer", "(Ljava/util/List;)V", "getNick", "()Ljava/lang/String;", "setNick", "(Ljava/lang/String;)V", "getTopPos", "setTopPos", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class NickAndTopPosAndGamePointerForCurrentPlayer {
    public static final int $stable = 8;

    @NotNull
    public List<Integer> gamePointer;

    @NotNull
    public String nick;

    @NotNull
    public List<Integer> topPos;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NickAndTopPosAndGamePointerForCurrentPlayer copy$default(NickAndTopPosAndGamePointerForCurrentPlayer nickAndTopPosAndGamePointerForCurrentPlayer, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nickAndTopPosAndGamePointerForCurrentPlayer.nick;
        }
        if ((i & 2) != 0) {
            list = nickAndTopPosAndGamePointerForCurrentPlayer.topPos;
        }
        if ((i & 4) != 0) {
            list2 = nickAndTopPosAndGamePointerForCurrentPlayer.gamePointer;
        }
        return nickAndTopPosAndGamePointerForCurrentPlayer.copy(str, list, list2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getNick() {
        return this.nick;
    }

    @NotNull
    public final List<Integer> component2() {
        return this.topPos;
    }

    @NotNull
    public final List<Integer> component3() {
        return this.gamePointer;
    }

    @NotNull
    public final NickAndTopPosAndGamePointerForCurrentPlayer copy(@NotNull String nick, @NotNull List<Integer> topPos, @NotNull List<Integer> gamePointer) {
        Intrinsics.checkNotNullParameter(nick, "nick");
        Intrinsics.checkNotNullParameter(topPos, "topPos");
        Intrinsics.checkNotNullParameter(gamePointer, "gamePointer");
        return new NickAndTopPosAndGamePointerForCurrentPlayer(nick, topPos, gamePointer);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NickAndTopPosAndGamePointerForCurrentPlayer)) {
            return false;
        }
        NickAndTopPosAndGamePointerForCurrentPlayer nickAndTopPosAndGamePointerForCurrentPlayer = (NickAndTopPosAndGamePointerForCurrentPlayer) other;
        return Intrinsics.areEqual(this.nick, nickAndTopPosAndGamePointerForCurrentPlayer.nick) && Intrinsics.areEqual(this.topPos, nickAndTopPosAndGamePointerForCurrentPlayer.topPos) && Intrinsics.areEqual(this.gamePointer, nickAndTopPosAndGamePointerForCurrentPlayer.gamePointer);
    }

    public int hashCode() {
        return (((this.nick.hashCode() * 31) + this.topPos.hashCode()) * 31) + this.gamePointer.hashCode();
    }

    @NotNull
    public String toString() {
        return "NickAndTopPosAndGamePointerForCurrentPlayer(nick=" + this.nick + ", topPos=" + this.topPos + ", gamePointer=" + this.gamePointer + ")";
    }

    public NickAndTopPosAndGamePointerForCurrentPlayer(@NotNull String nick, @NotNull List<Integer> topPos, @NotNull List<Integer> gamePointer) {
        Intrinsics.checkNotNullParameter(nick, "nick");
        Intrinsics.checkNotNullParameter(topPos, "topPos");
        Intrinsics.checkNotNullParameter(gamePointer, "gamePointer");
        this.nick = nick;
        this.topPos = topPos;
        this.gamePointer = gamePointer;
    }

    @NotNull
    public final String getNick() {
        return this.nick;
    }

    public final void setNick(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nick = str;
    }

    @NotNull
    public final List<Integer> getTopPos() {
        return this.topPos;
    }

    public final void setTopPos(@NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.topPos = list;
    }

    @NotNull
    public final List<Integer> getGamePointer() {
        return this.gamePointer;
    }

    public final void setGamePointer(@NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.gamePointer = list;
    }
}
