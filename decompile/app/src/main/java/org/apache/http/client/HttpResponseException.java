package org.apache.http.client;

import org.apache.http.util.TextUtils;

/* loaded from: classes7.dex */
public class HttpResponseException extends ClientProtocolException {
    public static final long serialVersionUID = -7186627969477257933L;
    public final String reasonPhrase;
    public final int statusCode;

    public HttpResponseException(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("status code: %d");
        sb.append(TextUtils.isBlank(str) ? "" : ", reason phrase: %s");
        super(String.format(sb.toString(), Integer.valueOf(i), str));
        this.statusCode = i;
        this.reasonPhrase = str;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getReasonPhrase() {
        return this.reasonPhrase;
    }
}
