package com.blackhub.bronline.game.gui.craft.enums;

import com.google.android.gms.stats.CodePackage;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CraftIngredientRarityEnum.kt */
/* loaded from: classes2.dex */
public final class CraftIngredientRarityEnum {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ CraftIngredientRarityEnum[] $VALUES;
    public final int value;
    public static final CraftIngredientRarityEnum COMMON = new CraftIngredientRarityEnum(CodePackage.COMMON, 0, 1);
    public static final CraftIngredientRarityEnum UNCOMMON = new CraftIngredientRarityEnum("UNCOMMON", 1, 2);
    public static final CraftIngredientRarityEnum RARE = new CraftIngredientRarityEnum("RARE", 2, 3);
    public static final CraftIngredientRarityEnum EPIC = new CraftIngredientRarityEnum("EPIC", 3, 4);
    public static final CraftIngredientRarityEnum LEGENDARY = new CraftIngredientRarityEnum("LEGENDARY", 4, 5);

    public static final /* synthetic */ CraftIngredientRarityEnum[] $values() {
        return new CraftIngredientRarityEnum[]{COMMON, UNCOMMON, RARE, EPIC, LEGENDARY};
    }

    @NotNull
    public static EnumEntries<CraftIngredientRarityEnum> getEntries() {
        return $ENTRIES;
    }

    public static CraftIngredientRarityEnum valueOf(String str) {
        return (CraftIngredientRarityEnum) Enum.valueOf(CraftIngredientRarityEnum.class, str);
    }

    public static CraftIngredientRarityEnum[] values() {
        return (CraftIngredientRarityEnum[]) $VALUES.clone();
    }

    public CraftIngredientRarityEnum(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        CraftIngredientRarityEnum[] craftIngredientRarityEnumArr$values = $values();
        $VALUES = craftIngredientRarityEnumArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(craftIngredientRarityEnumArr$values);
    }
}

