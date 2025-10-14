package com.blackhub.bronline.game.gui.marketplace.enums;

import com.google.android.gms.stats.CodePackage;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketplaceTypeProductCardEnum.kt */
@Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/marketplace/enums/MarketplaceTypeProductCardEnum;", "", "(Ljava/lang/String;I)V", "HOT", "IN_STOCK", "BEST", CodePackage.COMMON, "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
