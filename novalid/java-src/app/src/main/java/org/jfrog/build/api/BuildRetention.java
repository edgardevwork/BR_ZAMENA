package org.jfrog.build.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@XStreamAlias("buildretention")
/* loaded from: classes8.dex */
public class BuildRetention implements Serializable {
    public boolean deleteBuildArtifacts;
    public Date minimumBuildDate;
    public int count = -1;
    public List<String> buildNumbersNotToBeDiscarded = new ArrayList();

    public BuildRetention() {
    }

    public BuildRetention(boolean z) {
        this.deleteBuildArtifacts = z;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public Date getMinimumBuildDate() {
        return this.minimumBuildDate;
    }

    public void setMinimumBuildDate(Date date) {
        this.minimumBuildDate = date;
    }

    public void setDeleteBuildArtifacts(boolean z) {
        this.deleteBuildArtifacts = z;
    }

    public boolean isDeleteBuildArtifacts() {
        return this.deleteBuildArtifacts;
    }

    public void addBuildNotToBeDiscarded(String str) {
        this.buildNumbersNotToBeDiscarded.add(str);
    }

    public void setBuildNumbersNotToBeDiscarded(List<String> list) {
        if (list == null) {
            this.buildNumbersNotToBeDiscarded = new ArrayList();
        } else {
            this.buildNumbersNotToBeDiscarded = list;
        }
    }

    public List<String> getBuildNumbersNotToBeDiscarded() {
        return this.buildNumbersNotToBeDiscarded;
    }

    @JsonIgnore
    public boolean isEmpty() {
        return this.count == -1 && this.minimumBuildDate == null;
    }
}
