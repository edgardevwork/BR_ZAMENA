package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* renamed from: io.appmetrica.analytics.impl.kh */
/* loaded from: classes6.dex */
public final class C9658kh implements Provider {

    /* renamed from: a */
    public final /* synthetic */ C9816r0 f8518a;

    /* renamed from: b */
    public final /* synthetic */ Context f8519b;

    /* renamed from: c */
    public final /* synthetic */ ReporterConfig f8520c;

    public C9658kh(C9816r0 c9816r0, Context context, ReporterConfig reporterConfig) {
        this.f8518a = c9816r0;
        this.f8519b = context;
        this.f8520c = reporterConfig;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return C8778Ah.m4962a(this.f8518a, this.f8519b, this.f8520c);
    }
}
