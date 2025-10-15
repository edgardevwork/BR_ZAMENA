package io.appmetrica.analytics.impl;

import kotlin.text.Charsets;

/* renamed from: io.appmetrica.analytics.impl.E9 */
/* loaded from: classes6.dex */
public abstract class AbstractC8870E9 {
    /* renamed from: a */
    public static final C10000y9 m5110a(int i, String str) {
        byte[] bytes;
        C10000y9 c10000y9 = new C10000y9();
        c10000y9.f9361a = i;
        if (str == null || (bytes = str.getBytes(Charsets.UTF_8)) == null) {
            bytes = c10000y9.f9362b;
        }
        c10000y9.f9362b = bytes;
        return c10000y9;
    }
}
