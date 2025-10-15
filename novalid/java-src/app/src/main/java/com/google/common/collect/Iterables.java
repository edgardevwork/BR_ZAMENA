package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;
import javax.annotation.CheckForNull;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes8.dex */
public final class Iterables {
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Iterable<T> unmodifiableIterable(final Iterable<? extends T> iterable) {
        Preconditions.checkNotNull(iterable);
        return ((iterable instanceof UnmodifiableIterable) || (iterable instanceof ImmutableCollection)) ? iterable : new UnmodifiableIterable(iterable);
    }

    @Deprecated
    public static <E> Iterable<E> unmodifiableIterable(ImmutableCollection<E> iterable) {
        return (Iterable) Preconditions.checkNotNull(iterable);
    }

    public static final class UnmodifiableIterable<T> extends FluentIterable<T> {
        public final Iterable<? extends T> iterable;

        public /* synthetic */ UnmodifiableIterable(Iterable iterable, C72681 c72681) {
            this(iterable);
        }

        public UnmodifiableIterable(Iterable<? extends T> iterable) {
            this.iterable = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.unmodifiableIterator(this.iterable.iterator());
        }

        @Override // com.google.common.collect.FluentIterable
        public String toString() {
            return this.iterable.toString();
        }
    }

    public static int size(Iterable<?> iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return Iterators.size(iterable.iterator());
    }

    public static boolean contains(Iterable<? extends Object> iterable, @CheckForNull Object element) {
        if (iterable instanceof Collection) {
            return Collections2.safeContains((Collection) iterable, element);
        }
        return Iterators.contains(iterable.iterator(), element);
    }

    @CanIgnoreReturnValue
    public static boolean removeAll(Iterable<?> removeFrom, Collection<?> elementsToRemove) {
        if (removeFrom instanceof Collection) {
            return ((Collection) removeFrom).removeAll((Collection) Preconditions.checkNotNull(elementsToRemove));
        }
        return Iterators.removeAll(removeFrom.iterator(), elementsToRemove);
    }

    @CanIgnoreReturnValue
    public static boolean retainAll(Iterable<?> removeFrom, Collection<?> elementsToRetain) {
        if (removeFrom instanceof Collection) {
            return ((Collection) removeFrom).retainAll((Collection) Preconditions.checkNotNull(elementsToRetain));
        }
        return Iterators.retainAll(removeFrom.iterator(), elementsToRetain);
    }

    @CanIgnoreReturnValue
    public static <T> boolean removeIf(Iterable<T> removeFrom, Predicate<? super T> predicate) {
        if ((removeFrom instanceof RandomAccess) && (removeFrom instanceof List)) {
            return removeIfFromRandomAccessList((List) removeFrom, (Predicate) Preconditions.checkNotNull(predicate));
        }
        return Iterators.removeIf(removeFrom.iterator(), predicate);
    }

    public static <T> boolean removeIfFromRandomAccessList(List<T> list, Predicate<? super T> predicate) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            T t = list.get(i);
            if (!predicate.apply(t)) {
                if (i > i2) {
                    try {
                        list.set(i2, t);
                    } catch (IllegalArgumentException unused) {
                        slowRemoveIfForRemainingElements(list, predicate, i2, i);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        slowRemoveIfForRemainingElements(list, predicate, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }

    public static <T> void slowRemoveIfForRemainingElements(List<T> list, Predicate<? super T> predicate, int to, int from) {
        for (int size = list.size() - 1; size > from; size--) {
            if (predicate.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i = from - 1; i >= to; i--) {
            list.remove(i);
        }
    }

    @CheckForNull
    public static <T> T removeFirstMatching(Iterable<T> removeFrom, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(predicate);
        Iterator<T> it = removeFrom.iterator();
        while (it.hasNext()) {
            T next = it.next();
            if (predicate.apply(next)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    public static boolean elementsEqual(Iterable<?> iterable1, Iterable<?> iterable2) {
        if ((iterable1 instanceof Collection) && (iterable2 instanceof Collection) && ((Collection) iterable1).size() != ((Collection) iterable2).size()) {
            return false;
        }
        return Iterators.elementsEqual(iterable1.iterator(), iterable2.iterator());
    }

    public static String toString(Iterable<?> iterable) {
        return Iterators.toString(iterable.iterator());
    }

    @ParametricNullness
    public static <T> T getOnlyElement(Iterable<T> iterable) {
        return (T) Iterators.getOnlyElement(iterable.iterator());
    }

    @ParametricNullness
    public static <T> T getOnlyElement(Iterable<? extends T> iterable, @ParametricNullness T t) {
        return (T) Iterators.getOnlyElement(iterable.iterator(), t);
    }

    @GwtIncompatible
    public static <T> T[] toArray(Iterable<? extends T> iterable, Class<T> cls) {
        return (T[]) toArray(iterable, ObjectArrays.newArray(cls, 0));
    }

    public static <T> T[] toArray(Iterable<? extends T> iterable, T[] tArr) {
        return (T[]) castOrCopyToCollection(iterable).toArray(tArr);
    }

    public static Object[] toArray(Iterable<?> iterable) {
        return castOrCopyToCollection(iterable).toArray();
    }

    public static <E> Collection<E> castOrCopyToCollection(Iterable<E> iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return Lists.newArrayList(iterable.iterator());
    }

    @CanIgnoreReturnValue
    public static <T> boolean addAll(Collection<T> addTo, Iterable<? extends T> elementsToAdd) {
        if (elementsToAdd instanceof Collection) {
            return addTo.addAll((Collection) elementsToAdd);
        }
        return Iterators.addAll(addTo, ((Iterable) Preconditions.checkNotNull(elementsToAdd)).iterator());
    }

    public static int frequency(Iterable<?> iterable, @CheckForNull Object obj) {
        if (iterable instanceof Multiset) {
            return ((Multiset) iterable).count(obj);
        }
        if (iterable instanceof Set) {
            return ((Set) iterable).contains(obj) ? 1 : 0;
        }
        return Iterators.frequency(iterable.iterator(), obj);
    }

    /* renamed from: com.google.common.collect.Iterables$1 */
    public class C72681<T> extends FluentIterable<T> {
        public final /* synthetic */ Iterable val$iterable;

        public C72681(final Iterable val$iterable) {
            val$iterable = val$iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.cycle(val$iterable);
        }

        @Override // com.google.common.collect.FluentIterable
        public String toString() {
            return val$iterable.toString() + " (cycled)";
        }
    }

    public static <T> Iterable<T> cycle(final Iterable<T> iterable) {
        Preconditions.checkNotNull(iterable);
        return new FluentIterable<T>() { // from class: com.google.common.collect.Iterables.1
            public final /* synthetic */ Iterable val$iterable;

            public C72681(final Iterable iterable2) {
                val$iterable = iterable2;
            }

            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                return Iterators.cycle(val$iterable);
            }

            @Override // com.google.common.collect.FluentIterable
            public String toString() {
                return val$iterable.toString() + " (cycled)";
            }
        };
    }

    @SafeVarargs
    public static <T> Iterable<T> cycle(T... elements) {
        return cycle(Lists.newArrayList(elements));
    }

    public static <T> Iterable<T> concat(Iterable<? extends T> a2, Iterable<? extends T> b) {
        return FluentIterable.concat(a2, b);
    }

    public static <T> Iterable<T> concat(Iterable<? extends T> a2, Iterable<? extends T> b, Iterable<? extends T> c) {
        return FluentIterable.concat(a2, b, c);
    }

    public static <T> Iterable<T> concat(Iterable<? extends T> a2, Iterable<? extends T> b, Iterable<? extends T> c, Iterable<? extends T> d) {
        return FluentIterable.concat(a2, b, c, d);
    }

    @SafeVarargs
    public static <T> Iterable<T> concat(Iterable<? extends T>... inputs) {
        return FluentIterable.concat(inputs);
    }

    public static <T> Iterable<T> concat(Iterable<? extends Iterable<? extends T>> inputs) {
        return FluentIterable.concat(inputs);
    }

    public static <T> Iterable<List<T>> partition(final Iterable<T> iterable, final int size) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkArgument(size > 0);
        return new FluentIterable<List<T>>() { // from class: com.google.common.collect.Iterables.2
            public final /* synthetic */ Iterable val$iterable;
            public final /* synthetic */ int val$size;

            public C72692(final Iterable iterable2, final int size2) {
                val$iterable = iterable2;
                val$size = size2;
            }

            @Override // java.lang.Iterable
            public Iterator<List<T>> iterator() {
                return Iterators.partition(val$iterable.iterator(), val$size);
            }
        };
    }

    /* renamed from: com.google.common.collect.Iterables$2 */
    public class C72692<T> extends FluentIterable<List<T>> {
        public final /* synthetic */ Iterable val$iterable;
        public final /* synthetic */ int val$size;

        public C72692(final Iterable iterable2, final int size2) {
            val$iterable = iterable2;
            val$size = size2;
        }

        @Override // java.lang.Iterable
        public Iterator<List<T>> iterator() {
            return Iterators.partition(val$iterable.iterator(), val$size);
        }
    }

    public static <T> Iterable<List<T>> paddedPartition(final Iterable<T> iterable, final int size) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkArgument(size > 0);
        return new FluentIterable<List<T>>() { // from class: com.google.common.collect.Iterables.3
            public final /* synthetic */ Iterable val$iterable;
            public final /* synthetic */ int val$size;

            public C72703(final Iterable iterable2, final int size2) {
                val$iterable = iterable2;
                val$size = size2;
            }

            @Override // java.lang.Iterable
            public Iterator<List<T>> iterator() {
                return Iterators.paddedPartition(val$iterable.iterator(), val$size);
            }
        };
    }

    /* renamed from: com.google.common.collect.Iterables$3 */
    public class C72703<T> extends FluentIterable<List<T>> {
        public final /* synthetic */ Iterable val$iterable;
        public final /* synthetic */ int val$size;

        public C72703(final Iterable iterable2, final int size2) {
            val$iterable = iterable2;
            val$size = size2;
        }

        @Override // java.lang.Iterable
        public Iterator<List<T>> iterator() {
            return Iterators.paddedPartition(val$iterable.iterator(), val$size);
        }
    }

    public static <T> Iterable<T> filter(final Iterable<T> unfiltered, final Predicate<? super T> retainIfTrue) {
        Preconditions.checkNotNull(unfiltered);
        Preconditions.checkNotNull(retainIfTrue);
        return new FluentIterable<T>() { // from class: com.google.common.collect.Iterables.4
            public final /* synthetic */ Predicate val$retainIfTrue;
            public final /* synthetic */ Iterable val$unfiltered;

            public C72714(final Iterable unfiltered2, final Predicate retainIfTrue2) {
                val$unfiltered = unfiltered2;
                val$retainIfTrue = retainIfTrue2;
            }

            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                return Iterators.filter(val$unfiltered.iterator(), val$retainIfTrue);
            }
        };
    }

    /* renamed from: com.google.common.collect.Iterables$4 */
    public class C72714<T> extends FluentIterable<T> {
        public final /* synthetic */ Predicate val$retainIfTrue;
        public final /* synthetic */ Iterable val$unfiltered;

        public C72714(final Iterable unfiltered2, final Predicate retainIfTrue2) {
            val$unfiltered = unfiltered2;
            val$retainIfTrue = retainIfTrue2;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.filter(val$unfiltered.iterator(), val$retainIfTrue);
        }
    }

    @GwtIncompatible
    public static <T> Iterable<T> filter(final Iterable<?> unfiltered, final Class<T> desiredType) {
        Preconditions.checkNotNull(unfiltered);
        Preconditions.checkNotNull(desiredType);
        return filter(unfiltered, Predicates.instanceOf(desiredType));
    }

    public static <T> boolean any(Iterable<T> iterable, Predicate<? super T> predicate) {
        return Iterators.any(iterable.iterator(), predicate);
    }

    public static <T> boolean all(Iterable<T> iterable, Predicate<? super T> predicate) {
        return Iterators.all(iterable.iterator(), predicate);
    }

    @ParametricNullness
    public static <T> T find(Iterable<T> iterable, Predicate<? super T> predicate) {
        return (T) Iterators.find(iterable.iterator(), predicate);
    }

    @CheckForNull
    public static <T> T find(Iterable<? extends T> iterable, Predicate<? super T> predicate, @CheckForNull T t) {
        return (T) Iterators.find(iterable.iterator(), predicate, t);
    }

    public static <T> Optional<T> tryFind(Iterable<T> iterable, Predicate<? super T> predicate) {
        return Iterators.tryFind(iterable.iterator(), predicate);
    }

    public static <T> int indexOf(Iterable<T> iterable, Predicate<? super T> predicate) {
        return Iterators.indexOf(iterable.iterator(), predicate);
    }

    public static <F, T> Iterable<T> transform(final Iterable<F> fromIterable, final Function<? super F, ? extends T> function) {
        Preconditions.checkNotNull(fromIterable);
        Preconditions.checkNotNull(function);
        return new FluentIterable<T>() { // from class: com.google.common.collect.Iterables.5
            public final /* synthetic */ Iterable val$fromIterable;
            public final /* synthetic */ Function val$function;

            public C72725(final Iterable fromIterable2, final Function function2) {
                val$fromIterable = fromIterable2;
                val$function = function2;
            }

            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                return Iterators.transform(val$fromIterable.iterator(), val$function);
            }
        };
    }

    /* renamed from: com.google.common.collect.Iterables$5 */
    public class C72725<T> extends FluentIterable<T> {
        public final /* synthetic */ Iterable val$fromIterable;
        public final /* synthetic */ Function val$function;

        public C72725(final Iterable fromIterable2, final Function function2) {
            val$fromIterable = fromIterable2;
            val$function = function2;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.transform(val$fromIterable.iterator(), val$function);
        }
    }

    @ParametricNullness
    public static <T> T get(Iterable<T> iterable, int i) {
        Preconditions.checkNotNull(iterable);
        if (iterable instanceof List) {
            return (T) ((List) iterable).get(i);
        }
        return (T) Iterators.get(iterable.iterator(), i);
    }

    @ParametricNullness
    public static <T> T get(Iterable<? extends T> iterable, int i, @ParametricNullness T t) {
        Preconditions.checkNotNull(iterable);
        Iterators.checkNonnegative(i);
        if (iterable instanceof List) {
            List listCast = Lists.cast(iterable);
            return i < listCast.size() ? (T) listCast.get(i) : t;
        }
        Iterator<? extends T> it = iterable.iterator();
        Iterators.advance(it, i);
        return (T) Iterators.getNext(it, t);
    }

    @ParametricNullness
    public static <T> T getFirst(Iterable<? extends T> iterable, @ParametricNullness T t) {
        return (T) Iterators.getNext(iterable.iterator(), t);
    }

    @ParametricNullness
    public static <T> T getLast(Iterable<T> iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return (T) getLastInNonemptyList(list);
        }
        return (T) Iterators.getLast(iterable.iterator());
    }

    @ParametricNullness
    public static <T> T getLast(Iterable<? extends T> iterable, @ParametricNullness T t) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return t;
            }
            if (iterable instanceof List) {
                return (T) getLastInNonemptyList(Lists.cast(iterable));
            }
        }
        return (T) Iterators.getLast(iterable.iterator(), t);
    }

    @ParametricNullness
    public static <T> T getLastInNonemptyList(List<T> list) {
        return list.get(list.size() - 1);
    }

    public static <T> Iterable<T> skip(final Iterable<T> iterable, final int numberToSkip) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkArgument(numberToSkip >= 0, "number to skip cannot be negative");
        return new FluentIterable<T>() { // from class: com.google.common.collect.Iterables.6
            public final /* synthetic */ Iterable val$iterable;
            public final /* synthetic */ int val$numberToSkip;

            public C72736(final Iterable iterable2, final int numberToSkip2) {
                val$iterable = iterable2;
                val$numberToSkip = numberToSkip2;
            }

            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                Iterable iterable2 = val$iterable;
                if (iterable2 instanceof List) {
                    List list = (List) iterable2;
                    return list.subList(Math.min(list.size(), val$numberToSkip), list.size()).iterator();
                }
                Iterator<T> it = iterable2.iterator();
                Iterators.advance(it, val$numberToSkip);
                return new Iterator<T>(this) { // from class: com.google.common.collect.Iterables.6.1
                    public boolean atStart = true;
                    public final /* synthetic */ Iterator val$iterator;

                    public AnonymousClass1(C72736 this, Iterator it2) {
                        val$iterator = it2;
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return val$iterator.hasNext();
                    }

                    @Override // java.util.Iterator
                    @ParametricNullness
                    public T next() {
                        T t = (T) val$iterator.next();
                        this.atStart = false;
                        return t;
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        CollectPreconditions.checkRemove(!this.atStart);
                        val$iterator.remove();
                    }
                };
            }

            /* renamed from: com.google.common.collect.Iterables$6$1 */
            public class AnonymousClass1 implements Iterator<T> {
                public boolean atStart = true;
                public final /* synthetic */ Iterator val$iterator;

                public AnonymousClass1(C72736 this, Iterator it2) {
                    val$iterator = it2;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return val$iterator.hasNext();
                }

                @Override // java.util.Iterator
                @ParametricNullness
                public T next() {
                    T t = (T) val$iterator.next();
                    this.atStart = false;
                    return t;
                }

                @Override // java.util.Iterator
                public void remove() {
                    CollectPreconditions.checkRemove(!this.atStart);
                    val$iterator.remove();
                }
            }
        };
    }

    /* renamed from: com.google.common.collect.Iterables$6 */
    public class C72736<T> extends FluentIterable<T> {
        public final /* synthetic */ Iterable val$iterable;
        public final /* synthetic */ int val$numberToSkip;

        public C72736(final Iterable iterable2, final int numberToSkip2) {
            val$iterable = iterable2;
            val$numberToSkip = numberToSkip2;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            Iterable iterable2 = val$iterable;
            if (iterable2 instanceof List) {
                List list = (List) iterable2;
                return list.subList(Math.min(list.size(), val$numberToSkip), list.size()).iterator();
            }
            Iterator it2 = iterable2.iterator();
            Iterators.advance(it2, val$numberToSkip);
            return new Iterator<T>(this) { // from class: com.google.common.collect.Iterables.6.1
                public boolean atStart = true;
                public final /* synthetic */ Iterator val$iterator;

                public AnonymousClass1(C72736 this, Iterator it22) {
                    val$iterator = it22;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return val$iterator.hasNext();
                }

                @Override // java.util.Iterator
                @ParametricNullness
                public T next() {
                    T t = (T) val$iterator.next();
                    this.atStart = false;
                    return t;
                }

                @Override // java.util.Iterator
                public void remove() {
                    CollectPreconditions.checkRemove(!this.atStart);
                    val$iterator.remove();
                }
            };
        }

        /* renamed from: com.google.common.collect.Iterables$6$1 */
        public class AnonymousClass1 implements Iterator<T> {
            public boolean atStart = true;
            public final /* synthetic */ Iterator val$iterator;

            public AnonymousClass1(C72736 this, Iterator it22) {
                val$iterator = it22;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return val$iterator.hasNext();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                T t = (T) val$iterator.next();
                this.atStart = false;
                return t;
            }

            @Override // java.util.Iterator
            public void remove() {
                CollectPreconditions.checkRemove(!this.atStart);
                val$iterator.remove();
            }
        }
    }

    public static <T> Iterable<T> limit(final Iterable<T> iterable, final int limitSize) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkArgument(limitSize >= 0, "limit is negative");
        return new FluentIterable<T>() { // from class: com.google.common.collect.Iterables.7
            public final /* synthetic */ Iterable val$iterable;
            public final /* synthetic */ int val$limitSize;

            public C72747(final Iterable iterable2, final int limitSize2) {
                val$iterable = iterable2;
                val$limitSize = limitSize2;
            }

            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                return Iterators.limit(val$iterable.iterator(), val$limitSize);
            }
        };
    }

    /* renamed from: com.google.common.collect.Iterables$7 */
    public class C72747<T> extends FluentIterable<T> {
        public final /* synthetic */ Iterable val$iterable;
        public final /* synthetic */ int val$limitSize;

        public C72747(final Iterable iterable2, final int limitSize2) {
            val$iterable = iterable2;
            val$limitSize = limitSize2;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.limit(val$iterable.iterator(), val$limitSize);
        }
    }

    public static <T> Iterable<T> consumingIterable(final Iterable<T> iterable) {
        Preconditions.checkNotNull(iterable);
        return new FluentIterable<T>() { // from class: com.google.common.collect.Iterables.8
            public final /* synthetic */ Iterable val$iterable;

            public C72758(final Iterable iterable2) {
                val$iterable = iterable2;
            }

            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                Iterable iterable2 = val$iterable;
                if (iterable2 instanceof Queue) {
                    return new ConsumingQueueIterator((Queue) iterable2);
                }
                return Iterators.consumingIterator(iterable2.iterator());
            }

            @Override // com.google.common.collect.FluentIterable
            public String toString() {
                return "Iterables.consumingIterable(...)";
            }
        };
    }

    /* renamed from: com.google.common.collect.Iterables$8 */
    public class C72758<T> extends FluentIterable<T> {
        public final /* synthetic */ Iterable val$iterable;

        public C72758(final Iterable iterable2) {
            val$iterable = iterable2;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            Iterable iterable2 = val$iterable;
            if (iterable2 instanceof Queue) {
                return new ConsumingQueueIterator((Queue) iterable2);
            }
            return Iterators.consumingIterator(iterable2.iterator());
        }

        @Override // com.google.common.collect.FluentIterable
        public String toString() {
            return "Iterables.consumingIterable(...)";
        }
    }

    public static boolean isEmpty(Iterable<?> iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).isEmpty();
        }
        return !iterable.iterator().hasNext();
    }

    public static <T> Iterable<T> mergeSorted(final Iterable<? extends Iterable<? extends T>> iterables, final Comparator<? super T> comparator) {
        Preconditions.checkNotNull(iterables, "iterables");
        Preconditions.checkNotNull(comparator, "comparator");
        return new UnmodifiableIterable(new FluentIterable<T>() { // from class: com.google.common.collect.Iterables.9
            public final /* synthetic */ Comparator val$comparator;
            public final /* synthetic */ Iterable val$iterables;

            public C72769(final Iterable iterables2, final Comparator comparator2) {
                val$iterables = iterables2;
                val$comparator = comparator2;
            }

            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                return Iterators.mergeSorted(Iterables.transform(val$iterables, new FluentIterable$2$$ExternalSyntheticLambda0()), val$comparator);
            }
        });
    }

    /* renamed from: com.google.common.collect.Iterables$9 */
    public class C72769<T> extends FluentIterable<T> {
        public final /* synthetic */ Comparator val$comparator;
        public final /* synthetic */ Iterable val$iterables;

        public C72769(final Iterable iterables2, final Comparator comparator2) {
            val$iterables = iterables2;
            val$comparator = comparator2;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.mergeSorted(Iterables.transform(val$iterables, new FluentIterable$2$$ExternalSyntheticLambda0()), val$comparator);
        }
    }
}
