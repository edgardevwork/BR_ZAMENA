package org.apache.commons.codec.digest;

import org.apache.commons.codec.binary.StringUtils;

/* loaded from: classes5.dex */
public final class MurmurHash3 {

    /* renamed from: C1 */
    public static final long f9814C1 = -8663945395140668459L;
    public static final int C1_32 = -862048943;

    /* renamed from: C2 */
    public static final long f9815C2 = 5545529020109919103L;
    public static final int C2_32 = 461845907;
    public static final int DEFAULT_SEED = 104729;
    public static final int INTEGER_BYTES = 4;
    public static final int LONG_BYTES = 8;

    /* renamed from: M */
    public static final int f9816M = 5;
    public static final int M_32 = 5;

    /* renamed from: N1 */
    public static final int f9817N1 = 1390208809;

    /* renamed from: N2 */
    public static final int f9818N2 = 944331445;

    @Deprecated
    public static final long NULL_HASHCODE = 2862933555777941757L;
    public static final int N_32 = -430675100;

    /* renamed from: R1 */
    public static final int f9819R1 = 31;
    public static final int R1_32 = 15;

    /* renamed from: R2 */
    public static final int f9820R2 = 27;
    public static final int R2_32 = 13;

    /* renamed from: R3 */
    public static final int f9821R3 = 33;
    public static final int SHORT_BYTES = 2;

    public static int fmix32(int i) {
        int i2 = (i ^ (i >>> 16)) * (-2048144789);
        int i3 = (i2 ^ (i2 >>> 13)) * (-1028477387);
        return i3 ^ (i3 >>> 16);
    }

    public static long fmix64(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
        return j3 ^ (j3 >>> 33);
    }

    public static int hash32(long j, long j2) {
        return hash32(j, j2, DEFAULT_SEED);
    }

    public static int hash32(long j, long j2, int i) {
        long jReverseBytes = Long.reverseBytes(j);
        long jReverseBytes2 = Long.reverseBytes(j2);
        int i2 = (int) jReverseBytes2;
        return fmix32(mix32((int) (jReverseBytes2 >>> 32), mix32(i2, mix32((int) (jReverseBytes >>> 32), mix32((int) jReverseBytes, i)))) ^ 16);
    }

    public static int hash32(long j) {
        return hash32(j, DEFAULT_SEED);
    }

    public static int hash32(long j, int i) {
        long jReverseBytes = Long.reverseBytes(j);
        return fmix32(mix32((int) (jReverseBytes >>> 32), mix32((int) jReverseBytes, i)) ^ 8);
    }

    @Deprecated
    public static int hash32(byte[] bArr) {
        return hash32(bArr, 0, bArr.length, DEFAULT_SEED);
    }

    @Deprecated
    public static int hash32(String str) {
        byte[] bytesUtf8 = StringUtils.getBytesUtf8(str);
        return hash32(bytesUtf8, 0, bytesUtf8.length, DEFAULT_SEED);
    }

    @Deprecated
    public static int hash32(byte[] bArr, int i) {
        return hash32(bArr, i, DEFAULT_SEED);
    }

    @Deprecated
    public static int hash32(byte[] bArr, int i, int i2) {
        return hash32(bArr, 0, i, i2);
    }

    @Deprecated
    public static int hash32(byte[] bArr, int i, int i2, int i3) {
        int i4 = i2 >> 2;
        for (int i5 = 0; i5 < i4; i5++) {
            i3 = mix32(getLittleEndianInt(bArr, (i5 << 2) + i), i3);
        }
        int i6 = (i4 << 2) + i;
        int i7 = (i + i2) - i6;
        if (i7 != 1) {
            if (i7 != 2) {
                i = i7 == 3 ? bArr[i6 + 2] << 16 : 0;
            }
            i ^= bArr[i6 + 1] << 8;
            i3 ^= Integer.rotateLeft((bArr[i6] ^ i) * (-862048943), 15) * 461845907;
        } else {
            i3 ^= Integer.rotateLeft((bArr[i6] ^ i) * (-862048943), 15) * 461845907;
        }
        return fmix32(i3 ^ i2);
    }

    public static int hash32x86(byte[] bArr) {
        return hash32x86(bArr, 0, bArr.length, 0);
    }

    public static int hash32x86(byte[] bArr, int i, int i2, int i3) {
        int i4 = i2 >> 2;
        for (int i5 = 0; i5 < i4; i5++) {
            i3 = mix32(getLittleEndianInt(bArr, (i5 << 2) + i), i3);
        }
        int i6 = (i4 << 2) + i;
        int i7 = (i + i2) - i6;
        if (i7 != 1) {
            if (i7 != 2) {
                i = i7 == 3 ? (bArr[i6 + 2] & 255) << 16 : 0;
            }
            i ^= (bArr[i6 + 1] & 255) << 8;
            i3 ^= Integer.rotateLeft(((bArr[i6] & 255) ^ i) * (-862048943), 15) * 461845907;
        } else {
            i3 ^= Integer.rotateLeft(((bArr[i6] & 255) ^ i) * (-862048943), 15) * 461845907;
        }
        return fmix32(i3 ^ i2);
    }

    @Deprecated
    public static long hash64(long j) {
        return fmix64(((Long.rotateLeft((Long.rotateLeft(Long.reverseBytes(j) * (-8663945395140668459L), 31) * 5545529020109919103L) ^ 104729, 27) * 5) + 1390208809) ^ 8);
    }

    @Deprecated
    public static long hash64(int i) {
        return fmix64((Long.rotateLeft((Integer.reverseBytes(i) & 4294967295L) * (-8663945395140668459L), 31) * 5545529020109919103L) ^ 104733);
    }

    @Deprecated
    public static long hash64(short s) {
        return fmix64((Long.rotateLeft((((s & 255) << 8) ^ (255 & ((s & 65280) >> 8))) * (-8663945395140668459L), 31) * 5545529020109919103L) ^ 104731);
    }

    @Deprecated
    public static long hash64(byte[] bArr) {
        return hash64(bArr, 0, bArr.length, DEFAULT_SEED);
    }

    @Deprecated
    public static long hash64(byte[] bArr, int i, int i2) {
        return hash64(bArr, i, i2, DEFAULT_SEED);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Deprecated
    public static long hash64(byte[] bArr, int i, int i2, int i3) {
        long jRotateLeft = i3;
        int i4 = i2 >> 3;
        for (int i5 = 0; i5 < i4; i5++) {
            jRotateLeft = (Long.rotateLeft(jRotateLeft ^ (Long.rotateLeft(getLittleEndianLong(bArr, i + (i5 << 3)) * (-8663945395140668459L), 31) * 5545529020109919103L), 27) * 5) + 1390208809;
        }
        long j = 0;
        switch ((i + i2) - (i + (i4 << 3))) {
            case 1:
                jRotateLeft ^= Long.rotateLeft(((bArr[r4] & 255) ^ j) * (-8663945395140668459L), 31) * 5545529020109919103L;
                break;
            case 2:
                j ^= (bArr[r4 + 1] & 255) << 8;
                jRotateLeft ^= Long.rotateLeft(((bArr[r4] & 255) ^ j) * (-8663945395140668459L), 31) * 5545529020109919103L;
                break;
            case 3:
                j ^= (bArr[r4 + 2] & 255) << 16;
                j ^= (bArr[r4 + 1] & 255) << 8;
                jRotateLeft ^= Long.rotateLeft(((bArr[r4] & 255) ^ j) * (-8663945395140668459L), 31) * 5545529020109919103L;
                break;
            case 4:
                j ^= (bArr[r4 + 3] & 255) << 24;
                j ^= (bArr[r4 + 2] & 255) << 16;
                j ^= (bArr[r4 + 1] & 255) << 8;
                jRotateLeft ^= Long.rotateLeft(((bArr[r4] & 255) ^ j) * (-8663945395140668459L), 31) * 5545529020109919103L;
                break;
            case 5:
                j ^= (bArr[r4 + 4] & 255) << 32;
                j ^= (bArr[r4 + 3] & 255) << 24;
                j ^= (bArr[r4 + 2] & 255) << 16;
                j ^= (bArr[r4 + 1] & 255) << 8;
                jRotateLeft ^= Long.rotateLeft(((bArr[r4] & 255) ^ j) * (-8663945395140668459L), 31) * 5545529020109919103L;
                break;
            case 6:
                j ^= (bArr[r4 + 5] & 255) << 40;
                j ^= (bArr[r4 + 4] & 255) << 32;
                j ^= (bArr[r4 + 3] & 255) << 24;
                j ^= (bArr[r4 + 2] & 255) << 16;
                j ^= (bArr[r4 + 1] & 255) << 8;
                jRotateLeft ^= Long.rotateLeft(((bArr[r4] & 255) ^ j) * (-8663945395140668459L), 31) * 5545529020109919103L;
                break;
            case 7:
                j = (bArr[r4 + 6] & 255) << 48;
                j ^= (bArr[r4 + 5] & 255) << 40;
                j ^= (bArr[r4 + 4] & 255) << 32;
                j ^= (bArr[r4 + 3] & 255) << 24;
                j ^= (bArr[r4 + 2] & 255) << 16;
                j ^= (bArr[r4 + 1] & 255) << 8;
                jRotateLeft ^= Long.rotateLeft(((bArr[r4] & 255) ^ j) * (-8663945395140668459L), 31) * 5545529020109919103L;
                break;
        }
        return fmix64(i2 ^ jRotateLeft);
    }

    public static long[] hash128(byte[] bArr) {
        return hash128(bArr, 0, bArr.length, DEFAULT_SEED);
    }

    public static long[] hash128x64(byte[] bArr) {
        return hash128x64(bArr, 0, bArr.length, 0);
    }

    @Deprecated
    public static long[] hash128(String str) {
        byte[] bytesUtf8 = StringUtils.getBytesUtf8(str);
        return hash128(bytesUtf8, 0, bytesUtf8.length, DEFAULT_SEED);
    }

    @Deprecated
    public static long[] hash128(byte[] bArr, int i, int i2, int i3) {
        return hash128x64Internal(bArr, i, i2, i3);
    }

    public static long[] hash128x64(byte[] bArr, int i, int i2, int i3) {
        return hash128x64Internal(bArr, i, i2, i3 & 4294967295L);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x006e. Please report as an issue. */
    public static long[] hash128x64Internal(byte[] bArr, int i, int i2, long j) {
        long j2;
        int i3 = 8;
        int i4 = i2 >> 4;
        long jRotateLeft = j;
        long jRotateLeft2 = jRotateLeft;
        int i5 = 0;
        while (i5 < i4) {
            int i6 = i + (i5 << 4);
            long littleEndianLong = getLittleEndianLong(bArr, i6);
            long littleEndianLong2 = getLittleEndianLong(bArr, i6 + i3);
            long jRotateLeft3 = ((Long.rotateLeft((Long.rotateLeft(littleEndianLong * (-8663945395140668459L), 31) * 5545529020109919103L) ^ jRotateLeft, 27) + jRotateLeft2) * 5) + 1390208809;
            jRotateLeft2 = ((Long.rotateLeft(jRotateLeft2 ^ (Long.rotateLeft(5545529020109919103L * littleEndianLong2, 33) * (-8663945395140668459L)), 31) + jRotateLeft3) * 5) + 944331445;
            i5++;
            jRotateLeft = jRotateLeft3;
            i3 = 8;
        }
        long j3 = 0;
        switch ((i + i2) - (i + (i4 << 4))) {
            case 1:
                j2 = jRotateLeft;
                jRotateLeft = j2 ^ (Long.rotateLeft((j3 ^ (bArr[r2] & 255)) * (-8663945395140668459L), 31) * 5545529020109919103L);
                break;
            case 2:
                j2 = jRotateLeft;
                j3 ^= (bArr[r2 + 1] & 255) << 8;
                jRotateLeft = j2 ^ (Long.rotateLeft((j3 ^ (bArr[r2] & 255)) * (-8663945395140668459L), 31) * 5545529020109919103L);
                break;
            case 3:
                j2 = jRotateLeft;
                j3 ^= (bArr[r2 + 2] & 255) << 16;
                j3 ^= (bArr[r2 + 1] & 255) << 8;
                jRotateLeft = j2 ^ (Long.rotateLeft((j3 ^ (bArr[r2] & 255)) * (-8663945395140668459L), 31) * 5545529020109919103L);
                break;
            case 4:
                j2 = jRotateLeft;
                j3 ^= (bArr[r2 + 3] & 255) << 24;
                j3 ^= (bArr[r2 + 2] & 255) << 16;
                j3 ^= (bArr[r2 + 1] & 255) << 8;
                jRotateLeft = j2 ^ (Long.rotateLeft((j3 ^ (bArr[r2] & 255)) * (-8663945395140668459L), 31) * 5545529020109919103L);
                break;
            case 5:
                j2 = jRotateLeft;
                j3 ^= (bArr[r2 + 4] & 255) << 32;
                j3 ^= (bArr[r2 + 3] & 255) << 24;
                j3 ^= (bArr[r2 + 2] & 255) << 16;
                j3 ^= (bArr[r2 + 1] & 255) << 8;
                jRotateLeft = j2 ^ (Long.rotateLeft((j3 ^ (bArr[r2] & 255)) * (-8663945395140668459L), 31) * 5545529020109919103L);
                break;
            case 6:
                j2 = jRotateLeft;
                j3 ^= (bArr[r2 + 5] & 255) << 40;
                j3 ^= (bArr[r2 + 4] & 255) << 32;
                j3 ^= (bArr[r2 + 3] & 255) << 24;
                j3 ^= (bArr[r2 + 2] & 255) << 16;
                j3 ^= (bArr[r2 + 1] & 255) << 8;
                jRotateLeft = j2 ^ (Long.rotateLeft((j3 ^ (bArr[r2] & 255)) * (-8663945395140668459L), 31) * 5545529020109919103L);
                break;
            case 7:
                j2 = jRotateLeft;
                j3 ^= (bArr[r2 + 6] & 255) << 48;
                j3 ^= (bArr[r2 + 5] & 255) << 40;
                j3 ^= (bArr[r2 + 4] & 255) << 32;
                j3 ^= (bArr[r2 + 3] & 255) << 24;
                j3 ^= (bArr[r2 + 2] & 255) << 16;
                j3 ^= (bArr[r2 + 1] & 255) << 8;
                jRotateLeft = j2 ^ (Long.rotateLeft((j3 ^ (bArr[r2] & 255)) * (-8663945395140668459L), 31) * 5545529020109919103L);
                break;
            case 8:
                j2 = jRotateLeft;
                j3 = (bArr[r2 + 7] & 255) << 56;
                j3 ^= (bArr[r2 + 6] & 255) << 48;
                j3 ^= (bArr[r2 + 5] & 255) << 40;
                j3 ^= (bArr[r2 + 4] & 255) << 32;
                j3 ^= (bArr[r2 + 3] & 255) << 24;
                j3 ^= (bArr[r2 + 2] & 255) << 16;
                j3 ^= (bArr[r2 + 1] & 255) << 8;
                jRotateLeft = j2 ^ (Long.rotateLeft((j3 ^ (bArr[r2] & 255)) * (-8663945395140668459L), 31) * 5545529020109919103L);
                break;
            case 9:
                j2 = jRotateLeft;
                jRotateLeft2 ^= Long.rotateLeft((j3 ^ (bArr[r2 + 8] & 255)) * 5545529020109919103L, 33) * (-8663945395140668459L);
                j3 = (bArr[r2 + 7] & 255) << 56;
                j3 ^= (bArr[r2 + 6] & 255) << 48;
                j3 ^= (bArr[r2 + 5] & 255) << 40;
                j3 ^= (bArr[r2 + 4] & 255) << 32;
                j3 ^= (bArr[r2 + 3] & 255) << 24;
                j3 ^= (bArr[r2 + 2] & 255) << 16;
                j3 ^= (bArr[r2 + 1] & 255) << 8;
                jRotateLeft = j2 ^ (Long.rotateLeft((j3 ^ (bArr[r2] & 255)) * (-8663945395140668459L), 31) * 5545529020109919103L);
                break;
            case 10:
                j2 = jRotateLeft;
                j3 ^= (bArr[r2 + 9] & 255) << 8;
                jRotateLeft2 ^= Long.rotateLeft((j3 ^ (bArr[r2 + 8] & 255)) * 5545529020109919103L, 33) * (-8663945395140668459L);
                j3 = (bArr[r2 + 7] & 255) << 56;
                j3 ^= (bArr[r2 + 6] & 255) << 48;
                j3 ^= (bArr[r2 + 5] & 255) << 40;
                j3 ^= (bArr[r2 + 4] & 255) << 32;
                j3 ^= (bArr[r2 + 3] & 255) << 24;
                j3 ^= (bArr[r2 + 2] & 255) << 16;
                j3 ^= (bArr[r2 + 1] & 255) << 8;
                jRotateLeft = j2 ^ (Long.rotateLeft((j3 ^ (bArr[r2] & 255)) * (-8663945395140668459L), 31) * 5545529020109919103L);
                break;
            case 11:
                j2 = jRotateLeft;
                j3 ^= (bArr[r2 + 10] & 255) << 16;
                j3 ^= (bArr[r2 + 9] & 255) << 8;
                jRotateLeft2 ^= Long.rotateLeft((j3 ^ (bArr[r2 + 8] & 255)) * 5545529020109919103L, 33) * (-8663945395140668459L);
                j3 = (bArr[r2 + 7] & 255) << 56;
                j3 ^= (bArr[r2 + 6] & 255) << 48;
                j3 ^= (bArr[r2 + 5] & 255) << 40;
                j3 ^= (bArr[r2 + 4] & 255) << 32;
                j3 ^= (bArr[r2 + 3] & 255) << 24;
                j3 ^= (bArr[r2 + 2] & 255) << 16;
                j3 ^= (bArr[r2 + 1] & 255) << 8;
                jRotateLeft = j2 ^ (Long.rotateLeft((j3 ^ (bArr[r2] & 255)) * (-8663945395140668459L), 31) * 5545529020109919103L);
                break;
            case 12:
                j2 = jRotateLeft;
                j3 ^= (bArr[r2 + 11] & 255) << 24;
                j3 ^= (bArr[r2 + 10] & 255) << 16;
                j3 ^= (bArr[r2 + 9] & 255) << 8;
                jRotateLeft2 ^= Long.rotateLeft((j3 ^ (bArr[r2 + 8] & 255)) * 5545529020109919103L, 33) * (-8663945395140668459L);
                j3 = (bArr[r2 + 7] & 255) << 56;
                j3 ^= (bArr[r2 + 6] & 255) << 48;
                j3 ^= (bArr[r2 + 5] & 255) << 40;
                j3 ^= (bArr[r2 + 4] & 255) << 32;
                j3 ^= (bArr[r2 + 3] & 255) << 24;
                j3 ^= (bArr[r2 + 2] & 255) << 16;
                j3 ^= (bArr[r2 + 1] & 255) << 8;
                jRotateLeft = j2 ^ (Long.rotateLeft((j3 ^ (bArr[r2] & 255)) * (-8663945395140668459L), 31) * 5545529020109919103L);
                break;
            case 13:
                j2 = jRotateLeft;
                j3 ^= (bArr[r2 + 12] & 255) << 32;
                j3 ^= (bArr[r2 + 11] & 255) << 24;
                j3 ^= (bArr[r2 + 10] & 255) << 16;
                j3 ^= (bArr[r2 + 9] & 255) << 8;
                jRotateLeft2 ^= Long.rotateLeft((j3 ^ (bArr[r2 + 8] & 255)) * 5545529020109919103L, 33) * (-8663945395140668459L);
                j3 = (bArr[r2 + 7] & 255) << 56;
                j3 ^= (bArr[r2 + 6] & 255) << 48;
                j3 ^= (bArr[r2 + 5] & 255) << 40;
                j3 ^= (bArr[r2 + 4] & 255) << 32;
                j3 ^= (bArr[r2 + 3] & 255) << 24;
                j3 ^= (bArr[r2 + 2] & 255) << 16;
                j3 ^= (bArr[r2 + 1] & 255) << 8;
                jRotateLeft = j2 ^ (Long.rotateLeft((j3 ^ (bArr[r2] & 255)) * (-8663945395140668459L), 31) * 5545529020109919103L);
                break;
            case 14:
                j2 = jRotateLeft;
                j3 ^= (bArr[r2 + 13] & 255) << 40;
                j3 ^= (bArr[r2 + 12] & 255) << 32;
                j3 ^= (bArr[r2 + 11] & 255) << 24;
                j3 ^= (bArr[r2 + 10] & 255) << 16;
                j3 ^= (bArr[r2 + 9] & 255) << 8;
                jRotateLeft2 ^= Long.rotateLeft((j3 ^ (bArr[r2 + 8] & 255)) * 5545529020109919103L, 33) * (-8663945395140668459L);
                j3 = (bArr[r2 + 7] & 255) << 56;
                j3 ^= (bArr[r2 + 6] & 255) << 48;
                j3 ^= (bArr[r2 + 5] & 255) << 40;
                j3 ^= (bArr[r2 + 4] & 255) << 32;
                j3 ^= (bArr[r2 + 3] & 255) << 24;
                j3 ^= (bArr[r2 + 2] & 255) << 16;
                j3 ^= (bArr[r2 + 1] & 255) << 8;
                jRotateLeft = j2 ^ (Long.rotateLeft((j3 ^ (bArr[r2] & 255)) * (-8663945395140668459L), 31) * 5545529020109919103L);
                break;
            case 15:
                j2 = jRotateLeft;
                j3 = (bArr[r2 + 14] & 255) << 48;
                j3 ^= (bArr[r2 + 13] & 255) << 40;
                j3 ^= (bArr[r2 + 12] & 255) << 32;
                j3 ^= (bArr[r2 + 11] & 255) << 24;
                j3 ^= (bArr[r2 + 10] & 255) << 16;
                j3 ^= (bArr[r2 + 9] & 255) << 8;
                jRotateLeft2 ^= Long.rotateLeft((j3 ^ (bArr[r2 + 8] & 255)) * 5545529020109919103L, 33) * (-8663945395140668459L);
                j3 = (bArr[r2 + 7] & 255) << 56;
                j3 ^= (bArr[r2 + 6] & 255) << 48;
                j3 ^= (bArr[r2 + 5] & 255) << 40;
                j3 ^= (bArr[r2 + 4] & 255) << 32;
                j3 ^= (bArr[r2 + 3] & 255) << 24;
                j3 ^= (bArr[r2 + 2] & 255) << 16;
                j3 ^= (bArr[r2 + 1] & 255) << 8;
                jRotateLeft = j2 ^ (Long.rotateLeft((j3 ^ (bArr[r2] & 255)) * (-8663945395140668459L), 31) * 5545529020109919103L);
                break;
        }
        long j4 = i2;
        long j5 = jRotateLeft ^ j4;
        long j6 = j4 ^ jRotateLeft2;
        long j7 = j5 + j6;
        long j8 = j6 + j7;
        long jFmix64 = fmix64(j7);
        long jFmix642 = fmix64(j8);
        long j9 = jFmix64 + jFmix642;
        return new long[]{j9, jFmix642 + j9};
    }

    public static long getLittleEndianLong(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static int getLittleEndianInt(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int mix32(int i, int i2) {
        return (Integer.rotateLeft((Integer.rotateLeft(i * (-862048943), 15) * 461845907) ^ i2, 13) * 5) + N_32;
    }

    public static class IncrementalHash32x86 {
        public static final int BLOCK_SIZE = 4;
        public int hash;
        public int totalLen;
        public final byte[] unprocessed = new byte[3];
        public int unprocessedLength;

        public static int orBytes(byte b, byte b2, byte b3, byte b4) {
            return (b & 255) | ((b2 & 255) << 8) | ((b3 & 255) << 16) | ((b4 & 255) << 24);
        }

        public final void start(int i) {
            this.totalLen = 0;
            this.unprocessedLength = 0;
            this.hash = i;
        }

        public final void add(byte[] bArr, int i, int i2) {
            int iOrBytes;
            if (i2 <= 0) {
                return;
            }
            this.totalLen += i2;
            int i3 = this.unprocessedLength;
            if ((i3 + i2) - 4 < 0) {
                System.arraycopy(bArr, i, this.unprocessed, i3, i2);
                this.unprocessedLength += i2;
                return;
            }
            if (i3 > 0) {
                if (i3 == 1) {
                    iOrBytes = orBytes(this.unprocessed[0], bArr[i], bArr[i + 1], bArr[i + 2]);
                } else if (i3 == 2) {
                    byte[] bArr2 = this.unprocessed;
                    iOrBytes = orBytes(bArr2[0], bArr2[1], bArr[i], bArr[i + 1]);
                } else if (i3 == 3) {
                    byte[] bArr3 = this.unprocessed;
                    iOrBytes = orBytes(bArr3[0], bArr3[1], bArr3[2], bArr[i]);
                } else {
                    throw new IllegalStateException("Unprocessed length should be 1, 2, or 3: " + this.unprocessedLength);
                }
                this.hash = MurmurHash3.mix32(iOrBytes, this.hash);
                int i4 = 4 - this.unprocessedLength;
                i += i4;
                i2 -= i4;
            }
            int i5 = i2 >> 2;
            for (int i6 = 0; i6 < i5; i6++) {
                this.hash = MurmurHash3.mix32(MurmurHash3.getLittleEndianInt(bArr, (i6 << 2) + i), this.hash);
            }
            int i7 = i5 << 2;
            int i8 = i2 - i7;
            this.unprocessedLength = i8;
            if (i8 != 0) {
                System.arraycopy(bArr, i + i7, this.unprocessed, 0, i8);
            }
        }

        public final int end() {
            return finalise(this.hash, this.unprocessedLength, this.unprocessed, this.totalLen);
        }

        public int finalise(int i, int i2, byte[] bArr, int i3) {
            int i4;
            int i5;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        i5 = (bArr[2] & 255) << 16;
                    }
                    return MurmurHash3.fmix32(i ^ i3);
                }
                i5 = 0;
                i4 = i5 ^ ((bArr[1] & 255) << 8);
            } else {
                i4 = 0;
            }
            i ^= Integer.rotateLeft((i4 ^ (bArr[0] & 255)) * (-862048943), 15) * 461845907;
            return MurmurHash3.fmix32(i ^ i3);
        }
    }

    @Deprecated
    /* loaded from: classes8.dex */
    public static class IncrementalHash32 extends IncrementalHash32x86 {
        @Override // org.apache.commons.codec.digest.MurmurHash3.IncrementalHash32x86
        @Deprecated
        public int finalise(int i, int i2, byte[] bArr, int i3) {
            int i4;
            int i5;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        i5 = bArr[2] << 16;
                    }
                    return MurmurHash3.fmix32(i ^ i3);
                }
                i5 = 0;
                i4 = i5 ^ (bArr[1] << 8);
            } else {
                i4 = 0;
            }
            i ^= Integer.rotateLeft((i4 ^ bArr[0]) * (-862048943), 15) * 461845907;
            return MurmurHash3.fmix32(i ^ i3);
        }
    }
}
