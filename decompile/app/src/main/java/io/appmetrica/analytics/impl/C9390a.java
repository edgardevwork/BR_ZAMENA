package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.a */
/* loaded from: classes6.dex */
public final class C9390a {

    /* renamed from: a */
    public final Context f7656a;

    public C9390a(Context context) {
        this.f7656a = context;
    }

    /* renamed from: a */
    public final byte[] m5821a() {
        try {
            return AbstractC10009yi.m6997a(new StringBuilder(this.f7656a.getPackageName()).reverse().toString());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }

    /* renamed from: b */
    public final byte[] m5822b() {
        try {
            return AbstractC10009yi.m6997a(this.f7656a.getPackageName());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }
}
