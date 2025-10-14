package org.jfrog.build.extractor.clientConfiguration.client.distribution.services;

import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpRequestBase;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.client.JFrogHttpClient;
import org.jfrog.build.extractor.clientConfiguration.client.distribution.response.DistributionStatusResponse;

/* loaded from: classes7.dex */
public class DeleteLocalReleaseBundle extends VoidDistributionService {
    public static final String GET_STATUS_ENDPOINT = "api/v1/release_bundle";
    public final String name;
    public final String version;

    public DeleteLocalReleaseBundle(String str, String str2, Log log) {
        super(log);
        this.name = str;
        this.version = str2;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void ensureRequirements(JFrogHttpClient jFrogHttpClient) throws IOException {
        if (StringUtils.isBlank(this.name)) {
            throw new IOException("Release bundle name is mandatory");
        }
        if (StringUtils.isBlank(this.version)) {
            throw new IOException("Release bundle version is mandatory");
        }
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() throws IOException {
        return new HttpDelete(buildUrlForDelete());
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [TResult, java.lang.Object] */
    @Override // org.jfrog.build.extractor.clientConfiguration.client.distribution.services.VoidDistributionService, org.jfrog.build.extractor.clientConfiguration.client.VoidJFrogService, org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void setResponse(InputStream inputStream) throws IOException {
        this.result = getMapper().readValue(inputStream, TypeFactory.defaultInstance().constructCollectionLikeType(List.class, DistributionStatusResponse.class));
    }

    public final String buildUrlForDelete() {
        if (StringUtils.isEmpty(this.name)) {
            return "api/v1/release_bundle";
        }
        String str = "api/v1/release_bundle/" + this.name;
        if (StringUtils.isEmpty(this.version)) {
            return str;
        }
        return str + "/" + this.version;
    }
}
