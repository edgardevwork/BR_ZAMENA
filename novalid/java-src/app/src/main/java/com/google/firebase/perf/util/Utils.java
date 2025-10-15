package com.google.firebase.perf.util;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.firebase.perf.logging.AndroidLogger;
import okhttp3.HttpUrl;

/* loaded from: classes7.dex */
public class Utils {
    private static Boolean isDebugLoggingEnabled;

    public static int saturatedIntCast(long j) {
        if (j > ParserMinimalBase.MAX_INT_L) {
            return Integer.MAX_VALUE;
        }
        if (j < ParserMinimalBase.MIN_INT_L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static String stripSensitiveInfo(@NonNull String str) {
        HttpUrl httpUrl = HttpUrl.parse(str);
        return httpUrl != null ? httpUrl.newBuilder().username("").password("").query(null).fragment(null).toString() : str;
    }

    public static String truncateURL(String str, int i) {
        int iLastIndexOf;
        if (str.length() <= i) {
            return str;
        }
        if (str.charAt(i) == '/') {
            return str.substring(0, i);
        }
        HttpUrl httpUrl = HttpUrl.parse(str);
        if (httpUrl == null) {
            return str.substring(0, i);
        }
        if (httpUrl.encodedPath().lastIndexOf(47) >= 0 && (iLastIndexOf = str.lastIndexOf(47, i - 1)) >= 0) {
            return str.substring(0, iLastIndexOf);
        }
        return str.substring(0, i);
    }

    public static int bufferToInt(@NonNull byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < 4 && i2 < bArr.length; i2++) {
            i |= (bArr[i2] & 255) << (i2 * 8);
        }
        return i;
    }

    public static boolean isDebugLoggingEnabled(@NonNull Context context) {
        Boolean bool = isDebugLoggingEnabled;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean boolValueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            isDebugLoggingEnabled = boolValueOf;
            return boolValueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            AndroidLogger.getInstance().debug("No perf logcat meta data found " + e.getMessage());
            return false;
        }
    }

    public static void checkArgument(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }
}
