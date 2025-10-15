package ru.rustore.sdk.metrics.internal;

import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.metrics.internal.C11605X;
import ru.rustore.sdk.reactive.core.Dispatcher;

/* renamed from: ru.rustore.sdk.metrics.internal.n */
/* loaded from: classes8.dex */
public final class C11627n {

    /* renamed from: a */
    public final C11602U f10683a;

    /* renamed from: b */
    public final C11612c f10684b;

    /* renamed from: c */
    public final C11603V f10685c;

    /* renamed from: d */
    public final Dispatcher f10686d;

    /* renamed from: e */
    public final InterfaceC11620g f10687e;

    /* renamed from: f */
    public boolean f10688f;

    public C11627n(C11602U sendMetricsEventInteractor, C11612c enqueueMetricsEventUseCase, C11603V sendMetricsEventJobScheduler, C11607Z singleThreadDispatcher, C11605X.b logger) {
        Intrinsics.checkNotNullParameter(sendMetricsEventInteractor, "sendMetricsEventInteractor");
        Intrinsics.checkNotNullParameter(enqueueMetricsEventUseCase, "enqueueMetricsEventUseCase");
        Intrinsics.checkNotNullParameter(sendMetricsEventJobScheduler, "sendMetricsEventJobScheduler");
        Intrinsics.checkNotNullParameter(singleThreadDispatcher, "singleThreadDispatcher");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f10683a = sendMetricsEventInteractor;
        this.f10684b = enqueueMetricsEventUseCase;
        this.f10685c = sendMetricsEventJobScheduler;
        this.f10686d = singleThreadDispatcher;
        this.f10687e = logger;
    }
}
