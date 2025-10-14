package org.apache.ivy.ant;

import org.apache.ivy.core.module.p062id.ModuleRevisionId;

/* loaded from: classes7.dex */
public class PackageMapping {
    public String module;
    public String organisation;
    public String pkg;
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

    public String getPackage() {
        return this.pkg;
    }

    public void setPackage(String str) {
        this.pkg = str;
    }

    public ModuleRevisionId getModuleRevisionId() {
        return ModuleRevisionId.newInstance(this.organisation, this.module, this.revision);
    }
}
