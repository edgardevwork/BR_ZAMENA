package org.apache.ivy.osgi.core;

import java.text.ParseException;
import java.util.Comparator;
import org.apache.ivy.core.IvyContext;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.resolve.ResolvedModuleRevision;
import org.apache.ivy.osgi.util.Version;
import org.apache.ivy.plugins.latest.ArtifactInfo;
import org.apache.ivy.plugins.latest.ComparatorLatestStrategy;
import org.apache.ivy.plugins.resolver.util.MDResolvedResource;
import org.apache.ivy.plugins.version.VersionMatcher;

/* loaded from: classes7.dex */
public class OsgiLatestStrategy extends ComparatorLatestStrategy {
    public final Comparator<ArtifactInfo> artifactInfoComparator;
    public final Comparator<ModuleRevisionId> mridComparator = new MridComparator();

    /* loaded from: classes5.dex */
    public final class MridComparator implements Comparator<ModuleRevisionId> {
        public MridComparator() {
        }

        @Override // java.util.Comparator
        public int compare(ModuleRevisionId moduleRevisionId, ModuleRevisionId moduleRevisionId2) {
            try {
                return new Version(moduleRevisionId.getRevision()).compareTo(new Version(moduleRevisionId2.getRevision()));
            } catch (RuntimeException e) {
                if (e.getCause() instanceof ParseException) {
                    throw new RuntimeException("Uncomparable versions:" + moduleRevisionId.getRevision() + " and " + moduleRevisionId2.getRevision() + " (" + e.getMessage() + ")");
                }
                throw e;
            }
        }
    }

    /* loaded from: classes5.dex */
    public final class ArtifactInfoComparator implements Comparator<ArtifactInfo> {
        public ArtifactInfoComparator() {
        }

        @Override // java.util.Comparator
        public int compare(ArtifactInfo artifactInfo, ArtifactInfo artifactInfo2) {
            String revision = artifactInfo.getRevision();
            String revision2 = artifactInfo2.getRevision();
            VersionMatcher versionMatcher = IvyContext.getContext().getSettings().getVersionMatcher();
            ModuleRevisionId moduleRevisionIdNewInstance = ModuleRevisionId.newInstance("", "", revision);
            ModuleRevisionId moduleRevisionIdNewInstance2 = ModuleRevisionId.newInstance("", "", revision2);
            if (versionMatcher.isDynamic(moduleRevisionIdNewInstance)) {
                return versionMatcher.compare(moduleRevisionIdNewInstance, moduleRevisionIdNewInstance2, OsgiLatestStrategy.this.mridComparator) >= 0 ? 1 : -1;
            }
            if (versionMatcher.isDynamic(moduleRevisionIdNewInstance2)) {
                return versionMatcher.compare(moduleRevisionIdNewInstance2, moduleRevisionIdNewInstance, OsgiLatestStrategy.this.mridComparator) >= 0 ? -1 : 1;
            }
            int iCompare = OsgiLatestStrategy.this.mridComparator.compare(moduleRevisionIdNewInstance, moduleRevisionIdNewInstance2);
            if (iCompare != 0) {
                return iCompare;
            }
            ModuleRevisionId implMrid = getImplMrid(artifactInfo);
            ModuleRevisionId implMrid2 = getImplMrid(artifactInfo2);
            if (implMrid == null || implMrid2 == null) {
                return iCompare;
            }
            if (implMrid.getModuleId().equals(implMrid2.getModuleId())) {
                return OsgiLatestStrategy.this.mridComparator.compare(implMrid, implMrid2);
            }
            return implMrid.getModuleId().compareTo(implMrid2.getModuleId());
        }

        public final ModuleRevisionId getImplMrid(ArtifactInfo artifactInfo) {
            ResolvedModuleRevision resolvedModuleRevision;
            ModuleDescriptor descriptor;
            DependencyDescriptor[] dependencies;
            if ((artifactInfo instanceof MDResolvedResource) && (resolvedModuleRevision = ((MDResolvedResource) artifactInfo).getResolvedModuleRevision()) != null && (descriptor = resolvedModuleRevision.getDescriptor()) != null && descriptor.getModuleRevisionId().getOrganisation().equals(BundleInfo.PACKAGE_TYPE) && (dependencies = descriptor.getDependencies()) != null && dependencies.length == 1) {
                return dependencies[0].getDependencyRevisionId();
            }
            return null;
        }
    }

    public OsgiLatestStrategy() {
        ArtifactInfoComparator artifactInfoComparator = new ArtifactInfoComparator();
        this.artifactInfoComparator = artifactInfoComparator;
        setComparator(artifactInfoComparator);
        setName("latest-osgi");
    }
}
