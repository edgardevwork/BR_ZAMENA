package org.jfrog.build.extractor.clientConfiguration.client.artifactory.services;

import java.io.IOException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.clientConfiguration.client.VoidJFrogService;
import org.jfrog.build.extractor.clientConfiguration.client.request.DeleteBuildsRequest;
import org.jfrog.build.extractor.clientConfiguration.util.JsonUtils;

/* loaded from: classes5.dex */
public class DeleteBuilds extends VoidJFrogService {
    public static final String DELETE_BUILDS_ENDPOINT = "api/build/delete";
    public final DeleteBuildsRequest deleteBuildsRequest;

    public DeleteBuilds(String str, String str2, boolean z, Log log) {
        super(log);
        this.deleteBuildsRequest = new DeleteBuildsRequest(str, str2, z);
    }

    public DeleteBuilds(String str, String str2, String[] strArr, boolean z, Log log) {
        super(log);
        this.deleteBuildsRequest = new DeleteBuildsRequest(str, strArr, str2, z);
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() throws IOException {
        HttpPost httpPost = new HttpPost(DELETE_BUILDS_ENDPOINT);
        StringEntity stringEntity = new StringEntity(JsonUtils.toJsonString(this.deleteBuildsRequest));
        stringEntity.setContentType("application/json");
        httpPost.setEntity(stringEntity);
        return httpPost;
    }
}
