package org.apache.ivy.core.deliver;

import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;

/* loaded from: classes7.dex */
public interface PublishingDependencyRevisionResolver {
    String resolve(ModuleDescriptor moduleDescriptor, String str, ModuleRevisionId moduleRevisionId, String str2);
}
