package org.apache.ivy.plugins.conflict;

import java.util.Collection;
import java.util.Collections;
import org.apache.ivy.core.resolve.IvyNode;
import org.apache.ivy.plugins.version.VersionMatcher;

/* loaded from: classes8.dex */
public class StrictConflictManager extends AbstractConflictManager {
    @Override // org.apache.ivy.plugins.conflict.ConflictManager
    public Collection<IvyNode> resolveConflicts(IvyNode ivyNode, Collection<IvyNode> collection) {
        VersionMatcher versionMatcher = getSettings().getVersionMatcher();
        IvyNode ivyNode2 = null;
        for (IvyNode ivyNode3 : collection) {
            if (versionMatcher.isDynamic(ivyNode3.getResolvedId())) {
                return null;
            }
            if (ivyNode2 != null && !ivyNode2.equals(ivyNode3)) {
                throw new StrictConflictException(ivyNode2, ivyNode3);
            }
            ivyNode2 = ivyNode3;
        }
        return Collections.singleton(ivyNode2);
    }
}
