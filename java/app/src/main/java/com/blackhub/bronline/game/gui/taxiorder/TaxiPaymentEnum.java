package com.blackhub.bronline.game.gui.taxiorder;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TaxiPaymentEnum.kt */
/* loaded from: classes3.dex */
public final class TaxiPaymentEnum {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ TaxiPaymentEnum[] $VALUES;
    public final int index;
    public static final TaxiPaymentEnum CASH = new TaxiPaymentEnum("CASH", 0, 1);
    public static final TaxiPaymentEnum CARD = new TaxiPaymentEnum("CARD", 1, 0);

    public static final /* synthetic */ TaxiPaymentEnum[] $values() {
        return new TaxiPaymentEnum[]{CASH, CARD};
    }

    @NotNull
    public static EnumEntries<TaxiPaymentEnum> getEntries() {
        return $ENTRIES;
    }

    public static TaxiPaymentEnum valueOf(String str) {
        return (TaxiPaymentEnum) Enum.valueOf(TaxiPaymentEnum.class, str);
    }

    public static TaxiPaymentEnum[] values() {
        return (TaxiPaymentEnum[]) $VALUES.clone();
    }

    public TaxiPaymentEnum(String str, int i, int i2) {
        this.index = i2;
    }

    public final int getIndex() {
        return this.index;
    }

    static {
        TaxiPaymentEnum[] taxiPaymentEnumArr$values = $values();
        $VALUES = taxiPaymentEnumArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(taxiPaymentEnumArr$values);
    }
}

