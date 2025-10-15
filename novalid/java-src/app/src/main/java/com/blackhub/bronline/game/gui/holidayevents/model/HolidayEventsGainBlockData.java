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
@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\tHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/holidayevents/model/HolidayEventsGainBlockData;", "", "textCurrentValueDayLimit", "", "textCurrentValueCoefficient", "textNextLvlValueDayLimit", "textNextLvlValueCoefficient", "buttonPrice", "eventResGift", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getButtonPrice", "()Ljava/lang/String;", "getEventResGift", "()I", "getTextCurrentValueCoefficient", "getTextCurrentValueDayLimit", "getTextNextLvlValueCoefficient", "getTextNextLvlValueDayLimit", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
