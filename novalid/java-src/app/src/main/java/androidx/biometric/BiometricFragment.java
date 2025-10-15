package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.biometric.BiometricPrompt;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes4.dex */
public class BiometricFragment extends Fragment {
    public static final int CANCELED_FROM_CLIENT = 3;
    public static final int CANCELED_FROM_INTERNAL = 0;
    public static final int CANCELED_FROM_NEGATIVE_BUTTON = 2;
    public static final int CANCELED_FROM_USER = 1;
    public static final int DISMISS_INSTANTLY_DELAY_MS = 500;
    public static final String FINGERPRINT_DIALOG_FRAGMENT_TAG = "androidx.biometric.FingerprintDialogFragment";
    public static final int HIDE_DIALOG_DELAY_MS = 2000;
    public static final int REQUEST_CONFIRM_CREDENTIAL = 1;
    public static final int SHOW_PROMPT_DELAY_MS = 600;
    public static final String TAG = "BiometricFragment";

    @VisibleForTesting
    public Handler mHandler = new Handler(Looper.getMainLooper());

    @VisibleForTesting
    public BiometricViewModel mViewModel;

    public static class PromptExecutor implements Executor {
        public final Handler mPromptHandler = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            this.mPromptHandler.post(runnable);
        }
    }

    public static class ShowPromptForAuthenticationRunnable implements Runnable {

        @NonNull
        public final WeakReference<BiometricFragment> mFragmentRef;

        public ShowPromptForAuthenticationRunnable(@Nullable BiometricFragment biometricFragment) {
            this.mFragmentRef = new WeakReference<>(biometricFragment);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.mFragmentRef.get() != null) {
                this.mFragmentRef.get().showPromptForAuthentication();
            }
        }
    }

    public static class StopDelayingPromptRunnable implements Runnable {

        @NonNull
        public final WeakReference<BiometricViewModel> mViewModelRef;

        public StopDelayingPromptRunnable(@Nullable BiometricViewModel biometricViewModel) {
            this.mViewModelRef = new WeakReference<>(biometricViewModel);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.mViewModelRef.get() != null) {
                this.mViewModelRef.get().setDelayingPrompt(false);
            }
        }
    }

    public static class StopIgnoringCancelRunnable implements Runnable {

        @NonNull
        public final WeakReference<BiometricViewModel> mViewModelRef;

        public StopIgnoringCancelRunnable(@Nullable BiometricViewModel biometricViewModel) {
            this.mViewModelRef = new WeakReference<>(biometricViewModel);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.mViewModelRef.get() != null) {
                this.mViewModelRef.get().setIgnoringCancel(false);
            }
        }
    }

    public static BiometricFragment newInstance() {
        return new BiometricFragment();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        connectViewModel();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (Build.VERSION.SDK_INT == 29 && AuthenticatorUtils.isDeviceCredentialAllowed(this.mViewModel.getAllowedAuthenticators())) {
            this.mViewModel.setIgnoringCancel(true);
            this.mHandler.postDelayed(new StopIgnoringCancelRunnable(this.mViewModel), 250L);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (Build.VERSION.SDK_INT >= 29 || this.mViewModel.isConfirmingDeviceCredential() || isChangingConfigurations()) {
            return;
        }
        cancelAuthentication(0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            this.mViewModel.setConfirmingDeviceCredential(false);
            handleConfirmCredentialResult(i2);
        }
    }

    public final void connectViewModel() {
        if (getActivity() == null) {
            return;
        }
        BiometricViewModel biometricViewModel = (BiometricViewModel) new ViewModelProvider(getActivity()).get(BiometricViewModel.class);
        this.mViewModel = biometricViewModel;
        biometricViewModel.getAuthenticationResult().observe(this, new Observer<BiometricPrompt.AuthenticationResult>() { // from class: androidx.biometric.BiometricFragment.1
            public C01951() {
            }

            @Override // androidx.lifecycle.Observer
            public void onChanged(BiometricPrompt.AuthenticationResult authenticationResult) {
                if (authenticationResult != null) {
                    BiometricFragment.this.onAuthenticationSucceeded(authenticationResult);
                    BiometricFragment.this.mViewModel.setAuthenticationResult(null);
                }
            }
        });
        this.mViewModel.getAuthenticationError().observe(this, new Observer<BiometricErrorData>() { // from class: androidx.biometric.BiometricFragment.2
            public C01982() {
            }

            @Override // androidx.lifecycle.Observer
            public void onChanged(BiometricErrorData biometricErrorData) {
                if (biometricErrorData != null) {
                    BiometricFragment.this.onAuthenticationError(biometricErrorData.getErrorCode(), biometricErrorData.getErrorMessage());
                    BiometricFragment.this.mViewModel.setAuthenticationError(null);
                }
            }
        });
        this.mViewModel.getAuthenticationHelpMessage().observe(this, new Observer<CharSequence>() { // from class: androidx.biometric.BiometricFragment.3
            public C01993() {
            }

            @Override // androidx.lifecycle.Observer
            public void onChanged(CharSequence charSequence) {
                if (charSequence != null) {
                    BiometricFragment.this.onAuthenticationHelp(charSequence);
                    BiometricFragment.this.mViewModel.setAuthenticationError(null);
                }
            }
        });
        this.mViewModel.isAuthenticationFailurePending().observe(this, new Observer<Boolean>() { // from class: androidx.biometric.BiometricFragment.4
            public C02004() {
            }

            @Override // androidx.lifecycle.Observer
            public void onChanged(Boolean bool) {
                if (bool.booleanValue()) {
                    BiometricFragment.this.onAuthenticationFailed();
                    BiometricFragment.this.mViewModel.setAuthenticationFailurePending(false);
                }
            }
        });
        this.mViewModel.isNegativeButtonPressPending().observe(this, new Observer<Boolean>() { // from class: androidx.biometric.BiometricFragment.5
            public C02015() {
            }

            @Override // androidx.lifecycle.Observer
            public void onChanged(Boolean bool) {
                if (bool.booleanValue()) {
                    if (BiometricFragment.this.isManagingDeviceCredentialButton()) {
                        BiometricFragment.this.onDeviceCredentialButtonPressed();
                    } else {
                        BiometricFragment.this.onCancelButtonPressed();
                    }
                    BiometricFragment.this.mViewModel.setNegativeButtonPressPending(false);
                }
            }
        });
        this.mViewModel.isFingerprintDialogCancelPending().observe(this, new Observer<Boolean>() { // from class: androidx.biometric.BiometricFragment.6
            public C02026() {
            }

            @Override // androidx.lifecycle.Observer
            public void onChanged(Boolean bool) {
                if (bool.booleanValue()) {
                    BiometricFragment.this.cancelAuthentication(1);
                    BiometricFragment.this.dismiss();
                    BiometricFragment.this.mViewModel.setFingerprintDialogCancelPending(false);
                }
            }
        });
    }

    /* renamed from: androidx.biometric.BiometricFragment$1 */
    /* loaded from: classes.dex */
    public class C01951 implements Observer<BiometricPrompt.AuthenticationResult> {
        public C01951() {
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(BiometricPrompt.AuthenticationResult authenticationResult) {
            if (authenticationResult != null) {
                BiometricFragment.this.onAuthenticationSucceeded(authenticationResult);
                BiometricFragment.this.mViewModel.setAuthenticationResult(null);
            }
        }
    }

    /* renamed from: androidx.biometric.BiometricFragment$2 */
    /* loaded from: classes.dex */
    public class C01982 implements Observer<BiometricErrorData> {
        public C01982() {
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(BiometricErrorData biometricErrorData) {
            if (biometricErrorData != null) {
                BiometricFragment.this.onAuthenticationError(biometricErrorData.getErrorCode(), biometricErrorData.getErrorMessage());
                BiometricFragment.this.mViewModel.setAuthenticationError(null);
            }
        }
    }

    /* renamed from: androidx.biometric.BiometricFragment$3 */
    /* loaded from: classes.dex */
    public class C01993 implements Observer<CharSequence> {
        public C01993() {
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(CharSequence charSequence) {
            if (charSequence != null) {
                BiometricFragment.this.onAuthenticationHelp(charSequence);
                BiometricFragment.this.mViewModel.setAuthenticationError(null);
            }
        }
    }

    /* renamed from: androidx.biometric.BiometricFragment$4 */
    /* loaded from: classes.dex */
    public class C02004 implements Observer<Boolean> {
        public C02004() {
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(Boolean bool) {
            if (bool.booleanValue()) {
                BiometricFragment.this.onAuthenticationFailed();
                BiometricFragment.this.mViewModel.setAuthenticationFailurePending(false);
            }
        }
    }

    /* renamed from: androidx.biometric.BiometricFragment$5 */
    /* loaded from: classes.dex */
    public class C02015 implements Observer<Boolean> {
        public C02015() {
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(Boolean bool) {
            if (bool.booleanValue()) {
                if (BiometricFragment.this.isManagingDeviceCredentialButton()) {
                    BiometricFragment.this.onDeviceCredentialButtonPressed();
                } else {
                    BiometricFragment.this.onCancelButtonPressed();
                }
                BiometricFragment.this.mViewModel.setNegativeButtonPressPending(false);
            }
        }
    }

    /* renamed from: androidx.biometric.BiometricFragment$6 */
    /* loaded from: classes.dex */
    public class C02026 implements Observer<Boolean> {
        public C02026() {
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(Boolean bool) {
            if (bool.booleanValue()) {
                BiometricFragment.this.cancelAuthentication(1);
                BiometricFragment.this.dismiss();
                BiometricFragment.this.mViewModel.setFingerprintDialogCancelPending(false);
            }
        }
    }

    public void authenticate(@NonNull BiometricPrompt.PromptInfo promptInfo, @Nullable BiometricPrompt.CryptoObject cryptoObject) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            Log.e(TAG, "Not launching prompt. Client activity was null.");
            return;
        }
        this.mViewModel.setPromptInfo(promptInfo);
        int consolidatedAuthenticators = AuthenticatorUtils.getConsolidatedAuthenticators(promptInfo, cryptoObject);
        if (Build.VERSION.SDK_INT < 30 && consolidatedAuthenticators == 15 && cryptoObject == null) {
            this.mViewModel.setCryptoObject(CryptoObjectUtils.createFakeCryptoObject());
        } else {
            this.mViewModel.setCryptoObject(cryptoObject);
        }
        if (isManagingDeviceCredentialButton()) {
            this.mViewModel.setNegativeButtonTextOverride(getString(C0212R.string.confirm_device_credential_password));
        } else {
            this.mViewModel.setNegativeButtonTextOverride(null);
        }
        if (isManagingDeviceCredentialButton() && BiometricManager.from(activity).canAuthenticate(255) != 0) {
            this.mViewModel.setAwaitingResult(true);
            launchConfirmCredentialActivity();
        } else if (this.mViewModel.isDelayingPrompt()) {
            this.mHandler.postDelayed(new ShowPromptForAuthenticationRunnable(this), 600L);
        } else {
            showPromptForAuthentication();
        }
    }

    public void showPromptForAuthentication() {
        if (this.mViewModel.isPromptShowing()) {
            return;
        }
        if (getContext() == null) {
            Log.w(TAG, "Not showing biometric prompt. Context is null.");
            return;
        }
        this.mViewModel.setPromptShowing(true);
        this.mViewModel.setAwaitingResult(true);
        if (isUsingFingerprintDialog()) {
            showFingerprintDialogForAuthentication();
        } else {
            showBiometricPromptForAuthentication();
        }
    }

    public final void showFingerprintDialogForAuthentication() {
        Context applicationContext = requireContext().getApplicationContext();
        FingerprintManagerCompat fingerprintManagerCompatFrom = FingerprintManagerCompat.from(applicationContext);
        int iCheckForFingerprintPreAuthenticationErrors = checkForFingerprintPreAuthenticationErrors(fingerprintManagerCompatFrom);
        if (iCheckForFingerprintPreAuthenticationErrors != 0) {
            sendErrorAndDismiss(iCheckForFingerprintPreAuthenticationErrors, ErrorUtils.getFingerprintErrorString(applicationContext, iCheckForFingerprintPreAuthenticationErrors));
            return;
        }
        if (isAdded()) {
            this.mViewModel.setFingerprintDialogDismissedInstantly(true);
            if (!DeviceUtils.shouldHideFingerprintDialog(applicationContext, Build.MODEL)) {
                this.mHandler.postDelayed(new Runnable() { // from class: androidx.biometric.BiometricFragment.7
                    public RunnableC02037() {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        BiometricFragment.this.mViewModel.setFingerprintDialogDismissedInstantly(false);
                    }
                }, 500L);
                FingerprintDialogFragment.newInstance().show(getParentFragmentManager(), FINGERPRINT_DIALOG_FRAGMENT_TAG);
            }
            this.mViewModel.setCanceledFrom(0);
            authenticateWithFingerprint(fingerprintManagerCompatFrom, applicationContext);
        }
    }

    /* renamed from: androidx.biometric.BiometricFragment$7 */
    /* loaded from: classes.dex */
    public class RunnableC02037 implements Runnable {
        public RunnableC02037() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BiometricFragment.this.mViewModel.setFingerprintDialogDismissedInstantly(false);
        }
    }

    @RequiresApi(28)
    public final void showBiometricPromptForAuthentication() {
        BiometricPrompt.Builder builderCreatePromptBuilder = Api28Impl.createPromptBuilder(requireContext().getApplicationContext());
        CharSequence title = this.mViewModel.getTitle();
        CharSequence subtitle = this.mViewModel.getSubtitle();
        CharSequence description = this.mViewModel.getDescription();
        if (title != null) {
            Api28Impl.setTitle(builderCreatePromptBuilder, title);
        }
        if (subtitle != null) {
            Api28Impl.setSubtitle(builderCreatePromptBuilder, subtitle);
        }
        if (description != null) {
            Api28Impl.setDescription(builderCreatePromptBuilder, description);
        }
        CharSequence negativeButtonText = this.mViewModel.getNegativeButtonText();
        if (!TextUtils.isEmpty(negativeButtonText)) {
            Api28Impl.setNegativeButton(builderCreatePromptBuilder, negativeButtonText, this.mViewModel.getClientExecutor(), this.mViewModel.getNegativeButtonListener());
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            Api29Impl.setConfirmationRequired(builderCreatePromptBuilder, this.mViewModel.isConfirmationRequired());
        }
        int allowedAuthenticators = this.mViewModel.getAllowedAuthenticators();
        if (i >= 30) {
            Api30Impl.setAllowedAuthenticators(builderCreatePromptBuilder, allowedAuthenticators);
        } else if (i >= 29) {
            Api29Impl.setDeviceCredentialAllowed(builderCreatePromptBuilder, AuthenticatorUtils.isDeviceCredentialAllowed(allowedAuthenticators));
        }
        authenticateWithBiometricPrompt(Api28Impl.buildPrompt(builderCreatePromptBuilder), getContext());
    }

    @VisibleForTesting
    public void authenticateWithFingerprint(@NonNull FingerprintManagerCompat fingerprintManagerCompat, @NonNull Context context) {
        try {
            fingerprintManagerCompat.authenticate(CryptoObjectUtils.wrapForFingerprintManager(this.mViewModel.getCryptoObject()), 0, this.mViewModel.getCancellationSignalProvider().getFingerprintCancellationSignal(), this.mViewModel.getAuthenticationCallbackProvider().getFingerprintCallback(), (Handler) null);
        } catch (NullPointerException e) {
            Log.e(TAG, "Got NPE while authenticating with fingerprint.", e);
            sendErrorAndDismiss(1, ErrorUtils.getFingerprintErrorString(context, 1));
        }
    }

    @RequiresApi(28)
    @VisibleForTesting
    public void authenticateWithBiometricPrompt(@NonNull android.hardware.biometrics.BiometricPrompt biometricPrompt, @Nullable Context context) {
        String string;
        BiometricPrompt.CryptoObject cryptoObjectWrapForBiometricPrompt = CryptoObjectUtils.wrapForBiometricPrompt(this.mViewModel.getCryptoObject());
        CancellationSignal biometricCancellationSignal = this.mViewModel.getCancellationSignalProvider().getBiometricCancellationSignal();
        PromptExecutor promptExecutor = new PromptExecutor();
        android.hardware.biometrics.BiometricPrompt$AuthenticationCallback biometricCallback = this.mViewModel.getAuthenticationCallbackProvider().getBiometricCallback();
        try {
            if (cryptoObjectWrapForBiometricPrompt == null) {
                Api28Impl.authenticate(biometricPrompt, biometricCancellationSignal, promptExecutor, biometricCallback);
            } else {
                Api28Impl.authenticate(biometricPrompt, cryptoObjectWrapForBiometricPrompt, biometricCancellationSignal, promptExecutor, biometricCallback);
            }
        } catch (NullPointerException e) {
            Log.e(TAG, "Got NPE while authenticating with biometric prompt.", e);
            if (context != null) {
                string = context.getString(C0212R.string.default_error_msg);
            } else {
                string = "";
            }
            sendErrorAndDismiss(1, string);
        }
    }

    public void cancelAuthentication(int i) {
        if (i == 3 || !this.mViewModel.isIgnoringCancel()) {
            if (isUsingFingerprintDialog()) {
                this.mViewModel.setCanceledFrom(i);
                if (i == 1) {
                    sendErrorToClient(10, ErrorUtils.getFingerprintErrorString(getContext(), 10));
                }
            }
            this.mViewModel.getCancellationSignalProvider().cancel();
        }
    }

    public void dismiss() {
        this.mViewModel.setPromptShowing(false);
        dismissFingerprintDialog();
        if (!this.mViewModel.isConfirmingDeviceCredential() && isAdded()) {
            getParentFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
        }
        Context context = getContext();
        if (context == null || !DeviceUtils.shouldDelayShowingPrompt(context, Build.MODEL)) {
            return;
        }
        this.mViewModel.setDelayingPrompt(true);
        this.mHandler.postDelayed(new StopDelayingPromptRunnable(this.mViewModel), 600L);
    }

    public final void dismissFingerprintDialog() {
        this.mViewModel.setPromptShowing(false);
        if (isAdded()) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            FingerprintDialogFragment fingerprintDialogFragment = (FingerprintDialogFragment) parentFragmentManager.findFragmentByTag(FINGERPRINT_DIALOG_FRAGMENT_TAG);
            if (fingerprintDialogFragment != null) {
                if (fingerprintDialogFragment.isAdded()) {
                    fingerprintDialogFragment.dismissAllowingStateLoss();
                } else {
                    parentFragmentManager.beginTransaction().remove(fingerprintDialogFragment).commitAllowingStateLoss();
                }
            }
        }
    }

    @VisibleForTesting
    public void onAuthenticationSucceeded(@NonNull BiometricPrompt.AuthenticationResult authenticationResult) {
        sendSuccessAndDismiss(authenticationResult);
    }

    @VisibleForTesting
    public void onAuthenticationError(int i, @Nullable CharSequence charSequence) {
        if (!ErrorUtils.isKnownError(i)) {
            i = 8;
        }
        Context context = getContext();
        if (Build.VERSION.SDK_INT < 29 && ErrorUtils.isLockoutError(i) && context != null && KeyguardUtils.isDeviceSecuredWithCredential(context) && AuthenticatorUtils.isDeviceCredentialAllowed(this.mViewModel.getAllowedAuthenticators())) {
            launchConfirmCredentialActivity();
            return;
        }
        if (!isUsingFingerprintDialog()) {
            if (charSequence == null) {
                charSequence = getString(C0212R.string.default_error_msg) + " " + i;
            }
            sendErrorAndDismiss(i, charSequence);
            return;
        }
        if (charSequence == null) {
            charSequence = ErrorUtils.getFingerprintErrorString(getContext(), i);
        }
        if (i == 5) {
            int canceledFrom = this.mViewModel.getCanceledFrom();
            if (canceledFrom == 0 || canceledFrom == 3) {
                sendErrorToClient(i, charSequence);
            }
            dismiss();
            return;
        }
        if (this.mViewModel.isFingerprintDialogDismissedInstantly()) {
            sendErrorAndDismiss(i, charSequence);
        } else {
            showFingerprintErrorMessage(charSequence);
            this.mHandler.postDelayed(new Runnable() { // from class: androidx.biometric.BiometricFragment.8
                public final /* synthetic */ CharSequence val$errorString;
                public final /* synthetic */ int val$knownErrorCode;

                public RunnableC02048(int i2, CharSequence charSequence2) {
                    i = i2;
                    charSequence = charSequence2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    BiometricFragment.this.sendErrorAndDismiss(i, charSequence);
                }
            }, getDismissDialogDelay());
        }
        this.mViewModel.setFingerprintDialogDismissedInstantly(true);
    }

    /* renamed from: androidx.biometric.BiometricFragment$8 */
    /* loaded from: classes.dex */
    public class RunnableC02048 implements Runnable {
        public final /* synthetic */ CharSequence val$errorString;
        public final /* synthetic */ int val$knownErrorCode;

        public RunnableC02048(int i2, CharSequence charSequence2) {
            i = i2;
            charSequence = charSequence2;
        }

        @Override // java.lang.Runnable
        public void run() {
            BiometricFragment.this.sendErrorAndDismiss(i, charSequence);
        }
    }

    public void onAuthenticationHelp(@NonNull CharSequence charSequence) {
        if (isUsingFingerprintDialog()) {
            showFingerprintErrorMessage(charSequence);
        }
    }

    public void onAuthenticationFailed() {
        if (isUsingFingerprintDialog()) {
            showFingerprintErrorMessage(getString(C0212R.string.fingerprint_not_recognized));
        }
        sendFailureToClient();
    }

    public void onDeviceCredentialButtonPressed() {
        launchConfirmCredentialActivity();
    }

    public void onCancelButtonPressed() {
        CharSequence negativeButtonText = this.mViewModel.getNegativeButtonText();
        if (negativeButtonText == null) {
            negativeButtonText = getString(C0212R.string.default_error_msg);
        }
        sendErrorAndDismiss(13, negativeButtonText);
        cancelAuthentication(2);
    }

    @RequiresApi(21)
    public final void launchConfirmCredentialActivity() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            Log.e(TAG, "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        KeyguardManager keyguardManager = KeyguardUtils.getKeyguardManager(activity);
        if (keyguardManager == null) {
            sendErrorAndDismiss(12, getString(C0212R.string.generic_error_no_keyguard));
            return;
        }
        CharSequence title = this.mViewModel.getTitle();
        CharSequence subtitle = this.mViewModel.getSubtitle();
        CharSequence description = this.mViewModel.getDescription();
        if (subtitle == null) {
            subtitle = description;
        }
        Intent intentCreateConfirmDeviceCredentialIntent = Api21Impl.createConfirmDeviceCredentialIntent(keyguardManager, title, subtitle);
        if (intentCreateConfirmDeviceCredentialIntent == null) {
            sendErrorAndDismiss(14, getString(C0212R.string.generic_error_no_device_credential));
            return;
        }
        this.mViewModel.setConfirmingDeviceCredential(true);
        if (isUsingFingerprintDialog()) {
            dismissFingerprintDialog();
        }
        intentCreateConfirmDeviceCredentialIntent.setFlags(134742016);
        startActivityForResult(intentCreateConfirmDeviceCredentialIntent, 1);
    }

    public final void handleConfirmCredentialResult(int i) {
        if (i == -1) {
            sendSuccessAndDismiss(new BiometricPrompt.AuthenticationResult(null, 1));
        } else {
            sendErrorAndDismiss(10, getString(C0212R.string.generic_error_user_canceled));
        }
    }

    public final void showFingerprintErrorMessage(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getString(C0212R.string.default_error_msg);
        }
        this.mViewModel.setFingerprintDialogState(2);
        this.mViewModel.setFingerprintDialogHelpMessage(charSequence);
    }

    public final void sendSuccessAndDismiss(@NonNull BiometricPrompt.AuthenticationResult authenticationResult) {
        sendSuccessToClient(authenticationResult);
        dismiss();
    }

    public void sendErrorAndDismiss(int i, @NonNull CharSequence charSequence) {
        sendErrorToClient(i, charSequence);
        dismiss();
    }

    public final void sendSuccessToClient(@NonNull BiometricPrompt.AuthenticationResult authenticationResult) {
        if (!this.mViewModel.isAwaitingResult()) {
            Log.w(TAG, "Success not sent to client. Client is not awaiting a result.");
        } else {
            this.mViewModel.setAwaitingResult(false);
            this.mViewModel.getClientExecutor().execute(new Runnable() { // from class: androidx.biometric.BiometricFragment.9
                public final /* synthetic */ BiometricPrompt.AuthenticationResult val$result;

                public RunnableC02059(BiometricPrompt.AuthenticationResult authenticationResult2) {
                    authenticationResult = authenticationResult2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    BiometricFragment.this.mViewModel.getClientCallback().onAuthenticationSucceeded(authenticationResult);
                }
            });
        }
    }

    /* renamed from: androidx.biometric.BiometricFragment$9 */
    /* loaded from: classes.dex */
    public class RunnableC02059 implements Runnable {
        public final /* synthetic */ BiometricPrompt.AuthenticationResult val$result;

        public RunnableC02059(BiometricPrompt.AuthenticationResult authenticationResult2) {
            authenticationResult = authenticationResult2;
        }

        @Override // java.lang.Runnable
        public void run() {
            BiometricFragment.this.mViewModel.getClientCallback().onAuthenticationSucceeded(authenticationResult);
        }
    }

    public final void sendErrorToClient(int i, @NonNull CharSequence charSequence) {
        if (this.mViewModel.isConfirmingDeviceCredential()) {
            Log.v(TAG, "Error not sent to client. User is confirming their device credential.");
        } else if (!this.mViewModel.isAwaitingResult()) {
            Log.w(TAG, "Error not sent to client. Client is not awaiting a result.");
        } else {
            this.mViewModel.setAwaitingResult(false);
            this.mViewModel.getClientExecutor().execute(new Runnable() { // from class: androidx.biometric.BiometricFragment.10
                public final /* synthetic */ int val$errorCode;
                public final /* synthetic */ CharSequence val$errorString;

                public RunnableC019610(int i2, CharSequence charSequence2) {
                    i = i2;
                    charSequence = charSequence2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    BiometricFragment.this.mViewModel.getClientCallback().onAuthenticationError(i, charSequence);
                }
            });
        }
    }

    /* renamed from: androidx.biometric.BiometricFragment$10 */
    /* loaded from: classes.dex */
    public class RunnableC019610 implements Runnable {
        public final /* synthetic */ int val$errorCode;
        public final /* synthetic */ CharSequence val$errorString;

        public RunnableC019610(int i2, CharSequence charSequence2) {
            i = i2;
            charSequence = charSequence2;
        }

        @Override // java.lang.Runnable
        public void run() {
            BiometricFragment.this.mViewModel.getClientCallback().onAuthenticationError(i, charSequence);
        }
    }

    public final void sendFailureToClient() {
        if (!this.mViewModel.isAwaitingResult()) {
            Log.w(TAG, "Failure not sent to client. Client is not awaiting a result.");
        } else {
            this.mViewModel.getClientExecutor().execute(new Runnable() { // from class: androidx.biometric.BiometricFragment.11
                public RunnableC019711() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    BiometricFragment.this.mViewModel.getClientCallback().onAuthenticationFailed();
                }
            });
        }
    }

    /* renamed from: androidx.biometric.BiometricFragment$11 */
    /* loaded from: classes.dex */
    public class RunnableC019711 implements Runnable {
        public RunnableC019711() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BiometricFragment.this.mViewModel.getClientCallback().onAuthenticationFailed();
        }
    }

    public static int checkForFingerprintPreAuthenticationErrors(FingerprintManagerCompat fingerprintManagerCompat) {
        if (fingerprintManagerCompat.isHardwareDetected()) {
            return !fingerprintManagerCompat.hasEnrolledFingerprints() ? 11 : 0;
        }
        return 12;
    }

    public boolean isManagingDeviceCredentialButton() {
        return Build.VERSION.SDK_INT <= 28 && AuthenticatorUtils.isDeviceCredentialAllowed(this.mViewModel.getAllowedAuthenticators());
    }

    public final boolean isUsingFingerprintDialog() {
        return Build.VERSION.SDK_INT < 28 || isFingerprintDialogNeededForCrypto() || isFingerprintDialogNeededForErrorHandling();
    }

    public final boolean isFingerprintDialogNeededForCrypto() {
        FragmentActivity activity = getActivity();
        return (activity == null || this.mViewModel.getCryptoObject() == null || !DeviceUtils.shouldUseFingerprintForCrypto(activity, Build.MANUFACTURER, Build.MODEL)) ? false : true;
    }

    public final boolean isFingerprintDialogNeededForErrorHandling() {
        return Build.VERSION.SDK_INT == 28 && !PackageUtils.hasSystemFeatureFingerprint(getContext());
    }

    private boolean isChangingConfigurations() {
        FragmentActivity activity = getActivity();
        return activity != null && activity.isChangingConfigurations();
    }

    public final int getDismissDialogDelay() {
        Context context = getContext();
        return (context == null || !DeviceUtils.shouldHideFingerprintDialog(context, Build.MODEL)) ? 2000 : 0;
    }

    @RequiresApi(30)
    /* loaded from: classes.dex */
    public static class Api30Impl {
        private Api30Impl() {
        }

        public static void setAllowedAuthenticators(@NonNull BiometricPrompt.Builder builder, int i) {
            builder.setAllowedAuthenticators(i);
        }
    }

    @RequiresApi(29)
    /* loaded from: classes.dex */
    public static class Api29Impl {
        private Api29Impl() {
        }

        public static void setConfirmationRequired(@NonNull BiometricPrompt.Builder builder, boolean z) {
            builder.setConfirmationRequired(z);
        }

        public static void setDeviceCredentialAllowed(@NonNull BiometricPrompt.Builder builder, boolean z) {
            builder.setDeviceCredentialAllowed(z);
        }
    }

    @RequiresApi(28)
    /* loaded from: classes.dex */
    public static class Api28Impl {
        private Api28Impl() {
        }

        @NonNull
        public static BiometricPrompt.Builder createPromptBuilder(@NonNull Context context) {
            return new BiometricPrompt.Builder(context);
        }

        public static void setTitle(@NonNull BiometricPrompt.Builder builder, @NonNull CharSequence charSequence) {
            builder.setTitle(charSequence);
        }

        public static void setSubtitle(@NonNull BiometricPrompt.Builder builder, @NonNull CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        public static void setDescription(@NonNull BiometricPrompt.Builder builder, @NonNull CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        public static void setNegativeButton(@NonNull BiometricPrompt.Builder builder, @NonNull CharSequence charSequence, @NonNull Executor executor, @NonNull DialogInterface.OnClickListener onClickListener) {
            builder.setNegativeButton(charSequence, executor, onClickListener);
        }

        @NonNull
        public static android.hardware.biometrics.BiometricPrompt buildPrompt(@NonNull BiometricPrompt.Builder builder) {
            return builder.build();
        }

        public static void authenticate(@NonNull android.hardware.biometrics.BiometricPrompt biometricPrompt, @NonNull CancellationSignal cancellationSignal, @NonNull Executor executor, @NonNull android.hardware.biometrics.BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
            biometricPrompt.authenticate(cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
        }

        public static void authenticate(@NonNull android.hardware.biometrics.BiometricPrompt biometricPrompt, @NonNull BiometricPrompt.CryptoObject cryptoObject, @NonNull CancellationSignal cancellationSignal, @NonNull Executor executor, @NonNull android.hardware.biometrics.BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
            biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
        }
    }

    @RequiresApi(21)
    /* loaded from: classes.dex */
    public static class Api21Impl {
        private Api21Impl() {
        }

        @Nullable
        public static Intent createConfirmDeviceCredentialIntent(@NonNull KeyguardManager keyguardManager, @Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
            return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
        }
    }
}
