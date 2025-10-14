package org.jfrog.build.client;

import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.Properties;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.AuthCache;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.DefaultHostnameVerifier;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustAllStrategy;
import org.apache.http.conn.util.PublicSuffixMatcher;
import org.apache.http.conn.util.PublicSuffixMatcherLoader;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.BasicAuthCache;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.impl.cookie.DefaultCookieSpecProvider;
import org.apache.http.impl.cookie.IgnoreSpecProvider;
import org.apache.http.impl.cookie.NetscapeDraftSpec;
import org.apache.http.impl.cookie.NetscapeDraftSpecProvider;
import org.apache.http.impl.cookie.RFC6265CookieSpecProvider;
import org.apache.http.ssl.SSLContextBuilder;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.client.PreemptiveHttpClient;

/* loaded from: classes7.dex */
public class PreemptiveHttpClientBuilder {
    public static final String CLIENT_VERSION;
    public static final int CONNECTION_POOL_SIZE = 10;
    public PoolingHttpClientConnectionManager connectionManager;
    public int connectionRetries;
    public boolean insecureTls;
    public Log log;
    public HttpHost proxy;
    public ProxyConfiguration proxyConfiguration;
    public SSLContext sslContext;
    public int timeout;
    public final BasicCredentialsProvider credentialsProvider = new BasicCredentialsProvider();
    public AuthCache authCache = new BasicAuthCache();
    public String accessToken = "";
    public String userAgent = "";
    public String userName = "";
    public String password = "";

    static {
        Properties properties = new Properties();
        try {
            InputStream resourceAsStream = PreemptiveHttpClient.class.getResourceAsStream("/bi.client.properties");
            try {
                properties.load(resourceAsStream);
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                }
            } finally {
            }
        } catch (IOException unused) {
        }
        CLIENT_VERSION = properties.getProperty("client.version", "unknown");
    }

    public PreemptiveHttpClientBuilder setUserAgent(String str) {
        this.userAgent = str;
        return this;
    }

    public PreemptiveHttpClientBuilder setUserName(String str) {
        this.userName = str;
        return this;
    }

    public PreemptiveHttpClientBuilder setPassword(String str) {
        this.password = str;
        return this;
    }

    public PreemptiveHttpClientBuilder setAccessToken(String str) {
        this.accessToken = str;
        return this;
    }

    public PreemptiveHttpClientBuilder setTimeout(int i) {
        this.timeout = i;
        return this;
    }

    public PreemptiveHttpClientBuilder setProxyConfiguration(ProxyConfiguration proxyConfiguration) {
        this.proxyConfiguration = proxyConfiguration;
        if (proxyConfiguration != null) {
            this.proxy = new HttpHost(proxyConfiguration.host, proxyConfiguration.port);
        }
        return this;
    }

    public ProxyConfiguration getProxyConfiguration() {
        return this.proxyConfiguration;
    }

    public PreemptiveHttpClientBuilder setConnectionRetries(int i) {
        this.connectionRetries = i;
        return this;
    }

    public PreemptiveHttpClientBuilder setInsecureTls(boolean z) {
        this.insecureTls = z;
        return this;
    }

    public PreemptiveHttpClientBuilder setLog(Log log) {
        this.log = log;
        return this;
    }

    public PreemptiveHttpClientBuilder setSslContext(SSLContext sSLContext) {
        this.sslContext = sSLContext;
        return this;
    }

    public PreemptiveHttpClient build() {
        buildConnectionManager();
        HttpClientBuilder httpClientBuilderCreateHttpClientBuilder = createHttpClientBuilder();
        createCredentialsAndAuthCache();
        return new PreemptiveHttpClient(this.connectionManager, this.credentialsProvider, this.accessToken, this.authCache, httpClientBuilderCreateHttpClientBuilder, this.connectionRetries, this.log);
    }

    public void createCredentialsAndAuthCache() {
        ProxyConfiguration proxyConfiguration = this.proxyConfiguration;
        if (proxyConfiguration != null && proxyConfiguration.username != null) {
            BasicCredentialsProvider basicCredentialsProvider = this.credentialsProvider;
            ProxyConfiguration proxyConfiguration2 = this.proxyConfiguration;
            AuthScope authScope = new AuthScope(proxyConfiguration2.host, proxyConfiguration2.port);
            ProxyConfiguration proxyConfiguration3 = this.proxyConfiguration;
            basicCredentialsProvider.setCredentials(authScope, new UsernamePasswordCredentials(proxyConfiguration3.username, proxyConfiguration3.password));
            BasicAuthCache basicAuthCache = new BasicAuthCache();
            this.authCache = basicAuthCache;
            basicAuthCache.put(this.proxy, new BasicScheme());
        }
        if (StringUtils.isEmpty(this.accessToken)) {
            if (StringUtils.isEmpty(this.userName)) {
                this.userName = "anonymous";
                this.password = "";
            }
            this.credentialsProvider.setCredentials(new AuthScope(AuthScope.ANY_HOST, -1), new UsernamePasswordCredentials(this.userName, this.password));
        }
    }

    public void buildConnectionManager() {
        try {
            PoolingHttpClientConnectionManager poolingHttpClientConnectionManagerCreateConnectionManager = createConnectionManager();
            this.connectionManager = poolingHttpClientConnectionManagerCreateConnectionManager;
            poolingHttpClientConnectionManagerCreateConnectionManager.setMaxTotal(10);
            this.connectionManager.setDefaultMaxPerRoute(10);
        } catch (GeneralSecurityException e) {
            throw new RuntimeException(e);
        }
    }

    public HttpClientBuilder createHttpClientBuilder() {
        int i = this.timeout * 1000;
        HttpClientBuilder defaultRequestConfig = HttpClientBuilder.create().setConnectionManager(this.connectionManager).setDefaultRequestConfig(RequestConfig.custom().setSocketTimeout(i).setConnectTimeout(i).setConnectionRequestTimeout(i).setCircularRedirectsAllowed(true).build());
        defaultRequestConfig.addInterceptorFirst(new PreemptiveHttpClient.PreemptiveAuth());
        defaultRequestConfig.setUserAgent((String) StringUtils.defaultIfEmpty(this.userAgent, "ArtifactoryBuildClient/" + CLIENT_VERSION));
        setDefaultCookieSpecRegistry(defaultRequestConfig);
        defaultRequestConfig.setProxy(this.proxy);
        return defaultRequestConfig;
    }

    public final PoolingHttpClientConnectionManager createConnectionManager() throws GeneralSecurityException {
        if (!this.insecureTls && this.sslContext == null) {
            return new PoolingHttpClientConnectionManager();
        }
        HostnameVerifier defaultHostnameVerifier = new DefaultHostnameVerifier();
        SSLContext sSLContextBuild = this.sslContext;
        if (this.insecureTls) {
            sSLContextBuild = SSLContextBuilder.create().loadTrustMaterial(TrustAllStrategy.INSTANCE).build();
            defaultHostnameVerifier = NoopHostnameVerifier.INSTANCE;
        }
        return new PoolingHttpClientConnectionManager((Registry<ConnectionSocketFactory>) RegistryBuilder.create().register(HttpHost.DEFAULT_SCHEME_NAME, PlainConnectionSocketFactory.getSocketFactory()).register("https", new SSLConnectionSocketFactory(sSLContextBuild, defaultHostnameVerifier)).build());
    }

    public final void setDefaultCookieSpecRegistry(HttpClientBuilder httpClientBuilder) {
        PublicSuffixMatcher publicSuffixMatcher = PublicSuffixMatcherLoader.getDefault();
        httpClientBuilder.setPublicSuffixMatcher(publicSuffixMatcher);
        DefaultCookieSpecProvider defaultCookieSpecProvider = new DefaultCookieSpecProvider(DefaultCookieSpecProvider.CompatibilityLevel.DEFAULT, publicSuffixMatcher, new String[]{NetscapeDraftSpec.EXPIRES_PATTERN, "EEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd MMM yyyy HH:mm:ss zzz"}, false);
        RFC6265CookieSpecProvider rFC6265CookieSpecProvider = new RFC6265CookieSpecProvider(RFC6265CookieSpecProvider.CompatibilityLevel.RELAXED, publicSuffixMatcher);
        httpClientBuilder.setDefaultCookieSpecRegistry(RegistryBuilder.create().register("default", defaultCookieSpecProvider).register("best-match", defaultCookieSpecProvider).register("compatibility", defaultCookieSpecProvider).register("standard", rFC6265CookieSpecProvider).register(CookieSpecs.STANDARD_STRICT, new RFC6265CookieSpecProvider(RFC6265CookieSpecProvider.CompatibilityLevel.STRICT, publicSuffixMatcher)).register("netscape", new NetscapeDraftSpecProvider()).register("ignoreCookies", new IgnoreSpecProvider()).build());
    }
}
