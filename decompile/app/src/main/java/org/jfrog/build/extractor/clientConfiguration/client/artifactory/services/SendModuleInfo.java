package org.jfrog.build.extractor.clientConfiguration.client.artifactory.services;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.jfrog.build.api.Build;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.UrlUtils;
import org.jfrog.build.extractor.clientConfiguration.client.JFrogService;
import org.jfrog.build.extractor.clientConfiguration.client.VoidJFrogService;
import org.jfrog.build.extractor.clientConfiguration.util.JsonUtils;
import org.jfrog.build.extractor.p065ci.BuildInfo;

/* loaded from: classes7.dex */
public class SendModuleInfo extends VoidJFrogService {
    public static final String APPLICATION_VND_ORG_JFROG_ARTIFACTORY_JSON = "application/vnd.org.jfrog.artifactory+json";
    public static final String SEND_MODULE_INFO_ENDPOINT = "/api/build/append/";
    public final Build build;

    public SendModuleInfo(BuildInfo buildInfo, Log log) {
        super(log);
        this.build = buildInfo.ToBuild();
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() throws IOException {
        HttpPost httpPost = new HttpPost(SEND_MODULE_INFO_ENDPOINT + UrlUtils.encodeUrlPathPart(this.build.getName()) + "/" + UrlUtils.encodeUrlPathPart(this.build.getNumber()) + UrlUtils.getProjectQueryParam(this.build.getProject()));
        StringEntity stringEntity = new StringEntity(JsonUtils.toJsonString(this.build.getModules()), "UTF-8");
        stringEntity.setContentType(APPLICATION_VND_ORG_JFROG_ARTIFACTORY_JSON);
        httpPost.setEntity(stringEntity);
        this.log.info("Deploying build-info descriptor to: " + httpPost.getURI().toString());
        return httpPost;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void handleUnsuccessfulResponse(HttpEntity httpEntity) throws UnsupportedOperationException, IOException {
        this.log.error("Could not publish build-info modules");
        JFrogService.throwException(httpEntity, getStatusCode());
    }
}
