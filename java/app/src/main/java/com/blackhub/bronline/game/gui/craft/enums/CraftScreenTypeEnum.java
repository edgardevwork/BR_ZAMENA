package com.blackhub.bronline.game.gui.craft.enums;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CraftScreenTypeEnum.kt */
/* loaded from: classes2.dex */
public final class CraftScreenTypeEnum {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ CraftScreenTypeEnum[] $VALUES;
    public static final CraftScreenTypeEnum CRAFT = new CraftScreenTypeEnum("CRAFT", 0);
    public static final CraftScreenTypeEnum STASH = new CraftScreenTypeEnum("STASH", 1);
    public static final CraftScreenTypeEnum PROGRESS = new CraftScreenTypeEnum("PROGRESS", 2);

    public static final /* synthetic */ CraftScreenTypeEnum[] $values() {
        return new CraftScreenTypeEnum[]{CRAFT, STASH, PROGRESS};
    }

    @NotNull
    public static EnumEntries<CraftScreenTypeEnum> getEntries() {
        return $ENTRIES;
    }

    public static CraftScreenTypeEnum valueOf(String str) {
        return (CraftScreenTypeEnum) Enum.valueOf(CraftScreenTypeEnum.class, str);
    }

    public static CraftScreenTypeEnum[] values() {
        return (CraftScreenTypeEnum[]) $VALUES.clone();
    }

    public CraftScreenTypeEnum(String str, int i) {
    }

    static {
        CraftScreenTypeEnum[] craftScreenTypeEnumArr$values = $values();
        $VALUES = craftScreenTypeEnumArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(craftScreenTypeEnumArr$values);
    }
}

