package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.Rc */
/* loaded from: classes6.dex */
public final class C9187Rc extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C9211Sc f7202a;

    /* renamed from: b */
    public final /* synthetic */ String f7203b;

    /* renamed from: c */
    public final /* synthetic */ byte[] f7204c;

    public C9187Rc(C9211Sc c9211Sc, String str, byte[] bArr) {
        this.f7202a = c9211Sc;
        this.f7203b = str;
        this.f7204c = bArr;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C9211Sc.m5556a(this.f7202a).setSessionExtra(this.f7203b, this.f7204c);
    }
}
