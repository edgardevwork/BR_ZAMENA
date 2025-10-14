package org.apache.commons.p059io.filefilter;

import java.io.File;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;
import org.apache.ivy.plugins.parser.p064m2.PomReader;

/* loaded from: classes5.dex */
public class FileEqualsFileFilter extends AbstractFileFilter {
    public final File file;
    public final Path path;

    public FileEqualsFileFilter(File file) {
        Objects.requireNonNull(file, PomReader.PomProfileElement.FILE);
        this.file = file;
        this.path = file.toPath();
    }

    @Override // org.apache.commons.p059io.filefilter.AbstractFileFilter, org.apache.commons.p059io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return Objects.equals(this.file, file);
    }

    @Override // org.apache.commons.p059io.filefilter.IOFileFilter, org.apache.commons.p059io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return AbstractFileFilter.toFileVisitResult(Objects.equals(this.path, path), path);
    }
}
