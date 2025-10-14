package androidx.startup;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public final class StartupLogger {
    public static final boolean DEBUG = false;
    public static final String TAG = "StartupLogger";

    /* renamed from: i */
    public static void m929i(@NonNull String str) {
        Log.i(TAG, str);
    }

    /* renamed from: w */
    public static void m930w(@NonNull String str) {
        Log.w(TAG, str);
    }

    /* renamed from: e */
    public static void m928e(@NonNull String str, @Nullable Throwable th) {
        Log.e(TAG, str, th);
    }
}
