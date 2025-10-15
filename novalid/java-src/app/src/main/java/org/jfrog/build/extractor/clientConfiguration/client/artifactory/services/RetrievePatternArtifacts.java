package org.jfrog.build.extractor.clientConfiguration.client.artifactory.services;

import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.jfrog.build.api.dependency.BuildPatternArtifacts;
import org.jfrog.build.api.dependency.BuildPatternArtifactsRequest;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.clientConfiguration.client.JFrogService;
import org.jfrog.build.extractor.clientConfiguration.util.JsonSerializer;

/* loaded from: classes5.dex */
public class RetrievePatternArtifacts extends JFrogService<List<BuildPatternArtifacts>> {
    public static final String PATTERN_ARTIFACT_REST_URL = "/api/build/patternArtifacts";
    public final List<BuildPatternArtifactsRequest> requests;

    public RetrievePatternArtifacts(List<BuildPatternArtifactsRequest> list, Log log) {
        super(log);
        this.requests = list;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() throws IOException {
        this.log.info("Retrieving build artifacts report from: /api/build/patternArtifacts");
        HttpPost httpPost = new HttpPost(PATTERN_ARTIFACT_REST_URL);
        StringEntity stringEntity = new StringEntity(new JsonSerializer().toJSON(this.requests));
        stringEntity.setContentType(SendModuleInfo.APPLICATION_VND_ORG_JFROG_ARTIFACTORY_JSON);
        httpPost.setEntity(stringEntity);
        return httpPost;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [TResult, java.lang.Object] */
    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void setResponse(InputStream inputStream) throws IOException {
        this.result = getMapper().readValue(inputStream, TypeFactory.defaultInstance().constructCollectionLikeType(List.class, BuildPatternArtifacts.class));
    }
}
