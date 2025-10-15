package com.samsung.android.sdk.pass;

import com.samsung.android.fingerprint.FingerprintEvent;
import com.samsung.android.sdk.pass.SpassFingerprint;

/* renamed from: com.samsung.android.sdk.pass.e */
/* loaded from: classes6.dex */
public final class RunnableC8025e implements Runnable {

    /* renamed from: a */
    public /* synthetic */ SpassFingerprint.C8019b f1004a;

    /* renamed from: b */
    public final /* synthetic */ FingerprintEvent f1005b;

    /* renamed from: c */
    public final /* synthetic */ SpassFingerprint.IdentifyListener f1006c;

    public RunnableC8025e(SpassFingerprint.C8019b c8019b, FingerprintEvent fingerprintEvent, SpassFingerprint.IdentifyListener identifyListener) {
        this.f1004a = c8019b;
        this.f1005b = fingerprintEvent;
        this.f1006c = identifyListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1005b.eventId;
        if (i == 16) {
            if (SpassFingerprint.f968o) {
                this.f1006c.onCompleted();
            }
        } else {
            if (i == 100000) {
                this.f1006c.onFinished(7);
                this.f1006c.onCompleted();
                return;
            }
            switch (i) {
                case 11:
                    this.f1006c.onReady();
                    break;
                case 12:
                    this.f1006c.onStarted();
                    break;
                case 13:
                    SpassFingerprint.m1407a(SpassFingerprint.this, this.f1006c, this.f1005b, -1);
                    if (!SpassFingerprint.f968o) {
                        this.f1006c.onCompleted();
                        break;
                    }
                    break;
            }
        }
    }
}
