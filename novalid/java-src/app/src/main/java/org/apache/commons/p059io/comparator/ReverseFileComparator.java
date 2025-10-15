package org.apache.commons.p059io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes5.dex */
public class ReverseFileComparator extends AbstractFileComparator implements Serializable {
    public static final long serialVersionUID = -4808255005272229056L;
    public final Comparator<File> delegate;

    public ReverseFileComparator(Comparator<File> comparator) {
        if (comparator == null) {
            throw new IllegalArgumentException("Delegate comparator is missing");
        }
        this.delegate = comparator;
    }

    @Override // java.util.Comparator
    public int compare(File file, File file2) {
        return this.delegate.compare(file2, file);
    }

    @Override // org.apache.commons.p059io.comparator.AbstractFileComparator
    public String toString() {
        return super.toString() + "[" + this.delegate.toString() + "]";
    }
}
