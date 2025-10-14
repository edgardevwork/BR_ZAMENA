package org.jfrog.build.extractor.clientConfiguration;

import org.jfrog.build.extractor.clientConfiguration.client.distribution.DistributionManager;

/* loaded from: classes5.dex */
public class DistributionManagerBuilder extends ManagerBuilderBase<DistributionManagerBuilder> {
    @Override // org.jfrog.build.extractor.clientConfiguration.ManagerBuilderBase
    public DistributionManagerBuilder self() {
        return this;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.ManagerBuilderBase
    public DistributionManager build() {
        DistributionManager distributionManager = new DistributionManager(this.serverUrl, this.username, this.password, this.accessToken, this.log);
        build(distributionManager);
        return distributionManager;
    }
}
