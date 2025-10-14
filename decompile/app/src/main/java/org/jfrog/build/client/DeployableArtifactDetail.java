package org.jfrog.build.client;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes7.dex */
public class DeployableArtifactDetail implements Serializable {
    public String artifactDest;
    public Boolean deploySucceeded;
    public Map<String, Collection<String>> properties;
    public String sha1;
    public String sha256;
    public String sourcePath;
    public String targetRepository;

    public DeployableArtifactDetail(String str, String str2, String str3, String str4, Boolean bool, String str5, Map<String, Collection<String>> map) {
        this.sourcePath = str;
        this.artifactDest = str2;
        this.sha1 = str3;
        this.sha256 = str4;
        this.deploySucceeded = bool;
        this.targetRepository = str5;
        this.properties = map;
    }

    public DeployableArtifactDetail() {
    }

    public String getArtifactDest() {
        return this.artifactDest;
    }

    public String getSourcePath() {
        return this.sourcePath;
    }

    public String getSha1() {
        return this.sha1;
    }

    public String getSha256() {
        return this.sha256;
    }

    public String getTargetRepository() {
        return this.targetRepository;
    }

    public Boolean isDeploySucceeded() {
        return this.deploySucceeded;
    }

    public Map<String, Collection<String>> getProperties() {
        return this.properties;
    }
}
