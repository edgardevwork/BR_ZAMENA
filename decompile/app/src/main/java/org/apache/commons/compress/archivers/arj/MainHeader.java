package org.apache.commons.compress.archivers.arj;

import java.util.Arrays;

/* loaded from: classes5.dex */
public class MainHeader {
    public long archiveSize;
    public int archiverVersionNumber;
    public int arjFlags;
    public int arjFlags2;
    public int arjProtectionFactor;
    public String comment;
    public int dateTimeCreated;
    public int dateTimeModified;
    public int encryptionVersion;
    public byte[] extendedHeaderBytes;
    public int fileSpecPosition;
    public int fileType;
    public int hostOS;
    public int lastChapter;
    public int minVersionToExtract;
    public String name;
    public int reserved;
    public int securityEnvelopeFilePosition;
    public int securityEnvelopeLength;
    public int securityVersion;

    public static class Flags {
        public static final int ALTNAME = 128;
        public static final int ARJPROT = 8;
        public static final int BACKUP = 32;
        public static final int GARBLED = 1;
        public static final int OLD_SECURED_NEW_ANSI_PAGE = 2;
        public static final int PATHSYM = 16;
        public static final int SECURED = 64;
        public static final int VOLUME = 4;
    }

    public static class HostOS {
        public static final int AMIGA = 3;
        public static final int APPLE_GS = 6;
        public static final int ATARI_ST = 7;
        public static final int MAC_OS = 4;
        public static final int MS_DOS = 0;
        public static final int NeXT = 8;
        public static final int OS2 = 5;
        public static final int PRIMOS = 1;
        public static final int UNIX = 2;
        public static final int VAX_VMS = 9;
        public static final int WIN32 = 11;
        public static final int WIN95 = 10;
    }

    public String toString() {
        return "MainHeader [archiverVersionNumber=" + this.archiverVersionNumber + ", minVersionToExtract=" + this.minVersionToExtract + ", hostOS=" + this.hostOS + ", arjFlags=" + this.arjFlags + ", securityVersion=" + this.securityVersion + ", fileType=" + this.fileType + ", reserved=" + this.reserved + ", dateTimeCreated=" + this.dateTimeCreated + ", dateTimeModified=" + this.dateTimeModified + ", archiveSize=" + this.archiveSize + ", securityEnvelopeFilePosition=" + this.securityEnvelopeFilePosition + ", fileSpecPosition=" + this.fileSpecPosition + ", securityEnvelopeLength=" + this.securityEnvelopeLength + ", encryptionVersion=" + this.encryptionVersion + ", lastChapter=" + this.lastChapter + ", arjProtectionFactor=" + this.arjProtectionFactor + ", arjFlags2=" + this.arjFlags2 + ", name=" + this.name + ", comment=" + this.comment + ", extendedHeaderBytes=" + Arrays.toString(this.extendedHeaderBytes) + "]";
    }
}
