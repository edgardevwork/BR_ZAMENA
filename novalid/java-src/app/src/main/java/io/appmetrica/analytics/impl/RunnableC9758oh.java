package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;

/* renamed from: io.appmetrica.analytics.impl.oh */
/* loaded from: classes7.dex */
public final class RunnableC9758oh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ReporterConfig f8857a;

    /* renamed from: b */
    public final /* synthetic */ C8778Ah f8858b;

    public RunnableC9758oh(C8778Ah c8778Ah, ReporterConfig reporterConfig) {
        this.f8858b = c8778Ah;
        this.f8857a = reporterConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8778Ah c8778Ah = this.f8858b;
        ReporterConfig reporterConfig = this.f8857a;
        C9816r0 c9816r0 = c8778Ah.f6338a;
        Context context = c8778Ah.f6341d;
        c9816r0.getClass();
        C9791q0.m6658a(context, false).m6687k().mo4939a(reporterConfig);
    }
}
