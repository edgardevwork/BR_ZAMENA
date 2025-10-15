package com.samsung.android.sdk;

import android.os.Build;

/* loaded from: classes8.dex */
public class SsdkVendorCheck {
    public static String strBrand = Build.BRAND;
    public static String strManufacturer = Build.MANUFACTURER;

    public static boolean isSamsungDevice() {
        String str = strBrand;
        if (str == null || strManufacturer == null) {
            return false;
        }
        return str.compareToIgnoreCase("Samsung") == 0 || strManufacturer.compareToIgnoreCase("Samsung") == 0;
    }
}
