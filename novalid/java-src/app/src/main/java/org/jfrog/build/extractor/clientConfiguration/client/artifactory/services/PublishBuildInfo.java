package org.jfrog.build.extractor.clientConfiguration.client.artifactory.services;

import java.io.IOException;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.jfrog.build.api.Build;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.client.JFrogHttpClient;
import org.jfrog.build.extractor.BuildInfoExtractorUtils;
import org.jfrog.build.extractor.UrlUtils;
import org.jfrog.build.extractor.clientConfiguration.client.JFrogService;
import org.jfrog.build.extractor.clientConfiguration.client.VoidJFrogService;
import org.jfrog.build.extractor.clientConfiguration.util.JsonUtils;
import org.jfrog.build.extractor.p065ci.BuildInfo;

/* loaded from: classes7.dex */
public class PublishBuildInfo extends VoidJFrogService {
    public static final String BUILD_REST_URL = "/api/build";
    public final Build build;
    public String buildJson;
    public final String platformUrl;

    public PublishBuildInfo(BuildInfo buildInfo, String str, Log log) {
        super(log);
        this.build = buildInfo.ToBuild();
        this.platformUrl = str;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void handleUnsuccessfulResponse(HttpEntity httpEntity) throws UnsupportedOperationException, IOException {
        this.log.error("Could not build the build-info object.");
        JFrogService.throwException(httpEntity, getStatusCode());
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void ensureRequirements(JFrogHttpClient jFrogHttpClient) throws IOException {
        Build build = this.build;
        if (build == null) {
            return;
        }
        this.buildJson = JsonUtils.toJsonString(build);
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() {
        HttpPut httpPut = new HttpPut(BUILD_REST_URL + UrlUtils.getProjectQueryParam(this.build.getProject()));
        StringEntity stringEntity = new StringEntity(this.buildJson, "UTF-8");
        stringEntity.setContentType(SendModuleInfo.APPLICATION_VND_ORG_JFROG_ARTIFACTORY_JSON);
        httpPut.setEntity(stringEntity);
        this.log.info("Deploying build info...");
        return httpPut;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public Void execute(JFrogHttpClient jFrogHttpClient) throws IOException {
        super.execute(jFrogHttpClient);
        boolean zIsNotBlank = StringUtils.isNotBlank(this.platformUrl);
        String strCreateBuildInfoUrl = BuildInfoExtractorUtils.createBuildInfoUrl(zIsNotBlank ? this.platformUrl : jFrogHttpClient.getUrl(), this.build.getName(), this.build.getNumber(), String.valueOf(this.build.getStartedMillis()), this.build.getProject(), true, zIsNotBlank);
        if (StringUtils.isNotBlank(strCreateBuildInfoUrl)) {
            this.log.info("Build-info successfully deployed. Browse it in Artifactory under " + strCreateBuildInfoUrl);
        } else {
            this.log.debug("Couldn't create the build-info URL from Artifactory URL: " + jFrogHttpClient.getUrl());
            this.log.info("Build-info successfully deployed.");
        }
        return (Void) this.result;
    }
}
