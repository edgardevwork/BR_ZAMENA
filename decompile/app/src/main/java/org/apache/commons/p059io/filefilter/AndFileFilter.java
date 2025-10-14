package org.apache.commons.p059io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes5.dex */
public class AndFileFilter extends AbstractFileFilter implements ConditionalFileFilter, Serializable {
    public static final long serialVersionUID = 7215974688563965257L;
    public final List<IOFileFilter> fileFilters;

    public AndFileFilter() {
        this(0);
    }

    public AndFileFilter(ArrayList<IOFileFilter> arrayList) {
        Objects.requireNonNull(arrayList, "initialList");
        this.fileFilters = arrayList;
    }

    public AndFileFilter(int i) {
        this((ArrayList<IOFileFilter>) new ArrayList(i));
    }

    public AndFileFilter(IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        this(2);
        addFileFilter(iOFileFilter);
        addFileFilter(iOFileFilter2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AndFileFilter(IOFileFilter... iOFileFilterArr) {
        this(iOFileFilterArr.length);
        Objects.requireNonNull(iOFileFilterArr, "fileFilters");
        addFileFilter(iOFileFilterArr);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AndFileFilter(List<IOFileFilter> list) {
        this((ArrayList<IOFileFilter>) new ArrayList(list));
        Objects.requireNonNull(list, "fileFilters");
    }

    @Override // org.apache.commons.p059io.filefilter.AbstractFileFilter, org.apache.commons.p059io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        if (isEmpty()) {
            return false;
        }
        Iterator<IOFileFilter> it = this.fileFilters.iterator();
        while (it.hasNext()) {
            if (!it.next().accept(file)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.apache.commons.p059io.filefilter.AbstractFileFilter, org.apache.commons.p059io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        if (isEmpty()) {
            return false;
        }
        Iterator<IOFileFilter> it = this.fileFilters.iterator();
        while (it.hasNext()) {
            if (!it.next().accept(file, str)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.apache.commons.p059io.filefilter.IOFileFilter, org.apache.commons.p059io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        if (isEmpty()) {
            return FileVisitResult.TERMINATE;
        }
        Iterator<IOFileFilter> it = this.fileFilters.iterator();
        while (it.hasNext()) {
            if (it.next().accept(path, basicFileAttributes) != FileVisitResult.CONTINUE) {
                return FileVisitResult.TERMINATE;
            }
        }
        return FileVisitResult.CONTINUE;
    }

    @Override // org.apache.commons.p059io.filefilter.ConditionalFileFilter
    public void addFileFilter(IOFileFilter iOFileFilter) {
        List<IOFileFilter> list = this.fileFilters;
        Objects.requireNonNull(iOFileFilter, "fileFilter");
        list.add(iOFileFilter);
    }

    public void addFileFilter(IOFileFilter... iOFileFilterArr) {
        Objects.requireNonNull(iOFileFilterArr, "fileFilters");
        for (IOFileFilter iOFileFilter : iOFileFilterArr) {
            addFileFilter(iOFileFilter);
        }
    }

    @Override // org.apache.commons.p059io.filefilter.ConditionalFileFilter
    public List<IOFileFilter> getFileFilters() {
        return Collections.unmodifiableList(this.fileFilters);
    }

    public final boolean isEmpty() {
        return this.fileFilters.isEmpty();
    }

    @Override // org.apache.commons.p059io.filefilter.ConditionalFileFilter
    public boolean removeFileFilter(IOFileFilter iOFileFilter) {
        return this.fileFilters.remove(iOFileFilter);
    }

    @Override // org.apache.commons.p059io.filefilter.ConditionalFileFilter
    public void setFileFilters(List<IOFileFilter> list) {
        this.fileFilters.clear();
        this.fileFilters.addAll(list);
    }

    @Override // org.apache.commons.p059io.filefilter.AbstractFileFilter
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("(");
        for (int i = 0; i < this.fileFilters.size(); i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append(this.fileFilters.get(i));
        }
        sb.append(")");
        return sb.toString();
    }
}
