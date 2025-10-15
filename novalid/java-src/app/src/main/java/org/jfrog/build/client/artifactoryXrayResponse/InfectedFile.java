package org.jfrog.build.client.artifactoryXrayResponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import org.apache.commons.lang3.builder.ToStringBuilder;

/* loaded from: classes7.dex */
public class InfectedFile implements Serializable {
    public static final long serialVersionUID = -8372191649914079447L;
    public int depth;

    @JsonProperty("display_name")
    public String displayName;
    public String name;

    @JsonProperty("parent_sha")
    public String parentSha;
    public String path;

    @JsonProperty("pkg_type")
    public String pkgType;
    public String sha1;
    public String sha256;

    public InfectedFile() {
    }

    public InfectedFile(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7) {
        this.name = str;
        this.path = str2;
        this.sha256 = str3;
        this.sha1 = str4;
        this.depth = i;
        this.parentSha = str5;
        this.displayName = str6;
        this.pkgType = str7;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public String getSha256() {
        return this.sha256;
    }

    public void setSha256(String str) {
        this.sha256 = str;
    }

    public String getSha1() {
        return this.sha1;
    }

    public void setSha1(String str) {
        this.sha1 = str;
    }

    public int getDepth() {
        return this.depth;
    }

    public void setDepth(int i) {
        this.depth = i;
    }

    @JsonProperty("parent_sha")
    public String getParentSha() {
        return this.parentSha;
    }

    @JsonProperty("parent_sha")
    public void setParentSha(String str) {
        this.parentSha = str;
    }

    @JsonProperty("display_name")
    public String getDisplayName() {
        return this.displayName;
    }

    @JsonProperty("display_name")
    public void setDisplayName(String str) {
        this.displayName = str;
    }

    @JsonProperty("pkg_type")
    public String getPkgType() {
        return this.pkgType;
    }

    @JsonProperty("pkg_type")
    public void setPkgType(String str) {
        this.pkgType = str;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
