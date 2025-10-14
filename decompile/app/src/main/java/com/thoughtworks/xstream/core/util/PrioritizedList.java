package com.thoughtworks.xstream.core.util;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes8.dex */
public class PrioritizedList {
    public final Set set = new TreeSet();
    public int lowestPriority = Integer.MAX_VALUE;
    public int lastId = 0;

    public void add(Object obj, int i) {
        if (this.lowestPriority > i) {
            this.lowestPriority = i;
        }
        Set set = this.set;
        int i2 = this.lastId + 1;
        this.lastId = i2;
        set.add(new PrioritizedItem(obj, i, i2));
    }

    public Iterator iterator() {
        return new PrioritizedItemIterator(this.set.iterator());
    }

    public static class PrioritizedItem implements Comparable {

        /* renamed from: id */
        public final int f5907id;
        public final int priority;
        public final Object value;

        public PrioritizedItem(Object obj, int i, int i2) {
            this.value = obj;
            this.priority = i;
            this.f5907id = i2;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            PrioritizedItem prioritizedItem = (PrioritizedItem) obj;
            int i = this.priority;
            int i2 = prioritizedItem.priority;
            return i != i2 ? i2 - i : prioritizedItem.f5907id - this.f5907id;
        }

        public boolean equals(Object obj) {
            return this.f5907id == ((PrioritizedItem) obj).f5907id;
        }
    }

    public static class PrioritizedItemIterator implements Iterator {
        public Iterator iterator;

        public PrioritizedItemIterator(Iterator it) {
            this.iterator = it;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return ((PrioritizedItem) this.iterator.next()).value;
        }
    }
}
