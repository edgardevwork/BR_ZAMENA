package com.google.common.collect;

import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Multiset;
import com.google.common.collect.Sets;
import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.annotation.CheckForNull;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class Multisets {
    /* JADX WARN: Multi-variable type inference failed */
    public static <E> Multiset<E> unmodifiableMultiset(Multiset<? extends E> multiset) {
        return ((multiset instanceof UnmodifiableMultiset) || (multiset instanceof ImmutableMultiset)) ? multiset : new UnmodifiableMultiset((Multiset) Preconditions.checkNotNull(multiset));
    }

    @Deprecated
    public static <E> Multiset<E> unmodifiableMultiset(ImmutableMultiset<E> multiset) {
        return (Multiset) Preconditions.checkNotNull(multiset);
    }

    /* loaded from: classes8.dex */
    public static class UnmodifiableMultiset<E> extends ForwardingMultiset<E> implements Serializable {
        public static final long serialVersionUID = 0;
        public final Multiset<? extends E> delegate;

        @CheckForNull
        @LazyInit
        public transient Set<E> elementSet;

        @CheckForNull
        @LazyInit
        public transient Set<Multiset.Entry<E>> entrySet;

        public UnmodifiableMultiset(Multiset<? extends E> delegate) {
            this.delegate = delegate;
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Multiset<E> delegate() {
            return this.delegate;
        }

        public Set<E> createElementSet() {
            return Collections.unmodifiableSet(this.delegate.elementSet());
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public Set<E> elementSet() {
            Set<E> set = this.elementSet;
            if (set != null) {
                return set;
            }
            Set<E> setCreateElementSet = createElementSet();
            this.elementSet = setCreateElementSet;
            return setCreateElementSet;
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public Set<Multiset.Entry<E>> entrySet() {
            Set<Multiset.Entry<E>> set = this.entrySet;
            if (set != null) {
                return set;
            }
            Set<Multiset.Entry<E>> setUnmodifiableSet = Collections.unmodifiableSet(this.delegate.entrySet());
            this.entrySet = setUnmodifiableSet;
            return setUnmodifiableSet;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return Iterators.unmodifiableIterator(this.delegate.iterator());
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public boolean add(@ParametricNullness E element) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public int add(@ParametricNullness E element, int occurrences) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> elementsToAdd) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object element) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public int remove(@CheckForNull Object element, int occurrences) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> elementsToRemove) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> elementsToRetain) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public int setCount(@ParametricNullness E element, int count) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public boolean setCount(@ParametricNullness E element, int oldCount, int newCount) {
            throw new UnsupportedOperationException();
        }
    }

    public static <E> SortedMultiset<E> unmodifiableSortedMultiset(SortedMultiset<E> sortedMultiset) {
        return new UnmodifiableSortedMultiset((SortedMultiset) Preconditions.checkNotNull(sortedMultiset));
    }

    public static <E> Multiset.Entry<E> immutableEntry(@ParametricNullness E e, int n) {
        return new ImmutableEntry(e, n);
    }

    /* loaded from: classes8.dex */
    public static class ImmutableEntry<E> extends AbstractEntry<E> implements Serializable {
        public static final long serialVersionUID = 0;
        public final int count;

        @ParametricNullness
        public final E element;

        @CheckForNull
        public ImmutableEntry<E> nextInBucket() {
            return null;
        }

        public ImmutableEntry(@ParametricNullness E element, int count) {
            this.element = element;
            this.count = count;
            CollectPreconditions.checkNonnegative(count, CatchStreamerKeys.COUNT_KEY);
        }

        @Override // com.google.common.collect.Multiset.Entry
        @ParametricNullness
        public final E getElement() {
            return this.element;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public final int getCount() {
            return this.count;
        }
    }

    public static <E> Multiset<E> filter(Multiset<E> unfiltered, Predicate<? super E> predicate) {
        if (unfiltered instanceof FilteredMultiset) {
            FilteredMultiset filteredMultiset = (FilteredMultiset) unfiltered;
            return new FilteredMultiset(filteredMultiset.unfiltered, Predicates.and(filteredMultiset.predicate, predicate));
        }
        return new FilteredMultiset(unfiltered, predicate);
    }

    /* loaded from: classes8.dex */
    public static final class FilteredMultiset<E> extends ViewMultiset<E> {
        public final Predicate<? super E> predicate;
        public final Multiset<E> unfiltered;

        public FilteredMultiset(Multiset<E> unfiltered, Predicate<? super E> predicate) {
            super();
            this.unfiltered = (Multiset) Preconditions.checkNotNull(unfiltered);
            this.predicate = (Predicate) Preconditions.checkNotNull(predicate);
        }

        @Override // com.google.common.collect.Multisets.ViewMultiset, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
        public UnmodifiableIterator<E> iterator() {
            return Iterators.filter(this.unfiltered.iterator(), this.predicate);
        }

        @Override // com.google.common.collect.AbstractMultiset
        public Set<E> createElementSet() {
            return Sets.filter(this.unfiltered.elementSet(), this.predicate);
        }

        @Override // com.google.common.collect.AbstractMultiset
        public Iterator<E> elementIterator() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractMultiset
        public Set<Multiset.Entry<E>> createEntrySet() {
            return Sets.filter(this.unfiltered.entrySet(), new Predicate<Multiset.Entry<E>>() { // from class: com.google.common.collect.Multisets.FilteredMultiset.1
                public C73371() {
                }

                @Override // com.google.common.base.Predicate
                public boolean apply(Multiset.Entry<E> entry) {
                    return FilteredMultiset.this.predicate.apply(entry.getElement());
                }
            });
        }

        /* renamed from: com.google.common.collect.Multisets$FilteredMultiset$1 */
        /* loaded from: classes7.dex */
        public class C73371 implements Predicate<Multiset.Entry<E>> {
            public C73371() {
            }

            @Override // com.google.common.base.Predicate
            public boolean apply(Multiset.Entry<E> entry) {
                return FilteredMultiset.this.predicate.apply(entry.getElement());
            }
        }

        @Override // com.google.common.collect.AbstractMultiset
        public Iterator<Multiset.Entry<E>> entryIterator() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.Multiset
        public int count(@CheckForNull Object element) {
            int iCount = this.unfiltered.count(element);
            if (iCount <= 0 || !this.predicate.apply(element)) {
                return 0;
            }
            return iCount;
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public int add(@ParametricNullness E element, int occurrences) {
            Preconditions.checkArgument(this.predicate.apply(element), "Element %s does not match predicate %s", element, this.predicate);
            return this.unfiltered.add(element, occurrences);
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public int remove(@CheckForNull Object element, int occurrences) {
            CollectPreconditions.checkNonnegative(occurrences, "occurrences");
            if (occurrences == 0) {
                return count(element);
            }
            if (contains(element)) {
                return this.unfiltered.remove(element, occurrences);
            }
            return 0;
        }
    }

    public static int inferDistinctElements(Iterable<?> elements) {
        if (elements instanceof Multiset) {
            return ((Multiset) elements).elementSet().size();
        }
        return 11;
    }

    public static <E> Multiset<E> union(final Multiset<? extends E> multiset1, final Multiset<? extends E> multiset2) {
        Preconditions.checkNotNull(multiset1);
        Preconditions.checkNotNull(multiset2);
        return new ViewMultiset<E>() { // from class: com.google.common.collect.Multisets.1
            public final /* synthetic */ Multiset val$multiset2;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C73321(final Multiset multiset22) {
                super();
                val$multiset2 = multiset22;
            }

            @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
            public boolean contains(@CheckForNull Object element) {
                return val$multiset1.contains(element) || val$multiset2.contains(element);
            }

            @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
            public boolean isEmpty() {
                return val$multiset1.isEmpty() && val$multiset2.isEmpty();
            }

            @Override // com.google.common.collect.Multiset
            public int count(@CheckForNull Object element) {
                return Math.max(val$multiset1.count(element), val$multiset2.count(element));
            }

            @Override // com.google.common.collect.AbstractMultiset
            public Set<E> createElementSet() {
                return Sets.union(val$multiset1.elementSet(), val$multiset2.elementSet());
            }

            @Override // com.google.common.collect.AbstractMultiset
            public Iterator<E> elementIterator() {
                throw new AssertionError("should never be called");
            }

            @Override // com.google.common.collect.AbstractMultiset
            public Iterator<Multiset.Entry<E>> entryIterator() {
                return new AbstractIterator<Multiset.Entry<E>>() { // from class: com.google.common.collect.Multisets.1.1
                    public final /* synthetic */ Iterator val$iterator1;
                    public final /* synthetic */ Iterator val$iterator2;

                    public AnonymousClass1(final Iterator val$iterator1, final Iterator val$iterator2) {
                        val$iterator1 = val$iterator1;
                        val$iterator2 = val$iterator2;
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    @CheckForNull
                    public Multiset.Entry<E> computeNext() {
                        if (val$iterator1.hasNext()) {
                            Multiset.Entry entry = (Multiset.Entry) val$iterator1.next();
                            Object element = entry.getElement();
                            return Multisets.immutableEntry(element, Math.max(entry.getCount(), val$multiset2.count(element)));
                        }
                        while (val$iterator2.hasNext()) {
                            Multiset.Entry entry2 = (Multiset.Entry) val$iterator2.next();
                            Object element2 = entry2.getElement();
                            if (!val$multiset1.contains(element2)) {
                                return Multisets.immutableEntry(element2, entry2.getCount());
                            }
                        }
                        return endOfData();
                    }
                };
            }

            /* renamed from: com.google.common.collect.Multisets$1$1 */
            public class AnonymousClass1 extends AbstractIterator<Multiset.Entry<E>> {
                public final /* synthetic */ Iterator val$iterator1;
                public final /* synthetic */ Iterator val$iterator2;

                public AnonymousClass1(final Iterator val$iterator1, final Iterator val$iterator2) {
                    val$iterator1 = val$iterator1;
                    val$iterator2 = val$iterator2;
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                public Multiset.Entry<E> computeNext() {
                    if (val$iterator1.hasNext()) {
                        Multiset.Entry entry = (Multiset.Entry) val$iterator1.next();
                        Object element = entry.getElement();
                        return Multisets.immutableEntry(element, Math.max(entry.getCount(), val$multiset2.count(element)));
                    }
                    while (val$iterator2.hasNext()) {
                        Multiset.Entry entry2 = (Multiset.Entry) val$iterator2.next();
                        Object element2 = entry2.getElement();
                        if (!val$multiset1.contains(element2)) {
                            return Multisets.immutableEntry(element2, entry2.getCount());
                        }
                    }
                    return endOfData();
                }
            }
        };
    }

    /* renamed from: com.google.common.collect.Multisets$1 */
    /* loaded from: classes8.dex */
    public class C73321<E> extends ViewMultiset<E> {
        public final /* synthetic */ Multiset val$multiset2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C73321(final Multiset multiset22) {
            super();
            val$multiset2 = multiset22;
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public boolean contains(@CheckForNull Object element) {
            return val$multiset1.contains(element) || val$multiset2.contains(element);
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return val$multiset1.isEmpty() && val$multiset2.isEmpty();
        }

        @Override // com.google.common.collect.Multiset
        public int count(@CheckForNull Object element) {
            return Math.max(val$multiset1.count(element), val$multiset2.count(element));
        }

        @Override // com.google.common.collect.AbstractMultiset
        public Set<E> createElementSet() {
            return Sets.union(val$multiset1.elementSet(), val$multiset2.elementSet());
        }

        @Override // com.google.common.collect.AbstractMultiset
        public Iterator<E> elementIterator() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractMultiset
        public Iterator<Multiset.Entry<E>> entryIterator() {
            return new AbstractIterator<Multiset.Entry<E>>() { // from class: com.google.common.collect.Multisets.1.1
                public final /* synthetic */ Iterator val$iterator1;
                public final /* synthetic */ Iterator val$iterator2;

                public AnonymousClass1(final Iterator val$iterator1, final Iterator val$iterator2) {
                    val$iterator1 = val$iterator1;
                    val$iterator2 = val$iterator2;
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                public Multiset.Entry<E> computeNext() {
                    if (val$iterator1.hasNext()) {
                        Multiset.Entry entry = (Multiset.Entry) val$iterator1.next();
                        Object element = entry.getElement();
                        return Multisets.immutableEntry(element, Math.max(entry.getCount(), val$multiset2.count(element)));
                    }
                    while (val$iterator2.hasNext()) {
                        Multiset.Entry entry2 = (Multiset.Entry) val$iterator2.next();
                        Object element2 = entry2.getElement();
                        if (!val$multiset1.contains(element2)) {
                            return Multisets.immutableEntry(element2, entry2.getCount());
                        }
                    }
                    return endOfData();
                }
            };
        }

        /* renamed from: com.google.common.collect.Multisets$1$1 */
        public class AnonymousClass1 extends AbstractIterator<Multiset.Entry<E>> {
            public final /* synthetic */ Iterator val$iterator1;
            public final /* synthetic */ Iterator val$iterator2;

            public AnonymousClass1(final Iterator val$iterator1, final Iterator val$iterator2) {
                val$iterator1 = val$iterator1;
                val$iterator2 = val$iterator2;
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            public Multiset.Entry<E> computeNext() {
                if (val$iterator1.hasNext()) {
                    Multiset.Entry entry = (Multiset.Entry) val$iterator1.next();
                    Object element = entry.getElement();
                    return Multisets.immutableEntry(element, Math.max(entry.getCount(), val$multiset2.count(element)));
                }
                while (val$iterator2.hasNext()) {
                    Multiset.Entry entry2 = (Multiset.Entry) val$iterator2.next();
                    Object element2 = entry2.getElement();
                    if (!val$multiset1.contains(element2)) {
                        return Multisets.immutableEntry(element2, entry2.getCount());
                    }
                }
                return endOfData();
            }
        }
    }

    public static <E> Multiset<E> intersection(final Multiset<E> multiset1, final Multiset<?> multiset2) {
        Preconditions.checkNotNull(multiset1);
        Preconditions.checkNotNull(multiset2);
        return new ViewMultiset<E>() { // from class: com.google.common.collect.Multisets.2
            public final /* synthetic */ Multiset val$multiset2;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C73332(final Multiset multiset22) {
                super();
                val$multiset2 = multiset22;
            }

            @Override // com.google.common.collect.Multiset
            public int count(@CheckForNull Object element) {
                int iCount = val$multiset1.count(element);
                if (iCount == 0) {
                    return 0;
                }
                return Math.min(iCount, val$multiset2.count(element));
            }

            @Override // com.google.common.collect.AbstractMultiset
            public Set<E> createElementSet() {
                return Sets.intersection(val$multiset1.elementSet(), val$multiset2.elementSet());
            }

            @Override // com.google.common.collect.AbstractMultiset
            public Iterator<E> elementIterator() {
                throw new AssertionError("should never be called");
            }

            @Override // com.google.common.collect.AbstractMultiset
            public Iterator<Multiset.Entry<E>> entryIterator() {
                return new AbstractIterator<Multiset.Entry<E>>() { // from class: com.google.common.collect.Multisets.2.1
                    public final /* synthetic */ Iterator val$iterator1;

                    public AnonymousClass1(final Iterator val$iterator1) {
                        val$iterator1 = val$iterator1;
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    @CheckForNull
                    public Multiset.Entry<E> computeNext() {
                        while (val$iterator1.hasNext()) {
                            Multiset.Entry entry = (Multiset.Entry) val$iterator1.next();
                            Object element = entry.getElement();
                            int iMin = Math.min(entry.getCount(), val$multiset2.count(element));
                            if (iMin > 0) {
                                return Multisets.immutableEntry(element, iMin);
                            }
                        }
                        return endOfData();
                    }
                };
            }

            /* renamed from: com.google.common.collect.Multisets$2$1 */
            public class AnonymousClass1 extends AbstractIterator<Multiset.Entry<E>> {
                public final /* synthetic */ Iterator val$iterator1;

                public AnonymousClass1(final Iterator val$iterator1) {
                    val$iterator1 = val$iterator1;
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                public Multiset.Entry<E> computeNext() {
                    while (val$iterator1.hasNext()) {
                        Multiset.Entry entry = (Multiset.Entry) val$iterator1.next();
                        Object element = entry.getElement();
                        int iMin = Math.min(entry.getCount(), val$multiset2.count(element));
                        if (iMin > 0) {
                            return Multisets.immutableEntry(element, iMin);
                        }
                    }
                    return endOfData();
                }
            }
        };
    }

    /* renamed from: com.google.common.collect.Multisets$2 */
    /* loaded from: classes8.dex */
    public class C73332<E> extends ViewMultiset<E> {
        public final /* synthetic */ Multiset val$multiset2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C73332(final Multiset multiset22) {
            super();
            val$multiset2 = multiset22;
        }

        @Override // com.google.common.collect.Multiset
        public int count(@CheckForNull Object element) {
            int iCount = val$multiset1.count(element);
            if (iCount == 0) {
                return 0;
            }
            return Math.min(iCount, val$multiset2.count(element));
        }

        @Override // com.google.common.collect.AbstractMultiset
        public Set<E> createElementSet() {
            return Sets.intersection(val$multiset1.elementSet(), val$multiset2.elementSet());
        }

        @Override // com.google.common.collect.AbstractMultiset
        public Iterator<E> elementIterator() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractMultiset
        public Iterator<Multiset.Entry<E>> entryIterator() {
            return new AbstractIterator<Multiset.Entry<E>>() { // from class: com.google.common.collect.Multisets.2.1
                public final /* synthetic */ Iterator val$iterator1;

                public AnonymousClass1(final Iterator val$iterator1) {
                    val$iterator1 = val$iterator1;
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                public Multiset.Entry<E> computeNext() {
                    while (val$iterator1.hasNext()) {
                        Multiset.Entry entry = (Multiset.Entry) val$iterator1.next();
                        Object element = entry.getElement();
                        int iMin = Math.min(entry.getCount(), val$multiset2.count(element));
                        if (iMin > 0) {
                            return Multisets.immutableEntry(element, iMin);
                        }
                    }
                    return endOfData();
                }
            };
        }

        /* renamed from: com.google.common.collect.Multisets$2$1 */
        public class AnonymousClass1 extends AbstractIterator<Multiset.Entry<E>> {
            public final /* synthetic */ Iterator val$iterator1;

            public AnonymousClass1(final Iterator val$iterator1) {
                val$iterator1 = val$iterator1;
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            public Multiset.Entry<E> computeNext() {
                while (val$iterator1.hasNext()) {
                    Multiset.Entry entry = (Multiset.Entry) val$iterator1.next();
                    Object element = entry.getElement();
                    int iMin = Math.min(entry.getCount(), val$multiset2.count(element));
                    if (iMin > 0) {
                        return Multisets.immutableEntry(element, iMin);
                    }
                }
                return endOfData();
            }
        }
    }

    public static <E> Multiset<E> sum(final Multiset<? extends E> multiset1, final Multiset<? extends E> multiset2) {
        Preconditions.checkNotNull(multiset1);
        Preconditions.checkNotNull(multiset2);
        return new ViewMultiset<E>() { // from class: com.google.common.collect.Multisets.3
            public final /* synthetic */ Multiset val$multiset2;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C73343(final Multiset multiset22) {
                super();
                val$multiset2 = multiset22;
            }

            @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
            public boolean contains(@CheckForNull Object element) {
                return val$multiset1.contains(element) || val$multiset2.contains(element);
            }

            @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
            public boolean isEmpty() {
                return val$multiset1.isEmpty() && val$multiset2.isEmpty();
            }

            @Override // com.google.common.collect.Multisets.ViewMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
            public int size() {
                return IntMath.saturatedAdd(val$multiset1.size(), val$multiset2.size());
            }

            @Override // com.google.common.collect.Multiset
            public int count(@CheckForNull Object element) {
                return val$multiset1.count(element) + val$multiset2.count(element);
            }

            @Override // com.google.common.collect.AbstractMultiset
            public Set<E> createElementSet() {
                return Sets.union(val$multiset1.elementSet(), val$multiset2.elementSet());
            }

            @Override // com.google.common.collect.AbstractMultiset
            public Iterator<E> elementIterator() {
                throw new AssertionError("should never be called");
            }

            @Override // com.google.common.collect.AbstractMultiset
            public Iterator<Multiset.Entry<E>> entryIterator() {
                return new AbstractIterator<Multiset.Entry<E>>() { // from class: com.google.common.collect.Multisets.3.1
                    public final /* synthetic */ Iterator val$iterator1;
                    public final /* synthetic */ Iterator val$iterator2;

                    public AnonymousClass1(final Iterator val$iterator1, final Iterator val$iterator2) {
                        val$iterator1 = val$iterator1;
                        val$iterator2 = val$iterator2;
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    @CheckForNull
                    public Multiset.Entry<E> computeNext() {
                        if (val$iterator1.hasNext()) {
                            Multiset.Entry entry = (Multiset.Entry) val$iterator1.next();
                            Object element = entry.getElement();
                            return Multisets.immutableEntry(element, entry.getCount() + val$multiset2.count(element));
                        }
                        while (val$iterator2.hasNext()) {
                            Multiset.Entry entry2 = (Multiset.Entry) val$iterator2.next();
                            Object element2 = entry2.getElement();
                            if (!val$multiset1.contains(element2)) {
                                return Multisets.immutableEntry(element2, entry2.getCount());
                            }
                        }
                        return endOfData();
                    }
                };
            }

            /* renamed from: com.google.common.collect.Multisets$3$1 */
            public class AnonymousClass1 extends AbstractIterator<Multiset.Entry<E>> {
                public final /* synthetic */ Iterator val$iterator1;
                public final /* synthetic */ Iterator val$iterator2;

                public AnonymousClass1(final Iterator val$iterator1, final Iterator val$iterator2) {
                    val$iterator1 = val$iterator1;
                    val$iterator2 = val$iterator2;
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                public Multiset.Entry<E> computeNext() {
                    if (val$iterator1.hasNext()) {
                        Multiset.Entry entry = (Multiset.Entry) val$iterator1.next();
                        Object element = entry.getElement();
                        return Multisets.immutableEntry(element, entry.getCount() + val$multiset2.count(element));
                    }
                    while (val$iterator2.hasNext()) {
                        Multiset.Entry entry2 = (Multiset.Entry) val$iterator2.next();
                        Object element2 = entry2.getElement();
                        if (!val$multiset1.contains(element2)) {
                            return Multisets.immutableEntry(element2, entry2.getCount());
                        }
                    }
                    return endOfData();
                }
            }
        };
    }

    /* renamed from: com.google.common.collect.Multisets$3 */
    /* loaded from: classes8.dex */
    public class C73343<E> extends ViewMultiset<E> {
        public final /* synthetic */ Multiset val$multiset2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C73343(final Multiset multiset22) {
            super();
            val$multiset2 = multiset22;
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public boolean contains(@CheckForNull Object element) {
            return val$multiset1.contains(element) || val$multiset2.contains(element);
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return val$multiset1.isEmpty() && val$multiset2.isEmpty();
        }

        @Override // com.google.common.collect.Multisets.ViewMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public int size() {
            return IntMath.saturatedAdd(val$multiset1.size(), val$multiset2.size());
        }

        @Override // com.google.common.collect.Multiset
        public int count(@CheckForNull Object element) {
            return val$multiset1.count(element) + val$multiset2.count(element);
        }

        @Override // com.google.common.collect.AbstractMultiset
        public Set<E> createElementSet() {
            return Sets.union(val$multiset1.elementSet(), val$multiset2.elementSet());
        }

        @Override // com.google.common.collect.AbstractMultiset
        public Iterator<E> elementIterator() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractMultiset
        public Iterator<Multiset.Entry<E>> entryIterator() {
            return new AbstractIterator<Multiset.Entry<E>>() { // from class: com.google.common.collect.Multisets.3.1
                public final /* synthetic */ Iterator val$iterator1;
                public final /* synthetic */ Iterator val$iterator2;

                public AnonymousClass1(final Iterator val$iterator1, final Iterator val$iterator2) {
                    val$iterator1 = val$iterator1;
                    val$iterator2 = val$iterator2;
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                public Multiset.Entry<E> computeNext() {
                    if (val$iterator1.hasNext()) {
                        Multiset.Entry entry = (Multiset.Entry) val$iterator1.next();
                        Object element = entry.getElement();
                        return Multisets.immutableEntry(element, entry.getCount() + val$multiset2.count(element));
                    }
                    while (val$iterator2.hasNext()) {
                        Multiset.Entry entry2 = (Multiset.Entry) val$iterator2.next();
                        Object element2 = entry2.getElement();
                        if (!val$multiset1.contains(element2)) {
                            return Multisets.immutableEntry(element2, entry2.getCount());
                        }
                    }
                    return endOfData();
                }
            };
        }

        /* renamed from: com.google.common.collect.Multisets$3$1 */
        public class AnonymousClass1 extends AbstractIterator<Multiset.Entry<E>> {
            public final /* synthetic */ Iterator val$iterator1;
            public final /* synthetic */ Iterator val$iterator2;

            public AnonymousClass1(final Iterator val$iterator1, final Iterator val$iterator2) {
                val$iterator1 = val$iterator1;
                val$iterator2 = val$iterator2;
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            public Multiset.Entry<E> computeNext() {
                if (val$iterator1.hasNext()) {
                    Multiset.Entry entry = (Multiset.Entry) val$iterator1.next();
                    Object element = entry.getElement();
                    return Multisets.immutableEntry(element, entry.getCount() + val$multiset2.count(element));
                }
                while (val$iterator2.hasNext()) {
                    Multiset.Entry entry2 = (Multiset.Entry) val$iterator2.next();
                    Object element2 = entry2.getElement();
                    if (!val$multiset1.contains(element2)) {
                        return Multisets.immutableEntry(element2, entry2.getCount());
                    }
                }
                return endOfData();
            }
        }
    }

    public static <E> Multiset<E> difference(final Multiset<E> multiset1, final Multiset<?> multiset2) {
        Preconditions.checkNotNull(multiset1);
        Preconditions.checkNotNull(multiset2);
        return new ViewMultiset<E>() { // from class: com.google.common.collect.Multisets.4
            public final /* synthetic */ Multiset val$multiset2;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C73354(final Multiset multiset22) {
                super();
                val$multiset2 = multiset22;
            }

            @Override // com.google.common.collect.Multiset
            public int count(@CheckForNull Object element) {
                int iCount = val$multiset1.count(element);
                if (iCount == 0) {
                    return 0;
                }
                return Math.max(0, iCount - val$multiset2.count(element));
            }

            @Override // com.google.common.collect.Multisets.ViewMultiset, com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
            public void clear() {
                throw new UnsupportedOperationException();
            }

            /* renamed from: com.google.common.collect.Multisets$4$1 */
            public class AnonymousClass1 extends AbstractIterator<E> {
                public final /* synthetic */ Iterator val$iterator1;

                public AnonymousClass1(final Iterator val$iterator1) {
                    val$iterator1 = val$iterator1;
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                public E computeNext() {
                    while (val$iterator1.hasNext()) {
                        Multiset.Entry entry = (Multiset.Entry) val$iterator1.next();
                        E e = (E) entry.getElement();
                        if (entry.getCount() > val$multiset2.count(e)) {
                            return e;
                        }
                    }
                    return endOfData();
                }
            }

            @Override // com.google.common.collect.AbstractMultiset
            public Iterator<E> elementIterator() {
                return new AbstractIterator<E>() { // from class: com.google.common.collect.Multisets.4.1
                    public final /* synthetic */ Iterator val$iterator1;

                    public AnonymousClass1(final Iterator val$iterator1) {
                        val$iterator1 = val$iterator1;
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    @CheckForNull
                    public E computeNext() {
                        while (val$iterator1.hasNext()) {
                            Multiset.Entry entry = (Multiset.Entry) val$iterator1.next();
                            E e = (E) entry.getElement();
                            if (entry.getCount() > val$multiset2.count(e)) {
                                return e;
                            }
                        }
                        return endOfData();
                    }
                };
            }

            /* renamed from: com.google.common.collect.Multisets$4$2 */
            public class AnonymousClass2 extends AbstractIterator<Multiset.Entry<E>> {
                public final /* synthetic */ Iterator val$iterator1;

                public AnonymousClass2(final Iterator val$iterator1) {
                    val$iterator1 = val$iterator1;
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                public Multiset.Entry<E> computeNext() {
                    while (val$iterator1.hasNext()) {
                        Multiset.Entry entry = (Multiset.Entry) val$iterator1.next();
                        Object element = entry.getElement();
                        int count = entry.getCount() - val$multiset2.count(element);
                        if (count > 0) {
                            return Multisets.immutableEntry(element, count);
                        }
                    }
                    return endOfData();
                }
            }

            @Override // com.google.common.collect.AbstractMultiset
            public Iterator<Multiset.Entry<E>> entryIterator() {
                return new AbstractIterator<Multiset.Entry<E>>() { // from class: com.google.common.collect.Multisets.4.2
                    public final /* synthetic */ Iterator val$iterator1;

                    public AnonymousClass2(final Iterator val$iterator1) {
                        val$iterator1 = val$iterator1;
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    @CheckForNull
                    public Multiset.Entry<E> computeNext() {
                        while (val$iterator1.hasNext()) {
                            Multiset.Entry entry = (Multiset.Entry) val$iterator1.next();
                            Object element = entry.getElement();
                            int count = entry.getCount() - val$multiset2.count(element);
                            if (count > 0) {
                                return Multisets.immutableEntry(element, count);
                            }
                        }
                        return endOfData();
                    }
                };
            }

            @Override // com.google.common.collect.Multisets.ViewMultiset, com.google.common.collect.AbstractMultiset
            public int distinctElements() {
                return Iterators.size(entryIterator());
            }
        };
    }

    /* renamed from: com.google.common.collect.Multisets$4 */
    /* loaded from: classes8.dex */
    public class C73354<E> extends ViewMultiset<E> {
        public final /* synthetic */ Multiset val$multiset2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C73354(final Multiset multiset22) {
            super();
            val$multiset2 = multiset22;
        }

        @Override // com.google.common.collect.Multiset
        public int count(@CheckForNull Object element) {
            int iCount = val$multiset1.count(element);
            if (iCount == 0) {
                return 0;
            }
            return Math.max(0, iCount - val$multiset2.count(element));
        }

        @Override // com.google.common.collect.Multisets.ViewMultiset, com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: com.google.common.collect.Multisets$4$1 */
        public class AnonymousClass1 extends AbstractIterator<E> {
            public final /* synthetic */ Iterator val$iterator1;

            public AnonymousClass1(final Iterator val$iterator1) {
                val$iterator1 = val$iterator1;
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            public E computeNext() {
                while (val$iterator1.hasNext()) {
                    Multiset.Entry entry = (Multiset.Entry) val$iterator1.next();
                    E e = (E) entry.getElement();
                    if (entry.getCount() > val$multiset2.count(e)) {
                        return e;
                    }
                }
                return endOfData();
            }
        }

        @Override // com.google.common.collect.AbstractMultiset
        public Iterator<E> elementIterator() {
            return new AbstractIterator<E>() { // from class: com.google.common.collect.Multisets.4.1
                public final /* synthetic */ Iterator val$iterator1;

                public AnonymousClass1(final Iterator val$iterator1) {
                    val$iterator1 = val$iterator1;
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                public E computeNext() {
                    while (val$iterator1.hasNext()) {
                        Multiset.Entry entry = (Multiset.Entry) val$iterator1.next();
                        E e = (E) entry.getElement();
                        if (entry.getCount() > val$multiset2.count(e)) {
                            return e;
                        }
                    }
                    return endOfData();
                }
            };
        }

        /* renamed from: com.google.common.collect.Multisets$4$2 */
        public class AnonymousClass2 extends AbstractIterator<Multiset.Entry<E>> {
            public final /* synthetic */ Iterator val$iterator1;

            public AnonymousClass2(final Iterator val$iterator1) {
                val$iterator1 = val$iterator1;
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            public Multiset.Entry<E> computeNext() {
                while (val$iterator1.hasNext()) {
                    Multiset.Entry entry = (Multiset.Entry) val$iterator1.next();
                    Object element = entry.getElement();
                    int count = entry.getCount() - val$multiset2.count(element);
                    if (count > 0) {
                        return Multisets.immutableEntry(element, count);
                    }
                }
                return endOfData();
            }
        }

        @Override // com.google.common.collect.AbstractMultiset
        public Iterator<Multiset.Entry<E>> entryIterator() {
            return new AbstractIterator<Multiset.Entry<E>>() { // from class: com.google.common.collect.Multisets.4.2
                public final /* synthetic */ Iterator val$iterator1;

                public AnonymousClass2(final Iterator val$iterator1) {
                    val$iterator1 = val$iterator1;
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                public Multiset.Entry<E> computeNext() {
                    while (val$iterator1.hasNext()) {
                        Multiset.Entry entry = (Multiset.Entry) val$iterator1.next();
                        Object element = entry.getElement();
                        int count = entry.getCount() - val$multiset2.count(element);
                        if (count > 0) {
                            return Multisets.immutableEntry(element, count);
                        }
                    }
                    return endOfData();
                }
            };
        }

        @Override // com.google.common.collect.Multisets.ViewMultiset, com.google.common.collect.AbstractMultiset
        public int distinctElements() {
            return Iterators.size(entryIterator());
        }
    }

    @CanIgnoreReturnValue
    public static boolean containsOccurrences(Multiset<?> superMultiset, Multiset<?> subMultiset) {
        Preconditions.checkNotNull(superMultiset);
        Preconditions.checkNotNull(subMultiset);
        for (Multiset.Entry<?> entry : subMultiset.entrySet()) {
            if (superMultiset.count(entry.getElement()) < entry.getCount()) {
                return false;
            }
        }
        return true;
    }

    @CanIgnoreReturnValue
    public static boolean retainOccurrences(Multiset<?> multisetToModify, Multiset<?> multisetToRetain) {
        return retainOccurrencesImpl(multisetToModify, multisetToRetain);
    }

    public static <E> boolean retainOccurrencesImpl(Multiset<E> multisetToModify, Multiset<?> occurrencesToRetain) {
        Preconditions.checkNotNull(multisetToModify);
        Preconditions.checkNotNull(occurrencesToRetain);
        Iterator<Multiset.Entry<E>> it = multisetToModify.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Multiset.Entry<E> next = it.next();
            int iCount = occurrencesToRetain.count(next.getElement());
            if (iCount == 0) {
                it.remove();
            } else if (iCount < next.getCount()) {
                multisetToModify.setCount(next.getElement(), iCount);
            }
            z = true;
        }
        return z;
    }

    @CanIgnoreReturnValue
    public static boolean removeOccurrences(Multiset<?> multisetToModify, Iterable<?> occurrencesToRemove) {
        if (occurrencesToRemove instanceof Multiset) {
            return removeOccurrences(multisetToModify, (Multiset<?>) occurrencesToRemove);
        }
        Preconditions.checkNotNull(multisetToModify);
        Preconditions.checkNotNull(occurrencesToRemove);
        Iterator<?> it = occurrencesToRemove.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= multisetToModify.remove(it.next());
        }
        return zRemove;
    }

    @CanIgnoreReturnValue
    public static boolean removeOccurrences(Multiset<?> multisetToModify, Multiset<?> occurrencesToRemove) {
        Preconditions.checkNotNull(multisetToModify);
        Preconditions.checkNotNull(occurrencesToRemove);
        Iterator<Multiset.Entry<?>> it = multisetToModify.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Multiset.Entry<?> next = it.next();
            int iCount = occurrencesToRemove.count(next.getElement());
            if (iCount >= next.getCount()) {
                it.remove();
            } else if (iCount > 0) {
                multisetToModify.remove(next.getElement(), iCount);
            }
            z = true;
        }
        return z;
    }

    /* loaded from: classes7.dex */
    public static abstract class AbstractEntry<E> implements Multiset.Entry<E> {
        @Override // com.google.common.collect.Multiset.Entry
        public boolean equals(@CheckForNull Object object) {
            if (!(object instanceof Multiset.Entry)) {
                return false;
            }
            Multiset.Entry entry = (Multiset.Entry) object;
            return getCount() == entry.getCount() && Objects.equal(getElement(), entry.getElement());
        }

        @Override // com.google.common.collect.Multiset.Entry
        public int hashCode() {
            E element = getElement();
            return (element == null ? 0 : element.hashCode()) ^ getCount();
        }

        @Override // com.google.common.collect.Multiset.Entry
        public String toString() {
            String strValueOf = String.valueOf(getElement());
            int count = getCount();
            if (count == 1) {
                return strValueOf;
            }
            return strValueOf + " x " + count;
        }
    }

    public static boolean equalsImpl(Multiset<?> multiset, @CheckForNull Object object) {
        if (object == multiset) {
            return true;
        }
        if (object instanceof Multiset) {
            Multiset multiset2 = (Multiset) object;
            if (multiset.size() == multiset2.size() && multiset.entrySet().size() == multiset2.entrySet().size()) {
                for (Multiset.Entry entry : multiset2.entrySet()) {
                    if (multiset.count(entry.getElement()) != entry.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static <E> boolean addAllImpl(Multiset<E> self, Collection<? extends E> elements) {
        Preconditions.checkNotNull(self);
        Preconditions.checkNotNull(elements);
        if (elements instanceof Multiset) {
            return addAllImpl((Multiset) self, cast(elements));
        }
        if (elements.isEmpty()) {
            return false;
        }
        return Iterators.addAll(self, elements.iterator());
    }

    public static <E> boolean addAllImpl(Multiset<E> self, Multiset<? extends E> elements) {
        if (elements instanceof AbstractMapBasedMultiset) {
            return addAllImpl((Multiset) self, (AbstractMapBasedMultiset) elements);
        }
        if (elements.isEmpty()) {
            return false;
        }
        for (Multiset.Entry<? extends E> entry : elements.entrySet()) {
            self.add(entry.getElement(), entry.getCount());
        }
        return true;
    }

    public static <E> boolean addAllImpl(Multiset<E> self, AbstractMapBasedMultiset<? extends E> elements) {
        if (elements.isEmpty()) {
            return false;
        }
        elements.addTo(self);
        return true;
    }

    public static boolean removeAllImpl(Multiset<?> self, Collection<?> elementsToRemove) {
        if (elementsToRemove instanceof Multiset) {
            elementsToRemove = ((Multiset) elementsToRemove).elementSet();
        }
        return self.elementSet().removeAll(elementsToRemove);
    }

    public static boolean retainAllImpl(Multiset<?> self, Collection<?> elementsToRetain) {
        Preconditions.checkNotNull(elementsToRetain);
        if (elementsToRetain instanceof Multiset) {
            elementsToRetain = ((Multiset) elementsToRetain).elementSet();
        }
        return self.elementSet().retainAll(elementsToRetain);
    }

    public static <E> int setCountImpl(Multiset<E> self, @ParametricNullness E element, int count) {
        CollectPreconditions.checkNonnegative(count, CatchStreamerKeys.COUNT_KEY);
        int iCount = self.count(element);
        int i = count - iCount;
        if (i > 0) {
            self.add(element, i);
        } else if (i < 0) {
            self.remove(element, -i);
        }
        return iCount;
    }

    public static <E> boolean setCountImpl(Multiset<E> self, @ParametricNullness E element, int oldCount, int newCount) {
        CollectPreconditions.checkNonnegative(oldCount, "oldCount");
        CollectPreconditions.checkNonnegative(newCount, "newCount");
        if (self.count(element) != oldCount) {
            return false;
        }
        self.setCount(element, newCount);
        return true;
    }

    /* renamed from: com.google.common.collect.Multisets$5 */
    /* loaded from: classes7.dex */
    public class C73365<E> extends TransformedIterator<Multiset.Entry<E>, E> {
        public C73365(Iterator backingIterator) {
            super(backingIterator);
        }

        @Override // com.google.common.collect.TransformedIterator
        @ParametricNullness
        public E transform(Multiset.Entry<E> entry) {
            return entry.getElement();
        }
    }

    public static <E> Iterator<E> elementIterator(Iterator<Multiset.Entry<E>> entryIterator) {
        return new TransformedIterator<Multiset.Entry<E>, E>(entryIterator) { // from class: com.google.common.collect.Multisets.5
            public C73365(Iterator entryIterator2) {
                super(entryIterator2);
            }

            @Override // com.google.common.collect.TransformedIterator
            @ParametricNullness
            public E transform(Multiset.Entry<E> entry) {
                return entry.getElement();
            }
        };
    }

    /* loaded from: classes7.dex */
    public static abstract class ElementSet<E> extends Sets.ImprovedAbstractSet<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public abstract Iterator<E> iterator();

        public abstract Multiset<E> multiset();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            multiset().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object o) {
            return multiset().contains(o);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> c) {
            return multiset().containsAll(c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return multiset().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object o) {
            return multiset().remove(o, Integer.MAX_VALUE) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return multiset().entrySet().size();
        }
    }

    /* loaded from: classes7.dex */
    public static abstract class EntrySet<E> extends Sets.ImprovedAbstractSet<Multiset.Entry<E>> {
        public abstract Multiset<E> multiset();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object o) {
            if (!(o instanceof Multiset.Entry)) {
                return false;
            }
            Multiset.Entry entry = (Multiset.Entry) o;
            return entry.getCount() > 0 && multiset().count(entry.getElement()) == entry.getCount();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            if (obj instanceof Multiset.Entry) {
                Multiset.Entry entry = (Multiset.Entry) obj;
                Object element = entry.getElement();
                int count = entry.getCount();
                if (count != 0) {
                    return multiset().setCount(element, count, 0);
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            multiset().clear();
        }
    }

    public static <E> Iterator<E> iteratorImpl(Multiset<E> multiset) {
        return new MultisetIteratorImpl(multiset, multiset.entrySet().iterator());
    }

    public static final class MultisetIteratorImpl<E> implements Iterator<E> {
        public boolean canRemove;

        @CheckForNull
        public Multiset.Entry<E> currentEntry;
        public final Iterator<Multiset.Entry<E>> entryIterator;
        public int laterCount;
        public final Multiset<E> multiset;
        public int totalCount;

        public MultisetIteratorImpl(Multiset<E> multiset, Iterator<Multiset.Entry<E>> entryIterator) {
            this.multiset = multiset;
            this.entryIterator = entryIterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.laterCount > 0 || this.entryIterator.hasNext();
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            if (this.laterCount == 0) {
                Multiset.Entry<E> next = this.entryIterator.next();
                this.currentEntry = next;
                int count = next.getCount();
                this.laterCount = count;
                this.totalCount = count;
            }
            this.laterCount--;
            this.canRemove = true;
            Multiset.Entry<E> entry = this.currentEntry;
            java.util.Objects.requireNonNull(entry);
            return entry.getElement();
        }

        @Override // java.util.Iterator
        public void remove() {
            CollectPreconditions.checkRemove(this.canRemove);
            if (this.totalCount == 1) {
                this.entryIterator.remove();
            } else {
                Multiset<E> multiset = this.multiset;
                Multiset.Entry<E> entry = this.currentEntry;
                java.util.Objects.requireNonNull(entry);
                multiset.remove(entry.getElement());
            }
            this.totalCount--;
            this.canRemove = false;
        }
    }

    public static int linearTimeSizeImpl(Multiset<?> multiset) {
        long count = 0;
        while (multiset.entrySet().iterator().hasNext()) {
            count += r4.next().getCount();
        }
        return Ints.saturatedCast(count);
    }

    public static <T> Multiset<T> cast(Iterable<T> iterable) {
        return (Multiset) iterable;
    }

    public static <E> ImmutableMultiset<E> copyHighestCountFirst(Multiset<E> multiset) {
        Multiset.Entry[] entryArr = (Multiset.Entry[]) multiset.entrySet().toArray(new Multiset.Entry[0]);
        Arrays.sort(entryArr, DecreasingCount.INSTANCE);
        return ImmutableMultiset.copyFromEntries(Arrays.asList(entryArr));
    }

    public static final class DecreasingCount implements Comparator<Multiset.Entry<?>> {
        public static final DecreasingCount INSTANCE = new DecreasingCount();

        @Override // java.util.Comparator
        public int compare(Multiset.Entry<?> entry1, Multiset.Entry<?> entry2) {
            return entry2.getCount() - entry1.getCount();
        }
    }

    /* loaded from: classes8.dex */
    public static abstract class ViewMultiset<E> extends AbstractMultiset<E> {
        public ViewMultiset() {
        }

        public /* synthetic */ ViewMultiset(C73321 c73321) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public int size() {
            return Multisets.linearTimeSizeImpl(this);
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            elementSet().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
        public Iterator<E> iterator() {
            return Multisets.iteratorImpl(this);
        }

        @Override // com.google.common.collect.AbstractMultiset
        public int distinctElements() {
            return elementSet().size();
        }
    }
}
