package com.blackhub.bronline.game.gui.calendar.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.apache.ivy.ant.IvyCleanCache;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CalendarScreenType.kt */
@Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/calendar/model/CalendarScreenType;", "", "(Ljava/lang/String;I)V", IvyCleanCache.NONE, "MAIN", "COME_BACK", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
