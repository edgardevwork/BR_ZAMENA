package org.apache.commons.compress.archivers.sevenz;

import java.util.BitSet;

/* loaded from: classes5.dex */
public class Archive {
    public long[] packCrcs;
    public BitSet packCrcsDefined;
    public long packPos;
    public StreamMap streamMap;
    public SubStreamsInfo subStreamsInfo;
    public long[] packSizes = new long[0];
    public Folder[] folders = Folder.EMPTY_FOLDER_ARRAY;
    public SevenZArchiveEntry[] files = SevenZArchiveEntry.EMPTY_SEVEN_Z_ARCHIVE_ENTRY_ARRAY;

    public String toString() {
        return "Archive with packed streams starting at offset " + this.packPos + ", " + lengthOf(this.packSizes) + " pack sizes, " + lengthOf(this.packCrcs) + " CRCs, " + lengthOf(this.folders) + " folders, " + lengthOf(this.files) + " files and " + this.streamMap;
    }

    public static String lengthOf(long[] jArr) {
        return jArr == null ? "(null)" : String.valueOf(jArr.length);
    }

    public static String lengthOf(Object[] objArr) {
        return objArr == null ? "(null)" : String.valueOf(objArr.length);
    }
}
