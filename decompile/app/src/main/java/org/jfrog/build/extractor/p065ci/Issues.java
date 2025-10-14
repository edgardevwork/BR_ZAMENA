package org.jfrog.build.extractor.p065ci;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.jfrog.build.api.Issue;

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

    public org.jfrog.build.api.Issues ToBuildIssues() {
        org.jfrog.build.api.Issues issues = new org.jfrog.build.api.Issues();
        Set<Issue> set = this.affectedIssues;
        issues.setAffectedIssues(set == null ? null : (Set) set.stream().map(new Function() { // from class: org.jfrog.build.extractor.ci.Issues$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Issue) obj).ToBuildIssue();
            }
        }).collect(Collectors.toSet()));
        issues.setAggregateBuildIssues(this.aggregateBuildIssues);
        IssueTracker issueTracker = this.tracker;
        issues.setTracker(issueTracker != null ? issueTracker.ToBuildIssueTracker() : null);
        issues.setAggregationBuildStatus(this.aggregationBuildStatus);
        return issues;
    }

    public static Issues ToBuildInfoIssues(org.jfrog.build.api.Issues issues) {
        Issues issues2 = new Issues();
        issues2.setAffectedIssues(issues.getAffectedIssues() == null ? null : (Set) issues.getAffectedIssues().stream().map(new Function() { // from class: org.jfrog.build.extractor.ci.Issues$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Issue.ToBuildInfoIssue((Issue) obj);
            }
        }).collect(Collectors.toSet()));
        issues2.setAggregateBuildIssues(issues.isAggregateBuildIssues());
        issues2.setTracker(issues.getTracker() != null ? IssueTracker.ToBuildInfoIssueTracker(issues.getTracker()) : null);
        issues2.setAggregationBuildStatus(issues.getAggregationBuildStatus());
        return issues2;
    }
}
