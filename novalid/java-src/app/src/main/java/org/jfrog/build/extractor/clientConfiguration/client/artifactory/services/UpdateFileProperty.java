package org.jfrog.build.extractor.clientConfiguration.client.artifactory.services;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.UrlUtils;
import org.jfrog.build.extractor.clientConfiguration.client.JFrogService;
import org.jfrog.build.extractor.clientConfiguration.client.VoidJFrogService;

/* loaded from: classes7.dex */
public class UpdateFileProperty extends VoidJFrogService {
    public static final String UPDATE_FILE_PROPERTY_ENDPOINT = "api/storage/";
    public final String itemPath;
    public final String properties;

    public UpdateFileProperty(String str, String str2, Log log) {
        super(log);
        this.itemPath = str;
        this.properties = str2;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() throws IOException {
        return new HttpPut("api/storage/" + UrlUtils.encodeUrl(this.itemPath) + "?properties=" + UrlUtils.encodeUrl(this.properties));
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void handleUnsuccessfulResponse(HttpEntity httpEntity) throws UnsupportedOperationException, IOException {
        this.log.error("Failed while trying to set properties on docker layer.");
        JFrogService.throwException(httpEntity, getStatusCode());
    }
}
