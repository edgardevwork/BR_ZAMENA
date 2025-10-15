package org.jfrog.build.extractor.p065ci;

import java.io.IOException;
import java.io.Serializable;
import org.apache.commons.lang3.StringUtils;

/* loaded from: classes8.dex */
public class IssuesCollectionConfig implements Serializable {
    public static final String ISSUES_COLLECTION_ERROR_PREFIX = "Issues Collection Failed: ";
    public static final String MISSING_CONFIGURATION_ERROR = "Configuration file must contain: ";
    public static final long serialVersionUID = 1;
    public Issues issues;
    public int version;

    public int getVersion() {
        return this.version;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    public Issues getIssues() {
        return this.issues;
    }

    public void setIssues(Issues issues) {
        this.issues = issues;
    }

    public void validateConfig() throws IOException {
        Issues issues = this.issues;
        if (issues == null) {
            throw new IOException("Issues Collection Failed: Configuration file must contain: issues");
        }
        if (issues.trackerName == null) {
            throw new IOException("Issues Collection Failed: Configuration file must contain: trackerName");
        }
        if (this.issues.regexp == null) {
            throw new IOException("Issues Collection Failed: Configuration file must contain: regexp");
        }
        if (this.issues.keyGroupIndex == 0) {
            throw new IOException("Issues Collection Failed: Configuration file must contain: keyGroupIndex");
        }
        if (this.issues.summaryGroupIndex == 0) {
            throw new IOException("Issues Collection Failed: Configuration file must contain: summaryGroupIndex");
        }
    }

    public static class Issues implements Serializable {
        public static final long serialVersionUID = 1;
        public boolean aggregate;
        public String aggregationStatus;
        public int keyGroupIndex;
        public String regexp;
        public int summaryGroupIndex;
        public String trackerName;
        public String trackerUrl;

        public String getTrackerName() {
            return this.trackerName;
        }

        public void setTrackerName(String str) {
            this.trackerName = str;
        }

        public String getRegexp() {
            return this.regexp;
        }

        public void setRegexp(String str) {
            this.regexp = str;
        }

        public int getKeyGroupIndex() {
            return this.keyGroupIndex;
        }

        public void setKeyGroupIndex(int i) {
            this.keyGroupIndex = i;
        }

        public int getSummaryGroupIndex() {
            return this.summaryGroupIndex;
        }

        public void setSummaryGroupIndex(int i) {
            this.summaryGroupIndex = i;
        }

        public String getTrackerUrl() {
            return this.trackerUrl;
        }

        public void setTrackerUrl(String str) {
            this.trackerUrl = StringUtils.stripEnd(str, "/");
        }

        public boolean isAggregate() {
            return this.aggregate;
        }

        public void setAggregate(boolean z) {
            this.aggregate = z;
        }

        public String getAggregationStatus() {
            return this.aggregationStatus;
        }

        public void setAggregationStatus(String str) {
            this.aggregationStatus = str;
        }
    }
}
