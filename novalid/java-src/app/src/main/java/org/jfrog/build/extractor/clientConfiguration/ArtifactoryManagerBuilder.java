package org.jfrog.build.extractor.clientConfiguration;

import org.jfrog.build.extractor.clientConfiguration.client.artifactory.ArtifactoryManager;

/* loaded from: classes5.dex */
public class ArtifactoryManagerBuilder extends ManagerBuilderBase<ArtifactoryManagerBuilder> {
    @Override // org.jfrog.build.extractor.clientConfiguration.ManagerBuilderBase
    public ArtifactoryManagerBuilder self() {
        return this;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.ManagerBuilderBase
    public ArtifactoryManager build() {
        ArtifactoryManager artifactoryManager = new ArtifactoryManager(this.serverUrl, this.username, this.password, this.accessToken, this.log);
        build(artifactoryManager);
        return artifactoryManager;
    }
}
