package com.blackhub.bronline.game.model.remote.response.holidayevents;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HolidayEventsLimitUpgrades.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class HolidayEventsLimitUpgrades {
    public static final int $stable = 0;

    @SerializedName("costSoft")
    @Nullable
    public final Integer costSoft;

    @SerializedName("eventResGift")
    @Nullable
    public final Integer eventResGift;

    @SerializedName("id")
    public final int id;

    @SerializedName("limitEventRes")
    public final int limitEventRes;

    @SerializedName("multEventRes")
    public final float multEventRes;

    public static /* synthetic */ HolidayEventsLimitUpgrades copy$default(HolidayEventsLimitUpgrades holidayEventsLimitUpgrades, int i, float f, int i2, Integer num, Integer num2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = holidayEventsLimitUpgrades.id;
        }
        if ((i3 & 2) != 0) {
            f = holidayEventsLimitUpgrades.multEventRes;
        }
        float f2 = f;
        if ((i3 & 4) != 0) {
            i2 = holidayEventsLimitUpgrades.limitEventRes;
        }
        int i4 = i2;
        if ((i3 & 8) != 0) {
            num = holidayEventsLimitUpgrades.costSoft;
        }
        Integer num3 = num;
        if ((i3 & 16) != 0) {
            num2 = holidayEventsLimitUpgrades.eventResGift;
        }
        return holidayEventsLimitUpgrades.copy(i, f2, i4, num3, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final float getMultEventRes() {
        return this.multEventRes;
    }

    /* renamed from: component3, reason: from getter */
    public final int getLimitEventRes() {
        return this.limitEventRes;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getCostSoft() {
        return this.costSoft;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getEventResGift() {
        return this.eventResGift;
    }

    @NotNull
    public final HolidayEventsLimitUpgrades copy(int id, float multEventRes, int limitEventRes, @Nullable Integer costSoft, @Nullable Integer eventResGift) {
        return new HolidayEventsLimitUpgrades(id, multEventRes, limitEventRes, costSoft, eventResGift);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HolidayEventsLimitUpgrades)) {
            return false;
        }
        HolidayEventsLimitUpgrades holidayEventsLimitUpgrades = (HolidayEventsLimitUpgrades) other;
        return this.id == holidayEventsLimitUpgrades.id && Float.compare(this.multEventRes, holidayEventsLimitUpgrades.multEventRes) == 0 && this.limitEventRes == holidayEventsLimitUpgrades.limitEventRes && Intrinsics.areEqual(this.costSoft, holidayEventsLimitUpgrades.costSoft) && Intrinsics.areEqual(this.eventResGift, holidayEventsLimitUpgrades.eventResGift);
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.id) * 31) + Float.hashCode(this.multEventRes)) * 31) + Integer.hashCode(this.limitEventRes)) * 31;
        Integer num = this.costSoft;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.eventResGift;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HolidayEventsLimitUpgrades(id=" + this.id + ", multEventRes=" + this.multEventRes + ", limitEventRes=" + this.limitEventRes + ", costSoft=" + this.costSoft + ", eventResGift=" + this.eventResGift + ")";
    }

    public HolidayEventsLimitUpgrades(int i, float f, int i2, @Nullable Integer num, @Nullable Integer num2) {
        this.id = i;
        this.multEventRes = f;
        this.limitEventRes = i2;
        this.costSoft = num;
        this.eventResGift = num2;
    }

    public /* synthetic */ HolidayEventsLimitUpgrades(int i, float f, int i2, Integer num, Integer num2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0.0f : f, (i3 & 4) != 0 ? 0 : i2, num, num2);
    }

    public final int getId() {
        return this.id;
    }

    public final float getMultEventRes() {
        return this.multEventRes;
    }

    public final int getLimitEventRes() {
        return this.limitEventRes;
    }

    @Nullable
    public final Integer getCostSoft() {
        return this.costSoft;
    }

    @Nullable
    public final Integer getEventResGift() {
        return this.eventResGift;
    }
}

