package com.blackhub.bronline.game.gui.fractions.data;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.gui.fractions.Const;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FractionControlPlayerInfo.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003JO\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0005HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000e\"\u0004\b\u001b\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000e¨\u0006*"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/fractions/data/FractionControlPlayerInfo;", "", Const.FRACTION_CONTROL_PLAYER_NICKNAME, "", "skinId", "", "level", "rankName", Const.FRACTION_CONTROL_PLAYER_RANK, Const.FRACTION_CONTROL_PLAYER_REPRIMAND, HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "(Ljava/lang/String;IILjava/lang/String;IILjava/lang/String;)V", "id", "getId", "()I", "setId", "(I)V", "getLevel", "getNickname", "()Ljava/lang/String;", "setNickname", "(Ljava/lang/String;)V", "getPhoneNumber", "getRank", "setRank", "getRankName", "getReprimand", "setReprimand", "getSkinId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FractionControlPlayerInfo {
    public static final int $stable = 8;
    public int id;
    public final int level;

    @NotNull
    public String nickname;

    @NotNull
    public final String phoneNumber;
    public int rank;

    @NotNull
    public final String rankName;
    public int reprimand;
    public final int skinId;

    public static /* synthetic */ FractionControlPlayerInfo copy$default(FractionControlPlayerInfo fractionControlPlayerInfo, String str, int i, int i2, String str2, int i3, int i4, String str3, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = fractionControlPlayerInfo.nickname;
        }
        if ((i5 & 2) != 0) {
            i = fractionControlPlayerInfo.skinId;
        }
        int i6 = i;
        if ((i5 & 4) != 0) {
            i2 = fractionControlPlayerInfo.level;
        }
        int i7 = i2;
        if ((i5 & 8) != 0) {
            str2 = fractionControlPlayerInfo.rankName;
        }
        String str4 = str2;
        if ((i5 & 16) != 0) {
            i3 = fractionControlPlayerInfo.rank;
        }
        int i8 = i3;
        if ((i5 & 32) != 0) {
            i4 = fractionControlPlayerInfo.reprimand;
        }
        int i9 = i4;
        if ((i5 & 64) != 0) {
            str3 = fractionControlPlayerInfo.phoneNumber;
        }
        return fractionControlPlayerInfo.copy(str, i6, i7, str4, i8, i9, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSkinId() {
        return this.skinId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getRankName() {
        return this.rankName;
    }

    /* renamed from: component5, reason: from getter */
    public final int getRank() {
        return this.rank;
    }

    /* renamed from: component6, reason: from getter */
    public final int getReprimand() {
        return this.reprimand;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @NotNull
    public final FractionControlPlayerInfo copy(@NotNull String nickname, int skinId, int level, @NotNull String rankName, int rank, int reprimand, @NotNull String phoneNumber) {
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(rankName, "rankName");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        return new FractionControlPlayerInfo(nickname, skinId, level, rankName, rank, reprimand, phoneNumber);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FractionControlPlayerInfo)) {
            return false;
        }
        FractionControlPlayerInfo fractionControlPlayerInfo = (FractionControlPlayerInfo) other;
        return Intrinsics.areEqual(this.nickname, fractionControlPlayerInfo.nickname) && this.skinId == fractionControlPlayerInfo.skinId && this.level == fractionControlPlayerInfo.level && Intrinsics.areEqual(this.rankName, fractionControlPlayerInfo.rankName) && this.rank == fractionControlPlayerInfo.rank && this.reprimand == fractionControlPlayerInfo.reprimand && Intrinsics.areEqual(this.phoneNumber, fractionControlPlayerInfo.phoneNumber);
    }

    public int hashCode() {
        return (((((((((((this.nickname.hashCode() * 31) + Integer.hashCode(this.skinId)) * 31) + Integer.hashCode(this.level)) * 31) + this.rankName.hashCode()) * 31) + Integer.hashCode(this.rank)) * 31) + Integer.hashCode(this.reprimand)) * 31) + this.phoneNumber.hashCode();
    }

    @NotNull
    public String toString() {
        return "FractionControlPlayerInfo(nickname=" + this.nickname + ", skinId=" + this.skinId + ", level=" + this.level + ", rankName=" + this.rankName + ", rank=" + this.rank + ", reprimand=" + this.reprimand + ", phoneNumber=" + this.phoneNumber + ")";
    }

    public FractionControlPlayerInfo(@NotNull String nickname, int i, int i2, @NotNull String rankName, int i3, int i4, @NotNull String phoneNumber) {
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(rankName, "rankName");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        this.nickname = nickname;
        this.skinId = i;
        this.level = i2;
        this.rankName = rankName;
        this.rank = i3;
        this.reprimand = i4;
        this.phoneNumber = phoneNumber;
        this.id = -1;
    }

    @NotNull
    public final String getNickname() {
        return this.nickname;
    }

    public final void setNickname(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nickname = str;
    }

    public final int getSkinId() {
        return this.skinId;
    }

    public final int getLevel() {
        return this.level;
    }

    @NotNull
    public final String getRankName() {
        return this.rankName;
    }

    public final int getRank() {
        return this.rank;
    }

    public final void setRank(int i) {
        this.rank = i;
    }

    public final int getReprimand() {
        return this.reprimand;
    }

    public final void setReprimand(int i) {
        this.reprimand = i;
    }

    @NotNull
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final int getId() {
        return this.id;
    }

    public final void setId(int i) {
        this.id = i;
    }
}
