package org.apache.commons.lang3.time;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.apache.commons.lang3.LocaleUtils;
import org.apache.commons.lang3.Validate;

/* loaded from: classes8.dex */
public abstract class FormatCache<F extends Format> {
    public static final int NONE = -1;
    public static final ConcurrentMap<ArrayKey, String> cDateTimeInstanceCache = new ConcurrentHashMap(7);
    public final ConcurrentMap<ArrayKey, F> cInstanceCache = new ConcurrentHashMap(7);

    public abstract F createInstance(String str, TimeZone timeZone, Locale locale);

    public F getInstance() {
        return (F) getDateTimeInstance(3, 3, TimeZone.getDefault(), Locale.getDefault());
    }

    public F getInstance(String str, TimeZone timeZone, Locale locale) {
        Validate.notNull(str, "pattern", new Object[0]);
        if (timeZone == null) {
            timeZone = TimeZone.getDefault();
        }
        Locale locale2 = LocaleUtils.toLocale(locale);
        ArrayKey arrayKey = new ArrayKey(str, timeZone, locale2);
        F f = this.cInstanceCache.get(arrayKey);
        if (f != null) {
            return f;
        }
        F f2 = (F) createInstance(str, timeZone, locale2);
        F f3 = (F) this.cInstanceCache.putIfAbsent(arrayKey, f2);
        return f3 != null ? f3 : f2;
    }

    public final F getDateTimeInstance(Integer num, Integer num2, TimeZone timeZone, Locale locale) {
        Locale locale2 = LocaleUtils.toLocale(locale);
        return (F) getInstance(getPatternForStyle(num, num2, locale2), timeZone, locale2);
    }

    public F getDateTimeInstance(int i, int i2, TimeZone timeZone, Locale locale) {
        return (F) getDateTimeInstance(Integer.valueOf(i), Integer.valueOf(i2), timeZone, locale);
    }

    public F getDateInstance(int i, TimeZone timeZone, Locale locale) {
        return (F) getDateTimeInstance(Integer.valueOf(i), (Integer) null, timeZone, locale);
    }

    public F getTimeInstance(int i, TimeZone timeZone, Locale locale) {
        return (F) getDateTimeInstance((Integer) null, Integer.valueOf(i), timeZone, locale);
    }

    public static String getPatternForStyle(Integer num, Integer num2, Locale locale) {
        DateFormat dateTimeInstance;
        Locale locale2 = LocaleUtils.toLocale(locale);
        ArrayKey arrayKey = new ArrayKey(num, num2, locale2);
        ConcurrentMap<ArrayKey, String> concurrentMap = cDateTimeInstanceCache;
        String str = concurrentMap.get(arrayKey);
        if (str != null) {
            return str;
        }
        try {
            if (num == null) {
                dateTimeInstance = DateFormat.getTimeInstance(num2.intValue(), locale2);
            } else if (num2 == null) {
                dateTimeInstance = DateFormat.getDateInstance(num.intValue(), locale2);
            } else {
                dateTimeInstance = DateFormat.getDateTimeInstance(num.intValue(), num2.intValue(), locale2);
            }
            String pattern = ((SimpleDateFormat) dateTimeInstance).toPattern();
            String strPutIfAbsent = concurrentMap.putIfAbsent(arrayKey, pattern);
            return strPutIfAbsent != null ? strPutIfAbsent : pattern;
        } catch (ClassCastException unused) {
            throw new IllegalArgumentException("No date time pattern for locale: " + locale2);
        }
    }

    public static final class ArrayKey {
        public final int hashCode;
        public final Object[] keys;

        public static int computeHashCode(Object[] objArr) {
            return 31 + Arrays.hashCode(objArr);
        }

        public ArrayKey(Object... objArr) {
            this.keys = objArr;
            this.hashCode = computeHashCode(objArr);
        }

        public int hashCode() {
            return this.hashCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && ArrayKey.class == obj.getClass()) {
                return Arrays.deepEquals(this.keys, ((ArrayKey) obj).keys);
            }
            return false;
        }
    }
}
