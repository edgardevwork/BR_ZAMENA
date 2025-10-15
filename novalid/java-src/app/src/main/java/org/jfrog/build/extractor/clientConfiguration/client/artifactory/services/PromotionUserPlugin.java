package org.jfrog.build.extractor.clientConfiguration.client.artifactory.services;

import java.io.IOException;
import java.util.Map;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.UrlUtils;
import org.jfrog.build.extractor.clientConfiguration.client.JFrogService;
import org.jfrog.build.extractor.clientConfiguration.client.VoidJFrogService;

/* loaded from: classes7.dex */
public class PromotionUserPlugin extends VoidJFrogService {
    public static final String PROMOTION_USER_PLUGIN_ENDPOINT = "/api/plugins/build/promote/";
    public final String buildName;
    public final String buildNumber;
    public final String promotionName;
    public final Map<String, String> requestParams;

    public PromotionUserPlugin(String str, String str2, String str3, Map<String, String> map, Log log) {
        super(log);
        this.promotionName = str;
        this.buildName = str2;
        this.buildNumber = str3;
        this.requestParams = map;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() throws IOException {
        StringBuilder sb = new StringBuilder(PROMOTION_USER_PLUGIN_ENDPOINT);
        sb.append(this.promotionName);
        sb.append("/");
        sb.append(UrlUtils.encodeUrlPathPart(this.buildName));
        sb.append("/");
        sb.append(UrlUtils.encodeUrlPathPart(this.buildNumber));
        sb.append("?");
        UrlUtils.appendParamsToUrl(this.requestParams, sb);
        return new HttpPost(sb.toString());
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void handleUnsuccessfulResponse(HttpEntity httpEntity) throws UnsupportedOperationException, IOException {
        this.log.error("Failed to promote user plugin.");
        JFrogService.throwException(httpEntity, this.statusCode);
    }
}
