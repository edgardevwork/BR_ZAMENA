package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.bb */
/* loaded from: classes6.dex */
public final class C9427bb extends JSONObject {
    public C9427bb() {
    }

    /* renamed from: a */
    public final Long m5912a(String str) {
        try {
            return Long.valueOf(getLong(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public C9427bb(String str) {
        super(str);
    }

    /* renamed from: b */
    public final String m5913b(String str) {
        if (has(str)) {
            try {
                return getString(str);
            } catch (Throwable unused) {
            }
        }
        return "";
    }
}
