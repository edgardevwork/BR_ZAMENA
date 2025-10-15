package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes8.dex */
public abstract class ForwardingSortedSet<E> extends ForwardingSet<E> implements SortedSet<E> {
    @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract SortedSet<E> delegate();

    @Override // java.util.SortedSet
    @CheckForNull
    public Comparator<? super E> comparator() {
        return delegate().comparator();
    }

    @Override // java.util.SortedSet
    @ParametricNullness
    public E first() {
        return delegate().first();
    }

    @Override // java.util.SortedSet
    public SortedSet<E> headSet(@ParametricNullness E toElement) {
        return delegate().headSet(toElement);
    }

    @Override // java.util.SortedSet
    @ParametricNullness
    public E last() {
        return delegate().last();
    }

    @Override // java.util.SortedSet
    public SortedSet<E> subSet(@ParametricNullness E fromElement, @ParametricNullness E toElement) {
        return delegate().subSet(fromElement, toElement);
    }

    @Override // java.util.SortedSet
    public SortedSet<E> tailSet(@ParametricNullness E fromElement) {
        return delegate().tailSet(fromElement);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ForwardingCollection
    public boolean standardContains(@CheckForNull Object object) {
        try {
            return ForwardingSortedMap.unsafeCompare(comparator(), tailSet(object).first(), object) == 0;
        } catch (ClassCastException | NullPointerException | NoSuchElementException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ForwardingCollection
    public boolean standardRemove(@CheckForNull Object object) {
        try {
            Iterator<E> it = tailSet(object).iterator();
            if (it.hasNext()) {
                if (ForwardingSortedMap.unsafeCompare(comparator(), it.next(), object) == 0) {
                    it.remove();
                    return true;
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public SortedSet<E> standardSubSet(@ParametricNullness E fromElement, @ParametricNullness E toElement) {
        return tailSet(fromElement).headSet(toElement);
    }
}
