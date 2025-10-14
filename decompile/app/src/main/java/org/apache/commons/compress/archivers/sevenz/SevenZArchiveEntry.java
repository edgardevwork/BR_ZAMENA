package org.apache.commons.compress.archivers.sevenz;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.TimeZone;
import java.util.function.Consumer;
import org.apache.commons.compress.archivers.ArchiveEntry;

/* loaded from: classes8.dex */
public class SevenZArchiveEntry implements ArchiveEntry {
    public static final SevenZArchiveEntry[] EMPTY_SEVEN_Z_ARCHIVE_ENTRY_ARRAY = new SevenZArchiveEntry[0];
    public long accessDate;
    public long compressedCrc;
    public long compressedSize;
    public Iterable<? extends SevenZMethodConfiguration> contentMethods;
    public long crc;
    public long creationDate;
    public boolean hasAccessDate;
    public boolean hasCrc;
    public boolean hasCreationDate;
    public boolean hasLastModifiedDate;
    public boolean hasStream;
    public boolean hasWindowsAttributes;
    public boolean isAntiItem;
    public boolean isDirectory;
    public long lastModifiedDate;
    public String name;
    public long size;
    public int windowsAttributes;

    @Override // org.apache.commons.compress.archivers.ArchiveEntry
    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public boolean hasStream() {
        return this.hasStream;
    }

    public void setHasStream(boolean z) {
        this.hasStream = z;
    }

    @Override // org.apache.commons.compress.archivers.ArchiveEntry
    public boolean isDirectory() {
        return this.isDirectory;
    }

    public void setDirectory(boolean z) {
        this.isDirectory = z;
    }

    public boolean isAntiItem() {
        return this.isAntiItem;
    }

    public void setAntiItem(boolean z) {
        this.isAntiItem = z;
    }

    public boolean getHasCreationDate() {
        return this.hasCreationDate;
    }

    public void setHasCreationDate(boolean z) {
        this.hasCreationDate = z;
    }

    public Date getCreationDate() {
        if (this.hasCreationDate) {
            return ntfsTimeToJavaTime(this.creationDate);
        }
        throw new UnsupportedOperationException("The entry doesn't have this timestamp");
    }

    public void setCreationDate(long j) {
        this.creationDate = j;
    }

    public void setCreationDate(Date date) {
        boolean z = date != null;
        this.hasCreationDate = z;
        if (z) {
            this.creationDate = javaTimeToNtfsTime(date);
        }
    }

    public boolean getHasLastModifiedDate() {
        return this.hasLastModifiedDate;
    }

    public void setHasLastModifiedDate(boolean z) {
        this.hasLastModifiedDate = z;
    }

    @Override // org.apache.commons.compress.archivers.ArchiveEntry
    public Date getLastModifiedDate() {
        if (this.hasLastModifiedDate) {
            return ntfsTimeToJavaTime(this.lastModifiedDate);
        }
        throw new UnsupportedOperationException("The entry doesn't have this timestamp");
    }

    public void setLastModifiedDate(long j) {
        this.lastModifiedDate = j;
    }

    public void setLastModifiedDate(Date date) {
        boolean z = date != null;
        this.hasLastModifiedDate = z;
        if (z) {
            this.lastModifiedDate = javaTimeToNtfsTime(date);
        }
    }

    public boolean getHasAccessDate() {
        return this.hasAccessDate;
    }

    public void setHasAccessDate(boolean z) {
        this.hasAccessDate = z;
    }

    public Date getAccessDate() {
        if (this.hasAccessDate) {
            return ntfsTimeToJavaTime(this.accessDate);
        }
        throw new UnsupportedOperationException("The entry doesn't have this timestamp");
    }

    public void setAccessDate(long j) {
        this.accessDate = j;
    }

    public void setAccessDate(Date date) {
        boolean z = date != null;
        this.hasAccessDate = z;
        if (z) {
            this.accessDate = javaTimeToNtfsTime(date);
        }
    }

    public boolean getHasWindowsAttributes() {
        return this.hasWindowsAttributes;
    }

    public void setHasWindowsAttributes(boolean z) {
        this.hasWindowsAttributes = z;
    }

    public int getWindowsAttributes() {
        return this.windowsAttributes;
    }

    public void setWindowsAttributes(int i) {
        this.windowsAttributes = i;
    }

    public boolean getHasCrc() {
        return this.hasCrc;
    }

    public void setHasCrc(boolean z) {
        this.hasCrc = z;
    }

    @Deprecated
    public int getCrc() {
        return (int) this.crc;
    }

    @Deprecated
    public void setCrc(int i) {
        this.crc = i;
    }

    public long getCrcValue() {
        return this.crc;
    }

    public void setCrcValue(long j) {
        this.crc = j;
    }

    @Deprecated
    public int getCompressedCrc() {
        return (int) this.compressedCrc;
    }

    @Deprecated
    public void setCompressedCrc(int i) {
        this.compressedCrc = i;
    }

    public long getCompressedCrcValue() {
        return this.compressedCrc;
    }

    public void setCompressedCrcValue(long j) {
        this.compressedCrc = j;
    }

    @Override // org.apache.commons.compress.archivers.ArchiveEntry
    public long getSize() {
        return this.size;
    }

    public void setSize(long j) {
        this.size = j;
    }

    public long getCompressedSize() {
        return this.compressedSize;
    }

    public void setCompressedSize(long j) {
        this.compressedSize = j;
    }

    public void setContentMethods(Iterable<? extends SevenZMethodConfiguration> iterable) {
        if (iterable != null) {
            final LinkedList linkedList = new LinkedList();
            iterable.forEach(new Consumer() { // from class: org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry$$ExternalSyntheticLambda0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    linkedList.addLast((SevenZMethodConfiguration) obj);
                }
            });
            this.contentMethods = Collections.unmodifiableList(linkedList);
            return;
        }
        this.contentMethods = null;
    }

    public void setContentMethods(SevenZMethodConfiguration... sevenZMethodConfigurationArr) {
        setContentMethods(Arrays.asList(sevenZMethodConfigurationArr));
    }

    public Iterable<? extends SevenZMethodConfiguration> getContentMethods() {
        return this.contentMethods;
    }

    public int hashCode() {
        String name = getName();
        if (name == null) {
            return 0;
        }
        return name.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SevenZArchiveEntry sevenZArchiveEntry = (SevenZArchiveEntry) obj;
        return Objects.equals(this.name, sevenZArchiveEntry.name) && this.hasStream == sevenZArchiveEntry.hasStream && this.isDirectory == sevenZArchiveEntry.isDirectory && this.isAntiItem == sevenZArchiveEntry.isAntiItem && this.hasCreationDate == sevenZArchiveEntry.hasCreationDate && this.hasLastModifiedDate == sevenZArchiveEntry.hasLastModifiedDate && this.hasAccessDate == sevenZArchiveEntry.hasAccessDate && this.creationDate == sevenZArchiveEntry.creationDate && this.lastModifiedDate == sevenZArchiveEntry.lastModifiedDate && this.accessDate == sevenZArchiveEntry.accessDate && this.hasWindowsAttributes == sevenZArchiveEntry.hasWindowsAttributes && this.windowsAttributes == sevenZArchiveEntry.windowsAttributes && this.hasCrc == sevenZArchiveEntry.hasCrc && this.crc == sevenZArchiveEntry.crc && this.compressedCrc == sevenZArchiveEntry.compressedCrc && this.size == sevenZArchiveEntry.size && this.compressedSize == sevenZArchiveEntry.compressedSize && equalSevenZMethods(this.contentMethods, sevenZArchiveEntry.contentMethods);
    }

    public static Date ntfsTimeToJavaTime(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("GMT+0"));
        calendar.set(1601, 0, 1, 0, 0, 0);
        calendar.set(14, 0);
        return new Date(calendar.getTimeInMillis() + (j / 10000));
    }

    public static long javaTimeToNtfsTime(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("GMT+0"));
        calendar.set(1601, 0, 1, 0, 0, 0);
        calendar.set(14, 0);
        return (date.getTime() - calendar.getTimeInMillis()) * 10000;
    }

    public final boolean equalSevenZMethods(Iterable<? extends SevenZMethodConfiguration> iterable, Iterable<? extends SevenZMethodConfiguration> iterable2) {
        if (iterable == null) {
            return iterable2 == null;
        }
        if (iterable2 == null) {
            return false;
        }
        Iterator<? extends SevenZMethodConfiguration> it = iterable2.iterator();
        for (SevenZMethodConfiguration sevenZMethodConfiguration : iterable) {
            if (!it.hasNext() || !sevenZMethodConfiguration.equals(it.next())) {
                return false;
            }
        }
        return !it.hasNext();
    }
}
