package org.jfrog.build.extractor.p065ci;

import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes8.dex */
public class IssueTracker implements Serializable {
    public String name;
    public String version;

    public IssueTracker() {
    }

    public IssueTracker(String str) {
        this(str, null);
    }

    public IssueTracker(String str, String str2) {
        this.name = str;
        this.version = str2;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IssueTracker)) {
            return false;
        }
        IssueTracker issueTracker = (IssueTracker) obj;
        return Objects.equals(this.name, issueTracker.name) && Objects.equals(this.version, issueTracker.version);
    }

    public org.jfrog.build.api.IssueTracker ToBuildIssueTracker() {
        return new org.jfrog.build.api.IssueTracker(this.name, this.version);
    }

    public static IssueTracker ToBuildInfoIssueTracker(org.jfrog.build.api.IssueTracker issueTracker) {
        return new IssueTracker(issueTracker.getName(), issueTracker.getVersion());
    }
}
