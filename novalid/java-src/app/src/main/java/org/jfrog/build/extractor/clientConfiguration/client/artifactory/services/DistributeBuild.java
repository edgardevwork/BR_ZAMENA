package org.jfrog.build.extractor.clientConfiguration.client.artifactory.services;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.jfrog.build.api.release.Distribution;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.client.JFrogHttpClient;
import org.jfrog.build.extractor.UrlUtils;
import org.jfrog.build.extractor.clientConfiguration.client.JFrogService;
import org.jfrog.build.extractor.clientConfiguration.client.VoidJFrogService;
import org.jfrog.build.extractor.clientConfiguration.util.JsonUtils;

/* loaded from: classes7.dex */
public class DistributeBuild extends VoidJFrogService {
    public static final String BUILD_REST_URL = "api/build";
    public final String buildName;
    public final String buildNumber;
    public final Distribution promotion;

    public DistributeBuild(String str, String str2, Distribution distribution, Log log) {
        super(log);
        this.buildName = str;
        this.buildNumber = str2;
        this.promotion = distribution;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() throws IOException {
        HttpPost httpPost = new HttpPost("api/build/distribute/" + UrlUtils.encodeUrlPathPart(this.buildName) + "/" + UrlUtils.encodeUrlPathPart(this.buildNumber));
        StringEntity stringEntity = new StringEntity(JsonUtils.toJsonString(this.promotion));
        stringEntity.setContentType("application/json");
        httpPost.setEntity(stringEntity);
        this.log.info("Distributing build " + this.buildName + ", #" + this.buildNumber);
        return httpPost;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.VoidJFrogService, org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void setResponse(InputStream inputStream) throws IOException {
        this.log.info(String.format("Successfully distributed build %s/%s", this.buildName, this.buildNumber));
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void ensureRequirements(JFrogHttpClient jFrogHttpClient) {
        if (StringUtils.isBlank(this.buildName)) {
            throw new IllegalArgumentException("Build name is required for distribution.");
        }
        if (StringUtils.isBlank(this.buildNumber)) {
            throw new IllegalArgumentException("Build number is required for distribution.");
        }
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void handleUnsuccessfulResponse(HttpEntity httpEntity) throws UnsupportedOperationException, IOException {
        this.log.error("Distribution failed.");
        JFrogService.throwException(httpEntity, getStatusCode());
    }
}
