package org.jfrog.build.extractor.p065ci;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

@XStreamAlias("dependency")
/* loaded from: classes7.dex */
public class Dependency extends BaseBuildFileBean {
    public static final String SCOPE_BUILD = "_build_";

    /* renamed from: id */
    public String f10012id;
    public String[][] requestedBy;
    public Set<String> scopes;

    public String getId() {
        return this.f10012id;
    }

    public void setId(String str) {
        this.f10012id = str;
    }

    public Set<String> getScopes() {
        return this.scopes;
    }

    public void setScopes(Set<String> set) {
        this.scopes = set;
    }

    public String[][] getRequestedBy() {
        return this.requestedBy;
    }

    public void setRequestedBy(String[][] strArr) {
        this.requestedBy = strArr;
    }

    public void addRequestedBy(String[] strArr) {
        this.requestedBy = (String[][]) ArrayUtils.add(this.requestedBy, strArr);
    }

    @Override // org.jfrog.build.extractor.p065ci.BaseBuildFileBean
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dependency) || !super.equals(obj)) {
            return false;
        }
        Dependency dependency = (Dependency) obj;
        if (Objects.equals(this.f10012id, dependency.f10012id) && StringUtils.equals(this.remotePath, dependency.remotePath) && Objects.equals(this.scopes, dependency.scopes)) {
            return Arrays.deepEquals(this.requestedBy, dependency.requestedBy);
        }
        return false;
    }

    @Override // org.jfrog.build.extractor.p065ci.BaseBuildFileBean
    public int hashCode() {
        return Objects.hash(this.f10012id, this.scopes, Integer.valueOf(Arrays.deepHashCode(this.requestedBy)), this.remotePath);
    }

    public org.jfrog.build.api.Dependency ToBuildDependency() {
        org.jfrog.build.api.Dependency dependency = new org.jfrog.build.api.Dependency();
        dependency.setId(this.f10012id);
        dependency.setRequestedBy(this.requestedBy);
        dependency.setScopes(this.scopes);
        dependency.setType(this.type);
        dependency.setMd5(this.md5);
        dependency.setSha256(this.sha256);
        dependency.setSha1(this.sha1);
        dependency.setRemotePath(this.remotePath);
        dependency.setProperties(getProperties());
        return dependency;
    }

    public static Dependency ToBuildDependency(org.jfrog.build.api.Dependency dependency) {
        Dependency dependency2 = new Dependency();
        dependency2.setId(dependency.getId());
        dependency2.setRequestedBy(dependency.getRequestedBy());
        dependency2.setScopes(dependency.getScopes());
        dependency2.setType(dependency.getType());
        dependency2.setMd5(dependency.getMd5());
        dependency2.setSha256(dependency.getSha256());
        dependency2.setSha1(dependency.getSha1());
        dependency2.setRemotePath(dependency.getRemotePath());
        dependency2.setProperties(dependency.getProperties());
        return dependency2;
    }
}
