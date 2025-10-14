package org.apache.commons.p059io.output;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import org.apache.commons.p059io.FileUtils;
import org.apache.commons.p059io.IOUtils;

/* loaded from: classes5.dex */
public class DeferredFileOutputStream extends ThresholdingOutputStream {
    public boolean closed;
    public OutputStream currentOutputStream;
    public final File directory;
    public ByteArrayOutputStream memoryOutputStream;
    public File outputFile;
    public final String prefix;
    public final String suffix;

    public DeferredFileOutputStream(int i, File file) {
        this(i, file, null, null, null, 1024);
    }

    public DeferredFileOutputStream(int i, File file, String str, String str2, File file2, int i2) {
        super(i);
        this.outputFile = file;
        this.prefix = str;
        this.suffix = str2;
        this.directory = file2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        this.memoryOutputStream = byteArrayOutputStream;
        this.currentOutputStream = byteArrayOutputStream;
    }

    public DeferredFileOutputStream(int i, int i2, File file) {
        this(i, file, null, null, null, i2);
        if (i2 < 0) {
            throw new IllegalArgumentException("Initial buffer size must be atleast 0.");
        }
    }

    public DeferredFileOutputStream(int i, int i2, String str, String str2, File file) {
        this(i, null, str, str2, file, i2);
        if (str == null) {
            throw new IllegalArgumentException("Temporary file prefix is missing");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Initial buffer size must be atleast 0.");
        }
    }

    public DeferredFileOutputStream(int i, String str, String str2, File file) {
        this(i, null, str, str2, file, 1024);
        if (str == null) {
            throw new IllegalArgumentException("Temporary file prefix is missing");
        }
    }

    @Override // org.apache.commons.p059io.output.ThresholdingOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.closed = true;
    }

    public byte[] getData() {
        ByteArrayOutputStream byteArrayOutputStream = this.memoryOutputStream;
        if (byteArrayOutputStream != null) {
            return byteArrayOutputStream.toByteArray();
        }
        return null;
    }

    public File getFile() {
        return this.outputFile;
    }

    @Override // org.apache.commons.p059io.output.ThresholdingOutputStream
    public OutputStream getStream() throws IOException {
        return this.currentOutputStream;
    }

    public boolean isInMemory() {
        return !isThresholdExceeded();
    }

    @Override // org.apache.commons.p059io.output.ThresholdingOutputStream
    public void thresholdReached() throws IOException {
        String str = this.prefix;
        if (str != null) {
            this.outputFile = File.createTempFile(str, this.suffix, this.directory);
        }
        FileUtils.forceMkdirParent(this.outputFile);
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(this.outputFile.toPath(), new OpenOption[0]);
        try {
            this.memoryOutputStream.writeTo(outputStreamNewOutputStream);
            this.currentOutputStream = outputStreamNewOutputStream;
            this.memoryOutputStream = null;
        } catch (IOException e) {
            outputStreamNewOutputStream.close();
            throw e;
        }
    }

    public InputStream toInputStream() throws IOException {
        if (!this.closed) {
            throw new IOException("Stream not closed");
        }
        if (isInMemory()) {
            return this.memoryOutputStream.toInputStream();
        }
        return Files.newInputStream(this.outputFile.toPath(), new OpenOption[0]);
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        if (!this.closed) {
            throw new IOException("Stream not closed");
        }
        if (isInMemory()) {
            this.memoryOutputStream.writeTo(outputStream);
            return;
        }
        InputStream inputStreamNewInputStream = Files.newInputStream(this.outputFile.toPath(), new OpenOption[0]);
        try {
            IOUtils.copy(inputStreamNewInputStream, outputStream);
            if (inputStreamNewInputStream != null) {
                inputStreamNewInputStream.close();
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
}
