package com.google.common.collect;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompatibleWith;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public interface Multiset<E> extends Collection<E> {

    public interface Entry<E> {
        boolean equals(@CheckForNull Object o);

        int getCount();

        @ParametricNullness
        E getElement();

        int hashCode();

        String toString();
    }

    @CanIgnoreReturnValue
    int add(@ParametricNullness E element, int occurrences);

    @CanIgnoreReturnValue
    boolean add(@ParametricNullness E element);

    boolean contains(@CheckForNull Object element);

    @Override // java.util.Collection
    boolean containsAll(Collection<?> elements);

    int count(@CheckForNull @CompatibleWith(ExifInterface.LONGITUDE_EAST) Object element);

    Set<E> elementSet();

    Set<Entry<E>> entrySet();

    boolean equals(@CheckForNull Object object);

    int hashCode();

    Iterator<E> iterator();

    @CanIgnoreReturnValue
    int remove(@CheckForNull @CompatibleWith(ExifInterface.LONGITUDE_EAST) Object element, int occurrences);

    @CanIgnoreReturnValue
    boolean remove(@CheckForNull Object element);

    @CanIgnoreReturnValue
    boolean removeAll(Collection<?> c);

    @CanIgnoreReturnValue
    boolean retainAll(Collection<?> c);

    @CanIgnoreReturnValue
    int setCount(@ParametricNullness E element, int count);

    @CanIgnoreReturnValue
    boolean setCount(@ParametricNullness E element, int oldCount, int newCount);

    int size();

    String toString();
}
