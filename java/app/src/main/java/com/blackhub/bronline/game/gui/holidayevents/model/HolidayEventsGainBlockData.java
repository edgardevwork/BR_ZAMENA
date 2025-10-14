package com.blackhub.bronline.game.gui.holidayevents.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HolidayEventsGainBlockData.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class HolidayEventsGainBlockData {
    public static final int $stable = 0;

    @NotNull
    public final String buttonPrice;
    public final int eventResGift;

    @NotNull
    public final String textCurrentValueCoefficient;

    @NotNull
    public final String textCurrentValueDayLimit;

    @NotNull
    public final String textNextLvlValueCoefficient;

    @NotNull
    public final String textNextLvlValueDayLimit;

    public HolidayEventsGainBlockData() {
        this(null, null, null, null, null, 0, 63, null);
    }

    public static /* synthetic */ HolidayEventsGainBlockData copy$default(HolidayEventsGainBlockData holidayEventsGainBlockData, String str, String str2, String str3, String str4, String str5, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = holidayEventsGainBlockData.textCurrentValueDayLimit;
        }
        if ((i2 & 2) != 0) {
            str2 = holidayEventsGainBlockData.textCurrentValueCoefficient;
        }
        String str6 = str2;
        if ((i2 & 4) != 0) {
            str3 = holidayEventsGainBlockData.textNextLvlValueDayLimit;
        }
        String str7 = str3;
        if ((i2 & 8) != 0) {
            str4 = holidayEventsGainBlockData.textNextLvlValueCoefficient;
        }
        String str8 = str4;
        if ((i2 & 16) != 0) {
            str5 = holidayEventsGainBlockData.buttonPrice;
        }
        String str9 = str5;
        if ((i2 & 32) != 0) {
            i = holidayEventsGainBlockData.eventResGift;
        }
        return holidayEventsGainBlockData.copy(str, str6, str7, str8, str9, i);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTextCurrentValueDayLimit() {
        return this.textCurrentValueDayLimit;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTextCurrentValueCoefficient() {
        return this.textCurrentValueCoefficient;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTextNextLvlValueDayLimit() {
        return this.textNextLvlValueDayLimit;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getTextNextLvlValueCoefficient() {
        return this.textNextLvlValueCoefficient;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getButtonPrice() {
        return this.buttonPrice;
    }

    /* renamed from: component6, reason: from getter */
    public final int getEventResGift() {
        return this.eventResGift;
    }

    @NotNull
    public final HolidayEventsGainBlockData copy(@NotNull String textCurrentValueDayLimit, @NotNull String textCurrentValueCoefficient, @NotNull String textNextLvlValueDayLimit, @NotNull String textNextLvlValueCoefficient, @NotNull String buttonPrice, int eventResGift) {
        Intrinsics.checkNotNullParameter(textCurrentValueDayLimit, "textCurrentValueDayLimit");
        Intrinsics.checkNotNullParameter(textCurrentValueCoefficient, "textCurrentValueCoefficient");
        Intrinsics.checkNotNullParameter(textNextLvlValueDayLimit, "textNextLvlValueDayLimit");
        Intrinsics.checkNotNullParameter(textNextLvlValueCoefficient, "textNextLvlValueCoefficient");
        Intrinsics.checkNotNullParameter(buttonPrice, "buttonPrice");
        return new HolidayEventsGainBlockData(textCurrentValueDayLimit, textCurrentValueCoefficient, textNextLvlValueDayLimit, textNextLvlValueCoefficient, buttonPrice, eventResGift);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HolidayEventsGainBlockData)) {
            return false;
        }
        HolidayEventsGainBlockData holidayEventsGainBlockData = (HolidayEventsGainBlockData) other;
        return Intrinsics.areEqual(this.textCurrentValueDayLimit, holidayEventsGainBlockData.textCurrentValueDayLimit) && Intrinsics.areEqual(this.textCurrentValueCoefficient, holidayEventsGainBlockData.textCurrentValueCoefficient) && Intrinsics.areEqual(this.textNextLvlValueDayLimit, holidayEventsGainBlockData.textNextLvlValueDayLimit) && Intrinsics.areEqual(this.textNextLvlValueCoefficient, holidayEventsGainBlockData.textNextLvlValueCoefficient) && Intrinsics.areEqual(this.buttonPrice, holidayEventsGainBlockData.buttonPrice) && this.eventResGift == holidayEventsGainBlockData.eventResGift;
    }

    public int hashCode() {
        return (((((((((this.textCurrentValueDayLimit.hashCode() * 31) + this.textCurrentValueCoefficient.hashCode()) * 31) + this.textNextLvlValueDayLimit.hashCode()) * 31) + this.textNextLvlValueCoefficient.hashCode()) * 31) + this.buttonPrice.hashCode()) * 31) + Integer.hashCode(this.eventResGift);
    }

    @NotNull
    public String toString() {
        return "HolidayEventsGainBlockData(textCurrentValueDayLimit=" + this.textCurrentValueDayLimit + ", textCurrentValueCoefficient=" + this.textCurrentValueCoefficient + ", textNextLvlValueDayLimit=" + this.textNextLvlValueDayLimit + ", textNextLvlValueCoefficient=" + this.textNextLvlValueCoefficient + ", buttonPrice=" + this.buttonPrice + ", eventResGift=" + this.eventResGift + ")";
    }

    public HolidayEventsGainBlockData(@NotNull String textCurrentValueDayLimit, @NotNull String textCurrentValueCoefficient, @NotNull String textNextLvlValueDayLimit, @NotNull String textNextLvlValueCoefficient, @NotNull String buttonPrice, int i) {
        Intrinsics.checkNotNullParameter(textCurrentValueDayLimit, "textCurrentValueDayLimit");
        Intrinsics.checkNotNullParameter(textCurrentValueCoefficient, "textCurrentValueCoefficient");
        Intrinsics.checkNotNullParameter(textNextLvlValueDayLimit, "textNextLvlValueDayLimit");
        Intrinsics.checkNotNullParameter(textNextLvlValueCoefficient, "textNextLvlValueCoefficient");
        Intrinsics.checkNotNullParameter(buttonPrice, "buttonPrice");
        this.textCurrentValueDayLimit = textCurrentValueDayLimit;
        this.textCurrentValueCoefficient = textCurrentValueCoefficient;
        this.textNextLvlValueDayLimit = textNextLvlValueDayLimit;
        this.textNextLvlValueCoefficient = textNextLvlValueCoefficient;
        this.buttonPrice = buttonPrice;
        this.eventResGift = i;
    }

    public /* synthetic */ HolidayEventsGainBlockData(String str, String str2, String str3, String str4, String str5, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i2 & 2) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i2 & 4) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str3, (i2 & 8) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str4, (i2 & 16) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str5, (i2 & 32) != 0 ? 0 : i);
    }

    @NotNull
    public final String getTextCurrentValueDayLimit() {
        return this.textCurrentValueDayLimit;
    }

    @NotNull
    public final String getTextCurrentValueCoefficient() {
        return this.textCurrentValueCoefficient;
    }

    @NotNull
    public final String getTextNextLvlValueDayLimit() {
        return this.textNextLvlValueDayLimit;
    }

    @NotNull
    public final String getTextNextLvlValueCoefficient() {
        return this.textNextLvlValueCoefficient;
    }

    @NotNull
    public final String getButtonPrice() {
        return this.buttonPrice;
    }

    public final int getEventResGift() {
        return this.eventResGift;
    }
}

