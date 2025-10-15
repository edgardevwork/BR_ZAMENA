package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.SortedLists;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes8.dex */
public class ImmutableRangeMap<K extends Comparable<?>, V> implements RangeMap<K, V>, Serializable {
    public static final ImmutableRangeMap<Comparable<?>, Object> EMPTY = new ImmutableRangeMap<>(ImmutableList.m1171of(), ImmutableList.m1171of());
    public static final long serialVersionUID = 0;
    public final transient ImmutableList<Range<K>> ranges;
    public final transient ImmutableList<V> values;

    /* renamed from: of */
    public static <K extends Comparable<?>, V> ImmutableRangeMap<K, V> m1214of() {
        return (ImmutableRangeMap<K, V>) EMPTY;
    }

    /* renamed from: of */
    public static <K extends Comparable<?>, V> ImmutableRangeMap<K, V> m1215of(Range<K> range, V value) {
        return new ImmutableRangeMap<>(ImmutableList.m1172of(range), ImmutableList.m1172of(value));
    }

    public static <K extends Comparable<?>, V> ImmutableRangeMap<K, V> copyOf(RangeMap<K, ? extends V> rangeMap) {
        if (rangeMap instanceof ImmutableRangeMap) {
            return (ImmutableRangeMap) rangeMap;
        }
        Map<Range<K>, ? extends V> mapAsMapOfRanges = rangeMap.asMapOfRanges();
        ImmutableList.Builder builder = new ImmutableList.Builder(mapAsMapOfRanges.size());
        ImmutableList.Builder builder2 = new ImmutableList.Builder(mapAsMapOfRanges.size());
        for (Map.Entry entry : mapAsMapOfRanges.entrySet()) {
            builder.add((ImmutableList.Builder) entry.getKey());
            builder2.add((ImmutableList.Builder) entry.getValue());
        }
        return new ImmutableRangeMap<>(builder.build(), builder2.build());
    }

    public static <K extends Comparable<?>, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    @DoNotMock
    public static final class Builder<K extends Comparable<?>, V> {
        public final List<Map.Entry<Range<K>, V>> entries = Lists.newArrayList();

        @CanIgnoreReturnValue
        public Builder<K, V> put(Range<K> range, V value) {
            Preconditions.checkNotNull(range);
            Preconditions.checkNotNull(value);
            Preconditions.checkArgument(!range.isEmpty(), "Range must not be empty, but was %s", range);
            this.entries.add(Maps.immutableEntry(range, value));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(RangeMap<K, ? extends V> rangeMap) {
            for (Map.Entry entry : rangeMap.asMapOfRanges().entrySet()) {
                put((Range) entry.getKey(), entry.getValue());
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<K, V> combine(Builder<K, V> builder) {
            this.entries.addAll(builder.entries);
            return this;
        }

        public ImmutableRangeMap<K, V> build() {
            Collections.sort(this.entries, Range.rangeLexOrdering().onKeys());
            ImmutableList.Builder builder = new ImmutableList.Builder(this.entries.size());
            ImmutableList.Builder builder2 = new ImmutableList.Builder(this.entries.size());
            for (int i = 0; i < this.entries.size(); i++) {
                Range<K> key = this.entries.get(i).getKey();
                if (i > 0) {
                    Range<K> key2 = this.entries.get(i - 1).getKey();
                    if (key.isConnected(key2) && !key.intersection(key2).isEmpty()) {
                        throw new IllegalArgumentException("Overlapping ranges: range " + key2 + " overlaps with entry " + key);
                    }
                }
                builder.add((ImmutableList.Builder) key);
                builder2.add((ImmutableList.Builder) this.entries.get(i).getValue());
            }
            return new ImmutableRangeMap<>(builder.build(), builder2.build());
        }
    }

    public ImmutableRangeMap(ImmutableList<Range<K>> ranges, ImmutableList<V> values) {
        this.ranges = ranges;
        this.values = values;
    }

    @Override // com.google.common.collect.RangeMap
    @CheckForNull
    public V get(K key) {
        int iBinarySearch = SortedLists.binarySearch(this.ranges, (Function<? super E, Cut>) Range.lowerBoundFn(), Cut.belowValue(key), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        if (iBinarySearch != -1 && this.ranges.get(iBinarySearch).contains(key)) {
            return this.values.get(iBinarySearch);
        }
        return null;
    }

    @Override // com.google.common.collect.RangeMap
    @CheckForNull
    public Map.Entry<Range<K>, V> getEntry(K key) {
        int iBinarySearch = SortedLists.binarySearch(this.ranges, (Function<? super E, Cut>) Range.lowerBoundFn(), Cut.belowValue(key), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        if (iBinarySearch == -1) {
            return null;
        }
        Range<K> range = this.ranges.get(iBinarySearch);
        if (range.contains(key)) {
            return Maps.immutableEntry(range, this.values.get(iBinarySearch));
        }
        return null;
    }

    @Override // com.google.common.collect.RangeMap
    public Range<K> span() {
        if (this.ranges.isEmpty()) {
            throw new NoSuchElementException();
        }
        return Range.create(this.ranges.get(0).lowerBound, this.ranges.get(r1.size() - 1).upperBound);
    }

    @Override // com.google.common.collect.RangeMap
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void put(Range<K> range, V value) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.RangeMap
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void putCoalescing(Range<K> range, V value) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.RangeMap
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void putAll(RangeMap<K, ? extends V> rangeMap) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.RangeMap
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.RangeMap
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void remove(Range<K> range) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.RangeMap
    public ImmutableMap<Range<K>, V> asMapOfRanges() {
        if (this.ranges.isEmpty()) {
            return ImmutableMap.m1190of();
        }
        return new ImmutableSortedMap(new RegularImmutableSortedSet(this.ranges, Range.rangeLexOrdering()), this.values);
    }

    @Override // com.google.common.collect.RangeMap
    public ImmutableMap<Range<K>, V> asDescendingMapOfRanges() {
        if (this.ranges.isEmpty()) {
            return ImmutableMap.m1190of();
        }
        return new ImmutableSortedMap(new RegularImmutableSortedSet(this.ranges.reverse(), Range.rangeLexOrdering().reverse()), this.values.reverse());
    }

    @Override // com.google.common.collect.RangeMap
    public ImmutableRangeMap<K, V> subRangeMap(final Range<K> range) {
        if (((Range) Preconditions.checkNotNull(range)).isEmpty()) {
            return m1214of();
        }
        if (this.ranges.isEmpty() || range.encloses(span())) {
            return this;
        }
        ImmutableList<Range<K>> immutableList = this.ranges;
        Function functionUpperBoundFn = Range.upperBoundFn();
        Comparable comparable = range.lowerBound;
        SortedLists.KeyPresentBehavior keyPresentBehavior = SortedLists.KeyPresentBehavior.FIRST_AFTER;
        SortedLists.KeyAbsentBehavior keyAbsentBehavior = SortedLists.KeyAbsentBehavior.NEXT_HIGHER;
        final int iBinarySearch = SortedLists.binarySearch(immutableList, (Function<? super E, Comparable>) functionUpperBoundFn, comparable, keyPresentBehavior, keyAbsentBehavior);
        int iBinarySearch2 = SortedLists.binarySearch(this.ranges, (Function<? super E, Comparable>) Range.lowerBoundFn(), range.upperBound, SortedLists.KeyPresentBehavior.ANY_PRESENT, keyAbsentBehavior);
        if (iBinarySearch >= iBinarySearch2) {
            return m1214of();
        }
        final int i = iBinarySearch2 - iBinarySearch;
        return (ImmutableRangeMap<K, V>) new ImmutableRangeMap<K, V>(this, new ImmutableList<Range<K>>() { // from class: com.google.common.collect.ImmutableRangeMap.1
            @Override // com.google.common.collect.ImmutableCollection
            public boolean isPartialView() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return i;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.List
            public Range<K> get(int index) {
                Preconditions.checkElementIndex(index, i);
                return (index == 0 || index == i + (-1)) ? ((Range) ImmutableRangeMap.this.ranges.get(index + iBinarySearch)).intersection(range) : (Range) ImmutableRangeMap.this.ranges.get(index + iBinarySearch);
            }
        }, this.values.subList(iBinarySearch, iBinarySearch2)) { // from class: com.google.common.collect.ImmutableRangeMap.2
            @Override // com.google.common.collect.ImmutableRangeMap, com.google.common.collect.RangeMap
            public /* bridge */ /* synthetic */ Map asDescendingMapOfRanges() {
                return super.asDescendingMapOfRanges();
            }

            @Override // com.google.common.collect.ImmutableRangeMap, com.google.common.collect.RangeMap
            public /* bridge */ /* synthetic */ Map asMapOfRanges() {
                return super.asMapOfRanges();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.ImmutableRangeMap, com.google.common.collect.RangeMap
            public ImmutableRangeMap<K, V> subRangeMap(Range<K> subRange) {
                if (range.isConnected(subRange)) {
                    return this.subRangeMap((Range) subRange.intersection(range));
                }
                return ImmutableRangeMap.m1214of();
            }
        };
    }

    @Override // com.google.common.collect.RangeMap
    public int hashCode() {
        return asMapOfRanges().hashCode();
    }

    @Override // com.google.common.collect.RangeMap
    public boolean equals(@CheckForNull Object o) {
        if (o instanceof RangeMap) {
            return asMapOfRanges().equals(((RangeMap) o).asMapOfRanges());
        }
        return false;
    }

    @Override // com.google.common.collect.RangeMap
    public String toString() {
        return asMapOfRanges().toString();
    }

    public static class SerializedForm<K extends Comparable<?>, V> implements Serializable {
        public static final long serialVersionUID = 0;
        public final ImmutableMap<Range<K>, V> mapOfRanges;

        public SerializedForm(ImmutableMap<Range<K>, V> mapOfRanges) {
            this.mapOfRanges = mapOfRanges;
        }

        public Object readResolve() {
            if (this.mapOfRanges.isEmpty()) {
                return ImmutableRangeMap.m1214of();
            }
            return createRangeMap();
        }

        public Object createRangeMap() {
            Builder builder = new Builder();
            UnmodifiableIterator<Map.Entry<Range<K>, V>> it = this.mapOfRanges.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Range<K>, V> next = it.next();
                builder.put(next.getKey(), next.getValue());
            }
            return builder.build();
        }
    }

    public Object writeReplace() {
        return new SerializedForm(asMapOfRanges());
    }

    @J2ktIncompatible
    public final void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }
}
