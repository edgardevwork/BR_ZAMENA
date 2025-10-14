package org.apache.ivy.util.filter;

import java.util.ArrayList;
import java.util.Collection;
import org.apache.ivy.core.module.descriptor.Artifact;

/* loaded from: classes5.dex */
public class ArtifactTypeFilter implements Filter<Artifact> {
    public Collection<String> acceptedTypes;

    public ArtifactTypeFilter(Collection<String> collection) {
        this.acceptedTypes = new ArrayList(collection);
    }

    @Override // org.apache.ivy.util.filter.Filter
    public boolean accept(Artifact artifact) {
        return this.acceptedTypes.contains(artifact.getType());
    }
}
