package org.apache.ivy.plugins.resolver;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import org.apache.ivy.core.cache.ArtifactOrigin;
import org.apache.ivy.core.cache.DefaultRepositoryCacheManager;
import org.apache.ivy.core.cache.RepositoryCacheManager;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.report.ArtifactDownloadReport;
import org.apache.ivy.core.report.DownloadReport;
import org.apache.ivy.core.report.DownloadStatus;
import org.apache.ivy.core.resolve.DownloadOptions;
import org.apache.ivy.core.resolve.IvyNode;
import org.apache.ivy.core.resolve.ResolveData;
import org.apache.ivy.core.resolve.ResolvedModuleRevision;
import org.apache.ivy.core.search.ModuleEntry;
import org.apache.ivy.core.search.OrganisationEntry;
import org.apache.ivy.core.search.RevisionEntry;
import org.apache.ivy.plugins.repository.file.FileResource;
import org.apache.ivy.plugins.resolver.util.ResolvedResource;
import org.apache.ivy.util.Message;

@Deprecated
/* loaded from: classes8.dex */
public class CacheResolver extends FileSystemResolver {
    public CacheResolver() {
    }

    public CacheResolver(ResolverSettings resolverSettings) {
        setSettings(resolverSettings);
        setName("cache");
    }

    @Override // org.apache.ivy.plugins.resolver.BasicResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public ResolvedModuleRevision getDependency(DependencyDescriptor dependencyDescriptor, ResolveData resolveData) throws ParseException {
        clearIvyAttempts();
        ModuleRevisionId dependencyRevisionId = dependencyDescriptor.getDependencyRevisionId();
        ResolvedModuleRevision resolvedModuleRevisionFindModuleInCache = getRepositoryCacheManager().findModuleInCache(dependencyDescriptor, dependencyRevisionId, getCacheOptions(resolveData), null);
        if (resolvedModuleRevisionFindModuleInCache != null) {
            Message.verbose("\t" + getName() + ": revision in cache: " + dependencyRevisionId);
            return resolvedModuleRevisionFindModuleInCache;
        }
        if (!getSettings().getVersionMatcher().isDynamic(dependencyRevisionId)) {
            Message.verbose("\t" + getName() + ": no ivy file in cache found for " + dependencyRevisionId);
            return null;
        }
        ensureConfigured();
        ResolvedResource resolvedResourceFindIvyFileRef = findIvyFileRef(dependencyDescriptor, resolveData);
        if (resolvedResourceFindIvyFileRef != null) {
            Message.verbose("\t" + getName() + ": found ivy file in cache for " + dependencyRevisionId);
            StringBuilder sb = new StringBuilder();
            sb.append("\t\t=> ");
            sb.append(resolvedResourceFindIvyFileRef);
            Message.verbose(sb.toString());
            ModuleRevisionId moduleRevisionIdNewInstance = ModuleRevisionId.newInstance(dependencyRevisionId, resolvedResourceFindIvyFileRef.getRevision());
            IvyNode node = resolveData.getNode(moduleRevisionIdNewInstance);
            if (node != null && node.getModuleRevision() != null) {
                Message.verbose("\t" + getName() + ": revision already resolved: " + moduleRevisionIdNewInstance);
                return node.getModuleRevision();
            }
            ResolvedModuleRevision resolvedModuleRevisionFindModuleInCache2 = getRepositoryCacheManager().findModuleInCache(dependencyDescriptor.clone(ModuleRevisionId.newInstance(dependencyDescriptor.getDependencyRevisionId(), resolvedResourceFindIvyFileRef.getRevision())), dependencyDescriptor.getDependencyRevisionId(), getCacheOptions(resolveData), null);
            if (resolvedModuleRevisionFindModuleInCache2 != null) {
                Message.verbose("\t" + getName() + ": revision in cache: " + moduleRevisionIdNewInstance);
                return resolvedModuleRevisionFindModuleInCache2;
            }
            Message.error("\t" + getName() + ": inconsistent cache: clean it and resolve again");
            return null;
        }
        Message.verbose("\t" + getName() + ": no ivy file in cache found for " + dependencyRevisionId);
        return null;
    }

    @Override // org.apache.ivy.plugins.resolver.RepositoryResolver, org.apache.ivy.plugins.resolver.BasicResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public DownloadReport download(Artifact[] artifactArr, DownloadOptions downloadOptions) {
        ensureConfigured();
        clearArtifactAttempts();
        DownloadReport downloadReport = new DownloadReport();
        for (Artifact artifact : artifactArr) {
            ArtifactDownloadReport artifactDownloadReport = new ArtifactDownloadReport(artifact);
            downloadReport.addArtifactReport(artifactDownloadReport);
            ResolvedResource artifactRef = getArtifactRef(artifact, null);
            if (artifactRef != null) {
                Message.verbose("\t[NOT REQUIRED] " + artifact);
                ArtifactOrigin artifactOrigin = new ArtifactOrigin(artifact, true, artifactRef.getResource().getName());
                File file = ((FileResource) artifactRef.getResource()).getFile();
                artifactDownloadReport.setDownloadStatus(DownloadStatus.f9964NO);
                artifactDownloadReport.setSize(file.length());
                artifactDownloadReport.setArtifactOrigin(artifactOrigin);
                artifactDownloadReport.setLocalFile(file);
            } else {
                artifactDownloadReport.setDownloadStatus(DownloadStatus.FAILED);
            }
        }
        return downloadReport;
    }

    @Override // org.apache.ivy.plugins.resolver.BasicResolver, org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public boolean exists(Artifact artifact) {
        ensureConfigured();
        return super.exists(artifact);
    }

    @Override // org.apache.ivy.plugins.resolver.BasicResolver, org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public ArtifactOrigin locate(Artifact artifact) {
        ensureConfigured();
        return super.locate(artifact);
    }

    @Override // org.apache.ivy.plugins.resolver.RepositoryResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public void publish(Artifact artifact, File file, boolean z) throws IOException {
        ensureConfigured();
        super.publish(artifact, file, z);
    }

    @Override // org.apache.ivy.plugins.resolver.BasicResolver, org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public OrganisationEntry[] listOrganisations() {
        ensureConfigured();
        return super.listOrganisations();
    }

    @Override // org.apache.ivy.plugins.resolver.BasicResolver, org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public ModuleEntry[] listModules(OrganisationEntry organisationEntry) {
        ensureConfigured();
        return super.listModules(organisationEntry);
    }

    @Override // org.apache.ivy.plugins.resolver.BasicResolver, org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public RevisionEntry[] listRevisions(ModuleEntry moduleEntry) {
        ensureConfigured();
        return super.listRevisions(moduleEntry);
    }

    @Override // org.apache.ivy.plugins.resolver.RepositoryResolver, org.apache.ivy.plugins.resolver.AbstractPatternsBasedResolver, org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public void dumpSettings() {
        Message.verbose("\t" + getName() + " [cache]");
    }

    public final void ensureConfigured() {
        if (getIvyPatterns().isEmpty()) {
            setIvyPatterns(new ArrayList());
            setArtifactPatterns(new ArrayList());
            for (RepositoryCacheManager repositoryCacheManager : getSettings().getRepositoryCacheManagers()) {
                if (repositoryCacheManager instanceof DefaultRepositoryCacheManager) {
                    DefaultRepositoryCacheManager defaultRepositoryCacheManager = (DefaultRepositoryCacheManager) repositoryCacheManager;
                    addIvyPattern(defaultRepositoryCacheManager.getBasedir().getAbsolutePath() + "/" + defaultRepositoryCacheManager.getIvyPattern());
                    addArtifactPattern(defaultRepositoryCacheManager.getBasedir().getAbsolutePath() + "/" + defaultRepositoryCacheManager.getArtifactPattern());
                } else {
                    Message.verbose(repositoryCacheManager + ": cache implementation is not a DefaultRepositoryCacheManager: unable to configure cache resolver with it");
                }
            }
        }
    }

    @Override // org.apache.ivy.plugins.resolver.FileSystemResolver, org.apache.ivy.plugins.resolver.RepositoryResolver, org.apache.ivy.plugins.resolver.AbstractResolver
    public String getTypeName() {
        return "cache";
    }
}
