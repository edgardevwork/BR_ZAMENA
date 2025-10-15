package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.Qc */
/* loaded from: classes6.dex */
public final class C9164Qc extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C9211Sc f7154a;

    /* renamed from: b */
    public final /* synthetic */ int f7155b;

    /* renamed from: c */
    public final /* synthetic */ String f7156c;

    public C9164Qc(C9211Sc c9211Sc, int i, String str) {
        this.f7154a = c9211Sc;
        this.f7155b = i;
        this.f7156c = str;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C9211Sc.m5556a(this.f7154a).mo5215a(new C8845D9(this.f7155b, this.f7156c));
    }
}
