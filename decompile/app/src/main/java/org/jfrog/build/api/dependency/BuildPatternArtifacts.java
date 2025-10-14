package org.jfrog.build.api.dependency;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class BuildPatternArtifacts implements Serializable {
    public String buildName;
    public String buildNumber;
    public List<PatternResult> patternResults;
    public String started;
    public String url;

    public BuildPatternArtifacts() {
        this.patternResults = new ArrayList();
    }

    public BuildPatternArtifacts(String str, String str2, String str3, String str4) {
        this.buildName = str;
        this.buildNumber = str2;
        this.started = str3;
        this.url = str4;
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

    public String getStarted() {
        return this.started;
    }

    public void setStarted(String str) {
        this.started = str;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public List<PatternResult> getPatternResults() {
        return this.patternResults;
    }

    public void setPatternResults(List<PatternResult> list) {
        this.patternResults = list;
    }

    public void addPatternResult(PatternResult patternResult) {
        if (this.patternResults == null) {
            this.patternResults = new ArrayList();
        }
        this.patternResults.add(patternResult);
    }
}
