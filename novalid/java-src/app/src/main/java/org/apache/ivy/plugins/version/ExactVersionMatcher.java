package org.apache.ivy.plugins.version;

import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.plugins.matcher.PatternMatcher;

/* loaded from: classes5.dex */
public class ExactVersionMatcher extends AbstractVersionMatcher {
    @Override // org.apache.ivy.plugins.version.VersionMatcher
    public boolean isDynamic(ModuleRevisionId moduleRevisionId) {
        return false;
    }

    public ExactVersionMatcher() {
        super(PatternMatcher.EXACT);
    }

    @Override // org.apache.ivy.plugins.version.VersionMatcher
    public boolean accept(ModuleRevisionId moduleRevisionId, ModuleRevisionId moduleRevisionId2) {
        return moduleRevisionId.getRevision().equals(moduleRevisionId2.getRevision());
    }
}
