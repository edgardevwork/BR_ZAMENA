package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.p048io.FileUtils;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.K1 */
/* loaded from: classes8.dex */
public final class C9009K1 {

    /* renamed from: a */
    public final C9352Y9 f6851a;

    /* renamed from: b */
    public boolean f6852b;

    public C9009K1() {
        this(new C9352Y9());
    }

    /* renamed from: a */
    public final synchronized long m5315a(Context context) {
        String strM5242a;
        try {
            this.f6851a.getClass();
            strM5242a = AbstractC8946Ha.m5242a(FileUtils.getFileFromAppStorage(context, "metrica_service_settings.dat"));
        } catch (Throwable unused) {
        }
        return !TextUtils.isEmpty(strM5242a) ? new JSONObject(strM5242a).optLong("delay") : 0L;
    }

    /* renamed from: b */
    public final void m5316b(Context context) {
        synchronized (this) {
        }
        if (this.f6852b) {
            return;
        }
        long jM5315a = m5315a(context);
        if (jM5315a > 0) {
            try {
                Thread.sleep(jM5315a);
            } catch (Throwable unused) {
            }
        }
        this.f6852b = true;
    }

    public C9009K1(C9352Y9 c9352y9) {
        this.f6852b = false;
        this.f6851a = c9352y9;
    }
}
