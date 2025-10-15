package io.appmetrica.analytics.coreutils.internal;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class WrapUtils {
    public static double getFiniteDoubleOrDefault(double d, double d2) {
        return Double.isFinite(d) ? d : d2;
    }

    public static long getMillisOrDefault(@Nullable Long l, @NonNull TimeUnit timeUnit, long j) {
        return l == null ? j : timeUnit.toMillis(l.longValue());
    }

    @NonNull
    public static <T> T getOrDefault(@Nullable T t, @NonNull T t2) {
        return t == null ? t2 : t;
    }

    @NonNull
    public static String getOrDefaultIfEmpty(@Nullable String str, @NonNull String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    @Nullable
    public static <T> T getOrDefaultNullable(@Nullable T t, @Nullable T t2) {
        return t == null ? t2 : t;
    }

    @Nullable
    public static String getOrDefaultNullableIfEmpty(@Nullable String str, @Nullable String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    @NonNull
    public static <T> String wrapToTag(@Nullable T t) {
        return t == null ? "<null>" : t.toString().isEmpty() ? "<empty>" : t.toString();
    }
}
