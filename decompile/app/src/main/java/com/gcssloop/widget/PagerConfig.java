package com.gcssloop.widget;

import android.util.Log;

/* loaded from: classes3.dex */
public class PagerConfig {
    public static final String TAG = "PagerGrid";
    public static int sFlingThreshold = 1000;
    public static float sMillisecondsPreInch = 60.0f;
    public static boolean sShowLog;

    public static boolean isShowLog() {
        return sShowLog;
    }

    public static void setShowLog(boolean z) {
        sShowLog = z;
    }

    public static int getFlingThreshold() {
        return sFlingThreshold;
    }

    public static void setFlingThreshold(int i) {
        sFlingThreshold = i;
    }

    public static float getMillisecondsPreInch() {
        return sMillisecondsPreInch;
    }

    public static void setMillisecondsPreInch(float f) {
        sMillisecondsPreInch = f;
    }

    public static void Logi(String str) {
        if (isShowLog()) {
            Log.i(TAG, str);
        }
    }

    public static void Loge(String str) {
        if (isShowLog()) {
            Log.e(TAG, str);
        }
    }
}
