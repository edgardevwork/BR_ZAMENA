package org.jfrog.build.extractor.builder;

import java.util.Properties;
import org.apache.commons.lang3.StringUtils;
import org.jfrog.build.extractor.p065ci.Artifact;

/* loaded from: classes8.dex */
public class ArtifactBuilder {
    public String localPath;
    public String md5;
    public String name;
    public Properties properties;
    public String remotePath;
    public String sha1;
    public String sha256;
    public String type;

    public ArtifactBuilder(String str) {
        this.name = str;
    }

    public Artifact build() {
        if (StringUtils.isBlank(this.name)) {
            throw new IllegalArgumentException("Artifact must have a name");
        }
        Artifact artifact = new Artifact();
        artifact.setName(this.name);
        artifact.setType(this.type);
        artifact.setSha1(this.sha1);
        artifact.setSha256(this.sha256);
        artifact.setMd5(this.md5);
        artifact.setRemotePath(this.remotePath);
        artifact.setLocalPath(this.localPath);
        artifact.setProperties(this.properties);
        return artifact;
    }

    public ArtifactBuilder name(String str) {
        this.name = str;
        return this;
    }

    public ArtifactBuilder type(String str) {
        this.type = str;
        return this;
    }

    public ArtifactBuilder sha1(String str) {
        this.sha1 = str;
        return this;
    }

    public ArtifactBuilder sha256(String str) {
        this.sha256 = str;
        return this;
    }

    public ArtifactBuilder md5(String str) {
        this.md5 = str;
        return this;
    }

    public ArtifactBuilder localPath(String str) {
        this.localPath = str;
        return this;
    }

    public ArtifactBuilder remotePath(String str) {
        this.remotePath = str;
        return this;
    }

    public ArtifactBuilder properties(Properties properties) {
        this.properties = properties;
        return this;
    }

    public ArtifactBuilder addProperty(Object obj, Object obj2) {
        if (this.properties == null) {
            this.properties = new Properties();
        }
        this.properties.put(obj, obj2);
        return this;
    }

    public ArtifactBuilder addProperties(Properties properties) {
        if (this.properties == null) {
            this.properties = new Properties();
        }
        this.properties.putAll(properties);
        return this;
    }
}
