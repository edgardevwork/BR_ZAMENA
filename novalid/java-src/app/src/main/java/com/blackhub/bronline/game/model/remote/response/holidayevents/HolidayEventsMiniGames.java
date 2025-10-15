package com.blackhub.bronline.game.model.remote.response.holidayevents;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HolidayEventsMiniGames.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J8\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m7105d2 = {"Lcom/blackhub/bronline/game/model/remote/response/holidayevents/HolidayEventsMiniGames;", "", "id", "", "playable", "name", "", "imageName", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getImageName", "()Ljava/lang/String;", "getName", "getPlayable", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/blackhub/bronline/game/model/remote/response/holidayevents/HolidayEventsMiniGames;", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final /* data */ class HolidayEventsMiniGames {
    public static final int $stable = 0;

    @SerializedName("id")
    public final int id;

    @SerializedName("imageName")
    @NotNull
    public final String imageName;

    @SerializedName("name")
    @NotNull
    public final String name;

    @SerializedName("playable")
    @Nullable
    public final Integer playable;

    public static /* synthetic */ HolidayEventsMiniGames copy$default(HolidayEventsMiniGames holidayEventsMiniGames, int i, Integer num, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = holidayEventsMiniGames.id;
        }
        if ((i2 & 2) != 0) {
            num = holidayEventsMiniGames.playable;
        }
        if ((i2 & 4) != 0) {
            str = holidayEventsMiniGames.name;
        }
        if ((i2 & 8) != 0) {
            str2 = holidayEventsMiniGames.imageName;
        }
        return holidayEventsMiniGames.copy(i, num, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getPlayable() {
        return this.playable;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getImageName() {
        return this.imageName;
    }

    @NotNull
    public final HolidayEventsMiniGames copy(int id, @Nullable Integer playable, @NotNull String name, @NotNull String imageName) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        return new HolidayEventsMiniGames(id, playable, name, imageName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HolidayEventsMiniGames)) {
            return false;
        }
        HolidayEventsMiniGames holidayEventsMiniGames = (HolidayEventsMiniGames) other;
        return this.id == holidayEventsMiniGames.id && Intrinsics.areEqual(this.playable, holidayEventsMiniGames.playable) && Intrinsics.areEqual(this.name, holidayEventsMiniGames.name) && Intrinsics.areEqual(this.imageName, holidayEventsMiniGames.imageName);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        Integer num = this.playable;
        return ((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.name.hashCode()) * 31) + this.imageName.hashCode();
    }

    @NotNull
    public String toString() {
        return "HolidayEventsMiniGames(id=" + this.id + ", playable=" + this.playable + ", name=" + this.name + ", imageName=" + this.imageName + ")";
    }

    public HolidayEventsMiniGames(int i, @Nullable Integer num, @NotNull String name, @NotNull String imageName) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        this.id = i;
        this.playable = num;
        this.name = name;
        this.imageName = imageName;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final Integer getPlayable() {
        return this.playable;
    }

    public /* synthetic */ HolidayEventsMiniGames(int i, Integer num, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, num, (i2 & 4) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i2 & 8) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getImageName() {
        return this.imageName;
    }
}
