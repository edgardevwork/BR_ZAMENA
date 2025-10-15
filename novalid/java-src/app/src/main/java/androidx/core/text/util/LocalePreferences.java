package androidx.core.text.util;

import android.icu.number.NumberFormatter;
import android.icu.number.UnlocalizedNumberFormatter;
import android.icu.text.DateFormat;
import android.icu.text.DateTimePatternGenerator;
import android.icu.util.MeasureUnit;
import android.os.Build;
import android.text.format.DateFormat;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import org.apache.commons.lang3.time.DurationFormatUtils;

@RequiresApi(21)
/* loaded from: classes2.dex */
public final class LocalePreferences {
    public static final String TAG = "LocalePreferences";
    public static final String[] WEATHER_FAHRENHEIT_COUNTRIES = {"BS", "BZ", "KY", "PR", "PW", "US"};

    public static class CalendarType {
        public static final String CHINESE = "chinese";
        public static final String DANGI = "dangi";
        public static final String DEFAULT = "";
        public static final String GREGORIAN = "gregorian";
        public static final String HEBREW = "hebrew";
        public static final String INDIAN = "indian";
        public static final String ISLAMIC = "islamic";
        public static final String ISLAMIC_CIVIL = "islamic-civil";
        public static final String ISLAMIC_RGSA = "islamic-rgsa";
        public static final String ISLAMIC_TBLA = "islamic-tbla";
        public static final String ISLAMIC_UMALQURA = "islamic-umalqura";
        public static final String PERSIAN = "persian";
        public static final String U_EXTENSION_TAG = "ca";

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public @interface CalendarTypes {
        }
    }

    public static class FirstDayOfWeek {
        public static final String DEFAULT = "";
        public static final String FRIDAY = "fri";
        public static final String MONDAY = "mon";
        public static final String SATURDAY = "sat";
        public static final String SUNDAY = "sun";
        public static final String THURSDAY = "thu";
        public static final String TUESDAY = "tue";
        public static final String U_EXTENSION_TAG = "fw";
        public static final String WEDNESDAY = "wed";

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public @interface Days {
        }
    }

    public static class HourCycle {
        public static final String DEFAULT = "";
        public static final String H11 = "h11";
        public static final String H12 = "h12";
        public static final String H23 = "h23";
        public static final String H24 = "h24";
        public static final String U_EXTENSION_TAG = "hc";

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public @interface HourCycleTypes {
        }
    }

    public static class TemperatureUnit {
        public static final String CELSIUS = "celsius";
        public static final String DEFAULT = "";
        public static final String FAHRENHEIT = "fahrenhe";
        public static final String KELVIN = "kelvin";
        public static final String U_EXTENSION_TAG = "mu";

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public @interface TemperatureUnits {
        }
    }

    @NonNull
    public static String getHourCycle() {
        return getHourCycle(true);
    }

    @NonNull
    public static String getHourCycle(@NonNull Locale locale) {
        return getHourCycle(locale, true);
    }

    @NonNull
    public static String getHourCycle(boolean z) {
        return getHourCycle(Api24Impl.getDefaultLocale(), z);
    }

    @NonNull
    public static String getHourCycle(@NonNull Locale locale, boolean z) {
        String unicodeLocaleType = getUnicodeLocaleType(HourCycle.U_EXTENSION_TAG, "", locale, z);
        if (unicodeLocaleType != null) {
            return unicodeLocaleType;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return Api33Impl.getHourCycle(locale);
        }
        return getBaseHourCycle(locale);
    }

    @NonNull
    public static String getCalendarType() {
        return getCalendarType(true);
    }

    @NonNull
    public static String getCalendarType(@NonNull Locale locale) {
        return getCalendarType(locale, true);
    }

    @NonNull
    public static String getCalendarType(boolean z) {
        return getCalendarType(Api24Impl.getDefaultLocale(), z);
    }

    @NonNull
    public static String getCalendarType(@NonNull Locale locale, boolean z) {
        String unicodeLocaleType = getUnicodeLocaleType("ca", "", locale, z);
        return unicodeLocaleType != null ? unicodeLocaleType : Api24Impl.getCalendarType(locale);
    }

    @NonNull
    public static String getTemperatureUnit() {
        return getTemperatureUnit(true);
    }

    @NonNull
    public static String getTemperatureUnit(@NonNull Locale locale) {
        return getTemperatureUnit(locale, true);
    }

    @NonNull
    public static String getTemperatureUnit(boolean z) {
        return getTemperatureUnit(Api24Impl.getDefaultLocale(), z);
    }

    @NonNull
    public static String getTemperatureUnit(@NonNull Locale locale, boolean z) {
        String unicodeLocaleType = getUnicodeLocaleType(TemperatureUnit.U_EXTENSION_TAG, "", locale, z);
        if (unicodeLocaleType != null) {
            return unicodeLocaleType;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return Api33Impl.getResolvedTemperatureUnit(locale);
        }
        return getTemperatureHardCoded(locale);
    }

    @NonNull
    public static String getFirstDayOfWeek() {
        return getFirstDayOfWeek(true);
    }

    @NonNull
    public static String getFirstDayOfWeek(@NonNull Locale locale) {
        return getFirstDayOfWeek(locale, true);
    }

    @NonNull
    public static String getFirstDayOfWeek(boolean z) {
        return getFirstDayOfWeek(Api24Impl.getDefaultLocale(), z);
    }

    @NonNull
    public static String getFirstDayOfWeek(@NonNull Locale locale, boolean z) {
        String unicodeLocaleType = getUnicodeLocaleType(FirstDayOfWeek.U_EXTENSION_TAG, "", locale, z);
        return unicodeLocaleType != null ? unicodeLocaleType : getBaseFirstDayOfWeek(locale);
    }

    public static String getUnicodeLocaleType(String str, String str2, Locale locale, boolean z) {
        String unicodeLocaleType = locale.getUnicodeLocaleType(str);
        if (unicodeLocaleType != null) {
            return unicodeLocaleType;
        }
        if (z) {
            return null;
        }
        return str2;
    }

    public static String getTemperatureHardCoded(Locale locale) {
        if (Arrays.binarySearch(WEATHER_FAHRENHEIT_COUNTRIES, locale.getCountry()) >= 0) {
            return TemperatureUnit.FAHRENHEIT;
        }
        return TemperatureUnit.CELSIUS;
    }

    public static String getBaseHourCycle(@NonNull Locale locale) {
        return DateFormat.getBestDateTimePattern(locale, "jm").contains(DurationFormatUtils.f9908H) ? HourCycle.H23 : HourCycle.H12;
    }

    public static String getBaseFirstDayOfWeek(@NonNull Locale locale) {
        return getStringOfFirstDayOfWeek(Calendar.getInstance(locale).getFirstDayOfWeek());
    }

    public static String getStringOfFirstDayOfWeek(int i) {
        return (i < 1 || i > 7) ? "" : new String[]{FirstDayOfWeek.SUNDAY, FirstDayOfWeek.MONDAY, FirstDayOfWeek.TUESDAY, FirstDayOfWeek.WEDNESDAY, FirstDayOfWeek.THURSDAY, FirstDayOfWeek.FRIDAY, FirstDayOfWeek.SATURDAY}[i - 1];
    }

    public static Locale getDefaultLocale() {
        return Locale.getDefault();
    }

    @RequiresApi(24)
    public static class Api24Impl {
        @DoNotInline
        public static String getCalendarType(@NonNull Locale locale) {
            return android.icu.util.Calendar.getInstance(locale).getType();
        }

        @DoNotInline
        public static Locale getDefaultLocale() {
            return Locale.getDefault(Locale.Category.FORMAT);
        }
    }

    @RequiresApi(33)
    public static class Api33Impl {
        @DoNotInline
        public static String getResolvedTemperatureUnit(@NonNull Locale locale) {
            String identifier = ((UnlocalizedNumberFormatter) ((UnlocalizedNumberFormatter) NumberFormatter.with().usage("weather")).unit(MeasureUnit.CELSIUS)).locale(locale).format(1L).getOutputUnit().getIdentifier();
            return identifier.startsWith(TemperatureUnit.FAHRENHEIT) ? TemperatureUnit.FAHRENHEIT : identifier;
        }

        @DoNotInline
        public static String getHourCycle(@NonNull Locale locale) {
            return getHourCycleType(DateTimePatternGenerator.getInstance(locale).getDefaultHourCycle());
        }

        public static String getHourCycleType(DateFormat.HourCycle hourCycle) {
            int i = C22331.$SwitchMap$android$icu$text$DateFormat$HourCycle[hourCycle.ordinal()];
            if (i == 1) {
                return HourCycle.H11;
            }
            if (i == 2) {
                return HourCycle.H12;
            }
            if (i == 3) {
                return HourCycle.H23;
            }
            if (i == 4) {
                return HourCycle.H24;
            }
            return "";
        }
    }

    /* renamed from: androidx.core.text.util.LocalePreferences$1 */
    public static /* synthetic */ class C22331 {
        public static final /* synthetic */ int[] $SwitchMap$android$icu$text$DateFormat$HourCycle;

        static {
            int[] iArr = new int[DateFormat.HourCycle.values().length];
            $SwitchMap$android$icu$text$DateFormat$HourCycle = iArr;
            try {
                iArr[DateFormat.HourCycle.HOUR_CYCLE_11.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$icu$text$DateFormat$HourCycle[DateFormat.HourCycle.HOUR_CYCLE_12.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$icu$text$DateFormat$HourCycle[DateFormat.HourCycle.HOUR_CYCLE_23.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$icu$text$DateFormat$HourCycle[DateFormat.HourCycle.HOUR_CYCLE_24.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }
}
