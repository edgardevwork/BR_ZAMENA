package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.xj */
/* loaded from: classes8.dex */
public final class C9985xj {

    /* renamed from: a */
    public final C9960wj f9317a;

    /* renamed from: b */
    public volatile C9975x9 f9318b;

    /* renamed from: c */
    public volatile C9975x9 f9319c;

    /* renamed from: d */
    public volatile C9975x9 f9320d;

    /* renamed from: e */
    public volatile C9975x9 f9321e;

    /* renamed from: f */
    public volatile C9975x9 f9322f;

    /* renamed from: g */
    public volatile C9975x9 f9323g;

    /* renamed from: h */
    public volatile ExecutorC9935vj f9324h;

    public C9985xj() {
        this(new C9960wj());
    }

    /* renamed from: a */
    public final IHandlerExecutor m6966a() {
        if (this.f9323g == null) {
            synchronized (this) {
                try {
                    if (this.f9323g == null) {
                        this.f9317a.getClass();
                        HandlerThreadC9353Ya handlerThreadC9353YaM6959a = C9975x9.m6959a("IAA-SDE");
                        this.f9323g = new C9975x9(handlerThreadC9353YaM6959a, handlerThreadC9353YaM6959a.getLooper(), new Handler(handlerThreadC9353YaM6959a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f9323g;
    }

    /* renamed from: b */
    public final IHandlerExecutor m6967b() {
        if (this.f9318b == null) {
            synchronized (this) {
                try {
                    if (this.f9318b == null) {
                        this.f9317a.getClass();
                        HandlerThreadC9353Ya handlerThreadC9353YaM6959a = C9975x9.m6959a("IAA-SC");
                        this.f9318b = new C9975x9(handlerThreadC9353YaM6959a, handlerThreadC9353YaM6959a.getLooper(), new Handler(handlerThreadC9353YaM6959a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f9318b;
    }

    /* renamed from: c */
    public final IHandlerExecutor m6968c() {
        if (this.f9320d == null) {
            synchronized (this) {
                try {
                    if (this.f9320d == null) {
                        this.f9317a.getClass();
                        HandlerThreadC9353Ya handlerThreadC9353YaM6959a = C9975x9.m6959a("IAA-SMH-1");
                        this.f9320d = new C9975x9(handlerThreadC9353YaM6959a, handlerThreadC9353YaM6959a.getLooper(), new Handler(handlerThreadC9353YaM6959a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f9320d;
    }

    /* renamed from: d */
    public final IHandlerExecutor m6969d() {
        if (this.f9321e == null) {
            synchronized (this) {
                try {
                    if (this.f9321e == null) {
                        this.f9317a.getClass();
                        HandlerThreadC9353Ya handlerThreadC9353YaM6959a = C9975x9.m6959a("IAA-SNTPE");
                        this.f9321e = new C9975x9(handlerThreadC9353YaM6959a, handlerThreadC9353YaM6959a.getLooper(), new Handler(handlerThreadC9353YaM6959a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f9321e;
    }

    /* renamed from: e */
    public final IHandlerExecutor m6970e() {
        if (this.f9319c == null) {
            synchronized (this) {
                try {
                    if (this.f9319c == null) {
                        this.f9317a.getClass();
                        HandlerThreadC9353Ya handlerThreadC9353YaM6959a = C9975x9.m6959a("IAA-STE");
                        this.f9319c = new C9975x9(handlerThreadC9353YaM6959a, handlerThreadC9353YaM6959a.getLooper(), new Handler(handlerThreadC9353YaM6959a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f9319c;
    }

    /* renamed from: f */
    public final Executor m6971f() {
        if (this.f9324h == null) {
            synchronized (this) {
                try {
                    if (this.f9324h == null) {
                        this.f9317a.getClass();
                        this.f9324h = new ExecutorC9935vj(new Handler(Looper.getMainLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f9324h;
    }

    public C9985xj(C9960wj c9960wj) {
        new HashMap();
        this.f9317a = c9960wj;
    }
}
