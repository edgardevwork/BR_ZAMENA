package org.jfrog.build.extractor.clientConfiguration.client.distribution.services;

import java.io.IOException;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.client.JFrogHttpClient;
import org.jfrog.build.extractor.clientConfiguration.client.distribution.request.CreateReleaseBundleRequest;
import org.jfrog.build.extractor.clientConfiguration.util.JsonUtils;

/* loaded from: classes7.dex */
public class CreateReleaseBundle extends VoidDistributionService {
    public static final String CREAT_RELEASE_BUNDLE_ENDPOINT = "api/v1/release_bundle";
    public final String gpgPassphrase;
    public final CreateReleaseBundleRequest request;

    public CreateReleaseBundle(CreateReleaseBundleRequest createReleaseBundleRequest, String str, Log log) {
        super(log);
        this.request = createReleaseBundleRequest;
        this.gpgPassphrase = str;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void ensureRequirements(JFrogHttpClient jFrogHttpClient) throws IOException {
        CreateReleaseBundleRequest createReleaseBundleRequest = this.request;
        if (createReleaseBundleRequest == null) {
            throw new IOException("CreateReleaseBundleRequest parameter is mandatory");
        }
        if (StringUtils.isBlank(createReleaseBundleRequest.getName())) {
            throw new IOException("Release bundle name in CreateReleaseBundleRequest is mandatory");
        }
        if (StringUtils.isBlank(this.request.getVersion())) {
            throw new IOException("Release bundle version in CreateReleaseBundleRequest is mandatory");
        }
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() throws IOException {
        HttpPost httpPost = new HttpPost("api/v1/release_bundle");
        httpPost.setHeader("Accept", "application/json");
        if (StringUtils.isNotBlank(this.gpgPassphrase)) {
            httpPost.setHeader("X-GPG-PASSPHRASE", this.gpgPassphrase);
        }
        StringEntity stringEntity = new StringEntity(JsonUtils.toJsonString(this.request));
        stringEntity.setContentType("application/json");
        httpPost.setEntity(stringEntity);
        return httpPost;
    }
}
