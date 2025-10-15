package com.google.protobuf;

@CheckReturnValue
/* loaded from: classes5.dex */
public final class ExtensionSchemas {
    public static final ExtensionSchema<?> LITE_SCHEMA = new ExtensionSchemaLite();
    public static final ExtensionSchema<?> FULL_SCHEMA = loadSchemaForFullRuntime();

    public static ExtensionSchema<?> loadSchemaForFullRuntime() {
        try {
            return (ExtensionSchema) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static ExtensionSchema<?> lite() {
        return LITE_SCHEMA;
    }

    public static ExtensionSchema<?> full() {
        ExtensionSchema<?> extensionSchema = FULL_SCHEMA;
        if (extensionSchema != null) {
            return extensionSchema;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
