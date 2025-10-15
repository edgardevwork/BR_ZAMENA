package org.apache.ivy.ant;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.DefaultArtifact;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.report.ArtifactDownloadReport;
import org.apache.ivy.core.report.DownloadReport;
import org.apache.ivy.core.report.DownloadStatus;
import org.apache.ivy.core.resolve.DownloadOptions;
import org.apache.ivy.core.resolve.ResolveData;
import org.apache.ivy.core.resolve.ResolvedModuleRevision;
import org.apache.ivy.plugins.parser.ModuleDescriptorParserRegistry;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.apache.ivy.plugins.resolver.AbstractWorkspaceResolver;
import org.apache.ivy.util.Message;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.DataType;
import org.apache.tools.ant.types.Resource;
import org.apache.tools.ant.types.ResourceCollection;

/* loaded from: classes7.dex */
public class AntWorkspaceResolver extends DataType {
    public String name;
    public Resolver resolver;
    public List<ResourceCollection> allResources = new ArrayList();
    public boolean haltOnError = true;
    public List<WorkspaceArtifact> artifacts = new ArrayList();

    public static final class WorkspaceArtifact {
        public String ext;
        public String name;
        public String path;
        public String type;

        public void setName(String str) {
            this.name = str;
        }

        public void setType(String str) {
            this.type = str;
        }

        public void setExt(String str) {
            this.ext = str;
        }

        public void setPath(String str) {
            this.path = str;
        }
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setHaltonerror(boolean z) {
        this.haltOnError = z;
    }

    public void addConfigured(ResourceCollection resourceCollection) throws BuildException {
        if (!resourceCollection.isFilesystemOnly()) {
            throw new BuildException("Only filesystem resource collection is supported");
        }
        this.allResources.add(resourceCollection);
    }

    public WorkspaceArtifact createArtifact() {
        WorkspaceArtifact workspaceArtifact = new WorkspaceArtifact();
        this.artifacts.add(workspaceArtifact);
        return workspaceArtifact;
    }

    public Resolver getResolver() throws BuildException {
        if (this.resolver == null) {
            if (this.name == null) {
                throw new BuildException("A name is required");
            }
            Resolver resolver = new Resolver();
            this.resolver = resolver;
            resolver.setName(this.name);
        }
        return this.resolver;
    }

    public final String getProjectName(File file) {
        return file.getParentFile().getName();
    }

    /* loaded from: classes5.dex */
    public class Resolver extends AbstractWorkspaceResolver {
        public Map<ModuleDescriptor, File> md2IvyFile;

        public Resolver() {
        }

        public /* synthetic */ Resolver(AntWorkspaceResolver antWorkspaceResolver, C111541 c111541) {
            this();
        }

        public final synchronized Map<ModuleDescriptor, File> getModuleDescriptors() {
            if (this.md2IvyFile == null) {
                this.md2IvyFile = new HashMap();
                Iterator it = AntWorkspaceResolver.this.allResources.iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((ResourceCollection) it.next()).iterator();
                    while (it2.hasNext()) {
                        File file = ((Resource) it2.next()).getFile();
                        try {
                            ModuleDescriptor descriptor = ModuleDescriptorParserRegistry.getInstance().parseDescriptor(getParserSettings(), file.toURI().toURL(), isValidate());
                            this.md2IvyFile.put(descriptor, file);
                            Message.debug("Add " + descriptor.getModuleRevisionId().getModuleId());
                        } catch (Exception e) {
                            if (AntWorkspaceResolver.this.haltOnError) {
                                throw new BuildException("impossible to parse ivy file " + file + " exception=" + e, e);
                            }
                            Message.warn("impossible to parse ivy file " + file + " exception=" + e.getMessage());
                        }
                    }
                }
            }
            return this.md2IvyFile;
        }

        @Override // org.apache.ivy.plugins.resolver.DependencyResolver
        public ResolvedModuleRevision getDependency(DependencyDescriptor dependencyDescriptor, ResolveData resolveData) throws ParseException {
            for (Map.Entry<ModuleDescriptor, File> entry : getModuleDescriptors().entrySet()) {
                ResolvedModuleRevision resolvedModuleRevisionCheckCandidate = checkCandidate(dependencyDescriptor, entry.getKey(), AntWorkspaceResolver.this.getProjectName(entry.getValue()));
                if (resolvedModuleRevisionCheckCandidate != null) {
                    return resolvedModuleRevisionCheckCandidate;
                }
            }
            return null;
        }

        @Override // org.apache.ivy.plugins.resolver.AbstractWorkspaceResolver
        public List<Artifact> createWorkspaceArtifacts(ModuleDescriptor moduleDescriptor) {
            ArrayList arrayList = new ArrayList();
            for (WorkspaceArtifact workspaceArtifact : AntWorkspaceResolver.this.artifacts) {
                String name = workspaceArtifact.name;
                String str = workspaceArtifact.type;
                String str2 = workspaceArtifact.ext;
                String string = workspaceArtifact.path;
                if (name == null) {
                    name = moduleDescriptor.getModuleRevisionId().getName();
                }
                String str3 = name;
                String str4 = str == null ? "jar" : str;
                String str5 = str2 == null ? "jar" : str2;
                if (string == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("target");
                    String str6 = File.separator;
                    sb.append(str6);
                    sb.append("dist");
                    sb.append(str6);
                    sb.append(str4);
                    sb.append("s");
                    sb.append(str6);
                    sb.append(str3);
                    sb.append(".");
                    sb.append(str5);
                    string = sb.toString();
                }
                File file = new File(this.md2IvyFile.get(moduleDescriptor).getParentFile(), string);
                try {
                    arrayList.add(new DefaultArtifact(moduleDescriptor.getModuleRevisionId(), new Date(), str3, str4, str5, file.toURI().toURL(), null));
                } catch (MalformedURLException e) {
                    throw new RuntimeException("Unsupported file path : " + file, e);
                }
            }
            return arrayList;
        }

        @Override // org.apache.ivy.plugins.resolver.DependencyResolver
        public DownloadReport download(Artifact[] artifactArr, DownloadOptions downloadOptions) {
            File file;
            DownloadReport downloadReport = new DownloadReport();
            for (Artifact artifact : artifactArr) {
                ArtifactDownloadReport artifactDownloadReport = new ArtifactDownloadReport(artifact);
                downloadReport.addArtifactReport(artifactDownloadReport);
                URL url = artifact.getUrl();
                if (url == null || !url.getProtocol().equals(PomReader.PomProfileElement.FILE)) {
                    artifactDownloadReport.setDownloadStatus(DownloadStatus.FAILED);
                    break;
                }
                try {
                    file = new File(url.toURI());
                } catch (URISyntaxException unused) {
                    file = new File(url.getPath());
                }
                artifactDownloadReport.setLocalFile(file);
                artifactDownloadReport.setDownloadStatus(DownloadStatus.f9964NO);
                artifactDownloadReport.setSize(0L);
                Message.verbose("\t[IN WORKSPACE] " + artifact);
            }
            return downloadReport;
        }
    }
}
