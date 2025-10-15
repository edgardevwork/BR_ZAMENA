package org.apache.commons.compress.changes;

import java.io.InputStream;
import java.util.Objects;
import org.apache.commons.compress.archivers.ArchiveEntry;

/* loaded from: classes6.dex */
public class Change {
    public static final int TYPE_ADD = 2;
    public static final int TYPE_DELETE = 1;
    public static final int TYPE_DELETE_DIR = 4;
    public static final int TYPE_MOVE = 3;
    public final ArchiveEntry entry;
    public final InputStream input;
    public final boolean replaceMode;
    public final String targetFile;
    public final int type;

    public Change(String str, int i) {
        Objects.requireNonNull(str, "fileName");
        this.targetFile = str;
        this.type = i;
        this.input = null;
        this.entry = null;
        this.replaceMode = true;
    }

    public Change(ArchiveEntry archiveEntry, InputStream inputStream, boolean z) {
        Objects.requireNonNull(archiveEntry, "archiveEntry");
        Objects.requireNonNull(inputStream, "inputStream");
        this.entry = archiveEntry;
        this.input = inputStream;
        this.type = 2;
        this.targetFile = null;
        this.replaceMode = z;
    }

    public ArchiveEntry getEntry() {
        return this.entry;
    }

    public InputStream getInput() {
        return this.input;
    }

    public String targetFile() {
        return this.targetFile;
    }

    public int type() {
        return this.type;
    }

    public boolean isReplaceMode() {
        return this.replaceMode;
    }
}
