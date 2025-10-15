package org.apache.commons.p059io.output;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

/* loaded from: classes6.dex */
public class ChunkedWriter extends FilterWriter {
    public static final int DEFAULT_CHUNK_SIZE = 4096;
    public final int chunkSize;

    public ChunkedWriter(Writer writer, int i) {
        super(writer);
        if (i <= 0) {
            throw new IllegalArgumentException();
        }
        this.chunkSize = i;
    }

    public ChunkedWriter(Writer writer) {
        this(writer, 4096);
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        while (i2 > 0) {
            int iMin = Math.min(i2, this.chunkSize);
            ((FilterWriter) this).out.write(cArr, i, iMin);
            i2 -= iMin;
            i += iMin;
        }
    }
}
