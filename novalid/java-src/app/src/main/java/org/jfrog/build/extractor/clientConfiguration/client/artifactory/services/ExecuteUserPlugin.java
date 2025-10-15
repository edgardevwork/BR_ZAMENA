package org.jfrog.build.extractor.clientConfiguration.client.artifactory.services;

import java.io.IOException;
import java.util.Map;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.UrlUtils;
import org.jfrog.build.extractor.clientConfiguration.client.JFrogService;
import org.jfrog.build.extractor.clientConfiguration.client.VoidJFrogService;

/* loaded from: classes7.dex */
public class ExecuteUserPlugin extends VoidJFrogService {
    public static final String EXECUTE_USER_PLUGIN_ENDPOINT = "api/plugins/execute/";
    public final String executionName;
    public final Map<String, String> requestParams;

    public ExecuteUserPlugin(String str, Map<String, String> map, Log log) {
        super(log);
        this.executionName = str;
        this.requestParams = map;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() throws IOException {
        StringBuilder sb = new StringBuilder(EXECUTE_USER_PLUGIN_ENDPOINT);
        sb.append(this.executionName);
        sb.append("?");
        UrlUtils.appendParamsToUrl(this.requestParams, sb);
        return new HttpPost(sb.toString());
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void handleUnsuccessfulResponse(HttpEntity httpEntity) throws UnsupportedOperationException, IOException {
        this.log.error("Failed to execute user plugin.");
        JFrogService.throwException(httpEntity, getStatusCode());
    }
}
