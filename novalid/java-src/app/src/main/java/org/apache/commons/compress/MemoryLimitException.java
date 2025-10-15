package org.apache.commons.compress;

import java.io.IOException;

/* loaded from: classes5.dex */
public class MemoryLimitException extends IOException {
    public static final long serialVersionUID = 1;
    public final int memoryLimitInKb;
    public final long memoryNeededInKb;

    public MemoryLimitException(long j, int i) {
        super(buildMessage(j, i));
        this.memoryNeededInKb = j;
        this.memoryLimitInKb = i;
    }

    public MemoryLimitException(long j, int i, Exception exc) {
        super(buildMessage(j, i), exc);
        this.memoryNeededInKb = j;
        this.memoryLimitInKb = i;
    }

    public long getMemoryNeededInKb() {
        return this.memoryNeededInKb;
    }

    public int getMemoryLimitInKb() {
        return this.memoryLimitInKb;
    }

    public static String buildMessage(long j, int i) {
        return j + " kb of memory would be needed; limit was " + i + " kb. If the file is not corrupt, consider increasing the memory limit.";
    }
}
