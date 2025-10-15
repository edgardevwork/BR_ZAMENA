package org.apache.ivy.plugins.conflict;

import java.util.Collection;
import org.apache.ivy.core.resolve.IvyNode;

/* loaded from: classes8.dex */
public class NoConflictManager extends AbstractConflictManager {
    @Override // org.apache.ivy.plugins.conflict.ConflictManager
    public Collection<IvyNode> resolveConflicts(IvyNode ivyNode, Collection<IvyNode> collection) {
        return collection;
    }

    public NoConflictManager() {
        setName("all");
    }
}
