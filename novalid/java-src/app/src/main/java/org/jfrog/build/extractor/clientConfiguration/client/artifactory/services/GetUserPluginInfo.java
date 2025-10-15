package org.jfrog.build.extractor.clientConfiguration.client.artifactory.services;

import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.clientConfiguration.client.JFrogService;

/* loaded from: classes5.dex */
public class GetUserPluginInfo extends JFrogService<Map<String, List<Map>>> {
    public static final String USER_PLUGIN_ENDPOINT = "api/plugins/";

    /* JADX WARN: Type inference failed for: r1v1, types: [TResult, java.util.HashMap] */
    public GetUserPluginInfo(Log log) {
        super(log);
        this.result = new HashMap();
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() throws IOException {
        return new HttpGet(USER_PLUGIN_ENDPOINT);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [TResult, java.lang.Object] */
    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void setResponse(InputStream inputStream) throws IOException {
        this.result = getMapper().readValue(inputStream, TypeFactory.defaultInstance().constructMapType(Map.class, String.class, List.class));
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void handleUnsuccessfulResponse(HttpEntity httpEntity) throws UnsupportedOperationException, IOException {
        this.log.error("Failed to obtain user plugin information.");
        JFrogService.throwException(httpEntity, getStatusCode());
    }
}
