package org.jfrog.build.extractor.clientConfiguration.client.distribution.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import org.jfrog.build.extractor.clientConfiguration.client.distribution.types.DistributionRules;

/* loaded from: classes7.dex */
public abstract class RemoteReleaseBundleRequest implements Serializable {
    public static final long serialVersionUID = 1;

    @JsonProperty("distribution_rules")
    public List<DistributionRules> distributionRules;

    @JsonProperty("dry_run")
    public boolean dryRun;

    public List<DistributionRules> getDistributionRules() {
        return this.distributionRules;
    }

    public void setDistributionRules(List<DistributionRules> list) {
        this.distributionRules = list;
    }

    public boolean isDryRun() {
        return this.dryRun;
    }

    public void setDryRun(boolean z) {
        this.dryRun = z;
    }
}
