package org.apache.commons.compress.compressors.bzip2;

import androidx.media3.extractor.text.cea.Cea708Decoder;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import org.apache.commons.compress.compressors.CompressorOutputStream;

/* loaded from: classes6.dex */
public class BZip2CompressorOutputStream extends CompressorOutputStream implements BZip2Constants {
    public static final int GREATER_ICOST = 15;
    public static final int LESSER_ICOST = 0;
    public static final int MAX_BLOCKSIZE = 9;
    public static final int MIN_BLOCKSIZE = 1;
    public final int allowableBlockSize;
    public int blockCRC;
    public final int blockSize100k;
    public BlockSort blockSorter;
    public int bsBuff;
    public int bsLive;
    public volatile boolean closed;
    public int combinedCRC;
    public final CRC crc;
    public int currentChar;
    public Data data;
    public int last;
    public int nInUse;
    public int nMTF;
    public OutputStream out;
    public int runLength;

    public static void hbMakeCodeLengths(byte[] bArr, int[] iArr, Data data, int i, int i2) {
        int[] iArr2 = data.heap;
        int[] iArr3 = data.weight;
        int[] iArr4 = data.parent;
        int i3 = i;
        while (true) {
            int i4 = i3 - 1;
            int i5 = 1;
            if (i4 < 0) {
                break;
            }
            int i6 = iArr[i4];
            if (i6 != 0) {
                i5 = i6;
            }
            iArr3[i3] = i5 << 8;
            i3 = i4;
        }
        boolean z = true;
        while (z) {
            iArr2[0] = 0;
            iArr3[0] = 0;
            iArr4[0] = -2;
            int i7 = 0;
            for (int i8 = 1; i8 <= i; i8++) {
                iArr4[i8] = -1;
                i7++;
                iArr2[i7] = i8;
                int i9 = i7;
                while (true) {
                    int i10 = iArr3[i8];
                    int i11 = i9 >> 1;
                    int i12 = iArr2[i11];
                    if (i10 < iArr3[i12]) {
                        iArr2[i9] = i12;
                        i9 = i11;
                    }
                }
                iArr2[i9] = i8;
            }
            int i13 = i;
            while (i7 > 1) {
                int i14 = iArr2[1];
                int i15 = iArr2[i7];
                iArr2[1] = i15;
                int i16 = i7 - 1;
                int i17 = 1;
                while (true) {
                    int i18 = i17 << 1;
                    if (i18 > i16) {
                        break;
                    }
                    if (i18 < i16) {
                        int i19 = i18 + 1;
                        if (iArr3[iArr2[i19]] < iArr3[iArr2[i18]]) {
                            i18 = i19;
                        }
                    }
                    int i20 = iArr3[i15];
                    int i21 = iArr2[i18];
                    if (i20 < iArr3[i21]) {
                        break;
                    }
                    iArr2[i17] = i21;
                    i17 = i18;
                }
                iArr2[i17] = i15;
                int i22 = iArr2[1];
                int i23 = iArr2[i16];
                iArr2[1] = i23;
                int i24 = i7 - 2;
                int i25 = 1;
                while (true) {
                    int i26 = i25 << 1;
                    if (i26 > i24) {
                        break;
                    }
                    if (i26 < i24) {
                        int i27 = i26 + 1;
                        if (iArr3[iArr2[i27]] < iArr3[iArr2[i26]]) {
                            i26 = i27;
                        }
                    }
                    int i28 = iArr3[i23];
                    int i29 = iArr2[i26];
                    if (i28 < iArr3[i29]) {
                        break;
                    }
                    iArr2[i25] = i29;
                    i25 = i26;
                }
                iArr2[i25] = i23;
                i13++;
                iArr4[i22] = i13;
                iArr4[i14] = i13;
                int i30 = iArr3[i14];
                int i31 = iArr3[i22];
                iArr3[i13] = (Math.max(i30 & 255, i31 & 255) + 1) | ((i30 & (-256)) + (i31 & (-256)));
                iArr4[i13] = -1;
                i7--;
                iArr2[i7] = i13;
                int i32 = iArr3[i13];
                int i33 = i7;
                while (true) {
                    int i34 = i33 >> 1;
                    int i35 = iArr2[i34];
                    if (i32 < iArr3[i35]) {
                        iArr2[i33] = i35;
                        i33 = i34;
                    }
                }
                iArr2[i33] = i13;
            }
            z = false;
            for (int i36 = 1; i36 <= i; i36++) {
                int i37 = i36;
                int i38 = 0;
                while (true) {
                    i37 = iArr4[i37];
                    if (i37 < 0) {
                        break;
                    } else {
                        i38++;
                    }
                }
                bArr[i36 - 1] = (byte) i38;
                if (i38 > i2) {
                    z = true;
                }
            }
            if (z) {
                for (int i39 = 1; i39 < i; i39++) {
                    iArr3[i39] = ((iArr3[i39] >> 9) + 1) << 8;
                }
            }
        }
    }

    public static int chooseBlockSize(long j) {
        if (j > 0) {
            return (int) Math.min((j / 132000) + 1, 9L);
        }
        return 9;
    }

    public BZip2CompressorOutputStream(OutputStream outputStream) throws IOException {
        this(outputStream, 9);
    }

    public BZip2CompressorOutputStream(OutputStream outputStream, int i) throws IOException {
        this.crc = new CRC();
        this.currentChar = -1;
        if (i < 1) {
            throw new IllegalArgumentException("blockSize(" + i + ") < 1");
        }
        if (i > 9) {
            throw new IllegalArgumentException("blockSize(" + i + ") > 9");
        }
        this.blockSize100k = i;
        this.out = outputStream;
        this.allowableBlockSize = (i * 100000) - 20;
        init();
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        if (this.closed) {
            throw new IOException("Closed");
        }
        write0(i);
    }

    public final void writeRun() throws IOException {
        int i = this.last;
        if (i < this.allowableBlockSize) {
            int i2 = this.currentChar;
            Data data = this.data;
            data.inUse[i2] = true;
            byte b = (byte) i2;
            int i3 = this.runLength;
            this.crc.updateCRC(i2, i3);
            if (i3 == 1) {
                data.block[i + 2] = b;
                this.last = i + 1;
                return;
            }
            if (i3 == 2) {
                byte[] bArr = data.block;
                int i4 = i + 2;
                bArr[i4] = b;
                bArr[i + 3] = b;
                this.last = i4;
                return;
            }
            if (i3 == 3) {
                byte[] bArr2 = data.block;
                bArr2[i + 2] = b;
                int i5 = i + 3;
                bArr2[i5] = b;
                bArr2[i + 4] = b;
                this.last = i5;
                return;
            }
            int i6 = i3 - 4;
            data.inUse[i6] = true;
            byte[] bArr3 = data.block;
            bArr3[i + 2] = b;
            bArr3[i + 3] = b;
            bArr3[i + 4] = b;
            int i7 = i + 5;
            bArr3[i7] = b;
            bArr3[i + 6] = (byte) i6;
            this.last = i7;
            return;
        }
        endBlock();
        initBlock();
        writeRun();
    }

    public void finalize() throws Throwable {
        if (!this.closed) {
            System.err.println("Unclosed BZip2CompressorOutputStream detected, will *not* close it");
        }
        super.finalize();
    }

    public void finish() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        try {
            if (this.runLength > 0) {
                writeRun();
            }
            this.currentChar = -1;
            endBlock();
            endCompression();
            this.out = null;
            this.blockSorter = null;
            this.data = null;
        } catch (Throwable th) {
            this.out = null;
            this.blockSorter = null;
            this.data = null;
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        OutputStream outputStream = this.out;
        try {
            finish();
            if (outputStream != null) {
                outputStream.close();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        OutputStream outputStream = this.out;
        if (outputStream != null) {
            outputStream.flush();
        }
    }

    private void init() throws IOException {
        bsPutUByte(66);
        bsPutUByte(90);
        this.data = new Data(this.blockSize100k);
        this.blockSorter = new BlockSort(this.data);
        bsPutUByte(104);
        bsPutUByte(this.blockSize100k + 48);
        this.combinedCRC = 0;
        initBlock();
    }

    private void initBlock() {
        this.crc.initializeCRC();
        this.last = -1;
        boolean[] zArr = this.data.inUse;
        int i = 256;
        while (true) {
            i--;
            if (i < 0) {
                return;
            } else {
                zArr[i] = false;
            }
        }
    }

    private void endBlock() throws IOException {
        int finalCRC = this.crc.getFinalCRC();
        this.blockCRC = finalCRC;
        int i = this.combinedCRC;
        this.combinedCRC = finalCRC ^ ((i >>> 31) | (i << 1));
        if (this.last == -1) {
            return;
        }
        blockSort();
        bsPutUByte(49);
        bsPutUByte(65);
        bsPutUByte(89);
        bsPutUByte(38);
        bsPutUByte(83);
        bsPutUByte(89);
        bsPutInt(this.blockCRC);
        bsW(1, 0);
        moveToFrontCodeAndSend();
    }

    public final void endCompression() throws IOException {
        bsPutUByte(23);
        bsPutUByte(114);
        bsPutUByte(69);
        bsPutUByte(56);
        bsPutUByte(80);
        bsPutUByte(Cea708Decoder.COMMAND_SPA);
        bsPutInt(this.combinedCRC);
        bsFinishedWithStream();
    }

    public final int getBlockSize() {
        return this.blockSize100k;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0) {
            throw new IndexOutOfBoundsException("offs(" + i + ") < 0.");
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("len(" + i2 + ") < 0.");
        }
        int i3 = i + i2;
        if (i3 > bArr.length) {
            throw new IndexOutOfBoundsException("offs(" + i + ") + len(" + i2 + ") > buf.length(" + bArr.length + ").");
        }
        if (this.closed) {
            throw new IOException("Stream closed");
        }
        while (i < i3) {
            write0(bArr[i]);
            i++;
        }
    }

    public final void write0(int i) throws IOException {
        int i2 = this.currentChar;
        if (i2 == -1) {
            this.currentChar = i & 255;
            this.runLength++;
            return;
        }
        int i3 = i & 255;
        if (i2 == i3) {
            int i4 = this.runLength + 1;
            this.runLength = i4;
            if (i4 > 254) {
                writeRun();
                this.currentChar = -1;
                this.runLength = 0;
                return;
            }
            return;
        }
        writeRun();
        this.runLength = 1;
        this.currentChar = i3;
    }

    public static void hbAssignCodes(int[] iArr, byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        while (i <= i2) {
            for (int i5 = 0; i5 < i3; i5++) {
                if ((bArr[i5] & 255) == i) {
                    iArr[i5] = i4;
                    i4++;
                }
            }
            i4 <<= 1;
            i++;
        }
    }

    public final void bsFinishedWithStream() throws IOException {
        while (this.bsLive > 0) {
            this.out.write(this.bsBuff >> 24);
            this.bsBuff <<= 8;
            this.bsLive -= 8;
        }
    }

    public final void bsW(int i, int i2) throws IOException {
        OutputStream outputStream = this.out;
        int i3 = this.bsLive;
        int i4 = this.bsBuff;
        while (i3 >= 8) {
            outputStream.write(i4 >> 24);
            i4 <<= 8;
            i3 -= 8;
        }
        this.bsBuff = (i2 << ((32 - i3) - i)) | i4;
        this.bsLive = i3 + i;
    }

    public final void bsPutUByte(int i) throws IOException {
        bsW(8, i);
    }

    public final void bsPutInt(int i) throws IOException {
        bsW(8, (i >> 24) & 255);
        bsW(8, (i >> 16) & 255);
        bsW(8, (i >> 8) & 255);
        bsW(8, i & 255);
    }

    public final void sendMTFValues() throws IOException {
        byte[][] bArr = this.data.sendMTFValues_len;
        int i = this.nInUse + 2;
        int i2 = 6;
        while (true) {
            i2--;
            if (i2 < 0) {
                break;
            }
            byte[] bArr2 = bArr[i2];
            int i3 = i;
            while (true) {
                i3--;
                if (i3 >= 0) {
                    bArr2[i3] = Ascii.f786SI;
                }
            }
        }
        int i4 = this.nMTF;
        int i5 = i4 >= 200 ? i4 < 600 ? 3 : i4 < 1200 ? 4 : i4 < 2400 ? 5 : 6 : 2;
        sendMTFValues0(i5, i);
        int iSendMTFValues1 = sendMTFValues1(i5, i);
        sendMTFValues2(i5, iSendMTFValues1);
        sendMTFValues3(i5, i);
        sendMTFValues4();
        sendMTFValues5(i5, iSendMTFValues1);
        sendMTFValues6(i5, i);
        sendMTFValues7();
    }

    public final void sendMTFValues0(int i, int i2) {
        Data data = this.data;
        byte[][] bArr = data.sendMTFValues_len;
        int[] iArr = data.mtfFreq;
        int i3 = this.nMTF;
        int i4 = 0;
        for (int i5 = i; i5 > 0; i5--) {
            int i6 = i3 / i5;
            int i7 = i4 - 1;
            int i8 = i2 - 1;
            int i9 = 0;
            while (i9 < i6 && i7 < i8) {
                i7++;
                i9 += iArr[i7];
            }
            if (i7 > i4 && i5 != i && i5 != 1 && (1 & (i - i5)) != 0) {
                i9 -= iArr[i7];
                i7--;
            }
            byte[] bArr2 = bArr[i5 - 1];
            int i10 = i2;
            while (true) {
                i10--;
                if (i10 >= 0) {
                    if (i10 >= i4 && i10 <= i7) {
                        bArr2[i10] = 0;
                    } else {
                        bArr2[i10] = Ascii.f786SI;
                    }
                }
            }
            i4 = i7 + 1;
            i3 -= i9;
        }
    }

    public final int sendMTFValues1(int i, int i2) {
        byte[] bArr;
        int i3;
        BZip2CompressorOutputStream bZip2CompressorOutputStream = this;
        Data data = bZip2CompressorOutputStream.data;
        int[][] iArr = data.sendMTFValues_rfreq;
        int[] iArr2 = data.sendMTFValues_fave;
        short[] sArr = data.sendMTFValues_cost;
        char[] cArr = data.sfmap;
        byte[] bArr2 = data.selector;
        byte[][] bArr3 = data.sendMTFValues_len;
        int i4 = 0;
        byte[] bArr4 = bArr3[0];
        byte[] bArr5 = bArr3[1];
        byte[] bArr6 = bArr3[2];
        byte[] bArr7 = bArr3[3];
        int i5 = 4;
        byte[] bArr8 = bArr3[4];
        byte[] bArr9 = bArr3[5];
        int i6 = bZip2CompressorOutputStream.nMTF;
        int i7 = 0;
        int i8 = 0;
        while (i7 < i5) {
            int i9 = i;
            while (true) {
                i9--;
                if (i9 < 0) {
                    break;
                }
                iArr2[i9] = i4;
                int[] iArr3 = iArr[i9];
                int i10 = i2;
                while (true) {
                    i10--;
                    if (i10 >= 0) {
                        iArr3[i10] = i4;
                    }
                }
            }
            int i11 = i4;
            i8 = i11;
            while (i11 < bZip2CompressorOutputStream.nMTF) {
                int i12 = i11;
                int iMin = Math.min(i11 + 49, i6 - 1);
                if (i == 6) {
                    int i13 = i12;
                    short s = 0;
                    short s2 = 0;
                    short s3 = 0;
                    short s4 = 0;
                    short s5 = 0;
                    short s6 = 0;
                    while (i13 <= iMin) {
                        char c = cArr[i13];
                        int i14 = i6;
                        short s7 = (short) (s + (bArr4[c] & 255));
                        byte[] bArr10 = bArr4;
                        short s8 = (short) (s2 + (bArr5[c] & 255));
                        short s9 = (short) (s3 + (bArr6[c] & 255));
                        short s10 = (short) (s4 + (bArr7[c] & 255));
                        short s11 = (short) (s5 + (bArr8[c] & 255));
                        i13++;
                        s6 = (short) (s6 + (bArr9[c] & 255));
                        s5 = s11;
                        bArr4 = bArr10;
                        s4 = s10;
                        s3 = s9;
                        s2 = s8;
                        s = s7;
                        i6 = i14;
                    }
                    bArr = bArr4;
                    i3 = i6;
                    sArr[0] = s;
                    sArr[1] = s2;
                    sArr[2] = s3;
                    sArr[3] = s4;
                    sArr[4] = s5;
                    sArr[5] = s6;
                } else {
                    bArr = bArr4;
                    i3 = i6;
                    int i15 = i;
                    while (true) {
                        i15--;
                        if (i15 < 0) {
                            break;
                        }
                        sArr[i15] = 0;
                    }
                    for (int i16 = i12; i16 <= iMin; i16++) {
                        char c2 = cArr[i16];
                        int i17 = i;
                        while (true) {
                            i17--;
                            if (i17 >= 0) {
                                sArr[i17] = (short) (sArr[i17] + (bArr3[i17][c2] & 255));
                            }
                        }
                    }
                }
                short s12 = 999999999;
                int i18 = i;
                int i19 = -1;
                while (true) {
                    i18--;
                    if (i18 < 0) {
                        break;
                    }
                    byte[] bArr11 = bArr5;
                    short s13 = sArr[i18];
                    if (s13 < s12) {
                        s12 = s13;
                        i19 = i18;
                    }
                    bArr5 = bArr11;
                }
                byte[] bArr12 = bArr5;
                iArr2[i19] = iArr2[i19] + 1;
                bArr2[i8] = (byte) i19;
                i8++;
                int[] iArr4 = iArr[i19];
                for (int i20 = i12; i20 <= iMin; i20++) {
                    char c3 = cArr[i20];
                    iArr4[c3] = iArr4[c3] + 1;
                }
                i11 = iMin + 1;
                bArr5 = bArr12;
                i6 = i3;
                bArr4 = bArr;
            }
            byte[] bArr13 = bArr4;
            byte[] bArr14 = bArr5;
            int i21 = i6;
            int i22 = 0;
            while (i22 < i) {
                hbMakeCodeLengths(bArr3[i22], iArr[i22], bZip2CompressorOutputStream.data, i2, 20);
                i22++;
                bZip2CompressorOutputStream = this;
            }
            i7++;
            i4 = 0;
            bZip2CompressorOutputStream = this;
            i5 = 4;
            bArr5 = bArr14;
            i6 = i21;
            bArr4 = bArr13;
        }
        return i8;
    }

    public final void sendMTFValues2(int i, int i2) {
        Data data = this.data;
        byte[] bArr = data.sendMTFValues2_pos;
        while (true) {
            i--;
            if (i < 0) {
                break;
            } else {
                bArr[i] = (byte) i;
            }
        }
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = data.selector[i3];
            byte b2 = bArr[0];
            int i4 = 0;
            while (b != b2) {
                i4++;
                byte b3 = bArr[i4];
                bArr[i4] = b2;
                b2 = b3;
            }
            bArr[0] = b2;
            data.selectorMtf[i3] = (byte) i4;
        }
    }

    public final void sendMTFValues3(int i, int i2) {
        Data data = this.data;
        int[][] iArr = data.sendMTFValues_code;
        byte[][] bArr = data.sendMTFValues_len;
        for (int i3 = 0; i3 < i; i3++) {
            byte[] bArr2 = bArr[i3];
            int i4 = 32;
            int i5 = i2;
            int i6 = 0;
            while (true) {
                i5--;
                if (i5 >= 0) {
                    int i7 = bArr2[i5] & 255;
                    if (i7 > i6) {
                        i6 = i7;
                    }
                    if (i7 < i4) {
                        i4 = i7;
                    }
                }
            }
            hbAssignCodes(iArr[i3], bArr[i3], i4, i6, i2);
        }
    }

    public final void sendMTFValues4() throws IOException {
        Data data = this.data;
        boolean[] zArr = data.inUse;
        boolean[] zArr2 = data.sentMTFValues4_inUse16;
        int i = 16;
        while (true) {
            i--;
            if (i < 0) {
                break;
            }
            zArr2[i] = false;
            int i2 = i * 16;
            int i3 = 16;
            while (true) {
                i3--;
                if (i3 >= 0) {
                    if (zArr[i2 + i3]) {
                        zArr2[i] = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        for (int i4 = 0; i4 < 16; i4++) {
            bsW(1, zArr2[i4] ? 1 : 0);
        }
        OutputStream outputStream = this.out;
        int i5 = this.bsLive;
        int i6 = this.bsBuff;
        for (int i7 = 0; i7 < 16; i7++) {
            if (zArr2[i7]) {
                int i8 = i7 * 16;
                for (int i9 = 0; i9 < 16; i9++) {
                    while (i5 >= 8) {
                        outputStream.write(i6 >> 24);
                        i6 <<= 8;
                        i5 -= 8;
                    }
                    if (zArr[i8 + i9]) {
                        i6 |= 1 << (31 - i5);
                    }
                    i5++;
                }
            }
        }
        this.bsBuff = i6;
        this.bsLive = i5;
    }

    public final void sendMTFValues5(int i, int i2) throws IOException {
        bsW(3, i);
        bsW(15, i2);
        OutputStream outputStream = this.out;
        byte[] bArr = this.data.selectorMtf;
        int i3 = this.bsLive;
        int i4 = this.bsBuff;
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = bArr[i5] & 255;
            for (int i7 = 0; i7 < i6; i7++) {
                while (i3 >= 8) {
                    outputStream.write(i4 >> 24);
                    i4 <<= 8;
                    i3 -= 8;
                }
                i4 |= 1 << (31 - i3);
                i3++;
            }
            while (i3 >= 8) {
                outputStream.write(i4 >> 24);
                i4 <<= 8;
                i3 -= 8;
            }
            i3++;
        }
        this.bsBuff = i4;
        this.bsLive = i3;
    }

    public final void sendMTFValues6(int i, int i2) throws IOException {
        byte[][] bArr = this.data.sendMTFValues_len;
        OutputStream outputStream = this.out;
        int i3 = this.bsLive;
        int i4 = this.bsBuff;
        for (int i5 = 0; i5 < i; i5++) {
            byte[] bArr2 = bArr[i5];
            int i6 = bArr2[0] & 255;
            while (i3 >= 8) {
                outputStream.write(i4 >> 24);
                i4 <<= 8;
                i3 -= 8;
            }
            i4 |= i6 << (27 - i3);
            i3 += 5;
            for (int i7 = 0; i7 < i2; i7++) {
                int i8 = bArr2[i7] & 255;
                while (i6 < i8) {
                    while (i3 >= 8) {
                        outputStream.write(i4 >> 24);
                        i4 <<= 8;
                        i3 -= 8;
                    }
                    i4 |= 2 << (30 - i3);
                    i3 += 2;
                    i6++;
                }
                while (i6 > i8) {
                    while (i3 >= 8) {
                        outputStream.write(i4 >> 24);
                        i4 <<= 8;
                        i3 -= 8;
                    }
                    i4 |= 3 << (30 - i3);
                    i3 += 2;
                    i6--;
                }
                while (i3 >= 8) {
                    outputStream.write(i4 >> 24);
                    i4 <<= 8;
                    i3 -= 8;
                }
                i3++;
            }
        }
        this.bsBuff = i4;
        this.bsLive = i3;
    }

    public final void sendMTFValues7() throws IOException {
        Data data = this.data;
        byte[][] bArr = data.sendMTFValues_len;
        int[][] iArr = data.sendMTFValues_code;
        OutputStream outputStream = this.out;
        byte[] bArr2 = data.selector;
        char[] cArr = data.sfmap;
        int i = this.nMTF;
        int i2 = this.bsLive;
        int i3 = this.bsBuff;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i) {
            int iMin = Math.min(i4 + 49, i - 1);
            int i6 = bArr2[i5] & 255;
            int[] iArr2 = iArr[i6];
            byte[] bArr3 = bArr[i6];
            while (i4 <= iMin) {
                char c = cArr[i4];
                while (i2 >= 8) {
                    outputStream.write(i3 >> 24);
                    i3 <<= 8;
                    i2 -= 8;
                }
                int i7 = bArr3[c] & 255;
                i3 |= iArr2[c] << ((32 - i2) - i7);
                i2 += i7;
                i4++;
            }
            i4 = iMin + 1;
            i5++;
        }
        this.bsBuff = i3;
        this.bsLive = i2;
    }

    public final void moveToFrontCodeAndSend() throws IOException {
        bsW(24, this.data.origPtr);
        generateMTFValues();
        sendMTFValues();
    }

    public final void blockSort() {
        this.blockSorter.blockSort(this.data, this.last);
    }

    public final void generateMTFValues() {
        int i = this.last;
        Data data = this.data;
        boolean[] zArr = data.inUse;
        byte[] bArr = data.block;
        int[] iArr = data.fmap;
        char[] cArr = data.sfmap;
        int[] iArr2 = data.mtfFreq;
        byte[] bArr2 = data.unseqToSeq;
        byte[] bArr3 = data.generateMTFValues_yy;
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            if (zArr[i3]) {
                bArr2[i3] = (byte) i2;
                i2++;
            }
        }
        this.nInUse = i2;
        int i4 = i2 + 1;
        Arrays.fill(iArr2, 0, i2 + 2, 0);
        while (true) {
            i2--;
            if (i2 < 0) {
                break;
            } else {
                bArr3[i2] = (byte) i2;
            }
        }
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 <= i; i7++) {
            byte b = bArr2[bArr[iArr[i7]] & 255];
            byte b2 = bArr3[0];
            int i8 = 0;
            while (b != b2) {
                i8++;
                byte b3 = bArr3[i8];
                bArr3[i8] = b2;
                b2 = b3;
            }
            bArr3[0] = b2;
            if (i8 == 0) {
                i5++;
            } else {
                if (i5 > 0) {
                    int i9 = i5 - 1;
                    while (true) {
                        if ((i9 & 1) == 0) {
                            cArr[i6] = 0;
                            i6++;
                            iArr2[0] = iArr2[0] + 1;
                        } else {
                            cArr[i6] = 1;
                            i6++;
                            iArr2[1] = iArr2[1] + 1;
                        }
                        if (i9 < 2) {
                            break;
                        } else {
                            i9 = (i9 - 2) >> 1;
                        }
                    }
                    i5 = 0;
                }
                int i10 = i8 + 1;
                cArr[i6] = (char) i10;
                i6++;
                iArr2[i10] = iArr2[i10] + 1;
            }
        }
        if (i5 > 0) {
            int i11 = i5 - 1;
            while (true) {
                if ((i11 & 1) == 0) {
                    cArr[i6] = 0;
                    i6++;
                    iArr2[0] = iArr2[0] + 1;
                } else {
                    cArr[i6] = 1;
                    i6++;
                    iArr2[1] = iArr2[1] + 1;
                }
                if (i11 < 2) {
                    break;
                } else {
                    i11 = (i11 - 2) >> 1;
                }
            }
        }
        cArr[i6] = (char) i4;
        iArr2[i4] = iArr2[i4] + 1;
        this.nMTF = i6 + 1;
    }

    public static final class Data {
        public final byte[] block;
        public final int[] fmap;
        public final int[] heap;
        public int origPtr;
        public final int[] parent;
        public final byte[] sendMTFValues2_pos;
        public final int[][] sendMTFValues_code;
        public final short[] sendMTFValues_cost;
        public final int[] sendMTFValues_fave;
        public final int[][] sendMTFValues_rfreq;
        public final boolean[] sentMTFValues4_inUse16;
        public final char[] sfmap;
        public final int[] weight;
        public final boolean[] inUse = new boolean[256];
        public final byte[] unseqToSeq = new byte[256];
        public final int[] mtfFreq = new int[BZip2Constants.MAX_ALPHA_SIZE];
        public final byte[] selector = new byte[BZip2Constants.MAX_SELECTORS];
        public final byte[] selectorMtf = new byte[BZip2Constants.MAX_SELECTORS];
        public final byte[] generateMTFValues_yy = new byte[256];
        public final byte[][] sendMTFValues_len = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 6, BZip2Constants.MAX_ALPHA_SIZE);

        public Data(int i) {
            int[] iArr = {6, BZip2Constants.MAX_ALPHA_SIZE};
            Class cls = Integer.TYPE;
            this.sendMTFValues_rfreq = (int[][]) Array.newInstance((Class<?>) cls, iArr);
            this.sendMTFValues_fave = new int[6];
            this.sendMTFValues_cost = new short[6];
            this.sendMTFValues_code = (int[][]) Array.newInstance((Class<?>) cls, 6, BZip2Constants.MAX_ALPHA_SIZE);
            this.sendMTFValues2_pos = new byte[6];
            this.sentMTFValues4_inUse16 = new boolean[16];
            this.heap = new int[260];
            this.weight = new int[516];
            this.parent = new int[516];
            int i2 = 100000 * i;
            this.block = new byte[i2 + 21];
            this.fmap = new int[i2];
            this.sfmap = new char[i * 200000];
        }
    }
}
