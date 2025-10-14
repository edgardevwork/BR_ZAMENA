package org.apache.commons.p059io.file;

import com.fasterxml.jackson.databind.ext.NioPathDeserializer$$ExternalSyntheticApiModelOutline0;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;
import org.apache.commons.p059io.file.Counters;
import org.apache.commons.p059io.filefilter.IOFileFilter;
import org.apache.commons.p059io.filefilter.TrueFileFilter;

/* loaded from: classes8.dex */
public class CountingPathVisitor extends SimplePathVisitor {
    public static final String[] EMPTY_STRING_ARRAY = new String[0];
    public final PathFilter dirFilter;
    public final PathFilter fileFilter;
    public final Counters.PathCounters pathCounters;

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult postVisitDirectory(Path path, IOException iOException) throws IOException {
        return postVisitDirectory2(NioPathDeserializer$$ExternalSyntheticApiModelOutline0.m1025m(path), iOException);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return preVisitDirectory(NioPathDeserializer$$ExternalSyntheticApiModelOutline0.m1025m(path), basicFileAttributes);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return visitFile(NioPathDeserializer$$ExternalSyntheticApiModelOutline0.m1025m(path), basicFileAttributes);
    }

    public static CountingPathVisitor withBigIntegerCounters() {
        return new CountingPathVisitor(Counters.bigIntegerPathCounters());
    }

    public static CountingPathVisitor withLongCounters() {
        return new CountingPathVisitor(Counters.longPathCounters());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CountingPathVisitor(Counters.PathCounters pathCounters) {
        IOFileFilter iOFileFilter = TrueFileFilter.INSTANCE;
        this(pathCounters, iOFileFilter, iOFileFilter);
    }

    public CountingPathVisitor(Counters.PathCounters pathCounters, PathFilter pathFilter, PathFilter pathFilter2) {
        Objects.requireNonNull(pathCounters, "pathCounter");
        this.pathCounters = pathCounters;
        Objects.requireNonNull(pathFilter, "fileFilter");
        this.fileFilter = pathFilter;
        Objects.requireNonNull(pathFilter2, "dirFilter");
        this.dirFilter = pathFilter2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CountingPathVisitor) {
            return Objects.equals(this.pathCounters, ((CountingPathVisitor) obj).pathCounters);
        }
        return false;
    }

    public Counters.PathCounters getPathCounters() {
        return this.pathCounters;
    }

    public int hashCode() {
        return Objects.hash(this.pathCounters);
    }

    /* renamed from: postVisitDirectory, reason: avoid collision after fix types in other method */
    public FileVisitResult postVisitDirectory2(Path path, IOException iOException) throws IOException {
        updateDirCounter(path, iOException);
        return FileVisitResult.CONTINUE;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return this.dirFilter.accept(path, basicFileAttributes) != FileVisitResult.CONTINUE ? FileVisitResult.SKIP_SUBTREE : FileVisitResult.CONTINUE;
    }

    public String toString() {
        return this.pathCounters.toString();
    }

    public void updateDirCounter(Path path, IOException iOException) {
        this.pathCounters.getDirectoryCounter().increment();
    }

    public void updateFileCounters(Path path, BasicFileAttributes basicFileAttributes) {
        this.pathCounters.getFileCounter().increment();
        this.pathCounters.getByteCounter().add(basicFileAttributes.size());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        if (Files.exists(path, new LinkOption[0]) && this.fileFilter.accept(path, basicFileAttributes) == FileVisitResult.CONTINUE) {
            updateFileCounters(path, basicFileAttributes);
        }
        return FileVisitResult.CONTINUE;
    }
}
