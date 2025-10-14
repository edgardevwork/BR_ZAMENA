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

