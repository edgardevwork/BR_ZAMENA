package com.thoughtworks.xstream.persistence;

import java.util.AbstractSet;
import java.util.Iterator;

/* loaded from: classes5.dex */
public class XmlSet extends AbstractSet {
    public final XmlMap map;

    public XmlSet(PersistenceStrategy persistenceStrategy) {
        this.map = new XmlMap(persistenceStrategy);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.map.values().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.map.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        if (this.map.containsValue(obj)) {
            return false;
        }
        this.map.put(findEmptyKey(), obj);
        return true;
    }

    public final Long findEmptyKey() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (this.map.containsKey(new Long(jCurrentTimeMillis))) {
            jCurrentTimeMillis++;
        }
        return new Long(jCurrentTimeMillis);
    }
}
