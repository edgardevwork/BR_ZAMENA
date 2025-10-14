package com.google.common.collect;

import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes7.dex */
public abstract class AbstractMapBasedMultiset<E> extends AbstractMultiset<E> implements Serializable {

    @J2ktIncompatible
    @GwtIncompatible
    public static final long serialVersionUID = 0;
    public transient ObjectCountHashMap<E> backingMap;
    public transient long size;

    public abstract ObjectCountHashMap<E> newBackingMap(int distinctElements);

    public AbstractMapBasedMultiset(int distinctElements) {
        this.backingMap = newBackingMap(distinctElements);
    }

    @Override // com.google.common.collect.Multiset
    public final int count(@CheckForNull Object element) {
        return this.backingMap.get(element);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final int add(@ParametricNullness E element, int occurrences) {
        if (occurrences == 0) {
            return count(element);
        }
        Preconditions.checkArgument(occurrences > 0, "occurrences cannot be negative: %s", occurrences);
        int iIndexOf = this.backingMap.indexOf(element);
        if (iIndexOf == -1) {
            this.backingMap.put(element, occurrences);
            this.size += occurrences;
            return 0;
        }
        int value = this.backingMap.getValue(iIndexOf);
        long j = occurrences;
        long j2 = value + j;
        Preconditions.checkArgument(j2 <= ParserMinimalBase.MAX_INT_L, "too many occurrences: %s", j2);
        this.backingMap.setValue(iIndexOf, (int) j2);
        this.size += j;
        return value;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final int remove(@CheckForNull Object element, int occurrences) {
        if (occurrences == 0) {
            return count(element);
        }
        Preconditions.checkArgument(occurrences > 0, "occurrences cannot be negative: %s", occurrences);
        int iIndexOf = this.backingMap.indexOf(element);
        if (iIndexOf == -1) {
            return 0;
        }
        int value = this.backingMap.getValue(iIndexOf);
        if (value > occurrences) {
            this.backingMap.setValue(iIndexOf, value - occurrences);
        } else {
            this.backingMap.removeEntry(iIndexOf);
            occurrences = value;
        }
        this.size -= occurrences;
        return value;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final int setCount(@ParametricNullness E element, int count) {
        CollectPreconditions.checkNonnegative(count, CatchStreamerKeys.COUNT_KEY);
        ObjectCountHashMap<E> objectCountHashMap = this.backingMap;
        int iRemove = count == 0 ? objectCountHashMap.remove(element) : objectCountHashMap.put(element, count);
        this.size += count - iRemove;
        return iRemove;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final boolean setCount(@ParametricNullness E element, int oldCount, int newCount) {
        CollectPreconditions.checkNonnegative(oldCount, "oldCount");
        CollectPreconditions.checkNonnegative(newCount, "newCount");
        int iIndexOf = this.backingMap.indexOf(element);
        if (iIndexOf == -1) {
            if (oldCount != 0) {
                return false;
            }
            if (newCount > 0) {
                this.backingMap.put(element, newCount);
                this.size += newCount;
            }
            return true;
        }
        if (this.backingMap.getValue(iIndexOf) != oldCount) {
            return false;
        }
        if (newCount == 0) {
            this.backingMap.removeEntry(iIndexOf);
            this.size -= oldCount;
        } else {
            this.backingMap.setValue(iIndexOf, newCount);
            this.size += newCount - oldCount;
        }
        return true;
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.backingMap.clear();
        this.size = 0L;
    }

    public abstract class Itr<T> implements Iterator<T> {
        public int entryIndex;
        public int expectedModCount;
        public int toRemove = -1;

        @ParametricNullness
        public abstract T result(int entryIndex);

        public Itr() {
            this.entryIndex = AbstractMapBasedMultiset.this.backingMap.firstIndex();
            this.expectedModCount = AbstractMapBasedMultiset.this.backingMap.modCount;
        }

        public final void checkForConcurrentModification() {
            if (AbstractMapBasedMultiset.this.backingMap.modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            checkForConcurrentModification();
            return this.entryIndex >= 0;
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T tResult = result(this.entryIndex);
            int i = this.entryIndex;
            this.toRemove = i;
            this.entryIndex = AbstractMapBasedMultiset.this.backingMap.nextIndex(i);
            return tResult;
        }

        @Override // java.util.Iterator
        public void remove() {
            checkForConcurrentModification();
            CollectPreconditions.checkRemove(this.toRemove != -1);
            AbstractMapBasedMultiset.this.size -= r0.backingMap.removeEntry(this.toRemove);
            this.entryIndex = AbstractMapBasedMultiset.this.backingMap.nextIndexAfterRemove(this.entryIndex, this.toRemove);
            this.toRemove = -1;
            this.expectedModCount = AbstractMapBasedMultiset.this.backingMap.modCount;
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultiset$1 */
    /* loaded from: classes6.dex */
    public class C72181 extends AbstractMapBasedMultiset<E>.Itr<E> {
        public C72181() {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultiset.Itr
        @ParametricNullness
        public E result(int entryIndex) {
            return AbstractMapBasedMultiset.this.backingMap.getKey(entryIndex);
        }
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Iterator<E> elementIterator() {
        return new AbstractMapBasedMultiset<E>.Itr<E>() { // from class: com.google.common.collect.AbstractMapBasedMultiset.1
            public C72181() {
            }

            @Override // com.google.common.collect.AbstractMapBasedMultiset.Itr
            @ParametricNullness
            public E result(int entryIndex) {
                return AbstractMapBasedMultiset.this.backingMap.getKey(entryIndex);
            }
        };
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultiset$2 */
    /* loaded from: classes6.dex */
    public class C72192 extends AbstractMapBasedMultiset<E>.Itr<Multiset.Entry<E>> {
        public C72192() {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultiset.Itr
        public Multiset.Entry<E> result(int entryIndex) {
            return AbstractMapBasedMultiset.this.backingMap.getEntry(entryIndex);
        }
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Iterator<Multiset.Entry<E>> entryIterator() {
        return new AbstractMapBasedMultiset<E>.Itr<Multiset.Entry<E>>() { // from class: com.google.common.collect.AbstractMapBasedMultiset.2
            public C72192() {
            }

            @Override // com.google.common.collect.AbstractMapBasedMultiset.Itr
            public Multiset.Entry<E> result(int entryIndex) {
                return AbstractMapBasedMultiset.this.backingMap.getEntry(entryIndex);
            }
        };
    }

    public void addTo(Multiset<? super E> multiset) {
        Preconditions.checkNotNull(multiset);
        int iFirstIndex = this.backingMap.firstIndex();
        while (iFirstIndex >= 0) {
            multiset.add(this.backingMap.getKey(iFirstIndex), this.backingMap.getValue(iFirstIndex));
            iFirstIndex = this.backingMap.nextIndex(iFirstIndex);
        }
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final int distinctElements() {
        return this.backingMap.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public final Iterator<E> iterator() {
        return Multisets.iteratorImpl(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final int size() {
        return Ints.saturatedCast(this.size);
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        Serialization.writeMultiset(this, stream);
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        int count = Serialization.readCount(stream);
        this.backingMap = newBackingMap(3);
        Serialization.populateMultiset(this, stream, count);
    }
}
