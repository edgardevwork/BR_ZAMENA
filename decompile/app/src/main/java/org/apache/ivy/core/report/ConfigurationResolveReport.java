package org.apache.ivy.core.report;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.resolve.IvyNode;
import org.apache.ivy.core.resolve.ResolveEngine;
import org.apache.ivy.core.resolve.ResolveOptions;
import org.apache.ivy.core.sort.SortOptions;
import org.apache.ivy.plugins.report.XmlReportParser;
import org.apache.ivy.util.Message;

/* loaded from: classes7.dex */
public class ConfigurationResolveReport {
    public final String conf;
    public final Date date;

    /* renamed from: md */
    public final ModuleDescriptor f9963md;
    public List<ModuleId> modulesIds;
    public final ResolveOptions options;
    public final ResolveEngine resolveEngine;
    public Map<IvyNode, List<ArtifactDownloadReport>> dependencyReports = new LinkedHashMap();
    public Map<ModuleRevisionId, IvyNode> dependencies = new LinkedHashMap();
    public Map<ModuleId, Collection<IvyNode>> modulesIdsMap = new LinkedHashMap();
    public Boolean hasChanged = null;

    public ConfigurationResolveReport(ResolveEngine resolveEngine, ModuleDescriptor moduleDescriptor, String str, Date date, ResolveOptions resolveOptions) {
        this.resolveEngine = resolveEngine;
        this.f9963md = moduleDescriptor;
        this.conf = str;
        this.date = date;
        this.options = resolveOptions;
    }

    public void checkIfChanged() {
        File configurationResolveReportInCache = this.resolveEngine.getSettings().getResolutionCacheManager().getConfigurationResolveReportInCache(this.options.getResolveId(), this.conf);
        if (configurationResolveReportInCache.exists()) {
            try {
                new XmlReportParser().parse(configurationResolveReportInCache);
                this.hasChanged = Boolean.valueOf(!new HashSet(Arrays.asList(r1.getDependencyRevisionIds())).equals(getModuleRevisionIds()));
                return;
            } catch (Exception e) {
                Message.warn("Error while parsing configuration resolve report " + configurationResolveReportInCache.getAbsolutePath(), e);
                this.hasChanged = Boolean.TRUE;
                return;
            }
        }
        this.hasChanged = Boolean.TRUE;
    }

    public boolean hasChanged() {
        return this.hasChanged.booleanValue();
    }

    public Set<ModuleRevisionId> getModuleRevisionIds() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (IvyNode ivyNode : getDependencies()) {
            if (!ivyNode.isEvicted(getConfiguration()) && !ivyNode.hasProblem()) {
                linkedHashSet.add(ivyNode.getResolvedId());
            }
        }
        return linkedHashSet;
    }

    public void addDependency(IvyNode ivyNode) {
        this.dependencies.put(ivyNode.getId(), ivyNode);
        this.dependencies.put(ivyNode.getResolvedId(), ivyNode);
        this.dependencyReports.put(ivyNode, Collections.emptyList());
    }

    public void updateDependency(ModuleRevisionId moduleRevisionId, IvyNode ivyNode) {
        this.dependencies.put(moduleRevisionId, ivyNode);
    }

    public void addDependency(IvyNode ivyNode, DownloadReport downloadReport) {
        this.dependencies.put(ivyNode.getId(), ivyNode);
        this.dependencies.put(ivyNode.getResolvedId(), ivyNode);
        ArrayList arrayList = new ArrayList();
        for (Artifact artifact : ivyNode.getArtifacts(this.conf)) {
            ArtifactDownloadReport artifactReport = downloadReport.getArtifactReport(artifact);
            if (artifactReport != null) {
                arrayList.add(artifactReport);
            } else {
                Message.debug("no report found for " + artifact);
            }
        }
        this.dependencyReports.put(ivyNode, arrayList);
    }

    public String getConfiguration() {
        return this.conf;
    }

    public Date getDate() {
        return this.date;
    }

    public ModuleDescriptor getModuleDescriptor() {
        return this.f9963md;
    }

    public ResolveOptions getResolveOptions() {
        return this.options;
    }

    public IvyNode[] getUnresolvedDependencies() {
        ArrayList arrayList = new ArrayList();
        for (IvyNode ivyNode : getDependencies()) {
            if (ivyNode.hasProblem()) {
                arrayList.add(ivyNode);
            }
        }
        return (IvyNode[]) arrayList.toArray(new IvyNode[arrayList.size()]);
    }

    public final Collection<IvyNode> getDependencies() {
        return new LinkedHashSet(this.dependencies.values());
    }

    public IvyNode[] getEvictedNodes() {
        ArrayList arrayList = new ArrayList();
        for (IvyNode ivyNode : getDependencies()) {
            if (ivyNode.isEvicted(this.conf)) {
                arrayList.add(ivyNode);
            }
        }
        return (IvyNode[]) arrayList.toArray(new IvyNode[arrayList.size()]);
    }

    public final Set<ModuleRevisionId> getEvictedMrids() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (IvyNode ivyNode : getEvictedNodes()) {
            linkedHashSet.add(ivyNode.getId());
        }
        return linkedHashSet;
    }

    public IvyNode[] getDownloadedNodes() {
        ArrayList arrayList = new ArrayList();
        for (IvyNode ivyNode : getDependencies()) {
            if (ivyNode.isDownloaded() && ivyNode.getRealNode() == ivyNode) {
                arrayList.add(ivyNode);
            }
        }
        return (IvyNode[]) arrayList.toArray(new IvyNode[arrayList.size()]);
    }

    public IvyNode[] getSearchedNodes() {
        ArrayList arrayList = new ArrayList();
        for (IvyNode ivyNode : getDependencies()) {
            if (ivyNode.isSearched() && ivyNode.getRealNode() == ivyNode) {
                arrayList.add(ivyNode);
            }
        }
        return (IvyNode[]) arrayList.toArray(new IvyNode[arrayList.size()]);
    }

    public ArtifactDownloadReport[] getDownloadReports(ModuleRevisionId moduleRevisionId) {
        List<ArtifactDownloadReport> list = this.dependencyReports.get(getDependency(moduleRevisionId));
        if (list == null) {
            return new ArtifactDownloadReport[0];
        }
        return (ArtifactDownloadReport[]) list.toArray(new ArtifactDownloadReport[list.size()]);
    }

    public IvyNode getDependency(ModuleRevisionId moduleRevisionId) {
        return this.dependencies.get(moduleRevisionId);
    }

    public List<ModuleId> getModuleIds() {
        if (this.modulesIds == null) {
            List<IvyNode> listSortNodes = this.resolveEngine.getSortEngine().sortNodes(getDependencies(), SortOptions.SILENT);
            Collections.reverse(listSortNodes);
            for (IvyNode ivyNode : listSortNodes) {
                ModuleId moduleId = ivyNode.getResolvedId().getModuleId();
                Collection<IvyNode> linkedHashSet = this.modulesIdsMap.get(moduleId);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet<>();
                    this.modulesIdsMap.put(moduleId, linkedHashSet);
                }
                linkedHashSet.add(ivyNode);
            }
            this.modulesIds = new ArrayList(this.modulesIdsMap.keySet());
        }
        return Collections.unmodifiableList(this.modulesIds);
    }

    public Collection<IvyNode> getNodes(ModuleId moduleId) {
        if (this.modulesIds == null) {
            getModuleIds();
        }
        return this.modulesIdsMap.get(moduleId);
    }

    public ResolveEngine getResolveEngine() {
        return this.resolveEngine;
    }

    public int getArtifactsNumber() {
        Iterator<List<ArtifactDownloadReport>> it = this.dependencyReports.values().iterator();
        int size = 0;
        while (it.hasNext()) {
            List<ArtifactDownloadReport> next = it.next();
            size += next == null ? 0 : next.size();
        }
        return size;
    }

    public ArtifactDownloadReport[] getAllArtifactsReports() {
        return getArtifactsReports(null, true);
    }

    public ArtifactDownloadReport[] getArtifactsReports(DownloadStatus downloadStatus, boolean z) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Set<ModuleRevisionId> evictedMrids = !z ? getEvictedMrids() : null;
        Iterator<List<ArtifactDownloadReport>> it = this.dependencyReports.values().iterator();
        while (it.hasNext()) {
            for (ArtifactDownloadReport artifactDownloadReport : it.next()) {
                if (downloadStatus == null || artifactDownloadReport.getDownloadStatus() == downloadStatus) {
                    if (z || !evictedMrids.contains(artifactDownloadReport.getArtifact().getModuleRevisionId())) {
                        linkedHashSet.add(artifactDownloadReport);
                    }
                }
            }
        }
        return (ArtifactDownloadReport[]) linkedHashSet.toArray(new ArtifactDownloadReport[linkedHashSet.size()]);
    }

    public ArtifactDownloadReport[] getDownloadedArtifactsReports() {
        return getArtifactsReports(DownloadStatus.SUCCESSFUL, true);
    }

    public ArtifactDownloadReport[] getFailedArtifactsReports() {
        return filterOutMergedArtifacts(getArtifactsReports(DownloadStatus.FAILED, true));
    }

    public boolean hasError() {
        return getUnresolvedDependencies().length > 0 || getFailedArtifactsReports().length > 0;
    }

    public int getNodesNumber() {
        return getDependencies().size();
    }

    public static ArtifactDownloadReport[] filterOutMergedArtifacts(ArtifactDownloadReport[] artifactDownloadReportArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(artifactDownloadReportArr));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((ArtifactDownloadReport) it.next()).getArtifact().getExtraAttribute("ivy:merged") != null) {
                it.remove();
            }
        }
        return (ArtifactDownloadReport[]) arrayList.toArray(new ArtifactDownloadReport[arrayList.size()]);
    }
}
