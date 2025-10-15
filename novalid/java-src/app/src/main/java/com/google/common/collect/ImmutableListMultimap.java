package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Serialization;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes8.dex */
public class ImmutableListMultimap<K, V> extends ImmutableMultimap<K, V> implements ListMultimap<K, V> {

    @J2ktIncompatible
    @GwtIncompatible
    public static final long serialVersionUID = 0;

    @RetainedWith
    @CheckForNull
    @LazyInit
    public transient ImmutableListMultimap<V, K> inverse;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ ImmutableCollection get(Object key) {
        return get((ImmutableListMultimap<K, V>) key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ Collection get(Object key) {
        return get((ImmutableListMultimap<K, V>) key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ List get(Object key) {
        return get((ImmutableListMultimap<K, V>) key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public /* bridge */ /* synthetic */ ImmutableCollection replaceValues(Object key, Iterable values) {
        return replaceValues((ImmutableListMultimap<K, V>) key, values);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public /* bridge */ /* synthetic */ Collection replaceValues(Object key, Iterable values) {
        return replaceValues((ImmutableListMultimap<K, V>) key, values);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public /* bridge */ /* synthetic */ List replaceValues(Object key, Iterable values) {
        return replaceValues((ImmutableListMultimap<K, V>) key, values);
    }

    /* renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m1184of() {
        return EmptyImmutableListMultimap.INSTANCE;
    }

    /* renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m1185of(K k1, V v1) {
        Builder builder = builder();
        builder.put((Builder) k1, (K) v1);
        return builder.build();
    }

    /* renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m1186of(K k1, V v1, K k2, V v2) {
        Builder builder = builder();
        builder.put((Builder) k1, (K) v1);
        builder.put((Builder) k2, (K) v2);
        return builder.build();
    }

    /* renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m1187of(K k1, V v1, K k2, V v2, K k3, V v3) {
        Builder builder = builder();
        builder.put((Builder) k1, (K) v1);
        builder.put((Builder) k2, (K) v2);
        builder.put((Builder) k3, (K) v3);
        return builder.build();
    }

    /* renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m1188of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) {
        Builder builder = builder();
        builder.put((Builder) k1, (K) v1);
        builder.put((Builder) k2, (K) v2);
        builder.put((Builder) k3, (K) v3);
        builder.put((Builder) k4, (K) v4);
        return builder.build();
    }

    /* renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m1189of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        Builder builder = builder();
        builder.put((Builder) k1, (K) v1);
        builder.put((Builder) k2, (K) v2);
        builder.put((Builder) k3, (K) v3);
        builder.put((Builder) k4, (K) v4);
        builder.put((Builder) k5, (K) v5);
        return builder.build();
    }

    public static <K, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    public static final class Builder<K, V> extends ImmutableMultimap.Builder<K, V> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableMultimap.Builder put(Object key, Object value) {
            return put((Builder<K, V>) key, value);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableMultimap.Builder putAll(Object key, Iterable values) {
            return putAll((Builder<K, V>) key, values);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableMultimap.Builder putAll(Object key, Object[] values) {
            return putAll((Builder<K, V>) key, values);
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> put(K key, V value) {
            super.put((Builder<K, V>) key, (K) value);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
            super.put((Map.Entry) entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
            super.putAll((Iterable) entries);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(K key, Iterable<? extends V> values) {
            super.putAll((Builder<K, V>) key, (Iterable) values);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(K key, V... values) {
            super.putAll((Builder<K, V>) key, (Object[]) values);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Multimap<? extends K, ? extends V> multimap) {
            super.putAll((Multimap) multimap);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> orderKeysBy(Comparator<? super K> keyComparator) {
            super.orderKeysBy((Comparator) keyComparator);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> orderValuesBy(Comparator<? super V> valueComparator) {
            super.orderValuesBy((Comparator) valueComparator);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> combine(ImmutableMultimap.Builder<K, V> other) {
            super.combine((ImmutableMultimap.Builder) other);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public ImmutableListMultimap<K, V> build() {
            return (ImmutableListMultimap) super.build();
        }
    }

    public static <K, V> ImmutableListMultimap<K, V> copyOf(Multimap<? extends K, ? extends V> multimap) {
        if (multimap.isEmpty()) {
            return m1184of();
        }
        if (multimap instanceof ImmutableListMultimap) {
            ImmutableListMultimap<K, V> immutableListMultimap = (ImmutableListMultimap) multimap;
            if (!immutableListMultimap.isPartialView()) {
                return immutableListMultimap;
            }
        }
        return fromMapEntries(multimap.asMap().entrySet(), null);
    }

    public static <K, V> ImmutableListMultimap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
        return new Builder().putAll((Iterable) entries).build();
    }

    public static <K, V> ImmutableListMultimap<K, V> fromMapEntries(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> mapEntries, @CheckForNull Comparator<? super V> valueComparator) {
        ImmutableList immutableListSortedCopyOf;
        if (mapEntries.isEmpty()) {
            return m1184of();
        }
        ImmutableMap.Builder builder = new ImmutableMap.Builder(mapEntries.size());
        int size = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : mapEntries) {
            K key = entry.getKey();
            Collection<? extends V> value = entry.getValue();
            if (valueComparator == null) {
                immutableListSortedCopyOf = ImmutableList.copyOf((Collection) value);
            } else {
                immutableListSortedCopyOf = ImmutableList.sortedCopyOf(valueComparator, value);
            }
            if (!immutableListSortedCopyOf.isEmpty()) {
                builder.put(key, immutableListSortedCopyOf);
                size += immutableListSortedCopyOf.size();
            }
        }
        return new ImmutableListMultimap<>(builder.buildOrThrow(), size);
    }

    public ImmutableListMultimap(ImmutableMap<K, ImmutableList<V>> map, int size) {
        super(map, size);
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public ImmutableList<V> get(K key) {
        ImmutableList<V> immutableList = (ImmutableList) this.map.get(key);
        return immutableList == null ? ImmutableList.m1171of() : immutableList;
    }

    @Override // com.google.common.collect.ImmutableMultimap
    public ImmutableListMultimap<V, K> inverse() {
        ImmutableListMultimap<V, K> immutableListMultimap = this.inverse;
        if (immutableListMultimap != null) {
            return immutableListMultimap;
        }
        ImmutableListMultimap<V, K> immutableListMultimapInvert = invert();
        this.inverse = immutableListMultimapInvert;
        return immutableListMultimapInvert;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ImmutableListMultimap<V, K> invert() {
        Builder builder = builder();
        UnmodifiableIterator it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            builder.put((Builder) entry.getValue(), entry.getKey());
        }
        ImmutableListMultimap<V, K> immutableListMultimapBuild = builder.build();
        immutableListMultimapBuild.inverse = this;
        return immutableListMultimapBuild;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    @CanIgnoreReturnValue
    public final ImmutableList<V> removeAll(@CheckForNull Object key) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    @CanIgnoreReturnValue
    public final ImmutableList<V> replaceValues(K key, Iterable<? extends V> values) {
        throw new UnsupportedOperationException();
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        Serialization.writeMultimap(this, stream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream stream) throws IllegalAccessException, ClassNotFoundException, IOException, IllegalArgumentException {
        stream.defaultReadObject();
        int i = stream.readInt();
        if (i < 0) {
            throw new InvalidObjectException("Invalid key count " + i);
        }
        ImmutableMap.Builder builder = ImmutableMap.builder();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object object = stream.readObject();
            Objects.requireNonNull(object);
            int i4 = stream.readInt();
            if (i4 <= 0) {
                throw new InvalidObjectException("Invalid value count " + i4);
            }
            ImmutableList.Builder builder2 = ImmutableList.builder();
            for (int i5 = 0; i5 < i4; i5++) {
                Object object2 = stream.readObject();
                Objects.requireNonNull(object2);
                builder2.add((ImmutableList.Builder) object2);
            }
            builder.put(object, builder2.build());
            i2 += i4;
        }
        try {
            ImmutableMultimap.FieldSettersHolder.MAP_FIELD_SETTER.set((Serialization.FieldSetter<ImmutableMultimap>) this, (Object) builder.buildOrThrow());
            ImmutableMultimap.FieldSettersHolder.SIZE_FIELD_SETTER.set((Serialization.FieldSetter<ImmutableMultimap>) this, i2);
        } catch (IllegalArgumentException e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }
}
