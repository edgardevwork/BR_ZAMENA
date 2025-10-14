package org.apache.http.protocol;

import org.apache.http.HttpRequest;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.SAFE)
/* loaded from: classes7.dex */
public class UriHttpRequestHandlerMapper implements HttpRequestHandlerMapper {
    public final UriPatternMatcher<HttpRequestHandler> matcher;

    public UriHttpRequestHandlerMapper(UriPatternMatcher<HttpRequestHandler> uriPatternMatcher) {
        this.matcher = (UriPatternMatcher) Args.notNull(uriPatternMatcher, "Pattern matcher");
    }

    public UriHttpRequestHandlerMapper() {
        this(new UriPatternMatcher());
    }

    public void register(String str, HttpRequestHandler httpRequestHandler) {
        Args.notNull(str, "Pattern");
        Args.notNull(httpRequestHandler, "Handler");
        this.matcher.register(str, httpRequestHandler);
    }

    public void unregister(String str) {
        this.matcher.unregister(str);
    }

    public String getRequestPath(HttpRequest httpRequest) {
        String uri = httpRequest.getRequestLine().getUri();
        int iIndexOf = uri.indexOf(63);
        if (iIndexOf != -1) {
            return uri.substring(0, iIndexOf);
        }
        int iIndexOf2 = uri.indexOf(35);
        return iIndexOf2 != -1 ? uri.substring(0, iIndexOf2) : uri;
    }

    @Override // org.apache.http.protocol.HttpRequestHandlerMapper
    public HttpRequestHandler lookup(HttpRequest httpRequest) {
        Args.notNull(httpRequest, "HTTP request");
        return this.matcher.lookup(getRequestPath(httpRequest));
    }
}
