package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Im */
/* loaded from: classes6.dex */
public class C8982Im implements InterfaceC9360Yh {

    /* renamed from: a */
    public final int f6795a;

    /* renamed from: b */
    public final int f6796b;

    /* renamed from: c */
    public int f6797c = 0;

    public C8982Im(int i, int i2) {
        this.f6795a = i;
        this.f6796b = i2;
    }

    /* renamed from: a */
    public final int m5281a() {
        return this.f6796b;
    }

    /* renamed from: b */
    public final boolean m5282b() {
        int i = this.f6797c;
        this.f6797c = i + 1;
        return i < this.f6795a;
    }

    /* renamed from: c */
    public final void m5283c() {
        this.f6797c = 0;
    }
}
