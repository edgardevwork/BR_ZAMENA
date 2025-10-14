package org.apache.ivy.core.cache;

import java.text.ParseException;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.report.ArtifactDownloadReport;
import org.apache.ivy.core.resolve.ResolvedModuleRevision;
import org.apache.ivy.plugins.repository.ArtifactResourceResolver;
import org.apache.ivy.plugins.repository.Repository;
import org.apache.ivy.plugins.repository.Resource;
import org.apache.ivy.plugins.repository.ResourceDownloader;
import org.apache.ivy.plugins.resolver.DependencyResolver;
import org.apache.ivy.plugins.resolver.util.ResolvedResource;

/* loaded from: classes7.dex */
public interface RepositoryCacheManager {
    ResolvedModuleRevision cacheModuleDescriptor(DependencyResolver dependencyResolver, ResolvedResource resolvedResource, DependencyDescriptor dependencyDescriptor, Artifact artifact, ResourceDownloader resourceDownloader, CacheMetadataOptions cacheMetadataOptions) throws ParseException;

    void clean();

    ArtifactDownloadReport download(Artifact artifact, ArtifactResourceResolver artifactResourceResolver, ResourceDownloader resourceDownloader, CacheDownloadOptions cacheDownloadOptions);

    ArtifactDownloadReport downloadRepositoryResource(Resource resource, String str, String str2, String str3, CacheResourceOptions cacheResourceOptions, Repository repository);

    ResolvedModuleRevision findModuleInCache(DependencyDescriptor dependencyDescriptor, ModuleRevisionId moduleRevisionId, CacheMetadataOptions cacheMetadataOptions, String str);

    String getName();

    ArtifactOrigin getSavedArtifactOrigin(Artifact artifact);

    void originalToCachedModuleDescriptor(DependencyResolver dependencyResolver, ResolvedResource resolvedResource, Artifact artifact, ResolvedModuleRevision resolvedModuleRevision, ModuleDescriptorWriter moduleDescriptorWriter);

    void saveResolvedRevision(String str, ModuleRevisionId moduleRevisionId, String str2);

    @Deprecated
    void saveResolvedRevision(ModuleRevisionId moduleRevisionId, String str);

    void saveResolvers(ModuleDescriptor moduleDescriptor, String str, String str2);
}
