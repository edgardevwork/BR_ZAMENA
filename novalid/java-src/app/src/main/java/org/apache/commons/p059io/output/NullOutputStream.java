package org.apache.commons.p059io.output;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes6.dex */
public class NullOutputStream extends OutputStream {
    public static final NullOutputStream NULL_OUTPUT_STREAM = new NullOutputStream();

    @Override // java.io.OutputStream
    public void write(int i) {
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
    }

    @Deprecated
    public NullOutputStream() {
    }
}
