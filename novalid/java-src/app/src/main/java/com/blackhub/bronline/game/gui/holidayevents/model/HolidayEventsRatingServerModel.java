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
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/holidayevents/model/HolidayEventsRatingServerModel;", "", Const.FRACTION_CONTROL_PLAYER_NICKNAME, "", "points", "", "(Ljava/lang/String;I)V", "getNickname", "()Ljava/lang/String;", "getPoints", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
