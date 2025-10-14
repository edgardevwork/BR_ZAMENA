package org.jfrog.build.extractor.clientConfiguration.client.distribution.services;

import java.io.IOException;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.client.JFrogHttpClient;
import org.jfrog.build.extractor.clientConfiguration.client.distribution.request.UpdateReleaseBundleRequest;
import org.jfrog.build.extractor.clientConfiguration.util.JsonUtils;

/* loaded from: classes7.dex */
public class UpdateReleaseBundle extends VoidDistributionService {
    public static final String UPDATE_RELEASE_BUNDLE_ENDPOINT = "api/v1/release_bundle";
    public final String gpgPassphrase;
    public final String name;
    public final UpdateReleaseBundleRequest request;
    public final String version;

    public UpdateReleaseBundle(UpdateReleaseBundleRequest updateReleaseBundleRequest, String str, String str2, String str3, Log log) {
        super(log);
        this.request = updateReleaseBundleRequest;
        this.name = str;
        this.version = str2;
        this.gpgPassphrase = str3;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void ensureRequirements(JFrogHttpClient jFrogHttpClient) throws IOException {
        if (this.request == null) {
            throw new IOException("UpdateReleaseBundleRequest parameter is mandatory");
        }
        if (StringUtils.isBlank(this.name)) {
            throw new IOException("Release bundle name is mandatory");
        }
        if (StringUtils.isBlank(this.version)) {
            throw new IOException("Release bundle version is mandatory");
        }
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() throws IOException {
        HttpPut httpPut = new HttpPut(String.format("%s/%s/%s", "api/v1/release_bundle", this.name, this.version));
        httpPut.setHeader("Accept", " application/json");
        if (StringUtils.isNotBlank(this.gpgPassphrase)) {
            httpPut.setHeader("X-GPG-PASSPHRASE", this.gpgPassphrase);
        }
        StringEntity stringEntity = new StringEntity(JsonUtils.toJsonString(this.request));
        stringEntity.setContentType("application/json");
        httpPut.setEntity(stringEntity);
        return httpPut;
    }
}
