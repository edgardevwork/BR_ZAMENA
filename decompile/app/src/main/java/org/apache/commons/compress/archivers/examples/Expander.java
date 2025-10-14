package org.apache.commons.compress.archivers.examples;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.Enumeration;
import java.util.Iterator;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveException;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.apache.commons.compress.archivers.sevenz.SevenZFile;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarFile;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipFile;
import org.apache.commons.compress.utils.IOUtils;

/* loaded from: classes5.dex */
public class Expander {

    public interface ArchiveEntrySupplier {
        ArchiveEntry getNextReadableEntry() throws IOException;
    }

    public interface EntryWriter {
        void writeEntryDataTo(ArchiveEntry archiveEntry, OutputStream outputStream) throws IOException;
    }

    public final void expand(ArchiveEntrySupplier archiveEntrySupplier, EntryWriter entryWriter, Path path) throws IOException {
        boolean z = path == null;
        Path pathNormalize = z ? null : path.normalize();
        ArchiveEntry nextReadableEntry = archiveEntrySupplier.getNextReadableEntry();
        while (nextReadableEntry != null) {
            Path pathResolve = z ? null : path.resolve(nextReadableEntry.getName());
            if (!z && !pathResolve.normalize().startsWith(pathNormalize) && !Files.isSameFile(path, pathResolve)) {
                throw new IOException("Expanding " + nextReadableEntry.getName() + " would create file outside of " + path);
            }
            if (nextReadableEntry.isDirectory()) {
                if (!z && !Files.isDirectory(pathResolve, new LinkOption[0]) && Files.createDirectories(pathResolve, new FileAttribute[0]) == null) {
                    throw new IOException("Failed to create directory " + pathResolve);
                }
            } else {
                Path parent = z ? null : pathResolve.getParent();
                if (!z && !Files.isDirectory(parent, new LinkOption[0]) && Files.createDirectories(parent, new FileAttribute[0]) == null) {
                    throw new IOException("Failed to create directory " + parent);
                }
                if (z) {
                    entryWriter.writeEntryDataTo(nextReadableEntry, null);
                } else {
                    OutputStream outputStreamNewOutputStream = Files.newOutputStream(pathResolve, new OpenOption[0]);
                    try {
                        entryWriter.writeEntryDataTo(nextReadableEntry, outputStreamNewOutputStream);
                        if (outputStreamNewOutputStream != null) {
                            outputStreamNewOutputStream.close();
                        }
                    } finally {
                    }
                }
            }
            nextReadableEntry = archiveEntrySupplier.getNextReadableEntry();
        }
    }

    public void expand(ArchiveInputStream archiveInputStream, File file) throws IOException {
        expand(archiveInputStream, toPath(file));
    }

    public void expand(final ArchiveInputStream archiveInputStream, Path path) throws IOException {
        expand(new ArchiveEntrySupplier() { // from class: org.apache.commons.compress.archivers.examples.Expander$$ExternalSyntheticLambda4
            @Override // org.apache.commons.compress.archivers.examples.Expander.ArchiveEntrySupplier
            public final ArchiveEntry getNextReadableEntry() {
                return Expander.lambda$expand$0(archiveInputStream);
            }
        }, new EntryWriter() { // from class: org.apache.commons.compress.archivers.examples.Expander$$ExternalSyntheticLambda5
            @Override // org.apache.commons.compress.archivers.examples.Expander.EntryWriter
            public final void writeEntryDataTo(ArchiveEntry archiveEntry, OutputStream outputStream) throws IOException {
                IOUtils.copy(archiveInputStream, outputStream);
            }
        }, path);
    }

    public static /* synthetic */ ArchiveEntry lambda$expand$0(ArchiveInputStream archiveInputStream) throws IOException {
        ArchiveEntry nextEntry = archiveInputStream.getNextEntry();
        while (nextEntry != null && !archiveInputStream.canReadEntryData(nextEntry)) {
            nextEntry = archiveInputStream.getNextEntry();
        }
        return nextEntry;
    }

    public void expand(File file, File file2) throws ArchiveException, IOException {
        expand(file.toPath(), toPath(file2));
    }

    @Deprecated
    public void expand(InputStream inputStream, File file) throws ArchiveException, IOException {
        expand(inputStream, file, CloseableConsumer.NULL_CONSUMER);
    }

    public void expand(InputStream inputStream, File file, CloseableConsumer closeableConsumer) throws ArchiveException, IOException {
        CloseableConsumerAdapter closeableConsumerAdapter = new CloseableConsumerAdapter(closeableConsumer);
        try {
            expand((ArchiveInputStream) closeableConsumerAdapter.track(ArchiveStreamFactory.DEFAULT.createArchiveInputStream(inputStream)), file);
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

    public void expand(Path path, Path path2) throws ArchiveException, IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(Files.newInputStream(path, new OpenOption[0]));
        try {
            String strDetect = ArchiveStreamFactory.detect(bufferedInputStream);
            bufferedInputStream.close();
            expand(strDetect, path, path2);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public void expand(SevenZFile sevenZFile, File file) throws IOException {
        expand(sevenZFile, toPath(file));
    }

    public void expand(final SevenZFile sevenZFile, Path path) throws IOException {
        sevenZFile.getClass();
        expand(new ArchiveEntrySupplier() { // from class: org.apache.commons.compress.archivers.examples.Expander$$ExternalSyntheticLambda0
            @Override // org.apache.commons.compress.archivers.examples.Expander.ArchiveEntrySupplier
            public final ArchiveEntry getNextReadableEntry() {
                return sevenZFile.getNextEntry();
            }
        }, new EntryWriter() { // from class: org.apache.commons.compress.archivers.examples.Expander$$ExternalSyntheticLambda1
            @Override // org.apache.commons.compress.archivers.examples.Expander.EntryWriter
            public final void writeEntryDataTo(ArchiveEntry archiveEntry, OutputStream outputStream) throws IOException {
                Expander.lambda$expand$2(sevenZFile, archiveEntry, outputStream);
            }
        }, path);
    }

    public static /* synthetic */ void lambda$expand$2(SevenZFile sevenZFile, ArchiveEntry archiveEntry, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int i = sevenZFile.read(bArr);
            if (-1 == i) {
                return;
            }
            if (outputStream != null) {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    public void expand(String str, File file, File file2) throws ArchiveException, IOException {
        expand(str, file.toPath(), toPath(file2));
    }

    @Deprecated
    public void expand(String str, InputStream inputStream, File file) throws ArchiveException, IOException {
        expand(str, inputStream, file, CloseableConsumer.NULL_CONSUMER);
    }

    public void expand(String str, InputStream inputStream, File file, CloseableConsumer closeableConsumer) throws ArchiveException, IOException {
        expand(str, inputStream, toPath(file), closeableConsumer);
    }

    public void expand(String str, InputStream inputStream, Path path, CloseableConsumer closeableConsumer) throws ArchiveException, IOException {
        CloseableConsumerAdapter closeableConsumerAdapter = new CloseableConsumerAdapter(closeableConsumer);
        try {
            expand((ArchiveInputStream) closeableConsumerAdapter.track(ArchiveStreamFactory.DEFAULT.createArchiveInputStream(str, inputStream)), path);
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

    public void expand(String str, Path path, Path path2) throws ArchiveException, IOException {
        if (prefersSeekableByteChannel(str)) {
            FileChannel fileChannelOpen = FileChannel.open(path, StandardOpenOption.READ);
            try {
                expand(str, fileChannelOpen, path2, CloseableConsumer.CLOSING_CONSUMER);
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
        BufferedInputStream bufferedInputStream = new BufferedInputStream(Files.newInputStream(path, new OpenOption[0]));
        try {
            expand(str, bufferedInputStream, path2, CloseableConsumer.CLOSING_CONSUMER);
            bufferedInputStream.close();
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th6) {
                    th4.addSuppressed(th6);
                }
                throw th5;
            }
        }
    }

    @Deprecated
    public void expand(String str, SeekableByteChannel seekableByteChannel, File file) throws ArchiveException, IOException {
        expand(str, seekableByteChannel, file, CloseableConsumer.NULL_CONSUMER);
    }

    public void expand(String str, SeekableByteChannel seekableByteChannel, File file, CloseableConsumer closeableConsumer) throws ArchiveException, IOException {
        expand(str, seekableByteChannel, toPath(file), closeableConsumer);
    }

    public void expand(String str, SeekableByteChannel seekableByteChannel, Path path, CloseableConsumer closeableConsumer) throws ArchiveException, IOException {
        CloseableConsumerAdapter closeableConsumerAdapter = new CloseableConsumerAdapter(closeableConsumer);
        try {
            if (!prefersSeekableByteChannel(str)) {
                expand(str, (InputStream) closeableConsumerAdapter.track(Channels.newInputStream(seekableByteChannel)), path, CloseableConsumer.NULL_CONSUMER);
            } else if (ArchiveStreamFactory.TAR.equalsIgnoreCase(str)) {
                expand((TarFile) closeableConsumerAdapter.track(new TarFile(seekableByteChannel)), path);
            } else if (ArchiveStreamFactory.ZIP.equalsIgnoreCase(str)) {
                expand((ZipFile) closeableConsumerAdapter.track(new ZipFile(seekableByteChannel)), path);
            } else if (ArchiveStreamFactory.SEVEN_Z.equalsIgnoreCase(str)) {
                expand((SevenZFile) closeableConsumerAdapter.track(new SevenZFile(seekableByteChannel)), path);
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

    public void expand(TarFile tarFile, File file) throws IOException {
        expand(tarFile, toPath(file));
    }

    public void expand(final TarFile tarFile, Path path) throws IOException {
        final Iterator<TarArchiveEntry> it = tarFile.getEntries().iterator();
        expand(new ArchiveEntrySupplier() { // from class: org.apache.commons.compress.archivers.examples.Expander$$ExternalSyntheticLambda2
            @Override // org.apache.commons.compress.archivers.examples.Expander.ArchiveEntrySupplier
            public final ArchiveEntry getNextReadableEntry() {
                return Expander.lambda$expand$3(it);
            }
        }, new EntryWriter() { // from class: org.apache.commons.compress.archivers.examples.Expander$$ExternalSyntheticLambda3
            @Override // org.apache.commons.compress.archivers.examples.Expander.EntryWriter
            public final void writeEntryDataTo(ArchiveEntry archiveEntry, OutputStream outputStream) throws IOException {
                Expander.lambda$expand$4(tarFile, archiveEntry, outputStream);
            }
        }, path);
    }

    public static /* synthetic */ ArchiveEntry lambda$expand$3(Iterator it) throws IOException {
        if (it.hasNext()) {
            return (ArchiveEntry) it.next();
        }
        return null;
    }

    public static /* synthetic */ void lambda$expand$4(TarFile tarFile, ArchiveEntry archiveEntry, OutputStream outputStream) throws IOException {
        InputStream inputStream = tarFile.getInputStream((TarArchiveEntry) archiveEntry);
        try {
            IOUtils.copy(inputStream, outputStream);
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public void expand(ZipFile zipFile, File file) throws IOException {
        expand(zipFile, toPath(file));
    }

    public void expand(final ZipFile zipFile, Path path) throws IOException {
        final Enumeration<ZipArchiveEntry> entries = zipFile.getEntries();
        expand(new ArchiveEntrySupplier() { // from class: org.apache.commons.compress.archivers.examples.Expander$$ExternalSyntheticLambda6
            @Override // org.apache.commons.compress.archivers.examples.Expander.ArchiveEntrySupplier
            public final ArchiveEntry getNextReadableEntry() {
                return Expander.lambda$expand$5(entries, zipFile);
            }
        }, new EntryWriter() { // from class: org.apache.commons.compress.archivers.examples.Expander$$ExternalSyntheticLambda7
            @Override // org.apache.commons.compress.archivers.examples.Expander.EntryWriter
            public final void writeEntryDataTo(ArchiveEntry archiveEntry, OutputStream outputStream) throws IOException {
                Expander.lambda$expand$6(zipFile, archiveEntry, outputStream);
            }
        }, path);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x000f, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ ArchiveEntry lambda$expand$5(Enumeration enumeration, ZipFile zipFile) throws IOException {
        ZipArchiveEntry zipArchiveEntry;
        if (enumeration.hasMoreElements()) {
            zipArchiveEntry = (ZipArchiveEntry) enumeration.nextElement();
            while (zipArchiveEntry != null && !zipFile.canReadEntryData(zipArchiveEntry)) {
                if (enumeration.hasMoreElements()) {
                    zipArchiveEntry = (ZipArchiveEntry) enumeration.nextElement();
                }
            }
            return zipArchiveEntry;
        }
        zipArchiveEntry = null;
    }

    public static /* synthetic */ void lambda$expand$6(ZipFile zipFile, ArchiveEntry archiveEntry, OutputStream outputStream) throws IOException {
        InputStream inputStream = zipFile.getInputStream((ZipArchiveEntry) archiveEntry);
        try {
            IOUtils.copy(inputStream, outputStream);
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public final boolean prefersSeekableByteChannel(String str) {
        return ArchiveStreamFactory.TAR.equalsIgnoreCase(str) || ArchiveStreamFactory.ZIP.equalsIgnoreCase(str) || ArchiveStreamFactory.SEVEN_Z.equalsIgnoreCase(str);
    }

    public final Path toPath(File file) {
        if (file != null) {
            return file.toPath();
        }
        return null;
    }
}
