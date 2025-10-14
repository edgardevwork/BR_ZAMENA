package org.apache.commons.codec.digest;

import java.util.zip.Checksum;

/* loaded from: classes5.dex */
public class XXHash32 implements Checksum {
    public static final int BUF_SIZE = 16;
    public static final int PRIME1 = -1640531535;
    public static final int PRIME2 = -2048144777;
    public static final int PRIME3 = -1028477379;
    public static final int PRIME4 = 668265263;
    public static final int PRIME5 = 374761393;
    public static final int ROTATE_BITS = 13;
    public final byte[] buffer;
    public final byte[] oneByte;
    public int pos;
    public final int seed;
    public final int[] state;
    public boolean stateUpdated;
    public int totalLen;

    public XXHash32() {
        this(0);
    }

    public XXHash32(int i) {
        this.oneByte = new byte[1];
        this.state = new int[4];
        this.buffer = new byte[16];
        this.seed = i;
        initializeState();
    }

    @Override // java.util.zip.Checksum
    public void reset() {
        initializeState();
        this.totalLen = 0;
        this.pos = 0;
        this.stateUpdated = false;
    }

    @Override // java.util.zip.Checksum
    public void update(int i) {
        byte[] bArr = this.oneByte;
        bArr[0] = (byte) (i & 255);
        update(bArr, 0, 1);
    }

    @Override // java.util.zip.Checksum
    public void update(byte[] bArr, int i, int i2) {
        if (i2 <= 0) {
            return;
        }
        this.totalLen += i2;
        int i3 = i + i2;
        int i4 = this.pos;
        if ((i4 + i2) - 16 < 0) {
            System.arraycopy(bArr, i, this.buffer, i4, i2);
            this.pos += i2;
            return;
        }
        if (i4 > 0) {
            int i5 = 16 - i4;
            System.arraycopy(bArr, i, this.buffer, i4, i5);
            process(this.buffer, 0);
            i += i5;
        }
        int i6 = i3 - 16;
        while (i <= i6) {
            process(bArr, i);
            i += 16;
        }
        if (i < i3) {
            int i7 = i3 - i;
            this.pos = i7;
            System.arraycopy(bArr, i, this.buffer, 0, i7);
            return;
        }
        this.pos = 0;
    }

    @Override // java.util.zip.Checksum
    public long getValue() {
        int iRotateLeft;
        int i = 0;
        if (this.stateUpdated) {
            iRotateLeft = Integer.rotateLeft(this.state[0], 1) + Integer.rotateLeft(this.state[1], 7) + Integer.rotateLeft(this.state[2], 12) + Integer.rotateLeft(this.state[3], 18);
        } else {
            iRotateLeft = this.state[2] + 374761393;
        }
        int iRotateLeft2 = iRotateLeft + this.totalLen;
        int i2 = this.pos - 4;
        while (i <= i2) {
            iRotateLeft2 = Integer.rotateLeft(iRotateLeft2 + (getInt(this.buffer, i) * (-1028477379)), 17) * 668265263;
            i += 4;
        }
        while (i < this.pos) {
            iRotateLeft2 = Integer.rotateLeft(iRotateLeft2 + ((this.buffer[i] & 255) * 374761393), 11) * (-1640531535);
            i++;
        }
        int i3 = (iRotateLeft2 ^ (iRotateLeft2 >>> 15)) * (-2048144777);
        int i4 = (i3 ^ (i3 >>> 13)) * (-1028477379);
        return (i4 ^ (i4 >>> 16)) & 4294967295L;
    }

    public static int getInt(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final void initializeState() {
        int[] iArr = this.state;
        int i = this.seed;
        iArr[0] = 606290984 + i;
        iArr[1] = (-2048144777) + i;
        iArr[2] = i;
        iArr[3] = i - (-1640531535);
    }

    public final void process(byte[] bArr, int i) {
        int[] iArr = this.state;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int iRotateLeft = Integer.rotateLeft(i2 + (getInt(bArr, i) * (-2048144777)), 13) * (-1640531535);
        int iRotateLeft2 = Integer.rotateLeft(i3 + (getInt(bArr, i + 4) * (-2048144777)), 13) * (-1640531535);
        int iRotateLeft3 = Integer.rotateLeft(i4 + (getInt(bArr, i + 8) * (-2048144777)), 13) * (-1640531535);
        int iRotateLeft4 = Integer.rotateLeft(i5 + (getInt(bArr, i + 12) * (-2048144777)), 13) * (-1640531535);
        int[] iArr2 = this.state;
        iArr2[0] = iRotateLeft;
        iArr2[1] = iRotateLeft2;
        iArr2[2] = iRotateLeft3;
        iArr2[3] = iRotateLeft4;
        this.stateUpdated = true;
    }
}
