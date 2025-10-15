package org.apache.commons.p059io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes5.dex */
public class DefaultFileComparator extends AbstractFileComparator implements Serializable {
    public static final Comparator<File> DEFAULT_COMPARATOR;
    public static final Comparator<File> DEFAULT_REVERSE;
    public static final long serialVersionUID = 3260141861365313518L;

    @Override // org.apache.commons.p059io.comparator.AbstractFileComparator
    public /* bridge */ /* synthetic */ List sort(List list) {
        return super.sort((List<File>) list);
    }

    @Override // org.apache.commons.p059io.comparator.AbstractFileComparator
    public /* bridge */ /* synthetic */ File[] sort(File[] fileArr) {
        return super.sort(fileArr);
    }

    @Override // org.apache.commons.p059io.comparator.AbstractFileComparator
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    static {
        DefaultFileComparator defaultFileComparator = new DefaultFileComparator();
        DEFAULT_COMPARATOR = defaultFileComparator;
        DEFAULT_REVERSE = new ReverseFileComparator(defaultFileComparator);
    }

    @Override // java.util.Comparator
    public int compare(File file, File file2) {
        return file.compareTo(file2);
    }
}
