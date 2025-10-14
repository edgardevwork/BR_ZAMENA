package org.jfrog.build.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;

/* loaded from: classes8.dex */
public class Issues implements Serializable {
    public Set<Issue> affectedIssues;
    public boolean aggregateBuildIssues;
    public String aggregationBuildStatus;
    public IssueTracker tracker;

    public Issues() {
    }

    public Issues(IssueTracker issueTracker, boolean z, String str, Set<Issue> set) {
        this.tracker = issueTracker;
        this.aggregateBuildIssues = z;
        this.aggregationBuildStatus = str;
        this.affectedIssues = set;
    }

    public IssueTracker getTracker() {
        return this.tracker;
    }

    public void setTracker(IssueTracker issueTracker) {
        this.tracker = issueTracker;
    }

    public Set<Issue> getAffectedIssues() {
        return this.affectedIssues;
    }

    public void addIssue(Issue issue) {
        if (this.affectedIssues == null) {
            this.affectedIssues = new HashSet();
        }
        this.affectedIssues.add(issue);
    }

    @JsonIgnore
    public boolean isEmpty() {
        if (this.tracker != null && StringUtils.isNotEmpty(this.aggregationBuildStatus)) {
            return false;
        }
        Set<Issue> set = this.affectedIssues;
        if (set == null) {
            return true;
        }
        return set.isEmpty();
    }

    public void setAffectedIssues(Set<Issue> set) {
        this.affectedIssues = set;
    }

    public boolean isAggregateBuildIssues() {
        return this.aggregateBuildIssues;
    }

    public void setAggregateBuildIssues(boolean z) {
        this.aggregateBuildIssues = z;
    }

    public String getAggregationBuildStatus() {
        return this.aggregationBuildStatus;
    }

    public void setAggregationBuildStatus(String str) {
        this.aggregationBuildStatus = str;
    }

    public void append(Issues issues) {
        if (issues == null || issues.getTracker() == null || issues.affectedIssues == null) {
            return;
        }
        if (getTracker() == null || this.affectedIssues == null) {
            setTracker(issues.getTracker());
            this.aggregateBuildIssues = issues.aggregateBuildIssues;
            this.aggregationBuildStatus = issues.aggregationBuildStatus;
            this.affectedIssues = issues.affectedIssues;
            return;
        }
        if (issues.getTracker().getName().equals(getTracker().getName())) {
            appendAffectedIssues(issues.affectedIssues);
        }
    }

    public final void appendAffectedIssues(Set<Issue> set) {
        if (set == null) {
            return;
        }
        Set<Issue> set2 = this.affectedIssues;
        if (set2 == null) {
            this.affectedIssues = set;
        } else {
            set2.addAll(set);
        }
    }
}
