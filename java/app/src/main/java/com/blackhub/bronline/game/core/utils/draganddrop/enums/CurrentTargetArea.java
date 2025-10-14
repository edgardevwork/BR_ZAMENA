package com.blackhub.bronline.game.core.utils.draganddrop.enums;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CurrentTargetArea.kt */
/* loaded from: classes3.dex */
public final class CurrentTargetArea {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ CurrentTargetArea[] $VALUES;
    public static final CurrentTargetArea TARGET_AREA_ONE = new CurrentTargetArea("TARGET_AREA_ONE", 0);
    public static final CurrentTargetArea TARGET_AREA_TWO = new CurrentTargetArea("TARGET_AREA_TWO", 1);
    public static final CurrentTargetArea TARGET_AREA_THREE = new CurrentTargetArea("TARGET_AREA_THREE", 2);
    public static final CurrentTargetArea TARGET_AREA_FOUR = new CurrentTargetArea("TARGET_AREA_FOUR", 3);
    public static final CurrentTargetArea TARGET_AREA_FIVE = new CurrentTargetArea("TARGET_AREA_FIVE", 4);
    public static final CurrentTargetArea TARGET_AREA_FUSE_ONE = new CurrentTargetArea("TARGET_AREA_FUSE_ONE", 5);
    public static final CurrentTargetArea TARGET_AREA_FUSE_TWO = new CurrentTargetArea("TARGET_AREA_FUSE_TWO", 6);
    public static final CurrentTargetArea TARGET_AREA_FUSE_THREE = new CurrentTargetArea("TARGET_AREA_FUSE_THREE", 7);
    public static final CurrentTargetArea TARGET_AREA_FUSE_FOUR = new CurrentTargetArea("TARGET_AREA_FUSE_FOUR", 8);
    public static final CurrentTargetArea TARGET_AREA_GLASS_SMALL = new CurrentTargetArea("TARGET_AREA_GLASS_SMALL", 9);

    public static final /* synthetic */ CurrentTargetArea[] $values() {
        return new CurrentTargetArea[]{TARGET_AREA_ONE, TARGET_AREA_TWO, TARGET_AREA_THREE, TARGET_AREA_FOUR, TARGET_AREA_FIVE, TARGET_AREA_FUSE_ONE, TARGET_AREA_FUSE_TWO, TARGET_AREA_FUSE_THREE, TARGET_AREA_FUSE_FOUR, TARGET_AREA_GLASS_SMALL};
    }

    @NotNull
    public static EnumEntries<CurrentTargetArea> getEntries() {
        return $ENTRIES;
    }

    public static CurrentTargetArea valueOf(String str) {
        return (CurrentTargetArea) Enum.valueOf(CurrentTargetArea.class, str);
    }

    public static CurrentTargetArea[] values() {
        return (CurrentTargetArea[]) $VALUES.clone();
    }

    public CurrentTargetArea(String str, int i) {
    }

    static {
        CurrentTargetArea[] currentTargetAreaArr$values = $values();
        $VALUES = currentTargetAreaArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(currentTargetAreaArr$values);
    }
}

