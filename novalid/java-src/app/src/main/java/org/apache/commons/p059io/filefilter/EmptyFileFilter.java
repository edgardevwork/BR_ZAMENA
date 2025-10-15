package org.apache.commons.p059io.filefilter;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;
import org.apache.commons.p059io.IOUtils;

/* loaded from: classes5.dex */
public class EmptyFileFilter extends AbstractFileFilter implements Serializable {
    public static final IOFileFilter EMPTY;
    public static final IOFileFilter NOT_EMPTY;
    public static final long serialVersionUID = 3631422087512832211L;

    static {
        EmptyFileFilter emptyFileFilter = new EmptyFileFilter();
        EMPTY = emptyFileFilter;
        NOT_EMPTY = emptyFileFilter.negate();
    }

    @Override // org.apache.commons.p059io.filefilter.AbstractFileFilter, org.apache.commons.p059io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return file.isDirectory() ? IOUtils.length(file.listFiles()) == 0 : file.length() == 0;
    }

    @Override // org.apache.commons.p059io.filefilter.IOFileFilter, org.apache.commons.p059io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        try {
            if (!Files.isDirectory(path, new LinkOption[0])) {
                return AbstractFileFilter.toFileVisitResult(Files.size(path) == 0, path);
            }
            Stream list = Files.list(path);
            try {
                FileVisitResult fileVisitResult = AbstractFileFilter.toFileVisitResult(!list.findFirst().isPresent(), path);
                list.close();
                return fileVisitResult;
            } finally {
            }
        } catch (IOException e) {
            return handle(e);
        }
    }
}
