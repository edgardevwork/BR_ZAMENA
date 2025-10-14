package com.blackhub.bronline.game.core.utils.draganddrop.enums;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CurrentDraggableItem.kt */
/* loaded from: classes3.dex */
public final class CurrentDraggableItem {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ CurrentDraggableItem[] $VALUES;
    public static final CurrentDraggableItem ELEMENT_ONE = new CurrentDraggableItem("ELEMENT_ONE", 0);
    public static final CurrentDraggableItem ELEMENT_TWO = new CurrentDraggableItem("ELEMENT_TWO", 1);
    public static final CurrentDraggableItem ELEMENT_THREE = new CurrentDraggableItem("ELEMENT_THREE", 2);
    public static final CurrentDraggableItem PROBE_RED = new CurrentDraggableItem("PROBE_RED", 3);
    public static final CurrentDraggableItem PROBE_BLACK = new CurrentDraggableItem("PROBE_BLACK", 4);
    public static final CurrentDraggableItem ELEMENT_BULB = new CurrentDraggableItem("ELEMENT_BULB", 5);

    public static final /* synthetic */ CurrentDraggableItem[] $values() {
        return new CurrentDraggableItem[]{ELEMENT_ONE, ELEMENT_TWO, ELEMENT_THREE, PROBE_RED, PROBE_BLACK, ELEMENT_BULB};
    }

    @NotNull
    public static EnumEntries<CurrentDraggableItem> getEntries() {
        return $ENTRIES;
    }

    public static CurrentDraggableItem valueOf(String str) {
        return (CurrentDraggableItem) Enum.valueOf(CurrentDraggableItem.class, str);
    }

    public static CurrentDraggableItem[] values() {
        return (CurrentDraggableItem[]) $VALUES.clone();
    }

    public CurrentDraggableItem(String str, int i) {
    }

    static {
        CurrentDraggableItem[] currentDraggableItemArr$values = $values();
        $VALUES = currentDraggableItemArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(currentDraggableItemArr$values);
    }
}

