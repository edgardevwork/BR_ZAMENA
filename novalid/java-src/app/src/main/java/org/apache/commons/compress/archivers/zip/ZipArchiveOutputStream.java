package org.apache.commons.compress.archivers.zip;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.Calendar;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.ZipException;
import okhttp3.internal.p054ws.WebSocketProtocol;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.apache.commons.compress.utils.ByteUtils;
import org.apache.commons.compress.utils.IOUtils;
import org.apache.ivy.core.retrieve.RetrieveOptions;

/* loaded from: classes6.dex */
public class ZipArchiveOutputStream extends ArchiveOutputStream {
    public static final int BUFFER_SIZE = 512;
    public static final int CFH_COMMENT_LENGTH_OFFSET = 32;
    public static final int CFH_COMPRESSED_SIZE_OFFSET = 20;
    public static final int CFH_CRC_OFFSET = 16;
    public static final int CFH_DISK_NUMBER_OFFSET = 34;
    public static final int CFH_EXTERNAL_ATTRIBUTES_OFFSET = 38;
    public static final int CFH_EXTRA_LENGTH_OFFSET = 30;
    public static final int CFH_FILENAME_LENGTH_OFFSET = 28;
    public static final int CFH_FILENAME_OFFSET = 46;
    public static final int CFH_GPB_OFFSET = 8;
    public static final int CFH_INTERNAL_ATTRIBUTES_OFFSET = 36;
    public static final int CFH_LFH_OFFSET = 42;
    public static final int CFH_METHOD_OFFSET = 10;
    public static final int CFH_ORIGINAL_SIZE_OFFSET = 24;
    public static final int CFH_SIG_OFFSET = 0;
    public static final int CFH_TIME_OFFSET = 12;
    public static final int CFH_VERSION_MADE_BY_OFFSET = 4;
    public static final int CFH_VERSION_NEEDED_OFFSET = 6;
    public static final int DEFAULT_COMPRESSION = -1;
    public static final String DEFAULT_ENCODING = "UTF8";
    public static final int DEFLATED = 8;

    @Deprecated
    public static final int EFS_FLAG = 2048;
    public static final int LFH_COMPRESSED_SIZE_OFFSET = 18;
    public static final int LFH_CRC_OFFSET = 14;
    public static final int LFH_EXTRA_LENGTH_OFFSET = 28;
    public static final int LFH_FILENAME_LENGTH_OFFSET = 26;
    public static final int LFH_FILENAME_OFFSET = 30;
    public static final int LFH_GPB_OFFSET = 6;
    public static final int LFH_METHOD_OFFSET = 8;
    public static final int LFH_ORIGINAL_SIZE_OFFSET = 22;
    public static final int LFH_SIG_OFFSET = 0;
    public static final int LFH_TIME_OFFSET = 10;
    public static final int LFH_VERSION_NEEDED_OFFSET = 4;
    public static final int STORED = 0;
    public final Calendar calendarInstance;
    public long cdDiskNumberStart;
    public long cdLength;
    public long cdOffset;
    public final SeekableByteChannel channel;
    public String comment;
    public final byte[] copyBuffer;
    public UnicodeExtraFieldPolicy createUnicodeExtraFields;
    public final Deflater def;
    public String encoding;
    public final List<ZipArchiveEntry> entries;
    public CurrentEntry entry;
    public long eocdLength;
    public boolean fallbackToUTF8;
    public boolean finished;
    public boolean hasCompressionLevelChanged;
    public boolean hasUsedZip64;
    public final boolean isSplitZip;
    public int level;
    public final Map<ZipArchiveEntry, EntryMetaData> metaData;
    public int method;
    public final Map<Integer, Integer> numberOfCDInDiskData;
    public final OutputStream outputStream;
    public final StreamCompressor streamCompressor;
    public boolean useUTF8Flag;
    public Zip64Mode zip64Mode;
    public ZipEncoding zipEncoding;
    public static final byte[] ZERO = {0, 0};
    public static final byte[] LZERO = {0, 0, 0, 0};
    public static final byte[] ONE = ZipLong.getBytes(1);
    public static final byte[] LFH_SIG = ZipLong.LFH_SIG.getBytes();
    public static final byte[] DD_SIG = ZipLong.DD_SIG.getBytes();
    public static final byte[] CFH_SIG = ZipLong.CFH_SIG.getBytes();
    public static final byte[] EOCD_SIG = ZipLong.getBytes(101010256);
    public static final byte[] ZIP64_EOCD_SIG = ZipLong.getBytes(101075792);
    public static final byte[] ZIP64_EOCD_LOC_SIG = ZipLong.getBytes(117853008);

    public final int versionNeededToExtractMethod(int i) {
        return i == 8 ? 20 : 10;
    }

    public ZipArchiveOutputStream(OutputStream outputStream) {
        this.comment = "";
        this.level = -1;
        this.method = 8;
        this.entries = new LinkedList();
        this.metaData = new HashMap();
        this.encoding = "UTF8";
        this.zipEncoding = ZipEncodingHelper.getZipEncoding("UTF8");
        this.useUTF8Flag = true;
        this.createUnicodeExtraFields = UnicodeExtraFieldPolicy.NEVER;
        this.zip64Mode = Zip64Mode.AsNeeded;
        this.copyBuffer = new byte[32768];
        this.calendarInstance = Calendar.getInstance();
        this.numberOfCDInDiskData = new HashMap();
        this.outputStream = outputStream;
        this.channel = null;
        Deflater deflater = new Deflater(this.level, true);
        this.def = deflater;
        this.streamCompressor = StreamCompressor.create(outputStream, deflater);
        this.isSplitZip = false;
    }

    public ZipArchiveOutputStream(File file) throws IOException {
        this(file.toPath(), new OpenOption[0]);
    }

    public ZipArchiveOutputStream(Path path, OpenOption... openOptionArr) throws IOException {
        SeekableByteChannel seekableByteChannelNewByteChannel;
        StreamCompressor streamCompressorCreate;
        this.comment = "";
        this.level = -1;
        this.method = 8;
        this.entries = new LinkedList();
        this.metaData = new HashMap();
        this.encoding = "UTF8";
        this.zipEncoding = ZipEncodingHelper.getZipEncoding("UTF8");
        this.useUTF8Flag = true;
        this.createUnicodeExtraFields = UnicodeExtraFieldPolicy.NEVER;
        this.zip64Mode = Zip64Mode.AsNeeded;
        this.copyBuffer = new byte[32768];
        this.calendarInstance = Calendar.getInstance();
        this.numberOfCDInDiskData = new HashMap();
        Deflater deflater = new Deflater(this.level, true);
        this.def = deflater;
        OutputStream outputStream = null;
        try {
            seekableByteChannelNewByteChannel = Files.newByteChannel(path, EnumSet.of(StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption.TRUNCATE_EXISTING), new FileAttribute[0]);
            try {
                streamCompressorCreate = StreamCompressor.create(seekableByteChannelNewByteChannel, deflater);
            } catch (IOException unused) {
                IOUtils.closeQuietly(seekableByteChannelNewByteChannel);
                OutputStream outputStreamNewOutputStream = Files.newOutputStream(path, openOptionArr);
                seekableByteChannelNewByteChannel = null;
                outputStream = outputStreamNewOutputStream;
                streamCompressorCreate = StreamCompressor.create(outputStreamNewOutputStream, this.def);
                this.outputStream = outputStream;
                this.channel = seekableByteChannelNewByteChannel;
                this.streamCompressor = streamCompressorCreate;
                this.isSplitZip = false;
            }
        } catch (IOException unused2) {
            seekableByteChannelNewByteChannel = null;
        }
        this.outputStream = outputStream;
        this.channel = seekableByteChannelNewByteChannel;
        this.streamCompressor = streamCompressorCreate;
        this.isSplitZip = false;
    }

    public ZipArchiveOutputStream(File file, long j) throws IOException {
        this(file.toPath(), j);
    }

    public ZipArchiveOutputStream(Path path, long j) throws IOException {
        this.comment = "";
        this.level = -1;
        this.method = 8;
        this.entries = new LinkedList();
        this.metaData = new HashMap();
        this.encoding = "UTF8";
        this.zipEncoding = ZipEncodingHelper.getZipEncoding("UTF8");
        this.useUTF8Flag = true;
        this.createUnicodeExtraFields = UnicodeExtraFieldPolicy.NEVER;
        this.zip64Mode = Zip64Mode.AsNeeded;
        this.copyBuffer = new byte[32768];
        this.calendarInstance = Calendar.getInstance();
        this.numberOfCDInDiskData = new HashMap();
        Deflater deflater = new Deflater(this.level, true);
        this.def = deflater;
        ZipSplitOutputStream zipSplitOutputStream = new ZipSplitOutputStream(path, j);
        this.outputStream = zipSplitOutputStream;
        this.streamCompressor = StreamCompressor.create(zipSplitOutputStream, deflater);
        this.channel = null;
        this.isSplitZip = true;
    }

    public ZipArchiveOutputStream(SeekableByteChannel seekableByteChannel) {
        this.comment = "";
        this.level = -1;
        this.method = 8;
        this.entries = new LinkedList();
        this.metaData = new HashMap();
        this.encoding = "UTF8";
        this.zipEncoding = ZipEncodingHelper.getZipEncoding("UTF8");
        this.useUTF8Flag = true;
        this.createUnicodeExtraFields = UnicodeExtraFieldPolicy.NEVER;
        this.zip64Mode = Zip64Mode.AsNeeded;
        this.copyBuffer = new byte[32768];
        this.calendarInstance = Calendar.getInstance();
        this.numberOfCDInDiskData = new HashMap();
        this.channel = seekableByteChannel;
        Deflater deflater = new Deflater(this.level, true);
        this.def = deflater;
        this.streamCompressor = StreamCompressor.create(seekableByteChannel, deflater);
        this.outputStream = null;
        this.isSplitZip = false;
    }

    public boolean isSeekable() {
        return this.channel != null;
    }

    public void setEncoding(String str) {
        this.encoding = str;
        this.zipEncoding = ZipEncodingHelper.getZipEncoding(str);
        if (!this.useUTF8Flag || ZipEncodingHelper.isUTF8(str)) {
            return;
        }
        this.useUTF8Flag = false;
    }

    public String getEncoding() {
        return this.encoding;
    }

    public void setUseLanguageEncodingFlag(boolean z) {
        this.useUTF8Flag = z && ZipEncodingHelper.isUTF8(this.encoding);
    }

    public void setCreateUnicodeExtraFields(UnicodeExtraFieldPolicy unicodeExtraFieldPolicy) {
        this.createUnicodeExtraFields = unicodeExtraFieldPolicy;
    }

    public void setFallbackToUTF8(boolean z) {
        this.fallbackToUTF8 = z;
    }

    public void setUseZip64(Zip64Mode zip64Mode) {
        this.zip64Mode = zip64Mode;
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public long getBytesWritten() {
        return this.streamCompressor.getTotalBytesWritten();
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public void finish() throws IOException, IllegalArgumentException {
        if (this.finished) {
            throw new IOException("This archive has already been finished");
        }
        if (this.entry != null) {
            throw new IOException("This archive contains unclosed entries.");
        }
        long totalBytesWritten = this.streamCompressor.getTotalBytesWritten();
        this.cdOffset = totalBytesWritten;
        if (this.isSplitZip) {
            this.cdOffset = ((ZipSplitOutputStream) this.outputStream).getCurrentSplitSegmentBytesWritten();
            this.cdDiskNumberStart = r2.getCurrentSplitSegmentIndex();
        }
        writeCentralDirectoryInChunks();
        this.cdLength = this.streamCompressor.getTotalBytesWritten() - totalBytesWritten;
        ByteBuffer byteBufferEncode = this.zipEncoding.encode(this.comment);
        this.eocdLength = (byteBufferEncode.limit() - byteBufferEncode.position()) + 22;
        writeZip64CentralDirectory();
        writeCentralDirectoryEnd();
        this.metaData.clear();
        this.entries.clear();
        this.streamCompressor.close();
        if (this.isSplitZip) {
            this.outputStream.close();
        }
        this.finished = true;
    }

    public final void writeCentralDirectoryInChunks() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(70000);
        Iterator<ZipArchiveEntry> it = this.entries.iterator();
        while (true) {
            int i = 0;
            while (it.hasNext()) {
                byteArrayOutputStream.write(createCentralFileHeader(it.next()));
                i++;
                if (i > 1000) {
                    break;
                }
            }
            writeCounted(byteArrayOutputStream.toByteArray());
            return;
            writeCounted(byteArrayOutputStream.toByteArray());
            byteArrayOutputStream.reset();
        }
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public void closeArchiveEntry() throws IOException {
        preClose();
        flushDeflater();
        long totalBytesWritten = this.streamCompressor.getTotalBytesWritten() - this.entry.dataStart;
        long crc32 = this.streamCompressor.getCrc32();
        this.entry.bytesRead = this.streamCompressor.getBytesRead();
        closeEntry(handleSizesAndCrc(totalBytesWritten, crc32, getEffectiveZip64Mode(this.entry.entry)), false);
        this.streamCompressor.reset();
    }

    public final void closeCopiedEntry(boolean z) throws IOException {
        preClose();
        CurrentEntry currentEntry = this.entry;
        currentEntry.bytesRead = currentEntry.entry.getSize();
        closeEntry(checkIfNeedsZip64(getEffectiveZip64Mode(this.entry.entry)), z);
    }

    public final void closeEntry(boolean z, boolean z2) throws IOException {
        if (!z2 && this.channel != null) {
            rewriteSizesAndCrc(z);
        }
        if (!z2) {
            writeDataDescriptor(this.entry.entry);
        }
        this.entry = null;
    }

    public final void preClose() throws IOException {
        if (this.finished) {
            throw new IOException("Stream has already been finished");
        }
        CurrentEntry currentEntry = this.entry;
        if (currentEntry == null) {
            throw new IOException("No current entry to close");
        }
        if (currentEntry.hasWritten) {
            return;
        }
        write(ByteUtils.EMPTY_BYTE_ARRAY, 0, 0);
    }

    public void addRawArchiveEntry(ZipArchiveEntry zipArchiveEntry, InputStream inputStream) throws IOException {
        ZipArchiveEntry zipArchiveEntry2 = new ZipArchiveEntry(zipArchiveEntry);
        if (hasZip64Extra(zipArchiveEntry2)) {
            zipArchiveEntry2.removeExtraField(Zip64ExtendedInformationExtraField.HEADER_ID);
        }
        boolean z = (zipArchiveEntry2.getCrc() == -1 || zipArchiveEntry2.getSize() == -1 || zipArchiveEntry2.getCompressedSize() == -1) ? false : true;
        putArchiveEntry(zipArchiveEntry2, z);
        copyFromZipInputStream(inputStream);
        closeCopiedEntry(z);
    }

    public final void flushDeflater() throws IOException {
        if (this.entry.entry.getMethod() == 8) {
            this.streamCompressor.flushDeflater();
        }
    }

    public final boolean handleSizesAndCrc(long j, long j2, Zip64Mode zip64Mode) throws ZipException {
        if (this.entry.entry.getMethod() != 8) {
            if (this.channel != null) {
                this.entry.entry.setSize(j);
                this.entry.entry.setCompressedSize(j);
                this.entry.entry.setCrc(j2);
            } else {
                if (this.entry.entry.getCrc() != j2) {
                    throw new ZipException("Bad CRC checksum for entry " + this.entry.entry.getName() + ": " + Long.toHexString(this.entry.entry.getCrc()) + " instead of " + Long.toHexString(j2));
                }
                if (this.entry.entry.getSize() != j) {
                    throw new ZipException("Bad size for entry " + this.entry.entry.getName() + ": " + this.entry.entry.getSize() + " instead of " + j);
                }
            }
        } else {
            this.entry.entry.setSize(this.entry.bytesRead);
            this.entry.entry.setCompressedSize(j);
            this.entry.entry.setCrc(j2);
        }
        return checkIfNeedsZip64(zip64Mode);
    }

    public final boolean checkIfNeedsZip64(Zip64Mode zip64Mode) throws ZipException {
        boolean zIsZip64Required = isZip64Required(this.entry.entry, zip64Mode);
        if (zIsZip64Required && zip64Mode == Zip64Mode.Never) {
            throw new Zip64RequiredException(Zip64RequiredException.getEntryTooBigMessage(this.entry.entry));
        }
        return zIsZip64Required;
    }

    public final boolean isZip64Required(ZipArchiveEntry zipArchiveEntry, Zip64Mode zip64Mode) {
        return zip64Mode == Zip64Mode.Always || zip64Mode == Zip64Mode.AlwaysWithCompatibility || isTooLargeForZip32(zipArchiveEntry);
    }

    public final boolean isTooLargeForZip32(ZipArchiveEntry zipArchiveEntry) {
        return zipArchiveEntry.getSize() >= 4294967295L || zipArchiveEntry.getCompressedSize() >= 4294967295L;
    }

    public final void rewriteSizesAndCrc(boolean z) throws IOException {
        long jPosition = this.channel.position();
        this.channel.position(this.entry.localDataStart);
        writeOut(ZipLong.getBytes(this.entry.entry.getCrc()));
        if (hasZip64Extra(this.entry.entry) && z) {
            ZipLong zipLong = ZipLong.ZIP64_MAGIC;
            writeOut(zipLong.getBytes());
            writeOut(zipLong.getBytes());
        } else {
            writeOut(ZipLong.getBytes(this.entry.entry.getCompressedSize()));
            writeOut(ZipLong.getBytes(this.entry.entry.getSize()));
        }
        if (hasZip64Extra(this.entry.entry)) {
            ByteBuffer name = getName(this.entry.entry);
            this.channel.position(this.entry.localDataStart + 16 + (name.limit() - name.position()) + 4);
            writeOut(ZipEightByteInteger.getBytes(this.entry.entry.getSize()));
            writeOut(ZipEightByteInteger.getBytes(this.entry.entry.getCompressedSize()));
            if (!z) {
                this.channel.position(this.entry.localDataStart - 10);
                writeOut(ZipShort.getBytes(versionNeededToExtract(this.entry.entry.getMethod(), false, false)));
                this.entry.entry.removeExtraField(Zip64ExtendedInformationExtraField.HEADER_ID);
                this.entry.entry.setExtra();
                if (this.entry.causedUseOfZip64) {
                    this.hasUsedZip64 = false;
                }
            }
        }
        this.channel.position(jPosition);
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public void putArchiveEntry(ArchiveEntry archiveEntry) throws IOException {
        putArchiveEntry(archiveEntry, false);
    }

    public final void putArchiveEntry(ArchiveEntry archiveEntry, boolean z) throws IOException {
        ZipEightByteInteger zipEightByteInteger;
        ZipEightByteInteger zipEightByteInteger2;
        if (this.finished) {
            throw new IOException("Stream has already been finished");
        }
        if (this.entry != null) {
            closeArchiveEntry();
        }
        ZipArchiveEntry zipArchiveEntry = (ZipArchiveEntry) archiveEntry;
        CurrentEntry currentEntry = new CurrentEntry(zipArchiveEntry);
        this.entry = currentEntry;
        this.entries.add(currentEntry.entry);
        setDefaults(this.entry.entry);
        Zip64Mode effectiveZip64Mode = getEffectiveZip64Mode(this.entry.entry);
        validateSizeInformation(effectiveZip64Mode);
        if (shouldAddZip64Extra(this.entry.entry, effectiveZip64Mode)) {
            Zip64ExtendedInformationExtraField zip64Extra = getZip64Extra(this.entry.entry);
            if (z) {
                zipEightByteInteger = new ZipEightByteInteger(this.entry.entry.getSize());
                zipEightByteInteger2 = new ZipEightByteInteger(this.entry.entry.getCompressedSize());
            } else {
                if (this.entry.entry.getMethod() == 0 && this.entry.entry.getSize() != -1) {
                    zipEightByteInteger = new ZipEightByteInteger(this.entry.entry.getSize());
                } else {
                    zipEightByteInteger = ZipEightByteInteger.ZERO;
                }
                zipEightByteInteger2 = zipEightByteInteger;
            }
            zip64Extra.setSize(zipEightByteInteger);
            zip64Extra.setCompressedSize(zipEightByteInteger2);
            this.entry.entry.setExtra();
        }
        if (this.entry.entry.getMethod() == 8 && this.hasCompressionLevelChanged) {
            this.def.setLevel(this.level);
            this.hasCompressionLevelChanged = false;
        }
        writeLocalFileHeader(zipArchiveEntry, z);
    }

    public final void setDefaults(ZipArchiveEntry zipArchiveEntry) {
        if (zipArchiveEntry.getMethod() == -1) {
            zipArchiveEntry.setMethod(this.method);
        }
        if (zipArchiveEntry.getTime() == -1) {
            zipArchiveEntry.setTime(System.currentTimeMillis());
        }
    }

    public final void validateSizeInformation(Zip64Mode zip64Mode) throws ZipException {
        if (this.entry.entry.getMethod() == 0 && this.channel == null) {
            if (this.entry.entry.getSize() == -1) {
                throw new ZipException("Uncompressed size is required for STORED method when not writing to a file");
            }
            if (this.entry.entry.getCrc() == -1) {
                throw new ZipException("CRC checksum is required for STORED method when not writing to a file");
            }
            this.entry.entry.setCompressedSize(this.entry.entry.getSize());
        }
        if ((this.entry.entry.getSize() >= 4294967295L || this.entry.entry.getCompressedSize() >= 4294967295L) && zip64Mode == Zip64Mode.Never) {
            throw new Zip64RequiredException(Zip64RequiredException.getEntryTooBigMessage(this.entry.entry));
        }
    }

    public final boolean shouldAddZip64Extra(ZipArchiveEntry zipArchiveEntry, Zip64Mode zip64Mode) {
        return zip64Mode == Zip64Mode.Always || zip64Mode == Zip64Mode.AlwaysWithCompatibility || zipArchiveEntry.getSize() >= 4294967295L || zipArchiveEntry.getCompressedSize() >= 4294967295L || !(zipArchiveEntry.getSize() != -1 || this.channel == null || zip64Mode == Zip64Mode.Never);
    }

    public void setComment(String str) {
        this.comment = str;
    }

    public void setLevel(int i) {
        if (i < -1 || i > 9) {
            throw new IllegalArgumentException("Invalid compression level: " + i);
        }
        if (this.level == i) {
            return;
        }
        this.hasCompressionLevelChanged = true;
        this.level = i;
    }

    public void setMethod(int i) {
        this.method = i;
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public boolean canWriteEntryData(ArchiveEntry archiveEntry) {
        if (!(archiveEntry instanceof ZipArchiveEntry)) {
            return false;
        }
        ZipArchiveEntry zipArchiveEntry = (ZipArchiveEntry) archiveEntry;
        return (zipArchiveEntry.getMethod() == ZipMethod.IMPLODING.getCode() || zipArchiveEntry.getMethod() == ZipMethod.UNSHRINKING.getCode() || !ZipUtil.canHandleEntryData(zipArchiveEntry)) ? false : true;
    }

    public void writePreamble(byte[] bArr) throws IOException {
        writePreamble(bArr, 0, bArr.length);
    }

    public void writePreamble(byte[] bArr, int i, int i2) throws IOException {
        if (this.entry != null) {
            throw new IllegalStateException("Preamble must be written before creating an entry");
        }
        this.streamCompressor.writeCounted(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        CurrentEntry currentEntry = this.entry;
        if (currentEntry == null) {
            throw new IllegalStateException("No current entry");
        }
        ZipUtil.checkRequestedFeatures(currentEntry.entry);
        count(this.streamCompressor.write(bArr, i, i2, this.entry.entry.getMethod()));
    }

    public final void writeCounted(byte[] bArr) throws IOException {
        this.streamCompressor.writeCounted(bArr);
    }

    public final void copyFromZipInputStream(InputStream inputStream) throws IOException {
        CurrentEntry currentEntry = this.entry;
        if (currentEntry == null) {
            throw new IllegalStateException("No current entry");
        }
        ZipUtil.checkRequestedFeatures(currentEntry.entry);
        this.entry.hasWritten = true;
        while (true) {
            int i = inputStream.read(this.copyBuffer);
            if (i < 0) {
                return;
            }
            this.streamCompressor.writeCounted(this.copyBuffer, 0, i);
            count(i);
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            if (!this.finished) {
                finish();
            }
        } finally {
            destroy();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        OutputStream outputStream = this.outputStream;
        if (outputStream != null) {
            outputStream.flush();
        }
    }

    public final void deflate() throws IOException {
        this.streamCompressor.deflate();
    }

    public void writeLocalFileHeader(ZipArchiveEntry zipArchiveEntry) throws IOException {
        writeLocalFileHeader(zipArchiveEntry, false);
    }

    public final void writeLocalFileHeader(ZipArchiveEntry zipArchiveEntry, boolean z) throws IOException {
        boolean zCanEncode = this.zipEncoding.canEncode(zipArchiveEntry.getName());
        ByteBuffer name = getName(zipArchiveEntry);
        if (this.createUnicodeExtraFields != UnicodeExtraFieldPolicy.NEVER) {
            addUnicodeExtraFields(zipArchiveEntry, zCanEncode, name);
        }
        long totalBytesWritten = this.streamCompressor.getTotalBytesWritten();
        if (this.isSplitZip) {
            ZipSplitOutputStream zipSplitOutputStream = (ZipSplitOutputStream) this.outputStream;
            zipArchiveEntry.setDiskNumberStart(zipSplitOutputStream.getCurrentSplitSegmentIndex());
            totalBytesWritten = zipSplitOutputStream.getCurrentSplitSegmentBytesWritten();
        }
        byte[] bArrCreateLocalFileHeader = createLocalFileHeader(zipArchiveEntry, name, zCanEncode, z, totalBytesWritten);
        this.metaData.put(zipArchiveEntry, new EntryMetaData(totalBytesWritten, usesDataDescriptor(zipArchiveEntry.getMethod(), z)));
        this.entry.localDataStart = totalBytesWritten + 14;
        writeCounted(bArrCreateLocalFileHeader);
        this.entry.dataStart = this.streamCompressor.getTotalBytesWritten();
    }

    public final byte[] createLocalFileHeader(ZipArchiveEntry zipArchiveEntry, ByteBuffer byteBuffer, boolean z, boolean z2, long j) {
        ZipShort zipShort = ResourceAlignmentExtraField.f9836ID;
        ZipExtraField extraField = zipArchiveEntry.getExtraField(zipShort);
        if (extraField != null) {
            zipArchiveEntry.removeExtraField(zipShort);
        }
        ResourceAlignmentExtraField resourceAlignmentExtraField = extraField instanceof ResourceAlignmentExtraField ? (ResourceAlignmentExtraField) extraField : null;
        int alignment = zipArchiveEntry.getAlignment();
        if (alignment <= 0 && resourceAlignmentExtraField != null) {
            alignment = resourceAlignmentExtraField.getAlignment();
        }
        if (alignment > 1 || (resourceAlignmentExtraField != null && !resourceAlignmentExtraField.allowMethodChange())) {
            zipArchiveEntry.addExtraField(new ResourceAlignmentExtraField(alignment, resourceAlignmentExtraField != null && resourceAlignmentExtraField.allowMethodChange(), (int) ((((-j) - (((byteBuffer.limit() + 30) - byteBuffer.position()) + zipArchiveEntry.getLocalFileDataExtra().length)) - 6) & (alignment - 1))));
        }
        byte[] localFileDataExtra = zipArchiveEntry.getLocalFileDataExtra();
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        int i = iLimit + 30;
        byte[] bArr = new byte[localFileDataExtra.length + i];
        System.arraycopy(LFH_SIG, 0, bArr, 0, 4);
        int method = zipArchiveEntry.getMethod();
        boolean zUsesDataDescriptor = usesDataDescriptor(method, z2);
        ZipShort.putShort(versionNeededToExtract(method, hasZip64Extra(zipArchiveEntry), zUsesDataDescriptor), bArr, 4);
        getGeneralPurposeBits(!z && this.fallbackToUTF8, zUsesDataDescriptor).encode(bArr, 6);
        ZipShort.putShort(method, bArr, 8);
        ZipUtil.toDosTime(this.calendarInstance, zipArchiveEntry.getTime(), bArr, 10);
        if (z2 || (method != 8 && this.channel == null)) {
            ZipLong.putLong(zipArchiveEntry.getCrc(), bArr, 14);
        } else {
            System.arraycopy(LZERO, 0, bArr, 14, 4);
        }
        if (hasZip64Extra(this.entry.entry)) {
            ZipLong zipLong = ZipLong.ZIP64_MAGIC;
            zipLong.putLong(bArr, 18);
            zipLong.putLong(bArr, 22);
        } else if (z2) {
            ZipLong.putLong(zipArchiveEntry.getCompressedSize(), bArr, 18);
            ZipLong.putLong(zipArchiveEntry.getSize(), bArr, 22);
        } else if (method == 8 || this.channel != null) {
            byte[] bArr2 = LZERO;
            System.arraycopy(bArr2, 0, bArr, 18, 4);
            System.arraycopy(bArr2, 0, bArr, 22, 4);
        } else {
            ZipLong.putLong(zipArchiveEntry.getSize(), bArr, 18);
            ZipLong.putLong(zipArchiveEntry.getSize(), bArr, 22);
        }
        ZipShort.putShort(iLimit, bArr, 26);
        ZipShort.putShort(localFileDataExtra.length, bArr, 28);
        System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset(), bArr, 30, iLimit);
        System.arraycopy(localFileDataExtra, 0, bArr, i, localFileDataExtra.length);
        return bArr;
    }

    public final void addUnicodeExtraFields(ZipArchiveEntry zipArchiveEntry, boolean z, ByteBuffer byteBuffer) throws IOException {
        UnicodeExtraFieldPolicy unicodeExtraFieldPolicy = this.createUnicodeExtraFields;
        UnicodeExtraFieldPolicy unicodeExtraFieldPolicy2 = UnicodeExtraFieldPolicy.ALWAYS;
        if (unicodeExtraFieldPolicy == unicodeExtraFieldPolicy2 || !z) {
            zipArchiveEntry.addExtraField(new UnicodePathExtraField(zipArchiveEntry.getName(), byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit() - byteBuffer.position()));
        }
        String comment = zipArchiveEntry.getComment();
        if (comment == null || comment.isEmpty()) {
            return;
        }
        boolean zCanEncode = this.zipEncoding.canEncode(comment);
        if (this.createUnicodeExtraFields == unicodeExtraFieldPolicy2 || !zCanEncode) {
            ByteBuffer byteBufferEncode = getEntryEncoding(zipArchiveEntry).encode(comment);
            zipArchiveEntry.addExtraField(new UnicodeCommentExtraField(comment, byteBufferEncode.array(), byteBufferEncode.arrayOffset(), byteBufferEncode.limit() - byteBufferEncode.position()));
        }
    }

    public void writeDataDescriptor(ZipArchiveEntry zipArchiveEntry) throws IOException {
        if (usesDataDescriptor(zipArchiveEntry.getMethod(), false)) {
            writeCounted(DD_SIG);
            writeCounted(ZipLong.getBytes(zipArchiveEntry.getCrc()));
            if (!hasZip64Extra(zipArchiveEntry)) {
                writeCounted(ZipLong.getBytes(zipArchiveEntry.getCompressedSize()));
                writeCounted(ZipLong.getBytes(zipArchiveEntry.getSize()));
            } else {
                writeCounted(ZipEightByteInteger.getBytes(zipArchiveEntry.getCompressedSize()));
                writeCounted(ZipEightByteInteger.getBytes(zipArchiveEntry.getSize()));
            }
        }
    }

    public void writeCentralFileHeader(ZipArchiveEntry zipArchiveEntry) throws IOException {
        writeCounted(createCentralFileHeader(zipArchiveEntry));
    }

    public final byte[] createCentralFileHeader(ZipArchiveEntry zipArchiveEntry) throws IOException {
        Zip64Mode zip64Mode;
        EntryMetaData entryMetaData = this.metaData.get(zipArchiveEntry);
        boolean z = hasZip64Extra(zipArchiveEntry) || zipArchiveEntry.getCompressedSize() >= 4294967295L || zipArchiveEntry.getSize() >= 4294967295L || entryMetaData.offset >= 4294967295L || zipArchiveEntry.getDiskNumberStart() >= WebSocketProtocol.PAYLOAD_SHORT_MAX || (zip64Mode = this.zip64Mode) == Zip64Mode.Always || zip64Mode == Zip64Mode.AlwaysWithCompatibility;
        if (z && this.zip64Mode == Zip64Mode.Never) {
            throw new Zip64RequiredException(Zip64RequiredException.ARCHIVE_TOO_BIG_MESSAGE);
        }
        handleZip64Extra(zipArchiveEntry, entryMetaData.offset, z);
        return createCentralFileHeader(zipArchiveEntry, getName(zipArchiveEntry), entryMetaData, z);
    }

    public final byte[] createCentralFileHeader(ZipArchiveEntry zipArchiveEntry, ByteBuffer byteBuffer, EntryMetaData entryMetaData, boolean z) throws IOException {
        Zip64Mode zip64Mode;
        if (this.isSplitZip) {
            int currentSplitSegmentIndex = ((ZipSplitOutputStream) this.outputStream).getCurrentSplitSegmentIndex();
            if (this.numberOfCDInDiskData.get(Integer.valueOf(currentSplitSegmentIndex)) == null) {
                this.numberOfCDInDiskData.put(Integer.valueOf(currentSplitSegmentIndex), 1);
            } else {
                this.numberOfCDInDiskData.put(Integer.valueOf(currentSplitSegmentIndex), Integer.valueOf(this.numberOfCDInDiskData.get(Integer.valueOf(currentSplitSegmentIndex)).intValue() + 1));
            }
        }
        byte[] centralDirectoryExtra = zipArchiveEntry.getCentralDirectoryExtra();
        int length = centralDirectoryExtra.length;
        String comment = zipArchiveEntry.getComment();
        if (comment == null) {
            comment = "";
        }
        ByteBuffer byteBufferEncode = getEntryEncoding(zipArchiveEntry).encode(comment);
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        int iLimit2 = byteBufferEncode.limit() - byteBufferEncode.position();
        int i = iLimit + 46;
        int i2 = i + length;
        byte[] bArr = new byte[i2 + iLimit2];
        System.arraycopy(CFH_SIG, 0, bArr, 0, 4);
        ZipShort.putShort((zipArchiveEntry.getPlatform() << 8) | (!this.hasUsedZip64 ? 20 : 45), bArr, 4);
        int method = zipArchiveEntry.getMethod();
        boolean zCanEncode = this.zipEncoding.canEncode(zipArchiveEntry.getName());
        ZipShort.putShort(versionNeededToExtract(method, z, entryMetaData.usesDataDescriptor), bArr, 6);
        getGeneralPurposeBits(!zCanEncode && this.fallbackToUTF8, entryMetaData.usesDataDescriptor).encode(bArr, 8);
        ZipShort.putShort(method, bArr, 10);
        ZipUtil.toDosTime(this.calendarInstance, zipArchiveEntry.getTime(), bArr, 12);
        ZipLong.putLong(zipArchiveEntry.getCrc(), bArr, 16);
        if (zipArchiveEntry.getCompressedSize() >= 4294967295L || zipArchiveEntry.getSize() >= 4294967295L || (zip64Mode = this.zip64Mode) == Zip64Mode.Always || zip64Mode == Zip64Mode.AlwaysWithCompatibility) {
            ZipLong zipLong = ZipLong.ZIP64_MAGIC;
            zipLong.putLong(bArr, 20);
            zipLong.putLong(bArr, 24);
        } else {
            ZipLong.putLong(zipArchiveEntry.getCompressedSize(), bArr, 20);
            ZipLong.putLong(zipArchiveEntry.getSize(), bArr, 24);
        }
        ZipShort.putShort(iLimit, bArr, 28);
        ZipShort.putShort(length, bArr, 30);
        ZipShort.putShort(iLimit2, bArr, 32);
        if (!this.isSplitZip) {
            System.arraycopy(ZERO, 0, bArr, 34, 2);
        } else if (zipArchiveEntry.getDiskNumberStart() >= WebSocketProtocol.PAYLOAD_SHORT_MAX || this.zip64Mode == Zip64Mode.Always) {
            ZipShort.putShort(65535, bArr, 34);
        } else {
            ZipShort.putShort((int) zipArchiveEntry.getDiskNumberStart(), bArr, 34);
        }
        ZipShort.putShort(zipArchiveEntry.getInternalAttributes(), bArr, 36);
        ZipLong.putLong(zipArchiveEntry.getExternalAttributes(), bArr, 38);
        if (entryMetaData.offset >= 4294967295L || this.zip64Mode == Zip64Mode.Always) {
            ZipLong.putLong(4294967295L, bArr, 42);
        } else {
            ZipLong.putLong(Math.min(entryMetaData.offset, 4294967295L), bArr, 42);
        }
        System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset(), bArr, 46, iLimit);
        System.arraycopy(centralDirectoryExtra, 0, bArr, i, length);
        System.arraycopy(byteBufferEncode.array(), byteBufferEncode.arrayOffset(), bArr, i2, iLimit2);
        return bArr;
    }

    public final void handleZip64Extra(ZipArchiveEntry zipArchiveEntry, long j, boolean z) {
        Zip64Mode zip64Mode;
        if (z) {
            Zip64ExtendedInformationExtraField zip64Extra = getZip64Extra(zipArchiveEntry);
            if (zipArchiveEntry.getCompressedSize() >= 4294967295L || zipArchiveEntry.getSize() >= 4294967295L || (zip64Mode = this.zip64Mode) == Zip64Mode.Always || zip64Mode == Zip64Mode.AlwaysWithCompatibility) {
                zip64Extra.setCompressedSize(new ZipEightByteInteger(zipArchiveEntry.getCompressedSize()));
                zip64Extra.setSize(new ZipEightByteInteger(zipArchiveEntry.getSize()));
            } else {
                zip64Extra.setCompressedSize(null);
                zip64Extra.setSize(null);
            }
            boolean z2 = true;
            boolean z3 = j >= 4294967295L || this.zip64Mode == Zip64Mode.Always;
            if (zipArchiveEntry.getDiskNumberStart() < WebSocketProtocol.PAYLOAD_SHORT_MAX && this.zip64Mode != Zip64Mode.Always) {
                z2 = false;
            }
            if (z3 || z2) {
                zip64Extra.setRelativeHeaderOffset(new ZipEightByteInteger(j));
            }
            if (z2) {
                zip64Extra.setDiskStartNumber(new ZipLong(zipArchiveEntry.getDiskNumberStart()));
            }
            zipArchiveEntry.setExtra();
        }
    }

    public void writeCentralDirectoryEnd() throws IOException, IllegalArgumentException {
        if (!this.hasUsedZip64 && this.isSplitZip) {
            ((ZipSplitOutputStream) this.outputStream).prepareToWriteUnsplittableContent(this.eocdLength);
        }
        validateIfZip64IsNeededInEOCD();
        writeCounted(EOCD_SIG);
        int iIntValue = 0;
        int currentSplitSegmentIndex = this.isSplitZip ? ((ZipSplitOutputStream) this.outputStream).getCurrentSplitSegmentIndex() : 0;
        writeCounted(ZipShort.getBytes(currentSplitSegmentIndex));
        writeCounted(ZipShort.getBytes((int) this.cdDiskNumberStart));
        int size = this.entries.size();
        if (!this.isSplitZip) {
            iIntValue = size;
        } else if (this.numberOfCDInDiskData.get(Integer.valueOf(currentSplitSegmentIndex)) != null) {
            iIntValue = this.numberOfCDInDiskData.get(Integer.valueOf(currentSplitSegmentIndex)).intValue();
        }
        writeCounted(ZipShort.getBytes(Math.min(iIntValue, 65535)));
        writeCounted(ZipShort.getBytes(Math.min(size, 65535)));
        writeCounted(ZipLong.getBytes(Math.min(this.cdLength, 4294967295L)));
        writeCounted(ZipLong.getBytes(Math.min(this.cdOffset, 4294967295L)));
        ByteBuffer byteBufferEncode = this.zipEncoding.encode(this.comment);
        int iLimit = byteBufferEncode.limit() - byteBufferEncode.position();
        writeCounted(ZipShort.getBytes(iLimit));
        this.streamCompressor.writeCounted(byteBufferEncode.array(), byteBufferEncode.arrayOffset(), iLimit);
    }

    public final void validateIfZip64IsNeededInEOCD() throws Zip64RequiredException {
        if (this.zip64Mode != Zip64Mode.Never) {
            return;
        }
        int currentSplitSegmentIndex = this.isSplitZip ? ((ZipSplitOutputStream) this.outputStream).getCurrentSplitSegmentIndex() : 0;
        if (currentSplitSegmentIndex >= 65535) {
            throw new Zip64RequiredException(Zip64RequiredException.NUMBER_OF_THIS_DISK_TOO_BIG_MESSAGE);
        }
        if (this.cdDiskNumberStart >= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            throw new Zip64RequiredException(Zip64RequiredException.NUMBER_OF_THE_DISK_OF_CENTRAL_DIRECTORY_TOO_BIG_MESSAGE);
        }
        if ((this.numberOfCDInDiskData.get(Integer.valueOf(currentSplitSegmentIndex)) != null ? this.numberOfCDInDiskData.get(Integer.valueOf(currentSplitSegmentIndex)).intValue() : 0) >= 65535) {
            throw new Zip64RequiredException(Zip64RequiredException.TOO_MANY_ENTRIES_ON_THIS_DISK_MESSAGE);
        }
        if (this.entries.size() >= 65535) {
            throw new Zip64RequiredException(Zip64RequiredException.TOO_MANY_ENTRIES_MESSAGE);
        }
        if (this.cdLength >= 4294967295L) {
            throw new Zip64RequiredException(Zip64RequiredException.SIZE_OF_CENTRAL_DIRECTORY_TOO_BIG_MESSAGE);
        }
        if (this.cdOffset >= 4294967295L) {
            throw new Zip64RequiredException(Zip64RequiredException.ARCHIVE_TOO_BIG_MESSAGE);
        }
    }

    public void writeZip64CentralDirectory() throws IOException, IllegalArgumentException {
        long currentSplitSegmentIndex;
        if (this.zip64Mode == Zip64Mode.Never) {
            return;
        }
        if (!this.hasUsedZip64 && shouldUseZip64EOCD()) {
            this.hasUsedZip64 = true;
        }
        if (this.hasUsedZip64) {
            long totalBytesWritten = this.streamCompressor.getTotalBytesWritten();
            if (this.isSplitZip) {
                ZipSplitOutputStream zipSplitOutputStream = (ZipSplitOutputStream) this.outputStream;
                totalBytesWritten = zipSplitOutputStream.getCurrentSplitSegmentBytesWritten();
                currentSplitSegmentIndex = zipSplitOutputStream.getCurrentSplitSegmentIndex();
            } else {
                currentSplitSegmentIndex = 0;
            }
            writeOut(ZIP64_EOCD_SIG);
            writeOut(ZipEightByteInteger.getBytes(44L));
            writeOut(ZipShort.getBytes(45));
            writeOut(ZipShort.getBytes(45));
            int size = 0;
            int currentSplitSegmentIndex2 = this.isSplitZip ? ((ZipSplitOutputStream) this.outputStream).getCurrentSplitSegmentIndex() : 0;
            writeOut(ZipLong.getBytes(currentSplitSegmentIndex2));
            writeOut(ZipLong.getBytes(this.cdDiskNumberStart));
            if (this.isSplitZip) {
                if (this.numberOfCDInDiskData.get(Integer.valueOf(currentSplitSegmentIndex2)) != null) {
                    size = this.numberOfCDInDiskData.get(Integer.valueOf(currentSplitSegmentIndex2)).intValue();
                }
            } else {
                size = this.entries.size();
            }
            writeOut(ZipEightByteInteger.getBytes(size));
            writeOut(ZipEightByteInteger.getBytes(this.entries.size()));
            writeOut(ZipEightByteInteger.getBytes(this.cdLength));
            writeOut(ZipEightByteInteger.getBytes(this.cdOffset));
            if (this.isSplitZip) {
                ((ZipSplitOutputStream) this.outputStream).prepareToWriteUnsplittableContent(this.eocdLength + 20);
            }
            writeOut(ZIP64_EOCD_LOC_SIG);
            writeOut(ZipLong.getBytes(currentSplitSegmentIndex));
            writeOut(ZipEightByteInteger.getBytes(totalBytesWritten));
            if (this.isSplitZip) {
                writeOut(ZipLong.getBytes(((ZipSplitOutputStream) this.outputStream).getCurrentSplitSegmentIndex() + 1));
            } else {
                writeOut(ONE);
            }
        }
    }

    public final boolean shouldUseZip64EOCD() {
        int currentSplitSegmentIndex = this.isSplitZip ? ((ZipSplitOutputStream) this.outputStream).getCurrentSplitSegmentIndex() : 0;
        return currentSplitSegmentIndex >= 65535 || this.cdDiskNumberStart >= WebSocketProtocol.PAYLOAD_SHORT_MAX || (this.numberOfCDInDiskData.get(Integer.valueOf(currentSplitSegmentIndex)) == null ? 0 : this.numberOfCDInDiskData.get(Integer.valueOf(currentSplitSegmentIndex)).intValue()) >= 65535 || this.entries.size() >= 65535 || this.cdLength >= 4294967295L || this.cdOffset >= 4294967295L;
    }

    public final void writeOut(byte[] bArr) throws IOException {
        this.streamCompressor.writeOut(bArr, 0, bArr.length);
    }

    public final void writeOut(byte[] bArr, int i, int i2) throws IOException {
        this.streamCompressor.writeOut(bArr, i, i2);
    }

    public final GeneralPurposeBit getGeneralPurposeBits(boolean z, boolean z2) {
        GeneralPurposeBit generalPurposeBit = new GeneralPurposeBit();
        generalPurposeBit.useUTF8ForNames(this.useUTF8Flag || z);
        if (z2) {
            generalPurposeBit.useDataDescriptor(true);
        }
        return generalPurposeBit;
    }

    public final int versionNeededToExtract(int i, boolean z, boolean z2) {
        if (z) {
            return 45;
        }
        if (z2) {
            return 20;
        }
        return versionNeededToExtractMethod(i);
    }

    public final boolean usesDataDescriptor(int i, boolean z) {
        return !z && i == 8 && this.channel == null;
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public ArchiveEntry createArchiveEntry(File file, String str) throws IOException {
        if (this.finished) {
            throw new IOException("Stream has already been finished");
        }
        return new ZipArchiveEntry(file, str);
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public ArchiveEntry createArchiveEntry(Path path, String str, LinkOption... linkOptionArr) throws IOException {
        if (this.finished) {
            throw new IOException("Stream has already been finished");
        }
        return new ZipArchiveEntry(path, str, new LinkOption[0]);
    }

    public final Zip64ExtendedInformationExtraField getZip64Extra(ZipArchiveEntry zipArchiveEntry) {
        CurrentEntry currentEntry = this.entry;
        if (currentEntry != null) {
            currentEntry.causedUseOfZip64 = !this.hasUsedZip64;
        }
        this.hasUsedZip64 = true;
        ZipExtraField extraField = zipArchiveEntry.getExtraField(Zip64ExtendedInformationExtraField.HEADER_ID);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = extraField instanceof Zip64ExtendedInformationExtraField ? (Zip64ExtendedInformationExtraField) extraField : null;
        if (zip64ExtendedInformationExtraField == null) {
            zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        }
        zipArchiveEntry.addAsFirstExtraField(zip64ExtendedInformationExtraField);
        return zip64ExtendedInformationExtraField;
    }

    public final boolean hasZip64Extra(ZipArchiveEntry zipArchiveEntry) {
        return zipArchiveEntry.getExtraField(Zip64ExtendedInformationExtraField.HEADER_ID) instanceof Zip64ExtendedInformationExtraField;
    }

    public final Zip64Mode getEffectiveZip64Mode(ZipArchiveEntry zipArchiveEntry) {
        if (this.zip64Mode != Zip64Mode.AsNeeded || this.channel != null || zipArchiveEntry.getMethod() != 8 || zipArchiveEntry.getSize() != -1) {
            return this.zip64Mode;
        }
        return Zip64Mode.Never;
    }

    public final ZipEncoding getEntryEncoding(ZipArchiveEntry zipArchiveEntry) {
        return (this.zipEncoding.canEncode(zipArchiveEntry.getName()) || !this.fallbackToUTF8) ? this.zipEncoding : ZipEncodingHelper.UTF8_ZIP_ENCODING;
    }

    public final ByteBuffer getName(ZipArchiveEntry zipArchiveEntry) throws IOException {
        return getEntryEncoding(zipArchiveEntry).encode(zipArchiveEntry.getName());
    }

    public void destroy() throws IOException {
        try {
            SeekableByteChannel seekableByteChannel = this.channel;
            if (seekableByteChannel != null) {
                seekableByteChannel.close();
            }
        } finally {
            OutputStream outputStream = this.outputStream;
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class UnicodeExtraFieldPolicy {
        public static final UnicodeExtraFieldPolicy ALWAYS = new UnicodeExtraFieldPolicy(RetrieveOptions.OVERWRITEMODE_ALWAYS);
        public static final UnicodeExtraFieldPolicy NEVER = new UnicodeExtraFieldPolicy(RetrieveOptions.OVERWRITEMODE_NEVER);
        public static final UnicodeExtraFieldPolicy NOT_ENCODEABLE = new UnicodeExtraFieldPolicy("not encodeable");
        public final String name;

        public UnicodeExtraFieldPolicy(String str) {
            this.name = str;
        }

        public String toString() {
            return this.name;
        }
    }

    /* loaded from: classes5.dex */
    public static final class CurrentEntry {
        public long bytesRead;
        public boolean causedUseOfZip64;
        public long dataStart;
        public final ZipArchiveEntry entry;
        public boolean hasWritten;
        public long localDataStart;

        public /* synthetic */ CurrentEntry(ZipArchiveEntry zipArchiveEntry, C110341 c110341) {
            this(zipArchiveEntry);
        }

        public CurrentEntry(ZipArchiveEntry zipArchiveEntry) {
            this.entry = zipArchiveEntry;
        }
    }

    /* loaded from: classes5.dex */
    public static final class EntryMetaData {
        public final long offset;
        public final boolean usesDataDescriptor;

        public /* synthetic */ EntryMetaData(long j, boolean z, C110341 c110341) {
            this(j, z);
        }

        public EntryMetaData(long j, boolean z) {
            this.offset = j;
            this.usesDataDescriptor = z;
        }
    }
}
