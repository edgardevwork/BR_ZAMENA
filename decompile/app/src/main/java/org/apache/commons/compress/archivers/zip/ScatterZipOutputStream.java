package org.apache.commons.compress.archivers.zip;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.commons.compress.parallel.FileBasedScatterGatherBackingStore;
import org.apache.commons.compress.parallel.ScatterGatherBackingStore;
import org.apache.commons.compress.utils.BoundedInputStream;

/* loaded from: classes5.dex */
public class ScatterZipOutputStream implements Closeable {
    public final ScatterGatherBackingStore backingStore;
    public final StreamCompressor streamCompressor;
    public ZipEntryWriter zipEntryWriter;
    public final Queue<CompressedEntry> items = new ConcurrentLinkedQueue();
    public final AtomicBoolean isClosed = new AtomicBoolean();

    public static class CompressedEntry {
        public final long compressedSize;
        public final long crc;
        public final long size;
        public final ZipArchiveEntryRequest zipArchiveEntryRequest;

        public CompressedEntry(ZipArchiveEntryRequest zipArchiveEntryRequest, long j, long j2, long j3) {
            this.zipArchiveEntryRequest = zipArchiveEntryRequest;
            this.crc = j;
            this.compressedSize = j2;
            this.size = j3;
        }

        public ZipArchiveEntry transferToArchiveEntry() {
            ZipArchiveEntry zipArchiveEntry = this.zipArchiveEntryRequest.getZipArchiveEntry();
            zipArchiveEntry.setCompressedSize(this.compressedSize);
            zipArchiveEntry.setSize(this.size);
            zipArchiveEntry.setCrc(this.crc);
            zipArchiveEntry.setMethod(this.zipArchiveEntryRequest.getMethod());
            return zipArchiveEntry;
        }
    }

    public ScatterZipOutputStream(ScatterGatherBackingStore scatterGatherBackingStore, StreamCompressor streamCompressor) {
        this.backingStore = scatterGatherBackingStore;
        this.streamCompressor = streamCompressor;
    }

    public void addArchiveEntry(ZipArchiveEntryRequest zipArchiveEntryRequest) throws IOException {
        InputStream payloadStream = zipArchiveEntryRequest.getPayloadStream();
        try {
            this.streamCompressor.deflate(payloadStream, zipArchiveEntryRequest.getMethod());
            if (payloadStream != null) {
                payloadStream.close();
            }
            this.items.add(new CompressedEntry(zipArchiveEntryRequest, this.streamCompressor.getCrc32(), this.streamCompressor.getBytesWrittenForLastEntry(), this.streamCompressor.getBytesRead()));
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (payloadStream != null) {
                    try {
                        payloadStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public void writeTo(ZipArchiveOutputStream zipArchiveOutputStream) throws IOException {
        this.backingStore.closeForWriting();
        InputStream inputStream = this.backingStore.getInputStream();
        try {
            for (CompressedEntry compressedEntry : this.items) {
                BoundedInputStream boundedInputStream = new BoundedInputStream(inputStream, compressedEntry.compressedSize);
                try {
                    zipArchiveOutputStream.addRawArchiveEntry(compressedEntry.transferToArchiveEntry(), boundedInputStream);
                    boundedInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            boundedInputStream.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            }
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th6) {
                        th4.addSuppressed(th6);
                    }
                }
                throw th5;
            }
        }
    }

    public static class ZipEntryWriter implements Closeable {
        public final Iterator<CompressedEntry> itemsIterator;
        public final InputStream itemsIteratorData;

        public ZipEntryWriter(ScatterZipOutputStream scatterZipOutputStream) throws IOException {
            scatterZipOutputStream.backingStore.closeForWriting();
            this.itemsIterator = scatterZipOutputStream.items.iterator();
            this.itemsIteratorData = scatterZipOutputStream.backingStore.getInputStream();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            InputStream inputStream = this.itemsIteratorData;
            if (inputStream != null) {
                inputStream.close();
            }
        }

        public void writeNextZipEntry(ZipArchiveOutputStream zipArchiveOutputStream) throws IOException {
            CompressedEntry next = this.itemsIterator.next();
            BoundedInputStream boundedInputStream = new BoundedInputStream(this.itemsIteratorData, next.compressedSize);
            try {
                zipArchiveOutputStream.addRawArchiveEntry(next.transferToArchiveEntry(), boundedInputStream);
                boundedInputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        boundedInputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
    }

    public ZipEntryWriter zipEntryWriter() throws IOException {
        if (this.zipEntryWriter == null) {
            this.zipEntryWriter = new ZipEntryWriter(this);
        }
        return this.zipEntryWriter;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.isClosed.compareAndSet(false, true)) {
            try {
                ZipEntryWriter zipEntryWriter = this.zipEntryWriter;
                if (zipEntryWriter != null) {
                    zipEntryWriter.close();
                }
                this.backingStore.close();
                this.streamCompressor.close();
            } catch (Throwable th) {
                this.streamCompressor.close();
                throw th;
            }
        }
    }

    public static ScatterZipOutputStream fileBased(File file) throws FileNotFoundException {
        return pathBased(file.toPath(), -1);
    }

    public static ScatterZipOutputStream pathBased(Path path) throws FileNotFoundException {
        return pathBased(path, -1);
    }

    public static ScatterZipOutputStream fileBased(File file, int i) throws FileNotFoundException {
        return pathBased(file.toPath(), i);
    }

    public static ScatterZipOutputStream pathBased(Path path, int i) throws FileNotFoundException {
        FileBasedScatterGatherBackingStore fileBasedScatterGatherBackingStore = new FileBasedScatterGatherBackingStore(path);
        return new ScatterZipOutputStream(fileBasedScatterGatherBackingStore, StreamCompressor.create(i, fileBasedScatterGatherBackingStore));
    }
}
