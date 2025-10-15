package org.jfrog.build.api.dependency;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class BuildPatternArtifactsRequest implements Serializable {
    public String buildName;
    public String buildNumber;
    public List<Pattern> patterns;
    public String project;
    public boolean transitive;

    public BuildPatternArtifactsRequest() {
        this.patterns = new ArrayList();
    }

    public BuildPatternArtifactsRequest(String str, String str2, String str3) {
        this.buildNumber = str2;
        this.buildName = str;
        this.project = str3;
    }

    public String getBuildName() {
        return this.buildName;
    }

    public void setBuildName(String str) {
        this.buildName = str;
    }

    public String getBuildNumber() {
        return this.buildNumber;
    }

    public void setBuildNumber(String str) {
        this.buildNumber = str;
    }

    public String getProject() {
        return this.project;
    }

    public void setProject(String str) {
        this.project = str;
    }

    public boolean isTransitive() {
        return this.transitive;
    }

    public void setTransitive(boolean z) {
        this.transitive = z;
    }

    public List<Pattern> getPatterns() {
        return this.patterns;
    }

    public void setPatterns(List<Pattern> list) {
        this.patterns = list;
    }

    public void addPattern(Pattern pattern) {
        if (this.patterns == null) {
            this.patterns = new ArrayList();
        }
        this.patterns.add(pattern);
    }
}
