package org.apache.ivy.core.report;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.ivy.core.cache.ResolutionCacheManager;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.Configuration;
import org.apache.ivy.core.module.descriptor.DefaultDependencyDescriptor;
import org.apache.ivy.core.module.descriptor.DefaultModuleDescriptor;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.resolve.IvyNode;
import org.apache.ivy.core.resolve.ResolveOptions;
import org.apache.ivy.core.settings.IvySettings;
import org.apache.ivy.plugins.report.ReportOutputter;
import org.apache.ivy.util.filter.Filter;

/* loaded from: classes7.dex */
public class ResolveReport {
    public List<Artifact> artifacts;
    public Map<String, ConfigurationResolveReport> confReports;
    public List<IvyNode> dependencies;
    public long downloadSize;
    public long downloadTime;

    /* renamed from: md */
    public ModuleDescriptor f9965md;
    public List<String> problemMessages;
    public String resolveId;
    public long resolveTime;

    public ResolveReport(ModuleDescriptor moduleDescriptor) {
        this(moduleDescriptor, ResolveOptions.getDefaultResolveId(moduleDescriptor));
    }

    public ResolveReport(ModuleDescriptor moduleDescriptor, String str) {
        this.confReports = new LinkedHashMap();
        this.problemMessages = new ArrayList();
        this.dependencies = new ArrayList();
        this.artifacts = new ArrayList();
        this.f9965md = moduleDescriptor;
        this.resolveId = str;
    }

    public void addReport(String str, ConfigurationResolveReport configurationResolveReport) {
        this.confReports.put(str, configurationResolveReport);
    }

    public ConfigurationResolveReport getConfigurationReport(String str) {
        return this.confReports.get(str);
    }

    public String[] getConfigurations() {
        return (String[]) this.confReports.keySet().toArray(new String[this.confReports.size()]);
    }

    public boolean hasError() {
        Iterator<ConfigurationResolveReport> it = this.confReports.values().iterator();
        while (it.hasNext()) {
            if (it.next().hasError()) {
                return true;
            }
        }
        return false;
    }

    public void output(ReportOutputter[] reportOutputterArr, ResolutionCacheManager resolutionCacheManager, ResolveOptions resolveOptions) throws IOException {
        for (ReportOutputter reportOutputter : reportOutputterArr) {
            reportOutputter.output(this, resolutionCacheManager, resolveOptions);
        }
    }

    public ModuleDescriptor getModuleDescriptor() {
        return this.f9965md;
    }

    public IvyNode[] getEvictedNodes() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<ConfigurationResolveReport> it = this.confReports.values().iterator();
        while (it.hasNext()) {
            linkedHashSet.addAll(Arrays.asList(it.next().getEvictedNodes()));
        }
        return (IvyNode[]) linkedHashSet.toArray(new IvyNode[linkedHashSet.size()]);
    }

    public IvyNode[] getUnresolvedDependencies() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<ConfigurationResolveReport> it = this.confReports.values().iterator();
        while (it.hasNext()) {
            linkedHashSet.addAll(Arrays.asList(it.next().getUnresolvedDependencies()));
        }
        return (IvyNode[]) linkedHashSet.toArray(new IvyNode[linkedHashSet.size()]);
    }

    public ArtifactDownloadReport[] getFailedArtifactsReports() {
        return ConfigurationResolveReport.filterOutMergedArtifacts(getArtifactsReports(DownloadStatus.FAILED, true));
    }

    public ArtifactDownloadReport[] getAllArtifactsReports() {
        return getArtifactsReports(null, true);
    }

    public ArtifactDownloadReport[] getArtifactsReports(DownloadStatus downloadStatus, boolean z) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<ConfigurationResolveReport> it = this.confReports.values().iterator();
        while (it.hasNext()) {
            linkedHashSet.addAll(Arrays.asList(it.next().getArtifactsReports(downloadStatus, z)));
        }
        return (ArtifactDownloadReport[]) linkedHashSet.toArray(new ArtifactDownloadReport[linkedHashSet.size()]);
    }

    public ArtifactDownloadReport[] getArtifactsReports(ModuleRevisionId moduleRevisionId) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<ConfigurationResolveReport> it = this.confReports.values().iterator();
        while (it.hasNext()) {
            linkedHashSet.addAll(Arrays.asList(it.next().getDownloadReports(moduleRevisionId)));
        }
        return (ArtifactDownloadReport[]) linkedHashSet.toArray(new ArtifactDownloadReport[linkedHashSet.size()]);
    }

    public void checkIfChanged() {
        Iterator<ConfigurationResolveReport> it = this.confReports.values().iterator();
        while (it.hasNext()) {
            it.next().checkIfChanged();
        }
    }

    public boolean hasChanged() {
        Iterator<ConfigurationResolveReport> it = this.confReports.values().iterator();
        while (it.hasNext()) {
            if (it.next().hasChanged()) {
                return true;
            }
        }
        return false;
    }

    public void setProblemMessages(List<String> list) {
        this.problemMessages = list;
    }

    public List<String> getProblemMessages() {
        return this.problemMessages;
    }

    public List<String> getAllProblemMessages() {
        ArrayList arrayList = new ArrayList(this.problemMessages);
        for (ConfigurationResolveReport configurationResolveReport : this.confReports.values()) {
            for (IvyNode ivyNode : configurationResolveReport.getUnresolvedDependencies()) {
                String problemMessage = ivyNode.getProblemMessage();
                if (problemMessage.isEmpty()) {
                    arrayList.add("unresolved dependency: " + ivyNode.getId());
                } else {
                    arrayList.add("unresolved dependency: " + ivyNode.getId() + ": " + problemMessage);
                }
            }
            for (ArtifactDownloadReport artifactDownloadReport : configurationResolveReport.getFailedArtifactsReports()) {
                arrayList.add("download failed: " + artifactDownloadReport.getArtifact());
            }
        }
        return arrayList;
    }

    public void setDependencies(List<IvyNode> list, Filter<Artifact> filter) {
        this.dependencies = list;
        this.artifacts = new ArrayList();
        for (IvyNode ivyNode : list) {
            if (!ivyNode.isCompletelyEvicted() && !ivyNode.hasProblem()) {
                this.artifacts.addAll(Arrays.asList(ivyNode.getSelectedArtifacts(filter)));
            }
            for (String str : ivyNode.getRootModuleConfigurations()) {
                ConfigurationResolveReport configurationReport = getConfigurationReport(str);
                if (configurationReport != null) {
                    configurationReport.addDependency(ivyNode);
                }
            }
        }
    }

    public List<IvyNode> getDependencies() {
        return this.dependencies;
    }

    public List<Artifact> getArtifacts() {
        return this.artifacts;
    }

    public List<ModuleId> getModuleIds() {
        ArrayList arrayList = new ArrayList();
        Iterator it = new ArrayList(this.dependencies).iterator();
        while (it.hasNext()) {
            ModuleId moduleId = ((IvyNode) it.next()).getResolvedId().getModuleId();
            if (!arrayList.contains(moduleId)) {
                arrayList.add(moduleId);
            }
        }
        return arrayList;
    }

    public void setResolveTime(long j) {
        this.resolveTime = j;
    }

    public long getResolveTime() {
        return this.resolveTime;
    }

    public void setDownloadTime(long j) {
        this.downloadTime = j;
    }

    public long getDownloadTime() {
        return this.downloadTime;
    }

    public void setDownloadSize(long j) {
        this.downloadSize = j;
    }

    public long getDownloadSize() {
        return this.downloadSize;
    }

    public String getResolveId() {
        return this.resolveId;
    }

    public final Set<String> getExtendingConfs(String str) {
        HashSet hashSet = new HashSet();
        hashSet.add(str);
        for (String str2 : this.f9965md.getConfigurationsNames()) {
            gatherExtendingConfs(hashSet, str2, str);
        }
        return hashSet;
    }

    public final boolean gatherExtendingConfs(Set<String> set, String str, String str2) {
        if (set.contains(str)) {
            return true;
        }
        String[] strArr = this.f9965md.getConfiguration(str).getExtends();
        if (strArr != null && strArr.length != 0) {
            for (String str3 : strArr) {
                if (set.contains(str3)) {
                    set.add(str);
                    return true;
                }
                if (str3.equals(str2)) {
                    set.add(str);
                    return true;
                }
                if (gatherExtendingConfs(set, str3, str2)) {
                    set.add(str);
                    return true;
                }
            }
        }
        return false;
    }

    public ModuleDescriptor toFixedModuleDescriptor(IvySettings ivySettings, List<ModuleId> list) {
        ModuleRevisionId resolvedId;
        boolean z;
        DefaultModuleDescriptor defaultModuleDescriptor = new DefaultModuleDescriptor(this.f9965md.getModuleRevisionId(), this.f9965md.getStatus(), new Date());
        for (Map.Entry<String, String> entry : this.f9965md.getExtraAttributesNamespaces().entrySet()) {
            defaultModuleDescriptor.addExtraAttributeNamespace(entry.getKey(), entry.getValue());
        }
        defaultModuleDescriptor.setDescription(this.f9965md.getDescription());
        defaultModuleDescriptor.setHomePage(this.f9965md.getHomePage());
        defaultModuleDescriptor.getExtraInfos().addAll(this.f9965md.getExtraInfos());
        List listAsList = Arrays.asList(getConfigurations());
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            defaultModuleDescriptor.addConfiguration(new Configuration((String) it.next()));
        }
        Iterator it2 = listAsList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            String str = (String) it2.next();
            for (Artifact artifact : this.f9965md.getArtifacts(str)) {
                defaultModuleDescriptor.addArtifact(str, artifact);
            }
        }
        for (IvyNode ivyNode : this.dependencies) {
            boolean z2 = true;
            if (list != null && list.contains(ivyNode.getModuleId())) {
                resolvedId = ivyNode.getId();
                z = false;
            } else {
                resolvedId = ivyNode.getResolvedId();
                z = true;
            }
            DefaultDependencyDescriptor defaultDependencyDescriptor = new DefaultDependencyDescriptor(defaultModuleDescriptor, resolvedId, z, false, false);
            for (String str2 : ivyNode.getRootModuleConfigurations()) {
                if (!ivyNode.isEvicted(str2)) {
                    for (String str3 : ivyNode.getConfigurations(str2)) {
                        defaultDependencyDescriptor.addDependencyConfiguration(str2, str3);
                    }
                    z2 = false;
                }
            }
            if (!z2) {
                defaultModuleDescriptor.addDependency(defaultDependencyDescriptor);
            }
        }
        return defaultModuleDescriptor;
    }
}
