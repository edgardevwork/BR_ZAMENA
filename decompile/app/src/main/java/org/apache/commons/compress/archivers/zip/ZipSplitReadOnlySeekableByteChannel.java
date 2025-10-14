package org.apache.commons.compress.archivers.zip;

import com.fasterxml.jackson.databind.ext.NioPathDeserializer$$ExternalSyntheticApiModelOutline0;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.apache.commons.compress.utils.FileNameUtils;
import org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel;

/* loaded from: classes6.dex */
public class ZipSplitReadOnlySeekableByteChannel extends MultiReadOnlySeekableByteChannel {
    public static final Path[] EMPTY_PATH_ARRAY = new Path[0];
    public static final int ZIP_SPLIT_SIGNATURE_LENGTH = 4;
    public final ByteBuffer zipSplitSignatureByteBuffer;

    public ZipSplitReadOnlySeekableByteChannel(List<SeekableByteChannel> list) throws IOException {
        super(list);
        this.zipSplitSignatureByteBuffer = ByteBuffer.allocate(4);
        assertSplitSignature(list);
    }

    public final void assertSplitSignature(List<SeekableByteChannel> list) throws IOException {
        SeekableByteChannel seekableByteChannel = list.get(0);
        seekableByteChannel.position(0L);
        this.zipSplitSignatureByteBuffer.rewind();
        seekableByteChannel.read(this.zipSplitSignatureByteBuffer);
        if (!new ZipLong(this.zipSplitSignatureByteBuffer.array()).equals(ZipLong.DD_SIG)) {
            seekableByteChannel.position(0L);
            throw new IOException("The first zip split segment does not begin with split zip file signature");
        }
        seekableByteChannel.position(0L);
    }

    public static SeekableByteChannel forOrderedSeekableByteChannels(SeekableByteChannel... seekableByteChannelArr) throws IOException {
        Objects.requireNonNull(seekableByteChannelArr, "channels must not be null");
        if (seekableByteChannelArr.length == 1) {
            return seekableByteChannelArr[0];
        }
        return new ZipSplitReadOnlySeekableByteChannel(Arrays.asList(seekableByteChannelArr));
    }

    public static SeekableByteChannel forOrderedSeekableByteChannels(SeekableByteChannel seekableByteChannel, Iterable<SeekableByteChannel> iterable) throws IOException {
        Objects.requireNonNull(iterable, "channels");
        Objects.requireNonNull(seekableByteChannel, "lastSegmentChannel");
        final ArrayList arrayList = new ArrayList();
        iterable.forEach(new Consumer() { // from class: org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel$$ExternalSyntheticLambda6
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                arrayList.add((SeekableByteChannel) obj);
            }
        });
        arrayList.add(seekableByteChannel);
        return forOrderedSeekableByteChannels((SeekableByteChannel[]) arrayList.toArray(new SeekableByteChannel[0]));
    }

    public static SeekableByteChannel buildFromLastSplitSegment(File file) throws IOException {
        return buildFromLastSplitSegment(file.toPath());
    }

    public static SeekableByteChannel buildFromLastSplitSegment(Path path) throws IOException {
        if (!FileNameUtils.getExtension(path).equalsIgnoreCase(ArchiveStreamFactory.ZIP)) {
            throw new IllegalArgumentException("The extension of last zip split segment should be .zip");
        }
        Path parent = Objects.nonNull(path.getParent()) ? path.getParent() : path.getFileSystem().getPath(".", new String[0]);
        final Pattern patternCompile = Pattern.compile(Pattern.quote(FileNameUtils.getBaseName(path)) + ".[zZ][0-9]+");
        Stream streamWalk = Files.walk(parent, 1, new FileVisitOption[0]);
        try {
            ArrayList arrayList = (ArrayList) streamWalk.filter(new Predicate() { // from class: org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel$$ExternalSyntheticLambda3
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ZipSplitReadOnlySeekableByteChannel.lambda$buildFromLastSplitSegment$0((Path) obj);
                }
            }).filter(new Predicate() { // from class: org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel$$ExternalSyntheticLambda4
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ZipSplitReadOnlySeekableByteChannel.lambda$buildFromLastSplitSegment$1(patternCompile, (Path) obj);
                }
            }).sorted(new ZipSplitSegmentComparator()).collect(Collectors.toCollection(new ZipSplitReadOnlySeekableByteChannel$$ExternalSyntheticLambda5()));
            streamWalk.close();
            return forPaths(path, arrayList);
        } finally {
        }
    }

    public static /* synthetic */ boolean lambda$buildFromLastSplitSegment$0(Path path) {
        return Files.isRegularFile(path, new LinkOption[0]);
    }

    public static /* synthetic */ boolean lambda$buildFromLastSplitSegment$1(Pattern pattern, Path path) {
        return pattern.matcher(path.getFileName().toString()).matches();
    }

    public static SeekableByteChannel forFiles(File... fileArr) throws IOException {
        ArrayList arrayList = new ArrayList();
        Objects.requireNonNull(fileArr, "files must not be null");
        for (File file : fileArr) {
            arrayList.add(file.toPath());
        }
        return forPaths((Path[]) arrayList.toArray(EMPTY_PATH_ARRAY));
    }

    public static SeekableByteChannel forPaths(Path... pathArr) throws IOException {
        ArrayList arrayList = new ArrayList();
        Objects.requireNonNull(pathArr, "paths must not be null");
        for (Path path : pathArr) {
            arrayList.add(Files.newByteChannel(path, StandardOpenOption.READ));
        }
        if (arrayList.size() == 1) {
            return (SeekableByteChannel) arrayList.get(0);
        }
        return new ZipSplitReadOnlySeekableByteChannel(arrayList);
    }

    public static SeekableByteChannel forFiles(File file, Iterable<File> iterable) throws IOException {
        Objects.requireNonNull(iterable, "files");
        Objects.requireNonNull(file, "lastSegmentFile");
        final ArrayList arrayList = new ArrayList();
        iterable.forEach(new Consumer() { // from class: org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel$$ExternalSyntheticLambda2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ZipSplitReadOnlySeekableByteChannel.lambda$forFiles$2(arrayList, (File) obj);
            }
        });
        return forPaths(file.toPath(), arrayList);
    }

    public static /* synthetic */ void lambda$forFiles$2(List list, File file) {
        list.add(file.toPath());
    }

    public static SeekableByteChannel forPaths(Path path, Iterable<Path> iterable) throws IOException {
        Objects.requireNonNull(iterable, "paths");
        Objects.requireNonNull(path, "lastSegmentPath");
        final ArrayList arrayList = new ArrayList();
        iterable.forEach(new Consumer() { // from class: org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel$$ExternalSyntheticLambda1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                arrayList.add((Path) obj);
            }
        });
        arrayList.add(path);
        return forPaths((Path[]) arrayList.toArray(EMPTY_PATH_ARRAY));
    }

    public static class ZipSplitSegmentComparator implements Comparator<Path>, Serializable {
        public static final long serialVersionUID = 20200123;

        public ZipSplitSegmentComparator() {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Path path, Path path2) {
            return compare2(NioPathDeserializer$$ExternalSyntheticApiModelOutline0.m1025m(path), NioPathDeserializer$$ExternalSyntheticApiModelOutline0.m1025m(path2));
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(Path path, Path path2) {
            String extension = FileNameUtils.getExtension(path);
            String extension2 = FileNameUtils.getExtension(path2);
            if (!extension.startsWith("z")) {
                return -1;
            }
            if (extension2.startsWith("z")) {
                return Integer.valueOf(Integer.parseInt(extension.substring(1))).compareTo(Integer.valueOf(Integer.parseInt(extension2.substring(1))));
            }
            return 1;
        }
    }
}
