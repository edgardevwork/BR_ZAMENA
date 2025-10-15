package org.apache.ivy.core.sort;

import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;

/* loaded from: classes7.dex */
public abstract class MessageBasedNonMatchingVersionReporter implements NonMatchingVersionReporter {
    public abstract void reportMessage(String str);

    @Override // org.apache.ivy.core.sort.NonMatchingVersionReporter
    public void reportNonMatchingVersion(DependencyDescriptor dependencyDescriptor, ModuleDescriptor moduleDescriptor) {
        ModuleRevisionId dependencyRevisionId = dependencyDescriptor.getDependencyRevisionId();
        ModuleRevisionId parentRevisionId = dependencyDescriptor.getParentRevisionId();
        if (parentRevisionId == null) {
            reportMessage("Non matching revision detected when sorting.  Dependency " + dependencyRevisionId + " doesn't match " + moduleDescriptor.getModuleRevisionId());
            return;
        }
        reportMessage("Non matching revision detected when sorting.  " + parentRevisionId.getModuleId() + " depends on " + dependencyRevisionId + ", doesn't match " + moduleDescriptor.getModuleRevisionId());
    }
}
