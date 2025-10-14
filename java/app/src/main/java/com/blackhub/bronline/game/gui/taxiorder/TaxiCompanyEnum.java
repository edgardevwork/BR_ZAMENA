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
/* compiled from: TaxiCompanyEnum.kt */
/* loaded from: classes2.dex */
public final class TaxiCompanyEnum {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ TaxiCompanyEnum[] $VALUES;
    public static final TaxiCompanyEnum GETT_TAXI = new TaxiCompanyEnum("GETT_TAXI", 2, 2, R.string.taxi_order_g, 0 == true ? 1 : 0, false, 12, null);
    public final int companyNameResId;
    public int descriptionId;
    public final int index;
    public boolean isFastestOrDemanded;
    public static final TaxiCompanyEnum YANDEX_TAXI = new TaxiCompanyEnum("YANDEX_TAXI", 0, 0, R.string.taxi_order_y, 0, false, 12, null);
    public static final TaxiCompanyEnum CITY_MOBILE_TAXI = new TaxiCompanyEnum("CITY_MOBILE_TAXI", 1, 1, R.string.taxi_order_s, 0, false, 12, null);

    public static final /* synthetic */ TaxiCompanyEnum[] $values() {
        return new TaxiCompanyEnum[]{YANDEX_TAXI, CITY_MOBILE_TAXI, GETT_TAXI};
    }

    @NotNull
    public static EnumEntries<TaxiCompanyEnum> getEntries() {
        return $ENTRIES;
    }

    public static TaxiCompanyEnum valueOf(String str) {
        return (TaxiCompanyEnum) Enum.valueOf(TaxiCompanyEnum.class, str);
    }

    public static TaxiCompanyEnum[] values() {
        return (TaxiCompanyEnum[]) $VALUES.clone();
    }

    public TaxiCompanyEnum(String str, int i, int i2, int i3, int i4, boolean z) {
        this.index = i2;
        this.companyNameResId = i3;
        this.descriptionId = i4;
        this.isFastestOrDemanded = z;
    }

    public /* synthetic */ TaxiCompanyEnum(String str, int i, int i2, int i3, int i4, boolean z, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, i3, (i5 & 4) != 0 ? R.string.common_empty : i4, (i5 & 8) != 0 ? false : z);
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getCompanyNameResId() {
        return this.companyNameResId;
    }

    public final int getDescriptionId() {
        return this.descriptionId;
    }

    public final void setDescriptionId(int i) {
        this.descriptionId = i;
    }

    /* renamed from: isFastestOrDemanded, reason: from getter */
    public final boolean getIsFastestOrDemanded() {
        return this.isFastestOrDemanded;
    }

    public final void setFastestOrDemanded(boolean z) {
        this.isFastestOrDemanded = z;
    }

    static {
        TaxiCompanyEnum[] taxiCompanyEnumArr$values = $values();
        $VALUES = taxiCompanyEnumArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(taxiCompanyEnumArr$values);
    }
}

