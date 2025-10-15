package org.jfrog.build.client.artifactoryXrayResponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;

/* loaded from: classes7.dex */
public class ImpactedArtifact implements Serializable {
    public static final long serialVersionUID = 1617312984328401853L;
    public int depth;

    @JsonProperty("display_name")
    public String displayName;

    @JsonProperty("infected_files")
    public List<InfectedFile> infectedFiles;
    public String name;

    @JsonProperty("parent_sha")
    public String parentSha;
    public String path;

    @JsonProperty("pkg_type")
    public String pkgType;
    public String sha1;
    public String sha256;

    public ImpactedArtifact() {
    }

    public ImpactedArtifact(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, List<InfectedFile> list) {
        this.name = str;
        this.displayName = str2;
        this.path = str3;
        this.pkgType = str4;
        this.sha256 = str5;
        this.sha1 = str6;
        this.depth = i;
        this.parentSha = str7;
        this.infectedFiles = list;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    @JsonProperty("display_name")
    public String getDisplayName() {
        return this.displayName;
    }

    @JsonProperty("display_name")
    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String str) {
        this.path = str;
    }

    @JsonProperty("pkg_type")
    public String getPkgType() {
        return this.pkgType;
    }

    @JsonProperty("pkg_type")
    public void setPkgType(String str) {
        this.pkgType = str;
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

    @JsonProperty("infected_files")
    public List<InfectedFile> getInfectedFiles() {
        return this.infectedFiles;
    }

    @JsonProperty("infected_files")
    public void setInfectedFiles(List<InfectedFile> list) {
        this.infectedFiles = list;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
