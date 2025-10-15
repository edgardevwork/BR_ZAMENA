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
import org.jfrog.build.extractor.clientConfiguration.client.distribution.response.DistributionStatusResponse;

/* loaded from: classes5.dex */
public class GetDistributionStatus extends JFrogService<DistributionStatusResponse> {
    public static final String GET_STATUS_ENDPOINT = "api/v1/release_bundle";
    public final String name;
    public final String trackerId;
    public final String version;

    public GetDistributionStatus(String str, String str2, String str3, Log log) {
        super(log);
        this.name = str;
        this.version = str2;
        this.trackerId = str3;
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
        return new HttpGet(createUrl());
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [TResult, java.lang.Object] */
    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void setResponse(InputStream inputStream) throws IOException {
        this.result = getMapper().readValue(inputStream, DistributionStatusResponse.class);
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void handleUnsuccessfulResponse(HttpEntity httpEntity) throws UnsupportedOperationException, IOException {
        if (getStatusCode() == 404) {
            this.result = null;
        } else {
            super.handleUnsuccessfulResponse(httpEntity);
        }
    }

    public final String createUrl() {
        if (StringUtils.isEmpty(this.name)) {
            return "api/v1/release_bundle/distribution";
        }
        String str = "api/v1/release_bundle/" + this.name;
        if (StringUtils.isEmpty(this.version)) {
            return str + "/distribution";
        }
        String str2 = str + "/" + this.version + "/distribution";
        if (!StringUtils.isNotEmpty(this.trackerId)) {
            return str2;
        }
        return str2 + "/" + this.trackerId;
    }
}
