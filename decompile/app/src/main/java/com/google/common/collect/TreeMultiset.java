package com.google.common.collect;

import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.collect.Serialization;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;
import org.apache.ivy.osgi.p063p2.P2MetadataParser;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes8.dex */
public final class TreeMultiset<E> extends AbstractSortedMultiset<E> implements Serializable {

    @J2ktIncompatible
    @GwtIncompatible
    public static final long serialVersionUID = 1;
    public final transient AvlNode<E> header;
    public final transient GeneralRange<E> range;
    public final transient Reference<AvlNode<E>> rootReference;

    /* loaded from: classes6.dex */
    public enum Aggregate {
        SIZE { // from class: com.google.common.collect.TreeMultiset.Aggregate.1
            @Override // com.google.common.collect.TreeMultiset.Aggregate
            public int nodeAggregate(AvlNode<?> node) {
                return node.elemCount;
            }

            @Override // com.google.common.collect.TreeMultiset.Aggregate
            public long treeAggregate(@CheckForNull AvlNode<?> root) {
                if (root == null) {
                    return 0L;
                }
                return root.totalCount;
            }
        },
        DISTINCT { // from class: com.google.common.collect.TreeMultiset.Aggregate.2
            @Override // com.google.common.collect.TreeMultiset.Aggregate
            public int nodeAggregate(AvlNode<?> node) {
                return 1;
            }

            @Override // com.google.common.collect.TreeMultiset.Aggregate
            public long treeAggregate(@CheckForNull AvlNode<?> root) {
                if (root == null) {
                    return 0L;
                }
                return root.distinctElements;
            }
        };

        public abstract int nodeAggregate(AvlNode<?> node);

        public abstract long treeAggregate(@CheckForNull AvlNode<?> root);
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public /* bridge */ /* synthetic */ Comparator comparator() {
        return super.comparator();
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ boolean contains(@CheckForNull Object element) {
        return super.contains(element);
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ SortedMultiset descendingMultiset() {
        return super.descendingMultiset();
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ NavigableSet elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    @CheckForNull
    public /* bridge */ /* synthetic */ Multiset.Entry firstEntry() {
        return super.firstEntry();
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    @CheckForNull
    public /* bridge */ /* synthetic */ Multiset.Entry lastEntry() {
        return super.lastEntry();
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    @CheckForNull
    public /* bridge */ /* synthetic */ Multiset.Entry pollFirstEntry() {
        return super.pollFirstEntry();
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    @CheckForNull
    public /* bridge */ /* synthetic */ Multiset.Entry pollLastEntry() {
        return super.pollLastEntry();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ SortedMultiset subMultiset(@ParametricNullness Object fromElement, BoundType fromBoundType, @ParametricNullness Object toElement, BoundType toBoundType) {
        return super.subMultiset(fromElement, fromBoundType, toElement, toBoundType);
    }

    public static <E extends Comparable> TreeMultiset<E> create() {
        return new TreeMultiset<>(Ordering.natural());
    }

    public static <E> TreeMultiset<E> create(@CheckForNull Comparator<? super E> comparator) {
        if (comparator == null) {
            return new TreeMultiset<>(Ordering.natural());
        }
        return new TreeMultiset<>(comparator);
    }

    public static <E extends Comparable> TreeMultiset<E> create(Iterable<? extends E> elements) {
        TreeMultiset<E> treeMultisetCreate = create();
        Iterables.addAll(treeMultisetCreate, elements);
        return treeMultisetCreate;
    }

    public TreeMultiset(Reference<AvlNode<E>> rootReference, GeneralRange<E> range, AvlNode<E> endLink) {
        super(range.comparator());
        this.rootReference = rootReference;
        this.range = range;
        this.header = endLink;
    }

    public TreeMultiset(Comparator<? super E> comparator) {
        super(comparator);
        this.range = GeneralRange.all(comparator);
        AvlNode<E> avlNode = new AvlNode<>();
        this.header = avlNode;
        successor(avlNode, avlNode);
        this.rootReference = new Reference<>();
    }

    public final long aggregateForEntries(Aggregate aggr) {
        AvlNode<E> avlNode = this.rootReference.get();
        long jTreeAggregate = aggr.treeAggregate(avlNode);
        if (this.range.hasLowerBound()) {
            jTreeAggregate -= aggregateBelowRange(aggr, avlNode);
        }
        return this.range.hasUpperBound() ? jTreeAggregate - aggregateAboveRange(aggr, avlNode) : jTreeAggregate;
    }

    public final long aggregateBelowRange(Aggregate aggr, @CheckForNull AvlNode<E> node) {
        long jTreeAggregate;
        long jAggregateBelowRange;
        if (node == null) {
            return 0L;
        }
        int iCompare = comparator().compare(NullnessCasts.uncheckedCastNullableTToT(this.range.getLowerEndpoint()), node.getElement());
        if (iCompare < 0) {
            return aggregateBelowRange(aggr, node.left);
        }
        if (iCompare == 0) {
            int i = C73864.$SwitchMap$com$google$common$collect$BoundType[this.range.getLowerBoundType().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new AssertionError();
                }
                return aggr.treeAggregate(node.left);
            }
            jTreeAggregate = aggr.nodeAggregate(node);
            jAggregateBelowRange = aggr.treeAggregate(node.left);
        } else {
            jTreeAggregate = aggr.treeAggregate(node.left) + aggr.nodeAggregate(node);
            jAggregateBelowRange = aggregateBelowRange(aggr, node.right);
        }
        return jTreeAggregate + jAggregateBelowRange;
    }

    /* renamed from: com.google.common.collect.TreeMultiset$4 */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C73864 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$common$collect$BoundType;

        static {
            int[] iArr = new int[BoundType.values().length];
            $SwitchMap$com$google$common$collect$BoundType = iArr;
            try {
                iArr[BoundType.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$common$collect$BoundType[BoundType.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public final long aggregateAboveRange(Aggregate aggr, @CheckForNull AvlNode<E> node) {
        long jTreeAggregate;
        long jAggregateAboveRange;
        if (node == null) {
            return 0L;
        }
        int iCompare = comparator().compare(NullnessCasts.uncheckedCastNullableTToT(this.range.getUpperEndpoint()), node.getElement());
        if (iCompare > 0) {
            return aggregateAboveRange(aggr, node.right);
        }
        if (iCompare == 0) {
            int i = C73864.$SwitchMap$com$google$common$collect$BoundType[this.range.getUpperBoundType().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new AssertionError();
                }
                return aggr.treeAggregate(node.right);
            }
            jTreeAggregate = aggr.nodeAggregate(node);
            jAggregateAboveRange = aggr.treeAggregate(node.right);
        } else {
            jTreeAggregate = aggr.treeAggregate(node.right) + aggr.nodeAggregate(node);
            jAggregateAboveRange = aggregateAboveRange(aggr, node.left);
        }
        return jTreeAggregate + jAggregateAboveRange;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        return Ints.saturatedCast(aggregateForEntries(Aggregate.SIZE));
    }

    @Override // com.google.common.collect.AbstractMultiset
    public int distinctElements() {
        return Ints.saturatedCast(aggregateForEntries(Aggregate.DISTINCT));
    }

    public static int distinctElements(@CheckForNull AvlNode<?> node) {
        if (node == null) {
            return 0;
        }
        return node.distinctElements;
    }

    @Override // com.google.common.collect.Multiset
    public int count(@CheckForNull Object element) {
        try {
            AvlNode<E> avlNode = this.rootReference.get();
            if (this.range.contains(element) && avlNode != null) {
                return avlNode.count(comparator(), element);
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int add(@ParametricNullness E element, int occurrences) {
        CollectPreconditions.checkNonnegative(occurrences, "occurrences");
        if (occurrences == 0) {
            return count(element);
        }
        Preconditions.checkArgument(this.range.contains(element));
        AvlNode<E> avlNode = this.rootReference.get();
        if (avlNode == null) {
            comparator().compare(element, element);
            AvlNode<E> avlNode2 = new AvlNode<>(element, occurrences);
            AvlNode<E> avlNode3 = this.header;
            successor(avlNode3, avlNode2, avlNode3);
            this.rootReference.checkAndSet(avlNode, avlNode2);
            return 0;
        }
        int[] iArr = new int[1];
        this.rootReference.checkAndSet(avlNode, avlNode.add(comparator(), element, occurrences, iArr));
        return iArr[0];
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int remove(@CheckForNull Object element, int occurrences) {
        CollectPreconditions.checkNonnegative(occurrences, "occurrences");
        if (occurrences == 0) {
            return count(element);
        }
        AvlNode<E> avlNode = this.rootReference.get();
        int[] iArr = new int[1];
        try {
            if (this.range.contains(element) && avlNode != null) {
                this.rootReference.checkAndSet(avlNode, avlNode.remove(comparator(), element, occurrences, iArr));
                return iArr[0];
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int setCount(@ParametricNullness E element, int count) {
        CollectPreconditions.checkNonnegative(count, CatchStreamerKeys.COUNT_KEY);
        if (!this.range.contains(element)) {
            Preconditions.checkArgument(count == 0);
            return 0;
        }
        AvlNode<E> avlNode = this.rootReference.get();
        if (avlNode == null) {
            if (count > 0) {
                add(element, count);
            }
            return 0;
        }
        int[] iArr = new int[1];
        this.rootReference.checkAndSet(avlNode, avlNode.setCount(comparator(), element, count, iArr));
        return iArr[0];
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public boolean setCount(@ParametricNullness E element, int oldCount, int newCount) {
        CollectPreconditions.checkNonnegative(newCount, "newCount");
        CollectPreconditions.checkNonnegative(oldCount, "oldCount");
        Preconditions.checkArgument(this.range.contains(element));
        AvlNode<E> avlNode = this.rootReference.get();
        if (avlNode != null) {
            int[] iArr = new int[1];
            this.rootReference.checkAndSet(avlNode, avlNode.setCount(comparator(), element, oldCount, newCount, iArr));
            return iArr[0] == oldCount;
        }
        if (oldCount != 0) {
            return false;
        }
        if (newCount > 0) {
            add(element, newCount);
        }
        return true;
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        if (this.range.hasLowerBound() || this.range.hasUpperBound()) {
            Iterators.clear(entryIterator());
            return;
        }
        AvlNode<E> avlNodeSucc = this.header.succ();
        while (true) {
            AvlNode<E> avlNode = this.header;
            if (avlNodeSucc == avlNode) {
                successor(avlNode, avlNode);
                this.rootReference.clear();
                return;
            }
            AvlNode<E> avlNodeSucc2 = avlNodeSucc.succ();
            avlNodeSucc.elemCount = 0;
            avlNodeSucc.left = null;
            avlNodeSucc.right = null;
            avlNodeSucc.pred = null;
            avlNodeSucc.succ = null;
            avlNodeSucc = avlNodeSucc2;
        }
    }

    public final Multiset.Entry<E> wrapEntry(final AvlNode<E> baseEntry) {
        return new Multisets.AbstractEntry<E>() { // from class: com.google.common.collect.TreeMultiset.1
            @Override // com.google.common.collect.Multiset.Entry
            @ParametricNullness
            public E getElement() {
                return (E) baseEntry.getElement();
            }

            @Override // com.google.common.collect.Multiset.Entry
            public int getCount() {
                int count = baseEntry.getCount();
                return count == 0 ? TreeMultiset.this.count(getElement()) : count;
            }
        };
    }

    @CheckForNull
    public final AvlNode<E> firstNode() {
        AvlNode<E> avlNodeSucc;
        AvlNode<E> avlNode = this.rootReference.get();
        if (avlNode == null) {
            return null;
        }
        if (this.range.hasLowerBound()) {
            Object objUncheckedCastNullableTToT = NullnessCasts.uncheckedCastNullableTToT(this.range.getLowerEndpoint());
            avlNodeSucc = avlNode.ceiling(comparator(), objUncheckedCastNullableTToT);
            if (avlNodeSucc == null) {
                return null;
            }
            if (this.range.getLowerBoundType() == BoundType.OPEN && comparator().compare(objUncheckedCastNullableTToT, avlNodeSucc.getElement()) == 0) {
                avlNodeSucc = avlNodeSucc.succ();
            }
        } else {
            avlNodeSucc = this.header.succ();
        }
        if (avlNodeSucc == this.header || !this.range.contains(avlNodeSucc.getElement())) {
            return null;
        }
        return avlNodeSucc;
    }

    @CheckForNull
    public final AvlNode<E> lastNode() {
        AvlNode<E> avlNodePred;
        AvlNode<E> avlNode = this.rootReference.get();
        if (avlNode == null) {
            return null;
        }
        if (this.range.hasUpperBound()) {
            Object objUncheckedCastNullableTToT = NullnessCasts.uncheckedCastNullableTToT(this.range.getUpperEndpoint());
            avlNodePred = avlNode.floor(comparator(), objUncheckedCastNullableTToT);
            if (avlNodePred == null) {
                return null;
            }
            if (this.range.getUpperBoundType() == BoundType.OPEN && comparator().compare(objUncheckedCastNullableTToT, avlNodePred.getElement()) == 0) {
                avlNodePred = avlNodePred.pred();
            }
        } else {
            avlNodePred = this.header.pred();
        }
        if (avlNodePred == this.header || !this.range.contains(avlNodePred.getElement())) {
            return null;
        }
        return avlNodePred;
    }

    @Override // com.google.common.collect.AbstractMultiset
    public Iterator<E> elementIterator() {
        return Multisets.elementIterator(entryIterator());
    }

    @Override // com.google.common.collect.AbstractMultiset
    public Iterator<Multiset.Entry<E>> entryIterator() {
        return new Iterator<Multiset.Entry<E>>() { // from class: com.google.common.collect.TreeMultiset.2

            @CheckForNull
            public AvlNode<E> current;

            @CheckForNull
            public Multiset.Entry<E> prevEntry;

            {
                this.current = TreeMultiset.this.firstNode();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.current == null) {
                    return false;
                }
                if (!TreeMultiset.this.range.tooHigh(this.current.getElement())) {
                    return true;
                }
                this.current = null;
                return false;
            }

            @Override // java.util.Iterator
            public Multiset.Entry<E> next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                TreeMultiset treeMultiset = TreeMultiset.this;
                AvlNode<E> avlNode = this.current;
                Objects.requireNonNull(avlNode);
                Multiset.Entry<E> entryWrapEntry = treeMultiset.wrapEntry(avlNode);
                this.prevEntry = entryWrapEntry;
                if (this.current.succ() == TreeMultiset.this.header) {
                    this.current = null;
                } else {
                    this.current = this.current.succ();
                }
                return entryWrapEntry;
            }

            @Override // java.util.Iterator
            public void remove() {
                Preconditions.checkState(this.prevEntry != null, "no calls to next() since the last call to remove()");
                TreeMultiset.this.setCount(this.prevEntry.getElement(), 0);
                this.prevEntry = null;
            }
        };
    }

    @Override // com.google.common.collect.AbstractSortedMultiset
    public Iterator<Multiset.Entry<E>> descendingEntryIterator() {
        return new Iterator<Multiset.Entry<E>>() { // from class: com.google.common.collect.TreeMultiset.3

            @CheckForNull
            public AvlNode<E> current;

            @CheckForNull
            public Multiset.Entry<E> prevEntry = null;

            {
                this.current = TreeMultiset.this.lastNode();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.current == null) {
                    return false;
                }
                if (!TreeMultiset.this.range.tooLow(this.current.getElement())) {
                    return true;
                }
                this.current = null;
                return false;
            }

            @Override // java.util.Iterator
            public Multiset.Entry<E> next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Objects.requireNonNull(this.current);
                Multiset.Entry<E> entryWrapEntry = TreeMultiset.this.wrapEntry(this.current);
                this.prevEntry = entryWrapEntry;
                if (this.current.pred() == TreeMultiset.this.header) {
                    this.current = null;
                } else {
                    this.current = this.current.pred();
                }
                return entryWrapEntry;
            }

            @Override // java.util.Iterator
            public void remove() {
                Preconditions.checkState(this.prevEntry != null, "no calls to next() since the last call to remove()");
                TreeMultiset.this.setCount(this.prevEntry.getElement(), 0);
                this.prevEntry = null;
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public Iterator<E> iterator() {
        return Multisets.iteratorImpl(this);
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset<E> headMultiset(@ParametricNullness E upperBound, BoundType boundType) {
        return new TreeMultiset(this.rootReference, this.range.intersect(GeneralRange.upTo(comparator(), upperBound, boundType)), this.header);
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset<E> tailMultiset(@ParametricNullness E lowerBound, BoundType boundType) {
        return new TreeMultiset(this.rootReference, this.range.intersect(GeneralRange.downTo(comparator(), lowerBound, boundType)), this.header);
    }

    /* loaded from: classes6.dex */
    public static final class Reference<T> {

        @CheckForNull
        public T value;

        public Reference() {
        }

        @CheckForNull
        public T get() {
            return this.value;
        }

        public void checkAndSet(@CheckForNull T expected, @CheckForNull T newValue) {
            if (this.value != expected) {
                throw new ConcurrentModificationException();
            }
            this.value = newValue;
        }

        public void clear() {
            this.value = null;
        }
    }

    /* loaded from: classes6.dex */
    public static final class AvlNode<E> {
        public int distinctElements;

        @CheckForNull
        public final E elem;
        public int elemCount;
        public int height;

        @CheckForNull
        public AvlNode<E> left;

        @CheckForNull
        public AvlNode<E> pred;

        @CheckForNull
        public AvlNode<E> right;

        @CheckForNull
        public AvlNode<E> succ;
        public long totalCount;

        public AvlNode(@ParametricNullness E elem, int elemCount) {
            Preconditions.checkArgument(elemCount > 0);
            this.elem = elem;
            this.elemCount = elemCount;
            this.totalCount = elemCount;
            this.distinctElements = 1;
            this.height = 1;
            this.left = null;
            this.right = null;
        }

        public AvlNode() {
            this.elem = null;
            this.elemCount = 1;
        }

        public final AvlNode<E> pred() {
            AvlNode<E> avlNode = this.pred;
            Objects.requireNonNull(avlNode);
            return avlNode;
        }

        public final AvlNode<E> succ() {
            AvlNode<E> avlNode = this.succ;
            Objects.requireNonNull(avlNode);
            return avlNode;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int count(Comparator<? super E> comparator, @ParametricNullness E e) {
            int iCompare = comparator.compare(e, getElement());
            if (iCompare < 0) {
                AvlNode<E> avlNode = this.left;
                if (avlNode == null) {
                    return 0;
                }
                return avlNode.count(comparator, e);
            }
            if (iCompare > 0) {
                AvlNode<E> avlNode2 = this.right;
                if (avlNode2 == null) {
                    return 0;
                }
                return avlNode2.count(comparator, e);
            }
            return this.elemCount;
        }

        public final AvlNode<E> addRightChild(@ParametricNullness E e, int count) {
            AvlNode<E> avlNode = new AvlNode<>(e, count);
            this.right = avlNode;
            TreeMultiset.successor(this, avlNode, succ());
            this.height = Math.max(2, this.height);
            this.distinctElements++;
            this.totalCount += count;
            return this;
        }

        public final AvlNode<E> addLeftChild(@ParametricNullness E e, int count) {
            this.left = new AvlNode<>(e, count);
            TreeMultiset.successor(pred(), this.left, this);
            this.height = Math.max(2, this.height);
            this.distinctElements++;
            this.totalCount += count;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AvlNode<E> add(Comparator<? super E> comparator, @ParametricNullness E e, int count, int[] result) {
            int iCompare = comparator.compare(e, getElement());
            if (iCompare < 0) {
                AvlNode<E> avlNode = this.left;
                if (avlNode == null) {
                    result[0] = 0;
                    return addLeftChild(e, count);
                }
                int i = avlNode.height;
                AvlNode<E> avlNodeAdd = avlNode.add(comparator, e, count, result);
                this.left = avlNodeAdd;
                if (result[0] == 0) {
                    this.distinctElements++;
                }
                this.totalCount += count;
                return avlNodeAdd.height == i ? this : rebalance();
            }
            if (iCompare > 0) {
                AvlNode<E> avlNode2 = this.right;
                if (avlNode2 == null) {
                    result[0] = 0;
                    return addRightChild(e, count);
                }
                int i2 = avlNode2.height;
                AvlNode<E> avlNodeAdd2 = avlNode2.add(comparator, e, count, result);
                this.right = avlNodeAdd2;
                if (result[0] == 0) {
                    this.distinctElements++;
                }
                this.totalCount += count;
                return avlNodeAdd2.height == i2 ? this : rebalance();
            }
            int i3 = this.elemCount;
            result[0] = i3;
            long j = count;
            Preconditions.checkArgument(((long) i3) + j <= ParserMinimalBase.MAX_INT_L);
            this.elemCount += count;
            this.totalCount += j;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CheckForNull
        public AvlNode<E> remove(Comparator<? super E> comparator, @ParametricNullness E e, int count, int[] result) {
            int iCompare = comparator.compare(e, getElement());
            if (iCompare < 0) {
                AvlNode<E> avlNode = this.left;
                if (avlNode == null) {
                    result[0] = 0;
                    return this;
                }
                this.left = avlNode.remove(comparator, e, count, result);
                int i = result[0];
                if (i > 0) {
                    if (count >= i) {
                        this.distinctElements--;
                        this.totalCount -= i;
                    } else {
                        this.totalCount -= count;
                    }
                }
                return i == 0 ? this : rebalance();
            }
            if (iCompare > 0) {
                AvlNode<E> avlNode2 = this.right;
                if (avlNode2 == null) {
                    result[0] = 0;
                    return this;
                }
                this.right = avlNode2.remove(comparator, e, count, result);
                int i2 = result[0];
                if (i2 > 0) {
                    if (count >= i2) {
                        this.distinctElements--;
                        this.totalCount -= i2;
                    } else {
                        this.totalCount -= count;
                    }
                }
                return rebalance();
            }
            int i3 = this.elemCount;
            result[0] = i3;
            if (count >= i3) {
                return deleteMe();
            }
            this.elemCount = i3 - count;
            this.totalCount -= count;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CheckForNull
        public AvlNode<E> setCount(Comparator<? super E> comparator, @ParametricNullness E e, int count, int[] result) {
            int iCompare = comparator.compare(e, getElement());
            if (iCompare < 0) {
                AvlNode<E> avlNode = this.left;
                if (avlNode == null) {
                    result[0] = 0;
                    return count > 0 ? addLeftChild(e, count) : this;
                }
                this.left = avlNode.setCount(comparator, e, count, result);
                if (count == 0 && result[0] != 0) {
                    this.distinctElements--;
                } else if (count > 0 && result[0] == 0) {
                    this.distinctElements++;
                }
                this.totalCount += count - result[0];
                return rebalance();
            }
            if (iCompare > 0) {
                AvlNode<E> avlNode2 = this.right;
                if (avlNode2 == null) {
                    result[0] = 0;
                    return count > 0 ? addRightChild(e, count) : this;
                }
                this.right = avlNode2.setCount(comparator, e, count, result);
                if (count == 0 && result[0] != 0) {
                    this.distinctElements--;
                } else if (count > 0 && result[0] == 0) {
                    this.distinctElements++;
                }
                this.totalCount += count - result[0];
                return rebalance();
            }
            result[0] = this.elemCount;
            if (count == 0) {
                return deleteMe();
            }
            this.totalCount += count - r3;
            this.elemCount = count;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CheckForNull
        public AvlNode<E> setCount(Comparator<? super E> comparator, @ParametricNullness E e, int expectedCount, int newCount, int[] result) {
            int iCompare = comparator.compare(e, getElement());
            if (iCompare < 0) {
                AvlNode<E> avlNode = this.left;
                if (avlNode == null) {
                    result[0] = 0;
                    return (expectedCount != 0 || newCount <= 0) ? this : addLeftChild(e, newCount);
                }
                this.left = avlNode.setCount(comparator, e, expectedCount, newCount, result);
                int i = result[0];
                if (i == expectedCount) {
                    if (newCount == 0 && i != 0) {
                        this.distinctElements--;
                    } else if (newCount > 0 && i == 0) {
                        this.distinctElements++;
                    }
                    this.totalCount += newCount - i;
                }
                return rebalance();
            }
            if (iCompare > 0) {
                AvlNode<E> avlNode2 = this.right;
                if (avlNode2 == null) {
                    result[0] = 0;
                    return (expectedCount != 0 || newCount <= 0) ? this : addRightChild(e, newCount);
                }
                this.right = avlNode2.setCount(comparator, e, expectedCount, newCount, result);
                int i2 = result[0];
                if (i2 == expectedCount) {
                    if (newCount == 0 && i2 != 0) {
                        this.distinctElements--;
                    } else if (newCount > 0 && i2 == 0) {
                        this.distinctElements++;
                    }
                    this.totalCount += newCount - i2;
                }
                return rebalance();
            }
            int i3 = this.elemCount;
            result[0] = i3;
            if (expectedCount == i3) {
                if (newCount == 0) {
                    return deleteMe();
                }
                this.totalCount += newCount - i3;
                this.elemCount = newCount;
            }
            return this;
        }

        @CheckForNull
        public final AvlNode<E> deleteMe() {
            int i = this.elemCount;
            this.elemCount = 0;
            TreeMultiset.successor(pred(), succ());
            AvlNode<E> avlNode = this.left;
            if (avlNode == null) {
                return this.right;
            }
            AvlNode<E> avlNode2 = this.right;
            if (avlNode2 == null) {
                return avlNode;
            }
            if (avlNode.height >= avlNode2.height) {
                AvlNode<E> avlNodePred = pred();
                avlNodePred.left = this.left.removeMax(avlNodePred);
                avlNodePred.right = this.right;
                avlNodePred.distinctElements = this.distinctElements - 1;
                avlNodePred.totalCount = this.totalCount - i;
                return avlNodePred.rebalance();
            }
            AvlNode<E> avlNodeSucc = succ();
            avlNodeSucc.right = this.right.removeMin(avlNodeSucc);
            avlNodeSucc.left = this.left;
            avlNodeSucc.distinctElements = this.distinctElements - 1;
            avlNodeSucc.totalCount = this.totalCount - i;
            return avlNodeSucc.rebalance();
        }

        @CheckForNull
        public final AvlNode<E> removeMin(AvlNode<E> node) {
            AvlNode<E> avlNode = this.left;
            if (avlNode == null) {
                return this.right;
            }
            this.left = avlNode.removeMin(node);
            this.distinctElements--;
            this.totalCount -= node.elemCount;
            return rebalance();
        }

        @CheckForNull
        public final AvlNode<E> removeMax(AvlNode<E> node) {
            AvlNode<E> avlNode = this.right;
            if (avlNode == null) {
                return this.left;
            }
            this.right = avlNode.removeMax(node);
            this.distinctElements--;
            this.totalCount -= node.elemCount;
            return rebalance();
        }

        public final void recomputeMultiset() {
            this.distinctElements = TreeMultiset.distinctElements(this.left) + 1 + TreeMultiset.distinctElements(this.right);
            this.totalCount = this.elemCount + totalCount(this.left) + totalCount(this.right);
        }

        public final void recomputeHeight() {
            this.height = Math.max(height(this.left), height(this.right)) + 1;
        }

        public final void recompute() {
            recomputeMultiset();
            recomputeHeight();
        }

        public final AvlNode<E> rebalance() {
            int iBalanceFactor = balanceFactor();
            if (iBalanceFactor == -2) {
                Objects.requireNonNull(this.right);
                if (this.right.balanceFactor() > 0) {
                    this.right = this.right.rotateRight();
                }
                return rotateLeft();
            }
            if (iBalanceFactor == 2) {
                Objects.requireNonNull(this.left);
                if (this.left.balanceFactor() < 0) {
                    this.left = this.left.rotateLeft();
                }
                return rotateRight();
            }
            recomputeHeight();
            return this;
        }

        public final int balanceFactor() {
            return height(this.left) - height(this.right);
        }

        public final AvlNode<E> rotateLeft() {
            Preconditions.checkState(this.right != null);
            AvlNode<E> avlNode = this.right;
            this.right = avlNode.left;
            avlNode.left = this;
            avlNode.totalCount = this.totalCount;
            avlNode.distinctElements = this.distinctElements;
            recompute();
            avlNode.recomputeHeight();
            return avlNode;
        }

        public final AvlNode<E> rotateRight() {
            Preconditions.checkState(this.left != null);
            AvlNode<E> avlNode = this.left;
            this.left = avlNode.right;
            avlNode.right = this;
            avlNode.totalCount = this.totalCount;
            avlNode.distinctElements = this.distinctElements;
            recompute();
            avlNode.recomputeHeight();
            return avlNode;
        }

        public static long totalCount(@CheckForNull AvlNode<?> node) {
            if (node == null) {
                return 0L;
            }
            return node.totalCount;
        }

        public static int height(@CheckForNull AvlNode<?> node) {
            if (node == null) {
                return 0;
            }
            return node.height;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CheckForNull
        public final AvlNode<E> ceiling(Comparator<? super E> comparator, @ParametricNullness E e) {
            int iCompare = comparator.compare(e, getElement());
            if (iCompare < 0) {
                AvlNode<E> avlNode = this.left;
                return avlNode == null ? this : (AvlNode) MoreObjects.firstNonNull(avlNode.ceiling(comparator, e), this);
            }
            if (iCompare == 0) {
                return this;
            }
            AvlNode<E> avlNode2 = this.right;
            if (avlNode2 == null) {
                return null;
            }
            return avlNode2.ceiling(comparator, e);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CheckForNull
        public final AvlNode<E> floor(Comparator<? super E> comparator, @ParametricNullness E e) {
            int iCompare = comparator.compare(e, getElement());
            if (iCompare > 0) {
                AvlNode<E> avlNode = this.right;
                return avlNode == null ? this : (AvlNode) MoreObjects.firstNonNull(avlNode.floor(comparator, e), this);
            }
            if (iCompare == 0) {
                return this;
            }
            AvlNode<E> avlNode2 = this.left;
            if (avlNode2 == null) {
                return null;
            }
            return avlNode2.floor(comparator, e);
        }

        @ParametricNullness
        public E getElement() {
            return (E) NullnessCasts.uncheckedCastNullableTToT(this.elem);
        }

        public int getCount() {
            return this.elemCount;
        }

        public String toString() {
            return Multisets.immutableEntry(getElement(), getCount()).toString();
        }
    }

    public static <T> void successor(AvlNode<T> a2, AvlNode<T> b) {
        a2.succ = b;
        b.pred = a2;
    }

    public static <T> void successor(AvlNode<T> a2, AvlNode<T> b, AvlNode<T> c) {
        successor(a2, b);
        successor(b, c);
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeObject(elementSet().comparator());
        Serialization.writeMultiset(this, stream);
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream stream) throws IllegalAccessException, ClassNotFoundException, IOException, IllegalArgumentException {
        stream.defaultReadObject();
        Object object = stream.readObject();
        Objects.requireNonNull(object);
        Comparator comparator = (Comparator) object;
        Serialization.getFieldSetter(AbstractSortedMultiset.class, "comparator").set((Serialization.FieldSetter) this, (Object) comparator);
        Serialization.getFieldSetter(TreeMultiset.class, P2MetadataParser.RequiredHandler.RANGE).set((Serialization.FieldSetter) this, (Object) GeneralRange.all(comparator));
        Serialization.getFieldSetter(TreeMultiset.class, "rootReference").set((Serialization.FieldSetter) this, (Object) new Reference());
        AvlNode avlNode = new AvlNode();
        Serialization.getFieldSetter(TreeMultiset.class, "header").set((Serialization.FieldSetter) this, (Object) avlNode);
        successor(avlNode, avlNode);
        Serialization.populateMultiset(this, stream);
    }
}
