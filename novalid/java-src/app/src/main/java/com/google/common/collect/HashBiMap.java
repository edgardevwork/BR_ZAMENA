package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import com.thoughtworks.xstream.converters.reflection.SerializableConverter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.annotation.CheckForNull;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes8.dex */
public final class HashBiMap<K, V> extends AbstractMap<K, V> implements BiMap<K, V>, Serializable {
    public static final int ABSENT = -1;
    public static final int ENDPOINT = -2;

    @LazyInit
    public transient Set<Map.Entry<K, V>> entrySet;
    public transient int firstInInsertionOrder;
    public transient int[] hashTableKToV;
    public transient int[] hashTableVToK;

    @RetainedWith
    @CheckForNull
    @LazyInit
    public transient BiMap<V, K> inverse;

    @LazyInit
    public transient Set<K> keySet;
    public transient K[] keys;
    public transient int lastInInsertionOrder;
    public transient int modCount;
    public transient int[] nextInBucketKToV;
    public transient int[] nextInBucketVToK;
    public transient int[] nextInInsertionOrder;
    public transient int[] prevInInsertionOrder;
    public transient int size;

    @LazyInit
    public transient Set<V> valueSet;
    public transient V[] values;

    public static <K, V> HashBiMap<K, V> create() {
        return create(16);
    }

    public static <K, V> HashBiMap<K, V> create(int expectedSize) {
        return new HashBiMap<>(expectedSize);
    }

    public static <K, V> HashBiMap<K, V> create(Map<? extends K, ? extends V> map) {
        HashBiMap<K, V> hashBiMapCreate = create(map.size());
        hashBiMapCreate.putAll(map);
        return hashBiMapCreate;
    }

    public HashBiMap(int expectedSize) {
        init(expectedSize);
    }

    public void init(int i) {
        CollectPreconditions.checkNonnegative(i, "expectedSize");
        int iClosedTableSize = Hashing.closedTableSize(i, 1.0d);
        this.size = 0;
        this.keys = (K[]) new Object[i];
        this.values = (V[]) new Object[i];
        this.hashTableKToV = createFilledWithAbsent(iClosedTableSize);
        this.hashTableVToK = createFilledWithAbsent(iClosedTableSize);
        this.nextInBucketKToV = createFilledWithAbsent(i);
        this.nextInBucketVToK = createFilledWithAbsent(i);
        this.firstInInsertionOrder = -2;
        this.lastInInsertionOrder = -2;
        this.prevInInsertionOrder = createFilledWithAbsent(i);
        this.nextInInsertionOrder = createFilledWithAbsent(i);
    }

    public static int[] createFilledWithAbsent(int size) {
        int[] iArr = new int[size];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    public static int[] expandAndFillWithAbsent(int[] array, int newSize) {
        int length = array.length;
        int[] iArrCopyOf = Arrays.copyOf(array, newSize);
        Arrays.fill(iArrCopyOf, length, newSize, -1);
        return iArrCopyOf;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    public final void ensureCapacity(int i) {
        int[] iArr = this.nextInBucketKToV;
        if (iArr.length < i) {
            int iExpandedCapacity = ImmutableCollection.Builder.expandedCapacity(iArr.length, i);
            this.keys = (K[]) Arrays.copyOf(this.keys, iExpandedCapacity);
            this.values = (V[]) Arrays.copyOf(this.values, iExpandedCapacity);
            this.nextInBucketKToV = expandAndFillWithAbsent(this.nextInBucketKToV, iExpandedCapacity);
            this.nextInBucketVToK = expandAndFillWithAbsent(this.nextInBucketVToK, iExpandedCapacity);
            this.prevInInsertionOrder = expandAndFillWithAbsent(this.prevInInsertionOrder, iExpandedCapacity);
            this.nextInInsertionOrder = expandAndFillWithAbsent(this.nextInInsertionOrder, iExpandedCapacity);
        }
        if (this.hashTableKToV.length < i) {
            int iClosedTableSize = Hashing.closedTableSize(i, 1.0d);
            this.hashTableKToV = createFilledWithAbsent(iClosedTableSize);
            this.hashTableVToK = createFilledWithAbsent(iClosedTableSize);
            for (int i2 = 0; i2 < this.size; i2++) {
                int iBucket = bucket(Hashing.smearedHash(this.keys[i2]));
                int[] iArr2 = this.nextInBucketKToV;
                int[] iArr3 = this.hashTableKToV;
                iArr2[i2] = iArr3[iBucket];
                iArr3[iBucket] = i2;
                int iBucket2 = bucket(Hashing.smearedHash(this.values[i2]));
                int[] iArr4 = this.nextInBucketVToK;
                int[] iArr5 = this.hashTableVToK;
                iArr4[i2] = iArr5[iBucket2];
                iArr5[iBucket2] = i2;
            }
        }
    }

    public final int bucket(int hash) {
        return hash & (this.hashTableKToV.length - 1);
    }

    public int findEntryByKey(@CheckForNull Object key) {
        return findEntryByKey(key, Hashing.smearedHash(key));
    }

    public int findEntryByKey(@CheckForNull Object key, int keyHash) {
        return findEntry(key, keyHash, this.hashTableKToV, this.nextInBucketKToV, this.keys);
    }

    public int findEntryByValue(@CheckForNull Object value) {
        return findEntryByValue(value, Hashing.smearedHash(value));
    }

    public int findEntryByValue(@CheckForNull Object value, int valueHash) {
        return findEntry(value, valueHash, this.hashTableVToK, this.nextInBucketVToK, this.values);
    }

    public int findEntry(@CheckForNull Object o, int oHash, int[] hashTable, int[] nextInBucket, Object[] array) {
        int i = hashTable[bucket(oHash)];
        while (i != -1) {
            if (Objects.equal(array[i], o)) {
                return i;
            }
            i = nextInBucket[i];
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@CheckForNull Object key) {
        return findEntryByKey(key) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@CheckForNull Object value) {
        return findEntryByValue(value) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object key) {
        int iFindEntryByKey = findEntryByKey(key);
        if (iFindEntryByKey == -1) {
            return null;
        }
        return this.values[iFindEntryByKey];
    }

    @CheckForNull
    public K getInverse(@CheckForNull Object value) {
        int iFindEntryByValue = findEntryByValue(value);
        if (iFindEntryByValue == -1) {
            return null;
        }
        return this.keys[iFindEntryByValue];
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    @CheckForNull
    public V put(@ParametricNullness K key, @ParametricNullness V value) {
        return put(key, value, false);
    }

    @CheckForNull
    public V put(@ParametricNullness K key, @ParametricNullness V value, boolean force) {
        int iSmearedHash = Hashing.smearedHash(key);
        int iFindEntryByKey = findEntryByKey(key, iSmearedHash);
        if (iFindEntryByKey != -1) {
            V v = this.values[iFindEntryByKey];
            if (Objects.equal(v, value)) {
                return value;
            }
            replaceValueInEntry(iFindEntryByKey, value, force);
            return v;
        }
        int iSmearedHash2 = Hashing.smearedHash(value);
        int iFindEntryByValue = findEntryByValue(value, iSmearedHash2);
        if (!force) {
            Preconditions.checkArgument(iFindEntryByValue == -1, "Value already present: %s", value);
        } else if (iFindEntryByValue != -1) {
            removeEntryValueHashKnown(iFindEntryByValue, iSmearedHash2);
        }
        ensureCapacity(this.size + 1);
        K[] kArr = this.keys;
        int i = this.size;
        kArr[i] = key;
        this.values[i] = value;
        insertIntoTableKToV(i, iSmearedHash);
        insertIntoTableVToK(this.size, iSmearedHash2);
        setSucceeds(this.lastInInsertionOrder, this.size);
        setSucceeds(this.size, -2);
        this.size++;
        this.modCount++;
        return null;
    }

    @Override // com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    @CheckForNull
    public V forcePut(@ParametricNullness K key, @ParametricNullness V value) {
        return put(key, value, true);
    }

    @CanIgnoreReturnValue
    @CheckForNull
    public K putInverse(@ParametricNullness V value, @ParametricNullness K key, boolean force) {
        int iSmearedHash = Hashing.smearedHash(value);
        int iFindEntryByValue = findEntryByValue(value, iSmearedHash);
        if (iFindEntryByValue != -1) {
            K k = this.keys[iFindEntryByValue];
            if (Objects.equal(k, key)) {
                return key;
            }
            replaceKeyInEntry(iFindEntryByValue, key, force);
            return k;
        }
        int i = this.lastInInsertionOrder;
        int iSmearedHash2 = Hashing.smearedHash(key);
        int iFindEntryByKey = findEntryByKey(key, iSmearedHash2);
        if (!force) {
            Preconditions.checkArgument(iFindEntryByKey == -1, "Key already present: %s", key);
        } else if (iFindEntryByKey != -1) {
            i = this.prevInInsertionOrder[iFindEntryByKey];
            removeEntryKeyHashKnown(iFindEntryByKey, iSmearedHash2);
        }
        ensureCapacity(this.size + 1);
        K[] kArr = this.keys;
        int i2 = this.size;
        kArr[i2] = key;
        this.values[i2] = value;
        insertIntoTableKToV(i2, iSmearedHash2);
        insertIntoTableVToK(this.size, iSmearedHash);
        int i3 = i == -2 ? this.firstInInsertionOrder : this.nextInInsertionOrder[i];
        setSucceeds(i, this.size);
        setSucceeds(this.size, i3);
        this.size++;
        this.modCount++;
        return null;
    }

    public final void setSucceeds(int prev, int next) {
        if (prev == -2) {
            this.firstInInsertionOrder = next;
        } else {
            this.nextInInsertionOrder[prev] = next;
        }
        if (next == -2) {
            this.lastInInsertionOrder = prev;
        } else {
            this.prevInInsertionOrder[next] = prev;
        }
    }

    public final void insertIntoTableKToV(int entry, int keyHash) {
        Preconditions.checkArgument(entry != -1);
        int iBucket = bucket(keyHash);
        int[] iArr = this.nextInBucketKToV;
        int[] iArr2 = this.hashTableKToV;
        iArr[entry] = iArr2[iBucket];
        iArr2[iBucket] = entry;
    }

    public final void insertIntoTableVToK(int entry, int valueHash) {
        Preconditions.checkArgument(entry != -1);
        int iBucket = bucket(valueHash);
        int[] iArr = this.nextInBucketVToK;
        int[] iArr2 = this.hashTableVToK;
        iArr[entry] = iArr2[iBucket];
        iArr2[iBucket] = entry;
    }

    public final void deleteFromTableKToV(int entry, int keyHash) {
        Preconditions.checkArgument(entry != -1);
        int iBucket = bucket(keyHash);
        int[] iArr = this.hashTableKToV;
        int i = iArr[iBucket];
        if (i == entry) {
            int[] iArr2 = this.nextInBucketKToV;
            iArr[iBucket] = iArr2[entry];
            iArr2[entry] = -1;
            return;
        }
        int i2 = this.nextInBucketKToV[i];
        while (true) {
            int i3 = i;
            i = i2;
            if (i == -1) {
                throw new AssertionError("Expected to find entry with key " + this.keys[entry]);
            }
            if (i != entry) {
                i2 = this.nextInBucketKToV[i];
            } else {
                int[] iArr3 = this.nextInBucketKToV;
                iArr3[i3] = iArr3[entry];
                iArr3[entry] = -1;
                return;
            }
        }
    }

    public final void deleteFromTableVToK(int entry, int valueHash) {
        Preconditions.checkArgument(entry != -1);
        int iBucket = bucket(valueHash);
        int[] iArr = this.hashTableVToK;
        int i = iArr[iBucket];
        if (i == entry) {
            int[] iArr2 = this.nextInBucketVToK;
            iArr[iBucket] = iArr2[entry];
            iArr2[entry] = -1;
            return;
        }
        int i2 = this.nextInBucketVToK[i];
        while (true) {
            int i3 = i;
            i = i2;
            if (i == -1) {
                throw new AssertionError("Expected to find entry with value " + this.values[entry]);
            }
            if (i != entry) {
                i2 = this.nextInBucketVToK[i];
            } else {
                int[] iArr3 = this.nextInBucketVToK;
                iArr3[i3] = iArr3[entry];
                iArr3[entry] = -1;
                return;
            }
        }
    }

    public final void replaceValueInEntry(int entry, @ParametricNullness V newValue, boolean force) {
        Preconditions.checkArgument(entry != -1);
        int iSmearedHash = Hashing.smearedHash(newValue);
        int iFindEntryByValue = findEntryByValue(newValue, iSmearedHash);
        if (iFindEntryByValue != -1) {
            if (force) {
                removeEntryValueHashKnown(iFindEntryByValue, iSmearedHash);
                if (entry == this.size) {
                    entry = iFindEntryByValue;
                }
            } else {
                throw new IllegalArgumentException("Value already present in map: " + newValue);
            }
        }
        deleteFromTableVToK(entry, Hashing.smearedHash(this.values[entry]));
        this.values[entry] = newValue;
        insertIntoTableVToK(entry, iSmearedHash);
    }

    public final void replaceKeyInEntry(int entry, @ParametricNullness K newKey, boolean force) {
        int i;
        Preconditions.checkArgument(entry != -1);
        int iSmearedHash = Hashing.smearedHash(newKey);
        int iFindEntryByKey = findEntryByKey(newKey, iSmearedHash);
        int i2 = this.lastInInsertionOrder;
        if (iFindEntryByKey == -1) {
            i = -2;
        } else if (force) {
            i2 = this.prevInInsertionOrder[iFindEntryByKey];
            i = this.nextInInsertionOrder[iFindEntryByKey];
            removeEntryKeyHashKnown(iFindEntryByKey, iSmearedHash);
            if (entry == this.size) {
                entry = iFindEntryByKey;
            }
        } else {
            throw new IllegalArgumentException("Key already present in map: " + newKey);
        }
        if (i2 == entry) {
            i2 = this.prevInInsertionOrder[entry];
        } else if (i2 == this.size) {
            i2 = iFindEntryByKey;
        }
        if (i == entry) {
            iFindEntryByKey = this.nextInInsertionOrder[entry];
        } else if (i != this.size) {
            iFindEntryByKey = i;
        }
        setSucceeds(this.prevInInsertionOrder[entry], this.nextInInsertionOrder[entry]);
        deleteFromTableKToV(entry, Hashing.smearedHash(this.keys[entry]));
        this.keys[entry] = newKey;
        insertIntoTableKToV(entry, Hashing.smearedHash(newKey));
        setSucceeds(i2, entry);
        setSucceeds(entry, iFindEntryByKey);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @CheckForNull
    public V remove(@CheckForNull Object key) {
        int iSmearedHash = Hashing.smearedHash(key);
        int iFindEntryByKey = findEntryByKey(key, iSmearedHash);
        if (iFindEntryByKey == -1) {
            return null;
        }
        V v = this.values[iFindEntryByKey];
        removeEntryKeyHashKnown(iFindEntryByKey, iSmearedHash);
        return v;
    }

    @CheckForNull
    public K removeInverse(@CheckForNull Object value) {
        int iSmearedHash = Hashing.smearedHash(value);
        int iFindEntryByValue = findEntryByValue(value, iSmearedHash);
        if (iFindEntryByValue == -1) {
            return null;
        }
        K k = this.keys[iFindEntryByValue];
        removeEntryValueHashKnown(iFindEntryByValue, iSmearedHash);
        return k;
    }

    public void removeEntry(int entry) {
        removeEntryKeyHashKnown(entry, Hashing.smearedHash(this.keys[entry]));
    }

    public final void removeEntry(int entry, int keyHash, int valueHash) {
        Preconditions.checkArgument(entry != -1);
        deleteFromTableKToV(entry, keyHash);
        deleteFromTableVToK(entry, valueHash);
        setSucceeds(this.prevInInsertionOrder[entry], this.nextInInsertionOrder[entry]);
        moveEntryToIndex(this.size - 1, entry);
        K[] kArr = this.keys;
        int i = this.size;
        kArr[i - 1] = null;
        this.values[i - 1] = null;
        this.size = i - 1;
        this.modCount++;
    }

    public void removeEntryKeyHashKnown(int entry, int keyHash) {
        removeEntry(entry, keyHash, Hashing.smearedHash(this.values[entry]));
    }

    public void removeEntryValueHashKnown(int entry, int valueHash) {
        removeEntry(entry, Hashing.smearedHash(this.keys[entry]), valueHash);
    }

    public final void moveEntryToIndex(int src, int dest) {
        int i;
        int i2;
        if (src == dest) {
            return;
        }
        int i3 = this.prevInInsertionOrder[src];
        int i4 = this.nextInInsertionOrder[src];
        setSucceeds(i3, dest);
        setSucceeds(dest, i4);
        K[] kArr = this.keys;
        K k = kArr[src];
        V[] vArr = this.values;
        V v = vArr[src];
        kArr[dest] = k;
        vArr[dest] = v;
        int iBucket = bucket(Hashing.smearedHash(k));
        int[] iArr = this.hashTableKToV;
        int i5 = iArr[iBucket];
        if (i5 == src) {
            iArr[iBucket] = dest;
        } else {
            int i6 = this.nextInBucketKToV[i5];
            while (true) {
                i = i5;
                i5 = i6;
                if (i5 == src) {
                    break;
                } else {
                    i6 = this.nextInBucketKToV[i5];
                }
            }
            this.nextInBucketKToV[i] = dest;
        }
        int[] iArr2 = this.nextInBucketKToV;
        iArr2[dest] = iArr2[src];
        iArr2[src] = -1;
        int iBucket2 = bucket(Hashing.smearedHash(v));
        int[] iArr3 = this.hashTableVToK;
        int i7 = iArr3[iBucket2];
        if (i7 == src) {
            iArr3[iBucket2] = dest;
        } else {
            int i8 = this.nextInBucketVToK[i7];
            while (true) {
                i2 = i7;
                i7 = i8;
                if (i7 == src) {
                    break;
                } else {
                    i8 = this.nextInBucketVToK[i7];
                }
            }
            this.nextInBucketVToK[i2] = dest;
        }
        int[] iArr4 = this.nextInBucketVToK;
        iArr4[dest] = iArr4[src];
        iArr4[src] = -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.keys, 0, this.size, (Object) null);
        Arrays.fill(this.values, 0, this.size, (Object) null);
        Arrays.fill(this.hashTableKToV, -1);
        Arrays.fill(this.hashTableVToK, -1);
        Arrays.fill(this.nextInBucketKToV, 0, this.size, -1);
        Arrays.fill(this.nextInBucketVToK, 0, this.size, -1);
        Arrays.fill(this.prevInInsertionOrder, 0, this.size, -1);
        Arrays.fill(this.nextInInsertionOrder, 0, this.size, -1);
        this.size = 0;
        this.firstInInsertionOrder = -2;
        this.lastInInsertionOrder = -2;
        this.modCount++;
    }

    public static abstract class View<K, V, T> extends AbstractSet<T> {
        public final HashBiMap<K, V> biMap;

        @ParametricNullness
        public abstract T forEntry(int entry);

        public View(HashBiMap<K, V> biMap) {
            this.biMap = biMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<T> iterator() {
            return new Iterator<T>() { // from class: com.google.common.collect.HashBiMap.View.1
                public int expectedModCount;
                public int index;
                public int indexToRemove = -1;
                public int remaining;

                {
                    this.index = View.this.biMap.firstInInsertionOrder;
                    HashBiMap<K, V> hashBiMap = View.this.biMap;
                    this.expectedModCount = hashBiMap.modCount;
                    this.remaining = hashBiMap.size;
                }

                public final void checkForComodification() {
                    if (View.this.biMap.modCount != this.expectedModCount) {
                        throw new ConcurrentModificationException();
                    }
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    checkForComodification();
                    return this.index != -2 && this.remaining > 0;
                }

                @Override // java.util.Iterator
                @ParametricNullness
                public T next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    T t = (T) View.this.forEntry(this.index);
                    this.indexToRemove = this.index;
                    this.index = View.this.biMap.nextInInsertionOrder[this.index];
                    this.remaining--;
                    return t;
                }

                @Override // java.util.Iterator
                public void remove() {
                    checkForComodification();
                    CollectPreconditions.checkRemove(this.indexToRemove != -1);
                    View.this.biMap.removeEntry(this.indexToRemove);
                    int i = this.index;
                    HashBiMap<K, V> hashBiMap = View.this.biMap;
                    if (i == hashBiMap.size) {
                        this.index = this.indexToRemove;
                    }
                    this.indexToRemove = -1;
                    this.expectedModCount = hashBiMap.modCount;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.biMap.size;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.biMap.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet();
        this.keySet = keySet;
        return keySet;
    }

    public final class KeySet extends View<K, V, K> {
        public KeySet() {
            super(HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.View
        @ParametricNullness
        public K forEntry(int i) {
            return (K) NullnessCasts.uncheckedCastNullableTToT(HashBiMap.this.keys[i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object o) {
            return HashBiMap.this.containsKey(o);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object o) {
            int iSmearedHash = Hashing.smearedHash(o);
            int iFindEntryByKey = HashBiMap.this.findEntryByKey(o, iSmearedHash);
            if (iFindEntryByKey == -1) {
                return false;
            }
            HashBiMap.this.removeEntryKeyHashKnown(iFindEntryByKey, iSmearedHash);
            return true;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    public Set<V> values() {
        Set<V> set = this.valueSet;
        if (set != null) {
            return set;
        }
        ValueSet valueSet = new ValueSet();
        this.valueSet = valueSet;
        return valueSet;
    }

    public final class ValueSet extends View<K, V, V> {
        public ValueSet() {
            super(HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.View
        @ParametricNullness
        public V forEntry(int i) {
            return (V) NullnessCasts.uncheckedCastNullableTToT(HashBiMap.this.values[i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object o) {
            return HashBiMap.this.containsValue(o);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object o) {
            int iSmearedHash = Hashing.smearedHash(o);
            int iFindEntryByValue = HashBiMap.this.findEntryByValue(o, iSmearedHash);
            if (iFindEntryByValue == -1) {
                return false;
            }
            HashBiMap.this.removeEntryValueHashKnown(iFindEntryByValue, iSmearedHash);
            return true;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet();
        this.entrySet = entrySet;
        return entrySet;
    }

    public final class EntrySet extends View<K, V, Map.Entry<K, V>> {
        public EntrySet() {
            super(HashBiMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object o) {
            if (!(o instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) o;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iFindEntryByKey = HashBiMap.this.findEntryByKey(key);
            return iFindEntryByKey != -1 && Objects.equal(value, HashBiMap.this.values[iFindEntryByKey]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        public boolean remove(@CheckForNull Object o) {
            if (!(o instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) o;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iSmearedHash = Hashing.smearedHash(key);
            int iFindEntryByKey = HashBiMap.this.findEntryByKey(key, iSmearedHash);
            if (iFindEntryByKey == -1 || !Objects.equal(value, HashBiMap.this.values[iFindEntryByKey])) {
                return false;
            }
            HashBiMap.this.removeEntryKeyHashKnown(iFindEntryByKey, iSmearedHash);
            return true;
        }

        @Override // com.google.common.collect.HashBiMap.View
        public Map.Entry<K, V> forEntry(int entry) {
            return new EntryForKey(entry);
        }
    }

    public final class EntryForKey extends AbstractMapEntry<K, V> {
        public int index;

        @ParametricNullness
        public final K key;

        public EntryForKey(int i) {
            this.key = (K) NullnessCasts.uncheckedCastNullableTToT(HashBiMap.this.keys[i]);
            this.index = i;
        }

        public void updateIndex() {
            int i = this.index;
            if (i != -1) {
                HashBiMap hashBiMap = HashBiMap.this;
                if (i <= hashBiMap.size && Objects.equal(hashBiMap.keys[i], this.key)) {
                    return;
                }
            }
            this.index = HashBiMap.this.findEntryByKey(this.key);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K getKey() {
            return this.key;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V getValue() {
            updateIndex();
            int i = this.index;
            return i == -1 ? (V) NullnessCasts.unsafeNull() : (V) NullnessCasts.uncheckedCastNullableTToT(HashBiMap.this.values[i]);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V setValue(@ParametricNullness V v) {
            updateIndex();
            int i = this.index;
            if (i == -1) {
                HashBiMap.this.put(this.key, v);
                return (V) NullnessCasts.unsafeNull();
            }
            V v2 = (V) NullnessCasts.uncheckedCastNullableTToT(HashBiMap.this.values[i]);
            if (Objects.equal(v2, v)) {
                return v;
            }
            HashBiMap.this.replaceValueInEntry(this.index, v, false);
            return v2;
        }
    }

    @Override // com.google.common.collect.BiMap
    public BiMap<V, K> inverse() {
        BiMap<V, K> biMap = this.inverse;
        if (biMap != null) {
            return biMap;
        }
        Inverse inverse = new Inverse(this);
        this.inverse = inverse;
        return inverse;
    }

    public static class Inverse<K, V> extends AbstractMap<V, K> implements BiMap<V, K>, Serializable {
        public final HashBiMap<K, V> forward;
        public transient Set<Map.Entry<V, K>> inverseEntrySet;

        public Inverse(HashBiMap<K, V> forward) {
            this.forward = forward;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.forward.size;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object key) {
            return this.forward.containsValue(key);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public K get(@CheckForNull Object key) {
            return this.forward.getInverse(key);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsValue(@CheckForNull Object value) {
            return this.forward.containsKey(value);
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        @CanIgnoreReturnValue
        @CheckForNull
        public K put(@ParametricNullness V value, @ParametricNullness K key) {
            return this.forward.putInverse(value, key, false);
        }

        @Override // com.google.common.collect.BiMap
        @CanIgnoreReturnValue
        @CheckForNull
        public K forcePut(@ParametricNullness V value, @ParametricNullness K key) {
            return this.forward.putInverse(value, key, true);
        }

        @Override // com.google.common.collect.BiMap
        public BiMap<K, V> inverse() {
            return this.forward;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CanIgnoreReturnValue
        @CheckForNull
        public K remove(@CheckForNull Object value) {
            return this.forward.removeInverse(value);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.forward.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<V> keySet() {
            return this.forward.values();
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public Set<K> values() {
            return this.forward.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<V, K>> entrySet() {
            Set<Map.Entry<V, K>> set = this.inverseEntrySet;
            if (set != null) {
                return set;
            }
            InverseEntrySet inverseEntrySet = new InverseEntrySet(this.forward);
            this.inverseEntrySet = inverseEntrySet;
            return inverseEntrySet;
        }

        @GwtIncompatible(SerializableConverter.ATTRIBUTE_SERIALIZATION)
        private void readObject(ObjectInputStream in) throws ClassNotFoundException, IOException {
            in.defaultReadObject();
            this.forward.inverse = this;
        }
    }

    public static class InverseEntrySet<K, V> extends View<K, V, Map.Entry<V, K>> {
        public InverseEntrySet(HashBiMap<K, V> biMap) {
            super(biMap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object o) {
            if (!(o instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) o;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iFindEntryByValue = this.biMap.findEntryByValue(key);
            return iFindEntryByValue != -1 && Objects.equal(this.biMap.keys[iFindEntryByValue], value);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object o) {
            if (!(o instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) o;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iSmearedHash = Hashing.smearedHash(key);
            int iFindEntryByValue = this.biMap.findEntryByValue(key, iSmearedHash);
            if (iFindEntryByValue == -1 || !Objects.equal(this.biMap.keys[iFindEntryByValue], value)) {
                return false;
            }
            this.biMap.removeEntryValueHashKnown(iFindEntryByValue, iSmearedHash);
            return true;
        }

        @Override // com.google.common.collect.HashBiMap.View
        public Map.Entry<V, K> forEntry(int entry) {
            return new EntryForValue(this.biMap, entry);
        }
    }

    public static final class EntryForValue<K, V> extends AbstractMapEntry<V, K> {
        public final HashBiMap<K, V> biMap;
        public int index;

        @ParametricNullness
        public final V value;

        public EntryForValue(HashBiMap<K, V> hashBiMap, int i) {
            this.biMap = hashBiMap;
            this.value = (V) NullnessCasts.uncheckedCastNullableTToT(hashBiMap.values[i]);
            this.index = i;
        }

        private void updateIndex() {
            int i = this.index;
            if (i != -1) {
                HashBiMap<K, V> hashBiMap = this.biMap;
                if (i <= hashBiMap.size && Objects.equal(this.value, hashBiMap.values[i])) {
                    return;
                }
            }
            this.index = this.biMap.findEntryByValue(this.value);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V getKey() {
            return this.value;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K getValue() {
            updateIndex();
            int i = this.index;
            return i == -1 ? (K) NullnessCasts.unsafeNull() : (K) NullnessCasts.uncheckedCastNullableTToT(this.biMap.keys[i]);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K setValue(@ParametricNullness K k) {
            updateIndex();
            int i = this.index;
            if (i == -1) {
                this.biMap.putInverse(this.value, k, false);
                return (K) NullnessCasts.unsafeNull();
            }
            K k2 = (K) NullnessCasts.uncheckedCastNullableTToT(this.biMap.keys[i]);
            if (Objects.equal(k2, k)) {
                return k;
            }
            this.biMap.replaceKeyInEntry(this.index, k, false);
            return k2;
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        Serialization.writeMap(this, stream);
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        int count = Serialization.readCount(stream);
        init(16);
        Serialization.populateMap(this, stream, count);
    }
}
