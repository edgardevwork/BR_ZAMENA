package org.jfrog.build.extractor.clientConfiguration.client.distribution.request;

import org.jfrog.build.extractor.clientConfiguration.client.distribution.request.CreateUpdateReleaseBundleRequest;

/* loaded from: classes5.dex */
public class CreateReleaseBundleRequest extends CreateUpdateReleaseBundleRequest {
    public String name;
    public String version;

    public CreateReleaseBundleRequest() {
    }

    public CreateReleaseBundleRequest(String str, String str2) {
        this.name = str;
        this.version = str2;
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

    public static class Builder extends CreateUpdateReleaseBundleRequest.Builder<CreateReleaseBundleRequest, Builder> {
        public final String name;
        public final String version;

        public Builder(String str, String str2) {
            this.name = str;
            this.version = str2;
        }

        @Override // org.jfrog.build.extractor.clientConfiguration.client.distribution.request.CreateUpdateReleaseBundleRequest.Builder
        public CreateReleaseBundleRequest build() {
            CreateReleaseBundleRequest createReleaseBundleRequestBuild = build(new CreateReleaseBundleRequest());
            createReleaseBundleRequestBuild.setName(this.name);
            createReleaseBundleRequestBuild.setVersion(this.version);
            return createReleaseBundleRequestBuild;
        }
    }
}
