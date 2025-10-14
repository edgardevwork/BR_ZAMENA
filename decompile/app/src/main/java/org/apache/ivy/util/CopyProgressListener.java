package org.apache.ivy.util;

/* loaded from: classes8.dex */
public interface CopyProgressListener {
    void end(CopyProgressEvent copyProgressEvent);

    void progress(CopyProgressEvent copyProgressEvent);

    void start(CopyProgressEvent copyProgressEvent);
}
