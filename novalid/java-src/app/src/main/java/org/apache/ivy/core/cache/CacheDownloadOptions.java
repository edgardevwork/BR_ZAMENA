package org.apache.ivy.core.cache;

/* loaded from: classes7.dex */
public class CacheDownloadOptions {
    public DownloadListener listener = null;
    public boolean force = false;

    public DownloadListener getListener() {
        return this.listener;
    }

    public CacheDownloadOptions setListener(DownloadListener downloadListener) {
        this.listener = downloadListener;
        return this;
    }

    public boolean isForce() {
        return this.force;
    }

    public CacheDownloadOptions setForce(boolean z) {
        this.force = z;
        return this;
    }
}
