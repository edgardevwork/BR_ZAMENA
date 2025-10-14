package org.apache.http.impl.execchain;

import com.google.firebase.perf.FirebasePerformance;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.auth.AuthProtocolState;
import org.apache.http.auth.AuthState;
import org.apache.http.client.AuthenticationStrategy;
import org.apache.http.client.NonRepeatableRequestException;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpExecutionAware;
import org.apache.http.client.methods.HttpRequestWrapper;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.ConnectionRequest;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.routing.BasicRouteDirector;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRouteDirector;
import org.apache.http.conn.routing.RouteTracker;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.impl.auth.HttpAuthenticator;
import org.apache.http.impl.conn.ConnectionShutdownException;
import org.apache.http.message.BasicHttpRequest;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;
import org.apache.http.protocol.ImmutableHttpProcessor;
import org.apache.http.protocol.RequestTargetHost;
import org.apache.http.util.Args;
import org.apache.http.util.EntityUtils;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes8.dex */
public class MainClientExec implements ClientExecChain {
    public final HttpAuthenticator authenticator;
    public final HttpClientConnectionManager connManager;
    public final ConnectionKeepAliveStrategy keepAliveStrategy;
    public final Log log;
    public final AuthenticationStrategy proxyAuthStrategy;
    public final HttpProcessor proxyHttpProcessor;
    public final HttpRequestExecutor requestExecutor;
    public final ConnectionReuseStrategy reuseStrategy;
    public final HttpRouteDirector routeDirector;
    public final AuthenticationStrategy targetAuthStrategy;
    public final UserTokenHandler userTokenHandler;

    public MainClientExec(HttpRequestExecutor httpRequestExecutor, HttpClientConnectionManager httpClientConnectionManager, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, HttpProcessor httpProcessor, AuthenticationStrategy authenticationStrategy, AuthenticationStrategy authenticationStrategy2, UserTokenHandler userTokenHandler) {
        this.log = LogFactory.getLog(getClass());
        Args.notNull(httpRequestExecutor, "HTTP request executor");
        Args.notNull(httpClientConnectionManager, "Client connection manager");
        Args.notNull(connectionReuseStrategy, "Connection reuse strategy");
        Args.notNull(connectionKeepAliveStrategy, "Connection keep alive strategy");
        Args.notNull(httpProcessor, "Proxy HTTP processor");
        Args.notNull(authenticationStrategy, "Target authentication strategy");
        Args.notNull(authenticationStrategy2, "Proxy authentication strategy");
        Args.notNull(userTokenHandler, "User token handler");
        this.authenticator = new HttpAuthenticator();
        this.routeDirector = new BasicRouteDirector();
        this.requestExecutor = httpRequestExecutor;
        this.connManager = httpClientConnectionManager;
        this.reuseStrategy = connectionReuseStrategy;
        this.keepAliveStrategy = connectionKeepAliveStrategy;
        this.proxyHttpProcessor = httpProcessor;
        this.targetAuthStrategy = authenticationStrategy;
        this.proxyAuthStrategy = authenticationStrategy2;
        this.userTokenHandler = userTokenHandler;
    }

    public MainClientExec(HttpRequestExecutor httpRequestExecutor, HttpClientConnectionManager httpClientConnectionManager, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, AuthenticationStrategy authenticationStrategy, AuthenticationStrategy authenticationStrategy2, UserTokenHandler userTokenHandler) {
        this(httpRequestExecutor, httpClientConnectionManager, connectionReuseStrategy, connectionKeepAliveStrategy, new ImmutableHttpProcessor(new RequestTargetHost()), authenticationStrategy, authenticationStrategy2, userTokenHandler);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:442:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x02ce A[Catch: Error -> 0x00b7, ConnectionShutdownException -> 0x00ce, HttpException -> 0x02a3, RuntimeException -> 0x02dc, IOException -> 0x02e0, TryCatch #20 {HttpException -> 0x02a3, blocks: (B:428:0x0290, B:445:0x02c8, B:447:0x02ce, B:449:0x02d8, B:464:0x0315, B:466:0x031f, B:467:0x0322, B:469:0x0328, B:470:0x032b, B:454:0x02e4, B:456:0x02ef, B:458:0x02f5, B:459:0x02ff, B:461:0x0305, B:463:0x030b, B:473:0x0340, B:476:0x0350, B:477:0x0353, B:479:0x0359, B:482:0x0360, B:484:0x0366, B:443:0x02b7), top: B:539:0x0290 }] */
    /* JADX WARN: Removed duplicated region for block: B:506:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0241 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:564:0x033c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:570:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:571:? A[SYNTHETIC] */
    @Override // org.apache.http.impl.execchain.ClientExecChain
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CloseableHttpResponse execute(HttpRoute httpRoute, HttpRequestWrapper httpRequestWrapper, HttpClientContext httpClientContext, HttpExecutionAware httpExecutionAware) throws HttpException, IOException {
        HttpException httpException;
        ConnectionHolder connectionHolder;
        RuntimeException runtimeException;
        AuthState authState;
        IOException iOException;
        ConnectionHolder connectionHolder2;
        Log log;
        int i;
        StringBuilder sb;
        int i2;
        HttpClientConnection httpClientConnection;
        String str;
        Object obj;
        HttpResponse response;
        Object userToken;
        AuthState authState2;
        HttpResponse httpResponseExecute;
        HttpResponse httpResponse;
        String str2;
        HttpResponse httpResponse2;
        HttpRoute httpRoute2 = httpRoute;
        HttpExecutionAware httpExecutionAware2 = httpExecutionAware;
        Args.notNull(httpRoute2, "HTTP route");
        Args.notNull(httpRequestWrapper, "HTTP request");
        Args.notNull(httpClientContext, "HTTP context");
        AuthState targetAuthState = httpClientContext.getTargetAuthState();
        if (targetAuthState == null) {
            targetAuthState = new AuthState();
            httpClientContext.setAttribute("http.auth.target-scope", targetAuthState);
        }
        AuthState authState3 = targetAuthState;
        AuthState proxyAuthState = httpClientContext.getProxyAuthState();
        if (proxyAuthState == null) {
            proxyAuthState = new AuthState();
            httpClientContext.setAttribute("http.auth.proxy-scope", proxyAuthState);
        }
        AuthState authState4 = proxyAuthState;
        if (httpRequestWrapper instanceof HttpEntityEnclosingRequest) {
            RequestEntityProxy.enhance((HttpEntityEnclosingRequest) httpRequestWrapper);
        }
        Object userToken2 = httpClientContext.getUserToken();
        ConnectionRequest connectionRequestRequestConnection = this.connManager.requestConnection(httpRoute2, userToken2);
        String str3 = "Request aborted";
        if (httpExecutionAware2 != null) {
            if (httpExecutionAware.isAborted()) {
                connectionRequestRequestConnection.cancel();
                throw new RequestAbortedException("Request aborted");
            }
            httpExecutionAware2.setCancellable(connectionRequestRequestConnection);
        }
        RequestConfig requestConfig = httpClientContext.getRequestConfig();
        try {
            int connectionRequestTimeout = requestConfig.getConnectionRequestTimeout();
            HttpClientConnection httpClientConnection2 = connectionRequestRequestConnection.get(connectionRequestTimeout > 0 ? connectionRequestTimeout : 0L, TimeUnit.MILLISECONDS);
            httpClientContext.setAttribute("http.connection", httpClientConnection2);
            if (requestConfig.isStaleConnectionCheckEnabled() && httpClientConnection2.isOpen()) {
                this.log.debug("Stale connection check");
                if (httpClientConnection2.isStale()) {
                    this.log.debug("Stale connection detected");
                    httpClientConnection2.close();
                }
            }
            ConnectionHolder connectionHolder3 = new ConnectionHolder(this.log, this.connManager, httpClientConnection2);
            if (httpExecutionAware2 != null) {
                try {
                    try {
                        httpExecutionAware2.setCancellable(connectionHolder3);
                    } catch (IOException e) {
                        iOException = e;
                        connectionHolder = connectionHolder3;
                        authState = authState4;
                        connectionHolder.abortConnection();
                        if (authState.isConnectionBased()) {
                        }
                        if (authState3.isConnectionBased()) {
                        }
                    } catch (RuntimeException e2) {
                        runtimeException = e2;
                        connectionHolder = connectionHolder3;
                        authState = authState4;
                        connectionHolder.abortConnection();
                        if (authState.isConnectionBased()) {
                        }
                        if (authState3.isConnectionBased()) {
                        }
                    } catch (HttpException e3) {
                        httpException = e3;
                        connectionHolder = connectionHolder3;
                        connectionHolder.abortConnection();
                        throw httpException;
                    }
                } catch (Error e4) {
                    this.connManager.shutdown();
                    throw e4;
                } catch (ConnectionShutdownException e5) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("Connection has been shut down");
                    interruptedIOException.initCause(e5);
                    throw interruptedIOException;
                }
            }
            int i3 = 1;
            int i4 = 1;
            while (true) {
                if (i4 > i3 && !RequestEntityProxy.isRepeatable(httpRequestWrapper)) {
                    throw new NonRepeatableRequestException("Cannot retry request with a non-repeatable request entity.");
                }
                if (httpExecutionAware2 != null && httpExecutionAware.isAborted()) {
                    throw new RequestAbortedException(str3);
                }
                try {
                    if (httpClientConnection2.isOpen()) {
                        i = i4;
                        i2 = i3;
                        connectionHolder2 = connectionHolder3;
                        httpClientConnection = httpClientConnection2;
                        obj = userToken2;
                        authState = authState4;
                        str = str3;
                    } else {
                        try {
                            log = this.log;
                            i = i4;
                            sb = new StringBuilder();
                            connectionHolder2 = connectionHolder3;
                        } catch (IOException e6) {
                            e = e6;
                            connectionHolder2 = connectionHolder3;
                        } catch (RuntimeException e7) {
                            e = e7;
                            connectionHolder2 = connectionHolder3;
                        } catch (HttpException e8) {
                            e = e8;
                            connectionHolder2 = connectionHolder3;
                        }
                        try {
                            try {
                                sb.append("Opening connection ");
                                sb.append(httpRoute2);
                                log.debug(sb.toString());
                                i2 = 1;
                                AuthState authState5 = authState4;
                                httpClientConnection = httpClientConnection2;
                                authState = authState4;
                                str = str3;
                                obj = userToken2;
                                try {
                                    try {
                                        establishRoute(authState5, httpClientConnection2, httpRoute, httpRequestWrapper, httpClientContext);
                                    } catch (IOException e9) {
                                        e = e9;
                                        iOException = e;
                                        connectionHolder = connectionHolder2;
                                        connectionHolder.abortConnection();
                                        if (authState.isConnectionBased()) {
                                        }
                                        if (authState3.isConnectionBased()) {
                                        }
                                    } catch (RuntimeException e10) {
                                        e = e10;
                                        runtimeException = e;
                                        connectionHolder = connectionHolder2;
                                        connectionHolder.abortConnection();
                                        if (authState.isConnectionBased()) {
                                        }
                                        if (authState3.isConnectionBased()) {
                                        }
                                    }
                                } catch (TunnelRefusedException e11) {
                                    if (this.log.isDebugEnabled()) {
                                        this.log.debug(e11.getMessage());
                                    }
                                    response = e11.getResponse();
                                    connectionHolder = connectionHolder2;
                                    if (obj == null) {
                                        userToken = this.userTokenHandler.getUserToken(httpClientContext);
                                        httpClientContext.setAttribute("http.user-token", userToken);
                                    } else {
                                        userToken = obj;
                                    }
                                    if (userToken != null) {
                                        connectionHolder.setState(userToken);
                                    }
                                    HttpEntity entity = response.getEntity();
                                    if (entity != null && entity.isStreaming()) {
                                        return new HttpResponseProxy(response, connectionHolder);
                                    }
                                    connectionHolder.releaseConnection();
                                    return new HttpResponseProxy(response, null);
                                }
                            } catch (IOException e12) {
                                e = e12;
                                authState = authState4;
                                iOException = e;
                                connectionHolder = connectionHolder2;
                                connectionHolder.abortConnection();
                                if (authState.isConnectionBased()) {
                                }
                                if (authState3.isConnectionBased()) {
                                }
                            } catch (RuntimeException e13) {
                                e = e13;
                                authState = authState4;
                                runtimeException = e;
                                connectionHolder = connectionHolder2;
                                connectionHolder.abortConnection();
                                if (authState.isConnectionBased()) {
                                }
                                if (authState3.isConnectionBased()) {
                                }
                            }
                        } catch (HttpException e14) {
                            e = e14;
                            httpException = e;
                            connectionHolder = connectionHolder2;
                            connectionHolder.abortConnection();
                            throw httpException;
                        }
                    }
                    try {
                        try {
                            int socketTimeout = requestConfig.getSocketTimeout();
                            if (socketTimeout >= 0) {
                                httpClientConnection.setSocketTimeout(socketTimeout);
                            }
                            if (httpExecutionAware2 != null && httpExecutionAware.isAborted()) {
                                throw new RequestAbortedException(str);
                            }
                            if (this.log.isDebugEnabled()) {
                                this.log.debug("Executing request " + httpRequestWrapper.getRequestLine());
                            }
                            if (!httpRequestWrapper.containsHeader("Authorization")) {
                                if (this.log.isDebugEnabled()) {
                                    this.log.debug("Target auth state: " + authState3.getState());
                                }
                                this.authenticator.generateAuthResponse(httpRequestWrapper, authState3, httpClientContext);
                            }
                            try {
                                try {
                                    if (!httpRequestWrapper.containsHeader("Proxy-Authorization")) {
                                        try {
                                            if (!httpRoute.isTunnelled()) {
                                                if (this.log.isDebugEnabled()) {
                                                    this.log.debug("Proxy auth state: " + authState.getState());
                                                }
                                                authState2 = authState;
                                                try {
                                                    this.authenticator.generateAuthResponse(httpRequestWrapper, authState2, httpClientContext);
                                                } catch (IOException e15) {
                                                    iOException = e15;
                                                    authState = authState2;
                                                    connectionHolder = connectionHolder2;
                                                    connectionHolder.abortConnection();
                                                    if (authState.isConnectionBased()) {
                                                        authState.reset();
                                                    }
                                                    if (authState3.isConnectionBased()) {
                                                        authState3.reset();
                                                        throw iOException;
                                                    }
                                                    throw iOException;
                                                } catch (RuntimeException e16) {
                                                    runtimeException = e16;
                                                    authState = authState2;
                                                    connectionHolder = connectionHolder2;
                                                    connectionHolder.abortConnection();
                                                    if (authState.isConnectionBased()) {
                                                        authState.reset();
                                                    }
                                                    if (authState3.isConnectionBased()) {
                                                        authState3.reset();
                                                        throw runtimeException;
                                                    }
                                                    throw runtimeException;
                                                }
                                            }
                                            httpClientContext.setAttribute("http.request", httpRequestWrapper);
                                            httpResponseExecute = this.requestExecutor.execute(httpRequestWrapper, httpClientConnection, httpClientContext);
                                            if (!this.reuseStrategy.keepAlive(httpResponseExecute, httpClientContext)) {
                                                try {
                                                    long keepAliveDuration = this.keepAliveStrategy.getKeepAliveDuration(httpResponseExecute, httpClientContext);
                                                    if (this.log.isDebugEnabled()) {
                                                        if (keepAliveDuration > 0) {
                                                            str2 = "for " + keepAliveDuration + " " + TimeUnit.MILLISECONDS;
                                                        } else {
                                                            str2 = "indefinitely";
                                                        }
                                                        httpResponse = httpResponseExecute;
                                                        this.log.debug("Connection can be kept alive " + str2);
                                                    } else {
                                                        httpResponse = httpResponseExecute;
                                                    }
                                                    connectionHolder = connectionHolder2;
                                                    try {
                                                        try {
                                                            connectionHolder.setValidFor(keepAliveDuration, TimeUnit.MILLISECONDS);
                                                            connectionHolder.markReusable();
                                                        } catch (IOException e17) {
                                                            e = e17;
                                                            iOException = e;
                                                            authState = authState2;
                                                            connectionHolder.abortConnection();
                                                            if (authState.isConnectionBased()) {
                                                            }
                                                            if (authState3.isConnectionBased()) {
                                                            }
                                                        } catch (RuntimeException e18) {
                                                            e = e18;
                                                            runtimeException = e;
                                                            authState = authState2;
                                                            connectionHolder.abortConnection();
                                                            if (authState.isConnectionBased()) {
                                                            }
                                                            if (authState3.isConnectionBased()) {
                                                            }
                                                        }
                                                    } catch (HttpException e19) {
                                                        e = e19;
                                                        httpException = e;
                                                        connectionHolder.abortConnection();
                                                        throw httpException;
                                                    }
                                                } catch (IOException e20) {
                                                    e = e20;
                                                    connectionHolder = connectionHolder2;
                                                } catch (RuntimeException e21) {
                                                    e = e21;
                                                    connectionHolder = connectionHolder2;
                                                }
                                            } else {
                                                httpResponse = httpResponseExecute;
                                                connectionHolder = connectionHolder2;
                                                try {
                                                    connectionHolder.markNonReusable();
                                                } catch (IOException e22) {
                                                    e = e22;
                                                    authState = authState2;
                                                    iOException = e;
                                                    connectionHolder.abortConnection();
                                                    if (authState.isConnectionBased()) {
                                                    }
                                                    if (authState3.isConnectionBased()) {
                                                    }
                                                } catch (RuntimeException e23) {
                                                    e = e23;
                                                    authState = authState2;
                                                    runtimeException = e;
                                                    connectionHolder.abortConnection();
                                                    if (authState.isConnectionBased()) {
                                                    }
                                                    if (authState3.isConnectionBased()) {
                                                    }
                                                }
                                            }
                                            httpResponse2 = httpResponse;
                                            authState = authState2;
                                            if (needAuthentication(authState3, authState2, httpRoute, httpResponse2, httpClientContext)) {
                                                response = httpResponse2;
                                                break;
                                            }
                                            HttpEntity entity2 = httpResponse2.getEntity();
                                            if (connectionHolder.isReusable()) {
                                                EntityUtils.consume(entity2);
                                            } else {
                                                httpClientConnection.close();
                                                AuthProtocolState state = authState.getState();
                                                AuthProtocolState authProtocolState = AuthProtocolState.SUCCESS;
                                                if (state == authProtocolState && authState.isConnectionBased()) {
                                                    this.log.debug("Resetting proxy auth state");
                                                    authState.reset();
                                                }
                                                if (authState3.getState() == authProtocolState && authState3.isConnectionBased()) {
                                                    this.log.debug("Resetting target auth state");
                                                    authState3.reset();
                                                }
                                            }
                                            HttpRequest original = httpRequestWrapper.getOriginal();
                                            if (!original.containsHeader("Authorization")) {
                                                httpRequestWrapper.removeHeaders("Authorization");
                                            }
                                            if (!original.containsHeader("Proxy-Authorization")) {
                                                httpRequestWrapper.removeHeaders("Proxy-Authorization");
                                            }
                                            i4 = i + 1;
                                            httpClientConnection2 = httpClientConnection;
                                            connectionHolder3 = connectionHolder;
                                            str3 = str;
                                            i3 = i2;
                                            authState4 = authState;
                                            userToken2 = obj;
                                            httpRoute2 = httpRoute;
                                            httpExecutionAware2 = httpExecutionAware;
                                        } catch (IOException e24) {
                                            e = e24;
                                            iOException = e;
                                            connectionHolder = connectionHolder2;
                                            connectionHolder.abortConnection();
                                            if (authState.isConnectionBased()) {
                                            }
                                            if (authState3.isConnectionBased()) {
                                            }
                                        } catch (RuntimeException e25) {
                                            e = e25;
                                            runtimeException = e;
                                            connectionHolder = connectionHolder2;
                                            connectionHolder.abortConnection();
                                            if (authState.isConnectionBased()) {
                                            }
                                            if (authState3.isConnectionBased()) {
                                            }
                                        }
                                    }
                                    if (needAuthentication(authState3, authState2, httpRoute, httpResponse2, httpClientContext)) {
                                    }
                                } catch (IOException e26) {
                                    e = e26;
                                    iOException = e;
                                    connectionHolder.abortConnection();
                                    if (authState.isConnectionBased()) {
                                    }
                                    if (authState3.isConnectionBased()) {
                                    }
                                } catch (RuntimeException e27) {
                                    e = e27;
                                    runtimeException = e;
                                    connectionHolder.abortConnection();
                                    if (authState.isConnectionBased()) {
                                    }
                                    if (authState3.isConnectionBased()) {
                                    }
                                }
                                httpClientContext.setAttribute("http.request", httpRequestWrapper);
                                httpResponseExecute = this.requestExecutor.execute(httpRequestWrapper, httpClientConnection, httpClientContext);
                                if (!this.reuseStrategy.keepAlive(httpResponseExecute, httpClientContext)) {
                                }
                                httpResponse2 = httpResponse;
                                authState = authState2;
                            } catch (IOException e28) {
                                e = e28;
                                authState = authState2;
                                connectionHolder = connectionHolder2;
                                iOException = e;
                                connectionHolder.abortConnection();
                                if (authState.isConnectionBased()) {
                                }
                                if (authState3.isConnectionBased()) {
                                }
                            } catch (RuntimeException e29) {
                                e = e29;
                                authState = authState2;
                                connectionHolder = connectionHolder2;
                                runtimeException = e;
                                connectionHolder.abortConnection();
                                if (authState.isConnectionBased()) {
                                }
                                if (authState3.isConnectionBased()) {
                                }
                            }
                            authState2 = authState;
                        } catch (IOException e30) {
                            e = e30;
                        } catch (RuntimeException e31) {
                            e = e31;
                        }
                    } catch (HttpException e32) {
                        e = e32;
                        connectionHolder = connectionHolder2;
                    }
                } catch (IOException e33) {
                    e = e33;
                    connectionHolder = connectionHolder3;
                    authState = authState4;
                } catch (RuntimeException e34) {
                    e = e34;
                    connectionHolder = connectionHolder3;
                    authState = authState4;
                } catch (HttpException e35) {
                    e = e35;
                    connectionHolder = connectionHolder3;
                }
            }
        } catch (InterruptedException e36) {
            Thread.currentThread().interrupt();
            throw new RequestAbortedException("Request aborted", e36);
        } catch (ExecutionException e37) {
            Throwable th = e37;
            Throwable cause = th.getCause();
            if (cause != null) {
                th = cause;
            }
            throw new RequestAbortedException("Request execution failed", th);
        }
    }

    public void establishRoute(AuthState authState, HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpRequest httpRequest, HttpClientContext httpClientContext) throws HttpException, IOException {
        int iNextStep;
        int connectTimeout = httpClientContext.getRequestConfig().getConnectTimeout();
        RouteTracker routeTracker = new RouteTracker(httpRoute);
        do {
            HttpRoute route = routeTracker.toRoute();
            iNextStep = this.routeDirector.nextStep(httpRoute, route);
            switch (iNextStep) {
                case -1:
                    throw new HttpException("Unable to establish route: planned = " + httpRoute + "; current = " + route);
                case 0:
                    this.connManager.routeComplete(httpClientConnection, httpRoute, httpClientContext);
                    break;
                case 1:
                    this.connManager.connect(httpClientConnection, httpRoute, connectTimeout > 0 ? connectTimeout : 0, httpClientContext);
                    routeTracker.connectTarget(httpRoute.isSecure());
                    break;
                case 2:
                    this.connManager.connect(httpClientConnection, httpRoute, connectTimeout > 0 ? connectTimeout : 0, httpClientContext);
                    routeTracker.connectProxy(httpRoute.getProxyHost(), httpRoute.isSecure() && !httpRoute.isTunnelled());
                    break;
                case 3:
                    boolean zCreateTunnelToTarget = createTunnelToTarget(authState, httpClientConnection, httpRoute, httpRequest, httpClientContext);
                    this.log.debug("Tunnel to target created.");
                    routeTracker.tunnelTarget(zCreateTunnelToTarget);
                    break;
                case 4:
                    int hopCount = route.getHopCount() - 1;
                    boolean zCreateTunnelToProxy = createTunnelToProxy(httpRoute, hopCount, httpClientContext);
                    this.log.debug("Tunnel to proxy created.");
                    routeTracker.tunnelProxy(httpRoute.getHopTarget(hopCount), zCreateTunnelToProxy);
                    break;
                case 5:
                    this.connManager.upgrade(httpClientConnection, httpRoute, httpClientContext);
                    routeTracker.layerProtocol(httpRoute.isSecure());
                    break;
                default:
                    throw new IllegalStateException("Unknown step indicator " + iNextStep + " from RouteDirector.");
            }
        } while (iNextStep > 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x009a, code lost:
    
        if (r16.reuseStrategy.keepAlive(r7, r21) == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x009c, code lost:
    
        r16.log.debug("Connection kept alive");
        org.apache.http.util.EntityUtils.consume(r7.getEntity());
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ab, code lost:
    
        r18.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean createTunnelToTarget(AuthState authState, HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpRequest httpRequest, HttpClientContext httpClientContext) throws HttpException, IOException {
        HttpResponse httpResponse;
        RequestConfig requestConfig = httpClientContext.getRequestConfig();
        int connectTimeout = requestConfig.getConnectTimeout();
        HttpHost targetHost = httpRoute.getTargetHost();
        HttpHost proxyHost = httpRoute.getProxyHost();
        BasicHttpRequest basicHttpRequest = new BasicHttpRequest(FirebasePerformance.HttpMethod.CONNECT, targetHost.toHostString(), httpRequest.getProtocolVersion());
        this.requestExecutor.preProcess(basicHttpRequest, this.proxyHttpProcessor, httpClientContext);
        while (true) {
            HttpResponse httpResponse2 = null;
            while (true) {
                if (httpResponse2 == null) {
                    if (!httpClientConnection.isOpen()) {
                        this.connManager.connect(httpClientConnection, httpRoute, connectTimeout > 0 ? connectTimeout : 0, httpClientContext);
                    }
                    basicHttpRequest.removeHeaders("Proxy-Authorization");
                    this.authenticator.generateAuthResponse(basicHttpRequest, authState, httpClientContext);
                    HttpResponse httpResponseExecute = this.requestExecutor.execute(basicHttpRequest, httpClientConnection, httpClientContext);
                    this.requestExecutor.postProcess(httpResponseExecute, this.proxyHttpProcessor, httpClientContext);
                    if (httpResponseExecute.getStatusLine().getStatusCode() < 200) {
                        throw new HttpException("Unexpected response to CONNECT request: " + httpResponseExecute.getStatusLine());
                    }
                    if (!requestConfig.isAuthenticationEnabled()) {
                        httpResponse = httpResponseExecute;
                    } else {
                        if (this.authenticator.isAuthenticationRequested(proxyHost, httpResponseExecute, this.proxyAuthStrategy, authState, httpClientContext) && this.authenticator.handleAuthChallenge(proxyHost, httpResponseExecute, this.proxyAuthStrategy, authState, httpClientContext)) {
                            break;
                        }
                        httpResponse = httpResponseExecute;
                    }
                    httpResponse2 = httpResponse;
                } else {
                    if (httpResponse2.getStatusLine().getStatusCode() <= 299) {
                        return false;
                    }
                    HttpEntity entity = httpResponse2.getEntity();
                    if (entity != null) {
                        httpResponse2.setEntity(new BufferedHttpEntity(entity));
                    }
                    httpClientConnection.close();
                    throw new TunnelRefusedException("CONNECT refused by proxy: " + httpResponse2.getStatusLine(), httpResponse2);
                }
            }
        }
    }

    public final boolean createTunnelToProxy(HttpRoute httpRoute, int i, HttpClientContext httpClientContext) throws HttpException {
        throw new HttpException("Proxy chains are not supported.");
    }

    public final boolean needAuthentication(AuthState authState, AuthState authState2, HttpRoute httpRoute, HttpResponse httpResponse, HttpClientContext httpClientContext) {
        if (!httpClientContext.getRequestConfig().isAuthenticationEnabled()) {
            return false;
        }
        HttpHost targetHost = httpClientContext.getTargetHost();
        if (targetHost == null) {
            targetHost = httpRoute.getTargetHost();
        }
        if (targetHost.getPort() < 0) {
            targetHost = new HttpHost(targetHost.getHostName(), httpRoute.getTargetHost().getPort(), targetHost.getSchemeName());
        }
        boolean zIsAuthenticationRequested = this.authenticator.isAuthenticationRequested(targetHost, httpResponse, this.targetAuthStrategy, authState, httpClientContext);
        HttpHost proxyHost = httpRoute.getProxyHost();
        if (proxyHost == null) {
            proxyHost = httpRoute.getTargetHost();
        }
        boolean zIsAuthenticationRequested2 = this.authenticator.isAuthenticationRequested(proxyHost, httpResponse, this.proxyAuthStrategy, authState2, httpClientContext);
        if (zIsAuthenticationRequested) {
            return this.authenticator.handleAuthChallenge(targetHost, httpResponse, this.targetAuthStrategy, authState, httpClientContext);
        }
        if (!zIsAuthenticationRequested2) {
            return false;
        }
        return this.authenticator.handleAuthChallenge(proxyHost, httpResponse, this.proxyAuthStrategy, authState2, httpClientContext);
    }
}
