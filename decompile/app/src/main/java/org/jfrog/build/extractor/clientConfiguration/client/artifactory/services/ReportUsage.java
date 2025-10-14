package org.jfrog.build.extractor.clientConfiguration.client.artifactory.services;

import java.io.IOException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.client.ArtifactoryVersion;
import org.jfrog.build.client.JFrogHttpClient;
import org.jfrog.build.extractor.clientConfiguration.client.VoidJFrogService;
import org.jfrog.build.extractor.clientConfiguration.util.JsonSerializer;
import org.jfrog.build.extractor.usageReport.UsageReporter;

/* loaded from: classes7.dex */
public class ReportUsage extends VoidJFrogService {
    public static final String USAGE_API = "api/system/usage";
    public static final ArtifactoryVersion USAGE_ARTIFACTORY_MIN_VERSION = new ArtifactoryVersion("6.9.0");
    public final UsageReporter usageReporter;

    public ReportUsage(UsageReporter usageReporter, Log log) {
        super(log);
        this.usageReporter = usageReporter;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() throws IOException {
        StringEntity stringEntity = new StringEntity(new JsonSerializer().toJSON(this.usageReporter), "UTF-8");
        stringEntity.setContentType("application/json");
        HttpPost httpPost = new HttpPost(USAGE_API);
        httpPost.setEntity(stringEntity);
        return httpPost;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public Void execute(JFrogHttpClient jFrogHttpClient) throws IOException {
        ArtifactoryVersion artifactoryVersionExecute = new Version(this.log).execute(jFrogHttpClient);
        if (artifactoryVersionExecute.isNotFound()) {
            throw new IOException("Could not get Artifactory version.");
        }
        if (!artifactoryVersionExecute.isAtLeast(USAGE_ARTIFACTORY_MIN_VERSION)) {
            this.log.debug("Usage report is not supported on targeted Artifactory server.");
            return null;
        }
        return (Void) super.execute(jFrogHttpClient);
    }
}
