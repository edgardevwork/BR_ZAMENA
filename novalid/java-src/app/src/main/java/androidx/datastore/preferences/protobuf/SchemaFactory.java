package androidx.datastore.preferences.protobuf;

/* loaded from: classes2.dex */
public interface SchemaFactory {
    <T> Schema<T> createSchema(Class<T> cls);
}
