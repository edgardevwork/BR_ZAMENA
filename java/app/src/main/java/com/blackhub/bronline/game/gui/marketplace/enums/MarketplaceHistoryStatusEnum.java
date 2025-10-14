package com.blackhub.bronline.game.gui.marketplace.enums;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketplaceHistoryStatusEnum.kt */
/* loaded from: classes3.dex */
public final class MarketplaceHistoryStatusEnum {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ MarketplaceHistoryStatusEnum[] $VALUES;
    public final int value;
    public static final MarketplaceHistoryStatusEnum SOLD = new MarketplaceHistoryStatusEnum("SOLD", 0, 2);
    public static final MarketplaceHistoryStatusEnum PURCHASED = new MarketplaceHistoryStatusEnum("PURCHASED", 1, 1);
    public static final MarketplaceHistoryStatusEnum NOTHING = new MarketplaceHistoryStatusEnum("NOTHING", 2, 0);

    public static final /* synthetic */ MarketplaceHistoryStatusEnum[] $values() {
        return new MarketplaceHistoryStatusEnum[]{SOLD, PURCHASED, NOTHING};
    }

    @NotNull
    public static EnumEntries<MarketplaceHistoryStatusEnum> getEntries() {
        return $ENTRIES;
    }

    public static MarketplaceHistoryStatusEnum valueOf(String str) {
        return (MarketplaceHistoryStatusEnum) Enum.valueOf(MarketplaceHistoryStatusEnum.class, str);
    }

    public static MarketplaceHistoryStatusEnum[] values() {
        return (MarketplaceHistoryStatusEnum[]) $VALUES.clone();
    }

    public MarketplaceHistoryStatusEnum(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        MarketplaceHistoryStatusEnum[] marketplaceHistoryStatusEnumArr$values = $values();
        $VALUES = marketplaceHistoryStatusEnumArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(marketplaceHistoryStatusEnumArr$values);
    }
}

