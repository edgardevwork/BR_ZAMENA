package org.apache.commons.compress.archivers.zip;

import java.util.zip.ZipException;

/* loaded from: classes5.dex */
public class Zip64RequiredException extends ZipException {
    public static final String ARCHIVE_TOO_BIG_MESSAGE = "Archive's size exceeds the limit of 4GByte.";
    public static final String NUMBER_OF_THE_DISK_OF_CENTRAL_DIRECTORY_TOO_BIG_MESSAGE = "Number of the disk with the start of Central Directory exceeds the limit of 65535.";
    public static final String NUMBER_OF_THIS_DISK_TOO_BIG_MESSAGE = "Number of the disk of End Of Central Directory exceeds the limit of 65535.";
    public static final String SIZE_OF_CENTRAL_DIRECTORY_TOO_BIG_MESSAGE = "The size of the entire central directory exceeds the limit of 4GByte.";
    public static final String TOO_MANY_ENTRIES_MESSAGE = "Archive contains more than 65535 entries.";
    public static final String TOO_MANY_ENTRIES_ON_THIS_DISK_MESSAGE = "Number of entries on this disk exceeds the limit of 65535.";
    public static final long serialVersionUID = 20110809;

    public static String getEntryTooBigMessage(ZipArchiveEntry zipArchiveEntry) {
        return zipArchiveEntry.getName() + "'s size exceeds the limit of 4GByte.";
    }

    public Zip64RequiredException(String str) {
        super(str);
    }
}
