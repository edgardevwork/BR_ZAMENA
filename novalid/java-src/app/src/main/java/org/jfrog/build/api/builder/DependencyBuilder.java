package org.jfrog.build.api.builder;

import java.util.HashSet;
import java.util.Properties;
import java.util.Set;
import org.apache.commons.lang3.ArrayUtils;
import org.jfrog.build.api.Dependency;

/* loaded from: classes8.dex */
public class DependencyBuilder {

    /* renamed from: id */
    public String f10005id;
    public String md5;
    public Properties properties;
    public String remotePath;
    public String[][] requestedBy;
    public Set<String> scopes;
    public String sha1;
    public String sha256;
    public String type;

    public Dependency build() {
        Dependency dependency = new Dependency();
        dependency.setId(this.f10005id);
        dependency.setType(this.type);
        dependency.setScopes(this.scopes);
        dependency.setSha1(this.sha1);
        dependency.setSha256(this.sha256);
        dependency.setMd5(this.md5);
        dependency.setRemotePath(this.remotePath);
        dependency.setRequestedBy(this.requestedBy);
        dependency.setProperties(this.properties);
        return dependency;
    }

    /* renamed from: id */
    public DependencyBuilder m7385id(String str) {
        this.f10005id = str;
        return this;
    }

    public DependencyBuilder type(String str) {
        this.type = str;
        return this;
    }

    public DependencyBuilder scopes(Set<String> set) {
        this.scopes = set;
        return this;
    }

    public DependencyBuilder addScope(String str) {
        if (this.scopes == null) {
            this.scopes = new HashSet();
        }
        this.scopes.add(str);
        return this;
    }

    public DependencyBuilder sha1(String str) {
        this.sha1 = str;
        return this;
    }

    public DependencyBuilder sha256(String str) {
        this.sha256 = str;
        return this;
    }

    public DependencyBuilder md5(String str) {
        this.md5 = str;
        return this;
    }

    public DependencyBuilder remotePath(String str) {
        this.remotePath = str;
        return this;
    }

    public DependencyBuilder requestedBy(String[][] strArr) {
        this.requestedBy = strArr;
        return this;
    }

    public DependencyBuilder addRequestedBy(String[] strArr) {
        this.requestedBy = (String[][]) ArrayUtils.add(this.requestedBy, strArr);
        return this;
    }

    public DependencyBuilder properties(Properties properties) {
        this.properties = properties;
        return this;
    }

    public DependencyBuilder addProperty(Object obj, Object obj2) {
        if (this.properties == null) {
            this.properties = new Properties();
        }
        this.properties.put(obj, obj2);
        return this;
    }

    public DependencyBuilder addProperties(Properties properties) {
        if (this.properties == null) {
            this.properties = new Properties();
        }
        this.properties.putAll(properties);
        return this;
    }
}
