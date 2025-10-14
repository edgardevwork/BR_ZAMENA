package com.thoughtworks.xstream.persistence;

import java.util.Iterator;

/* loaded from: classes5.dex */
public interface PersistenceStrategy {
    Object get(Object obj);

    Iterator iterator();

    Object put(Object obj, Object obj2);

    Object remove(Object obj);

    int size();
}
