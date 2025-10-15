package org.jfrog.build.extractor.p065ci;

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

    public org.jfrog.build.api.BuildRetention ToBuildRetention() {
        org.jfrog.build.api.BuildRetention buildRetention = new org.jfrog.build.api.BuildRetention();
        buildRetention.setDeleteBuildArtifacts(this.deleteBuildArtifacts);
        buildRetention.setCount(this.count);
        buildRetention.setMinimumBuildDate(this.minimumBuildDate);
        buildRetention.setBuildNumbersNotToBeDiscarded(this.buildNumbersNotToBeDiscarded);
        return buildRetention;
    }

    public static BuildRetention ToBuildInfoRetention(org.jfrog.build.api.BuildRetention buildRetention) {
        BuildRetention buildRetention2 = new BuildRetention();
        buildRetention2.setDeleteBuildArtifacts(buildRetention.isDeleteBuildArtifacts());
        buildRetention2.setCount(buildRetention.getCount());
        buildRetention2.setMinimumBuildDate(buildRetention.getMinimumBuildDate());
        buildRetention2.setBuildNumbersNotToBeDiscarded(buildRetention.getBuildNumbersNotToBeDiscarded());
        return buildRetention2;
    }
}
