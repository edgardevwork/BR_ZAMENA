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
@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\b\"\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/taxiorder/TaxiRateEnum;", "", FirebaseAnalytics.Param.INDEX, "", FirebaseAnalytics.Param.PRICE, "descriptionResId", "(Ljava/lang/String;IIII)V", "getDescriptionResId", "()I", "getIndex", "getPrice", "setPrice", "(I)V", "ECONOMY", "COMFORTABLE", "BUSINESS", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
