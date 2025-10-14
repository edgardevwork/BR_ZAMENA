package com.blackhub.bronline.game.core.utils;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.DateExtensionKt;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DateFormatter.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nDateFormatter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateFormatter.kt\ncom/blackhub/bronline/game/core/utils/DateFormatter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1#2:118\n*E\n"})
/* loaded from: classes3.dex */
public final class DateFormatter {

    @NotNull
    public static final String DD_MMMM = "dd MMMM";

    @NotNull
    public static final String DD_MM_YYYY = "dd.MM.yyyy";

    @NotNull
    public static final String DD_MM_YYYY_HH_MM = "dd.MM.yyyy HH:mm";

    @NotNull
    public static final String D_MMMM_YYYY = "d MMMM yyyy";

    @NotNull
    public static final String ISO_8601_Z = "yyyy-MM-dd'T'HH:mm:ssZZZZ";

    @NotNull
    public static final String MMMM = "MMMM";

    @NotNull
    public static final String YYYY_MM_DD = "yyyy-MM-dd";

    @NotNull
    public static final DateFormatter INSTANCE = new DateFormatter();

    @NotNull
    public static final Locale ruLocale = new Locale("ru", "RU");
    public static final int $stable = 8;

    @NotNull
    public final String ddMMyyyyFormat(long millsInSecond) {
        String str = new SimpleDateFormat(DD_MM_YYYY, ruLocale).format(new Date(millsInSecond));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public final String mmssFormat(long millsInSecond) {
        String str = new SimpleDateFormat("mm:ss", ruLocale).format(new Date(millsInSecond));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public final String ddMMMMFormat(long millsInSecond) {
        String str = new SimpleDateFormat(DD_MMMM, ruLocale).format(new Date(millsInSecond));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public final String MMMMFormat(long millsInSecond) {
        String str = new SimpleDateFormat(MMMM, ruLocale).format(new Date(millsInSecond));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public final String ddMMMMyyyyFormat(long millsInSecond) {
        String str = new SimpleDateFormat("dd MMMM yyyy", ruLocale).format(new Date(millsInSecond));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public final String yyyyMMddWithDashesFormat(long millis) {
        try {
            String str = new SimpleDateFormat("yyyy-MM-dd", ruLocale).format(Long.valueOf(millis));
            Intrinsics.checkNotNull(str);
            return str;
        } catch (IllegalArgumentException e) {
            Log.e("TAG", "yyyyMMddWithDashesFormat: e " + e);
            return AnyExtensionKt.empty(this);
        }
    }

    @NotNull
    public final String iso8601ToDdMMyyyy(@NotNull String isoDate) {
        Intrinsics.checkNotNullParameter(isoDate, "isoDate");
        Long iso8601ToLong = parseIso8601ToLong(isoDate);
        String strDdMMyyyyFormat = iso8601ToLong != null ? INSTANCE.ddMMyyyyFormat(iso8601ToLong.longValue()) : null;
        return strDdMMyyyyFormat == null ? "" : strDdMMyyyyFormat;
    }

    @Nullable
    public final Long iso8601ToDdMMyyyyZZZZ(@NotNull String isoDate) throws ParseException {
        Intrinsics.checkNotNullParameter(isoDate, "isoDate");
        try {
            Date date = new SimpleDateFormat(ISO_8601_Z, ruLocale).parse(isoDate);
            if (date != null) {
                return Long.valueOf(date.getTime());
            }
            return null;
        } catch (ParseException unused) {
            return null;
        }
    }

    public final boolean isDate(@NotNull String dateText, @NotNull String pattern) throws ParseException {
        Intrinsics.checkNotNullParameter(dateText, "dateText");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        try {
            new SimpleDateFormat(pattern, ruLocale).parse(dateText);
            return true;
        } catch (ParseException unused) {
            return false;
        }
    }

    @Nullable
    public final Integer getDayDiff(@NotNull String date) throws ParseException {
        Intrinsics.checkNotNullParameter(date, "date");
        Long lIso8601ToDdMMyyyyZZZZ = INSTANCE.iso8601ToDdMMyyyyZZZZ(date);
        if (lIso8601ToDdMMyyyyZZZZ == null) {
            return null;
        }
        long jLongValue = lIso8601ToDdMMyyyyZZZZ.longValue();
        return Integer.valueOf((int) Math.abs(DateExtensionKt.getStartOfTheDayByTimestamp(jLongValue) - DateExtensionKt.getStartOfTheDayByTimestamp(Calendar.getInstance().getTimeInMillis())));
    }

    @Nullable
    public final Long parseIso8601ToLong(@NotNull String isoDate) {
        Intrinsics.checkNotNullParameter(isoDate, "isoDate");
        return parseToLong(isoDate, ISO_8601_Z);
    }

    @NotNull
    public final String formatToDdMonthYYYY(long millsInSecond) {
        String str = new SimpleDateFormat("dd MMMM yyyy", ruLocale).format(Long.valueOf(millsInSecond));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @Nullable
    public final Long parseToLong(@NotNull String date, @NotNull String pattern) throws ParseException {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        try {
            Date date2 = new SimpleDateFormat(pattern, ruLocale).parse(date);
            if (date2 != null) {
                return Long.valueOf(date2.getTime());
            }
            return null;
        } catch (ParseException unused) {
            return null;
        }
    }

    @NotNull
    public final String formatToDate(long millsInSecond, @NotNull String pattern) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, ruLocale);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Europe/Moscow"));
        String str = simpleDateFormat.format(Long.valueOf(millsInSecond));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public final String transformDateFormat(@NotNull String str, @NotNull String patterFrom, @NotNull String patterTo) throws ParseException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(patterFrom, "patterFrom");
        Intrinsics.checkNotNullParameter(patterTo, "patterTo");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(patterTo, Locale.getDefault());
        Date date = new SimpleDateFormat(patterFrom, Locale.getDefault()).parse(str);
        if (date == null) {
            date = new Date();
        }
        String str2 = simpleDateFormat.format(date);
        return str2 == null ? "" : str2;
    }
}

