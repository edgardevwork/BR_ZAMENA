package com.google.common.hash;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;

@ElementTypesAreNonnullByDefault
/* loaded from: classes7.dex */
public final class FarmHashFingerprint64 extends AbstractNonStreamingHashFunction {
    public static final HashFunction FARMHASH_FINGERPRINT_64 = new FarmHashFingerprint64();

    /* renamed from: K0 */
    public static final long f819K0 = -4348849565147123417L;

    /* renamed from: K1 */
    public static final long f820K1 = -5435081209227447693L;

    /* renamed from: K2 */
    public static final long f821K2 = -7286425919675154353L;

    public static long hashLength16(long u, long v, long mul) {
        long j = (u ^ v) * mul;
        long j2 = ((j ^ (j >>> 47)) ^ v) * mul;
        return (j2 ^ (j2 >>> 47)) * mul;
    }

    public static long shiftMix(long val) {
        return val ^ (val >>> 47);
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 64;
    }

    @Override // com.google.common.hash.AbstractNonStreamingHashFunction, com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashBytes(byte[] input, int off, int len) {
        Preconditions.checkPositionIndexes(off, off + len, input.length);
        return HashCode.fromLong(fingerprint(input, off, len));
    }

    public String toString() {
        return "Hashing.farmHashFingerprint64()";
    }

    @VisibleForTesting
    public static long fingerprint(byte[] bytes, int offset, int length) {
        if (length <= 32) {
            if (length <= 16) {
                return hashLength0to16(bytes, offset, length);
            }
            return hashLength17to32(bytes, offset, length);
        }
        if (length <= 64) {
            return hashLength33To64(bytes, offset, length);
        }
        return hashLength65Plus(bytes, offset, length);
    }

    public static void weakHashLength32WithSeeds(byte[] bytes, int offset, long seedA, long seedB, long[] output) {
        long jLoad64 = LittleEndianByteArray.load64(bytes, offset);
        long jLoad642 = LittleEndianByteArray.load64(bytes, offset + 8);
        long jLoad643 = LittleEndianByteArray.load64(bytes, offset + 16);
        long jLoad644 = LittleEndianByteArray.load64(bytes, offset + 24);
        long j = seedA + jLoad64;
        long j2 = jLoad642 + j + jLoad643;
        long jRotateRight = Long.rotateRight(seedB + j + jLoad644, 21) + Long.rotateRight(j2, 44);
        output[0] = j2 + jLoad644;
        output[1] = jRotateRight + j;
    }

    public static long hashLength0to16(byte[] bytes, int offset, int length) {
        if (length >= 8) {
            long j = (length * 2) + f821K2;
            long jLoad64 = LittleEndianByteArray.load64(bytes, offset) + f821K2;
            long jLoad642 = LittleEndianByteArray.load64(bytes, (offset + length) - 8);
            return hashLength16((Long.rotateRight(jLoad642, 37) * j) + jLoad64, (Long.rotateRight(jLoad64, 25) + jLoad642) * j, j);
        }
        if (length >= 4) {
            return hashLength16(length + ((LittleEndianByteArray.load32(bytes, offset) & 4294967295L) << 3), LittleEndianByteArray.load32(bytes, (offset + length) - 4) & 4294967295L, (length * 2) + f821K2);
        }
        if (length <= 0) {
            return f821K2;
        }
        return shiftMix((((bytes[offset] & 255) + ((bytes[(length >> 1) + offset] & 255) << 8)) * f821K2) ^ ((length + ((bytes[offset + (length - 1)] & 255) << 2)) * f819K0)) * f821K2;
    }

    public static long hashLength17to32(byte[] bytes, int offset, int length) {
        long j = (length * 2) + f821K2;
        long jLoad64 = LittleEndianByteArray.load64(bytes, offset) * f820K1;
        long jLoad642 = LittleEndianByteArray.load64(bytes, offset + 8);
        int i = offset + length;
        long jLoad643 = LittleEndianByteArray.load64(bytes, i - 8) * j;
        return hashLength16((LittleEndianByteArray.load64(bytes, i - 16) * f821K2) + Long.rotateRight(jLoad64 + jLoad642, 43) + Long.rotateRight(jLoad643, 30), jLoad643 + jLoad64 + Long.rotateRight(jLoad642 + f821K2, 18), j);
    }

    public static long hashLength33To64(byte[] bytes, int offset, int length) {
        long j = (length * 2) + f821K2;
        long jLoad64 = LittleEndianByteArray.load64(bytes, offset) * f821K2;
        long jLoad642 = LittleEndianByteArray.load64(bytes, offset + 8);
        int i = offset + length;
        long jLoad643 = LittleEndianByteArray.load64(bytes, i - 8) * j;
        long jRotateRight = Long.rotateRight(jLoad64 + jLoad642, 43) + Long.rotateRight(jLoad643, 30) + (LittleEndianByteArray.load64(bytes, i - 16) * f821K2);
        long jHashLength16 = hashLength16(jRotateRight, jLoad643 + Long.rotateRight(jLoad642 + f821K2, 18) + jLoad64, j);
        long jLoad644 = LittleEndianByteArray.load64(bytes, offset + 16) * j;
        long jLoad645 = LittleEndianByteArray.load64(bytes, offset + 24);
        long jLoad646 = (jRotateRight + LittleEndianByteArray.load64(bytes, i - 32)) * j;
        return hashLength16(((jHashLength16 + LittleEndianByteArray.load64(bytes, i - 24)) * j) + Long.rotateRight(jLoad644 + jLoad645, 43) + Long.rotateRight(jLoad646, 30), jLoad644 + Long.rotateRight(jLoad645 + jLoad64, 18) + jLoad646, j);
    }

    public static long hashLength65Plus(byte[] bytes, int offset, int length) {
        long j = 81;
        long j2 = (j * f820K1) + 113;
        long jShiftMix = shiftMix((j2 * f821K2) + 113) * f821K2;
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long jLoad64 = (j * f821K2) + LittleEndianByteArray.load64(bytes, offset);
        int i = length - 1;
        int i2 = offset + ((i / 64) * 64);
        int i3 = i & 63;
        int i4 = i2 + i3;
        int i5 = i4 - 63;
        int i6 = offset;
        while (true) {
            long jRotateRight = Long.rotateRight(jLoad64 + j2 + jArr[0] + LittleEndianByteArray.load64(bytes, i6 + 8), 37) * f820K1;
            long jRotateRight2 = Long.rotateRight(j2 + jArr[1] + LittleEndianByteArray.load64(bytes, i6 + 48), 42) * f820K1;
            long j3 = jRotateRight ^ jArr2[1];
            long jLoad642 = jRotateRight2 + jArr[0] + LittleEndianByteArray.load64(bytes, i6 + 40);
            long jRotateRight3 = Long.rotateRight(jShiftMix + jArr2[0], 33) * f820K1;
            weakHashLength32WithSeeds(bytes, i6, jArr[1] * f820K1, j3 + jArr2[0], jArr);
            weakHashLength32WithSeeds(bytes, i6 + 32, jRotateRight3 + jArr2[1], jLoad642 + LittleEndianByteArray.load64(bytes, i6 + 16), jArr2);
            int i7 = i6 + 64;
            if (i7 == i2) {
                long j4 = f820K1 + ((j3 & 255) << 1);
                long j5 = jArr2[0] + i3;
                jArr2[0] = j5;
                long j6 = jArr[0] + j5;
                jArr[0] = j6;
                jArr2[0] = jArr2[0] + j6;
                long jRotateRight4 = Long.rotateRight(jRotateRight3 + jLoad642 + jArr[0] + LittleEndianByteArray.load64(bytes, i4 - 55), 37) * j4;
                long jRotateRight5 = Long.rotateRight(jLoad642 + jArr[1] + LittleEndianByteArray.load64(bytes, i4 - 15), 42) * j4;
                long j7 = jRotateRight4 ^ (jArr2[1] * 9);
                long jLoad643 = jRotateRight5 + (jArr[0] * 9) + LittleEndianByteArray.load64(bytes, i4 - 23);
                long jRotateRight6 = Long.rotateRight(j3 + jArr2[0], 33) * j4;
                weakHashLength32WithSeeds(bytes, i5, jArr[1] * j4, j7 + jArr2[0], jArr);
                weakHashLength32WithSeeds(bytes, i4 - 31, jRotateRight6 + jArr2[1], jLoad643 + LittleEndianByteArray.load64(bytes, i4 - 47), jArr2);
                return hashLength16(hashLength16(jArr[0], jArr2[0], j4) + (shiftMix(jLoad643) * f819K0) + j7, hashLength16(jArr[1], jArr2[1], j4) + jRotateRight6, j4);
            }
            i6 = i7;
            jShiftMix = j3;
            j2 = jLoad642;
            jLoad64 = jRotateRight3;
        }
    }
}
