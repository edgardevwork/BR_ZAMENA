package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class Android {
    public static final boolean IS_ROBOLECTRIC;
    public static final Class<?> MEMORY_CLASS = getClassForName("libcore.io.Memory");

    static {
        IS_ROBOLECTRIC = getClassForName("org.robolectric.Robolectric") != null;
    }

    public static boolean isOnAndroidDevice() {
        return (MEMORY_CLASS == null || IS_ROBOLECTRIC) ? false : true;
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
