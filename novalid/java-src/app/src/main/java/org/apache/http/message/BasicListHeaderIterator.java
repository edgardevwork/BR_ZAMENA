package org.apache.http.message;

import java.util.List;
import java.util.NoSuchElementException;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

/* loaded from: classes8.dex */
public class BasicListHeaderIterator implements HeaderIterator {
    public final List<Header> allHeaders;
    public String headerName;
    public int currentIndex = findNext(-1);
    public int lastIndex = -1;

    public BasicListHeaderIterator(List<Header> list, String str) {
        this.allHeaders = (List) Args.notNull(list, "Header list");
        this.headerName = str;
    }

    public int findNext(int i) {
        if (i < -1) {
            return -1;
        }
        int size = this.allHeaders.size() - 1;
        boolean zFilterHeader = false;
        while (!zFilterHeader && i < size) {
            i++;
            zFilterHeader = filterHeader(i);
        }
        if (zFilterHeader) {
            return i;
        }
        return -1;
    }

    public boolean filterHeader(int i) {
        if (this.headerName == null) {
            return true;
        }
        return this.headerName.equalsIgnoreCase(this.allHeaders.get(i).getName());
    }

    @Override // org.apache.http.HeaderIterator, java.util.Iterator
    public boolean hasNext() {
        return this.currentIndex >= 0;
    }

    @Override // org.apache.http.HeaderIterator
    public Header nextHeader() throws NoSuchElementException {
        int i = this.currentIndex;
        if (i < 0) {
            throw new NoSuchElementException("Iteration already finished.");
        }
        this.lastIndex = i;
        this.currentIndex = findNext(i);
        return this.allHeaders.get(i);
    }

    @Override // java.util.Iterator
    public final Object next() throws NoSuchElementException {
        return nextHeader();
    }

    @Override // java.util.Iterator
    public void remove() throws UnsupportedOperationException {
        Asserts.check(this.lastIndex >= 0, "No header to remove");
        this.allHeaders.remove(this.lastIndex);
        this.lastIndex = -1;
        this.currentIndex--;
    }
}
