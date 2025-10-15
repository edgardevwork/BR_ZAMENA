package org.apache.ivy.core.resolve;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.ivy.core.event.EventManager;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.report.ConfigurationResolveReport;
import org.apache.ivy.util.Message;

/* loaded from: classes5.dex */
public class ResolveData {
    public ResolvedModuleRevision currentResolvedModuleRevision;
    public VisitNode currentVisitNode;
    public ResolveEngine engine;
    public ResolveOptions options;
    public ConfigurationResolveReport report;
    public Map<ModuleRevisionId, VisitData> visitData;

    public ResolveData(ResolveData resolveData, boolean z) {
        this(resolveData.engine, new ResolveOptions(resolveData.options).setValidate(z), resolveData.report, resolveData.visitData);
        setCurrentVisitNode(resolveData.currentVisitNode);
        setCurrentResolvedModuleRevision(resolveData.currentResolvedModuleRevision);
    }

    public ResolveData(ResolveEngine resolveEngine, ResolveOptions resolveOptions) {
        this(resolveEngine, resolveOptions, null, new LinkedHashMap());
    }

    public ResolveData(ResolveEngine resolveEngine, ResolveOptions resolveOptions, ConfigurationResolveReport configurationResolveReport) {
        this(resolveEngine, resolveOptions, configurationResolveReport, new LinkedHashMap());
    }

    public ResolveData(ResolveEngine resolveEngine, ResolveOptions resolveOptions, ConfigurationResolveReport configurationResolveReport, Map<ModuleRevisionId, VisitData> map) {
        this.currentVisitNode = null;
        this.engine = resolveEngine;
        this.report = configurationResolveReport;
        this.visitData = map;
        this.options = resolveOptions;
    }

    public ConfigurationResolveReport getReport() {
        return this.report;
    }

    public IvyNode getNode(ModuleRevisionId moduleRevisionId) {
        VisitData visitData = getVisitData(moduleRevisionId);
        if (visitData == null) {
            return null;
        }
        return visitData.getNode();
    }

    public Collection<IvyNode> getNodes() {
        ArrayList arrayList = new ArrayList();
        Iterator<VisitData> it = this.visitData.values().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getNode());
        }
        return arrayList;
    }

    public Collection<ModuleRevisionId> getNodeIds() {
        return this.visitData.keySet();
    }

    public VisitData getVisitData(ModuleRevisionId moduleRevisionId) {
        VisitData visitData = this.visitData.get(moduleRevisionId);
        if (visitData != null) {
            return visitData;
        }
        for (Map.Entry<ModuleRevisionId, VisitData> entry : this.visitData.entrySet()) {
            if (isSubMap(moduleRevisionId.getAttributes(), entry.getKey().getAttributes())) {
                return entry.getValue();
            }
        }
        return visitData;
    }

    public static <K, V> boolean isSubMap(Map<K, V> map, Map<K, V> map2) {
        int size = map.size();
        int size2 = map2.size();
        if (size == size2) {
            return map.equals(map2);
        }
        Map<K, V> map3 = size < size2 ? map : map2;
        if (size < size2) {
            map = map2;
        }
        for (Map.Entry<K, V> entry : map3.entrySet()) {
            if (!map.containsKey(entry.getKey()) || !isEqual(map3.get(entry.getKey()), map.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEqual(Object obj, Object obj2) {
        return obj == obj2 || !(obj == null || obj2 == null || !obj.equals(obj2));
    }

    public VisitNode getCurrentVisitNode() {
        return this.currentVisitNode;
    }

    public void setCurrentVisitNode(VisitNode visitNode) {
        this.currentVisitNode = visitNode;
    }

    public void register(VisitNode visitNode) {
        register(visitNode.getId(), visitNode);
    }

    public void register(ModuleRevisionId moduleRevisionId, VisitNode visitNode) {
        VisitData visitData = getVisitData(moduleRevisionId);
        if (visitData == null) {
            VisitData visitData2 = new VisitData(visitNode.getNode());
            visitData2.addVisitNode(visitNode);
            this.visitData.put(moduleRevisionId, visitData2);
        } else {
            visitData.setNode(visitNode.getNode());
            visitData.addVisitNode(visitNode);
        }
    }

    public void replaceNode(ModuleRevisionId moduleRevisionId, IvyNode ivyNode, String str) {
        VisitData visitData = getVisitData(moduleRevisionId);
        if (visitData == null) {
            throw new IllegalArgumentException("impossible to replace node for id " + moduleRevisionId + ". No registered node found.");
        }
        VisitData visitData2 = getVisitData(ivyNode.getId());
        if (visitData2 == null) {
            throw new IllegalArgumentException("impossible to replace node with " + ivyNode + ". No registered node found for " + ivyNode.getId() + ".");
        }
        this.visitData.put(moduleRevisionId, visitData2);
        visitData2.addVisitNodes(str, visitData.getVisitNodes(str));
        this.report.updateDependency(moduleRevisionId, ivyNode);
    }

    public void setReport(ConfigurationResolveReport configurationResolveReport) {
        this.report = configurationResolveReport;
    }

    public Date getDate() {
        return this.options.getDate();
    }

    public boolean isValidate() {
        return this.options.isValidate();
    }

    public boolean isTransitive() {
        return this.options.isTransitive();
    }

    public ResolveOptions getOptions() {
        return this.options;
    }

    public ResolveEngineSettings getSettings() {
        return this.engine.getSettings();
    }

    public EventManager getEventManager() {
        return this.engine.getEventManager();
    }

    public ResolveEngine getEngine() {
        return this.engine;
    }

    public void blacklist(IvyNode ivyNode) {
        Iterator<Map.Entry<ModuleRevisionId, VisitData>> it = this.visitData.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<ModuleRevisionId, VisitData> next = it.next();
            if (next.getValue().getNode() == ivyNode && !ivyNode.getResolvedId().equals(next.getKey())) {
                it.remove();
            }
        }
    }

    public boolean isBlacklisted(String str, ModuleRevisionId moduleRevisionId) {
        IvyNode node = getNode(moduleRevisionId);
        return node != null && node.isBlacklisted(str);
    }

    public DependencyDescriptor mediate(DependencyDescriptor dependencyDescriptor) {
        DependencyDescriptor dependencyDescriptorMediate = getEngine().mediate(dependencyDescriptor, getOptions());
        VisitNode currentVisitNode = getCurrentVisitNode();
        if (currentVisitNode != null) {
            ArrayList arrayList = new ArrayList(currentVisitNode.getPath());
            arrayList.remove(arrayList.size() - 1);
            Collections.reverse(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ModuleDescriptor descriptor = ((VisitNode) it.next()).getDescriptor();
                if (descriptor != null) {
                    dependencyDescriptorMediate = descriptor.mediate(dependencyDescriptorMediate);
                }
            }
        }
        if (dependencyDescriptor != dependencyDescriptorMediate) {
            Message.verbose("dependency descriptor has been mediated: " + dependencyDescriptor + " => " + dependencyDescriptorMediate);
        }
        return dependencyDescriptorMediate;
    }

    public void setCurrentResolvedModuleRevision(ResolvedModuleRevision resolvedModuleRevision) {
        this.currentResolvedModuleRevision = resolvedModuleRevision;
    }

    public ResolvedModuleRevision getCurrentResolvedModuleRevision() {
        return this.currentResolvedModuleRevision;
    }
}
