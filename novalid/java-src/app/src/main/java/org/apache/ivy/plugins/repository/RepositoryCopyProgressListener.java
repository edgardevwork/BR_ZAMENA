package org.apache.ivy.plugins.repository;

import org.apache.ivy.util.CopyProgressEvent;
import org.apache.ivy.util.CopyProgressListener;

/* loaded from: classes5.dex */
public class RepositoryCopyProgressListener implements CopyProgressListener {
    public final AbstractRepository repository;
    public Long totalLength = null;

    public RepositoryCopyProgressListener(AbstractRepository abstractRepository) {
        this.repository = abstractRepository;
    }

    @Override // org.apache.ivy.util.CopyProgressListener
    public void start(CopyProgressEvent copyProgressEvent) {
        Long l = this.totalLength;
        if (l == null) {
            this.repository.fireTransferStarted();
        } else {
            this.repository.fireTransferStarted(l.longValue());
        }
    }

    @Override // org.apache.ivy.util.CopyProgressListener
    public void progress(CopyProgressEvent copyProgressEvent) {
        this.repository.fireTransferProgress(copyProgressEvent.getReadBytes());
    }

    @Override // org.apache.ivy.util.CopyProgressListener
    public void end(CopyProgressEvent copyProgressEvent) {
        this.repository.fireTransferProgress(copyProgressEvent.getReadBytes());
        this.repository.fireTransferCompleted();
    }

    public Long getTotalLength() {
        return this.totalLength;
    }

    public void setTotalLength(Long l) {
        this.totalLength = l;
    }
}
