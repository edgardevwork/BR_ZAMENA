package com.blackhub.bronline.game.gui.taxiorder;

import com.bless.client.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TaxiRateEnum.kt */
/* loaded from: classes3.dex */
public final class TaxiRateEnum {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ TaxiRateEnum[] $VALUES;
    public final int descriptionResId;
    public final int index;
    public int price;
    public static final TaxiRateEnum ECONOMY = new TaxiRateEnum("ECONOMY", 0, 0, 0, R.string.taxi_order_economy, 2, null);
    public static final TaxiRateEnum COMFORTABLE = new TaxiRateEnum("COMFORTABLE", 1, 1, 0, R.string.taxi_order_comfort, 2, null);
    public static final TaxiRateEnum BUSINESS = new TaxiRateEnum("BUSINESS", 2, 2, 0, R.string.taxi_order_business, 2, null);

    public static final /* synthetic */ TaxiRateEnum[] $values() {
        return new TaxiRateEnum[]{ECONOMY, COMFORTABLE, BUSINESS};
    }

    @NotNull
    public static EnumEntries<TaxiRateEnum> getEntries() {
        return $ENTRIES;
    }

    public static TaxiRateEnum valueOf(String str) {
        return (TaxiRateEnum) Enum.valueOf(TaxiRateEnum.class, str);
    }

    public static TaxiRateEnum[] values() {
        return (TaxiRateEnum[]) $VALUES.clone();
    }

    public TaxiRateEnum(String str, int i, int i2, int i3, int i4) {
        this.index = i2;
        this.price = i3;
        this.descriptionResId = i4;
    }

    public /* synthetic */ TaxiRateEnum(String str, int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, (i5 & 2) != 0 ? 0 : i3, i4);
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getPrice() {
        return this.price;
    }

    public final void setPrice(int i) {
        this.price = i;
    }

    public final int getDescriptionResId() {
        return this.descriptionResId;
    }

    static {
        TaxiRateEnum[] taxiRateEnumArr$values = $values();
        $VALUES = taxiRateEnumArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(taxiRateEnumArr$values);
    }
}

