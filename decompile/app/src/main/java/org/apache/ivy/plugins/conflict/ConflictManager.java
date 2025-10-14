package org.apache.ivy.plugins.conflict;

import java.util.Collection;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.resolve.IvyNode;

/* loaded from: classes6.dex */
public interface ConflictManager {
    String getName();

    void handleAllBlacklistedRevisions(DependencyDescriptor dependencyDescriptor, Collection<ModuleRevisionId> collection);

    Collection<IvyNode> resolveConflicts(IvyNode ivyNode, Collection<IvyNode> collection);
}
