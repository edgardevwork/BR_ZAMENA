package org.apache.ivy.core.resolve;

import java.util.Date;
import org.apache.ivy.core.LogOptions;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.util.ConfigurationUtils;
import org.apache.ivy.util.filter.Filter;
import org.apache.ivy.util.filter.FilterHelper;

/* loaded from: classes7.dex */
public class ResolveOptions extends LogOptions {
    public static final String RESOLVEMODE_DEFAULT = "default";
    public Filter<Artifact> artifactFilter;
    public boolean checkIfChanged;
    public String[] confs;
    public Date date;
    public boolean download;
    public boolean outputReport;
    public boolean refresh;
    public String resolveId;
    public String resolveMode;
    public String revision;
    public boolean transitive;
    public boolean useCacheOnly;
    public boolean validate;
    public static final String RESOLVEMODE_DYNAMIC = "dynamic";
    public static final String[] RESOLVEMODES = {"default", RESOLVEMODE_DYNAMIC};

    public ResolveOptions() {
        this.confs = new String[]{"*"};
        this.revision = null;
        this.date = null;
        this.validate = true;
        this.useCacheOnly = false;
        this.transitive = true;
        this.download = true;
        this.outputReport = true;
        this.artifactFilter = FilterHelper.NO_FILTER;
        this.checkIfChanged = false;
    }

    public ResolveOptions(ResolveOptions resolveOptions) {
        super(resolveOptions);
        this.confs = new String[]{"*"};
        this.revision = null;
        this.date = null;
        this.validate = true;
        this.useCacheOnly = false;
        this.transitive = true;
        this.download = true;
        this.outputReport = true;
        this.artifactFilter = FilterHelper.NO_FILTER;
        this.checkIfChanged = false;
        this.confs = resolveOptions.confs;
        this.revision = resolveOptions.revision;
        this.date = resolveOptions.date;
        this.validate = resolveOptions.validate;
        this.refresh = resolveOptions.refresh;
        this.useCacheOnly = resolveOptions.useCacheOnly;
        this.transitive = resolveOptions.transitive;
        this.download = resolveOptions.download;
        this.outputReport = resolveOptions.outputReport;
        this.resolveMode = resolveOptions.resolveMode;
        this.artifactFilter = resolveOptions.artifactFilter;
        this.resolveId = resolveOptions.resolveId;
        this.checkIfChanged = resolveOptions.checkIfChanged;
    }

    public Filter<Artifact> getArtifactFilter() {
        return this.artifactFilter;
    }

    public ResolveOptions setArtifactFilter(Filter<Artifact> filter) {
        this.artifactFilter = filter;
        return this;
    }

    public String getResolveMode() {
        return this.resolveMode;
    }

    public ResolveOptions setResolveMode(String str) {
        this.resolveMode = str;
        return this;
    }

    public boolean useSpecialConfs() {
        String[] strArr = this.confs;
        return strArr != null && strArr[0].startsWith("*");
    }

    public String[] getConfs() {
        if (useSpecialConfs()) {
            throw new AssertionError("ResolveOptions.getConfs() can not be used for options used special confs.");
        }
        return this.confs;
    }

    public String[] getConfs(ModuleDescriptor moduleDescriptor) {
        return ConfigurationUtils.replaceWildcards(this.confs, moduleDescriptor);
    }

    public ResolveOptions setConfs(String[] strArr) {
        this.confs = strArr;
        return this;
    }

    public Date getDate() {
        return this.date;
    }

    public ResolveOptions setDate(Date date) {
        this.date = date;
        return this;
    }

    public boolean isDownload() {
        return this.download;
    }

    public ResolveOptions setDownload(boolean z) {
        this.download = z;
        return this;
    }

    public boolean isOutputReport() {
        return this.outputReport;
    }

    public ResolveOptions setOutputReport(boolean z) {
        this.outputReport = z;
        return this;
    }

    public boolean isTransitive() {
        return this.transitive;
    }

    public ResolveOptions setTransitive(boolean z) {
        this.transitive = z;
        return this;
    }

    public boolean isUseCacheOnly() {
        return this.useCacheOnly;
    }

    public ResolveOptions setUseCacheOnly(boolean z) {
        this.useCacheOnly = z;
        return this;
    }

    public boolean isValidate() {
        return this.validate;
    }

    public ResolveOptions setValidate(boolean z) {
        this.validate = z;
        return this;
    }

    public String getRevision() {
        return this.revision;
    }

    public ResolveOptions setRevision(String str) {
        this.revision = str;
        return this;
    }

    public String getResolveId() {
        return this.resolveId;
    }

    public ResolveOptions setResolveId(String str) {
        this.resolveId = str;
        return this;
    }

    public ResolveOptions setRefresh(boolean z) {
        this.refresh = z;
        return this;
    }

    public boolean isRefresh() {
        return this.refresh;
    }

    public ResolveOptions setCheckIfChanged(boolean z) {
        this.checkIfChanged = z;
        return this;
    }

    public boolean getCheckIfChanged() {
        return this.checkIfChanged;
    }

    public static String getDefaultResolveId(ModuleDescriptor moduleDescriptor) {
        return getDefaultResolveId(moduleDescriptor.getModuleRevisionId().getModuleId());
    }

    public static String getDefaultResolveId(ModuleId moduleId) {
        return moduleId.getOrganisation() + "-" + moduleId.getName();
    }
}
