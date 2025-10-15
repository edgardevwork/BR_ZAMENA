package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: io.appmetrica.analytics.impl.lm */
/* loaded from: classes6.dex */
public class C9688lm implements InterfaceC10010yj {

    /* renamed from: a */
    public final InterfaceC8821Ca f8601a;

    /* renamed from: b */
    public final Object f8602b = new Object();

    /* renamed from: c */
    public boolean f8603c = false;

    /* renamed from: d */
    public final InterfaceC9124Ok f8604d;

    public C9688lm(@NonNull InterfaceC8821Ca interfaceC8821Ca, @NonNull InterfaceC9124Ok interfaceC9124Ok) {
        this.f8601a = interfaceC8821Ca;
        this.f8604d = interfaceC9124Ok;
    }

    /* renamed from: a */
    public void mo5461a() {
    }

    /* renamed from: b */
    public final void m6408b() {
        synchronized (this.f8602b) {
            try {
                if (!this.f8603c) {
                    m6411e();
                    mo5461a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    /* renamed from: c */
    public final InterfaceC8821Ca m6409c() {
        return this.f8601a;
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: d */
    public final InterfaceC9124Ok m6410d() {
        return this.f8604d;
    }

    /* renamed from: e */
    public final void m6411e() {
        synchronized (this.f8602b) {
            try {
                if (!this.f8603c) {
                    mo5462f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: f */
    public void mo5462f() {
        this.f8604d.mo5467a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC10010yj
    public final void onCreate() {
        synchronized (this.f8602b) {
            try {
                if (this.f8603c) {
                    this.f8603c = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC10010yj
    public final void onDestroy() {
        synchronized (this.f8602b) {
            try {
                if (!this.f8603c) {
                    mo5461a();
                    this.f8603c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
