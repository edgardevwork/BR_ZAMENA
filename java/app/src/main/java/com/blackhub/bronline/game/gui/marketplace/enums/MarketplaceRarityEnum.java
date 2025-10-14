package com.blackhub.bronline.game.gui.marketplace.enums;

import androidx.annotation.StringRes;
import com.bless.client.R;
import com.google.android.gms.stats.CodePackage;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketplaceRarityEnum.kt */
/* loaded from: classes3.dex */
public final class MarketplaceRarityEnum {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ MarketplaceRarityEnum[] $VALUES;
    public final int nameRes;
    public final int value;
    public static final MarketplaceRarityEnum COMMON = new MarketplaceRarityEnum(CodePackage.COMMON, 0, R.string.common_common_rarity, 1);
    public static final MarketplaceRarityEnum UNCOMMON = new MarketplaceRarityEnum("UNCOMMON", 1, R.string.common_uncommon_rarity, 2);
    public static final MarketplaceRarityEnum RARE = new MarketplaceRarityEnum("RARE", 2, R.string.common_rare_rarity, 3);
    public static final MarketplaceRarityEnum EPIC = new MarketplaceRarityEnum("EPIC", 3, R.string.common_epic_rarity, 4);
    public static final MarketplaceRarityEnum LEGENDARY = new MarketplaceRarityEnum("LEGENDARY", 4, R.string.common_legendary_rarity, 5);
    public static final MarketplaceRarityEnum SPECIAL = new MarketplaceRarityEnum("SPECIAL", 5, R.string.common_special_rarity, 6);

    public static final /* synthetic */ MarketplaceRarityEnum[] $values() {
        return new MarketplaceRarityEnum[]{COMMON, UNCOMMON, RARE, EPIC, LEGENDARY, SPECIAL};
    }

    @NotNull
    public static EnumEntries<MarketplaceRarityEnum> getEntries() {
        return $ENTRIES;
    }

    public static MarketplaceRarityEnum valueOf(String str) {
        return (MarketplaceRarityEnum) Enum.valueOf(MarketplaceRarityEnum.class, str);
    }

    public static MarketplaceRarityEnum[] values() {
        return (MarketplaceRarityEnum[]) $VALUES.clone();
    }

    public MarketplaceRarityEnum(@StringRes String str, int i, int i2, int i3) {
        this.nameRes = i2;
        this.value = i3;
    }

    public final int getNameRes() {
        return this.nameRes;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        MarketplaceRarityEnum[] marketplaceRarityEnumArr$values = $values();
        $VALUES = marketplaceRarityEnumArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(marketplaceRarityEnumArr$values);
    }
}

