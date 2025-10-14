package org.apache.commons.p059io.file;

import com.fasterxml.jackson.databind.ext.NioPathDeserializer$$ExternalSyntheticApiModelOutline0;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.Objects;
import org.apache.commons.p059io.file.Counters;

/* loaded from: classes5.dex */
public class DeletingPathVisitor extends CountingPathVisitor {
    public final LinkOption[] linkOptions;
    public final boolean overrideReadOnly;
    public final String[] skip;

    @Override // org.apache.commons.p059io.file.CountingPathVisitor, java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult postVisitDirectory(Path path, IOException iOException) throws IOException {
        return postVisitDirectory2(NioPathDeserializer$$ExternalSyntheticApiModelOutline0.m1025m(path), iOException);
    }

    @Override // org.apache.commons.p059io.file.CountingPathVisitor, java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return preVisitDirectory2(NioPathDeserializer$$ExternalSyntheticApiModelOutline0.m1025m(path), basicFileAttributes);
    }

    @Override // org.apache.commons.p059io.file.CountingPathVisitor, java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return visitFile2(NioPathDeserializer$$ExternalSyntheticApiModelOutline0.m1025m(path), basicFileAttributes);
    }

    public static DeletingPathVisitor withBigIntegerCounters() {
        return new DeletingPathVisitor(Counters.bigIntegerPathCounters(), new String[0]);
    }

    public static DeletingPathVisitor withLongCounters() {
        return new DeletingPathVisitor(Counters.longPathCounters(), new String[0]);
    }

    public DeletingPathVisitor(Counters.PathCounters pathCounters, DeleteOption[] deleteOptionArr, String... strArr) {
        this(pathCounters, PathUtils.NOFOLLOW_LINK_OPTION_ARRAY, deleteOptionArr, strArr);
    }

    public DeletingPathVisitor(Counters.PathCounters pathCounters, LinkOption[] linkOptionArr, DeleteOption[] deleteOptionArr, String... strArr) {
        super(pathCounters);
        String[] strArr2 = strArr != null ? (String[]) strArr.clone() : CountingPathVisitor.EMPTY_STRING_ARRAY;
        Arrays.sort(strArr2);
        this.skip = strArr2;
        this.overrideReadOnly = StandardDeleteOption.overrideReadOnly(deleteOptionArr);
        this.linkOptions = linkOptionArr == null ? PathUtils.NOFOLLOW_LINK_OPTION_ARRAY : (LinkOption[]) linkOptionArr.clone();
    }

    public DeletingPathVisitor(Counters.PathCounters pathCounters, String... strArr) {
        this(pathCounters, PathUtils.EMPTY_DELETE_OPTION_ARRAY, strArr);
    }

    private boolean accept(Path path) {
        return Arrays.binarySearch(this.skip, Objects.toString(path.getFileName(), null)) < 0;
    }

    @Override // org.apache.commons.p059io.file.CountingPathVisitor
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        DeletingPathVisitor deletingPathVisitor = (DeletingPathVisitor) obj;
        return this.overrideReadOnly == deletingPathVisitor.overrideReadOnly && Arrays.equals(this.skip, deletingPathVisitor.skip);
    }

    @Override // org.apache.commons.p059io.file.CountingPathVisitor
    public int hashCode() {
        return (((super.hashCode() * 31) + Arrays.hashCode(this.skip)) * 31) + Objects.hash(Boolean.valueOf(this.overrideReadOnly));
    }

    @Override // org.apache.commons.p059io.file.CountingPathVisitor
    /* renamed from: postVisitDirectory */
    public FileVisitResult postVisitDirectory2(Path path, IOException iOException) throws IOException {
        if (PathUtils.isEmptyDirectory(path)) {
            Files.deleteIfExists(path);
        }
        return super.postVisitDirectory2(path, iOException);
    }

    @Override // org.apache.commons.p059io.file.CountingPathVisitor
    /* renamed from: preVisitDirectory */
    public FileVisitResult preVisitDirectory2(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        super.preVisitDirectory(path, basicFileAttributes);
        return accept(path) ? FileVisitResult.CONTINUE : FileVisitResult.SKIP_SUBTREE;
    }

    @Override // org.apache.commons.p059io.file.CountingPathVisitor
    /* renamed from: visitFile */
    public FileVisitResult visitFile2(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        if (accept(path)) {
            if (Files.exists(path, this.linkOptions)) {
                if (this.overrideReadOnly) {
                    PathUtils.setReadOnly(path, false, this.linkOptions);
                }
                Files.deleteIfExists(path);
            }
            if (Files.isSymbolicLink(path)) {
                try {
                    Files.delete(path);
                } catch (NoSuchFileException unused) {
                }
            }
        }
        updateFileCounters(path, basicFileAttributes);
        return FileVisitResult.CONTINUE;
    }
}
