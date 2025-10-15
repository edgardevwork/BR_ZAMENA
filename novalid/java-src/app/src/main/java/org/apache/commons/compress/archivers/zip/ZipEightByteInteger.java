package org.apache.commons.compress.archivers.zip;

import java.io.Serializable;
import java.math.BigInteger;

/* loaded from: classes5.dex */
public final class ZipEightByteInteger implements Serializable {
    public static final int BYTE_1 = 1;
    public static final int BYTE_1_MASK = 65280;
    public static final int BYTE_1_SHIFT = 8;
    public static final int BYTE_2 = 2;
    public static final int BYTE_2_MASK = 16711680;
    public static final int BYTE_2_SHIFT = 16;
    public static final int BYTE_3 = 3;
    public static final long BYTE_3_MASK = 4278190080L;
    public static final int BYTE_3_SHIFT = 24;
    public static final int BYTE_4 = 4;
    public static final long BYTE_4_MASK = 1095216660480L;
    public static final int BYTE_4_SHIFT = 32;
    public static final int BYTE_5 = 5;
    public static final long BYTE_5_MASK = 280375465082880L;
    public static final int BYTE_5_SHIFT = 40;
    public static final int BYTE_6 = 6;
    public static final long BYTE_6_MASK = 71776119061217280L;
    public static final int BYTE_6_SHIFT = 48;
    public static final int BYTE_7 = 7;
    public static final long BYTE_7_MASK = 9151314442816847872L;
    public static final int BYTE_7_SHIFT = 56;
    public static final byte LEFTMOST_BIT = Byte.MIN_VALUE;
    public static final int LEFTMOST_BIT_SHIFT = 63;
    public static final ZipEightByteInteger ZERO = new ZipEightByteInteger(0);
    public static final long serialVersionUID = 1;
    public final BigInteger value;

    public ZipEightByteInteger(long j) {
        this(BigInteger.valueOf(j));
    }

    public ZipEightByteInteger(BigInteger bigInteger) {
        this.value = bigInteger;
    }

    public ZipEightByteInteger(byte[] bArr) {
        this(bArr, 0);
    }

    public ZipEightByteInteger(byte[] bArr, int i) {
        this.value = getValue(bArr, i);
    }

    public byte[] getBytes() {
        return getBytes(this.value);
    }

    public long getLongValue() {
        return this.value.longValue();
    }

    public BigInteger getValue() {
        return this.value;
    }

    public static byte[] getBytes(long j) {
        return getBytes(BigInteger.valueOf(j));
    }

    public static byte[] getBytes(BigInteger bigInteger) {
        long jLongValue = bigInteger.longValue();
        byte[] bArr = {(byte) (255 & jLongValue), (byte) ((65280 & jLongValue) >> 8), (byte) ((16711680 & jLongValue) >> 16), (byte) ((BYTE_3_MASK & jLongValue) >> 24), (byte) ((BYTE_4_MASK & jLongValue) >> 32), (byte) ((BYTE_5_MASK & jLongValue) >> 40), (byte) ((BYTE_6_MASK & jLongValue) >> 48), (byte) ((jLongValue & BYTE_7_MASK) >> 56)};
        if (bigInteger.testBit(63)) {
            bArr[7] = (byte) (bArr[7] | Byte.MIN_VALUE);
        }
        return bArr;
    }

    public static long getLongValue(byte[] bArr, int i) {
        return getValue(bArr, i).longValue();
    }

    public static BigInteger getValue(byte[] bArr, int i) {
        int i2 = i + 7;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(((bArr[i2] << 56) & BYTE_7_MASK) + ((bArr[i + 6] << 48) & BYTE_6_MASK) + ((bArr[i + 5] << 40) & BYTE_5_MASK) + ((bArr[i + 4] << 32) & BYTE_4_MASK) + ((bArr[i + 3] << 24) & BYTE_3_MASK) + ((bArr[i + 2] << 16) & 16711680) + ((bArr[i + 1] << 8) & 65280) + (bArr[i] & 255));
        return (bArr[i2] & Byte.MIN_VALUE) == -128 ? bigIntegerValueOf.setBit(63) : bigIntegerValueOf;
    }

    public static long getLongValue(byte[] bArr) {
        return getLongValue(bArr, 0);
    }

    public static BigInteger getValue(byte[] bArr) {
        return getValue(bArr, 0);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ZipEightByteInteger) {
            return this.value.equals(((ZipEightByteInteger) obj).getValue());
        }
        return false;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "ZipEightByteInteger value: " + this.value;
    }
}
