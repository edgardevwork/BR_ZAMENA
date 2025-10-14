package org.apache.commons.compress.archivers.p056ar;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.apache.commons.compress.utils.ArchiveUtils;

/* loaded from: classes8.dex */
public class ArArchiveOutputStream extends ArchiveOutputStream {
    public static final int LONGFILE_BSD = 1;
    public static final int LONGFILE_ERROR = 0;
    public long entryOffset;
    public boolean finished;
    public boolean haveUnclosedEntry;
    public int longFileMode = 0;
    public final OutputStream out;
    public ArArchiveEntry prevEntry;

    public ArArchiveOutputStream(OutputStream outputStream) {
        this.out = outputStream;
    }

    public void setLongFileMode(int i) {
        this.longFileMode = i;
    }

    public final void writeArchiveHeader() throws IOException {
        this.out.write(ArchiveUtils.toAsciiBytes(ArArchiveEntry.HEADER));
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public void closeArchiveEntry() throws IOException {
        if (this.finished) {
            throw new IOException("Stream has already been finished");
        }
        if (this.prevEntry == null || !this.haveUnclosedEntry) {
            throw new IOException("No current entry to close");
        }
        if (this.entryOffset % 2 != 0) {
            this.out.write(10);
        }
        this.haveUnclosedEntry = false;
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public void putArchiveEntry(ArchiveEntry archiveEntry) throws IOException {
        if (this.finished) {
            throw new IOException("Stream has already been finished");
        }
        ArArchiveEntry arArchiveEntry = (ArArchiveEntry) archiveEntry;
        ArArchiveEntry arArchiveEntry2 = this.prevEntry;
        if (arArchiveEntry2 == null) {
            writeArchiveHeader();
        } else {
            if (arArchiveEntry2.getLength() != this.entryOffset) {
                throw new IOException("Length does not match entry (" + this.prevEntry.getLength() + " != " + this.entryOffset);
            }
            if (this.haveUnclosedEntry) {
                closeArchiveEntry();
            }
        }
        this.prevEntry = arArchiveEntry;
        writeEntryHeader(arArchiveEntry);
        this.entryOffset = 0L;
        this.haveUnclosedEntry = true;
    }

    public final long fill(long j, long j2, char c) throws IOException {
        long j3 = j2 - j;
        if (j3 > 0) {
            for (int i = 0; i < j3; i++) {
                write(c);
            }
        }
        return j2;
    }

    public final long write(String str) throws IOException {
        write(str.getBytes(StandardCharsets.US_ASCII));
        return r3.length;
    }

    public final void writeEntryHeader(ArArchiveEntry arArchiveEntry) throws IOException {
        long jWrite;
        boolean z;
        String name = arArchiveEntry.getName();
        int length = name.length();
        int i = this.longFileMode;
        if (i == 0 && length > 16) {
            throw new IOException("File name too long, > 16 chars: " + name);
        }
        if (1 == i && (length > 16 || name.contains(" "))) {
            z = true;
            jWrite = write(ArArchiveInputStream.BSD_LONGNAME_PREFIX + length);
        } else {
            jWrite = write(name);
            z = false;
        }
        long jFill = fill(jWrite, 16L, ' ');
        String str = "" + arArchiveEntry.getLastModified();
        if (str.length() > 12) {
            throw new IOException("Last modified too long");
        }
        long jFill2 = fill(jFill + write(str), 28L, ' ');
        String str2 = "" + arArchiveEntry.getUserId();
        if (str2.length() > 6) {
            throw new IOException("User id too long");
        }
        long jFill3 = fill(jFill2 + write(str2), 34L, ' ');
        String str3 = "" + arArchiveEntry.getGroupId();
        if (str3.length() > 6) {
            throw new IOException("Group id too long");
        }
        long jFill4 = fill(jFill3 + write(str3), 40L, ' ');
        String str4 = "" + Integer.toString(arArchiveEntry.getMode(), 8);
        if (str4.length() > 8) {
            throw new IOException("Filemode too long");
        }
        long jFill5 = fill(jFill4 + write(str4), 48L, ' ');
        long length2 = arArchiveEntry.getLength();
        if (!z) {
            length = 0;
        }
        String strValueOf = String.valueOf(length2 + length);
        if (strValueOf.length() > 10) {
            throw new IOException("Size too long");
        }
        fill(jFill5 + write(strValueOf), 58L, ' ');
        write(ArArchiveEntry.TRAILER);
        if (z) {
            write(name);
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
        count(i2);
        this.entryOffset += i2;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            if (!this.finished) {
                finish();
            }
        } finally {
            this.out.close();
            this.prevEntry = null;
        }
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public ArchiveEntry createArchiveEntry(File file, String str) throws IOException {
        if (this.finished) {
            throw new IOException("Stream has already been finished");
        }
        return new ArArchiveEntry(file, str);
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public ArchiveEntry createArchiveEntry(Path path, String str, LinkOption... linkOptionArr) throws IOException {
        if (this.finished) {
            throw new IOException("Stream has already been finished");
        }
        return new ArArchiveEntry(path, str, linkOptionArr);
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public void finish() throws IOException {
        if (this.haveUnclosedEntry) {
            throw new IOException("This archive contains unclosed entries.");
        }
        if (this.finished) {
            throw new IOException("This archive has already been finished");
        }
        this.finished = true;
    }
}
