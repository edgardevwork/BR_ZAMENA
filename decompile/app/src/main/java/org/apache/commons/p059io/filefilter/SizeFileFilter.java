package org.apache.commons.p059io.filefilter;

import com.fasterxml.jackson.databind.ext.NioPathDeserializer$$ExternalSyntheticApiModelOutline0;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/* loaded from: classes5.dex */
public class SizeFileFilter extends AbstractFileFilter implements Serializable {
    public static final long serialVersionUID = 7388077430788600069L;
    public final boolean acceptLarger;
    public final long size;

    @Override // org.apache.commons.p059io.filefilter.AbstractFileFilter, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return visitFile2(NioPathDeserializer$$ExternalSyntheticApiModelOutline0.m1025m(path), basicFileAttributes);
    }

    public SizeFileFilter(long j) {
        this(j, true);
    }

    public SizeFileFilter(long j, boolean z) {
        if (j < 0) {
            throw new IllegalArgumentException("The size must be non-negative");
        }
        this.size = j;
        this.acceptLarger = z;
    }

    @Override // org.apache.commons.p059io.filefilter.AbstractFileFilter, org.apache.commons.p059io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return accept(file.length());
    }

    public final boolean accept(long j) {
        return this.acceptLarger != ((j > this.size ? 1 : (j == this.size ? 0 : -1)) < 0);
    }

    @Override // org.apache.commons.p059io.filefilter.IOFileFilter, org.apache.commons.p059io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        try {
            return AbstractFileFilter.toFileVisitResult(accept(Files.size(path)), path);
        } catch (IOException e) {
            return handle(e);
        }
    }

    @Override // org.apache.commons.p059io.filefilter.AbstractFileFilter
    public String toString() {
        return super.toString() + "(" + (this.acceptLarger ? ">=" : "<") + this.size + ")";
    }

    @Override // org.apache.commons.p059io.filefilter.AbstractFileFilter
    /* renamed from: visitFile, reason: avoid collision after fix types in other method */
    public FileVisitResult visitFile2(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return AbstractFileFilter.toFileVisitResult(accept(Files.size(path)), path);
    }
}
