package androidx.biometric;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.biometric.AuthenticationCallbackProvider;
import androidx.biometric.BiometricPrompt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class BiometricViewModel extends ViewModel {

    @Nullable
    public AuthenticationCallbackProvider mAuthenticationCallbackProvider;

    @Nullable
    public MutableLiveData<BiometricErrorData> mAuthenticationError;

    @Nullable
    public MutableLiveData<CharSequence> mAuthenticationHelpMessage;

    @Nullable
    public MutableLiveData<BiometricPrompt.AuthenticationResult> mAuthenticationResult;

    @Nullable
    public CancellationSignalProvider mCancellationSignalProvider;

    @Nullable
    public BiometricPrompt.AuthenticationCallback mClientCallback;

    @Nullable
    public Executor mClientExecutor;

    @Nullable
    public BiometricPrompt.CryptoObject mCryptoObject;

    @Nullable
    public MutableLiveData<CharSequence> mFingerprintDialogHelpMessage;

    @Nullable
    public MutableLiveData<Integer> mFingerprintDialogState;

    @Nullable
    public MutableLiveData<Boolean> mIsAuthenticationFailurePending;
    public boolean mIsAwaitingResult;
    public boolean mIsConfirmingDeviceCredential;
    public boolean mIsDelayingPrompt;

    @Nullable
    public MutableLiveData<Boolean> mIsFingerprintDialogCancelPending;
    public boolean mIsIgnoringCancel;

    @Nullable
    public MutableLiveData<Boolean> mIsNegativeButtonPressPending;
    public boolean mIsPromptShowing;

    @Nullable
    public DialogInterface.OnClickListener mNegativeButtonListener;

    @Nullable
    public CharSequence mNegativeButtonTextOverride;

    @Nullable
    public BiometricPrompt.PromptInfo mPromptInfo;
    public int mCanceledFrom = 0;
    public boolean mIsFingerprintDialogDismissedInstantly = true;
    public int mFingerprintDialogPreviousState = 0;

    /* loaded from: classes4.dex */
    public static class DefaultExecutor implements Executor {
        public final Handler mHandler = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.mHandler.post(runnable);
        }
    }

    public static final class CallbackListener extends AuthenticationCallbackProvider.Listener {

        @NonNull
        public final WeakReference<BiometricViewModel> mViewModelRef;

        public CallbackListener(@Nullable BiometricViewModel biometricViewModel) {
            this.mViewModelRef = new WeakReference<>(biometricViewModel);
        }

        @Override // androidx.biometric.AuthenticationCallbackProvider.Listener
        public void onSuccess(@NonNull BiometricPrompt.AuthenticationResult authenticationResult) {
            if (this.mViewModelRef.get() == null || !this.mViewModelRef.get().isAwaitingResult()) {
                return;
            }
            if (authenticationResult.getAuthenticationType() == -1) {
                authenticationResult = new BiometricPrompt.AuthenticationResult(authenticationResult.getCryptoObject(), this.mViewModelRef.get().getInferredAuthenticationResultType());
            }
            this.mViewModelRef.get().setAuthenticationResult(authenticationResult);
        }

        @Override // androidx.biometric.AuthenticationCallbackProvider.Listener
        public void onError(int i, @Nullable CharSequence charSequence) {
            if (this.mViewModelRef.get() == null || this.mViewModelRef.get().isConfirmingDeviceCredential() || !this.mViewModelRef.get().isAwaitingResult()) {
                return;
            }
            this.mViewModelRef.get().setAuthenticationError(new BiometricErrorData(i, charSequence));
        }

        @Override // androidx.biometric.AuthenticationCallbackProvider.Listener
        public void onHelp(@Nullable CharSequence charSequence) {
            if (this.mViewModelRef.get() != null) {
                this.mViewModelRef.get().setAuthenticationHelpMessage(charSequence);
            }
        }

        @Override // androidx.biometric.AuthenticationCallbackProvider.Listener
        public void onFailure() {
            if (this.mViewModelRef.get() == null || !this.mViewModelRef.get().isAwaitingResult()) {
                return;
            }
            this.mViewModelRef.get().setAuthenticationFailurePending(true);
        }
    }

    /* loaded from: classes4.dex */
    public static class NegativeButtonListener implements DialogInterface.OnClickListener {

        @NonNull
        public final WeakReference<BiometricViewModel> mViewModelRef;

        public NegativeButtonListener(@Nullable BiometricViewModel biometricViewModel) {
            this.mViewModelRef = new WeakReference<>(biometricViewModel);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.mViewModelRef.get() != null) {
                this.mViewModelRef.get().setNegativeButtonPressPending(true);
            }
        }
    }

    @NonNull
    public Executor getClientExecutor() {
        Executor executor = this.mClientExecutor;
        return executor != null ? executor : new DefaultExecutor();
    }

    public void setClientExecutor(@NonNull Executor executor) {
        this.mClientExecutor = executor;
    }

    /* renamed from: androidx.biometric.BiometricViewModel$1 */
    public class C02061 extends BiometricPrompt.AuthenticationCallback {
        public C02061() {
        }
    }

    @NonNull
    public BiometricPrompt.AuthenticationCallback getClientCallback() {
        if (this.mClientCallback == null) {
            this.mClientCallback = new BiometricPrompt.AuthenticationCallback() { // from class: androidx.biometric.BiometricViewModel.1
                public C02061() {
                }
            };
        }
        return this.mClientCallback;
    }

    public void setClientCallback(@NonNull BiometricPrompt.AuthenticationCallback authenticationCallback) {
        this.mClientCallback = authenticationCallback;
    }

    public void resetClientCallback() {
        this.mClientCallback = null;
    }

    public void setPromptInfo(@Nullable BiometricPrompt.PromptInfo promptInfo) {
        this.mPromptInfo = promptInfo;
    }

    @Nullable
    public CharSequence getTitle() {
        BiometricPrompt.PromptInfo promptInfo = this.mPromptInfo;
        if (promptInfo != null) {
            return promptInfo.getTitle();
        }
        return null;
    }

    @Nullable
    public CharSequence getSubtitle() {
        BiometricPrompt.PromptInfo promptInfo = this.mPromptInfo;
        if (promptInfo != null) {
            return promptInfo.getSubtitle();
        }
        return null;
    }

    @Nullable
    public CharSequence getDescription() {
        BiometricPrompt.PromptInfo promptInfo = this.mPromptInfo;
        if (promptInfo != null) {
            return promptInfo.getDescription();
        }
        return null;
    }

    @Nullable
    public CharSequence getNegativeButtonText() {
        CharSequence charSequence = this.mNegativeButtonTextOverride;
        if (charSequence != null) {
            return charSequence;
        }
        BiometricPrompt.PromptInfo promptInfo = this.mPromptInfo;
        if (promptInfo != null) {
            return promptInfo.getNegativeButtonText();
        }
        return null;
    }

    public boolean isConfirmationRequired() {
        BiometricPrompt.PromptInfo promptInfo = this.mPromptInfo;
        return promptInfo == null || promptInfo.isConfirmationRequired();
    }

    public int getAllowedAuthenticators() {
        BiometricPrompt.PromptInfo promptInfo = this.mPromptInfo;
        if (promptInfo != null) {
            return AuthenticatorUtils.getConsolidatedAuthenticators(promptInfo, this.mCryptoObject);
        }
        return 0;
    }

    @Nullable
    public BiometricPrompt.CryptoObject getCryptoObject() {
        return this.mCryptoObject;
    }

    public void setCryptoObject(@Nullable BiometricPrompt.CryptoObject cryptoObject) {
        this.mCryptoObject = cryptoObject;
    }

    @NonNull
    public AuthenticationCallbackProvider getAuthenticationCallbackProvider() {
        if (this.mAuthenticationCallbackProvider == null) {
            this.mAuthenticationCallbackProvider = new AuthenticationCallbackProvider(new CallbackListener(this));
        }
        return this.mAuthenticationCallbackProvider;
    }

    @NonNull
    public CancellationSignalProvider getCancellationSignalProvider() {
        if (this.mCancellationSignalProvider == null) {
            this.mCancellationSignalProvider = new CancellationSignalProvider();
        }
        return this.mCancellationSignalProvider;
    }

    @NonNull
    public DialogInterface.OnClickListener getNegativeButtonListener() {
        if (this.mNegativeButtonListener == null) {
            this.mNegativeButtonListener = new NegativeButtonListener(this);
        }
        return this.mNegativeButtonListener;
    }

    public void setNegativeButtonTextOverride(@Nullable CharSequence charSequence) {
        this.mNegativeButtonTextOverride = charSequence;
    }

    public int getCanceledFrom() {
        return this.mCanceledFrom;
    }

    public void setCanceledFrom(int i) {
        this.mCanceledFrom = i;
    }

    public boolean isPromptShowing() {
        return this.mIsPromptShowing;
    }

    public void setPromptShowing(boolean z) {
        this.mIsPromptShowing = z;
    }

    public boolean isAwaitingResult() {
        return this.mIsAwaitingResult;
    }

    public void setAwaitingResult(boolean z) {
        this.mIsAwaitingResult = z;
    }

    public boolean isConfirmingDeviceCredential() {
        return this.mIsConfirmingDeviceCredential;
    }

    public void setConfirmingDeviceCredential(boolean z) {
        this.mIsConfirmingDeviceCredential = z;
    }

    public boolean isDelayingPrompt() {
        return this.mIsDelayingPrompt;
    }

    public void setDelayingPrompt(boolean z) {
        this.mIsDelayingPrompt = z;
    }

    public boolean isIgnoringCancel() {
        return this.mIsIgnoringCancel;
    }

    public void setIgnoringCancel(boolean z) {
        this.mIsIgnoringCancel = z;
    }

    @NonNull
    public LiveData<BiometricPrompt.AuthenticationResult> getAuthenticationResult() {
        if (this.mAuthenticationResult == null) {
            this.mAuthenticationResult = new MutableLiveData<>();
        }
        return this.mAuthenticationResult;
    }

    public void setAuthenticationResult(@Nullable BiometricPrompt.AuthenticationResult authenticationResult) {
        if (this.mAuthenticationResult == null) {
            this.mAuthenticationResult = new MutableLiveData<>();
        }
        updateValue(this.mAuthenticationResult, authenticationResult);
    }

    @NonNull
    public MutableLiveData<BiometricErrorData> getAuthenticationError() {
        if (this.mAuthenticationError == null) {
            this.mAuthenticationError = new MutableLiveData<>();
        }
        return this.mAuthenticationError;
    }

    public void setAuthenticationError(@Nullable BiometricErrorData biometricErrorData) {
        if (this.mAuthenticationError == null) {
            this.mAuthenticationError = new MutableLiveData<>();
        }
        updateValue(this.mAuthenticationError, biometricErrorData);
    }

    @NonNull
    public LiveData<CharSequence> getAuthenticationHelpMessage() {
        if (this.mAuthenticationHelpMessage == null) {
            this.mAuthenticationHelpMessage = new MutableLiveData<>();
        }
        return this.mAuthenticationHelpMessage;
    }

    public void setAuthenticationHelpMessage(@Nullable CharSequence charSequence) {
        if (this.mAuthenticationHelpMessage == null) {
            this.mAuthenticationHelpMessage = new MutableLiveData<>();
        }
        updateValue(this.mAuthenticationHelpMessage, charSequence);
    }

    @NonNull
    public LiveData<Boolean> isAuthenticationFailurePending() {
        if (this.mIsAuthenticationFailurePending == null) {
            this.mIsAuthenticationFailurePending = new MutableLiveData<>();
        }
        return this.mIsAuthenticationFailurePending;
    }

    public void setAuthenticationFailurePending(boolean z) {
        if (this.mIsAuthenticationFailurePending == null) {
            this.mIsAuthenticationFailurePending = new MutableLiveData<>();
        }
        updateValue(this.mIsAuthenticationFailurePending, Boolean.valueOf(z));
    }

    @NonNull
    public LiveData<Boolean> isNegativeButtonPressPending() {
        if (this.mIsNegativeButtonPressPending == null) {
            this.mIsNegativeButtonPressPending = new MutableLiveData<>();
        }
        return this.mIsNegativeButtonPressPending;
    }

    public void setNegativeButtonPressPending(boolean z) {
        if (this.mIsNegativeButtonPressPending == null) {
            this.mIsNegativeButtonPressPending = new MutableLiveData<>();
        }
        updateValue(this.mIsNegativeButtonPressPending, Boolean.valueOf(z));
    }

    public boolean isFingerprintDialogDismissedInstantly() {
        return this.mIsFingerprintDialogDismissedInstantly;
    }

    public void setFingerprintDialogDismissedInstantly(boolean z) {
        this.mIsFingerprintDialogDismissedInstantly = z;
    }

    @NonNull
    public LiveData<Boolean> isFingerprintDialogCancelPending() {
        if (this.mIsFingerprintDialogCancelPending == null) {
            this.mIsFingerprintDialogCancelPending = new MutableLiveData<>();
        }
        return this.mIsFingerprintDialogCancelPending;
    }

    public void setFingerprintDialogCancelPending(boolean z) {
        if (this.mIsFingerprintDialogCancelPending == null) {
            this.mIsFingerprintDialogCancelPending = new MutableLiveData<>();
        }
        updateValue(this.mIsFingerprintDialogCancelPending, Boolean.valueOf(z));
    }

    public int getFingerprintDialogPreviousState() {
        return this.mFingerprintDialogPreviousState;
    }

    public void setFingerprintDialogPreviousState(int i) {
        this.mFingerprintDialogPreviousState = i;
    }

    @NonNull
    public LiveData<Integer> getFingerprintDialogState() {
        if (this.mFingerprintDialogState == null) {
            this.mFingerprintDialogState = new MutableLiveData<>();
        }
        return this.mFingerprintDialogState;
    }

    public void setFingerprintDialogState(int i) {
        if (this.mFingerprintDialogState == null) {
            this.mFingerprintDialogState = new MutableLiveData<>();
        }
        updateValue(this.mFingerprintDialogState, Integer.valueOf(i));
    }

    @NonNull
    public LiveData<CharSequence> getFingerprintDialogHelpMessage() {
        if (this.mFingerprintDialogHelpMessage == null) {
            this.mFingerprintDialogHelpMessage = new MutableLiveData<>();
        }
        return this.mFingerprintDialogHelpMessage;
    }

    public void setFingerprintDialogHelpMessage(@NonNull CharSequence charSequence) {
        if (this.mFingerprintDialogHelpMessage == null) {
            this.mFingerprintDialogHelpMessage = new MutableLiveData<>();
        }
        updateValue(this.mFingerprintDialogHelpMessage, charSequence);
    }

    public int getInferredAuthenticationResultType() {
        int allowedAuthenticators = getAllowedAuthenticators();
        return (!AuthenticatorUtils.isSomeBiometricAllowed(allowedAuthenticators) || AuthenticatorUtils.isDeviceCredentialAllowed(allowedAuthenticators)) ? -1 : 2;
    }

    public static <T> void updateValue(MutableLiveData<T> mutableLiveData, T t) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            mutableLiveData.setValue(t);
        } else {
            mutableLiveData.postValue(t);
        }
    }
}
