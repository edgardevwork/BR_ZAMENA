package org.apache.http.client.methods;

import java.net.URI;

/* loaded from: classes7.dex */
public class HttpPost extends HttpEntityEnclosingRequestBase {
    public static final String METHOD_NAME = "POST";

    public HttpPost() {
    }

    public HttpPost(URI uri) {
        setURI(uri);
    }

    public HttpPost(String str) {
        setURI(URI.create(str));
    }

    @Override // org.apache.http.client.methods.HttpRequestBase, org.apache.http.client.methods.HttpUriRequest
    public String getMethod() {
        return "POST";
    }
}
