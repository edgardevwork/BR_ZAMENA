package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.biometric.BiometricPrompt;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;

/* loaded from: classes.dex */
public class AuthenticationCallbackProvider {

    @Nullable
    public android.hardware.biometrics.BiometricPrompt$AuthenticationCallback mBiometricCallback;

    @Nullable
    public FingerprintManagerCompat.AuthenticationCallback mFingerprintCallback;

    @NonNull
    public final Listener mListener;

    public static class Listener {
        public void onError(int i, @Nullable CharSequence charSequence) {
        }

        public void onFailure() {
        }

        public void onHelp(@Nullable CharSequence charSequence) {
        }

        public void onSuccess(@NonNull BiometricPrompt.AuthenticationResult authenticationResult) {
        }
    }

    public AuthenticationCallbackProvider(@NonNull Listener listener) {
        this.mListener = listener;
    }

    @NonNull
    @RequiresApi(28)
    public android.hardware.biometrics.BiometricPrompt$AuthenticationCallback getBiometricCallback() {
        if (this.mBiometricCallback == null) {
            this.mBiometricCallback = Api28Impl.createCallback(this.mListener);
        }
        return this.mBiometricCallback;
    }

    @NonNull
    public FingerprintManagerCompat.AuthenticationCallback getFingerprintCallback() {
        if (this.mFingerprintCallback == null) {
            this.mFingerprintCallback = new FingerprintManagerCompat.AuthenticationCallback() { // from class: androidx.biometric.AuthenticationCallbackProvider.1
                @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
                public void onAuthenticationError(int i, CharSequence charSequence) {
                    AuthenticationCallbackProvider.this.mListener.onError(i, charSequence);
                }

                @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
                public void onAuthenticationHelp(int i, CharSequence charSequence) {
                    AuthenticationCallbackProvider.this.mListener.onHelp(charSequence);
                }

                @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
                public void onAuthenticationSucceeded(FingerprintManagerCompat.AuthenticationResult authenticationResult) {
                    AuthenticationCallbackProvider.this.mListener.onSuccess(new BiometricPrompt.AuthenticationResult(authenticationResult != null ? CryptoObjectUtils.unwrapFromFingerprintManager(authenticationResult.getCryptoObject()) : null, 2));
                }

                @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
                public void onAuthenticationFailed() {
                    AuthenticationCallbackProvider.this.mListener.onFailure();
                }
            };
        }
        return this.mFingerprintCallback;
    }

    @RequiresApi(30)
    public static class Api30Impl {
        private Api30Impl() {
        }

        public static int getAuthenticationType(@NonNull BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getAuthenticationType();
        }
    }

    @RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
        }

        @NonNull
        public static android.hardware.biometrics.BiometricPrompt$AuthenticationCallback createCallback(@NonNull final Listener listener) {
            return new android.hardware.biometrics.BiometricPrompt$AuthenticationCallback() { // from class: androidx.biometric.AuthenticationCallbackProvider.Api28Impl.1
                public void onAuthenticationHelp(int i, CharSequence charSequence) {
                }

                public void onAuthenticationError(int i, CharSequence charSequence) {
                    listener.onError(i, charSequence);
                }

                public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
                    BiometricPrompt.CryptoObject cryptoObjectUnwrapFromBiometricPrompt = authenticationResult != null ? CryptoObjectUtils.unwrapFromBiometricPrompt(authenticationResult.getCryptoObject()) : null;
                    int i = Build.VERSION.SDK_INT;
                    int authenticationType = -1;
                    if (i >= 30) {
                        if (authenticationResult != null) {
                            authenticationType = Api30Impl.getAuthenticationType(authenticationResult);
                        }
                    } else if (i != 29) {
                        authenticationType = 2;
                    }
                    listener.onSuccess(new BiometricPrompt.AuthenticationResult(cryptoObjectUnwrapFromBiometricPrompt, authenticationType));
                }

                public void onAuthenticationFailed() {
                    listener.onFailure();
                }
            };
        }
    }
}
