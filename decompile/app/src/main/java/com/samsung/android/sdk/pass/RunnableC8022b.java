package com.samsung.android.sdk.pass;

import com.samsung.android.sdk.pass.SpassFingerprint;

/* renamed from: com.samsung.android.sdk.pass.b */
/* loaded from: classes6.dex */
public final class RunnableC8022b implements Runnable {

    /* renamed from: a */
    public /* synthetic */ SpassFingerprint f1000a;

    /* renamed from: b */
    public final /* synthetic */ SpassFingerprint.IdentifyListener f1001b;

    public RunnableC8022b(SpassFingerprint spassFingerprint, SpassFingerprint.IdentifyListener identifyListener) {
        this.f1000a = spassFingerprint;
        this.f1001b = identifyListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SpassFingerprint.m1407a(this.f1000a, this.f1001b, null, 7);
        this.f1001b.onCompleted();
    }
}
