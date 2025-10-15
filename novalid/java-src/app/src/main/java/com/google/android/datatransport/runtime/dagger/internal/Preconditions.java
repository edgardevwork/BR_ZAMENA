package com.google.android.datatransport.runtime.dagger.internal;

import org.apache.commons.lang3.text.FormattableUtils;

/* loaded from: classes4.dex */
public final class Preconditions {
    public static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }

    public static <T> T checkNotNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static <T> T checkNotNullFromProvides(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static <T> T checkNotNullFromComponent(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }

    public static <T> T checkNotNull(T t, String str, Object obj) {
        String strValueOf;
        if (t != null) {
            return t;
        }
        if (str.contains(FormattableUtils.SIMPLEST_FORMAT)) {
            if (str.indexOf(FormattableUtils.SIMPLEST_FORMAT) != str.lastIndexOf(FormattableUtils.SIMPLEST_FORMAT)) {
                throw new IllegalArgumentException("errorMessageTemplate has more than one format specifier");
            }
            if (obj instanceof Class) {
                strValueOf = ((Class) obj).getCanonicalName();
            } else {
                strValueOf = String.valueOf(obj);
            }
            throw new NullPointerException(str.replace(FormattableUtils.SIMPLEST_FORMAT, strValueOf));
        }
        throw new IllegalArgumentException("errorMessageTemplate has no format specifiers");
    }

    public static <T> void checkBuilderRequirement(T t, Class<T> cls) {
        if (t != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }
}
