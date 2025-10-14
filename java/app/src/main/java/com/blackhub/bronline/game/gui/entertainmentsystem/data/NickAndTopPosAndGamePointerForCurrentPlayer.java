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

