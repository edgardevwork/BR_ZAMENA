package org.apache.commons.p059io.file;

import com.fasterxml.jackson.databind.ext.NioPathDeserializer$$ExternalSyntheticApiModelOutline0;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.util.Objects;

/* loaded from: classes8.dex */
public class DirectoryStreamFilter implements DirectoryStream.Filter<Path> {
    public final PathFilter pathFilter;

    @Override // java.nio.file.DirectoryStream.Filter
    public /* bridge */ /* synthetic */ boolean accept(Path path) throws IOException {
        return accept2(NioPathDeserializer$$ExternalSyntheticApiModelOutline0.m1025m(path));
    }

    public DirectoryStreamFilter(PathFilter pathFilter) {
        Objects.requireNonNull(pathFilter, "pathFilter");
        this.pathFilter = pathFilter;
    }

    /* renamed from: accept */
    public boolean accept2(Path path) throws IOException {
        return this.pathFilter.accept(path, PathUtils.readBasicFileAttributes(path)) == FileVisitResult.CONTINUE;
    }

    public PathFilter getPathFilter() {
        return this.pathFilter;
    }
}
