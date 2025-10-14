package org.jfrog.build.extractor.clientConfiguration.client.access.services;

import java.io.IOException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.clientConfiguration.client.VoidJFrogService;

/* loaded from: classes5.dex */
public class CreateProject extends VoidJFrogService {
    public final String projectJsonConfig;

    public CreateProject(String str, Log log) {
        super(log);
        this.projectJsonConfig = str;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() throws IOException {
        HttpPost httpPost = new HttpPost(Utils.PROJECTS_ENDPOINT);
        httpPost.setEntity(new StringEntity(this.projectJsonConfig, ContentType.APPLICATION_JSON));
        return httpPost;
    }
}
