package com.blackhub.bronline.game.gui.electric.enums;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NumberProgressBarEnum.kt */
/* loaded from: classes3.dex */
public final class NumberProgressBarEnum {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ NumberProgressBarEnum[] $VALUES;
    public static final NumberProgressBarEnum PROGRESS_BAR_ONE = new NumberProgressBarEnum("PROGRESS_BAR_ONE", 0);
    public static final NumberProgressBarEnum PROGRESS_BAR_TWO = new NumberProgressBarEnum("PROGRESS_BAR_TWO", 1);
    public static final NumberProgressBarEnum PROGRESS_BAR_THREE = new NumberProgressBarEnum("PROGRESS_BAR_THREE", 2);
    public static final NumberProgressBarEnum PROGRESS_BAR_FOUR = new NumberProgressBarEnum("PROGRESS_BAR_FOUR", 3);

    public static final /* synthetic */ NumberProgressBarEnum[] $values() {
        return new NumberProgressBarEnum[]{PROGRESS_BAR_ONE, PROGRESS_BAR_TWO, PROGRESS_BAR_THREE, PROGRESS_BAR_FOUR};
    }

    @NotNull
    public static EnumEntries<NumberProgressBarEnum> getEntries() {
        return $ENTRIES;
    }

    public static NumberProgressBarEnum valueOf(String str) {
        return (NumberProgressBarEnum) Enum.valueOf(NumberProgressBarEnum.class, str);
    }

    public static NumberProgressBarEnum[] values() {
        return (NumberProgressBarEnum[]) $VALUES.clone();
    }

    public NumberProgressBarEnum(String str, int i) {
    }

    static {
        NumberProgressBarEnum[] numberProgressBarEnumArr$values = $values();
        $VALUES = numberProgressBarEnumArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(numberProgressBarEnumArr$values);
    }
}

