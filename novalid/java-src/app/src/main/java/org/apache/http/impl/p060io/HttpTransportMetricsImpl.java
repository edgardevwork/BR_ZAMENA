package org.apache.http.impl.p060io;

import org.apache.http.p061io.HttpTransportMetrics;

/* loaded from: classes8.dex */
public class HttpTransportMetricsImpl implements HttpTransportMetrics {
    public long bytesTransferred = 0;

    @Override // org.apache.http.p061io.HttpTransportMetrics
    public long getBytesTransferred() {
        return this.bytesTransferred;
    }

    public void setBytesTransferred(long j) {
        this.bytesTransferred = j;
    }

    public void incrementBytesTransferred(long j) {
        this.bytesTransferred += j;
    }

    @Override // org.apache.http.p061io.HttpTransportMetrics
    public void reset() {
        this.bytesTransferred = 0L;
    }
}
