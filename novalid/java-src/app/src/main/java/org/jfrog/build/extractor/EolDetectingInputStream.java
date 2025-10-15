package org.jfrog.build.extractor;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.apache.commons.lang3.StringUtils;

/* loaded from: classes8.dex */
public class EolDetectingInputStream extends InputStream {

    /* renamed from: cr */
    public boolean f10008cr;
    public InputStream inputStream;

    /* renamed from: lf */
    public boolean f10009lf;
    public static final byte[] lfBytes = {10};
    public static final byte[] crBytes = {13};

    public EolDetectingInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i = this.inputStream.read();
        if ((!this.f10009lf || !this.f10008cr) && i != -1) {
            isByteEol(new byte[]{(byte) (i >>> 24), (byte) (i >>> 16), (byte) (i >>> 8), (byte) i});
        }
        return i;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        int i = this.inputStream.read(bArr);
        if ((!this.f10009lf || !this.f10008cr) && i != -1) {
            isByteEol(bArr);
        }
        return i;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.inputStream.read(bArr, i, i2);
        if ((!this.f10009lf || !this.f10008cr) && i3 != -1) {
            isByteEol(Arrays.copyOfRange(bArr, i, (i3 - 1) + i));
        }
        return i3;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        return this.inputStream.skip(j);
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.inputStream.close();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.inputStream.mark(i);
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        this.inputStream.reset();
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.inputStream.markSupported();
    }

    public boolean isLf() {
        return this.f10009lf;
    }

    public boolean isCr() {
        return this.f10008cr;
    }

    public String getEol() {
        String str = "";
        if (this.f10008cr) {
            str = "\r";
        }
        if (!this.f10009lf) {
            return str;
        }
        return str + StringUtils.f9903LF;
    }

    public final void isByteEol(byte[] bArr) {
        if (!this.f10009lf) {
            this.f10009lf = isByteEol(bArr, lfBytes);
        }
        if (this.f10008cr) {
            return;
        }
        this.f10008cr = isByteEol(bArr, crBytes);
    }

    public final boolean isByteEol(byte[] bArr, byte[] bArr2) {
        Charset charset = StandardCharsets.UTF_8;
        return new String(bArr, charset).contains(new String(bArr2, charset));
    }
}
