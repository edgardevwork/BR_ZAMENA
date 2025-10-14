package org.apache.ivy.core.sort;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.plugins.circular.CircularDependencyException;
import org.apache.ivy.plugins.circular.CircularDependencyStrategy;
import org.apache.ivy.plugins.version.VersionMatcher;
import org.apache.ivy.util.Message;

/* loaded from: classes5.dex */
public class ModuleDescriptorSorter {
    public final CircularDependencyStrategy circularDepStrategy;
    public final CollectionOfModulesToSort moduleDescriptors;
    public final List<ModuleDescriptor> sorted = new LinkedList();

    public ModuleDescriptorSorter(Collection<ModuleDescriptor> collection, VersionMatcher versionMatcher, NonMatchingVersionReporter nonMatchingVersionReporter, CircularDependencyStrategy circularDependencyStrategy) {
        this.circularDepStrategy = circularDependencyStrategy;
        this.moduleDescriptors = new CollectionOfModulesToSort(collection, versionMatcher, nonMatchingVersionReporter);
    }

    public List<ModuleDescriptor> sortModuleDescriptors() throws CircularDependencyException {
        Message.debug("Nbr of module to sort : " + this.moduleDescriptors.size());
        Iterator<ModuleInSort> it = this.moduleDescriptors.iterator();
        while (it.hasNext()) {
            ModuleInSort next = it.next();
            sortModuleDescriptorsHelp(next, next);
        }
        return this.sorted;
    }

    public final void sortModuleDescriptorsHelp(ModuleInSort moduleInSort, ModuleInSort moduleInSort2) throws CircularDependencyException {
        if (moduleInSort.isProcessed() || moduleInSort.checkLoop(moduleInSort2, this.circularDepStrategy)) {
            return;
        }
        DependencyDescriptor[] dependencies = moduleInSort.getDependencies();
        Message.debug("Sort dependencies of : " + moduleInSort.toString() + " / Number of dependencies = " + dependencies.length);
        moduleInSort.setCaller(moduleInSort2);
        for (DependencyDescriptor dependencyDescriptor : dependencies) {
            ModuleInSort moduleDescriptorDependency = this.moduleDescriptors.getModuleDescriptorDependency(dependencyDescriptor);
            if (moduleDescriptorDependency != null) {
                sortModuleDescriptorsHelp(moduleDescriptorDependency, moduleInSort);
            }
        }
        moduleInSort.endOfCall();
        Message.debug("Sort done for : " + moduleInSort.toString());
        moduleInSort.addToSortedListIfRequired(this.sorted);
    }
}
