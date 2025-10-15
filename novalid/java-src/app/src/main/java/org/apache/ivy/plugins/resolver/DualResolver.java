package org.apache.ivy.plugins.resolver;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;
import org.apache.ivy.core.cache.ArtifactOrigin;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.report.ArtifactDownloadReport;
import org.apache.ivy.core.report.DownloadReport;
import org.apache.ivy.core.resolve.DownloadOptions;
import org.apache.ivy.core.resolve.ResolveData;
import org.apache.ivy.core.resolve.ResolvedModuleRevision;
import org.apache.ivy.plugins.resolver.util.ResolvedResource;
import org.apache.ivy.util.Message;
import org.jfrog.build.extractor.clientConfiguration.ClientConfigurationFields;

/* loaded from: classes5.dex */
public class DualResolver extends AbstractResolver {
    public static final String DESCRIPTOR_OPTIONAL = "optional";
    public static final String DESCRIPTOR_REQUIRED = "required";
    public boolean allownomd = true;
    public DependencyResolver artifactResolver;
    public DependencyResolver ivyResolver;

    public void add(DependencyResolver dependencyResolver) {
        if (this.ivyResolver == null) {
            this.ivyResolver = dependencyResolver;
        } else {
            if (this.artifactResolver == null) {
                this.artifactResolver = dependencyResolver;
                return;
            }
            throw new IllegalStateException("exactly two resolvers must be added: ivy(1) and artifact(2) one");
        }
    }

    @Override // org.apache.ivy.plugins.resolver.DependencyResolver
    public ResolvedModuleRevision getDependency(DependencyDescriptor dependencyDescriptor, ResolveData resolveData) throws ParseException {
        if (this.ivyResolver == null || this.artifactResolver == null) {
            throw new IllegalStateException("exactly two resolvers must be added: ivy(1) and artifact(2) one");
        }
        ResolvedModuleRevision currentResolvedModuleRevision = resolveData.getCurrentResolvedModuleRevision();
        ResolveData resolveData2 = new ResolveData(resolveData, doValidate(resolveData));
        ResolvedModuleRevision dependency = this.ivyResolver.getDependency(dependencyDescriptor, resolveData2);
        if (dependency != null) {
            return dependency == currentResolvedModuleRevision ? dependency : new ResolvedModuleRevision(dependency.getResolver(), this, dependency.getDescriptor(), dependency.getReport(), dependency.isForce());
        }
        checkInterrupted();
        if (!isAllownomd()) {
            return null;
        }
        Message.verbose("ivy resolver didn't find " + dependencyDescriptor + ": trying with artifact resolver");
        return this.artifactResolver.getDependency(dependencyDescriptor, resolveData2);
    }

    @Override // org.apache.ivy.plugins.resolver.DependencyResolver
    public ResolvedResource findIvyFileRef(DependencyDescriptor dependencyDescriptor, ResolveData resolveData) {
        return this.ivyResolver.findIvyFileRef(dependencyDescriptor, resolveData);
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public void reportFailure() {
        this.ivyResolver.reportFailure();
        this.artifactResolver.reportFailure();
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public void reportFailure(Artifact artifact) {
        this.ivyResolver.reportFailure(artifact);
        this.artifactResolver.reportFailure(artifact);
    }

    @Override // org.apache.ivy.plugins.resolver.DependencyResolver
    public DownloadReport download(Artifact[] artifactArr, DownloadOptions downloadOptions) {
        return this.artifactResolver.download(artifactArr, downloadOptions);
    }

    public DependencyResolver getArtifactResolver() {
        return this.artifactResolver;
    }

    public void setArtifactResolver(DependencyResolver dependencyResolver) {
        this.artifactResolver = dependencyResolver;
    }

    public DependencyResolver getIvyResolver() {
        return this.ivyResolver;
    }

    public void setIvyResolver(DependencyResolver dependencyResolver) {
        this.ivyResolver = dependencyResolver;
    }

    @Override // org.apache.ivy.plugins.resolver.DependencyResolver
    public void publish(Artifact artifact, File file, boolean z) throws IOException {
        if (ClientConfigurationFields.IVY.equals(artifact.getType())) {
            this.ivyResolver.publish(artifact, file, z);
        } else {
            this.artifactResolver.publish(artifact, file, z);
        }
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public void abortPublishTransaction() throws IOException {
        this.ivyResolver.abortPublishTransaction();
        this.artifactResolver.abortPublishTransaction();
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public void beginPublishTransaction(ModuleRevisionId moduleRevisionId, boolean z) throws IOException {
        this.ivyResolver.beginPublishTransaction(moduleRevisionId, z);
        this.artifactResolver.beginPublishTransaction(moduleRevisionId, z);
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public void commitPublishTransaction() throws IOException {
        this.ivyResolver.commitPublishTransaction();
        this.artifactResolver.commitPublishTransaction();
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public void dumpSettings() {
        if (this.ivyResolver == null || this.artifactResolver == null) {
            throw new IllegalStateException("exactly two resolvers must be added: ivy(1) and artifact(2) one");
        }
        Message.verbose("\t" + getName() + " [dual " + this.ivyResolver.getName() + " " + this.artifactResolver.getName() + "]");
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public boolean exists(Artifact artifact) {
        if (artifact.isMetadata()) {
            return this.ivyResolver.exists(artifact);
        }
        return this.artifactResolver.exists(artifact);
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public ArtifactOrigin locate(Artifact artifact) {
        if (artifact.isMetadata()) {
            return this.ivyResolver.locate(artifact);
        }
        return this.artifactResolver.locate(artifact);
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public ArtifactDownloadReport download(ArtifactOrigin artifactOrigin, DownloadOptions downloadOptions) {
        if (artifactOrigin.getArtifact().isMetadata()) {
            return this.ivyResolver.download(artifactOrigin, downloadOptions);
        }
        return this.artifactResolver.download(artifactOrigin, downloadOptions);
    }

    public boolean isAllownomd() {
        return this.allownomd;
    }

    public void setAllownomd(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("allownomd is deprecated, please use descriptor=\"");
        sb.append(z ? "optional" : "required");
        sb.append("\" instead");
        Message.deprecated(sb.toString());
        this.allownomd = z;
    }

    public void setDescriptor(String str) {
        str.hashCode();
        if (!str.equals("required")) {
            if (str.equals("optional")) {
                this.allownomd = true;
                return;
            }
            throw new IllegalArgumentException("unknown descriptor rule '" + str + "'. Allowed rules are: " + Arrays.asList("required", "optional"));
        }
        this.allownomd = false;
    }
}
