package com.samsung.android.sdk.pass;

import android.content.Context;
import android.util.Log;
import com.samsung.android.sdk.SsdkInterface;
import com.samsung.android.sdk.SsdkUnsupportedException;
import com.samsung.android.sdk.SsdkVendorCheck;

/* loaded from: classes6.dex */
public class Spass implements SsdkInterface {
    public static final int DEVICE_FINGERPRINT = 0;
    public static final int DEVICE_FINGERPRINT_AVAILABLE_PASSWORD = 4;
    public static final int DEVICE_FINGERPRINT_CUSTOMIZED_DIALOG = 2;
    public static final int DEVICE_FINGERPRINT_FINGER_INDEX = 1;
    public static final int DEVICE_FINGERPRINT_UNIQUE_ID = 3;

    /* renamed from: a */
    public static boolean f962a;

    /* renamed from: b */
    public static boolean f963b;

    /* renamed from: c */
    public static boolean f964c;

    /* renamed from: d */
    public static boolean f965d;

    /* renamed from: e */
    public Context f966e;

    @Override // com.samsung.android.sdk.SsdkInterface
    public int getVersionCode() {
        return 12;
    }

    @Override // com.samsung.android.sdk.SsdkInterface
    public String getVersionName() {
        return "1.2.6";
    }

    @Override // com.samsung.android.sdk.SsdkInterface
    public void initialize(Context context) throws SsdkUnsupportedException {
        if (this.f966e != null) {
            return;
        }
        if (context == null) {
            throw new IllegalArgumentException("context passed is null.");
        }
        if (!SsdkVendorCheck.isSamsungDevice()) {
            throw new SsdkUnsupportedException("This is not Samsung device.", 0);
        }
        try {
            boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("com.sec.feature.fingerprint_manager_service");
            f962a = zHasSystemFeature;
            if (!zHasSystemFeature) {
                throw new SsdkUnsupportedException("This device does not provide FingerprintService.", 1);
            }
            SpassFingerprint spassFingerprint = new SpassFingerprint(context);
            f964c = SpassFingerprint.m1408a();
            f963b = spassFingerprint.m1414b();
            f965d = spassFingerprint.m1415c();
            this.f966e = context;
            Log.i(SpassFingerprint.TAG, "initialize : BP=" + f965d + ",CD=" + f964c + ",ID=" + f963b + ",GT=false");
            SpassFingerprint.m1405a(context, null);
        } catch (NullPointerException unused) {
            throw new IllegalArgumentException("context is not valid.");
        }
    }

    @Override // com.samsung.android.sdk.SsdkInterface
    public boolean isFeatureEnabled(int i) {
        if (this.f966e == null) {
            throw new IllegalStateException("initialize() is not Called first.");
        }
        if (i == 0) {
            return f962a;
        }
        if (i == 1 || i == 2) {
            return f964c;
        }
        if (i == 3) {
            return f963b;
        }
        if (i == 4) {
            return f965d;
        }
        throw new IllegalArgumentException("type passed is not valid");
    }
}
