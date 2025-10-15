package com.fasterxml.jackson.databind.util;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public class NativeImageUtil {
    public static final boolean RUNNING_IN_SVM;

    static {
        RUNNING_IN_SVM = System.getProperty("org.graalvm.nativeimage.imagecode") != null;
    }

    public static boolean isRunningInNativeImage() {
        return RUNNING_IN_SVM && "runtime".equals(System.getProperty("org.graalvm.nativeimage.imagecode"));
    }

    public static boolean isUnsupportedFeatureError(Throwable th) {
        if (!isRunningInNativeImage()) {
            return false;
        }
        if (th instanceof InvocationTargetException) {
            th = th.getCause();
        }
        return th.getClass().getName().equals("com.oracle.svm.core.jdk.UnsupportedFeatureError");
    }

    public static boolean needsReflectionConfiguration(Class<?> cls) {
        if (isRunningInNativeImage()) {
            return (cls.getDeclaredFields().length == 0 || ClassUtil.isRecordType(cls)) && cls.getDeclaredMethods().length == 0 && cls.getDeclaredConstructors().length == 0;
        }
        return false;
    }
}
