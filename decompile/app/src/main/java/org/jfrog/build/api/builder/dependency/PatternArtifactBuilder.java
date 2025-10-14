package org.jfrog.build.api.builder.dependency;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.jfrog.build.api.dependency.PatternArtifact;

/* loaded from: classes8.dex */
public class PatternArtifactBuilder {
    public String artifactoryUrl;
    public String lastModified;
    public String sha1;
    public long size;
    public String uri;

    public PatternArtifact build() {
        String str = this.artifactoryUrl;
        if (str == null) {
            throw new IllegalArgumentException("PatternArtifact must have an Artifactory URL.");
        }
        String str2 = this.uri;
        if (str2 == null) {
            throw new IllegalArgumentException("PatternArtifact must have a URI.");
        }
        long j = this.size;
        if (j < 0) {
            throw new IllegalArgumentException("PatternArtifact must have a zero or positive size.");
        }
        String str3 = this.lastModified;
        if (str3 == null) {
            throw new IllegalArgumentException("PatternArtifact must have a last Modified date.");
        }
        String str4 = this.sha1;
        if (str4 == null) {
            throw new IllegalArgumentException("PatternArtifact must have a sha1 checksum.");
        }
        return new PatternArtifact(str, str2, j, str3, str4);
    }

    public PatternArtifactBuilder artifactoryUrl(String str) {
        this.artifactoryUrl = str;
        return this;
    }

    public PatternArtifactBuilder uri(String str) {
        this.uri = str;
        return this;
    }

    public PatternArtifactBuilder size(long j) {
        this.size = j;
        return this;
    }

    public PatternArtifactBuilder lastModified(String str) {
        this.lastModified = str;
        return this;
    }

    public PatternArtifactBuilder lastModifiedDate(Date date) {
        if (date == null) {
            throw new IllegalArgumentException("Cannot format a null date.");
        }
        this.lastModified = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(date);
        return this;
    }

    public PatternArtifactBuilder sha1(String str) {
        this.sha1 = str;
        return this;
    }
}
