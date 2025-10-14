package org.jfrog.build.extractor.clientConfiguration.client.artifactory.services;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.p059io.IOUtils;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.client.JFrogHttpClient;
import org.jfrog.build.client.artifactoryXrayResponse.ArtifactoryXrayResponse;
import org.jfrog.build.extractor.clientConfiguration.client.JFrogService;

/* loaded from: classes5.dex */
public class ScanBuild extends JFrogService<ArtifactoryXrayResponse> {
    public static final String SCAN_BUILD_URL = "api/xray/scanBuild";
    public static final String XRAY_FATAL_FAIL_STATUS = "-1";
    public static final int XRAY_SCAN_CONNECTION_TIMEOUT_SECS = 90;
    public static final int XRAY_SCAN_RETRY_CONSECUTIVE_RETRIES = 5;
    public static final int XRAY_SCAN_SLEEP_BETWEEN_RETRIES_MILLIS = 30000;
    public final String buildName;
    public final String buildNumber;
    public final String context;
    public final String project;
    public HttpPost request;

    public ScanBuild(String str, String str2, String str3, String str4, Log log) {
        super(log);
        this.buildName = str;
        this.buildNumber = str2;
        this.project = str3;
        this.context = str4;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() throws IOException {
        StringEntity stringEntity = new StringEntity(getXrayScanBody());
        stringEntity.setContentType("application/json");
        HttpPost httpPost = new HttpPost(SCAN_BUILD_URL);
        httpPost.addHeader("X-Accel-Buffering", "no");
        httpPost.setEntity(stringEntity);
        this.request = httpPost;
        return httpPost;
    }

    /* JADX WARN: Type inference failed for: r6v7, types: [TResult, java.lang.Object] */
    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void setResponse(InputStream inputStream) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        String string = IOUtils.toString(inputStream, StandardCharsets.UTF_8.name());
        try {
            JsonNode tree = objectMapper.readTree(string);
            if (tree == null) {
                throw new NullPointerException("Received empty content from Artifactory");
            }
            if (tree.get("errors") != null) {
                String string2 = tree.get("errors").toString();
                Iterator<JsonNode> it = tree.get("errors").iterator();
                while (it.hasNext()) {
                    if (it.next().get("status").toString().equals(XRAY_FATAL_FAIL_STATUS)) {
                        throw new RuntimeException("Artifactory response: " + string2);
                    }
                }
                throw new XrayErrorException("Artifactory response: " + string2);
            }
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            this.result = objectMapper.treeToValue(tree, ArtifactoryXrayResponse.class);
        } catch (Exception e) {
            throw new XrayErrorException(String.format("Failed processing scan response: %s\n%s", e, string));
        }
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public ArtifactoryXrayResponse execute(JFrogHttpClient jFrogHttpClient) throws IOException {
        long jCurrentTimeMillis = 0;
        while (true) {
            int i = 0;
            while (true) {
                try {
                    try {
                        jCurrentTimeMillis = System.currentTimeMillis();
                        i++;
                        ArtifactoryXrayResponse artifactoryXrayResponse = (ArtifactoryXrayResponse) super.execute(jFrogHttpClient);
                        this.request.releaseConnection();
                        return artifactoryXrayResponse;
                    } catch (XrayErrorException e) {
                        handleException(i, e);
                    } catch (IOException e2) {
                        if (!isStableConnection(jCurrentTimeMillis)) {
                            handleException(i, e2);
                        } else {
                            if (Thread.currentThread().isInterrupted()) {
                                throw new IOException("Operation interrupted.");
                            }
                            this.request.releaseConnection();
                        }
                    }
                    this.request.releaseConnection();
                } catch (Throwable th) {
                    this.request.releaseConnection();
                    throw th;
                }
            }
        }
    }

    public final boolean isStableConnection(long j) {
        return j + 100000 < System.currentTimeMillis();
    }

    public final void handleException(int i, IOException iOException) throws InterruptedException, IOException {
        if (5 <= i) {
            throw iOException;
        }
        this.log.warn("Xray scan connection lost: " + iOException.getMessage() + ", attempting to reconnect...");
        try {
            Thread.sleep(30000L);
        } catch (InterruptedException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* loaded from: classes7.dex */
    public static class XrayErrorException extends IOException {
        public /* synthetic */ XrayErrorException(String str, C112961 c112961) {
            this(str);
        }

        public XrayErrorException(String str) {
            super(str);
        }
    }

    public final String getXrayScanBody() {
        String str = "{\"buildName\":\"" + this.buildName + "\",\"buildNumber\":\"" + this.buildNumber + "\",\"context\":\"" + this.context;
        if (StringUtils.isNotEmpty(this.project)) {
            str = str + "\",\"project\":\"" + this.project;
        }
        return str + "\"}";
    }
}
