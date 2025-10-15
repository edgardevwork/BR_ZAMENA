package org.jfrog.build.extractor.clientConfiguration.client.artifactory.services;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.FileEntity;
import org.apache.http.protocol.HTTP;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.client.ArtifactoryUploadResponse;
import org.jfrog.build.client.ArtifactoryVersion;
import org.jfrog.build.client.JFrogHttpClient;
import org.jfrog.build.extractor.clientConfiguration.client.JFrogService;
import org.jfrog.build.extractor.clientConfiguration.deploy.DeployDetails;
import org.jfrog.build.extractor.clientConfiguration.util.DeploymentUrlUtils;

/* loaded from: classes5.dex */
public class Upload extends JFrogService<ArtifactoryUploadResponse> {
    public static final String CHECKSUM_DEPLOY_HEADER_NAME = "X-Checksum-Deploy";
    public static final String EXPLODE_HEADER_NAME = "X-Explode-Archive";
    public static final String MD5_HEADER_NAME = "X-Checksum-Md5";
    public static final String SHA1_HEADER_NAME = "X-Checksum-Sha1";
    public final DeployDetails details;
    public boolean isExplode;
    public final String logPrefix;
    public final Integer minChecksumDeploySizeKb;

    public Upload(DeployDetails deployDetails, String str, Integer num, Log log) {
        String str2;
        super(log);
        this.minChecksumDeploySizeKb = num;
        this.details = deployDetails;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str + " ";
        }
        this.logPrefix = str2;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() throws IOException {
        HttpPut httpPutCreateHttpPutMethod = createHttpPutMethod(this.details);
        httpPutCreateHttpPutMethod.addHeader("Expect", HTTP.EXPECT_CONTINUE);
        if (this.details.isExplode()) {
            this.isExplode = true;
            httpPutCreateHttpPutMethod.addHeader(EXPLODE_HEADER_NAME, "true");
        }
        httpPutCreateHttpPutMethod.setEntity(new FileEntity(this.details.getFile(), "binary/octet-stream"));
        return httpPutCreateHttpPutMethod;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void handleUnsuccessfulResponse(HttpEntity httpEntity) throws UnsupportedOperationException, IOException {
        this.log.error("Failed to upload file");
        JFrogService.throwException(httpEntity, getStatusCode());
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [TResult, java.lang.Object] */
    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void setResponse(InputStream inputStream) throws IOException {
        if (this.isExplode) {
            return;
        }
        this.result = getMapper().readValue(inputStream, ArtifactoryUploadResponse.class);
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public ArtifactoryUploadResponse execute(JFrogHttpClient jFrogHttpClient) throws IOException {
        this.log.info(this.logPrefix + "Deploying artifact: " + jFrogHttpClient.getUrl() + "/" + StringUtils.removeStart(buildDefaultUploadPath(this.details), "/"));
        ArtifactoryUploadResponse artifactoryUploadResponseTryChecksumUpload = tryChecksumUpload(jFrogHttpClient);
        return artifactoryUploadResponseTryChecksumUpload != null ? artifactoryUploadResponseTryChecksumUpload : (ArtifactoryUploadResponse) super.execute(jFrogHttpClient);
    }

    public final ArtifactoryUploadResponse tryChecksumUpload(JFrogHttpClient jFrogHttpClient) {
        try {
            return new TryChecksumUpload(this.details, this.logPrefix, this.minChecksumDeploySizeKb, this.log).execute(jFrogHttpClient);
        } catch (IOException unused) {
            this.log.debug("Failed artifact checksum deploy of file " + this.details.getArtifactPath() + " : " + this.details.getSha1());
            return null;
        }
    }

    public final HttpPut createHttpPutMethod(DeployDetails deployDetails) throws IOException {
        HttpPut httpPut = new HttpPut(buildDefaultUploadPath(deployDetails) + DeploymentUrlUtils.buildMatrixParamsString(deployDetails.getProperties(), true));
        httpPut.addHeader(SHA1_HEADER_NAME, deployDetails.getSha1());
        httpPut.addHeader(MD5_HEADER_NAME, deployDetails.getMd5());
        this.log.debug("Full Artifact Http path: " + httpPut + "\n@Http Headers: " + Arrays.toString(httpPut.getAllHeaders()));
        return httpPut;
    }

    public final String buildDefaultUploadPath(DeployDetails deployDetails) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DeploymentUrlUtils.encodePath(deployDetails.getTargetRepository()));
        arrayList.add(DeploymentUrlUtils.encodePath(deployDetails.getArtifactPath()));
        return StringUtils.join(arrayList, "/");
    }

    public class TryChecksumUpload extends JFrogService<ArtifactoryUploadResponse> {
        public final DeployDetails details;
        public final String logPrefix;
        public final Integer minChecksumDeploySizeKb;

        public /* synthetic */ TryChecksumUpload(Upload upload, DeployDetails deployDetails, String str, Integer num, Log log, C112971 c112971) {
            this(deployDetails, str, num, log);
        }

        public TryChecksumUpload(DeployDetails deployDetails, String str, Integer num, Log log) {
            super(log);
            this.details = deployDetails;
            this.logPrefix = str;
            this.minChecksumDeploySizeKb = Integer.valueOf(num != null ? num.intValue() : 10);
        }

        @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
        public void ensureRequirements(JFrogHttpClient jFrogHttpClient) throws IOException {
            if (!new Version(this.log).execute(jFrogHttpClient).isAtLeast(new ArtifactoryVersion("2.5.1"))) {
                throw new IOException("Artifactory below 2.5.0 doesnt have efficient checksum deployment");
            }
        }

        @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
        public HttpRequestBase createRequest() throws IOException {
            long length = this.details.getFile().length();
            if (length < this.minChecksumDeploySizeKb.intValue() * 1024) {
                this.log.debug("Skipping checksum deploy of file size " + length + " bytes, falling back to regular deployment.");
                throw new IOException();
            }
            if (!this.details.isExplode()) {
                HttpPut httpPutCreateHttpPutMethod = Upload.this.createHttpPutMethod(this.details);
                httpPutCreateHttpPutMethod.addHeader(Upload.CHECKSUM_DEPLOY_HEADER_NAME, "true");
                return httpPutCreateHttpPutMethod;
            }
            this.log.debug("Skipping checksum deploy due to explode file request.");
            throw new IOException();
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [TResult, java.lang.Object] */
        @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
        public void setResponse(InputStream inputStream) throws IOException {
            this.result = getMapper().readValue(inputStream, ArtifactoryUploadResponse.class);
        }
    }
}
