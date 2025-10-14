package org.apache.commons.p059io.comparator;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class AbstractFileComparator implements Comparator<File> {
    public File[] sort(File... fileArr) {
        if (fileArr != null) {
            Arrays.sort(fileArr, this);
        }
        return fileArr;
    }

    public List<File> sort(List<File> list) {
        if (list != null) {
            list.sort(this);
        }
        return list;
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
