package com.blackhub.bronline.game.gui.marketplace.enums;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketplaceNotificationEnum.kt */
/* loaded from: classes3.dex */
public final class MarketplaceNotificationEnum {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ MarketplaceNotificationEnum[] $VALUES;
    public final int value;
    public static final MarketplaceNotificationEnum NOTHING = new MarketplaceNotificationEnum("NOTHING", 0, 0);
    public static final MarketplaceNotificationEnum HOT = new MarketplaceNotificationEnum("HOT", 1, 1);
    public static final MarketplaceNotificationEnum THE_BEST = new MarketplaceNotificationEnum("THE_BEST", 2, 2);

    public static final /* synthetic */ MarketplaceNotificationEnum[] $values() {
        return new MarketplaceNotificationEnum[]{NOTHING, HOT, THE_BEST};
    }

    @NotNull
    public static EnumEntries<MarketplaceNotificationEnum> getEntries() {
        return $ENTRIES;
    }

    public static MarketplaceNotificationEnum valueOf(String str) {
        return (MarketplaceNotificationEnum) Enum.valueOf(MarketplaceNotificationEnum.class, str);
    }

    public static MarketplaceNotificationEnum[] values() {
        return (MarketplaceNotificationEnum[]) $VALUES.clone();
    }

    public MarketplaceNotificationEnum(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        MarketplaceNotificationEnum[] marketplaceNotificationEnumArr$values = $values();
        $VALUES = marketplaceNotificationEnumArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(marketplaceNotificationEnumArr$values);
    }
}

