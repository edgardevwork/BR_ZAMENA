package org.apache.ivy.plugins.repository.ssh;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ivy.plugins.repository.Resource;
import org.apache.ivy.util.Message;

/* loaded from: classes5.dex */
public class SshResource implements Resource {
    public boolean bExists;
    public long lastModified;
    public long len;
    public SshRepository repository;
    public boolean resolved;
    public String uri;

    @Override // org.apache.ivy.plugins.repository.Resource
    public boolean isLocal() {
        return false;
    }

    public SshResource() {
        this.uri = null;
        this.bExists = false;
        this.len = 0L;
        this.lastModified = 0L;
        this.repository = null;
        this.resolved = true;
    }

    public SshResource(SshRepository sshRepository, String str) {
        this.bExists = false;
        this.len = 0L;
        this.lastModified = 0L;
        this.uri = str;
        this.repository = sshRepository;
        this.resolved = false;
    }

    public SshResource(SshRepository sshRepository, String str, boolean z, long j, long j2) {
        this.uri = str;
        this.bExists = z;
        this.len = j;
        this.lastModified = j2;
        this.repository = sshRepository;
        this.resolved = true;
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public boolean exists() {
        if (!this.resolved) {
            resolve();
        }
        return this.bExists;
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public long getContentLength() {
        if (!this.resolved) {
            resolve();
        }
        return this.len;
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public long getLastModified() {
        if (!this.resolved) {
            resolve();
        }
        return this.lastModified;
    }

    public final void resolve() {
        Message.debug("SShResource: resolving " + this.uri);
        SshResource sshResourceResolveResource = this.repository.resolveResource(this.uri);
        this.len = sshResourceResolveResource.getContentLength();
        this.lastModified = sshResourceResolveResource.getLastModified();
        this.bExists = sshResourceResolveResource.exists();
        this.resolved = true;
        Message.debug("SShResource: resolved " + this);
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public String getName() {
        return this.uri;
    }

    public String toString() {
        return "SshResource:" + this.uri + " (" + this.len + ")]";
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public Resource clone(String str) {
        return new SshResource(this.repository, str);
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public InputStream openStream() throws IOException {
        return this.repository.openStream(this);
    }
}
