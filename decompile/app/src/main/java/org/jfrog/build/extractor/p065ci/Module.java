package org.jfrog.build.extractor.p065ci;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
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
    public String f10013id;
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
        return this.f10013id;
    }

    public void setId(String str) {
        this.f10013id = str;
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

    public void setArtifacts(List<Artifact> list) {
        this.artifacts = list;
    }

    public List<Artifact> getExcludedArtifacts() {
        return this.excludedArtifacts;
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

    public void append(Module module) {
        this.artifacts = appendBuildFileLists(this.artifacts, module.getArtifacts());
        this.excludedArtifacts = appendBuildFileLists(this.excludedArtifacts, module.getExcludedArtifacts());
        this.dependencies = appendBuildFileLists(this.dependencies, module.getDependencies());
        this.type = (String) StringUtils.defaultIfEmpty(this.type, module.type);
        this.repository = (String) StringUtils.defaultIfEmpty(this.repository, module.repository);
        this.md5 = (String) StringUtils.defaultIfEmpty(this.md5, module.md5);
        this.sha1 = (String) StringUtils.defaultIfEmpty(this.sha1, module.sha1);
    }

    public final <T extends BaseBuildBean> List<T> appendBuildFileLists(List<T> list, List<T> list2) {
        if (list == null && list2 == null) {
            return null;
        }
        return (List) Stream.of((Object[]) new List[]{(List) Optional.ofNullable(list).orElseGet(new Supplier() { // from class: org.jfrog.build.extractor.ci.Module$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                return Collections.emptyList();
            }
        }), (List) Optional.ofNullable(list2).orElseGet(new Supplier() { // from class: org.jfrog.build.extractor.ci.Module$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                return Collections.emptyList();
            }
        })}).flatMap(new Function() { // from class: org.jfrog.build.extractor.ci.Module$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((List) obj).stream();
            }
        }).distinct().collect(Collectors.toList());
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
