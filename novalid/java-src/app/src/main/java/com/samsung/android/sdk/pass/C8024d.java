package com.samsung.android.sdk.pass;

import android.util.Log;
import com.samsung.android.fingerprint.FingerprintManager;
import com.samsung.android.sdk.pass.SpassFingerprint;

/* renamed from: com.samsung.android.sdk.pass.d */
/* loaded from: classes6.dex */
public final class C8024d implements FingerprintManager.EnrollFinishListener {

    /* renamed from: a */
    public final /* synthetic */ SpassFingerprint.RegisterListener f1003a;

    public C8024d(SpassFingerprint.RegisterListener registerListener) {
        this.f1003a = registerListener;
    }

    public final void onEnrollFinish() {
        Log.d(SpassFingerprint.TAG, "onEnrollFinish called");
        this.f1003a.onFinished();
    }
}
