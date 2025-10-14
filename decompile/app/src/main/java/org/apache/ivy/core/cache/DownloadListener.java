package org.apache.ivy.core.cache;

import java.io.File;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.report.ArtifactDownloadReport;
import org.apache.ivy.plugins.resolver.util.ResolvedResource;

/* loaded from: classes7.dex */
public interface DownloadListener {
    void endArtifactDownload(RepositoryCacheManager repositoryCacheManager, Artifact artifact, ArtifactDownloadReport artifactDownloadReport, File file);

    void needArtifact(RepositoryCacheManager repositoryCacheManager, Artifact artifact);

    void startArtifactDownload(RepositoryCacheManager repositoryCacheManager, ResolvedResource resolvedResource, Artifact artifact, ArtifactOrigin artifactOrigin);
}
