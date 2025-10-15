package org.jfrog.build.api;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;
import java.util.Objects;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

@XStreamAlias("module")
/* loaded from: classes5.dex */
public class Module extends BaseBuildBean {

    @XStreamAlias("artifacts")
    public List<Artifact> artifacts;

    @XStreamAlias("dependencies")
    public List<Dependency> dependencies;

    @XStreamAlias("excludedArtifacts")
    public List<Artifact> excludedArtifacts;

    /* renamed from: id */
    public String f10004id;
    public String md5;
    public String repository;
    public String sha1;
    public String type;

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String getId() {
        return this.f10004id;
    }

    public void setId(String str) {
        this.f10004id = str;
    }

    public void setRepository(String str) {
        this.repository = str;
    }

    public String getRepository() {
        return this.repository;
    }

    public void setSha1(String str) {
        this.sha1 = str;
    }

    public String getSha1() {
        return this.sha1;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public String getMd5() {
        return this.md5;
    }

    public List<Artifact> getArtifacts() {
        return this.artifacts;
    }

    public List<Artifact> getExcludedArtifacts() {
        return this.excludedArtifacts;
    }

    public void setArtifacts(List<Artifact> list) {
        this.artifacts = list;
    }

    public List<Dependency> getDependencies() {
        return this.dependencies;
    }

    public void setDependencies(List<Dependency> list) {
        this.dependencies = list;
    }

    public void setExcludedArtifacts(List<Artifact> list) {
        this.excludedArtifacts = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Module module = (Module) obj;
        return StringUtils.equals(getType(), module.getType()) && StringUtils.equals(getId(), module.getId()) && StringUtils.equals(getRepository(), module.getRepository()) && StringUtils.equals(getSha1(), module.getSha1()) && StringUtils.equals(getMd5(), module.getMd5()) && ArrayUtils.isEquals(getArtifacts(), module.getArtifacts()) && ArrayUtils.isEquals(getExcludedArtifacts(), module.getExcludedArtifacts()) && ArrayUtils.isEquals(getDependencies(), module.getDependencies());
    }

    public int hashCode() {
        return Objects.hash(getType(), getId(), getRepository(), getSha1(), getMd5(), getArtifacts(), getExcludedArtifacts(), getDependencies());
    }
}
