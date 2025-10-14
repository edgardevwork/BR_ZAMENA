package org.apache.commons.compress.compressors.lzw;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import org.apache.commons.compress.MemoryLimitException;
import org.apache.commons.compress.compressors.CompressorInputStream;
import org.apache.commons.compress.utils.BitInputStream;
import org.apache.commons.compress.utils.InputStreamStatistics;

/* loaded from: classes6.dex */
public abstract class LZWInputStream extends CompressorInputStream implements InputStreamStatistics {
    public static final int DEFAULT_CODE_SIZE = 9;
    public static final int UNUSED_PREFIX = -1;
    public byte[] characters;

    /* renamed from: in */
    public final BitInputStream f9857in;
    public byte[] outputStack;
    public int outputStackLocation;
    public int[] prefixes;
    public byte previousCodeFirstChar;
    public int tableSize;
    public final byte[] oneByte = new byte[1];
    public int clearCode = -1;
    public int codeSize = 9;
    public int previousCode = -1;

    public abstract int addEntry(int i, byte b) throws IOException;

    public abstract int decompressNextSymbol() throws IOException;

    public LZWInputStream(InputStream inputStream, ByteOrder byteOrder) {
        this.f9857in = new BitInputStream(inputStream, byteOrder);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f9857in.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i = read(this.oneByte);
        return i < 0 ? i : this.oneByte[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int fromStack = readFromStack(bArr, i, i2);
        while (true) {
            int i3 = i2 - fromStack;
            if (i3 > 0) {
                int iDecompressNextSymbol = decompressNextSymbol();
                if (iDecompressNextSymbol < 0) {
                    if (fromStack <= 0) {
                        return iDecompressNextSymbol;
                    }
                    count(fromStack);
                    return fromStack;
                }
                fromStack += readFromStack(bArr, i + fromStack, i3);
            } else {
                count(fromStack);
                return fromStack;
            }
        }
    }

    @Override // org.apache.commons.compress.utils.InputStreamStatistics
    public long getCompressedCount() {
        return this.f9857in.getBytesRead();
    }

    public void setClearCode(int i) {
        this.clearCode = 1 << (i - 1);
    }

    public void initializeTables(int i, int i2) throws MemoryLimitException {
        if (i <= 0) {
            throw new IllegalArgumentException("maxCodeSize is " + i + ", must be bigger than 0");
        }
        if (i2 > -1) {
            long j = ((1 << i) * 6) >> 10;
            if (j > i2) {
                throw new MemoryLimitException(j, i2);
            }
        }
        initializeTables(i);
    }

    public void initializeTables(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxCodeSize is " + i + ", must be bigger than 0");
        }
        int i2 = 1 << i;
        this.prefixes = new int[i2];
        this.characters = new byte[i2];
        this.outputStack = new byte[i2];
        this.outputStackLocation = i2;
        for (int i3 = 0; i3 < 256; i3++) {
            this.prefixes[i3] = -1;
            this.characters[i3] = (byte) i3;
        }
    }

    public int readNextCode() throws IOException {
        int i = this.codeSize;
        if (i > 31) {
            throw new IllegalArgumentException("Code size must not be bigger than 31");
        }
        return (int) this.f9857in.readBits(i);
    }

    public int addEntry(int i, byte b, int i2) {
        int i3 = this.tableSize;
        if (i3 >= i2) {
            return -1;
        }
        this.prefixes[i3] = i;
        this.characters[i3] = b;
        this.tableSize = i3 + 1;
        return i3;
    }

    public int addRepeatOfPreviousCode() throws IOException {
        int i = this.previousCode;
        if (i == -1) {
            throw new IOException("The first code can't be a reference to its preceding code");
        }
        return addEntry(i, this.previousCodeFirstChar);
    }

    public int expandCodeToOutputStack(int i, boolean z) throws IOException {
        int i2 = i;
        while (i2 >= 0) {
            byte[] bArr = this.outputStack;
            int i3 = this.outputStackLocation - 1;
            this.outputStackLocation = i3;
            bArr[i3] = this.characters[i2];
            i2 = this.prefixes[i2];
        }
        int i4 = this.previousCode;
        if (i4 != -1 && !z) {
            addEntry(i4, this.outputStack[this.outputStackLocation]);
        }
        this.previousCode = i;
        byte[] bArr2 = this.outputStack;
        int i5 = this.outputStackLocation;
        this.previousCodeFirstChar = bArr2[i5];
        return i5;
    }

    public final int readFromStack(byte[] bArr, int i, int i2) {
        int length = this.outputStack.length - this.outputStackLocation;
        if (length <= 0) {
            return 0;
        }
        int iMin = Math.min(length, i2);
        System.arraycopy(this.outputStack, this.outputStackLocation, bArr, i, iMin);
        this.outputStackLocation += iMin;
        return iMin;
    }

    public int getCodeSize() {
        return this.codeSize;
    }

    public void resetCodeSize() {
        setCodeSize(9);
    }

    public void setCodeSize(int i) {
        this.codeSize = i;
    }

    public void incrementCodeSize() {
        this.codeSize++;
    }

    public void resetPreviousCode() {
        this.previousCode = -1;
    }

    public int getPrefix(int i) {
        return this.prefixes[i];
    }

    public void setPrefix(int i, int i2) {
        this.prefixes[i] = i2;
    }

    public int getPrefixesLength() {
        return this.prefixes.length;
    }

    public int getClearCode() {
        return this.clearCode;
    }

    public int getTableSize() {
        return this.tableSize;
    }

    public void setTableSize(int i) {
        this.tableSize = i;
    }
}
