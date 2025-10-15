package org.jfrog.build.extractor.clientConfiguration.client.artifactory.services;

import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.clientConfiguration.client.JFrogService;
import org.jfrog.build.extractor.clientConfiguration.client.RepositoryType;
import org.jfrog.build.extractor.clientConfiguration.client.response.GetRepositoriesResponse;

/* loaded from: classes5.dex */
public class GetRepositoriesKeys extends JFrogService<List<String>> {
    public static final String REPOS_REST_URL = "api/repositories?type=";
    public final Log log;
    public RepositoryType repositoryType;

    /* JADX WARN: Type inference failed for: r0v0, types: [TResult, java.util.ArrayList] */
    public GetRepositoriesKeys(RepositoryType repositoryType, Log log) {
        super(log);
        this.result = new ArrayList();
        this.repositoryType = repositoryType;
        this.log = log;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() {
        String str = REPOS_REST_URL + this.repositoryType.name().toLowerCase();
        HttpGet httpGet = new HttpGet(str);
        this.log.debug("Requesting repositories list from: " + str);
        return httpGet;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [TResult, java.lang.Object] */
    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void setResponse(InputStream inputStream) throws IOException {
        this.result = ((List) getMapper().readValue(inputStream, TypeFactory.defaultInstance().constructCollectionLikeType(List.class, GetRepositoriesResponse.class))).stream().map(new Function() { // from class: org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.GetRepositoriesKeys$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((GetRepositoriesResponse) obj).getKey();
            }
        }).collect(Collectors.toList());
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void handleUnsuccessfulResponse(HttpEntity httpEntity) throws UnsupportedOperationException, IOException {
        this.log.error("Failed to obtain list of repositories.");
        JFrogService.throwException(httpEntity, getStatusCode());
    }
}
