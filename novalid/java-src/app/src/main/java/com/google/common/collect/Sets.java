package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.math.IntMath;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.annotation.CheckForNull;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class Sets {

    public static abstract class ImprovedAbstractSet<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> c) {
            return Sets.removeAllImpl(this, c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> c) {
            return super.retainAll((Collection) Preconditions.checkNotNull(c));
        }
    }

    @GwtCompatible(serializable = true)
    public static <E extends Enum<E>> ImmutableSet<E> immutableEnumSet(E anElement, E... otherElements) {
        return ImmutableEnumSet.asImmutable(EnumSet.of((Enum) anElement, (Enum[]) otherElements));
    }

    @GwtCompatible(serializable = true)
    public static <E extends Enum<E>> ImmutableSet<E> immutableEnumSet(Iterable<E> elements) {
        if (elements instanceof ImmutableEnumSet) {
            return (ImmutableEnumSet) elements;
        }
        if (elements instanceof Collection) {
            Collection collection = (Collection) elements;
            if (collection.isEmpty()) {
                return ImmutableSet.m1218of();
            }
            return ImmutableEnumSet.asImmutable(EnumSet.copyOf(collection));
        }
        Iterator<E> it = elements.iterator();
        if (it.hasNext()) {
            EnumSet enumSetOf = EnumSet.of((Enum) it.next());
            Iterators.addAll(enumSetOf, it);
            return ImmutableEnumSet.asImmutable(enumSetOf);
        }
        return ImmutableSet.m1218of();
    }

    public static <E extends Enum<E>> EnumSet<E> newEnumSet(Iterable<E> iterable, Class<E> elementType) {
        EnumSet<E> enumSetNoneOf = EnumSet.noneOf(elementType);
        Iterables.addAll(enumSetNoneOf, iterable);
        return enumSetNoneOf;
    }

    public static <E> HashSet<E> newHashSet() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> newHashSet(E... elements) {
        HashSet<E> hashSetNewHashSetWithExpectedSize = newHashSetWithExpectedSize(elements.length);
        Collections.addAll(hashSetNewHashSetWithExpectedSize, elements);
        return hashSetNewHashSetWithExpectedSize;
    }

    public static <E> HashSet<E> newHashSet(Iterable<? extends E> elements) {
        if (elements instanceof Collection) {
            return new HashSet<>((Collection) elements);
        }
        return newHashSet(elements.iterator());
    }

    public static <E> HashSet<E> newHashSet(Iterator<? extends E> elements) {
        HashSet<E> hashSetNewHashSet = newHashSet();
        Iterators.addAll(hashSetNewHashSet, elements);
        return hashSetNewHashSet;
    }

    public static <E> HashSet<E> newHashSetWithExpectedSize(int expectedSize) {
        return new HashSet<>(Maps.capacity(expectedSize));
    }

    public static <E> Set<E> newConcurrentHashSet() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static <E> Set<E> newConcurrentHashSet(Iterable<? extends E> elements) {
        Set<E> setNewConcurrentHashSet = newConcurrentHashSet();
        Iterables.addAll(setNewConcurrentHashSet, elements);
        return setNewConcurrentHashSet;
    }

    public static <E> LinkedHashSet<E> newLinkedHashSet() {
        return new LinkedHashSet<>();
    }

    public static <E> LinkedHashSet<E> newLinkedHashSet(Iterable<? extends E> elements) {
        if (elements instanceof Collection) {
            return new LinkedHashSet<>((Collection) elements);
        }
        LinkedHashSet<E> linkedHashSetNewLinkedHashSet = newLinkedHashSet();
        Iterables.addAll(linkedHashSetNewLinkedHashSet, elements);
        return linkedHashSetNewLinkedHashSet;
    }

    public static <E> LinkedHashSet<E> newLinkedHashSetWithExpectedSize(int expectedSize) {
        return new LinkedHashSet<>(Maps.capacity(expectedSize));
    }

    public static <E extends Comparable> TreeSet<E> newTreeSet() {
        return new TreeSet<>();
    }

    public static <E extends Comparable> TreeSet<E> newTreeSet(Iterable<? extends E> elements) {
        TreeSet<E> treeSetNewTreeSet = newTreeSet();
        Iterables.addAll(treeSetNewTreeSet, elements);
        return treeSetNewTreeSet;
    }

    public static <E> TreeSet<E> newTreeSet(Comparator<? super E> comparator) {
        return new TreeSet<>((Comparator) Preconditions.checkNotNull(comparator));
    }

    public static <E> Set<E> newIdentityHashSet() {
        return Collections.newSetFromMap(Maps.newIdentityHashMap());
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <E> CopyOnWriteArraySet<E> newCopyOnWriteArraySet() {
        return new CopyOnWriteArraySet<>();
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <E> CopyOnWriteArraySet<E> newCopyOnWriteArraySet(Iterable<? extends E> elements) {
        Collection collectionNewArrayList;
        if (elements instanceof Collection) {
            collectionNewArrayList = (Collection) elements;
        } else {
            collectionNewArrayList = Lists.newArrayList(elements);
        }
        return new CopyOnWriteArraySet<>(collectionNewArrayList);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <E extends Enum<E>> EnumSet<E> complementOf(Collection<E> collection) {
        if (collection instanceof EnumSet) {
            return EnumSet.complementOf((EnumSet) collection);
        }
        Preconditions.checkArgument(!collection.isEmpty(), "collection is empty; use the other version of this method");
        return makeComplementByHand(collection, collection.iterator().next().getDeclaringClass());
    }

    @GwtIncompatible
    public static <E extends Enum<E>> EnumSet<E> complementOf(Collection<E> collection, Class<E> type) {
        Preconditions.checkNotNull(collection);
        if (collection instanceof EnumSet) {
            return EnumSet.complementOf((EnumSet) collection);
        }
        return makeComplementByHand(collection, type);
    }

    @GwtIncompatible
    public static <E extends Enum<E>> EnumSet<E> makeComplementByHand(Collection<E> collection, Class<E> type) {
        EnumSet<E> enumSetAllOf = EnumSet.allOf(type);
        enumSetAllOf.removeAll(collection);
        return enumSetAllOf;
    }

    @Deprecated
    public static <E> Set<E> newSetFromMap(Map<E, Boolean> map) {
        return Collections.newSetFromMap(map);
    }

    public static abstract class SetView<E> extends AbstractSet<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public abstract UnmodifiableIterator<E> iterator();

        public /* synthetic */ SetView(C73481 c73481) {
            this();
        }

        public SetView() {
        }

        public ImmutableSet<E> immutableCopy() {
            return ImmutableSet.copyOf((Collection) this);
        }

        @CanIgnoreReturnValue
        public <S extends Set<E>> S copyInto(S set) {
            set.addAll(this);
            return set;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        @CanIgnoreReturnValue
        public final boolean add(@ParametricNullness E e) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean remove(@CheckForNull Object object) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        @CanIgnoreReturnValue
        public final boolean addAll(Collection<? extends E> newElements) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        @CanIgnoreReturnValue
        public final boolean removeAll(Collection<?> oldElements) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        @CanIgnoreReturnValue
        public final boolean retainAll(Collection<?> elementsToKeep) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }
    }

    public static <E> SetView<E> union(final Set<? extends E> set1, final Set<? extends E> set2) {
        Preconditions.checkNotNull(set1, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return new SetView<E>() { // from class: com.google.common.collect.Sets.1
            public final /* synthetic */ Set val$set1;
            public final /* synthetic */ Set val$set2;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C73481(final Set set12, final Set set22) {
                super();
                val$set1 = set12;
                val$set2 = set22;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                int size = val$set1.size();
                Iterator<E> it = val$set2.iterator();
                while (it.hasNext()) {
                    if (!val$set1.contains(it.next())) {
                        size++;
                    }
                }
                return size;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                return val$set1.isEmpty() && val$set2.isEmpty();
            }

            /* renamed from: com.google.common.collect.Sets$1$1 */
            /* loaded from: classes8.dex */
            public class AnonymousClass1 extends AbstractIterator<E> {
                public final Iterator<? extends E> itr1;
                public final Iterator<? extends E> itr2;

                public AnonymousClass1() {
                    this.itr1 = val$set1.iterator();
                    this.itr2 = val$set2.iterator();
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                public E computeNext() {
                    if (this.itr1.hasNext()) {
                        return this.itr1.next();
                    }
                    while (this.itr2.hasNext()) {
                        E next = this.itr2.next();
                        if (!val$set1.contains(next)) {
                            return next;
                        }
                    }
                    return endOfData();
                }
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<E> iterator() {
                return new AbstractIterator<E>() { // from class: com.google.common.collect.Sets.1.1
                    public final Iterator<? extends E> itr1;
                    public final Iterator<? extends E> itr2;

                    public AnonymousClass1() {
                        this.itr1 = val$set1.iterator();
                        this.itr2 = val$set2.iterator();
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    @CheckForNull
                    public E computeNext() {
                        if (this.itr1.hasNext()) {
                            return this.itr1.next();
                        }
                        while (this.itr2.hasNext()) {
                            E next = this.itr2.next();
                            if (!val$set1.contains(next)) {
                                return next;
                            }
                        }
                        return endOfData();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object object) {
                return val$set1.contains(object) || val$set2.contains(object);
            }

            @Override // com.google.common.collect.Sets.SetView
            public <S extends Set<E>> S copyInto(S set) {
                set.addAll(val$set1);
                set.addAll(val$set2);
                return set;
            }

            @Override // com.google.common.collect.Sets.SetView
            public ImmutableSet<E> immutableCopy() {
                return new ImmutableSet.Builder().addAll((Iterable) val$set1).addAll((Iterable) val$set2).build();
            }
        };
    }

    /* renamed from: com.google.common.collect.Sets$1 */
    /* loaded from: classes7.dex */
    public class C73481<E> extends SetView<E> {
        public final /* synthetic */ Set val$set1;
        public final /* synthetic */ Set val$set2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C73481(final Set set12, final Set set22) {
            super();
            val$set1 = set12;
            val$set2 = set22;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = val$set1.size();
            Iterator<E> it = val$set2.iterator();
            while (it.hasNext()) {
                if (!val$set1.contains(it.next())) {
                    size++;
                }
            }
            return size;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return val$set1.isEmpty() && val$set2.isEmpty();
        }

        /* renamed from: com.google.common.collect.Sets$1$1 */
        /* loaded from: classes8.dex */
        public class AnonymousClass1 extends AbstractIterator<E> {
            public final Iterator<? extends E> itr1;
            public final Iterator<? extends E> itr2;

            public AnonymousClass1() {
                this.itr1 = val$set1.iterator();
                this.itr2 = val$set2.iterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            public E computeNext() {
                if (this.itr1.hasNext()) {
                    return this.itr1.next();
                }
                while (this.itr2.hasNext()) {
                    E next = this.itr2.next();
                    if (!val$set1.contains(next)) {
                        return next;
                    }
                }
                return endOfData();
            }
        }

        @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<E> iterator() {
            return new AbstractIterator<E>() { // from class: com.google.common.collect.Sets.1.1
                public final Iterator<? extends E> itr1;
                public final Iterator<? extends E> itr2;

                public AnonymousClass1() {
                    this.itr1 = val$set1.iterator();
                    this.itr2 = val$set2.iterator();
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                public E computeNext() {
                    if (this.itr1.hasNext()) {
                        return this.itr1.next();
                    }
                    while (this.itr2.hasNext()) {
                        E next = this.itr2.next();
                        if (!val$set1.contains(next)) {
                            return next;
                        }
                    }
                    return endOfData();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object object) {
            return val$set1.contains(object) || val$set2.contains(object);
        }

        @Override // com.google.common.collect.Sets.SetView
        public <S extends Set<E>> S copyInto(S set) {
            set.addAll(val$set1);
            set.addAll(val$set2);
            return set;
        }

        @Override // com.google.common.collect.Sets.SetView
        public ImmutableSet<E> immutableCopy() {
            return new ImmutableSet.Builder().addAll((Iterable) val$set1).addAll((Iterable) val$set2).build();
        }
    }

    public static <E> SetView<E> intersection(final Set<E> set1, final Set<?> set2) {
        Preconditions.checkNotNull(set1, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return new SetView<E>() { // from class: com.google.common.collect.Sets.2
            public final /* synthetic */ Set val$set1;
            public final /* synthetic */ Set val$set2;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C73492(final Set set12, final Set set22) {
                super();
                val$set1 = set12;
                val$set2 = set22;
            }

            /* renamed from: com.google.common.collect.Sets$2$1 */
            /* loaded from: classes8.dex */
            public class AnonymousClass1 extends AbstractIterator<E> {
                public final Iterator<E> itr;

                public AnonymousClass1() {
                    this.itr = val$set1.iterator();
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                public E computeNext() {
                    while (this.itr.hasNext()) {
                        E next = this.itr.next();
                        if (val$set2.contains(next)) {
                            return next;
                        }
                    }
                    return endOfData();
                }
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<E> iterator() {
                return new AbstractIterator<E>() { // from class: com.google.common.collect.Sets.2.1
                    public final Iterator<E> itr;

                    public AnonymousClass1() {
                        this.itr = val$set1.iterator();
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    @CheckForNull
                    public E computeNext() {
                        while (this.itr.hasNext()) {
                            E next = this.itr.next();
                            if (val$set2.contains(next)) {
                                return next;
                            }
                        }
                        return endOfData();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                Iterator<E> it = val$set1.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (val$set2.contains(it.next())) {
                        i++;
                    }
                }
                return i;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                return Collections.disjoint(val$set2, val$set1);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object object) {
                return val$set1.contains(object) && val$set2.contains(object);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean containsAll(Collection<?> collection) {
                return val$set1.containsAll(collection) && val$set2.containsAll(collection);
            }
        };
    }

    /* renamed from: com.google.common.collect.Sets$2 */
    /* loaded from: classes7.dex */
    public class C73492<E> extends SetView<E> {
        public final /* synthetic */ Set val$set1;
        public final /* synthetic */ Set val$set2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C73492(final Set set12, final Set set22) {
            super();
            val$set1 = set12;
            val$set2 = set22;
        }

        /* renamed from: com.google.common.collect.Sets$2$1 */
        /* loaded from: classes8.dex */
        public class AnonymousClass1 extends AbstractIterator<E> {
            public final Iterator<E> itr;

            public AnonymousClass1() {
                this.itr = val$set1.iterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            public E computeNext() {
                while (this.itr.hasNext()) {
                    E next = this.itr.next();
                    if (val$set2.contains(next)) {
                        return next;
                    }
                }
                return endOfData();
            }
        }

        @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<E> iterator() {
            return new AbstractIterator<E>() { // from class: com.google.common.collect.Sets.2.1
                public final Iterator<E> itr;

                public AnonymousClass1() {
                    this.itr = val$set1.iterator();
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                public E computeNext() {
                    while (this.itr.hasNext()) {
                        E next = this.itr.next();
                        if (val$set2.contains(next)) {
                            return next;
                        }
                    }
                    return endOfData();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = val$set1.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (val$set2.contains(it.next())) {
                    i++;
                }
            }
            return i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(val$set2, val$set1);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object object) {
            return val$set1.contains(object) && val$set2.contains(object);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return val$set1.containsAll(collection) && val$set2.containsAll(collection);
        }
    }

    public static <E> SetView<E> difference(final Set<E> set1, final Set<?> set2) {
        Preconditions.checkNotNull(set1, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return new SetView<E>() { // from class: com.google.common.collect.Sets.3
            public final /* synthetic */ Set val$set1;
            public final /* synthetic */ Set val$set2;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C73503(final Set set12, final Set set22) {
                super();
                val$set1 = set12;
                val$set2 = set22;
            }

            /* renamed from: com.google.common.collect.Sets$3$1 */
            /* loaded from: classes8.dex */
            public class AnonymousClass1 extends AbstractIterator<E> {
                public final Iterator<E> itr;

                public AnonymousClass1() {
                    this.itr = val$set1.iterator();
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                public E computeNext() {
                    while (this.itr.hasNext()) {
                        E next = this.itr.next();
                        if (!val$set2.contains(next)) {
                            return next;
                        }
                    }
                    return endOfData();
                }
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<E> iterator() {
                return new AbstractIterator<E>() { // from class: com.google.common.collect.Sets.3.1
                    public final Iterator<E> itr;

                    public AnonymousClass1() {
                        this.itr = val$set1.iterator();
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    @CheckForNull
                    public E computeNext() {
                        while (this.itr.hasNext()) {
                            E next = this.itr.next();
                            if (!val$set2.contains(next)) {
                                return next;
                            }
                        }
                        return endOfData();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                Iterator<E> it = val$set1.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (!val$set2.contains(it.next())) {
                        i++;
                    }
                }
                return i;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                return val$set2.containsAll(val$set1);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object element) {
                return val$set1.contains(element) && !val$set2.contains(element);
            }
        };
    }

    /* renamed from: com.google.common.collect.Sets$3 */
    /* loaded from: classes7.dex */
    public class C73503<E> extends SetView<E> {
        public final /* synthetic */ Set val$set1;
        public final /* synthetic */ Set val$set2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C73503(final Set set12, final Set set22) {
            super();
            val$set1 = set12;
            val$set2 = set22;
        }

        /* renamed from: com.google.common.collect.Sets$3$1 */
        /* loaded from: classes8.dex */
        public class AnonymousClass1 extends AbstractIterator<E> {
            public final Iterator<E> itr;

            public AnonymousClass1() {
                this.itr = val$set1.iterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            public E computeNext() {
                while (this.itr.hasNext()) {
                    E next = this.itr.next();
                    if (!val$set2.contains(next)) {
                        return next;
                    }
                }
                return endOfData();
            }
        }

        @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<E> iterator() {
            return new AbstractIterator<E>() { // from class: com.google.common.collect.Sets.3.1
                public final Iterator<E> itr;

                public AnonymousClass1() {
                    this.itr = val$set1.iterator();
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                public E computeNext() {
                    while (this.itr.hasNext()) {
                        E next = this.itr.next();
                        if (!val$set2.contains(next)) {
                            return next;
                        }
                    }
                    return endOfData();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = val$set1.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (!val$set2.contains(it.next())) {
                    i++;
                }
            }
            return i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return val$set2.containsAll(val$set1);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object element) {
            return val$set1.contains(element) && !val$set2.contains(element);
        }
    }

    public static <E> SetView<E> symmetricDifference(final Set<? extends E> set1, final Set<? extends E> set2) {
        Preconditions.checkNotNull(set1, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return new SetView<E>() { // from class: com.google.common.collect.Sets.4
            public final /* synthetic */ Set val$set1;
            public final /* synthetic */ Set val$set2;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C73514(final Set set12, final Set set22) {
                super();
                val$set1 = set12;
                val$set2 = set22;
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<E> iterator() {
                return new AbstractIterator<E>() { // from class: com.google.common.collect.Sets.4.1
                    public final /* synthetic */ Iterator val$itr1;
                    public final /* synthetic */ Iterator val$itr2;

                    public AnonymousClass1(final Iterator val$itr1, final Iterator val$itr2) {
                        val$itr1 = val$itr1;
                        val$itr2 = val$itr2;
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    @CheckForNull
                    public E computeNext() {
                        while (val$itr1.hasNext()) {
                            E e = (E) val$itr1.next();
                            if (!val$set2.contains(e)) {
                                return e;
                            }
                        }
                        while (val$itr2.hasNext()) {
                            E e2 = (E) val$itr2.next();
                            if (!val$set1.contains(e2)) {
                                return e2;
                            }
                        }
                        return endOfData();
                    }
                };
            }

            /* renamed from: com.google.common.collect.Sets$4$1 */
            /* loaded from: classes8.dex */
            public class AnonymousClass1 extends AbstractIterator<E> {
                public final /* synthetic */ Iterator val$itr1;
                public final /* synthetic */ Iterator val$itr2;

                public AnonymousClass1(final Iterator val$itr1, final Iterator val$itr2) {
                    val$itr1 = val$itr1;
                    val$itr2 = val$itr2;
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                public E computeNext() {
                    while (val$itr1.hasNext()) {
                        E e = (E) val$itr1.next();
                        if (!val$set2.contains(e)) {
                            return e;
                        }
                    }
                    while (val$itr2.hasNext()) {
                        E e2 = (E) val$itr2.next();
                        if (!val$set1.contains(e2)) {
                            return e2;
                        }
                    }
                    return endOfData();
                }
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                Iterator<E> it = val$set1.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (!val$set2.contains(it.next())) {
                        i++;
                    }
                }
                Iterator<E> it2 = val$set2.iterator();
                while (it2.hasNext()) {
                    if (!val$set1.contains(it2.next())) {
                        i++;
                    }
                }
                return i;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                return val$set1.equals(val$set2);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object element) {
                return val$set2.contains(element) ^ val$set1.contains(element);
            }
        };
    }

    /* renamed from: com.google.common.collect.Sets$4 */
    /* loaded from: classes7.dex */
    public class C73514<E> extends SetView<E> {
        public final /* synthetic */ Set val$set1;
        public final /* synthetic */ Set val$set2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C73514(final Set set12, final Set set22) {
            super();
            val$set1 = set12;
            val$set2 = set22;
        }

        @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<E> iterator() {
            return new AbstractIterator<E>() { // from class: com.google.common.collect.Sets.4.1
                public final /* synthetic */ Iterator val$itr1;
                public final /* synthetic */ Iterator val$itr2;

                public AnonymousClass1(final Iterator val$itr1, final Iterator val$itr2) {
                    val$itr1 = val$itr1;
                    val$itr2 = val$itr2;
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                public E computeNext() {
                    while (val$itr1.hasNext()) {
                        E e = (E) val$itr1.next();
                        if (!val$set2.contains(e)) {
                            return e;
                        }
                    }
                    while (val$itr2.hasNext()) {
                        E e2 = (E) val$itr2.next();
                        if (!val$set1.contains(e2)) {
                            return e2;
                        }
                    }
                    return endOfData();
                }
            };
        }

        /* renamed from: com.google.common.collect.Sets$4$1 */
        /* loaded from: classes8.dex */
        public class AnonymousClass1 extends AbstractIterator<E> {
            public final /* synthetic */ Iterator val$itr1;
            public final /* synthetic */ Iterator val$itr2;

            public AnonymousClass1(final Iterator val$itr1, final Iterator val$itr2) {
                val$itr1 = val$itr1;
                val$itr2 = val$itr2;
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            public E computeNext() {
                while (val$itr1.hasNext()) {
                    E e = (E) val$itr1.next();
                    if (!val$set2.contains(e)) {
                        return e;
                    }
                }
                while (val$itr2.hasNext()) {
                    E e2 = (E) val$itr2.next();
                    if (!val$set1.contains(e2)) {
                        return e2;
                    }
                }
                return endOfData();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = val$set1.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (!val$set2.contains(it.next())) {
                    i++;
                }
            }
            Iterator<E> it2 = val$set2.iterator();
            while (it2.hasNext()) {
                if (!val$set1.contains(it2.next())) {
                    i++;
                }
            }
            return i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return val$set1.equals(val$set2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object element) {
            return val$set2.contains(element) ^ val$set1.contains(element);
        }
    }

    public static <E> Set<E> filter(Set<E> unfiltered, Predicate<? super E> predicate) {
        if (unfiltered instanceof SortedSet) {
            return filter((SortedSet) unfiltered, (Predicate) predicate);
        }
        if (unfiltered instanceof FilteredSet) {
            FilteredSet filteredSet = (FilteredSet) unfiltered;
            return new FilteredSet((Set) filteredSet.unfiltered, Predicates.and(filteredSet.predicate, predicate));
        }
        return new FilteredSet((Set) Preconditions.checkNotNull(unfiltered), (Predicate) Preconditions.checkNotNull(predicate));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> SortedSet<E> filter(SortedSet<E> unfiltered, Predicate<? super E> predicate) {
        if (unfiltered instanceof FilteredSet) {
            FilteredSet filteredSet = (FilteredSet) unfiltered;
            return new FilteredSortedSet((SortedSet) filteredSet.unfiltered, Predicates.and(filteredSet.predicate, predicate));
        }
        return new FilteredSortedSet((SortedSet) Preconditions.checkNotNull(unfiltered), (Predicate) Preconditions.checkNotNull(predicate));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @GwtIncompatible
    public static <E> NavigableSet<E> filter(NavigableSet<E> unfiltered, Predicate<? super E> predicate) {
        if (unfiltered instanceof FilteredSet) {
            FilteredSet filteredSet = (FilteredSet) unfiltered;
            return new FilteredNavigableSet((NavigableSet) filteredSet.unfiltered, Predicates.and(filteredSet.predicate, predicate));
        }
        return new FilteredNavigableSet((NavigableSet) Preconditions.checkNotNull(unfiltered), (Predicate) Preconditions.checkNotNull(predicate));
    }

    /* loaded from: classes7.dex */
    public static class FilteredSet<E> extends Collections2.FilteredCollection<E> implements Set<E> {
        public FilteredSet(Set<E> unfiltered, Predicate<? super E> predicate) {
            super(unfiltered, predicate);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@CheckForNull Object object) {
            return Sets.equalsImpl(this, object);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.hashCodeImpl(this);
        }
    }

    /* loaded from: classes8.dex */
    public static class FilteredSortedSet<E> extends FilteredSet<E> implements SortedSet<E> {
        public FilteredSortedSet(SortedSet<E> unfiltered, Predicate<? super E> predicate) {
            super(unfiltered, predicate);
        }

        @Override // java.util.SortedSet
        @CheckForNull
        public Comparator<? super E> comparator() {
            return ((SortedSet) this.unfiltered).comparator();
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(@ParametricNullness E fromElement, @ParametricNullness E toElement) {
            return new FilteredSortedSet(((SortedSet) this.unfiltered).subSet(fromElement, toElement), this.predicate);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(@ParametricNullness E toElement) {
            return new FilteredSortedSet(((SortedSet) this.unfiltered).headSet(toElement), this.predicate);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(@ParametricNullness E fromElement) {
            return new FilteredSortedSet(((SortedSet) this.unfiltered).tailSet(fromElement), this.predicate);
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public E first() {
            return (E) Iterators.find(this.unfiltered.iterator(), this.predicate);
        }

        @ParametricNullness
        public E last() {
            SortedSet sortedSetHeadSet = (SortedSet) this.unfiltered;
            while (true) {
                E e = (Object) sortedSetHeadSet.last();
                if (this.predicate.apply(e)) {
                    return e;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(e);
            }
        }
    }

    @GwtIncompatible
    /* loaded from: classes8.dex */
    public static class FilteredNavigableSet<E> extends FilteredSortedSet<E> implements NavigableSet<E> {
        public FilteredNavigableSet(NavigableSet<E> unfiltered, Predicate<? super E> predicate) {
            super(unfiltered, predicate);
        }

        public NavigableSet<E> unfiltered() {
            return (NavigableSet) this.unfiltered;
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E lower(@ParametricNullness E e) {
            return (E) Iterators.find(unfiltered().headSet(e, false).descendingIterator(), this.predicate, null);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E floor(@ParametricNullness E e) {
            return (E) Iterators.find(unfiltered().headSet(e, true).descendingIterator(), this.predicate, null);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E ceiling(@ParametricNullness E e) {
            return (E) Iterables.find(unfiltered().tailSet(e, true), this.predicate, null);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E higher(@ParametricNullness E e) {
            return (E) Iterables.find(unfiltered().tailSet(e, false), this.predicate, null);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E pollFirst() {
            return (E) Iterables.removeFirstMatching(unfiltered(), this.predicate);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E pollLast() {
            return (E) Iterables.removeFirstMatching(unfiltered().descendingSet(), this.predicate);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return Sets.filter((NavigableSet) unfiltered().descendingSet(), (Predicate) this.predicate);
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return Iterators.filter(unfiltered().descendingIterator(), this.predicate);
        }

        @Override // com.google.common.collect.Sets.FilteredSortedSet, java.util.SortedSet
        @ParametricNullness
        public E last() {
            return (E) Iterators.find(unfiltered().descendingIterator(), this.predicate);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(@ParametricNullness E fromElement, boolean fromInclusive, @ParametricNullness E toElement, boolean toInclusive) {
            return Sets.filter((NavigableSet) unfiltered().subSet(fromElement, fromInclusive, toElement, toInclusive), (Predicate) this.predicate);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(@ParametricNullness E toElement, boolean inclusive) {
            return Sets.filter((NavigableSet) unfiltered().headSet(toElement, inclusive), (Predicate) this.predicate);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(@ParametricNullness E fromElement, boolean inclusive) {
            return Sets.filter((NavigableSet) unfiltered().tailSet(fromElement, inclusive), (Predicate) this.predicate);
        }
    }

    public static <B> Set<List<B>> cartesianProduct(List<? extends Set<? extends B>> sets) {
        return CartesianSet.create(sets);
    }

    @SafeVarargs
    public static <B> Set<List<B>> cartesianProduct(Set<? extends B>... sets) {
        return cartesianProduct(Arrays.asList(sets));
    }

    /* loaded from: classes8.dex */
    public static final class CartesianSet<E> extends ForwardingCollection<List<E>> implements Set<List<E>> {
        public final transient ImmutableList<ImmutableSet<E>> axes;
        public final transient CartesianList<E> delegate;

        public static <E> Set<List<E>> create(List<? extends Set<? extends E>> sets) {
            ImmutableList.Builder builder = new ImmutableList.Builder(sets.size());
            Iterator<? extends Set<? extends E>> it = sets.iterator();
            while (it.hasNext()) {
                ImmutableSet immutableSetCopyOf = ImmutableSet.copyOf((Collection) it.next());
                if (immutableSetCopyOf.isEmpty()) {
                    return ImmutableSet.m1218of();
                }
                builder.add((ImmutableList.Builder) immutableSetCopyOf);
            }
            ImmutableList<E> immutableListBuild = builder.build();
            return new CartesianSet(immutableListBuild, new CartesianList(new ImmutableList<List<E>>() { // from class: com.google.common.collect.Sets.CartesianSet.1
                @Override // com.google.common.collect.ImmutableCollection
                public boolean isPartialView() {
                    return true;
                }

                public C73531() {
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return val$axes.size();
                }

                @Override // java.util.List
                public List<E> get(int i) {
                    return ((ImmutableSet) val$axes.get(i)).asList();
                }
            }));
        }

        /* renamed from: com.google.common.collect.Sets$CartesianSet$1 */
        public class C73531 extends ImmutableList<List<E>> {
            @Override // com.google.common.collect.ImmutableCollection
            public boolean isPartialView() {
                return true;
            }

            public C73531() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return val$axes.size();
            }

            @Override // java.util.List
            public List<E> get(int i) {
                return ((ImmutableSet) val$axes.get(i)).asList();
            }
        }

        public CartesianSet(ImmutableList<ImmutableSet<E>> axes, CartesianList<E> delegate) {
            this.axes = axes;
            this.delegate = delegate;
        }

        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Collection<List<E>> delegate() {
            return this.delegate;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object object) {
            if (!(object instanceof List)) {
                return false;
            }
            List list = (List) object;
            if (list.size() != this.axes.size()) {
                return false;
            }
            Iterator<E> it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (!this.axes.get(i).contains(it.next())) {
                    return false;
                }
                i++;
            }
            return true;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@CheckForNull Object object) {
            if (object instanceof CartesianSet) {
                return this.axes.equals(((CartesianSet) object).axes);
            }
            return super.equals(object);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            int i = 1;
            int size = size() - 1;
            for (int i2 = 0; i2 < this.axes.size(); i2++) {
                size = ~(~(size * 31));
            }
            UnmodifiableIterator<ImmutableSet<E>> it = this.axes.iterator();
            while (it.hasNext()) {
                ImmutableSet<E> next = it.next();
                i = ~(~((i * 31) + ((size() / next.size()) * next.hashCode())));
            }
            return ~(~(i + size));
        }
    }

    @GwtCompatible(serializable = false)
    public static <E> Set<Set<E>> powerSet(Set<E> set) {
        return new PowerSet(set);
    }

    public static final class SubSet<E> extends AbstractSet<E> {
        public final ImmutableMap<E, Integer> inputSet;
        public final int mask;

        public SubSet(ImmutableMap<E, Integer> inputSet, int mask) {
            this.inputSet = inputSet;
            this.mask = mask;
        }

        /* renamed from: com.google.common.collect.Sets$SubSet$1 */
        /* loaded from: classes7.dex */
        public class C73551 extends UnmodifiableIterator<E> {
            public final ImmutableList<E> elements;
            public int remainingSetBits;

            public C73551() {
                this.elements = SubSet.this.inputSet.keySet().asList();
                this.remainingSetBits = SubSet.this.mask;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.remainingSetBits != 0;
            }

            @Override // java.util.Iterator
            public E next() {
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(this.remainingSetBits);
                if (iNumberOfTrailingZeros == 32) {
                    throw new NoSuchElementException();
                }
                this.remainingSetBits &= ~(1 << iNumberOfTrailingZeros);
                return this.elements.get(iNumberOfTrailingZeros);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return new UnmodifiableIterator<E>() { // from class: com.google.common.collect.Sets.SubSet.1
                public final ImmutableList<E> elements;
                public int remainingSetBits;

                public C73551() {
                    this.elements = SubSet.this.inputSet.keySet().asList();
                    this.remainingSetBits = SubSet.this.mask;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.remainingSetBits != 0;
                }

                @Override // java.util.Iterator
                public E next() {
                    int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(this.remainingSetBits);
                    if (iNumberOfTrailingZeros == 32) {
                        throw new NoSuchElementException();
                    }
                    this.remainingSetBits &= ~(1 << iNumberOfTrailingZeros);
                    return this.elements.get(iNumberOfTrailingZeros);
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return Integer.bitCount(this.mask);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object o) {
            Integer num = this.inputSet.get(o);
            if (num != null) {
                if (((1 << num.intValue()) & this.mask) != 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final class PowerSet<E> extends AbstractSet<Set<E>> {
        public final ImmutableMap<E, Integer> inputSet;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return false;
        }

        public PowerSet(Set<E> input) {
            Preconditions.checkArgument(input.size() <= 30, "Too many elements to create power set: %s > 30", input.size());
            this.inputSet = Maps.indexMap(input);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return 1 << this.inputSet.size();
        }

        /* renamed from: com.google.common.collect.Sets$PowerSet$1 */
        /* loaded from: classes8.dex */
        public class C73541 extends AbstractIndexedListIterator<Set<E>> {
            public C73541(int size) {
                super(size);
            }

            @Override // com.google.common.collect.AbstractIndexedListIterator
            public Set<E> get(final int setBits) {
                return new SubSet(PowerSet.this.inputSet, setBits);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Set<E>> iterator() {
            return new AbstractIndexedListIterator<Set<E>>(size()) { // from class: com.google.common.collect.Sets.PowerSet.1
                public C73541(int size) {
                    super(size);
                }

                @Override // com.google.common.collect.AbstractIndexedListIterator
                public Set<E> get(final int setBits) {
                    return new SubSet(PowerSet.this.inputSet, setBits);
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof Set)) {
                return false;
            }
            return this.inputSet.keySet().containsAll((Set) obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof PowerSet) {
                return this.inputSet.keySet().equals(((PowerSet) obj).inputSet.keySet());
            }
            return super.equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return this.inputSet.keySet().hashCode() << (this.inputSet.size() - 1);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "powerSet(" + this.inputSet + ")";
        }
    }

    public static <E> Set<Set<E>> combinations(Set<E> set, final int size) {
        ImmutableMap immutableMapIndexMap = Maps.indexMap(set);
        CollectPreconditions.checkNonnegative(size, "size");
        Preconditions.checkArgument(size <= immutableMapIndexMap.size(), "size (%s) must be <= set.size() (%s)", size, immutableMapIndexMap.size());
        if (size == 0) {
            return ImmutableSet.m1219of(ImmutableSet.m1218of());
        }
        if (size == immutableMapIndexMap.size()) {
            return ImmutableSet.m1219of(immutableMapIndexMap.keySet());
        }
        return new C73525(size, immutableMapIndexMap);
    }

    /* renamed from: com.google.common.collect.Sets$5 */
    public class C73525<E> extends AbstractSet<Set<E>> {
        public final /* synthetic */ ImmutableMap val$index;
        public final /* synthetic */ int val$size;

        public C73525(final int val$size, final ImmutableMap val$index) {
            this.val$size = val$size;
            this.val$index = val$index;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object o) {
            if (!(o instanceof Set)) {
                return false;
            }
            Set set = (Set) o;
            return set.size() == this.val$size && this.val$index.keySet().containsAll(set);
        }

        /* renamed from: com.google.common.collect.Sets$5$1 */
        /* loaded from: classes8.dex */
        public class AnonymousClass1 extends AbstractIterator<Set<E>> {
            public final BitSet bits;

            public AnonymousClass1() {
                this.bits = new BitSet(C73525.this.val$index.size());
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            public Set<E> computeNext() {
                if (this.bits.isEmpty()) {
                    this.bits.set(0, C73525.this.val$size);
                } else {
                    int iNextSetBit = this.bits.nextSetBit(0);
                    int iNextClearBit = this.bits.nextClearBit(iNextSetBit);
                    if (iNextClearBit == C73525.this.val$index.size()) {
                        return endOfData();
                    }
                    int i = (iNextClearBit - iNextSetBit) - 1;
                    this.bits.set(0, i);
                    this.bits.clear(i, iNextClearBit);
                    this.bits.set(iNextClearBit);
                }
                return new AbstractSet<E>() { // from class: com.google.common.collect.Sets.5.1.1
                    public final /* synthetic */ BitSet val$copy;

                    public C119031(final BitSet val$copy) {
                        val$copy = val$copy;
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public boolean contains(@CheckForNull Object o) {
                        Integer num = (Integer) C73525.this.val$index.get(o);
                        return num != null && val$copy.get(num.intValue());
                    }

                    /* renamed from: com.google.common.collect.Sets$5$1$1$1 */
                    /* loaded from: classes8.dex */
                    public class C119041 extends AbstractIterator<E> {

                        /* renamed from: i */
                        public int f817i = -1;

                        public C119041() {
                        }

                        @Override // com.google.common.collect.AbstractIterator
                        @CheckForNull
                        public E computeNext() {
                            int iNextSetBit = val$copy.nextSetBit(this.f817i + 1);
                            this.f817i = iNextSetBit;
                            if (iNextSetBit == -1) {
                                return endOfData();
                            }
                            return C73525.this.val$index.keySet().asList().get(this.f817i);
                        }
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                    public Iterator<E> iterator() {
                        return new AbstractIterator<E>() { // from class: com.google.common.collect.Sets.5.1.1.1

                            /* renamed from: i */
                            public int f817i = -1;

                            public C119041() {
                            }

                            @Override // com.google.common.collect.AbstractIterator
                            @CheckForNull
                            public E computeNext() {
                                int iNextSetBit2 = val$copy.nextSetBit(this.f817i + 1);
                                this.f817i = iNextSetBit2;
                                if (iNextSetBit2 == -1) {
                                    return endOfData();
                                }
                                return C73525.this.val$index.keySet().asList().get(this.f817i);
                            }
                        };
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public int size() {
                        return C73525.this.val$size;
                    }
                };
            }

            /* renamed from: com.google.common.collect.Sets$5$1$1 */
            /* loaded from: classes6.dex */
            public class C119031 extends AbstractSet<E> {
                public final /* synthetic */ BitSet val$copy;

                public C119031(final BitSet val$copy) {
                    val$copy = val$copy;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean contains(@CheckForNull Object o) {
                    Integer num = (Integer) C73525.this.val$index.get(o);
                    return num != null && val$copy.get(num.intValue());
                }

                /* renamed from: com.google.common.collect.Sets$5$1$1$1 */
                /* loaded from: classes8.dex */
                public class C119041 extends AbstractIterator<E> {

                    /* renamed from: i */
                    public int f817i = -1;

                    public C119041() {
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    @CheckForNull
                    public E computeNext() {
                        int iNextSetBit2 = val$copy.nextSetBit(this.f817i + 1);
                        this.f817i = iNextSetBit2;
                        if (iNextSetBit2 == -1) {
                            return endOfData();
                        }
                        return C73525.this.val$index.keySet().asList().get(this.f817i);
                    }
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<E> iterator() {
                    return new AbstractIterator<E>() { // from class: com.google.common.collect.Sets.5.1.1.1

                        /* renamed from: i */
                        public int f817i = -1;

                        public C119041() {
                        }

                        @Override // com.google.common.collect.AbstractIterator
                        @CheckForNull
                        public E computeNext() {
                            int iNextSetBit2 = val$copy.nextSetBit(this.f817i + 1);
                            this.f817i = iNextSetBit2;
                            if (iNextSetBit2 == -1) {
                                return endOfData();
                            }
                            return C73525.this.val$index.keySet().asList().get(this.f817i);
                        }
                    };
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    return C73525.this.val$size;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Set<E>> iterator() {
            return new AnonymousClass1();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return IntMath.binomial(this.val$index.size(), this.val$size);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "Sets.combinations(" + this.val$index.keySet() + ", " + this.val$size + ")";
        }
    }

    public static int hashCodeImpl(Set<?> s) {
        Iterator<?> it = s.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static boolean equalsImpl(Set<?> s, @CheckForNull Object object) {
        if (s == object) {
            return true;
        }
        if (object instanceof Set) {
            Set set = (Set) object;
            try {
                if (s.size() == set.size()) {
                    if (s.containsAll(set)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <E> NavigableSet<E> unmodifiableNavigableSet(NavigableSet<E> set) {
        return ((set instanceof ImmutableCollection) || (set instanceof UnmodifiableNavigableSet)) ? set : new UnmodifiableNavigableSet(set);
    }

    /* loaded from: classes8.dex */
    public static final class UnmodifiableNavigableSet<E> extends ForwardingSortedSet<E> implements NavigableSet<E>, Serializable {
        public static final long serialVersionUID = 0;
        public final NavigableSet<E> delegate;

        @CheckForNull
        @LazyInit
        public transient UnmodifiableNavigableSet<E> descendingSet;
        public final SortedSet<E> unmodifiableDelegate;

        public UnmodifiableNavigableSet(NavigableSet<E> delegate) {
            this.delegate = (NavigableSet) Preconditions.checkNotNull(delegate);
            this.unmodifiableDelegate = Collections.unmodifiableSortedSet(delegate);
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public SortedSet<E> delegate() {
            return this.unmodifiableDelegate;
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E lower(@ParametricNullness E e) {
            return this.delegate.lower(e);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E floor(@ParametricNullness E e) {
            return this.delegate.floor(e);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E ceiling(@ParametricNullness E e) {
            return this.delegate.ceiling(e);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E higher(@ParametricNullness E e) {
            return this.delegate.higher(e);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E pollFirst() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E pollLast() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            UnmodifiableNavigableSet<E> unmodifiableNavigableSet = this.descendingSet;
            if (unmodifiableNavigableSet != null) {
                return unmodifiableNavigableSet;
            }
            UnmodifiableNavigableSet<E> unmodifiableNavigableSet2 = new UnmodifiableNavigableSet<>(this.delegate.descendingSet());
            this.descendingSet = unmodifiableNavigableSet2;
            unmodifiableNavigableSet2.descendingSet = this;
            return unmodifiableNavigableSet2;
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return Iterators.unmodifiableIterator(this.delegate.descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(@ParametricNullness E fromElement, boolean fromInclusive, @ParametricNullness E toElement, boolean toInclusive) {
            return Sets.unmodifiableNavigableSet(this.delegate.subSet(fromElement, fromInclusive, toElement, toInclusive));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(@ParametricNullness E toElement, boolean inclusive) {
            return Sets.unmodifiableNavigableSet(this.delegate.headSet(toElement, inclusive));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(@ParametricNullness E fromElement, boolean inclusive) {
            return Sets.unmodifiableNavigableSet(this.delegate.tailSet(fromElement, inclusive));
        }
    }

    @GwtIncompatible
    public static <E> NavigableSet<E> synchronizedNavigableSet(NavigableSet<E> navigableSet) {
        return Synchronized.navigableSet(navigableSet);
    }

    public static boolean removeAllImpl(Set<?> set, Iterator<?> iterator) {
        boolean zRemove = false;
        while (iterator.hasNext()) {
            zRemove |= set.remove(iterator.next());
        }
        return zRemove;
    }

    public static boolean removeAllImpl(Set<?> set, Collection<?> collection) {
        Preconditions.checkNotNull(collection);
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).elementSet();
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            return Iterators.removeAll(set.iterator(), collection);
        }
        return removeAllImpl(set, collection.iterator());
    }

    @GwtIncompatible
    /* loaded from: classes7.dex */
    public static class DescendingSet<E> extends ForwardingNavigableSet<E> {
        public final NavigableSet<E> forward;

        public DescendingSet(NavigableSet<E> forward) {
            this.forward = forward;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public NavigableSet<E> delegate() {
            return this.forward;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        @CheckForNull
        public E lower(@ParametricNullness E e) {
            return this.forward.higher(e);
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        @CheckForNull
        public E floor(@ParametricNullness E e) {
            return this.forward.ceiling(e);
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        @CheckForNull
        public E ceiling(@ParametricNullness E e) {
            return this.forward.floor(e);
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        @CheckForNull
        public E higher(@ParametricNullness E e) {
            return this.forward.lower(e);
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        @CheckForNull
        public E pollFirst() {
            return this.forward.pollLast();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        @CheckForNull
        public E pollLast() {
            return this.forward.pollFirst();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return this.forward;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return this.forward.iterator();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> subSet(@ParametricNullness E fromElement, boolean fromInclusive, @ParametricNullness E toElement, boolean toInclusive) {
            return this.forward.subSet(toElement, toInclusive, fromElement, fromInclusive).descendingSet();
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> subSet(@ParametricNullness E fromElement, @ParametricNullness E toElement) {
            return standardSubSet(fromElement, toElement);
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> headSet(@ParametricNullness E toElement, boolean inclusive) {
            return this.forward.tailSet(toElement, inclusive).descendingSet();
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> headSet(@ParametricNullness E toElement) {
            return standardHeadSet(toElement);
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> tailSet(@ParametricNullness E fromElement, boolean inclusive) {
            return this.forward.headSet(fromElement, inclusive).descendingSet();
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> tailSet(@ParametricNullness E fromElement) {
            return standardTailSet(fromElement);
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public Comparator<? super E> comparator() {
            Comparator<? super E> comparator = this.forward.comparator();
            if (comparator == null) {
                return Ordering.natural().reverse();
            }
            return reverse(comparator);
        }

        public static <T> Ordering<T> reverse(Comparator<T> forward) {
            return Ordering.from(forward).reverse();
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        @ParametricNullness
        public E first() {
            return this.forward.last();
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        @ParametricNullness
        public E last() {
            return this.forward.first();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return this.forward.descendingIterator();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return standardToArray();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }

        @Override // com.google.common.collect.ForwardingObject
        public String toString() {
            return standardToString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @GwtIncompatible
    public static <K extends Comparable<? super K>> NavigableSet<K> subSet(NavigableSet<K> set, Range<K> range) {
        if (set.comparator() != null && set.comparator() != Ordering.natural() && range.hasLowerBound() && range.hasUpperBound()) {
            Preconditions.checkArgument(set.comparator().compare(range.lowerEndpoint(), range.upperEndpoint()) <= 0, "set is using a custom comparator which is inconsistent with the natural ordering.");
        }
        if (range.hasLowerBound() && range.hasUpperBound()) {
            Comparable comparableLowerEndpoint = range.lowerEndpoint();
            BoundType boundTypeLowerBoundType = range.lowerBoundType();
            BoundType boundType = BoundType.CLOSED;
            return set.subSet(comparableLowerEndpoint, boundTypeLowerBoundType == boundType, range.upperEndpoint(), range.upperBoundType() == boundType);
        }
        if (range.hasLowerBound()) {
            return set.tailSet(range.lowerEndpoint(), range.lowerBoundType() == BoundType.CLOSED);
        }
        if (range.hasUpperBound()) {
            return set.headSet(range.upperEndpoint(), range.upperBoundType() == BoundType.CLOSED);
        }
        return (NavigableSet) Preconditions.checkNotNull(set);
    }
}
