package org.apache.commons.compress.archivers.zip;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import org.apache.commons.compress.utils.BitInputStream;

/* loaded from: classes8.dex */
public class BitStream extends BitInputStream {
    public BitStream(InputStream inputStream) {
        super(inputStream, ByteOrder.LITTLE_ENDIAN);
    }

    public int nextBit() throws IOException {
        return (int) readBits(1);
    }

    public long nextBits(int i) throws IOException {
        if (i < 0 || i > 8) {
            throw new IOException("Trying to read " + i + " bits, at most 8 are allowed");
        }
        return readBits(i);
    }

    public int nextByte() throws IOException {
        return (int) readBits(8);
    }
}
