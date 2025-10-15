package org.jfrog.build.client.artifactoryXrayResponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.gms.stats.CodePackage;
import java.io.Serializable;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;

/* loaded from: classes7.dex */
public class Issue implements Serializable {
    public static final long serialVersionUID = -2567386345962539129L;
    public String created;
    public String cve;
    public String description;

    @JsonProperty("impacted_artifacts")
    public List<ImpactedArtifact> impactedArtifacts;
    public String provider;
    public String severity;
    public String summary;
    public String type;

    public enum IssueType {
        SECURITY,
        LICENSE
    }

    public Issue() {
        this.impactedArtifacts = null;
    }

    public Issue(String str, String str2, String str3, String str4, String str5, String str6, List<ImpactedArtifact> list, String str7) {
        this.severity = str;
        this.type = str2;
        this.provider = str3;
        this.created = str4;
        this.summary = str5;
        this.description = str6;
        this.impactedArtifacts = list;
        this.cve = str7;
    }

    public String getSeverity() {
        return this.severity;
    }

    public void setSeverity(String str) {
        this.severity = str;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String getProvider() {
        return this.provider;
    }

    public void setProvider(String str) {
        this.provider = str;
    }

    public String getCreated() {
        return this.created;
    }

    public void setCreated(String str) {
        this.created = str;
    }

    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String str) {
        this.summary = str;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    @JsonProperty("impacted_artifacts")
    public List<ImpactedArtifact> getImpactedArtifacts() {
        return this.impactedArtifacts;
    }

    @JsonProperty("impacted_artifacts")
    public void setImpactedArtifacts(List<ImpactedArtifact> list) {
        this.impactedArtifacts = list;
    }

    public String getCve() {
        return this.cve;
    }

    public void setCve(String str) {
        this.cve = str;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public IssueType getIssueType() {
        String upperCase = StringUtils.defaultString(getType()).toUpperCase();
        upperCase.hashCode();
        if (upperCase.equals("LICENSE")) {
            return IssueType.LICENSE;
        }
        if (upperCase.equals(CodePackage.SECURITY)) {
            return IssueType.SECURITY;
        }
        return null;
    }
}
