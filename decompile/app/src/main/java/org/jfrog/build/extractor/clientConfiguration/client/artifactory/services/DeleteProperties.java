package org.jfrog.build.extractor.clientConfiguration.client.artifactory.services;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpRequestBase;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.UrlUtils;
import org.jfrog.build.extractor.clientConfiguration.client.JFrogService;
import org.jfrog.build.extractor.clientConfiguration.client.VoidJFrogService;

/* loaded from: classes7.dex */
public class DeleteProperties extends VoidJFrogService {
    public static final String DELETE_PROPERTIES_ENDPOINT = "api/storage/";
    public final String properties;
    public final String relativePath;

    public DeleteProperties(String str, String str2, Log log) {
        super(log);
        this.relativePath = str;
        this.properties = str2;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() throws IOException {
        return new HttpDelete("api/storage/" + UrlUtils.encodeUrl(this.relativePath) + "?properties=" + UrlUtils.encodeUrl(this.properties));
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void handleUnsuccessfulResponse(HttpEntity httpEntity) throws UnsupportedOperationException, IOException {
        this.log.error("Failed to delete properties to '" + this.relativePath + "'");
        JFrogService.throwException(httpEntity, getStatusCode());
    }
}
