package org.apache.commons.p059io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.p059io.FileUtils;

/* loaded from: classes5.dex */
public class SizeFileComparator extends AbstractFileComparator implements Serializable {
    public static final Comparator<File> SIZE_COMPARATOR;
    public static final Comparator<File> SIZE_REVERSE;
    public static final Comparator<File> SIZE_SUMDIR_COMPARATOR;
    public static final Comparator<File> SIZE_SUMDIR_REVERSE;
    public static final long serialVersionUID = -1201561106411416190L;
    public final boolean sumDirectoryContents;

    @Override // org.apache.commons.p059io.comparator.AbstractFileComparator
    public /* bridge */ /* synthetic */ List sort(List list) {
        return super.sort((List<File>) list);
    }

    @Override // org.apache.commons.p059io.comparator.AbstractFileComparator
    public /* bridge */ /* synthetic */ File[] sort(File[] fileArr) {
        return super.sort(fileArr);
    }

    static {
        SizeFileComparator sizeFileComparator = new SizeFileComparator();
        SIZE_COMPARATOR = sizeFileComparator;
        SIZE_REVERSE = new ReverseFileComparator(sizeFileComparator);
        SizeFileComparator sizeFileComparator2 = new SizeFileComparator(true);
        SIZE_SUMDIR_COMPARATOR = sizeFileComparator2;
        SIZE_SUMDIR_REVERSE = new ReverseFileComparator(sizeFileComparator2);
    }

    public SizeFileComparator() {
        this.sumDirectoryContents = false;
    }

    public SizeFileComparator(boolean z) {
        this.sumDirectoryContents = z;
    }

    @Override // java.util.Comparator
    public int compare(File file, File file2) {
        long length;
        long length2;
        if (file.isDirectory()) {
            length = (this.sumDirectoryContents && file.exists()) ? FileUtils.sizeOfDirectory(file) : 0L;
        } else {
            length = file.length();
        }
        if (file2.isDirectory()) {
            length2 = (this.sumDirectoryContents && file2.exists()) ? FileUtils.sizeOfDirectory(file2) : 0L;
        } else {
            length2 = file2.length();
        }
        long j = length - length2;
        if (j < 0) {
            return -1;
        }
        return j > 0 ? 1 : 0;
    }

    @Override // org.apache.commons.p059io.comparator.AbstractFileComparator
    public String toString() {
        return super.toString() + "[sumDirectoryContents=" + this.sumDirectoryContents + "]";
    }
}
