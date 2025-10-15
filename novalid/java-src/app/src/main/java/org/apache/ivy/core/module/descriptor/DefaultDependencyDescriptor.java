package org.apache.ivy.core.module.descriptor;

import com.blackhub.bronline.game.gui.menupausesettingandmap.NativeKeys;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.module.p062id.ArtifactId;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.plugins.matcher.MatcherHelper;
import org.apache.ivy.plugins.namespace.NameSpaceHelper;
import org.apache.ivy.plugins.namespace.Namespace;
import org.apache.ivy.plugins.namespace.NamespaceTransformer;
import org.apache.ivy.util.Checks;

/* loaded from: classes8.dex */
public class DefaultDependencyDescriptor implements DependencyDescriptor {
    public static final Pattern SELF_FALLBACK_PATTERN = Pattern.compile("@(\\+[^\\(]+)?(\\(.*\\))?");
    public static final Pattern THIS_FALLBACK_PATTERN = Pattern.compile("#(\\+[^\\(]+)?(\\(.*\\))?");
    public DependencyDescriptor asSystem;
    public Map<String, List<String>> confs;
    public Map<String, Collection<DependencyArtifactDescriptor>> dependencyArtifacts;
    public ModuleRevisionId dynamicRevId;
    public Map<String, Collection<ExcludeRule>> excludeRules;
    public Map<String, Collection<IncludeRule>> includeRules;
    public boolean isChanging;
    public boolean isForce;
    public boolean isTransitive;

    /* renamed from: md */
    public final ModuleDescriptor f9961md;
    public Namespace namespace;
    public ModuleRevisionId parentId;
    public final ModuleRevisionId revId;
    public ModuleRevisionId sourceModule;

    public static DependencyDescriptor transformInstance(DependencyDescriptor dependencyDescriptor, Namespace namespace) {
        NamespaceTransformer toSystemTransformer = namespace.getToSystemTransformer();
        if (toSystemTransformer.isIdentity()) {
            return dependencyDescriptor;
        }
        DefaultDependencyDescriptor defaultDependencyDescriptorTransformInstance = transformInstance(dependencyDescriptor, toSystemTransformer, false);
        defaultDependencyDescriptorTransformInstance.namespace = namespace;
        return defaultDependencyDescriptorTransformInstance;
    }

    public static DefaultDependencyDescriptor transformInstance(DependencyDescriptor dependencyDescriptor, NamespaceTransformer namespaceTransformer, boolean z) {
        ModuleRevisionId moduleRevisionIdTransform = namespaceTransformer.transform(dependencyDescriptor.getParentRevisionId());
        DefaultDependencyDescriptor defaultDependencyDescriptor = new DefaultDependencyDescriptor(null, namespaceTransformer.transform(dependencyDescriptor.getDependencyRevisionId()), namespaceTransformer.transform(dependencyDescriptor.getDynamicConstraintDependencyRevisionId()), dependencyDescriptor.isForce(), dependencyDescriptor.isChanging(), dependencyDescriptor.isTransitive());
        defaultDependencyDescriptor.parentId = moduleRevisionIdTransform;
        ModuleRevisionId sourceModule = dependencyDescriptor.getSourceModule();
        if (sourceModule != null) {
            defaultDependencyDescriptor.sourceModule = namespaceTransformer.transform(sourceModule);
        }
        String[] moduleConfigurations = dependencyDescriptor.getModuleConfigurations();
        if (moduleConfigurations.length != 1 || !"*".equals(moduleConfigurations[0])) {
            for (String str : moduleConfigurations) {
                defaultDependencyDescriptor.confs.put(str, new ArrayList(Arrays.asList(dependencyDescriptor.getDependencyConfigurations(str))));
                defaultDependencyDescriptor.getExcludeRules().put(str, new ArrayList(Arrays.asList(dependencyDescriptor.getExcludeRules(str))));
                defaultDependencyDescriptor.getIncludeRules().put(str, new ArrayList(Arrays.asList(dependencyDescriptor.getIncludeRules(str))));
                defaultDependencyDescriptor.getDependencyArtifacts().put(str, new ArrayList(Arrays.asList(dependencyDescriptor.getDependencyArtifacts(str))));
            }
        } else if (dependencyDescriptor instanceof DefaultDependencyDescriptor) {
            DefaultDependencyDescriptor defaultDependencyDescriptor2 = (DefaultDependencyDescriptor) dependencyDescriptor;
            defaultDependencyDescriptor.confs = new LinkedHashMap(defaultDependencyDescriptor2.confs);
            defaultDependencyDescriptor.setExcludeRules(new LinkedHashMap(defaultDependencyDescriptor2.getExcludeRules()));
            defaultDependencyDescriptor.setIncludeRules(new LinkedHashMap(defaultDependencyDescriptor2.getIncludeRules()));
            defaultDependencyDescriptor.setDependencyArtifacts(new LinkedHashMap(defaultDependencyDescriptor2.getDependencyArtifacts()));
        } else {
            throw new IllegalArgumentException("dependency descriptor transformation does not support * module confs with descriptors which aren't DefaultDependencyDescriptor");
        }
        if (z) {
            defaultDependencyDescriptor.asSystem = dependencyDescriptor;
        }
        return defaultDependencyDescriptor;
    }

    public DefaultDependencyDescriptor(DefaultDependencyDescriptor defaultDependencyDescriptor, ModuleRevisionId moduleRevisionId) {
        this.confs = new LinkedHashMap();
        this.isTransitive = true;
        this.namespace = null;
        this.asSystem = this;
        Checks.checkNotNull(defaultDependencyDescriptor, NativeKeys.DRAW_DISTANCE_NK);
        Checks.checkNotNull(moduleRevisionId, IvyPatternHelper.REVISION_KEY);
        if (!moduleRevisionId.getModuleId().equals(defaultDependencyDescriptor.getDependencyId())) {
            throw new IllegalArgumentException("new ModuleRevisionId MUST have the same ModuleId as original one. original = " + defaultDependencyDescriptor.getDependencyId() + " new = " + moduleRevisionId.getModuleId());
        }
        this.f9961md = defaultDependencyDescriptor.f9961md;
        this.parentId = defaultDependencyDescriptor.parentId;
        this.revId = moduleRevisionId;
        this.dynamicRevId = defaultDependencyDescriptor.dynamicRevId;
        this.isForce = defaultDependencyDescriptor.isForce;
        this.isChanging = defaultDependencyDescriptor.isChanging;
        this.isTransitive = defaultDependencyDescriptor.isTransitive;
        this.namespace = defaultDependencyDescriptor.namespace;
        this.confs.putAll(defaultDependencyDescriptor.confs);
        this.excludeRules = defaultDependencyDescriptor.excludeRules == null ? null : new LinkedHashMap(defaultDependencyDescriptor.excludeRules);
        this.includeRules = defaultDependencyDescriptor.includeRules == null ? null : new LinkedHashMap(defaultDependencyDescriptor.includeRules);
        this.dependencyArtifacts = defaultDependencyDescriptor.dependencyArtifacts != null ? new LinkedHashMap(defaultDependencyDescriptor.dependencyArtifacts) : null;
        this.sourceModule = defaultDependencyDescriptor.sourceModule;
    }

    public DefaultDependencyDescriptor(ModuleDescriptor moduleDescriptor, ModuleRevisionId moduleRevisionId, boolean z, boolean z2, boolean z3) {
        this(moduleDescriptor, moduleRevisionId, moduleRevisionId, z, z2, z3);
    }

    public DefaultDependencyDescriptor(ModuleRevisionId moduleRevisionId, boolean z) {
        this(moduleRevisionId, z, false);
    }

    public DefaultDependencyDescriptor(ModuleRevisionId moduleRevisionId, boolean z, boolean z2) {
        this(null, moduleRevisionId, moduleRevisionId, z, z2, true);
    }

    public DefaultDependencyDescriptor(ModuleDescriptor moduleDescriptor, ModuleRevisionId moduleRevisionId, ModuleRevisionId moduleRevisionId2, boolean z, boolean z2, boolean z3) {
        this.confs = new LinkedHashMap();
        this.isTransitive = true;
        this.namespace = null;
        this.asSystem = this;
        Checks.checkNotNull(moduleRevisionId, "mrid");
        Checks.checkNotNull(moduleRevisionId2, "dynamicConstraint");
        this.f9961md = moduleDescriptor;
        this.revId = moduleRevisionId;
        this.dynamicRevId = moduleRevisionId2;
        this.isForce = z;
        this.isChanging = z2;
        this.isTransitive = z3;
        this.sourceModule = moduleDescriptor != null ? moduleDescriptor.getModuleRevisionId() : null;
    }

    @Override // org.apache.ivy.core.module.descriptor.DependencyDescriptor
    public ModuleId getDependencyId() {
        return getDependencyRevisionId().getModuleId();
    }

    @Override // org.apache.ivy.core.module.descriptor.DependencyDescriptor
    public ModuleRevisionId getDependencyRevisionId() {
        return this.revId;
    }

    @Override // org.apache.ivy.core.module.descriptor.DependencyDescriptor
    public ModuleRevisionId getDynamicConstraintDependencyRevisionId() {
        return this.dynamicRevId;
    }

    @Override // org.apache.ivy.core.module.descriptor.DependencyDescriptor
    public String[] getModuleConfigurations() {
        return (String[]) this.confs.keySet().toArray(new String[this.confs.keySet().size()]);
    }

    @Override // org.apache.ivy.core.module.descriptor.DependencyDescriptor
    public String[] getDependencyConfigurations(String str) {
        return getDependencyConfigurations(str, str);
    }

    @Override // org.apache.ivy.core.module.descriptor.DependencyDescriptor
    public String[] getDependencyConfigurations(String str, String str2) {
        List<String> list;
        ModuleDescriptor moduleDescriptor = this.f9961md;
        if (moduleDescriptor != null) {
            Configuration configuration = moduleDescriptor.getConfiguration(str);
            int i = 0;
            if (configuration instanceof ConfigurationIntersection) {
                HashSet<String> hashSet = new HashSet();
                String[] intersectedConfigurationNames = ((ConfigurationIntersection) configuration).getIntersectedConfigurationNames();
                int length = intersectedConfigurationNames.length;
                while (i < length) {
                    Collection<String> dependencyConfigurationsIncludingExtending = getDependencyConfigurationsIncludingExtending(intersectedConfigurationNames[i], str2);
                    if (hashSet.isEmpty()) {
                        hashSet.addAll(dependencyConfigurationsIncludingExtending);
                    } else if (hashSet.contains("*")) {
                        hashSet.remove("*");
                        hashSet.addAll(dependencyConfigurationsIncludingExtending);
                    } else if (!dependencyConfigurationsIncludingExtending.contains("*")) {
                        HashSet hashSet2 = new HashSet();
                        for (String str3 : hashSet) {
                            if (dependencyConfigurationsIncludingExtending.contains(str3)) {
                                hashSet2.add(str3);
                            }
                        }
                        hashSet = hashSet2;
                    }
                    i++;
                }
                List<String> list2 = this.confs.get(str);
                if (list2 != null) {
                    hashSet.addAll(list2);
                }
                if (hashSet.isEmpty() && (list = this.confs.get("*")) != null) {
                    for (String str4 : list) {
                        if (str4 != null && str4.startsWith("@+")) {
                            return new String[]{str + str4.substring(1)};
                        }
                        if (str4 != null && str4.equals("@")) {
                            return new String[]{str};
                        }
                    }
                }
                return (String[]) hashSet.toArray(new String[hashSet.size()]);
            }
            if (configuration instanceof ConfigurationGroup) {
                HashSet hashSet3 = new HashSet();
                String[] membersConfigurationNames = ((ConfigurationGroup) configuration).getMembersConfigurationNames();
                int length2 = membersConfigurationNames.length;
                while (i < length2) {
                    hashSet3.addAll(getDependencyConfigurationsIncludingExtending(membersConfigurationNames[i], str2));
                    i++;
                }
                return (String[]) hashSet3.toArray(new String[hashSet3.size()]);
            }
        }
        List<String> list3 = this.confs.get(str);
        if (list3 == null) {
            list3 = this.confs.get("%");
        }
        List<String> list4 = this.confs.get("*");
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        if (list3 != null) {
            linkedHashSet.addAll(list3);
        }
        if (list4 != null) {
            linkedHashSet.addAll(list4);
            List<String> list5 = this.confs.get("!" + str);
            if (list5 != null) {
                linkedHashSet.removeAll(list5);
            }
        }
        LinkedHashSet<String> linkedHashSet2 = new LinkedHashSet();
        for (String str5 : linkedHashSet) {
            String strReplaceSelfFallbackPattern = replaceSelfFallbackPattern(str5, str);
            if (strReplaceSelfFallbackPattern == null) {
                strReplaceSelfFallbackPattern = replaceThisFallbackPattern(str5, str2);
            }
            if (strReplaceSelfFallbackPattern != null) {
                str5 = strReplaceSelfFallbackPattern;
            }
            linkedHashSet2.add(str5);
        }
        if (linkedHashSet2.remove("*")) {
            StringBuilder sb = new StringBuilder("*");
            for (String str6 : linkedHashSet2) {
                if (str6.startsWith("!")) {
                    sb.append(str6);
                }
            }
            return new String[]{sb.toString()};
        }
        return (String[]) linkedHashSet2.toArray(new String[linkedHashSet2.size()]);
    }

    public final Collection<String> getDependencyConfigurationsIncludingExtending(String str, String str2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(getDependencyConfigurations(str, str2)));
        Iterator<Configuration> it = Configuration.findConfigurationExtending(str, this.f9961md.getConfigurations()).iterator();
        while (it.hasNext()) {
            linkedHashSet.addAll(Arrays.asList(getDependencyConfigurations(it.next().getName(), str2)));
        }
        return linkedHashSet;
    }

    public static String replaceSelfFallbackPattern(String str, String str2) {
        return replaceFallbackConfigurationPattern(SELF_FALLBACK_PATTERN, str, str2);
    }

    public static String replaceThisFallbackPattern(String str, String str2) {
        return replaceFallbackConfigurationPattern(THIS_FALLBACK_PATTERN, str, str2);
    }

    public static String replaceFallbackConfigurationPattern(Pattern pattern, String str, String str2) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        if (matcher.group(1) != null) {
            str2 = str2 + matcher.group(1);
        }
        if (matcher.group(2) == null) {
            return str2;
        }
        return str2 + matcher.group(2);
    }

    @Override // org.apache.ivy.core.module.descriptor.DependencyDescriptor
    public String[] getDependencyConfigurations(String[] strArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : strArr) {
            linkedHashSet.addAll(Arrays.asList(getDependencyConfigurations(str)));
        }
        if (linkedHashSet.contains("*")) {
            return new String[]{"*"};
        }
        return (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
    }

    @Override // org.apache.ivy.core.module.descriptor.DependencyDescriptor
    public DependencyArtifactDescriptor[] getDependencyArtifacts(String str) {
        Set collectionForConfiguration = getCollectionForConfiguration(str, this.dependencyArtifacts);
        return (DependencyArtifactDescriptor[]) collectionForConfiguration.toArray(new DependencyArtifactDescriptor[collectionForConfiguration.size()]);
    }

    @Override // org.apache.ivy.core.module.descriptor.DependencyDescriptor
    public IncludeRule[] getIncludeRules(String str) {
        Set collectionForConfiguration = getCollectionForConfiguration(str, this.includeRules);
        return (IncludeRule[]) collectionForConfiguration.toArray(new IncludeRule[collectionForConfiguration.size()]);
    }

    @Override // org.apache.ivy.core.module.descriptor.DependencyDescriptor
    public ExcludeRule[] getExcludeRules(String str) {
        Set collectionForConfiguration = getCollectionForConfiguration(str, this.excludeRules);
        return (ExcludeRule[]) collectionForConfiguration.toArray(new ExcludeRule[collectionForConfiguration.size()]);
    }

    public final <T> Set<T> getCollectionForConfiguration(String str, Map<String, Collection<T>> map) {
        if (map == null || map.isEmpty()) {
            return Collections.emptySet();
        }
        Collection<T> collection = map.get(str);
        Collection<T> collection2 = map.get("*");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (collection != null) {
            linkedHashSet.addAll(collection);
        }
        if (collection2 != null) {
            linkedHashSet.addAll(collection2);
        }
        return linkedHashSet;
    }

    @Override // org.apache.ivy.core.module.descriptor.DependencyDescriptor
    public DependencyArtifactDescriptor[] getDependencyArtifacts(String[] strArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : strArr) {
            linkedHashSet.addAll(Arrays.asList(getDependencyArtifacts(str)));
        }
        return (DependencyArtifactDescriptor[]) linkedHashSet.toArray(new DependencyArtifactDescriptor[linkedHashSet.size()]);
    }

    @Override // org.apache.ivy.core.module.descriptor.DependencyDescriptor
    public IncludeRule[] getIncludeRules(String[] strArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : strArr) {
            linkedHashSet.addAll(Arrays.asList(getIncludeRules(str)));
        }
        return (IncludeRule[]) linkedHashSet.toArray(new IncludeRule[linkedHashSet.size()]);
    }

    @Override // org.apache.ivy.core.module.descriptor.DependencyDescriptor
    public ExcludeRule[] getExcludeRules(String[] strArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : strArr) {
            linkedHashSet.addAll(Arrays.asList(getExcludeRules(str)));
        }
        return (ExcludeRule[]) linkedHashSet.toArray(new ExcludeRule[linkedHashSet.size()]);
    }

    @Override // org.apache.ivy.core.module.descriptor.DependencyDescriptor
    public DependencyArtifactDescriptor[] getAllDependencyArtifacts() {
        Map<String, Collection<DependencyArtifactDescriptor>> map = this.dependencyArtifacts;
        if (map == null) {
            return new DependencyArtifactDescriptor[0];
        }
        Set setMergeAll = mergeAll(map);
        return (DependencyArtifactDescriptor[]) setMergeAll.toArray(new DependencyArtifactDescriptor[setMergeAll.size()]);
    }

    @Override // org.apache.ivy.core.module.descriptor.DependencyDescriptor
    public IncludeRule[] getAllIncludeRules() {
        Map<String, Collection<IncludeRule>> map = this.includeRules;
        if (map == null) {
            return new IncludeRule[0];
        }
        Set setMergeAll = mergeAll(map);
        return (IncludeRule[]) setMergeAll.toArray(new IncludeRule[setMergeAll.size()]);
    }

    @Override // org.apache.ivy.core.module.descriptor.DependencyDescriptor
    public ExcludeRule[] getAllExcludeRules() {
        Map<String, Collection<ExcludeRule>> map = this.excludeRules;
        if (map == null) {
            return new ExcludeRule[0];
        }
        Set setMergeAll = mergeAll(map);
        return (ExcludeRule[]) setMergeAll.toArray(new ExcludeRule[setMergeAll.size()]);
    }

    public final <T> Set<T> mergeAll(Map<String, Collection<T>> map) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<Collection<T>> it = map.values().iterator();
        while (it.hasNext()) {
            linkedHashSet.addAll(it.next());
        }
        return linkedHashSet;
    }

    public void addDependencyConfiguration(String str, String str2) {
        Configuration configuration;
        if (this.f9961md != null && !"*".equals(str) && !"%".equals(str)) {
            if (str.startsWith("!")) {
                configuration = this.f9961md.getConfiguration(str.substring(1));
            } else {
                configuration = this.f9961md.getConfiguration(str);
            }
            if (configuration == null) {
                throw new IllegalArgumentException("Cannot add dependency '" + this.revId + "' to configuration '" + str + "' of module " + this.f9961md.getModuleRevisionId() + " because this configuration doesn't exist!");
            }
            if (configuration instanceof ConfigurationGroup) {
                for (String str3 : ((ConfigurationGroup) configuration).getMembersConfigurationNames()) {
                    addDependencyConfiguration(str3, str2);
                }
                return;
            }
        }
        List<String> arrayList = this.confs.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.confs.put(str, arrayList);
        }
        if (arrayList.contains(str2)) {
            return;
        }
        arrayList.add(str2);
    }

    public void addDependencyArtifact(String str, DependencyArtifactDescriptor dependencyArtifactDescriptor) {
        addObjectToConfiguration(str, dependencyArtifactDescriptor, getDependencyArtifacts());
    }

    public void addIncludeRule(String str, IncludeRule includeRule) {
        addObjectToConfiguration(str, includeRule, getIncludeRules());
    }

    public void addExcludeRule(String str, ExcludeRule excludeRule) {
        addObjectToConfiguration(str, excludeRule, getExcludeRules());
    }

    public final <T> void addObjectToConfiguration(String str, T t, Map<String, Collection<T>> map) {
        Collection<T> arrayList = map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(str, arrayList);
        }
        arrayList.add(t);
    }

    @Override // org.apache.ivy.core.module.descriptor.DependencyDescriptor
    public boolean doesExclude(String[] strArr, ArtifactId artifactId) {
        Namespace namespace = this.namespace;
        if (namespace != null) {
            artifactId = NameSpaceHelper.transform(artifactId, namespace.getFromSystemTransformer());
        }
        for (ExcludeRule excludeRule : getExcludeRules(strArr)) {
            if (MatcherHelper.matches(excludeRule.getMatcher(), excludeRule.getId(), artifactId)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.ivy.core.module.descriptor.DependencyDescriptor
    public boolean canExclude() {
        Map<String, Collection<ExcludeRule>> map = this.excludeRules;
        return (map == null || map.isEmpty()) ? false : true;
    }

    public String toString() {
        return "dependency: " + this.revId + " " + this.confs;
    }

    @Override // org.apache.ivy.core.module.descriptor.DependencyDescriptor
    public boolean isForce() {
        return this.isForce;
    }

    @Override // org.apache.ivy.core.module.descriptor.DependencyDescriptor
    public ModuleRevisionId getParentRevisionId() {
        ModuleDescriptor moduleDescriptor = this.f9961md;
        return moduleDescriptor != null ? moduleDescriptor.getResolvedModuleRevisionId() : this.parentId;
    }

    @Override // org.apache.ivy.core.module.descriptor.DependencyDescriptor
    public boolean isChanging() {
        return this.isChanging;
    }

    @Override // org.apache.ivy.core.module.descriptor.DependencyDescriptor
    public boolean isTransitive() {
        return this.isTransitive;
    }

    @Override // org.apache.ivy.core.module.descriptor.DependencyDescriptor
    public Namespace getNamespace() {
        return this.namespace;
    }

    @Override // org.apache.ivy.util.extendable.ExtendableItem
    public String getAttribute(String str) {
        return this.revId.getAttribute(str);
    }

    @Override // org.apache.ivy.util.extendable.ExtendableItem
    public Map<String, String> getAttributes() {
        return this.revId.getAttributes();
    }

    @Override // org.apache.ivy.util.extendable.ExtendableItem
    public String getExtraAttribute(String str) {
        return this.revId.getExtraAttribute(str);
    }

    @Override // org.apache.ivy.util.extendable.ExtendableItem
    public Map<String, String> getExtraAttributes() {
        return this.revId.getExtraAttributes();
    }

    @Override // org.apache.ivy.util.extendable.ExtendableItem
    public Map<String, String> getQualifiedExtraAttributes() {
        return this.revId.getQualifiedExtraAttributes();
    }

    @Override // org.apache.ivy.core.module.descriptor.DependencyDescriptor
    public DependencyDescriptor asSystem() {
        return this.asSystem;
    }

    public final void setDependencyArtifacts(Map<String, Collection<DependencyArtifactDescriptor>> map) {
        this.dependencyArtifacts = map;
    }

    public final Map<String, Collection<DependencyArtifactDescriptor>> getDependencyArtifacts() {
        if (this.dependencyArtifacts == null) {
            this.dependencyArtifacts = new LinkedHashMap();
        }
        return this.dependencyArtifacts;
    }

    public final void setIncludeRules(Map<String, Collection<IncludeRule>> map) {
        this.includeRules = map;
    }

    public final Map<String, Collection<IncludeRule>> getIncludeRules() {
        if (this.includeRules == null) {
            this.includeRules = new LinkedHashMap();
        }
        return this.includeRules;
    }

    public final void setExcludeRules(Map<String, Collection<ExcludeRule>> map) {
        this.excludeRules = map;
    }

    public final Map<String, Collection<ExcludeRule>> getExcludeRules() {
        if (this.excludeRules == null) {
            this.excludeRules = new LinkedHashMap();
        }
        return this.excludeRules;
    }

    @Override // org.apache.ivy.core.module.descriptor.InheritableItem
    public ModuleRevisionId getSourceModule() {
        return this.sourceModule;
    }

    @Override // org.apache.ivy.core.module.descriptor.DependencyDescriptor
    public DependencyDescriptor clone(ModuleRevisionId moduleRevisionId) {
        return new DefaultDependencyDescriptor(this, moduleRevisionId);
    }
}
