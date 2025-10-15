package org.apache.http.impl.client;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.net.ssl.SSLException;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes5.dex */
public class DefaultHttpRequestRetryHandler implements HttpRequestRetryHandler {
    public static final DefaultHttpRequestRetryHandler INSTANCE = new DefaultHttpRequestRetryHandler();
    public final Set<Class<? extends IOException>> nonRetriableClasses;
    public final boolean requestSentRetryEnabled;
    public final int retryCount;

    public DefaultHttpRequestRetryHandler(int i, boolean z, Collection<Class<? extends IOException>> collection) {
        this.retryCount = i;
        this.requestSentRetryEnabled = z;
        HashSet hashSet = new HashSet();
        this.nonRetriableClasses = hashSet;
        hashSet.addAll(collection);
    }

    public DefaultHttpRequestRetryHandler(int i, boolean z) {
        this(i, z, Arrays.asList(InterruptedIOException.class, UnknownHostException.class, ConnectException.class, NoRouteToHostException.class, SSLException.class));
    }

    public DefaultHttpRequestRetryHandler() {
        this(3, false);
    }

    @Override // org.apache.http.client.HttpRequestRetryHandler
    public boolean retryRequest(IOException iOException, int i, HttpContext httpContext) {
        Args.notNull(iOException, "Exception parameter");
        Args.notNull(httpContext, "HTTP context");
        if (i > this.retryCount || this.nonRetriableClasses.contains(iOException.getClass())) {
            return false;
        }
        Iterator<Class<? extends IOException>> it = this.nonRetriableClasses.iterator();
        while (it.hasNext()) {
            if (it.next().isInstance(iOException)) {
                return false;
            }
        }
        HttpClientContext httpClientContextAdapt = HttpClientContext.adapt(httpContext);
        HttpRequest request = httpClientContextAdapt.getRequest();
        if (requestIsAborted(request)) {
            return false;
        }
        return handleAsIdempotent(request) || !httpClientContextAdapt.isRequestSent() || this.requestSentRetryEnabled;
    }

    public boolean isRequestSentRetryEnabled() {
        return this.requestSentRetryEnabled;
    }

    public int getRetryCount() {
        return this.retryCount;
    }

    public boolean handleAsIdempotent(HttpRequest httpRequest) {
        return !(httpRequest instanceof HttpEntityEnclosingRequest);
    }

    @Deprecated
    public boolean requestIsAborted(HttpRequest httpRequest) {
        if (httpRequest instanceof RequestWrapper) {
            httpRequest = ((RequestWrapper) httpRequest).getOriginal();
        }
        return (httpRequest instanceof HttpUriRequest) && ((HttpUriRequest) httpRequest).isAborted();
    }
}
