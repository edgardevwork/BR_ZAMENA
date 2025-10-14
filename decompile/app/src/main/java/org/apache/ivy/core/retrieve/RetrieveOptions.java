package org.apache.ivy.core.retrieve;

import org.apache.ivy.core.LogOptions;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.util.Message;
import org.apache.ivy.util.filter.Filter;
import org.apache.ivy.util.filter.FilterHelper;

/* loaded from: classes7.dex */
public class RetrieveOptions extends LogOptions {
    public static final String OVERWRITEMODE_ALWAYS = "always";
    public static final String OVERWRITEMODE_DIFFERENT = "different";
    public static final String OVERWRITEMODE_NEVER = "never";
    public static final String OVERWRITEMODE_NEWER = "newer";
    public Filter<Artifact> artifactFilter;
    public String[] confs;
    public String destArtifactPattern;
    public String destIvyPattern;
    public boolean makeSymlinks;

    @Deprecated
    public boolean makeSymlinksInMass;
    public FileNameMapper mapper;
    public String overwriteMode;
    public String resolveId;
    public boolean sync;
    public boolean useOrigin;

    @Deprecated
    public boolean isMakeSymlinksInMass() {
        return false;
    }

    public RetrieveOptions() {
        this.confs = new String[]{"*"};
        this.destIvyPattern = null;
        this.destArtifactPattern = null;
        this.artifactFilter = FilterHelper.NO_FILTER;
        this.sync = false;
        this.overwriteMode = OVERWRITEMODE_NEWER;
        this.useOrigin = false;
        this.makeSymlinks = false;
        this.makeSymlinksInMass = false;
    }

    public RetrieveOptions(RetrieveOptions retrieveOptions) {
        super(retrieveOptions);
        this.confs = new String[]{"*"};
        this.destIvyPattern = null;
        this.destArtifactPattern = null;
        this.artifactFilter = FilterHelper.NO_FILTER;
        this.sync = false;
        this.overwriteMode = OVERWRITEMODE_NEWER;
        this.useOrigin = false;
        this.makeSymlinks = false;
        this.makeSymlinksInMass = false;
        this.confs = retrieveOptions.confs;
        this.destIvyPattern = retrieveOptions.destIvyPattern;
        this.destArtifactPattern = retrieveOptions.destArtifactPattern;
        this.artifactFilter = retrieveOptions.artifactFilter;
        this.sync = retrieveOptions.sync;
        this.overwriteMode = retrieveOptions.overwriteMode;
        this.useOrigin = retrieveOptions.useOrigin;
        this.makeSymlinks = retrieveOptions.makeSymlinks;
        this.makeSymlinksInMass = retrieveOptions.makeSymlinksInMass;
        this.resolveId = retrieveOptions.resolveId;
        this.mapper = retrieveOptions.mapper;
    }

    public String getDestArtifactPattern() {
        return this.destArtifactPattern;
    }

    public RetrieveOptions setDestArtifactPattern(String str) {
        this.destArtifactPattern = str;
        return this;
    }

    public Filter<Artifact> getArtifactFilter() {
        return this.artifactFilter;
    }

    public RetrieveOptions setArtifactFilter(Filter<Artifact> filter) {
        this.artifactFilter = filter;
        return this;
    }

    public String[] getConfs() {
        return this.confs;
    }

    public RetrieveOptions setConfs(String[] strArr) {
        this.confs = strArr;
        return this;
    }

    public String getOverwriteMode() {
        String str = this.overwriteMode;
        return str == null ? OVERWRITEMODE_NEWER : str;
    }

    public RetrieveOptions setOverwriteMode(String str) {
        this.overwriteMode = str;
        return this;
    }

    public String getDestIvyPattern() {
        return this.destIvyPattern;
    }

    public RetrieveOptions setDestIvyPattern(String str) {
        this.destIvyPattern = str;
        return this;
    }

    public boolean isMakeSymlinks() {
        return this.makeSymlinks || this.makeSymlinksInMass;
    }

    public RetrieveOptions setMakeSymlinks(boolean z) {
        this.makeSymlinks = z;
        return this;
    }

    @Deprecated
    public RetrieveOptions setMakeSymlinksInMass(boolean z) {
        this.makeSymlinksInMass = z;
        Message.warn("symlinkmass option has been deprecated and will no longer be supported");
        return this;
    }

    public boolean isSync() {
        return this.sync;
    }

    public RetrieveOptions setSync(boolean z) {
        this.sync = z;
        return this;
    }

    public boolean isUseOrigin() {
        return this.useOrigin;
    }

    public RetrieveOptions setUseOrigin(boolean z) {
        this.useOrigin = z;
        return this;
    }

    public String getResolveId() {
        return this.resolveId;
    }

    public RetrieveOptions setResolveId(String str) {
        this.resolveId = str;
        return this;
    }

    public FileNameMapper getMapper() {
        return this.mapper;
    }

    public RetrieveOptions setMapper(FileNameMapper fileNameMapper) {
        this.mapper = fileNameMapper;
        return this;
    }
}
