package org.jfrog.build.extractor.clientConfiguration.client.distribution.services;

import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.clientConfiguration.client.JFrogService;

/* loaded from: classes5.dex */
public class Version extends JFrogService<org.jfrog.build.client.Version> {
    public static final String SYSTEM_INFO_REST_URL = "api/v1/system/info";

    public Version(Log log) {
        super(log);
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() {
        return new HttpGet(SYSTEM_INFO_REST_URL);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [TResult, org.jfrog.build.client.Version] */
    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void setResponse(InputStream inputStream) throws IOException {
        JsonNode tree = getMapper().readTree(inputStream);
        this.log.debug("System Info result: " + tree);
        this.result = new org.jfrog.build.client.Version(tree.get("version").asText());
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [TResult, org.jfrog.build.client.Version] */
    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void handleUnsuccessfulResponse(HttpEntity httpEntity) throws UnsupportedOperationException, IOException {
        if (this.statusCode == 404) {
            this.result = org.jfrog.build.client.Version.NOT_FOUND;
        } else {
            JFrogService.throwException(httpEntity, getStatusCode());
        }
    }
}
