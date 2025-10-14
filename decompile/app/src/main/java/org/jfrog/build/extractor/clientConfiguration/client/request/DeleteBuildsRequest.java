package org.jfrog.build.extractor.clientConfiguration.client.request;

/* loaded from: classes7.dex */
public class DeleteBuildsRequest {
    public String buildName;
    public String[] buildNumbers;
    public boolean deleteAll;
    public boolean deleteArtifacts;
    public String project;

    public DeleteBuildsRequest() {
    }

    public DeleteBuildsRequest(String str, String str2, boolean z) {
        this.buildName = str;
        this.project = str2;
        this.deleteArtifacts = z;
    }

    public DeleteBuildsRequest(String str, String[] strArr, String str2, boolean z) {
        this(str, str2, z);
        this.buildNumbers = strArr;
    }

    public String getBuildName() {
        return this.buildName;
    }

    public void setBuildName(String str) {
        this.buildName = str;
    }

    public String[] getBuildNumbers() {
        return this.buildNumbers;
    }

    public void setBuildNumbers(String[] strArr) {
        this.buildNumbers = strArr;
    }

    public boolean isDeleteArtifacts() {
        return this.deleteArtifacts;
    }

    public void setDeleteArtifacts(boolean z) {
        this.deleteArtifacts = z;
    }

    public boolean isDeleteAll() {
        return this.deleteAll;
    }

    public void setDeleteAll(boolean z) {
        this.deleteAll = z;
    }

    public String getProject() {
        return this.project;
    }

    public void setProject(String str) {
        this.project = str;
    }
}
