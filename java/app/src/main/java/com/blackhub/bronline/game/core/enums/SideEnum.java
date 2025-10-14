package com.blackhub.bronline.game.core.enums;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SideEnum.kt */

public final class SideEnum {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ SideEnum[] $VALUES;
    public static final SideEnum TOP_LEFT = new SideEnum("TOP_LEFT", 0);
    public static final SideEnum TOP_CENTER = new SideEnum("TOP_CENTER", 1);
    public static final SideEnum TOP_RIGHT = new SideEnum("TOP_RIGHT", 2);
    public static final SideEnum CENTER_LEFT = new SideEnum("CENTER_LEFT", 3);
    public static final SideEnum CENTER = new SideEnum("CENTER", 4);
    public static final SideEnum CENTER_RIGHT = new SideEnum("CENTER_RIGHT", 5);
    public static final SideEnum BOTTOM_LEFT = new SideEnum("BOTTOM_LEFT", 6);
    public static final SideEnum BOTTOM_CENTER = new SideEnum("BOTTOM_CENTER", 7);
    public static final SideEnum BOTTOM_RIGHT = new SideEnum("BOTTOM_RIGHT", 8);

    public static final /* synthetic */ SideEnum[] $values() {
        return new SideEnum[]{TOP_LEFT, TOP_CENTER, TOP_RIGHT, CENTER_LEFT, CENTER, CENTER_RIGHT, BOTTOM_LEFT, BOTTOM_CENTER, BOTTOM_RIGHT};
    }

    @NotNull
    public static EnumEntries<SideEnum> getEntries() {
        return $ENTRIES;
    }

    public static SideEnum valueOf(String str) {
        return (SideEnum) Enum.valueOf(SideEnum.class, str);
    }

    public static SideEnum[] values() {
        return (SideEnum[]) $VALUES.clone();
    }

    public SideEnum(String str, int i) {
    }

    static {
        SideEnum[] sideEnumArr$values = $values();
        $VALUES = sideEnumArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(sideEnumArr$values);
    }
}

