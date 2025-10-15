package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.vh */
/* loaded from: classes7.dex */
public final class RunnableC9933vh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C8778Ah f9230a;

    public RunnableC9933vh(C8778Ah c8778Ah) {
        this.f9230a = c8778Ah;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8778Ah c8778Ah = this.f9230a;
        C8778Ah.m4962a(c8778Ah.f6338a, c8778Ah.f6341d, c8778Ah.f6342e).sendEventsBuffer();
    }
}
