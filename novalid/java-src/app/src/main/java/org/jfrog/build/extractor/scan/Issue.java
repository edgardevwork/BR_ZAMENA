package org.jfrog.build.extractor.scan;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nonnull;
import org.apache.commons.lang3.StringUtils;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
/* loaded from: classes5.dex */
public class Issue implements Comparable<Issue> {
    public String component;
    public List<Cve> cves;
    public List<String> fixedVersions;
    public String ignoreRuleUrl;
    public String issueId;
    public List<String> references;
    public Severity severity;
    public String summary;

    public Issue() {
        this.severity = Severity.Normal;
        this.component = "";
    }

    public Issue(String str, Severity severity, String str2, List<String> list, List<Cve> list2, List<String> list3, String str3) {
        Severity severity2 = Severity.Normal;
        this.component = "";
        this.issueId = str;
        this.severity = severity;
        this.summary = str2;
        this.fixedVersions = list;
        this.cves = list2;
        this.references = list3;
        this.ignoreRuleUrl = str3;
    }

    public String getIssueId() {
        return this.issueId;
    }

    public Severity getSeverity() {
        return this.severity;
    }

    public String getComponent() {
        return this.component;
    }

    public void setComponent(String str) {
        this.component = str;
    }

    public String getSummary() {
        return this.summary;
    }

    public List<String> getFixedVersions() {
        return this.fixedVersions;
    }

    public void setFixedVersions(List<String> list) {
        this.fixedVersions = list;
    }

    public List<Cve> getCves() {
        return this.cves;
    }

    public List<String> getReferences() {
        return this.references;
    }

    public String getIgnoreRuleUrl() {
        return this.ignoreRuleUrl;
    }

    @JsonIgnore
    public boolean isTopSeverity() {
        return getSeverity() == Severity.Critical;
    }

    @JsonIgnore
    public boolean isHigherSeverityThan(Issue issue) {
        return getSeverity().isHigherThan(issue.getSeverity());
    }

    @Override // java.lang.Comparable
    public int compareTo(@Nonnull Issue issue) {
        return Integer.compare(hashCode(), Objects.hashCode(issue));
    }

    public boolean equals(Object obj) {
        if (obj instanceof Issue) {
            return StringUtils.equals(((Issue) obj).getIssueId(), getIssueId());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.issueId);
    }
}
