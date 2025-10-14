package com.blackhub.bronline.game.gui.calendar.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.apache.ivy.ant.IvyCleanCache;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CalendarScreenType.kt */
/* loaded from: classes.dex */
public final class CalendarScreenType {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ CalendarScreenType[] $VALUES;
    public static final CalendarScreenType NONE = new CalendarScreenType(IvyCleanCache.NONE, 0);
    public static final CalendarScreenType MAIN = new CalendarScreenType("MAIN", 1);
    public static final CalendarScreenType COME_BACK = new CalendarScreenType("COME_BACK", 2);

    public static final /* synthetic */ CalendarScreenType[] $values() {
        return new CalendarScreenType[]{NONE, MAIN, COME_BACK};
    }

    @NotNull
    public static EnumEntries<CalendarScreenType> getEntries() {
        return $ENTRIES;
    }

    public static CalendarScreenType valueOf(String str) {
        return (CalendarScreenType) Enum.valueOf(CalendarScreenType.class, str);
    }

    public static CalendarScreenType[] values() {
        return (CalendarScreenType[]) $VALUES.clone();
    }

    public CalendarScreenType(String str, int i) {
    }

    static {
        CalendarScreenType[] calendarScreenTypeArr$values = $values();
        $VALUES = calendarScreenTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(calendarScreenTypeArr$values);
    }
}

