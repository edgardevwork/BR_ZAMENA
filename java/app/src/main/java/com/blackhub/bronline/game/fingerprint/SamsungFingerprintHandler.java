package com.blackhub.bronline.game.fingerprint;

import android.content.Context;
import android.os.Handler;
import com.blackhub.bronline.game.fingerprint.FingerprintApi;
import com.samsung.android.sdk.pass.SpassFingerprint;


public class SamsungFingerprintHandler extends SpassFingerprint implements SpassFingerprint.IdentifyListener {
    public FingerprintApi.Callback callback;
    public boolean isIdentifing;

    @Override // com.samsung.android.sdk.pass.SpassFingerprint.IdentifyListener
    public void onCompleted() {
    }

    @Override // com.samsung.android.sdk.pass.SpassFingerprint.IdentifyListener
    public void onReady() {
    }

    @Override // com.samsung.android.sdk.pass.SpassFingerprint.IdentifyListener
    public void onStarted() {
    }

    public SamsungFingerprintHandler(Context context) {
        super(context);
    }

    @Override // com.samsung.android.sdk.pass.SpassFingerprint.IdentifyListener
    public void onFinished(int eventStatus) {
        FingerprintApi.Callback callback = this.callback;
        if (callback != null) {
            if (eventStatus == 0) {
                callback.onSuccess(CryptoManager.getInstance().getPublicKey());
            } else if (eventStatus != 8) {
                if (eventStatus == 12 || eventStatus == 16) {
                    callback.onFailure();
                } else {
                    callback.onError(eventStatus);
                }
            }
        }
        this.isIdentifing = false;
    }

    public void setCallback(FingerprintApi.Callback callback) {
        this.callback = callback;
    }

    public void start() {
        if (this.isIdentifing) {
            return;
        }
        try {
            if (CryptoManager.getInstance().getCipher() != null) {
                this.isIdentifing = true;
                startIdentify(this);
            }
        } catch (Exception unused) {
            new Handler().postDelayed(new Runnable() { // from class: com.blackhub.bronline.game.fingerprint.SamsungFingerprintHandler.1
                @Override // java.lang.Runnable
                public void run() {
                    SamsungFingerprintHandler.this.start();
                }
            }, 2000L);
            this.isIdentifing = false;
        }
    }

    public void cancel() {
        if (this.isIdentifing) {
            cancelIdentify();
            this.isIdentifing = false;
        }
    }
}
