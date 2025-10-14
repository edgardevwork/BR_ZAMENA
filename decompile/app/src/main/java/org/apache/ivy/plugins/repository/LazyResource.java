package org.apache.ivy.plugins.repository;

/* loaded from: classes5.dex */
public abstract class LazyResource implements Resource {
    public long contentLength;
    public boolean exists;
    public boolean init = false;
    public long lastModified;
    public boolean local;
    public String name;

    public abstract void init();

    public LazyResource(String str) {
        this.name = str;
    }

    public final void checkInit() {
        if (this.init) {
            return;
        }
        init();
        this.init = true;
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public boolean exists() {
        checkInit();
        return this.exists;
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public long getContentLength() {
        checkInit();
        return this.contentLength;
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public long getLastModified() {
        checkInit();
        return this.lastModified;
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public String getName() {
        return this.name;
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public boolean isLocal() {
        checkInit();
        return this.local;
    }

    public String toString() {
        return getName();
    }

    public void setContentLength(long j) {
        this.contentLength = j;
    }

    public void setExists(boolean z) {
        this.exists = z;
    }

    public void setLastModified(long j) {
        this.lastModified = j;
    }

    public void setLocal(boolean z) {
        this.local = z;
    }

    public void init(Resource resource) {
        setContentLength(resource.getContentLength());
        setLocal(resource.isLocal());
        setLastModified(resource.getLastModified());
        setExists(resource.exists());
    }
}
