package org.jfrog.build.extractor.clientConfiguration.client.artifactory.services;

import java.io.IOException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.jfrog.build.api.BuildRetention;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.UrlUtils;
import org.jfrog.build.extractor.clientConfiguration.client.VoidJFrogService;
import org.jfrog.build.extractor.clientConfiguration.util.JsonUtils;

/* loaded from: classes7.dex */
public class SendBuildRetention extends VoidJFrogService {
    public static final String RETENTION_REST_URL = "api/build/retention/";
    public final boolean async;
    public final String buildName;
    public final BuildRetention buildRetention;
    public final String project;

    public SendBuildRetention(org.jfrog.build.extractor.p065ci.BuildRetention buildRetention, String str, String str2, boolean z, Log log) {
        super(log);
        this.buildRetention = buildRetention.ToBuildRetention();
        this.buildName = UrlUtils.encodeUrlPathPart(str);
        this.project = str2;
        this.async = z;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() throws IOException {
        this.log.info(createBuildRetentionLogMsg(this.buildRetention, this.async));
        String jsonString = JsonUtils.toJsonString(this.buildRetention);
        this.log.debug(jsonString);
        String str = RETENTION_REST_URL + this.buildName + "?async=" + this.async + UrlUtils.getProjectQueryParam(this.project, "&project=");
        StringEntity stringEntity = new StringEntity(jsonString, "UTF-8");
        stringEntity.setContentType("application/json");
        HttpPost httpPost = new HttpPost(str);
        httpPost.setEntity(stringEntity);
        return httpPost;
    }

    public final String createBuildRetentionLogMsg(BuildRetention buildRetention, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("Sending");
        if (z) {
            sb.append(" async");
        }
        sb.append(" request for build retention");
        if (buildRetention.isDeleteBuildArtifacts()) {
            sb.append(", deleting build artifacts");
        }
        if (buildRetention.getCount() != -1) {
            sb.append(", max number of builds to store: ");
            sb.append(buildRetention.getCount());
        }
        if (buildRetention.getMinimumBuildDate() != null) {
            sb.append(", min build date: ");
            sb.append(buildRetention.getMinimumBuildDate());
        }
        if (!buildRetention.getBuildNumbersNotToBeDiscarded().isEmpty()) {
            sb.append(", build numbers not to be discarded: ");
            sb.append(buildRetention.getBuildNumbersNotToBeDiscarded());
        }
        sb.append(".");
        return sb.toString();
    }
}
