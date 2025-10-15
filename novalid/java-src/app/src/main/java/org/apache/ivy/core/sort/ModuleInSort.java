package org.apache.ivy.core.sort;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.ivy.Ivy;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.plugins.circular.CircularDependencyException;
import org.apache.ivy.plugins.circular.CircularDependencyHelper;
import org.apache.ivy.plugins.circular.CircularDependencyStrategy;
import org.apache.ivy.plugins.version.VersionMatcher;
import org.apache.ivy.util.Message;

/* loaded from: classes5.dex */
public class ModuleInSort {
    public ModuleInSort caller;
    public final ModuleDescriptor module;
    public boolean isSorted = false;
    public List<ModuleInSort> loopElements = new LinkedList();
    public boolean isLoopIntermediateElement = false;

    public ModuleInSort(ModuleDescriptor moduleDescriptor) {
        this.module = moduleDescriptor;
    }

    public boolean isInLoop() {
        return this.isLoopIntermediateElement;
    }

    public boolean isSorted() {
        if (!this.isSorted) {
            return false;
        }
        Message.debug("Module descriptor already sorted : " + this.module.getModuleRevisionId().toString());
        return true;
    }

    public boolean isProcessed() {
        if (!this.isSorted && !this.isLoopIntermediateElement) {
            return false;
        }
        Message.debug("Module descriptor is processed : " + this.module.getModuleRevisionId().toString());
        return true;
    }

    public void setCaller(ModuleInSort moduleInSort) {
        this.caller = moduleInSort;
    }

    public void endOfCall() {
        this.caller = null;
    }

    public boolean checkLoop(ModuleInSort moduleInSort, CircularDependencyStrategy circularDependencyStrategy) throws CircularDependencyException {
        if (this.caller == null) {
            return false;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(this.module.getModuleRevisionId());
        while (moduleInSort != this) {
            linkedList.add(moduleInSort.module.getModuleRevisionId());
            moduleInSort.isLoopIntermediateElement = true;
            this.loopElements.add(moduleInSort);
            moduleInSort = moduleInSort.caller;
        }
        linkedList.add(this.module.getModuleRevisionId());
        circularDependencyStrategy.handleCircularDependency((ModuleRevisionId[]) linkedList.toArray(new ModuleRevisionId[linkedList.size()]));
        return true;
    }

    public void addToSortedListIfRequired(List<ModuleDescriptor> list) {
        if (this.isLoopIntermediateElement) {
            return;
        }
        addToSortList(list);
    }

    public final void addToSortList(List<ModuleDescriptor> list) {
        Iterator<ModuleInSort> it = this.loopElements.iterator();
        while (it.hasNext()) {
            it.next().addToSortList(list);
        }
        if (isSorted()) {
            return;
        }
        list.add(this.module);
        this.isSorted = true;
    }

    public String toString() {
        return this.module.getModuleRevisionId().toString();
    }

    public DependencyDescriptor[] getDependencies() {
        return this.module.getDependencies();
    }

    public static void logLoopWarning(List<ModuleDescriptor> list) {
        Message.warn("circular dependency detected during sort: " + CircularDependencyHelper.formatMessageFromDescriptors(list));
    }

    public boolean match(DependencyDescriptor dependencyDescriptor, VersionMatcher versionMatcher) {
        ModuleDescriptor moduleDescriptor = this.module;
        return moduleDescriptor.getResolvedModuleRevisionId().getRevision() == null || moduleDescriptor.getResolvedModuleRevisionId().getRevision().equals(Ivy.getWorkingRevision()) || versionMatcher.accept(dependencyDescriptor.getDependencyRevisionId(), moduleDescriptor);
    }

    public ModuleDescriptor getSortedModuleDescriptor() {
        return this.module;
    }
}
