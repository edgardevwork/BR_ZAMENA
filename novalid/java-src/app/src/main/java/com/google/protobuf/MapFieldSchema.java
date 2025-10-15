package com.google.protobuf;

import com.google.protobuf.MapEntryLite;
import java.util.Map;

@CheckReturnValue
/* loaded from: classes7.dex */
public interface MapFieldSchema {
    Map<?, ?> forMapData(Object mapField);

    MapEntryLite.Metadata<?, ?> forMapMetadata(Object mapDefaultEntry);

    Map<?, ?> forMutableMapData(Object mapField);

    int getSerializedSize(int fieldNumber, Object mapField, Object mapDefaultEntry);

    boolean isImmutable(Object mapField);

    @CanIgnoreReturnValue
    Object mergeFrom(Object destMapField, Object srcMapField);

    Object newMapField(Object mapDefaultEntry);

    Object toImmutable(Object mapField);
}
