package org.apache.ivy.core.resolve;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.Configuration;
import org.apache.ivy.core.module.descriptor.DefaultArtifact;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;

/* loaded from: classes5.dex */
public class IvyNodeCallers {
    public IvyNode node;
    public Map<String, Map<ModuleRevisionId, Caller>> callersByRootConf = new HashMap();
    public Map<ModuleId, IvyNode> allCallers = new HashMap();

    public static class Caller {
        public boolean callerCanExclude;

        /* renamed from: dd */
        public DependencyDescriptor f9968dd;

        /* renamed from: md */
        public ModuleDescriptor f9969md;
        public ModuleRevisionId mrid;
        public Map<String, String[]> confs = new HashMap();
        public boolean real = true;

        public Caller(ModuleDescriptor moduleDescriptor, ModuleRevisionId moduleRevisionId, DependencyDescriptor dependencyDescriptor, boolean z) {
            this.f9969md = moduleDescriptor;
            this.mrid = moduleRevisionId;
            this.f9968dd = dependencyDescriptor;
            this.callerCanExclude = z;
        }

        public void addConfiguration(String str, String[] strArr) {
            String[] strArr2;
            updateConfs(str, strArr);
            Configuration configuration = this.f9969md.getConfiguration(str);
            if (configuration == null || (strArr2 = configuration.getExtends()) == null) {
                return;
            }
            for (String str2 : strArr2) {
                addConfiguration(str2, strArr);
            }
        }

        public final void updateConfs(String str, String[] strArr) {
            String[] strArr2 = this.confs.get(str);
            if (strArr2 != null) {
                HashSet hashSet = new HashSet(Arrays.asList(strArr2));
                hashSet.addAll(Arrays.asList(strArr));
                this.confs.put(str, (String[]) hashSet.toArray(new String[hashSet.size()]));
                return;
            }
            this.confs.put(str, strArr);
        }

        public String[] getCallerConfigurations() {
            return (String[]) this.confs.keySet().toArray(new String[this.confs.keySet().size()]);
        }

        public ModuleRevisionId getModuleRevisionId() {
            return this.mrid;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Caller)) {
                return false;
            }
            Caller caller = (Caller) obj;
            return caller.confs.equals(this.confs) && this.mrid.equals(caller.mrid);
        }

        public int hashCode() {
            return ((403 + this.confs.hashCode()) * 13) + this.mrid.hashCode();
        }

        public String toString() {
            return this.mrid.toString();
        }

        @Deprecated
        public ModuleRevisionId getAskedDependencyId(ResolveData resolveData) {
            return getAskedDependencyId();
        }

        public ModuleRevisionId getAskedDependencyId() {
            return this.f9968dd.getDependencyRevisionId();
        }

        public ModuleDescriptor getModuleDescriptor() {
            return this.f9969md;
        }

        public boolean canExclude() {
            return this.callerCanExclude || this.f9969md.canExclude() || this.f9968dd.canExclude();
        }

        public DependencyDescriptor getDependencyDescriptor() {
            return this.f9968dd;
        }

        public void setRealCaller(boolean z) {
            this.real = z;
        }

        public boolean isRealCaller() {
            return this.real;
        }
    }

    public IvyNodeCallers(IvyNode ivyNode) {
        this.node = ivyNode;
    }

    public void addCaller(String str, IvyNode ivyNode, String str2, String str3, String[] strArr, DependencyDescriptor dependencyDescriptor) {
        ModuleDescriptor descriptor = ivyNode.getDescriptor();
        ModuleRevisionId resolvedId = ivyNode.getResolvedId();
        if (resolvedId.getModuleId().equals(this.node.getId().getModuleId())) {
            throw new IllegalArgumentException("a module is not authorized to depend on itself: " + this.node.getId());
        }
        Map<ModuleRevisionId, Caller> map = this.callersByRootConf.get(str);
        if (map == null) {
            map = new HashMap<>();
            this.callersByRootConf.put(str, map);
        }
        Caller caller = map.get(resolvedId);
        if (caller == null) {
            caller = new Caller(descriptor, resolvedId, dependencyDescriptor, ivyNode.canExclude(str));
            map.put(resolvedId, caller);
        }
        caller.addConfiguration(str3, strArr);
        IvyNode realNode = ivyNode.getRealNode();
        Iterator<ModuleId> it = realNode.getAllCallersModuleIds().iterator();
        while (it.hasNext()) {
            this.allCallers.put(it.next(), realNode);
        }
        this.allCallers.put(resolvedId.getModuleId(), ivyNode);
    }

    public void removeCaller(String str, ModuleRevisionId moduleRevisionId) {
        this.allCallers.remove(moduleRevisionId.getModuleId());
        Map<ModuleRevisionId, Caller> map = this.callersByRootConf.get(str);
        if (map != null) {
            map.remove(moduleRevisionId);
        }
    }

    public Caller[] getCallers(String str) {
        Map<ModuleRevisionId, Caller> map = this.callersByRootConf.get(str);
        if (map == null) {
            return new Caller[0];
        }
        return (Caller[]) map.values().toArray(new Caller[map.values().size()]);
    }

    public final Set<Caller> getCallersByMrid(String str, ModuleRevisionId moduleRevisionId) {
        Map<ModuleRevisionId, Caller> map = this.callersByRootConf.get(str);
        if (map == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (Caller caller : map.values()) {
            if (caller.getAskedDependencyId().equals(moduleRevisionId)) {
                hashSet.add(caller);
            }
        }
        return hashSet;
    }

    public Caller[] getAllCallers() {
        HashSet hashSet = new HashSet();
        Iterator<Map<ModuleRevisionId, Caller>> it = this.callersByRootConf.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().values());
        }
        return (Caller[]) hashSet.toArray(new Caller[hashSet.size()]);
    }

    public Caller[] getAllRealCallers() {
        HashSet hashSet = new HashSet();
        Iterator<Map<ModuleRevisionId, Caller>> it = this.callersByRootConf.values().iterator();
        while (it.hasNext()) {
            for (Caller caller : it.next().values()) {
                if (caller.isRealCaller()) {
                    hashSet.add(caller);
                }
            }
        }
        return (Caller[]) hashSet.toArray(new Caller[hashSet.size()]);
    }

    public Collection<ModuleId> getAllCallersModuleIds() {
        return this.allCallers.keySet();
    }

    public void updateFrom(IvyNodeCallers ivyNodeCallers, String str, boolean z) {
        Map<ModuleRevisionId, Caller> map = ivyNodeCallers.callersByRootConf.get(str);
        if (map != null) {
            Map<ModuleRevisionId, Caller> map2 = this.callersByRootConf.get(str);
            if (map2 == null) {
                map2 = new HashMap<>();
                this.callersByRootConf.put(str, map2);
            }
            for (Caller caller : map.values()) {
                if (!map2.containsKey(caller.getModuleRevisionId())) {
                    if (!z) {
                        caller.setRealCaller(false);
                    }
                    map2.put(caller.getModuleRevisionId(), caller);
                }
            }
        }
    }

    public IvyNode getDirectCallerFor(ModuleId moduleId) {
        return this.allCallers.get(moduleId);
    }

    public boolean doesCallersExclude(String str, Artifact artifact) {
        return doesCallersExclude(str, artifact, new ArrayDeque());
    }

    public boolean doesCallersExclude(String str, Artifact artifact, Deque<IvyNode> deque) {
        deque.push(this.node);
        try {
            Set<Caller> callersByMrid = getCallersByMrid(str, this.node.getId());
            if (!callersByMrid.isEmpty()) {
                String[] strArr = {str};
                boolean z = true;
                for (Caller caller : callersByMrid) {
                    Iterator<IvyNode> it = deque.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            IvyNode next = it.next();
                            IvyNode ivyNode = this.node;
                            if (ivyNode.directlyExcludes(ivyNode.getDescriptor(), strArr, caller.getDependencyDescriptor(), DefaultArtifact.newIvyArtifact(next.getId(), null))) {
                                break;
                            }
                        } else if (caller.canExclude()) {
                            Boolean boolDoesExclude = this.node.doesExclude(caller.getModuleDescriptor(), str, caller.getCallerConfigurations(), caller.getDependencyDescriptor(), artifact, deque);
                            if (boolDoesExclude == null) {
                                continue;
                            } else if (!boolDoesExclude.booleanValue()) {
                                deque.pop();
                                return false;
                            }
                        } else {
                            deque.pop();
                            return false;
                        }
                    }
                    z = false;
                }
                boolean z2 = !z;
                deque.pop();
                return z2;
            }
            deque.pop();
            return false;
        } catch (Throwable th) {
            deque.pop();
            throw th;
        }
    }
}
