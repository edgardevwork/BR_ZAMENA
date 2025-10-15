package org.jfrog.build.extractor.clientConfiguration.client.artifactory.services;

import java.io.IOException;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpRequestBase;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.UrlUtils;
import org.jfrog.build.extractor.clientConfiguration.client.VoidJFrogService;

/* loaded from: classes7.dex */
public class DeleteRepository extends VoidJFrogService {
    public static final String API_REPOSITORIES = "api/repositories/";
    public final String repository;

    public DeleteRepository(String str, Log log) {
        super(log);
        this.repository = str;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() throws IOException {
        return new HttpDelete("api/repositories/" + UrlUtils.encodeUrlPathPart(this.repository));
    }
}
