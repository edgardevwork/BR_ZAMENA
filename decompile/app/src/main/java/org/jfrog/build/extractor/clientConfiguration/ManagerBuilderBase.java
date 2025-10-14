package org.jfrog.build.extractor.clientConfiguration;

import java.io.Serializable;
import javax.net.ssl.SSLContext;
import org.apache.commons.lang3.StringUtils;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.client.ProxyConfiguration;
import org.jfrog.build.extractor.clientConfiguration.ArtifactoryClientConfiguration;
import org.jfrog.build.extractor.clientConfiguration.ManagerBuilderBase;
import org.jfrog.build.extractor.clientConfiguration.client.ManagerBase;

/* loaded from: classes7.dex */
public abstract class ManagerBuilderBase<T extends ManagerBuilderBase<T>> implements Serializable {
    public static final long serialVersionUID = 1;
    public String accessToken;
    public Log log;
    public String password;
    public ProxyConfiguration proxyConfiguration;
    public String serverUrl;
    public SSLContext sslContext;
    public String username;
    public int connectionTimeout = -1;
    public int connectionRetry = -1;

    public abstract ManagerBase build();

    public abstract T self();

    public T setProxyConfiguration(ProxyConfiguration proxyConfiguration) {
        this.proxyConfiguration = proxyConfiguration;
        return (T) self();
    }

    public T setConnectionTimeout(int i) {
        this.connectionTimeout = i;
        return (T) self();
    }

    public T setConnectionRetry(int i) {
        this.connectionRetry = i;
        return (T) self();
    }

    public T setServerUrl(String str) {
        this.serverUrl = str;
        return (T) self();
    }

    public T setSslContext(SSLContext sSLContext) {
        this.sslContext = sSLContext;
        return (T) self();
    }

    public T setUsername(String str) {
        this.username = str;
        return (T) self();
    }

    public T setPassword(String str) {
        this.password = str;
        return (T) self();
    }

    public T setAccessToken(String str) {
        this.accessToken = str;
        return (T) self();
    }

    public T setLog(Log log) {
        this.log = log;
        return (T) self();
    }

    public T setClientConfiguration(ArtifactoryClientConfiguration artifactoryClientConfiguration, ArtifactoryClientConfiguration.RepositoryConfiguration repositoryConfiguration) {
        setServerUrl(repositoryConfiguration.getContextUrl());
        setUsername(repositoryConfiguration.getUsername());
        setPassword(repositoryConfiguration.getPassword());
        setLog(repositoryConfiguration.getLog());
        ArtifactoryClientConfiguration.ProxyHandler proxyHandler = artifactoryClientConfiguration.proxy;
        if (proxyHandler != null && StringUtils.isNotBlank(proxyHandler.getHost())) {
            ProxyConfiguration proxyConfiguration = new ProxyConfiguration();
            proxyConfiguration.host = proxyHandler.getHost();
            proxyConfiguration.port = proxyHandler.getPort().intValue();
            proxyConfiguration.username = proxyHandler.getUsername();
            proxyConfiguration.password = proxyHandler.getPassword();
            setProxyConfiguration(proxyConfiguration);
        }
        if (artifactoryClientConfiguration.getConnectionRetries() != null) {
            setConnectionRetry(artifactoryClientConfiguration.getConnectionRetries().intValue());
        }
        if (artifactoryClientConfiguration.getTimeout() != null) {
            setConnectionTimeout(artifactoryClientConfiguration.getTimeout().intValue());
        }
        return (T) self();
    }

    public ManagerBase build(ManagerBase managerBase) {
        ProxyConfiguration proxyConfiguration = this.proxyConfiguration;
        if (proxyConfiguration != null) {
            managerBase.setProxyConfiguration(proxyConfiguration.host, proxyConfiguration.port, proxyConfiguration.username, proxyConfiguration.password);
        }
        managerBase.setSslContext(this.sslContext);
        int i = this.connectionTimeout;
        if (i != -1) {
            managerBase.setConnectionTimeout(i);
        }
        int i2 = this.connectionRetry;
        if (i2 != -1) {
            managerBase.setConnectionRetries(i2);
        }
        return managerBase;
    }
}
