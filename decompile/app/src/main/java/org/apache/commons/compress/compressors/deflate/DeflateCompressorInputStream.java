package org.apache.commons.compress.compressors.deflate;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import org.apache.commons.compress.compressors.CompressorInputStream;
import org.apache.commons.compress.utils.CountingInputStream;
import org.apache.commons.compress.utils.IOUtils;
import org.apache.commons.compress.utils.InputStreamStatistics;

/* loaded from: classes6.dex */
public class DeflateCompressorInputStream extends CompressorInputStream implements InputStreamStatistics {
    public static final int MAGIC_1 = 120;
    public static final int MAGIC_2a = 1;
    public static final int MAGIC_2b = 94;
    public static final int MAGIC_2c = 156;
    public static final int MAGIC_2d = 218;
    public final CountingInputStream countingStream;

    /* renamed from: in */
    public final InputStream f9847in;
    public final Inflater inflater;

    public DeflateCompressorInputStream(InputStream inputStream) {
        this(inputStream, new DeflateParameters());
    }

    public DeflateCompressorInputStream(InputStream inputStream, DeflateParameters deflateParameters) {
        Inflater inflater = new Inflater(!deflateParameters.withZlibHeader());
        this.inflater = inflater;
        CountingInputStream countingInputStream = new CountingInputStream(inputStream);
        this.countingStream = countingInputStream;
        this.f9847in = new InflaterInputStream(countingInputStream, inflater);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i = this.f9847in.read();
        count(i == -1 ? 0 : 1);
        return i;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f9847in.read(bArr, i, i2);
        count(i3);
        return i3;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        return IOUtils.skip(this.f9847in, j);
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f9847in.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            this.f9847in.close();
        } finally {
            this.inflater.end();
        }
    }

    @Override // org.apache.commons.compress.utils.InputStreamStatistics
    public long getCompressedCount() {
        return this.countingStream.getBytesRead();
    }

    public static boolean matches(byte[] bArr, int i) {
        if (i <= 3 || bArr[0] != 120) {
            return false;
        }
        byte b = bArr[1];
        return b == 1 || b == 94 || b == -100 || b == -38;
    }
}
