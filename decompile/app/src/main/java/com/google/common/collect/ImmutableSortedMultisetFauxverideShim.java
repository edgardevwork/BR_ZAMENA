package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ImmutableSortedMultiset;
import com.google.errorprone.annotations.DoNotCall;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes8.dex */
public abstract class ImmutableSortedMultisetFauxverideShim<E> extends ImmutableMultiset<E> {
    @DoNotCall("Use naturalOrder.")
    @Deprecated
    public static <E> ImmutableSortedMultiset.Builder<E> builder() {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    /* renamed from: of */
    public static <E> ImmutableSortedMultiset<E> m1260of(E element) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    /* renamed from: of */
    public static <E> ImmutableSortedMultiset<E> m1261of(E e1, E e2) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    /* renamed from: of */
    public static <E> ImmutableSortedMultiset<E> m1262of(E e1, E e2, E e3) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    /* renamed from: of */
    public static <E> ImmutableSortedMultiset<E> m1263of(E e1, E e2, E e3, E e4) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    /* renamed from: of */
    public static <E> ImmutableSortedMultiset<E> m1264of(E e1, E e2, E e3, E e4, E e5) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    /* renamed from: of */
    public static <E> ImmutableSortedMultiset<E> m1265of(E e1, E e2, E e3, E e4, E e5, E e6, E... remaining) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    public static <E> ImmutableSortedMultiset<E> copyOf(E[] elements) {
        throw new UnsupportedOperationException();
    }
}
