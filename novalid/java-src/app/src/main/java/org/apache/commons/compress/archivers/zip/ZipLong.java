package org.apache.commons.compress.archivers.zip;

import java.io.Serializable;
import org.apache.commons.compress.utils.ByteUtils;

/* loaded from: classes6.dex */
public final class ZipLong implements Cloneable, Serializable {
    public static final long serialVersionUID = 1;
    public final long value;
    public static final ZipLong CFH_SIG = new ZipLong(33639248L);
    public static final ZipLong LFH_SIG = new ZipLong(67324752L);
    public static final ZipLong DD_SIG = new ZipLong(134695760L);
    public static final ZipLong ZIP64_MAGIC = new ZipLong(4294967295L);
    public static final ZipLong SINGLE_SEGMENT_SPLIT_MARKER = new ZipLong(808471376L);
    public static final ZipLong AED_SIG = new ZipLong(134630224L);

    public ZipLong(long j) {
        this.value = j;
    }

    public ZipLong(int i) {
        this.value = i;
    }

    public ZipLong(byte[] bArr) {
        this(bArr, 0);
    }

    public ZipLong(byte[] bArr, int i) {
        this.value = getValue(bArr, i);
    }

    public byte[] getBytes() {
        return getBytes(this.value);
    }

    public long getValue() {
        return this.value;
    }

    public int getIntValue() {
        return (int) this.value;
    }

    public static byte[] getBytes(long j) {
        byte[] bArr = new byte[4];
        putLong(j, bArr, 0);
        return bArr;
    }

    public static void putLong(long j, byte[] bArr, int i) {
        ByteUtils.toLittleEndian(bArr, j, i, 4);
    }

    public void putLong(byte[] bArr, int i) {
        putLong(this.value, bArr, i);
    }

    public static long getValue(byte[] bArr, int i) {
        return ByteUtils.fromLittleEndian(bArr, i, 4);
    }

    public static long getValue(byte[] bArr) {
        return getValue(bArr, 0);
    }

    public boolean equals(Object obj) {
        return (obj instanceof ZipLong) && this.value == ((ZipLong) obj).getValue();
    }

    public int hashCode() {
        return (int) this.value;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public String toString() {
        return "ZipLong value: " + this.value;
    }
}
