package org.apache.ivy.core.resolve;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.plugins.conflict.ConflictManager;

/* loaded from: classes5.dex */
public class IvyNodeEviction {
    public IvyNode node;
    public Map<ModuleIdConf, Set<IvyNode>> selectedDeps = new HashMap();
    public Map<ModuleIdConf, Set<IvyNode>> pendingConflicts = new HashMap();
    public Map<ModuleIdConf, Set<IvyNode>> evictedDeps = new HashMap();
    public Map<ModuleIdConf, Collection<ModuleRevisionId>> evictedRevs = new HashMap();
    public Map<String, EvictionData> evicted = new HashMap();

    public static class EvictionData {
        public ConflictManager conflictManager;
        public String detail;
        public IvyNode parent;
        public String rootModuleConf;
        public Collection<IvyNode> selected;

        public EvictionData(String str, IvyNode ivyNode, ConflictManager conflictManager, Collection<IvyNode> collection) {
            this(str, ivyNode, conflictManager, collection, null);
        }

        public EvictionData(String str, IvyNode ivyNode, ConflictManager conflictManager, Collection<IvyNode> collection, String str2) {
            this.rootModuleConf = str;
            this.parent = ivyNode;
            this.conflictManager = conflictManager;
            this.selected = collection;
            this.detail = str2;
        }

        public String toString() {
            String str;
            if (this.selected != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.selected);
                sb.append(" in ");
                sb.append(this.parent);
                if (this.detail == null) {
                    str = "";
                } else {
                    str = " " + this.detail;
                }
                sb.append(str);
                sb.append(" (");
                sb.append(this.conflictManager);
                sb.append(") [");
                sb.append(this.rootModuleConf);
                sb.append("]");
                return sb.toString();
            }
            return "transitively [" + this.rootModuleConf + "]";
        }

        public ConflictManager getConflictManager() {
            return this.conflictManager;
        }

        public IvyNode getParent() {
            return this.parent;
        }

        public Collection<IvyNode> getSelected() {
            return this.selected;
        }

        public String getRootModuleConf() {
            return this.rootModuleConf;
        }

        public boolean isTransitivelyEvicted() {
            return this.parent == null;
        }

        public String getDetail() {
            return this.detail;
        }
    }

    public static final class ModuleIdConf {
        public String conf;
        public ModuleId moduleId;

        public ModuleIdConf(ModuleId moduleId, String str) {
            if (moduleId == null) {
                throw new NullPointerException("mid cannot be null");
            }
            if (str == null) {
                throw new NullPointerException("conf cannot be null");
            }
            this.moduleId = moduleId;
            this.conf = str;
        }

        public final String getConf() {
            return this.conf;
        }

        public final ModuleId getModuleId() {
            return this.moduleId;
        }

        public boolean equals(Object obj) {
            if (obj instanceof ModuleIdConf) {
                ModuleIdConf moduleIdConf = (ModuleIdConf) obj;
                if (getModuleId().equals(moduleIdConf.getModuleId()) && getConf().equals(moduleIdConf.getConf())) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (getModuleId().hashCode() * 17) + 33 + (getConf().hashCode() * 17);
        }
    }

    public IvyNodeEviction(IvyNode ivyNode) {
        if (ivyNode == null) {
            throw new NullPointerException("node must not be null");
        }
        this.node = ivyNode;
    }

    public Set<IvyNode> getResolvedNodes(ModuleId moduleId, String str) {
        Set<IvyNode> set = this.selectedDeps.get(new ModuleIdConf(moduleId, str));
        HashSet hashSet = new HashSet();
        if (set != null) {
            Iterator<IvyNode> it = set.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getRealNode());
            }
        }
        return hashSet;
    }

    public Collection<ModuleRevisionId> getResolvedRevisions(ModuleId moduleId, String str) {
        Set<IvyNode> set = this.selectedDeps.get(new ModuleIdConf(moduleId, str));
        if (set == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        for (IvyNode ivyNode : set) {
            ModuleRevisionId resolvedId = ivyNode.getResolvedId();
            hashSet.add(ivyNode.getId());
            hashSet.add(resolvedId);
            if (!resolvedId.getExtraAttributes().isEmpty()) {
                hashSet.add(ModuleRevisionId.newInstance(resolvedId.getOrganisation(), resolvedId.getName(), resolvedId.getBranch(), resolvedId.getRevision()));
            }
        }
        return hashSet;
    }

    public void setResolvedNodes(ModuleId moduleId, String str, Collection<IvyNode> collection) {
        this.selectedDeps.put(new ModuleIdConf(moduleId, str), new HashSet(collection));
    }

    public Collection<IvyNode> getEvictedNodes(ModuleId moduleId, String str) {
        Set<IvyNode> set = this.evictedDeps.get(new ModuleIdConf(moduleId, str));
        HashSet hashSet = new HashSet();
        if (set != null) {
            Iterator<IvyNode> it = set.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getRealNode());
            }
        }
        return hashSet;
    }

    public Collection<ModuleRevisionId> getEvictedRevisions(ModuleId moduleId, String str) {
        Collection<ModuleRevisionId> collection = this.evictedRevs.get(new ModuleIdConf(moduleId, str));
        if (collection == null) {
            return new HashSet();
        }
        return new HashSet(collection);
    }

    public void setEvictedNodes(ModuleId moduleId, String str, Collection<IvyNode> collection) {
        ModuleIdConf moduleIdConf = new ModuleIdConf(moduleId, str);
        this.evictedDeps.put(moduleIdConf, new HashSet(collection));
        HashSet hashSet = new HashSet();
        for (IvyNode ivyNode : collection) {
            hashSet.add(ivyNode.getId());
            hashSet.add(ivyNode.getResolvedId());
        }
        this.evictedRevs.put(moduleIdConf, hashSet);
    }

    public boolean isEvicted(String str) {
        EvictionData evictedData;
        cleanEvicted();
        if (this.node.isRoot() || (evictedData = getEvictedData(str)) == null) {
            return false;
        }
        return !this.node.getRoot().getResolvedRevisions(this.node.getId().getModuleId(), str).contains(this.node.getResolvedId()) || evictedData.isTransitivelyEvicted();
    }

    public boolean isCompletelyEvicted() {
        cleanEvicted();
        if (this.node.isRoot()) {
            return false;
        }
        for (String str : this.node.getRootModuleConfigurations()) {
            if (!isEvicted(str)) {
                return false;
            }
        }
        return true;
    }

    public final void cleanEvicted() {
        Iterator<String> it = this.evicted.keySet().iterator();
        while (it.hasNext()) {
            Collection<IvyNode> selected = this.evicted.get(it.next()).getSelected();
            if (selected != null) {
                Iterator<IvyNode> it2 = selected.iterator();
                while (it2.hasNext()) {
                    if (it2.next().getRealNode().equals(this.node)) {
                        it.remove();
                    }
                }
            }
        }
    }

    public void markEvicted(EvictionData evictionData) {
        this.evicted.put(evictionData.getRootModuleConf(), evictionData);
    }

    public EvictionData getEvictedData(String str) {
        cleanEvicted();
        return this.evicted.get(str);
    }

    public String[] getEvictedConfs() {
        cleanEvicted();
        return (String[]) this.evicted.keySet().toArray(new String[this.evicted.keySet().size()]);
    }

    public Collection<IvyNode> getAllEvictingNodes() {
        Iterator<EvictionData> it = this.evicted.values().iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            Collection<IvyNode> selected = it.next().getSelected();
            if (selected != null) {
                if (hashSet == null) {
                    hashSet = new HashSet();
                }
                hashSet.addAll(selected);
            }
        }
        return hashSet;
    }

    public Collection<String> getAllEvictingNodesDetails() {
        HashSet hashSet = null;
        for (EvictionData evictionData : this.evicted.values()) {
            Collection<IvyNode> selected = evictionData.getSelected();
            if (selected != null) {
                if (hashSet == null) {
                    hashSet = new HashSet();
                }
                if (selected.size() == 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(selected.iterator().next());
                    sb.append(evictionData.getDetail() != null ? " " + evictionData.getDetail() : "");
                    hashSet.add(sb.toString());
                } else if (selected.size() > 1) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(selected);
                    sb2.append(evictionData.getDetail() != null ? " " + evictionData.getDetail() : "");
                    hashSet.add(sb2.toString());
                }
            }
        }
        return hashSet;
    }

    public Collection<ConflictManager> getAllEvictingConflictManagers() {
        HashSet hashSet = new HashSet();
        Iterator<EvictionData> it = this.evicted.values().iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getConflictManager());
        }
        return hashSet;
    }

    public EvictionData getEvictionDataInRoot(String str, IvyNode ivyNode) {
        Set<IvyNode> resolvedNodes = this.node.getRoot().getResolvedNodes(this.node.getModuleId(), str);
        Iterator<IvyNode> it = resolvedNodes.iterator();
        while (it.hasNext()) {
            if (it.next().getResolvedId().equals(this.node.getResolvedId())) {
                return null;
            }
        }
        return new EvictionData(str, ivyNode, this.node.getRoot().getConflictManager(this.node.getModuleId()), resolvedNodes);
    }

    public Collection<IvyNode> getPendingConflicts(String str, ModuleId moduleId) {
        Set<IvyNode> set = this.pendingConflicts.get(new ModuleIdConf(moduleId, str));
        HashSet hashSet = new HashSet();
        if (set != null) {
            Iterator<IvyNode> it = set.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getRealNode());
            }
        }
        return hashSet;
    }

    public void setPendingConflicts(ModuleId moduleId, String str, Collection<IvyNode> collection) {
        this.pendingConflicts.put(new ModuleIdConf(moduleId, str), new HashSet(collection));
    }
}
