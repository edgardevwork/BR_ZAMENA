package org.apache.ivy.core.report;

import org.apache.ivy.core.event.publish.EndArtifactPublishEvent;

/* loaded from: classes7.dex */
public final class DownloadStatus {
    public String name;

    /* renamed from: NO */
    public static final DownloadStatus f9964NO = new DownloadStatus("no");
    public static final DownloadStatus SUCCESSFUL = new DownloadStatus(EndArtifactPublishEvent.STATUS_SUCCESSFUL);
    public static final DownloadStatus FAILED = new DownloadStatus(EndArtifactPublishEvent.STATUS_FAILED);

    public DownloadStatus(String str) {
        this.name = str;
    }

    public static final DownloadStatus fromString(String str) {
        DownloadStatus downloadStatus = f9964NO;
        if (downloadStatus.name.equals(str)) {
            return downloadStatus;
        }
        DownloadStatus downloadStatus2 = SUCCESSFUL;
        if (downloadStatus2.name.equals(str)) {
            return downloadStatus2;
        }
        DownloadStatus downloadStatus3 = FAILED;
        if (downloadStatus3.name.equals(str)) {
            return downloadStatus3;
        }
        throw new IllegalArgumentException("unknown download status '" + str + "'");
    }

    public String toString() {
        return this.name;
    }
}
