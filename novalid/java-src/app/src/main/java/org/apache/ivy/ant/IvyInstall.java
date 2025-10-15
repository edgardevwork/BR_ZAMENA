package org.apache.ivy.ant;

import java.io.File;
import org.apache.ivy.Ivy;
import org.apache.ivy.core.install.InstallOptions;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.settings.IvySettings;
import org.apache.ivy.plugins.matcher.PatternMatcher;
import org.apache.ivy.util.filter.FilterHelper;
import org.apache.tools.ant.BuildException;

/* loaded from: classes7.dex */
public class IvyInstall extends IvyTask {
    public String branch;
    public String from;
    public String module;
    public String organisation;
    public String revision;

    /* renamed from: to */
    public String f9953to;
    public boolean transitive;
    public String type;
    public String conf = "*";
    public boolean overwrite = false;
    public String matcher = PatternMatcher.EXACT;
    public boolean haltOnFailure = true;
    public boolean installOriginalMetadata = false;

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    @Override // org.apache.ivy.ant.IvyTask
    public void doExecute() throws BuildException {
        Ivy ivyInstance = getIvyInstance();
        IvySettings settings = ivyInstance.getSettings();
        if (this.organisation == null) {
            throw new BuildException("no organisation provided for ivy publish task: It can either be set explicitly via the attribute 'organisation' or via 'ivy.organisation' property or a prior call to <resolve/>");
        }
        if (this.module == null) {
            if (PatternMatcher.EXACT.equals(this.matcher)) {
                throw new BuildException("no module name provided for ivy publish task: It can either be set explicitly via the attribute 'module' or via 'ivy.module' property or a prior call to <resolve/>");
            }
            this.module = "*";
        }
        if (this.revision == null) {
            if (PatternMatcher.EXACT.equals(this.matcher)) {
                throw new BuildException("no module revision provided for ivy publish task: It can either be set explicitly via the attribute 'revision' or via 'ivy.revision' property or a prior call to <resolve/>");
            }
            this.revision = "*";
        }
        if (this.branch == null) {
            if (PatternMatcher.EXACT.equals(this.matcher)) {
                this.branch = settings.getDefaultBranch(ModuleId.newInstance(this.organisation, this.module));
            } else {
                this.branch = "*";
            }
        }
        if (this.from == null) {
            throw new BuildException("no from resolver name: please provide it through parameter 'from'");
        }
        if (this.f9953to == null) {
            throw new BuildException("no to resolver name: please provide it through parameter 'to'");
        }
        ModuleRevisionId moduleRevisionIdNewInstance = ModuleRevisionId.newInstance(this.organisation, this.module, this.branch, this.revision);
        try {
            if (ivyInstance.install(moduleRevisionIdNewInstance, this.from, this.f9953to, new InstallOptions().setTransitive(this.transitive).setValidate(doValidate(settings)).setOverwrite(this.overwrite).setConfs(this.conf.split(",")).setArtifactFilter(FilterHelper.getArtifactTypeFilter(this.type)).setMatcherName(this.matcher).setInstallOriginalMetadata(this.installOriginalMetadata)).hasError() && isHaltonfailure()) {
                throw new BuildException("Problem happened while installing modules - see output for details");
            }
        } catch (Exception e) {
            throw new BuildException("impossible to install " + moduleRevisionIdNewInstance + ": " + e, e);
        }
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

    public String getModule() {
        return this.module;
    }

    public void setModule(String str) {
        this.module = str;
    }

    public String getBranch() {
        return this.branch;
    }

    public void setBranch(String str) {
        this.branch = str;
    }

    public String getOrganisation() {
        return this.organisation;
    }

    public void setOrganisation(String str) {
        this.organisation = str;
    }

    public String getRevision() {
        return this.revision;
    }

    public void setRevision(String str) {
        this.revision = str;
    }

    public boolean isOverwrite() {
        return this.overwrite;
    }

    public void setOverwrite(boolean z) {
        this.overwrite = z;
    }

    public String getFrom() {
        return this.from;
    }

    public void setFrom(String str) {
        this.from = str;
    }

    public String getTo() {
        return this.f9953to;
    }

    public void setTo(String str) {
        this.f9953to = str;
    }

    public boolean isTransitive() {
        return this.transitive;
    }

    public void setTransitive(boolean z) {
        this.transitive = z;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String getMatcher() {
        return this.matcher;
    }

    public void setMatcher(String str) {
        this.matcher = str;
    }

    public String getConf() {
        return this.conf;
    }

    public void setConf(String str) {
        this.conf = str;
    }

    public boolean isInstallOriginalMetadata() {
        return this.installOriginalMetadata;
    }

    public void setInstallOriginalMetadata(boolean z) {
        this.installOriginalMetadata = z;
    }
}
