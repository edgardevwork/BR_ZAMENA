package org.apache.ivy.plugins.namespace;

import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.DefaultArtifact;
import org.apache.ivy.core.module.descriptor.DefaultDependencyDescriptor;
import org.apache.ivy.core.module.descriptor.DefaultModuleDescriptor;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ArtifactId;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.report.MetadataArtifactDownloadReport;
import org.apache.ivy.core.resolve.ResolvedModuleRevision;

/* loaded from: classes6.dex */
public final class NameSpaceHelper {
    public static DependencyDescriptor toSystem(DependencyDescriptor dependencyDescriptor, Namespace namespace) {
        return DefaultDependencyDescriptor.transformInstance(dependencyDescriptor, namespace);
    }

    public static DependencyDescriptor transform(DependencyDescriptor dependencyDescriptor, NamespaceTransformer namespaceTransformer, boolean z) {
        return DefaultDependencyDescriptor.transformInstance(dependencyDescriptor, namespaceTransformer, z);
    }

    public static ModuleDescriptor toSystem(ModuleDescriptor moduleDescriptor, Namespace namespace) {
        return DefaultModuleDescriptor.transformInstance(moduleDescriptor, namespace);
    }

    public static ResolvedModuleRevision toSystem(ResolvedModuleRevision resolvedModuleRevision, Namespace namespace) {
        if (namespace.getToSystemTransformer().isIdentity()) {
            return resolvedModuleRevision;
        }
        ModuleDescriptor system = toSystem(resolvedModuleRevision.getDescriptor(), namespace);
        return system.equals(resolvedModuleRevision.getDescriptor()) ? resolvedModuleRevision : new ResolvedModuleRevision(resolvedModuleRevision.getResolver(), resolvedModuleRevision.getArtifactResolver(), system, transform(resolvedModuleRevision.getReport(), namespace.getToSystemTransformer()), resolvedModuleRevision.isForce());
    }

    public static Artifact transform(Artifact artifact, NamespaceTransformer namespaceTransformer) {
        if (namespaceTransformer.isIdentity()) {
            return artifact;
        }
        ModuleRevisionId moduleRevisionIdTransform = namespaceTransformer.transform(artifact.getModuleRevisionId());
        return artifact.getModuleRevisionId().equals(moduleRevisionIdTransform) ? artifact : new DefaultArtifact(moduleRevisionIdTransform, artifact.getPublicationDate(), artifact.getName(), artifact.getType(), artifact.getExt(), artifact.getUrl(), artifact.getQualifiedExtraAttributes());
    }

    public static MetadataArtifactDownloadReport transform(MetadataArtifactDownloadReport metadataArtifactDownloadReport, NamespaceTransformer namespaceTransformer) {
        if (namespaceTransformer.isIdentity()) {
            return metadataArtifactDownloadReport;
        }
        MetadataArtifactDownloadReport metadataArtifactDownloadReport2 = new MetadataArtifactDownloadReport(transform(metadataArtifactDownloadReport.getArtifact(), namespaceTransformer));
        metadataArtifactDownloadReport2.setSearched(metadataArtifactDownloadReport.isSearched());
        metadataArtifactDownloadReport2.setDownloadStatus(metadataArtifactDownloadReport.getDownloadStatus());
        metadataArtifactDownloadReport2.setDownloadDetails(metadataArtifactDownloadReport.getDownloadDetails());
        metadataArtifactDownloadReport2.setArtifactOrigin(metadataArtifactDownloadReport.getArtifactOrigin());
        metadataArtifactDownloadReport2.setDownloadTimeMillis(metadataArtifactDownloadReport.getDownloadTimeMillis());
        metadataArtifactDownloadReport2.setOriginalLocalFile(metadataArtifactDownloadReport.getOriginalLocalFile());
        metadataArtifactDownloadReport2.setLocalFile(metadataArtifactDownloadReport.getLocalFile());
        metadataArtifactDownloadReport2.setSize(metadataArtifactDownloadReport.getSize());
        return metadataArtifactDownloadReport2;
    }

    public static ArtifactId transform(ArtifactId artifactId, NamespaceTransformer namespaceTransformer) {
        if (namespaceTransformer.isIdentity()) {
            return artifactId;
        }
        ModuleId moduleIdTransform = transform(artifactId.getModuleId(), namespaceTransformer);
        return moduleIdTransform.equals(artifactId.getModuleId()) ? artifactId : new ArtifactId(moduleIdTransform, artifactId.getName(), artifactId.getType(), artifactId.getExt());
    }

    public static ModuleId transform(ModuleId moduleId, NamespaceTransformer namespaceTransformer) {
        return namespaceTransformer.isIdentity() ? moduleId : namespaceTransformer.transform(new ModuleRevisionId(moduleId, "")).getModuleId();
    }

    public static String transformOrganisation(String str, NamespaceTransformer namespaceTransformer) {
        return transform(new ModuleId(str, ""), namespaceTransformer).getOrganisation();
    }
}
