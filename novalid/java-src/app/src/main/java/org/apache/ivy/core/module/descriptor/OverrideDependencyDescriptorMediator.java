package org.apache.ivy.core.module.descriptor;

import org.apache.ivy.core.module.p062id.ModuleRevisionId;

/* loaded from: classes7.dex */
public class OverrideDependencyDescriptorMediator implements DependencyDescriptorMediator {
    public String branch;
    public String version;

    public OverrideDependencyDescriptorMediator(String str, String str2) {
        this.branch = str;
        this.version = str2;
    }

    public String getVersion() {
        return this.version;
    }

    public String getBranch() {
        return this.branch;
    }

    @Override // org.apache.ivy.core.module.descriptor.DependencyDescriptorMediator
    public DependencyDescriptor mediate(DependencyDescriptor dependencyDescriptor) {
        String str;
        ModuleRevisionId dependencyRevisionId = dependencyDescriptor.getDependencyRevisionId();
        String str2 = this.version;
        if ((str2 == null || str2.equals(dependencyRevisionId.getRevision())) && ((str = this.branch) == null || str.equals(dependencyRevisionId.getBranch()))) {
            return dependencyDescriptor;
        }
        String revision = this.version;
        if (revision == null) {
            revision = dependencyRevisionId.getRevision();
        }
        String branch = this.branch;
        if (branch == null) {
            branch = dependencyRevisionId.getBranch();
        }
        return (revision.equals(dependencyDescriptor.getDependencyRevisionId().getRevision()) && branch.equals(dependencyDescriptor.getDependencyRevisionId().getBranch())) ? dependencyDescriptor : dependencyDescriptor.clone(ModuleRevisionId.newInstance(dependencyRevisionId.getOrganisation(), dependencyRevisionId.getName(), branch, revision, dependencyRevisionId.getQualifiedExtraAttributes()));
    }
}
