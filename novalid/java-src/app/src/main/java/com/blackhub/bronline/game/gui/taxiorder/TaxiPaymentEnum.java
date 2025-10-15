package com.blackhub.bronline.game.gui.taxiorder;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TaxiPaymentEnum.kt */
@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/taxiorder/TaxiPaymentEnum;", "", FirebaseAnalytics.Param.INDEX, "", "(Ljava/lang/String;II)V", "getIndex", "()I", "CASH", "CARD", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
