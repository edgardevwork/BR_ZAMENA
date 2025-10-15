package org.apache.http.impl.client;

import org.apache.http.HttpException;
import org.apache.http.HttpResponse;

@Deprecated
/* loaded from: classes5.dex */
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
