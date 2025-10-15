package com.thoughtworks.xstream.persistence;

import java.util.AbstractList;

/* loaded from: classes5.dex */
public class XmlArrayList extends AbstractList {
    public final XmlMap map;

    public XmlArrayList(PersistenceStrategy persistenceStrategy) {
        this.map = new XmlMap(persistenceStrategy);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.map.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        rangeCheck(i);
        Object obj2 = get(i);
        this.map.put(new Integer(i), obj);
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        int size = size();
        if (i >= size + 1 || i < 0) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Index: ");
            stringBuffer.append(i);
            stringBuffer.append(", Size: ");
            stringBuffer.append(size);
            throw new IndexOutOfBoundsException(stringBuffer.toString());
        }
        int i2 = i != size ? i - 1 : i;
        while (size > i2) {
            this.map.put(new Integer(size + 1), this.map.get(new Integer(size)));
            size--;
        }
        this.map.put(new Integer(i), obj);
    }

    public final void rangeCheck(int i) {
        int size = size();
        if (i >= size || i < 0) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Index: ");
            stringBuffer.append(i);
            stringBuffer.append(", Size: ");
            stringBuffer.append(size);
            throw new IndexOutOfBoundsException(stringBuffer.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        rangeCheck(i);
        return this.map.get(new Integer(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i) {
        int size = size();
        rangeCheck(i);
        Object obj = this.map.get(new Integer(i));
        while (true) {
            int i2 = size - 1;
            if (i < i2) {
                XmlMap xmlMap = this.map;
                Integer num = new Integer(i);
                i++;
                xmlMap.put(num, this.map.get(new Integer(i)));
            } else {
                this.map.remove(new Integer(i2));
                return obj;
            }
        }
    }
}
