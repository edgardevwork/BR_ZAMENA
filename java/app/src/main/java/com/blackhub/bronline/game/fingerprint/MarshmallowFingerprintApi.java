package com.blackhub.bronline.game.fingerprint;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.KeyguardManager;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import androidx.annotation.RequiresApi;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.blackhub.bronline.game.fingerprint.FingerprintApi;
import com.google.android.datatransport.cct.CctTransportBackend;

@SuppressLint({"StaticFieldLeak"})

public final class MarshmallowFingerprintApi extends FingerprintApi {
    public static MarshmallowFingerprintApi instance;
    public final Activity activity;
    public CancellationSignal cancellationSignal;

    public static synchronized MarshmallowFingerprintApi getInstance(Activity activity) {
        try {
            if (instance == null) {
                instance = new MarshmallowFingerprintApi(activity);
            }
        } catch (Throwable th) {
            throw th;
        }
        return instance;
    }

    public MarshmallowFingerprintApi(Activity activity) {
        this.activity = activity;
    }

    @Override // com.blackhub.bronline.game.fingerprint.FingerprintApi
    @RequiresApi(api = 23)
    public boolean isFingerprintSupported() {
        KeyguardManager keyguardManager = (KeyguardManager) this.activity.getSystemService("keyguard");
        FingerprintManager fingerprintManager = (FingerprintManager) this.activity.getSystemService(CctTransportBackend.KEY_FINGERPRINT);
        boolean z = ContextCompat.checkSelfPermission(this.activity, "android.permission.USE_BIOMETRIC") == 0;
        if (!z) {
            ActivityCompat.requestPermissions(this.activity, new String[]{"android.permission.USE_BIOMETRIC"}, FingerprintApi.PERMISSION_FINGERPRINT);
        }
        return z && keyguardManager != null && fingerprintManager != null && keyguardManager.isKeyguardSecure() && fingerprintManager.hasEnrolledFingerprints();
    }

    @Override // com.blackhub.bronline.game.fingerprint.FingerprintApi
    public void start(FingerprintApi.Callback callback) {
        this.cancellationSignal = new CancellationSignal();
        FingerprintManager fingerprintManager = (FingerprintManager) this.activity.getSystemService(CctTransportBackend.KEY_FINGERPRINT);
        FingerprintManager.CryptoObject cryptoObject = new FingerprintManager.CryptoObject(CryptoManager.getInstance().getCipher());
        if (fingerprintManager != null) {
            fingerprintManager.authenticate(cryptoObject, this.cancellationSignal, 0, new MarshmallowFingerprintHandler(callback), null);
        }
    }

    @Override // com.blackhub.bronline.game.fingerprint.FingerprintApi
    public void cancel() {
        CancellationSignal cancellationSignal = this.cancellationSignal;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
            this.cancellationSignal = null;
        }
    }
}
