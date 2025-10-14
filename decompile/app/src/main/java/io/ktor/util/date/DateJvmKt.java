package io.ktor.util.date;

import com.google.gson.internal.bind.TypeAdapters;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.lang3.time.TimeZones;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DateJvm.kt */
@Metadata(m7104d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a6\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000f\u001a\u0006\u0010\u0010\u001a\u00020\u000e\u001a\u0019\u0010\u0011\u001a\u00020\u0004*\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u0013\u001a\n\u0010\u0014\u001a\u00020\u0015*\u00020\u0004\"\u0016\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m7105d2 = {"GMT_TIMEZONE", "Ljava/util/TimeZone;", "kotlin.jvm.PlatformType", "GMTDate", "Lio/ktor/util/date/GMTDate;", "seconds", "", "minutes", "hours", TypeAdapters.C786626.DAY_OF_MONTH, TypeAdapters.C786626.MONTH, "Lio/ktor/util/date/Month;", TypeAdapters.C786626.YEAR, "timestamp", "", "(Ljava/lang/Long;)Lio/ktor/util/date/GMTDate;", "getTimeMillis", "toDate", "Ljava/util/Calendar;", "(Ljava/util/Calendar;Ljava/lang/Long;)Lio/ktor/util/date/GMTDate;", "toJvmDate", "Ljava/util/Date;", "ktor-utils"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nDateJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateJvm.kt\nio/ktor/util/date/DateJvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n1#2:79\n*E\n"})
/* loaded from: classes7.dex */
public final class DateJvmKt {
    public static final TimeZone GMT_TIMEZONE = TimeZone.getTimeZone(TimeZones.GMT_ID);

    public static /* synthetic */ GMTDate GMTDate$default(Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        return GMTDate(l);
    }

    @NotNull
    public static final GMTDate GMTDate(@Nullable Long l) {
        Calendar calendar = Calendar.getInstance(GMT_TIMEZONE, Locale.ROOT);
        Intrinsics.checkNotNull(calendar);
        return toDate(calendar, l);
    }

    @NotNull
    public static final GMTDate GMTDate(int i, int i2, int i3, int i4, @NotNull Month month, int i5) {
        Intrinsics.checkNotNullParameter(month, "month");
        Calendar calendar = Calendar.getInstance(GMT_TIMEZONE, Locale.ROOT);
        Intrinsics.checkNotNull(calendar);
        calendar.set(1, i5);
        calendar.set(2, month.ordinal());
        calendar.set(5, i4);
        calendar.set(11, i3);
        calendar.set(12, i2);
        calendar.set(13, i);
        calendar.set(14, 0);
        return toDate(calendar, null);
    }

    @NotNull
    public static final GMTDate toDate(@NotNull Calendar calendar, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(calendar, "<this>");
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return new GMTDate(calendar.get(13), calendar.get(12), calendar.get(11), WeekDay.INSTANCE.from((calendar.get(7) + 5) % 7), calendar.get(5), calendar.get(6), Month.INSTANCE.from(calendar.get(2)), calendar.get(1), calendar.getTimeInMillis() + calendar.get(15) + calendar.get(16));
    }

    @NotNull
    public static final Date toJvmDate(@NotNull GMTDate gMTDate) {
        Intrinsics.checkNotNullParameter(gMTDate, "<this>");
        return new Date(gMTDate.getTimestamp());
    }

    public static final long getTimeMillis() {
        return System.currentTimeMillis();
    }
}
