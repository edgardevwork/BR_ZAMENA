package androidx.biometric;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes.dex */
public class BiometricErrorData {
    public final int mErrorCode;

    @Nullable
    public final CharSequence mErrorMessage;

    public BiometricErrorData(int i, @Nullable CharSequence charSequence) {
        this.mErrorCode = i;
        this.mErrorMessage = charSequence;
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    @Nullable
    public CharSequence getErrorMessage() {
        return this.mErrorMessage;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.mErrorCode), convertToString(this.mErrorMessage)});
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof BiometricErrorData)) {
            return false;
        }
        BiometricErrorData biometricErrorData = (BiometricErrorData) obj;
        return this.mErrorCode == biometricErrorData.mErrorCode && isErrorMessageEqualTo(biometricErrorData.mErrorMessage);
    }

    public final boolean isErrorMessageEqualTo(@Nullable CharSequence charSequence) {
        String strConvertToString = convertToString(this.mErrorMessage);
        String strConvertToString2 = convertToString(charSequence);
        return (strConvertToString == null && strConvertToString2 == null) || (strConvertToString != null && strConvertToString.equals(strConvertToString2));
    }

    @Nullable
    public static String convertToString(@Nullable CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}
