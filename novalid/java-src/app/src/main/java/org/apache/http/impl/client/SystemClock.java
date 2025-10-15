package org.apache.http.impl.client;

/* loaded from: classes5.dex */
public class SystemClock implements Clock {
    @Override // org.apache.http.impl.client.Clock
    public long getCurrentTime() {
        return System.currentTimeMillis();
    }
}
