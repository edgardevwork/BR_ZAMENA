package org.apache.ivy.plugins.resolver;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Map;
import org.apache.ivy.core.cache.ArtifactOrigin;
import org.apache.ivy.core.cache.RepositoryCacheManager;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.report.ArtifactDownloadReport;
import org.apache.ivy.core.report.DownloadReport;
import org.apache.ivy.core.resolve.DownloadOptions;
import org.apache.ivy.core.resolve.ResolveData;
import org.apache.ivy.core.resolve.ResolvedModuleRevision;
import org.apache.ivy.core.search.ModuleEntry;
import org.apache.ivy.core.search.OrganisationEntry;
import org.apache.ivy.core.search.RevisionEntry;
import org.apache.ivy.plugins.namespace.Namespace;
import org.apache.ivy.plugins.resolver.util.ResolvedResource;

/* loaded from: classes6.dex */
public interface DependencyResolver {
    void abortPublishTransaction() throws IOException;

    void beginPublishTransaction(ModuleRevisionId moduleRevisionId, boolean z) throws IOException;

    void commitPublishTransaction() throws IOException;

    ArtifactDownloadReport download(ArtifactOrigin artifactOrigin, DownloadOptions downloadOptions);

    DownloadReport download(Artifact[] artifactArr, DownloadOptions downloadOptions);

    void dumpSettings();

    boolean exists(Artifact artifact);

    ResolvedResource findIvyFileRef(DependencyDescriptor dependencyDescriptor, ResolveData resolveData);

    ResolvedModuleRevision getDependency(DependencyDescriptor dependencyDescriptor, ResolveData resolveData) throws ParseException;

    String getName();

    Namespace getNamespace();

    RepositoryCacheManager getRepositoryCacheManager();

    ModuleEntry[] listModules(OrganisationEntry organisationEntry);

    OrganisationEntry[] listOrganisations();

    RevisionEntry[] listRevisions(ModuleEntry moduleEntry);

    String[] listTokenValues(String str, Map<String, String> map);

    Map<String, String>[] listTokenValues(String[] strArr, Map<String, Object> map);

    ArtifactOrigin locate(Artifact artifact);

    void publish(Artifact artifact, File file, boolean z) throws IOException;

    void reportFailure();

    void reportFailure(Artifact artifact);

    void setName(String str);

    void setSettings(ResolverSettings resolverSettings);
}
