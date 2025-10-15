package org.apache.ivy.plugins.version;

import java.util.Comparator;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;

/* loaded from: classes5.dex */
public class SubVersionMatcher extends AbstractVersionMatcher {
    public SubVersionMatcher() {
        super("sub-version");
    }

    @Override // org.apache.ivy.plugins.version.VersionMatcher
    public boolean isDynamic(ModuleRevisionId moduleRevisionId) {
        return moduleRevisionId.getRevision().endsWith("+");
    }

    @Override // org.apache.ivy.plugins.version.VersionMatcher
    public boolean accept(ModuleRevisionId moduleRevisionId, ModuleRevisionId moduleRevisionId2) {
        return moduleRevisionId2.getRevision().startsWith(moduleRevisionId.getRevision().substring(0, moduleRevisionId.getRevision().length() - 1));
    }

    @Override // org.apache.ivy.plugins.version.AbstractVersionMatcher, org.apache.ivy.plugins.version.VersionMatcher
    public int compare(ModuleRevisionId moduleRevisionId, ModuleRevisionId moduleRevisionId2, Comparator<ModuleRevisionId> comparator) {
        if (moduleRevisionId2.getRevision().startsWith(moduleRevisionId.getRevision().substring(0, moduleRevisionId.getRevision().length() - 1))) {
            return 1;
        }
        return comparator.compare(moduleRevisionId, moduleRevisionId2);
    }
}
