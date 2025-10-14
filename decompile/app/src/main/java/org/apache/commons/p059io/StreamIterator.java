package org.apache.commons.p059io;

import java.io.Closeable;
import java.util.Iterator;
import java.util.Objects;
import java.util.stream.Stream;

/* loaded from: classes8.dex */
public class StreamIterator<E> implements Iterator<E>, Closeable {
    public final Iterator<E> iterator;
    public final Stream<E> stream;

    public static <T> Iterator<T> iterator(Stream<T> stream) {
        return new StreamIterator(stream).iterator;
    }

    public StreamIterator(Stream<E> stream) {
        Objects.requireNonNull(stream, "stream");
        this.stream = stream;
        this.iterator = stream.iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        boolean zHasNext = this.iterator.hasNext();
        if (!zHasNext) {
            close();
        }
        return zHasNext;
    }

    @Override // java.util.Iterator
    public E next() {
        E next = this.iterator.next();
        if (next == null) {
            close();
        }
        return next;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.stream.close();
    }
}
