package org.jfrog.build.extractor.clientConfiguration.client.artifactory.services;

import java.io.IOException;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.clientConfiguration.client.VoidJFrogService;

/* loaded from: classes5.dex */
public class CreateRepository extends VoidJFrogService {
    public static final String CREATE_REPOSITORY_ENDPOINT = "api/repositories/";
    public final String repositoryJsonConfig;
    public final String repositoryKey;

    public CreateRepository(String str, String str2, Log log) {
        super(log);
        this.repositoryKey = str;
        this.repositoryJsonConfig = str2;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() throws IOException {
        HttpPut httpPut = new HttpPut("api/repositories/" + this.repositoryKey);
        httpPut.setEntity(new StringEntity(this.repositoryJsonConfig, ContentType.create("application/json")));
        return httpPut;
    }
}
