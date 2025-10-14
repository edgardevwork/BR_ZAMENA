package org.jfrog.build.extractor.clientConfiguration.client.artifactory.services;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.UrlUtils;
import org.jfrog.build.extractor.clientConfiguration.client.JFrogService;
import org.jfrog.build.extractor.clientConfiguration.client.response.GetAllBuildNumbersResponse;

/* loaded from: classes5.dex */
public class GetAllBuildNumbers extends JFrogService<GetAllBuildNumbersResponse> {
    public final String buildName;
    public final String project;

    public GetAllBuildNumbers(String str, String str2, Log log) {
        super(log);
        this.buildName = str;
        this.project = str2;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() {
        return new HttpGet(String.format("%s/%s%s", DistributeBuild.BUILD_REST_URL, UrlUtils.encodeUrlPathPart(this.buildName), UrlUtils.getProjectQueryParam(this.project)));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [TResult, java.lang.Object] */
    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void setResponse(InputStream inputStream) throws IOException {
        this.result = getMapper().readValue(inputStream, GetAllBuildNumbersResponse.class);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [TResult, org.jfrog.build.extractor.clientConfiguration.client.response.GetAllBuildNumbersResponse] */
    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void handleUnsuccessfulResponse(HttpEntity httpEntity) throws UnsupportedOperationException, IOException {
        if (this.statusCode == 404) {
            this.result = new GetAllBuildNumbersResponse();
        } else {
            JFrogService.throwException(httpEntity, getStatusCode());
        }
    }
}
