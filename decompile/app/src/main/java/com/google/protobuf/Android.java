package com.google.protobuf;

/* loaded from: classes5.dex */
public final class Android {
    public static boolean ASSUME_ANDROID;
    public static final boolean IS_ROBOLECTRIC;
    public static final Class<?> MEMORY_CLASS = getClassForName("libcore.io.Memory");

    static {
        IS_ROBOLECTRIC = (ASSUME_ANDROID || getClassForName("org.robolectric.Robolectric") == null) ? false : true;
    }

    public static boolean isOnAndroidDevice() {
        return ASSUME_ANDROID || !(MEMORY_CLASS == null || IS_ROBOLECTRIC);
    }

    public static Class<?> getMemoryClass() {
        return MEMORY_CLASS;
    }

    public static <T> Class<T> getClassForName(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
