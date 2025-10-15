package org.apache.commons.p059io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/* loaded from: classes8.dex */
public class TrueFileFilter implements IOFileFilter, Serializable {
    public static final IOFileFilter INSTANCE;
    public static final String TO_STRING = Boolean.TRUE.toString();
    public static final IOFileFilter TRUE;
    public static final long serialVersionUID = 8782512160909720199L;

    @Override // org.apache.commons.p059io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return true;
    }

    @Override // org.apache.commons.p059io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return true;
    }

    @Override // org.apache.commons.p059io.filefilter.IOFileFilter
    public IOFileFilter and(IOFileFilter iOFileFilter) {
        return iOFileFilter;
    }

    static {
        TrueFileFilter trueFileFilter = new TrueFileFilter();
        TRUE = trueFileFilter;
        INSTANCE = trueFileFilter;
    }

    @Override // org.apache.commons.p059io.filefilter.IOFileFilter, org.apache.commons.p059io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return FileVisitResult.CONTINUE;
    }

    @Override // org.apache.commons.p059io.filefilter.IOFileFilter
    public IOFileFilter negate() {
        return FalseFileFilter.INSTANCE;
    }

    @Override // org.apache.commons.p059io.filefilter.IOFileFilter
    /* renamed from: or */
    public IOFileFilter mo7338or(IOFileFilter iOFileFilter) {
        return INSTANCE;
    }

    public String toString() {
        return TO_STRING;
    }
}
