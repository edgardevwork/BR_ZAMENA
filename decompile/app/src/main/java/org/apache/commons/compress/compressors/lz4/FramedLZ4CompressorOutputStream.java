package org.apache.commons.compress.compressors.lz4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.compress.compressors.CompressorOutputStream;
import org.apache.commons.compress.utils.ByteUtils;

/* loaded from: classes6.dex */
public class FramedLZ4CompressorOutputStream extends CompressorOutputStream {
    public static final byte[] END_MARK = new byte[4];
    public final byte[] blockData;
    public final byte[] blockDependencyBuffer;
    public final XXHash32 blockHash;
    public int collectedBlockDependencyBytes;
    public final XXHash32 contentHash;
    public int currentIndex;
    public boolean finished;
    public final byte[] oneByte;
    public final OutputStream out;
    public final Parameters params;

    public enum BlockSize {
        K64(65536, 4),
        K256(262144, 5),
        M1(1048576, 6),
        M4(4194304, 7);

        public final int index;
        public final int size;

        BlockSize(int i, int i2) {
            this.size = i;
            this.index = i2;
        }

        public int getSize() {
            return this.size;
        }

        public int getIndex() {
            return this.index;
        }
    }

    public static class Parameters {
        public static final Parameters DEFAULT = new Parameters(BlockSize.M4, true, false, false);
        public final BlockSize blockSize;
        public final org.apache.commons.compress.compressors.lz77support.Parameters lz77params;
        public final boolean withBlockChecksum;
        public final boolean withBlockDependency;
        public final boolean withContentChecksum;

        public Parameters(BlockSize blockSize) {
            this(blockSize, true, false, false);
        }

        public Parameters(BlockSize blockSize, org.apache.commons.compress.compressors.lz77support.Parameters parameters) {
            this(blockSize, true, false, false, parameters);
        }

        public Parameters(BlockSize blockSize, boolean z, boolean z2, boolean z3) {
            this(blockSize, z, z2, z3, BlockLZ4CompressorOutputStream.createParameterBuilder().build());
        }

        public Parameters(BlockSize blockSize, boolean z, boolean z2, boolean z3, org.apache.commons.compress.compressors.lz77support.Parameters parameters) {
            this.blockSize = blockSize;
            this.withContentChecksum = z;
            this.withBlockChecksum = z2;
            this.withBlockDependency = z3;
            this.lz77params = parameters;
        }

        public String toString() {
            return "LZ4 Parameters with BlockSize " + this.blockSize + ", withContentChecksum " + this.withContentChecksum + ", withBlockChecksum " + this.withBlockChecksum + ", withBlockDependency " + this.withBlockDependency;
        }
    }

    public FramedLZ4CompressorOutputStream(OutputStream outputStream) throws IOException {
        this(outputStream, Parameters.DEFAULT);
    }

    public FramedLZ4CompressorOutputStream(OutputStream outputStream, Parameters parameters) throws IOException {
        this.oneByte = new byte[1];
        this.contentHash = new XXHash32();
        this.params = parameters;
        this.blockData = new byte[parameters.blockSize.getSize()];
        this.out = outputStream;
        this.blockHash = parameters.withBlockChecksum ? new XXHash32() : null;
        outputStream.write(FramedLZ4CompressorInputStream.LZ4_SIGNATURE);
        writeFrameDescriptor();
        this.blockDependencyBuffer = parameters.withBlockDependency ? new byte[65536] : null;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.oneByte;
        bArr[0] = (byte) (i & 255);
        write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.params.withContentChecksum) {
            this.contentHash.update(bArr, i, i2);
        }
        int length = this.blockData.length;
        if (this.currentIndex + i2 > length) {
            flushBlock();
            while (i2 > length) {
                System.arraycopy(bArr, i, this.blockData, 0, length);
                i += length;
                i2 -= length;
                this.currentIndex = length;
                flushBlock();
            }
        }
        System.arraycopy(bArr, i, this.blockData, this.currentIndex, i2);
        this.currentIndex += i2;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            finish();
        } finally {
            this.out.close();
        }
    }

    public void finish() throws IOException {
        if (this.finished) {
            return;
        }
        if (this.currentIndex > 0) {
            flushBlock();
        }
        writeTrailer();
        this.finished = true;
    }

    public final void writeFrameDescriptor() throws IOException {
        int i = !this.params.withBlockDependency ? 96 : 64;
        if (this.params.withContentChecksum) {
            i |= 4;
        }
        if (this.params.withBlockChecksum) {
            i |= 16;
        }
        this.out.write(i);
        this.contentHash.update(i);
        int index = (this.params.blockSize.getIndex() << 4) & 112;
        this.out.write(index);
        this.contentHash.update(index);
        this.out.write((int) ((this.contentHash.getValue() >> 8) & 255));
        this.contentHash.reset();
    }

    public final void flushBlock() throws IOException {
        boolean z = this.params.withBlockDependency;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream = new BlockLZ4CompressorOutputStream(byteArrayOutputStream, this.params.lz77params);
        if (z) {
            try {
                byte[] bArr = this.blockDependencyBuffer;
                int length = bArr.length;
                int i = this.collectedBlockDependencyBytes;
                blockLZ4CompressorOutputStream.prefill(bArr, length - i, i);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        blockLZ4CompressorOutputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
        blockLZ4CompressorOutputStream.write(this.blockData, 0, this.currentIndex);
        blockLZ4CompressorOutputStream.close();
        if (z) {
            appendToBlockDependencyBuffer(this.blockData, 0, this.currentIndex);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray.length > this.currentIndex) {
            ByteUtils.toLittleEndian(this.out, Integer.MIN_VALUE | r2, 4);
            this.out.write(this.blockData, 0, this.currentIndex);
            if (this.params.withBlockChecksum) {
                this.blockHash.update(this.blockData, 0, this.currentIndex);
            }
        } else {
            ByteUtils.toLittleEndian(this.out, byteArray.length, 4);
            this.out.write(byteArray);
            if (this.params.withBlockChecksum) {
                this.blockHash.update(byteArray, 0, byteArray.length);
            }
        }
        if (this.params.withBlockChecksum) {
            ByteUtils.toLittleEndian(this.out, this.blockHash.getValue(), 4);
            this.blockHash.reset();
        }
        this.currentIndex = 0;
    }

    private void writeTrailer() throws IOException {
        this.out.write(END_MARK);
        if (this.params.withContentChecksum) {
            ByteUtils.toLittleEndian(this.out, this.contentHash.getValue(), 4);
        }
    }

    private void appendToBlockDependencyBuffer(byte[] bArr, int i, int i2) {
        int iMin = Math.min(i2, this.blockDependencyBuffer.length);
        if (iMin > 0) {
            byte[] bArr2 = this.blockDependencyBuffer;
            int length = bArr2.length - iMin;
            if (length > 0) {
                System.arraycopy(bArr2, iMin, bArr2, 0, length);
            }
            System.arraycopy(bArr, i, this.blockDependencyBuffer, length, iMin);
            this.collectedBlockDependencyBytes = Math.min(this.collectedBlockDependencyBytes + iMin, this.blockDependencyBuffer.length);
        }
    }
}
