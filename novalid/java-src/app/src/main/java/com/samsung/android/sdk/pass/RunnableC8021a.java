package com.samsung.android.sdk.pass;

import com.samsung.android.sdk.pass.SpassFingerprint;

/* renamed from: com.samsung.android.sdk.pass.a */
/* loaded from: classes6.dex */
public final class RunnableC8021a implements Runnable {

    /* renamed from: a */
    public /* synthetic */ SpassFingerprint f998a;

    /* renamed from: b */
    public final /* synthetic */ SpassFingerprint.IdentifyListener f999b;

    public RunnableC8021a(SpassFingerprint spassFingerprint, SpassFingerprint.IdentifyListener identifyListener) {
        this.f998a = spassFingerprint;
        this.f999b = identifyListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SpassFingerprint.m1407a(this.f998a, this.f999b, null, 8);
        this.f999b.onCompleted();
    }
}
