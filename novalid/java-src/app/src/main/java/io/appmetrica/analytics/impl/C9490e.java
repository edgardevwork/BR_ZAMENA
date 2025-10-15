package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: io.appmetrica.analytics.impl.e */
/* loaded from: classes6.dex */
public final class C9490e {

    /* renamed from: g */
    public static final long f7970g = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: h */
    public static final String f7971h = "WatchDog-" + ThreadFactoryC9479dd.f7951a.incrementAndGet();

    /* renamed from: a */
    public final CopyOnWriteArrayList f7972a;

    /* renamed from: b */
    public final AtomicInteger f7973b;

    /* renamed from: c */
    public final Handler f7974c;

    /* renamed from: d */
    public C9465d f7975d;

    /* renamed from: e */
    public final AtomicBoolean f7976e;

    /* renamed from: f */
    public final Runnable f7977f;

    public C9490e(C10002yb c10002yb) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f7972a = copyOnWriteArrayList;
        this.f7973b = new AtomicInteger();
        this.f7974c = new Handler(Looper.getMainLooper());
        this.f7976e = new AtomicBoolean();
        this.f7977f = new Runnable() { // from class: io.appmetrica.analytics.impl.e$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m6033a();
            }
        };
        copyOnWriteArrayList.add(c10002yb);
    }

    /* renamed from: a */
    public final /* synthetic */ void m6033a() {
        this.f7976e.set(true);
    }

    /* renamed from: b */
    public final synchronized void m6035b() {
        C9465d c9465d = this.f7975d;
        if (c9465d != null) {
            c9465d.f7883a.set(false);
            this.f7975d = null;
            PublicLogger.getAnonymousInstance().info("Stop ANR monitoring", new Object[0]);
        }
    }

    /* renamed from: a */
    public final synchronized void m6034a(int i) {
        AtomicInteger atomicInteger = this.f7973b;
        int i2 = 5;
        if (i >= 5) {
            i2 = i;
        }
        atomicInteger.set(i2);
        if (this.f7975d == null) {
            C9465d c9465d = new C9465d(this);
            this.f7975d = c9465d;
            try {
                c9465d.setName(f7971h);
            } catch (SecurityException unused) {
            }
            this.f7975d.start();
            PublicLogger.getAnonymousInstance().info("Start ANR monitoring with timeout: %s seconds", Integer.valueOf(i));
        }
    }
}
