package com.thoughtworks.xstream.p042io;

import java.util.Iterator;

/* loaded from: classes8.dex */
public class AttributeNameIterator implements Iterator {
    public final int count;
    public int current;
    public final HierarchicalStreamReader reader;

    public AttributeNameIterator(HierarchicalStreamReader hierarchicalStreamReader) {
        this.reader = hierarchicalStreamReader;
        this.count = hierarchicalStreamReader.getAttributeCount();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.current < this.count;
    }

    @Override // java.util.Iterator
    public Object next() {
        HierarchicalStreamReader hierarchicalStreamReader = this.reader;
        int i = this.current;
        this.current = i + 1;
        return hierarchicalStreamReader.getAttributeName(i);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
