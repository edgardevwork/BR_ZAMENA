package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.InlineMe;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes8.dex */
public abstract class FluentIterable<E> implements Iterable<E> {
    public final Optional<Iterable<E>> iterableDelegate;

    public FluentIterable() {
        this.iterableDelegate = Optional.absent();
    }

    public FluentIterable(Iterable<E> iterable) {
        this.iterableDelegate = Optional.m1145of(iterable);
    }

    public final Iterable<E> getDelegate() {
        return this.iterableDelegate.mo1139or((Optional<Iterable<E>>) this);
    }

    public static <E> FluentIterable<E> from(final Iterable<E> iterable) {
        if (iterable instanceof FluentIterable) {
            return (FluentIterable) iterable;
        }
        return new FluentIterable<E>(iterable) { // from class: com.google.common.collect.FluentIterable.1
            public final /* synthetic */ Iterable val$iterable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C72451(final Iterable iterable2, final Iterable iterable22) {
                super(iterable22);
                val$iterable = iterable22;
            }

            @Override // java.lang.Iterable
            public Iterator<E> iterator() {
                return val$iterable.iterator();
            }
        };
    }

    /* renamed from: com.google.common.collect.FluentIterable$1 */
    public class C72451 extends FluentIterable<E> {
        public final /* synthetic */ Iterable val$iterable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C72451(final Iterable iterable22, final Iterable iterable222) {
            super(iterable222);
            val$iterable = iterable222;
        }

        @Override // java.lang.Iterable
        public Iterator<E> iterator() {
            return val$iterable.iterator();
        }
    }

    public static <E> FluentIterable<E> from(E[] elements) {
        return from(Arrays.asList(elements));
    }

    @InlineMe(replacement = "checkNotNull(iterable)", staticImports = {"com.google.common.base.Preconditions.checkNotNull"})
    @Deprecated
    public static <E> FluentIterable<E> from(FluentIterable<E> iterable) {
        return (FluentIterable) Preconditions.checkNotNull(iterable);
    }

    public static <T> FluentIterable<T> concat(Iterable<? extends T> a2, Iterable<? extends T> b) {
        return concatNoDefensiveCopy(a2, b);
    }

    public static <T> FluentIterable<T> concat(Iterable<? extends T> a2, Iterable<? extends T> b, Iterable<? extends T> c) {
        return concatNoDefensiveCopy(a2, b, c);
    }

    public static <T> FluentIterable<T> concat(Iterable<? extends T> a2, Iterable<? extends T> b, Iterable<? extends T> c, Iterable<? extends T> d) {
        return concatNoDefensiveCopy(a2, b, c, d);
    }

    public static <T> FluentIterable<T> concat(Iterable<? extends T>... inputs) {
        return concatNoDefensiveCopy((Iterable[]) Arrays.copyOf(inputs, inputs.length));
    }

    /* renamed from: com.google.common.collect.FluentIterable$2 */
    public class C72462<T> extends FluentIterable<T> {
        public final /* synthetic */ Iterable val$inputs;

        public C72462(final Iterable val$inputs) {
            val$inputs = val$inputs;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.concat(Iterators.transform(val$inputs.iterator(), new FluentIterable$2$$ExternalSyntheticLambda0()));
        }
    }

    public static <T> FluentIterable<T> concat(final Iterable<? extends Iterable<? extends T>> inputs) {
        Preconditions.checkNotNull(inputs);
        return new FluentIterable<T>() { // from class: com.google.common.collect.FluentIterable.2
            public final /* synthetic */ Iterable val$inputs;

            public C72462(final Iterable inputs2) {
                val$inputs = inputs2;
            }

            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                return Iterators.concat(Iterators.transform(val$inputs.iterator(), new FluentIterable$2$$ExternalSyntheticLambda0()));
            }
        };
    }

    public static <T> FluentIterable<T> concatNoDefensiveCopy(final Iterable<? extends T>... inputs) {
        for (Iterable<? extends T> iterable : inputs) {
            Preconditions.checkNotNull(iterable);
        }
        return new FluentIterable<T>() { // from class: com.google.common.collect.FluentIterable.3
            public final /* synthetic */ Iterable[] val$inputs;

            public C72473(final Iterable[] inputs2) {
                val$inputs = inputs2;
            }

            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                return Iterators.concat(new AbstractIndexedListIterator<Iterator<? extends T>>(val$inputs.length) { // from class: com.google.common.collect.FluentIterable.3.1
                    public AnonymousClass1(int size) {
                        super(size);
                    }

                    @Override // com.google.common.collect.AbstractIndexedListIterator
                    public Iterator<? extends T> get(int i) {
                        return val$inputs[i].iterator();
                    }
                });
            }

            /* renamed from: com.google.common.collect.FluentIterable$3$1 */
            public class AnonymousClass1 extends AbstractIndexedListIterator<Iterator<? extends T>> {
                public AnonymousClass1(int size) {
                    super(size);
                }

                @Override // com.google.common.collect.AbstractIndexedListIterator
                public Iterator<? extends T> get(int i) {
                    return val$inputs[i].iterator();
                }
            }
        };
    }

    /* renamed from: com.google.common.collect.FluentIterable$3 */
    public class C72473<T> extends FluentIterable<T> {
        public final /* synthetic */ Iterable[] val$inputs;

        public C72473(final Iterable[] inputs2) {
            val$inputs = inputs2;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.concat(new AbstractIndexedListIterator<Iterator<? extends T>>(val$inputs.length) { // from class: com.google.common.collect.FluentIterable.3.1
                public AnonymousClass1(int size) {
                    super(size);
                }

                @Override // com.google.common.collect.AbstractIndexedListIterator
                public Iterator<? extends T> get(int i) {
                    return val$inputs[i].iterator();
                }
            });
        }

        /* renamed from: com.google.common.collect.FluentIterable$3$1 */
        public class AnonymousClass1 extends AbstractIndexedListIterator<Iterator<? extends T>> {
            public AnonymousClass1(int size) {
                super(size);
            }

            @Override // com.google.common.collect.AbstractIndexedListIterator
            public Iterator<? extends T> get(int i) {
                return val$inputs[i].iterator();
            }
        }
    }

    /* renamed from: of */
    public static <E> FluentIterable<E> m1156of() {
        return from(Collections.emptyList());
    }

    /* renamed from: of */
    public static <E> FluentIterable<E> m1157of(@ParametricNullness E element, E... elements) {
        return from(Lists.asList(element, elements));
    }

    public String toString() {
        return Iterables.toString(getDelegate());
    }

    public final int size() {
        return Iterables.size(getDelegate());
    }

    public final boolean contains(@CheckForNull Object target) {
        return Iterables.contains(getDelegate(), target);
    }

    public final FluentIterable<E> cycle() {
        return from(Iterables.cycle(getDelegate()));
    }

    public final FluentIterable<E> append(Iterable<? extends E> other) {
        return concat(getDelegate(), other);
    }

    public final FluentIterable<E> append(E... elements) {
        return concat(getDelegate(), Arrays.asList(elements));
    }

    public final FluentIterable<E> filter(Predicate<? super E> predicate) {
        return from(Iterables.filter(getDelegate(), predicate));
    }

    @GwtIncompatible
    public final <T> FluentIterable<T> filter(Class<T> type) {
        return from(Iterables.filter((Iterable<?>) getDelegate(), (Class) type));
    }

    public final boolean anyMatch(Predicate<? super E> predicate) {
        return Iterables.any(getDelegate(), predicate);
    }

    public final boolean allMatch(Predicate<? super E> predicate) {
        return Iterables.all(getDelegate(), predicate);
    }

    public final Optional<E> firstMatch(Predicate<? super E> predicate) {
        return Iterables.tryFind(getDelegate(), predicate);
    }

    public final <T> FluentIterable<T> transform(Function<? super E, T> function) {
        return from(Iterables.transform(getDelegate(), function));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> FluentIterable<T> transformAndConcat(Function<? super E, ? extends Iterable<? extends T>> function) {
        return concat(transform(function));
    }

    public final Optional<E> first() {
        Iterator<E> it = getDelegate().iterator();
        return it.hasNext() ? Optional.m1145of(it.next()) : Optional.absent();
    }

    public final Optional<E> last() {
        E next;
        Iterable<E> delegate = getDelegate();
        if (delegate instanceof List) {
            List list = (List) delegate;
            if (list.isEmpty()) {
                return Optional.absent();
            }
            return Optional.m1145of(list.get(list.size() - 1));
        }
        Iterator<E> it = delegate.iterator();
        if (!it.hasNext()) {
            return Optional.absent();
        }
        if (delegate instanceof SortedSet) {
            return Optional.m1145of(((SortedSet) delegate).last());
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return Optional.m1145of(next);
    }

    public final FluentIterable<E> skip(int numberToSkip) {
        return from(Iterables.skip(getDelegate(), numberToSkip));
    }

    public final FluentIterable<E> limit(int maxSize) {
        return from(Iterables.limit(getDelegate(), maxSize));
    }

    public final boolean isEmpty() {
        return !getDelegate().iterator().hasNext();
    }

    public final ImmutableList<E> toList() {
        return ImmutableList.copyOf(getDelegate());
    }

    public final ImmutableList<E> toSortedList(Comparator<? super E> comparator) {
        return Ordering.from(comparator).immutableSortedCopy(getDelegate());
    }

    public final ImmutableSet<E> toSet() {
        return ImmutableSet.copyOf(getDelegate());
    }

    public final ImmutableSortedSet<E> toSortedSet(Comparator<? super E> comparator) {
        return ImmutableSortedSet.copyOf(comparator, getDelegate());
    }

    public final ImmutableMultiset<E> toMultiset() {
        return ImmutableMultiset.copyOf(getDelegate());
    }

    public final <V> ImmutableMap<E, V> toMap(Function<? super E, V> valueFunction) {
        return Maps.toMap(getDelegate(), valueFunction);
    }

    public final <K> ImmutableListMultimap<K, E> index(Function<? super E, K> keyFunction) {
        return Multimaps.index(getDelegate(), keyFunction);
    }

    public final <K> ImmutableMap<K, E> uniqueIndex(Function<? super E, K> keyFunction) {
        return Maps.uniqueIndex(getDelegate(), keyFunction);
    }

    @GwtIncompatible
    public final E[] toArray(Class<E> cls) {
        return (E[]) Iterables.toArray(getDelegate(), cls);
    }

    @CanIgnoreReturnValue
    public final <C extends Collection<? super E>> C copyInto(C collection) {
        Preconditions.checkNotNull(collection);
        Iterable<E> delegate = getDelegate();
        if (delegate instanceof Collection) {
            collection.addAll((Collection) delegate);
        } else {
            Iterator<E> it = delegate.iterator();
            while (it.hasNext()) {
                collection.add(it.next());
            }
        }
        return collection;
    }

    public final String join(Joiner joiner) {
        return joiner.join(this);
    }

    @ParametricNullness
    public final E get(int i) {
        return (E) Iterables.get(getDelegate(), i);
    }

    public static class FromIterableFunction<E> implements Function<Iterable<E>, FluentIterable<E>> {
        @Override // com.google.common.base.Function
        public FluentIterable<E> apply(Iterable<E> fromObject) {
            return FluentIterable.from(fromObject);
        }
    }
}
