package com.blackhub.bronline.game.core.utils.draganddrop.enums;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CurrentDraggableItem.kt */
@Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/game/core/utils/draganddrop/enums/CurrentDraggableItem;", "", "(Ljava/lang/String;I)V", "ELEMENT_ONE", "ELEMENT_TWO", "ELEMENT_THREE", "PROBE_RED", "PROBE_BLACK", "ELEMENT_BULB", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
