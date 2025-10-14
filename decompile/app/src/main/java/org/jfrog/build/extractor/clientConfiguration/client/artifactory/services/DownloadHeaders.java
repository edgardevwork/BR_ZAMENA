package org.jfrog.build.extractor.clientConfiguration.client.artifactory.services;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import org.apache.http.Header;
import org.jfrog.build.api.util.Log;

/* loaded from: classes7.dex */
public class DownloadHeaders extends DownloadBase<Header[]> {
    public DownloadHeaders(String str, Map<String, String> map, Log log) {
        super(str, true, map, log);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [TResult, org.apache.http.Header[]] */
    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void setResponse(InputStream inputStream) throws IOException {
        this.result = getHeaders();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [TResult, org.apache.http.Header[]] */
    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void handleEmptyEntity() {
        this.result = getHeaders();
    }
}
