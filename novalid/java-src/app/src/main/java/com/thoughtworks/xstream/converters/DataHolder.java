package com.thoughtworks.xstream.converters;

import java.util.Iterator;

/* loaded from: classes5.dex */
public interface DataHolder {
    Object get(Object obj);

    Iterator keys();

    void put(Object obj, Object obj2);
}
