package com.blackhub.bronline.game.gui.bprewards.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.apache.commons.codec.language.p055bm.Rule;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BpRewardsFilterStateEnum.kt */
/* loaded from: classes.dex */
public final class BpRewardsFilterStateEnum {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ BpRewardsFilterStateEnum[] $VALUES;
    public final int filterState;
    public static final BpRewardsFilterStateEnum ALL = new BpRewardsFilterStateEnum(Rule.ALL, 0, 1);
    public static final BpRewardsFilterStateEnum SKINS = new BpRewardsFilterStateEnum("SKINS", 1, 2);
    public static final BpRewardsFilterStateEnum VIP = new BpRewardsFilterStateEnum("VIP", 2, 3);
    public static final BpRewardsFilterStateEnum ACCESSORISES = new BpRewardsFilterStateEnum("ACCESSORISES", 3, 4);
    public static final BpRewardsFilterStateEnum CARS = new BpRewardsFilterStateEnum("CARS", 4, 5);
    public static final BpRewardsFilterStateEnum CURRENCIES = new BpRewardsFilterStateEnum("CURRENCIES", 5, 6);
    public static final BpRewardsFilterStateEnum OTHER = new BpRewardsFilterStateEnum("OTHER", 6, 7);

    public static final /* synthetic */ BpRewardsFilterStateEnum[] $values() {
        return new BpRewardsFilterStateEnum[]{ALL, SKINS, VIP, ACCESSORISES, CARS, CURRENCIES, OTHER};
    }

    @NotNull
    public static EnumEntries<BpRewardsFilterStateEnum> getEntries() {
        return $ENTRIES;
    }

    public static BpRewardsFilterStateEnum valueOf(String str) {
        return (BpRewardsFilterStateEnum) Enum.valueOf(BpRewardsFilterStateEnum.class, str);
    }

    public static BpRewardsFilterStateEnum[] values() {
        return (BpRewardsFilterStateEnum[]) $VALUES.clone();
    }

    public BpRewardsFilterStateEnum(String str, int i, int i2) {
        this.filterState = i2;
    }

    public final int getFilterState() {
        return this.filterState;
    }

    static {
        BpRewardsFilterStateEnum[] bpRewardsFilterStateEnumArr$values = $values();
        $VALUES = bpRewardsFilterStateEnumArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(bpRewardsFilterStateEnumArr$values);
    }
}

