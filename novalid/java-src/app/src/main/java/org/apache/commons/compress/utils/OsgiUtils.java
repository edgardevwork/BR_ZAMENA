package org.apache.commons.compress.utils;

/* loaded from: classes8.dex */
public class OsgiUtils {
    public static final boolean inOsgiEnvironment = isBundleReference(OsgiUtils.class.getClassLoader().getClass());

    public static boolean isBundleReference(Class<?> cls) {
        while (true) {
            if (cls == null) {
                return false;
            }
            if (cls.getName().equals("org.osgi.framework.BundleReference")) {
                return true;
            }
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (isBundleReference(cls2)) {
                    return true;
                }
            }
            cls = cls.getSuperclass();
        }
    }

    public static boolean isRunningInOsgiEnvironment() {
        return inOsgiEnvironment;
    }
}
