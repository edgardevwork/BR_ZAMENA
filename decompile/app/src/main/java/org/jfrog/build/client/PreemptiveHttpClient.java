package org.jfrog.build.client;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.SSLException;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.Credentials;
import org.apache.http.client.AuthCache;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.ServiceUnavailableRetryStrategy;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpRequestWrapper;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.impl.client.DefaultRedirectStrategy;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.protocol.HttpContext;
import org.jfrog.build.api.util.CommonUtils;
import org.jfrog.build.api.util.Log;

/* loaded from: classes7.dex */
public class PreemptiveHttpClient implements AutoCloseable {
    public static final String ORIGINAL_HOST_CONTEXT_PARAM = "original.host.context.param";
    public static final boolean REQUEST_SENT_RETRY_ENABLED = true;
    public final String accessToken;
    public final AuthCache authCache;
    public BasicCredentialsProvider basicCredentialsProvider;
    public final PoolingHttpClientConnectionManager connectionManager;
    public final int connectionRetries;
    public final CloseableHttpClient httpClient;
    public Log log;

    public PreemptiveHttpClient(PoolingHttpClientConnectionManager poolingHttpClientConnectionManager, BasicCredentialsProvider basicCredentialsProvider, String str, AuthCache authCache, HttpClientBuilder httpClientBuilder, int i, Log log) {
        this.connectionManager = poolingHttpClientConnectionManager;
        this.basicCredentialsProvider = basicCredentialsProvider;
        this.accessToken = str;
        this.authCache = authCache;
        this.connectionRetries = i;
        this.log = log;
        httpClientBuilder.setRetryHandler(new PreemptiveRetryHandler(i < 0 ? 3 : i));
        httpClientBuilder.setServiceUnavailableRetryStrategy(new PreemptiveRetryStrategy());
        httpClientBuilder.setRedirectStrategy(new PreemptiveRedirectStrategy());
        this.httpClient = httpClientBuilder.build();
    }

    public CloseableHttpResponse execute(HttpUriRequest httpUriRequest) throws IOException {
        return execute(httpUriRequest, HttpClientContext.create());
    }

    public CloseableHttpResponse execute(HttpUriRequest httpUriRequest, HttpClientContext httpClientContext) throws IOException {
        if (StringUtils.isNotEmpty(this.accessToken)) {
            httpClientContext.setUserToken(this.accessToken);
        } else {
            httpClientContext.setCredentialsProvider(this.basicCredentialsProvider);
        }
        AuthCache authCache = this.authCache;
        if (authCache != null) {
            httpClientContext.setAuthCache(authCache);
        }
        return this.httpClient.execute(httpUriRequest, (HttpContext) httpClientContext);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        try {
            this.httpClient.close();
        } catch (IOException unused) {
        }
        this.connectionManager.close();
    }

    public void setLog(Log log) {
        this.log = log;
    }

    public final Set<Class<? extends IOException>> getNonRetriableClasses() {
        HashSet hashSet = new HashSet();
        hashSet.add(SSLException.class);
        return hashSet;
    }

    /* loaded from: classes5.dex */
    public static class PreemptiveAuth implements HttpRequestInterceptor {
        @Override // org.apache.http.HttpRequestInterceptor
        public void process(HttpRequest httpRequest, HttpContext httpContext) throws HttpException {
            if (shouldSetAuthScheme(httpRequest, httpContext)) {
                HttpClientContext httpClientContext = (HttpClientContext) httpContext;
                AuthState targetAuthState = httpClientContext.getTargetAuthState();
                if (targetAuthState.getAuthScheme() == null) {
                    String str = (String) httpClientContext.getUserToken(String.class);
                    if (StringUtils.isNotEmpty(str)) {
                        httpRequest.addHeader("Authorization", "Bearer " + str);
                        return;
                    }
                    CredentialsProvider credentialsProvider = httpClientContext.getCredentialsProvider();
                    HttpHost targetHost = httpClientContext.getTargetHost();
                    Credentials credentials = credentialsProvider.getCredentials(new AuthScope(targetHost.getHostName(), targetHost.getPort()));
                    if (credentials == null) {
                        throw new HttpException("No credentials for preemptive authentication");
                    }
                    targetAuthState.update(new BasicScheme(), credentials);
                }
            }
        }

        public final boolean shouldSetAuthScheme(HttpRequest httpRequest, HttpContext httpContext) {
            String str = (String) httpContext.getAttribute(PreemptiveHttpClient.ORIGINAL_HOST_CONTEXT_PARAM);
            if (str == null) {
                return true;
            }
            try {
                return new URI(((HttpRequestWrapper) httpRequest).getOriginal().getRequestLine().getUri()).getHost().equals(str);
            } catch (URISyntaxException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* loaded from: classes5.dex */
    public class PreemptiveRetryStrategy implements ServiceUnavailableRetryStrategy {
        @Override // org.apache.http.client.ServiceUnavailableRetryStrategy
        public long getRetryInterval() {
            return 0L;
        }

        public PreemptiveRetryStrategy() {
        }

        @Override // org.apache.http.client.ServiceUnavailableRetryStrategy
        public boolean retryRequest(HttpResponse httpResponse, int i, HttpContext httpContext) {
            if (httpResponse.getStatusLine().getStatusCode() < 500) {
                return false;
            }
            HttpClientContext httpClientContextAdapt = HttpClientContext.adapt(httpContext);
            PreemptiveHttpClient.this.log.warn("Error occurred for request " + httpClientContextAdapt.getRequest().getRequestLine().toString() + ". Received status code " + httpResponse.getStatusLine().getStatusCode() + " and message: " + httpResponse.getStatusLine().getReasonPhrase() + ".");
            if (i > PreemptiveHttpClient.this.connectionRetries) {
                return false;
            }
            PreemptiveHttpClient.this.log.warn("Attempting retry #" + i);
            return true;
        }
    }

    /* loaded from: classes5.dex */
    public class PreemptiveRetryHandler extends DefaultHttpRequestRetryHandler {
        public PreemptiveRetryHandler(int i) {
            super(i, true, PreemptiveHttpClient.this.getNonRetriableClasses());
        }

        @Override // org.apache.http.impl.client.DefaultHttpRequestRetryHandler, org.apache.http.client.HttpRequestRetryHandler
        public boolean retryRequest(IOException iOException, int i, HttpContext httpContext) {
            HttpClientContext httpClientContextAdapt = HttpClientContext.adapt(httpContext);
            PreemptiveHttpClient.this.log.warn("Error occurred for request " + httpClientContextAdapt.getRequest().getRequestLine().toString() + ": " + iOException.getMessage() + ".");
            if (i > PreemptiveHttpClient.this.connectionRetries || !super.retryRequest(iOException, i, httpContext)) {
                return false;
            }
            PreemptiveHttpClient.this.log.warn("Attempting retry #" + i);
            return true;
        }
    }

    /* loaded from: classes5.dex */
    public class PreemptiveRedirectStrategy extends DefaultRedirectStrategy {
        public final Set<String> redirectableMethods;

        public PreemptiveRedirectStrategy() {
            this.redirectableMethods = CommonUtils.newHashSet("GET".toLowerCase(), "POST".toLowerCase(), "HEAD".toLowerCase(), "DELETE".toLowerCase(), "PUT".toLowerCase());
        }

        @Override // org.apache.http.impl.client.DefaultRedirectStrategy, org.apache.http.client.RedirectStrategy
        public HttpUriRequest getRedirect(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) throws ProtocolException {
            httpContext.setAttribute(PreemptiveHttpClient.ORIGINAL_HOST_CONTEXT_PARAM, getHost(httpRequest));
            URI locationURI = getLocationURI(httpRequest, httpResponse, httpContext);
            PreemptiveHttpClient.this.log.debug("Redirecting to " + locationURI);
            return RequestBuilder.copy(httpRequest).setUri(locationURI).build();
        }

        public final String getHost(HttpRequest httpRequest) {
            try {
                return new URI(httpRequest.getRequestLine().getUri()).getHost();
            } catch (URISyntaxException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // org.apache.http.impl.client.DefaultRedirectStrategy
        public boolean isRedirectable(String str) {
            String str2 = "The method " + str;
            if (this.redirectableMethods.contains(str.toLowerCase())) {
                PreemptiveHttpClient.this.log.debug(str2 + " can be redirected.");
                return true;
            }
            PreemptiveHttpClient.this.log.error(str2 + " cannot be redirected.");
            return false;
        }
    }
}
