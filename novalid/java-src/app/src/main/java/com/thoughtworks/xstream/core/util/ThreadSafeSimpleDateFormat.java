package com.thoughtworks.xstream.core.util;

import com.thoughtworks.xstream.core.util.Pool;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes8.dex */
public class ThreadSafeSimpleDateFormat {
    public final String formatString;
    public final Pool pool;
    public final TimeZone timeZone;

    public ThreadSafeSimpleDateFormat(String str, TimeZone timeZone, int i, int i2, boolean z) {
        this(str, timeZone, Locale.ENGLISH, i, i2, z);
    }

    public ThreadSafeSimpleDateFormat(String str, TimeZone timeZone, final Locale locale, int i, int i2, final boolean z) {
        this.formatString = str;
        this.timeZone = timeZone;
        this.pool = new Pool(i, i2, new Pool.Factory() { // from class: com.thoughtworks.xstream.core.util.ThreadSafeSimpleDateFormat.1
            @Override // com.thoughtworks.xstream.core.util.Pool.Factory
            public Object newInstance() {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ThreadSafeSimpleDateFormat.this.formatString, locale);
                simpleDateFormat.setLenient(z);
                return simpleDateFormat;
            }
        });
    }

    public String format(Date date) {
        DateFormat dateFormatFetchFromPool = fetchFromPool();
        try {
            return dateFormatFetchFromPool.format(date);
        } finally {
            this.pool.putInPool(dateFormatFetchFromPool);
        }
    }

    public Date parse(String str) throws ParseException {
        DateFormat dateFormatFetchFromPool = fetchFromPool();
        try {
            return dateFormatFetchFromPool.parse(str);
        } finally {
            this.pool.putInPool(dateFormatFetchFromPool);
        }
    }

    public final DateFormat fetchFromPool() {
        DateFormat dateFormat = (DateFormat) this.pool.fetchFromPool();
        TimeZone timeZone = this.timeZone;
        if (timeZone == null) {
            timeZone = TimeZone.getDefault();
        }
        if (!timeZone.equals(dateFormat.getTimeZone())) {
            dateFormat.setTimeZone(timeZone);
        }
        return dateFormat;
    }

    public String toString() {
        return this.formatString;
    }
}
