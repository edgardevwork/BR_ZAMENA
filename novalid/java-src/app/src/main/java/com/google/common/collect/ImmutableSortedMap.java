package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes8.dex */
public final class ImmutableSortedMap<K, V> extends ImmutableSortedMapFauxverideShim<K, V> implements NavigableMap<K, V> {
    public static final long serialVersionUID = 0;

    @CheckForNull
    public transient ImmutableSortedMap<K, V> descendingMap;
    public final transient RegularImmutableSortedSet<K> keySet;
    public final transient ImmutableList<V> valueList;
    public static final Comparator<Comparable> NATURAL_ORDER = Ordering.natural();
    public static final ImmutableSortedMap<Comparable, Object> NATURAL_EMPTY_MAP = new ImmutableSortedMap<>(ImmutableSortedSet.emptySet(Ordering.natural()), ImmutableList.m1171of());

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap
    public /* bridge */ /* synthetic */ NavigableMap headMap(Object toKey, boolean inclusive) {
        return headMap((ImmutableSortedMap<K, V>) toKey, inclusive);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap, java.util.SortedMap
    public /* bridge */ /* synthetic */ SortedMap headMap(Object toKey) {
        return headMap((ImmutableSortedMap<K, V>) toKey);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap
    public /* bridge */ /* synthetic */ NavigableMap subMap(Object fromKey, boolean fromInclusive, Object toKey, boolean toInclusive) {
        return subMap((boolean) fromKey, fromInclusive, (boolean) toKey, toInclusive);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap
    public /* bridge */ /* synthetic */ NavigableMap tailMap(Object fromKey, boolean inclusive) {
        return tailMap((ImmutableSortedMap<K, V>) fromKey, inclusive);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap, java.util.SortedMap
    public /* bridge */ /* synthetic */ SortedMap tailMap(Object fromKey) {
        return tailMap((ImmutableSortedMap<K, V>) fromKey);
    }

    public static <K, V> ImmutableSortedMap<K, V> emptyMap(Comparator<? super K> comparator) {
        if (Ordering.natural().equals(comparator)) {
            return m1231of();
        }
        return new ImmutableSortedMap<>(ImmutableSortedSet.emptySet(comparator), ImmutableList.m1171of());
    }

    /* renamed from: of */
    public static <K, V> ImmutableSortedMap<K, V> m1231of() {
        return (ImmutableSortedMap<K, V>) NATURAL_EMPTY_MAP;
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    /* renamed from: of */
    public static ImmutableSortedMap m1232of(Comparable k1, Object v1) {
        return m1242of(Ordering.natural(), k1, v1);
    }

    /* renamed from: of */
    public static <K, V> ImmutableSortedMap<K, V> m1242of(Comparator<? super K> comparator, K k1, V v1) {
        return new ImmutableSortedMap<>(new RegularImmutableSortedSet(ImmutableList.m1172of(k1), (Comparator) Preconditions.checkNotNull(comparator)), ImmutableList.m1172of(v1));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    /* renamed from: of */
    public static ImmutableSortedMap m1233of(Comparable k1, Object v1, Comparable k2, Object v2) {
        return fromEntries(ImmutableMap.entryOf(k1, v1), ImmutableMap.entryOf(k2, v2));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    /* renamed from: of */
    public static ImmutableSortedMap m1234of(Comparable k1, Object v1, Comparable k2, Object v2, Comparable k3, Object v3) {
        return fromEntries(ImmutableMap.entryOf(k1, v1), ImmutableMap.entryOf(k2, v2), ImmutableMap.entryOf(k3, v3));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    /* renamed from: of */
    public static ImmutableSortedMap m1235of(Comparable k1, Object v1, Comparable k2, Object v2, Comparable k3, Object v3, Comparable k4, Object v4) {
        return fromEntries(ImmutableMap.entryOf(k1, v1), ImmutableMap.entryOf(k2, v2), ImmutableMap.entryOf(k3, v3), ImmutableMap.entryOf(k4, v4));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    /* renamed from: of */
    public static ImmutableSortedMap m1236of(Comparable k1, Object v1, Comparable k2, Object v2, Comparable k3, Object v3, Comparable k4, Object v4, Comparable k5, Object v5) {
        return fromEntries(ImmutableMap.entryOf(k1, v1), ImmutableMap.entryOf(k2, v2), ImmutableMap.entryOf(k3, v3), ImmutableMap.entryOf(k4, v4), ImmutableMap.entryOf(k5, v5));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    /* renamed from: of */
    public static ImmutableSortedMap m1237of(Comparable k1, Object v1, Comparable k2, Object v2, Comparable k3, Object v3, Comparable k4, Object v4, Comparable k5, Object v5, Comparable k6, Object v6) {
        return fromEntries(ImmutableMap.entryOf(k1, v1), ImmutableMap.entryOf(k2, v2), ImmutableMap.entryOf(k3, v3), ImmutableMap.entryOf(k4, v4), ImmutableMap.entryOf(k5, v5), ImmutableMap.entryOf(k6, v6));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    /* renamed from: of */
    public static ImmutableSortedMap m1238of(Comparable k1, Object v1, Comparable k2, Object v2, Comparable k3, Object v3, Comparable k4, Object v4, Comparable k5, Object v5, Comparable k6, Object v6, Comparable k7, Object v7) {
        return fromEntries(ImmutableMap.entryOf(k1, v1), ImmutableMap.entryOf(k2, v2), ImmutableMap.entryOf(k3, v3), ImmutableMap.entryOf(k4, v4), ImmutableMap.entryOf(k5, v5), ImmutableMap.entryOf(k6, v6), ImmutableMap.entryOf(k7, v7));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    /* renamed from: of */
    public static ImmutableSortedMap m1239of(Comparable k1, Object v1, Comparable k2, Object v2, Comparable k3, Object v3, Comparable k4, Object v4, Comparable k5, Object v5, Comparable k6, Object v6, Comparable k7, Object v7, Comparable k8, Object v8) {
        return fromEntries(ImmutableMap.entryOf(k1, v1), ImmutableMap.entryOf(k2, v2), ImmutableMap.entryOf(k3, v3), ImmutableMap.entryOf(k4, v4), ImmutableMap.entryOf(k5, v5), ImmutableMap.entryOf(k6, v6), ImmutableMap.entryOf(k7, v7), ImmutableMap.entryOf(k8, v8));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    /* renamed from: of */
    public static ImmutableSortedMap m1240of(Comparable k1, Object v1, Comparable k2, Object v2, Comparable k3, Object v3, Comparable k4, Object v4, Comparable k5, Object v5, Comparable k6, Object v6, Comparable k7, Object v7, Comparable k8, Object v8, Comparable k9, Object v9) {
        return fromEntries(ImmutableMap.entryOf(k1, v1), ImmutableMap.entryOf(k2, v2), ImmutableMap.entryOf(k3, v3), ImmutableMap.entryOf(k4, v4), ImmutableMap.entryOf(k5, v5), ImmutableMap.entryOf(k6, v6), ImmutableMap.entryOf(k7, v7), ImmutableMap.entryOf(k8, v8), ImmutableMap.entryOf(k9, v9));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    /* renamed from: of */
    public static ImmutableSortedMap m1241of(Comparable k1, Object v1, Comparable k2, Object v2, Comparable k3, Object v3, Comparable k4, Object v4, Comparable k5, Object v5, Comparable k6, Object v6, Comparable k7, Object v7, Comparable k8, Object v8, Comparable k9, Object v9, Comparable k10, Object v10) {
        return fromEntries(ImmutableMap.entryOf(k1, v1), ImmutableMap.entryOf(k2, v2), ImmutableMap.entryOf(k3, v3), ImmutableMap.entryOf(k4, v4), ImmutableMap.entryOf(k5, v5), ImmutableMap.entryOf(k6, v6), ImmutableMap.entryOf(k7, v7), ImmutableMap.entryOf(k8, v8), ImmutableMap.entryOf(k9, v9), ImmutableMap.entryOf(k10, v10));
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        return copyOfInternal(map, (Ordering) NATURAL_ORDER);
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOf(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        return copyOfInternal(map, (Comparator) Preconditions.checkNotNull(comparator));
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
        return copyOf(entries, (Ordering) NATURAL_ORDER);
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries, Comparator<? super K> comparator) {
        return fromEntries((Comparator) Preconditions.checkNotNull(comparator), false, entries);
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOfSorted(SortedMap<K, ? extends V> map) {
        Comparator<? super K> comparator = map.comparator();
        if (comparator == null) {
            comparator = NATURAL_ORDER;
        }
        if (map instanceof ImmutableSortedMap) {
            ImmutableSortedMap<K, V> immutableSortedMap = (ImmutableSortedMap) map;
            if (!immutableSortedMap.isPartialView()) {
                return immutableSortedMap;
            }
        }
        return fromEntries(comparator, true, map.entrySet());
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOfInternal(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        boolean zEquals = false;
        if (map instanceof SortedMap) {
            Comparator<? super K> comparator2 = ((SortedMap) map).comparator();
            if (comparator2 != null) {
                zEquals = comparator.equals(comparator2);
            } else if (comparator == NATURAL_ORDER) {
                zEquals = true;
            }
        }
        if (zEquals && (map instanceof ImmutableSortedMap)) {
            ImmutableSortedMap<K, V> immutableSortedMap = (ImmutableSortedMap) map;
            if (!immutableSortedMap.isPartialView()) {
                return immutableSortedMap;
            }
        }
        return fromEntries(comparator, zEquals, map.entrySet());
    }

    public static <K extends Comparable<? super K>, V> ImmutableSortedMap<K, V> fromEntries(Map.Entry<K, V>... entries) {
        return fromEntries(Ordering.natural(), false, entries, entries.length);
    }

    public static <K, V> ImmutableSortedMap<K, V> fromEntries(Comparator<? super K> comparator, boolean sameComparator, Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
        Map.Entry[] entryArr = (Map.Entry[]) Iterables.toArray(entries, ImmutableMap.EMPTY_ENTRY_ARRAY);
        return fromEntries(comparator, sameComparator, entryArr, entryArr.length);
    }

    public static <K, V> ImmutableSortedMap<K, V> fromEntries(final Comparator<? super K> comparator, boolean sameComparator, Map.Entry<K, V>[] entryArray, int size) {
        if (size == 0) {
            return emptyMap(comparator);
        }
        if (size == 1) {
            Map.Entry<K, V> entry = entryArray[0];
            Objects.requireNonNull(entry);
            Map.Entry<K, V> entry2 = entry;
            return m1242of(comparator, entry2.getKey(), entry2.getValue());
        }
        Object[] objArr = new Object[size];
        Object[] objArr2 = new Object[size];
        if (sameComparator) {
            for (int i = 0; i < size; i++) {
                Map.Entry<K, V> entry3 = entryArray[i];
                Objects.requireNonNull(entry3);
                Map.Entry<K, V> entry4 = entry3;
                K key = entry4.getKey();
                V value = entry4.getValue();
                CollectPreconditions.checkEntryNotNull(key, value);
                objArr[i] = key;
                objArr2[i] = value;
            }
        } else {
            Arrays.sort(entryArray, 0, size, new Comparator() { // from class: com.google.common.collect.ImmutableSortedMap$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ImmutableSortedMap.lambda$fromEntries$0(comparator, (Map.Entry) obj, (Map.Entry) obj2);
                }
            });
            Map.Entry<K, V> entry5 = entryArray[0];
            Objects.requireNonNull(entry5);
            Map.Entry<K, V> entry6 = entry5;
            Object key2 = entry6.getKey();
            objArr[0] = key2;
            V value2 = entry6.getValue();
            objArr2[0] = value2;
            CollectPreconditions.checkEntryNotNull(objArr[0], value2);
            int i2 = 1;
            while (i2 < size) {
                Map.Entry<K, V> entry7 = entryArray[i2 - 1];
                Objects.requireNonNull(entry7);
                Map.Entry<K, V> entry8 = entry7;
                Map.Entry<K, V> entry9 = entryArray[i2];
                Objects.requireNonNull(entry9);
                Map.Entry<K, V> entry10 = entry9;
                Object key3 = entry10.getKey();
                V value3 = entry10.getValue();
                CollectPreconditions.checkEntryNotNull(key3, value3);
                objArr[i2] = key3;
                objArr2[i2] = value3;
                ImmutableMap.checkNoConflict(comparator.compare(key2, key3) != 0, "key", entry8, entry10);
                i2++;
                key2 = key3;
            }
        }
        return new ImmutableSortedMap<>(new RegularImmutableSortedSet(ImmutableList.asImmutableList(objArr), comparator), ImmutableList.asImmutableList(objArr2));
    }

    public static /* synthetic */ int lambda$fromEntries$0(Comparator comparator, Map.Entry entry, Map.Entry entry2) {
        Objects.requireNonNull(entry);
        Objects.requireNonNull(entry2);
        return comparator.compare(entry.getKey(), entry2.getKey());
    }

    public static <K extends Comparable<?>, V> Builder<K, V> naturalOrder() {
        return new Builder<>(Ordering.natural());
    }

    public static <K, V> Builder<K, V> orderedBy(Comparator<K> comparator) {
        return new Builder<>(comparator);
    }

    public static <K extends Comparable<?>, V> Builder<K, V> reverseOrder() {
        return new Builder<>(Ordering.natural().reverse());
    }

    public static class Builder<K, V> extends ImmutableMap.Builder<K, V> {
        public final Comparator<? super K> comparator;
        public transient Object[] keys;
        public transient Object[] values;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableMap.Builder put(Object key, Object value) {
            return put((Builder<K, V>) key, value);
        }

        public Builder(Comparator<? super K> comparator) {
            this(comparator, 4);
        }

        public Builder(Comparator<? super K> comparator, int initialCapacity) {
            this.comparator = (Comparator) Preconditions.checkNotNull(comparator);
            this.keys = new Object[initialCapacity];
            this.values = new Object[initialCapacity];
        }

        public final void ensureCapacity(int minCapacity) {
            Object[] objArr = this.keys;
            if (minCapacity > objArr.length) {
                int iExpandedCapacity = ImmutableCollection.Builder.expandedCapacity(objArr.length, minCapacity);
                this.keys = Arrays.copyOf(this.keys, iExpandedCapacity);
                this.values = Arrays.copyOf(this.values, iExpandedCapacity);
            }
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> put(K key, V value) {
            ensureCapacity(this.size + 1);
            CollectPreconditions.checkEntryNotNull(key, value);
            Object[] objArr = this.keys;
            int i = this.size;
            objArr[i] = key;
            this.values[i] = value;
            this.size = i + 1;
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
            super.put((Map.Entry) entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Map<? extends K, ? extends V> map) {
            super.putAll((Map) map);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
            super.putAll((Iterable) entries);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        @CanIgnoreReturnValue
        public final Builder<K, V> orderEntriesByValue(Comparator<? super V> valueComparator) {
            throw new UnsupportedOperationException("Not available on ImmutableSortedMap.Builder");
        }

        @CanIgnoreReturnValue
        public Builder<K, V> combine(Builder<K, V> other) {
            ensureCapacity(this.size + other.size);
            System.arraycopy(other.keys, 0, this.keys, this.size, other.size);
            System.arraycopy(other.values, 0, this.values, this.size, other.size);
            this.size += other.size;
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public ImmutableSortedMap<K, V> build() {
            return buildOrThrow();
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public ImmutableSortedMap<K, V> buildOrThrow() {
            int i = this.size;
            if (i == 0) {
                return ImmutableSortedMap.emptyMap(this.comparator);
            }
            if (i == 1) {
                Comparator<? super K> comparator = this.comparator;
                Object obj = this.keys[0];
                Objects.requireNonNull(obj);
                Object obj2 = this.values[0];
                Objects.requireNonNull(obj2);
                return ImmutableSortedMap.m1242of(comparator, obj, obj2);
            }
            Object[] objArrCopyOf = Arrays.copyOf(this.keys, i);
            Arrays.sort(objArrCopyOf, this.comparator);
            Object[] objArr = new Object[this.size];
            for (int i2 = 0; i2 < this.size; i2++) {
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    if (this.comparator.compare(objArrCopyOf[i3], objArrCopyOf[i2]) == 0) {
                        throw new IllegalArgumentException("keys required to be distinct but compared as equal: " + objArrCopyOf[i3] + " and " + objArrCopyOf[i2]);
                    }
                }
                Object obj3 = this.keys[i2];
                Objects.requireNonNull(obj3);
                int iBinarySearch = Arrays.binarySearch(objArrCopyOf, obj3, this.comparator);
                Object obj4 = this.values[i2];
                Objects.requireNonNull(obj4);
                objArr[iBinarySearch] = obj4;
            }
            return new ImmutableSortedMap<>(new RegularImmutableSortedSet(ImmutableList.asImmutableList(objArrCopyOf), this.comparator), ImmutableList.asImmutableList(objArr));
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @DoNotCall
        @Deprecated
        public final ImmutableSortedMap<K, V> buildKeepingLast() {
            throw new UnsupportedOperationException("ImmutableSortedMap.Builder does not yet implement buildKeepingLast()");
        }
    }

    public ImmutableSortedMap(RegularImmutableSortedSet<K> keySet, ImmutableList<V> valueList) {
        this(keySet, valueList, null);
    }

    public ImmutableSortedMap(RegularImmutableSortedSet<K> keySet, ImmutableList<V> valueList, @CheckForNull ImmutableSortedMap<K, V> descendingMap) {
        this.keySet = keySet;
        this.valueList = valueList;
        this.descendingMap = descendingMap;
    }

    @Override // java.util.Map
    public int size() {
        return this.valueList.size();
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object key) {
        int iIndexOf = this.keySet.indexOf(key);
        if (iIndexOf == -1) {
            return null;
        }
        return this.valueList.get(iIndexOf);
    }

    @Override // com.google.common.collect.ImmutableMap
    public boolean isPartialView() {
        return this.keySet.isPartialView() || this.valueList.isPartialView();
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
        return isEmpty() ? ImmutableSet.m1218of() : new ImmutableMapEntrySet<K, V>() { // from class: com.google.common.collect.ImmutableSortedMap.1EntrySet
            @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
            public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
                return asList().iterator();
            }

            @Override // com.google.common.collect.ImmutableSet
            public ImmutableList<Map.Entry<K, V>> createAsList() {
                return new ImmutableList<Map.Entry<K, V>>() { // from class: com.google.common.collect.ImmutableSortedMap.1EntrySet.1
                    @Override // com.google.common.collect.ImmutableCollection
                    public boolean isPartialView() {
                        return true;
                    }

                    @Override // java.util.List
                    public Map.Entry<K, V> get(int index) {
                        return new AbstractMap.SimpleImmutableEntry(ImmutableSortedMap.this.keySet.asList().get(index), ImmutableSortedMap.this.valueList.get(index));
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public int size() {
                        return ImmutableSortedMap.this.size();
                    }
                };
            }

            @Override // com.google.common.collect.ImmutableMapEntrySet
            public ImmutableMap<K, V> map() {
                return ImmutableSortedMap.this;
            }
        };
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public ImmutableSortedSet<K> keySet() {
        return this.keySet;
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<K> createKeySet() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.BiMap
    public ImmutableCollection<V> values() {
        return this.valueList;
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableCollection<V> createValues() {
        throw new AssertionError("should never be called");
    }

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return keySet().comparator();
    }

    @Override // java.util.SortedMap
    public K firstKey() {
        return keySet().first();
    }

    @Override // java.util.SortedMap
    public K lastKey() {
        return keySet().last();
    }

    public final ImmutableSortedMap<K, V> getSubMap(int fromIndex, int toIndex) {
        if (fromIndex == 0 && toIndex == size()) {
            return this;
        }
        if (fromIndex == toIndex) {
            return emptyMap(comparator());
        }
        return new ImmutableSortedMap<>(this.keySet.getSubSet(fromIndex, toIndex), this.valueList.subList(fromIndex, toIndex));
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public ImmutableSortedMap<K, V> headMap(K toKey) {
        return headMap((ImmutableSortedMap<K, V>) toKey, false);
    }

    @Override // java.util.NavigableMap
    public ImmutableSortedMap<K, V> headMap(K k, boolean z) {
        return getSubMap(0, this.keySet.headIndex(Preconditions.checkNotNull(k), z));
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public ImmutableSortedMap<K, V> subMap(K fromKey, K toKey) {
        return subMap((boolean) fromKey, true, (boolean) toKey, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap
    public ImmutableSortedMap<K, V> subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive) {
        Preconditions.checkNotNull(fromKey);
        Preconditions.checkNotNull(toKey);
        Preconditions.checkArgument(comparator().compare(fromKey, toKey) <= 0, "expected fromKey <= toKey but %s > %s", fromKey, toKey);
        return headMap((ImmutableSortedMap<K, V>) toKey, toInclusive).tailMap((ImmutableSortedMap<K, V>) fromKey, fromInclusive);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public ImmutableSortedMap<K, V> tailMap(K fromKey) {
        return tailMap((ImmutableSortedMap<K, V>) fromKey, true);
    }

    @Override // java.util.NavigableMap
    public ImmutableSortedMap<K, V> tailMap(K k, boolean z) {
        return getSubMap(this.keySet.tailIndex(Preconditions.checkNotNull(k), z), size());
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> lowerEntry(K key) {
        return headMap((ImmutableSortedMap<K, V>) key, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public K lowerKey(K k) {
        return (K) Maps.keyOrNull(lowerEntry(k));
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> floorEntry(K key) {
        return headMap((ImmutableSortedMap<K, V>) key, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public K floorKey(K k) {
        return (K) Maps.keyOrNull(floorEntry(k));
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> ceilingEntry(K key) {
        return tailMap((ImmutableSortedMap<K, V>) key, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public K ceilingKey(K k) {
        return (K) Maps.keyOrNull(ceilingEntry(k));
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> higherEntry(K key) {
        return tailMap((ImmutableSortedMap<K, V>) key, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public K higherKey(K k) {
        return (K) Maps.keyOrNull(higherEntry(k));
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return entrySet().asList().get(0);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return entrySet().asList().get(size() - 1);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    @CanIgnoreReturnValue
    public final Map.Entry<K, V> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    @CanIgnoreReturnValue
    public final Map.Entry<K, V> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    public ImmutableSortedMap<K, V> descendingMap() {
        ImmutableSortedMap<K, V> immutableSortedMap = this.descendingMap;
        if (immutableSortedMap != null) {
            return immutableSortedMap;
        }
        if (isEmpty()) {
            return emptyMap(Ordering.from(comparator()).reverse());
        }
        return new ImmutableSortedMap<>((RegularImmutableSortedSet) this.keySet.descendingSet(), this.valueList.reverse(), this);
    }

    @Override // java.util.NavigableMap
    public ImmutableSortedSet<K> navigableKeySet() {
        return this.keySet;
    }

    @Override // java.util.NavigableMap
    public ImmutableSortedSet<K> descendingKeySet() {
        return this.keySet.descendingSet();
    }

    @J2ktIncompatible
    public static class SerializedForm<K, V> extends ImmutableMap.SerializedForm<K, V> {
        public static final long serialVersionUID = 0;
        public final Comparator<? super K> comparator;

        public SerializedForm(ImmutableSortedMap<K, V> sortedMap) {
            super(sortedMap);
            this.comparator = sortedMap.comparator();
        }

        @Override // com.google.common.collect.ImmutableMap.SerializedForm
        public Builder<K, V> makeBuilder(int size) {
            return new Builder<>(this.comparator);
        }
    }

    @Override // com.google.common.collect.ImmutableMap
    @J2ktIncompatible
    public Object writeReplace() {
        return new SerializedForm(this);
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }
}
