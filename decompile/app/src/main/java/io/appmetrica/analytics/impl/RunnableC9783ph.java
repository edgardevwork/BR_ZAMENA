package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;

/* renamed from: io.appmetrica.analytics.impl.ph */
/* loaded from: classes7.dex */
public final class RunnableC9783ph implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ModuleEvent f8904a;

    /* renamed from: b */
    public final /* synthetic */ C8778Ah f8905b;

    public RunnableC9783ph(C8778Ah c8778Ah, ModuleEvent moduleEvent) {
        this.f8905b = c8778Ah;
        this.f8904a = moduleEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8778Ah c8778Ah = this.f8905b;
        C8778Ah.m4962a(c8778Ah.f6338a, c8778Ah.f6341d, c8778Ah.f6342e).reportEvent(this.f8904a);
    }
}
