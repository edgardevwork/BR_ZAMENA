package org.apache.commons.compress.archivers.dump;

import androidx.media3.extractor.text.cea.Cea708Decoder;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.dump.DumpArchiveConstants;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* loaded from: classes8.dex */
public class DumpArchiveEntry implements ArchiveEntry {
    public long atime;
    public long ctime;
    public int generation;
    public int gid;
    public int ino;
    public boolean isDeleted;
    public int mode;
    public long mtime;
    public String name;
    public int nlink;
    public long offset;
    public String originalName;
    public String simpleName;
    public long size;
    public int uid;
    public int volume;
    public TYPE type = TYPE.UNKNOWN;
    public Set<PERMISSION> permissions = Collections.emptySet();
    public final DumpArchiveSummary summary = null;
    public final TapeSegmentHeader header = new TapeSegmentHeader();

    public DumpArchiveEntry() {
    }

    public DumpArchiveEntry(String str, String str2) {
        setName(str);
        this.simpleName = str2;
    }

    public DumpArchiveEntry(String str, String str2, int i, TYPE type) {
        setType(type);
        setName(str);
        this.simpleName = str2;
        this.ino = i;
        this.offset = 0L;
    }

    public String getSimpleName() {
        return this.simpleName;
    }

    public void setSimpleName(String str) {
        this.simpleName = str;
    }

    public int getIno() {
        return this.header.getIno();
    }

    public int getNlink() {
        return this.nlink;
    }

    public void setNlink(int i) {
        this.nlink = i;
    }

    public Date getCreationTime() {
        return new Date(this.ctime);
    }

    public void setCreationTime(Date date) {
        this.ctime = date.getTime();
    }

    public int getGeneration() {
        return this.generation;
    }

    public void setGeneration(int i) {
        this.generation = i;
    }

    public boolean isDeleted() {
        return this.isDeleted;
    }

    public void setDeleted(boolean z) {
        this.isDeleted = z;
    }

    public long getOffset() {
        return this.offset;
    }

    public void setOffset(long j) {
        this.offset = j;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int i) {
        this.volume = i;
    }

    public DumpArchiveConstants.SEGMENT_TYPE getHeaderType() {
        return this.header.getType();
    }

    public int getHeaderCount() {
        return this.header.getCount();
    }

    public int getHeaderHoles() {
        return this.header.getHoles();
    }

    public boolean isSparseRecord(int i) {
        return (this.header.getCdata(i) & 1) == 0;
    }

    public int hashCode() {
        return this.ino;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        DumpArchiveEntry dumpArchiveEntry = (DumpArchiveEntry) obj;
        if (this.ino != dumpArchiveEntry.ino) {
            return false;
        }
        DumpArchiveSummary dumpArchiveSummary = this.summary;
        return (dumpArchiveSummary != null || dumpArchiveEntry.summary == null) && (dumpArchiveSummary == null || dumpArchiveSummary.equals(dumpArchiveEntry.summary));
    }

    public String toString() {
        return getName();
    }

    public static DumpArchiveEntry parse(byte[] bArr) {
        DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry();
        TapeSegmentHeader tapeSegmentHeader = dumpArchiveEntry.header;
        tapeSegmentHeader.type = DumpArchiveConstants.SEGMENT_TYPE.find(DumpArchiveUtil.convert32(bArr, 0));
        tapeSegmentHeader.volume = DumpArchiveUtil.convert32(bArr, 12);
        dumpArchiveEntry.ino = tapeSegmentHeader.ino = DumpArchiveUtil.convert32(bArr, 20);
        int iConvert16 = DumpArchiveUtil.convert16(bArr, 32);
        dumpArchiveEntry.setType(TYPE.find((iConvert16 >> 12) & 15));
        dumpArchiveEntry.setMode(iConvert16);
        dumpArchiveEntry.nlink = DumpArchiveUtil.convert16(bArr, 34);
        dumpArchiveEntry.setSize(DumpArchiveUtil.convert64(bArr, 40));
        dumpArchiveEntry.setAccessTime(new Date((DumpArchiveUtil.convert32(bArr, 48) * 1000) + (DumpArchiveUtil.convert32(bArr, 52) / 1000)));
        dumpArchiveEntry.setLastModifiedDate(new Date((DumpArchiveUtil.convert32(bArr, 56) * 1000) + (DumpArchiveUtil.convert32(bArr, 60) / 1000)));
        dumpArchiveEntry.ctime = (DumpArchiveUtil.convert32(bArr, 64) * 1000) + (DumpArchiveUtil.convert32(bArr, 68) / 1000);
        dumpArchiveEntry.generation = DumpArchiveUtil.convert32(bArr, Cea708Decoder.COMMAND_DLW);
        dumpArchiveEntry.setUserId(DumpArchiveUtil.convert32(bArr, Cea708Decoder.COMMAND_SPA));
        dumpArchiveEntry.setGroupId(DumpArchiveUtil.convert32(bArr, TarConstants.CHKSUM_OFFSET));
        tapeSegmentHeader.count = DumpArchiveUtil.convert32(bArr, 160);
        tapeSegmentHeader.holes = 0;
        for (int i = 0; i < 512 && i < tapeSegmentHeader.count; i++) {
            if (bArr[i + 164] == 0) {
                TapeSegmentHeader.access$408(tapeSegmentHeader);
            }
        }
        System.arraycopy(bArr, 164, tapeSegmentHeader.cdata, 0, 512);
        dumpArchiveEntry.volume = tapeSegmentHeader.getVolume();
        return dumpArchiveEntry;
    }

    public void update(byte[] bArr) {
        this.header.volume = DumpArchiveUtil.convert32(bArr, 16);
        this.header.count = DumpArchiveUtil.convert32(bArr, 160);
        this.header.holes = 0;
        for (int i = 0; i < 512 && i < this.header.count; i++) {
            if (bArr[i + 164] == 0) {
                TapeSegmentHeader.access$408(this.header);
            }
        }
        System.arraycopy(bArr, 164, this.header.cdata, 0, 512);
    }

    /* loaded from: classes5.dex */
    public static class TapeSegmentHeader {
        public final byte[] cdata = new byte[512];
        public int count;
        public int holes;
        public int ino;
        public DumpArchiveConstants.SEGMENT_TYPE type;
        public int volume;

        public static /* synthetic */ int access$408(TapeSegmentHeader tapeSegmentHeader) {
            int i = tapeSegmentHeader.holes;
            tapeSegmentHeader.holes = i + 1;
            return i;
        }

        public DumpArchiveConstants.SEGMENT_TYPE getType() {
            return this.type;
        }

        public int getVolume() {
            return this.volume;
        }

        public int getIno() {
            return this.ino;
        }

        public void setIno(int i) {
            this.ino = i;
        }

        public int getCount() {
            return this.count;
        }

        public int getHoles() {
            return this.holes;
        }

        public int getCdata(int i) {
            return this.cdata[i];
        }
    }

    @Override // org.apache.commons.compress.archivers.ArchiveEntry
    public String getName() {
        return this.name;
    }

    public String getOriginalName() {
        return this.originalName;
    }

    public final void setName(String str) {
        this.originalName = str;
        if (str != null) {
            if (isDirectory() && !str.endsWith("/")) {
                str = str + "/";
            }
            if (str.startsWith("./")) {
                str = str.substring(2);
            }
        }
        this.name = str;
    }

    @Override // org.apache.commons.compress.archivers.ArchiveEntry
    public Date getLastModifiedDate() {
        return new Date(this.mtime);
    }

    @Override // org.apache.commons.compress.archivers.ArchiveEntry
    public boolean isDirectory() {
        return this.type == TYPE.DIRECTORY;
    }

    public boolean isFile() {
        return this.type == TYPE.FILE;
    }

    public boolean isSocket() {
        return this.type == TYPE.SOCKET;
    }

    public boolean isChrDev() {
        return this.type == TYPE.CHRDEV;
    }

    public boolean isBlkDev() {
        return this.type == TYPE.BLKDEV;
    }

    public boolean isFifo() {
        return this.type == TYPE.FIFO;
    }

    public TYPE getType() {
        return this.type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public int getMode() {
        return this.mode;
    }

    public void setMode(int i) {
        this.mode = i & UnixStat.PERM_MASK;
        this.permissions = PERMISSION.find(i);
    }

    public Set<PERMISSION> getPermissions() {
        return this.permissions;
    }

    @Override // org.apache.commons.compress.archivers.ArchiveEntry
    public long getSize() {
        if (isDirectory()) {
            return -1L;
        }
        return this.size;
    }

    public long getEntrySize() {
        return this.size;
    }

    public void setSize(long j) {
        this.size = j;
    }

    public void setLastModifiedDate(Date date) {
        this.mtime = date.getTime();
    }

    public Date getAccessTime() {
        return new Date(this.atime);
    }

    public void setAccessTime(Date date) {
        this.atime = date.getTime();
    }

    public int getUserId() {
        return this.uid;
    }

    public void setUserId(int i) {
        this.uid = i;
    }

    public int getGroupId() {
        return this.gid;
    }

    public void setGroupId(int i) {
        this.gid = i;
    }

    /* loaded from: classes5.dex */
    public enum TYPE {
        WHITEOUT(14),
        SOCKET(12),
        LINK(10),
        FILE(8),
        BLKDEV(6),
        DIRECTORY(4),
        CHRDEV(2),
        FIFO(1),
        UNKNOWN(15);

        public final int code;

        TYPE(int i) {
            this.code = i;
        }

        public static TYPE find(int i) {
            TYPE type = UNKNOWN;
            for (TYPE type2 : values()) {
                if (i == type2.code) {
                    type = type2;
                }
            }
            return type;
        }
    }

    /* loaded from: classes5.dex */
    public enum PERMISSION {
        SETUID(2048),
        SETGUI(1024),
        STICKY(512),
        USER_READ(256),
        USER_WRITE(128),
        USER_EXEC(64),
        GROUP_READ(32),
        GROUP_WRITE(16),
        GROUP_EXEC(8),
        WORLD_READ(4),
        WORLD_WRITE(2),
        WORLD_EXEC(1);

        public final int code;

        PERMISSION(int i) {
            this.code = i;
        }

        public static Set<PERMISSION> find(int i) {
            HashSet hashSet = new HashSet();
            for (PERMISSION permission : values()) {
                int i2 = permission.code;
                if ((i & i2) == i2) {
                    hashSet.add(permission);
                }
            }
            if (hashSet.isEmpty()) {
                return Collections.emptySet();
            }
            return EnumSet.copyOf((Collection) hashSet);
        }
    }
}
