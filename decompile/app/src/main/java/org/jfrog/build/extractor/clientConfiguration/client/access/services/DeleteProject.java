package org.jfrog.build.extractor.clientConfiguration.client.access.services;

import java.io.IOException;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpRequestBase;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.UrlUtils;
import org.jfrog.build.extractor.clientConfiguration.client.VoidJFrogService;

/* loaded from: classes5.dex */
public class DeleteProject extends VoidJFrogService {
    public final String projectKey;

    public DeleteProject(String str, Log log) {
        super(log);
        this.projectKey = str;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() throws IOException {
        return new HttpDelete("api/v1/projects/" + UrlUtils.encodeUrlPathPart(this.projectKey));
    }
}
