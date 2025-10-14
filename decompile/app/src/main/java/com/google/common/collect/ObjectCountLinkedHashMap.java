package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.Arrays;

@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes7.dex */
public class ObjectCountLinkedHashMap<K> extends ObjectCountHashMap<K> {
    public static final int ENDPOINT = -2;
    public transient int firstEntry;
    public transient int lastEntry;

    @VisibleForTesting
    public transient long[] links;

    public static <K> ObjectCountLinkedHashMap<K> create() {
        return new ObjectCountLinkedHashMap<>();
    }

    public static <K> ObjectCountLinkedHashMap<K> createWithExpectedSize(int expectedSize) {
        return new ObjectCountLinkedHashMap<>(expectedSize);
    }

    public ObjectCountLinkedHashMap() {
        this(3);
    }

    public ObjectCountLinkedHashMap(int expectedSize) {
        this(expectedSize, 1.0f);
    }

    public ObjectCountLinkedHashMap(int expectedSize, float loadFactor) {
        super(expectedSize, loadFactor);
    }

    public ObjectCountLinkedHashMap(ObjectCountHashMap<K> map) {
        init(map.size(), 1.0f);
        int iFirstIndex = map.firstIndex();
        while (iFirstIndex != -1) {
            put(map.getKey(iFirstIndex), map.getValue(iFirstIndex));
            iFirstIndex = map.nextIndex(iFirstIndex);
        }
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public void init(int expectedSize, float loadFactor) {
        super.init(expectedSize, loadFactor);
        this.firstEntry = -2;
        this.lastEntry = -2;
        long[] jArr = new long[expectedSize];
        this.links = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public int firstIndex() {
        int i = this.firstEntry;
        if (i == -2) {
            return -1;
        }
        return i;
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public int nextIndex(int index) {
        int successor = getSuccessor(index);
        if (successor == -2) {
            return -1;
        }
        return successor;
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public int nextIndexAfterRemove(int oldNextIndex, int removedIndex) {
        return oldNextIndex == size() ? removedIndex : oldNextIndex;
    }

    public final int getPredecessor(int entry) {
        return (int) (this.links[entry] >>> 32);
    }

    public final int getSuccessor(int entry) {
        return (int) this.links[entry];
    }

    public final void setSuccessor(int entry, int succ) {
        long[] jArr = this.links;
        jArr[entry] = (jArr[entry] & ObjectCountHashMap.HASH_MASK) | (succ & 4294967295L);
    }

    public final void setPredecessor(int entry, int pred) {
        long[] jArr = this.links;
        jArr[entry] = (jArr[entry] & 4294967295L) | (pred << 32);
    }

    public final void setSucceeds(int pred, int succ) {
        if (pred == -2) {
            this.firstEntry = succ;
        } else {
            setSuccessor(pred, succ);
        }
        if (succ == -2) {
            this.lastEntry = pred;
        } else {
            setPredecessor(succ, pred);
        }
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public void insertEntry(int entryIndex, @ParametricNullness K key, int value, int hash) {
        super.insertEntry(entryIndex, key, value, hash);
        setSucceeds(this.lastEntry, entryIndex);
        setSucceeds(entryIndex, -2);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public void moveLastEntry(int dstIndex) {
        int size = size() - 1;
        setSucceeds(getPredecessor(dstIndex), getSuccessor(dstIndex));
        if (dstIndex < size) {
            setSucceeds(getPredecessor(size), dstIndex);
            setSucceeds(dstIndex, getSuccessor(size));
        }
        super.moveLastEntry(dstIndex);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public void resizeEntries(int newCapacity) {
        super.resizeEntries(newCapacity);
        long[] jArr = this.links;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, newCapacity);
        this.links = jArrCopyOf;
        Arrays.fill(jArrCopyOf, length, newCapacity, -1L);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public void clear() {
        super.clear();
        this.firstEntry = -2;
        this.lastEntry = -2;
    }
}
