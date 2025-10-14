package org.apache.ivy.plugins.repository.sftp;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ivy.plugins.repository.Resource;

/* loaded from: classes5.dex */
public class SFTPResource implements Resource {
    public transient long contentLength;
    public transient boolean exists;
    public transient boolean init = false;
    public transient long lastModified;
    public String path;
    public SFTPRepository repository;

    @Override // org.apache.ivy.plugins.repository.Resource
    public boolean isLocal() {
        return false;
    }

    public SFTPResource(SFTPRepository sFTPRepository, String str) {
        this.repository = sFTPRepository;
        this.path = str;
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public String getName() {
        return this.path;
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public Resource clone(String str) {
        return new SFTPResource(this.repository, str);
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public long getLastModified() {
        init();
        return this.lastModified;
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public long getContentLength() {
        init();
        return this.contentLength;
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public boolean exists() {
        init();
        return this.exists;
    }

    private void init() {
        if (this.init) {
            return;
        }
        Resource resourceResolveResource = this.repository.resolveResource(this.path);
        this.contentLength = resourceResolveResource.getContentLength();
        this.lastModified = resourceResolveResource.getLastModified();
        this.exists = resourceResolveResource.exists();
        this.init = true;
    }

    public String toString() {
        return getName();
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public InputStream openStream() throws IOException {
        return this.repository.openStream(this);
    }
}
