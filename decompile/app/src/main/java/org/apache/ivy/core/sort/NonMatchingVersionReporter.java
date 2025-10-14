package org.apache.ivy.core.sort;

import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;

/* loaded from: classes5.dex */
public interface NonMatchingVersionReporter {
    void reportNonMatchingVersion(DependencyDescriptor dependencyDescriptor, ModuleDescriptor moduleDescriptor);
}
