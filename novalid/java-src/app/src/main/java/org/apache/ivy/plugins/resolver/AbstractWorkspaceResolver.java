package org.apache.ivy.plugins.resolver;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Iterator;
import java.util.List;
import org.apache.ivy.Ivy;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.Configuration;
import org.apache.ivy.core.module.descriptor.DefaultArtifact;
import org.apache.ivy.core.module.descriptor.DefaultWorkspaceModuleDescriptor;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.descriptor.ExcludeRule;
import org.apache.ivy.core.module.descriptor.License;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.descriptor.WorkspaceModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.report.DownloadStatus;
import org.apache.ivy.core.report.MetadataArtifactDownloadReport;
import org.apache.ivy.core.resolve.ResolveData;
import org.apache.ivy.core.resolve.ResolvedModuleRevision;
import org.apache.ivy.osgi.core.BundleInfo;
import org.apache.ivy.osgi.core.ManifestHeaderElement;
import org.apache.ivy.osgi.core.ManifestHeaderValue;
import org.apache.ivy.osgi.core.ManifestParser;
import org.apache.ivy.plugins.resolver.util.ResolvedResource;
import org.apache.ivy.plugins.version.VersionMatcher;
import org.apache.ivy.util.Message;
import org.jfrog.build.extractor.clientConfiguration.ClientConfigurationFields;

/* loaded from: classes5.dex */
public abstract class AbstractWorkspaceResolver extends AbstractResolver {
    public boolean ignoreBranch;
    public boolean ignoreVersion;

    public abstract List<Artifact> createWorkspaceArtifacts(ModuleDescriptor moduleDescriptor);

    @Override // org.apache.ivy.plugins.resolver.DependencyResolver
    public ResolvedResource findIvyFileRef(DependencyDescriptor dependencyDescriptor, ResolveData resolveData) {
        return null;
    }

    public void setIgnoreBranch(boolean z) {
        this.ignoreBranch = z;
    }

    public void setIgnoreVersion(boolean z) {
        this.ignoreVersion = z;
    }

    public ResolvedModuleRevision checkCandidate(DependencyDescriptor dependencyDescriptor, ModuleDescriptor moduleDescriptor, String str) {
        boolean z;
        String revision;
        if (str == null) {
            str = dependencyDescriptor.getDependencyId().toString();
        }
        String str2 = str;
        ModuleRevisionId dependencyRevisionId = dependencyDescriptor.getDependencyRevisionId();
        String organisation = dependencyRevisionId.getModuleId().getOrganisation();
        String name = dependencyRevisionId.getModuleId().getName();
        VersionMatcher versionMatcher = getSettings().getVersionMatcher();
        ModuleRevisionId moduleRevisionId = moduleDescriptor.getModuleRevisionId();
        organisation.hashCode();
        if (organisation.equals(BundleInfo.BUNDLE_TYPE)) {
            String extraInfoContentByTagName = moduleDescriptor.getExtraInfoContentByTagName(ManifestParser.BUNDLE_SYMBOLIC_NAME);
            if (extraInfoContentByTagName == null || !name.equals(extraInfoContentByTagName)) {
                return null;
            }
        } else if (organisation.equals(BundleInfo.PACKAGE_TYPE)) {
            String extraInfoContentByTagName2 = moduleDescriptor.getExtraInfoContentByTagName(ManifestParser.EXPORT_PACKAGE);
            if (extraInfoContentByTagName2 == null) {
                return null;
            }
            try {
                Iterator<ManifestHeaderElement> it = new ManifestHeaderValue(extraInfoContentByTagName2).getElements().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        revision = null;
                        break;
                    }
                    ManifestHeaderElement next = it.next();
                    if (next.getValues().contains(name)) {
                        revision = next.getAttributes().get("version");
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    return null;
                }
                if (revision == null) {
                    revision = dependencyRevisionId.getRevision();
                }
                moduleDescriptor.setResolvedModuleRevisionId(ModuleRevisionId.newInstance(organisation, name, revision));
            } catch (ParseException unused) {
                return null;
            }
        } else if (!moduleRevisionId.getModuleId().equals(dependencyRevisionId.getModuleId())) {
            return null;
        }
        Message.verbose("Workspace resolver found potential matching workspace module " + str2 + " with module " + moduleRevisionId + " for module " + dependencyRevisionId);
        if (!this.ignoreBranch) {
            String defaultBranch = getSettings().getDefaultBranch(dependencyRevisionId.getModuleId());
            String branch = dependencyRevisionId.getBranch();
            String branch2 = moduleRevisionId.getBranch();
            if (branch == null) {
                branch = defaultBranch;
            }
            if (branch2 != null) {
                defaultBranch = branch2;
            }
            if (branch != defaultBranch) {
                if (branch == null || defaultBranch == null) {
                    Message.verbose("\t\trejected since branches doesn't match (one is set, the other isn't)");
                    return null;
                }
                if (!branch.equals(defaultBranch)) {
                    Message.verbose("\t\trejected since branches doesn't match");
                    return null;
                }
            }
        }
        if (!this.ignoreVersion && !moduleDescriptor.getModuleRevisionId().getRevision().equals(Ivy.getWorkingRevision()) && !versionMatcher.accept(dependencyDescriptor.getDependencyRevisionId(), moduleDescriptor)) {
            Message.verbose("\t\treject as version didn't match");
            return null;
        }
        if (this.ignoreVersion) {
            Message.verbose("\t\tmatched (version are ignored)");
        } else {
            Message.verbose("\t\tversion matched");
        }
        WorkspaceModuleDescriptor workspaceModuleDescriptorCreateWorkspaceMd = createWorkspaceMd(moduleDescriptor);
        Artifact metadataArtifact = moduleDescriptor.getMetadataArtifact();
        if (metadataArtifact == null) {
            metadataArtifact = new DefaultArtifact(moduleDescriptor.getModuleRevisionId(), moduleDescriptor.getPublicationDate(), str2, ClientConfigurationFields.IVY, "");
        }
        MetadataArtifactDownloadReport metadataArtifactDownloadReport = new MetadataArtifactDownloadReport(metadataArtifact);
        metadataArtifactDownloadReport.setDownloadStatus(DownloadStatus.SUCCESSFUL);
        metadataArtifactDownloadReport.setSearched(true);
        return new ResolvedModuleRevision(this, this, workspaceModuleDescriptorCreateWorkspaceMd, metadataArtifactDownloadReport);
    }

    public WorkspaceModuleDescriptor createWorkspaceMd(ModuleDescriptor moduleDescriptor) {
        int i;
        DefaultWorkspaceModuleDescriptor defaultWorkspaceModuleDescriptor = new DefaultWorkspaceModuleDescriptor(moduleDescriptor.getModuleRevisionId(), "release", null, true);
        defaultWorkspaceModuleDescriptor.addConfiguration(new Configuration("default"));
        defaultWorkspaceModuleDescriptor.setLastModified(System.currentTimeMillis());
        defaultWorkspaceModuleDescriptor.setDescription(moduleDescriptor.getDescription());
        defaultWorkspaceModuleDescriptor.setHomePage(moduleDescriptor.getHomePage());
        defaultWorkspaceModuleDescriptor.setLastModified(moduleDescriptor.getLastModified());
        defaultWorkspaceModuleDescriptor.setPublicationDate(moduleDescriptor.getPublicationDate());
        defaultWorkspaceModuleDescriptor.setResolvedPublicationDate(moduleDescriptor.getResolvedPublicationDate());
        defaultWorkspaceModuleDescriptor.setStatus(moduleDescriptor.getStatus());
        Configuration[] configurations = moduleDescriptor.getConfigurations();
        Iterator<Artifact> it = createWorkspaceArtifacts(moduleDescriptor).iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Artifact next = it.next();
            if (configurations.length == 0) {
                defaultWorkspaceModuleDescriptor.addArtifact("default", next);
            } else {
                int length = configurations.length;
                while (i < length) {
                    Configuration configuration = configurations[i];
                    defaultWorkspaceModuleDescriptor.addConfiguration(configuration);
                    defaultWorkspaceModuleDescriptor.addArtifact(configuration.getName(), next);
                    i++;
                }
            }
        }
        for (DependencyDescriptor dependencyDescriptor : moduleDescriptor.getDependencies()) {
            defaultWorkspaceModuleDescriptor.addDependency(dependencyDescriptor);
        }
        for (ExcludeRule excludeRule : moduleDescriptor.getAllExcludeRules()) {
            defaultWorkspaceModuleDescriptor.addExcludeRule(excludeRule);
        }
        defaultWorkspaceModuleDescriptor.getExtraInfos().addAll(moduleDescriptor.getExtraInfos());
        License[] licenses = moduleDescriptor.getLicenses();
        int length2 = licenses.length;
        while (i < length2) {
            defaultWorkspaceModuleDescriptor.addLicense(licenses[i]);
            i++;
        }
        return defaultWorkspaceModuleDescriptor;
    }

    @Override // org.apache.ivy.plugins.resolver.DependencyResolver
    public void publish(Artifact artifact, File file, boolean z) throws IOException {
        throw new UnsupportedOperationException("publish not supported by " + getName());
    }
}
