package org.apache.ivy.core.event.retrieve;

import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.retrieve.RetrieveOptions;

/* loaded from: classes8.dex */
public class EndRetrieveEvent extends RetrieveEvent {
    public static final String NAME = "post-retrieve";
    public long duration;
    public int nbCopied;
    public int nbUpToDate;
    public long totalCopiedSize;

    public EndRetrieveEvent(ModuleRevisionId moduleRevisionId, String[] strArr, long j, int i, int i2, long j2, RetrieveOptions retrieveOptions) {
        super(NAME, moduleRevisionId, strArr, retrieveOptions);
        this.duration = j;
        this.nbCopied = i;
        this.nbUpToDate = i2;
        this.totalCopiedSize = j2;
        addAttribute("duration", String.valueOf(j));
        addAttribute("size", String.valueOf(j2));
        addAttribute("nbCopied", String.valueOf(i));
        addAttribute("nbUptodate", String.valueOf(i2));
    }

    public long getDuration() {
        return this.duration;
    }

    public int getNbCopied() {
        return this.nbCopied;
    }

    public int getNbUpToDate() {
        return this.nbUpToDate;
    }

    public long getTotalCopiedSize() {
        return this.totalCopiedSize;
    }
}
