package com.blackhub.bronline.game.core.utils.draganddrop.enums;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CurrentTargetArea.kt */
@Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m7105d2 = {"Lcom/blackhub/bronline/game/core/utils/draganddrop/enums/CurrentTargetArea;", "", "(Ljava/lang/String;I)V", "TARGET_AREA_ONE", "TARGET_AREA_TWO", "TARGET_AREA_THREE", "TARGET_AREA_FOUR", "TARGET_AREA_FIVE", "TARGET_AREA_FUSE_ONE", "TARGET_AREA_FUSE_TWO", "TARGET_AREA_FUSE_THREE", "TARGET_AREA_FUSE_FOUR", "TARGET_AREA_GLASS_SMALL", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
