package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.Pc */
/* loaded from: classes6.dex */
public final class C9140Pc extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C9211Sc f7089a;

    /* renamed from: b */
    public final /* synthetic */ ModuleEvent f7090b;

    public C9140Pc(C9211Sc c9211Sc, ModuleEvent moduleEvent) {
        this.f7089a = c9211Sc;
        this.f7090b = moduleEvent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C9211Sc.m5556a(this.f7089a).reportEvent(this.f7090b);
    }
}
