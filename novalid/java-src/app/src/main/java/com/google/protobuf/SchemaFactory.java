package com.google.protobuf;

@CheckReturnValue
/* loaded from: classes7.dex */
public interface SchemaFactory {
    <T> Schema<T> createSchema(Class<T> messageType);
}
