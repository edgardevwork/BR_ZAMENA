package org.jfrog.build.api.builder.dependency;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.jfrog.build.api.dependency.BuildPatternArtifacts;
import org.jfrog.build.api.dependency.PatternResult;

/* loaded from: classes8.dex */
public class BuildPatternArtifactsBuilder {
    public String buildName;
    public String buildNumber;
    public List<PatternResult> patternResults = new ArrayList();
    public String started;
    public String url;

    public BuildPatternArtifacts build() {
        String str = this.buildName;
        if (str == null) {
            throw new IllegalArgumentException("BuildPatternArtifacts must have a name.");
        }
        String str2 = this.buildNumber;
        if (str2 == null) {
            throw new IllegalArgumentException("BuildPatternArtifacts must have a number.");
        }
        String str3 = this.started;
        if (str3 == null) {
            throw new IllegalArgumentException("BuildPatternArtifacts must have a started.");
        }
        String str4 = this.url;
        if (str4 == null) {
            throw new IllegalArgumentException("BuildPatternArtifacts must have a url.");
        }
        BuildPatternArtifacts buildPatternArtifacts = new BuildPatternArtifacts(str, str2, str3, str4);
        buildPatternArtifacts.setPatternResults(this.patternResults);
        return buildPatternArtifacts;
    }

    public BuildPatternArtifactsBuilder buildName(String str) {
        this.buildName = str;
        return this;
    }

    public BuildPatternArtifactsBuilder buildNumber(String str) {
        this.buildNumber = str;
        return this;
    }

    public BuildPatternArtifactsBuilder patternResult(PatternResult patternResult) {
        this.patternResults.add(patternResult);
        return this;
    }

    public BuildPatternArtifactsBuilder started(String str) {
        this.started = str;
        return this;
    }

    public BuildPatternArtifactsBuilder startedDate(Date date) {
        if (date == null) {
            throw new IllegalArgumentException("Cannot format a null date.");
        }
        this.started = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(date);
        return this;
    }

    public BuildPatternArtifactsBuilder url(String str) {
        this.url = str;
        return this;
    }
}
