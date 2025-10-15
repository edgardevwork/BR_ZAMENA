package org.jfrog.build.extractor.clientConfiguration.client.access.services;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import org.apache.commons.p059io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.UrlUtils;
import org.jfrog.build.extractor.clientConfiguration.client.JFrogService;

/* loaded from: classes5.dex */
public class GetProject extends JFrogService<String> {
    public final String projectKey;

    public GetProject(String str, Log log) {
        super(log);
        this.projectKey = str;
        this.result = "";
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() throws IOException {
        return new HttpGet("api/v1/projects/" + UrlUtils.encodeUrlPathPart(this.projectKey));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [TResult, java.lang.String] */
    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void setResponse(InputStream inputStream) throws IOException {
        this.result = IOUtils.toString(inputStream, StandardCharsets.UTF_8.name());
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void handleUnsuccessfulResponse(HttpEntity httpEntity) throws UnsupportedOperationException, IOException {
        this.log.error("Failed get project with key: '" + this.projectKey + "'.");
        JFrogService.throwException(httpEntity, getStatusCode());
    }
}
