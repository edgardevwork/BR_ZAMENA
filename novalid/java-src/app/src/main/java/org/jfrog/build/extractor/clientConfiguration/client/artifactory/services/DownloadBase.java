package org.jfrog.build.extractor.clientConfiguration.client.artifactory.services;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpRequestBase;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.UrlUtils;
import org.jfrog.build.extractor.clientConfiguration.client.JFrogService;

/* loaded from: classes5.dex */
public abstract class DownloadBase<TResult> extends JFrogService<TResult> {
    public final String downloadPath;
    public final Map<String, String> headers;
    public final boolean isHead;

    public DownloadBase(String str, boolean z, Map<String, String> map, Log log) {
        super(log);
        this.downloadPath = UrlUtils.encodeUrl(str);
        this.isHead = z;
        this.headers = map;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() throws IOException {
        HttpRequestBase httpHead = this.isHead ? new HttpHead(this.downloadPath) : new HttpGet(this.downloadPath);
        httpHead.setHeader("Connection", "Keep-Alive");
        Map<String, String> map = this.headers;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpHead.setHeader(entry.getKey(), entry.getValue());
            }
        }
        return httpHead;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void handleUnsuccessfulResponse(HttpEntity httpEntity) throws UnsupportedOperationException, IOException {
        if (this.statusCode == 404) {
            throw new FileNotFoundException("Unable to find " + this.downloadPath);
        }
        this.log.error("Failed to download from  '" + this.downloadPath + "'");
        JFrogService.throwException(httpEntity, getStatusCode());
    }
}
