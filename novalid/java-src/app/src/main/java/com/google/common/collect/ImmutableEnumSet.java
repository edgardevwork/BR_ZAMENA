package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Collection;
import java.util.EnumSet;
import javax.annotation.CheckForNull;

@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes8.dex */
public final class ImmutableEnumSet<E extends Enum<E>> extends ImmutableSet<E> {
    public final transient EnumSet<E> delegate;

    @LazyInit
    public transient int hashCode;

    @Override // com.google.common.collect.ImmutableSet
    public boolean isHashCodeFast() {
        return true;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return false;
    }

    public static <E extends Enum<E>> ImmutableSet<E> asImmutable(EnumSet<E> set) {
        int size = set.size();
        if (size == 0) {
            return ImmutableSet.m1218of();
        }
        if (size == 1) {
            return ImmutableSet.m1219of((Enum) Iterables.getOnlyElement(set));
        }
        return new ImmutableEnumSet(set);
    }

    public ImmutableEnumSet(EnumSet<E> delegate) {
        this.delegate = delegate;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public UnmodifiableIterator<E> iterator() {
        return Iterators.unmodifiableIterator(this.delegate.iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.delegate.size();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object object) {
        return this.delegate.contains(object);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof ImmutableEnumSet) {
            collection = ((ImmutableEnumSet) collection).delegate;
        }
        return this.delegate.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.delegate.isEmpty();
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof ImmutableEnumSet) {
            object = ((ImmutableEnumSet) object).delegate;
        }
        return this.delegate.equals(object);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.delegate.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return this.delegate.toString();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    public Object writeReplace() {
        return new EnumSerializedForm(this.delegate);
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @J2ktIncompatible
    public static class EnumSerializedForm<E extends Enum<E>> implements Serializable {
        public static final long serialVersionUID = 0;
        public final EnumSet<E> delegate;

        public EnumSerializedForm(EnumSet<E> delegate) {
            this.delegate = delegate;
        }

        public Object readResolve() {
            return new ImmutableEnumSet(this.delegate.clone());
        }
    }
}
