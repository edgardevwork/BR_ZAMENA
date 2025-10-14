package org.apache.commons.compress.archivers.zip;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.utils.CloseShieldFilterInputStream;
import org.apache.commons.compress.utils.CountingInputStream;
import org.apache.commons.compress.utils.ExactMath;
import org.apache.commons.compress.utils.InputStreamStatistics;

/* loaded from: classes8.dex */
public class ExplodingInputStream extends InputStream implements InputStreamStatistics {
    public BitStream bits;
    public final CircularBuffer buffer = new CircularBuffer(32768);
    public final int dictionarySize;
    public BinaryTree distanceTree;

    /* renamed from: in */
    public final InputStream f9833in;
    public BinaryTree lengthTree;
    public BinaryTree literalTree;
    public final int minimumMatchLength;
    public final int numberOfTrees;
    public long treeSizes;
    public long uncompressedCount;

    public ExplodingInputStream(int i, int i2, InputStream inputStream) {
        if (i != 4096 && i != 8192) {
            throw new IllegalArgumentException("The dictionary size must be 4096 or 8192");
        }
        if (i2 != 2 && i2 != 3) {
            throw new IllegalArgumentException("The number of trees must be 2 or 3");
        }
        this.dictionarySize = i;
        this.numberOfTrees = i2;
        this.minimumMatchLength = i2;
        this.f9833in = inputStream;
    }

    public final void init() throws IOException {
        if (this.bits == null) {
            CountingInputStream countingInputStream = new CountingInputStream(new CloseShieldFilterInputStream(this.f9833in));
            try {
                if (this.numberOfTrees == 3) {
                    this.literalTree = BinaryTree.decode(countingInputStream, 256);
                }
                this.lengthTree = BinaryTree.decode(countingInputStream, 64);
                this.distanceTree = BinaryTree.decode(countingInputStream, 64);
                this.treeSizes += countingInputStream.getBytesRead();
                countingInputStream.close();
                this.bits = new BitStream(this.f9833in);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        countingInputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (!this.buffer.available()) {
            try {
                fillBuffer();
            } catch (IllegalArgumentException e) {
                throw new IOException("bad IMPLODE stream", e);
            }
        }
        int i = this.buffer.get();
        if (i > -1) {
            this.uncompressedCount++;
        }
        return i;
    }

    @Override // org.apache.commons.compress.utils.InputStreamStatistics
    public long getCompressedCount() {
        return this.bits.getBytesRead() + this.treeSizes;
    }

    @Override // org.apache.commons.compress.utils.InputStreamStatistics
    public long getUncompressedCount() {
        return this.uncompressedCount;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f9833in.close();
    }

    public final void fillBuffer() throws IOException {
        int iNextByte;
        init();
        int iNextBit = this.bits.nextBit();
        if (iNextBit == -1) {
            return;
        }
        if (iNextBit == 1) {
            BinaryTree binaryTree = this.literalTree;
            if (binaryTree != null) {
                iNextByte = binaryTree.read(this.bits);
            } else {
                iNextByte = this.bits.nextByte();
            }
            if (iNextByte == -1) {
                return;
            }
            this.buffer.put(iNextByte);
            return;
        }
        int i = this.dictionarySize == 4096 ? 6 : 7;
        int iNextBits = (int) this.bits.nextBits(i);
        int i2 = this.distanceTree.read(this.bits);
        if (i2 != -1 || iNextBits > 0) {
            int i3 = (i2 << i) | iNextBits;
            int iAdd = this.lengthTree.read(this.bits);
            if (iAdd == 63) {
                long jNextBits = this.bits.nextBits(8);
                if (jNextBits == -1) {
                    return;
                } else {
                    iAdd = ExactMath.add(iAdd, jNextBits);
                }
            }
            this.buffer.copy(i3 + 1, iAdd + this.minimumMatchLength);
        }
    }
}
