package androidx.compose.material3;

import android.os.Build;
import android.text.format.DateFormat;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: CalendarModel.android.kt */
@Metadata(m7104d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0001\u001a8\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000bH\u0007¨\u0006\r"}, m7105d2 = {"createCalendarModel", "Landroidx/compose/material3/CalendarModel;", "locale", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "formatWithSkeleton", "", "utcTimeMillis", "", "skeleton", "cache", "", "", "material3_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCalendarModel.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarModel.android.kt\nandroidx/compose/material3/CalendarModel_androidKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,67:1\n361#2,7:68\n*S KotlinDebug\n*F\n+ 1 CalendarModel.android.kt\nandroidx/compose/material3/CalendarModel_androidKt\n*L\n58#1:68,7\n*E\n"})
/* loaded from: classes3.dex */
public final class CalendarModel_androidKt {
    @ExperimentalMaterial3Api
    @NotNull
    public static final CalendarModel createCalendarModel(@NotNull Locale locale) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new CalendarModelImpl(locale);
        }
        return new LegacyCalendarModelImpl(locale);
    }

    @ExperimentalMaterial3Api
    @NotNull
    public static final String formatWithSkeleton(long j, @NotNull String str, @NotNull Locale locale, @NotNull Map<String, Object> map) {
        String str2 = "S:" + str + locale.toLanguageTag();
        Object bestDateTimePattern = map.get(str2);
        if (bestDateTimePattern == null) {
            bestDateTimePattern = DateFormat.getBestDateTimePattern(locale, str);
            map.put(str2, bestDateTimePattern);
        }
        String string = bestDateTimePattern.toString();
        if (Build.VERSION.SDK_INT >= 26) {
            return CalendarModelImpl.INSTANCE.formatWithPattern(j, string, locale, map);
        }
        return LegacyCalendarModelImpl.INSTANCE.formatWithPattern(j, string, locale, map);
    }
}
