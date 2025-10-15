package org.apache.commons.compress.archivers.zip;

import java.util.Date;
import java.util.Objects;
import java.util.zip.ZipException;

/* loaded from: classes6.dex */
public class X000A_NTFS implements ZipExtraField {
    public static final long EPOCH_OFFSET = -116444736000000000L;
    public ZipEightByteInteger accessTime;
    public ZipEightByteInteger createTime;
    public ZipEightByteInteger modifyTime;
    public static final ZipShort HEADER_ID = new ZipShort(10);
    public static final ZipShort TIME_ATTR_TAG = new ZipShort(1);
    public static final ZipShort TIME_ATTR_SIZE = new ZipShort(24);

    public X000A_NTFS() {
        ZipEightByteInteger zipEightByteInteger = ZipEightByteInteger.ZERO;
        this.modifyTime = zipEightByteInteger;
        this.accessTime = zipEightByteInteger;
        this.createTime = zipEightByteInteger;
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public ZipShort getHeaderId() {
        return HEADER_ID;
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public ZipShort getLocalFileDataLength() {
        return new ZipShort(32);
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public ZipShort getCentralDirectoryLength() {
        return getLocalFileDataLength();
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public byte[] getLocalFileDataData() {
        byte[] bArr = new byte[getLocalFileDataLength().getValue()];
        System.arraycopy(TIME_ATTR_TAG.getBytes(), 0, bArr, 4, 2);
        System.arraycopy(TIME_ATTR_SIZE.getBytes(), 0, bArr, 6, 2);
        System.arraycopy(this.modifyTime.getBytes(), 0, bArr, 8, 8);
        System.arraycopy(this.accessTime.getBytes(), 0, bArr, 16, 8);
        System.arraycopy(this.createTime.getBytes(), 0, bArr, 24, 8);
        return bArr;
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public byte[] getCentralDirectoryData() {
        return getLocalFileDataData();
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public void parseFromLocalFileData(byte[] bArr, int i, int i2) throws ZipException {
        int i3 = i2 + i;
        int value = i + 4;
        while (value + 4 <= i3) {
            ZipShort zipShort = new ZipShort(bArr, value);
            int i4 = value + 2;
            if (zipShort.equals(TIME_ATTR_TAG)) {
                readTimeAttr(bArr, i4, i3 - i4);
                return;
            }
            value = i4 + new ZipShort(bArr, i4).getValue() + 2;
        }
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) throws ZipException {
        reset();
        parseFromLocalFileData(bArr, i, i2);
    }

    public ZipEightByteInteger getModifyTime() {
        return this.modifyTime;
    }

    public ZipEightByteInteger getAccessTime() {
        return this.accessTime;
    }

    public ZipEightByteInteger getCreateTime() {
        return this.createTime;
    }

    public Date getModifyJavaTime() {
        return zipToDate(this.modifyTime);
    }

    public Date getAccessJavaTime() {
        return zipToDate(this.accessTime);
    }

    public Date getCreateJavaTime() {
        return zipToDate(this.createTime);
    }

    public void setModifyTime(ZipEightByteInteger zipEightByteInteger) {
        if (zipEightByteInteger == null) {
            zipEightByteInteger = ZipEightByteInteger.ZERO;
        }
        this.modifyTime = zipEightByteInteger;
    }

    public void setAccessTime(ZipEightByteInteger zipEightByteInteger) {
        if (zipEightByteInteger == null) {
            zipEightByteInteger = ZipEightByteInteger.ZERO;
        }
        this.accessTime = zipEightByteInteger;
    }

    public void setCreateTime(ZipEightByteInteger zipEightByteInteger) {
        if (zipEightByteInteger == null) {
            zipEightByteInteger = ZipEightByteInteger.ZERO;
        }
        this.createTime = zipEightByteInteger;
    }

    public void setModifyJavaTime(Date date) {
        setModifyTime(dateToZip(date));
    }

    public void setAccessJavaTime(Date date) {
        setAccessTime(dateToZip(date));
    }

    public void setCreateJavaTime(Date date) {
        setCreateTime(dateToZip(date));
    }

    public String toString() {
        return "0x000A Zip Extra Field: Modify:[" + getModifyJavaTime() + "]  Access:[" + getAccessJavaTime() + "]  Create:[" + getCreateJavaTime() + "] ";
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof X000A_NTFS)) {
            return false;
        }
        X000A_NTFS x000a_ntfs = (X000A_NTFS) obj;
        return Objects.equals(this.modifyTime, x000a_ntfs.modifyTime) && Objects.equals(this.accessTime, x000a_ntfs.accessTime) && Objects.equals(this.createTime, x000a_ntfs.createTime);
    }

    public int hashCode() {
        ZipEightByteInteger zipEightByteInteger = this.modifyTime;
        int iHashCode = zipEightByteInteger != null ? (-123) ^ zipEightByteInteger.hashCode() : -123;
        ZipEightByteInteger zipEightByteInteger2 = this.accessTime;
        if (zipEightByteInteger2 != null) {
            iHashCode ^= Integer.rotateLeft(zipEightByteInteger2.hashCode(), 11);
        }
        ZipEightByteInteger zipEightByteInteger3 = this.createTime;
        return zipEightByteInteger3 != null ? iHashCode ^ Integer.rotateLeft(zipEightByteInteger3.hashCode(), 22) : iHashCode;
    }

    public final void reset() {
        ZipEightByteInteger zipEightByteInteger = ZipEightByteInteger.ZERO;
        this.modifyTime = zipEightByteInteger;
        this.accessTime = zipEightByteInteger;
        this.createTime = zipEightByteInteger;
    }

    public final void readTimeAttr(byte[] bArr, int i, int i2) {
        if (i2 >= 26) {
            if (TIME_ATTR_SIZE.equals(new ZipShort(bArr, i))) {
                this.modifyTime = new ZipEightByteInteger(bArr, i + 2);
                this.accessTime = new ZipEightByteInteger(bArr, i + 10);
                this.createTime = new ZipEightByteInteger(bArr, i + 18);
            }
        }
    }

    public static ZipEightByteInteger dateToZip(Date date) {
        if (date == null) {
            return null;
        }
        return new ZipEightByteInteger((date.getTime() * 10000) - EPOCH_OFFSET);
    }

    public static Date zipToDate(ZipEightByteInteger zipEightByteInteger) {
        if (zipEightByteInteger == null || ZipEightByteInteger.ZERO.equals(zipEightByteInteger)) {
            return null;
        }
        return new Date((zipEightByteInteger.getLongValue() + EPOCH_OFFSET) / 10000);
    }
}
