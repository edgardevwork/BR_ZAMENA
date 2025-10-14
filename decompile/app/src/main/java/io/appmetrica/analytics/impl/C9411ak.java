package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: io.appmetrica.analytics.impl.ak */
/* loaded from: classes6.dex */
public final class C9411ak {

    /* renamed from: d */
    public static final String f7732d = "SESSION_SLEEP_START";

    /* renamed from: e */
    public static final String f7733e = "SESSION_LAST_EVENT_OFFSET";

    /* renamed from: f */
    public static final String f7734f = "SESSION_ID";

    /* renamed from: g */
    public static final String f7735g = "SESSION_COUNTER_ID";

    /* renamed from: h */
    public static final String f7736h = "SESSION_INIT_TIME";

    /* renamed from: i */
    public static final String f7737i = "SESSION_IS_ALIVE_REPORT_NEEDED";

    /* renamed from: a */
    public final String f7738a;

    /* renamed from: b */
    @NonNull
    protected final C9755oe f7739b;

    /* renamed from: c */
    public C9427bb f7740c;

    public C9411ak(@NonNull C9755oe c9755oe, @NonNull String str) {
        this.f7739b = c9755oe;
        this.f7738a = str;
        C9427bb c9427bb = new C9427bb();
        try {
            String strM6604h = c9755oe.m6604h(str);
            if (!TextUtils.isEmpty(strM6604h)) {
                c9427bb = new C9427bb(strM6604h);
            }
        } catch (Throwable unused) {
        }
        this.f7740c = c9427bb;
    }

    /* renamed from: a */
    public final C9411ak m5862a(long j) {
        m5865a(f7736h, Long.valueOf(j));
        return this;
    }

    /* renamed from: b */
    public final C9411ak m5866b(long j) {
        m5865a(f7733e, Long.valueOf(j));
        return this;
    }

    @Nullable
    /* renamed from: c */
    public final Long m5869c() {
        return this.f7740c.m5912a(f7736h);
    }

    /* renamed from: d */
    public final C9411ak m5870d(long j) {
        m5865a(f7734f, Long.valueOf(j));
        return this;
    }

    @Nullable
    /* renamed from: e */
    public final Long m5873e() {
        return this.f7740c.m5912a(f7735g);
    }

    @Nullable
    /* renamed from: f */
    public final Long m5874f() {
        return this.f7740c.m5912a(f7734f);
    }

    @Nullable
    /* renamed from: g */
    public final Long m5875g() {
        return this.f7740c.m5912a(f7732d);
    }

    /* renamed from: h */
    public final boolean m5876h() {
        return this.f7740c.length() > 0;
    }

    @Nullable
    /* renamed from: i */
    public final Boolean m5877i() {
        C9427bb c9427bb = this.f7740c;
        c9427bb.getClass();
        try {
            return Boolean.valueOf(c9427bb.getBoolean(f7737i));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final C9411ak m5863a(boolean z) {
        m5865a(f7737i, Boolean.valueOf(z));
        return this;
    }

    /* renamed from: b */
    public final void m5867b() {
        this.f7739b.m6599e(this.f7738a, this.f7740c.toString());
        this.f7739b.m6648b();
    }

    /* renamed from: c */
    public final C9411ak m5868c(long j) {
        m5865a(f7735g, Long.valueOf(j));
        return this;
    }

    @Nullable
    /* renamed from: d */
    public final Long m5871d() {
        return this.f7740c.m5912a(f7733e);
    }

    /* renamed from: e */
    public final C9411ak m5872e(long j) {
        m5865a(f7732d, Long.valueOf(j));
        return this;
    }

    /* renamed from: a */
    public final void m5865a(String str, Object obj) {
        try {
            this.f7740c.put(str, obj);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void m5864a() {
        this.f7740c = new C9427bb();
        m5867b();
    }
}
