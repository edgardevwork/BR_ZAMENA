package org.apache.http;

/* loaded from: classes7.dex */
public interface HttpConnectionMetrics {
    Object getMetric(String str);

    long getReceivedBytesCount();

    long getRequestCount();

    long getResponseCount();

    long getSentBytesCount();

    void reset();
}
