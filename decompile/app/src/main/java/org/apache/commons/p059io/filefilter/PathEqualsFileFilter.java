package org.apache.commons.p059io.filefilter;

import java.io.File;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;

/* loaded from: classes5.dex */
public class PathEqualsFileFilter extends AbstractFileFilter {
    public final Path path;

    public PathEqualsFileFilter(Path path) {
        this.path = path;
    }

    @Override // org.apache.commons.p059io.filefilter.AbstractFileFilter, org.apache.commons.p059io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return Objects.equals(this.path, file.toPath());
    }

    @Override // org.apache.commons.p059io.filefilter.IOFileFilter, org.apache.commons.p059io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return AbstractFileFilter.toFileVisitResult(Objects.equals(this.path, path), path);
    }
}
