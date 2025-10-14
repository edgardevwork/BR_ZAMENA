package org.apache.ivy.core.resolve;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.ivy.core.module.descriptor.DefaultIncludeRule;
import org.apache.ivy.core.module.descriptor.DependencyArtifactDescriptor;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.descriptor.IncludeRule;
import org.apache.ivy.core.module.descriptor.WorkspaceModuleDescriptor;
import org.apache.ivy.core.module.p062id.ArtifactId;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.plugins.matcher.ExactPatternMatcher;

/* loaded from: classes5.dex */
public class IvyNodeUsage {
    public IvyNode node;
    public Map<String, Set<String>> rootModuleConfs = new HashMap();
    public Map<NodeConf, Set<String>> requiredConfs = new HashMap();
    public Map<String, Set<Depender>> dependers = new HashMap();
    public Map<String, IvyNodeBlacklist> blacklisted = new HashMap();

    public static final class NodeConf {
        public String conf;
        public IvyNode node;

        public NodeConf(IvyNode ivyNode, String str) {
            if (ivyNode == null) {
                throw new NullPointerException("node must not null");
            }
            if (str == null) {
                throw new NullPointerException("conf must not null");
            }
            this.node = ivyNode;
            this.conf = str;
        }

        public final String getConf() {
            return this.conf;
        }

        public final IvyNode getNode() {
            return this.node;
        }

        public boolean equals(Object obj) {
            if (obj instanceof NodeConf) {
                NodeConf nodeConf = (NodeConf) obj;
                if (getNode().equals(nodeConf.getNode()) && getConf().equals(nodeConf.getConf())) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (getNode().hashCode() * 17) + 33 + (getConf().hashCode() * 17);
        }

        public String toString() {
            return "NodeConf(" + this.conf + ")";
        }
    }

    public static final class Depender {

        /* renamed from: dd */
        public DependencyDescriptor f9970dd;
        public String dependerConf;

        public Depender(DependencyDescriptor dependencyDescriptor, String str) {
            this.f9970dd = dependencyDescriptor;
            this.dependerConf = str;
        }

        public String toString() {
            return this.f9970dd + " [" + this.dependerConf + "]";
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Depender)) {
                return false;
            }
            Depender depender = (Depender) obj;
            return depender.f9970dd == this.f9970dd && depender.dependerConf.equals(this.dependerConf);
        }

        public int hashCode() {
            return (this.f9970dd.hashCode() * 13) + 33 + (this.dependerConf.hashCode() * 13);
        }
    }

    public IvyNodeUsage(IvyNode ivyNode) {
        this.node = ivyNode;
    }

    public Collection<String> getRequiredConfigurations(IvyNode ivyNode, String str) {
        return this.requiredConfs.get(new NodeConf(ivyNode, str));
    }

    public void setRequiredConfs(IvyNode ivyNode, String str, Collection<String> collection) {
        this.requiredConfs.put(new NodeConf(ivyNode, str), new HashSet(collection));
    }

    public Set<String> getConfigurations(String str) {
        return this.rootModuleConfs.get(str);
    }

    public Set<String> addAndGetConfigurations(String str) {
        Set<String> set = this.rootModuleConfs.get(str);
        if (set != null) {
            return set;
        }
        HashSet hashSet = new HashSet();
        this.rootModuleConfs.put(str, hashSet);
        return hashSet;
    }

    public Set<String> getRootModuleConfigurations() {
        return this.rootModuleConfs.keySet();
    }

    public void updateDataFrom(Collection<IvyNodeUsage> collection, String str) {
        Iterator<IvyNodeUsage> it = collection.iterator();
        while (it.hasNext()) {
            updateDataFrom(it.next(), str);
        }
    }

    public final void updateDataFrom(IvyNodeUsage ivyNodeUsage, String str) {
        updateMapOfSet(ivyNodeUsage.requiredConfs, this.requiredConfs);
        updateMapOfSetForKey(ivyNodeUsage.rootModuleConfs, this.rootModuleConfs, str);
        updateMapOfSetForKey(ivyNodeUsage.dependers, this.dependers, str);
    }

    public final <K, V> void updateMapOfSet(Map<K, Set<V>> map, Map<K, Set<V>> map2) {
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            updateMapOfSetForKey(map, map2, it.next());
        }
    }

    public final <K, V> void updateMapOfSetForKey(Map<K, Set<V>> map, Map<K, Set<V>> map2, K k) {
        Set<V> set = map.get(k);
        if (set != null) {
            Set<V> set2 = map2.get(k);
            if (set2 != null) {
                set2.addAll(set);
            } else {
                map2.put(k, new HashSet(set));
            }
        }
    }

    public final <K, V> void addObjectsForConf(K k, V v, Map<K, Set<V>> map) {
        Set<V> hashSet = map.get(k);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            map.put(k, hashSet);
        }
        hashSet.add(v);
    }

    public void addUsage(String str, DependencyDescriptor dependencyDescriptor, String str2) {
        addObjectsForConf(str, new Depender(dependencyDescriptor, str2), this.dependers);
    }

    public Set<DependencyArtifactDescriptor> getDependencyArtifactsSet(String str) {
        Set<Depender> set;
        if ((this.node.getDescriptor() instanceof WorkspaceModuleDescriptor) || (set = this.dependers.get(str)) == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (Depender depender : set) {
            hashSet.addAll(Arrays.asList(depender.f9970dd.getDependencyArtifacts(depender.dependerConf)));
        }
        return hashSet;
    }

    public Set<IncludeRule> getDependencyIncludesSet(String str) {
        Set<Depender> set = this.dependers.get(str);
        if (set == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        boolean z = false;
        boolean z2 = false;
        for (Depender depender : set) {
            DependencyArtifactDescriptor[] dependencyArtifacts = depender.f9970dd.getDependencyArtifacts(depender.f9970dd.getModuleConfigurations());
            boolean z3 = dependencyArtifacts != null && dependencyArtifacts.length > 0;
            IncludeRule[] includeRules = depender.f9970dd.getIncludeRules(depender.dependerConf);
            boolean z4 = includeRules != null && includeRules.length > 0;
            if (z4) {
                hashSet.addAll(Arrays.asList(includeRules));
            }
            if (z3 || z4) {
                z = true;
            }
            if (!z4 && !z3) {
                z2 = true;
            }
        }
        if (z && z2) {
            hashSet.add(includeAllArtifacts());
        }
        return hashSet;
    }

    public void removeRootModuleConf(String str) {
        this.rootModuleConfs.remove(str);
    }

    public void blacklist(IvyNodeBlacklist ivyNodeBlacklist) {
        this.blacklisted.put(ivyNodeBlacklist.getRootModuleConf(), ivyNodeBlacklist);
    }

    public boolean isBlacklisted(String str) {
        return this.blacklisted.containsKey(str);
    }

    public IvyNodeBlacklist getBlacklistData(String str) {
        return this.blacklisted.get(str);
    }

    public IvyNode getNode() {
        return this.node;
    }

    public boolean hasTransitiveDepender(String str) {
        Set<Depender> set = this.dependers.get(str);
        if (set == null) {
            return false;
        }
        Iterator<Depender> it = set.iterator();
        while (it.hasNext()) {
            if (it.next().f9970dd.isTransitive()) {
                return true;
            }
        }
        return false;
    }

    public static IncludeRule includeAllArtifacts() {
        return new DefaultIncludeRule(new ArtifactId(new ModuleId("*", "*"), "*", "*", "*"), ExactPatternMatcher.INSTANCE, null);
    }
}
