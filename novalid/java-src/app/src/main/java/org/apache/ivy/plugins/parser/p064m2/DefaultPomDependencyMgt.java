package org.apache.ivy.plugins.parser.p064m2;

import java.util.List;
import org.apache.ivy.core.module.p062id.ModuleId;

/* loaded from: classes5.dex */
public class DefaultPomDependencyMgt implements PomDependencyMgt {
    public String artifactId;
    public List<ModuleId> excludedModules;
    public String groupId;
    public String scope;
    public String version;

    public DefaultPomDependencyMgt(String str, String str2, String str3, String str4, List<ModuleId> list) {
        this.groupId = str;
        this.artifactId = str2;
        this.version = str3;
        this.scope = str4;
        this.excludedModules = list;
    }

    @Override // org.apache.ivy.plugins.parser.p064m2.PomDependencyMgt
    public String getScope() {
        return this.scope;
    }

    @Override // org.apache.ivy.plugins.parser.p064m2.PomDependencyMgt
    public String getGroupId() {
        return this.groupId;
    }

    @Override // org.apache.ivy.plugins.parser.p064m2.PomDependencyMgt
    public String getArtifactId() {
        return this.artifactId;
    }

    @Override // org.apache.ivy.plugins.parser.p064m2.PomDependencyMgt
    public String getVersion() {
        return this.version;
    }

    @Override // org.apache.ivy.plugins.parser.p064m2.PomDependencyMgt
    public List<ModuleId> getExcludedModules() {
        return this.excludedModules;
    }
}
