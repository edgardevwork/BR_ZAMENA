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

