package org.apache.ivy.ant;

import org.apache.ivy.core.module.descriptor.DefaultIncludeRule;
import org.apache.ivy.core.module.p062id.ArtifactId;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.settings.IvySettings;
import org.apache.ivy.plugins.matcher.PatternMatcher;

/* loaded from: classes7.dex */
public class IvyDependencyInclude {
    public String ext;
    public String matcher;
    public String name;
    public String type;

    public void setName(String str) {
        this.name = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setExt(String str) {
        this.ext = str;
    }

    public void setMatcher(String str) {
        this.matcher = str;
    }

    public DefaultIncludeRule asRule(IvySettings ivySettings) {
        String str = this.matcher;
        if (str == null) {
            str = PatternMatcher.EXACT;
        }
        String str2 = this.name;
        if (str2 == null) {
            str2 = "*";
        }
        String str3 = this.type;
        if (str3 == null) {
            str3 = "*";
        }
        String str4 = this.ext;
        if (str4 == null) {
            str4 = str3;
        }
        return new DefaultIncludeRule(new ArtifactId(new ModuleId("*", "*"), str2, str3, str4), ivySettings.getMatcher(str), null);
    }
}
