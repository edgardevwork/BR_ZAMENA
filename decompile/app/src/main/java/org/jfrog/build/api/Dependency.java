package org.jfrog.build.api;

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
    public String f10003id;
    public String[][] requestedBy;
    public Set<String> scopes;

    public String getId() {
        return this.f10003id;
    }

    public void setId(String str) {
        this.f10003id = str;
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

    @Override // org.jfrog.build.api.BaseBuildFileBean
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dependency) || !super.equals(obj)) {
            return false;
        }
        Dependency dependency = (Dependency) obj;
        if (StringUtils.equals(this.f10003id, dependency.f10003id) && StringUtils.equals(this.remotePath, dependency.remotePath) && Objects.equals(this.scopes, dependency.scopes)) {
            return Arrays.deepEquals(this.requestedBy, dependency.requestedBy);
        }
        return false;
    }

    @Override // org.jfrog.build.api.BaseBuildFileBean
    public int hashCode() {
        return Objects.hash(this.f10003id, this.scopes, Integer.valueOf(Arrays.deepHashCode(this.requestedBy)), this.remotePath);
    }
}
