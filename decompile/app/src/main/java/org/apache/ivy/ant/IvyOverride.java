package org.apache.ivy.ant;

import org.apache.ivy.core.module.descriptor.DefaultModuleDescriptor;
import org.apache.ivy.core.module.descriptor.OverrideDependencyDescriptorMediator;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.settings.IvySettings;
import org.apache.ivy.plugins.matcher.PatternMatcher;

/* loaded from: classes7.dex */
public class IvyOverride {
    public String branch;
    public String matcher;
    public String module;

    /* renamed from: org, reason: collision with root package name */
    public String f11307org;
    public String rev;

    public void setOrg(String str) {
        this.f11307org = str;
    }

    public void setModule(String str) {
        this.module = str;
    }

    public void setBranch(String str) {
        this.branch = str;
    }

    public void setRev(String str) {
        this.rev = str;
    }

    public void setMatcher(String str) {
        this.matcher = str;
    }

    public void addOverride(DefaultModuleDescriptor defaultModuleDescriptor, IvySettings ivySettings) {
        String str = this.matcher;
        if (str == null) {
            str = PatternMatcher.EXACT;
        }
        String str2 = this.f11307org;
        if (str2 == null) {
            str2 = "*";
        }
        String str3 = this.module;
        defaultModuleDescriptor.addDependencyDescriptorMediator(new ModuleId(str2, str3 != null ? str3 : "*"), ivySettings.getMatcher(str), new OverrideDependencyDescriptorMediator(this.branch, this.rev));
    }
}
