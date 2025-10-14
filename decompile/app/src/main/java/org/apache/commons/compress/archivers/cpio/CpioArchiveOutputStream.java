package org.apache.commons.compress.archivers.cpio;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import okhttp3.internal.p054ws.WebSocketProtocol;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.archivers.zip.ZipEncodingHelper;
import org.apache.commons.compress.utils.ArchiveUtils;

/* loaded from: classes8.dex */
public class CpioArchiveOutputStream extends ArchiveOutputStream implements CpioConstants {
    public final int blockSize;
    public boolean closed;
    public long crc;
    public final String encoding;
    public CpioArchiveEntry entry;
    public final short entryFormat;
    public boolean finished;
    public final HashMap<String, CpioArchiveEntry> names;
    public long nextArtificalDeviceAndInode;
    public final OutputStream out;
    public long written;
    public final ZipEncoding zipEncoding;

    public CpioArchiveOutputStream(OutputStream outputStream, short s) {
        this(outputStream, s, 512, "US-ASCII");
    }

    public CpioArchiveOutputStream(OutputStream outputStream, short s, int i) {
        this(outputStream, s, i, "US-ASCII");
    }

    public CpioArchiveOutputStream(OutputStream outputStream, short s, int i, String str) {
        this.names = new HashMap<>();
        this.nextArtificalDeviceAndInode = 1L;
        this.out = outputStream;
        if (s != 1 && s != 2 && s != 4 && s != 8) {
            throw new IllegalArgumentException("Unknown format: " + ((int) s));
        }
        this.entryFormat = s;
        this.blockSize = i;
        this.encoding = str;
        this.zipEncoding = ZipEncodingHelper.getZipEncoding(str);
    }

    public CpioArchiveOutputStream(OutputStream outputStream) {
        this(outputStream, (short) 1);
    }

    public CpioArchiveOutputStream(OutputStream outputStream, String str) {
        this(outputStream, (short) 1, 512, str);
    }

    private void ensureOpen() throws IOException {
        if (this.closed) {
            throw new IOException("Stream closed");
        }
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public void putArchiveEntry(ArchiveEntry archiveEntry) throws IOException {
        if (this.finished) {
            throw new IOException("Stream has already been finished");
        }
        CpioArchiveEntry cpioArchiveEntry = (CpioArchiveEntry) archiveEntry;
        ensureOpen();
        if (this.entry != null) {
            closeArchiveEntry();
        }
        if (cpioArchiveEntry.getTime() == -1) {
            cpioArchiveEntry.setTime(System.currentTimeMillis() / 1000);
        }
        short format = cpioArchiveEntry.getFormat();
        if (format != this.entryFormat) {
            throw new IOException("Header format: " + ((int) format) + " does not match existing format: " + ((int) this.entryFormat));
        }
        if (this.names.put(cpioArchiveEntry.getName(), cpioArchiveEntry) != null) {
            throw new IOException("Duplicate entry: " + cpioArchiveEntry.getName());
        }
        writeHeader(cpioArchiveEntry);
        this.entry = cpioArchiveEntry;
        this.written = 0L;
    }

    public final void writeHeader(CpioArchiveEntry cpioArchiveEntry) throws IOException {
        short format = cpioArchiveEntry.getFormat();
        if (format == 1) {
            this.out.write(ArchiveUtils.toAsciiBytes(CpioConstants.MAGIC_NEW));
            count(6);
            writeNewEntry(cpioArchiveEntry);
            return;
        }
        if (format == 2) {
            this.out.write(ArchiveUtils.toAsciiBytes(CpioConstants.MAGIC_NEW_CRC));
            count(6);
            writeNewEntry(cpioArchiveEntry);
        } else if (format == 4) {
            this.out.write(ArchiveUtils.toAsciiBytes(CpioConstants.MAGIC_OLD_ASCII));
            count(6);
            writeOldAsciiEntry(cpioArchiveEntry);
        } else if (format == 8) {
            writeBinaryLong(29127L, 2, true);
            writeOldBinaryEntry(cpioArchiveEntry, true);
        } else {
            throw new IOException("Unknown format " + ((int) cpioArchiveEntry.getFormat()));
        }
    }

    public final void writeNewEntry(CpioArchiveEntry cpioArchiveEntry) throws IOException {
        long inode = cpioArchiveEntry.getInode();
        long deviceMin = cpioArchiveEntry.getDeviceMin();
        if (CpioConstants.CPIO_TRAILER.equals(cpioArchiveEntry.getName())) {
            inode = 0;
            deviceMin = 0;
        } else if (inode == 0 && deviceMin == 0) {
            inode = this.nextArtificalDeviceAndInode;
            this.nextArtificalDeviceAndInode = inode + 1;
            deviceMin = inode >> 32;
        } else {
            this.nextArtificalDeviceAndInode = Math.max(this.nextArtificalDeviceAndInode, (4294967296L * deviceMin) + inode) + 1;
        }
        writeAsciiLong(inode, 8, 16);
        writeAsciiLong(cpioArchiveEntry.getMode(), 8, 16);
        writeAsciiLong(cpioArchiveEntry.getUID(), 8, 16);
        writeAsciiLong(cpioArchiveEntry.getGID(), 8, 16);
        writeAsciiLong(cpioArchiveEntry.getNumberOfLinks(), 8, 16);
        writeAsciiLong(cpioArchiveEntry.getTime(), 8, 16);
        writeAsciiLong(cpioArchiveEntry.getSize(), 8, 16);
        writeAsciiLong(cpioArchiveEntry.getDeviceMaj(), 8, 16);
        writeAsciiLong(deviceMin, 8, 16);
        writeAsciiLong(cpioArchiveEntry.getRemoteDeviceMaj(), 8, 16);
        writeAsciiLong(cpioArchiveEntry.getRemoteDeviceMin(), 8, 16);
        byte[] bArrEncode = encode(cpioArchiveEntry.getName());
        writeAsciiLong(bArrEncode.length + 1, 8, 16);
        writeAsciiLong(cpioArchiveEntry.getChksum(), 8, 16);
        writeCString(bArrEncode);
        pad(cpioArchiveEntry.getHeaderPadCount(bArrEncode.length));
    }

    public final void writeOldAsciiEntry(CpioArchiveEntry cpioArchiveEntry) throws IOException {
        long inode = cpioArchiveEntry.getInode();
        long device = cpioArchiveEntry.getDevice();
        if (CpioConstants.CPIO_TRAILER.equals(cpioArchiveEntry.getName())) {
            inode = 0;
            device = 0;
        } else if (inode == 0 && device == 0) {
            long j = this.nextArtificalDeviceAndInode;
            this.nextArtificalDeviceAndInode = j + 1;
            device = 262143 & (j >> 18);
            inode = j & 262143;
        } else {
            this.nextArtificalDeviceAndInode = Math.max(this.nextArtificalDeviceAndInode, (262144 * device) + inode) + 1;
        }
        writeAsciiLong(device, 6, 8);
        writeAsciiLong(inode, 6, 8);
        writeAsciiLong(cpioArchiveEntry.getMode(), 6, 8);
        writeAsciiLong(cpioArchiveEntry.getUID(), 6, 8);
        writeAsciiLong(cpioArchiveEntry.getGID(), 6, 8);
        writeAsciiLong(cpioArchiveEntry.getNumberOfLinks(), 6, 8);
        writeAsciiLong(cpioArchiveEntry.getRemoteDevice(), 6, 8);
        writeAsciiLong(cpioArchiveEntry.getTime(), 11, 8);
        byte[] bArrEncode = encode(cpioArchiveEntry.getName());
        writeAsciiLong(bArrEncode.length + 1, 6, 8);
        writeAsciiLong(cpioArchiveEntry.getSize(), 11, 8);
        writeCString(bArrEncode);
    }

    public final void writeOldBinaryEntry(CpioArchiveEntry cpioArchiveEntry, boolean z) throws IOException {
        long inode = cpioArchiveEntry.getInode();
        long device = cpioArchiveEntry.getDevice();
        if (CpioConstants.CPIO_TRAILER.equals(cpioArchiveEntry.getName())) {
            inode = 0;
            device = 0;
        } else if (inode == 0 && device == 0) {
            long j = this.nextArtificalDeviceAndInode;
            long j2 = j & WebSocketProtocol.PAYLOAD_SHORT_MAX;
            this.nextArtificalDeviceAndInode = j + 1;
            device = WebSocketProtocol.PAYLOAD_SHORT_MAX & (j >> 16);
            inode = j2;
        } else {
            this.nextArtificalDeviceAndInode = Math.max(this.nextArtificalDeviceAndInode, (65536 * device) + inode) + 1;
        }
        writeBinaryLong(device, 2, z);
        writeBinaryLong(inode, 2, z);
        writeBinaryLong(cpioArchiveEntry.getMode(), 2, z);
        writeBinaryLong(cpioArchiveEntry.getUID(), 2, z);
        writeBinaryLong(cpioArchiveEntry.getGID(), 2, z);
        writeBinaryLong(cpioArchiveEntry.getNumberOfLinks(), 2, z);
        writeBinaryLong(cpioArchiveEntry.getRemoteDevice(), 2, z);
        writeBinaryLong(cpioArchiveEntry.getTime(), 4, z);
        byte[] bArrEncode = encode(cpioArchiveEntry.getName());
        writeBinaryLong(bArrEncode.length + 1, 2, z);
        writeBinaryLong(cpioArchiveEntry.getSize(), 4, z);
        writeCString(bArrEncode);
        pad(cpioArchiveEntry.getHeaderPadCount(bArrEncode.length));
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public void closeArchiveEntry() throws IOException {
        if (this.finished) {
            throw new IOException("Stream has already been finished");
        }
        ensureOpen();
        CpioArchiveEntry cpioArchiveEntry = this.entry;
        if (cpioArchiveEntry == null) {
            throw new IOException("Trying to close non-existent entry");
        }
        if (cpioArchiveEntry.getSize() != this.written) {
            throw new IOException("Invalid entry size (expected " + this.entry.getSize() + " but got " + this.written + " bytes)");
        }
        pad(this.entry.getDataPadCount());
        if (this.entry.getFormat() == 2 && this.crc != this.entry.getChksum()) {
            throw new IOException("CRC Error");
        }
        this.entry = null;
        this.crc = 0L;
        this.written = 0L;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        ensureOpen();
        if (i < 0 || i2 < 0 || i > bArr.length - i2) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return;
        }
        CpioArchiveEntry cpioArchiveEntry = this.entry;
        if (cpioArchiveEntry == null) {
            throw new IOException("No current CPIO entry");
        }
        long j = i2;
        if (this.written + j > cpioArchiveEntry.getSize()) {
            throw new IOException("Attempt to write past end of STORED entry");
        }
        this.out.write(bArr, i, i2);
        this.written += j;
        if (this.entry.getFormat() == 2) {
            for (int i3 = 0; i3 < i2; i3++) {
                this.crc = (this.crc + (bArr[i3] & 255)) & 4294967295L;
            }
        }
        count(i2);
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public void finish() throws IOException {
        ensureOpen();
        if (this.finished) {
            throw new IOException("This archive has already been finished");
        }
        if (this.entry != null) {
            throw new IOException("This archive contains unclosed entries.");
        }
        CpioArchiveEntry cpioArchiveEntry = new CpioArchiveEntry(this.entryFormat);
        this.entry = cpioArchiveEntry;
        cpioArchiveEntry.setName(CpioConstants.CPIO_TRAILER);
        this.entry.setNumberOfLinks(1L);
        writeHeader(this.entry);
        closeArchiveEntry();
        long bytesWritten = getBytesWritten();
        int i = this.blockSize;
        int i2 = (int) (bytesWritten % i);
        if (i2 != 0) {
            pad(i - i2);
        }
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

    public final void pad(int i) throws IOException {
        if (i > 0) {
            this.out.write(new byte[i]);
            count(i);
        }
    }

    public final void writeBinaryLong(long j, int i, boolean z) throws IOException {
        byte[] bArrLong2byteArray = CpioUtil.long2byteArray(j, i, z);
        this.out.write(bArrLong2byteArray);
        count(bArrLong2byteArray.length);
    }

    public final void writeAsciiLong(long j, int i, int i2) throws IOException {
        String strSubstring;
        StringBuilder sb = new StringBuilder();
        if (i2 == 16) {
            sb.append(Long.toHexString(j));
        } else if (i2 == 8) {
            sb.append(Long.toOctalString(j));
        } else {
            sb.append(j);
        }
        if (sb.length() <= i) {
            int length = i - sb.length();
            for (int i3 = 0; i3 < length; i3++) {
                sb.insert(0, "0");
            }
            strSubstring = sb.toString();
        } else {
            strSubstring = sb.substring(sb.length() - i);
        }
        byte[] asciiBytes = ArchiveUtils.toAsciiBytes(strSubstring);
        this.out.write(asciiBytes);
        count(asciiBytes.length);
    }

    public final byte[] encode(String str) throws IOException {
        ByteBuffer byteBufferEncode = this.zipEncoding.encode(str);
        return Arrays.copyOfRange(byteBufferEncode.array(), byteBufferEncode.arrayOffset(), byteBufferEncode.arrayOffset() + (byteBufferEncode.limit() - byteBufferEncode.position()));
    }

    public final void writeCString(byte[] bArr) throws IOException {
        this.out.write(bArr);
        this.out.write(0);
        count(bArr.length + 1);
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public ArchiveEntry createArchiveEntry(File file, String str) throws IOException {
        if (this.finished) {
            throw new IOException("Stream has already been finished");
        }
        return new CpioArchiveEntry(file, str);
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public ArchiveEntry createArchiveEntry(Path path, String str, LinkOption... linkOptionArr) throws IOException {
        if (this.finished) {
            throw new IOException("Stream has already been finished");
        }
        return new CpioArchiveEntry(path, str, linkOptionArr);
    }
}
