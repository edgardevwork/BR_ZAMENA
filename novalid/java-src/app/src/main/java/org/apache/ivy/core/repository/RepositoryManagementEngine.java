package org.apache.ivy.core.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.apache.ivy.core.module.descriptor.DefaultDependencyDescriptor;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.resolve.ResolveData;
import org.apache.ivy.core.resolve.ResolveEngine;
import org.apache.ivy.core.resolve.ResolveOptions;
import org.apache.ivy.core.resolve.ResolvedModuleRevision;
import org.apache.ivy.core.search.SearchEngine;
import org.apache.ivy.plugins.latest.ArtifactInfo;
import org.apache.ivy.plugins.matcher.RegexpPatternMatcher;
import org.apache.ivy.plugins.version.VersionMatcher;
import org.apache.ivy.util.MemoryUtil;
import org.apache.ivy.util.Message;

/* loaded from: classes5.dex */
public class RepositoryManagementEngine {
    public static final int KILO = 1024;
    public static final double THOUSAND = 1000.0d;
    public boolean analyzed;
    public boolean loaded;
    public ResolveEngine resolveEngine;
    public SearchEngine searchEngine;
    public RepositoryManagementEngineSettings settings;
    public Map<ModuleRevisionId, ModuleDescriptor> revisions = new HashMap();
    public Map<ModuleRevisionId, String> errors = new HashMap();
    public Map<ModuleId, Collection<ModuleDescriptor>> modules = new HashMap();
    public Map<ModuleRevisionId, ModuleRevisionId> cache = new HashMap();
    public Map<ModuleRevisionId, List<ModuleRevisionId>> dependers = new HashMap();

    public RepositoryManagementEngine(RepositoryManagementEngineSettings repositoryManagementEngineSettings, SearchEngine searchEngine, ResolveEngine resolveEngine) {
        this.settings = repositoryManagementEngineSettings;
        this.searchEngine = searchEngine;
        this.resolveEngine = resolveEngine;
    }

    public void load() {
        long usedMemory = this.settings.dumpMemoryUsage() ? MemoryUtil.getUsedMemory() : 0L;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Message.rawinfo("searching modules... ");
        ModuleRevisionId[] moduleRevisionIdArrSearchModules = searchModules();
        Message.info("loading repository metadata...");
        for (ModuleRevisionId moduleRevisionId : moduleRevisionIdArrSearchModules) {
            try {
                loadModuleRevision(moduleRevisionId);
            } catch (Exception e) {
                Message.debug(e);
                this.errors.put(moduleRevisionId, e.getMessage());
            }
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        Message.info(String.format("%nrepository loaded: %d modules; %d revisions; %s%ss", Integer.valueOf(this.modules.size()), Integer.valueOf(this.revisions.size()), this.settings.dumpMemoryUsage() ? ((MemoryUtil.getUsedMemory() - usedMemory) / 1024) + "kB; " : "", Double.valueOf((jCurrentTimeMillis2 - jCurrentTimeMillis) / 1000.0d)));
        this.loaded = true;
    }

    public void analyze() {
        ensureLoaded();
        Message.info("\nanalyzing dependencies...");
        for (ModuleDescriptor moduleDescriptor : this.revisions.values()) {
            for (DependencyDescriptor dependencyDescriptor : moduleDescriptor.getDependencies()) {
                ModuleRevisionId dependency = getDependency(dependencyDescriptor);
                if (dependency == null) {
                    Message.warn("inconsistent repository: declared dependency not found: " + dependencyDescriptor);
                } else {
                    getDependers(dependency).add(moduleDescriptor.getModuleRevisionId());
                }
            }
            Message.progress();
        }
        this.analyzed = true;
    }

    public int getRevisionsNumber() {
        ensureLoaded();
        return this.revisions.size();
    }

    public int getModuleIdsNumber() {
        ensureLoaded();
        return this.modules.size();
    }

    public Collection<ModuleRevisionId> getOrphans() {
        ensureAnalyzed();
        HashSet hashSet = new HashSet(this.revisions.keySet());
        hashSet.removeAll(this.dependers.keySet());
        return hashSet;
    }

    public final ModuleRevisionId[] searchModules() {
        return this.searchEngine.listModules(ModuleRevisionId.newInstance("*", "*", "*", "*"), RegexpPatternMatcher.INSTANCE);
    }

    public final ModuleRevisionId getDependency(DependencyDescriptor dependencyDescriptor) {
        ModuleRevisionId dependencyRevisionId = dependencyDescriptor.getDependencyRevisionId();
        VersionMatcher versionMatcher = this.settings.getVersionMatcher();
        if (!versionMatcher.isDynamic(dependencyRevisionId)) {
            return dependencyRevisionId;
        }
        ModuleRevisionId resolvedModuleRevisionId = this.cache.get(dependencyRevisionId);
        if (resolvedModuleRevisionId == null) {
            Iterator<ModuleDescriptor> it = getAllRevisions(dependencyRevisionId).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ModuleDescriptor next = it.next();
                if (versionMatcher.needModuleDescriptor(dependencyRevisionId, next.getResolvedModuleRevisionId())) {
                    if (versionMatcher.accept(dependencyRevisionId, next)) {
                        resolvedModuleRevisionId = next.getResolvedModuleRevisionId();
                        break;
                    }
                } else if (versionMatcher.accept(dependencyRevisionId, next.getResolvedModuleRevisionId())) {
                    resolvedModuleRevisionId = next.getResolvedModuleRevisionId();
                    break;
                }
            }
            if (resolvedModuleRevisionId == null) {
                return null;
            }
            this.cache.put(dependencyRevisionId, resolvedModuleRevisionId);
        }
        return resolvedModuleRevisionId;
    }

    public final Collection<ModuleRevisionId> getDependers(ModuleRevisionId moduleRevisionId) {
        List<ModuleRevisionId> list = this.dependers.get(moduleRevisionId);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        this.dependers.put(moduleRevisionId, arrayList);
        return arrayList;
    }

    public final void loadModuleRevision(ModuleRevisionId moduleRevisionId) throws Exception {
        ResolvedModuleRevision dependency = this.settings.getResolver(moduleRevisionId).getDependency(new DefaultDependencyDescriptor(moduleRevisionId, false), newResolveData());
        if (dependency == null) {
            Message.warn("module not found while listed: " + moduleRevisionId);
        } else {
            this.revisions.put(dependency.getId(), dependency.getDescriptor());
            getAllRevisions(dependency.getId()).add(dependency.getDescriptor());
        }
        Message.progress();
    }

    public final Collection<ModuleDescriptor> getAllRevisions(ModuleRevisionId moduleRevisionId) {
        Collection<ModuleDescriptor> collection = this.modules.get(moduleRevisionId.getModuleId());
        if (collection != null) {
            return collection;
        }
        TreeSet treeSet = new TreeSet(new Comparator<ModuleDescriptor>() { // from class: org.apache.ivy.core.repository.RepositoryManagementEngine.1
            @Override // java.util.Comparator
            public int compare(ModuleDescriptor moduleDescriptor, ModuleDescriptor moduleDescriptor2) {
                return RepositoryManagementEngine.this.settings.getDefaultLatestStrategy().sort(new ArtifactInfo[]{moduleDescriptor, moduleDescriptor2}).get(0).equals(moduleDescriptor) ? 1 : -1;
            }
        });
        this.modules.put(moduleRevisionId.getModuleId(), treeSet);
        return treeSet;
    }

    public final ResolveData newResolveData() {
        return new ResolveData(this.resolveEngine, new ResolveOptions());
    }

    public final void ensureAnalyzed() {
        if (!this.analyzed) {
            throw new IllegalStateException("repository must have been analyzed to perform this method");
        }
    }

    public final void ensureLoaded() {
        if (!this.loaded) {
            throw new IllegalStateException("repository must have be loaded to perform this method");
        }
    }
}
