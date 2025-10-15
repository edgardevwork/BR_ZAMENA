package ru.rustore.sdk.metrics.internal;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.metrics.internal.AbstractC11604W;

/* renamed from: ru.rustore.sdk.metrics.internal.U */
/* loaded from: classes8.dex */
public final class C11602U {

    /* renamed from: c */
    public static final Object f10650c = new Object();

    /* renamed from: a */
    public final C11596N f10651a;

    /* renamed from: b */
    public final C11601T f10652b;

    public C11602U(C11596N persistentMetricsEventRepository, C11601T sendMetricsEventBatchUseCase) {
        Intrinsics.checkNotNullParameter(persistentMetricsEventRepository, "persistentMetricsEventRepository");
        Intrinsics.checkNotNullParameter(sendMetricsEventBatchUseCase, "sendMetricsEventBatchUseCase");
        this.f10651a = persistentMetricsEventRepository;
        this.f10652b = sendMetricsEventBatchUseCase;
    }

    /* renamed from: a */
    public final void m7490a() {
        synchronized (f10650c) {
            while (true) {
                try {
                    AbstractC11604W abstractC11604WM7489a = this.f10652b.m7489a();
                    if (Intrinsics.areEqual(abstractC11604WM7489a, AbstractC11604W.a.f10655a)) {
                        Unit unit = Unit.INSTANCE;
                    } else if (abstractC11604WM7489a instanceof AbstractC11604W.b) {
                        this.f10651a.m7488a(((AbstractC11604W.b) abstractC11604WM7489a).f10656a);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
