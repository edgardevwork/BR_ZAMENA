package org.apache.ivy.ant;

import org.apache.ivy.Ivy;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.resolve.ResolvedModuleRevision;
import org.apache.ivy.core.settings.IvySettings;
import org.apache.tools.ant.BuildException;

/* loaded from: classes7.dex */
public class IvyFindRevision extends IvyTask {
    public String branch;
    public String module;
    public String organisation;
    public String property = "ivy.revision";
    public String revision;

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

    public String getRevision() {
        return this.revision;
    }

    public void setRevision(String str) {
        this.revision = str;
    }

    public String getBranch() {
        return this.branch;
    }

    public void setBranch(String str) {
        this.branch = str;
    }

    public String getProperty() {
        return this.property;
    }

    public void setProperty(String str) {
        this.property = str;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    @Override // org.apache.ivy.ant.IvyTask
    public void doExecute() throws BuildException {
        if (this.organisation == null) {
            throw new BuildException("no organisation provided for ivy findrevision task");
        }
        if (this.module == null) {
            throw new BuildException("no module name provided for ivy findrevision task");
        }
        if (this.revision == null) {
            throw new BuildException("no revision provided for ivy findrevision task");
        }
        Ivy ivyInstance = getIvyInstance();
        IvySettings settings = ivyInstance.getSettings();
        if (this.branch == null) {
            this.branch = settings.getDefaultBranch(new ModuleId(this.organisation, this.module));
        }
        ResolvedModuleRevision resolvedModuleRevisionFindModule = ivyInstance.findModule(ModuleRevisionId.newInstance(this.organisation, this.module, this.branch, this.revision));
        if (resolvedModuleRevisionFindModule != null) {
            getProject().setProperty(this.property, resolvedModuleRevisionFindModule.getId().getRevision());
        }
    }
}
