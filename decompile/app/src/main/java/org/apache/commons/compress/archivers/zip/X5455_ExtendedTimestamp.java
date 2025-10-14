package org.apache.commons.compress.archivers.zip;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;
import java.util.zip.ZipException;
import okio.internal.ZipFilesKt;

/* loaded from: classes6.dex */
public class X5455_ExtendedTimestamp implements ZipExtraField, Cloneable, Serializable {
    public static final byte ACCESS_TIME_BIT = 2;
    public static final byte CREATE_TIME_BIT = 4;
    public static final ZipShort HEADER_ID = new ZipShort(ZipFilesKt.HEADER_ID_EXTENDED_TIMESTAMP);
    public static final byte MODIFY_TIME_BIT = 1;
    public static final long serialVersionUID = 1;
    public ZipLong accessTime;
    public boolean bit0_modifyTimePresent;
    public boolean bit1_accessTimePresent;
    public boolean bit2_createTimePresent;
    public ZipLong createTime;
    public byte flags;
    public ZipLong modifyTime;

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public ZipShort getHeaderId() {
        return HEADER_ID;
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public ZipShort getLocalFileDataLength() {
        int i = 0;
        int i2 = (this.bit0_modifyTimePresent ? 4 : 0) + 1 + ((!this.bit1_accessTimePresent || this.accessTime == null) ? 0 : 4);
        if (this.bit2_createTimePresent && this.createTime != null) {
            i = 4;
        }
        return new ZipShort(i2 + i);
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public ZipShort getCentralDirectoryLength() {
        return new ZipShort((this.bit0_modifyTimePresent ? 4 : 0) + 1);
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public byte[] getLocalFileDataData() {
        ZipLong zipLong;
        ZipLong zipLong2;
        byte[] bArr = new byte[getLocalFileDataLength().getValue()];
        bArr[0] = 0;
        int i = 1;
        if (this.bit0_modifyTimePresent) {
            bArr[0] = (byte) 1;
            System.arraycopy(this.modifyTime.getBytes(), 0, bArr, 1, 4);
            i = 5;
        }
        if (this.bit1_accessTimePresent && (zipLong2 = this.accessTime) != null) {
            bArr[0] = (byte) (bArr[0] | 2);
            System.arraycopy(zipLong2.getBytes(), 0, bArr, i, 4);
            i += 4;
        }
        if (this.bit2_createTimePresent && (zipLong = this.createTime) != null) {
            bArr[0] = (byte) (bArr[0] | 4);
            System.arraycopy(zipLong.getBytes(), 0, bArr, i, 4);
        }
        return bArr;
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public byte[] getCentralDirectoryData() {
        return Arrays.copyOf(getLocalFileDataData(), getCentralDirectoryLength().getValue());
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public void parseFromLocalFileData(byte[] bArr, int i, int i2) throws ZipException {
        int i3;
        int i4;
        reset();
        if (i2 < 1) {
            throw new ZipException("X5455_ExtendedTimestamp too short, only " + i2 + " bytes");
        }
        int i5 = i2 + i;
        int i6 = i + 1;
        setFlags(bArr[i]);
        if (this.bit0_modifyTimePresent && (i4 = i + 5) <= i5) {
            this.modifyTime = new ZipLong(bArr, i6);
            i6 = i4;
        } else {
            this.bit0_modifyTimePresent = false;
        }
        if (this.bit1_accessTimePresent && (i3 = i6 + 4) <= i5) {
            this.accessTime = new ZipLong(bArr, i6);
            i6 = i3;
        } else {
            this.bit1_accessTimePresent = false;
        }
        if (this.bit2_createTimePresent && i6 + 4 <= i5) {
            this.createTime = new ZipLong(bArr, i6);
        } else {
            this.bit2_createTimePresent = false;
        }
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) throws ZipException {
        reset();
        parseFromLocalFileData(bArr, i, i2);
    }

    private void reset() {
        setFlags((byte) 0);
        this.modifyTime = null;
        this.accessTime = null;
        this.createTime = null;
    }

    public void setFlags(byte b) {
        this.flags = b;
        this.bit0_modifyTimePresent = (b & 1) == 1;
        this.bit1_accessTimePresent = (b & 2) == 2;
        this.bit2_createTimePresent = (b & 4) == 4;
    }

    public byte getFlags() {
        return this.flags;
    }

    public boolean isBit0_modifyTimePresent() {
        return this.bit0_modifyTimePresent;
    }

    public boolean isBit1_accessTimePresent() {
        return this.bit1_accessTimePresent;
    }

    public boolean isBit2_createTimePresent() {
        return this.bit2_createTimePresent;
    }

    public ZipLong getModifyTime() {
        return this.modifyTime;
    }

    public ZipLong getAccessTime() {
        return this.accessTime;
    }

    public ZipLong getCreateTime() {
        return this.createTime;
    }

    public Date getModifyJavaTime() {
        return zipLongToDate(this.modifyTime);
    }

    public Date getAccessJavaTime() {
        return zipLongToDate(this.accessTime);
    }

    public Date getCreateJavaTime() {
        return zipLongToDate(this.createTime);
    }

    public void setModifyTime(ZipLong zipLong) {
        this.bit0_modifyTimePresent = zipLong != null;
        this.flags = (byte) (zipLong != null ? 1 | this.flags : this.flags & (-2));
        this.modifyTime = zipLong;
    }

    public void setAccessTime(ZipLong zipLong) {
        this.bit1_accessTimePresent = zipLong != null;
        byte b = this.flags;
        this.flags = (byte) (zipLong != null ? b | 2 : b & (-3));
        this.accessTime = zipLong;
    }

    public void setCreateTime(ZipLong zipLong) {
        this.bit2_createTimePresent = zipLong != null;
        byte b = this.flags;
        this.flags = (byte) (zipLong != null ? b | 4 : b & (-5));
        this.createTime = zipLong;
    }

    public void setModifyJavaTime(Date date) {
        setModifyTime(dateToZipLong(date));
    }

    public void setAccessJavaTime(Date date) {
        setAccessTime(dateToZipLong(date));
    }

    public void setCreateJavaTime(Date date) {
        setCreateTime(dateToZipLong(date));
    }

    public static ZipLong dateToZipLong(Date date) {
        if (date == null) {
            return null;
        }
        return unixTimeToZipLong(date.getTime() / 1000);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("0x5455 Zip Extra Field: Flags=");
        sb.append(Integer.toBinaryString(ZipUtil.unsignedIntToSignedByte(this.flags)));
        sb.append(" ");
        if (this.bit0_modifyTimePresent && this.modifyTime != null) {
            Date modifyJavaTime = getModifyJavaTime();
            sb.append(" Modify:[");
            sb.append(modifyJavaTime);
            sb.append("] ");
        }
        if (this.bit1_accessTimePresent && this.accessTime != null) {
            Date accessJavaTime = getAccessJavaTime();
            sb.append(" Access:[");
            sb.append(accessJavaTime);
            sb.append("] ");
        }
        if (this.bit2_createTimePresent && this.createTime != null) {
            Date createJavaTime = getCreateJavaTime();
            sb.append(" Create:[");
            sb.append(createJavaTime);
            sb.append("] ");
        }
        return sb.toString();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof X5455_ExtendedTimestamp)) {
            return false;
        }
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = (X5455_ExtendedTimestamp) obj;
        return (this.flags & 7) == (x5455_ExtendedTimestamp.flags & 7) && Objects.equals(this.modifyTime, x5455_ExtendedTimestamp.modifyTime) && Objects.equals(this.accessTime, x5455_ExtendedTimestamp.accessTime) && Objects.equals(this.createTime, x5455_ExtendedTimestamp.createTime);
    }

    public int hashCode() {
        int iRotateLeft = (this.flags & 7) * (-123);
        ZipLong zipLong = this.modifyTime;
        if (zipLong != null) {
            iRotateLeft ^= zipLong.hashCode();
        }
        ZipLong zipLong2 = this.accessTime;
        if (zipLong2 != null) {
            iRotateLeft ^= Integer.rotateLeft(zipLong2.hashCode(), 11);
        }
        ZipLong zipLong3 = this.createTime;
        return zipLong3 != null ? iRotateLeft ^ Integer.rotateLeft(zipLong3.hashCode(), 22) : iRotateLeft;
    }

    public static Date zipLongToDate(ZipLong zipLong) {
        if (zipLong != null) {
            return new Date(zipLong.getIntValue() * 1000);
        }
        return null;
    }

    public static ZipLong unixTimeToZipLong(long j) {
        if (j < ParserMinimalBase.MIN_INT_L || j > ParserMinimalBase.MAX_INT_L) {
            throw new IllegalArgumentException("X5455 timestamps must fit in a signed 32 bit integer: " + j);
        }
        return new ZipLong(j);
    }
}
