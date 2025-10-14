package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes7.dex */
public final class MapFieldLite<K, V> extends LinkedHashMap<K, V> {
    public static final MapFieldLite<?, ?> EMPTY_MAP_FIELD;
    public boolean isMutable;

    public MapFieldLite() {
        this.isMutable = true;
    }

    public MapFieldLite(Map<K, V> mapData) {
        super(mapData);
        this.isMutable = true;
    }

    static {
        MapFieldLite<?, ?> mapFieldLite = new MapFieldLite<>();
        EMPTY_MAP_FIELD = mapFieldLite;
        mapFieldLite.makeImmutable();
    }

    public static <K, V> MapFieldLite<K, V> emptyMapField() {
        return (MapFieldLite<K, V>) EMPTY_MAP_FIELD;
    }

    public void mergeFrom(MapFieldLite<K, V> other) {
        ensureMutable();
        if (other.isEmpty()) {
            return;
        }
        putAll(other);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        ensureMutable();
        super.clear();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        ensureMutable();
        Internal.checkNotNull(k);
        Internal.checkNotNull(v);
        return (V) super.put(k, v);
    }

    public V put(Map.Entry<K, V> entry) {
        return put(entry.getKey(), entry.getValue());
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> m) {
        ensureMutable();
        checkForNullKeysAndValues(m);
        super.putAll(m);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        ensureMutable();
        return (V) super.remove(obj);
    }

    public static void checkForNullKeysAndValues(Map<?, ?> m) {
        for (Object obj : m.keySet()) {
            Internal.checkNotNull(obj);
            Internal.checkNotNull(m.get(obj));
        }
    }

    public static boolean equals(Object a2, Object b) {
        if ((a2 instanceof byte[]) && (b instanceof byte[])) {
            return Arrays.equals((byte[]) a2, (byte[]) b);
        }
        return a2.equals(b);
    }

    public static <K, V> boolean equals(Map<K, V> a2, Map<K, V> b) {
        if (a2 == b) {
            return true;
        }
        if (a2.size() != b.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : a2.entrySet()) {
            if (!b.containsKey(entry.getKey()) || !equals(entry.getValue(), b.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object object) {
        return (object instanceof Map) && equals((Map) this, (Map) object);
    }

    public static int calculateHashCodeForObject(Object a2) {
        if (a2 instanceof byte[]) {
            return Internal.hashCode((byte[]) a2);
        }
        if (a2 instanceof Internal.EnumLite) {
            throw new UnsupportedOperationException();
        }
        return a2.hashCode();
    }

    public static <K, V> int calculateHashCodeForMap(Map<K, V> a2) {
        int iCalculateHashCodeForObject = 0;
        for (Map.Entry<K, V> entry : a2.entrySet()) {
            iCalculateHashCodeForObject += calculateHashCodeForObject(entry.getValue()) ^ calculateHashCodeForObject(entry.getKey());
        }
        return iCalculateHashCodeForObject;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return calculateHashCodeForMap(this);
    }

    public static Object copy(Object object) {
        if (!(object instanceof byte[])) {
            return object;
        }
        byte[] bArr = (byte[]) object;
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> Map<K, V> copy(Map<K, V> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(((map.size() * 4) / 3) + 1);
        for (Map.Entry<K, V> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), copy(entry.getValue()));
        }
        return linkedHashMap;
    }

    public MapFieldLite<K, V> mutableCopy() {
        return isEmpty() ? new MapFieldLite<>() : new MapFieldLite<>(this);
    }

    public void makeImmutable() {
        this.isMutable = false;
    }

    public boolean isMutable() {
        return this.isMutable;
    }

    public final void ensureMutable() {
        if (!isMutable()) {
            throw new UnsupportedOperationException();
        }
    }
}
