package org.apache.commons.p059io.filefilter;

import com.fasterxml.jackson.databind.ext.NioPathDeserializer$$ExternalSyntheticApiModelOutline0;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;
import org.apache.commons.p059io.file.PathVisitor;
import org.apache.ivy.plugins.parser.p064m2.PomReader;

/* loaded from: classes8.dex */
public abstract class AbstractFileFilter implements IOFileFilter, PathVisitor {
    @Override // java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult postVisitDirectory(Path path, IOException iOException) throws IOException {
        return postVisitDirectory2(NioPathDeserializer$$ExternalSyntheticApiModelOutline0.m1025m(path), iOException);
    }

    @Override // java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return preVisitDirectory2(NioPathDeserializer$$ExternalSyntheticApiModelOutline0.m1025m(path), basicFileAttributes);
    }

    @Override // java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return visitFile2(NioPathDeserializer$$ExternalSyntheticApiModelOutline0.m1025m(path), basicFileAttributes);
    }

    @Override // java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFileFailed(Path path, IOException iOException) throws IOException {
        return visitFileFailed2(NioPathDeserializer$$ExternalSyntheticApiModelOutline0.m1025m(path), iOException);
    }

    public static FileVisitResult toFileVisitResult(boolean z, Path path) {
        return z ? FileVisitResult.CONTINUE : FileVisitResult.TERMINATE;
    }

    @Override // org.apache.commons.p059io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        Objects.requireNonNull(file, PomReader.PomProfileElement.FILE);
        return accept(file.getParentFile(), file.getName());
    }

    @Override // org.apache.commons.p059io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        Objects.requireNonNull(str, "name");
        return accept(new File(file, str));
    }

    public FileVisitResult handle(Throwable th) {
        return FileVisitResult.TERMINATE;
    }

    /* renamed from: postVisitDirectory */
    public FileVisitResult postVisitDirectory2(Path path, IOException iOException) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    /* renamed from: preVisitDirectory */
    public FileVisitResult preVisitDirectory2(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return accept(path, basicFileAttributes);
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    /* renamed from: visitFile */
    public FileVisitResult visitFile2(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return accept(path, basicFileAttributes);
    }

    /* renamed from: visitFileFailed */
    public FileVisitResult visitFileFailed2(Path path, IOException iOException) throws IOException {
        return FileVisitResult.CONTINUE;
    }
}
