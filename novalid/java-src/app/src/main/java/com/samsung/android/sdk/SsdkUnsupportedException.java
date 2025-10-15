package com.samsung.android.sdk;

/* loaded from: classes8.dex */
public class SsdkUnsupportedException extends Exception {
    public static final int DEVICE_NOT_SUPPORTED = 1;
    public static final int LIBRARY_NOT_INSTALLED = 2;
    public static final int LIBRARY_UPDATE_IS_RECOMMENDED = 4;
    public static final int LIBRARY_UPDATE_IS_REQUIRED = 3;
    public static final int VENDOR_NOT_SUPPORTED = 0;
    public int mErrorType;

    public SsdkUnsupportedException(String str, int i) {
        super(str);
        this.mErrorType = i;
    }

    public int getType() {
        return this.mErrorType;
    }
}
