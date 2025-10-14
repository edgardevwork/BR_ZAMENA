package org.apache.ivy.ant;

import org.apache.ivy.core.module.descriptor.DefaultModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.settings.IvySettings;
import org.apache.ivy.plugins.conflict.ConflictManager;
import org.apache.ivy.plugins.conflict.FixedConflictManager;
import org.apache.ivy.plugins.matcher.PatternMatcher;
import org.apache.ivy.util.StringUtils;

/* loaded from: classes7.dex */
public class IvyConflict {
    public String manager;
    public String matcher;
    public String module;

    /* renamed from: org, reason: collision with root package name */
    public String f11303org;
    public String rev;

    public void setOrg(String str) {
        this.f11303org = str;
    }

    public void setModule(String str) {
        this.module = str;
    }

    public void setManager(String str) {
        this.manager = str;
    }

    public void setRev(String str) {
        this.rev = str;
    }

    public void setMatcher(String str) {
        this.matcher = str;
    }

    public void addConflict(DefaultModuleDescriptor defaultModuleDescriptor, IvySettings ivySettings) {
        ConflictManager conflictManager;
        String str = this.matcher;
        if (str == null) {
            str = PatternMatcher.EXACT;
        }
        String str2 = this.f11303org;
        if (str2 == null) {
            str2 = "*";
        }
        String str3 = this.module;
        String str4 = str3 != null ? str3 : "*";
        String str5 = this.rev;
        if (str5 != null) {
            conflictManager = new FixedConflictManager(StringUtils.splitToArray(str5));
        } else {
            String str6 = this.manager;
            conflictManager = str6 != null ? ivySettings.getConflictManager(str6) : null;
        }
        defaultModuleDescriptor.addConflictManager(new ModuleId(str2, str4), ivySettings.getMatcher(str), conflictManager);
    }
}
