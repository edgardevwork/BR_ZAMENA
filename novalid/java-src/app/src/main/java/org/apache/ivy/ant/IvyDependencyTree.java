package org.apache.ivy.ant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.report.ResolveReport;
import org.apache.ivy.core.resolve.IvyNode;
import org.apache.ivy.core.resolve.IvyNodeCallers;
import org.apache.ivy.core.resolve.IvyNodeEviction;
import org.apache.tools.ant.BuildException;

/* loaded from: classes8.dex */
public class IvyDependencyTree extends IvyPostResolveTask {
    public final Map<ModuleRevisionId, List<IvyNode>> dependencies = new HashMap();
    public boolean showEvicted = false;

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    @Override // org.apache.ivy.ant.IvyTask
    public void doExecute() throws BuildException {
        prepareAndCheck();
        ResolveReport resolvedReport = getResolvedReport();
        if (resolvedReport == null) {
            throw new BuildException("No resolution report was available to run the post-resolve task. Make sure resolve was done before this task");
        }
        log("Dependency tree for " + resolvedReport.getResolveId());
        ModuleRevisionId moduleRevisionId = resolvedReport.getModuleDescriptor().getModuleRevisionId();
        Iterator<IvyNode> it = resolvedReport.getDependencies().iterator();
        while (it.hasNext()) {
            populateDependencyTree(it.next());
        }
        List<IvyNode> list = this.dependencies.get(moduleRevisionId);
        if (list != null) {
            printDependencies(moduleRevisionId, list, 0, new HashSet());
        }
    }

    public final void printDependencies(ModuleRevisionId moduleRevisionId, List<IvyNode> list, int i, Set<ModuleRevisionId> set) {
        for (IvyNode ivyNode : list) {
            HashSet hashSet = new HashSet(set);
            hashSet.add(moduleRevisionId);
            boolean zIsEvicted = ivyNode.isEvicted(getConf());
            if (!zIsEvicted || this.showEvicted) {
                boolean z = list.indexOf(ivyNode) == list.size() - 1;
                StringBuilder sb = new StringBuilder();
                ModuleRevisionId id = ivyNode.getId();
                boolean zContains = hashSet.contains(id);
                if (i > 0) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (i2 == i - 1 && z && !hasDependencies(ivyNode)) {
                            sb.append("   ");
                        } else {
                            sb.append("|  ");
                        }
                    }
                }
                sb.append(z ? "\\- " : "+- ");
                if (!zIsEvicted && zContains) {
                    sb.append("(circularly depends on) ");
                    sb.append(id);
                    log(sb.toString());
                } else {
                    sb.append(id.toString());
                    if (zIsEvicted && this.showEvicted) {
                        IvyNodeEviction.EvictionData evictedData = ivyNode.getEvictedData(getConf());
                        if (evictedData.isTransitivelyEvicted()) {
                            sb.append(" transitively");
                        } else {
                            sb.append(" evicted by ");
                            sb.append(evictedData.getSelected());
                            sb.append(" in ");
                            sb.append(evictedData.getParent());
                            if (evictedData.getDetail() != null) {
                                sb.append(" ");
                                sb.append(evictedData.getDetail());
                            }
                        }
                    }
                    log(sb.toString());
                    printDependencies(id, this.dependencies.get(id), i + 1, hashSet);
                }
            }
        }
    }

    public final boolean hasDependencies(IvyNode ivyNode) {
        List<IvyNode> list;
        return (ivyNode == null || (list = this.dependencies.get(ivyNode.getId())) == null || list.isEmpty()) ? false : true;
    }

    public final void populateDependencyTree(IvyNode ivyNode) {
        registerNodeIfNecessary(ivyNode.getId());
        for (IvyNodeCallers.Caller caller : ivyNode.getAllCallers()) {
            addDependency(caller.getModuleRevisionId(), ivyNode);
        }
    }

    public final void registerNodeIfNecessary(ModuleRevisionId moduleRevisionId) {
        if (this.dependencies.containsKey(moduleRevisionId)) {
            return;
        }
        this.dependencies.put(moduleRevisionId, new ArrayList());
    }

    public final void addDependency(ModuleRevisionId moduleRevisionId, IvyNode ivyNode) {
        registerNodeIfNecessary(moduleRevisionId);
        this.dependencies.get(moduleRevisionId).add(ivyNode);
    }

    public boolean isShowEvicted() {
        return this.showEvicted;
    }

    public void setShowEvicted(boolean z) {
        this.showEvicted = z;
    }
}
