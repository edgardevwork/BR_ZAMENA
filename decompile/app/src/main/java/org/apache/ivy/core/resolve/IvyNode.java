package org.apache.ivy.core.resolve;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.ivy.core.IvyContext;
import org.apache.ivy.core.event.resolve.EndResolveDependencyEvent;
import org.apache.ivy.core.event.resolve.StartResolveDependencyEvent;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.Configuration;
import org.apache.ivy.core.module.descriptor.DefaultArtifact;
import org.apache.ivy.core.module.descriptor.DependencyArtifactDescriptor;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.descriptor.IncludeRule;
import org.apache.ivy.core.module.descriptor.MDArtifact;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ArtifactId;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.resolve.IvyNodeCallers;
import org.apache.ivy.core.resolve.IvyNodeEviction;
import org.apache.ivy.plugins.circular.CircularDependencyException;
import org.apache.ivy.plugins.conflict.ConflictManager;
import org.apache.ivy.plugins.matcher.MatcherHelper;
import org.apache.ivy.plugins.resolver.DependencyResolver;
import org.apache.ivy.util.Message;
import org.apache.ivy.util.StringUtils;
import org.apache.ivy.util.filter.Filter;
import org.apache.ivy.util.filter.FilterHelper;

/* loaded from: classes5.dex */
public class IvyNode implements Comparable<IvyNode> {
    public static final Pattern FALLBACK_CONF_PATTERN = Pattern.compile("(.+)\\((.*)\\)");
    public IvyNodeCallers callers;
    public Collection<String> confsToFetch;
    public ResolveData data;
    public Map<IvyNode, DependencyDescriptor> dds;
    public boolean downloaded;
    public IvyNodeEviction eviction;
    public Collection<String> fetchedConfigurations;

    /* renamed from: id */
    public ModuleRevisionId f9966id;
    public Collection<String> loadedRootModuleConfs;

    /* renamed from: md */
    public ModuleDescriptor f9967md;
    public Map<ModuleRevisionId, IvyNodeUsage> mergedUsages;
    public ResolvedModuleRevision module;
    public Exception problem;
    public IvyNode root;
    public boolean searched;
    public ResolveEngineSettings settings;
    public IvyNodeUsage usage;

    public IvyNode(ResolveData resolveData, IvyNode ivyNode, DependencyDescriptor dependencyDescriptor) {
        this.dds = new HashMap();
        this.problem = null;
        this.downloaded = false;
        this.searched = false;
        this.confsToFetch = new HashSet();
        this.fetchedConfigurations = new HashSet();
        this.loadedRootModuleConfs = new HashSet();
        this.usage = new IvyNodeUsage(this);
        this.mergedUsages = new LinkedHashMap();
        this.f9966id = dependencyDescriptor.getDependencyRevisionId();
        this.dds.put(ivyNode, dependencyDescriptor);
        this.root = ivyNode.getRoot();
        init(resolveData);
    }

    public IvyNode(ResolveData resolveData, ModuleDescriptor moduleDescriptor) {
        this.dds = new HashMap();
        this.problem = null;
        this.downloaded = false;
        this.searched = false;
        this.confsToFetch = new HashSet();
        this.fetchedConfigurations = new HashSet();
        this.loadedRootModuleConfs = new HashSet();
        this.usage = new IvyNodeUsage(this);
        this.mergedUsages = new LinkedHashMap();
        this.f9966id = moduleDescriptor.getModuleRevisionId();
        this.f9967md = moduleDescriptor;
        this.root = this;
        init(resolveData);
    }

    public final void init(ResolveData resolveData) {
        this.data = resolveData;
        this.settings = resolveData.getSettings();
        this.eviction = new IvyNodeEviction(this);
        this.callers = new IvyNodeCallers(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x039e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean loadData(String str, IvyNode ivyNode, String str2, String str3, boolean z, IvyNodeUsage ivyNodeUsage) {
        boolean z2;
        Message.debug("loadData of " + toString() + " of rootConf=" + str);
        if (!isRoot() && this.data.getReport() != null) {
            this.data.getReport().addDependency(this);
        }
        if (hasProblem()) {
            Message.debug("Node has problem.  Skip loading");
        } else if (isEvicted(str)) {
            Message.debug(str + " is evicted.  Skip loading");
        } else if (!hasConfigurationsToLoad() && isRootModuleConfLoaded(str)) {
            Message.debug(str + " is loaded and no conf to load.  Skip loading");
        } else {
            markRootModuleConfLoaded(str);
            z2 = true;
            if (this.f9967md == null) {
                DependencyResolver dictatorResolver = IvyContext.getContext().getIvy().getResolveEngine().getDictatorResolver();
                if (dictatorResolver == null) {
                    dictatorResolver = this.data.getSettings().getResolver(getId());
                }
                if (dictatorResolver == null) {
                    Message.error("no resolver found for " + getModuleId() + ": check your configuration");
                    this.problem = new RuntimeException("no resolver found for " + getModuleId() + ": check your configuration");
                    return false;
                }
                try {
                    Message.debug("\tusing " + dictatorResolver + " to resolve " + getId());
                    DependencyDescriptor dependencyDescriptor = getDependencyDescriptor(ivyNode);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    ModuleRevisionId dependencyRevisionId = dependencyDescriptor.getDependencyRevisionId();
                    this.data.getEventManager().fireIvyEvent(new StartResolveDependencyEvent(dictatorResolver, dependencyDescriptor, dependencyRevisionId));
                    this.module = dictatorResolver.getDependency(dependencyDescriptor, this.data);
                    this.data.getEventManager().fireIvyEvent(new EndResolveDependencyEvent(dictatorResolver, dependencyDescriptor, dependencyRevisionId, this.module, System.currentTimeMillis() - jCurrentTimeMillis));
                    ResolvedModuleRevision resolvedModuleRevision = this.module;
                    if (resolvedModuleRevision != null) {
                        resolvedModuleRevision.getResolver().getRepositoryCacheManager().saveResolvers(this.module.getDescriptor(), this.module.getResolver().getName(), this.module.getArtifactResolver().getName());
                        if (this.settings.logModuleWhenFound() && "default".equals(getData().getOptions().getLog())) {
                            Message.info("\tfound " + this.module.getId() + " in " + this.module.getResolver().getName());
                        } else {
                            Message.verbose("\tfound " + this.module.getId() + " in " + this.module.getResolver().getName());
                        }
                        if (this.settings.getVersionMatcher().isDynamic(getId()) && this.settings.getVersionMatcher().isDynamic(this.module.getId())) {
                            Message.error("impossible to resolve dynamic revision for " + getId() + ": check your configuration and make sure revision is part of your pattern");
                            this.problem = new RuntimeException("impossible to resolve dynamic revision");
                            return false;
                        }
                        if (!getId().equals(this.module.getId())) {
                            IvyNode node = this.data.getNode(this.module.getId());
                            if (node != null) {
                                this.f9967md = this.module.getDescriptor();
                                if (!handleConfiguration(false, str, ivyNode, str2, str3, z, ivyNodeUsage)) {
                                    return false;
                                }
                                moveToRealNode(str, ivyNode, str2, str3, z, node);
                                return true;
                            }
                            String str4 = "\t[" + this.module.getId().getRevision() + "] " + getId();
                            if (!this.settings.getVersionMatcher().isDynamic(getId())) {
                                str4 = str4 + " (forced)";
                            }
                            if (this.settings.logResolvedRevision() && "default".equals(getData().getOptions().getLog())) {
                                Message.info(str4);
                            } else {
                                Message.verbose(str4);
                            }
                        }
                        this.downloaded = this.module.getReport().isDownloaded();
                        this.searched = this.module.getReport().isSearched();
                        this.f9967md = this.module.getDescriptor();
                        this.confsToFetch.remove("*");
                        updateConfsToFetch(Arrays.asList(resolveSpecialConfigurations(getRequiredConfigurations(ivyNode, str2))));
                    } else {
                        Message.warn("\tmodule not found: " + getId());
                        dictatorResolver.reportFailure();
                        this.problem = new RuntimeException("not found");
                        return false;
                    }
                } catch (ResolveProcessException e) {
                    throw e;
                } catch (Exception e2) {
                    this.problem = e2;
                    Message.debug("Unexpected error: " + this.problem.getMessage(), this.problem);
                    return false;
                }
            }
            handleConfiguration(z2, str, ivyNode, str2, str3, z, ivyNodeUsage);
            if (!hasProblem()) {
                Message.debug("problem : " + this.problem.getMessage());
                return false;
            }
            DependencyDescriptor dependencyDescriptor2 = getDependencyDescriptor(ivyNode);
            if (dependencyDescriptor2 != null) {
                ivyNodeUsage.addUsage(str, dependencyDescriptor2, str2);
            }
            return z2;
        }
        z2 = false;
        handleConfiguration(z2, str, ivyNode, str2, str3, z, ivyNodeUsage);
        if (!hasProblem()) {
        }
    }

    public final void moveToRealNode(String str, IvyNode ivyNode, String str2, String str3, boolean z, IvyNode ivyNode2) {
        if (ivyNode2.f9967md == null) {
            ivyNode2.f9967md = this.f9967md;
        }
        if (ivyNode2.module == null) {
            ivyNode2.module = this.module;
        }
        ivyNode2.downloaded |= this.module.getReport().isDownloaded();
        ivyNode2.searched |= this.module.getReport().isSearched();
        ivyNode2.dds.putAll(this.dds);
        ivyNode2.updateDataFrom(this, str, true);
        ivyNode2.loadData(str, ivyNode, str2, str3, z, this.usage);
        ivyNode2.usage.updateDataFrom(getAllUsages(), str);
        this.usage = ivyNode2.usage;
        this.data.replaceNode(getId(), ivyNode2, str);
        if (this.settings.logResolvedRevision() && "default".equals(getData().getOptions().getLog())) {
            Message.info("\t[" + this.module.getId().getRevision() + "] " + getId());
            return;
        }
        Message.verbose("\t[" + this.module.getId().getRevision() + "] " + getId());
    }

    public Collection<IvyNode> getDependencies(String str, String[] strArr, String str2) {
        if (this.f9967md == null) {
            throw new IllegalStateException("impossible to get dependencies when data has not been loaded");
        }
        if (Arrays.asList(strArr).contains("*")) {
            if (isRoot()) {
                strArr = this.f9967md.getConfigurationsNames();
            } else {
                strArr = this.f9967md.getPublicConfigurationsNames();
            }
        }
        HashSet hashSet = new HashSet();
        for (String str3 : strArr) {
            hashSet.addAll(getDependencies(str, str3, str2));
        }
        return hashSet;
    }

    public Collection<IvyNode> getDependencies(String str, String str2, String str3) throws CircularDependencyException {
        IvyNode ivyNode = this;
        if (ivyNode.f9967md == null) {
            throw new IllegalStateException("impossible to get dependencies when data has not been loaded");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        DependencyDescriptor[] dependencies = ivyNode.f9967md.getDependencies();
        int length = dependencies.length;
        int i = 0;
        while (i < length) {
            DependencyDescriptor dependencyDescriptorMediate = ivyNode.data.mediate(dependencies[i]);
            String[] dependencyConfigurations = dependencyDescriptorMediate.getDependencyConfigurations(str2, str3);
            if (dependencyConfigurations.length != 0) {
                ModuleRevisionId dependencyRevisionId = dependencyDescriptorMediate.getDependencyRevisionId();
                if (ivyNode.isDependencyModuleExcluded(dependencyDescriptorMediate, str, dependencyRevisionId, str2)) {
                    Message.verbose("excluding " + dependencyDescriptorMediate + " in " + str2);
                } else {
                    IvyNode ivyNode2 = (IvyNode) linkedHashMap.get(dependencyRevisionId);
                    if (ivyNode2 == null) {
                        ivyNode2 = ivyNode.data.getNode(dependencyRevisionId);
                    }
                    if (ivyNode2 == null) {
                        ivyNode2 = new IvyNode(ivyNode.data, ivyNode, dependencyDescriptorMediate);
                    } else {
                        ivyNode2.addDependencyDescriptor(ivyNode, dependencyDescriptorMediate);
                        ivyNode2.hasProblem();
                    }
                    IvyNode ivyNode3 = ivyNode2;
                    String[] strArrResolveSpecialConfigurations = ivyNode3.resolveSpecialConfigurations(dependencyConfigurations);
                    List listAsList = Arrays.asList(strArrResolveSpecialConfigurations);
                    ivyNode3.updateConfsToFetch(listAsList);
                    ivyNode3.addRootModuleConfigurations(ivyNode3.usage, str, strArrResolveSpecialConfigurations);
                    ivyNode3.usage.setRequiredConfs(ivyNode, str2, listAsList);
                    ivyNode3.addCaller(str, this, str2, str3, dependencyConfigurations, dependencyDescriptorMediate);
                    linkedHashMap.put(dependencyRevisionId, ivyNode3);
                }
            }
            i++;
            ivyNode = this;
        }
        return linkedHashMap.values();
    }

    public final void addDependencyDescriptor(IvyNode ivyNode, DependencyDescriptor dependencyDescriptor) {
        this.dds.put(ivyNode, dependencyDescriptor);
    }

    public DependencyDescriptor getDependencyDescriptor(IvyNode ivyNode) {
        return this.dds.get(ivyNode);
    }

    public final boolean isDependencyModuleExcluded(DependencyDescriptor dependencyDescriptor, String str, ModuleRevisionId moduleRevisionId, String str2) {
        Artifact artifactNewIvyArtifact = DefaultArtifact.newIvyArtifact(moduleRevisionId, null);
        if (isRoot()) {
            Boolean boolDoesExclude = doesExclude(this.f9967md, str, new String[]{str}, dependencyDescriptor, artifactNewIvyArtifact, new ArrayDeque());
            return boolDoesExclude != null && boolDoesExclude.booleanValue();
        }
        return this.callers.doesCallersExclude(str, artifactNewIvyArtifact);
    }

    public Boolean doesExclude(ModuleDescriptor moduleDescriptor, String str, String[] strArr, DependencyDescriptor dependencyDescriptor, Artifact artifact, Deque<IvyNode> deque) {
        if (directlyExcludes(moduleDescriptor, strArr, dependencyDescriptor, artifact)) {
            return Boolean.TRUE;
        }
        IvyNode node = getData().getNode(moduleDescriptor.getModuleRevisionId());
        if (node != null) {
            if (deque.contains(node)) {
                return null;
            }
            return Boolean.valueOf(node.doesCallersExclude(str, artifact, deque));
        }
        return Boolean.FALSE;
    }

    public boolean directlyExcludes(ModuleDescriptor moduleDescriptor, String[] strArr, DependencyDescriptor dependencyDescriptor, Artifact artifact) {
        return (dependencyDescriptor != null && dependencyDescriptor.doesExclude(strArr, artifact.getId().getArtifactId())) || moduleDescriptor.doesExclude(strArr, artifact.getId().getArtifactId());
    }

    public boolean hasConfigurationsToLoad() {
        return !this.confsToFetch.isEmpty();
    }

    public final boolean markRootModuleConfLoaded(String str) {
        return this.loadedRootModuleConfs.add(str);
    }

    public final boolean isRootModuleConfLoaded(String str) {
        return this.loadedRootModuleConfs.contains(str);
    }

    public final boolean handleConfiguration(boolean z, String str, IvyNode ivyNode, String str2, String str3, boolean z2, IvyNodeUsage ivyNodeUsage) {
        if (this.f9967md == null) {
            return true;
        }
        String[] realConfs = getRealConfs(str3);
        addRootModuleConfigurations(ivyNodeUsage, str, realConfs);
        for (String str4 : realConfs) {
            Configuration configuration = this.f9967md.getConfiguration(str4);
            if (configuration == null) {
                this.confsToFetch.remove(str3);
                if (isConfRequiredByMergedUsageOnly(str, str3)) {
                    Message.verbose("configuration required by evicted revision is not available in selected revision. skipping " + str3 + " in " + this);
                } else if (!str3.equals(str4)) {
                    this.problem = new RuntimeException("configuration not found in " + this + ": '" + str3 + "'. Missing configuration: '" + str4 + "'. It was required from " + ivyNode + " " + str2);
                } else {
                    this.problem = new RuntimeException("configuration not found in " + this + ": '" + str4 + "'. It was required from " + ivyNode + " " + str2);
                }
                return false;
            }
            if (z2 && !isRoot() && !Configuration.Visibility.PUBLIC.equals(configuration.getVisibility())) {
                this.confsToFetch.remove(str3);
                if (isConfRequiredByMergedUsageOnly(str, str3)) {
                    Message.verbose("configuration required by evicted revision is not visible in selected revision. skipping " + str3 + " in " + this);
                } else {
                    this.problem = new RuntimeException("configuration not public in " + this + ": '" + configuration + "'. It was required from " + ivyNode + " " + str2);
                }
                return false;
            }
        }
        if (!z) {
            return true;
        }
        this.fetchedConfigurations.add(str3);
        this.confsToFetch.removeAll(Arrays.asList(realConfs));
        this.confsToFetch.remove(str3);
        return true;
    }

    public final String getDefaultConf(String str) {
        Matcher matcher = FALLBACK_CONF_PATTERN.matcher(str);
        return matcher.matches() ? matcher.group(2) : str;
    }

    public final String getMainConf(String str) {
        Matcher matcher = FALLBACK_CONF_PATTERN.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    public void updateConfsToFetch(Collection<String> collection) {
        this.confsToFetch.addAll(collection);
        this.confsToFetch.removeAll(this.fetchedConfigurations);
    }

    public final String[] resolveSpecialConfigurations(String[] strArr) {
        if (strArr.length != 1 || !strArr[0].startsWith("*") || !isLoaded()) {
            return strArr;
        }
        String str = strArr[0];
        if ("*".equals(str)) {
            return getDescriptor().getPublicConfigurationsNames();
        }
        List listAsList = Arrays.asList(str.substring(2).split("\\!"));
        ArrayList arrayList = new ArrayList(Arrays.asList(getDescriptor().getPublicConfigurationsNames()));
        arrayList.removeAll(listAsList);
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public String[] getRequiredConfigurations(IvyNode ivyNode, String str) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        addAllIfNotNull(linkedHashSet, this.usage.getRequiredConfigurations(ivyNode, str));
        Iterator<IvyNodeUsage> it = this.mergedUsages.values().iterator();
        while (it.hasNext()) {
            addAllIfNotNull(linkedHashSet, it.next().getRequiredConfigurations(ivyNode, str));
        }
        return (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void addAllIfNotNull(Collection<T> collection, Collection<T> collection2) {
        if (collection2 != 0) {
            collection.addAll(collection2);
        }
    }

    public String[] getRequiredConfigurations() {
        ArrayList arrayList = new ArrayList(this.confsToFetch.size() + this.fetchedConfigurations.size());
        arrayList.addAll(this.fetchedConfigurations);
        arrayList.addAll(this.confsToFetch);
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public Configuration getConfiguration(String str) {
        if (this.f9967md == null) {
            throw new IllegalStateException("impossible to get configuration when data has not been loaded");
        }
        String defaultConf = getDefaultConf(str);
        Configuration configuration = this.f9967md.getConfiguration(getMainConf(str));
        return configuration == null ? this.f9967md.getConfiguration(defaultConf) : configuration;
    }

    public String[] getConfigurations(String str) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        addAllIfNotNull(linkedHashSet, this.usage.getConfigurations(str));
        Iterator<IvyNodeUsage> it = this.mergedUsages.values().iterator();
        while (it.hasNext()) {
            addAllIfNotNull(linkedHashSet, it.next().getConfigurations(str));
        }
        return (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
    }

    public boolean isConfRequiredByMergedUsageOnly(String str, String str2) {
        Set<String> configurations = this.usage.getConfigurations(str);
        return configurations == null || !configurations.contains(str2);
    }

    @Deprecated
    public void discardConf(String str, String str2) {
        Set<String> setAddAndGetConfigurations = this.usage.addAndGetConfigurations(str);
        ModuleDescriptor moduleDescriptor = this.f9967md;
        if (moduleDescriptor == null) {
            setAddAndGetConfigurations.remove(str2);
            return;
        }
        Configuration configuration = moduleDescriptor.getConfiguration(str2);
        if (str2 == null) {
            Message.warn("unknown configuration in " + getId() + ": " + str2);
            return;
        }
        for (String str3 : configuration.getExtends()) {
            discardConf(str, str3);
        }
        setAddAndGetConfigurations.remove(configuration.getName());
    }

    public final void addRootModuleConfigurations(IvyNodeUsage ivyNodeUsage, String str, String[] strArr) {
        if (this.f9967md != null) {
            for (String str2 : strArr) {
                Configuration configuration = this.f9967md.getConfiguration(str2);
                if (configuration != null) {
                    addRootModuleConfigurations(ivyNodeUsage, str, configuration.getExtends());
                }
            }
        }
        Collections.addAll(ivyNodeUsage.addAndGetConfigurations(str), strArr);
    }

    public String[] getRootModuleConfigurations() {
        Set<String> rootModuleConfigurationsSet = getRootModuleConfigurationsSet();
        return (String[]) rootModuleConfigurationsSet.toArray(new String[rootModuleConfigurationsSet.size()]);
    }

    public Set<String> getRootModuleConfigurationsSet() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        addAllIfNotNull(linkedHashSet, this.usage.getRootModuleConfigurations());
        Iterator<IvyNodeUsage> it = this.mergedUsages.values().iterator();
        while (it.hasNext()) {
            addAllIfNotNull(linkedHashSet, it.next().getRootModuleConfigurations());
        }
        return linkedHashSet;
    }

    public String[] getConfsToFetch() {
        Collection<String> collection = this.confsToFetch;
        return (String[]) collection.toArray(new String[collection.size()]);
    }

    public String[] getRealConfs(String str) {
        if (this.f9967md == null) {
            return new String[]{str};
        }
        String defaultConf = getDefaultConf(str);
        String mainConf = getMainConf(str);
        if (this.f9967md.getConfiguration(mainConf) != null && !Configuration.Visibility.PRIVATE.equals(this.f9967md.getConfiguration(mainConf).getVisibility())) {
            defaultConf = mainConf;
        } else if ("".equals(defaultConf)) {
            return new String[0];
        }
        if (defaultConf.charAt(0) == '*') {
            return resolveSpecialConfigurations(new String[]{defaultConf});
        }
        if (defaultConf.contains(",")) {
            return StringUtils.splitToArray(defaultConf);
        }
        return new String[]{defaultConf};
    }

    public final Collection<IvyNode> findPath(ModuleId moduleId) {
        return findPath(moduleId, this, new LinkedList());
    }

    public final Collection<IvyNode> findPath(ModuleId moduleId, IvyNode ivyNode, List<IvyNode> list) {
        IvyNode directCallerFor = ivyNode.getDirectCallerFor(moduleId);
        if (directCallerFor == null) {
            throw new IllegalArgumentException("no path from " + moduleId + " to " + getId() + " found");
        }
        if (list.contains(directCallerFor)) {
            list.add(0, directCallerFor);
            Message.verbose("circular dependency found while looking for the path for another one: was looking for " + moduleId + " as a caller of " + list.get(list.size() - 1));
            return list;
        }
        list.add(0, directCallerFor);
        return directCallerFor.getId().getModuleId().equals(moduleId) ? list : findPath(moduleId, directCallerFor, list);
    }

    public final void updateDataFrom(IvyNode ivyNode, String str, boolean z) {
        this.callers.updateFrom(ivyNode.callers, str, z);
        if (z) {
            this.usage.updateDataFrom(ivyNode.getAllUsages(), str);
        } else {
            IvyNodeUsage ivyNodeUsage = this.mergedUsages.get(ivyNode.getId());
            if (ivyNodeUsage == null) {
                ivyNodeUsage = new IvyNodeUsage(ivyNode);
                this.mergedUsages.put(ivyNode.getId(), ivyNodeUsage);
            }
            ivyNodeUsage.updateDataFrom(ivyNode.getAllUsages(), str);
        }
        updateConfsToFetch(ivyNode.fetchedConfigurations);
        updateConfsToFetch(ivyNode.confsToFetch);
    }

    public final Collection<IvyNodeUsage> getAllUsages() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.usage);
        arrayList.addAll(this.mergedUsages.values());
        return arrayList;
    }

    public Artifact[] getAllArtifacts() {
        HashSet hashSet = new HashSet();
        Iterator<String> it = getRootModuleConfigurationsSet().iterator();
        while (it.hasNext()) {
            hashSet.addAll(Arrays.asList(getArtifacts(it.next())));
        }
        return (Artifact[]) hashSet.toArray(new Artifact[hashSet.size()]);
    }

    public Artifact[] getSelectedArtifacts(Filter<Artifact> filter) {
        HashSet hashSet = new HashSet();
        for (String str : getRootModuleConfigurationsSet()) {
            if (!isEvicted(str) && !isBlacklisted(str)) {
                hashSet.addAll(Arrays.asList(getArtifacts(str)));
            }
        }
        Collection collectionFilter = FilterHelper.filter(hashSet, filter);
        return (Artifact[]) collectionFilter.toArray(new Artifact[collectionFilter.size()]);
    }

    public Artifact[] getArtifacts(String str) {
        String[] configurations = getConfigurations(str);
        if (configurations == null || configurations.length == 0) {
            return new Artifact[0];
        }
        if (this.f9967md == null) {
            throw new IllegalStateException("impossible to get artifacts when data has not been loaded. IvyNode = " + this);
        }
        HashSet hashSet = new HashSet();
        Set<DependencyArtifactDescriptor> dependencyArtifactsSet = this.usage.getDependencyArtifactsSet(str);
        if (this.f9967md.isDefault() && dependencyArtifactsSet != null && !dependencyArtifactsSet.isEmpty()) {
            addArtifactsFromOwnUsage(hashSet, dependencyArtifactsSet);
            addArtifactsFromMergedUsage(str, hashSet);
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            addAllIfNotNull(linkedHashSet, this.usage.getDependencyIncludesSet(str));
            Iterator<IvyNodeUsage> it = this.mergedUsages.values().iterator();
            while (it.hasNext()) {
                addAllIfNotNull(linkedHashSet, it.next().getDependencyIncludesSet(str));
            }
            if ((dependencyArtifactsSet == null || dependencyArtifactsSet.isEmpty()) && linkedHashSet.isEmpty()) {
                for (String str2 : configurations) {
                    hashSet.addAll(Arrays.asList(this.f9967md.getArtifacts(str2)));
                }
            } else {
                HashMap map = new HashMap();
                for (String str3 : configurations) {
                    for (Artifact artifact : this.f9967md.getArtifacts(str3)) {
                        map.put(artifact.getId().getArtifactId(), artifact);
                    }
                }
                if (dependencyArtifactsSet != null) {
                    addArtifactsFromOwnUsage(hashSet, dependencyArtifactsSet);
                }
                addArtifactsFromMergedUsage(str, hashSet);
                Iterator it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    IncludeRule includeRule = (IncludeRule) it2.next();
                    Collection<Artifact> collectionFindArtifactsMatching = findArtifactsMatching(includeRule, map);
                    if (collectionFindArtifactsMatching.isEmpty()) {
                        Message.error("a required artifact is not listed by module descriptor: " + includeRule.getId());
                        it2.remove();
                    } else {
                        Message.debug(this + " in " + str + ": including " + collectionFindArtifactsMatching);
                        hashSet.addAll(collectionFindArtifactsMatching);
                    }
                }
            }
        }
        Iterator<Artifact> it3 = hashSet.iterator();
        while (it3.hasNext()) {
            Artifact next = it3.next();
            if (this.callers.doesCallersExclude(str, next)) {
                Message.debug(this + " in " + str + ": excluding " + next);
                it3.remove();
            }
        }
        return (Artifact[]) hashSet.toArray(new Artifact[hashSet.size()]);
    }

    public final void addArtifactsFromOwnUsage(Set<Artifact> set, Set<DependencyArtifactDescriptor> set2) {
        for (DependencyArtifactDescriptor dependencyArtifactDescriptor : set2) {
            set.add(new MDArtifact(this.f9967md, dependencyArtifactDescriptor.getName(), dependencyArtifactDescriptor.getType(), dependencyArtifactDescriptor.getExt(), dependencyArtifactDescriptor.getUrl(), dependencyArtifactDescriptor.getQualifiedExtraAttributes()));
        }
    }

    public final void addArtifactsFromMergedUsage(String str, Set<Artifact> set) {
        for (IvyNodeUsage ivyNodeUsage : this.mergedUsages.values()) {
            Set<DependencyArtifactDescriptor> dependencyArtifactsSet = ivyNodeUsage.getDependencyArtifactsSet(str);
            if (dependencyArtifactsSet != null) {
                for (DependencyArtifactDescriptor dependencyArtifactDescriptor : dependencyArtifactsSet) {
                    HashMap map = new HashMap(dependencyArtifactDescriptor.getQualifiedExtraAttributes());
                    MDArtifact mDArtifact = new MDArtifact(this.f9967md, dependencyArtifactDescriptor.getName(), dependencyArtifactDescriptor.getType(), dependencyArtifactDescriptor.getExt(), dependencyArtifactDescriptor.getUrl(), map);
                    if (!set.contains(mDArtifact)) {
                        map.put("ivy:merged", dependencyArtifactDescriptor.getDependencyDescriptor().getParentRevisionId() + " -> " + ivyNodeUsage.getNode().getId());
                        set.add(mDArtifact);
                    }
                }
            }
        }
    }

    public static Collection<Artifact> findArtifactsMatching(IncludeRule includeRule, Map<ArtifactId, Artifact> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<ArtifactId, Artifact> entry : map.entrySet()) {
            if (MatcherHelper.matches(includeRule.getMatcher(), includeRule.getId(), entry.getKey())) {
                arrayList.add(entry.getValue());
            }
        }
        return arrayList;
    }

    public boolean hasProblem() {
        return this.problem != null;
    }

    public Exception getProblem() {
        return this.problem;
    }

    public String getProblemMessage() {
        return StringUtils.getErrorMessage(this.problem);
    }

    public boolean isDownloaded() {
        return this.downloaded;
    }

    public boolean isSearched() {
        return this.searched;
    }

    public boolean isLoaded() {
        return this.f9967md != null;
    }

    public boolean isFetched(String str) {
        return this.fetchedConfigurations.contains(str);
    }

    public IvyNode findNode(ModuleRevisionId moduleRevisionId) {
        return this.data.getNode(moduleRevisionId);
    }

    public boolean isRoot() {
        return this.root == this;
    }

    public IvyNode getRoot() {
        return this.root;
    }

    public ConflictManager getConflictManager(ModuleId moduleId) {
        ModuleDescriptor moduleDescriptor = this.f9967md;
        if (moduleDescriptor == null) {
            throw new IllegalStateException("impossible to get conflict manager when data has not been loaded. IvyNode = " + this);
        }
        ConflictManager conflictManager = moduleDescriptor.getConflictManager(moduleId);
        return conflictManager == null ? this.settings.getConflictManager(moduleId) : conflictManager;
    }

    public IvyNode getRealNode() {
        IvyNode node = this.data.getNode(getId());
        return node != null ? node : this;
    }

    public ModuleRevisionId getId() {
        return this.f9966id;
    }

    public ModuleId getModuleId() {
        return this.f9966id.getModuleId();
    }

    public ModuleDescriptor getDescriptor() {
        return this.f9967md;
    }

    public ResolveData getData() {
        return this.data;
    }

    public ResolvedModuleRevision getModuleRevision() {
        return this.module;
    }

    public long getPublication() {
        ResolvedModuleRevision resolvedModuleRevision = this.module;
        if (resolvedModuleRevision != null) {
            return resolvedModuleRevision.getPublicationDate().getTime();
        }
        return 0L;
    }

    public long getLastModified() {
        ModuleDescriptor moduleDescriptor = this.f9967md;
        if (moduleDescriptor != null) {
            return moduleDescriptor.getLastModified();
        }
        return 0L;
    }

    public ModuleRevisionId getResolvedId() {
        ModuleDescriptor moduleDescriptor = this.f9967md;
        if (moduleDescriptor != null && moduleDescriptor.getResolvedModuleRevisionId().getRevision() != null) {
            return this.f9967md.getResolvedModuleRevisionId();
        }
        ResolvedModuleRevision resolvedModuleRevision = this.module;
        if (resolvedModuleRevision != null) {
            return resolvedModuleRevision.getId();
        }
        return getId();
    }

    public void clean() {
        this.confsToFetch.clear();
    }

    public boolean canExclude(String str) {
        for (IvyNodeCallers.Caller caller : getCallers(str)) {
            if (caller.canExclude()) {
                return true;
            }
        }
        return false;
    }

    public final IvyNode getDirectCallerFor(ModuleId moduleId) {
        return this.callers.getDirectCallerFor(moduleId);
    }

    public IvyNodeCallers.Caller[] getCallers(String str) {
        return this.callers.getCallers(str);
    }

    public Collection<ModuleId> getAllCallersModuleIds() {
        return this.callers.getAllCallersModuleIds();
    }

    public IvyNodeCallers.Caller[] getAllCallers() {
        return this.callers.getAllCallers();
    }

    public IvyNodeCallers.Caller[] getAllRealCallers() {
        return this.callers.getAllRealCallers();
    }

    public void addCaller(String str, IvyNode ivyNode, String str2, String str3, String[] strArr, DependencyDescriptor dependencyDescriptor) throws CircularDependencyException {
        this.callers.addCaller(str, ivyNode, str2, str3, strArr, dependencyDescriptor);
        if (this.callers.getAllCallersModuleIds().contains(getId().getModuleId())) {
            IvyContext.getContext().getCircularDependencyStrategy().handleCircularDependency(toMrids(findPath(getId().getModuleId()), this));
        }
    }

    public boolean doesCallersExclude(String str, Artifact artifact, Deque<IvyNode> deque) {
        return this.callers.doesCallersExclude(str, artifact, deque);
    }

    @Deprecated
    public boolean doesCallersExclude(String str, Artifact artifact, Stack<ModuleRevisionId> stack) {
        ArrayDeque arrayDeque = new ArrayDeque();
        Iterator<ModuleRevisionId> it = stack.iterator();
        while (it.hasNext()) {
            ModuleRevisionId next = it.next();
            for (IvyNodeCallers.Caller caller : getCallers(str)) {
                if (caller.getModuleRevisionId().equals(next)) {
                    arrayDeque.add(this.data.getNode(next));
                }
            }
        }
        return this.callers.doesCallersExclude(str, artifact, arrayDeque);
    }

    public final ModuleRevisionId[] toMrids(Collection<IvyNode> collection, IvyNode ivyNode) {
        int size = collection.size();
        ModuleRevisionId[] moduleRevisionIdArr = new ModuleRevisionId[size + 1];
        Iterator<IvyNode> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            moduleRevisionIdArr[i] = it.next().getId();
            i++;
        }
        moduleRevisionIdArr[size] = ivyNode.getId();
        return moduleRevisionIdArr;
    }

    public Set<IvyNode> getResolvedNodes(ModuleId moduleId, String str) {
        return this.eviction.getResolvedNodes(moduleId, str);
    }

    public Collection<ModuleRevisionId> getResolvedRevisions(ModuleId moduleId, String str) {
        return this.eviction.getResolvedRevisions(moduleId, str);
    }

    public void markEvicted(IvyNodeEviction.EvictionData evictionData) {
        this.eviction.markEvicted(evictionData);
        String rootModuleConf = evictionData.getRootModuleConf();
        if (evictionData.getSelected() != null) {
            Iterator<IvyNode> it = evictionData.getSelected().iterator();
            while (it.hasNext()) {
                it.next().updateDataFrom(this, rootModuleConf, false);
            }
        }
    }

    public Collection<ConflictManager> getAllEvictingConflictManagers() {
        return this.eviction.getAllEvictingConflictManagers();
    }

    public Collection<IvyNode> getAllEvictingNodes() {
        return this.eviction.getAllEvictingNodes();
    }

    public Collection<String> getAllEvictingNodesDetails() {
        return this.eviction.getAllEvictingNodesDetails();
    }

    public String[] getEvictedConfs() {
        return this.eviction.getEvictedConfs();
    }

    public IvyNodeEviction.EvictionData getEvictedData(String str) {
        return this.eviction.getEvictedData(str);
    }

    public Collection<IvyNode> getEvictedNodes(ModuleId moduleId, String str) {
        return this.eviction.getEvictedNodes(moduleId, str);
    }

    public Collection<ModuleRevisionId> getEvictedRevisions(ModuleId moduleId, String str) {
        return this.eviction.getEvictedRevisions(moduleId, str);
    }

    public IvyNodeEviction.EvictionData getEvictionDataInRoot(String str, IvyNode ivyNode) {
        return this.eviction.getEvictionDataInRoot(str, ivyNode);
    }

    public boolean isCompletelyEvicted() {
        return this.eviction.isCompletelyEvicted();
    }

    public boolean isEvicted(String str) {
        return this.eviction.isEvicted(str);
    }

    public void markEvicted(String str, IvyNode ivyNode, ConflictManager conflictManager, Collection<IvyNode> collection) {
        markEvicted(new IvyNodeEviction.EvictionData(str, ivyNode, conflictManager, collection));
    }

    public void setEvictedNodes(ModuleId moduleId, String str, Collection<IvyNode> collection) {
        this.eviction.setEvictedNodes(moduleId, str, collection);
    }

    public void setResolvedNodes(ModuleId moduleId, String str, Collection<IvyNode> collection) {
        this.eviction.setResolvedNodes(moduleId, str, collection);
    }

    public String toString() {
        return getResolvedId().toString();
    }

    public boolean equals(Object obj) {
        if (obj instanceof IvyNode) {
            return ((IvyNode) obj).getId().equals(getId());
        }
        return false;
    }

    @Override // java.lang.Comparable
    public int compareTo(IvyNode ivyNode) {
        return getModuleId().compareTo(ivyNode.getModuleId());
    }

    public int hashCode() {
        return getId().hashCode();
    }

    public Collection<IvyNode> getPendingConflicts(String str, ModuleId moduleId) {
        return this.eviction.getPendingConflicts(str, moduleId);
    }

    public void setPendingConflicts(ModuleId moduleId, String str, Collection<IvyNode> collection) {
        this.eviction.setPendingConflicts(moduleId, str, collection);
    }

    public void blacklist(IvyNodeBlacklist ivyNodeBlacklist) {
        if (this.data.getSettings().logResolvedRevision()) {
            Message.info("BLACKLISTING " + ivyNodeBlacklist);
        } else {
            Message.verbose("BLACKLISTING " + ivyNodeBlacklist);
        }
        Stack<IvyNode> stack = new Stack<>();
        stack.push(this);
        clearEvictionDataInAllCallers(ivyNodeBlacklist.getRootModuleConf(), stack);
        this.usage.blacklist(ivyNodeBlacklist);
        this.data.blacklist(this);
    }

    public final void clearEvictionDataInAllCallers(String str, Stack<IvyNode> stack) {
        for (IvyNodeCallers.Caller caller : stack.peek().getCallers(str)) {
            IvyNode ivyNodeFindNode = findNode(caller.getModuleRevisionId());
            if (ivyNodeFindNode != null) {
                ivyNodeFindNode.eviction = new IvyNodeEviction(ivyNodeFindNode);
                if (!stack.contains(ivyNodeFindNode)) {
                    stack.push(ivyNodeFindNode);
                    clearEvictionDataInAllCallers(str, stack);
                    stack.pop();
                }
            }
        }
    }

    public boolean isBlacklisted(String str) {
        return this.usage.isBlacklisted(str);
    }

    public boolean isCompletelyBlacklisted() {
        if (isRoot()) {
            return false;
        }
        for (String str : getRootModuleConfigurations()) {
            if (!isBlacklisted(str)) {
                return false;
            }
        }
        return true;
    }

    public IvyNodeBlacklist getBlacklistData(String str) {
        return this.usage.getBlacklistData(str);
    }

    public IvyNodeUsage getMainUsage() {
        return this.usage;
    }

    public boolean hasAnyMergedUsageWithTransitiveDependency(String str) {
        Map<ModuleRevisionId, IvyNodeUsage> map = this.mergedUsages;
        if (map == null) {
            return false;
        }
        Iterator<IvyNodeUsage> it = map.values().iterator();
        while (it.hasNext()) {
            if (it.next().hasTransitiveDepender(str)) {
                return true;
            }
        }
        return false;
    }
}
