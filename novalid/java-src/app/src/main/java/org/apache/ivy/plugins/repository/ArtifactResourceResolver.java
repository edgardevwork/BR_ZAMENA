package org.apache.ivy.plugins.repository;

import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.plugins.resolver.util.ResolvedResource;

/* loaded from: classes6.dex */
public interface ArtifactResourceResolver {
    ResolvedResource resolve(Artifact artifact);
}
