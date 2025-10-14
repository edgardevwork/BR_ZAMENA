package org.jfrog.build.extractor.clientConfiguration.client.distribution.services;

import java.io.IOException;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.client.JFrogHttpClient;
import org.jfrog.build.extractor.clientConfiguration.client.distribution.request.SignReleaseBundleRequest;
import org.jfrog.build.extractor.clientConfiguration.util.JsonUtils;

/* loaded from: classes7.dex */
public class SignReleaseBundle extends VoidDistributionService {
    public static final String SIGN_RELEASE_BUNDLE_ENDPOINT = "api/v1/release_bundle";
    public final String gpgPassphrase;
    public final String name;
    public final String storingRepository;
    public final String version;

    public SignReleaseBundle(String str, String str2, String str3, String str4, Log log) {
        super(log);
        this.name = str;
        this.version = str2;
        this.storingRepository = str4;
        this.gpgPassphrase = str3;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void ensureRequirements(JFrogHttpClient jFrogHttpClient) throws IOException {
        if (StringUtils.isBlank(this.name)) {
            throw new IOException("Release bundle name is mandatory");
        }
        if (StringUtils.isBlank(this.version)) {
            throw new IOException("Release bundle version is mandatory");
        }
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() throws IOException {
        HttpPost httpPost = new HttpPost(String.format("%s/%s/%s/sign", "api/v1/release_bundle", this.name, this.version));
        httpPost.setHeader("Accept", " application/json");
        if (StringUtils.isNotBlank(this.gpgPassphrase)) {
            httpPost.setHeader("X-GPG-PASSPHRASE", this.gpgPassphrase);
        }
        StringEntity stringEntity = new StringEntity(JsonUtils.toJsonString(new SignReleaseBundleRequest(this.storingRepository)));
        stringEntity.setContentType("application/json");
        httpPost.setEntity(stringEntity);
        return httpPost;
    }
}
