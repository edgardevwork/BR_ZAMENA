package org.jfrog.build.extractor.clientConfiguration.client.distribution.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import org.jfrog.build.extractor.clientConfiguration.client.distribution.response.DistributionStatusResponse;

/* loaded from: classes7.dex */
public class DistributeReleaseBundleResponse implements Serializable {
    public static final long serialVersionUID = 1;
    public List<DistributionStatusResponse.TargetArtifactory> sites;

    @JsonProperty("id")
    public String trackerId;

    public List<DistributionStatusResponse.TargetArtifactory> getSites() {
        return this.sites;
    }

    public void setSites(List<DistributionStatusResponse.TargetArtifactory> list) {
        this.sites = list;
    }

    public String getTrackerId() {
        return this.trackerId;
    }

    public void setTrackerId(String str) {
        this.trackerId = str;
    }
}
