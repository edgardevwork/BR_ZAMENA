package io.ktor.http;

import androidx.media3.datasource.cache.CacheFileMetadataIndex;
import io.ktor.util.date.GMTDate;
import io.ktor.util.date.GMTDateParser;
import io.ktor.util.date.InvalidDateStringException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.apache.commons.lang3.time.TimeZones;
import org.jetbrains.annotations.NotNull;

/* compiled from: DateUtils.kt */
@Metadata(m7104d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0002\u001a\u0014\u0010\u0006\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002\u001a\n\u0010\t\u001a\u00020\u0002*\u00020\u0004\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m7105d2 = {"HTTP_DATE_FORMATS", "", "", "fromCookieToGmtDate", "Lio/ktor/util/date/GMTDate;", "fromHttpToGmtDate", "padZero", "", CacheFileMetadataIndex.COLUMN_LENGTH, "toHttpDate", "ktor-http"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public final class DateUtilsKt {

    @NotNull
    public static final List<String> HTTP_DATE_FORMATS = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"***, dd MMM YYYY hh:mm:ss zzz", "****, dd-MMM-YYYY hh:mm:ss zzz", "*** MMM d hh:mm:ss YYYY", "***, dd-MMM-YYYY hh:mm:ss zzz", "***, dd-MMM-YYYY hh-mm-ss zzz", "***, dd MMM YYYY hh:mm:ss zzz", "*** dd-MMM-YYYY hh:mm:ss zzz", "*** dd MMM YYYY hh:mm:ss zzz", "*** dd-MMM-YYYY hh-mm-ss zzz", "***,dd-MMM-YYYY hh:mm:ss zzz", "*** MMM d YYYY hh:mm:ss zzz"});

    @NotNull
    public static final GMTDate fromHttpToGmtDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String string = StringsKt__StringsKt.trim((CharSequence) str).toString();
        Iterator<String> it = HTTP_DATE_FORMATS.iterator();
        while (it.hasNext()) {
            try {
                return new GMTDateParser(it.next()).parse(str);
            } catch (InvalidDateStringException unused) {
            }
        }
        throw new IllegalStateException(("Failed to parse date: " + string).toString());
    }

    @NotNull
    public static final GMTDate fromCookieToGmtDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String string = StringsKt__StringsKt.trim((CharSequence) str).toString();
        try {
            return new CookieDateParser().parse(string);
        } catch (InvalidCookieDateException unused) {
            return fromHttpToGmtDate(string);
        }
    }

    @NotNull
    public static final String toHttpDate(@NotNull GMTDate gMTDate) {
        Intrinsics.checkNotNullParameter(gMTDate, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append(gMTDate.getDayOfWeek().getValue() + ", ");
        sb.append(padZero(gMTDate.getDayOfMonth(), 2) + ' ');
        sb.append(gMTDate.getMonth().getValue() + ' ');
        sb.append(padZero(gMTDate.getYear(), 4));
        sb.append(' ' + padZero(gMTDate.getHours(), 2) + ':' + padZero(gMTDate.getMinutes(), 2) + ':' + padZero(gMTDate.getSeconds(), 2) + ' ');
        sb.append(TimeZones.GMT_ID);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final String padZero(int i, int i2) {
        return StringsKt__StringsKt.padStart(String.valueOf(i), i2, '0');
    }
}
