package androidx.datastore.preferences.protobuf;

/* loaded from: classes2.dex */
public final class MapFieldSchemas {
    public static final MapFieldSchema FULL_SCHEMA = loadSchemaForFullRuntime();
    public static final MapFieldSchema LITE_SCHEMA = new MapFieldSchemaLite();

    public static MapFieldSchema full() {
        return FULL_SCHEMA;
    }

    public static MapFieldSchema lite() {
        return LITE_SCHEMA;
    }

    public static MapFieldSchema loadSchemaForFullRuntime() {
        try {
            return (MapFieldSchema) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
