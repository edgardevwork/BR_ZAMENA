package org.jfrog.build.extractor.clientConfiguration.client.artifactory.services;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.jfrog.build.api.dependency.PropertySearchResult;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.clientConfiguration.client.JFrogService;
import org.jfrog.filespecs.properties.PropertiesParser;

/* loaded from: classes5.dex */
public class SearchArtifactsByProperties extends JFrogService<PropertySearchResult> {
    public static final String SEARCH_ARTIFACT_BY_PROPERTIES_ENDPOINT = "api/search/prop?";
    public final String properties;

    public SearchArtifactsByProperties(String str, Log log) {
        super(log);
        this.properties = str;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() throws IOException {
        return new HttpGet(SEARCH_ARTIFACT_BY_PROPERTIES_ENDPOINT + StringUtils.replaceEach(this.properties, new String[]{PropertiesParser.PROPS_SEPARATOR, "+"}, new String[]{"&", ""}));
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void handleUnsuccessfulResponse(HttpEntity httpEntity) throws UnsupportedOperationException, IOException {
        this.log.error("Failed to search artifact by the properties '" + this.properties + "'");
        JFrogService.throwException(httpEntity, getStatusCode());
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [TResult, java.lang.Object] */
    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void setResponse(InputStream inputStream) throws IOException {
        this.result = getMapper().readValue(inputStream, PropertySearchResult.class);
    }
}
