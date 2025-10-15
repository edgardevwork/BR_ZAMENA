package org.jfrog.build.api.dependency;

import java.io.Serializable;

/* loaded from: classes7.dex */
public class PatternArtifact implements Serializable {
    public String artifactoryUrl;
    public String lastModified;
    public String sha1;
    public long size;
    public String uri;

    public PatternArtifact() {
    }

    public PatternArtifact(String str, String str2, long j, String str3, String str4) {
        this.artifactoryUrl = str;
        this.uri = str2;
        this.size = j;
        this.lastModified = str3;
        this.sha1 = str4;
    }

    public String getArtifactoryUrl() {
        return this.artifactoryUrl;
    }

    public void setArtifactoryUrl(String str) {
        this.artifactoryUrl = str;
    }

    public String getUri() {
        return this.uri;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public long getSize() {
        return this.size;
    }

    public void setSize(long j) {
        this.size = j;
    }

    public String getLastModified() {
        return this.lastModified;
    }

    public void setLastModified(String str) {
        this.lastModified = str;
    }

    public String getSha1() {
        return this.sha1;
    }

    public void setSha1(String str) {
        this.sha1 = str;
    }
}
