package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.h4 */
/* loaded from: classes5.dex */
public final class C9570h4 {

    /* renamed from: a */
    public final C9545g4 f8225a;

    /* renamed from: b */
    public volatile C9975x9 f8226b;

    /* renamed from: c */
    public volatile C9975x9 f8227c;

    public C9570h4() {
        this(new C9545g4());
    }

    /* renamed from: a */
    public final IHandlerExecutor m6201a() {
        if (this.f8226b == null) {
            synchronized (this) {
                try {
                    if (this.f8226b == null) {
                        this.f8225a.getClass();
                        HandlerThreadC9353Ya handlerThreadC9353YaM6959a = C9975x9.m6959a("IAA-CDE");
                        this.f8226b = new C9975x9(handlerThreadC9353YaM6959a, handlerThreadC9353YaM6959a.getLooper(), new Handler(handlerThreadC9353YaM6959a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f8226b;
    }

    /* renamed from: b */
    public final ICommonExecutor m6202b() {
        if (this.f8227c == null) {
            synchronized (this) {
                try {
                    if (this.f8227c == null) {
                        this.f8225a.getClass();
                        HandlerThreadC9353Ya handlerThreadC9353YaM6959a = C9975x9.m6959a("IAA-CRS");
                        this.f8227c = new C9975x9(handlerThreadC9353YaM6959a, handlerThreadC9353YaM6959a.getLooper(), new Handler(handlerThreadC9353YaM6959a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f8227c;
    }

    public C9570h4(C9545g4 c9545g4) {
        this.f8225a = c9545g4;
    }
}
