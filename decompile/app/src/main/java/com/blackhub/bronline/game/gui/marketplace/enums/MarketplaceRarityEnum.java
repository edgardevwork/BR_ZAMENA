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
@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/marketplace/enums/MarketplaceRarityEnum;", "", "nameRes", "", "value", "(Ljava/lang/String;III)V", "getNameRes", "()I", "getValue", CodePackage.COMMON, "UNCOMMON", "RARE", "EPIC", "LEGENDARY", "SPECIAL", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
