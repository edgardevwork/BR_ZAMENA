package org.jfrog.build.extractor.clientConfiguration.client.artifactory.services;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.clientConfiguration.client.JFrogService;

/* loaded from: classes5.dex */
public class GetNpmAuth extends JFrogService<Properties> {
    public static final String GET_NPM_AUTH_ENDPOINT = "api/npm/auth";

    public GetNpmAuth(Log log) {
        super(log);
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() throws IOException {
        return new HttpGet(GET_NPM_AUTH_ENDPOINT);
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void handleUnsuccessfulResponse(HttpEntity httpEntity) throws UnsupportedOperationException, IOException {
        this.log.error("npm Auth request failed");
        JFrogService.throwException(httpEntity, getStatusCode());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [TResult, java.util.Properties] */
    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void setResponse(InputStream inputStream) throws IOException {
        ?? properties = new Properties();
        this.result = properties;
        properties.load(inputStream);
    }
}
