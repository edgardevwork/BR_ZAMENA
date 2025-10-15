package com.blackhub.bronline.game.gui.marketplace.enums;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketplaceHistoryStatusEnum.kt */
@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/marketplace/enums/MarketplaceHistoryStatusEnum;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "SOLD", "PURCHASED", "NOTHING", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
