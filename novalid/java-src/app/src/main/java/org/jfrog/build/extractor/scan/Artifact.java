package org.jfrog.build.extractor.scan;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes7.dex */
public class Artifact implements Serializable {
    public static final long serialVersionUID = 1;
    public GeneralInfo generalInfo;
    public Set<Issue> issues;
    public Set<License> licenses;

    public Artifact() {
        this.generalInfo = new GeneralInfo();
        this.issues = new HashSet();
        this.licenses = new HashSet();
    }

    public Artifact(GeneralInfo generalInfo, Set<Issue> set, Set<License> set2) {
        this.generalInfo = generalInfo;
        this.issues = set;
        this.licenses = set2;
    }

    public GeneralInfo getGeneralInfo() {
        return this.generalInfo;
    }

    public void setGeneralInfo(GeneralInfo generalInfo) {
        this.generalInfo = generalInfo;
    }

    public Set<Issue> getIssues() {
        return this.issues;
    }

    public void setIssues(Set<Issue> set) {
        this.issues = set;
    }

    public Set<License> getLicenses() {
        return this.licenses;
    }

    public void setLicenses(Set<License> set) {
        this.licenses = set;
    }
}
