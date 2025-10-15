package androidx.datastore.preferences.protobuf;

/* loaded from: classes2.dex */
public final class ExtensionRegistryFactory {
    public static final Class<?> EXTENSION_REGISTRY_CLASS = reflectExtensionRegistry();
    public static final String FULL_REGISTRY_CLASS_NAME = "androidx.datastore.preferences.protobuf.ExtensionRegistry";

    public static Class<?> reflectExtensionRegistry() {
        try {
            return Class.forName(FULL_REGISTRY_CLASS_NAME);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static ExtensionRegistryLite create() {
        if (EXTENSION_REGISTRY_CLASS != null) {
            try {
                return invokeSubclassFactory("newInstance");
            } catch (Exception unused) {
            }
        }
        return new ExtensionRegistryLite();
    }

    public static ExtensionRegistryLite createEmpty() {
        if (EXTENSION_REGISTRY_CLASS != null) {
            try {
                return invokeSubclassFactory("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return ExtensionRegistryLite.EMPTY_REGISTRY_LITE;
    }

    public static boolean isFullRegistry(ExtensionRegistryLite extensionRegistryLite) {
        Class<?> cls = EXTENSION_REGISTRY_CLASS;
        return cls != null && cls.isAssignableFrom(extensionRegistryLite.getClass());
    }

    public static final ExtensionRegistryLite invokeSubclassFactory(String str) throws Exception {
        return (ExtensionRegistryLite) EXTENSION_REGISTRY_CLASS.getDeclaredMethod(str, null).invoke(null, null);
    }
}
