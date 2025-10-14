package androidx.biometric;

import android.content.Context;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public class BiometricManager {
    public static final int BIOMETRIC_ERROR_HW_UNAVAILABLE = 1;
    public static final int BIOMETRIC_ERROR_NONE_ENROLLED = 11;
    public static final int BIOMETRIC_ERROR_NO_HARDWARE = 12;
    public static final int BIOMETRIC_ERROR_SECURITY_UPDATE_REQUIRED = 15;
    public static final int BIOMETRIC_ERROR_UNSUPPORTED = -2;
    public static final int BIOMETRIC_STATUS_UNKNOWN = -1;
    public static final int BIOMETRIC_SUCCESS = 0;
    public static final String TAG = "BiometricManager";

    @Nullable
    public final android.hardware.biometrics.BiometricManager mBiometricManager;

    @Nullable
    public final FingerprintManagerCompat mFingerprintManager;

    @NonNull
    public final Injector mInjector;

    public interface Authenticators {
        public static final int BIOMETRIC_STRONG = 15;
        public static final int BIOMETRIC_WEAK = 255;
        public static final int DEVICE_CREDENTIAL = 32768;
    }

    @VisibleForTesting
    public interface Injector {
        @Nullable
        @RequiresApi(29)
        android.hardware.biometrics.BiometricManager getBiometricManager();

        @Nullable
        FingerprintManagerCompat getFingerprintManager();

        boolean isDeviceSecurable();

        boolean isDeviceSecuredWithCredential();

        boolean isFingerprintHardwarePresent();

        boolean isStrongBiometricGuaranteed();
    }

    /* loaded from: classes.dex */
    public static class DefaultInjector implements Injector {

        @NonNull
        public final Context mContext;

        public DefaultInjector(@NonNull Context context) {
            this.mContext = context.getApplicationContext();
        }

        @Override // androidx.biometric.BiometricManager.Injector
        @Nullable
        @RequiresApi(29)
        public android.hardware.biometrics.BiometricManager getBiometricManager() {
            return Api29Impl.create(this.mContext);
        }

        @Override // androidx.biometric.BiometricManager.Injector
        @Nullable
        public FingerprintManagerCompat getFingerprintManager() {
            return FingerprintManagerCompat.from(this.mContext);
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public boolean isDeviceSecurable() {
            return KeyguardUtils.getKeyguardManager(this.mContext) != null;
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public boolean isDeviceSecuredWithCredential() {
            return KeyguardUtils.isDeviceSecuredWithCredential(this.mContext);
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public boolean isFingerprintHardwarePresent() {
            return PackageUtils.hasSystemFeatureFingerprint(this.mContext);
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public boolean isStrongBiometricGuaranteed() {
            return DeviceUtils.canAssumeStrongBiometrics(this.mContext, Build.MODEL);
        }
    }

    @NonNull
    public static BiometricManager from(@NonNull Context context) {
        return new BiometricManager(new DefaultInjector(context));
    }

    @VisibleForTesting
    public BiometricManager(@NonNull Injector injector) {
        this.mInjector = injector;
        int i = Build.VERSION.SDK_INT;
        this.mBiometricManager = i >= 29 ? injector.getBiometricManager() : null;
        this.mFingerprintManager = i <= 29 ? injector.getFingerprintManager() : null;
    }

    @Deprecated
    public int canAuthenticate() {
        return canAuthenticate(255);
    }

    public int canAuthenticate(int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            android.hardware.biometrics.BiometricManager biometricManager = this.mBiometricManager;
            if (biometricManager == null) {
                Log.e(TAG, "Failure in canAuthenticate(). BiometricManager was null.");
                return 1;
            }
            return Api30Impl.canAuthenticate(biometricManager, i);
        }
        return canAuthenticateCompat(i);
    }

    public final int canAuthenticateCompat(int i) {
        if (!AuthenticatorUtils.isSupportedCombination(i)) {
            return -2;
        }
        if (i == 0 || !this.mInjector.isDeviceSecurable()) {
            return 12;
        }
        if (AuthenticatorUtils.isDeviceCredentialAllowed(i)) {
            return this.mInjector.isDeviceSecuredWithCredential() ? 0 : 11;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 29) {
            if (AuthenticatorUtils.isWeakBiometricAllowed(i)) {
                return canAuthenticateWithWeakBiometricOnApi29();
            }
            return canAuthenticateWithStrongBiometricOnApi29();
        }
        if (i2 == 28) {
            if (this.mInjector.isFingerprintHardwarePresent()) {
                return canAuthenticateWithFingerprintOrUnknownBiometric();
            }
            return 12;
        }
        return canAuthenticateWithFingerprint();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0044 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @RequiresApi(29)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int canAuthenticateWithStrongBiometricOnApi29() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int iCanAuthenticateWithWeakBiometricOnApi29;
        BiometricPrompt.CryptoObject cryptoObjectWrapForBiometricPrompt;
        Method canAuthenticateWithCryptoMethod = Api29Impl.getCanAuthenticateWithCryptoMethod();
        if (canAuthenticateWithCryptoMethod != null && (cryptoObjectWrapForBiometricPrompt = CryptoObjectUtils.wrapForBiometricPrompt(CryptoObjectUtils.createFakeCryptoObject())) != null) {
            try {
                Object objInvoke = canAuthenticateWithCryptoMethod.invoke(this.mBiometricManager, cryptoObjectWrapForBiometricPrompt);
                if (!(objInvoke instanceof Integer)) {
                    Log.w(TAG, "Invalid return type for canAuthenticate(CryptoObject).");
                } else {
                    return ((Integer) objInvoke).intValue();
                }
            } catch (IllegalAccessException e) {
                e = e;
                Log.w(TAG, "Failed to invoke canAuthenticate(CryptoObject).", e);
                iCanAuthenticateWithWeakBiometricOnApi29 = canAuthenticateWithWeakBiometricOnApi29();
                return this.mInjector.isStrongBiometricGuaranteed() ? iCanAuthenticateWithWeakBiometricOnApi29 : iCanAuthenticateWithWeakBiometricOnApi29;
            } catch (IllegalArgumentException e2) {
                e = e2;
                Log.w(TAG, "Failed to invoke canAuthenticate(CryptoObject).", e);
                iCanAuthenticateWithWeakBiometricOnApi29 = canAuthenticateWithWeakBiometricOnApi29();
                if (this.mInjector.isStrongBiometricGuaranteed()) {
                }
            } catch (InvocationTargetException e3) {
                e = e3;
                Log.w(TAG, "Failed to invoke canAuthenticate(CryptoObject).", e);
                iCanAuthenticateWithWeakBiometricOnApi29 = canAuthenticateWithWeakBiometricOnApi29();
                if (this.mInjector.isStrongBiometricGuaranteed()) {
                }
            }
        }
        iCanAuthenticateWithWeakBiometricOnApi29 = canAuthenticateWithWeakBiometricOnApi29();
        if (this.mInjector.isStrongBiometricGuaranteed() && iCanAuthenticateWithWeakBiometricOnApi29 == 0) {
            return canAuthenticateWithFingerprintOrUnknownBiometric();
        }
    }

    @RequiresApi(29)
    public final int canAuthenticateWithWeakBiometricOnApi29() {
        android.hardware.biometrics.BiometricManager biometricManager = this.mBiometricManager;
        if (biometricManager == null) {
            Log.e(TAG, "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        return Api29Impl.canAuthenticate(biometricManager);
    }

    public final int canAuthenticateWithFingerprintOrUnknownBiometric() {
        if (this.mInjector.isDeviceSecuredWithCredential()) {
            return canAuthenticateWithFingerprint() == 0 ? 0 : -1;
        }
        return canAuthenticateWithFingerprint();
    }

    public final int canAuthenticateWithFingerprint() {
        FingerprintManagerCompat fingerprintManagerCompat = this.mFingerprintManager;
        if (fingerprintManagerCompat == null) {
            Log.e(TAG, "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        if (fingerprintManagerCompat.isHardwareDetected()) {
            return !this.mFingerprintManager.hasEnrolledFingerprints() ? 11 : 0;
        }
        return 12;
    }

    @RequiresApi(30)
    public static class Api30Impl {
        private Api30Impl() {
        }

        public static int canAuthenticate(@NonNull android.hardware.biometrics.BiometricManager biometricManager, int i) {
            return biometricManager.canAuthenticate(i);
        }
    }

    @RequiresApi(29)
    public static class Api29Impl {
        private Api29Impl() {
        }

        @Nullable
        public static android.hardware.biometrics.BiometricManager create(@NonNull Context context) {
            return (android.hardware.biometrics.BiometricManager) context.getSystemService(android.hardware.biometrics.BiometricManager.class);
        }

        public static int canAuthenticate(@NonNull android.hardware.biometrics.BiometricManager biometricManager) {
            return biometricManager.canAuthenticate();
        }

        @Nullable
        public static Method getCanAuthenticateWithCryptoMethod() {
            try {
                return android.hardware.biometrics.BiometricManager.class.getMethod("canAuthenticate", BiometricPrompt.CryptoObject.class);
            } catch (NoSuchMethodException unused) {
                return null;
            }
        }
    }
}
