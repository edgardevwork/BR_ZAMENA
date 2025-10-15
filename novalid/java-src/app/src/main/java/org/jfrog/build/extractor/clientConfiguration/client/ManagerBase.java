package org.jfrog.build.extractor.clientConfiguration.client;

import java.io.IOException;
import javax.net.ssl.SSLContext;
import org.apache.commons.lang3.StringUtils;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.client.JFrogHttpClient;
import org.jfrog.build.client.ProxyConfiguration;
import org.jfrog.build.client.Version;

/* loaded from: classes7.dex */
public abstract class ManagerBase implements AutoCloseable {
    public final JFrogHttpClient jfrogHttpClient;
    public final Log log;

    public abstract Version getVersion() throws IOException;

    public ManagerBase(String str, String str2, String str3, String str4, Log log) {
        if (StringUtils.isNotEmpty(str4)) {
            this.jfrogHttpClient = new JFrogHttpClient(str, str4, log);
        } else {
            this.jfrogHttpClient = new JFrogHttpClient(str, str2, str3, log);
        }
        this.log = log;
    }

    public void setConnectionTimeout(int i) {
        this.jfrogHttpClient.setConnectionTimeout(i);
    }

    public void setConnectionRetries(int i) {
        this.jfrogHttpClient.setConnectionRetries(i);
    }

    public void setProxyConfiguration(String str, int i) {
        this.jfrogHttpClient.setProxyConfiguration(str, i, null, null);
    }

    public void setProxyConfiguration(String str, int i, String str2, String str3) {
        this.jfrogHttpClient.setProxyConfiguration(str, i, str2, str3);
    }

    public ProxyConfiguration getProxyConfiguration() {
        return this.jfrogHttpClient.getProxyConfiguration();
    }

    public void setProxyConfiguration(ProxyConfiguration proxyConfiguration) {
        this.jfrogHttpClient.setProxyConfiguration(proxyConfiguration.host, proxyConfiguration.port, proxyConfiguration.username, proxyConfiguration.password);
    }

    public void setLog(Log log) {
        this.jfrogHttpClient.getHttpClient().setLog(log);
    }

    public void setInsecureTls(boolean z) {
        this.jfrogHttpClient.setInsecureTls(z);
    }

    public void setSslContext(SSLContext sSLContext) {
        this.jfrogHttpClient.setSslContext(sSLContext);
    }

    public String getUrl() {
        return this.jfrogHttpClient.getUrl();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        JFrogHttpClient jFrogHttpClient = this.jfrogHttpClient;
        if (jFrogHttpClient != null) {
            jFrogHttpClient.close();
        }
    }
}
