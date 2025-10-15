package com.blackhub.bronline.game.gui.marketplace.enums;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketplaceModalWindowStateEnum.kt */
@Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/marketplace/enums/MarketplaceModalWindowStateEnum;", "", "(Ljava/lang/String;I)V", "CONFIRM_REMOVE_LIKE", "CONFIRM_REMOVE_CARD", "CONFIRM_EDIT", "CONFIRM_BUY", "CONFIRM_PUBLISH_TO_SELL", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class MarketplaceModalWindowStateEnum {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ MarketplaceModalWindowStateEnum[] $VALUES;
    public static final MarketplaceModalWindowStateEnum CONFIRM_REMOVE_LIKE = new MarketplaceModalWindowStateEnum("CONFIRM_REMOVE_LIKE", 0);
    public static final MarketplaceModalWindowStateEnum CONFIRM_REMOVE_CARD = new MarketplaceModalWindowStateEnum("CONFIRM_REMOVE_CARD", 1);
    public static final MarketplaceModalWindowStateEnum CONFIRM_EDIT = new MarketplaceModalWindowStateEnum("CONFIRM_EDIT", 2);
    public static final MarketplaceModalWindowStateEnum CONFIRM_BUY = new MarketplaceModalWindowStateEnum("CONFIRM_BUY", 3);
    public static final MarketplaceModalWindowStateEnum CONFIRM_PUBLISH_TO_SELL = new MarketplaceModalWindowStateEnum("CONFIRM_PUBLISH_TO_SELL", 4);

    public static final /* synthetic */ MarketplaceModalWindowStateEnum[] $values() {
        return new MarketplaceModalWindowStateEnum[]{CONFIRM_REMOVE_LIKE, CONFIRM_REMOVE_CARD, CONFIRM_EDIT, CONFIRM_BUY, CONFIRM_PUBLISH_TO_SELL};
    }

    @NotNull
    public static EnumEntries<MarketplaceModalWindowStateEnum> getEntries() {
        return $ENTRIES;
    }

    public static MarketplaceModalWindowStateEnum valueOf(String str) {
        return (MarketplaceModalWindowStateEnum) Enum.valueOf(MarketplaceModalWindowStateEnum.class, str);
    }

    public static MarketplaceModalWindowStateEnum[] values() {
        return (MarketplaceModalWindowStateEnum[]) $VALUES.clone();
    }

    public MarketplaceModalWindowStateEnum(String str, int i) {
    }

    static {
        MarketplaceModalWindowStateEnum[] marketplaceModalWindowStateEnumArr$values = $values();
        $VALUES = marketplaceModalWindowStateEnumArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(marketplaceModalWindowStateEnumArr$values);
    }
}
