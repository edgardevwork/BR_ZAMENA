package com.blackhub.bronline.game.model.remote.response.calendar;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.archivers.zip.UnixStat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CalendarResponse.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J\u007f\u0010\u001d\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006%"}, m7105d2 = {"Lcom/blackhub/bronline/game/model/remote/response/calendar/CalendarResponse;", "", "bonusDays", "", "Lcom/blackhub/bronline/game/model/remote/response/calendar/CalendarRewardsDto;", "bonusDaysStore", "mainDays", "comeBackMainDays", "comeBackBonusDays", "mainDaysStore", "properties", "Lcom/blackhub/bronline/game/model/remote/response/calendar/CalendarPropertiesDto;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/blackhub/bronline/game/model/remote/response/calendar/CalendarPropertiesDto;)V", "getBonusDays", "()Ljava/util/List;", "getBonusDaysStore", "getComeBackBonusDays", "getComeBackMainDays", "getMainDays", "getMainDaysStore", "getProperties", "()Lcom/blackhub/bronline/game/model/remote/response/calendar/CalendarPropertiesDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CalendarResponse {
    public static final int $stable = 8;

    @SerializedName("bonus_days")
    @Nullable
    public final List<CalendarRewardsDto> bonusDays;

    @SerializedName("bonus_days_store")
    @Nullable
    public final List<CalendarRewardsDto> bonusDaysStore;

    @SerializedName("returnBonus_Days")
    @Nullable
    public final List<CalendarRewardsDto> comeBackBonusDays;

    @SerializedName("returnMain_Days")
    @Nullable
    public final List<CalendarRewardsDto> comeBackMainDays;

    @SerializedName("main_days")
    @Nullable
    public final List<CalendarRewardsDto> mainDays;

    @SerializedName("main_days_store")
    @Nullable
    public final List<CalendarRewardsDto> mainDaysStore;

    @SerializedName("properties")
    @NotNull
    public final CalendarPropertiesDto properties;

    public CalendarResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ CalendarResponse copy$default(CalendarResponse calendarResponse, List list, List list2, List list3, List list4, List list5, List list6, CalendarPropertiesDto calendarPropertiesDto, int i, Object obj) {
        if ((i & 1) != 0) {
            list = calendarResponse.bonusDays;
        }
        if ((i & 2) != 0) {
            list2 = calendarResponse.bonusDaysStore;
        }
        List list7 = list2;
        if ((i & 4) != 0) {
            list3 = calendarResponse.mainDays;
        }
        List list8 = list3;
        if ((i & 8) != 0) {
            list4 = calendarResponse.comeBackMainDays;
        }
        List list9 = list4;
        if ((i & 16) != 0) {
            list5 = calendarResponse.comeBackBonusDays;
        }
        List list10 = list5;
        if ((i & 32) != 0) {
            list6 = calendarResponse.mainDaysStore;
        }
        List list11 = list6;
        if ((i & 64) != 0) {
            calendarPropertiesDto = calendarResponse.properties;
        }
        return calendarResponse.copy(list, list7, list8, list9, list10, list11, calendarPropertiesDto);
    }

    @Nullable
    public final List<CalendarRewardsDto> component1() {
        return this.bonusDays;
    }

    @Nullable
    public final List<CalendarRewardsDto> component2() {
        return this.bonusDaysStore;
    }

    @Nullable
    public final List<CalendarRewardsDto> component3() {
        return this.mainDays;
    }

    @Nullable
    public final List<CalendarRewardsDto> component4() {
        return this.comeBackMainDays;
    }

    @Nullable
    public final List<CalendarRewardsDto> component5() {
        return this.comeBackBonusDays;
    }

    @Nullable
    public final List<CalendarRewardsDto> component6() {
        return this.mainDaysStore;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final CalendarPropertiesDto getProperties() {
        return this.properties;
    }

    @NotNull
    public final CalendarResponse copy(@Nullable List<CalendarRewardsDto> bonusDays, @Nullable List<CalendarRewardsDto> bonusDaysStore, @Nullable List<CalendarRewardsDto> mainDays, @Nullable List<CalendarRewardsDto> comeBackMainDays, @Nullable List<CalendarRewardsDto> comeBackBonusDays, @Nullable List<CalendarRewardsDto> mainDaysStore, @NotNull CalendarPropertiesDto properties) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        return new CalendarResponse(bonusDays, bonusDaysStore, mainDays, comeBackMainDays, comeBackBonusDays, mainDaysStore, properties);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalendarResponse)) {
            return false;
        }
        CalendarResponse calendarResponse = (CalendarResponse) other;
        return Intrinsics.areEqual(this.bonusDays, calendarResponse.bonusDays) && Intrinsics.areEqual(this.bonusDaysStore, calendarResponse.bonusDaysStore) && Intrinsics.areEqual(this.mainDays, calendarResponse.mainDays) && Intrinsics.areEqual(this.comeBackMainDays, calendarResponse.comeBackMainDays) && Intrinsics.areEqual(this.comeBackBonusDays, calendarResponse.comeBackBonusDays) && Intrinsics.areEqual(this.mainDaysStore, calendarResponse.mainDaysStore) && Intrinsics.areEqual(this.properties, calendarResponse.properties);
    }

    public int hashCode() {
        List<CalendarRewardsDto> list = this.bonusDays;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<CalendarRewardsDto> list2 = this.bonusDaysStore;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<CalendarRewardsDto> list3 = this.mainDays;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<CalendarRewardsDto> list4 = this.comeBackMainDays;
        int iHashCode4 = (iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<CalendarRewardsDto> list5 = this.comeBackBonusDays;
        int iHashCode5 = (iHashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<CalendarRewardsDto> list6 = this.mainDaysStore;
        return ((iHashCode5 + (list6 != null ? list6.hashCode() : 0)) * 31) + this.properties.hashCode();
    }

    @NotNull
    public String toString() {
        return "CalendarResponse(bonusDays=" + this.bonusDays + ", bonusDaysStore=" + this.bonusDaysStore + ", mainDays=" + this.mainDays + ", comeBackMainDays=" + this.comeBackMainDays + ", comeBackBonusDays=" + this.comeBackBonusDays + ", mainDaysStore=" + this.mainDaysStore + ", properties=" + this.properties + ")";
    }

    public CalendarResponse(@Nullable List<CalendarRewardsDto> list, @Nullable List<CalendarRewardsDto> list2, @Nullable List<CalendarRewardsDto> list3, @Nullable List<CalendarRewardsDto> list4, @Nullable List<CalendarRewardsDto> list5, @Nullable List<CalendarRewardsDto> list6, @NotNull CalendarPropertiesDto properties) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        this.bonusDays = list;
        this.bonusDaysStore = list2;
        this.mainDays = list3;
        this.comeBackMainDays = list4;
        this.comeBackBonusDays = list5;
        this.mainDaysStore = list6;
        this.properties = properties;
    }

    @Nullable
    public final List<CalendarRewardsDto> getBonusDays() {
        return this.bonusDays;
    }

    @Nullable
    public final List<CalendarRewardsDto> getBonusDaysStore() {
        return this.bonusDaysStore;
    }

    @Nullable
    public final List<CalendarRewardsDto> getMainDays() {
        return this.mainDays;
    }

    @Nullable
    public final List<CalendarRewardsDto> getComeBackMainDays() {
        return this.comeBackMainDays;
    }

    @Nullable
    public final List<CalendarRewardsDto> getComeBackBonusDays() {
        return this.comeBackBonusDays;
    }

    @Nullable
    public final List<CalendarRewardsDto> getMainDaysStore() {
        return this.mainDaysStore;
    }

    public /* synthetic */ CalendarResponse(List list, List list2, List list3, List list4, List list5, List list6, CalendarPropertiesDto calendarPropertiesDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4, (i & 16) != 0 ? null : list5, (i & 32) == 0 ? list6 : null, (i & 64) != 0 ? new CalendarPropertiesDto(null, 0, null, null, null, null, null, null, 0, null, null, null, UnixStat.PERM_MASK, null) : calendarPropertiesDto);
    }

    @NotNull
    public final CalendarPropertiesDto getProperties() {
        return this.properties;
    }
}
