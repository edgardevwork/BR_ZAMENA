package org.apache.http.impl.conn;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

@Deprecated
/* loaded from: classes8.dex */
public class ProxySelectorRoutePlanner implements HttpRoutePlanner {
    public ProxySelector proxySelector;
    public final SchemeRegistry schemeRegistry;

    public ProxySelectorRoutePlanner(SchemeRegistry schemeRegistry, ProxySelector proxySelector) {
        Args.notNull(schemeRegistry, "SchemeRegistry");
        this.schemeRegistry = schemeRegistry;
        this.proxySelector = proxySelector;
    }

    public ProxySelector getProxySelector() {
        return this.proxySelector;
    }

    public void setProxySelector(ProxySelector proxySelector) {
        this.proxySelector = proxySelector;
    }

    @Override // org.apache.http.conn.routing.HttpRoutePlanner
    public HttpRoute determineRoute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws HttpException {
        Args.notNull(httpRequest, "HTTP request");
        HttpRoute forcedRoute = ConnRouteParams.getForcedRoute(httpRequest.getParams());
        if (forcedRoute != null) {
            return forcedRoute;
        }
        Asserts.notNull(httpHost, "Target host");
        InetAddress localAddress = ConnRouteParams.getLocalAddress(httpRequest.getParams());
        HttpHost httpHostDetermineProxy = determineProxy(httpHost, httpRequest, httpContext);
        boolean zIsLayered = this.schemeRegistry.getScheme(httpHost.getSchemeName()).isLayered();
        if (httpHostDetermineProxy == null) {
            return new HttpRoute(httpHost, localAddress, zIsLayered);
        }
        return new HttpRoute(httpHost, localAddress, httpHostDetermineProxy, zIsLayered);
    }

    public HttpHost determineProxy(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws HttpException {
        ProxySelector proxySelector = this.proxySelector;
        if (proxySelector == null) {
            proxySelector = ProxySelector.getDefault();
        }
        if (proxySelector == null) {
            return null;
        }
        try {
            Proxy proxyChooseProxy = chooseProxy(proxySelector.select(new URI(httpHost.toURI())), httpHost, httpRequest, httpContext);
            if (proxyChooseProxy.type() != Proxy.Type.HTTP) {
                return null;
            }
            if (!(proxyChooseProxy.address() instanceof InetSocketAddress)) {
                throw new HttpException("Unable to handle non-Inet proxy address: " + proxyChooseProxy.address());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyChooseProxy.address();
            return new HttpHost(getHost(inetSocketAddress), inetSocketAddress.getPort());
        } catch (URISyntaxException e) {
            throw new HttpException("Cannot convert host to URI: " + httpHost, e);
        }
    }

    public String getHost(InetSocketAddress inetSocketAddress) {
        return inetSocketAddress.isUnresolved() ? inetSocketAddress.getHostName() : inetSocketAddress.getAddress().getHostAddress();
    }

    public Proxy chooseProxy(List<Proxy> list, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        Args.notEmpty(list, "List of proxies");
        Proxy proxy = null;
        for (int i = 0; proxy == null && i < list.size(); i++) {
            Proxy proxy2 = list.get(i);
            int i2 = C111351.$SwitchMap$java$net$Proxy$Type[proxy2.type().ordinal()];
            if (i2 == 1 || i2 == 2) {
                proxy = proxy2;
            }
        }
        return proxy == null ? Proxy.NO_PROXY : proxy;
    }

    /* renamed from: org.apache.http.impl.conn.ProxySelectorRoutePlanner$1 */
    public static /* synthetic */ class C111351 {
        public static final /* synthetic */ int[] $SwitchMap$java$net$Proxy$Type;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            $SwitchMap$java$net$Proxy$Type = iArr;
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$net$Proxy$Type[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$net$Proxy$Type[Proxy.Type.SOCKS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
