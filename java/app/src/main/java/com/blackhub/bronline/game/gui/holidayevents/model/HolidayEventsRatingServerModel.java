package com.blackhub.bronline.game.gui.holidayevents.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.fractions.Const;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HolidayEventsRatingServerModel.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class HolidayEventsRatingServerModel {
    public static final int $stable = 0;

    @SerializedName("n")
    @NotNull
    public final String nickname;

    @SerializedName("och")
    public final int points;

    public HolidayEventsRatingServerModel() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ HolidayEventsRatingServerModel copy$default(HolidayEventsRatingServerModel holidayEventsRatingServerModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = holidayEventsRatingServerModel.nickname;
        }
        if ((i2 & 2) != 0) {
            i = holidayEventsRatingServerModel.points;
        }
        return holidayEventsRatingServerModel.copy(str, i);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPoints() {
        return this.points;
    }

    @NotNull
    public final HolidayEventsRatingServerModel copy(@NotNull String nickname, int points) {
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        return new HolidayEventsRatingServerModel(nickname, points);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HolidayEventsRatingServerModel)) {
            return false;
        }
        HolidayEventsRatingServerModel holidayEventsRatingServerModel = (HolidayEventsRatingServerModel) other;
        return Intrinsics.areEqual(this.nickname, holidayEventsRatingServerModel.nickname) && this.points == holidayEventsRatingServerModel.points;
    }

    public int hashCode() {
        return (this.nickname.hashCode() * 31) + Integer.hashCode(this.points);
    }

    @NotNull
    public String toString() {
        return "HolidayEventsRatingServerModel(nickname=" + this.nickname + ", points=" + this.points + ")";
    }

    public HolidayEventsRatingServerModel(@NotNull String nickname, int i) {
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        this.nickname = nickname;
        this.points = i;
    }

    public /* synthetic */ HolidayEventsRatingServerModel(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i2 & 2) != 0 ? 0 : i);
    }

    @NotNull
    public final String getNickname() {
        return this.nickname;
    }

    public final int getPoints() {
        return this.points;
    }
}

