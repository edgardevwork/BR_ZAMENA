package org.jfrog.build.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/* loaded from: classes5.dex */
public abstract class BaseBuildFileBean extends BaseBuildBean implements BuildFileBean {
    public String md5;

    @JsonProperty("path")
    public String remotePath;
    public String sha1;
    public String sha256;
    public String type;

    @Override // org.jfrog.build.api.BuildFileBean
    public String getType() {
        return this.type;
    }

    @Override // org.jfrog.build.api.BuildFileBean
    public void setType(String str) {
        this.type = str;
    }

    @Override // org.jfrog.build.api.BuildFileBean
    public String getSha1() {
        return this.sha1;
    }

    @Override // org.jfrog.build.api.BuildFileBean
    public void setSha1(String str) {
        this.sha1 = str;
    }

    @Override // org.jfrog.build.api.BuildFileBean
    public String getSha256() {
        return this.sha256;
    }

    @Override // org.jfrog.build.api.BuildFileBean
    public void setSha256(String str) {
        this.sha256 = str;
    }

    @Override // org.jfrog.build.api.BuildFileBean
    public String getMd5() {
        return this.md5;
    }

    @Override // org.jfrog.build.api.BuildFileBean
    public void setMd5(String str) {
        this.md5 = str;
    }

    public String getRemotePath() {
        return this.remotePath;
    }

    public void setRemotePath(String str) {
        this.remotePath = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseBuildFileBean)) {
            return false;
        }
        BaseBuildFileBean baseBuildFileBean = (BaseBuildFileBean) obj;
        if (Objects.equals(this.md5, baseBuildFileBean.md5) && Objects.equals(this.sha1, baseBuildFileBean.sha1) && Objects.equals(this.sha256, baseBuildFileBean.sha256)) {
            return Objects.equals(this.type, baseBuildFileBean.type);
        }
        return false;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.sha1;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.sha256;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.md5;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.remotePath;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
