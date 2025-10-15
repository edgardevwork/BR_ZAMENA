package androidx.biometric;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModelProvider;
import java.lang.ref.WeakReference;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* loaded from: classes4.dex */
public class BiometricPrompt {
    public static final int AUTHENTICATION_RESULT_TYPE_BIOMETRIC = 2;
    public static final int AUTHENTICATION_RESULT_TYPE_DEVICE_CREDENTIAL = 1;
    public static final int AUTHENTICATION_RESULT_TYPE_UNKNOWN = -1;
    public static final String BIOMETRIC_FRAGMENT_TAG = "androidx.biometric.BiometricFragment";
    public static final int BIOMETRIC_SUCCESS = 0;
    public static final int ERROR_CANCELED = 5;
    public static final int ERROR_HW_NOT_PRESENT = 12;
    public static final int ERROR_HW_UNAVAILABLE = 1;
    public static final int ERROR_LOCKOUT = 7;
    public static final int ERROR_LOCKOUT_PERMANENT = 9;
    public static final int ERROR_NEGATIVE_BUTTON = 13;
    public static final int ERROR_NO_BIOMETRICS = 11;
    public static final int ERROR_NO_DEVICE_CREDENTIAL = 14;
    public static final int ERROR_NO_SPACE = 4;
    public static final int ERROR_SECURITY_UPDATE_REQUIRED = 15;
    public static final int ERROR_TIMEOUT = 3;
    public static final int ERROR_UNABLE_TO_PROCESS = 2;
    public static final int ERROR_USER_CANCELED = 10;
    public static final int ERROR_VENDOR = 8;
    public static final String TAG = "BiometricPromptCompat";

    @Nullable
    public FragmentManager mClientFragmentManager;

    public static abstract class AuthenticationCallback {
        public void onAuthenticationError(int i, @NonNull CharSequence charSequence) {
        }

        public void onAuthenticationFailed() {
        }

        public void onAuthenticationSucceeded(@NonNull AuthenticationResult authenticationResult) {
        }
    }

    public static class CryptoObject {

        @Nullable
        public final Cipher mCipher;

        @Nullable
        public final IdentityCredential mIdentityCredential;

        @Nullable
        public final Mac mMac;

        @Nullable
        public final Signature mSignature;

        public CryptoObject(@NonNull Signature signature) {
            this.mSignature = signature;
            this.mCipher = null;
            this.mMac = null;
            this.mIdentityCredential = null;
        }

        public CryptoObject(@NonNull Cipher cipher) {
            this.mSignature = null;
            this.mCipher = cipher;
            this.mMac = null;
            this.mIdentityCredential = null;
        }

        public CryptoObject(@NonNull Mac mac) {
            this.mSignature = null;
            this.mCipher = null;
            this.mMac = mac;
            this.mIdentityCredential = null;
        }

        @RequiresApi(30)
        public CryptoObject(@NonNull IdentityCredential identityCredential) {
            this.mSignature = null;
            this.mCipher = null;
            this.mMac = null;
            this.mIdentityCredential = identityCredential;
        }

        @Nullable
        public Signature getSignature() {
            return this.mSignature;
        }

        @Nullable
        public Cipher getCipher() {
            return this.mCipher;
        }

        @Nullable
        public Mac getMac() {
            return this.mMac;
        }

        @Nullable
        @RequiresApi(30)
        public IdentityCredential getIdentityCredential() {
            return this.mIdentityCredential;
        }
    }

    public static class AuthenticationResult {
        public final int mAuthenticationType;
        public final CryptoObject mCryptoObject;

        public AuthenticationResult(CryptoObject cryptoObject, int i) {
            this.mCryptoObject = cryptoObject;
            this.mAuthenticationType = i;
        }

        @Nullable
        public CryptoObject getCryptoObject() {
            return this.mCryptoObject;
        }

        public int getAuthenticationType() {
            return this.mAuthenticationType;
        }
    }

    public static class PromptInfo {
        public final int mAllowedAuthenticators;

        @Nullable
        public final CharSequence mDescription;
        public final boolean mIsConfirmationRequired;
        public final boolean mIsDeviceCredentialAllowed;

        @Nullable
        public final CharSequence mNegativeButtonText;

        @Nullable
        public final CharSequence mSubtitle;

        @NonNull
        public final CharSequence mTitle;

        public static class Builder {

            @Nullable
            public CharSequence mTitle = null;

            @Nullable
            public CharSequence mSubtitle = null;

            @Nullable
            public CharSequence mDescription = null;

            @Nullable
            public CharSequence mNegativeButtonText = null;
            public boolean mIsConfirmationRequired = true;
            public boolean mIsDeviceCredentialAllowed = false;
            public int mAllowedAuthenticators = 0;

            @NonNull
            public Builder setTitle(@NonNull CharSequence charSequence) {
                this.mTitle = charSequence;
                return this;
            }

            @NonNull
            public Builder setSubtitle(@Nullable CharSequence charSequence) {
                this.mSubtitle = charSequence;
                return this;
            }

            @NonNull
            public Builder setDescription(@Nullable CharSequence charSequence) {
                this.mDescription = charSequence;
                return this;
            }

            @NonNull
            public Builder setNegativeButtonText(@NonNull CharSequence charSequence) {
                this.mNegativeButtonText = charSequence;
                return this;
            }

            @NonNull
            public Builder setConfirmationRequired(boolean z) {
                this.mIsConfirmationRequired = z;
                return this;
            }

            @NonNull
            @Deprecated
            public Builder setDeviceCredentialAllowed(boolean z) {
                this.mIsDeviceCredentialAllowed = z;
                return this;
            }

            @NonNull
            public Builder setAllowedAuthenticators(int i) {
                this.mAllowedAuthenticators = i;
                return this;
            }

            @NonNull
            public PromptInfo build() {
                boolean zIsDeviceCredentialAllowed;
                if (TextUtils.isEmpty(this.mTitle)) {
                    throw new IllegalArgumentException("Title must be set and non-empty.");
                }
                if (!AuthenticatorUtils.isSupportedCombination(this.mAllowedAuthenticators)) {
                    throw new IllegalArgumentException("Authenticator combination is unsupported on API " + Build.VERSION.SDK_INT + ": " + AuthenticatorUtils.convertToString(this.mAllowedAuthenticators));
                }
                int i = this.mAllowedAuthenticators;
                if (i != 0) {
                    zIsDeviceCredentialAllowed = AuthenticatorUtils.isDeviceCredentialAllowed(i);
                } else {
                    zIsDeviceCredentialAllowed = this.mIsDeviceCredentialAllowed;
                }
                if (TextUtils.isEmpty(this.mNegativeButtonText) && !zIsDeviceCredentialAllowed) {
                    throw new IllegalArgumentException("Negative text must be set and non-empty.");
                }
                if (!TextUtils.isEmpty(this.mNegativeButtonText) && zIsDeviceCredentialAllowed) {
                    throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
                }
                return new PromptInfo(this.mTitle, this.mSubtitle, this.mDescription, this.mNegativeButtonText, this.mIsConfirmationRequired, this.mIsDeviceCredentialAllowed, this.mAllowedAuthenticators);
            }
        }

        public PromptInfo(@NonNull CharSequence charSequence, @Nullable CharSequence charSequence2, @Nullable CharSequence charSequence3, @Nullable CharSequence charSequence4, boolean z, boolean z2, int i) {
            this.mTitle = charSequence;
            this.mSubtitle = charSequence2;
            this.mDescription = charSequence3;
            this.mNegativeButtonText = charSequence4;
            this.mIsConfirmationRequired = z;
            this.mIsDeviceCredentialAllowed = z2;
            this.mAllowedAuthenticators = i;
        }

        @NonNull
        public CharSequence getTitle() {
            return this.mTitle;
        }

        @Nullable
        public CharSequence getSubtitle() {
            return this.mSubtitle;
        }

        @Nullable
        public CharSequence getDescription() {
            return this.mDescription;
        }

        @NonNull
        public CharSequence getNegativeButtonText() {
            CharSequence charSequence = this.mNegativeButtonText;
            return charSequence != null ? charSequence : "";
        }

        public boolean isConfirmationRequired() {
            return this.mIsConfirmationRequired;
        }

        @Deprecated
        public boolean isDeviceCredentialAllowed() {
            return this.mIsDeviceCredentialAllowed;
        }

        public int getAllowedAuthenticators() {
            return this.mAllowedAuthenticators;
        }
    }

    /* loaded from: classes.dex */
    public static class ResetCallbackObserver implements LifecycleObserver {

        @NonNull
        public final WeakReference<BiometricViewModel> mViewModelRef;

        public ResetCallbackObserver(@NonNull BiometricViewModel biometricViewModel) {
            this.mViewModelRef = new WeakReference<>(biometricViewModel);
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public void resetCallback() {
            if (this.mViewModelRef.get() != null) {
                this.mViewModelRef.get().resetClientCallback();
            }
        }
    }

    public BiometricPrompt(@NonNull FragmentActivity fragmentActivity, @NonNull AuthenticationCallback authenticationCallback) {
        if (fragmentActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (authenticationCallback == null) {
            throw new IllegalArgumentException("AuthenticationCallback must not be null.");
        }
        init(fragmentActivity.getSupportFragmentManager(), getViewModel(fragmentActivity), null, authenticationCallback);
    }

    public BiometricPrompt(@NonNull Fragment fragment, @NonNull AuthenticationCallback authenticationCallback) {
        if (fragment == null) {
            throw new IllegalArgumentException("Fragment must not be null.");
        }
        if (authenticationCallback == null) {
            throw new IllegalArgumentException("AuthenticationCallback must not be null.");
        }
        FragmentActivity activity = fragment.getActivity();
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        BiometricViewModel viewModel = getViewModel(activity);
        addObservers(fragment, viewModel);
        init(childFragmentManager, viewModel, null, authenticationCallback);
    }

    @SuppressLint({"LambdaLast"})
    public BiometricPrompt(@NonNull FragmentActivity fragmentActivity, @NonNull Executor executor, @NonNull AuthenticationCallback authenticationCallback) {
        if (fragmentActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor == null) {
            throw new IllegalArgumentException("Executor must not be null.");
        }
        if (authenticationCallback == null) {
            throw new IllegalArgumentException("AuthenticationCallback must not be null.");
        }
        init(fragmentActivity.getSupportFragmentManager(), getViewModel(fragmentActivity), executor, authenticationCallback);
    }

    @SuppressLint({"LambdaLast"})
    public BiometricPrompt(@NonNull Fragment fragment, @NonNull Executor executor, @NonNull AuthenticationCallback authenticationCallback) {
        if (fragment == null) {
            throw new IllegalArgumentException("Fragment must not be null.");
        }
        if (executor == null) {
            throw new IllegalArgumentException("Executor must not be null.");
        }
        if (authenticationCallback == null) {
            throw new IllegalArgumentException("AuthenticationCallback must not be null.");
        }
        FragmentActivity activity = fragment.getActivity();
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        BiometricViewModel viewModel = getViewModel(activity);
        addObservers(fragment, viewModel);
        init(childFragmentManager, viewModel, executor, authenticationCallback);
    }

    public final void init(@Nullable FragmentManager fragmentManager, @Nullable BiometricViewModel biometricViewModel, @Nullable Executor executor, @NonNull AuthenticationCallback authenticationCallback) {
        this.mClientFragmentManager = fragmentManager;
        if (biometricViewModel != null) {
            if (executor != null) {
                biometricViewModel.setClientExecutor(executor);
            }
            biometricViewModel.setClientCallback(authenticationCallback);
        }
    }

    public void authenticate(@NonNull PromptInfo promptInfo, @NonNull CryptoObject cryptoObject) {
        if (promptInfo == null) {
            throw new IllegalArgumentException("PromptInfo cannot be null.");
        }
        if (cryptoObject == null) {
            throw new IllegalArgumentException("CryptoObject cannot be null.");
        }
        int consolidatedAuthenticators = AuthenticatorUtils.getConsolidatedAuthenticators(promptInfo, cryptoObject);
        if (AuthenticatorUtils.isWeakBiometricAllowed(consolidatedAuthenticators)) {
            throw new IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
        }
        if (Build.VERSION.SDK_INT < 30 && AuthenticatorUtils.isDeviceCredentialAllowed(consolidatedAuthenticators)) {
            throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
        }
        authenticateInternal(promptInfo, cryptoObject);
    }

    public void authenticate(@NonNull PromptInfo promptInfo) {
        if (promptInfo == null) {
            throw new IllegalArgumentException("PromptInfo cannot be null.");
        }
        authenticateInternal(promptInfo, null);
    }

    public final void authenticateInternal(@NonNull PromptInfo promptInfo, @Nullable CryptoObject cryptoObject) {
        FragmentManager fragmentManager = this.mClientFragmentManager;
        if (fragmentManager == null) {
            Log.e(TAG, "Unable to start authentication. Client fragment manager was null.");
        } else if (fragmentManager.isStateSaved()) {
            Log.e(TAG, "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            findOrAddBiometricFragment(this.mClientFragmentManager).authenticate(promptInfo, cryptoObject);
        }
    }

    public void cancelAuthentication() {
        FragmentManager fragmentManager = this.mClientFragmentManager;
        if (fragmentManager == null) {
            Log.e(TAG, "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        BiometricFragment biometricFragmentFindBiometricFragment = findBiometricFragment(fragmentManager);
        if (biometricFragmentFindBiometricFragment == null) {
            Log.e(TAG, "Unable to cancel authentication. BiometricFragment not found.");
        } else {
            biometricFragmentFindBiometricFragment.cancelAuthentication(3);
        }
    }

    @Nullable
    public static BiometricViewModel getViewModel(@Nullable FragmentActivity fragmentActivity) {
        if (fragmentActivity != null) {
            return (BiometricViewModel) new ViewModelProvider(fragmentActivity).get(BiometricViewModel.class);
        }
        return null;
    }

    public static void addObservers(@NonNull Fragment fragment, @Nullable BiometricViewModel biometricViewModel) {
        if (biometricViewModel != null) {
            fragment.getLifecycle().addObserver(new ResetCallbackObserver(biometricViewModel));
        }
    }

    @Nullable
    public static BiometricFragment findBiometricFragment(@NonNull FragmentManager fragmentManager) {
        return (BiometricFragment) fragmentManager.findFragmentByTag(BIOMETRIC_FRAGMENT_TAG);
    }

    @NonNull
    public static BiometricFragment findOrAddBiometricFragment(@NonNull FragmentManager fragmentManager) {
        BiometricFragment biometricFragmentFindBiometricFragment = findBiometricFragment(fragmentManager);
        if (biometricFragmentFindBiometricFragment != null) {
            return biometricFragmentFindBiometricFragment;
        }
        BiometricFragment biometricFragmentNewInstance = BiometricFragment.newInstance();
        fragmentManager.beginTransaction().add(biometricFragmentNewInstance, BIOMETRIC_FRAGMENT_TAG).commitAllowingStateLoss();
        fragmentManager.executePendingTransactions();
        return biometricFragmentNewInstance;
    }
}
