package org.apache.commons.p059io.file;

import com.fasterxml.jackson.databind.ext.NioPathDeserializer$$ExternalSyntheticApiModelOutline0;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.net.URI;
import java.net.URL;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFilePermission;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import kotlin.p051io.path.C10632x929f2949;
import kotlin.p051io.path.PathTreeWalkKt$$ExternalSyntheticApiModelOutline0;
import org.apache.commons.compress.archivers.examples.Archiver$$ExternalSyntheticApiModelOutline2;
import org.apache.commons.p059io.IOExceptionList;
import org.apache.commons.p059io.IOUtils;
import org.apache.commons.p059io.file.Counters;
import org.apache.ivy.plugins.parser.p064m2.PomReader;

/* loaded from: classes6.dex */
public final class PathUtils {
    public static final CopyOption[] EMPTY_COPY_OPTIONS = new CopyOption[0];
    public static final DeleteOption[] EMPTY_DELETE_OPTION_ARRAY = new DeleteOption[0];
    public static final FileVisitOption[] EMPTY_FILE_VISIT_OPTION_ARRAY = new FileVisitOption[0];
    public static final LinkOption[] EMPTY_LINK_OPTION_ARRAY = new LinkOption[0];
    public static final LinkOption[] NOFOLLOW_LINK_OPTION_ARRAY = {LinkOption.NOFOLLOW_LINKS};
    public static final OpenOption[] EMPTY_OPEN_OPTION_ARRAY = new OpenOption[0];
    public static final Path[] EMPTY_PATH_ARRAY = new Path[0];

    public static class RelativeSortedPaths {
        public final boolean equals;
        public final List<Path> relativeFileList1;
        public final List<Path> relativeFileList2;

        public RelativeSortedPaths(Path path, Path path2, int i, LinkOption[] linkOptionArr, FileVisitOption[] fileVisitOptionArr) throws IOException {
            List<Path> list;
            List<Path> list2 = null;
            if (path == null && path2 == null) {
                this.equals = true;
            } else {
                if ((path == null) ^ (path2 == null)) {
                    this.equals = false;
                } else {
                    boolean zNotExists = Files.notExists(path, linkOptionArr);
                    boolean zNotExists2 = Files.notExists(path2, linkOptionArr);
                    if (!zNotExists && !zNotExists2) {
                        AccumulatorPathVisitor accumulatorPathVisitorAccumulate = PathUtils.accumulate(path, i, fileVisitOptionArr);
                        AccumulatorPathVisitor accumulatorPathVisitorAccumulate2 = PathUtils.accumulate(path2, i, fileVisitOptionArr);
                        if (accumulatorPathVisitorAccumulate.getDirList().size() != accumulatorPathVisitorAccumulate2.getDirList().size() || accumulatorPathVisitorAccumulate.getFileList().size() != accumulatorPathVisitorAccumulate2.getFileList().size() || !accumulatorPathVisitorAccumulate.relativizeDirectories(path, true, null).equals(accumulatorPathVisitorAccumulate2.relativizeDirectories(path2, true, null))) {
                            this.equals = false;
                        } else {
                            List<Path> listRelativizeFiles = accumulatorPathVisitorAccumulate.relativizeFiles(path, true, null);
                            List<Path> listRelativizeFiles2 = accumulatorPathVisitorAccumulate2.relativizeFiles(path2, true, null);
                            this.equals = listRelativizeFiles.equals(listRelativizeFiles2);
                            list2 = listRelativizeFiles;
                            list = listRelativizeFiles2;
                            this.relativeFileList1 = list2;
                            this.relativeFileList2 = list;
                        }
                    } else {
                        this.equals = zNotExists && zNotExists2;
                    }
                }
            }
            list = null;
            this.relativeFileList1 = list2;
            this.relativeFileList2 = list;
        }
    }

    public static AccumulatorPathVisitor accumulate(Path path, int i, FileVisitOption[] fileVisitOptionArr) throws IOException {
        return (AccumulatorPathVisitor) visitFileTree(AccumulatorPathVisitor.withLongCounters(), path, toFileVisitOptionSet(fileVisitOptionArr), i);
    }

    public static Counters.PathCounters cleanDirectory(Path path) throws IOException {
        return cleanDirectory(path, EMPTY_DELETE_OPTION_ARRAY);
    }

    public static Counters.PathCounters cleanDirectory(Path path, DeleteOption... deleteOptionArr) throws IOException {
        return ((CleaningPathVisitor) visitFileTree(new CleaningPathVisitor(Counters.longPathCounters(), deleteOptionArr, new String[0]), path)).getPathCounters();
    }

    public static Counters.PathCounters copyDirectory(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        Path absolutePath = path.toAbsolutePath();
        return ((CopyDirectoryVisitor) visitFileTree(new CopyDirectoryVisitor(Counters.longPathCounters(), absolutePath, path2, copyOptionArr), absolutePath)).getPathCounters();
    }

    public static Path copyFile(URL url, Path path, CopyOption... copyOptionArr) throws IOException {
        InputStream inputStreamOpenStream = FirebasePerfUrlConnection.openStream(url);
        try {
            Files.copy(inputStreamOpenStream, path, copyOptionArr);
            if (inputStreamOpenStream != null) {
                inputStreamOpenStream.close();
            }
            return path;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (inputStreamOpenStream != null) {
                    try {
                        inputStreamOpenStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public static Path copyFileToDirectory(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        return Files.copy(path, path2.resolve(path.getFileName()), copyOptionArr);
    }

    public static Path copyFileToDirectory(URL url, Path path, CopyOption... copyOptionArr) throws IOException {
        InputStream inputStreamOpenStream = FirebasePerfUrlConnection.openStream(url);
        try {
            Files.copy(inputStreamOpenStream, path.resolve(url.getFile()), copyOptionArr);
            if (inputStreamOpenStream != null) {
                inputStreamOpenStream.close();
            }
            return path;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (inputStreamOpenStream != null) {
                    try {
                        inputStreamOpenStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public static Counters.PathCounters countDirectory(Path path) throws IOException {
        return ((CountingPathVisitor) visitFileTree(new CountingPathVisitor(Counters.longPathCounters()), path)).getPathCounters();
    }

    public static Path createParentDirectories(Path path, FileAttribute<?>... fileAttributeArr) throws IOException {
        Path parent = path.getParent();
        if (parent == null) {
            return null;
        }
        return Files.createDirectories(parent, fileAttributeArr);
    }

    public static Path current() {
        return Paths.get("", new String[0]);
    }

    public static Counters.PathCounters delete(Path path) throws IOException {
        return delete(path, EMPTY_DELETE_OPTION_ARRAY);
    }

    public static Counters.PathCounters delete(Path path, DeleteOption... deleteOptionArr) throws IOException {
        return Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS) ? deleteDirectory(path, deleteOptionArr) : deleteFile(path, deleteOptionArr);
    }

    public static Counters.PathCounters delete(Path path, LinkOption[] linkOptionArr, DeleteOption... deleteOptionArr) throws IOException {
        return Files.isDirectory(path, linkOptionArr) ? deleteDirectory(path, linkOptionArr, deleteOptionArr) : deleteFile(path, linkOptionArr, deleteOptionArr);
    }

    public static Counters.PathCounters deleteDirectory(Path path) throws IOException {
        return deleteDirectory(path, EMPTY_DELETE_OPTION_ARRAY);
    }

    public static Counters.PathCounters deleteDirectory(Path path, DeleteOption... deleteOptionArr) throws IOException {
        return ((DeletingPathVisitor) visitFileTree(new DeletingPathVisitor(Counters.longPathCounters(), NOFOLLOW_LINK_OPTION_ARRAY, deleteOptionArr, new String[0]), path)).getPathCounters();
    }

    public static Counters.PathCounters deleteDirectory(Path path, LinkOption[] linkOptionArr, DeleteOption... deleteOptionArr) throws IOException {
        return ((DeletingPathVisitor) visitFileTree(new DeletingPathVisitor(Counters.longPathCounters(), linkOptionArr, deleteOptionArr, new String[0]), path)).getPathCounters();
    }

    public static Counters.PathCounters deleteFile(Path path) throws IOException {
        return deleteFile(path, EMPTY_DELETE_OPTION_ARRAY);
    }

    public static Counters.PathCounters deleteFile(Path path, DeleteOption... deleteOptionArr) throws IOException {
        return deleteFile(path, NOFOLLOW_LINK_OPTION_ARRAY, deleteOptionArr);
    }

    public static Counters.PathCounters deleteFile(Path path, LinkOption[] linkOptionArr, DeleteOption... deleteOptionArr) throws IOException {
        if (Files.isDirectory(path, linkOptionArr)) {
            C10632x929f2949.m7179m();
            throw PathUtils$$ExternalSyntheticApiModelOutline16.m7326m(path.toString());
        }
        Counters.PathCounters pathCountersLongPathCounters = Counters.longPathCounters();
        boolean zExists = Files.exists(path, linkOptionArr);
        long size = (!zExists || Files.isSymbolicLink(path)) ? 0L : Files.size(path);
        if (overrideReadOnly(deleteOptionArr) && zExists) {
            setReadOnly(path, false, linkOptionArr);
        }
        if (Files.deleteIfExists(path)) {
            pathCountersLongPathCounters.getFileCounter().increment();
            pathCountersLongPathCounters.getByteCounter().add(size);
        }
        return pathCountersLongPathCounters;
    }

    public static boolean directoryAndFileContentEquals(Path path, Path path2) throws IOException {
        return directoryAndFileContentEquals(path, path2, EMPTY_LINK_OPTION_ARRAY, EMPTY_OPEN_OPTION_ARRAY, EMPTY_FILE_VISIT_OPTION_ARRAY);
    }

    public static boolean directoryAndFileContentEquals(Path path, Path path2, LinkOption[] linkOptionArr, OpenOption[] openOptionArr, FileVisitOption[] fileVisitOptionArr) throws IOException {
        if (path == null && path2 == null) {
            return true;
        }
        if (path == null || path2 == null) {
            return false;
        }
        if (Files.notExists(path, new LinkOption[0]) && Files.notExists(path2, new LinkOption[0])) {
            return true;
        }
        RelativeSortedPaths relativeSortedPaths = new RelativeSortedPaths(path, path2, Integer.MAX_VALUE, linkOptionArr, fileVisitOptionArr);
        if (!relativeSortedPaths.equals) {
            return false;
        }
        List<Path> list = relativeSortedPaths.relativeFileList1;
        List<Path> list2 = relativeSortedPaths.relativeFileList2;
        Iterator<Path> it = list.iterator();
        while (it.hasNext()) {
            Path pathM1025m = NioPathDeserializer$$ExternalSyntheticApiModelOutline0.m1025m(it.next());
            if (Collections.binarySearch(list2, pathM1025m) <= -1) {
                throw new IllegalStateException("Unexpected mismatch.");
            }
            if (!fileContentEquals(path.resolve(pathM1025m), path2.resolve(pathM1025m), linkOptionArr, openOptionArr)) {
                return false;
            }
        }
        return true;
    }

    public static boolean directoryContentEquals(Path path, Path path2) throws IOException {
        return directoryContentEquals(path, path2, Integer.MAX_VALUE, EMPTY_LINK_OPTION_ARRAY, EMPTY_FILE_VISIT_OPTION_ARRAY);
    }

    public static boolean directoryContentEquals(Path path, Path path2, int i, LinkOption[] linkOptionArr, FileVisitOption[] fileVisitOptionArr) throws IOException {
        return new RelativeSortedPaths(path, path2, i, linkOptionArr, fileVisitOptionArr).equals;
    }

    public static boolean fileContentEquals(Path path, Path path2) throws IOException {
        return fileContentEquals(path, path2, EMPTY_LINK_OPTION_ARRAY, EMPTY_OPEN_OPTION_ARRAY);
    }

    public static boolean fileContentEquals(Path path, Path path2, LinkOption[] linkOptionArr, OpenOption[] openOptionArr) throws IOException {
        if (path == null && path2 == null) {
            return true;
        }
        if (path == null || path2 == null) {
            return false;
        }
        Path pathNormalize = path.normalize();
        Path pathNormalize2 = path2.normalize();
        boolean zExists = Files.exists(pathNormalize, linkOptionArr);
        if (zExists != Files.exists(pathNormalize2, linkOptionArr)) {
            return false;
        }
        if (!zExists) {
            return true;
        }
        if (Files.isDirectory(pathNormalize, linkOptionArr)) {
            throw new IOException("Can't compare directories, only files: " + pathNormalize);
        }
        if (Files.isDirectory(pathNormalize2, linkOptionArr)) {
            throw new IOException("Can't compare directories, only files: " + pathNormalize2);
        }
        if (Files.size(pathNormalize) != Files.size(pathNormalize2)) {
            return false;
        }
        if (path.equals(path2)) {
            return true;
        }
        InputStream inputStreamNewInputStream = Files.newInputStream(pathNormalize, openOptionArr);
        try {
            InputStream inputStreamNewInputStream2 = Files.newInputStream(pathNormalize2, openOptionArr);
            try {
                boolean zContentEquals = IOUtils.contentEquals(inputStreamNewInputStream, inputStreamNewInputStream2);
                if (inputStreamNewInputStream2 != null) {
                    inputStreamNewInputStream2.close();
                }
                if (inputStreamNewInputStream != null) {
                    inputStreamNewInputStream.close();
                }
                return zContentEquals;
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (inputStreamNewInputStream != null) {
                    try {
                        inputStreamNewInputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public static Path[] filter(PathFilter pathFilter, Path... pathArr) {
        Objects.requireNonNull(pathFilter, "filter");
        if (pathArr == null) {
            return EMPTY_PATH_ARRAY;
        }
        return (Path[]) ((List) filterPaths(pathFilter, Stream.of((Object[]) pathArr), Collectors.toList())).toArray(EMPTY_PATH_ARRAY);
    }

    public static <R, A> R filterPaths(final PathFilter pathFilter, Stream<Path> stream, Collector<? super Path, A, R> collector) {
        Objects.requireNonNull(pathFilter, "filter");
        Objects.requireNonNull(collector, "collector");
        if (stream == null) {
            return (R) Stream.empty().collect(collector);
        }
        return (R) stream.filter(new Predicate() { // from class: org.apache.commons.io.file.PathUtils$$ExternalSyntheticLambda19
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return PathUtils.lambda$filterPaths$0(pathFilter, (Path) obj);
            }
        }).collect(collector);
    }

    public static /* synthetic */ boolean lambda$filterPaths$0(PathFilter pathFilter, Path path) {
        if (path == null) {
            return false;
        }
        try {
            return pathFilter.accept(path, readBasicFileAttributes(path)) == FileVisitResult.CONTINUE;
        } catch (IOException unused) {
            return false;
        }
    }

    public static List<AclEntry> getAclEntryList(Path path) throws IOException {
        AclFileAttributeView aclFileAttributeViewM7319m = PathUtils$$ExternalSyntheticApiModelOutline1.m7319m(Files.getFileAttributeView(path, PathUtils$$ExternalSyntheticApiModelOutline0.m7318m(), new LinkOption[0]));
        if (aclFileAttributeViewM7319m == null) {
            return null;
        }
        return aclFileAttributeViewM7319m.getAcl();
    }

    public static boolean isDirectory(Path path, LinkOption... linkOptionArr) {
        return path != null && Files.isDirectory(path, linkOptionArr);
    }

    public static boolean isEmpty(Path path) throws IOException {
        return Files.isDirectory(path, new LinkOption[0]) ? isEmptyDirectory(path) : isEmptyFile(path);
    }

    public static boolean isEmptyDirectory(Path path) throws IOException {
        DirectoryStream directoryStreamNewDirectoryStream = Files.newDirectoryStream(path);
        try {
            boolean z = !directoryStreamNewDirectoryStream.iterator().hasNext();
            if (directoryStreamNewDirectoryStream != null) {
                directoryStreamNewDirectoryStream.close();
            }
            return z;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (directoryStreamNewDirectoryStream != null) {
                    try {
                        directoryStreamNewDirectoryStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public static boolean isEmptyFile(Path path) throws IOException {
        return Files.size(path) <= 0;
    }

    public static boolean isNewer(Path path, long j, LinkOption... linkOptionArr) throws IOException {
        Objects.requireNonNull(path, PomReader.PomProfileElement.FILE);
        return !Files.notExists(path, new LinkOption[0]) && Files.getLastModifiedTime(path, linkOptionArr).toMillis() > j;
    }

    public static boolean isRegularFile(Path path, LinkOption... linkOptionArr) {
        return path != null && Files.isRegularFile(path, linkOptionArr);
    }

    public static DirectoryStream<Path> newDirectoryStream(Path path, PathFilter pathFilter) throws IOException {
        return Files.newDirectoryStream(path, (DirectoryStream.Filter<? super Path>) new DirectoryStreamFilter(pathFilter));
    }

    public static /* synthetic */ boolean lambda$overrideReadOnly$1(DeleteOption deleteOption) {
        return deleteOption == StandardDeleteOption.OVERRIDE_READ_ONLY;
    }

    public static boolean overrideReadOnly(DeleteOption... deleteOptionArr) {
        if (deleteOptionArr == null) {
            return false;
        }
        return Stream.of((Object[]) deleteOptionArr).anyMatch(new Predicate() { // from class: org.apache.commons.io.file.PathUtils$$ExternalSyntheticLambda20
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return PathUtils.lambda$overrideReadOnly$1((DeleteOption) obj);
            }
        });
    }

    public static BasicFileAttributes readBasicFileAttributes(Path path) throws IOException {
        return Files.readAttributes(path, PathTreeWalkKt$$ExternalSyntheticApiModelOutline0.m7151m(), new LinkOption[0]);
    }

    public static BasicFileAttributes readBasicFileAttributesUnchecked(Path path) {
        try {
            return readBasicFileAttributes(path);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public static List<Path> relativize(Collection<Path> collection, final Path path, boolean z, Comparator<? super Path> comparator) {
        Stream<Path> stream = collection.stream();
        path.getClass();
        Stream map = stream.map(new Function() { // from class: org.apache.commons.io.file.PathUtils$$ExternalSyntheticLambda18
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return path.relativize((Path) obj);
            }
        });
        if (z) {
            map = comparator == null ? map.sorted() : map.sorted(comparator);
        }
        return (List) map.collect(Collectors.toList());
    }

    public static Path setReadOnly(Path path, boolean z, LinkOption... linkOptionArr) throws IOException {
        ArrayList arrayList = new ArrayList(2);
        DosFileAttributeView dosFileAttributeViewM7331m = PathUtils$$ExternalSyntheticApiModelOutline6.m7331m(Files.getFileAttributeView(path, PathUtils$$ExternalSyntheticApiModelOutline3.m7328m(), linkOptionArr));
        if (dosFileAttributeViewM7331m != null) {
            try {
                dosFileAttributeViewM7331m.setReadOnly(z);
                return path;
            } catch (IOException e) {
                arrayList.add(e);
            }
        }
        PosixFileAttributeView posixFileAttributeViewM7334m = PathUtils$$ExternalSyntheticApiModelOutline9.m7334m(Files.getFileAttributeView(path, PathUtils$$ExternalSyntheticApiModelOutline8.m7333m(), linkOptionArr));
        if (posixFileAttributeViewM7334m != null) {
            Set setPermissions = posixFileAttributeViewM7334m.readAttributes().permissions();
            setPermissions.remove(PosixFilePermission.OWNER_WRITE);
            setPermissions.remove(PosixFilePermission.GROUP_WRITE);
            setPermissions.remove(PosixFilePermission.OTHERS_WRITE);
            try {
                return Files.setPosixFilePermissions(path, setPermissions);
            } catch (IOException e2) {
                arrayList.add(e2);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new IOExceptionList(path.toString(), arrayList);
        }
        throw new IOException(String.format("No DosFileAttributeView or PosixFileAttributeView for '%s' (linkOptions=%s)", path, Arrays.toString(linkOptionArr)));
    }

    public static Set<FileVisitOption> toFileVisitOptionSet(FileVisitOption... fileVisitOptionArr) {
        if (fileVisitOptionArr == null) {
            return EnumSet.noneOf(Archiver$$ExternalSyntheticApiModelOutline2.m7282m());
        }
        return (Set) Stream.of((Object[]) fileVisitOptionArr).collect(Collectors.toSet());
    }

    public static <T extends FileVisitor<? super Path>> T visitFileTree(T t, Path path) throws IOException {
        Files.walkFileTree(path, t);
        return t;
    }

    public static <T extends FileVisitor<? super Path>> T visitFileTree(T t, Path path, Set<FileVisitOption> set, int i) throws IOException {
        Files.walkFileTree(path, set, i, t);
        return t;
    }

    public static <T extends FileVisitor<? super Path>> T visitFileTree(T t, String str, String... strArr) throws IOException {
        return (T) visitFileTree(t, Paths.get(str, strArr));
    }

    public static <T extends FileVisitor<? super Path>> T visitFileTree(T t, URI uri) throws IOException {
        return (T) visitFileTree(t, Paths.get(uri));
    }

    public static Stream<Path> walk(Path path, final PathFilter pathFilter, int i, final boolean z, FileVisitOption... fileVisitOptionArr) throws IOException {
        return Files.walk(path, i, fileVisitOptionArr).filter(new Predicate() { // from class: org.apache.commons.io.file.PathUtils$$ExternalSyntheticLambda17
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return PathUtils.lambda$walk$2(pathFilter, z, (Path) obj);
            }
        });
    }

    public static /* synthetic */ boolean lambda$walk$2(PathFilter pathFilter, boolean z, Path path) {
        return pathFilter.accept(path, z ? readBasicFileAttributesUnchecked(path) : null) == FileVisitResult.CONTINUE;
    }
}
