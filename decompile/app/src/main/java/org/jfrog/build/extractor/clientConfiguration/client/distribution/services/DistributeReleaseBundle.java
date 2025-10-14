package org.jfrog.build.extractor.clientConfiguration.client.distribution.services;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.client.JFrogHttpClient;
import org.jfrog.build.extractor.clientConfiguration.client.JFrogService;
import org.jfrog.build.extractor.clientConfiguration.client.distribution.request.DistributeReleaseBundleRequest;
import org.jfrog.build.extractor.clientConfiguration.client.distribution.response.DistributeReleaseBundleResponse;
import org.jfrog.build.extractor.clientConfiguration.client.distribution.response.DistributionStatusResponse;
import org.jfrog.build.extractor.clientConfiguration.util.JsonUtils;

/* loaded from: classes5.dex */
public class DistributeReleaseBundle extends JFrogService<DistributeReleaseBundleResponse> {
    public static final int DEFAULT_MAX_WAIT_MINUTES = 60;
    public static final int DEFAULT_SYNC_SLEEP_INTERVAL = 10;
    public static final String DISTRIBUTE_RELEASE_BUNDLE_ENDPOINT = "api/v1/distribution";
    public final String name;
    public final DistributeReleaseBundleRequest request;
    public final boolean sync;
    public final String version;

    public DistributeReleaseBundle(String str, String str2, boolean z, DistributeReleaseBundleRequest distributeReleaseBundleRequest, Log log) {
        super(log);
        this.sync = z;
        this.name = str;
        this.version = str2;
        this.request = distributeReleaseBundleRequest;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void ensureRequirements(JFrogHttpClient jFrogHttpClient) throws IOException {
        if (this.request == null) {
            throw new IOException("DistributeReleaseBundleRequest parameter is mandatory");
        }
        if (StringUtils.isBlank(this.name)) {
            throw new IOException("Release bundle name is mandatory");
        }
        if (StringUtils.isBlank(this.version)) {
            throw new IOException("Release bundle version is mandatory");
        }
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() throws IOException {
        HttpPost httpPost = new HttpPost(String.format("%s/%s/%s", "api/v1/distribution", this.name, this.version));
        httpPost.setHeader("Accept", " application/json");
        StringEntity stringEntity = new StringEntity(JsonUtils.toJsonString(this.request));
        stringEntity.setContentType("application/json");
        httpPost.setEntity(stringEntity);
        return httpPost;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public DistributeReleaseBundleResponse execute(JFrogHttpClient jFrogHttpClient) throws InterruptedException, IOException {
        String str;
        Log log = this.log;
        if (this.request.isDryRun()) {
            str = "[Dry run] ";
        } else {
            str = "Distributing " + this.name + " / " + this.version;
        }
        log.info(str);
        super.execute(jFrogHttpClient);
        if (this.sync && !this.request.isDryRun()) {
            waitForDistribution(jFrogHttpClient);
        }
        return (DistributeReleaseBundleResponse) this.result;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [TResult, java.lang.Object] */
    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void setResponse(InputStream inputStream) throws IOException {
        this.result = getMapper().readValue(inputStream, DistributeReleaseBundleResponse.class);
        this.log.debug("Distribution response: " + getStatusCode());
        this.log.debug("Response:  " + JsonUtils.toJsonString(this.result));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void waitForDistribution(JFrogHttpClient jFrogHttpClient) throws InterruptedException, IOException {
        GetDistributionStatus getDistributionStatus = new GetDistributionStatus(this.name, this.version, ((DistributeReleaseBundleResponse) this.result).getTrackerId(), this.log);
        for (int i = 0; i < 3600; i += 10) {
            if (i % 60 == 0) {
                this.log.info(String.format("Sync: Distributing %s/%s...", this.name, this.version));
            }
            DistributionStatusResponse distributionStatusResponseExecute = getDistributionStatus.execute(jFrogHttpClient);
            if (distributionStatusResponseExecute.getStatus().equalsIgnoreCase("Failed")) {
                throw new IOException("JFrog service failed. Received " + this.statusCode + ": " + JsonUtils.toJsonString(distributionStatusResponseExecute));
            }
            if (distributionStatusResponseExecute.getStatus().equalsIgnoreCase("Completed")) {
                this.log.info("Distribution Completed!");
                return;
            }
            try {
                TimeUnit.SECONDS.sleep(10L);
            } catch (InterruptedException e) {
                throw new IOException("Fail to wait for Distribution sync", e);
            }
        }
        throw new IOException("Timeout for sync distribution");
    }
}
