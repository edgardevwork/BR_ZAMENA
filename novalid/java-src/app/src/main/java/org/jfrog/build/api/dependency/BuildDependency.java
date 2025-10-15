package org.jfrog.build.api.dependency;

import java.io.Serializable;

/* loaded from: classes8.dex */
public class BuildDependency implements Serializable {
    public String name;
    public String number;
    public String started;
    public String url;

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String str) {
        this.number = str;
    }

    public String getStarted() {
        return this.started;
    }

    public void setStarted(String str) {
        this.started = str;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BuildDependency buildDependency = (BuildDependency) obj;
        if (getName() == null ? buildDependency.getName() != null : !getName().equals(buildDependency.getName())) {
            return false;
        }
        if (getNumber() == null ? buildDependency.getNumber() != null : !getNumber().equals(buildDependency.getNumber())) {
            return false;
        }
        if (getStarted() == null ? buildDependency.getStarted() == null : getStarted().equals(buildDependency.getStarted())) {
            return getUrl() != null ? getUrl().equals(buildDependency.getUrl()) : buildDependency.getUrl() == null;
        }
        return false;
    }

    public int hashCode() {
        return ((((((getName() != null ? getName().hashCode() : 0) * 31) + (getNumber() != null ? getNumber().hashCode() : 0)) * 31) + (getStarted() != null ? getStarted().hashCode() : 0)) * 31) + (getUrl() != null ? getUrl().hashCode() : 0);
    }
}
