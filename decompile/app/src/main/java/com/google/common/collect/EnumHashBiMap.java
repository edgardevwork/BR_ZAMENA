package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

@J2ktIncompatible
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes8.dex */
public final class EnumHashBiMap<K extends Enum<K>, V> extends AbstractBiMap<K, V> {

    @GwtIncompatible
    public static final long serialVersionUID = 0;
    public transient Class<K> keyTypeOrObjectUnderJ2cl;

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
    public /* bridge */ /* synthetic */ boolean containsValue(@CheckForNull Object value) {
        return super.containsValue(value);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    @CheckForNull
    public /* bridge */ /* synthetic */ Object forcePut(Object key, @ParametricNullness Object value) {
        return forcePut((EnumHashBiMap<K, V>) key, (Enum) value);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.BiMap
    public /* bridge */ /* synthetic */ BiMap inverse() {
        return super.inverse();
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    @CheckForNull
    public /* bridge */ /* synthetic */ Object put(Object key, @ParametricNullness Object value) {
        return put((EnumHashBiMap<K, V>) key, (Enum) value);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public /* bridge */ /* synthetic */ void putAll(Map map) {
        super.putAll(map);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
    @CanIgnoreReturnValue
    @CheckForNull
    public /* bridge */ /* synthetic */ Object remove(@CheckForNull Object key) {
        return super.remove(key);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public /* bridge */ /* synthetic */ Set values() {
        return super.values();
    }

    public static <K extends Enum<K>, V> EnumHashBiMap<K, V> create(Class<K> keyType) {
        return new EnumHashBiMap<>(keyType);
    }

    public static <K extends Enum<K>, V> EnumHashBiMap<K, V> create(Map<K, ? extends V> map) {
        EnumHashBiMap<K, V> enumHashBiMapCreate = create(EnumBiMap.inferKeyTypeOrObjectUnderJ2cl(map));
        enumHashBiMapCreate.putAll(map);
        return enumHashBiMapCreate;
    }

    public EnumHashBiMap(Class<K> keyType) {
        super(new EnumMap(keyType), new HashMap());
        this.keyTypeOrObjectUnderJ2cl = keyType;
    }

    @Override // com.google.common.collect.AbstractBiMap
    public K checkKey(K key) {
        return (K) Preconditions.checkNotNull(key);
    }

    @CanIgnoreReturnValue
    @CheckForNull
    public V put(K k, @ParametricNullness V v) {
        return (V) super.put((EnumHashBiMap<K, V>) k, (K) v);
    }

    @CanIgnoreReturnValue
    @CheckForNull
    public V forcePut(K k, @ParametricNullness V v) {
        return (V) super.forcePut((EnumHashBiMap<K, V>) k, (K) v);
    }

    @GwtIncompatible
    public Class<K> keyType() {
        return this.keyTypeOrObjectUnderJ2cl;
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeObject(this.keyTypeOrObjectUnderJ2cl);
        Serialization.writeMap(this, stream);
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        Object object = stream.readObject();
        Objects.requireNonNull(object);
        this.keyTypeOrObjectUnderJ2cl = (Class) object;
        setDelegates(new EnumMap(this.keyTypeOrObjectUnderJ2cl), new HashMap());
        Serialization.populateMap(this, stream);
    }
}
