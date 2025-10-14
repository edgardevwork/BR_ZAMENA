package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;
import javax.annotation.CheckForNull;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
public class TreeRangeSet<C extends Comparable<?>> extends AbstractRangeSet<C> implements Serializable {

    @CheckForNull
    @LazyInit
    public transient Set<Range<C>> asDescendingSetOfRanges;

    @CheckForNull
    @LazyInit
    public transient Set<Range<C>> asRanges;

    @CheckForNull
    @LazyInit
    public transient RangeSet<C> complement;

    @VisibleForTesting
    public final NavigableMap<Cut<C>, Range<C>> rangesByLowerBound;

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void addAll(RangeSet other) {
        super.addAll(other);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void addAll(Iterable ranges) {
        super.addAll(ranges);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean contains(Comparable value) {
        return super.contains(value);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean enclosesAll(RangeSet other) {
        return super.enclosesAll(other);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean enclosesAll(Iterable ranges) {
        return super.enclosesAll(ranges);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void removeAll(RangeSet other) {
        super.removeAll(other);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void removeAll(Iterable ranges) {
        super.removeAll(ranges);
    }

    public /* synthetic */ TreeRangeSet(NavigableMap navigableMap, C73951 c73951) {
        this(navigableMap);
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create() {
        return new TreeRangeSet<>(new TreeMap());
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create(RangeSet<C> rangeSet) {
        TreeRangeSet<C> treeRangeSetCreate = create();
        treeRangeSetCreate.addAll(rangeSet);
        return treeRangeSetCreate;
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create(Iterable<Range<C>> ranges) {
        TreeRangeSet<C> treeRangeSetCreate = create();
        treeRangeSetCreate.addAll(ranges);
        return treeRangeSetCreate;
    }

    public TreeRangeSet(NavigableMap<Cut<C>, Range<C>> rangesByLowerCut) {
        this.rangesByLowerBound = rangesByLowerCut;
    }

    @Override // com.google.common.collect.RangeSet
    public Set<Range<C>> asRanges() {
        Set<Range<C>> set = this.asRanges;
        if (set != null) {
            return set;
        }
        AsRanges asRanges = new AsRanges(this, this.rangesByLowerBound.values());
        this.asRanges = asRanges;
        return asRanges;
    }

    @Override // com.google.common.collect.RangeSet
    public Set<Range<C>> asDescendingSetOfRanges() {
        Set<Range<C>> set = this.asDescendingSetOfRanges;
        if (set != null) {
            return set;
        }
        AsRanges asRanges = new AsRanges(this, this.rangesByLowerBound.descendingMap().values());
        this.asDescendingSetOfRanges = asRanges;
        return asRanges;
    }

    public final class AsRanges extends ForwardingCollection<Range<C>> implements Set<Range<C>> {
        public final Collection<Range<C>> delegate;

        public AsRanges(final TreeRangeSet this$0, Collection<Range<C>> delegate) {
            this.delegate = delegate;
        }

        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Collection<Range<C>> delegate() {
            return this.delegate;
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.hashCodeImpl(this);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@CheckForNull Object o) {
            return Sets.equalsImpl(this, o);
        }
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @CheckForNull
    public Range<C> rangeContaining(C value) {
        Preconditions.checkNotNull(value);
        Map.Entry<Cut<C>, Range<C>> entryFloorEntry = this.rangesByLowerBound.floorEntry(Cut.belowValue(value));
        if (entryFloorEntry == null || !entryFloorEntry.getValue().contains(value)) {
            return null;
        }
        return entryFloorEntry.getValue();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public boolean intersects(Range<C> range) {
        Preconditions.checkNotNull(range);
        Map.Entry<Cut<C>, Range<C>> entryCeilingEntry = this.rangesByLowerBound.ceilingEntry(range.lowerBound);
        if (entryCeilingEntry != null && entryCeilingEntry.getValue().isConnected(range) && !entryCeilingEntry.getValue().intersection(range).isEmpty()) {
            return true;
        }
        Map.Entry<Cut<C>, Range<C>> entryLowerEntry = this.rangesByLowerBound.lowerEntry(range.lowerBound);
        return (entryLowerEntry == null || !entryLowerEntry.getValue().isConnected(range) || entryLowerEntry.getValue().intersection(range).isEmpty()) ? false : true;
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public boolean encloses(Range<C> range) {
        Preconditions.checkNotNull(range);
        Map.Entry<Cut<C>, Range<C>> entryFloorEntry = this.rangesByLowerBound.floorEntry(range.lowerBound);
        return entryFloorEntry != null && entryFloorEntry.getValue().encloses(range);
    }

    @CheckForNull
    public final Range<C> rangeEnclosing(Range<C> range) {
        Preconditions.checkNotNull(range);
        Map.Entry<Cut<C>, Range<C>> entryFloorEntry = this.rangesByLowerBound.floorEntry(range.lowerBound);
        if (entryFloorEntry == null || !entryFloorEntry.getValue().encloses(range)) {
            return null;
        }
        return entryFloorEntry.getValue();
    }

    @Override // com.google.common.collect.RangeSet
    public Range<C> span() {
        Map.Entry<Cut<C>, Range<C>> entryFirstEntry = this.rangesByLowerBound.firstEntry();
        Map.Entry<Cut<C>, Range<C>> entryLastEntry = this.rangesByLowerBound.lastEntry();
        if (entryFirstEntry == null || entryLastEntry == null) {
            throw new NoSuchElementException();
        }
        return Range.create(entryFirstEntry.getValue().lowerBound, entryLastEntry.getValue().upperBound);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public void add(Range<C> rangeToAdd) {
        Preconditions.checkNotNull(rangeToAdd);
        if (rangeToAdd.isEmpty()) {
            return;
        }
        Cut<C> cut = rangeToAdd.lowerBound;
        Cut<C> cut2 = rangeToAdd.upperBound;
        Map.Entry<Cut<C>, Range<C>> entryLowerEntry = this.rangesByLowerBound.lowerEntry(cut);
        if (entryLowerEntry != null) {
            Range<C> value = entryLowerEntry.getValue();
            if (value.upperBound.compareTo((Cut) cut) >= 0) {
                if (value.upperBound.compareTo((Cut) cut2) >= 0) {
                    cut2 = value.upperBound;
                }
                cut = value.lowerBound;
            }
        }
        Map.Entry<Cut<C>, Range<C>> entryFloorEntry = this.rangesByLowerBound.floorEntry(cut2);
        if (entryFloorEntry != null) {
            Range<C> value2 = entryFloorEntry.getValue();
            if (value2.upperBound.compareTo((Cut) cut2) >= 0) {
                cut2 = value2.upperBound;
            }
        }
        this.rangesByLowerBound.subMap(cut, cut2).clear();
        replaceRangeWithSameLowerBound(Range.create(cut, cut2));
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public void remove(Range<C> rangeToRemove) {
        Preconditions.checkNotNull(rangeToRemove);
        if (rangeToRemove.isEmpty()) {
            return;
        }
        Map.Entry<Cut<C>, Range<C>> entryLowerEntry = this.rangesByLowerBound.lowerEntry(rangeToRemove.lowerBound);
        if (entryLowerEntry != null) {
            Range<C> value = entryLowerEntry.getValue();
            if (value.upperBound.compareTo((Cut) rangeToRemove.lowerBound) >= 0) {
                if (rangeToRemove.hasUpperBound() && value.upperBound.compareTo((Cut) rangeToRemove.upperBound) >= 0) {
                    replaceRangeWithSameLowerBound(Range.create(rangeToRemove.upperBound, value.upperBound));
                }
                replaceRangeWithSameLowerBound(Range.create(value.lowerBound, rangeToRemove.lowerBound));
            }
        }
        Map.Entry<Cut<C>, Range<C>> entryFloorEntry = this.rangesByLowerBound.floorEntry(rangeToRemove.upperBound);
        if (entryFloorEntry != null) {
            Range<C> value2 = entryFloorEntry.getValue();
            if (rangeToRemove.hasUpperBound() && value2.upperBound.compareTo((Cut) rangeToRemove.upperBound) >= 0) {
                replaceRangeWithSameLowerBound(Range.create(rangeToRemove.upperBound, value2.upperBound));
            }
        }
        this.rangesByLowerBound.subMap(rangeToRemove.lowerBound, rangeToRemove.upperBound).clear();
    }

    public final void replaceRangeWithSameLowerBound(Range<C> range) {
        if (range.isEmpty()) {
            this.rangesByLowerBound.remove(range.lowerBound);
        } else {
            this.rangesByLowerBound.put(range.lowerBound, range);
        }
    }

    @Override // com.google.common.collect.RangeSet
    public RangeSet<C> complement() {
        RangeSet<C> rangeSet = this.complement;
        if (rangeSet != null) {
            return rangeSet;
        }
        Complement complement = new Complement();
        this.complement = complement;
        return complement;
    }

    @VisibleForTesting
    public static final class RangesByUpperBound<C extends Comparable<?>> extends AbstractNavigableMap<Cut<C>, Range<C>> {
        public final NavigableMap<Cut<C>, Range<C>> rangesByLowerBound;
        public final Range<Cut<C>> upperBoundWindow;

        public RangesByUpperBound(NavigableMap<Cut<C>, Range<C>> rangesByLowerBound) {
            this.rangesByLowerBound = rangesByLowerBound;
            this.upperBoundWindow = Range.all();
        }

        public RangesByUpperBound(NavigableMap<Cut<C>, Range<C>> rangesByLowerBound, Range<Cut<C>> upperBoundWindow) {
            this.rangesByLowerBound = rangesByLowerBound;
            this.upperBoundWindow = upperBoundWindow;
        }

        private NavigableMap<Cut<C>, Range<C>> subMap(Range<Cut<C>> window) {
            if (window.isConnected(this.upperBoundWindow)) {
                return new RangesByUpperBound(this.rangesByLowerBound, window.intersection(this.upperBoundWindow));
            }
            return ImmutableSortedMap.m1231of();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Cut<C>, Range<C>> subMap(Cut<C> fromKey, boolean fromInclusive, Cut<C> toKey, boolean toInclusive) {
            return subMap(Range.range(fromKey, BoundType.forBoolean(fromInclusive), toKey, BoundType.forBoolean(toInclusive)));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Cut<C>, Range<C>> headMap(Cut<C> toKey, boolean inclusive) {
            return subMap(Range.upTo(toKey, BoundType.forBoolean(inclusive)));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Cut<C>, Range<C>> tailMap(Cut<C> fromKey, boolean inclusive) {
            return subMap(Range.downTo(fromKey, BoundType.forBoolean(inclusive)));
        }

        @Override // java.util.SortedMap
        public Comparator<? super Cut<C>> comparator() {
            return Ordering.natural();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object key) {
            return get(key) != null;
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        @CheckForNull
        public Range<C> get(@CheckForNull Object key) {
            Map.Entry<Cut<C>, Range<C>> entryLowerEntry;
            if (key instanceof Cut) {
                try {
                    Cut<C> cut = (Cut) key;
                    if (this.upperBoundWindow.contains(cut) && (entryLowerEntry = this.rangesByLowerBound.lowerEntry(cut)) != null && entryLowerEntry.getValue().upperBound.equals(cut)) {
                        return entryLowerEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public Iterator<Map.Entry<Cut<C>, Range<C>>> entryIterator() {
            Map.Entry<Cut<C>, Range<C>> entryLowerEntry;
            Iterator<Range<C>> it;
            if (!this.upperBoundWindow.hasLowerBound() || (entryLowerEntry = this.rangesByLowerBound.lowerEntry((Cut) this.upperBoundWindow.lowerEndpoint())) == null) {
                it = this.rangesByLowerBound.values().iterator();
            } else if (this.upperBoundWindow.lowerBound.isLessThan(entryLowerEntry.getValue().upperBound)) {
                it = this.rangesByLowerBound.tailMap(entryLowerEntry.getKey(), true).values().iterator();
            } else {
                it = this.rangesByLowerBound.tailMap((Cut) this.upperBoundWindow.lowerEndpoint(), true).values().iterator();
            }
            return new AbstractIterator<Map.Entry<Cut<C>, Range<C>>>() { // from class: com.google.common.collect.TreeRangeSet.RangesByUpperBound.1
                public final /* synthetic */ Iterator val$backingItr;

                public C73981(Iterator it2) {
                    val$backingItr = it2;
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                public Map.Entry<Cut<C>, Range<C>> computeNext() {
                    if (!val$backingItr.hasNext()) {
                        return (Map.Entry) endOfData();
                    }
                    Range range = (Range) val$backingItr.next();
                    if (RangesByUpperBound.this.upperBoundWindow.upperBound.isLessThan(range.upperBound)) {
                        return (Map.Entry) endOfData();
                    }
                    return Maps.immutableEntry(range.upperBound, range);
                }
            };
        }

        /* renamed from: com.google.common.collect.TreeRangeSet$RangesByUpperBound$1 */
        public class C73981 extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {
            public final /* synthetic */ Iterator val$backingItr;

            public C73981(Iterator it2) {
                val$backingItr = it2;
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            public Map.Entry<Cut<C>, Range<C>> computeNext() {
                if (!val$backingItr.hasNext()) {
                    return (Map.Entry) endOfData();
                }
                Range range = (Range) val$backingItr.next();
                if (RangesByUpperBound.this.upperBoundWindow.upperBound.isLessThan(range.upperBound)) {
                    return (Map.Entry) endOfData();
                }
                return Maps.immutableEntry(range.upperBound, range);
            }
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        public Iterator<Map.Entry<Cut<C>, Range<C>>> descendingEntryIterator() {
            Collection<Range<C>> collectionValues;
            if (this.upperBoundWindow.hasUpperBound()) {
                collectionValues = this.rangesByLowerBound.headMap((Cut) this.upperBoundWindow.upperEndpoint(), false).descendingMap().values();
            } else {
                collectionValues = this.rangesByLowerBound.descendingMap().values();
            }
            PeekingIterator peekingIterator = Iterators.peekingIterator(collectionValues.iterator());
            if (peekingIterator.hasNext() && this.upperBoundWindow.upperBound.isLessThan(((Range) peekingIterator.peek()).upperBound)) {
                peekingIterator.next();
            }
            return new AbstractIterator<Map.Entry<Cut<C>, Range<C>>>() { // from class: com.google.common.collect.TreeRangeSet.RangesByUpperBound.2
                public final /* synthetic */ PeekingIterator val$backingItr;

                public C73992(PeekingIterator peekingIterator2) {
                    val$backingItr = peekingIterator2;
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                public Map.Entry<Cut<C>, Range<C>> computeNext() {
                    if (!val$backingItr.hasNext()) {
                        return (Map.Entry) endOfData();
                    }
                    Range range = (Range) val$backingItr.next();
                    if (RangesByUpperBound.this.upperBoundWindow.lowerBound.isLessThan(range.upperBound)) {
                        return Maps.immutableEntry(range.upperBound, range);
                    }
                    return (Map.Entry) endOfData();
                }
            };
        }

        /* renamed from: com.google.common.collect.TreeRangeSet$RangesByUpperBound$2 */
        public class C73992 extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {
            public final /* synthetic */ PeekingIterator val$backingItr;

            public C73992(PeekingIterator peekingIterator2) {
                val$backingItr = peekingIterator2;
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            public Map.Entry<Cut<C>, Range<C>> computeNext() {
                if (!val$backingItr.hasNext()) {
                    return (Map.Entry) endOfData();
                }
                Range range = (Range) val$backingItr.next();
                if (RangesByUpperBound.this.upperBoundWindow.lowerBound.isLessThan(range.upperBound)) {
                    return Maps.immutableEntry(range.upperBound, range);
                }
                return (Map.Entry) endOfData();
            }
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
            if (this.upperBoundWindow.equals(Range.all())) {
                return this.rangesByLowerBound.size();
            }
            return Iterators.size(entryIterator());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            if (this.upperBoundWindow.equals(Range.all())) {
                return this.rangesByLowerBound.isEmpty();
            }
            return !entryIterator().hasNext();
        }
    }

    public static final class ComplementRangesByLowerBound<C extends Comparable<?>> extends AbstractNavigableMap<Cut<C>, Range<C>> {
        public final Range<Cut<C>> complementLowerBoundWindow;
        public final NavigableMap<Cut<C>, Range<C>> positiveRangesByLowerBound;
        public final NavigableMap<Cut<C>, Range<C>> positiveRangesByUpperBound;

        public ComplementRangesByLowerBound(NavigableMap<Cut<C>, Range<C>> positiveRangesByLowerBound) {
            this(positiveRangesByLowerBound, Range.all());
        }

        public ComplementRangesByLowerBound(NavigableMap<Cut<C>, Range<C>> positiveRangesByLowerBound, Range<Cut<C>> window) {
            this.positiveRangesByLowerBound = positiveRangesByLowerBound;
            this.positiveRangesByUpperBound = new RangesByUpperBound(positiveRangesByLowerBound);
            this.complementLowerBoundWindow = window;
        }

        public final NavigableMap<Cut<C>, Range<C>> subMap(Range<Cut<C>> subWindow) {
            if (!this.complementLowerBoundWindow.isConnected(subWindow)) {
                return ImmutableSortedMap.m1231of();
            }
            return new ComplementRangesByLowerBound(this.positiveRangesByLowerBound, subWindow.intersection(this.complementLowerBoundWindow));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Cut<C>, Range<C>> subMap(Cut<C> fromKey, boolean fromInclusive, Cut<C> toKey, boolean toInclusive) {
            return subMap(Range.range(fromKey, BoundType.forBoolean(fromInclusive), toKey, BoundType.forBoolean(toInclusive)));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Cut<C>, Range<C>> headMap(Cut<C> toKey, boolean inclusive) {
            return subMap(Range.upTo(toKey, BoundType.forBoolean(inclusive)));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Cut<C>, Range<C>> tailMap(Cut<C> fromKey, boolean inclusive) {
            return subMap(Range.downTo(fromKey, BoundType.forBoolean(inclusive)));
        }

        @Override // java.util.SortedMap
        public Comparator<? super Cut<C>> comparator() {
            return Ordering.natural();
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public Iterator<Map.Entry<Cut<C>, Range<C>>> entryIterator() {
            Collection<Range<C>> collectionValues;
            Cut cutBelowAll;
            if (this.complementLowerBoundWindow.hasLowerBound()) {
                collectionValues = this.positiveRangesByUpperBound.tailMap((Cut) this.complementLowerBoundWindow.lowerEndpoint(), this.complementLowerBoundWindow.lowerBoundType() == BoundType.CLOSED).values();
            } else {
                collectionValues = this.positiveRangesByUpperBound.values();
            }
            PeekingIterator peekingIterator = Iterators.peekingIterator(collectionValues.iterator());
            if (this.complementLowerBoundWindow.contains(Cut.belowAll()) && (!peekingIterator.hasNext() || ((Range) peekingIterator.peek()).lowerBound != Cut.belowAll())) {
                cutBelowAll = Cut.belowAll();
            } else if (peekingIterator.hasNext()) {
                cutBelowAll = ((Range) peekingIterator.next()).upperBound;
            } else {
                return Iterators.emptyIterator();
            }
            return new AbstractIterator<Map.Entry<Cut<C>, Range<C>>>(cutBelowAll, peekingIterator) { // from class: com.google.common.collect.TreeRangeSet.ComplementRangesByLowerBound.1
                public Cut<C> nextComplementRangeLowerBound;
                public final /* synthetic */ Cut val$firstComplementRangeLowerBound;
                public final /* synthetic */ PeekingIterator val$positiveItr;

                public C73961(Cut cutBelowAll2, PeekingIterator peekingIterator2) {
                    this.val$firstComplementRangeLowerBound = cutBelowAll2;
                    this.val$positiveItr = peekingIterator2;
                    this.nextComplementRangeLowerBound = cutBelowAll2;
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                public Map.Entry<Cut<C>, Range<C>> computeNext() {
                    Range rangeCreate;
                    if (ComplementRangesByLowerBound.this.complementLowerBoundWindow.upperBound.isLessThan(this.nextComplementRangeLowerBound) || this.nextComplementRangeLowerBound == Cut.aboveAll()) {
                        return (Map.Entry) endOfData();
                    }
                    if (this.val$positiveItr.hasNext()) {
                        Range range = (Range) this.val$positiveItr.next();
                        rangeCreate = Range.create(this.nextComplementRangeLowerBound, range.lowerBound);
                        this.nextComplementRangeLowerBound = range.upperBound;
                    } else {
                        rangeCreate = Range.create(this.nextComplementRangeLowerBound, Cut.aboveAll());
                        this.nextComplementRangeLowerBound = Cut.aboveAll();
                    }
                    return Maps.immutableEntry(rangeCreate.lowerBound, rangeCreate);
                }
            };
        }

        /* renamed from: com.google.common.collect.TreeRangeSet$ComplementRangesByLowerBound$1 */
        public class C73961 extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {
            public Cut<C> nextComplementRangeLowerBound;
            public final /* synthetic */ Cut val$firstComplementRangeLowerBound;
            public final /* synthetic */ PeekingIterator val$positiveItr;

            public C73961(Cut cutBelowAll2, PeekingIterator peekingIterator2) {
                this.val$firstComplementRangeLowerBound = cutBelowAll2;
                this.val$positiveItr = peekingIterator2;
                this.nextComplementRangeLowerBound = cutBelowAll2;
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            public Map.Entry<Cut<C>, Range<C>> computeNext() {
                Range rangeCreate;
                if (ComplementRangesByLowerBound.this.complementLowerBoundWindow.upperBound.isLessThan(this.nextComplementRangeLowerBound) || this.nextComplementRangeLowerBound == Cut.aboveAll()) {
                    return (Map.Entry) endOfData();
                }
                if (this.val$positiveItr.hasNext()) {
                    Range range = (Range) this.val$positiveItr.next();
                    rangeCreate = Range.create(this.nextComplementRangeLowerBound, range.lowerBound);
                    this.nextComplementRangeLowerBound = range.upperBound;
                } else {
                    rangeCreate = Range.create(this.nextComplementRangeLowerBound, Cut.aboveAll());
                    this.nextComplementRangeLowerBound = Cut.aboveAll();
                }
                return Maps.immutableEntry(rangeCreate.lowerBound, rangeCreate);
            }
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        public Iterator<Map.Entry<Cut<C>, Range<C>>> descendingEntryIterator() {
            Cut<C> cutAboveAll;
            Cut<C> cutHigherKey;
            if (this.complementLowerBoundWindow.hasUpperBound()) {
                cutAboveAll = (Cut) this.complementLowerBoundWindow.upperEndpoint();
            } else {
                cutAboveAll = Cut.aboveAll();
            }
            PeekingIterator peekingIterator = Iterators.peekingIterator(this.positiveRangesByUpperBound.headMap(cutAboveAll, this.complementLowerBoundWindow.hasUpperBound() && this.complementLowerBoundWindow.upperBoundType() == BoundType.CLOSED).descendingMap().values().iterator());
            if (peekingIterator.hasNext()) {
                if (((Range) peekingIterator.peek()).upperBound == Cut.aboveAll()) {
                    cutHigherKey = ((Range) peekingIterator.next()).lowerBound;
                } else {
                    cutHigherKey = this.positiveRangesByLowerBound.higherKey(((Range) peekingIterator.peek()).upperBound);
                }
            } else {
                if (!this.complementLowerBoundWindow.contains(Cut.belowAll()) || this.positiveRangesByLowerBound.containsKey(Cut.belowAll())) {
                    return Iterators.emptyIterator();
                }
                cutHigherKey = this.positiveRangesByLowerBound.higherKey(Cut.belowAll());
            }
            return new AbstractIterator<Map.Entry<Cut<C>, Range<C>>>((Cut) MoreObjects.firstNonNull(cutHigherKey, Cut.aboveAll()), peekingIterator) { // from class: com.google.common.collect.TreeRangeSet.ComplementRangesByLowerBound.2
                public Cut<C> nextComplementRangeUpperBound;
                public final /* synthetic */ Cut val$firstComplementRangeUpperBound;
                public final /* synthetic */ PeekingIterator val$positiveItr;

                public C73972(final Cut val$firstComplementRangeUpperBound, PeekingIterator peekingIterator2) {
                    this.val$firstComplementRangeUpperBound = val$firstComplementRangeUpperBound;
                    this.val$positiveItr = peekingIterator2;
                    this.nextComplementRangeUpperBound = val$firstComplementRangeUpperBound;
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                public Map.Entry<Cut<C>, Range<C>> computeNext() {
                    if (this.nextComplementRangeUpperBound == Cut.belowAll()) {
                        return (Map.Entry) endOfData();
                    }
                    if (!this.val$positiveItr.hasNext()) {
                        if (ComplementRangesByLowerBound.this.complementLowerBoundWindow.lowerBound.isLessThan(Cut.belowAll())) {
                            Range rangeCreate = Range.create(Cut.belowAll(), this.nextComplementRangeUpperBound);
                            this.nextComplementRangeUpperBound = Cut.belowAll();
                            return Maps.immutableEntry(Cut.belowAll(), rangeCreate);
                        }
                    } else {
                        Range range = (Range) this.val$positiveItr.next();
                        Range rangeCreate2 = Range.create(range.upperBound, this.nextComplementRangeUpperBound);
                        this.nextComplementRangeUpperBound = range.lowerBound;
                        if (ComplementRangesByLowerBound.this.complementLowerBoundWindow.lowerBound.isLessThan(rangeCreate2.lowerBound)) {
                            return Maps.immutableEntry(rangeCreate2.lowerBound, rangeCreate2);
                        }
                    }
                    return (Map.Entry) endOfData();
                }
            };
        }

        /* renamed from: com.google.common.collect.TreeRangeSet$ComplementRangesByLowerBound$2 */
        public class C73972 extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {
            public Cut<C> nextComplementRangeUpperBound;
            public final /* synthetic */ Cut val$firstComplementRangeUpperBound;
            public final /* synthetic */ PeekingIterator val$positiveItr;

            public C73972(final Cut val$firstComplementRangeUpperBound, PeekingIterator peekingIterator2) {
                this.val$firstComplementRangeUpperBound = val$firstComplementRangeUpperBound;
                this.val$positiveItr = peekingIterator2;
                this.nextComplementRangeUpperBound = val$firstComplementRangeUpperBound;
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            public Map.Entry<Cut<C>, Range<C>> computeNext() {
                if (this.nextComplementRangeUpperBound == Cut.belowAll()) {
                    return (Map.Entry) endOfData();
                }
                if (!this.val$positiveItr.hasNext()) {
                    if (ComplementRangesByLowerBound.this.complementLowerBoundWindow.lowerBound.isLessThan(Cut.belowAll())) {
                        Range rangeCreate = Range.create(Cut.belowAll(), this.nextComplementRangeUpperBound);
                        this.nextComplementRangeUpperBound = Cut.belowAll();
                        return Maps.immutableEntry(Cut.belowAll(), rangeCreate);
                    }
                } else {
                    Range range = (Range) this.val$positiveItr.next();
                    Range rangeCreate2 = Range.create(range.upperBound, this.nextComplementRangeUpperBound);
                    this.nextComplementRangeUpperBound = range.lowerBound;
                    if (ComplementRangesByLowerBound.this.complementLowerBoundWindow.lowerBound.isLessThan(rangeCreate2.lowerBound)) {
                        return Maps.immutableEntry(rangeCreate2.lowerBound, rangeCreate2);
                    }
                }
                return (Map.Entry) endOfData();
            }
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
            return Iterators.size(entryIterator());
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        @CheckForNull
        public Range<C> get(@CheckForNull Object key) {
            if (key instanceof Cut) {
                try {
                    Cut<C> cut = (Cut) key;
                    Map.Entry<Cut<C>, Range<C>> entryFirstEntry = tailMap((Cut) cut, true).firstEntry();
                    if (entryFirstEntry != null && entryFirstEntry.getKey().equals(cut)) {
                        return entryFirstEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object key) {
            return get(key) != null;
        }
    }

    /* loaded from: classes8.dex */
    public final class Complement extends TreeRangeSet<C> {
        public Complement() {
            super(new ComplementRangesByLowerBound(TreeRangeSet.this.rangesByLowerBound));
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public void add(Range<C> rangeToAdd) {
            TreeRangeSet.this.remove(rangeToAdd);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public void remove(Range<C> rangeToRemove) {
            TreeRangeSet.this.add(rangeToRemove);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public boolean contains(C value) {
            return !TreeRangeSet.this.contains(value);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.RangeSet
        public RangeSet<C> complement() {
            return TreeRangeSet.this;
        }
    }

    public static final class SubRangeSetRangesByLowerBound<C extends Comparable<?>> extends AbstractNavigableMap<Cut<C>, Range<C>> {
        public final Range<Cut<C>> lowerBoundWindow;
        public final NavigableMap<Cut<C>, Range<C>> rangesByLowerBound;
        public final NavigableMap<Cut<C>, Range<C>> rangesByUpperBound;
        public final Range<C> restriction;

        public /* synthetic */ SubRangeSetRangesByLowerBound(Range range, Range range2, NavigableMap navigableMap, C73951 c73951) {
            this(range, range2, navigableMap);
        }

        public SubRangeSetRangesByLowerBound(Range<Cut<C>> lowerBoundWindow, Range<C> restriction, NavigableMap<Cut<C>, Range<C>> rangesByLowerBound) {
            this.lowerBoundWindow = (Range) Preconditions.checkNotNull(lowerBoundWindow);
            this.restriction = (Range) Preconditions.checkNotNull(restriction);
            this.rangesByLowerBound = (NavigableMap) Preconditions.checkNotNull(rangesByLowerBound);
            this.rangesByUpperBound = new RangesByUpperBound(rangesByLowerBound);
        }

        private NavigableMap<Cut<C>, Range<C>> subMap(Range<Cut<C>> window) {
            if (!window.isConnected(this.lowerBoundWindow)) {
                return ImmutableSortedMap.m1231of();
            }
            return new SubRangeSetRangesByLowerBound(this.lowerBoundWindow.intersection(window), this.restriction, this.rangesByLowerBound);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Cut<C>, Range<C>> subMap(Cut<C> fromKey, boolean fromInclusive, Cut<C> toKey, boolean toInclusive) {
            return subMap(Range.range(fromKey, BoundType.forBoolean(fromInclusive), toKey, BoundType.forBoolean(toInclusive)));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Cut<C>, Range<C>> headMap(Cut<C> toKey, boolean inclusive) {
            return subMap(Range.upTo(toKey, BoundType.forBoolean(inclusive)));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Cut<C>, Range<C>> tailMap(Cut<C> fromKey, boolean inclusive) {
            return subMap(Range.downTo(fromKey, BoundType.forBoolean(inclusive)));
        }

        @Override // java.util.SortedMap
        public Comparator<? super Cut<C>> comparator() {
            return Ordering.natural();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object key) {
            return get(key) != null;
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        @CheckForNull
        public Range<C> get(@CheckForNull Object key) {
            if (key instanceof Cut) {
                try {
                    Cut<C> cut = (Cut) key;
                    if (this.lowerBoundWindow.contains(cut) && cut.compareTo((Cut) this.restriction.lowerBound) >= 0 && cut.compareTo((Cut) this.restriction.upperBound) < 0) {
                        if (cut.equals(this.restriction.lowerBound)) {
                            Range range = (Range) Maps.valueOrNull(this.rangesByLowerBound.floorEntry(cut));
                            if (range != null && range.upperBound.compareTo((Cut) this.restriction.lowerBound) > 0) {
                                return range.intersection(this.restriction);
                            }
                        } else {
                            Range<C> range2 = this.rangesByLowerBound.get(cut);
                            if (range2 != null) {
                                return range2.intersection(this.restriction);
                            }
                        }
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public Iterator<Map.Entry<Cut<C>, Range<C>>> entryIterator() {
            Iterator<Range<C>> it;
            if (this.restriction.isEmpty()) {
                return Iterators.emptyIterator();
            }
            if (this.lowerBoundWindow.upperBound.isLessThan(this.restriction.lowerBound)) {
                return Iterators.emptyIterator();
            }
            if (this.lowerBoundWindow.lowerBound.isLessThan(this.restriction.lowerBound)) {
                it = this.rangesByUpperBound.tailMap(this.restriction.lowerBound, false).values().iterator();
            } else {
                it = this.rangesByLowerBound.tailMap((Cut) this.lowerBoundWindow.lowerBound.endpoint(), this.lowerBoundWindow.lowerBoundType() == BoundType.CLOSED).values().iterator();
            }
            return new AbstractIterator<Map.Entry<Cut<C>, Range<C>>>() { // from class: com.google.common.collect.TreeRangeSet.SubRangeSetRangesByLowerBound.1
                public final /* synthetic */ Iterator val$completeRangeItr;
                public final /* synthetic */ Cut val$upperBoundOnLowerBounds;

                public C74001(Iterator it2, final Cut val$upperBoundOnLowerBounds) {
                    val$completeRangeItr = it2;
                    val$upperBoundOnLowerBounds = val$upperBoundOnLowerBounds;
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                public Map.Entry<Cut<C>, Range<C>> computeNext() {
                    if (!val$completeRangeItr.hasNext()) {
                        return (Map.Entry) endOfData();
                    }
                    Range range = (Range) val$completeRangeItr.next();
                    if (!val$upperBoundOnLowerBounds.isLessThan(range.lowerBound)) {
                        Range rangeIntersection = range.intersection(SubRangeSetRangesByLowerBound.this.restriction);
                        return Maps.immutableEntry(rangeIntersection.lowerBound, rangeIntersection);
                    }
                    return (Map.Entry) endOfData();
                }
            };
        }

        /* renamed from: com.google.common.collect.TreeRangeSet$SubRangeSetRangesByLowerBound$1 */
        public class C74001 extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {
            public final /* synthetic */ Iterator val$completeRangeItr;
            public final /* synthetic */ Cut val$upperBoundOnLowerBounds;

            public C74001(Iterator it2, final Cut val$upperBoundOnLowerBounds) {
                val$completeRangeItr = it2;
                val$upperBoundOnLowerBounds = val$upperBoundOnLowerBounds;
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            public Map.Entry<Cut<C>, Range<C>> computeNext() {
                if (!val$completeRangeItr.hasNext()) {
                    return (Map.Entry) endOfData();
                }
                Range range = (Range) val$completeRangeItr.next();
                if (!val$upperBoundOnLowerBounds.isLessThan(range.lowerBound)) {
                    Range rangeIntersection = range.intersection(SubRangeSetRangesByLowerBound.this.restriction);
                    return Maps.immutableEntry(rangeIntersection.lowerBound, rangeIntersection);
                }
                return (Map.Entry) endOfData();
            }
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        public Iterator<Map.Entry<Cut<C>, Range<C>>> descendingEntryIterator() {
            if (this.restriction.isEmpty()) {
                return Iterators.emptyIterator();
            }
            Cut cut = (Cut) Ordering.natural().min(this.lowerBoundWindow.upperBound, Cut.belowValue(this.restriction.upperBound));
            return new AbstractIterator<Map.Entry<Cut<C>, Range<C>>>() { // from class: com.google.common.collect.TreeRangeSet.SubRangeSetRangesByLowerBound.2
                public final /* synthetic */ Iterator val$completeRangeItr;

                public C74012(final Iterator val$completeRangeItr) {
                    val$completeRangeItr = val$completeRangeItr;
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                public Map.Entry<Cut<C>, Range<C>> computeNext() {
                    if (!val$completeRangeItr.hasNext()) {
                        return (Map.Entry) endOfData();
                    }
                    Range range = (Range) val$completeRangeItr.next();
                    if (SubRangeSetRangesByLowerBound.this.restriction.lowerBound.compareTo((Cut) range.upperBound) < 0) {
                        Range rangeIntersection = range.intersection(SubRangeSetRangesByLowerBound.this.restriction);
                        if (SubRangeSetRangesByLowerBound.this.lowerBoundWindow.contains(rangeIntersection.lowerBound)) {
                            return Maps.immutableEntry(rangeIntersection.lowerBound, rangeIntersection);
                        }
                        return (Map.Entry) endOfData();
                    }
                    return (Map.Entry) endOfData();
                }
            };
        }

        /* renamed from: com.google.common.collect.TreeRangeSet$SubRangeSetRangesByLowerBound$2 */
        public class C74012 extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {
            public final /* synthetic */ Iterator val$completeRangeItr;

            public C74012(final Iterator val$completeRangeItr) {
                val$completeRangeItr = val$completeRangeItr;
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            public Map.Entry<Cut<C>, Range<C>> computeNext() {
                if (!val$completeRangeItr.hasNext()) {
                    return (Map.Entry) endOfData();
                }
                Range range = (Range) val$completeRangeItr.next();
                if (SubRangeSetRangesByLowerBound.this.restriction.lowerBound.compareTo((Cut) range.upperBound) < 0) {
                    Range rangeIntersection = range.intersection(SubRangeSetRangesByLowerBound.this.restriction);
                    if (SubRangeSetRangesByLowerBound.this.lowerBoundWindow.contains(rangeIntersection.lowerBound)) {
                        return Maps.immutableEntry(rangeIntersection.lowerBound, rangeIntersection);
                    }
                    return (Map.Entry) endOfData();
                }
                return (Map.Entry) endOfData();
            }
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
            return Iterators.size(entryIterator());
        }
    }

    @Override // com.google.common.collect.RangeSet
    public RangeSet<C> subRangeSet(Range<C> view) {
        return view.equals(Range.all()) ? this : new SubRangeSet(view);
    }

    /* loaded from: classes8.dex */
    public final class SubRangeSet extends TreeRangeSet<C> {
        public final Range<C> restriction;

        public SubRangeSet(Range<C> restriction) {
            super(new SubRangeSetRangesByLowerBound(Range.all(), restriction, TreeRangeSet.this.rangesByLowerBound));
            this.restriction = restriction;
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public boolean encloses(Range<C> range) {
            Range rangeRangeEnclosing;
            return (this.restriction.isEmpty() || !this.restriction.encloses(range) || (rangeRangeEnclosing = TreeRangeSet.this.rangeEnclosing(range)) == null || rangeRangeEnclosing.intersection(this.restriction).isEmpty()) ? false : true;
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        @CheckForNull
        public Range<C> rangeContaining(C value) {
            Range<C> rangeRangeContaining;
            if (this.restriction.contains(value) && (rangeRangeContaining = TreeRangeSet.this.rangeContaining(value)) != null) {
                return rangeRangeContaining.intersection(this.restriction);
            }
            return null;
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public void add(Range<C> rangeToAdd) {
            Preconditions.checkArgument(this.restriction.encloses(rangeToAdd), "Cannot add range %s to subRangeSet(%s)", rangeToAdd, this.restriction);
            TreeRangeSet.this.add(rangeToAdd);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public void remove(Range<C> rangeToRemove) {
            if (rangeToRemove.isConnected(this.restriction)) {
                TreeRangeSet.this.remove(rangeToRemove.intersection(this.restriction));
            }
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public boolean contains(C value) {
            return this.restriction.contains(value) && TreeRangeSet.this.contains(value);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public void clear() {
            TreeRangeSet.this.remove(this.restriction);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.RangeSet
        public RangeSet<C> subRangeSet(Range<C> view) {
            if (view.encloses(this.restriction)) {
                return this;
            }
            if (view.isConnected(this.restriction)) {
                return new SubRangeSet(this.restriction.intersection(view));
            }
            return ImmutableRangeSet.m1216of();
        }
    }
}
