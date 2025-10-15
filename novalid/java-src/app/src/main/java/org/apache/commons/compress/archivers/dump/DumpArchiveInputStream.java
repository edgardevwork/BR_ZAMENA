package org.apache.commons.compress.archivers.dump;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import org.apache.commons.compress.archivers.ArchiveException;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.dump.DumpArchiveConstants;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.archivers.zip.ZipEncodingHelper;
import org.apache.commons.compress.utils.IOUtils;

/* loaded from: classes8.dex */
public class DumpArchiveInputStream extends ArchiveInputStream {
    public DumpArchiveEntry active;
    public byte[] blockBuffer;
    public final String encoding;
    public long entryOffset;
    public long entrySize;
    public long filepos;
    public boolean hasHitEOF;
    public boolean isClosed;
    public final Map<Integer, Dirent> names;
    public final Map<Integer, DumpArchiveEntry> pending;
    public final Queue<DumpArchiveEntry> queue;
    public TapeInputStream raw;
    public final byte[] readBuf;
    public int readIdx;
    public int recordOffset;
    public final DumpArchiveSummary summary;
    public final ZipEncoding zipEncoding;

    public DumpArchiveInputStream(InputStream inputStream) throws ArchiveException {
        this(inputStream, null);
    }

    public DumpArchiveInputStream(InputStream inputStream, String str) throws ArchiveException, UnrecognizedFormatException {
        this.readBuf = new byte[1024];
        HashMap map = new HashMap();
        this.names = map;
        this.pending = new HashMap();
        this.raw = new TapeInputStream(inputStream);
        this.hasHitEOF = false;
        this.encoding = str;
        ZipEncoding zipEncoding = ZipEncodingHelper.getZipEncoding(str);
        this.zipEncoding = zipEncoding;
        try {
            byte[] record = this.raw.readRecord();
            if (!DumpArchiveUtil.verify(record)) {
                throw new UnrecognizedFormatException();
            }
            DumpArchiveSummary dumpArchiveSummary = new DumpArchiveSummary(record, zipEncoding);
            this.summary = dumpArchiveSummary;
            this.raw.resetBlockSize(dumpArchiveSummary.getNTRec(), dumpArchiveSummary.isCompressed());
            this.blockBuffer = new byte[4096];
            readCLRI();
            readBITS();
            map.put(2, new Dirent(2, 2, 4, "."));
            this.queue = new PriorityQueue(10, new Comparator() { // from class: org.apache.commons.compress.archivers.dump.DumpArchiveInputStream$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return DumpArchiveInputStream.lambda$new$0((DumpArchiveEntry) obj, (DumpArchiveEntry) obj2);
                }
            });
        } catch (IOException e) {
            throw new ArchiveException(e.getMessage(), e);
        }
    }

    public static /* synthetic */ int lambda$new$0(DumpArchiveEntry dumpArchiveEntry, DumpArchiveEntry dumpArchiveEntry2) {
        if (dumpArchiveEntry.getOriginalName() == null || dumpArchiveEntry2.getOriginalName() == null) {
            return Integer.MAX_VALUE;
        }
        return dumpArchiveEntry.getOriginalName().compareTo(dumpArchiveEntry2.getOriginalName());
    }

    @Override // org.apache.commons.compress.archivers.ArchiveInputStream
    @Deprecated
    public int getCount() {
        return (int) getBytesRead();
    }

    @Override // org.apache.commons.compress.archivers.ArchiveInputStream
    public long getBytesRead() {
        return this.raw.getBytesRead();
    }

    public DumpArchiveSummary getSummary() {
        return this.summary;
    }

    public final void readCLRI() throws IOException {
        byte[] record = this.raw.readRecord();
        if (!DumpArchiveUtil.verify(record)) {
            throw new InvalidFormatException();
        }
        DumpArchiveEntry dumpArchiveEntry = DumpArchiveEntry.parse(record);
        this.active = dumpArchiveEntry;
        if (DumpArchiveConstants.SEGMENT_TYPE.CLRI != dumpArchiveEntry.getHeaderType()) {
            throw new InvalidFormatException();
        }
        if (this.raw.skip(this.active.getHeaderCount() * 1024) == -1) {
            throw new EOFException();
        }
        this.readIdx = this.active.getHeaderCount();
    }

    public final void readBITS() throws IOException {
        byte[] record = this.raw.readRecord();
        if (!DumpArchiveUtil.verify(record)) {
            throw new InvalidFormatException();
        }
        DumpArchiveEntry dumpArchiveEntry = DumpArchiveEntry.parse(record);
        this.active = dumpArchiveEntry;
        if (DumpArchiveConstants.SEGMENT_TYPE.BITS != dumpArchiveEntry.getHeaderType()) {
            throw new InvalidFormatException();
        }
        if (this.raw.skip(this.active.getHeaderCount() * 1024) == -1) {
            throw new EOFException();
        }
        this.readIdx = this.active.getHeaderCount();
    }

    public DumpArchiveEntry getNextDumpEntry() throws IOException {
        return getNextEntry();
    }

    @Override // org.apache.commons.compress.archivers.ArchiveInputStream
    public DumpArchiveEntry getNextEntry() throws IOException {
        if (!this.queue.isEmpty()) {
            return this.queue.remove();
        }
        DumpArchiveEntry dumpArchiveEntry = null;
        String str = null;
        while (dumpArchiveEntry == null) {
            if (this.hasHitEOF) {
                return null;
            }
            while (this.readIdx < this.active.getHeaderCount()) {
                DumpArchiveEntry dumpArchiveEntry2 = this.active;
                int i = this.readIdx;
                this.readIdx = i + 1;
                if (!dumpArchiveEntry2.isSparseRecord(i) && this.raw.skip(1024L) == -1) {
                    throw new EOFException();
                }
            }
            this.readIdx = 0;
            this.filepos = this.raw.getBytesRead();
            byte[] record = this.raw.readRecord();
            if (!DumpArchiveUtil.verify(record)) {
                throw new InvalidFormatException();
            }
            this.active = DumpArchiveEntry.parse(record);
            while (DumpArchiveConstants.SEGMENT_TYPE.ADDR == this.active.getHeaderType()) {
                if (this.raw.skip((this.active.getHeaderCount() - this.active.getHeaderHoles()) * 1024) == -1) {
                    throw new EOFException();
                }
                this.filepos = this.raw.getBytesRead();
                byte[] record2 = this.raw.readRecord();
                if (!DumpArchiveUtil.verify(record2)) {
                    throw new InvalidFormatException();
                }
                this.active = DumpArchiveEntry.parse(record2);
            }
            if (DumpArchiveConstants.SEGMENT_TYPE.END == this.active.getHeaderType()) {
                this.hasHitEOF = true;
                return null;
            }
            DumpArchiveEntry dumpArchiveEntry3 = this.active;
            if (dumpArchiveEntry3.isDirectory()) {
                readDirectoryEntry(this.active);
                this.entryOffset = 0L;
                this.entrySize = 0L;
                this.readIdx = this.active.getHeaderCount();
            } else {
                this.entryOffset = 0L;
                this.entrySize = this.active.getEntrySize();
                this.readIdx = 0;
            }
            this.recordOffset = this.readBuf.length;
            String path = getPath(dumpArchiveEntry3);
            if (path == null) {
                dumpArchiveEntry3 = null;
            }
            DumpArchiveEntry dumpArchiveEntry4 = dumpArchiveEntry3;
            str = path;
            dumpArchiveEntry = dumpArchiveEntry4;
        }
        dumpArchiveEntry.setName(str);
        dumpArchiveEntry.setSimpleName(this.names.get(Integer.valueOf(dumpArchiveEntry.getIno())).getName());
        dumpArchiveEntry.setOffset(this.filepos);
        return dumpArchiveEntry;
    }

    public final void readDirectoryEntry(DumpArchiveEntry dumpArchiveEntry) throws IOException {
        long entrySize = dumpArchiveEntry.getEntrySize();
        boolean z = true;
        while (true) {
            if (!z && DumpArchiveConstants.SEGMENT_TYPE.ADDR != dumpArchiveEntry.getHeaderType()) {
                return;
            }
            if (!z) {
                this.raw.readRecord();
            }
            if (!this.names.containsKey(Integer.valueOf(dumpArchiveEntry.getIno())) && DumpArchiveConstants.SEGMENT_TYPE.INODE == dumpArchiveEntry.getHeaderType()) {
                this.pending.put(Integer.valueOf(dumpArchiveEntry.getIno()), dumpArchiveEntry);
            }
            int headerCount = dumpArchiveEntry.getHeaderCount() * 1024;
            byte[] bArr = this.blockBuffer;
            if (bArr.length < headerCount) {
                byte[] range = IOUtils.readRange(this.raw, headerCount);
                this.blockBuffer = range;
                if (range.length != headerCount) {
                    throw new EOFException();
                }
            } else if (this.raw.read(bArr, 0, headerCount) != headerCount) {
                throw new EOFException();
            }
            int i = 0;
            while (i < headerCount - 8 && i < entrySize - 8) {
                int iConvert32 = DumpArchiveUtil.convert32(this.blockBuffer, i);
                int iConvert16 = DumpArchiveUtil.convert16(this.blockBuffer, i + 4);
                byte[] bArr2 = this.blockBuffer;
                byte b = bArr2[i + 6];
                String strDecode = DumpArchiveUtil.decode(this.zipEncoding, bArr2, i + 8, bArr2[i + 7]);
                if (!".".equals(strDecode) && !"..".equals(strDecode)) {
                    this.names.put(Integer.valueOf(iConvert32), new Dirent(iConvert32, dumpArchiveEntry.getIno(), b, strDecode));
                    this.pending.forEach(new BiConsumer() { // from class: org.apache.commons.compress.archivers.dump.DumpArchiveInputStream$$ExternalSyntheticLambda1
                        @Override // java.util.function.BiConsumer
                        public final void accept(Object obj, Object obj2) {
                            this.f$0.lambda$readDirectoryEntry$1((Integer) obj, (DumpArchiveEntry) obj2);
                        }
                    });
                    this.queue.forEach(new Consumer() { // from class: org.apache.commons.compress.archivers.dump.DumpArchiveInputStream$$ExternalSyntheticLambda2
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            this.f$0.lambda$readDirectoryEntry$2((DumpArchiveEntry) obj);
                        }
                    });
                }
                i += iConvert16;
            }
            byte[] bArrPeek = this.raw.peek();
            if (!DumpArchiveUtil.verify(bArrPeek)) {
                throw new InvalidFormatException();
            }
            dumpArchiveEntry = DumpArchiveEntry.parse(bArrPeek);
            entrySize -= 1024;
            z = false;
        }
    }

    public final /* synthetic */ void lambda$readDirectoryEntry$1(Integer num, DumpArchiveEntry dumpArchiveEntry) {
        String path = getPath(dumpArchiveEntry);
        if (path != null) {
            dumpArchiveEntry.setName(path);
            dumpArchiveEntry.setSimpleName(this.names.get(num).getName());
            this.queue.add(dumpArchiveEntry);
        }
    }

    public final /* synthetic */ void lambda$readDirectoryEntry$2(DumpArchiveEntry dumpArchiveEntry) {
        this.pending.remove(Integer.valueOf(dumpArchiveEntry.getIno()));
    }

    public final String getPath(DumpArchiveEntry dumpArchiveEntry) {
        Stack stack = new Stack();
        int ino = dumpArchiveEntry.getIno();
        while (true) {
            if (!this.names.containsKey(Integer.valueOf(ino))) {
                stack.clear();
                break;
            }
            Dirent dirent = this.names.get(Integer.valueOf(ino));
            stack.push(dirent.getName());
            if (dirent.getIno() == dirent.getParentIno()) {
                break;
            }
            ino = dirent.getParentIno();
        }
        if (stack.isEmpty()) {
            this.pending.put(Integer.valueOf(dumpArchiveEntry.getIno()), dumpArchiveEntry);
            return null;
        }
        StringBuilder sb = new StringBuilder((String) stack.pop());
        while (!stack.isEmpty()) {
            sb.append('/');
            sb.append((String) stack.pop());
        }
        return sb.toString();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.hasHitEOF || this.isClosed) {
            return -1;
        }
        long j = this.entryOffset;
        long j2 = this.entrySize;
        if (j >= j2) {
            return -1;
        }
        if (this.active == null) {
            throw new IllegalStateException("No current dump entry");
        }
        if (i2 + j > j2) {
            i2 = (int) (j2 - j);
        }
        int i3 = 0;
        while (i2 > 0) {
            int iMin = Math.min(i2, this.readBuf.length - this.recordOffset);
            int i4 = this.recordOffset;
            int i5 = i4 + iMin;
            byte[] bArr2 = this.readBuf;
            if (i5 <= bArr2.length) {
                System.arraycopy(bArr2, i4, bArr, i, iMin);
                i3 += iMin;
                this.recordOffset += iMin;
                i2 -= iMin;
                i += iMin;
            }
            if (i2 > 0) {
                if (this.readIdx >= 512) {
                    byte[] record = this.raw.readRecord();
                    if (!DumpArchiveUtil.verify(record)) {
                        throw new InvalidFormatException();
                    }
                    this.active = DumpArchiveEntry.parse(record);
                    this.readIdx = 0;
                }
                DumpArchiveEntry dumpArchiveEntry = this.active;
                int i6 = this.readIdx;
                this.readIdx = i6 + 1;
                if (!dumpArchiveEntry.isSparseRecord(i6)) {
                    TapeInputStream tapeInputStream = this.raw;
                    byte[] bArr3 = this.readBuf;
                    if (tapeInputStream.read(bArr3, 0, bArr3.length) != this.readBuf.length) {
                        throw new EOFException();
                    }
                } else {
                    Arrays.fill(this.readBuf, (byte) 0);
                }
                this.recordOffset = 0;
            }
        }
        this.entryOffset += i3;
        return i3;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.isClosed) {
            return;
        }
        this.isClosed = true;
        this.raw.close();
    }

    public static boolean matches(byte[] bArr, int i) {
        if (i < 32) {
            return false;
        }
        if (i >= 1024) {
            return DumpArchiveUtil.verify(bArr);
        }
        return 60012 == DumpArchiveUtil.convert32(bArr, 24);
    }
}
