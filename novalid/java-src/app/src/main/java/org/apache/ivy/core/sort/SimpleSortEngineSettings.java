package org.apache.ivy.core.sort;

import org.apache.ivy.plugins.circular.CircularDependencyStrategy;
import org.apache.ivy.plugins.version.VersionMatcher;

/* loaded from: classes7.dex */
public class SimpleSortEngineSettings implements SortEngineSettings {
    public CircularDependencyStrategy circularStrategy;
    public VersionMatcher versionMatcher;

    @Override // org.apache.ivy.core.sort.SortEngineSettings
    public CircularDependencyStrategy getCircularDependencyStrategy() {
        return this.circularStrategy;
    }

    @Override // org.apache.ivy.core.sort.SortEngineSettings, org.apache.ivy.plugins.resolver.ResolverSettings
    public VersionMatcher getVersionMatcher() {
        return this.versionMatcher;
    }

    public void setCircularDependencyStrategy(CircularDependencyStrategy circularDependencyStrategy) {
        this.circularStrategy = circularDependencyStrategy;
    }

    public void setVersionMatcher(VersionMatcher versionMatcher) {
        this.versionMatcher = versionMatcher;
    }
}
