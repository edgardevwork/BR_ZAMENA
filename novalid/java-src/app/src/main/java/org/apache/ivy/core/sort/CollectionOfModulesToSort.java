package org.apache.ivy.core.sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.plugins.version.VersionMatcher;

/* loaded from: classes5.dex */
public class CollectionOfModulesToSort implements Iterable<ModuleInSort> {
    public final List<ModuleInSort> moduleDescriptors;
    public final Map<ModuleId, Collection<ModuleInSort>> modulesByModuleId = new HashMap();
    public final NonMatchingVersionReporter nonMatchingVersionReporter;
    public final VersionMatcher versionMatcher;

    public CollectionOfModulesToSort(Collection<ModuleDescriptor> collection, VersionMatcher versionMatcher, NonMatchingVersionReporter nonMatchingVersionReporter) {
        this.versionMatcher = versionMatcher;
        this.nonMatchingVersionReporter = nonMatchingVersionReporter;
        this.moduleDescriptors = new ArrayList(collection.size());
        for (ModuleDescriptor moduleDescriptor : collection) {
            ModuleInSort moduleInSort = new ModuleInSort(moduleDescriptor);
            this.moduleDescriptors.add(moduleInSort);
            addToModulesByModuleId(moduleDescriptor, moduleInSort);
        }
    }

    public final void addToModulesByModuleId(ModuleDescriptor moduleDescriptor, ModuleInSort moduleInSort) {
        ModuleId moduleId = moduleDescriptor.getModuleRevisionId().getModuleId();
        LinkedList linkedList = new LinkedList();
        linkedList.add(moduleInSort);
        Collection<ModuleInSort> collectionPut = this.modulesByModuleId.put(moduleId, linkedList);
        if (collectionPut != null) {
            linkedList.addAll(collectionPut);
        }
    }

    @Override // java.lang.Iterable
    public Iterator<ModuleInSort> iterator() {
        return this.moduleDescriptors.iterator();
    }

    public int size() {
        return this.moduleDescriptors.size();
    }

    public ModuleInSort getModuleDescriptorDependency(DependencyDescriptor dependencyDescriptor) {
        Collection<ModuleInSort> collection = this.modulesByModuleId.get(dependencyDescriptor.getDependencyId());
        if (collection == null) {
            return null;
        }
        for (ModuleInSort moduleInSort : collection) {
            if (moduleInSort.match(dependencyDescriptor, this.versionMatcher)) {
                return moduleInSort;
            }
            this.nonMatchingVersionReporter.reportNonMatchingVersion(dependencyDescriptor, moduleInSort.getSortedModuleDescriptor());
        }
        return null;
    }
}
