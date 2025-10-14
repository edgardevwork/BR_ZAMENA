package com.blackhub.bronline.game.gui.marketplace.enums;

import com.google.android.gms.stats.CodePackage;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketplaceTypeProductCardEnum.kt */
/* loaded from: classes3.dex */
public final class MarketplaceTypeProductCardEnum {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ MarketplaceTypeProductCardEnum[] $VALUES;
    public static final MarketplaceTypeProductCardEnum HOT = new MarketplaceTypeProductCardEnum("HOT", 0);
    public static final MarketplaceTypeProductCardEnum IN_STOCK = new MarketplaceTypeProductCardEnum("IN_STOCK", 1);
    public static final MarketplaceTypeProductCardEnum BEST = new MarketplaceTypeProductCardEnum("BEST", 2);
    public static final MarketplaceTypeProductCardEnum COMMON = new MarketplaceTypeProductCardEnum(CodePackage.COMMON, 3);

    public static final /* synthetic */ MarketplaceTypeProductCardEnum[] $values() {
        return new MarketplaceTypeProductCardEnum[]{HOT, IN_STOCK, BEST, COMMON};
    }

    @NotNull
    public static EnumEntries<MarketplaceTypeProductCardEnum> getEntries() {
        return $ENTRIES;
    }

    public static MarketplaceTypeProductCardEnum valueOf(String str) {
        return (MarketplaceTypeProductCardEnum) Enum.valueOf(MarketplaceTypeProductCardEnum.class, str);
    }

    public static MarketplaceTypeProductCardEnum[] values() {
        return (MarketplaceTypeProductCardEnum[]) $VALUES.clone();
    }

    public MarketplaceTypeProductCardEnum(String str, int i) {
    }

    static {
        MarketplaceTypeProductCardEnum[] marketplaceTypeProductCardEnumArr$values = $values();
        $VALUES = marketplaceTypeProductCardEnumArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(marketplaceTypeProductCardEnumArr$values);
    }
}

