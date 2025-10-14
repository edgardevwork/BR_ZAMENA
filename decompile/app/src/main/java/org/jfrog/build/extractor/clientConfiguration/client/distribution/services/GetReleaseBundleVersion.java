package org.jfrog.build.extractor.clientConfiguration.client.distribution.services;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.client.JFrogHttpClient;
import org.jfrog.build.extractor.clientConfiguration.client.JFrogService;
import org.jfrog.build.extractor.clientConfiguration.client.distribution.response.GetReleaseBundleStatusResponse;

/* loaded from: classes5.dex */
public class GetReleaseBundleVersion extends JFrogService<GetReleaseBundleStatusResponse> {
    public static final String CREAT_RELEASE_BUNDLE_ENDPOINT = "api/v1/release_bundle";
    public final String name;
    public final String version;

    public GetReleaseBundleVersion(String str, String str2, Log log) {
        super(log);
        this.name = str;
        this.version = str2;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() throws IOException {
        return new HttpGet(createUrl());
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

    /* JADX WARN: Type inference failed for: r3v1, types: [TResult, java.lang.Object] */
    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void setResponse(InputStream inputStream) throws IOException {
        this.result = getMapper().readValue(inputStream, GetReleaseBundleStatusResponse.class);
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void handleUnsuccessfulResponse(HttpEntity httpEntity) throws UnsupportedOperationException, IOException {
        if (getStatusCode() == 404) {
            return;
        }
        super.handleUnsuccessfulResponse(httpEntity);
    }

    private String createUrl() {
        return String.format("%s/%s/%s", "api/v1/release_bundle", this.name, this.version);
    }
}
