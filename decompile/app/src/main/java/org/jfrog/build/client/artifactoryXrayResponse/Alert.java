package org.jfrog.build.client.artifactoryXrayResponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;

/* loaded from: classes7.dex */
public class Alert implements Serializable {
    public static final long serialVersionUID = -4013872536159025854L;
    public String created;
    public List<Issue> issues;

    @JsonProperty("top_severity")
    public String topSeverity;

    @JsonProperty("watch_name")
    public String watchName;

    public Alert() {
        this.issues = null;
    }

    public Alert(String str, String str2, String str3, List<Issue> list) {
        this.created = str;
        this.topSeverity = str2;
        this.watchName = str3;
        this.issues = list;
    }

    public String getCreated() {
        return this.created;
    }

    public void setCreated(String str) {
        this.created = str;
    }

    @JsonProperty("top_severity")
    public String getTopSeverity() {
        return this.topSeverity;
    }

    @JsonProperty("top_severity")
    public void setTopSeverity(String str) {
        this.topSeverity = str;
    }

    @JsonProperty("watch_name")
    public String getWatchName() {
        return this.watchName;
    }

    @JsonProperty("watch_name")
    public void setWatchName(String str) {
        this.watchName = str;
    }

    public List<Issue> getIssues() {
        return this.issues;
    }

    public void setIssues(List<Issue> list) {
        this.issues = list;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
