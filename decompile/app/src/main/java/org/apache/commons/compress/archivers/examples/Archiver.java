package org.apache.commons.compress.archivers.examples;

import com.fasterxml.jackson.databind.ext.NioPathDeserializer$$ExternalSyntheticApiModelOutline0;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.EnumSet;
import java.util.Objects;
import org.apache.commons.compress.archivers.ArchiveException;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.apache.commons.compress.archivers.sevenz.SevenZOutputFile;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream;
import org.apache.commons.compress.utils.IOUtils;

/* loaded from: classes5.dex */
public class Archiver {
    public static final EnumSet<FileVisitOption> EMPTY_FileVisitOption = EnumSet.noneOf(Archiver$$ExternalSyntheticApiModelOutline2.m7282m());

    public static class ArchiverFileVisitor extends SimpleFileVisitor<Path> {
        public final Path directory;
        public final LinkOption[] linkOptions;
        public final ArchiveOutputStream target;

        @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
        public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) throws IOException {
            return preVisitDirectory(NioPathDeserializer$$ExternalSyntheticApiModelOutline0.m1025m(obj), basicFileAttributes);
        }

        @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
        public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) throws IOException {
            return visitFile(NioPathDeserializer$$ExternalSyntheticApiModelOutline0.m1025m(obj), basicFileAttributes);
        }

        public ArchiverFileVisitor(ArchiveOutputStream archiveOutputStream, Path path, LinkOption... linkOptionArr) {
            this.target = archiveOutputStream;
            this.directory = path;
            this.linkOptions = linkOptionArr == null ? IOUtils.EMPTY_LINK_OPTIONS : (LinkOption[]) linkOptionArr.clone();
        }

        public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
            return visit(path, basicFileAttributes, false);
        }

        public FileVisitResult visit(Path path, BasicFileAttributes basicFileAttributes, boolean z) throws IOException {
            Objects.requireNonNull(path);
            Objects.requireNonNull(basicFileAttributes);
            String strReplace = this.directory.relativize(path).toString().replace('\\', '/');
            if (!strReplace.isEmpty()) {
                ArchiveOutputStream archiveOutputStream = this.target;
                if (!z && !strReplace.endsWith("/")) {
                    strReplace = strReplace + "/";
                }
                this.target.putArchiveEntry(archiveOutputStream.createArchiveEntry(path, strReplace, this.linkOptions));
                if (z) {
                    Files.copy(path, this.target);
                }
                this.target.closeArchiveEntry();
            }
            return FileVisitResult.CONTINUE;
        }

        public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
            return visit(path, basicFileAttributes, true);
        }
    }

    public void create(ArchiveOutputStream archiveOutputStream, File file) throws IOException {
        create(archiveOutputStream, file.toPath(), EMPTY_FileVisitOption, new LinkOption[0]);
    }

    public void create(ArchiveOutputStream archiveOutputStream, Path path, EnumSet<FileVisitOption> enumSet, LinkOption... linkOptionArr) throws IOException {
        Files.walkFileTree(path, enumSet, Integer.MAX_VALUE, new ArchiverFileVisitor(archiveOutputStream, path, linkOptionArr));
        archiveOutputStream.finish();
    }

    public void create(ArchiveOutputStream archiveOutputStream, Path path) throws IOException {
        create(archiveOutputStream, path, EMPTY_FileVisitOption, new LinkOption[0]);
    }

    public void create(SevenZOutputFile sevenZOutputFile, File file) throws IOException {
        create(sevenZOutputFile, file.toPath());
    }

    public void create(final SevenZOutputFile sevenZOutputFile, final Path path) throws IOException {
        Files.walkFileTree(path, new ArchiverFileVisitor(null, path, new LinkOption[0]) { // from class: org.apache.commons.compress.archivers.examples.Archiver.1
            @Override // org.apache.commons.compress.archivers.examples.Archiver.ArchiverFileVisitor
            public FileVisitResult visit(Path path2, BasicFileAttributes basicFileAttributes, boolean z) throws IOException {
                Objects.requireNonNull(path2);
                Objects.requireNonNull(basicFileAttributes);
                String strReplace = path.relativize(path2).toString().replace('\\', '/');
                if (!strReplace.isEmpty()) {
                    SevenZOutputFile sevenZOutputFile2 = sevenZOutputFile;
                    if (!z && !strReplace.endsWith("/")) {
                        strReplace = strReplace + "/";
                    }
                    sevenZOutputFile.putArchiveEntry(sevenZOutputFile2.createArchiveEntry(path2, strReplace, new LinkOption[0]));
                    if (z) {
                        sevenZOutputFile.write(path2, new OpenOption[0]);
                    }
                    sevenZOutputFile.closeArchiveEntry();
                }
                return FileVisitResult.CONTINUE;
            }
        });
        sevenZOutputFile.finish();
    }

    public void create(String str, File file, File file2) throws ArchiveException, IOException {
        create(str, file.toPath(), file2.toPath());
    }

    @Deprecated
    public void create(String str, OutputStream outputStream, File file) throws ArchiveException, IOException {
        create(str, outputStream, file, CloseableConsumer.NULL_CONSUMER);
    }

    public void create(String str, OutputStream outputStream, File file, CloseableConsumer closeableConsumer) throws ArchiveException, IOException {
        CloseableConsumerAdapter closeableConsumerAdapter = new CloseableConsumerAdapter(closeableConsumer);
        try {
            create((ArchiveOutputStream) closeableConsumerAdapter.track(ArchiveStreamFactory.DEFAULT.createArchiveOutputStream(str, outputStream)), file);
            closeableConsumerAdapter.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    closeableConsumerAdapter.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public void create(String str, Path path, Path path2) throws ArchiveException, IOException {
        if (prefersSeekableByteChannel(str)) {
            FileChannel fileChannelOpen = FileChannel.open(path, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            try {
                create(str, fileChannelOpen, path2);
                if (fileChannelOpen != null) {
                    fileChannelOpen.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (fileChannelOpen != null) {
                        try {
                            fileChannelOpen.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        }
        ArchiveOutputStream archiveOutputStreamCreateArchiveOutputStream = ArchiveStreamFactory.DEFAULT.createArchiveOutputStream(str, Files.newOutputStream(path, new OpenOption[0]));
        try {
            create(archiveOutputStreamCreateArchiveOutputStream, path2, EMPTY_FileVisitOption, new LinkOption[0]);
            if (archiveOutputStreamCreateArchiveOutputStream != null) {
                archiveOutputStreamCreateArchiveOutputStream.close();
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                if (archiveOutputStreamCreateArchiveOutputStream != null) {
                    try {
                        archiveOutputStreamCreateArchiveOutputStream.close();
                    } catch (Throwable th6) {
                        th4.addSuppressed(th6);
                    }
                }
                throw th5;
            }
        }
    }

    @Deprecated
    public void create(String str, SeekableByteChannel seekableByteChannel, File file) throws ArchiveException, IOException {
        create(str, seekableByteChannel, file, CloseableConsumer.NULL_CONSUMER);
    }

    public void create(String str, SeekableByteChannel seekableByteChannel, File file, CloseableConsumer closeableConsumer) throws ArchiveException, IOException {
        CloseableConsumerAdapter closeableConsumerAdapter = new CloseableConsumerAdapter(closeableConsumer);
        try {
            if (!prefersSeekableByteChannel(str)) {
                create(str, (OutputStream) closeableConsumerAdapter.track(Channels.newOutputStream(seekableByteChannel)), file);
            } else if (ArchiveStreamFactory.ZIP.equalsIgnoreCase(str)) {
                create((ArchiveOutputStream) closeableConsumerAdapter.track(new ZipArchiveOutputStream(seekableByteChannel)), file);
            } else if (ArchiveStreamFactory.SEVEN_Z.equalsIgnoreCase(str)) {
                create((SevenZOutputFile) closeableConsumerAdapter.track(new SevenZOutputFile(seekableByteChannel)), file);
            } else {
                throw new ArchiveException("Don't know how to handle format " + str);
            }
            closeableConsumerAdapter.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    closeableConsumerAdapter.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public void create(String str, SeekableByteChannel seekableByteChannel, Path path) throws IOException {
        if (ArchiveStreamFactory.SEVEN_Z.equalsIgnoreCase(str)) {
            SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(seekableByteChannel);
            try {
                create(sevenZOutputFile, path);
                sevenZOutputFile.close();
                return;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        sevenZOutputFile.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
        if (ArchiveStreamFactory.ZIP.equalsIgnoreCase(str)) {
            ZipArchiveOutputStream zipArchiveOutputStream = new ZipArchiveOutputStream(seekableByteChannel);
            try {
                create(zipArchiveOutputStream, path, EMPTY_FileVisitOption, new LinkOption[0]);
                zipArchiveOutputStream.close();
                return;
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    try {
                        zipArchiveOutputStream.close();
                    } catch (Throwable th6) {
                        th4.addSuppressed(th6);
                    }
                    throw th5;
                }
            }
        }
        throw new IllegalStateException(str);
    }

    public final boolean prefersSeekableByteChannel(String str) {
        return ArchiveStreamFactory.ZIP.equalsIgnoreCase(str) || ArchiveStreamFactory.SEVEN_Z.equalsIgnoreCase(str);
    }
}
