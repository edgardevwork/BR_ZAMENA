package com.blackhub.bronline.game.fingerprint;

import android.app.Activity;
import android.hardware.fingerprint.FingerprintManager;
import androidx.annotation.NonNull;
import com.google.android.datatransport.cct.CctTransportBackend;
import com.samsung.android.sdk.pass.Spass;

/* loaded from: classes3.dex */
public abstract class FingerprintApi {
    public static final int PERMISSION_FINGERPRINT = 100500;

    public interface Callback {
        void onError(int errorCode);

        void onFailure();

        void onSuccess(String publicKey);
    }

    public abstract void cancel();

    public abstract boolean isFingerprintSupported();

    public abstract void start(@NonNull Callback callback);

    /* JADX WARN: Removed duplicated region for block: B:9:0x001d A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:4:0x0010, B:6:0x0016, B:9:0x001d, B:11:0x0027), top: B:16:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static FingerprintApi create(@NonNull Activity activity) {
        FingerprintManager fingerprintManager = (FingerprintManager) activity.getSystemService(CctTransportBackend.KEY_FINGERPRINT);
        Spass spass = new Spass();
        FingerprintApi marshmallowFingerprintApi = null;
        if (fingerprintManager != null) {
            try {
                if (fingerprintManager.isHardwareDetected()) {
                    marshmallowFingerprintApi = MarshmallowFingerprintApi.getInstance(activity);
                } else {
                    spass.initialize(activity);
                    if (spass.isFeatureEnabled(0)) {
                        marshmallowFingerprintApi = SamsungFingerprintApi.getInstance(activity);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return marshmallowFingerprintApi;
    }
}
