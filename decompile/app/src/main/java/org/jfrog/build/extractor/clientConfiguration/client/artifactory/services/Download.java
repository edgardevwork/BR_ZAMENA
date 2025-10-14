package org.jfrog.build.extractor.clientConfiguration.client.artifactory.services;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import org.apache.commons.p059io.IOUtils;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.client.DownloadResponse;

/* loaded from: classes7.dex */
public class Download extends DownloadBase<DownloadResponse> {
    public Download(String str, Map<String, String> map, Log log) {
        super(str, false, map, log);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [TResult, org.jfrog.build.client.DownloadResponse] */
    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void setResponse(InputStream inputStream) throws IOException {
        this.result = new DownloadResponse(IOUtils.toString(inputStream, StandardCharsets.UTF_8.name()), getHeaders());
    }
}
