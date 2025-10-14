package org.apache.commons.compress.archivers.zip;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream;
import org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream;
import org.apache.commons.compress.utils.ArchiveUtils;
import org.apache.commons.compress.utils.IOUtils;
import org.apache.commons.compress.utils.InputStreamStatistics;

/* loaded from: classes6.dex */
public class ZipArchiveInputStream extends ArchiveInputStream implements InputStreamStatistics {
    public static final int CFH_LEN = 46;
    public static final int LFH_LEN = 30;
    public static final long TWO_EXP_32 = 4294967296L;
    public static final String USE_ZIPFILE_INSTEAD_OF_STREAM_DISCLAIMER = " while reading a stored entry using data descriptor. Either the archive is broken or it can not be read using ZipArchiveInputStream and you must use ZipFile. A common cause for this is a ZIP archive containing a ZIP archive. See http://commons.apache.org/proper/commons-compress/zip.html#ZipArchiveInputStream_vs_ZipFile";
    public final boolean allowStoredEntriesWithDataDescriptor;
    public final ByteBuffer buf;
    public boolean closed;
    public CurrentEntry current;
    public final String encoding;
    public int entriesRead;
    public boolean hitCentralDirectory;
    public final Inflater inf;
    public final InputStream inputStream;
    public ByteArrayInputStream lastStoredEntry;
    public final byte[] lfhBuf;
    public final byte[] shortBuf;
    public final byte[] skipBuf;
    public final boolean skipSplitSig;
    public final byte[] twoDwordBuf;
    public long uncompressedCount;
    public final boolean useUnicodeExtraFields;
    public final byte[] wordBuf;
    public final ZipEncoding zipEncoding;
    public static final byte[] LFH = ZipLong.LFH_SIG.getBytes();
    public static final byte[] CFH = ZipLong.CFH_SIG.getBytes();

    /* renamed from: DD */
    public static final byte[] f9839DD = ZipLong.DD_SIG.getBytes();
    public static final byte[] APK_SIGNING_BLOCK_MAGIC = {65, FramedLZ4CompressorInputStream.SKIPPABLE_FRAME_PREFIX_BYTE_MASK, TarConstants.LF_GNUTYPE_LONGLINK, 32, TarConstants.LF_GNUTYPE_SPARSE, 105, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, 32, 66, 108, 111, 99, 107, 32, TarConstants.LF_BLK, TarConstants.LF_SYMLINK};
    public static final BigInteger LONG_MAX = BigInteger.valueOf(Long.MAX_VALUE);

    public ZipArchiveInputStream(InputStream inputStream) {
        this(inputStream, "UTF8");
    }

    public ZipArchiveInputStream(InputStream inputStream, String str) {
        this(inputStream, str, true);
    }

    public ZipArchiveInputStream(InputStream inputStream, String str, boolean z) {
        this(inputStream, str, z, false);
    }

    public ZipArchiveInputStream(InputStream inputStream, String str, boolean z, boolean z2) {
        this(inputStream, str, z, z2, false);
    }

    public ZipArchiveInputStream(InputStream inputStream, String str, boolean z, boolean z2, boolean z3) {
        this.inf = new Inflater(true);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(512);
        this.buf = byteBufferAllocate;
        this.lfhBuf = new byte[30];
        this.skipBuf = new byte[1024];
        this.shortBuf = new byte[2];
        this.wordBuf = new byte[4];
        this.twoDwordBuf = new byte[16];
        this.encoding = str;
        this.zipEncoding = ZipEncodingHelper.getZipEncoding(str);
        this.useUnicodeExtraFields = z;
        this.inputStream = new PushbackInputStream(inputStream, byteBufferAllocate.capacity());
        this.allowStoredEntriesWithDataDescriptor = z2;
        this.skipSplitSig = z3;
        byteBufferAllocate.limit(0);
    }

    public ZipArchiveEntry getNextZipEntry() throws DataFormatException, IOException {
        boolean z;
        ZipLong zipLong;
        ZipLong zipLong2;
        this.uncompressedCount = 0L;
        C110331 c110331 = null;
        if (!this.closed && !this.hitCentralDirectory) {
            if (this.current != null) {
                closeEntry();
                z = false;
            } else {
                z = true;
            }
            long bytesRead = getBytesRead();
            try {
                if (z) {
                    readFirstLocalFileHeader();
                } else {
                    readFully(this.lfhBuf);
                }
                ZipLong zipLong3 = new ZipLong(this.lfhBuf);
                if (!zipLong3.equals(ZipLong.LFH_SIG)) {
                    if (zipLong3.equals(ZipLong.CFH_SIG) || zipLong3.equals(ZipLong.AED_SIG) || isApkSigningBlock(this.lfhBuf)) {
                        this.hitCentralDirectory = true;
                        skipRemainderOfArchive();
                        return null;
                    }
                    throw new ZipException(String.format("Unexpected record signature: 0x%x", Long.valueOf(zipLong3.getValue())));
                }
                this.current = new CurrentEntry(c110331);
                this.current.entry.setPlatform((ZipShort.getValue(this.lfhBuf, 4) >> 8) & 15);
                GeneralPurposeBit generalPurposeBit = GeneralPurposeBit.parse(this.lfhBuf, 6);
                boolean zUsesUTF8ForNames = generalPurposeBit.usesUTF8ForNames();
                ZipEncoding zipEncoding = zUsesUTF8ForNames ? ZipEncodingHelper.UTF8_ZIP_ENCODING : this.zipEncoding;
                this.current.hasDataDescriptor = generalPurposeBit.usesDataDescriptor();
                this.current.entry.setGeneralPurposeBit(generalPurposeBit);
                this.current.entry.setMethod(ZipShort.getValue(this.lfhBuf, 8));
                this.current.entry.setTime(ZipUtil.dosToJavaTime(ZipLong.getValue(this.lfhBuf, 10)));
                if (this.current.hasDataDescriptor) {
                    zipLong = null;
                    zipLong2 = null;
                } else {
                    this.current.entry.setCrc(ZipLong.getValue(this.lfhBuf, 14));
                    zipLong = new ZipLong(this.lfhBuf, 18);
                    zipLong2 = new ZipLong(this.lfhBuf, 22);
                }
                int value = ZipShort.getValue(this.lfhBuf, 26);
                int value2 = ZipShort.getValue(this.lfhBuf, 28);
                byte[] range = readRange(value);
                this.current.entry.setName(zipEncoding.decode(range), range);
                if (zUsesUTF8ForNames) {
                    this.current.entry.setNameSource(ZipArchiveEntry.NameSource.NAME_WITH_EFS_FLAG);
                }
                try {
                    this.current.entry.setExtra(readRange(value2));
                    if (!zUsesUTF8ForNames && this.useUnicodeExtraFields) {
                        ZipUtil.setNameAndCommentFromExtraFields(this.current.entry, range, null);
                    }
                    processZip64Extra(zipLong2, zipLong);
                    this.current.entry.setLocalHeaderOffset(bytesRead);
                    this.current.entry.setDataOffset(getBytesRead());
                    this.current.entry.setStreamContiguous(true);
                    ZipMethod methodByCode = ZipMethod.getMethodByCode(this.current.entry.getMethod());
                    if (this.current.entry.getCompressedSize() == -1) {
                        if (methodByCode == ZipMethod.ENHANCED_DEFLATED) {
                            this.current.inputStream = new Deflate64CompressorInputStream(this.inputStream);
                        }
                    } else if (ZipUtil.canHandleEntryData(this.current.entry) && methodByCode != ZipMethod.STORED && methodByCode != ZipMethod.DEFLATED) {
                        BoundedInputStream boundedInputStream = new BoundedInputStream(this.inputStream, this.current.entry.getCompressedSize());
                        int i = C110331.$SwitchMap$org$apache$commons$compress$archivers$zip$ZipMethod[methodByCode.ordinal()];
                        if (i == 1) {
                            this.current.inputStream = new UnshrinkingInputStream(boundedInputStream);
                        } else if (i == 2) {
                            try {
                                CurrentEntry currentEntry = this.current;
                                currentEntry.inputStream = new ExplodingInputStream(currentEntry.entry.getGeneralPurposeBit().getSlidingDictionarySize(), this.current.entry.getGeneralPurposeBit().getNumberOfShannonFanoTrees(), boundedInputStream);
                            } catch (IllegalArgumentException e) {
                                throw new IOException("bad IMPLODE data", e);
                            }
                        } else if (i == 3) {
                            this.current.inputStream = new BZip2CompressorInputStream(boundedInputStream);
                        } else if (i == 4) {
                            this.current.inputStream = new Deflate64CompressorInputStream(boundedInputStream);
                        }
                    }
                    this.entriesRead++;
                    return this.current.entry;
                } catch (RuntimeException e2) {
                    ZipException zipException = new ZipException("Invalid extra data in entry " + this.current.entry.getName());
                    zipException.initCause(e2);
                    throw zipException;
                }
            } catch (EOFException unused) {
            }
        }
        return null;
    }

    /* renamed from: org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$1 */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C110331 {
        public static final /* synthetic */ int[] $SwitchMap$org$apache$commons$compress$archivers$zip$ZipMethod;

        static {
            int[] iArr = new int[ZipMethod.values().length];
            $SwitchMap$org$apache$commons$compress$archivers$zip$ZipMethod = iArr;
            try {
                iArr[ZipMethod.UNSHRINKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$apache$commons$compress$archivers$zip$ZipMethod[ZipMethod.IMPLODING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$apache$commons$compress$archivers$zip$ZipMethod[ZipMethod.BZIP2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$apache$commons$compress$archivers$zip$ZipMethod[ZipMethod.ENHANCED_DEFLATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public final void readFirstLocalFileHeader() throws IOException {
        readFully(this.lfhBuf);
        ZipLong zipLong = new ZipLong(this.lfhBuf);
        if (!this.skipSplitSig && zipLong.equals(ZipLong.DD_SIG)) {
            throw new UnsupportedZipFeatureException(UnsupportedZipFeatureException.Feature.SPLITTING);
        }
        if (zipLong.equals(ZipLong.SINGLE_SEGMENT_SPLIT_MARKER) || zipLong.equals(ZipLong.DD_SIG)) {
            byte[] bArr = new byte[4];
            readFully(bArr);
            byte[] bArr2 = this.lfhBuf;
            System.arraycopy(bArr2, 4, bArr2, 0, 26);
            System.arraycopy(bArr, 0, this.lfhBuf, 26, 4);
        }
    }

    public final void processZip64Extra(ZipLong zipLong, ZipLong zipLong2) throws ZipException {
        ZipExtraField extraField = this.current.entry.getExtraField(Zip64ExtendedInformationExtraField.HEADER_ID);
        if (extraField != null && !(extraField instanceof Zip64ExtendedInformationExtraField)) {
            throw new ZipException("archive contains unparseable zip64 extra field");
        }
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = (Zip64ExtendedInformationExtraField) extraField;
        this.current.usesZip64 = zip64ExtendedInformationExtraField != null;
        if (this.current.hasDataDescriptor) {
            return;
        }
        if (zip64ExtendedInformationExtraField != null) {
            ZipLong zipLong3 = ZipLong.ZIP64_MAGIC;
            if (zipLong3.equals(zipLong2) || zipLong3.equals(zipLong)) {
                if (zip64ExtendedInformationExtraField.getCompressedSize() == null || zip64ExtendedInformationExtraField.getSize() == null) {
                    throw new ZipException("archive contains corrupted zip64 extra field");
                }
                long longValue = zip64ExtendedInformationExtraField.getCompressedSize().getLongValue();
                if (longValue < 0) {
                    throw new ZipException("broken archive, entry with negative compressed size");
                }
                this.current.entry.setCompressedSize(longValue);
                long longValue2 = zip64ExtendedInformationExtraField.getSize().getLongValue();
                if (longValue2 < 0) {
                    throw new ZipException("broken archive, entry with negative size");
                }
                this.current.entry.setSize(longValue2);
                return;
            }
        }
        if (zipLong2 == null || zipLong == null) {
            return;
        }
        if (zipLong2.getValue() < 0) {
            throw new ZipException("broken archive, entry with negative compressed size");
        }
        this.current.entry.setCompressedSize(zipLong2.getValue());
        if (zipLong.getValue() < 0) {
            throw new ZipException("broken archive, entry with negative size");
        }
        this.current.entry.setSize(zipLong.getValue());
    }

    @Override // org.apache.commons.compress.archivers.ArchiveInputStream
    public ArchiveEntry getNextEntry() throws IOException {
        return getNextZipEntry();
    }

    @Override // org.apache.commons.compress.archivers.ArchiveInputStream
    public boolean canReadEntryData(ArchiveEntry archiveEntry) {
        if (!(archiveEntry instanceof ZipArchiveEntry)) {
            return false;
        }
        ZipArchiveEntry zipArchiveEntry = (ZipArchiveEntry) archiveEntry;
        return ZipUtil.canHandleEntryData(zipArchiveEntry) && supportsDataDescriptorFor(zipArchiveEntry) && supportsCompressedSizeFor(zipArchiveEntry);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws DataFormatException, IOException {
        int deflated;
        if (i2 == 0) {
            return 0;
        }
        if (this.closed) {
            throw new IOException("The stream is closed");
        }
        CurrentEntry currentEntry = this.current;
        if (currentEntry == null) {
            return -1;
        }
        if (i > bArr.length || i2 < 0 || i < 0 || bArr.length - i < i2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ZipUtil.checkRequestedFeatures(currentEntry.entry);
        if (!supportsDataDescriptorFor(this.current.entry)) {
            throw new UnsupportedZipFeatureException(UnsupportedZipFeatureException.Feature.DATA_DESCRIPTOR, this.current.entry);
        }
        if (!supportsCompressedSizeFor(this.current.entry)) {
            throw new UnsupportedZipFeatureException(UnsupportedZipFeatureException.Feature.UNKNOWN_COMPRESSED_SIZE, this.current.entry);
        }
        if (this.current.entry.getMethod() == 0) {
            deflated = readStored(bArr, i, i2);
        } else if (this.current.entry.getMethod() == 8) {
            deflated = readDeflated(bArr, i, i2);
        } else {
            if (this.current.entry.getMethod() != ZipMethod.UNSHRINKING.getCode() && this.current.entry.getMethod() != ZipMethod.IMPLODING.getCode() && this.current.entry.getMethod() != ZipMethod.ENHANCED_DEFLATED.getCode() && this.current.entry.getMethod() != ZipMethod.BZIP2.getCode()) {
                throw new UnsupportedZipFeatureException(ZipMethod.getMethodByCode(this.current.entry.getMethod()), this.current.entry);
            }
            deflated = this.current.inputStream.read(bArr, i, i2);
        }
        if (deflated >= 0) {
            this.current.crc.update(bArr, i, deflated);
            this.uncompressedCount += deflated;
        }
        return deflated;
    }

    @Override // org.apache.commons.compress.utils.InputStreamStatistics
    public long getCompressedCount() {
        int method = this.current.entry.getMethod();
        if (method == 0) {
            return this.current.bytesRead;
        }
        if (method == 8) {
            return getBytesInflated();
        }
        if (method == ZipMethod.UNSHRINKING.getCode() || method == ZipMethod.IMPLODING.getCode() || method == ZipMethod.ENHANCED_DEFLATED.getCode() || method == ZipMethod.BZIP2.getCode()) {
            return ((InputStreamStatistics) this.current.checkInputStream()).getCompressedCount();
        }
        return -1L;
    }

    @Override // org.apache.commons.compress.utils.InputStreamStatistics
    public long getUncompressedCount() {
        return this.uncompressedCount;
    }

    public final int readStored(byte[] bArr, int i, int i2) throws IOException {
        if (this.current.hasDataDescriptor) {
            if (this.lastStoredEntry == null) {
                readStoredEntry();
            }
            return this.lastStoredEntry.read(bArr, i, i2);
        }
        long size = this.current.entry.getSize();
        if (this.current.bytesRead >= size) {
            return -1;
        }
        if (this.buf.position() >= this.buf.limit()) {
            this.buf.position(0);
            int i3 = this.inputStream.read(this.buf.array());
            if (i3 == -1) {
                this.buf.limit(0);
                throw new IOException("Truncated ZIP file");
            }
            this.buf.limit(i3);
            count(i3);
            this.current.bytesReadFromStream += i3;
        }
        int iMin = Math.min(this.buf.remaining(), i2);
        if (size - this.current.bytesRead < iMin) {
            iMin = (int) (size - this.current.bytesRead);
        }
        this.buf.get(bArr, i, iMin);
        this.current.bytesRead += iMin;
        return iMin;
    }

    public final int readDeflated(byte[] bArr, int i, int i2) throws DataFormatException, IOException {
        int fromInflater = readFromInflater(bArr, i, i2);
        if (fromInflater <= 0) {
            if (this.inf.finished()) {
                return -1;
            }
            if (this.inf.needsDictionary()) {
                throw new ZipException("This archive needs a preset dictionary which is not supported by Commons Compress.");
            }
            if (fromInflater == -1) {
                throw new IOException("Truncated ZIP file");
            }
        }
        return fromInflater;
    }

    public final int readFromInflater(byte[] bArr, int i, int i2) throws DataFormatException, IOException {
        int iInflate = 0;
        while (true) {
            if (this.inf.needsInput()) {
                int iFill = fill();
                if (iFill > 0) {
                    this.current.bytesReadFromStream += this.buf.limit();
                    iInflate = this.inf.inflate(bArr, i, i2);
                    if (iInflate != 0) {
                        break;
                    }
                    break;
                    break;
                }
                if (iFill == -1) {
                    return -1;
                }
            } else {
                try {
                    iInflate = this.inf.inflate(bArr, i, i2);
                    if (iInflate != 0 || !this.inf.needsInput()) {
                        break;
                    }
                } catch (DataFormatException e) {
                    throw ((IOException) new ZipException(e.getMessage()).initCause(e));
                }
            }
        }
        return iInflate;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        try {
            this.inputStream.close();
        } finally {
            this.inf.end();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws DataFormatException, IOException {
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException();
        }
        while (j2 < j) {
            long length = j - j2;
            byte[] bArr = this.skipBuf;
            if (bArr.length <= length) {
                length = bArr.length;
            }
            int i = read(bArr, 0, (int) length);
            if (i == -1) {
                return j2;
            }
            j2 += i;
        }
        return j2;
    }

    public static boolean matches(byte[] bArr, int i) {
        byte[] bArr2 = ZipArchiveOutputStream.LFH_SIG;
        if (i < bArr2.length) {
            return false;
        }
        return checksig(bArr, bArr2) || checksig(bArr, ZipArchiveOutputStream.EOCD_SIG) || checksig(bArr, ZipArchiveOutputStream.DD_SIG) || checksig(bArr, ZipLong.SINGLE_SEGMENT_SPLIT_MARKER.getBytes());
    }

    public static boolean checksig(byte[] bArr, byte[] bArr2) {
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public final void closeEntry() throws DataFormatException, IOException {
        long bytesInflated;
        if (this.closed) {
            throw new IOException("The stream is closed");
        }
        if (this.current == null) {
            return;
        }
        if (currentEntryHasOutstandingBytes()) {
            drainCurrentEntryData();
        } else {
            skip(Long.MAX_VALUE);
            if (this.current.entry.getMethod() == 8) {
                bytesInflated = getBytesInflated();
            } else {
                bytesInflated = this.current.bytesRead;
            }
            int i = (int) (this.current.bytesReadFromStream - bytesInflated);
            if (i > 0) {
                pushback(this.buf.array(), this.buf.limit() - i, i);
                this.current.bytesReadFromStream -= i;
            }
            if (currentEntryHasOutstandingBytes()) {
                drainCurrentEntryData();
            }
        }
        if (this.lastStoredEntry == null && this.current.hasDataDescriptor) {
            readDataDescriptor();
        }
        this.inf.reset();
        this.buf.clear().flip();
        this.current = null;
        this.lastStoredEntry = null;
    }

    public final boolean currentEntryHasOutstandingBytes() {
        return this.current.bytesReadFromStream <= this.current.entry.getCompressedSize() && !this.current.hasDataDescriptor;
    }

    public final void drainCurrentEntryData() throws IOException {
        long compressedSize = this.current.entry.getCompressedSize() - this.current.bytesReadFromStream;
        while (compressedSize > 0) {
            long j = this.inputStream.read(this.buf.array(), 0, (int) Math.min(this.buf.capacity(), compressedSize));
            if (j >= 0) {
                count(j);
                compressedSize -= j;
            } else {
                throw new EOFException("Truncated ZIP entry: " + ArchiveUtils.sanitize(this.current.entry.getName()));
            }
        }
    }

    public final long getBytesInflated() {
        long bytesRead = this.inf.getBytesRead();
        if (this.current.bytesReadFromStream >= 4294967296L) {
            while (true) {
                long j = bytesRead + 4294967296L;
                if (j > this.current.bytesReadFromStream) {
                    break;
                }
                bytesRead = j;
            }
        }
        return bytesRead;
    }

    public final int fill() throws IOException {
        if (this.closed) {
            throw new IOException("The stream is closed");
        }
        int i = this.inputStream.read(this.buf.array());
        if (i > 0) {
            this.buf.limit(i);
            count(this.buf.limit());
            this.inf.setInput(this.buf.array(), 0, this.buf.limit());
        }
        return i;
    }

    public final void readFully(byte[] bArr) throws IOException {
        readFully(bArr, 0);
    }

    public final void readFully(byte[] bArr, int i) throws IOException {
        int length = bArr.length - i;
        int fully = IOUtils.readFully(this.inputStream, bArr, i, length);
        count(fully);
        if (fully < length) {
            throw new EOFException();
        }
    }

    public final byte[] readRange(int i) throws IOException {
        byte[] range = IOUtils.readRange(this.inputStream, i);
        count(range.length);
        if (range.length >= i) {
            return range;
        }
        throw new EOFException();
    }

    public final void readDataDescriptor() throws IOException {
        readFully(this.wordBuf);
        ZipLong zipLong = new ZipLong(this.wordBuf);
        if (ZipLong.DD_SIG.equals(zipLong)) {
            readFully(this.wordBuf);
            zipLong = new ZipLong(this.wordBuf);
        }
        this.current.entry.setCrc(zipLong.getValue());
        readFully(this.twoDwordBuf);
        ZipLong zipLong2 = new ZipLong(this.twoDwordBuf, 8);
        if (zipLong2.equals(ZipLong.CFH_SIG) || zipLong2.equals(ZipLong.LFH_SIG)) {
            pushback(this.twoDwordBuf, 8, 8);
            long value = ZipLong.getValue(this.twoDwordBuf);
            if (value < 0) {
                throw new ZipException("broken archive, entry with negative compressed size");
            }
            this.current.entry.setCompressedSize(value);
            long value2 = ZipLong.getValue(this.twoDwordBuf, 4);
            if (value2 < 0) {
                throw new ZipException("broken archive, entry with negative size");
            }
            this.current.entry.setSize(value2);
            return;
        }
        long longValue = ZipEightByteInteger.getLongValue(this.twoDwordBuf);
        if (longValue < 0) {
            throw new ZipException("broken archive, entry with negative compressed size");
        }
        this.current.entry.setCompressedSize(longValue);
        long longValue2 = ZipEightByteInteger.getLongValue(this.twoDwordBuf, 8);
        if (longValue2 < 0) {
            throw new ZipException("broken archive, entry with negative size");
        }
        this.current.entry.setSize(longValue2);
    }

    public final boolean supportsDataDescriptorFor(ZipArchiveEntry zipArchiveEntry) {
        return !zipArchiveEntry.getGeneralPurposeBit().usesDataDescriptor() || (this.allowStoredEntriesWithDataDescriptor && zipArchiveEntry.getMethod() == 0) || zipArchiveEntry.getMethod() == 8 || zipArchiveEntry.getMethod() == ZipMethod.ENHANCED_DEFLATED.getCode();
    }

    public final boolean supportsCompressedSizeFor(ZipArchiveEntry zipArchiveEntry) {
        return zipArchiveEntry.getCompressedSize() != -1 || zipArchiveEntry.getMethod() == 8 || zipArchiveEntry.getMethod() == ZipMethod.ENHANCED_DEFLATED.getCode() || (zipArchiveEntry.getGeneralPurposeBit().usesDataDescriptor() && this.allowStoredEntriesWithDataDescriptor && zipArchiveEntry.getMethod() == 0);
    }

    public final void readStoredEntry() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = this.current.usesZip64 ? 20 : 12;
        boolean zBufferContainsSignature = false;
        int iCacheBytesRead = 0;
        while (!zBufferContainsSignature) {
            int i2 = this.inputStream.read(this.buf.array(), iCacheBytesRead, 512 - iCacheBytesRead);
            if (i2 <= 0) {
                throw new IOException("Truncated ZIP file");
            }
            int i3 = i2 + iCacheBytesRead;
            if (i3 < 4) {
                iCacheBytesRead = i3;
            } else {
                zBufferContainsSignature = bufferContainsSignature(byteArrayOutputStream, iCacheBytesRead, i2, i);
                if (!zBufferContainsSignature) {
                    iCacheBytesRead = cacheBytesRead(byteArrayOutputStream, iCacheBytesRead, i2, i);
                }
            }
        }
        if (this.current.entry.getCompressedSize() != this.current.entry.getSize()) {
            throw new ZipException("compressed and uncompressed size don't match while reading a stored entry using data descriptor. Either the archive is broken or it can not be read using ZipArchiveInputStream and you must use ZipFile. A common cause for this is a ZIP archive containing a ZIP archive. See http://commons.apache.org/proper/commons-compress/zip.html#ZipArchiveInputStream_vs_ZipFile");
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray.length != this.current.entry.getSize()) {
            throw new ZipException("actual and claimed size don't match while reading a stored entry using data descriptor. Either the archive is broken or it can not be read using ZipArchiveInputStream and you must use ZipFile. A common cause for this is a ZIP archive containing a ZIP archive. See http://commons.apache.org/proper/commons-compress/zip.html#ZipArchiveInputStream_vs_ZipFile");
        }
        this.lastStoredEntry = new ByteArrayInputStream(byteArray);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean bufferContainsSignature(ByteArrayOutputStream byteArrayOutputStream, int i, int i2, int i3) throws IOException {
        int i4;
        boolean z = false;
        int i5 = 0;
        while (!z) {
            int i6 = i + i2;
            if (i5 >= i6 - 4) {
                break;
            }
            byte b = this.buf.array()[i5];
            byte[] bArr = LFH;
            if (b == bArr[0] && this.buf.array()[i5 + 1] == bArr[1]) {
                if (i5 < i3 || this.buf.array()[i5 + 2] != bArr[2] || this.buf.array()[i5 + 3] != bArr[3]) {
                    int i7 = i5 + 2;
                    byte b2 = this.buf.array()[i7];
                    byte[] bArr2 = CFH;
                    if (b2 == bArr2[2] && this.buf.array()[i5 + 3] == bArr2[3]) {
                        i4 = i5 - i3;
                    } else {
                        byte b3 = this.buf.array()[i7];
                        byte[] bArr3 = f9839DD;
                        if (b3 == bArr3[2] && this.buf.array()[i5 + 3] == bArr3[3]) {
                            i4 = i5;
                        } else {
                            i4 = i5;
                            if (!z) {
                                pushback(this.buf.array(), i4, i6 - i4);
                                byteArrayOutputStream.write(this.buf.array(), 0, i4);
                                readDataDescriptor();
                            }
                        }
                    }
                    z = true;
                    if (!z) {
                    }
                }
            }
            i5++;
        }
        return z;
    }

    public final int cacheBytesRead(ByteArrayOutputStream byteArrayOutputStream, int i, int i2, int i3) {
        int i4 = i + i2;
        int i5 = (i4 - i3) - 3;
        if (i5 <= 0) {
            return i4;
        }
        byteArrayOutputStream.write(this.buf.array(), 0, i5);
        int i6 = i3 + 3;
        System.arraycopy(this.buf.array(), i5, this.buf.array(), 0, i6);
        return i6;
    }

    public final void pushback(byte[] bArr, int i, int i2) throws IOException {
        ((PushbackInputStream) this.inputStream).unread(bArr, i, i2);
        pushedBackBytes(i2);
    }

    public final void skipRemainderOfArchive() throws IOException {
        int i = this.entriesRead;
        if (i > 0) {
            realSkip((i * 46) - 30);
            if (findEocdRecord()) {
                realSkip(16L);
                readFully(this.shortBuf);
                int value = ZipShort.getValue(this.shortBuf);
                if (value >= 0) {
                    realSkip(value);
                    return;
                }
            }
        }
        throw new IOException("Truncated ZIP file");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c A[PHI: r3
  0x000c: PHI (r3v3 int) = (r3v2 int), (r3v8 int) binds: [B:4:0x0004, B:6:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean findEocdRecord() throws IOException {
        int oneByte = -1;
        loop0: while (true) {
            boolean zIsFirstByteOfEocdSig = false;
            while (true) {
                if (!zIsFirstByteOfEocdSig) {
                    oneByte = readOneByte();
                    if (oneByte <= -1) {
                        break loop0;
                    }
                } else {
                    if (!isFirstByteOfEocdSig(oneByte)) {
                        break;
                    }
                    oneByte = readOneByte();
                    byte[] bArr = ZipArchiveOutputStream.EOCD_SIG;
                    if (oneByte == bArr[1]) {
                        oneByte = readOneByte();
                        if (oneByte == bArr[2]) {
                            oneByte = readOneByte();
                            if (oneByte == -1) {
                                break loop0;
                            }
                            if (oneByte == bArr[3]) {
                                return true;
                            }
                            zIsFirstByteOfEocdSig = isFirstByteOfEocdSig(oneByte);
                        } else {
                            if (oneByte == -1) {
                                break loop0;
                            }
                            zIsFirstByteOfEocdSig = isFirstByteOfEocdSig(oneByte);
                        }
                    } else {
                        if (oneByte == -1) {
                            break loop0;
                        }
                        zIsFirstByteOfEocdSig = isFirstByteOfEocdSig(oneByte);
                    }
                }
            }
        }
    }

    public final void realSkip(long j) throws IOException {
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException();
        }
        while (j2 < j) {
            long length = j - j2;
            InputStream inputStream = this.inputStream;
            byte[] bArr = this.skipBuf;
            if (bArr.length <= length) {
                length = bArr.length;
            }
            int i = inputStream.read(bArr, 0, (int) length);
            if (i == -1) {
                return;
            }
            count(i);
            j2 += i;
        }
    }

    private int readOneByte() throws IOException {
        int i = this.inputStream.read();
        if (i != -1) {
            count(1);
        }
        return i;
    }

    public final boolean isFirstByteOfEocdSig(int i) {
        return i == ZipArchiveOutputStream.EOCD_SIG[0];
    }

    public final boolean isApkSigningBlock(byte[] bArr) throws IOException {
        BigInteger value = ZipEightByteInteger.getValue(bArr);
        long length = 8 - bArr.length;
        byte[] bArr2 = APK_SIGNING_BLOCK_MAGIC;
        BigInteger bigIntegerAdd = value.add(BigInteger.valueOf(length - bArr2.length));
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[length2];
        try {
            if (bigIntegerAdd.signum() < 0) {
                int length3 = bArr.length + bigIntegerAdd.intValue();
                if (length3 < 8) {
                    return false;
                }
                int iAbs = Math.abs(bigIntegerAdd.intValue());
                System.arraycopy(bArr, length3, bArr3, 0, Math.min(iAbs, length2));
                if (iAbs < length2) {
                    readFully(bArr3, iAbs);
                }
            } else {
                while (true) {
                    BigInteger bigInteger = LONG_MAX;
                    if (bigIntegerAdd.compareTo(bigInteger) <= 0) {
                        break;
                    }
                    realSkip(Long.MAX_VALUE);
                    bigIntegerAdd = bigIntegerAdd.add(bigInteger.negate());
                }
                realSkip(bigIntegerAdd.longValue());
                readFully(bArr3);
            }
            return Arrays.equals(bArr3, APK_SIGNING_BLOCK_MAGIC);
        } catch (EOFException unused) {
            return false;
        }
    }

    /* loaded from: classes5.dex */
    public static final class CurrentEntry {
        public long bytesRead;
        public long bytesReadFromStream;
        public final CRC32 crc;
        public final ZipArchiveEntry entry;
        public boolean hasDataDescriptor;
        public InputStream inputStream;
        public boolean usesZip64;

        public CurrentEntry() {
            this.entry = new ZipArchiveEntry();
            this.crc = new CRC32();
        }

        public /* synthetic */ CurrentEntry(C110331 c110331) {
            this();
        }

        public static /* synthetic */ long access$808(CurrentEntry currentEntry) {
            long j = currentEntry.bytesReadFromStream;
            currentEntry.bytesReadFromStream = 1 + j;
            return j;
        }

        public final <T extends InputStream> T checkInputStream() {
            T t = (T) this.inputStream;
            Objects.requireNonNull(t, "inputStream");
            return t;
        }
    }

    /* loaded from: classes5.dex */
    public class BoundedInputStream extends InputStream {

        /* renamed from: in */
        public final InputStream f9840in;
        public final long max;
        public long pos;

        public BoundedInputStream(InputStream inputStream, long j) {
            this.max = j;
            this.f9840in = inputStream;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            long j = this.max;
            if (j >= 0 && this.pos >= j) {
                return -1;
            }
            int i = this.f9840in.read();
            this.pos++;
            ZipArchiveInputStream.this.count(1);
            CurrentEntry.access$808(ZipArchiveInputStream.this.current);
            return i;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr) throws IOException {
            return read(bArr, 0, bArr.length);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (i2 == 0) {
                return 0;
            }
            long j = this.max;
            if (j >= 0 && this.pos >= j) {
                return -1;
            }
            int i3 = this.f9840in.read(bArr, i, (int) (j >= 0 ? Math.min(i2, j - this.pos) : i2));
            if (i3 == -1) {
                return -1;
            }
            long j2 = i3;
            this.pos += j2;
            ZipArchiveInputStream.this.count(i3);
            ZipArchiveInputStream.this.current.bytesReadFromStream += j2;
            return i3;
        }

        @Override // java.io.InputStream
        public long skip(long j) throws IOException {
            long j2 = this.max;
            if (j2 >= 0) {
                j = Math.min(j, j2 - this.pos);
            }
            long jSkip = IOUtils.skip(this.f9840in, j);
            this.pos += jSkip;
            return jSkip;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            long j = this.max;
            if (j < 0 || this.pos < j) {
                return this.f9840in.available();
            }
            return 0;
        }
    }
}
