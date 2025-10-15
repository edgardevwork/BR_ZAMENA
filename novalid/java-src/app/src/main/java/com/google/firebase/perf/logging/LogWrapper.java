package com.google.firebase.perf.logging;

import android.util.Log;

/* loaded from: classes7.dex */
class LogWrapper {
    private static final String LOG_TAG = "FirebasePerformance";
    private static LogWrapper instance;

    public static synchronized LogWrapper getInstance() {
        try {
            if (instance == null) {
                instance = new LogWrapper();
            }
        } catch (Throwable th) {
            throw th;
        }
        return instance;
    }

    /* renamed from: d */
    public void m1386d(String str) {
        Log.d(LOG_TAG, str);
    }

    /* renamed from: v */
    public void m1389v(String str) {
        Log.v(LOG_TAG, str);
    }

    /* renamed from: i */
    public void m1388i(String str) {
        Log.i(LOG_TAG, str);
    }

    /* renamed from: w */
    public void m1390w(String str) {
        Log.w(LOG_TAG, str);
    }

    /* renamed from: e */
    public void m1387e(String str) {
        Log.e(LOG_TAG, str);
    }

    private LogWrapper() {
    }
}
