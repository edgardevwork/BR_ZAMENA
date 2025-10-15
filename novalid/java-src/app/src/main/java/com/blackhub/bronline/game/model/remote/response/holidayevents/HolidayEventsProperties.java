package com.blackhub.bronline.game.model.remote.response.holidayevents;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.constants.Other;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HolidayEventsProperties.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b2\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B±\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003¢\u0006\u0002\u0010\u0015J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u00103\u001a\u00020\bHÆ\u0003J\t\u00104\u001a\u00020\bHÆ\u0003J\t\u00105\u001a\u00020\bHÆ\u0003J\t\u00106\u001a\u00020\bHÆ\u0003J\t\u00107\u001a\u00020\bHÆ\u0003J\t\u00108\u001a\u00020\bHÆ\u0003Jµ\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0003HÆ\u0001J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\u0003HÖ\u0001J\t\u0010>\u001a\u00020\bHÖ\u0001R\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0016\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0016\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0016\u0010\u0011\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0017R\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019¨\u0006?"}, m7105d2 = {"Lcom/blackhub/bronline/game/model/remote/response/holidayevents/HolidayEventsProperties;", "", "eventId", "", "miniGamesId", "", "dates", "color", "", "color2", "name", "bgImage", "lastChanceImage", "icImage", "bpOfferImage", "bpMultiplier", "bpLimit", "offerImage", "offerCost", "offerValue", "eventCurrencyId", "(ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;III)V", "getBgImage", "()Ljava/lang/String;", "getBpLimit", "()I", "getBpMultiplier", "getBpOfferImage", "getColor", "getColor2", "getDates", "()Ljava/util/List;", "getEventCurrencyId", "getEventId", "getIcImage", "getLastChanceImage", "getMiniGamesId", "getName", "getOfferCost", "getOfferImage", "getOfferValue", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final /* data */ class HolidayEventsProperties {
    public static final int $stable = 8;

    @SerializedName("bgImage")
    @NotNull
    public final String bgImage;

    @SerializedName("bpLimit")
    public final int bpLimit;

    @SerializedName("bpMultiplier")
    public final int bpMultiplier;

    @SerializedName("bpOfferImage")
    @NotNull
    public final String bpOfferImage;

    @SerializedName("color")
    @NotNull
    public final String color;

    @SerializedName("color2")
    @NotNull
    public final String color2;

    @SerializedName("dates")
    @NotNull
    public final List<Integer> dates;

    @SerializedName("eventCurrencyId")
    public final int eventCurrencyId;

    @SerializedName("eventId")
    public final int eventId;

    @SerializedName("icImage")
    @NotNull
    public final String icImage;

    @SerializedName("lastChanceImage")
    @NotNull
    public final String lastChanceImage;

    @SerializedName("miniGamesId")
    @NotNull
    public final List<Integer> miniGamesId;

    @SerializedName("name")
    @NotNull
    public final String name;

    @SerializedName("offerCost")
    public final int offerCost;

    @SerializedName("offerImage")
    @NotNull
    public final String offerImage;

    @SerializedName("offerValue")
    public final int offerValue;

    public HolidayEventsProperties() {
        this(0, null, null, null, null, null, null, null, null, null, 0, 0, null, 0, 0, 0, 65535, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getEventId() {
        return this.eventId;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getBpOfferImage() {
        return this.bpOfferImage;
    }

    /* renamed from: component11, reason: from getter */
    public final int getBpMultiplier() {
        return this.bpMultiplier;
    }

    /* renamed from: component12, reason: from getter */
    public final int getBpLimit() {
        return this.bpLimit;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final String getOfferImage() {
        return this.offerImage;
    }

    /* renamed from: component14, reason: from getter */
    public final int getOfferCost() {
        return this.offerCost;
    }

    /* renamed from: component15, reason: from getter */
    public final int getOfferValue() {
        return this.offerValue;
    }

    /* renamed from: component16, reason: from getter */
    public final int getEventCurrencyId() {
        return this.eventCurrencyId;
    }

    @NotNull
    public final List<Integer> component2() {
        return this.miniGamesId;
    }

    @NotNull
    public final List<Integer> component3() {
        return this.dates;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getColor2() {
        return this.color2;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getBgImage() {
        return this.bgImage;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getLastChanceImage() {
        return this.lastChanceImage;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getIcImage() {
        return this.icImage;
    }

    @NotNull
    public final HolidayEventsProperties copy(int eventId, @NotNull List<Integer> miniGamesId, @NotNull List<Integer> dates, @NotNull String color, @NotNull String color2, @NotNull String name, @NotNull String bgImage, @NotNull String lastChanceImage, @NotNull String icImage, @NotNull String bpOfferImage, int bpMultiplier, int bpLimit, @NotNull String offerImage, int offerCost, int offerValue, int eventCurrencyId) {
        Intrinsics.checkNotNullParameter(miniGamesId, "miniGamesId");
        Intrinsics.checkNotNullParameter(dates, "dates");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(color2, "color2");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(bgImage, "bgImage");
        Intrinsics.checkNotNullParameter(lastChanceImage, "lastChanceImage");
        Intrinsics.checkNotNullParameter(icImage, "icImage");
        Intrinsics.checkNotNullParameter(bpOfferImage, "bpOfferImage");
        Intrinsics.checkNotNullParameter(offerImage, "offerImage");
        return new HolidayEventsProperties(eventId, miniGamesId, dates, color, color2, name, bgImage, lastChanceImage, icImage, bpOfferImage, bpMultiplier, bpLimit, offerImage, offerCost, offerValue, eventCurrencyId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HolidayEventsProperties)) {
            return false;
        }
        HolidayEventsProperties holidayEventsProperties = (HolidayEventsProperties) other;
        return this.eventId == holidayEventsProperties.eventId && Intrinsics.areEqual(this.miniGamesId, holidayEventsProperties.miniGamesId) && Intrinsics.areEqual(this.dates, holidayEventsProperties.dates) && Intrinsics.areEqual(this.color, holidayEventsProperties.color) && Intrinsics.areEqual(this.color2, holidayEventsProperties.color2) && Intrinsics.areEqual(this.name, holidayEventsProperties.name) && Intrinsics.areEqual(this.bgImage, holidayEventsProperties.bgImage) && Intrinsics.areEqual(this.lastChanceImage, holidayEventsProperties.lastChanceImage) && Intrinsics.areEqual(this.icImage, holidayEventsProperties.icImage) && Intrinsics.areEqual(this.bpOfferImage, holidayEventsProperties.bpOfferImage) && this.bpMultiplier == holidayEventsProperties.bpMultiplier && this.bpLimit == holidayEventsProperties.bpLimit && Intrinsics.areEqual(this.offerImage, holidayEventsProperties.offerImage) && this.offerCost == holidayEventsProperties.offerCost && this.offerValue == holidayEventsProperties.offerValue && this.eventCurrencyId == holidayEventsProperties.eventCurrencyId;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((Integer.hashCode(this.eventId) * 31) + this.miniGamesId.hashCode()) * 31) + this.dates.hashCode()) * 31) + this.color.hashCode()) * 31) + this.color2.hashCode()) * 31) + this.name.hashCode()) * 31) + this.bgImage.hashCode()) * 31) + this.lastChanceImage.hashCode()) * 31) + this.icImage.hashCode()) * 31) + this.bpOfferImage.hashCode()) * 31) + Integer.hashCode(this.bpMultiplier)) * 31) + Integer.hashCode(this.bpLimit)) * 31) + this.offerImage.hashCode()) * 31) + Integer.hashCode(this.offerCost)) * 31) + Integer.hashCode(this.offerValue)) * 31) + Integer.hashCode(this.eventCurrencyId);
    }

    @NotNull
    public String toString() {
        return "HolidayEventsProperties(eventId=" + this.eventId + ", miniGamesId=" + this.miniGamesId + ", dates=" + this.dates + ", color=" + this.color + ", color2=" + this.color2 + ", name=" + this.name + ", bgImage=" + this.bgImage + ", lastChanceImage=" + this.lastChanceImage + ", icImage=" + this.icImage + ", bpOfferImage=" + this.bpOfferImage + ", bpMultiplier=" + this.bpMultiplier + ", bpLimit=" + this.bpLimit + ", offerImage=" + this.offerImage + ", offerCost=" + this.offerCost + ", offerValue=" + this.offerValue + ", eventCurrencyId=" + this.eventCurrencyId + ")";
    }

    public HolidayEventsProperties(int i, @NotNull List<Integer> miniGamesId, @NotNull List<Integer> dates, @NotNull String color, @NotNull String color2, @NotNull String name, @NotNull String bgImage, @NotNull String lastChanceImage, @NotNull String icImage, @NotNull String bpOfferImage, int i2, int i3, @NotNull String offerImage, int i4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(miniGamesId, "miniGamesId");
        Intrinsics.checkNotNullParameter(dates, "dates");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(color2, "color2");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(bgImage, "bgImage");
        Intrinsics.checkNotNullParameter(lastChanceImage, "lastChanceImage");
        Intrinsics.checkNotNullParameter(icImage, "icImage");
        Intrinsics.checkNotNullParameter(bpOfferImage, "bpOfferImage");
        Intrinsics.checkNotNullParameter(offerImage, "offerImage");
        this.eventId = i;
        this.miniGamesId = miniGamesId;
        this.dates = dates;
        this.color = color;
        this.color2 = color2;
        this.name = name;
        this.bgImage = bgImage;
        this.lastChanceImage = lastChanceImage;
        this.icImage = icImage;
        this.bpOfferImage = bpOfferImage;
        this.bpMultiplier = i2;
        this.bpLimit = i3;
        this.offerImage = offerImage;
        this.offerCost = i4;
        this.offerValue = i5;
        this.eventCurrencyId = i6;
    }

    public final int getEventId() {
        return this.eventId;
    }

    public /* synthetic */ HolidayEventsProperties(int i, List list, List list2, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, int i3, String str8, int i4, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : i, (i7 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i7 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i7 & 8) != 0 ? Other.COLOR_DEFAULT_STRING : str, (i7 & 16) == 0 ? str2 : Other.COLOR_DEFAULT_STRING, (i7 & 32) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str3, (i7 & 64) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str4, (i7 & 128) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str5, (i7 & 256) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str6, (i7 & 512) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str7, (i7 & 1024) != 0 ? 0 : i2, (i7 & 2048) != 0 ? 0 : i3, (i7 & 4096) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str8, (i7 & 8192) != 0 ? 0 : i4, (i7 & 16384) != 0 ? 0 : i5, (i7 & 32768) != 0 ? 0 : i6);
    }

    @NotNull
    public final List<Integer> getMiniGamesId() {
        return this.miniGamesId;
    }

    @NotNull
    public final List<Integer> getDates() {
        return this.dates;
    }

    @NotNull
    public final String getColor() {
        return this.color;
    }

    @NotNull
    public final String getColor2() {
        return this.color2;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getBgImage() {
        return this.bgImage;
    }

    @NotNull
    public final String getLastChanceImage() {
        return this.lastChanceImage;
    }

    @NotNull
    public final String getIcImage() {
        return this.icImage;
    }

    @NotNull
    public final String getBpOfferImage() {
        return this.bpOfferImage;
    }

    public final int getBpMultiplier() {
        return this.bpMultiplier;
    }

    public final int getBpLimit() {
        return this.bpLimit;
    }

    @NotNull
    public final String getOfferImage() {
        return this.offerImage;
    }

    public final int getOfferCost() {
        return this.offerCost;
    }

    public final int getOfferValue() {
        return this.offerValue;
    }

    public final int getEventCurrencyId() {
        return this.eventCurrencyId;
    }
}
