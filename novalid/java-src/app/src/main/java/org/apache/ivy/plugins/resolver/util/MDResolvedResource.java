package org.apache.ivy.plugins.resolver.util;

import org.apache.ivy.core.resolve.ResolvedModuleRevision;
import org.apache.ivy.plugins.repository.Resource;

/* loaded from: classes5.dex */
public class MDResolvedResource extends ResolvedResource {
    public ResolvedModuleRevision rmr;

    public MDResolvedResource(Resource resource, String str, ResolvedModuleRevision resolvedModuleRevision) {
        super(resource, str);
        this.rmr = resolvedModuleRevision;
    }

    public ResolvedModuleRevision getResolvedModuleRevision() {
        return this.rmr;
    }
}
