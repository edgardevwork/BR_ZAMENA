package org.jfrog.build.extractor.clientConfiguration.client.artifactory.services;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.jfrog.build.api.search.AqlSearchResult;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.clientConfiguration.client.JFrogService;

/* loaded from: classes5.dex */
public class SearchArtifactsByAql extends JFrogService<AqlSearchResult> {
    public static final String SEARCH_ARTIFACT_BY_AQL_ENDPOINT = "api/search/aql";
    public final String aql;

    public SearchArtifactsByAql(String str, Log log) {
        super(log);
        this.aql = str;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() throws IOException {
        HttpPost httpPost = new HttpPost(SEARCH_ARTIFACT_BY_AQL_ENDPOINT);
        httpPost.setEntity(new StringEntity(this.aql));
        return httpPost;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void handleUnsuccessfulResponse(HttpEntity httpEntity) throws UnsupportedOperationException, IOException {
        this.log.error("Failed to search artifact by the aql '" + this.aql + "'");
        JFrogService.throwException(httpEntity, getStatusCode());
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [TResult, java.lang.Object] */
    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void setResponse(InputStream inputStream) throws IOException {
        this.result = getMapper().readValue(inputStream, AqlSearchResult.class);
    }
}
