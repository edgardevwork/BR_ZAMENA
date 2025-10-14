package org.apache.http.impl.client;

import com.google.firebase.perf.FirebasePerformance;
import java.io.IOException;
import java.net.Socket;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.auth.AuthSchemeRegistry;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.Credentials;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.params.HttpClientParamConfig;
import org.apache.http.client.protocol.RequestClientConnControl;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.conn.HttpConnectionFactory;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.RouteInfo;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.impl.DefaultConnectionReuseStrategy;
import org.apache.http.impl.auth.BasicSchemeFactory;
import org.apache.http.impl.auth.DigestSchemeFactory;
import org.apache.http.impl.auth.KerberosSchemeFactory;
import org.apache.http.impl.auth.NTLMSchemeFactory;
import org.apache.http.impl.auth.SPNegoSchemeFactory;
import org.apache.http.impl.conn.ManagedHttpClientConnectionFactory;
import org.apache.http.message.BasicHttpRequest;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParamConfig;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;
import org.apache.http.protocol.ImmutableHttpProcessor;
import org.apache.http.protocol.RequestTargetHost;
import org.apache.http.protocol.RequestUserAgent;
import org.apache.http.util.Args;
import org.apache.http.util.EntityUtils;

/* loaded from: classes8.dex */
public class ProxyClient {
    public final AuthSchemeRegistry authSchemeRegistry;
    public final org.apache.http.impl.auth.HttpAuthenticator authenticator;
    public final HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> connFactory;
    public final ConnectionConfig connectionConfig;
    public final HttpProcessor httpProcessor;
    public final AuthState proxyAuthState;
    public final ProxyAuthenticationStrategy proxyAuthStrategy;
    public final RequestConfig requestConfig;
    public final HttpRequestExecutor requestExec;
    public final ConnectionReuseStrategy reuseStrategy;

    public ProxyClient(HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> httpConnectionFactory, ConnectionConfig connectionConfig, RequestConfig requestConfig) {
        this.connFactory = httpConnectionFactory == null ? ManagedHttpClientConnectionFactory.INSTANCE : httpConnectionFactory;
        this.connectionConfig = connectionConfig == null ? ConnectionConfig.DEFAULT : connectionConfig;
        this.requestConfig = requestConfig == null ? RequestConfig.DEFAULT : requestConfig;
        this.httpProcessor = new ImmutableHttpProcessor(new RequestTargetHost(), new RequestClientConnControl(), new RequestUserAgent());
        this.requestExec = new HttpRequestExecutor();
        this.proxyAuthStrategy = new ProxyAuthenticationStrategy();
        this.authenticator = new org.apache.http.impl.auth.HttpAuthenticator();
        this.proxyAuthState = new AuthState();
        AuthSchemeRegistry authSchemeRegistry = new AuthSchemeRegistry();
        this.authSchemeRegistry = authSchemeRegistry;
        authSchemeRegistry.register("Basic", new BasicSchemeFactory());
        authSchemeRegistry.register("Digest", new DigestSchemeFactory());
        authSchemeRegistry.register("NTLM", new NTLMSchemeFactory());
        authSchemeRegistry.register("Negotiate", new SPNegoSchemeFactory());
        authSchemeRegistry.register("Kerberos", new KerberosSchemeFactory());
        this.reuseStrategy = new DefaultConnectionReuseStrategy();
    }

    @Deprecated
    public ProxyClient(HttpParams httpParams) {
        this(null, HttpParamConfig.getConnectionConfig(httpParams), HttpClientParamConfig.getRequestConfig(httpParams));
    }

    public ProxyClient(RequestConfig requestConfig) {
        this(null, null, requestConfig);
    }

    public ProxyClient() {
        this(null, null, null);
    }

    @Deprecated
    public HttpParams getParams() {
        return new BasicHttpParams();
    }

    @Deprecated
    public AuthSchemeRegistry getAuthSchemeRegistry() {
        return this.authSchemeRegistry;
    }

    public Socket tunnel(HttpHost httpHost, HttpHost httpHost2, Credentials credentials) throws HttpException, IOException {
        HttpResponse httpResponseExecute;
        Args.notNull(httpHost, "Proxy host");
        Args.notNull(httpHost2, "Target host");
        Args.notNull(credentials, "Credentials");
        HttpHost httpHost3 = httpHost2.getPort() <= 0 ? new HttpHost(httpHost2.getHostName(), 80, httpHost2.getSchemeName()) : httpHost2;
        HttpRoute httpRoute = new HttpRoute(httpHost3, this.requestConfig.getLocalAddress(), httpHost, false, RouteInfo.TunnelType.TUNNELLED, RouteInfo.LayerType.PLAIN);
        ManagedHttpClientConnection managedHttpClientConnection = (ManagedHttpClientConnection) this.connFactory.create(httpRoute, this.connectionConfig);
        HttpContext basicHttpContext = new BasicHttpContext();
        BasicHttpRequest basicHttpRequest = new BasicHttpRequest(FirebasePerformance.HttpMethod.CONNECT, httpHost3.toHostString(), HttpVersion.HTTP_1_1);
        BasicCredentialsProvider basicCredentialsProvider = new BasicCredentialsProvider();
        basicCredentialsProvider.setCredentials(new AuthScope(httpHost), credentials);
        basicHttpContext.setAttribute("http.target_host", httpHost2);
        basicHttpContext.setAttribute("http.connection", managedHttpClientConnection);
        basicHttpContext.setAttribute("http.request", basicHttpRequest);
        basicHttpContext.setAttribute("http.route", httpRoute);
        basicHttpContext.setAttribute("http.auth.proxy-scope", this.proxyAuthState);
        basicHttpContext.setAttribute("http.auth.credentials-provider", basicCredentialsProvider);
        basicHttpContext.setAttribute("http.authscheme-registry", this.authSchemeRegistry);
        basicHttpContext.setAttribute("http.request-config", this.requestConfig);
        this.requestExec.preProcess(basicHttpRequest, this.httpProcessor, basicHttpContext);
        while (true) {
            if (!managedHttpClientConnection.isOpen()) {
                managedHttpClientConnection.bind(new Socket(httpHost.getHostName(), httpHost.getPort()));
            }
            this.authenticator.generateAuthResponse(basicHttpRequest, this.proxyAuthState, basicHttpContext);
            httpResponseExecute = this.requestExec.execute(basicHttpRequest, managedHttpClientConnection, basicHttpContext);
            if (httpResponseExecute.getStatusLine().getStatusCode() < 200) {
                throw new HttpException("Unexpected response to CONNECT request: " + httpResponseExecute.getStatusLine());
            }
            if (!this.authenticator.isAuthenticationRequested(httpHost, httpResponseExecute, this.proxyAuthStrategy, this.proxyAuthState, basicHttpContext) || !this.authenticator.handleAuthChallenge(httpHost, httpResponseExecute, this.proxyAuthStrategy, this.proxyAuthState, basicHttpContext)) {
                break;
            }
            if (this.reuseStrategy.keepAlive(httpResponseExecute, basicHttpContext)) {
                EntityUtils.consume(httpResponseExecute.getEntity());
            } else {
                managedHttpClientConnection.close();
            }
            basicHttpRequest.removeHeaders("Proxy-Authorization");
        }
        if (httpResponseExecute.getStatusLine().getStatusCode() > 299) {
            HttpEntity entity = httpResponseExecute.getEntity();
            if (entity != null) {
                httpResponseExecute.setEntity(new BufferedHttpEntity(entity));
            }
            managedHttpClientConnection.close();
            throw new org.apache.http.impl.execchain.TunnelRefusedException("CONNECT refused by proxy: " + httpResponseExecute.getStatusLine(), httpResponseExecute);
        }
        return managedHttpClientConnection.getSocket();
    }
}
