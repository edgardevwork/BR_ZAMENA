package org.jfrog.build.extractor.clientConfiguration.client.artifactory.services;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.jfrog.build.api.Build;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.UrlUtils;
import org.jfrog.build.extractor.clientConfiguration.client.JFrogService;
import org.jfrog.build.extractor.clientConfiguration.client.response.GetBuildInfoResponse;
import org.jfrog.build.extractor.p065ci.BuildInfo;

/* loaded from: classes5.dex */
public class GetBuildInfo extends JFrogService<BuildInfo> {
    public final String buildName;
    public final String buildNumber;
    public final String project;

    public GetBuildInfo(String str, String str2, String str3, Log log) {
        super(log);
        this.buildName = str;
        this.buildNumber = str2;
        this.project = str3;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() {
        return new HttpGet(String.format("%s/%s/%s%s", DistributeBuild.BUILD_REST_URL, UrlUtils.encodeUrlPathPart(this.buildName), UrlUtils.encodeUrlPathPart(this.buildNumber), UrlUtils.getProjectQueryParam(this.project)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void setResponse(InputStream inputStream) throws IOException {
        Build buildInfo = ((GetBuildInfoResponse) getMapper().readValue(inputStream, GetBuildInfoResponse.class)).getBuildInfo();
        this.result = buildInfo == null ? 0 : BuildInfo.ToBuildInfo(buildInfo);
    }
}
