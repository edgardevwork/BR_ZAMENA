package org.apache.ivy.plugins.conflict;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.apache.ivy.core.resolve.IvyNode;

/* loaded from: classes8.dex */
public class FixedConflictManager extends AbstractConflictManager {
    public Collection<String> revisions;

    public FixedConflictManager(String[] strArr) {
        this.revisions = Arrays.asList(strArr);
        setName("fixed" + this.revisions);
    }

    @Override // org.apache.ivy.plugins.conflict.ConflictManager
    public Collection<IvyNode> resolveConflicts(IvyNode ivyNode, Collection<IvyNode> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (IvyNode ivyNode2 : collection) {
            if (this.revisions.contains(ivyNode2.getResolvedId().getRevision())) {
                arrayList.add(ivyNode2);
            }
        }
        return arrayList;
    }

    public Collection<String> getRevs() {
        return this.revisions;
    }
}
