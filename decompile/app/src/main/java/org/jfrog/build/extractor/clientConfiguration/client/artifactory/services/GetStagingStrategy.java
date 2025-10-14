package org.jfrog.build.extractor.clientConfiguration.client.artifactory.services;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.UrlUtils;
import org.jfrog.build.extractor.clientConfiguration.client.JFrogService;

/* loaded from: classes5.dex */
public class GetStagingStrategy extends JFrogService<Map> {
    public static final String BUILD_STAGING_STRATEGY_ENDPOINT = "api/plugins/build/staging/";
    public final String buildName;
    public final Map<String, String> requestParams;
    public final String strategyName;

    /* JADX WARN: Type inference failed for: r1v1, types: [TResult, java.util.HashMap] */
    public GetStagingStrategy(String str, String str2, Map<String, String> map, Log log) {
        super(log);
        this.strategyName = str;
        this.buildName = str2;
        this.requestParams = map;
        this.result = new HashMap();
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() throws IOException {
        StringBuilder sb = new StringBuilder(BUILD_STAGING_STRATEGY_ENDPOINT);
        sb.append(UrlUtils.encodeUrlPathPart(this.strategyName));
        sb.append("?buildName=");
        sb.append(UrlUtils.encodeUrl(this.buildName));
        sb.append("&");
        UrlUtils.appendParamsToUrl(this.requestParams, sb);
        return new HttpGet(sb.toString());
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void handleUnsuccessfulResponse(HttpEntity httpEntity) throws UnsupportedOperationException, IOException {
        this.log.error("Failed to obtain staging strategy.");
        JFrogService.throwException(httpEntity, getStatusCode());
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [TResult, java.lang.Object] */
    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void setResponse(InputStream inputStream) throws IOException {
        this.result = getMapper().readValue(inputStream, Map.class);
    }
}
