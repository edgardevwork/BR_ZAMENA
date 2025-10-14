package org.apache.ivy.core.cache;

/* loaded from: classes7.dex */
public class CacheResourceOptions extends CacheDownloadOptions {
    public long ttl = 3600000;

    public void setTtl(long j) {
        this.ttl = j;
    }

    public long getTtl() {
        return this.ttl;
    }
}
