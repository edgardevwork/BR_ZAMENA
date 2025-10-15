package com.fasterxml.jackson.databind.util.internal;

import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public final class PrivateMaxEntriesMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
    public static final long MAXIMUM_CAPACITY = 9223372034707292160L;
    public static final int NCPU;
    public static final int NUMBER_OF_READ_BUFFERS;
    public static final int READ_BUFFERS_MASK;
    public static final int READ_BUFFER_DRAIN_THRESHOLD = 8;
    public static final int READ_BUFFER_INDEX_MASK = 15;
    public static final int READ_BUFFER_SIZE = 16;
    public static final int READ_BUFFER_THRESHOLD = 4;
    public static final int WRITE_BUFFER_DRAIN_THRESHOLD = 16;
    public static final long serialVersionUID = 1;
    public final AtomicLong capacity;
    public final int concurrencyLevel;
    public final ConcurrentMap<K, Node<K, V>> data;
    public final AtomicReference<DrainStatus> drainStatus;
    public transient Set<Map.Entry<K, V>> entrySet;
    public final LinkedDeque<Node<K, V>> evictionDeque;
    public final Lock evictionLock;
    public transient Set<K> keySet;
    public final AtomicLongArray readBufferDrainAtWriteCount;
    public final long[] readBufferReadCount;
    public final AtomicLongArray readBufferWriteCount;
    public final AtomicReferenceArray<Node<K, V>> readBuffers;
    public transient Collection<V> values;
    public final AtomicLong weightedSize;
    public final Queue<Runnable> writeBuffer;

    public enum DrainStatus {
        IDLE { // from class: com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap.DrainStatus.1
            @Override // com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap.DrainStatus
            public boolean shouldDrainBuffers(boolean z) {
                return !z;
            }
        },
        REQUIRED { // from class: com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap.DrainStatus.2
            @Override // com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap.DrainStatus
            public boolean shouldDrainBuffers(boolean z) {
                return true;
            }
        },
        PROCESSING { // from class: com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap.DrainStatus.3
            @Override // com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap.DrainStatus
            public boolean shouldDrainBuffers(boolean z) {
                return false;
            }
        };

        public abstract boolean shouldDrainBuffers(boolean z);
    }

    public static int readBufferIndex(int i, int i2) {
        return (i * 16) + i2;
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        NCPU = iAvailableProcessors;
        int iMin = Math.min(4, ceilingNextPowerOfTwo(iAvailableProcessors));
        NUMBER_OF_READ_BUFFERS = iMin;
        READ_BUFFERS_MASK = iMin - 1;
    }

    public static int ceilingNextPowerOfTwo(int i) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
    }

    public PrivateMaxEntriesMap(Builder<K, V> builder) {
        int i = builder.concurrencyLevel;
        this.concurrencyLevel = i;
        this.capacity = new AtomicLong(Math.min(builder.capacity, MAXIMUM_CAPACITY));
        this.data = new ConcurrentHashMap(builder.initialCapacity, 0.75f, i);
        this.evictionLock = new ReentrantLock();
        this.weightedSize = new AtomicLong();
        this.evictionDeque = new LinkedDeque<>();
        this.writeBuffer = new ConcurrentLinkedQueue();
        this.drainStatus = new AtomicReference<>(DrainStatus.IDLE);
        int i2 = NUMBER_OF_READ_BUFFERS;
        this.readBufferReadCount = new long[i2];
        this.readBufferWriteCount = new AtomicLongArray(i2);
        this.readBufferDrainAtWriteCount = new AtomicLongArray(i2);
        this.readBuffers = new AtomicReferenceArray<>(i2 * 16);
    }

    public static void checkNotNull(Object obj) {
        obj.getClass();
    }

    public static void checkArgument(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void checkState(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public long capacity() {
        return this.capacity.get();
    }

    public void setCapacity(long j) {
        checkArgument(j >= 0);
        this.evictionLock.lock();
        try {
            this.capacity.lazySet(Math.min(j, MAXIMUM_CAPACITY));
            drainBuffers();
            evict();
        } finally {
            this.evictionLock.unlock();
        }
    }

    public boolean hasOverflowed() {
        return this.weightedSize.get() > this.capacity.get();
    }

    public void evict() {
        Node<K, V> node;
        while (hasOverflowed() && (node = (Node) this.evictionDeque.poll()) != null) {
            this.data.remove(node.key, node);
            makeDead(node);
        }
    }

    public void afterRead(Node<K, V> node) {
        int bufferIndex = readBufferIndex();
        drainOnReadIfNeeded(bufferIndex, recordRead(bufferIndex, node));
    }

    public static int readBufferIndex() {
        return ((int) Thread.currentThread().getId()) & READ_BUFFERS_MASK;
    }

    public long recordRead(int i, Node<K, V> node) {
        long j = this.readBufferWriteCount.get(i);
        this.readBufferWriteCount.lazySet(i, 1 + j);
        this.readBuffers.lazySet(readBufferIndex(i, (int) (15 & j)), node);
        return j;
    }

    public void drainOnReadIfNeeded(int i, long j) {
        if (this.drainStatus.get().shouldDrainBuffers(j - this.readBufferDrainAtWriteCount.get(i) < 4)) {
            tryToDrainBuffers();
        }
    }

    public void afterWrite(Runnable runnable) {
        this.writeBuffer.add(runnable);
        this.drainStatus.lazySet(DrainStatus.REQUIRED);
        tryToDrainBuffers();
    }

    public void tryToDrainBuffers() {
        if (this.evictionLock.tryLock()) {
            try {
                AtomicReference<DrainStatus> atomicReference = this.drainStatus;
                DrainStatus drainStatus = DrainStatus.PROCESSING;
                atomicReference.lazySet(drainStatus);
                drainBuffers();
                MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m34m(this.drainStatus, drainStatus, DrainStatus.IDLE);
                this.evictionLock.unlock();
            } catch (Throwable th) {
                MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m34m(this.drainStatus, DrainStatus.PROCESSING, DrainStatus.IDLE);
                this.evictionLock.unlock();
                throw th;
            }
        }
    }

    public void drainBuffers() {
        drainReadBuffers();
        drainWriteBuffer();
    }

    public void drainReadBuffers() {
        int id = (int) Thread.currentThread().getId();
        int i = NUMBER_OF_READ_BUFFERS + id;
        while (id < i) {
            drainReadBuffer(READ_BUFFERS_MASK & id);
            id++;
        }
    }

    public void drainReadBuffer(int i) {
        int bufferIndex;
        Node<K, V> node;
        long j = this.readBufferWriteCount.get(i);
        for (int i2 = 0; i2 < 8 && (node = this.readBuffers.get((bufferIndex = readBufferIndex(i, (int) (this.readBufferReadCount[i] & 15))))) != null; i2++) {
            this.readBuffers.lazySet(bufferIndex, null);
            applyRead(node);
            long[] jArr = this.readBufferReadCount;
            jArr[i] = jArr[i] + 1;
        }
        this.readBufferDrainAtWriteCount.lazySet(i, j);
    }

    public void applyRead(Node<K, V> node) {
        if (this.evictionDeque.contains((Linked<?>) node)) {
            this.evictionDeque.moveToBack(node);
        }
    }

    public void drainWriteBuffer() {
        Runnable runnablePoll;
        for (int i = 0; i < 16 && (runnablePoll = this.writeBuffer.poll()) != null; i++) {
            runnablePoll.run();
        }
    }

    public boolean tryToRetire(Node<K, V> node, WeightedValue<V> weightedValue) {
        if (weightedValue.isAlive()) {
            return node.compareAndSet(weightedValue, new WeightedValue(weightedValue.value, -weightedValue.weight));
        }
        return false;
    }

    public void makeRetired(Node<K, V> node) {
        WeightedValue weightedValue;
        do {
            weightedValue = (WeightedValue) node.get();
            if (!weightedValue.isAlive()) {
                return;
            }
        } while (!node.compareAndSet(weightedValue, new WeightedValue(weightedValue.value, -weightedValue.weight)));
    }

    public void makeDead(Node<K, V> node) {
        WeightedValue weightedValue;
        do {
            weightedValue = (WeightedValue) node.get();
        } while (!node.compareAndSet(weightedValue, new WeightedValue(weightedValue.value, 0)));
        AtomicLong atomicLong = this.weightedSize;
        atomicLong.lazySet(atomicLong.get() - Math.abs(weightedValue.weight));
    }

    public final class AddTask implements Runnable {
        public final Node<K, V> node;
        public final int weight;

        public AddTask(Node<K, V> node, int i) {
            this.weight = i;
            this.node = node;
        }

        @Override // java.lang.Runnable
        public void run() {
            AtomicLong atomicLong = PrivateMaxEntriesMap.this.weightedSize;
            atomicLong.lazySet(atomicLong.get() + this.weight);
            if (((WeightedValue) this.node.get()).isAlive()) {
                PrivateMaxEntriesMap.this.evictionDeque.add((LinkedDeque<Node<K, V>>) this.node);
                PrivateMaxEntriesMap.this.evict();
            }
        }
    }

    public final class RemovalTask implements Runnable {
        public final Node<K, V> node;

        public RemovalTask(Node<K, V> node) {
            this.node = node;
        }

        @Override // java.lang.Runnable
        public void run() {
            PrivateMaxEntriesMap.this.evictionDeque.remove((LinkedDeque<Node<K, V>>) this.node);
            PrivateMaxEntriesMap.this.makeDead(this.node);
        }
    }

    public final class UpdateTask implements Runnable {
        public final Node<K, V> node;
        public final int weightDifference;

        public UpdateTask(Node<K, V> node, int i) {
            this.weightDifference = i;
            this.node = node;
        }

        @Override // java.lang.Runnable
        public void run() {
            AtomicLong atomicLong = PrivateMaxEntriesMap.this.weightedSize;
            atomicLong.lazySet(atomicLong.get() + this.weightDifference);
            PrivateMaxEntriesMap.this.applyRead(this.node);
            PrivateMaxEntriesMap.this.evict();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return this.data.isEmpty();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.data.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.evictionLock.lock();
        while (true) {
            try {
                Node<K, V> node = (Node) this.evictionDeque.poll();
                if (node == null) {
                    break;
                }
                this.data.remove(node.key, node);
                makeDead(node);
            } catch (Throwable th) {
                this.evictionLock.unlock();
                throw th;
            }
        }
        for (int i = 0; i < this.readBuffers.length(); i++) {
            this.readBuffers.lazySet(i, null);
        }
        while (true) {
            Runnable runnablePoll = this.writeBuffer.poll();
            if (runnablePoll != null) {
                runnablePoll.run();
            } else {
                this.evictionLock.unlock();
                return;
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.data.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        checkNotNull(obj);
        Iterator<Node<K, V>> it = this.data.values().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().equals(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Node<K, V> node = this.data.get(obj);
        if (node == null) {
            return null;
        }
        afterRead(node);
        return node.getValue();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        return put(k, v, false);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k, V v) {
        return put(k, v, true);
    }

    public V put(K k, V v, boolean z) {
        WeightedValue weightedValue;
        checkNotNull(k);
        checkNotNull(v);
        WeightedValue weightedValue2 = new WeightedValue(v, 1);
        Node<K, V> node = new Node<>(k, weightedValue2);
        while (true) {
            Node<K, V> nodePutIfAbsent = this.data.putIfAbsent(node.key, node);
            if (nodePutIfAbsent == null) {
                afterWrite(new AddTask(node, 1));
                return null;
            }
            if (z) {
                afterRead(nodePutIfAbsent);
                return nodePutIfAbsent.getValue();
            }
            do {
                weightedValue = (WeightedValue) nodePutIfAbsent.get();
                if (!weightedValue.isAlive()) {
                    break;
                }
            } while (!nodePutIfAbsent.compareAndSet(weightedValue, weightedValue2));
            int i = 1 - weightedValue.weight;
            if (i == 0) {
                afterRead(nodePutIfAbsent);
            } else {
                afterWrite(new UpdateTask(nodePutIfAbsent, i));
            }
            return weightedValue.value;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Node<K, V> nodeRemove = this.data.remove(obj);
        if (nodeRemove == null) {
            return null;
        }
        makeRetired(nodeRemove);
        afterWrite(new RemovalTask(nodeRemove));
        return nodeRemove.getValue();
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        Node<K, V> node = this.data.get(obj);
        if (node != null && obj2 != null) {
            WeightedValue<V> weightedValue = (WeightedValue) node.get();
            while (true) {
                if (!weightedValue.contains(obj2)) {
                    break;
                }
                if (tryToRetire(node, weightedValue)) {
                    if (this.data.remove(obj, node)) {
                        afterWrite(new RemovalTask(node));
                        return true;
                    }
                } else {
                    weightedValue = (WeightedValue) node.get();
                    if (!weightedValue.isAlive()) {
                        break;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k, V v) {
        WeightedValue weightedValue;
        checkNotNull(k);
        checkNotNull(v);
        WeightedValue weightedValue2 = new WeightedValue(v, 1);
        Node<K, V> node = this.data.get(k);
        if (node == null) {
            return null;
        }
        do {
            weightedValue = (WeightedValue) node.get();
            if (!weightedValue.isAlive()) {
                return null;
            }
        } while (!node.compareAndSet(weightedValue, weightedValue2));
        int i = 1 - weightedValue.weight;
        if (i == 0) {
            afterRead(node);
        } else {
            afterWrite(new UpdateTask(node, i));
        }
        return weightedValue.value;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k, V v, V v2) {
        WeightedValue weightedValue;
        checkNotNull(k);
        checkNotNull(v);
        checkNotNull(v2);
        WeightedValue weightedValue2 = new WeightedValue(v2, 1);
        Node<K, V> node = this.data.get(k);
        if (node == null) {
            return false;
        }
        do {
            weightedValue = (WeightedValue) node.get();
            if (!weightedValue.isAlive() || !weightedValue.contains(v)) {
                return false;
            }
        } while (!node.compareAndSet(weightedValue, weightedValue2));
        int i = 1 - weightedValue.weight;
        if (i == 0) {
            afterRead(node);
        } else {
            afterWrite(new UpdateTask(node, i));
        }
        return true;
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

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.values;
        if (collection != null) {
            return collection;
        }
        Values values = new Values();
        this.values = values;
        return values;
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

    public static final class WeightedValue<V> {
        public final V value;
        public final int weight;

        public WeightedValue(V v, int i) {
            this.weight = i;
            this.value = v;
        }

        public boolean contains(Object obj) {
            V v = this.value;
            return obj == v || v.equals(obj);
        }

        public boolean isAlive() {
            return this.weight > 0;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Node<K, V> extends AtomicReference<WeightedValue<V>> implements Linked<Node<K, V>> {
        public final K key;
        public Node<K, V> next;
        public Node<K, V> prev;

        public Node(K k, WeightedValue<V> weightedValue) {
            super(weightedValue);
            this.key = k;
        }

        @Override // com.fasterxml.jackson.databind.util.internal.Linked
        public Node<K, V> getPrevious() {
            return this.prev;
        }

        @Override // com.fasterxml.jackson.databind.util.internal.Linked
        public void setPrevious(Node<K, V> node) {
            this.prev = node;
        }

        @Override // com.fasterxml.jackson.databind.util.internal.Linked
        public Node<K, V> getNext() {
            return this.next;
        }

        @Override // com.fasterxml.jackson.databind.util.internal.Linked
        public void setNext(Node<K, V> node) {
            this.next = node;
        }

        public V getValue() {
            return ((WeightedValue) get()).value;
        }
    }

    public final class KeySet extends AbstractSet<K> {
        public final PrivateMaxEntriesMap<K, V> map;

        public KeySet() {
            this.map = PrivateMaxEntriesMap.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.map.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.map.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new KeyIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return PrivateMaxEntriesMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return this.map.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return this.map.data.keySet().toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) this.map.data.keySet().toArray(tArr);
        }
    }

    public final class KeyIterator implements Iterator<K> {
        public K current;
        public final Iterator<K> iterator;

        public KeyIterator() {
            this.iterator = PrivateMaxEntriesMap.this.data.keySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public K next() {
            K next = this.iterator.next();
            this.current = next;
            return next;
        }

        @Override // java.util.Iterator
        public void remove() {
            PrivateMaxEntriesMap.checkState(this.current != null);
            PrivateMaxEntriesMap.this.remove(this.current);
            this.current = null;
        }
    }

    public final class Values extends AbstractCollection<V> {
        public Values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return PrivateMaxEntriesMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            PrivateMaxEntriesMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new ValueIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return PrivateMaxEntriesMap.this.containsValue(obj);
        }
    }

    public final class ValueIterator implements Iterator<V> {
        public Node<K, V> current;
        public final Iterator<Node<K, V>> iterator;

        public ValueIterator() {
            this.iterator = PrivateMaxEntriesMap.this.data.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            Node<K, V> next = this.iterator.next();
            this.current = next;
            return next.getValue();
        }

        @Override // java.util.Iterator
        public void remove() {
            PrivateMaxEntriesMap.checkState(this.current != null);
            PrivateMaxEntriesMap.this.remove(this.current.key);
            this.current = null;
        }
    }

    public final class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        public final PrivateMaxEntriesMap<K, V> map;

        public EntrySet() {
            this.map = PrivateMaxEntriesMap.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.map.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.map.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new EntryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Node<K, V> node = this.map.data.get(entry.getKey());
            return node != null && node.getValue().equals(entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException("ConcurrentLinkedHashMap does not allow add to be called on entrySet()");
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.map.remove(entry.getKey(), entry.getValue());
        }
    }

    public final class EntryIterator implements Iterator<Map.Entry<K, V>> {
        public Node<K, V> current;
        public final Iterator<Node<K, V>> iterator;

        public EntryIterator() {
            this.iterator = PrivateMaxEntriesMap.this.data.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            this.current = this.iterator.next();
            return new WriteThroughEntry(this.current);
        }

        @Override // java.util.Iterator
        public void remove() {
            PrivateMaxEntriesMap.checkState(this.current != null);
            PrivateMaxEntriesMap.this.remove(this.current.key);
            this.current = null;
        }
    }

    public final class WriteThroughEntry extends AbstractMap.SimpleEntry<K, V> {
        public static final long serialVersionUID = 1;

        public WriteThroughEntry(Node<K, V> node) {
            super(node.key, node.getValue());
        }

        @Override // java.util.AbstractMap.SimpleEntry, java.util.Map.Entry
        public V setValue(V v) {
            PrivateMaxEntriesMap.this.put(getKey(), v);
            return (V) super.setValue(v);
        }

        public Object writeReplace() {
            return new AbstractMap.SimpleEntry(this);
        }
    }

    public Object writeReplace() {
        return new SerializationProxy(this);
    }

    public final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Proxy required");
    }

    public static final class SerializationProxy<K, V> implements Serializable {
        public static final long serialVersionUID = 1;
        public final long capacity;
        public final int concurrencyLevel;
        public final Map<K, V> data;

        public SerializationProxy(PrivateMaxEntriesMap<K, V> privateMaxEntriesMap) {
            this.concurrencyLevel = privateMaxEntriesMap.concurrencyLevel;
            this.data = new HashMap(privateMaxEntriesMap);
            this.capacity = privateMaxEntriesMap.capacity.get();
        }

        public Object readResolve() {
            PrivateMaxEntriesMap<K, V> privateMaxEntriesMapBuild = new Builder().maximumCapacity(this.capacity).build();
            privateMaxEntriesMapBuild.putAll(this.data);
            return privateMaxEntriesMapBuild;
        }
    }

    public static final class Builder<K, V> {
        public static final int DEFAULT_CONCURRENCY_LEVEL = 16;
        public static final int DEFAULT_INITIAL_CAPACITY = 16;
        public long capacity = -1;
        public int initialCapacity = 16;
        public int concurrencyLevel = 16;

        public Builder<K, V> initialCapacity(int i) {
            PrivateMaxEntriesMap.checkArgument(i >= 0);
            this.initialCapacity = i;
            return this;
        }

        public Builder<K, V> maximumCapacity(long j) {
            PrivateMaxEntriesMap.checkArgument(j >= 0);
            this.capacity = j;
            return this;
        }

        public Builder<K, V> concurrencyLevel(int i) {
            PrivateMaxEntriesMap.checkArgument(i > 0);
            this.concurrencyLevel = i;
            return this;
        }

        public PrivateMaxEntriesMap<K, V> build() {
            PrivateMaxEntriesMap.checkState(this.capacity >= 0);
            return new PrivateMaxEntriesMap<>(this);
        }
    }
}
