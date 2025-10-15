package org.apache.ivy.core.resolve;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.apache.ivy.core.IvyContext;
import org.apache.ivy.core.module.descriptor.Configuration;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.resolve.IvyNodeEviction;
import org.apache.ivy.plugins.circular.CircularDependencyException;
import org.apache.ivy.plugins.conflict.ConflictManager;
import org.apache.ivy.util.Checks;

/* loaded from: classes5.dex */
public class VisitNode {
    public ResolveData data;
    public Boolean isCircular;
    public IvyNode node;
    public VisitNode parent;
    public String parentConf;
    public Collection<VisitNode> path;
    public String requestedConf;
    public VisitNode root;
    public String rootModuleConf;
    public IvyNodeUsage usage;

    public VisitNode(ResolveData resolveData, IvyNode ivyNode, VisitNode visitNode, String str, String str2) {
        this(resolveData, ivyNode, visitNode, str, str2, null);
    }

    public VisitNode(ResolveData resolveData, IvyNode ivyNode, VisitNode visitNode, String str, String str2, IvyNodeUsage ivyNodeUsage) {
        this.parent = null;
        this.root = null;
        this.path = null;
        this.parentConf = null;
        Checks.checkNotNull(resolveData, "data");
        Checks.checkNotNull(ivyNode, "node");
        Checks.checkNotNull(str, "rootModuleConf");
        this.data = resolveData;
        this.node = ivyNode;
        this.parent = visitNode;
        this.rootModuleConf = str;
        this.parentConf = str2;
        this.usage = ivyNodeUsage;
        resolveData.register(this);
    }

    public IvyNode getNode() {
        return this.node;
    }

    public String getRequestedConf() {
        return this.requestedConf;
    }

    public void setRequestedConf(String str) {
        this.requestedConf = str;
    }

    public VisitNode getParent() {
        return this.parent;
    }

    public VisitNode getRoot() {
        if (this.root == null) {
            this.root = computeRoot();
        }
        return this.root;
    }

    public Collection<VisitNode> getPath() {
        if (this.path == null) {
            this.path = computePath();
        }
        return this.path;
    }

    public final Collection<VisitNode> computePath() {
        if (this.parent != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.parent.getPath());
            linkedHashSet.add(this);
            return linkedHashSet;
        }
        return Collections.singletonList(this);
    }

    public final VisitNode computeRoot() {
        if (this.node.isRoot()) {
            return this;
        }
        VisitNode visitNode = this.parent;
        if (visitNode != null) {
            return visitNode.getRoot();
        }
        return null;
    }

    public String getParentConf() {
        return this.parentConf;
    }

    public void setParentConf(String str) {
        this.parentConf = str;
    }

    public String getRootModuleConf() {
        return this.rootModuleConf;
    }

    public static VisitNode getRoot(VisitNode visitNode) {
        HashSet hashSet = new HashSet();
        hashSet.add(visitNode);
        while (visitNode.getParent() != null && !visitNode.getNode().isRoot() && !hashSet.contains(visitNode.getParent())) {
            visitNode = visitNode.getParent();
            hashSet.add(visitNode);
        }
        return visitNode;
    }

    public boolean isTransitive() {
        if (this.node.isRoot()) {
            return true;
        }
        if (!this.data.isTransitive() || !isParentConfTransitive()) {
            return false;
        }
        DependencyDescriptor dependencyDescriptor = this.node.getDependencyDescriptor(getParentNode());
        return (dependencyDescriptor != null && dependencyDescriptor.isTransitive()) || this.node.hasAnyMergedUsageWithTransitiveDependency(this.rootModuleConf);
    }

    public boolean isParentConfTransitive() {
        String requestedConf = getParent().getRequestedConf();
        if (requestedConf == null) {
            return true;
        }
        return getParentNode().getConfiguration(requestedConf).isTransitive();
    }

    public IvyNode getRealNode() {
        IvyNode realNode = this.node.getRealNode();
        return realNode != null ? realNode : this.node;
    }

    public void useRealNode() {
        IvyNode node;
        if (this.parent == null || (node = this.data.getNode(this.node.getId())) == null || node == this.node) {
            return;
        }
        this.node = node;
    }

    public boolean loadData(String str, boolean z) {
        boolean zLoadData = this.node.loadData(this.rootModuleConf, getParentNode(), this.parentConf, str, z, getUsage());
        if (zLoadData) {
            useRealNode();
            if (this.data.getNode(this.node.getResolvedId()) == null || !this.data.getNode(this.node.getResolvedId()).getId().equals(this.node.getResolvedId())) {
                this.data.register(this.node.getResolvedId(), this);
            }
        }
        return zLoadData;
    }

    public Collection<VisitNode> getDependencies(String str) throws CircularDependencyException {
        Collection<IvyNode> dependencies = this.node.getDependencies(this.rootModuleConf, str, this.requestedConf);
        ArrayList arrayList = new ArrayList(dependencies.size());
        Iterator<IvyNode> it = dependencies.iterator();
        while (it.hasNext()) {
            arrayList.add(traverseChild(str, it.next()));
        }
        return arrayList;
    }

    public VisitNode gotoNode(IvyNode ivyNode) {
        VisitNode visitNode;
        if (!getModuleId().equals(ivyNode.getModuleId())) {
            throw new IllegalArgumentException("You can't use gotoNode for a node which does not represent the same Module as the one represented by this node.\nCurrent node module id=" + getModuleId() + " Given node module id=" + ivyNode.getModuleId());
        }
        VisitData visitData = this.data.getVisitData(ivyNode.getId());
        if (visitData != null) {
            for (VisitNode visitNode2 : visitData.getVisitNodes(this.rootModuleConf)) {
                if ((this.parent == null && visitNode2.getParent() == null) || ((visitNode = this.parent) != null && visitNode.getId().equals(visitNode2.getParent().getId()))) {
                    visitNode2.parentConf = this.parentConf;
                    visitNode2.usage = getUsage();
                    return visitNode2;
                }
            }
        }
        return traverse(this.parent, this.parentConf, ivyNode, getUsage());
    }

    public final IvyNodeUsage getUsage() {
        IvyNodeUsage ivyNodeUsage = this.usage;
        return ivyNodeUsage == null ? this.node.getMainUsage() : ivyNodeUsage;
    }

    public final VisitNode traverseChild(String str, IvyNode ivyNode) {
        return traverse(this, str, ivyNode, null);
    }

    public final VisitNode traverse(VisitNode visitNode, String str, IvyNode ivyNode, IvyNodeUsage ivyNodeUsage) throws CircularDependencyException {
        if (getPath().contains(ivyNode)) {
            IvyContext.getContext().getCircularDependencyStrategy().handleCircularDependency(toMrids(getPath(), ivyNode.getId()));
        }
        return new VisitNode(this.data, ivyNode, visitNode, this.rootModuleConf, str, ivyNodeUsage);
    }

    public final ModuleRevisionId[] toMrids(Collection<VisitNode> collection, ModuleRevisionId moduleRevisionId) {
        int size = collection.size();
        ModuleRevisionId[] moduleRevisionIdArr = new ModuleRevisionId[size + 1];
        Iterator<VisitNode> it = collection.iterator();
        while (it.hasNext()) {
            moduleRevisionIdArr[0] = it.next().getNode().getId();
        }
        moduleRevisionIdArr[size] = moduleRevisionId;
        return moduleRevisionIdArr;
    }

    public ModuleRevisionId getResolvedId() {
        return this.node.getResolvedId();
    }

    public void updateConfsToFetch(Collection<String> collection) {
        this.node.updateConfsToFetch(collection);
    }

    public ModuleRevisionId getId() {
        return this.node.getId();
    }

    public boolean isEvicted() {
        return this.node.isEvicted(this.rootModuleConf);
    }

    public String[] getRealConfs(String str) {
        return this.node.getRealConfs(str);
    }

    public boolean hasProblem() {
        return this.node.hasProblem();
    }

    public Configuration getConfiguration(String str) {
        return this.node.getConfiguration(str);
    }

    public IvyNodeEviction.EvictionData getEvictedData() {
        return this.node.getEvictedData(this.rootModuleConf);
    }

    public DependencyDescriptor getDependencyDescriptor() {
        return this.node.getDependencyDescriptor(getParentNode());
    }

    public final IvyNode getParentNode() {
        VisitNode visitNode = this.parent;
        if (visitNode == null) {
            return null;
        }
        return visitNode.getNode();
    }

    public boolean isCircular() {
        if (this.isCircular == null) {
            VisitNode visitNode = this.parent;
            if (visitNode != null) {
                this.isCircular = Boolean.FALSE;
                Iterator<VisitNode> it = visitNode.getPath().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (getId().getModuleId().equals(it.next().getId().getModuleId())) {
                        this.isCircular = Boolean.TRUE;
                        break;
                    }
                }
            } else {
                this.isCircular = Boolean.FALSE;
            }
        }
        return this.isCircular.booleanValue();
    }

    public String[] getConfsToFetch() {
        return this.node.getConfsToFetch();
    }

    public String[] getRequiredConfigurations(VisitNode visitNode, String str) {
        return this.node.getRequiredConfigurations(visitNode.getNode(), str);
    }

    public ModuleId getModuleId() {
        return this.node.getModuleId();
    }

    public Collection<ModuleRevisionId> getResolvedRevisions(ModuleId moduleId) {
        return this.node.getResolvedRevisions(moduleId, this.rootModuleConf);
    }

    public void markEvicted(IvyNodeEviction.EvictionData evictionData) {
        this.node.markEvicted(evictionData);
    }

    public String[] getRequiredConfigurations() {
        return this.node.getRequiredConfigurations();
    }

    public void markEvicted(VisitNode visitNode, ConflictManager conflictManager, Collection<IvyNode> collection) {
        this.node.markEvicted(this.rootModuleConf, visitNode.getNode(), conflictManager, collection);
    }

    public ModuleDescriptor getDescriptor() {
        return this.node.getDescriptor();
    }

    public IvyNodeEviction.EvictionData getEvictionDataInRoot(String str, VisitNode visitNode) {
        return this.node.getEvictionDataInRoot(str, visitNode.getNode());
    }

    public Collection<ModuleRevisionId> getEvictedRevisions(ModuleId moduleId) {
        return this.node.getEvictedRevisions(moduleId, this.rootModuleConf);
    }

    public String toString() {
        return this.node.toString();
    }

    public boolean isConfRequiredByMergedUsageOnly(String str) {
        return this.node.isConfRequiredByMergedUsageOnly(this.rootModuleConf, str);
    }
}
