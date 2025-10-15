package io.appmetrica.analytics.impl;

import android.util.Pair;

/* renamed from: io.appmetrica.analytics.impl.e0 */
/* loaded from: classes6.dex */
public final class C9491e0 {

    /* renamed from: a */
    public C9828rc f7978a;

    /* renamed from: b */
    public long f7979b;

    /* renamed from: c */
    public boolean f7980c;

    /* renamed from: d */
    public final C9936vk f7981d;

    public C9491e0(String str, long j, C9936vk c9936vk) {
        this.f7979b = j;
        try {
            this.f7978a = new C9828rc(str);
        } catch (Throwable unused) {
            this.f7978a = new C9828rc();
        }
        this.f7981d = c9936vk;
    }

    /* renamed from: a */
    public final synchronized void m6037a(Pair pair) {
        if (this.f7981d.m6900b(this.f7978a, (String) pair.first, (String) pair.second)) {
            this.f7980c = true;
        }
    }

    public final synchronized String toString() {
        return "Map size " + this.f7978a.size() + ". Is changed " + this.f7980c + ". Current revision " + this.f7979b;
    }

    /* renamed from: a */
    public final synchronized C9466d0 m6036a() {
        try {
            if (this.f7980c) {
                this.f7979b++;
                this.f7980c = false;
            }
        } catch (Throwable th) {
            throw th;
        }
        return new C9466d0(AbstractC9452cb.m5968b(this.f7978a), this.f7979b);
    }
}
