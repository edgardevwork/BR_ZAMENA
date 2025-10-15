package org.apache.ivy.plugins.version;

import java.util.Comparator;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;

/* loaded from: classes6.dex */
public interface VersionMatcher {
    boolean accept(ModuleRevisionId moduleRevisionId, ModuleDescriptor moduleDescriptor);

    boolean accept(ModuleRevisionId moduleRevisionId, ModuleRevisionId moduleRevisionId2);

    int compare(ModuleRevisionId moduleRevisionId, ModuleRevisionId moduleRevisionId2, Comparator<ModuleRevisionId> comparator);

    String getName();

    boolean isDynamic(ModuleRevisionId moduleRevisionId);

    boolean needModuleDescriptor(ModuleRevisionId moduleRevisionId, ModuleRevisionId moduleRevisionId2);
}
