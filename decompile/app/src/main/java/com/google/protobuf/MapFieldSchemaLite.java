package com.google.protobuf;

import com.google.protobuf.MapEntryLite;
import java.util.Map;

@CheckReturnValue
/* loaded from: classes7.dex */
public class MapFieldSchemaLite implements MapFieldSchema {
    @Override // com.google.protobuf.MapFieldSchema
    public Map<?, ?> forMutableMapData(Object mapField) {
        return (MapFieldLite) mapField;
    }

    @Override // com.google.protobuf.MapFieldSchema
    public MapEntryLite.Metadata<?, ?> forMapMetadata(Object mapDefaultEntry) {
        return ((MapEntryLite) mapDefaultEntry).getMetadata();
    }

    @Override // com.google.protobuf.MapFieldSchema
    public Map<?, ?> forMapData(Object mapField) {
        return (MapFieldLite) mapField;
    }

    @Override // com.google.protobuf.MapFieldSchema
    public boolean isImmutable(Object mapField) {
        return !((MapFieldLite) mapField).isMutable();
    }

    @Override // com.google.protobuf.MapFieldSchema
    public Object toImmutable(Object mapField) {
        ((MapFieldLite) mapField).makeImmutable();
        return mapField;
    }

    @Override // com.google.protobuf.MapFieldSchema
    public Object newMapField(Object unused) {
        return MapFieldLite.emptyMapField().mutableCopy();
    }

    @Override // com.google.protobuf.MapFieldSchema
    public Object mergeFrom(Object destMapField, Object srcMapField) {
        return mergeFromLite(destMapField, srcMapField);
    }

    public static <K, V> MapFieldLite<K, V> mergeFromLite(Object destMapField, Object srcMapField) {
        MapFieldLite<K, V> mapFieldLiteMutableCopy = (MapFieldLite) destMapField;
        MapFieldLite<K, V> mapFieldLite = (MapFieldLite) srcMapField;
        if (!mapFieldLite.isEmpty()) {
            if (!mapFieldLiteMutableCopy.isMutable()) {
                mapFieldLiteMutableCopy = mapFieldLiteMutableCopy.mutableCopy();
            }
            mapFieldLiteMutableCopy.mergeFrom(mapFieldLite);
        }
        return mapFieldLiteMutableCopy;
    }

    @Override // com.google.protobuf.MapFieldSchema
    public int getSerializedSize(int fieldNumber, Object mapField, Object mapDefaultEntry) {
        return getSerializedSizeLite(fieldNumber, mapField, mapDefaultEntry);
    }

    public static <K, V> int getSerializedSizeLite(int fieldNumber, Object mapField, Object defaultEntry) {
        MapFieldLite mapFieldLite = (MapFieldLite) mapField;
        MapEntryLite mapEntryLite = (MapEntryLite) defaultEntry;
        int iComputeMessageSize = 0;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : mapFieldLite.entrySet()) {
            iComputeMessageSize += mapEntryLite.computeMessageSize(fieldNumber, entry.getKey(), entry.getValue());
        }
        return iComputeMessageSize;
    }
}
