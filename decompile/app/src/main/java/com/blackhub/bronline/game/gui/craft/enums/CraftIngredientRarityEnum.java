package com.blackhub.bronline.game.gui.craft.enums;

import com.google.android.gms.stats.CodePackage;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CraftIngredientRarityEnum.kt */
@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/craft/enums/CraftIngredientRarityEnum;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", CodePackage.COMMON, "UNCOMMON", "RARE", "EPIC", "LEGENDARY", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
