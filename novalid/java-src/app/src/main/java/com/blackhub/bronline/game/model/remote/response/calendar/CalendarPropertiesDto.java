package com.blackhub.bronline.game.model.remote.response.calendar;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.constants.Other;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.apache.commons.compress.archivers.zip.UnixStat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CalendarPropertiesDto.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\u0081\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0005HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012¨\u00061"}, m7105d2 = {"Lcom/blackhub/bronline/game/model/remote/response/calendar/CalendarPropertiesDto;", "", "seasonColor", "", "seasonDays", "", "seasonName", "daysColorOne", "daysColorTwo", "bgSeasonCalendar", "icSeasonCalendar", "returnName", "returnDays", "returnSubtitle", "bgComeBackCalendar", "icComeBackCalendar", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBgComeBackCalendar", "()Ljava/lang/String;", "getBgSeasonCalendar", "getDaysColorOne", "getDaysColorTwo", "getIcComeBackCalendar", "getIcSeasonCalendar", "getReturnDays", "()I", "getReturnName", "getReturnSubtitle", "getSeasonColor", "getSeasonDays", "getSeasonName", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CalendarPropertiesDto {
    public static final int $stable = 0;

    @SerializedName("bg_return_calendar")
    @NotNull
    public final String bgComeBackCalendar;

    @SerializedName("bg_season_calendar")
    @NotNull
    public final String bgSeasonCalendar;

    @SerializedName("days_color_one")
    @NotNull
    public final String daysColorOne;

    @SerializedName("days_color_two")
    @NotNull
    public final String daysColorTwo;

    @SerializedName("ic_return_calendar")
    @NotNull
    public final String icComeBackCalendar;

    @SerializedName("ic_season_calendar")
    @NotNull
    public final String icSeasonCalendar;

    @SerializedName("return_days")
    public final int returnDays;

    @SerializedName("return_name")
    @NotNull
    public final String returnName;

    @SerializedName("return_subtitle")
    @NotNull
    public final String returnSubtitle;

    @SerializedName("season_color")
    @NotNull
    public final String seasonColor;

    @SerializedName("season_days")
    public final int seasonDays;

    @SerializedName("season_name")
    @NotNull
    public final String seasonName;

    public CalendarPropertiesDto() {
        this(null, 0, null, null, null, null, null, null, 0, null, null, null, UnixStat.PERM_MASK, null);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSeasonColor() {
        return this.seasonColor;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getReturnSubtitle() {
        return this.returnSubtitle;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final String getBgComeBackCalendar() {
        return this.bgComeBackCalendar;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final String getIcComeBackCalendar() {
        return this.icComeBackCalendar;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSeasonDays() {
        return this.seasonDays;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSeasonName() {
        return this.seasonName;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getDaysColorOne() {
        return this.daysColorOne;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getDaysColorTwo() {
        return this.daysColorTwo;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getBgSeasonCalendar() {
        return this.bgSeasonCalendar;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getIcSeasonCalendar() {
        return this.icSeasonCalendar;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getReturnName() {
        return this.returnName;
    }

    /* renamed from: component9, reason: from getter */
    public final int getReturnDays() {
        return this.returnDays;
    }

    @NotNull
    public final CalendarPropertiesDto copy(@NotNull String seasonColor, int seasonDays, @NotNull String seasonName, @NotNull String daysColorOne, @NotNull String daysColorTwo, @NotNull String bgSeasonCalendar, @NotNull String icSeasonCalendar, @NotNull String returnName, int returnDays, @NotNull String returnSubtitle, @NotNull String bgComeBackCalendar, @NotNull String icComeBackCalendar) {
        Intrinsics.checkNotNullParameter(seasonColor, "seasonColor");
        Intrinsics.checkNotNullParameter(seasonName, "seasonName");
        Intrinsics.checkNotNullParameter(daysColorOne, "daysColorOne");
        Intrinsics.checkNotNullParameter(daysColorTwo, "daysColorTwo");
        Intrinsics.checkNotNullParameter(bgSeasonCalendar, "bgSeasonCalendar");
        Intrinsics.checkNotNullParameter(icSeasonCalendar, "icSeasonCalendar");
        Intrinsics.checkNotNullParameter(returnName, "returnName");
        Intrinsics.checkNotNullParameter(returnSubtitle, "returnSubtitle");
        Intrinsics.checkNotNullParameter(bgComeBackCalendar, "bgComeBackCalendar");
        Intrinsics.checkNotNullParameter(icComeBackCalendar, "icComeBackCalendar");
        return new CalendarPropertiesDto(seasonColor, seasonDays, seasonName, daysColorOne, daysColorTwo, bgSeasonCalendar, icSeasonCalendar, returnName, returnDays, returnSubtitle, bgComeBackCalendar, icComeBackCalendar);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalendarPropertiesDto)) {
            return false;
        }
        CalendarPropertiesDto calendarPropertiesDto = (CalendarPropertiesDto) other;
        return Intrinsics.areEqual(this.seasonColor, calendarPropertiesDto.seasonColor) && this.seasonDays == calendarPropertiesDto.seasonDays && Intrinsics.areEqual(this.seasonName, calendarPropertiesDto.seasonName) && Intrinsics.areEqual(this.daysColorOne, calendarPropertiesDto.daysColorOne) && Intrinsics.areEqual(this.daysColorTwo, calendarPropertiesDto.daysColorTwo) && Intrinsics.areEqual(this.bgSeasonCalendar, calendarPropertiesDto.bgSeasonCalendar) && Intrinsics.areEqual(this.icSeasonCalendar, calendarPropertiesDto.icSeasonCalendar) && Intrinsics.areEqual(this.returnName, calendarPropertiesDto.returnName) && this.returnDays == calendarPropertiesDto.returnDays && Intrinsics.areEqual(this.returnSubtitle, calendarPropertiesDto.returnSubtitle) && Intrinsics.areEqual(this.bgComeBackCalendar, calendarPropertiesDto.bgComeBackCalendar) && Intrinsics.areEqual(this.icComeBackCalendar, calendarPropertiesDto.icComeBackCalendar);
    }

    public int hashCode() {
        return (((((((((((((((((((((this.seasonColor.hashCode() * 31) + Integer.hashCode(this.seasonDays)) * 31) + this.seasonName.hashCode()) * 31) + this.daysColorOne.hashCode()) * 31) + this.daysColorTwo.hashCode()) * 31) + this.bgSeasonCalendar.hashCode()) * 31) + this.icSeasonCalendar.hashCode()) * 31) + this.returnName.hashCode()) * 31) + Integer.hashCode(this.returnDays)) * 31) + this.returnSubtitle.hashCode()) * 31) + this.bgComeBackCalendar.hashCode()) * 31) + this.icComeBackCalendar.hashCode();
    }

    @NotNull
    public String toString() {
        return "CalendarPropertiesDto(seasonColor=" + this.seasonColor + ", seasonDays=" + this.seasonDays + ", seasonName=" + this.seasonName + ", daysColorOne=" + this.daysColorOne + ", daysColorTwo=" + this.daysColorTwo + ", bgSeasonCalendar=" + this.bgSeasonCalendar + ", icSeasonCalendar=" + this.icSeasonCalendar + ", returnName=" + this.returnName + ", returnDays=" + this.returnDays + ", returnSubtitle=" + this.returnSubtitle + ", bgComeBackCalendar=" + this.bgComeBackCalendar + ", icComeBackCalendar=" + this.icComeBackCalendar + ")";
    }

    public CalendarPropertiesDto(@NotNull String seasonColor, int i, @NotNull String seasonName, @NotNull String daysColorOne, @NotNull String daysColorTwo, @NotNull String bgSeasonCalendar, @NotNull String icSeasonCalendar, @NotNull String returnName, int i2, @NotNull String returnSubtitle, @NotNull String bgComeBackCalendar, @NotNull String icComeBackCalendar) {
        Intrinsics.checkNotNullParameter(seasonColor, "seasonColor");
        Intrinsics.checkNotNullParameter(seasonName, "seasonName");
        Intrinsics.checkNotNullParameter(daysColorOne, "daysColorOne");
        Intrinsics.checkNotNullParameter(daysColorTwo, "daysColorTwo");
        Intrinsics.checkNotNullParameter(bgSeasonCalendar, "bgSeasonCalendar");
        Intrinsics.checkNotNullParameter(icSeasonCalendar, "icSeasonCalendar");
        Intrinsics.checkNotNullParameter(returnName, "returnName");
        Intrinsics.checkNotNullParameter(returnSubtitle, "returnSubtitle");
        Intrinsics.checkNotNullParameter(bgComeBackCalendar, "bgComeBackCalendar");
        Intrinsics.checkNotNullParameter(icComeBackCalendar, "icComeBackCalendar");
        this.seasonColor = seasonColor;
        this.seasonDays = i;
        this.seasonName = seasonName;
        this.daysColorOne = daysColorOne;
        this.daysColorTwo = daysColorTwo;
        this.bgSeasonCalendar = bgSeasonCalendar;
        this.icSeasonCalendar = icSeasonCalendar;
        this.returnName = returnName;
        this.returnDays = i2;
        this.returnSubtitle = returnSubtitle;
        this.bgComeBackCalendar = bgComeBackCalendar;
        this.icComeBackCalendar = icComeBackCalendar;
    }

    public /* synthetic */ CalendarPropertiesDto(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, int i2, String str8, String str9, String str10, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? Other.COLOR_DEFAULT_STRING : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i3 & 8) != 0 ? Other.COLOR_DEFAULT_STRING : str3, (i3 & 16) == 0 ? str4 : Other.COLOR_DEFAULT_STRING, (i3 & 32) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str5, (i3 & 64) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str6, (i3 & 128) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str7, (i3 & 256) == 0 ? i2 : 0, (i3 & 512) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str8, (i3 & 1024) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str9, (i3 & 2048) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str10);
    }

    @NotNull
    public final String getSeasonColor() {
        return this.seasonColor;
    }

    public final int getSeasonDays() {
        return this.seasonDays;
    }

    @NotNull
    public final String getSeasonName() {
        return this.seasonName;
    }

    @NotNull
    public final String getDaysColorOne() {
        return this.daysColorOne;
    }

    @NotNull
    public final String getDaysColorTwo() {
        return this.daysColorTwo;
    }

    @NotNull
    public final String getBgSeasonCalendar() {
        return this.bgSeasonCalendar;
    }

    @NotNull
    public final String getIcSeasonCalendar() {
        return this.icSeasonCalendar;
    }

    @NotNull
    public final String getReturnName() {
        return this.returnName;
    }

    public final int getReturnDays() {
        return this.returnDays;
    }

    @NotNull
    public final String getReturnSubtitle() {
        return this.returnSubtitle;
    }

    @NotNull
    public final String getBgComeBackCalendar() {
        return this.bgComeBackCalendar;
    }

    @NotNull
    public final String getIcComeBackCalendar() {
        return this.icComeBackCalendar;
    }
}
