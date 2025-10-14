package org.apache.ivy.plugins.repository;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class BasicResource implements Resource {
    public long contentLength;
    public boolean exists;
    public long lastModified;
    public boolean local;
    public String name;

    public BasicResource(String str, boolean z, long j, long j2, boolean z2) {
        this.name = str;
        this.exists = z;
        this.contentLength = j;
        this.lastModified = j2;
        this.local = z2;
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public Resource clone(String str) {
        throw new UnsupportedOperationException("basic resource do not support the clone method");
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public boolean exists() {
        return this.exists;
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public long getContentLength() {
        return this.contentLength;
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public long getLastModified() {
        return this.lastModified;
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public String getName() {
        return this.name;
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public boolean isLocal() {
        return this.local;
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public InputStream openStream() throws IOException {
        throw new UnsupportedOperationException("basic resource do not support the openStream method");
    }

    public String toString() {
        return getName();
    }
}
