package com.google.protobuf;

import java.util.Map;

/* loaded from: classes7.dex */
public interface StructOrBuilder extends MessageLiteOrBuilder {
    boolean containsFields(String key);

    @Deprecated
    Map<String, Value> getFields();

    int getFieldsCount();

    Map<String, Value> getFieldsMap();

    Value getFieldsOrDefault(String key, Value defaultValue);

    Value getFieldsOrThrow(String key);
}
