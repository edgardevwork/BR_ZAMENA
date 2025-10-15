package org.apache.commons.compress.compressors.brotli;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.compressors.CompressorInputStream;
import org.apache.commons.compress.utils.CountingInputStream;
import org.apache.commons.compress.utils.IOUtils;
import org.apache.commons.compress.utils.InputStreamStatistics;
import org.brotli.dec.BrotliInputStream;

/* loaded from: classes6.dex */
public class BrotliCompressorInputStream extends CompressorInputStream implements InputStreamStatistics {
    public final CountingInputStream countingStream;
    public final BrotliInputStream decIS;

    public BrotliCompressorInputStream(InputStream inputStream) throws IOException {
        CountingInputStream countingInputStream = new CountingInputStream(inputStream);
        this.countingStream = countingInputStream;
        this.decIS = new BrotliInputStream(countingInputStream);
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.decIS.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.decIS.close();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return this.decIS.read(bArr);
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        return IOUtils.skip(this.decIS, j);
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        this.decIS.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.decIS.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i = this.decIS.read();
        count(i == -1 ? 0 : 1);
        return i;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.decIS.read(bArr, i, i2);
        count(i3);
        return i3;
    }

    public String toString() {
        return this.decIS.toString();
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.decIS.reset();
    }

    @Override // org.apache.commons.compress.utils.InputStreamStatistics
    public long getCompressedCount() {
        return this.countingStream.getBytesRead();
    }
}
