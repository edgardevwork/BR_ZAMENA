package org.apache.http;

import java.util.Iterator;

/* loaded from: classes8.dex */
public interface HeaderElementIterator extends Iterator<Object> {
    @Override // java.util.Iterator
    boolean hasNext();

    HeaderElement nextElement();
}
