package org.apache.commons.p059io.input;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.p059io.IOUtils;

/* loaded from: classes6.dex */
public class DemuxInputStream extends InputStream {
    public final InheritableThreadLocal<InputStream> inputStreamLocal = new InheritableThreadLocal<>();

    public InputStream bindStream(InputStream inputStream) {
        InputStream inputStream2 = this.inputStreamLocal.get();
        this.inputStreamLocal.set(inputStream);
        return inputStream2;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IOUtils.close(this.inputStreamLocal.get());
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        InputStream inputStream = this.inputStreamLocal.get();
        if (inputStream != null) {
            return inputStream.read();
        }
        return -1;
    }
}
