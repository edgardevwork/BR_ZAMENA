package org.jfrog.build.extractor.clientConfiguration.client.artifactory.services;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.client.ItemLastModified;
import org.jfrog.build.extractor.clientConfiguration.client.JFrogService;

/* loaded from: classes5.dex */
public class GetItemLastModified extends JFrogService<ItemLastModified> {
    public static final String ITEM_LAST_MODIFIED = "api/storage/";
    public final String path;

    public GetItemLastModified(String str, Log log) {
        super(log);
        this.path = str;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() {
        return new HttpGet("api/storage/" + this.path + "?lastModified");
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void handleEmptyEntity() throws IOException {
        throw new IOException("The path " + this.path + " returned empty entity");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [TResult, java.lang.Object] */
    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void setResponse(InputStream inputStream) throws IOException {
        ?? value = getMapper().readValue(inputStream, (Class<??>) ItemLastModified.class);
        this.result = value;
        try {
            if (((ItemLastModified) value).getLastModified() == 0 || ((ItemLastModified) this.result).getUri() == null) {
                throw new IOException("JSON response is missing URI or LastModified fields when requesting info for path " + this.path);
            }
        } catch (ParseException unused) {
            throw new IOException("JSON response is missing URI or LastModified fields when requesting info for path " + this.path);
        }
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void handleUnsuccessfulResponse(HttpEntity httpEntity) throws UnsupportedOperationException, IOException {
        this.log.error("Failed while requesting item info for path: " + this.path);
        JFrogService.throwException(httpEntity, getStatusCode());
    }
}
