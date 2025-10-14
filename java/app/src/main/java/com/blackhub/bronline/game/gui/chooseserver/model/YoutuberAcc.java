package com.blackhub.bronline.game.gui.chooseserver.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.gui.fractions.Const;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: YoutuberAcc.kt */
@StabilityInferred(parameters = 1)

public final /* data */ class YoutuberAcc {
    public static final int $stable = 0;

    @SerializedName(Const.FRACTION_CONTROL_PLAYER_NICKNAME)
    @NotNull
    public final String nickname;

    public static /* synthetic */ YoutuberAcc copy$default(YoutuberAcc youtuberAcc, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = youtuberAcc.nickname;
        }
        return youtuberAcc.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    @NotNull
    public final YoutuberAcc copy(@NotNull String nickname) {
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        return new YoutuberAcc(nickname);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof YoutuberAcc) && Intrinsics.areEqual(this.nickname, ((YoutuberAcc) other).nickname);
    }

    public int hashCode() {
        return this.nickname.hashCode();
    }

    @NotNull
    public String toString() {
        return "YoutuberAcc(nickname=" + this.nickname + ")";
    }

    public YoutuberAcc(@NotNull String nickname) {
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        this.nickname = nickname;
    }

    @NotNull
    public final String getNickname() {
        return this.nickname;
    }
}

