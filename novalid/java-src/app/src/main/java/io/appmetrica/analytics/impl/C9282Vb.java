package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.Vb */
/* loaded from: classes5.dex */
public final class C9282Vb {

    /* renamed from: a */
    public volatile String f7355a;

    /* renamed from: a */
    public static String m5689a() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            return (String) cls.getMethod("getProcessName", null).invoke(cls.getMethod("currentActivityThread", null).invoke(null, null), null);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: b */
    public final String m5691b() {
        if (this.f7355a != null) {
            return this.f7355a;
        }
        synchronized (this) {
            try {
                if (this.f7355a == null) {
                    this.f7355a = m5689a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f7355a;
    }

    /* renamed from: c */
    public final boolean m5692c() {
        try {
            if (TextUtils.isEmpty(m5691b())) {
                return false;
            }
            return !m5691b().contains(StringUtils.PROCESS_POSTFIX_DELIMITER);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final boolean m5690a(@NonNull String str) {
        try {
            if (TextUtils.isEmpty(m5691b())) {
                return false;
            }
            String strM5691b = m5691b();
            StringBuilder sb = new StringBuilder(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb.append(str);
            return strM5691b.endsWith(sb.toString());
        } catch (Throwable unused) {
            return false;
        }
    }
}
