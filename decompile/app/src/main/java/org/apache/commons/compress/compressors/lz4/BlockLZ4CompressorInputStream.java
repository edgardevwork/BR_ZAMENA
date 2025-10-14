package org.apache.commons.compress.compressors.lz4;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.compressors.lz77support.AbstractLZ77CompressorInputStream;
import org.apache.commons.compress.utils.ByteUtils;

/* loaded from: classes8.dex */
public class BlockLZ4CompressorInputStream extends AbstractLZ77CompressorInputStream {
    public static final int BACK_REFERENCE_SIZE_MASK = 15;
    public static final int LITERAL_SIZE_MASK = 240;
    public static final int SIZE_BITS = 4;
    public static final int WINDOW_SIZE = 65536;
    public int nextBackReferenceSize;
    public State state;

    /* loaded from: classes6.dex */
    public enum State {
        NO_BLOCK,
        IN_LITERAL,
        LOOKING_FOR_BACK_REFERENCE,
        IN_BACK_REFERENCE,
        EOF
    }

    public BlockLZ4CompressorInputStream(InputStream inputStream) {
        super(inputStream, 65536);
        this.state = State.NO_BLOCK;
    }

    /* renamed from: org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream$1 */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C110401 {

        /* renamed from: $SwitchMap$org$apache$commons$compress$compressors$lz4$BlockLZ4CompressorInputStream$State */
        public static final /* synthetic */ int[] f9850xf30f4b5;

        static {
            int[] iArr = new int[State.values().length];
            f9850xf30f4b5 = iArr;
            try {
                iArr[State.EOF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9850xf30f4b5[State.NO_BLOCK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9850xf30f4b5[State.IN_LITERAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9850xf30f4b5[State.LOOKING_FOR_BACK_REFERENCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9850xf30f4b5[State.IN_BACK_REFERENCE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = C110401.f9850xf30f4b5[this.state.ordinal()];
        if (i3 == 1) {
            return -1;
        }
        if (i3 == 2) {
            readSizes();
        } else if (i3 != 3) {
            if (i3 != 4) {
                if (i3 != 5) {
                    throw new IOException("Unknown stream state " + this.state);
                }
            } else if (!initializeBackReference()) {
                this.state = State.EOF;
                return -1;
            }
            int backReference = readBackReference(bArr, i, i2);
            if (!hasMoreDataInBlock()) {
                this.state = State.NO_BLOCK;
            }
            return backReference > 0 ? backReference : read(bArr, i, i2);
        }
        int literal = readLiteral(bArr, i, i2);
        if (!hasMoreDataInBlock()) {
            this.state = State.LOOKING_FOR_BACK_REFERENCE;
        }
        return literal > 0 ? literal : read(bArr, i, i2);
    }

    public final void readSizes() throws IOException {
        int oneByte = readOneByte();
        if (oneByte == -1) {
            throw new IOException("Premature end of stream while looking for next block");
        }
        this.nextBackReferenceSize = oneByte & 15;
        long sizeBytes = (oneByte & 240) >> 4;
        if (sizeBytes == 15) {
            sizeBytes += readSizeBytes();
        }
        if (sizeBytes < 0) {
            throw new IOException("Illegal block with a negative literal size found");
        }
        startLiteral(sizeBytes);
        this.state = State.IN_LITERAL;
    }

    public final long readSizeBytes() throws IOException {
        int oneByte;
        long j = 0;
        do {
            oneByte = readOneByte();
            if (oneByte == -1) {
                throw new IOException("Premature end of stream while parsing length");
            }
            j += oneByte;
        } while (oneByte == 255);
        return j;
    }

    public final boolean initializeBackReference() throws IOException {
        try {
            int iFromLittleEndian = (int) ByteUtils.fromLittleEndian(this.supplier, 2);
            int i = this.nextBackReferenceSize;
            long sizeBytes = i;
            if (i == 15) {
                sizeBytes += readSizeBytes();
            }
            if (sizeBytes < 0) {
                throw new IOException("Illegal block with a negative match length found");
            }
            try {
                startBackReference(iFromLittleEndian, sizeBytes + 4);
                this.state = State.IN_BACK_REFERENCE;
                return true;
            } catch (IllegalArgumentException e) {
                throw new IOException("Illegal block with bad offset found", e);
            }
        } catch (IOException e2) {
            if (this.nextBackReferenceSize == 0) {
                return false;
            }
            throw e2;
        }
    }
}
