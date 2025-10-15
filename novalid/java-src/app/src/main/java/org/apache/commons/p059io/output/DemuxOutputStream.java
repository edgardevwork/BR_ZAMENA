package org.apache.commons.p059io.output;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.p059io.IOUtils;

/* loaded from: classes6.dex */
public class DemuxOutputStream extends OutputStream {
    public final InheritableThreadLocal<OutputStream> outputStreamThreadLocal = new InheritableThreadLocal<>();

    public OutputStream bindStream(OutputStream outputStream) {
        OutputStream outputStream2 = this.outputStreamThreadLocal.get();
        this.outputStreamThreadLocal.set(outputStream);
        return outputStream2;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IOUtils.close(this.outputStreamThreadLocal.get());
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        OutputStream outputStream = this.outputStreamThreadLocal.get();
        if (outputStream != null) {
            outputStream.flush();
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        OutputStream outputStream = this.outputStreamThreadLocal.get();
        if (outputStream != null) {
            outputStream.write(i);
        }
    }
}
