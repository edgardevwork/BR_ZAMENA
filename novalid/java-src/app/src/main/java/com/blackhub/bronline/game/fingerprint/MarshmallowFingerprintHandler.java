package com.blackhub.bronline.game.fingerprint;

import android.hardware.fingerprint.FingerprintManager;
import androidx.annotation.RequiresApi;
import com.blackhub.bronline.game.fingerprint.FingerprintApi;

@RequiresApi(api = 23)
/* loaded from: classes3.dex */
public class MarshmallowFingerprintHandler extends FingerprintManager.AuthenticationCallback {
    public final FingerprintApi.Callback callback;

    public MarshmallowFingerprintHandler(FingerprintApi.Callback callback) {
        this.callback = callback;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult result) {
        this.callback.onSuccess(CryptoManager.getInstance().getPublicKey());
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public void onAuthenticationFailed() {
        this.callback.onFailure();
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public void onAuthenticationError(int errorCode, CharSequence errorString) {
        if (errorCode == 10 || errorCode == 5) {
            return;
        }
        this.callback.onError(errorCode);
    }
}
