package io.appmetrica.analytics.impl;

import android.database.Cursor;
import java.io.Closeable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.kn */
/* loaded from: classes5.dex */
public abstract class AbstractC9664kn {
    /* renamed from: a */
    public static boolean m6342a(Object obj) {
        return obj != null;
    }

    /* renamed from: a */
    public static void m6341a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m6340a(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    /* renamed from: a */
    public static boolean m6343a(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    public static boolean m6345a(Map map) {
        return map == null || map.size() == 0;
    }

    /* renamed from: a */
    public static boolean m6344a(Collection collection) {
        return collection == null || collection.size() == 0;
    }

    /* renamed from: a */
    public static BigDecimal m6339a(long j) {
        return new BigDecimal(j).divide(new BigDecimal(1000000), 6, 6);
    }

    /* renamed from: a */
    public static double m6338a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            return 0.0d;
        }
        return d;
    }
}
