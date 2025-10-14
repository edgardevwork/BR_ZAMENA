package org.apache.commons.compress.archivers.arj;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes5.dex */
public class LocalFileHeader {
    public int archiverVersionNumber;
    public int arjFlags;
    public String comment;
    public long compressedSize;
    public int dateTimeAccessed;
    public int dateTimeCreated;
    public int dateTimeModified;
    public int extendedFilePosition;
    public byte[][] extendedHeaders;
    public int fileAccessMode;
    public int fileSpecPosition;
    public int fileType;
    public int firstChapter;
    public int hostOS;
    public int lastChapter;
    public int method;
    public int minVersionToExtract;
    public String name;
    public long originalCrc32;
    public long originalSize;
    public int originalSizeEvenForVolumes;
    public int reserved;

    public static class FileTypes {
        public static final int BINARY = 0;
        public static final int CHAPTER_LABEL = 5;
        public static final int COMMENT_HEADER = 2;
        public static final int DIRECTORY = 3;
        public static final int SEVEN_BIT_TEXT = 1;
        public static final int VOLUME_LABEL = 4;
    }

    public static class Flags {
        public static final int BACKUP = 32;
        public static final int EXTFILE = 8;
        public static final int GARBLED = 1;
        public static final int PATHSYM = 16;
        public static final int VOLUME = 4;
    }

    public static class Methods {
        public static final int COMPRESSED = 2;
        public static final int COMPRESSED_FASTER = 3;
        public static final int COMPRESSED_FASTEST = 4;
        public static final int COMPRESSED_MOST = 1;
        public static final int NO_DATA = 9;
        public static final int NO_DATA_NO_CRC = 8;
        public static final int STORED = 0;
    }

    public String toString() {
        return "LocalFileHeader [archiverVersionNumber=" + this.archiverVersionNumber + ", minVersionToExtract=" + this.minVersionToExtract + ", hostOS=" + this.hostOS + ", arjFlags=" + this.arjFlags + ", method=" + this.method + ", fileType=" + this.fileType + ", reserved=" + this.reserved + ", dateTimeModified=" + this.dateTimeModified + ", compressedSize=" + this.compressedSize + ", originalSize=" + this.originalSize + ", originalCrc32=" + this.originalCrc32 + ", fileSpecPosition=" + this.fileSpecPosition + ", fileAccessMode=" + this.fileAccessMode + ", firstChapter=" + this.firstChapter + ", lastChapter=" + this.lastChapter + ", extendedFilePosition=" + this.extendedFilePosition + ", dateTimeAccessed=" + this.dateTimeAccessed + ", dateTimeCreated=" + this.dateTimeCreated + ", originalSizeEvenForVolumes=" + this.originalSizeEvenForVolumes + ", name=" + this.name + ", comment=" + this.comment + ", extendedHeaders=" + Arrays.toString(this.extendedHeaders) + "]";
    }

    public int hashCode() {
        String str = this.name;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LocalFileHeader localFileHeader = (LocalFileHeader) obj;
        return this.archiverVersionNumber == localFileHeader.archiverVersionNumber && this.minVersionToExtract == localFileHeader.minVersionToExtract && this.hostOS == localFileHeader.hostOS && this.arjFlags == localFileHeader.arjFlags && this.method == localFileHeader.method && this.fileType == localFileHeader.fileType && this.reserved == localFileHeader.reserved && this.dateTimeModified == localFileHeader.dateTimeModified && this.compressedSize == localFileHeader.compressedSize && this.originalSize == localFileHeader.originalSize && this.originalCrc32 == localFileHeader.originalCrc32 && this.fileSpecPosition == localFileHeader.fileSpecPosition && this.fileAccessMode == localFileHeader.fileAccessMode && this.firstChapter == localFileHeader.firstChapter && this.lastChapter == localFileHeader.lastChapter && this.extendedFilePosition == localFileHeader.extendedFilePosition && this.dateTimeAccessed == localFileHeader.dateTimeAccessed && this.dateTimeCreated == localFileHeader.dateTimeCreated && this.originalSizeEvenForVolumes == localFileHeader.originalSizeEvenForVolumes && Objects.equals(this.name, localFileHeader.name) && Objects.equals(this.comment, localFileHeader.comment) && Arrays.deepEquals(this.extendedHeaders, localFileHeader.extendedHeaders);
    }
}
