package org.jfrog.build.client;

import java.io.IOException;
import java.net.URI;
import javax.net.ssl.SSLContext;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpRequestBase;
import org.jfrog.build.api.util.Log;

/* loaded from: classes7.dex */
public class JFrogHttpClient implements AutoCloseable {
    public static final int DEFAULT_CONNECTION_RETRY = 3;
    public static final int DEFAULT_CONNECTION_TIMEOUT_SECS = 300;
    public static final ArtifactoryVersion STANDALONE_BUILD_RETENTION_SUPPORTED_ARTIFACTORY_VERSION = new ArtifactoryVersion("5.2.1");
    public final PreemptiveHttpClientBuilder clientBuilder;
    public PreemptiveHttpClient deployClient;
    public Log log;
    public final String url;

    public JFrogHttpClient(String str, String str2, String str3, String str4, Log log) {
        this.url = StringUtils.removeEnd(str, "/");
        this.log = log;
        PreemptiveHttpClientBuilder log2 = new PreemptiveHttpClientBuilder().setConnectionRetries(3).setInsecureTls(false).setTimeout(300).setLog(log);
        this.clientBuilder = log2;
        if (StringUtils.isNotEmpty(str4)) {
            log2.setAccessToken(str4);
        } else {
            log2.setUserName(str2).setPassword(str3);
        }
    }

    public JFrogHttpClient(String str, String str2, String str3, Log log) {
        this(str, str2, str3, "", log);
    }

    public JFrogHttpClient(String str, String str2, Log log) {
        this(str, "", "", str2, log);
    }

    public void setProxyConfiguration(String str, int i) {
        setProxyConfiguration(str, i, null, null);
    }

    public void setProxyConfiguration(String str, int i, String str2, String str3) {
        ProxyConfiguration proxyConfiguration = new ProxyConfiguration();
        proxyConfiguration.host = str;
        proxyConfiguration.port = i;
        proxyConfiguration.username = str2;
        proxyConfiguration.password = str3;
        this.clientBuilder.setProxyConfiguration(proxyConfiguration);
    }

    public void setConnectionTimeout(int i) {
        this.clientBuilder.setTimeout(i);
    }

    public void setInsecureTls(boolean z) {
        this.clientBuilder.setInsecureTls(z);
    }

    public void setSslContext(SSLContext sSLContext) {
        this.clientBuilder.setSslContext(sSLContext);
    }

    public int getConnectionRetries() {
        return this.clientBuilder.connectionRetries;
    }

    public void setConnectionRetries(int i) {
        this.clientBuilder.setConnectionRetries(i);
    }

    public ProxyConfiguration getProxyConfiguration() {
        return this.clientBuilder.getProxyConfiguration();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        PreemptiveHttpClient preemptiveHttpClient = this.deployClient;
        if (preemptiveHttpClient != null) {
            preemptiveHttpClient.close();
        }
    }

    public PreemptiveHttpClient getHttpClient() {
        if (this.deployClient == null) {
            this.deployClient = this.clientBuilder.build();
        }
        return this.deployClient;
    }

    public CloseableHttpResponse sendRequest(HttpRequestBase httpRequestBase) throws IOException {
        this.log.debug("Base URL: " + httpRequestBase.getURI().toString());
        PreemptiveHttpClient httpClient = getHttpClient();
        httpRequestBase.setURI(URI.create(this.url + "/" + StringUtils.removeStart(httpRequestBase.getURI().toString(), "/")));
        return httpClient.execute(httpRequestBase);
    }

    public Log getLog() {
        return this.log;
    }

    public void setLog(Log log) {
        this.log = log;
    }

    public String getUrl() {
        return this.url;
    }
}
