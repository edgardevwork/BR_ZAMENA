package androidx.biometric;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes4.dex */
public class FingerprintDialogFragment extends DialogFragment {
    public static final int MESSAGE_DISPLAY_TIME_MS = 2000;
    public static final int STATE_FINGERPRINT = 1;
    public static final int STATE_FINGERPRINT_AUTHENTICATED = 3;
    public static final int STATE_FINGERPRINT_ERROR = 2;
    public static final int STATE_NONE = 0;
    public static final String TAG = "FingerprintFragment";
    public int mErrorTextColor;

    @Nullable
    public ImageView mFingerprintIcon;

    @Nullable
    public TextView mHelpMessageView;
    public int mNormalTextColor;
    public BiometricViewModel mViewModel;
    public final Handler mHandler = new Handler(Looper.getMainLooper());
    public final Runnable mResetDialogRunnable = new Runnable() { // from class: androidx.biometric.FingerprintDialogFragment.1
        @Override // java.lang.Runnable
        public void run() {
            FingerprintDialogFragment.this.resetDialog();
        }
    };

    public final boolean shouldAnimateForTransition(int i, int i2) {
        if (i == 0 && i2 == 1) {
            return false;
        }
        if (i == 1 && i2 == 2) {
            return true;
        }
        return i == 2 && i2 == 1;
    }

    @NonNull
    public static FingerprintDialogFragment newInstance() {
        return new FingerprintDialogFragment();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        connectViewModel();
        if (Build.VERSION.SDK_INT >= 26) {
            this.mErrorTextColor = getThemedColorFor(Api26Impl.getColorErrorAttr());
        } else {
            Context context = getContext();
            this.mErrorTextColor = context != null ? ContextCompat.getColor(context, C0212R.color.biometric_error_color) : 0;
        }
        this.mNormalTextColor = getThemedColorFor(android.R.attr.textColorSecondary);
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        CharSequence negativeButtonText;
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
        builder.setTitle(this.mViewModel.getTitle());
        View viewInflate = LayoutInflater.from(builder.getContext()).inflate(C0212R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(C0212R.id.fingerprint_subtitle);
        if (textView != null) {
            CharSequence subtitle = this.mViewModel.getSubtitle();
            if (TextUtils.isEmpty(subtitle)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(subtitle);
            }
        }
        TextView textView2 = (TextView) viewInflate.findViewById(C0212R.id.fingerprint_description);
        if (textView2 != null) {
            CharSequence description = this.mViewModel.getDescription();
            if (TextUtils.isEmpty(description)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(description);
            }
        }
        this.mFingerprintIcon = (ImageView) viewInflate.findViewById(C0212R.id.fingerprint_icon);
        this.mHelpMessageView = (TextView) viewInflate.findViewById(C0212R.id.fingerprint_error);
        if (AuthenticatorUtils.isDeviceCredentialAllowed(this.mViewModel.getAllowedAuthenticators())) {
            negativeButtonText = getString(C0212R.string.confirm_device_credential_password);
        } else {
            negativeButtonText = this.mViewModel.getNegativeButtonText();
        }
        builder.setNegativeButton(negativeButtonText, new DialogInterface.OnClickListener() { // from class: androidx.biometric.FingerprintDialogFragment.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                FingerprintDialogFragment.this.mViewModel.setNegativeButtonPressPending(true);
            }
        });
        builder.setView(viewInflate);
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setCanceledOnTouchOutside(false);
        return alertDialogCreate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.mViewModel.setFingerprintDialogPreviousState(0);
        this.mViewModel.setFingerprintDialogState(1);
        this.mViewModel.setFingerprintDialogHelpMessage(getString(C0212R.string.fingerprint_dialog_touch_sensor));
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.mHandler.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NonNull DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.mViewModel.setFingerprintDialogCancelPending(true);
    }

    private void connectViewModel() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        BiometricViewModel biometricViewModel = (BiometricViewModel) new ViewModelProvider(activity).get(BiometricViewModel.class);
        this.mViewModel = biometricViewModel;
        biometricViewModel.getFingerprintDialogState().observe(this, new Observer<Integer>() { // from class: androidx.biometric.FingerprintDialogFragment.3
            @Override // androidx.lifecycle.Observer
            public void onChanged(Integer num) {
                FingerprintDialogFragment fingerprintDialogFragment = FingerprintDialogFragment.this;
                fingerprintDialogFragment.mHandler.removeCallbacks(fingerprintDialogFragment.mResetDialogRunnable);
                FingerprintDialogFragment.this.updateFingerprintIcon(num.intValue());
                FingerprintDialogFragment.this.updateHelpMessageColor(num.intValue());
                FingerprintDialogFragment fingerprintDialogFragment2 = FingerprintDialogFragment.this;
                fingerprintDialogFragment2.mHandler.postDelayed(fingerprintDialogFragment2.mResetDialogRunnable, 2000L);
            }
        });
        this.mViewModel.getFingerprintDialogHelpMessage().observe(this, new Observer<CharSequence>() { // from class: androidx.biometric.FingerprintDialogFragment.4
            @Override // androidx.lifecycle.Observer
            public void onChanged(CharSequence charSequence) {
                FingerprintDialogFragment fingerprintDialogFragment = FingerprintDialogFragment.this;
                fingerprintDialogFragment.mHandler.removeCallbacks(fingerprintDialogFragment.mResetDialogRunnable);
                FingerprintDialogFragment.this.updateHelpMessageText(charSequence);
                FingerprintDialogFragment fingerprintDialogFragment2 = FingerprintDialogFragment.this;
                fingerprintDialogFragment2.mHandler.postDelayed(fingerprintDialogFragment2.mResetDialogRunnable, 2000L);
            }
        });
    }

    public void updateFingerprintIcon(int i) {
        int fingerprintDialogPreviousState;
        Drawable assetForTransition;
        if (this.mFingerprintIcon == null || (assetForTransition = getAssetForTransition((fingerprintDialogPreviousState = this.mViewModel.getFingerprintDialogPreviousState()), i)) == null) {
            return;
        }
        this.mFingerprintIcon.setImageDrawable(assetForTransition);
        if (shouldAnimateForTransition(fingerprintDialogPreviousState, i)) {
            Api21Impl.startAnimation(assetForTransition);
        }
        this.mViewModel.setFingerprintDialogPreviousState(i);
    }

    public void updateHelpMessageColor(int i) {
        TextView textView = this.mHelpMessageView;
        if (textView != null) {
            textView.setTextColor(i == 2 ? this.mErrorTextColor : this.mNormalTextColor);
        }
    }

    public void updateHelpMessageText(@Nullable CharSequence charSequence) {
        TextView textView = this.mHelpMessageView;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void resetDialog() {
        Context context = getContext();
        if (context == null) {
            Log.w(TAG, "Not resetting the dialog. Context is null.");
        } else {
            this.mViewModel.setFingerprintDialogState(1);
            this.mViewModel.setFingerprintDialogHelpMessage(context.getString(C0212R.string.fingerprint_dialog_touch_sensor));
        }
    }

    public final int getThemedColorFor(int i) throws Resources.NotFoundException {
        Context context = getContext();
        FragmentActivity activity = getActivity();
        if (context == null || activity == null) {
            Log.w(TAG, "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes(typedValue.data, new int[]{i});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    public final Drawable getAssetForTransition(int i, int i2) {
        int i3;
        Context context = getContext();
        if (context == null) {
            Log.w(TAG, "Unable to get asset. Context is null.");
            return null;
        }
        if (i == 0 && i2 == 1) {
            i3 = C0212R.drawable.fingerprint_dialog_fp_icon;
        } else if (i == 1 && i2 == 2) {
            i3 = C0212R.drawable.fingerprint_dialog_error;
        } else if (i == 2 && i2 == 1) {
            i3 = C0212R.drawable.fingerprint_dialog_fp_icon;
        } else {
            if (i != 1 || i2 != 3) {
                return null;
            }
            i3 = C0212R.drawable.fingerprint_dialog_fp_icon;
        }
        return ContextCompat.getDrawable(context, i3);
    }

    @RequiresApi(26)
    public static class Api26Impl {
        private Api26Impl() {
        }

        public static int getColorErrorAttr() {
            return C0212R.attr.colorError;
        }
    }

    @RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
        }

        public static void startAnimation(@NonNull Drawable drawable) {
            if (drawable instanceof AnimatedVectorDrawable) {
                ((AnimatedVectorDrawable) drawable).start();
            }
        }
    }
}
