package org.apache.http.impl.client;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.CircularRedirectException;
import org.apache.http.client.RedirectStrategy;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes5.dex */
public class DefaultRedirectStrategy implements RedirectStrategy {
    public static final DefaultRedirectStrategy INSTANCE = new DefaultRedirectStrategy();

    @Deprecated
    public static final String REDIRECT_LOCATIONS = "http.protocol.redirect-locations";
    public static final int SC_PERMANENT_REDIRECT = 308;
    public final Log log;
    public final String[] redirectMethods;

    public DefaultRedirectStrategy() {
        this(new String[]{"GET", "HEAD"});
    }

    public DefaultRedirectStrategy(String[] strArr) {
        this.log = LogFactory.getLog(getClass());
        String[] strArr2 = (String[]) strArr.clone();
        Arrays.sort(strArr2);
        this.redirectMethods = strArr2;
    }

    @Override // org.apache.http.client.RedirectStrategy
    public boolean isRedirected(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) throws ProtocolException {
        Args.notNull(httpRequest, "HTTP request");
        Args.notNull(httpResponse, "HTTP response");
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        String method = httpRequest.getRequestLine().getMethod();
        Header firstHeader = httpResponse.getFirstHeader("location");
        if (statusCode != 307 && statusCode != 308) {
            switch (statusCode) {
                case 301:
                    break;
                case 302:
                    return isRedirectable(method) && firstHeader != null;
                case 303:
                    return true;
                default:
                    return false;
            }
        }
        return isRedirectable(method);
    }

    public URI getLocationURI(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) throws ProtocolException {
        Args.notNull(httpRequest, "HTTP request");
        Args.notNull(httpResponse, "HTTP response");
        Args.notNull(httpContext, "HTTP context");
        HttpClientContext httpClientContextAdapt = HttpClientContext.adapt(httpContext);
        Header firstHeader = httpResponse.getFirstHeader("location");
        if (firstHeader == null) {
            throw new ProtocolException("Received redirect response " + httpResponse.getStatusLine() + " but no location header");
        }
        String value = firstHeader.getValue();
        if (this.log.isDebugEnabled()) {
            this.log.debug("Redirect requested to location '" + value + "'");
        }
        RequestConfig requestConfig = httpClientContextAdapt.getRequestConfig();
        URI uriCreateLocationURI = createLocationURI(value);
        try {
            if (requestConfig.isNormalizeUri()) {
                uriCreateLocationURI = URIUtils.normalizeSyntax(uriCreateLocationURI);
            }
            if (!uriCreateLocationURI.isAbsolute()) {
                if (!requestConfig.isRelativeRedirectsAllowed()) {
                    throw new ProtocolException("Relative redirect location '" + uriCreateLocationURI + "' not allowed");
                }
                HttpHost targetHost = httpClientContextAdapt.getTargetHost();
                Asserts.notNull(targetHost, "Target host");
                uriCreateLocationURI = URIUtils.resolve(URIUtils.rewriteURI(new URI(httpRequest.getRequestLine().getUri()), targetHost, requestConfig.isNormalizeUri() ? URIUtils.NORMALIZE : URIUtils.NO_FLAGS), uriCreateLocationURI);
            }
            RedirectLocations redirectLocations = (RedirectLocations) httpClientContextAdapt.getAttribute("http.protocol.redirect-locations");
            if (redirectLocations == null) {
                redirectLocations = new RedirectLocations();
                httpContext.setAttribute("http.protocol.redirect-locations", redirectLocations);
            }
            if (!requestConfig.isCircularRedirectsAllowed() && redirectLocations.contains(uriCreateLocationURI)) {
                throw new CircularRedirectException("Circular redirect to '" + uriCreateLocationURI + "'");
            }
            redirectLocations.add(uriCreateLocationURI);
            return uriCreateLocationURI;
        } catch (URISyntaxException e) {
            throw new ProtocolException(e.getMessage(), e);
        }
    }

    public URI createLocationURI(String str) throws ProtocolException {
        try {
            return new URI(str);
        } catch (URISyntaxException e) {
            throw new ProtocolException("Invalid redirect URI: " + str, e);
        }
    }

    public boolean isRedirectable(String str) {
        return Arrays.binarySearch(this.redirectMethods, str) >= 0;
    }

    @Override // org.apache.http.client.RedirectStrategy
    public HttpUriRequest getRedirect(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) throws ProtocolException {
        URI locationURI = getLocationURI(httpRequest, httpResponse, httpContext);
        String method = httpRequest.getRequestLine().getMethod();
        if (method.equalsIgnoreCase("HEAD")) {
            return new HttpHead(locationURI);
        }
        if (method.equalsIgnoreCase("GET")) {
            return new HttpGet(locationURI);
        }
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        return (statusCode == 307 || statusCode == 308) ? RequestBuilder.copy(httpRequest).setUri(locationURI).build() : new HttpGet(locationURI);
    }
}
