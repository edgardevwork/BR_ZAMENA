package org.jfrog.build.api;

import java.io.Serializable;

/* loaded from: classes8.dex */
public class Issue implements Serializable {
    public boolean aggregated;
    public String key;
    public String summary;
    public String url;

    public Issue() {
    }

    public Issue(String str, String str2, String str3) {
        this.key = str;
        this.url = str2;
        this.summary = str3;
        this.aggregated = false;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String str) {
        this.summary = str;
    }

    public boolean isAggregated() {
        return this.aggregated;
    }

    public void setAggregated(boolean z) {
        this.aggregated = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Issue)) {
            return false;
        }
        Issue issue = (Issue) obj;
        String str = this.key;
        if (str == null ? issue.key != null : !str.equals(issue.key)) {
            return false;
        }
        String str2 = this.url;
        if (str2 == null ? issue.url != null : !str2.equals(issue.url)) {
            return false;
        }
        String str3 = this.summary;
        String str4 = issue.summary;
        return str3 != null ? str3.equals(str4) : str4 == null;
    }

    public int hashCode() {
        String str = this.key;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.url;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.summary;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
