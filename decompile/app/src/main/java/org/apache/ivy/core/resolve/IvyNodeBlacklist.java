package org.apache.ivy.core.resolve;

/* loaded from: classes5.dex */
public class IvyNodeBlacklist {
    public IvyNode blacklistedNode;
    public IvyNode conflictParent;
    public IvyNode evictedNode;
    public String rootModuleConf;
    public IvyNode selectedNode;

    public IvyNodeBlacklist(IvyNode ivyNode, IvyNode ivyNode2, IvyNode ivyNode3, IvyNode ivyNode4, String str) {
        this.conflictParent = ivyNode;
        this.selectedNode = ivyNode2;
        this.evictedNode = ivyNode3;
        this.blacklistedNode = ivyNode4;
        this.rootModuleConf = str;
    }

    public IvyNode getConflictParent() {
        return this.conflictParent;
    }

    public IvyNode getSelectedNode() {
        return this.selectedNode;
    }

    public IvyNode getEvictedNode() {
        return this.evictedNode;
    }

    public IvyNode getBlacklistedNode() {
        return this.blacklistedNode;
    }

    public String getRootModuleConf() {
        return this.rootModuleConf;
    }

    public String toString() {
        return "[" + this.blacklistedNode + " blacklisted to evict " + this.evictedNode + " in favor of " + this.selectedNode + " in " + this.conflictParent + " for " + this.rootModuleConf + "]";
    }
}
