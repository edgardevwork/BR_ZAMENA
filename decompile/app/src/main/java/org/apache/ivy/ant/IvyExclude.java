package org.apache.ivy.ant;

import org.apache.ivy.core.module.descriptor.DefaultExcludeRule;
import org.apache.ivy.core.module.p062id.ArtifactId;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.settings.IvySettings;
import org.apache.ivy.plugins.matcher.PatternMatcher;

/* loaded from: classes7.dex */
public class IvyExclude {
    public String artifact;
    public String ext;
    public String matcher;
    public String module;

    /* renamed from: org, reason: collision with root package name */
    public String f11306org;
    public String type;

    public void setOrg(String str) {
        this.f11306org = str;
    }

    public void setModule(String str) {
        this.module = str;
    }

    public void setArtifact(String str) {
        this.artifact = str;
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

    public DefaultExcludeRule asRule(IvySettings ivySettings) {
        String str = this.matcher;
        if (str == null) {
            str = PatternMatcher.EXACT;
        }
        String str2 = this.f11306org;
        if (str2 == null) {
            str2 = "*";
        }
        String str3 = this.module;
        if (str3 == null) {
            str3 = "*";
        }
        String str4 = this.artifact;
        if (str4 == null) {
            str4 = "*";
        }
        String str5 = this.type;
        String str6 = str5 != null ? str5 : "*";
        String str7 = this.ext;
        if (str7 == null) {
            str7 = str6;
        }
        return new DefaultExcludeRule(new ArtifactId(new ModuleId(str2, str3), str4, str6, str7), ivySettings.getMatcher(str), null);
    }
}
