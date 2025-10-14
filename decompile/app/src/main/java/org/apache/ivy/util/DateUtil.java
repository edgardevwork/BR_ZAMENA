package org.apache.ivy.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes8.dex */
public final class DateUtil {
    public static final String DATE_FORMAT_PATTERN = "yyyyMMddHHmmss";

    public static String format(Date date) {
        return new SimpleDateFormat(DATE_FORMAT_PATTERN).format(date);
    }

    public static Date parse(String str) throws ParseException {
        return new SimpleDateFormat(DATE_FORMAT_PATTERN).parse(str);
    }
}
