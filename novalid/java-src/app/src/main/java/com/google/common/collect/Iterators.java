package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes8.dex */
public final class Iterators {
    public static <T> UnmodifiableIterator<T> emptyIterator() {
        return emptyListIterator();
    }

    public static <T> UnmodifiableListIterator<T> emptyListIterator() {
        return (UnmodifiableListIterator<T>) ArrayItr.EMPTY;
    }

    public enum EmptyModifiableIterator implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            CollectPreconditions.checkRemove(false);
        }
    }

    public static <T> Iterator<T> emptyModifiableIterator() {
        return EmptyModifiableIterator.INSTANCE;
    }

    public static <T> UnmodifiableIterator<T> unmodifiableIterator(Iterator<? extends T> iterator) {
        Preconditions.checkNotNull(iterator);
        if (iterator instanceof UnmodifiableIterator) {
            return (UnmodifiableIterator) iterator;
        }
        return new UnmodifiableIterator<T>() { // from class: com.google.common.collect.Iterators.1
            public final /* synthetic */ Iterator val$iterator;

            public C72771(Iterator iterator2) {
                val$iterator = iterator2;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return val$iterator.hasNext();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                return (T) val$iterator.next();
            }
        };
    }

    /* renamed from: com.google.common.collect.Iterators$1 */
    public class C72771<T> extends UnmodifiableIterator<T> {
        public final /* synthetic */ Iterator val$iterator;

        public C72771(Iterator iterator2) {
            val$iterator = iterator2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return val$iterator.hasNext();
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            return (T) val$iterator.next();
        }
    }

    @Deprecated
    public static <T> UnmodifiableIterator<T> unmodifiableIterator(UnmodifiableIterator<T> iterator) {
        return (UnmodifiableIterator) Preconditions.checkNotNull(iterator);
    }

    public static int size(Iterator<?> iterator) {
        long j = 0;
        while (iterator.hasNext()) {
            iterator.next();
            j++;
        }
        return Ints.saturatedCast(j);
    }

    public static boolean contains(Iterator<?> iterator, @CheckForNull Object element) {
        if (element == null) {
            while (iterator.hasNext()) {
                if (iterator.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (iterator.hasNext()) {
            if (element.equals(iterator.next())) {
                return true;
            }
        }
        return false;
    }

    @CanIgnoreReturnValue
    public static boolean removeAll(Iterator<?> removeFrom, Collection<?> elementsToRemove) {
        Preconditions.checkNotNull(elementsToRemove);
        boolean z = false;
        while (removeFrom.hasNext()) {
            if (elementsToRemove.contains(removeFrom.next())) {
                removeFrom.remove();
                z = true;
            }
        }
        return z;
    }

    @CanIgnoreReturnValue
    public static <T> boolean removeIf(Iterator<T> removeFrom, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(predicate);
        boolean z = false;
        while (removeFrom.hasNext()) {
            if (predicate.apply(removeFrom.next())) {
                removeFrom.remove();
                z = true;
            }
        }
        return z;
    }

    @CanIgnoreReturnValue
    public static boolean retainAll(Iterator<?> removeFrom, Collection<?> elementsToRetain) {
        Preconditions.checkNotNull(elementsToRetain);
        boolean z = false;
        while (removeFrom.hasNext()) {
            if (!elementsToRetain.contains(removeFrom.next())) {
                removeFrom.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean elementsEqual(Iterator<?> iterator1, Iterator<?> iterator2) {
        while (iterator1.hasNext()) {
            if (!iterator2.hasNext() || !Objects.equal(iterator1.next(), iterator2.next())) {
                return false;
            }
        }
        return !iterator2.hasNext();
    }

    public static String toString(Iterator<?> iterator) {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        boolean z = true;
        while (iterator.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(iterator.next());
            z = false;
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    @ParametricNullness
    public static <T> T getOnlyElement(Iterator<T> iterator) {
        T next = iterator.next();
        if (!iterator.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && iterator.hasNext(); i++) {
            sb.append(", ");
            sb.append(iterator.next());
        }
        if (iterator.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    @ParametricNullness
    public static <T> T getOnlyElement(Iterator<? extends T> it, @ParametricNullness T t) {
        return it.hasNext() ? (T) getOnlyElement(it) : t;
    }

    @GwtIncompatible
    public static <T> T[] toArray(Iterator<? extends T> it, Class<T> cls) {
        return (T[]) Iterables.toArray(Lists.newArrayList(it), cls);
    }

    @CanIgnoreReturnValue
    public static <T> boolean addAll(Collection<T> addTo, Iterator<? extends T> iterator) {
        Preconditions.checkNotNull(addTo);
        Preconditions.checkNotNull(iterator);
        boolean zAdd = false;
        while (iterator.hasNext()) {
            zAdd |= addTo.add(iterator.next());
        }
        return zAdd;
    }

    public static int frequency(Iterator<?> iterator, @CheckForNull Object element) {
        int i = 0;
        while (contains(iterator, element)) {
            i++;
        }
        return i;
    }

    /* renamed from: com.google.common.collect.Iterators$2 */
    public class C72802<T> implements Iterator<T> {
        public Iterator<T> iterator = Iterators.emptyModifiableIterator();
        public final /* synthetic */ Iterable val$iterable;

        public C72802(final Iterable val$iterable) {
            val$iterable = val$iterable;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext() || val$iterable.iterator().hasNext();
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            if (!this.iterator.hasNext()) {
                Iterator<T> it = val$iterable.iterator();
                this.iterator = it;
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
            }
            return this.iterator.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.iterator.remove();
        }
    }

    public static <T> Iterator<T> cycle(Iterable<T> iterable) {
        Preconditions.checkNotNull(iterable);
        return new Iterator<T>() { // from class: com.google.common.collect.Iterators.2
            public Iterator<T> iterator = Iterators.emptyModifiableIterator();
            public final /* synthetic */ Iterable val$iterable;

            public C72802(Iterable iterable2) {
                val$iterable = iterable2;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.iterator.hasNext() || val$iterable.iterator().hasNext();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                if (!this.iterator.hasNext()) {
                    Iterator<T> it = val$iterable.iterator();
                    this.iterator = it;
                    if (!it.hasNext()) {
                        throw new NoSuchElementException();
                    }
                }
                return this.iterator.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.iterator.remove();
            }
        };
    }

    @SafeVarargs
    public static <T> Iterator<T> cycle(T... elements) {
        return cycle(Lists.newArrayList(elements));
    }

    /* renamed from: com.google.common.collect.Iterators$3 */
    public class C72813<I> extends UnmodifiableIterator<I> {
        public int index = 0;
        public final /* synthetic */ Iterator[] val$elements;

        public C72813(final Iterator[] val$elements) {
            val$elements = val$elements;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < val$elements.length;
        }

        @Override // java.util.Iterator
        public Iterator next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Iterator it = val$elements[this.index];
            java.util.Objects.requireNonNull(it);
            Iterator it2 = it;
            Iterator[] itArr = val$elements;
            int i = this.index;
            itArr[i] = null;
            this.index = i + 1;
            return it2;
        }
    }

    public static <I extends Iterator<?>> Iterator<I> consumingForArray(I... elements) {
        return new UnmodifiableIterator<I>() { // from class: com.google.common.collect.Iterators.3
            public int index = 0;
            public final /* synthetic */ Iterator[] val$elements;

            public C72813(Iterator[] elements2) {
                val$elements = elements2;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < val$elements.length;
            }

            @Override // java.util.Iterator
            public Iterator next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Iterator it = val$elements[this.index];
                java.util.Objects.requireNonNull(it);
                Iterator it2 = it;
                Iterator[] itArr = val$elements;
                int i = this.index;
                itArr[i] = null;
                this.index = i + 1;
                return it2;
            }
        };
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> a2, Iterator<? extends T> b) {
        Preconditions.checkNotNull(a2);
        Preconditions.checkNotNull(b);
        return concat(consumingForArray(a2, b));
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> a2, Iterator<? extends T> b, Iterator<? extends T> c) {
        Preconditions.checkNotNull(a2);
        Preconditions.checkNotNull(b);
        Preconditions.checkNotNull(c);
        return concat(consumingForArray(a2, b, c));
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> a2, Iterator<? extends T> b, Iterator<? extends T> c, Iterator<? extends T> d) {
        Preconditions.checkNotNull(a2);
        Preconditions.checkNotNull(b);
        Preconditions.checkNotNull(c);
        Preconditions.checkNotNull(d);
        return concat(consumingForArray(a2, b, c, d));
    }

    public static <T> Iterator<T> concat(Iterator<? extends T>... inputs) {
        return concatNoDefensiveCopy((Iterator[]) Arrays.copyOf(inputs, inputs.length));
    }

    public static <T> Iterator<T> concat(Iterator<? extends Iterator<? extends T>> inputs) {
        return new ConcatenatedIterator(inputs);
    }

    public static <T> Iterator<T> concatNoDefensiveCopy(Iterator<? extends T>... inputs) {
        for (Iterator it : (Iterator[]) Preconditions.checkNotNull(inputs)) {
            Preconditions.checkNotNull(it);
        }
        return concat(consumingForArray(inputs));
    }

    public static <T> UnmodifiableIterator<List<T>> partition(Iterator<T> iterator, int size) {
        return partitionImpl(iterator, size, false);
    }

    public static <T> UnmodifiableIterator<List<T>> paddedPartition(Iterator<T> iterator, int size) {
        return partitionImpl(iterator, size, true);
    }

    public static <T> UnmodifiableIterator<List<T>> partitionImpl(Iterator<T> iterator, int size, boolean pad) {
        Preconditions.checkNotNull(iterator);
        Preconditions.checkArgument(size > 0);
        return new UnmodifiableIterator<List<T>>() { // from class: com.google.common.collect.Iterators.4
            public final /* synthetic */ Iterator val$iterator;
            public final /* synthetic */ boolean val$pad;
            public final /* synthetic */ int val$size;

            public C72824(Iterator iterator2, int size2, boolean pad2) {
                val$iterator = iterator2;
                val$size = size2;
                val$pad = pad2;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return val$iterator.hasNext();
            }

            @Override // java.util.Iterator
            public List<T> next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = new Object[val$size];
                int i = 0;
                while (i < val$size && val$iterator.hasNext()) {
                    objArr[i] = val$iterator.next();
                    i++;
                }
                for (int i2 = i; i2 < val$size; i2++) {
                    objArr[i2] = null;
                }
                List<T> listUnmodifiableList = Collections.unmodifiableList(Arrays.asList(objArr));
                return (val$pad || i == val$size) ? listUnmodifiableList : listUnmodifiableList.subList(0, i);
            }
        };
    }

    /* renamed from: com.google.common.collect.Iterators$4 */
    public class C72824<T> extends UnmodifiableIterator<List<T>> {
        public final /* synthetic */ Iterator val$iterator;
        public final /* synthetic */ boolean val$pad;
        public final /* synthetic */ int val$size;

        public C72824(Iterator iterator2, int size2, boolean pad2) {
            val$iterator = iterator2;
            val$size = size2;
            val$pad = pad2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return val$iterator.hasNext();
        }

        @Override // java.util.Iterator
        public List<T> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object[] objArr = new Object[val$size];
            int i = 0;
            while (i < val$size && val$iterator.hasNext()) {
                objArr[i] = val$iterator.next();
                i++;
            }
            for (int i2 = i; i2 < val$size; i2++) {
                objArr[i2] = null;
            }
            List<T> listUnmodifiableList = Collections.unmodifiableList(Arrays.asList(objArr));
            return (val$pad || i == val$size) ? listUnmodifiableList : listUnmodifiableList.subList(0, i);
        }
    }

    public static <T> UnmodifiableIterator<T> filter(Iterator<T> unfiltered, Predicate<? super T> retainIfTrue) {
        Preconditions.checkNotNull(unfiltered);
        Preconditions.checkNotNull(retainIfTrue);
        return new AbstractIterator<T>() { // from class: com.google.common.collect.Iterators.5
            public final /* synthetic */ Predicate val$retainIfTrue;
            public final /* synthetic */ Iterator val$unfiltered;

            public C72835(Iterator unfiltered2, Predicate retainIfTrue2) {
                val$unfiltered = unfiltered2;
                val$retainIfTrue = retainIfTrue2;
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            public T computeNext() {
                while (val$unfiltered.hasNext()) {
                    T t = (T) val$unfiltered.next();
                    if (val$retainIfTrue.apply(t)) {
                        return t;
                    }
                }
                return endOfData();
            }
        };
    }

    /* renamed from: com.google.common.collect.Iterators$5 */
    public class C72835<T> extends AbstractIterator<T> {
        public final /* synthetic */ Predicate val$retainIfTrue;
        public final /* synthetic */ Iterator val$unfiltered;

        public C72835(Iterator unfiltered2, Predicate retainIfTrue2) {
            val$unfiltered = unfiltered2;
            val$retainIfTrue = retainIfTrue2;
        }

        @Override // com.google.common.collect.AbstractIterator
        @CheckForNull
        public T computeNext() {
            while (val$unfiltered.hasNext()) {
                T t = (T) val$unfiltered.next();
                if (val$retainIfTrue.apply(t)) {
                    return t;
                }
            }
            return endOfData();
        }
    }

    @GwtIncompatible
    public static <T> UnmodifiableIterator<T> filter(Iterator<?> unfiltered, Class<T> desiredType) {
        return filter(unfiltered, Predicates.instanceOf(desiredType));
    }

    public static <T> boolean any(Iterator<T> iterator, Predicate<? super T> predicate) {
        return indexOf(iterator, predicate) != -1;
    }

    public static <T> boolean all(Iterator<T> iterator, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(predicate);
        while (iterator.hasNext()) {
            if (!predicate.apply(iterator.next())) {
                return false;
            }
        }
        return true;
    }

    @ParametricNullness
    public static <T> T find(Iterator<T> iterator, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(iterator);
        Preconditions.checkNotNull(predicate);
        while (iterator.hasNext()) {
            T next = iterator.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @CheckForNull
    public static <T> T find(Iterator<? extends T> it, Predicate<? super T> predicate, @CheckForNull T t) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(predicate);
        while (it.hasNext()) {
            T next = it.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        return t;
    }

    public static <T> Optional<T> tryFind(Iterator<T> iterator, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(iterator);
        Preconditions.checkNotNull(predicate);
        while (iterator.hasNext()) {
            T next = iterator.next();
            if (predicate.apply(next)) {
                return Optional.m1145of(next);
            }
        }
        return Optional.absent();
    }

    public static <T> int indexOf(Iterator<T> iterator, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(predicate, "predicate");
        int i = 0;
        while (iterator.hasNext()) {
            if (predicate.apply(iterator.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: com.google.common.collect.Iterators$6 */
    public class C72846<F, T> extends TransformedIterator<F, T> {
        public final /* synthetic */ Function val$function;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C72846(Iterator backingIterator, final Function val$function) {
            super(backingIterator);
            val$function = val$function;
        }

        @Override // com.google.common.collect.TransformedIterator
        @ParametricNullness
        public T transform(@ParametricNullness F f) {
            return (T) val$function.apply(f);
        }
    }

    public static <F, T> Iterator<T> transform(Iterator<F> fromIterator, Function<? super F, ? extends T> function) {
        Preconditions.checkNotNull(function);
        return new TransformedIterator<F, T>(fromIterator) { // from class: com.google.common.collect.Iterators.6
            public final /* synthetic */ Function val$function;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C72846(Iterator fromIterator2, Function function2) {
                super(fromIterator2);
                val$function = function2;
            }

            @Override // com.google.common.collect.TransformedIterator
            @ParametricNullness
            public T transform(@ParametricNullness F f) {
                return (T) val$function.apply(f);
            }
        };
    }

    @ParametricNullness
    public static <T> T get(Iterator<T> iterator, int position) {
        checkNonnegative(position);
        int iAdvance = advance(iterator, position);
        if (!iterator.hasNext()) {
            throw new IndexOutOfBoundsException("position (" + position + ") must be less than the number of elements that remained (" + iAdvance + ")");
        }
        return iterator.next();
    }

    @ParametricNullness
    public static <T> T get(Iterator<? extends T> it, int i, @ParametricNullness T t) {
        checkNonnegative(i);
        advance(it, i);
        return (T) getNext(it, t);
    }

    public static void checkNonnegative(int position) {
        if (position >= 0) {
            return;
        }
        throw new IndexOutOfBoundsException("position (" + position + ") must not be negative");
    }

    @ParametricNullness
    public static <T> T getNext(Iterator<? extends T> iterator, @ParametricNullness T defaultValue) {
        return iterator.hasNext() ? iterator.next() : defaultValue;
    }

    @ParametricNullness
    public static <T> T getLast(Iterator<T> iterator) {
        T next;
        do {
            next = iterator.next();
        } while (iterator.hasNext());
        return next;
    }

    @ParametricNullness
    public static <T> T getLast(Iterator<? extends T> it, @ParametricNullness T t) {
        return it.hasNext() ? (T) getLast(it) : t;
    }

    @CanIgnoreReturnValue
    public static int advance(Iterator<?> iterator, int numberToAdvance) {
        Preconditions.checkNotNull(iterator);
        int i = 0;
        Preconditions.checkArgument(numberToAdvance >= 0, "numberToAdvance must be nonnegative");
        while (i < numberToAdvance && iterator.hasNext()) {
            iterator.next();
            i++;
        }
        return i;
    }

    public static <T> Iterator<T> limit(Iterator<T> iterator, int limitSize) {
        Preconditions.checkNotNull(iterator);
        Preconditions.checkArgument(limitSize >= 0, "limit is negative");
        return new Iterator<T>() { // from class: com.google.common.collect.Iterators.7
            public int count;
            public final /* synthetic */ Iterator val$iterator;
            public final /* synthetic */ int val$limitSize;

            public C72857(int limitSize2, Iterator iterator2) {
                val$limitSize = limitSize2;
                val$iterator = iterator2;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.count < val$limitSize && val$iterator.hasNext();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.count++;
                return (T) val$iterator.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                val$iterator.remove();
            }
        };
    }

    /* renamed from: com.google.common.collect.Iterators$7 */
    public class C72857<T> implements Iterator<T> {
        public int count;
        public final /* synthetic */ Iterator val$iterator;
        public final /* synthetic */ int val$limitSize;

        public C72857(int limitSize2, Iterator iterator2) {
            val$limitSize = limitSize2;
            val$iterator = iterator2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.count < val$limitSize && val$iterator.hasNext();
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.count++;
            return (T) val$iterator.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            val$iterator.remove();
        }
    }

    /* renamed from: com.google.common.collect.Iterators$8 */
    public class C72868<T> extends UnmodifiableIterator<T> {
        public final /* synthetic */ Iterator val$iterator;

        public C72868(final Iterator val$iterator) {
            val$iterator = val$iterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return val$iterator.hasNext();
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            T t = (T) val$iterator.next();
            val$iterator.remove();
            return t;
        }

        public String toString() {
            return "Iterators.consumingIterator(...)";
        }
    }

    public static <T> Iterator<T> consumingIterator(Iterator<T> iterator) {
        Preconditions.checkNotNull(iterator);
        return new UnmodifiableIterator<T>() { // from class: com.google.common.collect.Iterators.8
            public final /* synthetic */ Iterator val$iterator;

            public C72868(Iterator iterator2) {
                val$iterator = iterator2;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return val$iterator.hasNext();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                T t = (T) val$iterator.next();
                val$iterator.remove();
                return t;
            }

            public String toString() {
                return "Iterators.consumingIterator(...)";
            }
        };
    }

    @CheckForNull
    public static <T> T pollNext(Iterator<T> iterator) {
        if (!iterator.hasNext()) {
            return null;
        }
        T next = iterator.next();
        iterator.remove();
        return next;
    }

    public static void clear(Iterator<?> iterator) {
        Preconditions.checkNotNull(iterator);
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }

    @SafeVarargs
    public static <T> UnmodifiableIterator<T> forArray(T... array) {
        return forArray(array, 0, array.length, 0);
    }

    public static <T> UnmodifiableListIterator<T> forArray(T[] array, int offset, int length, int index) {
        Preconditions.checkArgument(length >= 0);
        Preconditions.checkPositionIndexes(offset, offset + length, array.length);
        Preconditions.checkPositionIndex(index, length);
        if (length == 0) {
            return emptyListIterator();
        }
        return new ArrayItr(array, offset, length, index);
    }

    public static final class ArrayItr<T> extends AbstractIndexedListIterator<T> {
        public static final UnmodifiableListIterator<Object> EMPTY = new ArrayItr(new Object[0], 0, 0, 0);
        public final T[] array;
        public final int offset;

        public ArrayItr(T[] array, int offset, int length, int index) {
            super(length, index);
            this.array = array;
            this.offset = offset;
        }

        @Override // com.google.common.collect.AbstractIndexedListIterator
        @ParametricNullness
        public T get(int index) {
            return this.array[this.offset + index];
        }
    }

    /* renamed from: com.google.common.collect.Iterators$9 */
    public class C72879<T> extends UnmodifiableIterator<T> {
        public boolean done;
        public final /* synthetic */ Object val$value;

        public C72879(final Object val$value) {
            val$value = val$value;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.done;
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            if (this.done) {
                throw new NoSuchElementException();
            }
            this.done = true;
            return (T) val$value;
        }
    }

    public static <T> UnmodifiableIterator<T> singletonIterator(@ParametricNullness T value) {
        return new UnmodifiableIterator<T>() { // from class: com.google.common.collect.Iterators.9
            public boolean done;
            public final /* synthetic */ Object val$value;

            public C72879(Object value2) {
                val$value = value2;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return !this.done;
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                if (this.done) {
                    throw new NoSuchElementException();
                }
                this.done = true;
                return (T) val$value;
            }
        };
    }

    /* renamed from: com.google.common.collect.Iterators$10 */
    public class C727810<T> extends UnmodifiableIterator<T> {
        public final /* synthetic */ Enumeration val$enumeration;

        public C727810(final Enumeration val$enumeration) {
            val$enumeration = val$enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return val$enumeration.hasMoreElements();
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            return (T) val$enumeration.nextElement();
        }
    }

    public static <T> UnmodifiableIterator<T> forEnumeration(Enumeration<T> enumeration) {
        Preconditions.checkNotNull(enumeration);
        return new UnmodifiableIterator<T>() { // from class: com.google.common.collect.Iterators.10
            public final /* synthetic */ Enumeration val$enumeration;

            public C727810(Enumeration enumeration2) {
                val$enumeration = enumeration2;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return val$enumeration.hasMoreElements();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                return (T) val$enumeration.nextElement();
            }
        };
    }

    /* renamed from: com.google.common.collect.Iterators$11 */
    public class C727911<T> implements Enumeration<T> {
        public final /* synthetic */ Iterator val$iterator;

        public C727911(final Iterator val$iterator) {
            val$iterator = val$iterator;
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return val$iterator.hasNext();
        }

        @Override // java.util.Enumeration
        @ParametricNullness
        public T nextElement() {
            return (T) val$iterator.next();
        }
    }

    public static <T> Enumeration<T> asEnumeration(Iterator<T> iterator) {
        Preconditions.checkNotNull(iterator);
        return new Enumeration<T>() { // from class: com.google.common.collect.Iterators.11
            public final /* synthetic */ Iterator val$iterator;

            public C727911(Iterator iterator2) {
                val$iterator = iterator2;
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return val$iterator.hasNext();
            }

            @Override // java.util.Enumeration
            @ParametricNullness
            public T nextElement() {
                return (T) val$iterator.next();
            }
        };
    }

    public static class PeekingImpl<E> implements PeekingIterator<E> {
        public boolean hasPeeked;
        public final Iterator<? extends E> iterator;

        @CheckForNull
        public E peekedElement;

        public PeekingImpl(Iterator<? extends E> iterator) {
            this.iterator = (Iterator) Preconditions.checkNotNull(iterator);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.hasPeeked || this.iterator.hasNext();
        }

        @Override // com.google.common.collect.PeekingIterator, java.util.Iterator
        @ParametricNullness
        public E next() {
            if (!this.hasPeeked) {
                return this.iterator.next();
            }
            E e = (E) NullnessCasts.uncheckedCastNullableTToT(this.peekedElement);
            this.hasPeeked = false;
            this.peekedElement = null;
            return e;
        }

        @Override // com.google.common.collect.PeekingIterator, java.util.Iterator
        public void remove() {
            Preconditions.checkState(!this.hasPeeked, "Can't remove after you've peeked at next");
            this.iterator.remove();
        }

        @Override // com.google.common.collect.PeekingIterator
        @ParametricNullness
        public E peek() {
            if (!this.hasPeeked) {
                this.peekedElement = this.iterator.next();
                this.hasPeeked = true;
            }
            return (E) NullnessCasts.uncheckedCastNullableTToT(this.peekedElement);
        }
    }

    public static <T> PeekingIterator<T> peekingIterator(Iterator<? extends T> iterator) {
        if (iterator instanceof PeekingImpl) {
            return (PeekingImpl) iterator;
        }
        return new PeekingImpl(iterator);
    }

    @Deprecated
    public static <T> PeekingIterator<T> peekingIterator(PeekingIterator<T> iterator) {
        return (PeekingIterator) Preconditions.checkNotNull(iterator);
    }

    public static <T> UnmodifiableIterator<T> mergeSorted(Iterable<? extends Iterator<? extends T>> iterators, Comparator<? super T> comparator) {
        Preconditions.checkNotNull(iterators, "iterators");
        Preconditions.checkNotNull(comparator, "comparator");
        return new MergingIterator(iterators, comparator);
    }

    public static class MergingIterator<T> extends UnmodifiableIterator<T> {
        public final Queue<PeekingIterator<T>> queue;

        public MergingIterator(Iterable<? extends Iterator<? extends T>> iterators, final Comparator<? super T> itemComparator) {
            this.queue = new PriorityQueue(2, new Comparator() { // from class: com.google.common.collect.Iterators$MergingIterator$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Iterators.MergingIterator.lambda$new$0(itemComparator, (PeekingIterator) obj, (PeekingIterator) obj2);
                }
            });
            for (Iterator<? extends T> it : iterators) {
                if (it.hasNext()) {
                    this.queue.add(Iterators.peekingIterator(it));
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ int lambda$new$0(Comparator comparator, PeekingIterator peekingIterator, PeekingIterator peekingIterator2) {
            return comparator.compare(peekingIterator.peek(), peekingIterator2.peek());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.queue.isEmpty();
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            PeekingIterator<T> peekingIteratorRemove = this.queue.remove();
            T next = peekingIteratorRemove.next();
            if (peekingIteratorRemove.hasNext()) {
                this.queue.add(peekingIteratorRemove);
            }
            return next;
        }
    }

    public static class ConcatenatedIterator<T> implements Iterator<T> {
        public Iterator<? extends T> iterator = Iterators.emptyIterator();

        @CheckForNull
        public Deque<Iterator<? extends Iterator<? extends T>>> metaIterators;

        @CheckForNull
        public Iterator<? extends T> toRemove;

        @CheckForNull
        public Iterator<? extends Iterator<? extends T>> topMetaIterator;

        public ConcatenatedIterator(Iterator<? extends Iterator<? extends T>> metaIterator) {
            this.topMetaIterator = (Iterator) Preconditions.checkNotNull(metaIterator);
        }

        @CheckForNull
        public final Iterator<? extends Iterator<? extends T>> getTopMetaIterator() {
            while (true) {
                Iterator<? extends Iterator<? extends T>> it = this.topMetaIterator;
                if (it == null || !it.hasNext()) {
                    Deque<Iterator<? extends Iterator<? extends T>>> deque = this.metaIterators;
                    if (deque == null || deque.isEmpty()) {
                        return null;
                    }
                    this.topMetaIterator = this.metaIterators.removeFirst();
                } else {
                    return this.topMetaIterator;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!((Iterator) Preconditions.checkNotNull(this.iterator)).hasNext()) {
                Iterator<? extends Iterator<? extends T>> topMetaIterator = getTopMetaIterator();
                this.topMetaIterator = topMetaIterator;
                if (topMetaIterator == null) {
                    return false;
                }
                Iterator<? extends T> next = topMetaIterator.next();
                this.iterator = next;
                if (next instanceof ConcatenatedIterator) {
                    ConcatenatedIterator concatenatedIterator = (ConcatenatedIterator) next;
                    this.iterator = concatenatedIterator.iterator;
                    if (this.metaIterators == null) {
                        this.metaIterators = new ArrayDeque();
                    }
                    this.metaIterators.addFirst(this.topMetaIterator);
                    if (concatenatedIterator.metaIterators != null) {
                        while (!concatenatedIterator.metaIterators.isEmpty()) {
                            this.metaIterators.addFirst(concatenatedIterator.metaIterators.removeLast());
                        }
                    }
                    this.topMetaIterator = concatenatedIterator.topMetaIterator;
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            if (hasNext()) {
                Iterator<? extends T> it = this.iterator;
                this.toRemove = it;
                return it.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            Iterator<? extends T> it = this.toRemove;
            if (it == null) {
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
            it.remove();
            this.toRemove = null;
        }
    }

    public static <T> ListIterator<T> cast(Iterator<T> iterator) {
        return (ListIterator) iterator;
    }
}
