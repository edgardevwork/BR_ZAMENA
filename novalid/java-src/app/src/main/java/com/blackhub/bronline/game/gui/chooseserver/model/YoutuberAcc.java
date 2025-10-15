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
@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/chooseserver/model/YoutuberAcc;", "", Const.FRACTION_CONTROL_PLAYER_NICKNAME, "", "(Ljava/lang/String;)V", "getNickname", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
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
