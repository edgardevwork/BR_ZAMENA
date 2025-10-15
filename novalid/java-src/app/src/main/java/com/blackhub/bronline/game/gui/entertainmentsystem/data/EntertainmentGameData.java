package com.blackhub.bronline.game.gui.entertainmentsystem.data;

import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EntertainmentGameData.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003JO\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010#\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0011\"\u0004\b\u001a\u0010\u0018¨\u0006'"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/entertainmentsystem/data/EntertainmentGameData;", "", "id", "", "gamesName", "", "idIcon", CatchStreamerKeys.PLAYERS_KEY, "status", "description", "isClicked", "", "(ILjava/lang/String;IIILjava/lang/String;Z)V", "getDescription", "()Ljava/lang/String;", "getGamesName", "getId", "()I", "getIdIcon", "()Z", "setClicked", "(Z)V", "getPlayers", "setPlayers", "(I)V", "getStatus", "setStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EntertainmentGameData {
    public static final int $stable = 8;

    @NotNull
    public final String description;

    @NotNull
    public final String gamesName;
    public final int id;
    public final int idIcon;
    public boolean isClicked;
    public int players;
    public int status;

    public static /* synthetic */ EntertainmentGameData copy$default(EntertainmentGameData entertainmentGameData, int i, String str, int i2, int i3, int i4, String str2, boolean z, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = entertainmentGameData.id;
        }
        if ((i5 & 2) != 0) {
            str = entertainmentGameData.gamesName;
        }
        String str3 = str;
        if ((i5 & 4) != 0) {
            i2 = entertainmentGameData.idIcon;
        }
        int i6 = i2;
        if ((i5 & 8) != 0) {
            i3 = entertainmentGameData.players;
        }
        int i7 = i3;
        if ((i5 & 16) != 0) {
            i4 = entertainmentGameData.status;
        }
        int i8 = i4;
        if ((i5 & 32) != 0) {
            str2 = entertainmentGameData.description;
        }
        String str4 = str2;
        if ((i5 & 64) != 0) {
            z = entertainmentGameData.isClicked;
        }
        return entertainmentGameData.copy(i, str3, i6, i7, i8, str4, z);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getGamesName() {
        return this.gamesName;
    }

    /* renamed from: component3, reason: from getter */
    public final int getIdIcon() {
        return this.idIcon;
    }

    /* renamed from: component4, reason: from getter */
    public final int getPlayers() {
        return this.players;
    }

    /* renamed from: component5, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsClicked() {
        return this.isClicked;
    }

    @NotNull
    public final EntertainmentGameData copy(int id, @NotNull String gamesName, @DrawableRes int idIcon, int players, int status, @NotNull String description, boolean isClicked) {
        Intrinsics.checkNotNullParameter(gamesName, "gamesName");
        Intrinsics.checkNotNullParameter(description, "description");
        return new EntertainmentGameData(id, gamesName, idIcon, players, status, description, isClicked);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EntertainmentGameData)) {
            return false;
        }
        EntertainmentGameData entertainmentGameData = (EntertainmentGameData) other;
        return this.id == entertainmentGameData.id && Intrinsics.areEqual(this.gamesName, entertainmentGameData.gamesName) && this.idIcon == entertainmentGameData.idIcon && this.players == entertainmentGameData.players && this.status == entertainmentGameData.status && Intrinsics.areEqual(this.description, entertainmentGameData.description) && this.isClicked == entertainmentGameData.isClicked;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.id) * 31) + this.gamesName.hashCode()) * 31) + Integer.hashCode(this.idIcon)) * 31) + Integer.hashCode(this.players)) * 31) + Integer.hashCode(this.status)) * 31) + this.description.hashCode()) * 31) + Boolean.hashCode(this.isClicked);
    }

    @NotNull
    public String toString() {
        return "EntertainmentGameData(id=" + this.id + ", gamesName=" + this.gamesName + ", idIcon=" + this.idIcon + ", players=" + this.players + ", status=" + this.status + ", description=" + this.description + ", isClicked=" + this.isClicked + ")";
    }

    public EntertainmentGameData(int i, @NotNull String gamesName, @DrawableRes int i2, int i3, int i4, @NotNull String description, boolean z) {
        Intrinsics.checkNotNullParameter(gamesName, "gamesName");
        Intrinsics.checkNotNullParameter(description, "description");
        this.id = i;
        this.gamesName = gamesName;
        this.idIcon = i2;
        this.players = i3;
        this.status = i4;
        this.description = description;
        this.isClicked = z;
    }

    public /* synthetic */ EntertainmentGameData(int i, String str, int i2, int i3, int i4, String str2, boolean z, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, i2, i3, i4, str2, (i5 & 64) != 0 ? false : z);
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getGamesName() {
        return this.gamesName;
    }

    public final int getIdIcon() {
        return this.idIcon;
    }

    public final int getPlayers() {
        return this.players;
    }

    public final void setPlayers(int i) {
        this.players = i;
    }

    public final int getStatus() {
        return this.status;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final boolean isClicked() {
        return this.isClicked;
    }

    public final void setClicked(boolean z) {
        this.isClicked = z;
    }
}
