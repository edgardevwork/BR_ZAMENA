package org.apache.commons.lang3.time;

import java.util.Calendar;
import java.util.Objects;

/* loaded from: classes8.dex */
public class CalendarUtils {
    public static final CalendarUtils INSTANCE = new CalendarUtils(Calendar.getInstance());
    public final Calendar calendar;

    public CalendarUtils(Calendar calendar) {
        Objects.requireNonNull(calendar, "calendar");
        this.calendar = calendar;
    }

    public int getDayOfMonth() {
        return this.calendar.get(5);
    }

    public int getMonth() {
        return this.calendar.get(2);
    }

    public int getYear() {
        return this.calendar.get(1);
    }
}
