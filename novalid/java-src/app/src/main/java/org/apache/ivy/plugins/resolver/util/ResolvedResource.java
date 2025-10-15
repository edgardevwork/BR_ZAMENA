package org.apache.ivy.plugins.resolver.util;

import org.apache.ivy.plugins.latest.ArtifactInfo;
import org.apache.ivy.plugins.repository.Resource;

/* loaded from: classes5.dex */
public class ResolvedResource implements ArtifactInfo {
    public Resource res;
    public String rev;

    public ResolvedResource(Resource resource, String str) {
        this.res = resource;
        this.rev = str;
    }

    @Override // org.apache.ivy.plugins.latest.ArtifactInfo
    public String getRevision() {
        return this.rev;
    }

    public Resource getResource() {
        return this.res;
    }

    public String toString() {
        return this.res + " (" + this.rev + ")";
    }

    @Override // org.apache.ivy.plugins.latest.ArtifactInfo
    public long getLastModified() {
        return getResource().getLastModified();
    }
}
