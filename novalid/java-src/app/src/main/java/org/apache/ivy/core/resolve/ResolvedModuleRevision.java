package org.apache.ivy.core.resolve;

import java.util.Date;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.report.MetadataArtifactDownloadReport;
import org.apache.ivy.plugins.resolver.DependencyResolver;

/* loaded from: classes5.dex */
public class ResolvedModuleRevision {
    public DependencyResolver artifactResolver;
    public ModuleDescriptor descriptor;
    public boolean force;
    public MetadataArtifactDownloadReport report;
    public DependencyResolver resolver;

    public ResolvedModuleRevision(DependencyResolver dependencyResolver, DependencyResolver dependencyResolver2, ModuleDescriptor moduleDescriptor, MetadataArtifactDownloadReport metadataArtifactDownloadReport) {
        this.force = false;
        this.resolver = dependencyResolver;
        this.artifactResolver = dependencyResolver2;
        this.descriptor = moduleDescriptor;
        this.report = metadataArtifactDownloadReport;
    }

    public ResolvedModuleRevision(DependencyResolver dependencyResolver, DependencyResolver dependencyResolver2, ModuleDescriptor moduleDescriptor, MetadataArtifactDownloadReport metadataArtifactDownloadReport, boolean z) {
        this.resolver = dependencyResolver;
        this.artifactResolver = dependencyResolver2;
        this.descriptor = moduleDescriptor;
        this.report = metadataArtifactDownloadReport;
        this.force = z;
    }

    public ModuleRevisionId getId() {
        return this.descriptor.getResolvedModuleRevisionId();
    }

    public Date getPublicationDate() {
        return this.descriptor.getResolvedPublicationDate();
    }

    public ModuleDescriptor getDescriptor() {
        return this.descriptor;
    }

    public DependencyResolver getResolver() {
        return this.resolver;
    }

    public DependencyResolver getArtifactResolver() {
        return this.artifactResolver;
    }

    public MetadataArtifactDownloadReport getReport() {
        return this.report;
    }

    public boolean isForce() {
        return this.force;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ResolvedModuleRevision) && ((ResolvedModuleRevision) obj).getId().equals(getId());
    }

    public int hashCode() {
        return getId().hashCode();
    }

    public String toString() {
        return getId().toString();
    }
}
