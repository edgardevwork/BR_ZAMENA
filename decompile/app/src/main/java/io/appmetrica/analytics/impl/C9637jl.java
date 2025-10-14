package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.jl */
/* loaded from: classes5.dex */
public final class C9637jl {

    /* renamed from: A */
    public final C8957Hl f8449A;

    /* renamed from: B */
    public final Map f8450B;

    /* renamed from: C */
    public final C10025z9 f8451C;

    /* renamed from: a */
    public final String f8452a;

    /* renamed from: b */
    public final String f8453b;

    /* renamed from: c */
    public final C9737nl f8454c;

    /* renamed from: d */
    public final String f8455d;

    /* renamed from: e */
    public final List f8456e;

    /* renamed from: f */
    public final List f8457f;

    /* renamed from: g */
    public final List f8458g;

    /* renamed from: h */
    public final Map f8459h;

    /* renamed from: i */
    public final String f8460i;

    /* renamed from: j */
    public final String f8461j;

    /* renamed from: k */
    public final String f8462k;

    /* renamed from: l */
    public final String f8463l;

    /* renamed from: m */
    public final String f8464m;

    /* renamed from: n */
    public final C8765A4 f8465n;

    /* renamed from: o */
    public final long f8466o;

    /* renamed from: p */
    public final boolean f8467p;

    /* renamed from: q */
    public final boolean f8468q;

    /* renamed from: r */
    public final String f8469r;

    /* renamed from: s */
    public final C9165Qd f8470s;

    /* renamed from: t */
    public final RetryPolicyConfig f8471t;

    /* renamed from: u */
    public final long f8472u;

    /* renamed from: v */
    public final long f8473v;

    /* renamed from: w */
    public final boolean f8474w;

    /* renamed from: x */
    public final BillingConfig f8475x;

    /* renamed from: y */
    public final C9919v3 f8476y;

    /* renamed from: z */
    public final C9718n2 f8477z;

    public C9637jl(String str, String str2, C9737nl c9737nl) {
        this.f8452a = str;
        this.f8453b = str2;
        this.f8454c = c9737nl;
        this.f8455d = c9737nl.f8765a;
        this.f8456e = c9737nl.f8766b;
        this.f8457f = c9737nl.f8770f;
        this.f8458g = c9737nl.f8771g;
        this.f8459h = c9737nl.f8773i;
        this.f8460i = c9737nl.f8767c;
        this.f8461j = c9737nl.f8768d;
        this.f8462k = c9737nl.f8774j;
        this.f8463l = c9737nl.f8775k;
        this.f8464m = c9737nl.f8776l;
        this.f8465n = c9737nl.f8777m;
        this.f8466o = c9737nl.f8778n;
        this.f8467p = c9737nl.f8779o;
        this.f8468q = c9737nl.f8780p;
        this.f8469r = c9737nl.f8781q;
        this.f8470s = c9737nl.f8783s;
        this.f8471t = c9737nl.f8784t;
        this.f8472u = c9737nl.f8785u;
        this.f8473v = c9737nl.f8786v;
        this.f8474w = c9737nl.f8787w;
        this.f8475x = c9737nl.f8788x;
        this.f8476y = c9737nl.f8789y;
        this.f8477z = c9737nl.f8790z;
        this.f8449A = c9737nl.f8762A;
        this.f8450B = c9737nl.f8763B;
        this.f8451C = c9737nl.f8764C;
    }

    /* renamed from: a */
    public final String m6313a() {
        return this.f8452a;
    }

    /* renamed from: b */
    public final String m6314b() {
        return this.f8453b;
    }

    /* renamed from: c */
    public final long m6315c() {
        return this.f8473v;
    }

    /* renamed from: d */
    public final long m6316d() {
        return this.f8472u;
    }

    /* renamed from: e */
    public final String m6317e() {
        return this.f8455d;
    }

    public final String toString() {
        return "StartupState(deviceId=" + this.f8452a + ", deviceIdHash=" + this.f8453b + ", startupStateModel=" + this.f8454c + ')';
    }
}
