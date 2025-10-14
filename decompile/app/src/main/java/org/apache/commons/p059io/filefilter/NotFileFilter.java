package org.apache.commons.p059io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/* loaded from: classes5.dex */
public class NotFileFilter extends AbstractFileFilter implements Serializable {
    public static final long serialVersionUID = 6131563330944994230L;
    public final IOFileFilter filter;

    public NotFileFilter(IOFileFilter iOFileFilter) {
        if (iOFileFilter == null) {
            throw new IllegalArgumentException("The filter must not be null");
        }
        this.filter = iOFileFilter;
    }

    @Override // org.apache.commons.p059io.filefilter.AbstractFileFilter, org.apache.commons.p059io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return !this.filter.accept(file);
    }

    @Override // org.apache.commons.p059io.filefilter.AbstractFileFilter, org.apache.commons.p059io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return !this.filter.accept(file, str);
    }

    @Override // org.apache.commons.p059io.filefilter.IOFileFilter, org.apache.commons.p059io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return not(this.filter.accept(path, basicFileAttributes));
    }

    public final FileVisitResult not(FileVisitResult fileVisitResult) {
        return fileVisitResult == FileVisitResult.CONTINUE ? FileVisitResult.TERMINATE : FileVisitResult.CONTINUE;
    }

    @Override // org.apache.commons.p059io.filefilter.AbstractFileFilter
    public String toString() {
        return "NOT (" + this.filter.toString() + ")";
    }
}
