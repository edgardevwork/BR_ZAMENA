package org.apache.commons.compress.archivers.tar;

import com.blackhub.bronline.launcher.LauncherConstants;
import com.google.common.base.Ascii;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.archivers.zip.ZipEncodingHelper;
import org.apache.commons.compress.utils.CountingOutputStream;
import org.apache.commons.compress.utils.ExactMath;
import org.apache.commons.compress.utils.FixedLengthBlockOutputStream;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.protocol.HTTP;

/* loaded from: classes8.dex */
public class TarArchiveOutputStream extends ArchiveOutputStream {
    public static final ZipEncoding ASCII = ZipEncodingHelper.getZipEncoding(HTTP.ASCII);
    public static final int BIGNUMBER_ERROR = 0;
    public static final int BIGNUMBER_POSIX = 2;
    public static final int BIGNUMBER_STAR = 1;
    public static final int BLOCK_SIZE_UNSPECIFIED = -511;
    public static final int LONGFILE_ERROR = 0;
    public static final int LONGFILE_GNU = 2;
    public static final int LONGFILE_POSIX = 3;
    public static final int LONGFILE_TRUNCATE = 1;
    public static final int RECORD_SIZE = 512;
    public boolean addPaxHeadersForNonAsciiNames;
    public int bigNumberMode;
    public boolean closed;
    public final CountingOutputStream countingOut;
    public long currBytes;
    public String currName;
    public long currSize;
    public final String encoding;
    public boolean finished;
    public boolean haveUnclosedEntry;
    public int longFileMode;
    public final FixedLengthBlockOutputStream out;
    public final byte[] recordBuf;
    public final int recordsPerBlock;
    public int recordsWritten;
    public final ZipEncoding zipEncoding;

    @Deprecated
    public int getRecordSize() {
        return 512;
    }

    public final boolean shouldBeReplaced(char c) {
        return c == 0 || c == '/' || c == '\\';
    }

    public TarArchiveOutputStream(OutputStream outputStream) {
        this(outputStream, BLOCK_SIZE_UNSPECIFIED);
    }

    public TarArchiveOutputStream(OutputStream outputStream, String str) {
        this(outputStream, BLOCK_SIZE_UNSPECIFIED, str);
    }

    public TarArchiveOutputStream(OutputStream outputStream, int i) {
        this(outputStream, i, (String) null);
    }

    @Deprecated
    public TarArchiveOutputStream(OutputStream outputStream, int i, int i2) {
        this(outputStream, i, i2, null);
    }

    @Deprecated
    public TarArchiveOutputStream(OutputStream outputStream, int i, int i2, String str) {
        this(outputStream, i, str);
        if (i2 == 512) {
            return;
        }
        throw new IllegalArgumentException("Tar record size must always be 512 bytes. Attempt to set size of " + i2);
    }

    public TarArchiveOutputStream(OutputStream outputStream, int i, String str) {
        this.longFileMode = 0;
        this.bigNumberMode = 0;
        int i2 = -511 == i ? 512 : i;
        if (i2 <= 0 || i2 % 512 != 0) {
            throw new IllegalArgumentException("Block size must be a multiple of 512 bytes. Attempt to use set size of " + i);
        }
        CountingOutputStream countingOutputStream = new CountingOutputStream(outputStream);
        this.countingOut = countingOutputStream;
        this.out = new FixedLengthBlockOutputStream(countingOutputStream, 512);
        this.encoding = str;
        this.zipEncoding = ZipEncodingHelper.getZipEncoding(str);
        this.recordBuf = new byte[512];
        this.recordsPerBlock = i2 / 512;
    }

    public void setLongFileMode(int i) {
        this.longFileMode = i;
    }

    public void setBigNumberMode(int i) {
        this.bigNumberMode = i;
    }

    public void setAddPaxHeadersForNonAsciiNames(boolean z) {
        this.addPaxHeadersForNonAsciiNames = z;
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    @Deprecated
    public int getCount() {
        return (int) getBytesWritten();
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public long getBytesWritten() {
        return this.countingOut.getBytesWritten();
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public void finish() throws IOException {
        if (this.finished) {
            throw new IOException("This archive has already been finished");
        }
        if (this.haveUnclosedEntry) {
            throw new IOException("This archive contains unclosed entries.");
        }
        writeEOFRecord();
        writeEOFRecord();
        padAsNeeded();
        this.out.flush();
        this.finished = true;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            if (!this.finished) {
                finish();
            }
        } finally {
            if (!this.closed) {
                this.out.close();
                this.closed = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ef  */
    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void putArchiveEntry(ArchiveEntry archiveEntry) throws IOException {
        String str;
        int i;
        if (this.finished) {
            throw new IOException("Stream has already been finished");
        }
        TarArchiveEntry tarArchiveEntry = (TarArchiveEntry) archiveEntry;
        if (tarArchiveEntry.isGlobalPaxHeader()) {
            byte[] bArrEncodeExtendedPaxHeadersContents = encodeExtendedPaxHeadersContents(tarArchiveEntry.getExtraPaxHeaders());
            tarArchiveEntry.setSize(bArrEncodeExtendedPaxHeadersContents.length);
            tarArchiveEntry.writeEntryHeader(this.recordBuf, this.zipEncoding, this.bigNumberMode == 1);
            writeRecord(this.recordBuf);
            this.currSize = tarArchiveEntry.getSize();
            this.currBytes = 0L;
            this.haveUnclosedEntry = true;
            write(bArrEncodeExtendedPaxHeadersContents);
            closeArchiveEntry();
            return;
        }
        HashMap map = new HashMap();
        String name = tarArchiveEntry.getName();
        boolean zHandleLongName = handleLongName(tarArchiveEntry, name, map, "path", TarConstants.LF_GNUTYPE_LONGNAME, "file name");
        String linkName = tarArchiveEntry.getLinkName();
        if (linkName != null && !linkName.isEmpty()) {
            str = linkName;
            boolean z = handleLongName(tarArchiveEntry, linkName, map, "linkpath", TarConstants.LF_GNUTYPE_LONGLINK, "link name");
            i = this.bigNumberMode;
            if (i != 2) {
                addPaxHeadersForBigNumbers(map, tarArchiveEntry);
            } else if (i != 1) {
                failForBigNumbers(tarArchiveEntry);
            }
            if (this.addPaxHeadersForNonAsciiNames && !zHandleLongName && !ASCII.canEncode(name)) {
                map.put("path", name);
            }
            if (this.addPaxHeadersForNonAsciiNames && !z && ((tarArchiveEntry.isLink() || tarArchiveEntry.isSymbolicLink()) && !ASCII.canEncode(str))) {
                map.put("linkpath", str);
            }
            map.putAll(tarArchiveEntry.getExtraPaxHeaders());
            if (!map.isEmpty()) {
                writePaxHeaders(tarArchiveEntry, name, map);
            }
            tarArchiveEntry.writeEntryHeader(this.recordBuf, this.zipEncoding, this.bigNumberMode != 1);
            writeRecord(this.recordBuf);
            this.currBytes = 0L;
            if (!tarArchiveEntry.isDirectory()) {
                this.currSize = 0L;
            } else {
                this.currSize = tarArchiveEntry.getSize();
            }
            this.currName = name;
            this.haveUnclosedEntry = true;
        }
        str = linkName;
        i = this.bigNumberMode;
        if (i != 2) {
        }
        if (this.addPaxHeadersForNonAsciiNames) {
            map.put("path", name);
        }
        if (this.addPaxHeadersForNonAsciiNames) {
            map.put("linkpath", str);
        }
        map.putAll(tarArchiveEntry.getExtraPaxHeaders());
        if (!map.isEmpty()) {
        }
        tarArchiveEntry.writeEntryHeader(this.recordBuf, this.zipEncoding, this.bigNumberMode != 1);
        writeRecord(this.recordBuf);
        this.currBytes = 0L;
        if (!tarArchiveEntry.isDirectory()) {
        }
        this.currName = name;
        this.haveUnclosedEntry = true;
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public void closeArchiveEntry() throws IOException {
        if (this.finished) {
            throw new IOException("Stream has already been finished");
        }
        if (!this.haveUnclosedEntry) {
            throw new IOException("No current entry to close");
        }
        this.out.flushBlock();
        long j = this.currBytes;
        long j2 = this.currSize;
        if (j < j2) {
            throw new IOException("Entry '" + this.currName + "' closed at '" + this.currBytes + "' before the '" + this.currSize + "' bytes specified in the header were written");
        }
        int iAdd = ExactMath.add(this.recordsWritten, j2 / 512);
        this.recordsWritten = iAdd;
        if (0 != this.currSize % 512) {
            this.recordsWritten = iAdd + 1;
        }
        this.haveUnclosedEntry = false;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (!this.haveUnclosedEntry) {
            throw new IllegalStateException("No current tar entry");
        }
        long j = i2;
        if (this.currBytes + j > this.currSize) {
            throw new IOException("Request to write '" + i2 + "' bytes exceeds size in header of '" + this.currSize + "' bytes for entry '" + this.currName + "'");
        }
        this.out.write(bArr, i, i2);
        this.currBytes += j;
    }

    public void writePaxHeaders(TarArchiveEntry tarArchiveEntry, String str, Map<String, String> map) throws IOException {
        String strSubstring = "./PaxHeaders.X/" + stripTo7Bits(str);
        if (strSubstring.length() >= 100) {
            strSubstring = strSubstring.substring(0, 99);
        }
        TarArchiveEntry tarArchiveEntry2 = new TarArchiveEntry(strSubstring, (byte) 120);
        transferModTime(tarArchiveEntry, tarArchiveEntry2);
        byte[] bArrEncodeExtendedPaxHeadersContents = encodeExtendedPaxHeadersContents(map);
        tarArchiveEntry2.setSize(bArrEncodeExtendedPaxHeadersContents.length);
        putArchiveEntry(tarArchiveEntry2);
        write(bArrEncodeExtendedPaxHeadersContents);
        closeArchiveEntry();
    }

    public final byte[] encodeExtendedPaxHeadersContents(Map<String, String> map) {
        final StringWriter stringWriter = new StringWriter();
        map.forEach(new BiConsumer() { // from class: org.apache.commons.compress.archivers.tar.TarArchiveOutputStream$$ExternalSyntheticLambda1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                TarArchiveOutputStream.lambda$encodeExtendedPaxHeadersContents$0(stringWriter, (String) obj, (String) obj2);
            }
        });
        return stringWriter.toString().getBytes(StandardCharsets.UTF_8);
    }

    public static /* synthetic */ void lambda$encodeExtendedPaxHeadersContents$0(StringWriter stringWriter, String str, String str2) {
        int length = str.length() + str2.length() + 5;
        String str3 = length + " " + str + URLEncodedUtils.NAME_VALUE_SEPARATOR + str2 + StringUtils.f9903LF;
        int length2 = str3.getBytes(StandardCharsets.UTF_8).length;
        while (length != length2) {
            str3 = length2 + " " + str + URLEncodedUtils.NAME_VALUE_SEPARATOR + str2 + StringUtils.f9903LF;
            int i = length2;
            length2 = str3.getBytes(StandardCharsets.UTF_8).length;
            length = i;
        }
        stringWriter.write(str3);
    }

    public final String stripTo7Bits(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char cCharAt = (char) (str.charAt(i) & Ascii.MAX);
            if (shouldBeReplaced(cCharAt)) {
                sb.append(LauncherConstants.UNDERSCORE_STRING);
            } else {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    public final void writeEOFRecord() throws IOException {
        Arrays.fill(this.recordBuf, (byte) 0);
        writeRecord(this.recordBuf);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.out.flush();
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public ArchiveEntry createArchiveEntry(File file, String str) throws IOException {
        if (this.finished) {
            throw new IOException("Stream has already been finished");
        }
        return new TarArchiveEntry(file, str);
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public ArchiveEntry createArchiveEntry(Path path, String str, LinkOption... linkOptionArr) throws IOException {
        if (this.finished) {
            throw new IOException("Stream has already been finished");
        }
        return new TarArchiveEntry(path, str, linkOptionArr);
    }

    public final void writeRecord(byte[] bArr) throws IOException {
        if (bArr.length != 512) {
            throw new IOException("Record to write has length '" + bArr.length + "' which is not the record size of '512'");
        }
        this.out.write(bArr);
        this.recordsWritten++;
    }

    public final void padAsNeeded() throws IOException {
        int i = this.recordsWritten % this.recordsPerBlock;
        if (i != 0) {
            while (i < this.recordsPerBlock) {
                writeEOFRecord();
                i++;
            }
        }
    }

    public final void addPaxHeadersForBigNumbers(Map<String, String> map, TarArchiveEntry tarArchiveEntry) {
        addPaxHeaderForBigNumber(map, "size", tarArchiveEntry.getSize(), TarConstants.MAXSIZE);
        addPaxHeaderForBigNumber(map, "gid", tarArchiveEntry.getLongGroupId(), 2097151L);
        addFileTimePaxHeaderForBigNumber(map, "mtime", tarArchiveEntry.getLastModifiedTime(), TarConstants.MAXSIZE);
        addFileTimePaxHeader(map, "atime", tarArchiveEntry.getLastAccessTime());
        if (tarArchiveEntry.getStatusChangeTime() != null) {
            addFileTimePaxHeader(map, "ctime", tarArchiveEntry.getStatusChangeTime());
        } else {
            addFileTimePaxHeader(map, "ctime", tarArchiveEntry.getCreationTime());
        }
        addPaxHeaderForBigNumber(map, "uid", tarArchiveEntry.getLongUserId(), 2097151L);
        addFileTimePaxHeader(map, "LIBARCHIVE.creationtime", tarArchiveEntry.getCreationTime());
        addPaxHeaderForBigNumber(map, "SCHILY.devmajor", tarArchiveEntry.getDevMajor(), 2097151L);
        addPaxHeaderForBigNumber(map, "SCHILY.devminor", tarArchiveEntry.getDevMinor(), 2097151L);
        failForBigNumber("mode", tarArchiveEntry.getMode(), 2097151L);
    }

    public final void addPaxHeaderForBigNumber(Map<String, String> map, String str, long j, long j2) {
        if (j < 0 || j > j2) {
            map.put(str, String.valueOf(j));
        }
    }

    public final void addFileTimePaxHeaderForBigNumber(Map<String, String> map, String str, FileTime fileTime, long j) {
        if (fileTime != null) {
            Instant instant = fileTime.toInstant();
            long epochSecond = instant.getEpochSecond();
            int nano = instant.getNano();
            if (nano == 0) {
                addPaxHeaderForBigNumber(map, str, epochSecond, j);
            } else {
                addInstantPaxHeader(map, str, epochSecond, nano);
            }
        }
    }

    public final void addFileTimePaxHeader(Map<String, String> map, String str, FileTime fileTime) {
        if (fileTime != null) {
            Instant instant = fileTime.toInstant();
            long epochSecond = instant.getEpochSecond();
            int nano = instant.getNano();
            if (nano == 0) {
                map.put(str, String.valueOf(epochSecond));
            } else {
                addInstantPaxHeader(map, str, epochSecond, nano);
            }
        }
    }

    public final void addInstantPaxHeader(Map<String, String> map, String str, long j, int i) {
        map.put(str, BigDecimal.valueOf(j).add(BigDecimal.valueOf(i).movePointLeft(9).setScale(7, RoundingMode.DOWN)).toPlainString());
    }

    public final void failForBigNumbers(TarArchiveEntry tarArchiveEntry) {
        failForBigNumber("entry size", tarArchiveEntry.getSize(), TarConstants.MAXSIZE);
        failForBigNumberWithPosixMessage("group id", tarArchiveEntry.getLongGroupId(), 2097151L);
        failForBigNumber("last modification time", tarArchiveEntry.getLastModifiedTime().to(TimeUnit.SECONDS), TarConstants.MAXSIZE);
        failForBigNumber("user id", tarArchiveEntry.getLongUserId(), 2097151L);
        failForBigNumber("mode", tarArchiveEntry.getMode(), 2097151L);
        failForBigNumber("major device number", tarArchiveEntry.getDevMajor(), 2097151L);
        failForBigNumber("minor device number", tarArchiveEntry.getDevMinor(), 2097151L);
    }

    public final void failForBigNumber(String str, long j, long j2) {
        failForBigNumber(str, j, j2, "");
    }

    public final void failForBigNumberWithPosixMessage(String str, long j, long j2) {
        failForBigNumber(str, j, j2, " Use STAR or POSIX extensions to overcome this limit");
    }

    public final void failForBigNumber(String str, long j, long j2, String str2) {
        if (j < 0 || j > j2) {
            throw new IllegalArgumentException(str + " '" + j + "' is too big ( > " + j2 + " )." + str2);
        }
    }

    public final boolean handleLongName(TarArchiveEntry tarArchiveEntry, String str, Map<String, String> map, String str2, byte b, String str3) throws IOException {
        ByteBuffer byteBufferEncode = this.zipEncoding.encode(str);
        int iLimit = byteBufferEncode.limit() - byteBufferEncode.position();
        if (iLimit >= 100) {
            int i = this.longFileMode;
            if (i == 3) {
                map.put(str2, str);
                return true;
            }
            if (i == 2) {
                TarArchiveEntry tarArchiveEntry2 = new TarArchiveEntry(TarConstants.GNU_LONGLINK, b);
                tarArchiveEntry2.setSize(iLimit + 1);
                transferModTime(tarArchiveEntry, tarArchiveEntry2);
                putArchiveEntry(tarArchiveEntry2);
                write(byteBufferEncode.array(), byteBufferEncode.arrayOffset(), iLimit);
                write(0);
                closeArchiveEntry();
            } else if (i != 1) {
                throw new IllegalArgumentException(str3 + " '" + str + "' is too long ( > 100 bytes)");
            }
        }
        return false;
    }

    public final void transferModTime(TarArchiveEntry tarArchiveEntry, TarArchiveEntry tarArchiveEntry2) {
        FileTime lastModifiedTime = tarArchiveEntry.getLastModifiedTime();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long j = lastModifiedTime.to(timeUnit);
        if (j < 0 || j > TarConstants.MAXSIZE) {
            j = 0;
        }
        tarArchiveEntry2.setLastModifiedTime(FileTime.from(j, timeUnit));
    }
}
