package org.jfrog.build.extractor.clientConfiguration.client.access.services;

import java.io.IOException;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.UrlUtils;
import org.jfrog.build.extractor.clientConfiguration.client.VoidJFrogService;

/* loaded from: classes5.dex */
public class UpdateProject extends VoidJFrogService {
    public final String projectJsonConfig;
    public final String projectKey;

    public UpdateProject(String str, String str2, Log log) {
        super(log);
        this.projectKey = str;
        this.projectJsonConfig = str2;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() throws IOException {
        HttpPut httpPut = new HttpPut("api/v1/projects/" + UrlUtils.encodeUrlPathPart(this.projectKey));
        httpPut.setEntity(new StringEntity(this.projectJsonConfig, ContentType.APPLICATION_JSON));
        return httpPut;
    }
}
