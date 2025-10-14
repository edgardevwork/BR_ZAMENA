package org.apache.commons.p059io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/* loaded from: classes5.dex */
public class CanExecuteFileFilter extends AbstractFileFilter implements Serializable {
    public static final IOFileFilter CANNOT_EXECUTE;
    public static final IOFileFilter CAN_EXECUTE;
    public static final long serialVersionUID = 3179904805251622989L;

    static {
        CanExecuteFileFilter canExecuteFileFilter = new CanExecuteFileFilter();
        CAN_EXECUTE = canExecuteFileFilter;
        CANNOT_EXECUTE = canExecuteFileFilter.negate();
    }

    @Override // org.apache.commons.p059io.filefilter.AbstractFileFilter, org.apache.commons.p059io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return file.canExecute();
    }

    @Override // org.apache.commons.p059io.filefilter.IOFileFilter, org.apache.commons.p059io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return AbstractFileFilter.toFileVisitResult(Files.isExecutable(path), path);
    }
}
