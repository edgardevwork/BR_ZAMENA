package org.jfrog.build.extractor.clientConfiguration.client.artifactory.services;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpRequestBase;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.UrlUtils;
import org.jfrog.build.extractor.clientConfiguration.client.JFrogService;
import org.jfrog.build.extractor.clientConfiguration.client.VoidJFrogService;

/* loaded from: classes7.dex */
public class DeleteRepositoryContent extends VoidJFrogService {
    public final String repository;

    public DeleteRepositoryContent(String str, Log log) {
        super(log);
        this.repository = str;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() throws IOException {
        return new HttpDelete(UrlUtils.encodeUrlPathPart(this.repository));
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void handleUnsuccessfulResponse(HttpEntity httpEntity) throws UnsupportedOperationException, IOException {
        if (this.statusCode == 401) {
            throw new FileNotFoundException("Bad credentials");
        }
        JFrogService.throwException(httpEntity, getStatusCode());
    }
}
