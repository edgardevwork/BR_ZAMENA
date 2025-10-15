package org.jfrog.build.extractor.clientConfiguration.client.artifactory.services;

import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.clientConfiguration.client.JFrogService;

/* loaded from: classes5.dex */
public class IsRepositoryExist extends JFrogService<Boolean> {
    public static final String REPOS_REST_URL = "api/repositories/";
    public final String repo;

    public IsRepositoryExist(String str, Log log) {
        super(log);
        this.repo = str;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() {
        return new HttpGet("api/repositories/" + this.repo);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [TResult, java.lang.Boolean] */
    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void setResponse(InputStream inputStream) {
        this.result = Boolean.TRUE;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [TResult, java.lang.Boolean] */
    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void handleUnsuccessfulResponse(HttpEntity httpEntity) {
        this.result = Boolean.valueOf(this.statusCode != 400);
    }
}
