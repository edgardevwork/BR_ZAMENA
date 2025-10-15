package com.thoughtworks.xstream.core.util;

import java.lang.reflect.Array;
import java.util.Iterator;

/* loaded from: classes8.dex */
public class ArrayIterator implements Iterator {
    public final Object array;
    public int idx;
    public int length;

    public ArrayIterator(Object obj) {
        this.array = obj;
        this.length = Array.getLength(obj);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.idx < this.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        Object obj = this.array;
        int i = this.idx;
        this.idx = i + 1;
        return Array.get(obj, i);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Remove from array");
    }
}
