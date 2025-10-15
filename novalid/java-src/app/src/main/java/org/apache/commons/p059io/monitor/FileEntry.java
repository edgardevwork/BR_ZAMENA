package org.apache.commons.p059io.monitor;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import org.apache.commons.p059io.FileUtils;

/* loaded from: classes6.dex */
public class FileEntry implements Serializable {
    public static final FileEntry[] EMPTY_FILE_ENTRY_ARRAY = new FileEntry[0];
    public static final long serialVersionUID = -2505664948818681153L;
    public FileEntry[] children;
    public boolean directory;
    public boolean exists;
    public final File file;
    public long lastModified;
    public long length;
    public String name;
    public final FileEntry parent;

    public FileEntry(File file) {
        this(null, file);
    }

    public FileEntry(FileEntry fileEntry, File file) {
        if (file == null) {
            throw new IllegalArgumentException("File is missing");
        }
        this.file = file;
        this.parent = fileEntry;
        this.name = file.getName();
    }

    public boolean refresh(File file) {
        boolean z = this.exists;
        long j = this.lastModified;
        boolean z2 = this.directory;
        long j2 = this.length;
        this.name = file.getName();
        boolean zExists = Files.exists(file.toPath(), new LinkOption[0]);
        this.exists = zExists;
        this.directory = zExists && file.isDirectory();
        long length = 0;
        try {
            this.lastModified = this.exists ? FileUtils.lastModified(file) : 0L;
        } catch (IOException unused) {
            this.lastModified = 0L;
        }
        if (this.exists && !this.directory) {
            length = file.length();
        }
        this.length = length;
        return (this.exists == z && this.lastModified == j && this.directory == z2 && length == j2) ? false : true;
    }

    public FileEntry newChildInstance(File file) {
        return new FileEntry(this, file);
    }

    public FileEntry getParent() {
        return this.parent;
    }

    public int getLevel() {
        FileEntry fileEntry = this.parent;
        if (fileEntry == null) {
            return 0;
        }
        return fileEntry.getLevel() + 1;
    }

    public FileEntry[] getChildren() {
        FileEntry[] fileEntryArr = this.children;
        return fileEntryArr != null ? fileEntryArr : EMPTY_FILE_ENTRY_ARRAY;
    }

    public void setChildren(FileEntry... fileEntryArr) {
        this.children = fileEntryArr;
    }

    public File getFile() {
        return this.file;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public long getLastModified() {
        return this.lastModified;
    }

    public void setLastModified(long j) {
        this.lastModified = j;
    }

    public long getLength() {
        return this.length;
    }

    public void setLength(long j) {
        this.length = j;
    }

    public boolean isExists() {
        return this.exists;
    }

    public void setExists(boolean z) {
        this.exists = z;
    }

    public boolean isDirectory() {
        return this.directory;
    }

    public void setDirectory(boolean z) {
        this.directory = z;
    }
}
