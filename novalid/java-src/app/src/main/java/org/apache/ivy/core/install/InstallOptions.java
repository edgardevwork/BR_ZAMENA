package org.apache.ivy.core.install;

import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.plugins.matcher.PatternMatcher;
import org.apache.ivy.util.filter.Filter;
import org.apache.ivy.util.filter.FilterHelper;

/* loaded from: classes7.dex */
public class InstallOptions {
    public boolean transitive = true;
    public boolean validate = true;
    public boolean overwrite = false;
    public boolean installOriginalMetadata = false;
    public String[] confs = {"*"};
    public Filter<Artifact> artifactFilter = FilterHelper.NO_FILTER;
    public String matcherName = PatternMatcher.EXACT;

    public boolean isTransitive() {
        return this.transitive;
    }

    public InstallOptions setTransitive(boolean z) {
        this.transitive = z;
        return this;
    }

    public boolean isValidate() {
        return this.validate;
    }

    public InstallOptions setValidate(boolean z) {
        this.validate = z;
        return this;
    }

    public boolean isOverwrite() {
        return this.overwrite;
    }

    public InstallOptions setOverwrite(boolean z) {
        this.overwrite = z;
        return this;
    }

    public Filter<Artifact> getArtifactFilter() {
        return this.artifactFilter;
    }

    public InstallOptions setArtifactFilter(Filter<Artifact> filter) {
        if (filter == null) {
            filter = FilterHelper.NO_FILTER;
        }
        this.artifactFilter = filter;
        return this;
    }

    public String getMatcherName() {
        return this.matcherName;
    }

    public InstallOptions setMatcherName(String str) {
        this.matcherName = str;
        return this;
    }

    public String[] getConfs() {
        return this.confs;
    }

    public InstallOptions setConfs(String[] strArr) {
        this.confs = strArr;
        return this;
    }

    public boolean isInstallOriginalMetadata() {
        return this.installOriginalMetadata;
    }

    public InstallOptions setInstallOriginalMetadata(boolean z) {
        this.installOriginalMetadata = z;
        return this;
    }
}
