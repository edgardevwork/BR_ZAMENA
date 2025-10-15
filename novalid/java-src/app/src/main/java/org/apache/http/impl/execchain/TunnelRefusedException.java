package org.apache.http.impl.execchain;

import org.apache.http.HttpException;
import org.apache.http.HttpResponse;

/* loaded from: classes8.dex */
public class TunnelRefusedException extends HttpException {
    public static final long serialVersionUID = -8646722842745617323L;
    public final HttpResponse response;

    public TunnelRefusedException(String str, HttpResponse httpResponse) {
        super(str);
        this.response = httpResponse;
    }

    public HttpResponse getResponse() {
        return this.response;
    }
}
