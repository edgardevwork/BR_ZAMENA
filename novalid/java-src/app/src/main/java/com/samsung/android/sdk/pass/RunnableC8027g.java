package com.samsung.android.sdk.pass;

import com.samsung.android.fingerprint.FingerprintEvent;
import com.samsung.android.sdk.pass.SpassFingerprint;

/* renamed from: com.samsung.android.sdk.pass.g */
/* loaded from: classes6.dex */
public final class RunnableC8027g implements Runnable {

    /* renamed from: a */
    public /* synthetic */ SpassFingerprint.C8020c f1009a;

    /* renamed from: b */
    public final /* synthetic */ FingerprintEvent f1010b;

    /* renamed from: c */
    public final /* synthetic */ SpassFingerprint.IdentifyListener f1011c;

    public RunnableC8027g(SpassFingerprint.C8020c c8020c, FingerprintEvent fingerprintEvent, SpassFingerprint.IdentifyListener identifyListener) {
        this.f1009a = c8020c;
        this.f1010b = fingerprintEvent;
        this.f1011c = identifyListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1010b.eventId == 13) {
            SpassFingerprint.m1407a(SpassFingerprint.this, this.f1011c, this.f1010b, -1);
            this.f1011c.onCompleted();
        }
    }
}
