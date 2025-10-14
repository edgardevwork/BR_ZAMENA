package org.jfrog.build.extractor.clientConfiguration.client.distribution.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import org.jfrog.build.extractor.clientConfiguration.client.distribution.types.ReleaseBundleSpec;
import org.jfrog.build.extractor.clientConfiguration.client.distribution.types.ReleaseNotes;

/* loaded from: classes7.dex */
public class GetReleaseBundleStatusResponse implements Serializable {
    public static final long serialVersionUID = 1;
    public String description;
    public String name;

    @JsonProperty("release_notes")
    public ReleaseNotes releaseNotes;
    public ReleaseBundleSpec spec;
    public DistributionState state;
    public String version;

    public enum DistributionState {
        OPEN,
        SIGNED,
        STORED,
        READY_FOR_DISTRIBUTION
    }

    public ReleaseNotes getReleaseNotes() {
        return this.releaseNotes;
    }

    public void setReleaseNotes(ReleaseNotes releaseNotes) {
        this.releaseNotes = releaseNotes;
    }

    public DistributionState getState() {
        return this.state;
    }

    public void setState(DistributionState distributionState) {
        this.state = distributionState;
    }

    public ReleaseBundleSpec getSpec() {
        return this.spec;
    }

    public void setSpec(ReleaseBundleSpec releaseBundleSpec) {
        this.spec = releaseBundleSpec;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }
}
