package com.samsung.android.sdk.pass;

import com.samsung.android.fingerprint.FingerprintEvent;
import com.samsung.android.sdk.pass.SpassFingerprint;

/* renamed from: com.samsung.android.sdk.pass.f */
/* loaded from: classes6.dex */
public final class RunnableC8026f implements Runnable {

    /* renamed from: a */
    public /* synthetic */ SpassFingerprint.C8020c f1007a;

    /* renamed from: b */
    public final /* synthetic */ FingerprintEvent f1008b;

    public RunnableC8026f(SpassFingerprint.C8020c c8020c, FingerprintEvent fingerprintEvent) {
        this.f1007a = c8020c;
        this.f1008b = fingerprintEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1007a.f994a != null) {
            int i = this.f1008b.eventId;
            if (i == 11) {
                this.f1007a.f994a.onReady();
            } else {
                if (i != 12) {
                    return;
                }
                this.f1007a.f994a.onStarted();
            }
        }
    }
}
