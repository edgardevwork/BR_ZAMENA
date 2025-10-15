package org.jfrog.build.extractor.clientConfiguration.client.artifactory.services;

import java.io.IOException;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.jfrog.build.api.release.Promotion;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.client.JFrogHttpClient;
import org.jfrog.build.extractor.UrlUtils;
import org.jfrog.build.extractor.clientConfiguration.client.JFrogService;
import org.jfrog.build.extractor.clientConfiguration.client.VoidJFrogService;
import org.jfrog.build.extractor.clientConfiguration.util.JsonUtils;

/* loaded from: classes7.dex */
public class StageBuild extends VoidJFrogService {
    public static final String BUILD_STAGING_STRATEGY_ENDPOINT = "api/build/promote/";
    public final String buildName;
    public final String buildNumber;
    public final String project;
    public final Promotion promotion;

    public StageBuild(String str, String str2, String str3, Promotion promotion, Log log) {
        super(log);
        this.buildName = str;
        this.buildNumber = str2;
        this.project = str3;
        this.promotion = promotion;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() throws IOException {
        HttpPost httpPost = new HttpPost(String.format("%s%s/%s%s", BUILD_STAGING_STRATEGY_ENDPOINT, UrlUtils.encodeUrlPathPart(this.buildName), UrlUtils.encodeUrlPathPart(this.buildNumber), UrlUtils.getProjectQueryParam(this.project)));
        StringEntity stringEntity = new StringEntity(JsonUtils.toJsonString(this.promotion));
        stringEntity.setContentType("application/vnd.org.jfrog.artifactory.build.PromotionRequest+json");
        httpPost.setEntity(stringEntity);
        String str = String.format("Promotion build %s, #%s", this.buildName, this.buildNumber);
        if (StringUtils.isNotBlank(this.project)) {
            str = str + ", in project " + this.project;
        }
        this.log.info(str);
        return httpPost;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void handleUnsuccessfulResponse(HttpEntity httpEntity) throws UnsupportedOperationException, IOException {
        this.log.error("Promotion failed.");
        JFrogService.throwException(httpEntity, getStatusCode());
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void ensureRequirements(JFrogHttpClient jFrogHttpClient) {
        if (StringUtils.isBlank(this.buildName)) {
            throw new IllegalArgumentException("Build name is required for promotion.");
        }
        if (StringUtils.isBlank(this.buildNumber)) {
            throw new IllegalArgumentException("Build number is required for promotion.");
        }
    }
}
