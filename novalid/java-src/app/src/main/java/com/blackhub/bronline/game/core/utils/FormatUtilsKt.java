package com.blackhub.bronline.game.core.utils;

import com.blackhub.bronline.game.core.constants.TimeConstants;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.gui.blackpass.data.TimerDaysAndHours;
import com.blackhub.bronline.game.gui.blackpass.data.TimerHoursAndMinutes;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: FormatUtils.kt */
@Metadata(m7104d1 = {"\u0000.\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0001\u001a\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0001\u001a\u000e\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0006\u001a\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0001\u001a\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0001\u001a\u000e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f\u001a\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0001¨\u0006\u0016"}, m7105d2 = {"convertHoursOrDays", "", "time", "convertSecondsToDHM", "Lkotlin/Pair;", "seconds", "", "convertToDaysAndHours", "Lcom/blackhub/bronline/game/gui/blackpass/data/TimerDaysAndHours;", "targetDateInSeconds", "convertToHoursAndMinutes", "Lcom/blackhub/bronline/game/gui/blackpass/data/TimerHoursAndMinutes;", "convertUnixTime", "unixTime", "formatCountText", "", "text", "countLimit", "formatNumber", "number", "formatRubText", "formatUnixTimeMarketplace", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nFormatUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FormatUtils.kt\ncom/blackhub/bronline/game/core/utils/FormatUtilsKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,108:1\n429#2:109\n502#2,5:110\n429#2:115\n502#2,5:116\n*S KotlinDebug\n*F\n+ 1 FormatUtils.kt\ncom/blackhub/bronline/game/core/utils/FormatUtilsKt\n*L\n35#1:109\n35#1:110,5\n46#1:115\n46#1:116,5\n*E\n"})
/* loaded from: classes3.dex */
public final class FormatUtilsKt {
    @NotNull
    public static final String formatNumber(int i) {
        return new Regex("(\\d)(?=(\\d{3})+$)").replace(String.valueOf(i), "$1.");
    }

    @NotNull
    public static final String formatRubText(@NotNull String text) throws IOException {
        Object objValueOf;
        Intrinsics.checkNotNullParameter(text, "text");
        String string = StringsKt__StringsKt.trim((CharSequence) text).toString();
        StringBuilder sb = new StringBuilder();
        int length = string.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = string.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        long longOrZero = StringExtensionKt.toLongOrZero(string2);
        if (longOrZero == 0) {
            objValueOf = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
        } else if (longOrZero > 999999999) {
            objValueOf = 999999999;
        } else {
            objValueOf = Long.valueOf(longOrZero);
        }
        return objValueOf.toString();
    }

    @NotNull
    public static final String formatCountText(@NotNull String text, int i) throws IOException {
        Object objValueOf;
        Intrinsics.checkNotNullParameter(text, "text");
        String string = StringsKt__StringsKt.trim((CharSequence) text).toString();
        StringBuilder sb = new StringBuilder();
        int length = string.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = string.charAt(i2);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        int intOrZero = StringExtensionKt.toIntOrZero(string2);
        if (intOrZero == 0) {
            objValueOf = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
        } else if (intOrZero > i) {
            objValueOf = Integer.valueOf(i);
        } else if (intOrZero > 999) {
            objValueOf = 999;
        } else {
            objValueOf = Integer.valueOf(intOrZero);
        }
        return objValueOf.toString();
    }

    @NotNull
    public static final TimerHoursAndMinutes convertToHoursAndMinutes(int i) {
        return new TimerHoursAndMinutes(i / 3600, (i % 3600) / 60);
    }

    @NotNull
    public static final String formatUnixTimeMarketplace(int i) {
        String str = new SimpleDateFormat("dd.MM.yyyy HH:mm", Locale.getDefault()).format(new Date(i * 1000));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static final int convertUnixTime(long j) {
        long days;
        if (j < 3600000) {
            days = TimeUnit.SECONDS.toMinutes(j);
        } else if (j < 86400000) {
            days = TimeUnit.SECONDS.toHours(j);
        } else {
            days = TimeUnit.SECONDS.toDays(j);
        }
        return (int) days;
    }

    @NotNull
    public static final Pair<Integer, Integer> convertSecondsToDHM(long j) {
        long j2 = j / 60;
        long j3 = j / 3600;
        long j4 = j / 86400;
        if (j < TimeConstants.MINIMUM_FETCH_INTERVAL_IN_SECONDS) {
            return TuplesKt.m7112to(Integer.valueOf((int) j2), 1);
        }
        if (j < 86400) {
            return TuplesKt.m7112to(Integer.valueOf((int) j3), 2);
        }
        return TuplesKt.m7112to(Integer.valueOf((int) j4), 3);
    }

    public static final int convertHoursOrDays(int i) {
        return i < 24 ? i : i / 24;
    }

    @NotNull
    public static final TimerDaysAndHours convertToDaysAndHours(int i) {
        int iCurrentTimeMillis = i - ((int) (System.currentTimeMillis() / 1000));
        return new TimerDaysAndHours(iCurrentTimeMillis / 86400, (iCurrentTimeMillis % 86400) / 3600);
    }
}
