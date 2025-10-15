package org.jfrog.build.client.artifactoryXrayResponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import org.apache.commons.lang3.builder.ToStringBuilder;

/* loaded from: classes7.dex */
public class Summary implements Serializable {
    public static final long serialVersionUID = -1373752199883531450L;

    @JsonProperty("fail_build")
    public boolean failBuild;
    public String message;

    @JsonProperty("more_details_url")
    public String moreDetailsUrl;

    @JsonProperty("total_alerts")
    public int totalAlerts;

    public Summary() {
    }

    public Summary(int i, boolean z, String str, String str2) {
        this.totalAlerts = i;
        this.failBuild = z;
        this.message = str;
        this.moreDetailsUrl = str2;
    }

    @JsonProperty("total_alerts")
    public int getTotalAlerts() {
        return this.totalAlerts;
    }

    @JsonProperty("total_alerts")
    public void setTotalAlerts(int i) {
        this.totalAlerts = i;
    }

    @JsonProperty("fail_build")
    public boolean isFailBuild() {
        return this.failBuild;
    }

    @JsonProperty("fail_build")
    public void setFailBuild(boolean z) {
        this.failBuild = z;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    @JsonProperty("more_details_url")
    public String getMoreDetailsUrl() {
        return this.moreDetailsUrl;
    }

    @JsonProperty("more_details_url")
    public void setMoreDetailsUrl(String str) {
        this.moreDetailsUrl = str;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
