package com.blackhub.bronline.game.gui.bprewards.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.apache.commons.codec.language.p055bm.Rule;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BpRewardsFilterStateEnum.kt */
@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/bprewards/model/BpRewardsFilterStateEnum;", "", "filterState", "", "(Ljava/lang/String;II)V", "getFilterState", "()I", Rule.ALL, "SKINS", "VIP", "ACCESSORISES", "CARS", "CURRENCIES", "OTHER", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
