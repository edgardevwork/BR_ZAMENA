package org.apache.ivy.ant;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import org.apache.ivy.Ivy;
import org.apache.ivy.core.cache.ResolutionCacheManager;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.report.ResolveReport;
import org.apache.ivy.core.resolve.ResolveOptions;
import org.apache.ivy.core.settings.IvySettings;
import org.apache.ivy.util.Message;
import org.apache.ivy.util.StringUtils;
import org.apache.ivy.util.filter.Filter;
import org.apache.ivy.util.filter.FilterHelper;
import org.apache.tools.ant.BuildException;

/* loaded from: classes7.dex */
public abstract class IvyPostResolveTask extends IvyTask {
    public String conf;
    public File file;
    public String module;
    public String organisation;
    public String resolveId;
    public String type;
    public boolean haltOnFailure = true;
    public boolean transitive = true;
    public boolean inline = false;
    public String branch = null;
    public String revision = "latest.integration";
    public Filter<Artifact> artifactFilter = null;
    public boolean useOrigin = false;
    public Boolean keep = null;
    public boolean refresh = false;
    public String resolveMode = null;
    public String log = "default";
    public boolean changing = false;
    public IvyResolve resolve = new IvyResolve();

    public boolean isUseOrigin() {
        return this.useOrigin;
    }

    public void setUseOrigin(boolean z) {
        this.useOrigin = z;
    }

    public String getLog() {
        return this.log;
    }

    public void setLog(String str) {
        this.log = str;
    }

    public IvyDependency createDependency() {
        return this.resolve.createDependency();
    }

    public IvyExclude createExclude() {
        return this.resolve.createExclude();
    }

    public IvyConflict createConflict() {
        return this.resolve.createConflict();
    }

    public void prepareAndCheck() throws BuildException {
        String property;
        IvySettings settings = getIvyInstance().getSettings();
        String str = this.organisation;
        boolean z = (str == null || this.module == null) ? false : true;
        this.organisation = getProperty(str, settings, "ivy.organisation");
        this.module = getProperty(this.module, settings, "ivy.module");
        if (this.file == null && (property = getProperty(settings, "ivy.resolved.file", this.resolveId)) != null) {
            this.file = getProject().resolveFile(property);
        }
        if (isInline()) {
            if (this.conf == null) {
                this.conf = "*";
            }
            if (this.organisation == null) {
                throw new BuildException("no organisation provided for ivy cache task in inline mode: It can either be set explicitly via the attribute 'organisation' or via 'ivy.organisation' property");
            }
            if (this.module == null) {
                throw new BuildException("no module name provided for ivy cache task in inline mode: It can either be set explicitly via the attribute 'module' or via 'ivy.module' property");
            }
            String[] confsToResolve = getConfsToResolve(getOrganisation(), getModule() + "-caller", this.conf, true);
            for (int i = 0; i < confsToResolve.length; i++) {
                if ("*".equals(confsToResolve[i])) {
                    confsToResolve[i] = "*(public)";
                }
            }
            if (confsToResolve.length > 0) {
                Message.verbose(String.format("using inline mode to resolve %s %s %s (%s)", getOrganisation(), getModule(), getRevision(), StringUtils.joinArray(confsToResolve, ", ")));
                IvyResolve ivyResolve = setupResolve(isHaltonfailure(), isUseOrigin());
                ivyResolve.setOrganisation(getOrganisation());
                ivyResolve.setModule(getModule());
                ivyResolve.setBranch(getBranch());
                ivyResolve.setRevision(getRevision());
                ivyResolve.setInline(true);
                ivyResolve.setChanging(isChanging());
                ivyResolve.setConf(this.conf);
                ivyResolve.setResolveId(this.resolveId);
                ivyResolve.setTransitive(isTransitive());
                ivyResolve.execute();
            } else {
                Message.verbose(String.format("inline resolve already done for %s %s %s (%s)", getOrganisation(), getModule(), getRevision(), this.conf));
            }
            if ("*".equals(this.conf)) {
                this.conf = StringUtils.joinArray(getResolvedConfigurations(getOrganisation(), getModule() + "-caller", true), ", ");
            }
        } else {
            Message.debug("using standard ensure resolved");
            if (!z) {
                ensureResolved(settings);
            }
            String property2 = getProperty(this.conf, settings, "ivy.resolved.configurations");
            this.conf = property2;
            if ("*".equals(property2)) {
                String property3 = getProperty(settings, "ivy.resolved.configurations");
                this.conf = property3;
                if (property3 == null) {
                    throw new BuildException("bad conf provided for ivy cache task: '*' can only be used with a prior call to <resolve/>");
                }
            }
        }
        this.organisation = getProperty(this.organisation, settings, "ivy.organisation");
        String property4 = getProperty(this.module, settings, "ivy.module");
        this.module = property4;
        if (this.organisation == null) {
            throw new BuildException("no organisation provided for ivy cache task: It can either be set explicitly via the attribute 'organisation' or via 'ivy.organisation' property or a prior call to <resolve/>");
        }
        if (property4 == null) {
            throw new BuildException("no module name provided for ivy cache task: It can either be set explicitly via the attribute 'module' or via 'ivy.module' property or a prior call to <resolve/>");
        }
        if (this.conf == null) {
            throw new BuildException("no conf provided for ivy cache task: It can either be set explicitly via the attribute 'conf' or via 'ivy.resolved.configurations' property or a prior call to <resolve/>");
        }
        this.artifactFilter = FilterHelper.getArtifactTypeFilter(this.type);
    }

    public void ensureResolved(IvySettings ivySettings) throws BuildException {
        String[] confsToResolve;
        String property = getProperty(getConf(), ivySettings, "ivy.resolved.configurations");
        if (getResolveId() == null) {
            confsToResolve = getConfsToResolve(getOrganisation(), getModule(), property, false);
        } else {
            confsToResolve = getConfsToResolve(getResolveId(), property);
        }
        if (confsToResolve.length > 0) {
            IvyResolve ivyResolve = setupResolve(isHaltonfailure(), isUseOrigin());
            ivyResolve.setFile(getFile());
            ivyResolve.setTransitive(isTransitive());
            ivyResolve.setConf(StringUtils.joinArray(confsToResolve, ", "));
            ivyResolve.setResolveId(getResolveId());
            ivyResolve.execute();
        }
    }

    public String[] getConfsToResolve(String str, String str2, String str3, boolean z) {
        return getConfsToResolve((ModuleDescriptor) getResolvedDescriptor(str, str2, z), str3, getResolvedConfigurations(str, str2, z));
    }

    public String[] getConfsToResolve(String str, String str2) {
        ModuleDescriptor moduleDescriptor = (ModuleDescriptor) getResolvedDescriptor(str, false);
        if (moduleDescriptor == null) {
            if (str2 == null) {
                return new String[]{"*"};
            }
            return StringUtils.splitToArray(str2);
        }
        return getConfsToResolve(moduleDescriptor, str2, (String[]) getProject().getReference("ivy.resolved.configurations.ref." + str));
    }

    public final String[] getConfsToResolve(ModuleDescriptor moduleDescriptor, String str, String[] strArr) {
        String[] strArrSplitToArray;
        Message.debug("calculating configurations to resolve");
        if (moduleDescriptor == null) {
            Message.debug("module not yet resolved, all confs still need to be resolved");
            if (str == null) {
                return new String[]{"*"};
            }
            return StringUtils.splitToArray(str);
        }
        if (str == null) {
            Message.debug("module already resolved, no configuration to resolve");
            return new String[0];
        }
        if ("*".equals(str)) {
            strArrSplitToArray = moduleDescriptor.getConfigurationsNames();
        } else {
            strArrSplitToArray = StringUtils.splitToArray(str);
        }
        HashSet hashSet = new HashSet();
        ResolutionCacheManager resolutionCacheManager = getSettings().getResolutionCacheManager();
        for (String str2 : strArr) {
            String resolveId = getResolveId();
            if (resolveId == null) {
                resolveId = ResolveOptions.getDefaultResolveId(moduleDescriptor);
            }
            if (resolutionCacheManager.getConfigurationResolveReportInCache(resolveId, str2).exists()) {
                hashSet.add(str2);
            }
        }
        HashSet hashSet2 = new HashSet(Arrays.asList(strArrSplitToArray));
        Message.debug("resolved configurations:   " + hashSet);
        Message.debug("asked configurations:      " + hashSet2);
        hashSet2.removeAll(hashSet);
        Message.debug("to resolve configurations: " + hashSet2);
        return (String[]) hashSet2.toArray(new String[hashSet2.size()]);
    }

    public IvyResolve setupResolve(boolean z, boolean z2) {
        Message.verbose("no resolved descriptor found: launching default resolve");
        this.resolve.setTaskName(getTaskName());
        this.resolve.setProject(getProject());
        this.resolve.setHaltonfailure(z);
        this.resolve.setUseOrigin(z2);
        this.resolve.setValidate(doValidate(getSettings()));
        this.resolve.setKeep(isKeep());
        this.resolve.setRefresh(isRefresh());
        this.resolve.setLog(getLog());
        this.resolve.setSettingsRef(getSettingsRef());
        this.resolve.setResolveMode(getResolveMode());
        return this.resolve;
    }

    public ModuleRevisionId getResolvedMrid() {
        return new ModuleRevisionId(getResolvedModuleId(), getRevision() == null ? Ivy.getWorkingRevision() : getRevision());
    }

    public ModuleId getResolvedModuleId() {
        if (!isInline()) {
            return new ModuleId(getOrganisation(), getModule());
        }
        return new ModuleId(getOrganisation(), getModule() + "-caller");
    }

    public ResolveReport getResolvedReport() {
        String module;
        String organisation = getOrganisation();
        if (isInline()) {
            module = getModule() + "-caller";
        } else {
            module = getModule();
        }
        return getResolvedReport(organisation, module, this.resolveId);
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String getConf() {
        return this.conf;
    }

    public void setConf(String str) {
        this.conf = str;
    }

    public String getModule() {
        return this.module;
    }

    public void setModule(String str) {
        this.module = str;
    }

    public String getOrganisation() {
        return this.organisation;
    }

    public void setOrganisation(String str) {
        this.organisation = str;
    }

    public String getBranch() {
        return this.branch;
    }

    public void setBranch(String str) {
        this.branch = str;
    }

    public boolean isHaltonfailure() {
        return this.haltOnFailure;
    }

    public void setHaltonfailure(boolean z) {
        this.haltOnFailure = z;
    }

    public void setCache(File file) {
        cacheAttributeNotSupported();
    }

    public String getRevision() {
        return this.revision;
    }

    public void setRevision(String str) {
        this.revision = str;
    }

    public Filter<Artifact> getArtifactFilter() {
        return this.artifactFilter;
    }

    public boolean isTransitive() {
        return this.transitive;
    }

    public void setTransitive(boolean z) {
        this.transitive = z;
    }

    public boolean isInline() {
        return this.inline;
    }

    public void setInline(boolean z) {
        this.inline = z;
    }

    public void setResolveId(String str) {
        this.resolveId = str;
    }

    public String getResolveId() {
        return this.resolveId;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public File getFile() {
        return this.file;
    }

    public void setKeep(boolean z) {
        this.keep = Boolean.valueOf(z);
    }

    public boolean isKeep() {
        Boolean bool = this.keep;
        return bool == null ? !isInline() : bool.booleanValue();
    }

    public void setChanging(boolean z) {
        this.changing = z;
    }

    public boolean isChanging() {
        return this.changing;
    }

    public void setRefresh(boolean z) {
        this.refresh = z;
    }

    public boolean isRefresh() {
        return this.refresh;
    }

    public String getResolveMode() {
        return this.resolveMode;
    }

    public void setResolveMode(String str) {
        this.resolveMode = str;
    }
}
