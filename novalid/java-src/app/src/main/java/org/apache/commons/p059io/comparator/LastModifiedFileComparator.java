package org.apache.commons.p059io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.p059io.FileUtils;

/* loaded from: classes5.dex */
public class LastModifiedFileComparator extends AbstractFileComparator implements Serializable {
    public static final Comparator<File> LASTMODIFIED_COMPARATOR;
    public static final Comparator<File> LASTMODIFIED_REVERSE;
    public static final long serialVersionUID = 7372168004395734046L;

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
        LastModifiedFileComparator lastModifiedFileComparator = new LastModifiedFileComparator();
        LASTMODIFIED_COMPARATOR = lastModifiedFileComparator;
        LASTMODIFIED_REVERSE = new ReverseFileComparator(lastModifiedFileComparator);
    }

    @Override // java.util.Comparator
    public int compare(File file, File file2) {
        long jLastModifiedUnchecked = FileUtils.lastModifiedUnchecked(file) - FileUtils.lastModifiedUnchecked(file2);
        if (jLastModifiedUnchecked < 0) {
            return -1;
        }
        return jLastModifiedUnchecked > 0 ? 1 : 0;
    }
}
