package io.appmetrica.analytics.impl;

import java.util.UUID;

/* renamed from: io.appmetrica.analytics.impl.on */
/* loaded from: classes7.dex */
public final class C9764on {
    /* renamed from: a */
    public static boolean m6610a(String str) {
        UUID uuidFromString;
        if (str == null || str.length() != 32) {
            return false;
        }
        try {
            uuidFromString = UUID.fromString(m6611b(str));
        } catch (Throwable unused) {
            uuidFromString = null;
        }
        return uuidFromString != null;
    }

    /* renamed from: b */
    public static String m6611b(String str) {
        return str.substring(0, 8) + "-" + str.substring(8, 12) + "-" + str.substring(12, 16) + "-" + str.substring(16, 20) + "-" + str.substring(20, 32);
    }
}
