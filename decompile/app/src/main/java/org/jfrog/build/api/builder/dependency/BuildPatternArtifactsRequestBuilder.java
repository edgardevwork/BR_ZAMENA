package org.jfrog.build.api.builder.dependency;

import java.util.ArrayList;
import java.util.List;
import org.jfrog.build.api.dependency.BuildPatternArtifactsRequest;
import org.jfrog.build.api.dependency.Pattern;

/* loaded from: classes8.dex */
public class BuildPatternArtifactsRequestBuilder {
    public String buildName;
    public String buildNumber;
    public List<Pattern> patterns = new ArrayList();
    public String project;
    public boolean transitive;

    public BuildPatternArtifactsRequest build() {
        String str = this.buildName;
        if (str == null) {
            throw new IllegalArgumentException("BuildPatternArtifactsRequest must have a build name.");
        }
        String str2 = this.buildNumber;
        if (str2 == null) {
            throw new IllegalArgumentException("BuildPatternArtifactsRequest must have a build number.");
        }
        BuildPatternArtifactsRequest buildPatternArtifactsRequest = new BuildPatternArtifactsRequest(str, str2, this.project);
        buildPatternArtifactsRequest.setTransitive(this.transitive);
        buildPatternArtifactsRequest.setPatterns(this.patterns);
        return buildPatternArtifactsRequest;
    }

    public BuildPatternArtifactsRequestBuilder buildName(String str) {
        this.buildName = str;
        return this;
    }

    public BuildPatternArtifactsRequestBuilder buildNumber(String str) {
        this.buildNumber = str;
        return this;
    }

    public BuildPatternArtifactsRequestBuilder project(String str) {
        this.project = str;
        return this;
    }

    public BuildPatternArtifactsRequestBuilder pattern(String str) {
        this.patterns.add(new Pattern(str));
        return this;
    }
}
