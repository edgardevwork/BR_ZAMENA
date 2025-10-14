package org.apache.ivy.util.url;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayerBridge;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.ProxySelector;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthSchemeProvider;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.NTCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.config.Lookup;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.FileEntity;
import org.apache.http.impl.auth.BasicSchemeFactory;
import org.apache.http.impl.auth.DigestSchemeFactory;
import org.apache.http.impl.auth.NTLMSchemeFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.impl.conn.SystemDefaultRoutePlanner;
import org.apache.ivy.core.settings.TimeoutConstraint;
import org.apache.ivy.util.CopyProgressListener;
import org.apache.ivy.util.FileUtil;
import org.apache.ivy.util.HostUtil;
import org.apache.ivy.util.Message;
import org.apache.ivy.util.url.URLHandler;

/* loaded from: classes5.dex */
public class HttpClientHandler extends AbstractURLHandler implements TimeoutConstrainedURLHandler, AutoCloseable {
    public final CloseableHttpClient httpClient = buildUnderlyingClient();
    public static final SimpleDateFormat LAST_MODIFIED_FORMAT = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss z", Locale.US);
    public static final HttpClientHandler DELETE_ON_EXIT_INSTANCE = new HttpClientHandler();

    static {
        Thread thread = new Thread(new Runnable() { // from class: org.apache.ivy.util.url.HttpClientHandler.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    HttpClientHandler.DELETE_ON_EXIT_INSTANCE.close();
                } catch (Exception unused) {
                }
            }
        });
        thread.setName("ivy-httpclient-shutdown-handler");
        thread.setDaemon(true);
        Runtime.getRuntime().addShutdownHook(thread);
    }

    public final CloseableHttpClient buildUnderlyingClient() {
        return HttpClients.custom().setConnectionManager(createConnectionManager()).setRoutePlanner(createProxyRoutePlanner()).setUserAgent(getUserAgent()).setDefaultAuthSchemeRegistry(createAuthSchemeRegistry()).setDefaultCredentialsProvider(new IvyCredentialsProvider()).build();
    }

    public static HttpRoutePlanner createProxyRoutePlanner() {
        Message.verbose("Using JRE standard ProxySelector for configuring HTTP proxy");
        return new SystemDefaultRoutePlanner(ProxySelector.getDefault());
    }

    public static Lookup<AuthSchemeProvider> createAuthSchemeRegistry() {
        return RegistryBuilder.create().register("Digest", new DigestSchemeFactory()).register("Basic", new BasicSchemeFactory()).register("NTLM", new NTLMSchemeFactory()).build();
    }

    public static HttpClientConnectionManager createConnectionManager() {
        return new PoolingHttpClientConnectionManager();
    }

    public static List<String> getAuthSchemePreferredOrder() {
        return Arrays.asList("Digest", "Basic", "NTLM");
    }

    @Override // org.apache.ivy.util.url.URLHandler
    public InputStream openStream(URL url) throws IOException {
        return openStream(url, null);
    }

    @Override // org.apache.ivy.util.url.TimeoutConstrainedURLHandler
    public InputStream openStream(URL url, TimeoutConstraint timeoutConstraint) throws IOException {
        int readTimeout = 0;
        int connectionTimeout = (timeoutConstraint == null || timeoutConstraint.getConnectionTimeout() < 0) ? 0 : timeoutConstraint.getConnectionTimeout();
        if (timeoutConstraint != null && timeoutConstraint.getReadTimeout() >= 0) {
            readTimeout = timeoutConstraint.getReadTimeout();
        }
        CloseableHttpResponse closeableHttpResponseDoGet = doGet(url, connectionTimeout, readTimeout);
        requireSuccessStatus("GET", url, closeableHttpResponseDoGet);
        Header contentEncoding = getContentEncoding(closeableHttpResponseDoGet);
        return getDecodingInputStream(contentEncoding == null ? null : contentEncoding.getValue(), closeableHttpResponseDoGet.getEntity().getContent());
    }

    @Override // org.apache.ivy.util.url.URLHandler
    public void download(URL url, File file, CopyProgressListener copyProgressListener) throws IOException {
        download(url, file, copyProgressListener, null);
    }

    @Override // org.apache.ivy.util.url.TimeoutConstrainedURLHandler
    public void download(URL url, File file, CopyProgressListener copyProgressListener, TimeoutConstraint timeoutConstraint) throws IOException {
        int readTimeout = 0;
        int connectionTimeout = (timeoutConstraint == null || timeoutConstraint.getConnectionTimeout() < 0) ? 0 : timeoutConstraint.getConnectionTimeout();
        if (timeoutConstraint != null && timeoutConstraint.getReadTimeout() >= 0) {
            readTimeout = timeoutConstraint.getReadTimeout();
        }
        CloseableHttpResponse closeableHttpResponseDoGet = doGet(url, connectionTimeout, readTimeout);
        try {
            requireSuccessStatus("GET", url, closeableHttpResponseDoGet);
            Header contentEncoding = getContentEncoding(closeableHttpResponseDoGet);
            InputStream decodingInputStream = getDecodingInputStream(contentEncoding == null ? null : contentEncoding.getValue(), closeableHttpResponseDoGet.getEntity().getContent());
            try {
                FileUtil.copy(decodingInputStream, file, copyProgressListener);
                if (decodingInputStream != null) {
                    decodingInputStream.close();
                }
                file.setLastModified(getLastModified(closeableHttpResponseDoGet));
                closeableHttpResponseDoGet.close();
            } finally {
            }
        } catch (Throwable th) {
            if (closeableHttpResponseDoGet != null) {
                try {
                    closeableHttpResponseDoGet.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // org.apache.ivy.util.url.URLHandler
    public void upload(File file, URL url, CopyProgressListener copyProgressListener) throws IOException {
        upload(file, url, copyProgressListener, null);
    }

    @Override // org.apache.ivy.util.url.TimeoutConstrainedURLHandler
    public void upload(File file, URL url, CopyProgressListener copyProgressListener, TimeoutConstraint timeoutConstraint) throws IOException {
        int readTimeout = 0;
        int connectionTimeout = (timeoutConstraint == null || timeoutConstraint.getConnectionTimeout() < 0) ? 0 : timeoutConstraint.getConnectionTimeout();
        if (timeoutConstraint != null && timeoutConstraint.getReadTimeout() >= 0) {
            readTimeout = timeoutConstraint.getReadTimeout();
        }
        RequestConfig requestConfigBuild = RequestConfig.custom().setSocketTimeout(readTimeout).setConnectTimeout(connectionTimeout).setAuthenticationEnabled(hasCredentialsConfigured(url)).setTargetPreferredAuthSchemes(getAuthSchemePreferredOrder()).setProxyPreferredAuthSchemes(getAuthSchemePreferredOrder()).setExpectContinueEnabled(true).build();
        HttpPut httpPut = new HttpPut(normalizeToString(url));
        httpPut.setConfig(requestConfigBuild);
        httpPut.setEntity(new FileEntity(file));
        CloseableHttpResponse closeableHttpResponseExecute = this.httpClient.execute((HttpUriRequest) httpPut);
        try {
            validatePutStatusCode(url, closeableHttpResponseExecute.getStatusLine().getStatusCode(), closeableHttpResponseExecute.getStatusLine().getReasonPhrase());
            closeableHttpResponseExecute.close();
        } catch (Throwable th) {
            if (closeableHttpResponseExecute != null) {
                try {
                    closeableHttpResponseExecute.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // org.apache.ivy.util.url.URLHandler
    public URLHandler.URLInfo getURLInfo(URL url) {
        return getURLInfo(url, (TimeoutConstraint) null);
    }

    @Override // org.apache.ivy.util.url.URLHandler
    public URLHandler.URLInfo getURLInfo(URL url, int i) {
        return getURLInfo(url, AbstractURLHandler.createTimeoutConstraints(i));
    }

    @Override // org.apache.ivy.util.url.TimeoutConstrainedURLHandler
    public boolean isReachable(URL url, TimeoutConstraint timeoutConstraint) {
        return getURLInfo(url, timeoutConstraint).isReachable();
    }

    @Override // org.apache.ivy.util.url.TimeoutConstrainedURLHandler
    public long getContentLength(URL url, TimeoutConstraint timeoutConstraint) {
        return getURLInfo(url, timeoutConstraint).getContentLength();
    }

    @Override // org.apache.ivy.util.url.TimeoutConstrainedURLHandler
    public long getLastModified(URL url, TimeoutConstraint timeoutConstraint) {
        return getURLInfo(url, timeoutConstraint).getLastModified();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x006a A[EXC_TOP_SPLITTER, PHI: r12
  0x006a: PHI (r12v5 org.apache.http.client.methods.CloseableHttpResponse) = 
  (r12v3 org.apache.http.client.methods.CloseableHttpResponse)
  (r12v7 org.apache.http.client.methods.CloseableHttpResponse)
 binds: [B:39:0x008e, B:35:0x0068] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // org.apache.ivy.util.url.TimeoutConstrainedURLHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public URLHandler.URLInfo getURLInfo(URL url, TimeoutConstraint timeoutConstraint) throws IOException {
        String str;
        int readTimeout = 0;
        int connectionTimeout = (timeoutConstraint == null || timeoutConstraint.getConnectionTimeout() < 0) ? 0 : timeoutConstraint.getConnectionTimeout();
        if (timeoutConstraint != null && timeoutConstraint.getReadTimeout() >= 0) {
            readTimeout = timeoutConstraint.getReadTimeout();
        }
        CloseableHttpResponse closeableHttpResponseDoGet = null;
        try {
            try {
                if (getRequestMethod() == 2) {
                    str = "HEAD";
                    closeableHttpResponseDoGet = doHead(url, connectionTimeout, readTimeout);
                } else {
                    str = "GET";
                    closeableHttpResponseDoGet = doGet(url, connectionTimeout, readTimeout);
                }
            } catch (IOException e) {
                e = e;
                Message.error("HttpClientHandler: " + e.getMessage() + " url=" + url);
                if (closeableHttpResponseDoGet != null) {
                }
                return URLHandler.UNAVAILABLE;
            } catch (IllegalArgumentException e2) {
                e = e2;
                Message.error("HttpClientHandler: " + e.getMessage() + " url=" + url);
                if (closeableHttpResponseDoGet != null) {
                }
                return URLHandler.UNAVAILABLE;
            }
            if (checkStatusCode(str, url, closeableHttpResponseDoGet)) {
                HttpEntity entity = closeableHttpResponseDoGet.getEntity();
                URLHandler.URLInfo uRLInfo = new URLHandler.URLInfo(true, entity == null ? 0L : entity.getContentLength(), getLastModified(closeableHttpResponseDoGet), ContentType.getOrDefault(entity).getCharset().name());
                try {
                    closeableHttpResponseDoGet.close();
                } catch (IOException unused) {
                }
                return uRLInfo;
            }
            if (closeableHttpResponseDoGet != null) {
                try {
                    closeableHttpResponseDoGet.close();
                } catch (IOException unused2) {
                }
            }
            return URLHandler.UNAVAILABLE;
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    closeableHttpResponseDoGet.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    public final boolean checkStatusCode(String str, URL url, HttpResponse httpResponse) {
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        if (statusCode == 200) {
            return true;
        }
        if ("HEAD".equals(str) && statusCode == 204) {
            return true;
        }
        Message.debug("HTTP response status: " + statusCode + " url=" + url);
        if (statusCode == 407) {
            Message.warn("Your proxy requires authentication.");
            return false;
        }
        if (String.valueOf(statusCode).startsWith("4")) {
            Message.verbose("CLIENT ERROR: " + httpResponse.getStatusLine().getReasonPhrase() + " url=" + url);
            return false;
        }
        if (!String.valueOf(statusCode).startsWith(YouTubePlayerBridge.ERROR_HTML_5_PLAYER)) {
            return false;
        }
        Message.error("SERVER ERROR: " + httpResponse.getStatusLine().getReasonPhrase() + " url=" + url);
        return false;
    }

    public final void requireSuccessStatus(String str, URL url, CloseableHttpResponse closeableHttpResponse) throws IOException {
        if (checkStatusCode(str, url, closeableHttpResponse)) {
            return;
        }
        try {
            closeableHttpResponse.close();
        } catch (Exception e) {
            Message.debug("Could not close the HTTP response for url=" + url, e);
        }
        throw new IOException("Failed response to request '" + str + " " + url + "' " + closeableHttpResponse.getStatusLine().getStatusCode() + " - '" + closeableHttpResponse.getStatusLine().getReasonPhrase());
    }

    public final Header getContentEncoding(HttpResponse httpResponse) {
        return httpResponse.getFirstHeader("Content-Encoding");
    }

    public final long getLastModified(HttpResponse httpResponse) {
        Header firstHeader = httpResponse.getFirstHeader("last-modified");
        if (firstHeader == null) {
            return System.currentTimeMillis();
        }
        try {
            return LAST_MODIFIED_FORMAT.parse(firstHeader.getValue()).getTime();
        } catch (ParseException unused) {
            return System.currentTimeMillis();
        }
    }

    public final CloseableHttpResponse doGet(URL url, int i, int i2) throws IOException {
        RequestConfig requestConfigBuild = RequestConfig.custom().setSocketTimeout(i2).setConnectTimeout(i).setAuthenticationEnabled(hasCredentialsConfigured(url)).setTargetPreferredAuthSchemes(getAuthSchemePreferredOrder()).setProxyPreferredAuthSchemes(getAuthSchemePreferredOrder()).build();
        HttpGet httpGet = new HttpGet(normalizeToString(url));
        httpGet.setConfig(requestConfigBuild);
        httpGet.addHeader("Accept-Encoding", "gzip,deflate");
        return this.httpClient.execute((HttpUriRequest) httpGet);
    }

    public final CloseableHttpResponse doHead(URL url, int i, int i2) throws IOException {
        RequestConfig requestConfigBuild = RequestConfig.custom().setSocketTimeout(i2).setConnectTimeout(i).setAuthenticationEnabled(hasCredentialsConfigured(url)).setTargetPreferredAuthSchemes(getAuthSchemePreferredOrder()).setProxyPreferredAuthSchemes(getAuthSchemePreferredOrder()).build();
        HttpHead httpHead = new HttpHead(normalizeToString(url));
        httpHead.setConfig(requestConfigBuild);
        return this.httpClient.execute((HttpUriRequest) httpHead);
    }

    public final boolean hasCredentialsConfigured(URL url) {
        return CredentialsStore.INSTANCE.hasCredentials(url.getHost());
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        CloseableHttpClient closeableHttpClient = this.httpClient;
        if (closeableHttpClient != null) {
            closeableHttpClient.close();
        }
    }

    public static class IvyCredentialsProvider implements CredentialsProvider {
        public final ConcurrentHashMap<AuthScope, Credentials> cachedCreds;

        public IvyCredentialsProvider() {
            this.cachedCreds = new ConcurrentHashMap<>();
        }

        @Override // org.apache.http.client.CredentialsProvider
        public void setCredentials(AuthScope authScope, Credentials credentials) {
            if (authScope == null) {
                throw new IllegalArgumentException("AuthScope cannot be null");
            }
            this.cachedCreds.put(authScope, credentials);
        }

        @Override // org.apache.http.client.CredentialsProvider
        public Credentials getCredentials(AuthScope authScope) {
            if (authScope == null) {
                return null;
            }
            org.apache.ivy.util.Credentials credentials = CredentialsStore.INSTANCE.getCredentials(authScope.getRealm(), authScope.getHost());
            if (credentials == null) {
                return null;
            }
            return createCredentials(credentials.getUserName(), credentials.getPasswd());
        }

        @Override // org.apache.http.client.CredentialsProvider
        public void clear() {
            this.cachedCreds.clear();
        }

        public static Credentials createCredentials(String str, String str2) {
            String property;
            int iIndexOf = str.indexOf(92);
            if (iIndexOf >= 0) {
                String strSubstring = str.substring(iIndexOf + 1);
                property = str.substring(0, iIndexOf);
                str = strSubstring;
            } else {
                property = System.getProperty("http.auth.ntlm.domain", "");
            }
            return new NTCredentials(str, str2, HostUtil.getLocalHostName(), property);
        }
    }
}
