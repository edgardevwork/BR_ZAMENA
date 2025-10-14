package com.blackhub.bronline.game.core.utils.draganddrop.enums;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CurrentElement.kt */
/* loaded from: classes3.dex */
public final class CurrentElement {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ CurrentElement[] $VALUES;
    public static final CurrentElement ELEMENT_ONE = new CurrentElement("ELEMENT_ONE", 0);
    public static final CurrentElement ELEMENT_TWO = new CurrentElement("ELEMENT_TWO", 1);
    public static final CurrentElement ELEMENT_THREE = new CurrentElement("ELEMENT_THREE", 2);

    public static final /* synthetic */ CurrentElement[] $values() {
        return new CurrentElement[]{ELEMENT_ONE, ELEMENT_TWO, ELEMENT_THREE};
    }

    @NotNull
    public static EnumEntries<CurrentElement> getEntries() {
        return $ENTRIES;
    }

    public static CurrentElement valueOf(String str) {
        return (CurrentElement) Enum.valueOf(CurrentElement.class, str);
    }

    public static CurrentElement[] values() {
        return (CurrentElement[]) $VALUES.clone();
    }

    public CurrentElement(String str, int i) {
    }

    static {
        CurrentElement[] currentElementArr$values = $values();
        $VALUES = currentElementArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(currentElementArr$values);
    }
}

