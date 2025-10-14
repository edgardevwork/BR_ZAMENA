package org.apache.commons.compress.parallel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;

/* loaded from: classes5.dex */
public class FileBasedScatterGatherBackingStore implements ScatterGatherBackingStore {
    public boolean closed;
    public final OutputStream outputStream;
    public final Path target;

    public FileBasedScatterGatherBackingStore(File file) throws FileNotFoundException {
        this(file.toPath());
    }

    public FileBasedScatterGatherBackingStore(Path path) throws FileNotFoundException {
        this.target = path;
        try {
            this.outputStream = Files.newOutputStream(path, new OpenOption[0]);
        } catch (FileNotFoundException e) {
            throw e;
        } catch (IOException e2) {
            throw new UncheckedIOException(e2);
        }
    }

    @Override // org.apache.commons.compress.parallel.ScatterGatherBackingStore
    public InputStream getInputStream() throws IOException {
        return Files.newInputStream(this.target, new OpenOption[0]);
    }

    @Override // org.apache.commons.compress.parallel.ScatterGatherBackingStore
    public void closeForWriting() throws IOException {
        if (this.closed) {
            return;
        }
        this.outputStream.close();
        this.closed = true;
    }

    @Override // org.apache.commons.compress.parallel.ScatterGatherBackingStore
    public void writeOut(byte[] bArr, int i, int i2) throws IOException {
        this.outputStream.write(bArr, i, i2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            closeForWriting();
        } finally {
            Files.deleteIfExists(this.target);
        }
    }
}
