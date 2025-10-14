package androidx.compose.material3;

import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.internal.bind.TypeAdapters;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.format.DecimalStyle;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CalendarModelImpl.android.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005J$\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00112\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0016J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u0014\u0010\u001a\u001a\u00020\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0016J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u000bH\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u000bH\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0007H\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u0018\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u0007H\u0016J\u001a\u0010'\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0011H\u0016J\u0018\u0010(\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u0007H\u0016J\b\u0010*\u001a\u00020\u0011H\u0016J\f\u0010+\u001a\u00020!*\u00020\u000bH\u0002J\f\u0010+\u001a\u00020!*\u00020\u001fH\u0002R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR&\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00100\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006-"}, m7105d2 = {"Landroidx/compose/material3/CalendarModelImpl;", "Landroidx/compose/material3/CalendarModel;", "locale", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "(Ljava/util/Locale;)V", "firstDayOfWeek", "", "getFirstDayOfWeek", "()I", "today", "Landroidx/compose/material3/CalendarDate;", "getToday", "()Landroidx/compose/material3/CalendarDate;", "weekdayNames", "", "Lkotlin/Pair;", "", "getWeekdayNames", "()Ljava/util/List;", "formatWithPattern", "utcTimeMillis", "", "pattern", "getCanonicalDate", "timeInMillis", "getDateInputFormat", "Landroidx/compose/material3/DateInputFormat;", "getDayOfWeek", "date", "getMonth", "Landroidx/compose/material3/CalendarMonth;", "firstDayLocalDate", "Ljava/time/LocalDate;", TypeAdapters.C786626.YEAR, TypeAdapters.C786626.MONTH, "minusMonths", "from", "subtractedMonthsCount", "parse", "plusMonths", "addedMonthsCount", "toString", "toLocalDate", "Companion", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@RequiresApi(26)
@SourceDebugExtension({"SMAP\nCalendarModelImpl.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarModelImpl.android.kt\nandroidx/compose/material3/CalendarModelImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,235:1\n11335#2:236\n11670#2,3:237\n*S KotlinDebug\n*F\n+ 1 CalendarModelImpl.android.kt\nandroidx/compose/material3/CalendarModelImpl\n*L\n62#1:236\n62#1:237,3\n*E\n"})
/* loaded from: classes4.dex */
public final class CalendarModelImpl extends CalendarModel {
    private final int firstDayOfWeek;

    @NotNull
    private final List<Pair<String, String>> weekdayNames;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final ZoneId utcTimeZoneId = ZoneId.of("UTC");

    public CalendarModelImpl(@NotNull Locale locale) {
        super(locale);
        this.firstDayOfWeek = WeekFields.of(locale).getFirstDayOfWeek().getValue();
        DayOfWeek[] dayOfWeekArrValues = DayOfWeek.values();
        ArrayList arrayList = new ArrayList(dayOfWeekArrValues.length);
        for (DayOfWeek dayOfWeek : dayOfWeekArrValues) {
            arrayList.add(TuplesKt.m7112to(dayOfWeek.getDisplayName(TextStyle.FULL, locale), dayOfWeek.getDisplayName(TextStyle.NARROW, locale)));
        }
        this.weekdayNames = arrayList;
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public CalendarDate getToday() {
        LocalDate localDateNow = LocalDate.now();
        return new CalendarDate(localDateNow.getYear(), localDateNow.getMonthValue(), localDateNow.getDayOfMonth(), localDateNow.atTime(LocalTime.MIDNIGHT).atZone(utcTimeZoneId).toInstant().toEpochMilli());
    }

    @Override // androidx.compose.material3.CalendarModel
    public int getFirstDayOfWeek() {
        return this.firstDayOfWeek;
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public List<Pair<String, String>> getWeekdayNames() {
        return this.weekdayNames;
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public DateInputFormat getDateInputFormat(@NotNull Locale locale) {
        return CalendarModelKt.datePatternAsInputFormat(DateTimeFormatterBuilder.getLocalizedDateTimePattern(FormatStyle.SHORT, null, Chronology.ofLocale(locale), locale));
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public CalendarDate getCanonicalDate(long timeInMillis) {
        LocalDate localDate = Instant.ofEpochMilli(timeInMillis).atZone(utcTimeZoneId).toLocalDate();
        return new CalendarDate(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth(), localDate.atStartOfDay().toEpochSecond(ZoneOffset.UTC) * 1000);
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public CalendarMonth getMonth(long timeInMillis) {
        return getMonth(Instant.ofEpochMilli(timeInMillis).atZone(utcTimeZoneId).withDayOfMonth(1).toLocalDate());
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public CalendarMonth getMonth(@NotNull CalendarDate date) {
        return getMonth(LocalDate.of(date.getYear(), date.getMonth(), 1));
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public CalendarMonth getMonth(int i, int i2) {
        return getMonth(LocalDate.of(i, i2, 1));
    }

    @Override // androidx.compose.material3.CalendarModel
    public int getDayOfWeek(@NotNull CalendarDate date) {
        return toLocalDate(date).getDayOfWeek().getValue();
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public CalendarMonth plusMonths(@NotNull CalendarMonth from, int addedMonthsCount) {
        return addedMonthsCount <= 0 ? from : getMonth(toLocalDate(from).plusMonths(addedMonthsCount));
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public CalendarMonth minusMonths(@NotNull CalendarMonth from, int subtractedMonthsCount) {
        return subtractedMonthsCount <= 0 ? from : getMonth(toLocalDate(from).minusMonths(subtractedMonthsCount));
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public String formatWithPattern(long utcTimeMillis, @NotNull String pattern, @NotNull Locale locale) {
        return INSTANCE.formatWithPattern(utcTimeMillis, pattern, locale, getFormatterCache$material3_release());
    }

    @Override // androidx.compose.material3.CalendarModel
    @Nullable
    public CalendarDate parse(@NotNull String date, @NotNull String pattern) {
        try {
            LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern(pattern));
            return new CalendarDate(localDate.getYear(), localDate.getMonth().getValue(), localDate.getDayOfMonth(), localDate.atTime(LocalTime.MIDNIGHT).atZone(utcTimeZoneId).toInstant().toEpochMilli());
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    @NotNull
    public String toString() {
        return "CalendarModel";
    }

    /* compiled from: CalendarModelImpl.android.kt */
    @Metadata(m7104d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\n\u0010\f\u001a\u00060\rj\u0002`\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0010J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\b2\n\u0010\f\u001a\u00060\rj\u0002`\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0010H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, m7105d2 = {"Landroidx/compose/material3/CalendarModelImpl$Companion;", "", "()V", "utcTimeZoneId", "Ljava/time/ZoneId;", "getUtcTimeZoneId$material3_release", "()Ljava/time/ZoneId;", "formatWithPattern", "", "utcTimeMillis", "", "pattern", "locale", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "cache", "", "getCachedDateTimeFormatter", "Ljava/time/format/DateTimeFormatter;", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nCalendarModelImpl.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarModelImpl.android.kt\nandroidx/compose/material3/CalendarModelImpl$Companion\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,235:1\n361#2,7:236\n*S KotlinDebug\n*F\n+ 1 CalendarModelImpl.android.kt\nandroidx/compose/material3/CalendarModelImpl$Companion\n*L\n197#1:236,7\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final String formatWithPattern(long utcTimeMillis, @NotNull String pattern, @NotNull Locale locale, @NotNull Map<String, Object> cache) {
            return Instant.ofEpochMilli(utcTimeMillis).atZone(getUtcTimeZoneId$material3_release()).toLocalDate().format(getCachedDateTimeFormatter(pattern, locale, cache));
        }

        @NotNull
        public final ZoneId getUtcTimeZoneId$material3_release() {
            return CalendarModelImpl.utcTimeZoneId;
        }

        private final DateTimeFormatter getCachedDateTimeFormatter(String pattern, Locale locale, Map<String, Object> cache) {
            String str = "P:" + pattern + locale.toLanguageTag();
            Object objWithDecimalStyle = cache.get(str);
            if (objWithDecimalStyle == null) {
                objWithDecimalStyle = DateTimeFormatter.ofPattern(pattern, locale).withDecimalStyle(DecimalStyle.of(locale));
                cache.put(str, objWithDecimalStyle);
            }
            Intrinsics.checkNotNull(objWithDecimalStyle, "null cannot be cast to non-null type java.time.format.DateTimeFormatter");
            return CalendarModelImpl$Companion$$ExternalSyntheticApiModelOutline3.m90m(objWithDecimalStyle);
        }
    }

    private final CalendarMonth getMonth(LocalDate firstDayLocalDate) {
        int value = firstDayLocalDate.getDayOfWeek().getValue() - getFirstDayOfWeek();
        if (value < 0) {
            value += 7;
        }
        return new CalendarMonth(firstDayLocalDate.getYear(), firstDayLocalDate.getMonthValue(), firstDayLocalDate.lengthOfMonth(), value, firstDayLocalDate.atTime(LocalTime.MIDNIGHT).atZone(utcTimeZoneId).toInstant().toEpochMilli());
    }

    private final LocalDate toLocalDate(CalendarMonth calendarMonth) {
        return Instant.ofEpochMilli(calendarMonth.getStartUtcTimeMillis()).atZone(utcTimeZoneId).toLocalDate();
    }

    private final LocalDate toLocalDate(CalendarDate calendarDate) {
        return LocalDate.of(calendarDate.getYear(), calendarDate.getMonth(), calendarDate.getDayOfMonth());
    }
}
