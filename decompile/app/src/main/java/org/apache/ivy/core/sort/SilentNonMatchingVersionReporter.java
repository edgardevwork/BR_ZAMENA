package org.apache.ivy.core.sort;

import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.util.Message;

/* loaded from: classes8.dex */
public class SilentNonMatchingVersionReporter extends MessageBasedNonMatchingVersionReporter implements NonMatchingVersionReporter {
    @Override // org.apache.ivy.core.sort.MessageBasedNonMatchingVersionReporter, org.apache.ivy.core.sort.NonMatchingVersionReporter
    public /* bridge */ /* synthetic */ void reportNonMatchingVersion(DependencyDescriptor dependencyDescriptor, ModuleDescriptor moduleDescriptor) {
        super.reportNonMatchingVersion(dependencyDescriptor, moduleDescriptor);
    }

    @Override // org.apache.ivy.core.sort.MessageBasedNonMatchingVersionReporter
    public void reportMessage(String str) {
        Message.debug(str);
    }
}
