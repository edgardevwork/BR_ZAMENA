package io.appmetrica.analytics.billinginterface.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.webvtt.WebvttCssParser;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public class Period {

    /* renamed from: a */
    private static final Pattern f6027a = Pattern.compile("P(\\d+)(\\S+)");
    public final int number;

    @NonNull
    public final TimeUnit timeUnit;

    public enum TimeUnit {
        TIME_UNIT_UNKNOWN,
        DAY,
        WEEK,
        MONTH,
        YEAR
    }

    public Period(int i, @NonNull TimeUnit timeUnit) {
        this.number = i;
        this.timeUnit = timeUnit;
    }

    @Nullable
    public static Period parse(@NonNull String str) {
        Matcher matcher = f6027a.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        String strGroup = matcher.group(1);
        String strGroup2 = matcher.group(2);
        if (strGroup == null || strGroup2 == null) {
            return null;
        }
        try {
            int i = Integer.parseInt(strGroup);
            char cCharAt = strGroup2.charAt(0);
            return new Period(i, cCharAt != 'D' ? cCharAt != 'M' ? cCharAt != 'W' ? cCharAt != 'Y' ? TimeUnit.TIME_UNIT_UNKNOWN : TimeUnit.YEAR : TimeUnit.WEEK : TimeUnit.MONTH : TimeUnit.DAY);
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Period period = (Period) obj;
        return this.number == period.number && this.timeUnit == period.timeUnit;
    }

    public int hashCode() {
        return this.timeUnit.hashCode() + (this.number * 31);
    }

    @NonNull
    public String toString() {
        return "Period{number=" + this.number + "timeUnit=" + this.timeUnit + WebvttCssParser.RULE_END;
    }
}
