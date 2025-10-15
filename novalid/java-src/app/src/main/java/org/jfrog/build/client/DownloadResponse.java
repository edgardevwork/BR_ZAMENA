package org.jfrog.build.client;

import org.apache.http.Header;

/* loaded from: classes7.dex */
public class DownloadResponse {
    public static final String SHA256_HEADER_NAME = "X-Checksum-Sha256";
    public String content;
    public Header[] headers;

    public DownloadResponse() {
    }

    public DownloadResponse(String str, Header[] headerArr) {
        this.headers = headerArr;
        this.content = str;
    }

    public void setHeaders(Header[] headerArr) {
        this.headers = headerArr;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public Header[] getHeaders() {
        return this.headers;
    }

    public String getContent() {
        return this.content;
    }
}
