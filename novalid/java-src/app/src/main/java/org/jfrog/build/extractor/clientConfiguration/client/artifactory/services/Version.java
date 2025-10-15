package org.jfrog.build.extractor.clientConfiguration.client.artifactory.services;

import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.client.ArtifactoryVersion;
import org.jfrog.build.extractor.clientConfiguration.client.JFrogService;

/* loaded from: classes5.dex */
public class Version extends JFrogService<ArtifactoryVersion> {
    public static final String VERSION_REST_URL = "api/system/version";
    public final Log log;

    /* JADX WARN: Type inference failed for: r1v1, types: [TResult, org.jfrog.build.client.ArtifactoryVersion] */
    public Version(Log log) {
        super(log);
        this.log = log;
        this.result = ArtifactoryVersion.NOT_FOUND;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() {
        return new HttpGet(VERSION_REST_URL);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [TResult, org.jfrog.build.client.ArtifactoryVersion] */
    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void setResponse(InputStream inputStream) throws IOException {
        JsonNode tree = getMapper().readTree(inputStream);
        this.log.debug("Version result: " + tree);
        String strAsText = tree.get("version").asText();
        JsonNode jsonNode = tree.get("addons");
        this.result = new ArtifactoryVersion(strAsText, jsonNode != null && jsonNode.iterator().hasNext());
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [TResult, org.jfrog.build.client.ArtifactoryVersion] */
    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void handleUnsuccessfulResponse(HttpEntity httpEntity) throws UnsupportedOperationException, IOException {
        if (this.statusCode == 404) {
            this.result = ArtifactoryVersion.NOT_FOUND;
        } else {
            JFrogService.throwException(httpEntity, getStatusCode());
        }
    }
}
